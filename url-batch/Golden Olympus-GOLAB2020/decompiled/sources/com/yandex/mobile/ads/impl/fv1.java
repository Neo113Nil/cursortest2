package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class fv1 implements sc0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final vu1 f25927a;

    public fv1(@NotNull vu1 sdkEnvironmentModule) {
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        this.f25927a = sdkEnvironmentModule;
    }

    @Override // com.yandex.mobile.ads.impl.sc0
    @NotNull
    public final rc0<cp0> a(@NotNull yc0<cp0> loadController) {
        Intrinsics.checkNotNullParameter(loadController, "loadController");
        return new zu1(loadController, this.f25927a);
    }

    @Override // com.yandex.mobile.ads.impl.sc0
    @NotNull
    public final rc0<ur1> b(@NotNull yc0<ur1> loadController) {
        Intrinsics.checkNotNullParameter(loadController, "loadController");
        return new zu1(loadController, this.f25927a);
    }

    @Override // com.yandex.mobile.ads.impl.sc0
    @NotNull
    public final rc0<C1926ff> c(@NotNull yc0<C1926ff> loadController) {
        Intrinsics.checkNotNullParameter(loadController, "loadController");
        return new zu1(loadController, this.f25927a);
    }
}
