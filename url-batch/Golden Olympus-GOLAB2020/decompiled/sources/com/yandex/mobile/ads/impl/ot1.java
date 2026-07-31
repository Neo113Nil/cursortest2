package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ot1 implements InterfaceC1915f4 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2360y7<?> f30197a;

    public ot1(@NotNull C2360y7<?> adResponse) {
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        this.f30197a = adResponse;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1915f4
    public final InterfaceC2216s1 a() {
        return new qt1();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1915f4
    public final InterfaceC1847c8 b() {
        return new pt1(this.f30197a);
    }
}
