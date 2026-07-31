package com.yandex.mobile.ads.impl;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class e21 implements jg0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final z11 f25065a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final jg0 f25066b;

    public e21(@NotNull z11 mraidController, @NotNull jg0 htmlWebViewListener) {
        Intrinsics.checkNotNullParameter(mraidController, "mraidController");
        Intrinsics.checkNotNullParameter(htmlWebViewListener, "htmlWebViewListener");
        this.f25065a = mraidController;
        this.f25066b = htmlWebViewListener;
    }

    @Override // com.yandex.mobile.ads.impl.jg0
    public final void a(@NotNull C1866d3 adFetchRequestError) {
        Intrinsics.checkNotNullParameter(adFetchRequestError, "adFetchRequestError");
        this.f25066b.a(adFetchRequestError);
    }

    @Override // com.yandex.mobile.ads.impl.jg0
    public final void a(@NotNull qf1 webView, @NotNull Map trackingParameters) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(trackingParameters, "trackingParameters");
        this.f25065a.a(webView, trackingParameters);
    }

    @Override // com.yandex.mobile.ads.impl.jg0
    public final void a(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f25065a.b(url);
    }

    @Override // com.yandex.mobile.ads.impl.jg0
    public final void a() {
        this.f25065a.c();
    }

    @Override // com.yandex.mobile.ads.impl.jg0
    public final void a(boolean z4) {
        this.f25065a.a(z4);
    }
}
