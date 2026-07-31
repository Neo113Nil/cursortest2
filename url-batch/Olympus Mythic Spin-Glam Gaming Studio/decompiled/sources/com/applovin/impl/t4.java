package com.applovin.impl;

import android.graphics.Bitmap;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes10.dex */
public abstract class t4 extends WebViewClient {
    protected abstract Map a();

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView view, String url) {
        super.onLoadResource(view, url);
        CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.h.a, view, url);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        super.onPageStarted(view, url, favicon);
        BrandSafetyUtils.onWebViewPageStarted(com.safedk.android.utils.h.a, view, url);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
        super.onReceivedError(view, errorCode, description, failingUrl);
        BrandSafetyUtils.onWebViewReceivedError(com.safedk.android.utils.h.a, view, errorCode, description, failingUrl);
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        boolean didCrash;
        int rendererPriorityAtExit;
        HashMap<String, String> hashMap = CollectionUtils.hashMap("top_main_method", "onRenderProcessGone");
        hashMap.putAll(a());
        if (o0.g()) {
            didCrash = renderProcessGoneDetail.didCrash();
            hashMap.put("source", didCrash ? "crash" : "non_crash");
            StringBuilder sb = new StringBuilder();
            sb.append("renderer_priority_at_exit=");
            rendererPriorityAtExit = renderProcessGoneDetail.rendererPriorityAtExit();
            sb.append(rendererPriorityAtExit);
            hashMap.put("details", sb.toString());
        }
        com.applovin.impl.sdk.k kVar = com.applovin.impl.sdk.k.C0;
        if (kVar != null) {
            com.applovin.impl.sdk.k.C0.D().a(d2.b1, hashMap, ((Long) kVar.a(x4.q3)).longValue());
        }
        com.applovin.impl.sdk.o.g("RenderProcessGoneHandlingWebViewClient", "onRenderProcessGone() handled");
        return true;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
        return CreativeInfoManager.onWebViewResponseWithHeaders(com.safedk.android.utils.h.a, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        boolean shouldOverrideUrlLoading = super.shouldOverrideUrlLoading(view, url);
        BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.h.a, view, url, shouldOverrideUrlLoading);
        return shouldOverrideUrlLoading;
    }
}
