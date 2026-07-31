package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class p61 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final vu1 f30353a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2286v2 f30354b;

    public p61(@NotNull vu1 sdkEnvironmentModule, @NotNull C2286v2 adConfiguration) {
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        this.f30353a = sdkEnvironmentModule;
        this.f30354b = adConfiguration;
    }

    @NotNull
    public final a81 a(@NotNull C2360y7<n61> adResponse) {
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        sy0 D4 = adResponse.D();
        return D4 != null ? new gy0(adResponse, D4) : new zv1(this.f30353a, this.f30354b);
    }
}
