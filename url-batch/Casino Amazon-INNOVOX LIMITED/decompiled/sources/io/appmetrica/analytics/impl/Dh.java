package io.appmetrica.analytics.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class Dh implements InterfaceC0217h4 {

    /* renamed from: a, reason: collision with root package name */
    public final Z4 f812a;

    public Dh(Z4 z4) {
        this.f812a = z4;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0217h4
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Bg a(Context context, C0140e5 c0140e5, Q3 q3, C0445q4 c0445q4) {
        Cg cg;
        R4 r4 = new R4(q3.b, q3.f1013a);
        Dg dg = new Dg(this.f812a);
        synchronized (c0140e5) {
            cg = (Cg) c0140e5.a(r4, c0445q4, dg, c0140e5.f1231a);
        }
        return new Bg(context, cg);
    }
}
