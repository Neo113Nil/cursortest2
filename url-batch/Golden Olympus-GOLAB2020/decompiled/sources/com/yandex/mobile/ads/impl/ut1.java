package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ut1 implements InterfaceC2096mi {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final vu1 f33245a;

    public ut1(@NotNull vu1 sdkEnvironmentModule) {
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        this.f33245a = sdkEnvironmentModule;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2096mi
    @NotNull
    public final InterfaceC2072li a(@NotNull C1977hi loadController) {
        Intrinsics.checkNotNullParameter(loadController, "loadController");
        vu1 vu1Var = this.f33245a;
        C2286v2 e4 = loadController.e();
        C2024ji c2024ji = new C2024ji();
        wt1 wt1Var = new wt1(vu1Var, e4, loadController);
        return new tt1(loadController, vu1Var, e4, c2024ji, wt1Var, new dv1(e4, c2024ji, wt1Var), new rt1(e4));
    }
}
