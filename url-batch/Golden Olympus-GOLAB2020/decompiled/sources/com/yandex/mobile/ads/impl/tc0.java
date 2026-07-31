package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class tc0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final vu1 f32291a;

    public tc0(@NotNull vu1 sdkEnvironmentModule) {
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        this.f32291a = sdkEnvironmentModule;
    }

    @NotNull
    public final sc0 a(@NotNull C2360y7<String> adResponse) {
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        sy0 D4 = adResponse.D();
        return D4 != null ? new wx0(adResponse, D4) : vr.f33728c == adResponse.v() ? new aw1(this.f32291a) : new fv1(this.f32291a);
    }
}
