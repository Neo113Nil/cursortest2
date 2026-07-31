package io.appmetrica.analytics.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.impl.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0160f implements InterfaceC0191g4 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1244a;
    public final Cg b;

    public AbstractC0160f(Context context, Cg cg) {
        this.f1244a = context.getApplicationContext();
        this.b = cg;
        cg.a(this);
        C0401oa.k().n().b(this);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0191g4
    public final void a(Q5 q5, C0445q4 c0445q4) {
        b(q5, c0445q4);
    }

    public final Cg b() {
        return this.b;
    }

    public abstract void b(Q5 q5, C0445q4 c0445q4);

    public final Context c() {
        return this.f1244a;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0191g4
    public final void a() {
        this.b.b(this);
        C0401oa.I.m().a(this);
    }
}
