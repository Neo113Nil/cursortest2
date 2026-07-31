package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class m81 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final l81 f28946a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2015j9 f28947b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final f41 f28948c;

    public /* synthetic */ m81(vu1 vu1Var) {
        this(vu1Var, new l81(), new C2015j9(), new f41(vu1Var));
    }

    @NotNull
    public final ArrayList a(@NotNull Context context, @NotNull h41 h41Var, @NotNull zi0 zi0Var, @NotNull h51 h51Var, @NotNull vb0 vb0Var, @NotNull t41 t41Var) {
        Context context2 = context;
        zi0 imageProvider = zi0Var;
        Intrinsics.checkNotNullParameter(context2, "context");
        h41 nativeAdBlock = h41Var;
        Intrinsics.checkNotNullParameter(nativeAdBlock, "nativeAdBlock");
        Intrinsics.checkNotNullParameter(imageProvider, "imageProvider");
        h51 nativeAdFactoriesProvider = h51Var;
        Intrinsics.checkNotNullParameter(nativeAdFactoriesProvider, "nativeAdFactoriesProvider");
        vb0 forceController = vb0Var;
        Intrinsics.checkNotNullParameter(forceController, "forceController");
        t41 nativeAdControllers = t41Var;
        Intrinsics.checkNotNullParameter(nativeAdControllers, "nativeAdControllers");
        ArrayList arrayList = new ArrayList();
        List<u31> e4 = nativeAdBlock.c().e();
        sb1 d4 = nativeAdFactoriesProvider.d();
        for (u31 u31Var : e4) {
            rb1 a4 = d4.a(u31Var);
            b61 b61Var = new b61(context2, u31Var, imageProvider, a4);
            C2258tk a5 = this.f28948c.a(context2, nativeAdBlock, this.f28947b.a(u31Var), a4, nativeAdFactoriesProvider, forceController, u31Var, EnumC1848c9.f24100d);
            k81 a6 = this.f28946a.a(u31Var.g());
            if (a6 != null) {
                context2 = context;
                arrayList.add(a6.a(context2, u31Var, b61Var, imageProvider, a5, nativeAdControllers));
            } else {
                context2 = context;
            }
            nativeAdBlock = h41Var;
            imageProvider = zi0Var;
            nativeAdFactoriesProvider = h51Var;
            forceController = vb0Var;
            nativeAdControllers = t41Var;
        }
        return arrayList;
    }

    public m81(@NotNull vu1 sdkEnvironmentModule, @NotNull l81 nativeGenericAdCreatorProvider, @NotNull C2015j9 adUnitAdNativeVisualBlockCreator, @NotNull f41 nativeAdBinderConfigurationCreator) {
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(nativeGenericAdCreatorProvider, "nativeGenericAdCreatorProvider");
        Intrinsics.checkNotNullParameter(adUnitAdNativeVisualBlockCreator, "adUnitAdNativeVisualBlockCreator");
        Intrinsics.checkNotNullParameter(nativeAdBinderConfigurationCreator, "nativeAdBinderConfigurationCreator");
        this.f28946a = nativeGenericAdCreatorProvider;
        this.f28947b = adUnitAdNativeVisualBlockCreator;
        this.f28948c = nativeAdBinderConfigurationCreator;
    }
}
