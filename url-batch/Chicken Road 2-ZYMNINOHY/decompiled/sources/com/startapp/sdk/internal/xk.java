package com.startapp.sdk.internal;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.io.ByteArrayInputStream;

/* loaded from: classes.dex */
public final class xk extends qk {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yk f7884a;

    public xk(yk ykVar) {
        this.f7884a = ykVar;
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        kotlin.jvm.internal.i.e(webView, "webView");
        this.f7884a.a(webView, webResourceRequest);
        return new WebResourceResponse(null, null, new ByteArrayInputStream(new byte[0]));
    }
}
