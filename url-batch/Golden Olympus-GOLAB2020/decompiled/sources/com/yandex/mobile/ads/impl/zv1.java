package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class zv1 implements a81 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final vu1 f35797a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2286v2 f35798b;

    public zv1(@NotNull vu1 sdkEnvironmentModule, @NotNull C2286v2 adConfiguration) {
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        this.f35797a = sdkEnvironmentModule;
        this.f35798b = adConfiguration;
    }

    @Override // com.yandex.mobile.ads.impl.a81
    @NotNull
    public final z71 a(@NotNull v51 nativeAdLoadManager) {
        Intrinsics.checkNotNullParameter(nativeAdLoadManager, "nativeAdLoadManager");
        vu1 vu1Var = this.f35797a;
        return new yv1(vu1Var, nativeAdLoadManager, this.f35798b, new vv1(vu1Var));
    }
}
