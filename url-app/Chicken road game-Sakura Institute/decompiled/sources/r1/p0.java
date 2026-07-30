package r1;

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class p0 extends o0 implements p1.e0 {

    /* renamed from: q, reason: collision with root package name */
    public final a1 f7870q;

    /* renamed from: s, reason: collision with root package name */
    public LinkedHashMap f7872s;

    /* renamed from: u, reason: collision with root package name */
    public p1.g0 f7874u;

    /* renamed from: r, reason: collision with root package name */
    public long f7871r = 0;

    /* renamed from: t, reason: collision with root package name */
    public final p1.d0 f7873t = new p1.d0(this);

    /* renamed from: v, reason: collision with root package name */
    public final LinkedHashMap f7875v = new LinkedHashMap();

    public p0(a1 a1Var) {
        this.f7870q = a1Var;
    }

    public static final void A0(p0 p0Var, p1.g0 g0Var) {
        d6.z zVar;
        LinkedHashMap linkedHashMap;
        if (g0Var != null) {
            p0Var.m0(j1.c.G(g0Var.n(), g0Var.f()));
            zVar = d6.z.f2639a;
        } else {
            zVar = null;
        }
        if (zVar == null) {
            p0Var.m0(0L);
        }
        if (!r6.k.a(p0Var.f7874u, g0Var) && g0Var != null && ((((linkedHashMap = p0Var.f7872s) != null && !linkedHashMap.isEmpty()) || !g0Var.o().isEmpty()) && !r6.k.a(g0Var.o(), p0Var.f7872s))) {
            i0 i0Var = p0Var.f7870q.f7700q.B.f7849s;
            r6.k.c(i0Var);
            i0Var.f7797v.f();
            LinkedHashMap linkedHashMap2 = p0Var.f7872s;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                p0Var.f7872s = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(g0Var.o());
        }
        p0Var.f7874u = g0Var;
    }

    public void B0() {
        v0().p();
    }

    public final void C0(long j8) {
        if (!m2.h.a(this.f7871r, j8)) {
            this.f7871r = j8;
            a1 a1Var = this.f7870q;
            i0 i0Var = a1Var.f7700q.B.f7849s;
            if (i0Var != null) {
                i0Var.r0();
            }
            o0.y0(a1Var);
        }
        if (this.f7865m) {
            return;
        }
        q0(new k1(v0(), this));
    }

    public final long D0(p0 p0Var, boolean z8) {
        long j8 = 0;
        p0 p0Var2 = this;
        while (!p0Var2.equals(p0Var)) {
            if (!p0Var2.f7863k || !z8) {
                j8 = m2.h.c(j8, p0Var2.f7871r);
            }
            a1 a1Var = p0Var2.f7870q.f7702s;
            r6.k.c(a1Var);
            p0Var2 = a1Var.K0();
            r6.k.c(p0Var2);
        }
        return j8;
    }

    @Override // m2.b
    public final float a() {
        return this.f7870q.a();
    }

    @Override // p1.n0, p1.e0
    public final Object g() {
        return this.f7870q.g();
    }

    @Override // p1.m
    public final m2.k getLayoutDirection() {
        return this.f7870q.f7700q.f7736w;
    }

    @Override // p1.n0
    public final void j0(long j8, float f9, q6.c cVar) {
        C0(j8);
        if (this.f7864l) {
            return;
        }
        B0();
    }

    @Override // m2.b
    public final float m() {
        return this.f7870q.m();
    }

    @Override // r1.o0
    public final o0 r0() {
        a1 a1Var = this.f7870q.f7701r;
        if (a1Var != null) {
            return a1Var.K0();
        }
        return null;
    }

    @Override // r1.o0
    public final p1.p s0() {
        return this.f7873t;
    }

    @Override // r1.o0
    public final boolean t0() {
        return this.f7874u != null;
    }

    @Override // r1.o0
    public final d0 u0() {
        return this.f7870q.f7700q;
    }

    @Override // r1.o0, p1.m
    public final boolean v() {
        return true;
    }

    @Override // r1.o0
    public final p1.g0 v0() {
        p1.g0 g0Var = this.f7874u;
        if (g0Var != null) {
            return g0Var;
        }
        throw new IllegalStateException("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    @Override // r1.o0
    public final o0 w0() {
        a1 a1Var = this.f7870q.f7702s;
        if (a1Var != null) {
            return a1Var.K0();
        }
        return null;
    }

    @Override // r1.o0
    public final long x0() {
        return this.f7871r;
    }

    @Override // r1.o0
    public final void z0() {
        j0(this.f7871r, 0.0f, null);
    }
}
