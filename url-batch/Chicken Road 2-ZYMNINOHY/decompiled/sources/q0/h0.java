package q0;

import a0.p0;

/* loaded from: classes.dex */
public final class h0 implements InterfaceC1383z, InterfaceC1382y {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1383z f15023a;

    /* renamed from: b, reason: collision with root package name */
    public final long f15024b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC1382y f15025c;

    public h0(InterfaceC1383z interfaceC1383z, long j4) {
        this.f15023a = interfaceC1383z;
        this.f15024b = j4;
    }

    @Override // q0.InterfaceC1383z
    public final long b(long j4, p0 p0Var) {
        long j5 = this.f15024b;
        return this.f15023a.b(j4 - j5, p0Var) + j5;
    }

    @Override // q0.InterfaceC1383z
    public final long d(t0.t[] tVarArr, boolean[] zArr, b0[] b0VarArr, boolean[] zArr2, long j4) {
        b0[] b0VarArr2 = new b0[b0VarArr.length];
        int i4 = 0;
        while (true) {
            b0 b0Var = null;
            if (i4 >= b0VarArr.length) {
                break;
            }
            g0 g0Var = (g0) b0VarArr[i4];
            if (g0Var != null) {
                b0Var = g0Var.f15015a;
            }
            b0VarArr2[i4] = b0Var;
            i4++;
        }
        InterfaceC1383z interfaceC1383z = this.f15023a;
        long j5 = this.f15024b;
        long d4 = interfaceC1383z.d(tVarArr, zArr, b0VarArr2, zArr2, j4 - j5);
        for (int i5 = 0; i5 < b0VarArr.length; i5++) {
            b0 b0Var2 = b0VarArr2[i5];
            if (b0Var2 == null) {
                b0VarArr[i5] = null;
            } else {
                b0 b0Var3 = b0VarArr[i5];
                if (b0Var3 == null || ((g0) b0Var3).f15015a != b0Var2) {
                    b0VarArr[i5] = new g0(b0Var2, j5);
                }
            }
        }
        return d4 + j5;
    }

    @Override // q0.d0
    public final long e() {
        long e4 = this.f15023a.e();
        if (e4 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return e4 + this.f15024b;
    }

    @Override // q0.InterfaceC1383z
    public final void f(InterfaceC1382y interfaceC1382y, long j4) {
        this.f15025c = interfaceC1382y;
        this.f15023a.f(this, j4 - this.f15024b);
    }

    @Override // q0.InterfaceC1383z
    public final void h() {
        this.f15023a.h();
    }

    @Override // q0.InterfaceC1383z
    public final long i(long j4) {
        long j5 = this.f15024b;
        return this.f15023a.i(j4 - j5) + j5;
    }

    @Override // q0.InterfaceC1383z
    public final void j(long j4) {
        this.f15023a.j(j4 - this.f15024b);
    }

    @Override // q0.d0
    public final boolean l() {
        return this.f15023a.l();
    }

    @Override // q0.InterfaceC1382y
    public final void m(InterfaceC1383z interfaceC1383z) {
        InterfaceC1382y interfaceC1382y = this.f15025c;
        interfaceC1382y.getClass();
        interfaceC1382y.m(this);
    }

    @Override // q0.InterfaceC1383z
    public final long q() {
        long q4 = this.f15023a.q();
        if (q4 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return q4 + this.f15024b;
    }

    @Override // q0.c0
    public final void s(d0 d0Var) {
        InterfaceC1382y interfaceC1382y = this.f15025c;
        interfaceC1382y.getClass();
        interfaceC1382y.s(this);
    }

    @Override // q0.InterfaceC1383z
    public final j0 t() {
        return this.f15023a.t();
    }

    @Override // q0.d0
    public final long u() {
        long u4 = this.f15023a.u();
        if (u4 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return u4 + this.f15024b;
    }

    @Override // q0.d0
    public final boolean v(a0.Q q4) {
        a0.P p2 = new a0.P();
        long j4 = q4.f3985a;
        p2.f3983b = q4.f3986b;
        p2.f3984c = q4.f3987c;
        p2.f3982a = j4 - this.f15024b;
        return this.f15023a.v(new a0.Q(p2));
    }

    @Override // q0.d0
    public final void w(long j4) {
        this.f15023a.w(j4 - this.f15024b);
    }
}
