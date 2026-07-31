package com.applovin.impl;

import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: classes8.dex */
public class m8 extends t4 {
    private final com.applovin.impl.sdk.o a;
    private WeakReference b;

    public interface a {
        void a(Uri uri, com.applovin.impl.adview.l lVar);

        void a(com.applovin.impl.adview.l lVar);

        void b(Uri uri, com.applovin.impl.adview.l lVar);

        void b(com.applovin.impl.adview.l lVar);

        void c(com.applovin.impl.adview.l lVar);

        void d(com.applovin.impl.adview.l lVar);
    }

    public m8(com.applovin.impl.sdk.k kVar) {
        this.a = kVar.O();
    }

    public void a(WeakReference weakReference) {
        this.b = weakReference;
    }

    @Override // com.applovin.impl.t4, android.webkit.WebViewClient
    public void onLoadResource(WebView view, String url) {
        super.onLoadResource(view, url);
        CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.h.a, view, url);
    }

    @Override // com.applovin.impl.t4, android.webkit.WebViewClient
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        super.onPageStarted(view, url, favicon);
        BrandSafetyUtils.onWebViewPageStarted(com.safedk.android.utils.h.a, view, url);
    }

    @Override // com.applovin.impl.t4, android.webkit.WebViewClient
    public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
        super.onReceivedError(view, errorCode, description, failingUrl);
        BrandSafetyUtils.onWebViewReceivedError(com.safedk.android.utils.h.a, view, errorCode, description, failingUrl);
    }

    public boolean safedk_m8_shouldOverrideUrlLoading_4abe774f188b541636c5c536580c1b92(WebView p0, String p1) {
        a(p0, p1);
        return true;
    }

    @Override // com.applovin.impl.t4, android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
        return CreativeInfoManager.onWebViewResponseWithHeaders(com.safedk.android.utils.h.a, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
    }

    @Override // com.applovin.impl.t4, android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/impl/m8;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
        boolean safedk_m8_shouldOverrideUrlLoading_4abe774f188b541636c5c536580c1b92 = safedk_m8_shouldOverrideUrlLoading_4abe774f188b541636c5c536580c1b92(webView, str);
        BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.h.a, webView, str, safedk_m8_shouldOverrideUrlLoading_4abe774f188b541636c5c536580c1b92);
        return safedk_m8_shouldOverrideUrlLoading_4abe774f188b541636c5c536580c1b92;
    }

    @Override // com.applovin.impl.t4
    protected Map a() {
        return CollectionUtils.hashMap("name", "WebViewButtonClient");
    }

    private void a(WebView webView, String str) {
        if (com.applovin.impl.sdk.o.a()) {
            this.a.d("WebViewButtonClient", "Processing click on ad URL \"" + str + "\"");
        }
        if (str == null || !(webView instanceof com.applovin.impl.adview.l)) {
            return;
        }
        com.applovin.impl.adview.l lVar = (com.applovin.impl.adview.l) webView;
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        String host = parse.getHost();
        String path = parse.getPath();
        a aVar = (a) this.b.get();
        if ("applovin".equalsIgnoreCase(scheme) && "com.applovin.sdk".equalsIgnoreCase(host) && aVar != null) {
            if ("/track_click".equals(path)) {
                aVar.b(lVar);
                return;
            }
            if ("/close_ad".equals(path)) {
                aVar.a(lVar);
                return;
            }
            if ("/skip_ad".equals(path)) {
                aVar.d(lVar);
                return;
            }
            if ("/load_url".equals(path)) {
                aVar.a(parse, lVar);
                return;
            }
            if ("/template_error".equals(path)) {
                aVar.b(parse, lVar);
                return;
            }
            if ("/fully_watched".equals(path)) {
                aVar.c(lVar);
                return;
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.a.k("WebViewButtonClient", "Unknown URL: " + str);
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.a.k("WebViewButtonClient", "Path: " + path);
            }
        }
    }
}
