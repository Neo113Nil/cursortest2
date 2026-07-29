package com.dancingbogo.skyrolline.webview.ui;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;
import com.cmplay.base.util.webview.ipc.data.WebConfigManager;
import com.dancingbogo.skyrolline.GameApp;
import com.dancingbogo.skyrolline.R;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URISyntaxException;

/* loaded from: classes2.dex */
public class WebViewLayout extends RelativeLayout implements com.dancingbogo.skyrolline.webview.a.a {
    private static String k;
    private static String l;
    private static String m;
    private static String n;
    private static String o;
    private static String p;
    private static String q;

    /* renamed from: a, reason: collision with root package name */
    public WebViewEx f4676a;

    /* renamed from: b, reason: collision with root package name */
    public WebViewLayout f4677b;

    /* renamed from: c, reason: collision with root package name */
    private Activity f4678c;

    /* renamed from: d, reason: collision with root package name */
    private String f4679d;
    private MsgBoxNetworkStateViewFlipper e;
    private boolean f;
    private WebJsInterface g;
    private String[] h;
    private String i;
    private int j;

    public WebViewLayout(Context context, String str, int i) {
        super(context);
        this.j = -1;
        this.f4679d = str;
        this.j = i;
        a(context);
    }

    public WebViewLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.j = -1;
        a(context);
    }

    public WebViewLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.j = -1;
        a(context);
    }

    private void a(Context context) {
        this.f4678c = (Activity) context;
        this.f4677b = this;
        int i = this.j;
        if (i != 2) {
            switch (i) {
                case -1:
                    this.f4678c.finish();
                    break;
            }
            return;
        }
        LayoutInflater.from(context).inflate(R.layout.function_web_layout, this);
        this.e = (MsgBoxNetworkStateViewFlipper) findViewById(R.id.viewflipper_layout);
        this.e.setLoadingText(com.dancingbogo.skyrolline.webview.ipc.a.b.a(GameApp.f4485a).a(WebConfigManager.LOADING_ID, ""));
        this.e.setRequestLoadCB(new a() { // from class: com.dancingbogo.skyrolline.webview.ui.WebViewLayout.1
            @Override // com.dancingbogo.skyrolline.webview.ui.a
            public void a() {
                WebViewLayout.this.g();
            }
        });
        this.f4676a = (WebViewEx) findViewById(R.id.webview);
        this.f4676a.getSettings().setJavaScriptEnabled(true);
        this.f4676a.getSettings().setDefaultTextEncodingName("UTF-8");
        this.f4676a.getSettings().setUseWideViewPort(true);
        this.f4676a.getSettings().setLoadWithOverviewMode(true);
        this.f4676a.getSettings().setDomStorageEnabled(true);
        this.f4676a.getSettings().setBuiltInZoomControls(false);
        this.f4676a.getSettings().setTextSize(WebSettings.TextSize.NORMAL);
        this.f4676a.getSettings().setDefaultFixedFontSize(16);
        this.f4676a.getSettings().setDefaultFontSize(16);
        this.f4676a.setBackgroundColor(0);
        this.f4676a.clearCache(false);
        this.g = new WebJsInterface(this.f4678c, this);
        this.f4676a.addJavascriptInterface(this.g, "rs");
        if (Build.VERSION.SDK_INT >= 11) {
            this.f4676a.getSettings().setDisplayZoomControls(false);
        }
        setOnTouchListener(new View.OnTouchListener() { // from class: com.dancingbogo.skyrolline.webview.ui.WebViewLayout.2
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return false;
            }
        });
        this.f4676a.setWebChromeClient(new WebChromeClient());
        this.f4676a.setWebViewClient(new WebViewClient() { // from class: com.dancingbogo.skyrolline.webview.ui.WebViewLayout.3
            @Override // android.webkit.WebViewClient
            public void onReceivedError(WebView webView, int i2, String str, String str2) {
                super.onReceivedError(webView, i2, str, str2);
                WebViewLayout.this.d();
                WebViewLayout.this.f = true;
            }

            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                if (WebViewLayout.this.f) {
                    return;
                }
                WebViewLayout.this.c();
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                try {
                    Intent parseUri = Intent.parseUri(str, 1);
                    parseUri.addCategory("android.intent.category.BROWSABLE");
                    parseUri.setComponent(null);
                    if ("android.intent.action.VIEW".equals(parseUri.getAction()) && (str.startsWith("http://") || str.startsWith("https://"))) {
                        return false;
                    }
                    try {
                        if (WebViewLayout.this.f4678c.startActivityIfNeeded(parseUri, -1)) {
                            return true;
                        }
                    } catch (ActivityNotFoundException e) {
                        e.printStackTrace();
                    } catch (SecurityException e2) {
                        e2.printStackTrace();
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                } catch (URISyntaxException e3) {
                    e3.printStackTrace();
                    return false;
                }
            }

            @Override // android.webkit.WebViewClient
            public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                WebResourceResponse webResourceResponse = null;
                if (WebViewLayout.this.h == null || WebViewLayout.this.h.length < 1) {
                    return null;
                }
                for (int i2 = 0; i2 < WebViewLayout.this.h.length; i2++) {
                    if (str.equals(WebViewLayout.this.h[i2]) && com.dancingbogo.skyrolline.webview.util.a.a(WebViewLayout.this.i, str)) {
                        try {
                            webResourceResponse = new WebResourceResponse("image/" + com.dancingbogo.skyrolline.webview.util.a.b(str), "UTF-8", new FileInputStream(com.dancingbogo.skyrolline.webview.util.a.b(WebViewLayout.this.i, str)));
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
                return webResourceResponse;
            }
        });
        g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (TextUtils.isEmpty(this.f4679d) || this.f4676a == null || this.e == null) {
            return;
        }
        this.e.setVisibility(0);
        this.f4676a.loadUrl(this.f4679d);
    }

    public void b() {
        if (this.e != null) {
            this.e.setVisibility(8);
        }
    }

    public void c() {
        if (this.f4676a != null) {
            this.f4676a.setVisibility(0);
        }
        if (this.e != null) {
            this.e.setVisibility(8);
        }
    }

    public void d() {
        if (this.f4676a != null) {
            this.f4676a.setVisibility(8);
        }
        if (this.e != null) {
            this.e.setVisibility(0);
            this.e.e();
        }
    }

    public void e() {
        this.f4677b = null;
        if (this.f4676a != null) {
            this.f4676a.clearCache(false);
            this.f4676a.removeAllViews();
            this.f4676a.destroy();
            this.f4676a = null;
        }
    }

    @Override // com.dancingbogo.skyrolline.webview.a.a
    public void c(String str) {
        m = str;
    }

    @Override // com.dancingbogo.skyrolline.webview.a.a
    public void d(String str) {
        n = str;
    }

    @Override // com.dancingbogo.skyrolline.webview.a.a
    public void e(String str) {
        o = str;
    }

    @Override // com.dancingbogo.skyrolline.webview.a.a
    public void f(String str) {
        p = str;
    }

    @Override // com.dancingbogo.skyrolline.webview.a.a
    public void g(String str) {
        q = str;
    }

    @Override // com.dancingbogo.skyrolline.webview.a.a
    public void a(String str) {
        l = str;
    }

    @Override // com.dancingbogo.skyrolline.webview.a.a
    public void b(String str) {
        k = str;
    }

    public static String getShareMethonName() {
        return k;
    }

    public static String getLoginMethonName() {
        return l;
    }

    public WebViewEx getWebView() {
        return this.f4676a;
    }

    public void h(String str) {
        com.dancingbogo.skyrolline.util.b.b("lottery", "callbackGetPropMethon = mGetPropCallBackMethonName:" + m + "  mWebView:" + this.f4676a + "  json:" + str);
        if (this.f4676a == null || TextUtils.isEmpty(m) || TextUtils.isEmpty(str)) {
            return;
        }
        this.f4676a.loadUrl("javascript:" + m + "(" + str + ")");
        com.dancingbogo.skyrolline.util.b.b("lottery", "callbackGetPropMethon = javascript:" + m + "(" + str + ")");
    }

    public void i(String str) {
        com.dancingbogo.skyrolline.util.b.b("lottery", "callbackGetItemsInfoMethon = mGetItemsInfoCallbackMethonName:" + q + "  mWebView:" + this.f4676a + "  json:" + str);
        if (this.f4676a == null || TextUtils.isEmpty(q) || TextUtils.isEmpty(str)) {
            return;
        }
        this.f4676a.loadUrl("javascript:" + q + "(" + str + ")");
        com.dancingbogo.skyrolline.util.b.b("lottery", "callbackGetItemsInfoMethon = javascript:" + q + "(" + str + ")");
    }

    public void j(String str) {
        if (this.f4676a == null || TextUtils.isEmpty(n) || TextUtils.isEmpty(str)) {
            return;
        }
        this.f4676a.loadUrl("javascript:" + n + "(" + str + ")");
        com.dancingbogo.skyrolline.util.b.b("lottery", "canShowAdcallbackMethon = javascript:" + n + "(" + str + ")");
    }

    public void k(String str) {
        if (this.f4676a == null || TextUtils.isEmpty(o) || TextUtils.isEmpty(str)) {
            return;
        }
        this.f4676a.loadUrl("javascript:" + o + "(" + str + ")");
        com.dancingbogo.skyrolline.util.b.b("lottery", "callbackAdMethon = javascript:" + o + "(" + str + ")");
    }

    public void f() {
        if (this.f4676a == null || TextUtils.isEmpty(p)) {
            return;
        }
        this.f4676a.loadUrl("javascript:" + p + "()");
        com.dancingbogo.skyrolline.util.b.b("lottery", "callbackAdMethon = javascript:" + p + "()");
    }

    @Override // com.dancingbogo.skyrolline.webview.a.a
    public void a() {
        c();
    }
}
