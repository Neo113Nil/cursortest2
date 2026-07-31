package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class vv1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final vu1 f33806a;

    public vv1(@NotNull vu1 sdkEnvironmentModule) {
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        this.f33806a = sdkEnvironmentModule;
    }

    @NotNull
    public final h51 a(@NotNull C2360y7<?> adResponse) {
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        qw1 qw1Var = new qw1();
        nt1 nt1Var = new nt1();
        vu1 vu1Var = this.f33806a;
        return new h51(new ot1(adResponse), nt1Var, qw1Var, new nv1(vu1Var, adResponse, new vw0(vu1Var, adResponse), new sw0(adResponse), new uw0(), new tw0()), new hw1());
    }
}
