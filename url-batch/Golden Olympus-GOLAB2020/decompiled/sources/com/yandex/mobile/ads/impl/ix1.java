package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ix1 implements hx1 {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final xr0 f27415b;

    public ix1(@NotNull xr0 localStorage) {
        Intrinsics.checkNotNullParameter(localStorage, "localStorage");
        this.f27415b = localStorage;
    }

    @Override // com.yandex.mobile.ads.impl.hx1
    @Nullable
    public final String a() {
        return this.f27415b.d("SessionData");
    }

    @Override // com.yandex.mobile.ads.impl.hx1
    public final void a(@Nullable String str) {
        this.f27415b.a("SessionData", str);
    }
}
