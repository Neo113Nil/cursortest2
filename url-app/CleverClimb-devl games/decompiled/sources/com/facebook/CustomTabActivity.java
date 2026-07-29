package com.facebook;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/* loaded from: classes.dex */
public class CustomTabActivity extends Activity {
    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = new Intent(this, (Class<?>) FacebookActivity.class);
        intent.putExtra("url", getIntent().getDataString());
        intent.addFlags(603979776);
        startActivity(intent);
    }
}
