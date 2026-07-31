package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class z41 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2286v2 f35457a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final t41 f35458b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final g41 f35459c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final j41 f35460d;

    public /* synthetic */ z41(C2286v2 c2286v2, vu1 vu1Var, t41 t41Var) {
        this(c2286v2, vu1Var, t41Var, new g41(vu1Var), new j41(vu1Var));
    }

    public final void a(@NotNull Context context, @NotNull h41 nativeAdBlock, @NotNull zi0 imageProvider, @NotNull h51 nativeAdFactoriesProvider, @NotNull v41 nativeAdCreationListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(nativeAdBlock, "nativeAdBlock");
        Intrinsics.checkNotNullParameter(imageProvider, "imageProvider");
        Intrinsics.checkNotNullParameter(nativeAdFactoriesProvider, "nativeAdFactoriesProvider");
        Intrinsics.checkNotNullParameter(nativeAdCreationListener, "nativeAdCreationListener");
        i41 a4 = this.f35460d.a(this.f35457a.o());
        if (a4 != null) {
            a4.a(context, nativeAdBlock, imageProvider, this.f35459c, nativeAdFactoriesProvider, this.f35458b, nativeAdCreationListener);
        } else {
            nativeAdCreationListener.a(C1942g7.x());
        }
    }

    public z41(@NotNull C2286v2 adConfiguration, @NotNull vu1 sdkEnvironmentModule, @NotNull t41 nativeAdControllers, @NotNull g41 nativeAdBinderFactory, @NotNull j41 nativeAdBlockCreatorProvider) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(nativeAdControllers, "nativeAdControllers");
        Intrinsics.checkNotNullParameter(nativeAdBinderFactory, "nativeAdBinderFactory");
        Intrinsics.checkNotNullParameter(nativeAdBlockCreatorProvider, "nativeAdBlockCreatorProvider");
        this.f35457a = adConfiguration;
        this.f35458b = nativeAdControllers;
        this.f35459c = nativeAdBinderFactory;
        this.f35460d = nativeAdBlockCreatorProvider;
    }
}
