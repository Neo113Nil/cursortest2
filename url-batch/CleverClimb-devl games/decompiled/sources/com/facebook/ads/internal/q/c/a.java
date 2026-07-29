package com.facebook.ads.internal.q.c;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.webkit.CookieManager;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* loaded from: classes.dex */
public abstract class a extends WebView {

    /* renamed from: a, reason: collision with root package name */
    private static final String f5456a = "a";

    /* renamed from: b, reason: collision with root package name */
    private boolean f5457b;

    public a(Context context) {
        super(context);
        d();
    }

    private void d() {
        setWebChromeClient(a());
        setWebViewClient(b());
        b.b(this);
        getSettings().setJavaScriptEnabled(true);
        getSettings().setDomStorageEnabled(true);
        if (Build.VERSION.SDK_INT >= 17) {
            getSettings().setMediaPlaybackRequiresUserGesture(false);
        }
        setHorizontalScrollBarEnabled(false);
        setHorizontalScrollbarOverlay(false);
        setVerticalScrollBarEnabled(false);
        setVerticalScrollbarOverlay(false);
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                CookieManager.getInstance().setAcceptThirdPartyCookies(this, true);
            } catch (Exception unused) {
                Log.w(f5456a, "Failed to initialize CookieManager.");
            }
        }
    }

    protected WebChromeClient a() {
        return new WebChromeClient();
    }

    protected WebViewClient b() {
        return new WebViewClient();
    }

    public boolean c() {
        return this.f5457b;
    }

    @Override // android.webkit.WebView
    public void destroy() {
        this.f5457b = true;
        super.destroy();
    }
}
