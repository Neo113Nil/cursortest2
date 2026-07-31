package io.appmetrica.analytics.impl;

import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.yc, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3116yc implements M9 {

    /* renamed from: a, reason: collision with root package name */
    public final F5 f40275a;

    public C3116yc(@NotNull Q9 q9, @NotNull C2645g7 c2645g7, @NotNull C2575dh c2575dh, @NotNull J4 j4, @NotNull C2772l5 c2772l5, @NotNull C2756kf c2756kf) {
        C3090xc c3090xc = new C3090xc(c2645g7, c2575dh, this, j4, c2756kf);
        this.f40275a = new F5(q9, c3090xc.a(), c3090xc.b(), c2772l5);
    }

    @Override // io.appmetrica.analytics.impl.M9
    public final L9 a() {
        return this.f40275a;
    }

    @NotNull
    public final F5 b() {
        return this.f40275a;
    }
}
