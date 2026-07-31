package io.appmetrica.analytics.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class Cg implements Rl, Ha {

    /* renamed from: a, reason: collision with root package name */
    public final Context f799a;
    public final R4 b;
    public final S4 c;
    public final Bm d;
    public final Qa e;

    public Cg(Context context, R4 r4, C0445q4 c0445q4, Z4 z4, S4 s4, Il il) {
        this.f799a = context;
        this.b = r4;
        this.c = s4;
        Bm a2 = il.a(context, r4, c0445q4.f1446a);
        this.d = a2;
        this.e = z4.a(context, r4, c0445q4.b, a2);
        il.a(r4, this);
    }

    public final R4 a() {
        return this.b;
    }

    public final Context b() {
        return this.f799a;
    }

    public final void a(InterfaceC0191g4 interfaceC0191g4) {
        this.c.f1038a.add(interfaceC0191g4);
    }

    public final void b(InterfaceC0191g4 interfaceC0191g4) {
        this.c.f1038a.remove(interfaceC0191g4);
    }

    @Override // io.appmetrica.analytics.impl.Rl
    public final void a(C0209gm c0209gm) {
        ((Y4) this.e).a(c0209gm);
    }

    @Override // io.appmetrica.analytics.impl.Rl
    public final void a(Kl kl, C0209gm c0209gm) {
        ((Y4) this.e).getClass();
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final void a(C0445q4 c0445q4) {
        this.d.a(c0445q4.f1446a);
        this.e.a(c0445q4.b);
    }

    public final void a(Q5 q5, C0445q4 c0445q4) {
        if (!AbstractC0624x9.c.contains(EnumC0095cb.a(q5.d))) {
            this.e.a(c0445q4.b);
        }
        ((Y4) this.e).a(q5);
    }

    public Cg(Context context, R4 r4, C0445q4 c0445q4, Z4 z4) {
        this(context, r4, c0445q4, z4, new S4(), Il.a());
    }
}
