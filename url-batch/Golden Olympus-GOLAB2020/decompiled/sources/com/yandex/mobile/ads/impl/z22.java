package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class z22 implements dt {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final dt f35447a;

    public z22(@NotNull dt nativeAdEventListener) {
        Intrinsics.checkNotNullParameter(nativeAdEventListener, "nativeAdEventListener");
        this.f35447a = nativeAdEventListener;
    }

    @Override // com.yandex.mobile.ads.impl.dt
    public final void a(@Nullable C1795a4 c1795a4) {
    }

    @Override // com.yandex.mobile.ads.impl.dt
    public final void closeNativeAd() {
        this.f35447a.closeNativeAd();
    }

    @Override // com.yandex.mobile.ads.impl.dt
    public final void onAdClicked() {
        this.f35447a.onAdClicked();
    }

    @Override // com.yandex.mobile.ads.impl.dt
    public final void onLeftApplication() {
        this.f35447a.onLeftApplication();
    }

    @Override // com.yandex.mobile.ads.impl.dt
    public final void onReturnedToApplication() {
        this.f35447a.onReturnedToApplication();
    }
}
