package com.yandex.mobile.ads.impl;

import com.monetization.ads.mediation.nativeads.MediatedNativeAd;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class py0 implements sb1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final MediatedNativeAd f30615a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final hy0 f30616b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C2221s6 f30617c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final sb1 f30618d;

    public py0(@NotNull MediatedNativeAd mediatedNativeAd, @NotNull hy0 mediatedNativeRenderingTracker, @NotNull C2221s6 adQualityVerifierController, @NotNull sb1 sdkAdFactory) {
        Intrinsics.checkNotNullParameter(mediatedNativeAd, "mediatedNativeAd");
        Intrinsics.checkNotNullParameter(mediatedNativeRenderingTracker, "mediatedNativeRenderingTracker");
        Intrinsics.checkNotNullParameter(adQualityVerifierController, "adQualityVerifierController");
        Intrinsics.checkNotNullParameter(sdkAdFactory, "sdkAdFactory");
        this.f30615a = mediatedNativeAd;
        this.f30616b = mediatedNativeRenderingTracker;
        this.f30617c = adQualityVerifierController;
        this.f30618d = sdkAdFactory;
    }

    @Override // com.yandex.mobile.ads.impl.sb1
    @NotNull
    public final rb1 a(@NotNull u31 nativeAd) {
        Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
        return new iy0(this.f30618d.a(nativeAd), this.f30615a, this.f30616b, this.f30617c);
    }
}
