package com.facebook.ads.internal.view.a;

import android.annotation.TargetApi;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.ConsoleMessage;
import android.webkit.WebBackForwardList;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.mopub.common.Constants;
import java.util.HashSet;
import java.util.Set;

@TargetApi(19)
/* loaded from: classes.dex */
public class f extends com.facebook.ads.internal.q.c.a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f5514a = "f";

    /* renamed from: b, reason: collision with root package name */
    private static final Set<String> f5515b = new HashSet(2);

    /* renamed from: c, reason: collision with root package name */
    private a f5516c;

    /* renamed from: d, reason: collision with root package name */
    private d f5517d;
    private long e;
    private long f;
    private long g;
    private long h;

    public interface a {
        void a(int i);

        void a(String str);

        void b(String str);

        void c(String str);
    }

    static {
        f5515b.add(Constants.HTTP);
        f5515b.add(Constants.HTTPS);
    }

    public f(Context context) {
        super(context);
        this.e = -1L;
        this.f = -1L;
        this.g = -1L;
        this.h = -1L;
        f();
    }

    private void f() {
        WebSettings settings = getSettings();
        settings.setSupportZoom(true);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setAllowFileAccess(false);
        this.f5517d = new d(this);
    }

    private void g() {
        if (this.f <= -1 || this.g <= -1 || this.h <= -1) {
            return;
        }
        this.f5517d.a(false);
    }

    @Override // com.facebook.ads.internal.q.c.a
    protected WebChromeClient a() {
        return new WebChromeClient() { // from class: com.facebook.ads.internal.view.a.f.1
            @Override // android.webkit.WebChromeClient
            public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                String message = consoleMessage.message();
                if (TextUtils.isEmpty(message) || consoleMessage.messageLevel() != ConsoleMessage.MessageLevel.LOG) {
                    return true;
                }
                f.this.f5517d.a(message);
                return true;
            }

            @Override // android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i) {
                super.onProgressChanged(webView, i);
                f.this.f5517d.a();
                if (f.this.f5516c != null) {
                    f.this.f5516c.a(i);
                }
            }

            @Override // android.webkit.WebChromeClient
            public void onReceivedTitle(WebView webView, String str) {
                super.onReceivedTitle(webView, str);
                if (f.this.f5516c != null) {
                    f.this.f5516c.b(str);
                }
            }
        };
    }

    public void a(long j) {
        if (this.e < 0) {
            this.e = j;
        }
    }

    public void a(String str) {
        try {
            evaluateJavascript(str, null);
        } catch (IllegalStateException unused) {
            loadUrl("javascript:" + str);
        }
    }

    @Override // com.facebook.ads.internal.q.c.a
    protected WebViewClient b() {
        return new WebViewClient() { // from class: com.facebook.ads.internal.view.a.f.2
            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                if (f.this.f5516c != null) {
                    f.this.f5516c.c(str);
                }
            }

            @Override // android.webkit.WebViewClient
            public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                super.onPageStarted(webView, str, bitmap);
                if (f.this.f5516c != null) {
                    f.this.f5516c.a(str);
                }
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                Uri parse = Uri.parse(str);
                if (f.f5515b.contains(parse.getScheme())) {
                    return false;
                }
                try {
                    f.this.getContext().startActivity(new Intent("android.intent.action.VIEW", parse));
                    return true;
                } catch (ActivityNotFoundException e) {
                    Log.w(f.f5514a, "Activity not found to handle URI.", e);
                    return false;
                } catch (Exception e2) {
                    Log.e(f.f5514a, "Unknown exception occurred when trying to handle URI.", e2);
                    return false;
                }
            }
        };
    }

    public void b(long j) {
        if (this.f < 0) {
            this.f = j;
        }
        g();
    }

    public void c(long j) {
        if (this.h < 0) {
            this.h = j;
        }
        g();
    }

    @Override // com.facebook.ads.internal.q.c.a, android.webkit.WebView
    public void destroy() {
        com.facebook.ads.internal.q.c.b.a(this);
        super.destroy();
    }

    public long getDomContentLoadedMs() {
        return this.f;
    }

    public String getFirstUrl() {
        WebBackForwardList copyBackForwardList = copyBackForwardList();
        return copyBackForwardList.getSize() > 0 ? copyBackForwardList.getItemAtIndex(0).getUrl() : getUrl();
    }

    public long getLoadFinishMs() {
        return this.h;
    }

    public long getResponseEndMs() {
        return this.e;
    }

    public long getScrollReadyMs() {
        return this.g;
    }

    @Override // android.webkit.WebView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.g >= 0 || computeVerticalScrollRange() <= getHeight()) {
            return;
        }
        this.g = System.currentTimeMillis();
        g();
    }

    public void setListener(a aVar) {
        this.f5516c = aVar;
    }
}
