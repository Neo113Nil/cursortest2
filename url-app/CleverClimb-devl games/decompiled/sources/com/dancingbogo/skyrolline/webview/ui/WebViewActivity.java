package com.dancingbogo.skyrolline.webview.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.dancingbogo.skyrolline.util.d;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public class WebViewActivity extends Activity {

    /* renamed from: a, reason: collision with root package name */
    public static WeakReference<WebViewActivity> f4672a;

    /* renamed from: b, reason: collision with root package name */
    private WebViewLayout f4673b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f4674c = false;

    /* renamed from: d, reason: collision with root package name */
    private String f4675d;
    private int e;

    public static void a(Context context, String str, int i) {
        Intent intent = new Intent(context, (Class<?>) WebViewActivity.class);
        intent.setFlags(268435456);
        intent.putExtra(com.cmplay.base.util.webview.ui.WebViewActivity.WEBVIEW_URL, str);
        intent.putExtra(com.cmplay.base.util.webview.ui.WebViewActivity.WEBVIEW_TYPE, i);
        d.a(context, intent);
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        a(getIntent());
        if (this.e == 3) {
            getWindow().setFlags(2048, 2048);
        } else {
            getWindow().setFlags(1024, 1024);
        }
        f4672a = new WeakReference<>(this);
        this.f4673b = new WebViewLayout(this, this.f4675d, this.e);
        setContentView(this.f4673b);
    }

    private void a(Intent intent) {
        this.f4675d = intent.getStringExtra(com.cmplay.base.util.webview.ui.WebViewActivity.WEBVIEW_URL);
        this.e = intent.getIntExtra(com.cmplay.base.util.webview.ui.WebViewActivity.WEBVIEW_TYPE, -1);
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        try {
            Class.forName("android.webkit.WebView").getMethod("onPause", (Class[]) null).invoke(this.f4673b.getWebView(), (Object[]) null);
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        try {
            Class.forName("android.webkit.WebView").getMethod("onResume", (Class[]) null).invoke(this.f4673b.getWebView(), (Object[]) null);
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        f4672a = null;
        if (this.f4673b != null) {
            this.f4673b.f();
            this.f4673b.e();
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (this.f4674c) {
            return;
        }
        super.onBackPressed();
    }

    public WebViewLayout a() {
        return this.f4673b;
    }

    public static WebViewActivity b() {
        if (f4672a == null) {
            return null;
        }
        return f4672a.get();
    }
}
