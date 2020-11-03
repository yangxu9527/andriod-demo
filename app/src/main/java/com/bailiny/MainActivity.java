
package com.bailiny;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button linearLayoutBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linearLayoutBtn = findViewById(R.id.btn_linear_layout);
        linearLayoutBtn.setOnClickListener(v -> {
            // 点击事件，跳转到布局页面
            Intent intent = new Intent(MainActivity.this, LinearLayoutActivity.class);
            startActivity(intent);
        });
    }
}