package com.applovin.impl.adview;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.applovin.impl.a.e;
import com.applovin.sdk.AppLovinAd;
import com.facebook.ads.AudienceNetworkActivity;

/* loaded from: classes.dex */
class c extends WebView {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.p f2470a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.j f2471b;

    /* renamed from: c, reason: collision with root package name */
    private com.applovin.impl.sdk.c.d f2472c;

    /* renamed from: d, reason: collision with root package name */
    private AppLovinAd f2473d;
    private String e;
    private boolean f;

    c(d dVar, com.applovin.impl.sdk.j jVar, Context context) {
        super(context);
        this.f2473d = null;
        this.e = null;
        this.f = false;
        if (jVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        this.f2471b = jVar;
        this.f2470a = jVar.u();
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setSupportMultipleWindows(false);
        settings.setJavaScriptEnabled(true);
        setWebViewClient(dVar);
        setWebChromeClient(new b(jVar));
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        setScrollBarStyle(33554432);
        setOnTouchListener(new View.OnTouchListener() { // from class: com.applovin.impl.adview.c.1
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (view.hasFocus()) {
                    return false;
                }
                view.requestFocus();
                return false;
            }
        });
        setOnLongClickListener(new View.OnLongClickListener() { // from class: com.applovin.impl.adview.c.12
            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                c.this.f2470a.a("AdWebView", "Received a LongClick event.");
                return true;
            }
        });
    }

    private String a(String str, String str2, String str3) {
        if (com.applovin.impl.sdk.e.i.b(str)) {
            return com.applovin.impl.sdk.e.l.a(str3, str).replace("{SOURCE}", str2);
        }
        return null;
    }

    private void a(final com.applovin.impl.sdk.ad.g gVar) {
        final Boolean n;
        final Integer a2;
        try {
            if (((Boolean) this.f2471b.a(com.applovin.impl.sdk.b.b.fa)).booleanValue() || gVar.ao()) {
                a(new Runnable() { // from class: com.applovin.impl.adview.c.13
                    @Override // java.lang.Runnable
                    public void run() {
                        c.this.loadUrl("about:blank");
                    }
                });
            }
            if (com.applovin.impl.sdk.e.d.d()) {
                a(new Runnable() { // from class: com.applovin.impl.adview.c.14
                    @Override // java.lang.Runnable
                    @TargetApi(17)
                    public void run() {
                        c.this.getSettings().setMediaPlaybackRequiresUserGesture(gVar.an());
                    }
                });
            }
            if (com.applovin.impl.sdk.e.d.e() && gVar.aq()) {
                a(new Runnable() { // from class: com.applovin.impl.adview.c.15
                    @Override // java.lang.Runnable
                    @TargetApi(19)
                    public void run() {
                        WebView.setWebContentsDebuggingEnabled(true);
                    }
                });
            }
            u ar = gVar.ar();
            if (ar != null) {
                final WebSettings settings = getSettings();
                final WebSettings.PluginState b2 = ar.b();
                if (b2 != null) {
                    a(new Runnable() { // from class: com.applovin.impl.adview.c.16
                        @Override // java.lang.Runnable
                        public void run() {
                            settings.setPluginState(b2);
                        }
                    });
                }
                final Boolean c2 = ar.c();
                if (c2 != null) {
                    a(new Runnable() { // from class: com.applovin.impl.adview.c.17
                        @Override // java.lang.Runnable
                        public void run() {
                            settings.setAllowFileAccess(c2.booleanValue());
                        }
                    });
                }
                final Boolean d2 = ar.d();
                if (d2 != null) {
                    a(new Runnable() { // from class: com.applovin.impl.adview.c.18
                        @Override // java.lang.Runnable
                        public void run() {
                            settings.setLoadWithOverviewMode(d2.booleanValue());
                        }
                    });
                }
                final Boolean e = ar.e();
                if (e != null) {
                    a(new Runnable() { // from class: com.applovin.impl.adview.c.19
                        @Override // java.lang.Runnable
                        public void run() {
                            settings.setUseWideViewPort(e.booleanValue());
                        }
                    });
                }
                final Boolean f = ar.f();
                if (f != null) {
                    a(new Runnable() { // from class: com.applovin.impl.adview.c.2
                        @Override // java.lang.Runnable
                        public void run() {
                            settings.setAllowContentAccess(f.booleanValue());
                        }
                    });
                }
                final Boolean g = ar.g();
                if (g != null) {
                    a(new Runnable() { // from class: com.applovin.impl.adview.c.3
                        @Override // java.lang.Runnable
                        public void run() {
                            settings.setBuiltInZoomControls(g.booleanValue());
                        }
                    });
                }
                final Boolean h = ar.h();
                if (h != null) {
                    a(new Runnable() { // from class: com.applovin.impl.adview.c.4
                        @Override // java.lang.Runnable
                        public void run() {
                            settings.setDisplayZoomControls(h.booleanValue());
                        }
                    });
                }
                final Boolean i = ar.i();
                if (i != null) {
                    a(new Runnable() { // from class: com.applovin.impl.adview.c.5
                        @Override // java.lang.Runnable
                        public void run() {
                            settings.setSaveFormData(i.booleanValue());
                        }
                    });
                }
                final Boolean j = ar.j();
                if (j != null) {
                    a(new Runnable() { // from class: com.applovin.impl.adview.c.6
                        @Override // java.lang.Runnable
                        public void run() {
                            settings.setGeolocationEnabled(j.booleanValue());
                        }
                    });
                }
                final Boolean k = ar.k();
                if (k != null) {
                    a(new Runnable() { // from class: com.applovin.impl.adview.c.7
                        @Override // java.lang.Runnable
                        public void run() {
                            settings.setNeedInitialFocus(k.booleanValue());
                        }
                    });
                }
                if (com.applovin.impl.sdk.e.d.c()) {
                    final Boolean l = ar.l();
                    if (l != null) {
                        a(new Runnable() { // from class: com.applovin.impl.adview.c.8
                            @Override // java.lang.Runnable
                            @TargetApi(16)
                            public void run() {
                                settings.setAllowFileAccessFromFileURLs(l.booleanValue());
                            }
                        });
                    }
                    final Boolean m = ar.m();
                    if (m != null) {
                        a(new Runnable() { // from class: com.applovin.impl.adview.c.9
                            @Override // java.lang.Runnable
                            @TargetApi(16)
                            public void run() {
                                settings.setAllowUniversalAccessFromFileURLs(m.booleanValue());
                            }
                        });
                    }
                }
                if (com.applovin.impl.sdk.e.d.f() && (a2 = ar.a()) != null) {
                    a(new Runnable() { // from class: com.applovin.impl.adview.c.10
                        @Override // java.lang.Runnable
                        @TargetApi(21)
                        public void run() {
                            settings.setMixedContentMode(a2.intValue());
                        }
                    });
                }
                if (!com.applovin.impl.sdk.e.d.g() || (n = ar.n()) == null) {
                    return;
                }
                a(new Runnable() { // from class: com.applovin.impl.adview.c.11
                    @Override // java.lang.Runnable
                    @TargetApi(23)
                    public void run() {
                        settings.setOffscreenPreRaster(n.booleanValue());
                    }
                });
            }
        } catch (Throwable th) {
            this.f2470a.b("AdWebView", "Unable to apply WebView settings", th);
        }
    }

    private void a(Runnable runnable) {
        try {
            runnable.run();
        } catch (Throwable th) {
            this.f2470a.b("AdWebView", "Unable to apply WebView setting", th);
        }
    }

    private void a(String str, String str2, String str3, String str4, com.applovin.impl.sdk.j jVar) {
        com.applovin.impl.sdk.p pVar;
        String str5;
        StringBuilder sb;
        String a2 = a(str3, str, str4);
        if (com.applovin.impl.sdk.e.i.b(a2)) {
            pVar = this.f2470a;
            str5 = "AdWebView";
            sb = new StringBuilder();
        } else {
            a2 = a((String) jVar.a(com.applovin.impl.sdk.b.b.eJ), str, str4);
            if (!com.applovin.impl.sdk.e.i.b(a2)) {
                this.f2470a.a("AdWebView", "Rendering webview for VAST ad with resourceURL : " + str);
                loadUrl(str);
                return;
            }
            pVar = this.f2470a;
            str5 = "AdWebView";
            sb = new StringBuilder();
        }
        sb.append("Rendering webview for VAST ad with resourceContents : ");
        sb.append(a2);
        pVar.a(str5, sb.toString());
        loadDataWithBaseURL(str2, a2, AudienceNetworkActivity.WEBVIEW_MIME_TYPE, null, "");
    }

    AppLovinAd a() {
        return this.f2473d;
    }

    public void a(com.applovin.impl.sdk.c.d dVar) {
        this.f2472c = dVar;
    }

    public void a(AppLovinAd appLovinAd, String str) {
        com.applovin.impl.sdk.p pVar;
        String str2;
        String str3;
        com.applovin.impl.sdk.p pVar2;
        String str4;
        String str5;
        String str6;
        String ap;
        String str7;
        String str8;
        String str9;
        String ap2;
        com.applovin.impl.sdk.j jVar;
        if (this.f) {
            this.f2470a.e("AdWebView", "Ad can not be loaded in a destroyed webview");
            return;
        }
        this.f2473d = appLovinAd;
        this.e = str;
        try {
            if (appLovinAd instanceof com.applovin.impl.sdk.ad.i) {
                loadDataWithBaseURL("/", ((com.applovin.impl.sdk.ad.i) appLovinAd).a(), AudienceNetworkActivity.WEBVIEW_MIME_TYPE, null, "");
                pVar = this.f2470a;
                str2 = "AdWebView";
                str3 = "Empty ad rendered";
            } else {
                com.applovin.impl.sdk.ad.g gVar = (com.applovin.impl.sdk.ad.g) appLovinAd;
                a(gVar);
                if (gVar.Z()) {
                    setVisibility(0);
                }
                if (appLovinAd instanceof com.applovin.impl.sdk.ad.a) {
                    loadDataWithBaseURL(gVar.ap(), com.applovin.impl.sdk.e.l.a(str, ((com.applovin.impl.sdk.ad.a) appLovinAd).a()), AudienceNetworkActivity.WEBVIEW_MIME_TYPE, null, "");
                    pVar = this.f2470a;
                    str2 = "AdWebView";
                    str3 = "AppLovinAd rendered";
                } else {
                    if (!(appLovinAd instanceof com.applovin.impl.a.a)) {
                        return;
                    }
                    com.applovin.impl.a.a aVar = (com.applovin.impl.a.a) appLovinAd;
                    com.applovin.impl.a.b d2 = aVar.d();
                    if (d2 != null) {
                        com.applovin.impl.a.e b2 = d2.b();
                        Uri b3 = b2.b();
                        String uri = b3 != null ? b3.toString() : "";
                        String c2 = b2.c();
                        String j = aVar.j();
                        if (!com.applovin.impl.sdk.e.i.b(uri) && !com.applovin.impl.sdk.e.i.b(c2)) {
                            pVar2 = this.f2470a;
                            str4 = "AdWebView";
                            str5 = "Unable to load companion ad. No resources provided.";
                            pVar2.d(str4, str5);
                            return;
                        }
                        if (b2.a() == e.a.STATIC) {
                            this.f2470a.a("AdWebView", "Rendering WebView for static VAST ad");
                            loadDataWithBaseURL(gVar.ap(), a((String) this.f2471b.a(com.applovin.impl.sdk.b.b.eI), uri, str), AudienceNetworkActivity.WEBVIEW_MIME_TYPE, null, "");
                            return;
                        }
                        if (b2.a() == e.a.HTML) {
                            if (!com.applovin.impl.sdk.e.i.b(c2)) {
                                if (com.applovin.impl.sdk.e.i.b(uri)) {
                                    this.f2470a.a("AdWebView", "Preparing to load HTML VAST ad resourceUri");
                                    ap2 = gVar.ap();
                                    jVar = this.f2471b;
                                    a(uri, ap2, j, str, jVar);
                                    return;
                                }
                                return;
                            }
                            String a2 = a(j, c2, str);
                            str6 = com.applovin.impl.sdk.e.i.b(a2) ? a2 : c2;
                            this.f2470a.a("AdWebView", "Rendering WebView for HTML VAST ad with resourceContents: " + str6);
                            ap = gVar.ap();
                            str7 = AudienceNetworkActivity.WEBVIEW_MIME_TYPE;
                            str8 = null;
                            str9 = "";
                            loadDataWithBaseURL(ap, str6, str7, str8, str9);
                            return;
                        }
                        if (b2.a() != e.a.IFRAME) {
                            pVar2 = this.f2470a;
                            str4 = "AdWebView";
                            str5 = "Failed to render VAST companion ad of invalid type";
                            pVar2.d(str4, str5);
                            return;
                        }
                        if (com.applovin.impl.sdk.e.i.b(uri)) {
                            this.f2470a.a("AdWebView", "Preparing to load iFrame VAST ad resourceUri");
                            ap2 = gVar.ap();
                            jVar = this.f2471b;
                            a(uri, ap2, j, str, jVar);
                            return;
                        }
                        if (com.applovin.impl.sdk.e.i.b(c2)) {
                            String a3 = a(j, c2, str);
                            str6 = com.applovin.impl.sdk.e.i.b(a3) ? a3 : c2;
                            this.f2470a.a("AdWebView", "Rendering WebView for iFrame VAST ad with resourceContents: " + str6);
                            ap = gVar.ap();
                            str7 = AudienceNetworkActivity.WEBVIEW_MIME_TYPE;
                            str8 = null;
                            str9 = "";
                            loadDataWithBaseURL(ap, str6, str7, str8, str9);
                            return;
                        }
                        return;
                    }
                    pVar = this.f2470a;
                    str2 = "AdWebView";
                    str3 = "No companion ad provided.";
                }
            }
            pVar.a(str2, str3);
        } catch (Throwable th) {
            this.f2470a.b("AdWebView", "Unable to render AppLovinAd with placement = \"" + str + "\"", th);
        }
    }

    public void a(String str) {
        a(str, (Runnable) null);
    }

    public void a(String str, Runnable runnable) {
        try {
            this.f2470a.a("AdWebView", "Forwarding \"" + str + "\" to ad template");
            loadUrl(str);
        } catch (Throwable th) {
            this.f2470a.b("AdWebView", "Unable to forward to template", th);
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    String b() {
        return this.e;
    }

    public com.applovin.impl.sdk.c.d c() {
        return this.f2472c;
    }

    @Override // android.webkit.WebView, android.view.View
    public void computeScroll() {
    }

    @Override // android.webkit.WebView
    public void destroy() {
        this.f = true;
        try {
            super.destroy();
            this.f2470a.a("AdWebView", "Web view destroyed");
        } catch (Throwable th) {
            if (this.f2470a != null) {
                this.f2470a.b("AdWebView", "destroy() threw exception", th);
            }
        }
    }

    @Override // android.webkit.WebView, android.view.View
    protected void onFocusChanged(boolean z, int i, Rect rect) {
        try {
            super.onFocusChanged(z, i, rect);
        } catch (Exception e) {
            this.f2470a.b("AdWebView", "onFocusChanged() threw exception", e);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    protected void onScrollChanged(int i, int i2, int i3, int i4) {
    }

    @Override // android.webkit.WebView, android.view.View
    public void onWindowFocusChanged(boolean z) {
        try {
            super.onWindowFocusChanged(z);
        } catch (Exception e) {
            this.f2470a.b("AdWebView", "onWindowFocusChanged() threw exception", e);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    protected void onWindowVisibilityChanged(int i) {
        try {
            super.onWindowVisibilityChanged(i);
        } catch (Exception e) {
            this.f2470a.b("AdWebView", "onWindowVisibilityChanged() threw exception", e);
        }
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i, Rect rect) {
        try {
            return super.requestFocus(i, rect);
        } catch (Exception e) {
            this.f2470a.b("AdWebView", "requestFocus() threw exception", e);
            return false;
        }
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
    }
}
