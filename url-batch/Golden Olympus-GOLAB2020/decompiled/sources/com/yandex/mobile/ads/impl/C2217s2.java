package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.s2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2217s2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC1912f1 f31537a;

    public C2217s2(@NotNull C2193r1 adActivityListener) {
        Intrinsics.checkNotNullParameter(adActivityListener, "adActivityListener");
        this.f31537a = adActivityListener;
    }

    @NotNull
    public final InterfaceC2262u1 a(@NotNull C2360y7<?> adResponse, @NotNull ds1 closeVerificationController) {
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(closeVerificationController, "closeVerificationController");
        if (adResponse.n() != gs.f26282f) {
            return new bp0();
        }
        InterfaceC1912f1 interfaceC1912f1 = this.f31537a;
        return new lr1(interfaceC1912f1, closeVerificationController, new mr1(interfaceC1912f1));
    }
}
