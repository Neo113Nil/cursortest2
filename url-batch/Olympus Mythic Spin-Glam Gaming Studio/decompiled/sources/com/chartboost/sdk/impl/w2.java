package com.chartboost.sdk.impl;

import android.graphics.Bitmap;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class w2 extends w5 {
    public final oa e;
    public final hh f;
    public boolean g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(oa impressionInterface, hh gestureDetector, x5 callback, p7 eventTracker) {
        super(callback, eventTracker, impressionInterface, (sg) f4.b.a().b().get());
        Intrinsics.checkNotNullParameter(impressionInterface, "impressionInterface");
        Intrinsics.checkNotNullParameter(gestureDetector, "gestureDetector");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        this.e = impressionInterface;
        this.f = gestureDetector;
    }

    @Override // com.chartboost.sdk.impl.w5, android.webkit.WebViewClient
    public void onLoadResource(WebView view, String url) {
        super.onLoadResource(view, url);
        CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.h.c, view, url);
    }

    @Override // com.chartboost.sdk.impl.w5, android.webkit.WebViewClient
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        super.onPageStarted(view, url, favicon);
        BrandSafetyUtils.onWebViewPageStarted(com.safedk.android.utils.h.c, view, url);
    }

    @Override // com.chartboost.sdk.impl.w5, android.webkit.WebViewClient
    public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
        super.onReceivedError(view, errorCode, description, failingUrl);
        BrandSafetyUtils.onWebViewReceivedError(com.safedk.android.utils.h.c, view, errorCode, description, failingUrl);
    }

    public boolean safedk_w2_shouldOverrideUrlLoading_a55ff944c0fff222d0875962a41b220e(WebView view, WebResourceRequest request) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        String uri = request.getUrl().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        return b(uri);
    }

    @Override // com.chartboost.sdk.impl.w5, android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
        return CreativeInfoManager.onWebViewResponseWithHeaders(com.safedk.android.utils.h.c, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
    }

    @Override // com.chartboost.sdk.impl.w5, android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Logger.d("Chartboost|SafeDK: Execution> Lcom/chartboost/sdk/impl/w2;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z");
        boolean safedk_w2_shouldOverrideUrlLoading_a55ff944c0fff222d0875962a41b220e = safedk_w2_shouldOverrideUrlLoading_a55ff944c0fff222d0875962a41b220e(webView, webResourceRequest);
        BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.h.c, webView, webResourceRequest, safedk_w2_shouldOverrideUrlLoading_a55ff944c0fff222d0875962a41b220e);
        return safedk_w2_shouldOverrideUrlLoading_a55ff944c0fff222d0875962a41b220e;
    }

    @Override // com.chartboost.sdk.impl.w5, android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Logger.d("Chartboost|SafeDK: Execution> Lcom/chartboost/sdk/impl/w2;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
        boolean safedk_w2_shouldOverrideUrlLoading_3367dc1d8a85e4edaf3de224f207c93c = safedk_w2_shouldOverrideUrlLoading_3367dc1d8a85e4edaf3de224f207c93c(webView, str);
        BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.h.c, webView, str, safedk_w2_shouldOverrideUrlLoading_3367dc1d8a85e4edaf3de224f207c93c);
        return safedk_w2_shouldOverrideUrlLoading_3367dc1d8a85e4edaf3de224f207c93c;
    }

    public final hh a() {
        return this.f;
    }

    public boolean safedk_w2_shouldOverrideUrlLoading_3367dc1d8a85e4edaf3de224f207c93c(WebView p0, String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return b(url);
    }

    @Override // com.chartboost.sdk.impl.w5, android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        this.g = true;
    }

    public final boolean b(String str) {
        if (!this.g) {
            xb.b("Attempt to open " + str + " detected before WebView loading finished.", (Throwable) null, 2, (Object) null);
            this.e.d(new o3(str, Boolean.FALSE));
            return true;
        }
        if (!this.f.a()) {
            return false;
        }
        this.e.c(new o3(str, Boolean.FALSE));
        this.f.b();
        return true;
    }
}
