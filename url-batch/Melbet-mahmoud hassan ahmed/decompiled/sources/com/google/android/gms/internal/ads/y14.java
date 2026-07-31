package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class y14 {

    /* renamed from: a, reason: collision with root package name */
    private final w04[] f14491a;

    /* renamed from: b, reason: collision with root package name */
    private final n24 f14492b;

    /* renamed from: c, reason: collision with root package name */
    private final p24 f14493c;

    public y14(w04... w04VarArr) {
        n24 n24Var = new n24();
        p24 p24Var = new p24();
        w04[] w04VarArr2 = {n24Var, p24Var};
        this.f14491a = w04VarArr2;
        System.arraycopy(w04VarArr, 0, w04VarArr2, 0, 0);
        this.f14492b = n24Var;
        this.f14493c = p24Var;
    }

    public final long a(long j7) {
        return this.f14493c.i(j7);
    }

    public final long b() {
        return this.f14492b.o();
    }

    public final e30 c(e30 e30Var) {
        this.f14493c.k(e30Var.f4479a);
        this.f14493c.j(e30Var.f4480b);
        return e30Var;
    }

    public final boolean d(boolean z6) {
        this.f14492b.p(z6);
        return z6;
    }

    public final w04[] e() {
        return this.f14491a;
    }
}
