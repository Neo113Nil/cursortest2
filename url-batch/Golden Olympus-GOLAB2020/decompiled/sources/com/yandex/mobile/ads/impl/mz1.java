package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ew1;
import com.yandex.mobile.ads.impl.l71;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class mz1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final vu1 f29315a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2201r9 f29316b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final d41 f29317c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final ba1 f29318d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ mz1(vu1 vu1Var) {
        this(vu1Var, r2, new C2201r9(), new d41(r2), new ba1(r2));
        C2134oa c2134oa = new C2134oa();
    }

    @NotNull
    public final C2258tk a(@NotNull Context context, @NotNull h41 nativeAdBlock, @NotNull x71 nativeCompositeAd, @NotNull h51 nativeAdFactoriesProvider, @NotNull vb0 noticeForceTrackingController) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(nativeAdBlock, "nativeAdBlock");
        Intrinsics.checkNotNullParameter(nativeCompositeAd, "nativeCompositeAd");
        Intrinsics.checkNotNullParameter(nativeAdFactoriesProvider, "nativeAdFactoriesProvider");
        Intrinsics.checkNotNullParameter(noticeForceTrackingController, "noticeForceTrackingController");
        tb1 a4 = this.f29316b.a(nativeAdBlock);
        int i4 = l71.f28448c;
        l71 a5 = l71.a.a();
        o71 a6 = this.f29317c.a(context, nativeAdBlock.a().b(), a4.b(), a5);
        int i5 = ew1.f25476l;
        return new C2258tk(nativeAdBlock, this.f29318d.a(context, nativeAdBlock.a().b(), nativeCompositeAd, a6, ew1.a.a(), nativeAdBlock.b()), a4, new rz1(a4.b()), nativeAdFactoriesProvider, new C2179q9(noticeForceTrackingController), new b71(context, a6, a5), this.f29315a, null, EnumC1848c9.f24099c);
    }

    public mz1(@NotNull vu1 sdkEnvironmentModule, @NotNull C2134oa adaptiveValidationRulesProvider, @NotNull C2201r9 adUnitNativeVisualBlockCreator, @NotNull d41 nativeAdAssetsValidatorFactory, @NotNull ba1 nativeValidatorFactory) {
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(adaptiveValidationRulesProvider, "adaptiveValidationRulesProvider");
        Intrinsics.checkNotNullParameter(adUnitNativeVisualBlockCreator, "adUnitNativeVisualBlockCreator");
        Intrinsics.checkNotNullParameter(nativeAdAssetsValidatorFactory, "nativeAdAssetsValidatorFactory");
        Intrinsics.checkNotNullParameter(nativeValidatorFactory, "nativeValidatorFactory");
        this.f29315a = sdkEnvironmentModule;
        this.f29316b = adUnitNativeVisualBlockCreator;
        this.f29317c = nativeAdAssetsValidatorFactory;
        this.f29318d = nativeValidatorFactory;
    }
}
