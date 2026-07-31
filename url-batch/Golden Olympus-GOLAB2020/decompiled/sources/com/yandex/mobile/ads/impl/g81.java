package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class g81 implements l51 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final xb0 f26069a;

    public g81(@NotNull ga1 forcePausablePlayer) {
        Intrinsics.checkNotNullParameter(forcePausablePlayer, "forcePausablePlayer");
        this.f26069a = forcePausablePlayer;
    }

    @Override // com.yandex.mobile.ads.impl.l51
    public final void a() {
        this.f26069a.d();
    }

    @Override // com.yandex.mobile.ads.impl.l51
    public final void b() {
        this.f26069a.f();
    }
}
