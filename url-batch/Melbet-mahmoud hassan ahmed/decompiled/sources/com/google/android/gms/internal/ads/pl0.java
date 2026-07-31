package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class pl0 {

    /* renamed from: a, reason: collision with root package name */
    private final v3.d f10268a;

    /* renamed from: b, reason: collision with root package name */
    private final a3.t1 f10269b;

    /* renamed from: c, reason: collision with root package name */
    private final pm0 f10270c;

    pl0(v3.d dVar, a3.t1 t1Var, pm0 pm0Var) {
        this.f10268a = dVar;
        this.f10269b = t1Var;
        this.f10270c = pm0Var;
    }

    public final void a() {
        if (((Boolean) sw.c().b(m10.f8241l0)).booleanValue()) {
            this.f10270c.y();
        }
    }

    public final void b(int i7, long j7) {
        if (((Boolean) sw.c().b(m10.f8233k0)).booleanValue()) {
            return;
        }
        if (j7 - this.f10269b.b() < 0) {
            a3.r1.k("Receiving npa decision in the past, ignoring.");
            return;
        }
        if (((Boolean) sw.c().b(m10.f8241l0)).booleanValue()) {
            this.f10269b.Q(i7);
        } else {
            this.f10269b.Q(-1);
        }
        this.f10269b.W(j7);
        a();
    }
}
