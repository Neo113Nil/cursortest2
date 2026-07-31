package com.startapp.sdk.internal;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.io.ByteArrayInputStream;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class wj extends tj {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yj f487a;

    public wj(yj yjVar) {
        this.f487a = yjVar;
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        this.f487a.a(webView, webResourceRequest);
        return new WebResourceResponse(null, null, new ByteArrayInputStream(new byte[0]));
    }
}
