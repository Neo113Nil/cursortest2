package com.applovin.impl.adview;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.view.ViewParent;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.sdk.AppLovinAdServiceImpl;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdService;
import java.util.List;

/* loaded from: classes.dex */
class d extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.j f2522a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.p f2523b;

    /* renamed from: c, reason: collision with root package name */
    private final AdViewControllerImpl f2524c;

    public d(AdViewControllerImpl adViewControllerImpl, com.applovin.impl.sdk.j jVar) {
        this.f2522a = jVar;
        this.f2523b = jVar.u();
        this.f2524c = adViewControllerImpl;
    }

    private void a() {
        this.f2524c.a();
    }

    private void a(Uri uri, c cVar) {
        com.applovin.impl.sdk.p pVar;
        String str;
        String str2;
        try {
            String queryParameter = uri.getQueryParameter("n");
            if (com.applovin.impl.sdk.e.i.b(queryParameter)) {
                String queryParameter2 = uri.getQueryParameter("load_type");
                if ("external".equalsIgnoreCase(queryParameter2)) {
                    this.f2523b.a("AdWebViewClient", "Loading new page externally: " + queryParameter);
                    com.applovin.impl.sdk.e.l.a(cVar.getContext(), Uri.parse(queryParameter), this.f2522a);
                    com.applovin.impl.sdk.e.g.c(this.f2524c.getAdViewEventListener(), this.f2524c.getCurrentAd(), this.f2524c.getParentView(), this.f2522a);
                    return;
                }
                if ("internal".equalsIgnoreCase(queryParameter2)) {
                    this.f2523b.a("AdWebViewClient", "Loading new page in WebView: " + queryParameter);
                    cVar.loadUrl(queryParameter);
                    String queryParameter3 = uri.getQueryParameter("bg_color");
                    if (com.applovin.impl.sdk.e.i.b(queryParameter3)) {
                        cVar.setBackgroundColor(Color.parseColor(queryParameter3));
                        return;
                    }
                    return;
                }
                pVar = this.f2523b;
                str = "AdWebViewClient";
                str2 = "Could not find load type in original uri";
            } else {
                pVar = this.f2523b;
                str = "AdWebViewClient";
                str2 = "Could not find url to load from query in original uri";
            }
            pVar.d(str, str2);
        } catch (Throwable unused) {
            this.f2523b.d("AdWebViewClient", "Failed to load new page from query in original uri");
        }
    }

    private void a(com.applovin.impl.a.a aVar, c cVar) {
        com.applovin.impl.a.b d2 = aVar.d();
        if (d2 != null) {
            com.applovin.impl.a.i.a(d2.c(), this.f2524c.getSdk());
            a(cVar, d2.a());
        }
    }

    private void a(c cVar) {
        ViewParent parent = cVar.getParent();
        if (parent instanceof AppLovinAdView) {
            ((AppLovinAdView) parent).loadNextAd();
        }
    }

    private void a(c cVar, Uri uri) {
        AppLovinAd a2 = cVar.a();
        String b2 = cVar.b();
        AppLovinAdView parentView = this.f2524c.getParentView();
        if (parentView != null && a2 != null) {
            com.applovin.impl.sdk.c.d c2 = cVar.c();
            if (c2 != null) {
                c2.b();
            }
            this.f2524c.a(a2, b2, parentView, uri);
            return;
        }
        this.f2523b.d("AdWebViewClient", "Attempting to track click that is null or not an ApplovinAdView instance for clickedUri = " + uri);
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0172, code lost:
    
        if (r6.i() != false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean a(WebView webView, String str, boolean z) {
        com.applovin.impl.sdk.p pVar;
        String str2;
        String str3;
        com.applovin.impl.a.a aVar;
        this.f2523b.b("AdWebViewClient", "Processing click on ad URL \"" + str + "\"");
        if (str != null && (webView instanceof c)) {
            Uri parse = Uri.parse(str);
            c cVar = (c) webView;
            String scheme = parse.getScheme();
            String host = parse.getHost();
            String path = parse.getPath();
            AppLovinAd currentAd = this.f2524c.getCurrentAd();
            if ("applovin".equals(scheme) && "com.applovin.sdk".equals(host)) {
                if (AppLovinAdService.URI_NEXT_AD.equals(path)) {
                    a(cVar);
                } else if (AppLovinAdService.URI_CLOSE_AD.equals(path)) {
                    a();
                } else if (AppLovinAdService.URI_EXPAND_AD.equals(path)) {
                    b();
                } else if (AppLovinAdService.URI_CONTRACT_AD.equals(path)) {
                    c();
                } else {
                    if (AppLovinAdServiceImpl.URI_NO_OP.equals(path)) {
                        return true;
                    }
                    if (AppLovinAdServiceImpl.URI_LOAD_URL.equals(path)) {
                        a(parse, cVar);
                    } else if (AppLovinAdServiceImpl.URI_TRACK_CLICK_IMMEDIATELY.equals(path)) {
                        if (currentAd instanceof com.applovin.impl.a.a) {
                            aVar = (com.applovin.impl.a.a) currentAd;
                        } else {
                            a(cVar, Uri.parse(AppLovinAdServiceImpl.URI_TRACK_CLICK_IMMEDIATELY));
                        }
                    } else if (path == null || !path.startsWith("/launch/")) {
                        this.f2523b.c("AdWebViewClient", "Unknown URL: " + str);
                        this.f2523b.c("AdWebViewClient", "Path: " + path);
                    } else {
                        List<String> pathSegments = parse.getPathSegments();
                        if (pathSegments != null && pathSegments.size() > 1) {
                            String str4 = pathSegments.get(pathSegments.size() - 1);
                            try {
                                Context context = webView.getContext();
                                context.startActivity(context.getPackageManager().getLaunchIntentForPackage(str4));
                                a(cVar, (Uri) null);
                            } catch (Exception e) {
                                this.f2523b.b("AdWebViewClient", "Threw Exception Trying to Launch App for Package: " + str4, e);
                            }
                        }
                    }
                }
            } else {
                if (!z) {
                    return false;
                }
                if (currentAd instanceof com.applovin.impl.sdk.ad.g) {
                    com.applovin.impl.sdk.ad.g gVar = (com.applovin.impl.sdk.ad.g) currentAd;
                    List<String> as = gVar.as();
                    List<String> at = gVar.at();
                    if ((as.isEmpty() || as.contains(scheme)) && (at.isEmpty() || at.contains(host))) {
                        if (currentAd instanceof com.applovin.impl.a.a) {
                            aVar = (com.applovin.impl.a.a) currentAd;
                        }
                        a(cVar, parse);
                    } else {
                        pVar = this.f2523b;
                        str2 = "AdWebViewClient";
                        str3 = "URL is not whitelisted - bypassing click";
                    }
                } else {
                    pVar = this.f2523b;
                    str2 = "AdWebViewClient";
                    str3 = "Bypassing click for ad of invalid type";
                }
                pVar.d(str2, str3);
            }
            a(aVar, cVar);
        }
        return true;
    }

    private void b() {
        this.f2524c.expandAd();
    }

    private void c() {
        this.f2524c.contractAd();
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        this.f2524c.onAdHtmlLoaded(webView);
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(24)
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        boolean hasGesture = ((Boolean) this.f2522a.a(com.applovin.impl.sdk.b.b.bZ)).booleanValue() ? webResourceRequest.hasGesture() : true;
        Uri url = webResourceRequest.getUrl();
        if (url != null) {
            return a(webView, url.toString(), hasGesture);
        }
        this.f2523b.d("AdWebViewClient", "No url found for request");
        return false;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return a(webView, str, true);
    }
}
