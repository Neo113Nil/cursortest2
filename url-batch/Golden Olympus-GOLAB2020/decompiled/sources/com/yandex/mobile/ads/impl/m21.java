package com.yandex.mobile.ads.impl;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.io.ByteArrayInputStream;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class m21 extends gg0 {

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private String f28835c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m21(@NotNull hg0 webViewClientListener) {
        super(webViewClientListener);
        Intrinsics.checkNotNullParameter(webViewClientListener, "webViewClientListener");
    }

    public final void a(@Nullable String str) {
        this.f28835c = str;
    }

    @Override // android.webkit.WebViewClient
    @Nullable
    public final WebResourceResponse shouldInterceptRequest(@NotNull WebView view, @NotNull WebResourceRequest request) {
        Uri url;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        String str = this.f28835c;
        if (str == null || str.length() <= 0 || (url = request.getUrl()) == null || !Intrinsics.areEqual("mraid.js", url.getLastPathSegment())) {
            return super.shouldInterceptRequest(view, request);
        }
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return new WebResourceResponse("text/javascript", "UTF-8", new ByteArrayInputStream(bytes));
    }

    @Override // android.webkit.WebViewClient
    @Nullable
    public final WebResourceResponse shouldInterceptRequest(@NotNull WebView view, @NotNull String url) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(url, "url");
        return super.shouldInterceptRequest(view, url);
    }
}
