package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class tl0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final w72 f32476a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ql0 f32477b;

    public tl0(@NotNull w72 unifiedInstreamAdBinder) {
        Intrinsics.checkNotNullParameter(unifiedInstreamAdBinder, "unifiedInstreamAdBinder");
        this.f32476a = unifiedInstreamAdBinder;
        this.f32477b = ql0.f30828c.a();
    }

    public final void a(@NotNull vs player) {
        Intrinsics.checkNotNullParameter(player, "player");
        w72 a4 = this.f32477b.a(player);
        if (Intrinsics.areEqual(this.f32476a, a4)) {
            return;
        }
        if (a4 != null) {
            a4.invalidateAdPlayer();
        }
        this.f32477b.a(player, this.f32476a);
    }

    public final void b(@NotNull vs player) {
        Intrinsics.checkNotNullParameter(player, "player");
        this.f32477b.b(player);
    }
}
