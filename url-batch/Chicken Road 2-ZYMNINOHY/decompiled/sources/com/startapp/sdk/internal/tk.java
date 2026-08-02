package com.startapp.sdk.internal;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.io.ByteArrayInputStream;

/* loaded from: classes.dex */
public final class tk extends qk {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vk f7634a;

    public tk(vk vkVar) {
        this.f7634a = vkVar;
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        this.f7634a.a(webView, webResourceRequest);
        return new WebResourceResponse(null, null, new ByteArrayInputStream(new byte[0]));
    }
}
