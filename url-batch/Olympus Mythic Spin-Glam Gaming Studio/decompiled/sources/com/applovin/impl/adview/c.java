package com.applovin.impl.adview;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.view.MotionEvent;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.a8;
import com.applovin.impl.d2;
import com.applovin.impl.f2;
import com.applovin.impl.k7;
import com.applovin.impl.n7;
import com.applovin.impl.o7;
import com.applovin.impl.r7;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t4;
import com.applovin.impl.x4;
import com.applovin.sdk.AppLovinAdSize;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes10.dex */
public class c extends t4 {
    private final com.applovin.impl.sdk.k a;
    private final o b;
    private final a c;

    public c(a aVar, com.applovin.impl.sdk.k kVar) {
        this.a = kVar;
        this.b = kVar.O();
        this.c = aVar;
    }

    private void b() {
        this.c.z();
    }

    private void c() {
        this.c.a();
    }

    @Override // com.applovin.impl.t4
    protected Map a() {
        HashMap<String, String> hashMap = CollectionUtils.hashMap("name", "AdWebViewClient");
        hashMap.putAll(f2.a((AppLovinAdImpl) this.c.g()));
        return hashMap;
    }

    protected a d() {
        return this.c;
    }

    @Override // com.applovin.impl.t4, android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/impl/adview/c;->onLoadResource(Landroid/webkit/WebView;Ljava/lang/String;)V");
        CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.h.a, webView, str);
        safedk_c_onLoadResource_1af43fc902fb6865fb0a01b3cce96a24(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        if (o.a()) {
            this.b.d("AdWebView", "Loaded URL: " + str);
        }
        this.c.a(webView, str);
    }

    @Override // com.applovin.impl.t4, android.webkit.WebViewClient
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        super.onPageStarted(view, url, favicon);
        BrandSafetyUtils.onWebViewPageStarted(com.safedk.android.utils.h.a, view, url);
    }

    @Override // com.applovin.impl.t4, android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/impl/adview/c;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V");
        BrandSafetyUtils.onWebViewReceivedError(com.safedk.android.utils.h.a, webView, i, str, str2);
        safedk_c_onReceivedError_8e544adb9beea31f39e1655c605c306d(webView, i, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/impl/adview/c;->onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V");
        BrandSafetyUtils.onWebViewReceivedError(com.safedk.android.utils.h.a, webView, webResourceRequest, webResourceError);
        safedk_c_onReceivedError_3e062ec97139c0570b7d2cb7765ff835(webView, webResourceRequest, webResourceError);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        com.applovin.impl.sdk.ad.b g = this.c.g();
        if (o.a()) {
            this.b.b("AdWebView", "Received HTTP error: " + webResourceResponse + "for url: " + webResourceRequest.getUrl() + " and ad: " + g);
        }
        if (n7.a(webResourceRequest.getUrl().toString(), this.a)) {
            this.a.D().a("adWebViewReceivedHttpError", webResourceRequest.getUrl().toString(), webResourceResponse.getStatusCode(), webResourceResponse.getReasonPhrase());
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        com.applovin.impl.sdk.ad.b g = this.c.g();
        String str = "Received SSL error: " + sslError;
        if (o.a()) {
            this.b.b("AdWebView", str + " for ad: " + g);
        }
    }

    @Override // com.applovin.impl.t4, android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        boolean didCrash;
        AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.render_process_gone"), null);
        com.applovin.impl.sdk.ad.b g = this.c.g();
        StringBuilder sb = new StringBuilder();
        sb.append("Render process gone for ad: ");
        sb.append(g);
        sb.append(". Process did crash: ");
        didCrash = renderProcessGoneDetail.didCrash();
        sb.append(didCrash);
        o.h("AdWebView", sb.toString());
        boolean onRenderProcessGone = super.onRenderProcessGone(webView, renderProcessGoneDetail);
        if (((Boolean) this.a.a(x4.R5)).booleanValue()) {
            a(webView, renderProcessGoneDetail, g);
        }
        return onRenderProcessGone;
    }

    public void safedk_c_onLoadResource_1af43fc902fb6865fb0a01b3cce96a24(WebView p0, String p1) {
        super.onLoadResource(p0, p1);
        if (o.a()) {
            this.b.d("AdWebView", "Loaded resource: " + p1);
        }
    }

    public void safedk_c_onReceivedError_3e062ec97139c0570b7d2cb7765ff835(WebView p0, WebResourceRequest p1, WebResourceError p2) {
        super.onReceivedError(p0, p1, p2);
        onReceivedError(p0, p2.getErrorCode(), p2.getDescription().toString(), p1.getUrl().toString());
    }

    public boolean safedk_c_shouldOverrideUrlLoading_678f8c4351efae3cc506edb28e260cba(WebView p0, WebResourceRequest p1) {
        Uri url = p1.getUrl();
        if (url != null) {
            return a(p0, url.toString());
        }
        if (!o.a()) {
            return false;
        }
        this.b.b("AdWebView", "No url found for request");
        return false;
    }

    @Override // com.applovin.impl.t4, android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
        return CreativeInfoManager.onWebViewResponseWithHeaders(com.safedk.android.utils.h.a, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/impl/adview/c;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z");
        boolean safedk_c_shouldOverrideUrlLoading_678f8c4351efae3cc506edb28e260cba = safedk_c_shouldOverrideUrlLoading_678f8c4351efae3cc506edb28e260cba(webView, webResourceRequest);
        BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.h.a, webView, webResourceRequest, safedk_c_shouldOverrideUrlLoading_678f8c4351efae3cc506edb28e260cba);
        return safedk_c_shouldOverrideUrlLoading_678f8c4351efae3cc506edb28e260cba;
    }

    @Override // com.applovin.impl.t4, android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/impl/adview/c;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
        boolean safedk_c_shouldOverrideUrlLoading_2ce55369ff10fa536fb839524e517b10 = safedk_c_shouldOverrideUrlLoading_2ce55369ff10fa536fb839524e517b10(webView, str);
        BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.h.a, webView, str, safedk_c_shouldOverrideUrlLoading_2ce55369ff10fa536fb839524e517b10);
        return safedk_c_shouldOverrideUrlLoading_2ce55369ff10fa536fb839524e517b10;
    }

    public void safedk_c_onReceivedError_8e544adb9beea31f39e1655c605c306d(WebView p0, int p1, String p2, String p3) {
        super.onReceivedError(p0, p1, p2, p3);
        com.applovin.impl.sdk.ad.b g = this.c.g();
        String str = "Received error with error code: " + p1 + " with description \\'" + p2 + "\\' for URL: " + p3;
        if (o.a()) {
            this.b.b("AdWebView", str + " for ad: " + g);
        }
        if (n7.a(p3, this.a)) {
            this.a.D().a("adWebViewReceivedError", p3, p1, p2);
        }
    }

    protected boolean a(WebView webView, String str) {
        boolean z;
        if (this.c == null) {
            return true;
        }
        if (o.a()) {
            this.b.d("AdWebView", "Processing click on ad URL \"" + str + "\"");
        }
        if (str != null && (webView instanceof b)) {
            Uri parse = Uri.parse(str);
            b bVar = (b) webView;
            String scheme = parse.getScheme();
            String host = parse.getHost();
            String path = parse.getPath();
            com.applovin.impl.sdk.ad.b g = this.c.g();
            if (g == null) {
                if (o.a()) {
                    this.b.b("AdWebView", "Unable to process click, ad not found!");
                }
                return true;
            }
            boolean a = bVar.a();
            if ("applovin".equals(scheme) && "com.applovin.sdk".equals(host)) {
                if ("/vibrate".equals(path)) {
                    long parseLong = StringUtils.parseLong(parse.getQueryParameter("duration_ms"), 0L);
                    if (parseLong > 0) {
                        n7.a(StringUtils.parseFloat(parse.getQueryParameter("intensity"), 0.5f), parseLong, this.a);
                    }
                } else if ("/adservice/close_ad".equals(path)) {
                    b();
                } else if ("/adservice/expand_ad".equals(path)) {
                    if (a(a, g, parse)) {
                        if (o.a()) {
                            this.b.b("AdWebView", "Skipping expand command without user interaction");
                        }
                        return true;
                    }
                    a(bVar.getLastClickEvent());
                } else if ("/adservice/contract_ad".equals(path)) {
                    c();
                } else {
                    if ("/adservice/no_op".equals(path)) {
                        return true;
                    }
                    if ("/adservice/load_url".equals(path)) {
                        if (a(a, g, parse)) {
                            if (o.a()) {
                                this.b.b("AdWebView", "Skipping URL load command without user interaction");
                            }
                            return true;
                        }
                        k7.a(parse, this.c, this.a);
                    } else if ("/adservice/track_click_now".equals(path)) {
                        if (a(a, g, parse)) {
                            if (o.a()) {
                                this.b.b("AdWebView", "Skipping click tracking command without user interaction");
                            }
                            return true;
                        }
                        if (g instanceof o7) {
                            a((o7) g, bVar);
                        } else {
                            a(bVar, Uri.parse("/adservice/track_click_now"));
                        }
                    } else if ("/adservice/deeplink".equals(path)) {
                        if (a(a, g, parse)) {
                            if (o.a()) {
                                this.b.b("AdWebView", "Skipping deep link plus command without user interaction");
                            }
                            return true;
                        }
                        if (g instanceof o7) {
                            o7 o7Var = (o7) g;
                            if (o7Var.w1()) {
                                a(o7Var, bVar);
                            }
                        }
                        a(bVar, parse);
                    } else if ("/adservice/postback".equals(path)) {
                        k7.a(parse, g, this.a);
                    } else if ("/ga_init".equals(path)) {
                        this.c.b(parse);
                    } else if ("/ga_event".equals(path)) {
                        this.c.a(parse);
                    } else if ("/playable_event".equals(path)) {
                        a(parse);
                    } else if ("/save_template_state".equals(path)) {
                        g.b(parse.getQueryParameter("state"));
                    } else if ("/template_error".equals(path)) {
                        k7.c(parse, g, this.a);
                    } else if ("/adservice/fully_watched".equals(path)) {
                        this.c.A();
                    } else if ("/adservice/preload".equals(path)) {
                        k7.b(parse, g, this.a);
                    } else if ("/adservice/custom_intent".equals(path)) {
                        k7.a(parse, g, this.c.i(), this.a);
                    } else {
                        if (o.a()) {
                            this.b.k("AdWebView", "Unknown URL: " + str);
                        }
                        if (o.a()) {
                            this.b.k("AdWebView", "Path: " + path);
                        }
                    }
                }
            } else {
                Iterator it = g.V().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = true;
                        break;
                    }
                    String str2 = (String) it.next();
                    if (StringUtils.isValidString(path) && path.contains(str2)) {
                        z = false;
                        break;
                    }
                }
                if (!a) {
                    boolean X0 = g.X0();
                    boolean z2 = X0 ? false : z;
                    a(parse, X0, g, this.a);
                    z = z2;
                }
                if (z) {
                    List p0 = g.p0();
                    List o0 = g.o0();
                    if ((!p0.isEmpty() && !p0.contains(scheme)) || (!o0.isEmpty() && !o0.contains(host))) {
                        if (o.a()) {
                            this.b.b("AdWebView", "URL is not whitelisted - bypassing click");
                        }
                    } else {
                        if (g instanceof o7) {
                            o7 o7Var2 = (o7) g;
                            if (o7Var2.w1()) {
                                a(o7Var2, bVar);
                            }
                        }
                        a(bVar, parse);
                    }
                }
            }
        }
        return true;
    }

    public boolean safedk_c_shouldOverrideUrlLoading_2ce55369ff10fa536fb839524e517b10(WebView p0, String p1) {
        return a(p0, p1);
    }

    private void a(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail, com.applovin.impl.sdk.ad.b bVar) {
        boolean didCrash;
        didCrash = renderProcessGoneDetail.didCrash();
        if (didCrash && ((Boolean) this.a.a(x4.Y5)).booleanValue()) {
            throw new RuntimeException("Render process crashed. This is likely caused by a crash in an AppLovin ad with ID: " + (bVar != null ? String.valueOf(bVar.getAdIdNumber()) : POBCommonConstants.NULL_VALUE));
        }
        if (webView == null || !webView.equals(this.c.f())) {
            return;
        }
        this.c.b();
        AppLovinAdSize k = this.c.k();
        if (n7.a(k)) {
            this.c.a(k);
            this.c.F();
        }
    }

    private boolean a(boolean z, com.applovin.impl.sdk.ad.b bVar, Uri uri) {
        if (z) {
            return false;
        }
        boolean Y0 = bVar.Y0();
        a(uri, Y0, bVar, this.a);
        return Y0;
    }

    private static void a(Uri uri, boolean z, com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.sdk.k kVar) {
        if (kVar.c(x4.R6).contains(uri.getScheme())) {
            return;
        }
        kVar.D().d(d2.J0, a(bVar, uri, z));
    }

    private static Map a(com.applovin.impl.sdk.ad.b bVar, Uri uri, boolean z) {
        Map a = f2.a((AppLovinAdImpl) bVar);
        CollectionUtils.putStringIfValid("url", uri.toString(), a);
        CollectionUtils.putStringIfValid("is_blocked_auto_redirect", String.valueOf(z), a);
        return a;
    }

    private void a(MotionEvent motionEvent) {
        this.c.a(motionEvent);
    }

    private void a(o7 o7Var, b bVar) {
        r7 g1 = o7Var.g1();
        if (g1 != null) {
            a8.a(g1.b(), this.c.j());
            a(bVar, g1.c());
        }
    }

    private void a(b bVar, Uri uri) {
        com.applovin.impl.sdk.ad.b currentAd = bVar.getCurrentAd();
        AppLovinAdView i = this.c.i();
        if (i != null && currentAd != null) {
            if (currentAd instanceof o7) {
                ((o7) currentAd).getAdEventTracker().v();
            }
            this.c.a(currentAd, i, uri, bVar.getAndClearLastClickEvent());
        } else if (o.a()) {
            this.b.b("AdWebView", "Attempting to track click that is null or not an ApplovinAdView instance for clickedUri = " + uri);
        }
    }

    private void a(Uri uri) {
        String str;
        boolean booleanQueryParameter = uri.getBooleanQueryParameter("success", false);
        String queryParameter = uri.getQueryParameter("type");
        if (booleanQueryParameter) {
            str = "Tracked event: " + queryParameter;
        } else {
            str = "Failed to track event: " + queryParameter;
        }
        n7.a(str, com.applovin.impl.sdk.k.o());
    }
}
