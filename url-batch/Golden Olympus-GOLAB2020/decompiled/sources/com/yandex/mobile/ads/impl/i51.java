package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class i51 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final l81 f27098a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final f41 f27099b;

    public /* synthetic */ i51(vu1 vu1Var) {
        this(vu1Var, new l81(), new f41(vu1Var));
    }

    @Nullable
    public final f61 a(@NotNull Context context, @NotNull h41 nativeAdBlock, @NotNull zi0 imageProvider, @NotNull g41 nativeAdBinderFactory, @NotNull h51 nativeAdFactoriesProvider, @NotNull t41 nativeAdControllers, @Nullable u31 u31Var) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(nativeAdBlock, "nativeAdBlock");
        Intrinsics.checkNotNullParameter(imageProvider, "imageProvider");
        Intrinsics.checkNotNullParameter(nativeAdBinderFactory, "nativeAdBinderFactory");
        Intrinsics.checkNotNullParameter(nativeAdFactoriesProvider, "nativeAdFactoriesProvider");
        Intrinsics.checkNotNullParameter(nativeAdControllers, "nativeAdControllers");
        if (u31Var == null) {
            return null;
        }
        k81 a4 = this.f27098a.a(u31Var.g());
        rb1 a5 = nativeAdFactoriesProvider.d().a(u31Var);
        vb0 vb0Var = new vb0();
        return a4.a(context, u31Var, new b61(context, u31Var, imageProvider, a5), imageProvider, this.f27099b.a(context, nativeAdBlock, nativeAdBinderFactory.a(nativeAdBlock, u31Var), a5, nativeAdFactoriesProvider, vb0Var, u31Var, EnumC1848c9.f24098b), nativeAdControllers);
    }

    public i51(@NotNull vu1 sdkEnvironmentModule, @NotNull l81 nativeGenericAdCreatorProvider, @NotNull f41 nativeAdBinderConfigurationCreator) {
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(nativeGenericAdCreatorProvider, "nativeGenericAdCreatorProvider");
        Intrinsics.checkNotNullParameter(nativeAdBinderConfigurationCreator, "nativeAdBinderConfigurationCreator");
        this.f27098a = nativeGenericAdCreatorProvider;
        this.f27099b = nativeAdBinderConfigurationCreator;
    }
}
