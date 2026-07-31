package com.chartboost.sdk.impl;

import android.graphics.Bitmap;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import java.io.ByteArrayInputStream;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* loaded from: classes6.dex */
public abstract class md extends WebViewClient {
    public static final a b = new a(null);
    public final String a;

    public md(String mraidVersion) {
        Intrinsics.checkNotNullParameter(mraidVersion, "mraidVersion");
        this.a = mraidVersion;
    }

    public final WebResourceResponse a(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        if (!StringsKt.endsWith$default(url, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.w.k, false, 2, (Object) null)) {
            return null;
        }
        byte[] bytes = ed.a.a(this.a).getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return new WebResourceResponse(POBCommonConstants.CONTENT_TYPE_JAVASCRIPT, "UTF-8", new ByteArrayInputStream(bytes));
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView view, String url) {
        super.onLoadResource(view, url);
        CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.h.c, view, url);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        super.onPageStarted(view, url, favicon);
        BrandSafetyUtils.onWebViewPageStarted(com.safedk.android.utils.h.c, view, url);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
        super.onReceivedError(view, errorCode, description, failingUrl);
        BrandSafetyUtils.onWebViewReceivedError(com.safedk.android.utils.h.c, view, errorCode, description, failingUrl);
    }

    public WebResourceResponse safedk_md_shouldInterceptRequest_ab8b872c84a32bf41b436d5dfa699689(WebView view, WebResourceRequest request) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        String uri = request.getUrl().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        WebResourceResponse a2 = a(uri);
        return a2 == null ? super.shouldInterceptRequest(view, request) : a2;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        Logger.d("Chartboost|SafeDK: Execution> Lcom/chartboost/sdk/impl/md;->shouldInterceptRequest(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;");
        return CreativeInfoManager.onWebViewResponseWithHeaders(com.safedk.android.utils.h.c, webView, webResourceRequest, safedk_md_shouldInterceptRequest_ab8b872c84a32bf41b436d5dfa699689(webView, webResourceRequest));
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        boolean shouldOverrideUrlLoading = super.shouldOverrideUrlLoading(view, url);
        BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.h.c, view, url, shouldOverrideUrlLoading);
        return shouldOverrideUrlLoading;
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
