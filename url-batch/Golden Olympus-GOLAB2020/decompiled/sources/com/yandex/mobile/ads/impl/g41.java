package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class g41 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final z52 f26000a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final m81 f26001b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final mz1 f26002c;

    public /* synthetic */ g41(vu1 vu1Var) {
        this(vu1Var, new z52(), new m81(vu1Var), new mz1(vu1Var));
    }

    @NotNull
    public final y71 a(@NotNull Context context, @NotNull h41 nativeAdBlock, @NotNull zi0 imageProvider, @NotNull h51 nativeAdFactoriesProvider, @NotNull t41 nativeAdControllers) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(nativeAdBlock, "nativeAdBlock");
        Intrinsics.checkNotNullParameter(imageProvider, "imageProvider");
        Intrinsics.checkNotNullParameter(nativeAdFactoriesProvider, "nativeAdFactoriesProvider");
        Intrinsics.checkNotNullParameter(nativeAdControllers, "nativeAdControllers");
        vb0 vb0Var = new vb0();
        x71 x71Var = new x71(this.f26001b.a(context, nativeAdBlock, imageProvider, nativeAdFactoriesProvider, vb0Var, nativeAdControllers));
        return new y71(context, x71Var, imageProvider, this.f26002c.a(context, nativeAdBlock, x71Var, nativeAdFactoriesProvider, vb0Var), nativeAdControllers);
    }

    public g41(@NotNull vu1 sdkEnvironmentModule, @NotNull z52 trackingDataCreator, @NotNull m81 nativeGenericAdsCreator, @NotNull mz1 sliderAdBinderConfigurationCreator) {
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(trackingDataCreator, "trackingDataCreator");
        Intrinsics.checkNotNullParameter(nativeGenericAdsCreator, "nativeGenericAdsCreator");
        Intrinsics.checkNotNullParameter(sliderAdBinderConfigurationCreator, "sliderAdBinderConfigurationCreator");
        this.f26000a = trackingDataCreator;
        this.f26001b = nativeGenericAdsCreator;
        this.f26002c = sliderAdBinderConfigurationCreator;
    }

    @NotNull
    public final tb1 a(@NotNull h41 nativeAdBlock, @NotNull u31 nativeAd) {
        Intrinsics.checkNotNullParameter(nativeAdBlock, "nativeAdBlock");
        Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
        z52 z52Var = this.f26000a;
        List<tx1> h4 = nativeAd.h();
        List<tx1> i4 = nativeAdBlock.c().i();
        z52Var.getClass();
        ArrayList a4 = z52.a(h4, i4);
        z52 z52Var2 = this.f26000a;
        List<String> f4 = nativeAd.f();
        List<String> g4 = nativeAdBlock.c().g();
        z52Var2.getClass();
        return new tb1(nativeAd.b(), a4, z52.a(f4, g4), nativeAd.a(), nativeAd.c());
    }
}
