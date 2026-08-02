package q0;

import T.C0097o;
import a0.p0;

/* renamed from: q0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1362d implements InterfaceC1383z, InterfaceC1382y {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1383z f14984a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC1382y f14985b;

    /* renamed from: c, reason: collision with root package name */
    public C1361c[] f14986c = new C1361c[0];

    /* renamed from: d, reason: collision with root package name */
    public long f14987d;

    /* renamed from: e, reason: collision with root package name */
    public long f14988e;

    /* renamed from: f, reason: collision with root package name */
    public long f14989f;

    /* renamed from: g, reason: collision with root package name */
    public long f14990g;

    /* renamed from: h, reason: collision with root package name */
    public C1365g f14991h;

    public C1362d(InterfaceC1383z interfaceC1383z, boolean z, long j4, long j5) {
        this.f14984a = interfaceC1383z;
        this.f14987d = z ? j4 : -9223372036854775807L;
        this.f14988e = -9223372036854775807L;
        this.f14989f = j4;
        this.f14990g = j5;
    }

    public final boolean a() {
        return this.f14987d != -9223372036854775807L;
    }

    @Override // q0.InterfaceC1383z
    public final long b(long j4, p0 p0Var) {
        long j5 = this.f14989f;
        if (j4 == j5) {
            return j5;
        }
        long k4 = W.J.k(p0Var.f4230a, 0L, j4 - j5);
        long j6 = p0Var.f4231b;
        long j7 = this.f14990g;
        long k5 = W.J.k(j6, 0L, j7 == Long.MIN_VALUE ? Long.MAX_VALUE : j7 - j4);
        if (k4 != p0Var.f4230a || k5 != p0Var.f4231b) {
            p0Var = new p0(k4, k5);
        }
        return this.f14984a.b(j4, p0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0079  */
    @Override // q0.InterfaceC1383z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long d(t0.t[] tVarArr, boolean[] zArr, b0[] b0VarArr, boolean[] zArr2, long j4) {
        long j5;
        int i4;
        this.f14986c = new C1361c[b0VarArr.length];
        b0[] b0VarArr2 = new b0[b0VarArr.length];
        for (int i5 = 0; i5 < b0VarArr.length; i5++) {
            C1361c[] c1361cArr = this.f14986c;
            C1361c c1361c = (C1361c) b0VarArr[i5];
            c1361cArr[i5] = c1361c;
            b0VarArr2[i5] = c1361c != null ? c1361c.f14981a : null;
        }
        long d4 = this.f14984a.d(tVarArr, zArr, b0VarArr2, zArr2, j4);
        long j6 = this.f14990g;
        long max = Math.max(d4, j4);
        if (j6 != Long.MIN_VALUE) {
            max = Math.min(max, j6);
        }
        if (a()) {
            if (d4 >= j4) {
                if (d4 != 0) {
                    for (t0.t tVar : tVarArr) {
                        if (tVar != null) {
                            C0097o l4 = tVar.l();
                            if (!T.F.a(l4.n, l4.f2866k)) {
                            }
                        }
                    }
                }
            }
            j5 = max;
            this.f14987d = j5;
            for (i4 = 0; i4 < b0VarArr.length; i4++) {
                b0 b0Var = b0VarArr2[i4];
                if (b0Var == null) {
                    this.f14986c[i4] = null;
                } else {
                    C1361c[] c1361cArr2 = this.f14986c;
                    C1361c c1361c2 = c1361cArr2[i4];
                    if (c1361c2 == null || c1361c2.f14981a != b0Var) {
                        c1361cArr2[i4] = new C1361c(this, b0Var);
                    }
                }
                b0VarArr[i4] = this.f14986c[i4];
            }
            return max;
        }
        j5 = -9223372036854775807L;
        this.f14987d = j5;
        while (i4 < b0VarArr.length) {
        }
        return max;
    }

    @Override // q0.d0
    public final long e() {
        long e4 = this.f14984a.e();
        if (e4 != Long.MIN_VALUE) {
            long j4 = this.f14990g;
            if (j4 == Long.MIN_VALUE || e4 < j4) {
                return e4;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // q0.InterfaceC1383z
    public final void f(InterfaceC1382y interfaceC1382y, long j4) {
        this.f14985b = interfaceC1382y;
        this.f14984a.f(this, j4);
    }

    @Override // q0.InterfaceC1383z
    public final void h() {
        C1365g c1365g = this.f14991h;
        if (c1365g != null) {
            throw c1365g;
        }
        this.f14984a.h();
    }

    @Override // q0.InterfaceC1383z
    public final long i(long j4) {
        this.f14987d = -9223372036854775807L;
        for (C1361c c1361c : this.f14986c) {
            if (c1361c != null) {
                c1361c.f14982b = false;
            }
        }
        long i4 = this.f14984a.i(j4);
        long j5 = this.f14989f;
        long j6 = this.f14990g;
        long max = Math.max(i4, j5);
        return j6 != Long.MIN_VALUE ? Math.min(max, j6) : max;
    }

    @Override // q0.InterfaceC1383z
    public final void j(long j4) {
        this.f14984a.j(j4);
    }

    @Override // q0.d0
    public final boolean l() {
        return this.f14984a.l();
    }

    @Override // q0.InterfaceC1382y
    public final void m(InterfaceC1383z interfaceC1383z) {
        if (this.f14991h != null) {
            return;
        }
        InterfaceC1382y interfaceC1382y = this.f14985b;
        interfaceC1382y.getClass();
        interfaceC1382y.m(this);
    }

    @Override // q0.InterfaceC1383z
    public final long q() {
        if (a()) {
            long j4 = this.f14987d;
            this.f14987d = -9223372036854775807L;
            this.f14988e = j4;
            long q4 = q();
            return q4 != -9223372036854775807L ? q4 : j4;
        }
        long q5 = this.f14984a.q();
        if (q5 != -9223372036854775807L) {
            long j5 = this.f14989f;
            long j6 = this.f14990g;
            long max = Math.max(q5, j5);
            if (j6 != Long.MIN_VALUE) {
                max = Math.min(max, j6);
            }
            if (max != this.f14988e) {
                this.f14988e = max;
                return max;
            }
        }
        return -9223372036854775807L;
    }

    @Override // q0.c0
    public final void s(d0 d0Var) {
        InterfaceC1382y interfaceC1382y = this.f14985b;
        interfaceC1382y.getClass();
        interfaceC1382y.s(this);
    }

    @Override // q0.InterfaceC1383z
    public final j0 t() {
        return this.f14984a.t();
    }

    @Override // q0.d0
    public final long u() {
        long u4 = this.f14984a.u();
        if (u4 != Long.MIN_VALUE) {
            long j4 = this.f14990g;
            if (j4 == Long.MIN_VALUE || u4 < j4) {
                return u4;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // q0.d0
    public final boolean v(a0.Q q4) {
        return this.f14984a.v(q4);
    }

    @Override // q0.d0
    public final void w(long j4) {
        this.f14984a.w(j4);
    }
}
