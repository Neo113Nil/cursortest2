package com.startapp.sdk.internal;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.io.ByteArrayInputStream;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class ak extends tj {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bk f174a;

    public ak(bk bkVar) {
        this.f174a = bkVar;
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        webView.getClass();
        this.f174a.a(webView, webResourceRequest);
        return new WebResourceResponse(null, null, new ByteArrayInputStream(new byte[0]));
    }
}
