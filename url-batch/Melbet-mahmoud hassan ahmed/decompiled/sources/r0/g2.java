package r0;

import t1.x;

/* loaded from: classes.dex */
final class g2 {

    /* renamed from: a, reason: collision with root package name */
    public final t1.u f20649a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f20650b;

    /* renamed from: c, reason: collision with root package name */
    public final t1.q0[] f20651c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f20652d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f20653e;

    /* renamed from: f, reason: collision with root package name */
    public h2 f20654f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f20655g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean[] f20656h;

    /* renamed from: i, reason: collision with root package name */
    private final g3[] f20657i;

    /* renamed from: j, reason: collision with root package name */
    private final m2.c0 f20658j;

    /* renamed from: k, reason: collision with root package name */
    private final m2 f20659k;

    /* renamed from: l, reason: collision with root package name */
    private g2 f20660l;

    /* renamed from: m, reason: collision with root package name */
    private t1.z0 f20661m;

    /* renamed from: n, reason: collision with root package name */
    private m2.d0 f20662n;

    /* renamed from: o, reason: collision with root package name */
    private long f20663o;

    public g2(g3[] g3VarArr, long j7, m2.c0 c0Var, n2.b bVar, m2 m2Var, h2 h2Var, m2.d0 d0Var) {
        this.f20657i = g3VarArr;
        this.f20663o = j7;
        this.f20658j = c0Var;
        this.f20659k = m2Var;
        x.b bVar2 = h2Var.f20667a;
        this.f20650b = bVar2.f22249a;
        this.f20654f = h2Var;
        this.f20661m = t1.z0.f22273i;
        this.f20662n = d0Var;
        this.f20651c = new t1.q0[g3VarArr.length];
        this.f20656h = new boolean[g3VarArr.length];
        this.f20649a = e(bVar2, m2Var, bVar, h2Var.f20668b, h2Var.f20670d);
    }

    private void c(t1.q0[] q0VarArr) {
        int i7 = 0;
        while (true) {
            g3[] g3VarArr = this.f20657i;
            if (i7 >= g3VarArr.length) {
                return;
            }
            if (g3VarArr[i7].j() == -2 && this.f20662n.c(i7)) {
                q0VarArr[i7] = new t1.n();
            }
            i7++;
        }
    }

    private static t1.u e(x.b bVar, m2 m2Var, n2.b bVar2, long j7, long j8) {
        t1.u h7 = m2Var.h(bVar, bVar2, j7);
        return j8 != -9223372036854775807L ? new t1.d(h7, true, 0L, j8) : h7;
    }

    private void f() {
        if (!r()) {
            return;
        }
        int i7 = 0;
        while (true) {
            m2.d0 d0Var = this.f20662n;
            if (i7 >= d0Var.f18988a) {
                return;
            }
            boolean c7 = d0Var.c(i7);
            m2.t tVar = this.f20662n.f18990c[i7];
            if (c7 && tVar != null) {
                tVar.g();
            }
            i7++;
        }
    }

    private void g(t1.q0[] q0VarArr) {
        int i7 = 0;
        while (true) {
            g3[] g3VarArr = this.f20657i;
            if (i7 >= g3VarArr.length) {
                return;
            }
            if (g3VarArr[i7].j() == -2) {
                q0VarArr[i7] = null;
            }
            i7++;
        }
    }

    private void h() {
        if (!r()) {
            return;
        }
        int i7 = 0;
        while (true) {
            m2.d0 d0Var = this.f20662n;
            if (i7 >= d0Var.f18988a) {
                return;
            }
            boolean c7 = d0Var.c(i7);
            m2.t tVar = this.f20662n.f18990c[i7];
            if (c7 && tVar != null) {
                tVar.k();
            }
            i7++;
        }
    }

    private boolean r() {
        return this.f20660l == null;
    }

    private static void u(m2 m2Var, t1.u uVar) {
        try {
            if (uVar instanceof t1.d) {
                uVar = ((t1.d) uVar).f21973f;
            }
            m2Var.z(uVar);
        } catch (RuntimeException e7) {
            o2.r.d("MediaPeriodHolder", "Period release failed.", e7);
        }
    }

