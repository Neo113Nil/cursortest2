package io.appmetrica.analytics.impl;

import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.j5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2720j5 implements M9 {

    /* renamed from: a, reason: collision with root package name */
    public final F5 f39260a;

    public C2720j5(@NotNull Q9 q9, @NotNull C2645g7 c2645g7, @NotNull C2575dh c2575dh, @NotNull C2772l5 c2772l5) {
        C2695i5 c2695i5 = new C2695i5(c2645g7, c2575dh);
        this.f39260a = new F5(q9, c2695i5.a(), c2695i5.b(), c2772l5);
    }

    @Override // io.appmetrica.analytics.impl.M9
    public final L9 a() {
        return this.f39260a;
    }

    @NotNull
    public final F5 b() {
        return this.f39260a;
    }
}
