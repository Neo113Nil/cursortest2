package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class xn0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final rs f34636a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final wn0 f34637b;

    public xn0(@NotNull rs instreamAdBinder) {
        Intrinsics.checkNotNullParameter(instreamAdBinder, "instreamAdBinder");
        this.f34636a = instreamAdBinder;
        this.f34637b = wn0.f34143c.a();
    }

    public final void a(@NotNull yt player) {
        Intrinsics.checkNotNullParameter(player, "player");
        rs a4 = this.f34637b.a(player);
        if (Intrinsics.areEqual(this.f34636a, a4)) {
            return;
        }
        if (a4 != null) {
            a4.a();
        }
        this.f34637b.a(player, this.f34636a);
    }

    public final void b(@NotNull yt player) {
        Intrinsics.checkNotNullParameter(player, "player");
        this.f34637b.b(player);
    }
}
