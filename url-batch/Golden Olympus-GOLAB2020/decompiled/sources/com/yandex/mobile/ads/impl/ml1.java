package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.Player;
import com.yandex.mobile.ads.impl.uh1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ml1 implements vl1, pi1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final vl1 f29142a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private uh1 f29143b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private db0 f29144c;

    public ml1(@NotNull vl1 progressProvider) {
        Intrinsics.checkNotNullParameter(progressProvider, "progressProvider");
        this.f29142a = progressProvider;
        this.f29143b = uh1.a.a();
    }

    @Override // com.yandex.mobile.ads.impl.vl1
    @NotNull
    public final uh1 a() {
        vl1 vl1Var = this.f29144c;
        if (vl1Var == null) {
            vl1Var = this.f29142a;
        }
        uh1 a4 = vl1Var.a();
        this.f29143b = a4;
        return a4;
    }

    @Override // com.yandex.mobile.ads.impl.pi1
    public final void a(@Nullable Player player) {
        this.f29144c = player == null ? new db0(this.f29143b) : null;
    }
}
