package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class j81 implements i41 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final i51 f27566a;

    public /* synthetic */ j81(vu1 vu1Var) {
        this(vu1Var, new i51(vu1Var));
    }

    @Override // com.yandex.mobile.ads.impl.i41
    public final void a(@NotNull Context context, @NotNull h41 nativeAdBlock, @NotNull zi0 imageProvider, @NotNull g41 nativeAdBinderFactory, @NotNull h51 nativeAdFactoriesProvider, @NotNull t41 nativeAdControllers, @NotNull v41 nativeAdCreationListener) {
        f61 f61Var;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(nativeAdBlock, "nativeAdBlock");
        Intrinsics.checkNotNullParameter(imageProvider, "imageProvider");
        Intrinsics.checkNotNullParameter(nativeAdBinderFactory, "nativeAdBinderFactory");
        Intrinsics.checkNotNullParameter(nativeAdFactoriesProvider, "nativeAdFactoriesProvider");
        Intrinsics.checkNotNullParameter(nativeAdControllers, "nativeAdControllers");
        Intrinsics.checkNotNullParameter(nativeAdCreationListener, "nativeAdCreationListener");
        List<u31> e4 = nativeAdBlock.c().e();
        if (e4 == null || e4.isEmpty()) {
            f61Var = null;
        } else if (e4.size() > 1) {
            f61Var = nativeAdBinderFactory.a(context, nativeAdBlock, imageProvider, nativeAdFactoriesProvider, nativeAdControllers);
        } else {
            f61Var = this.f27566a.a(context, nativeAdBlock, imageProvider, nativeAdBinderFactory, nativeAdFactoriesProvider, nativeAdControllers, e4.get(0));
        }
        if (f61Var != null) {
            nativeAdCreationListener.a(f61Var);
        } else {
            nativeAdCreationListener.a(C1942g7.x());
        }
    }

    public j81(@NotNull vu1 sdkEnvironmentModule, @NotNull i51 nativeAdFactory) {
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(nativeAdFactory, "nativeAdFactory");
        this.f27566a = nativeAdFactory;
    }
}
