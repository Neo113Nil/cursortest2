package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class fx0 implements InterfaceC1915f4 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2360y7<?> f25941a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final yw0<?> f25942b;

    public fx0(@NotNull C2360y7<?> adResponse, @Nullable yw0<?> yw0Var) {
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        this.f25941a = adResponse;
        this.f25942b = yw0Var;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1915f4
    public final InterfaceC2216s1 a() {
        return new ox0(this.f25942b, new lx0());
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1915f4
    public final InterfaceC1847c8 b() {
        return new jx0(this.f25941a);
    }
}
