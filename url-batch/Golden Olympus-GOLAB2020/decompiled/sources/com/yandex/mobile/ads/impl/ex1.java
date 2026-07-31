package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
final class ex1 implements dx1 {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final xr0 f25489b;

    public ex1(@NotNull xr0 localStorage) {
        Intrinsics.checkNotNullParameter(localStorage, "localStorage");
        this.f25489b = localStorage;
    }

    @Override // com.yandex.mobile.ads.impl.dx1
    @Nullable
    public final String a() {
        return this.f25489b.d("ServerSideClientIP");
    }

    @Override // com.yandex.mobile.ads.impl.dx1
    public final void a(@Nullable String str) {
        this.f25489b.a("ServerSideClientIP", str);
    }
}
