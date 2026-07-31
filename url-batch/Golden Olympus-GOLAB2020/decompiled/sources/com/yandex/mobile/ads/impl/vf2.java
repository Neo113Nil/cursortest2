package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class vf2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private uf2 f33596a = uf2.f33081b;

    @NotNull
    public final synchronized uf2 a() {
        return this.f33596a;
    }

    public final synchronized void a(@NotNull uf2 uf2Var) {
        Intrinsics.checkNotNullParameter(uf2Var, "<set-?>");
        this.f33596a = uf2Var;
    }
}
