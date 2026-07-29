package com.ironsource.sdk.controller;

import android.R;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class OpenUrlActivity extends Activity {

    /* renamed from: b, reason: collision with root package name */
    private static final int f7019b = com.ironsource.sdk.g.f.i();

    /* renamed from: c, reason: collision with root package name */
    private static final int f7020c = com.ironsource.sdk.g.f.i();

    /* renamed from: a, reason: collision with root package name */
    boolean f7021a;
    private c e;
    private ProgressBar f;
    private RelativeLayout g;
    private String h;

    /* renamed from: d, reason: collision with root package name */
    private WebView f7022d = null;
    private Handler i = new Handler();
    private boolean j = false;
    private final Runnable k = new Runnable() { // from class: com.ironsource.sdk.controller.OpenUrlActivity.2
        @Override // java.lang.Runnable
        public void run() {
            OpenUrlActivity.this.getWindow().getDecorView().setSystemUiVisibility(com.ironsource.sdk.g.f.a(OpenUrlActivity.this.j));
        }
    };

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        com.ironsource.sdk.g.e.a("OpenUrlActivity", "onCreate()");
        try {
            this.e = com.ironsource.sdk.a.a.c(this).a();
            e();
            f();
            Bundle extras = getIntent().getExtras();
            this.h = extras.getString(c.e);
            this.f7021a = extras.getBoolean(c.f);
            this.j = getIntent().getBooleanExtra("immersive", false);
            if (this.j) {
                getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() { // from class: com.ironsource.sdk.controller.OpenUrlActivity.1
                    @Override // android.view.View.OnSystemUiVisibilityChangeListener
                    public void onSystemUiVisibilityChange(int i) {
                        if ((i & 4098) == 0) {
                            OpenUrlActivity.this.i.removeCallbacks(OpenUrlActivity.this.k);
                            OpenUrlActivity.this.i.postDelayed(OpenUrlActivity.this.k, 500L);
                        }
                    }
                });
                runOnUiThread(this.k);
            }
            this.g = new RelativeLayout(this);
            setContentView(this.g, new ViewGroup.LayoutParams(-1, -1));
        } catch (Exception e) {
            e.printStackTrace();
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        a();
    }

    private void a() {
        if (this.f7022d == null) {
            this.f7022d = new WebView(getApplicationContext());
            this.f7022d.setId(f7019b);
            this.f7022d.getSettings().setJavaScriptEnabled(true);
            this.f7022d.setWebViewClient(new a());
            a(this.h);
        }
        if (findViewById(f7019b) == null) {
            this.g.addView(this.f7022d, new RelativeLayout.LayoutParams(-1, -1));
        }
        b();
        if (this.e != null) {
            this.e.a(true, "secondary");
        }
    }

    private void b() {
        if (this.f == null) {
            if (Build.VERSION.SDK_INT >= 11) {
                this.f = new ProgressBar(new ContextThemeWrapper(this, R.style.Theme.Holo.Light.Dialog));
            } else {
                this.f = new ProgressBar(this);
            }
            this.f.setId(f7020c);
        }
        if (findViewById(f7020c) == null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13);
            this.f.setLayoutParams(layoutParams);
            this.f.setVisibility(4);
            this.g.addView(this.f);
        }
    }

    private void c() {
        ViewGroup viewGroup;
        if (this.e != null) {
            this.e.a(false, "secondary");
            if (this.g == null || (viewGroup = (ViewGroup) this.f7022d.getParent()) == null) {
                return;
            }
            if (viewGroup.findViewById(f7019b) != null) {
                viewGroup.removeView(this.f7022d);
            }
            if (viewGroup.findViewById(f7020c) != null) {
                viewGroup.removeView(this.f);
            }
        }
    }

    private void d() {
        if (this.f7022d != null) {
            this.f7022d.destroy();
        }
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        c();
    }

    public void a(String str) {
        this.f7022d.stopLoading();
        this.f7022d.clearHistory();
        try {
            this.f7022d.loadUrl(str);
        } catch (Throwable th) {
            com.ironsource.sdk.g.e.b("OpenUrlActivity", "OpenUrlActivity:: loadUrl: " + th.toString());
            new com.ironsource.sdk.g.b().execute("https://www.supersonicads.com/mobile/sdk5/log?method=" + th.getStackTrace()[0].getMethodName());
        }
    }

    private class a extends WebViewClient {
        private a() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            OpenUrlActivity.this.f.setVisibility(0);
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            OpenUrlActivity.this.f.setVisibility(4);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            List<String> d2 = com.ironsource.sdk.g.c.a().d();
            if (d2 != null && !d2.isEmpty()) {
                Iterator<String> it = d2.iterator();
                while (it.hasNext()) {
                    if (str.contains(it.next())) {
                        OpenUrlActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                        OpenUrlActivity.this.e.g();
                        OpenUrlActivity.this.finish();
                        return true;
                    }
                }
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }
    }

    private void e() {
        requestWindowFeature(1);
    }

    private void f() {
        getWindow().setFlags(1024, 1024);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (this.f7022d.canGoBack()) {
            this.f7022d.goBack();
        } else {
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        d();
    }

    @Override // android.app.Activity
    public void finish() {
        if (this.f7021a) {
            this.e.e("secondaryClose");
        }
        super.finish();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (this.j && z) {
            runOnUiThread(this.k);
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.j && (i == 25 || i == 24)) {
            this.i.postDelayed(this.k, 500L);
        }
        return super.onKeyDown(i, keyEvent);
    }
}
