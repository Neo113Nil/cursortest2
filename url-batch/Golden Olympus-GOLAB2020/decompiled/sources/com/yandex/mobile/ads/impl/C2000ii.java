package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.ii, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2000ii {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final vu1 f27206a;

    public C2000ii(@NotNull vu1 sdkEnvironmentModule) {
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        this.f27206a = sdkEnvironmentModule;
    }

    @NotNull
    public final InterfaceC2096mi a(@NotNull C2360y7<String> adResponse) {
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        sy0 D4 = adResponse.D();
        return D4 != null ? new tx0(adResponse, D4) : vr.f33728c == adResponse.v() ? new xv1(this.f27206a) : new ut1(this.f27206a);
    }
}
