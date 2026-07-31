package w1;

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class o0 extends n0 implements u1.d0 {

    /* renamed from: r, reason: collision with root package name */
    public final d1 f7737r;

    /* renamed from: t, reason: collision with root package name */
    public LinkedHashMap f7739t;

    /* renamed from: v, reason: collision with root package name */
    public u1.f0 f7741v;

    /* renamed from: w, reason: collision with root package name */
    public final o.d0 f7742w;

    /* renamed from: s, reason: collision with root package name */
    public long f7738s = 0;

    /* renamed from: u, reason: collision with root package name */
    public final u1.c0 f7740u = new u1.c0(this);

    public o0(d1 d1Var) {
        this.f7737r = d1Var;
        o.d0 d0Var = o.o0.f5516a;
        this.f7742w = new o.d0();
    }

    public static final void t0(o0 o0Var, u1.f0 f0Var) {
        LinkedHashMap linkedHashMap;
        if (f0Var != null) {
            o0Var.W((f0Var.c() & 4294967295L) | (f0Var.e() << 32));
        } else {
            o0Var.W(0L);
        }
        if (!q6.i.a(o0Var.f7741v, f0Var) && f0Var != null && ((((linkedHashMap = o0Var.f7739t) != null && !linkedHashMap.isEmpty()) || !f0Var.a().isEmpty()) && !q6.i.a(f0Var.a(), o0Var.f7739t))) {
            s0 s0Var = o0Var.f7737r.f7614r.G.f7701q;
            q6.i.b(s0Var);
            s0Var.f7772t.f();
            LinkedHashMap linkedHashMap2 = o0Var.f7739t;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                o0Var.f7739t = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(f0Var.a());
        }
        o0Var.f7741v = f0Var;
    }

    @Override // u1.l0
    public final void U(long j7, float f6, p6.c cVar) {
        v0(j7);
        if (this.f7729m) {
            return;
        }
        u0();
    }

    @Override // r2.c
    public final float b() {
        return this.f7737r.b();
    }

    @Override // u1.l0, u1.d0
    public final Object g() {
        return this.f7737r.g();
    }

    @Override // u1.g0
    public final r2.l getLayoutDirection() {
        return this.f7737r.f7614r.f7660z;
    }

    @Override // r2.c
    public final float i() {
        return this.f7737r.i();
    }

    @Override // w1.n0
    public final n0 i0() {
        d1 d1Var = this.f7737r.f7615s;
        if (d1Var != null) {
            return d1Var.C0();
        }
        return null;
    }

    @Override // w1.n0
    public final u1.p j0() {
        return this.f7740u;
    }

    @Override // w1.n0
    public final boolean k0() {
        return this.f7741v != null;
    }

    @Override // w1.n0
    public final f0 l0() {
        return this.f7737r.f7614r;
    }

    @Override // w1.n0
    public final u1.f0 m0() {
        u1.f0 f0Var = this.f7741v;
        if (f0Var != null) {
            return f0Var;
        }
        throw a0.q.f("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    @Override // w1.n0
    public final n0 n0() {
        d1 d1Var = this.f7737r.f7616t;
        if (d1Var != null) {
            return d1Var.C0();
        }
        return null;
    }

    @Override // w1.n0
    public final long o0() {
        return this.f7738s;
    }

    @Override // w1.n0, u1.g0
    public final boolean p() {
        return true;
    }

    @Override // w1.n0
    public final void s0() {
        U(this.f7738s, 0.0f, null);
    }

    public void u0() {
        m0().b();
    }

    public final void v0(long j7) {
        if (!r2.i.a(this.f7738s, j7)) {
            this.f7738s = j7;
            d1 d1Var = this.f7737r;
            s0 s0Var = d1Var.f7614r.G.f7701q;
            if (s0Var != null) {
                s0Var.f0();
            }
            n0.q0(d1Var);
        }
        if (this.f7730n) {
            return;
        }
        g0(m0());
    }

    public final long w0(o0 o0Var, boolean z3) {
        long j7 = 0;
        o0 o0Var2 = this;
        while (!o0Var2.equals(o0Var)) {
            if (!o0Var2.f7728l || !z3) {
                j7 = r2.i.c(j7, o0Var2.f7738s);
            }
            d1 d1Var = o0Var2.f7737r.f7616t;
            q6.i.b(d1Var);
            o0Var2 = d1Var.C0();
            q6.i.b(o0Var2);
        }
        return j7;
    }
}