    public void A() {
        t1.u uVar = this.f20649a;
        if (uVar instanceof t1.d) {
            long j7 = this.f20654f.f20670d;
            if (j7 == -9223372036854775807L) {
                j7 = Long.MIN_VALUE;
            }
            ((t1.d) uVar).w(0L, j7);
        }
    }

    public long a(m2.d0 d0Var, long j7, boolean z6) {
        return b(d0Var, j7, z6, new boolean[this.f20657i.length]);
    }

    public long b(m2.d0 d0Var, long j7, boolean z6, boolean[] zArr) {
        int i7 = 0;
        while (true) {
            boolean z7 = true;
            if (i7 >= d0Var.f18988a) {
                break;
            }
            boolean[] zArr2 = this.f20656h;
            if (z6 || !d0Var.b(this.f20662n, i7)) {
                z7 = false;
            }
            zArr2[i7] = z7;
            i7++;
        }
        g(this.f20651c);
        f();
        this.f20662n = d0Var;
        h();
        long r7 = this.f20649a.r(d0Var.f18990c, this.f20656h, this.f20651c, zArr, j7);
        c(this.f20651c);
        this.f20653e = false;
        int i8 = 0;
        while (true) {
            t1.q0[] q0VarArr = this.f20651c;
            if (i8 >= q0VarArr.length) {
                return r7;
            }
            if (q0VarArr[i8] != null) {
                o2.a.f(d0Var.c(i8));
                if (this.f20657i[i8].j() != -2) {
                    this.f20653e = true;
                }
            } else {
                o2.a.f(d0Var.f18990c[i8] == null);
            }
            i8++;
        }
    }

    public void d(long j7) {
        o2.a.f(r());
        this.f20649a.g(y(j7));
    }

    public long i() {
        if (!this.f20652d) {
            return this.f20654f.f20668b;
        }
        long e7 = this.f20653e ? this.f20649a.e() : Long.MIN_VALUE;
        return e7 == Long.MIN_VALUE ? this.f20654f.f20671e : e7;
    }

    public g2 j() {
        return this.f20660l;
    }

    public long k() {
        if (this.f20652d) {
            return this.f20649a.c();
        }
        return 0L;
    }

    public long l() {
        return this.f20663o;
    }

    public long m() {
        return this.f20654f.f20668b + this.f20663o;
    }

    public t1.z0 n() {
        return this.f20661m;
    }

    public m2.d0 o() {
        return this.f20662n;
    }

    public void p(float f7, r3 r3Var) {
        this.f20652d = true;
        this.f20661m = this.f20649a.p();
        m2.d0 v6 = v(f7, r3Var);
        h2 h2Var = this.f20654f;
        long j7 = h2Var.f20668b;
        long j8 = h2Var.f20671e;
        if (j8 != -9223372036854775807L && j7 >= j8) {
            j7 = Math.max(0L, j8 - 1);
        }
        long a7 = a(v6, j7, false);
        long j9 = this.f20663o;
        h2 h2Var2 = this.f20654f;
        this.f20663o = j9 + (h2Var2.f20668b - a7);
        this.f20654f = h2Var2.b(a7);
    }

    public boolean q() {
        return this.f20652d && (!this.f20653e || this.f20649a.e() == Long.MIN_VALUE);
    }

    public void s(long j7) {
        o2.a.f(r());
        if (this.f20652d) {
            this.f20649a.h(y(j7));
        }
    }

    public void t() {
        f();
        u(this.f20659k, this.f20649a);
    }

    public m2.d0 v(float f7, r3 r3Var) {
        m2.d0 g7 = this.f20658j.g(this.f20657i, n(), this.f20654f.f20667a, r3Var);
        for (m2.t tVar : g7.f18990c) {
            if (tVar != null) {
                tVar.s(f7);
            }
        }
        return g7;
    }

    public void w(g2 g2Var) {
        if (g2Var == this.f20660l) {
            return;
        }
        f();
        this.f20660l = g2Var;
        h();
    }

    public void x(long j7) {
        this.f20663o = j7;
    }

    public long y(long j7) {
        return j7 - l();
    }

    public long z(long j7) {
        return j7 + l();
    }
}
