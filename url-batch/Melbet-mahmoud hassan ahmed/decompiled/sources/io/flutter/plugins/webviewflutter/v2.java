package io.flutter.plugins.webviewflutter;

import android.webkit.WebSettings;
import android.webkit.WebView;
import io.flutter.plugins.webviewflutter.k;

/* loaded from: classes.dex */
public class v2 implements k.u {

    /* renamed from: a, reason: collision with root package name */
    private final i2 f17805a;

    /* renamed from: b, reason: collision with root package name */
    private final a f17806b;

    public static class a {
        public WebSettings a(WebView webView) {
            return webView.getSettings();
        }
    }

    public v2(i2 i2Var, a aVar) {
        this.f17805a = i2Var;
        this.f17806b = aVar;
    }

    @Override // io.flutter.plugins.webviewflutter.k.u
    public void a(Long l7) {
        this.f17805a.k(l7.longValue());
    }

    @Override // io.flutter.plugins.webviewflutter.k.u
    public void b(Long l7, Long l8) {
        this.f17805a.b(this.f17806b.a((WebView) this.f17805a.h(l8.longValue())), l7.longValue());
    }

    @Override // io.flutter.plugins.webviewflutter.k.u
    public void c(Long l7, Boolean bool) {
        ((WebSettings) this.f17805a.h(l7.longValue())).setJavaScriptEnabled(bool.booleanValue());
    }

    @Override // io.flutter.plugins.webviewflutter.k.u
    public void d(Long l7, Boolean bool) {
        ((WebSettings) this.f17805a.h(l7.longValue())).setDomStorageEnabled(bool.booleanValue());
    }

    @Override // io.flutter.plugins.webviewflutter.k.u
    public void e(Long l7, Boolean bool) {
        ((WebSettings) this.f17805a.h(l7.longValue())).setDisplayZoomControls(bool.booleanValue());
    }

    @Override // io.flutter.plugins.webviewflutter.k.u
    public void f(Long l7, Boolean bool) {
        ((WebSettings) this.f17805a.h(l7.longValue())).setMediaPlaybackRequiresUserGesture(bool.booleanValue());
    }

    @Override // io.flutter.plugins.webviewflutter.k.u
    public void g(Long l7, Boolean bool) {
        ((WebSettings) this.f17805a.h(l7.longValue())).setSupportMultipleWindows(bool.booleanValue());
    }

    @Override // io.flutter.plugins.webviewflutter.k.u
    public void h(Long l7, Boolean bool) {
        ((WebSettings) this.f17805a.h(l7.longValue())).setAllowFileAccess(bool.booleanValue());
    }

    @Override // io.flutter.plugins.webviewflutter.k.u
    public void i(Long l7, Boolean bool) {
        ((WebSettings) this.f17805a.h(l7.longValue())).setSupportZoom(bool.booleanValue());
    }

    @Override // io.flutter.plugins.webviewflutter.k.u
    public void j(Long l7, String str) {
        ((WebSettings) this.f17805a.h(l7.longValue())).setUserAgentString(str);
    }

    @Override // io.flutter.plugins.webviewflutter.k.u
    public void k(Long l7, Boolean bool) {
        ((WebSettings) this.f17805a.h(l7.longValue())).setLoadWithOverviewMode(bool.booleanValue());
    }

    @Override // io.flutter.plugins.webviewflutter.k.u
    public void l(Long l7, Boolean bool) {
        ((WebSettings) this.f17805a.h(l7.longValue())).setUseWideViewPort(bool.booleanValue());
    }

    @Override // io.flutter.plugins.webviewflutter.k.u
    public void m(Long l7, Boolean bool) {
        ((WebSettings) this.f17805a.h(l7.longValue())).setJavaScriptCanOpenWindowsAutomatically(bool.booleanValue());
    }

    @Override // io.flutter.plugins.webviewflutter.k.u
    public void n(Long l7, Boolean bool) {
        ((WebSettings) this.f17805a.h(l7.longValue())).setBuiltInZoomControls(bool.booleanValue());
    }
}
