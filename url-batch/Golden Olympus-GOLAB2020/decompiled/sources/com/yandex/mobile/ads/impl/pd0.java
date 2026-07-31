package com.yandex.mobile.ads.impl;

import com.monetization.ads.nativeads.ExtendedNativeAdView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class pd0 implements q00<ExtendedNativeAdView> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private q00<ExtendedNativeAdView> f30414a;

    public pd0(@NotNull f61 nativeAdPrivate, @NotNull mr contentCloseListener, @NotNull dt nativeAdEventListener, @NotNull Cdo clickConnector, @NotNull mp1 reporter, @NotNull q00<ExtendedNativeAdView> divKitAdBinder) {
        Intrinsics.checkNotNullParameter(nativeAdPrivate, "nativeAdPrivate");
        Intrinsics.checkNotNullParameter(contentCloseListener, "contentCloseListener");
        Intrinsics.checkNotNullParameter(nativeAdEventListener, "nativeAdEventListener");
        Intrinsics.checkNotNullParameter(clickConnector, "clickConnector");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(divKitAdBinder, "divKitAdBinder");
        this.f30414a = divKitAdBinder;
    }

    @Override // com.yandex.mobile.ads.impl.q00
    public final void a(ExtendedNativeAdView extendedNativeAdView) {
        ExtendedNativeAdView fullscreenNativeAdView = extendedNativeAdView;
        Intrinsics.checkNotNullParameter(fullscreenNativeAdView, "fullscreenNativeAdView");
        this.f30414a.a(fullscreenNativeAdView);
    }

    @Override // com.yandex.mobile.ads.impl.q00
    public final void c() {
        this.f30414a.c();
    }
}
