package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.l71;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class f41 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final vu1 f25605a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final d41 f25606b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ba1 f25607c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ f41(vu1 vu1Var) {
        this(vu1Var, r0, new d41(r0), new ba1(r0));
        C2134oa c2134oa = new C2134oa();
    }

    @NotNull
    public final C2258tk a(@NotNull Context context, @NotNull h41 nativeAdBlock, @NotNull tb1 nativeVisualBlock, @NotNull rb1 viewRenderer, @NotNull h51 nativeAdFactoriesProvider, @NotNull vb0 noticeForceTrackingController, @NotNull u31 nativeAd, @NotNull EnumC1848c9 adStructureType) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(nativeAdBlock, "nativeAdBlock");
        Intrinsics.checkNotNullParameter(nativeVisualBlock, "nativeVisualBlock");
        Intrinsics.checkNotNullParameter(viewRenderer, "viewRenderer");
        Intrinsics.checkNotNullParameter(nativeAdFactoriesProvider, "nativeAdFactoriesProvider");
        Intrinsics.checkNotNullParameter(noticeForceTrackingController, "noticeForceTrackingController");
        Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
        Intrinsics.checkNotNullParameter(adStructureType, "adStructureType");
        int i4 = l71.f28448c;
        l71 a4 = l71.a.a();
        o71 a5 = this.f25606b.a(context, nativeAdBlock.a().b(), nativeVisualBlock.b(), a4);
        return new C2258tk(nativeAdBlock, this.f25607c.a(context, nativeAdBlock.a().b(), a5, nativeAdBlock.b()), nativeVisualBlock, viewRenderer, nativeAdFactoriesProvider, new C2196r4(noticeForceTrackingController), new b71(context, a5, a4), this.f25605a, nativeAd, adStructureType);
    }

    public f41(@NotNull vu1 sdkEnvironmentModule, @NotNull C2134oa adaptiveValidationRulesProvider, @NotNull d41 nativeAdAssetsValidatorFactory, @NotNull ba1 nativeValidatorFactory) {
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(adaptiveValidationRulesProvider, "adaptiveValidationRulesProvider");
        Intrinsics.checkNotNullParameter(nativeAdAssetsValidatorFactory, "nativeAdAssetsValidatorFactory");
        Intrinsics.checkNotNullParameter(nativeValidatorFactory, "nativeValidatorFactory");
        this.f25605a = sdkEnvironmentModule;
        this.f25606b = nativeAdAssetsValidatorFactory;
        this.f25607c = nativeValidatorFactory;
    }
}
