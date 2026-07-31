package com.yandex.mobile.ads.impl;

import com.monetization.ads.nativeads.ExtendedNativeAdView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class iq1 implements q00<ExtendedNativeAdView> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC1912f1 f27374a;

    /* renamed from: b, reason: collision with root package name */
    private final int f27375b;

    public iq1(@NotNull InterfaceC1912f1 adActivityListener, int i4) {
        Intrinsics.checkNotNullParameter(adActivityListener, "adActivityListener");
        this.f27374a = adActivityListener;
        this.f27375b = i4;
    }

    @Override // com.yandex.mobile.ads.impl.q00
    public final void a(ExtendedNativeAdView extendedNativeAdView) {
        ExtendedNativeAdView container = extendedNativeAdView;
        Intrinsics.checkNotNullParameter(container, "container");
        if (this.f27375b == 1) {
            this.f27374a.a(7);
        } else {
            this.f27374a.a(6);
        }
    }

    @Override // com.yandex.mobile.ads.impl.q00
    public final void c() {
    }
}
