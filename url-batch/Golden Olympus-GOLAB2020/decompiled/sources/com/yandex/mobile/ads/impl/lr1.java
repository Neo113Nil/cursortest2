package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class lr1 implements InterfaceC2262u1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ds1 f28726a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final mr1 f28727b;

    public lr1(@NotNull InterfaceC1912f1 adActivityListener, @NotNull ds1 closeVerificationController, @NotNull mr1 rewardController) {
        Intrinsics.checkNotNullParameter(adActivityListener, "adActivityListener");
        Intrinsics.checkNotNullParameter(closeVerificationController, "closeVerificationController");
        Intrinsics.checkNotNullParameter(rewardController, "rewardController");
        this.f28726a = closeVerificationController;
        this.f28727b = rewardController;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2262u1
    public final void b() {
        this.f28726a.a();
        this.f28727b.a();
    }
}
