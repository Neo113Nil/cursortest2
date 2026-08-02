package q0;

import a0.p0;

/* renamed from: q0.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1378u implements InterfaceC1383z, InterfaceC1382y {

    /* renamed from: a, reason: collision with root package name */
    public final C1353B f15069a;

    /* renamed from: b, reason: collision with root package name */
    public final long f15070b;

    /* renamed from: c, reason: collision with root package name */
    public final B1.j f15071c;

    /* renamed from: d, reason: collision with root package name */
    public AbstractC1359a f15072d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC1383z f15073e;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC1382y f15074f;

    /* renamed from: g, reason: collision with root package name */
    public long f15075g = -9223372036854775807L;

    public C1378u(C1353B c1353b, B1.j jVar, long j4) {
        this.f15069a = c1353b;
        this.f15071c = jVar;
        this.f15070b = j4;
    }

    public final void a(C1353B c1353b) {
        long j4 = this.f15075g;
        if (j4 == -9223372036854775807L) {
            j4 = this.f15070b;
        }
        AbstractC1359a abstractC1359a = this.f15072d;
        abstractC1359a.getClass();
        InterfaceC1383z b4 = abstractC1359a.b(c1353b, this.f15071c, j4);
        this.f15073e = b4;
        if (this.f15074f != null) {
            b4.f(this, j4);
        }
    }

    @Override // q0.InterfaceC1383z
    public final long b(long j4, p0 p0Var) {
        InterfaceC1383z interfaceC1383z = this.f15073e;
        String str = W.J.f3263a;
        return interfaceC1383z.b(j4, p0Var);
    }

    @Override // q0.InterfaceC1383z
    public final long d(t0.t[] tVarArr, boolean[] zArr, b0[] b0VarArr, boolean[] zArr2, long j4) {
        long j5 = this.f15075g;
        long j6 = (j5 == -9223372036854775807L || j4 != this.f15070b) ? j4 : j5;
        this.f15075g = -9223372036854775807L;
        InterfaceC1383z interfaceC1383z = this.f15073e;
        String str = W.J.f3263a;
        return interfaceC1383z.d(tVarArr, zArr, b0VarArr, zArr2, j6);
    }

    @Override // q0.d0
    public final long e() {
        InterfaceC1383z interfaceC1383z = this.f15073e;
        String str = W.J.f3263a;
        return interfaceC1383z.e();
    }

    @Override // q0.InterfaceC1383z
    public final void f(InterfaceC1382y interfaceC1382y, long j4) {
        this.f15074f = interfaceC1382y;
        InterfaceC1383z interfaceC1383z = this.f15073e;
        if (interfaceC1383z != null) {
            long j5 = this.f15075g;
            if (j5 == -9223372036854775807L) {
                j5 = this.f15070b;
            }
            interfaceC1383z.f(this, j5);
        }
    }

    @Override // q0.InterfaceC1383z
    public final void h() {
        InterfaceC1383z interfaceC1383z = this.f15073e;
        if (interfaceC1383z != null) {
            interfaceC1383z.h();
            return;
        }
        AbstractC1359a abstractC1359a = this.f15072d;
        if (abstractC1359a != null) {
            abstractC1359a.k();
        }
    }

    @Override // q0.InterfaceC1383z
    public final long i(long j4) {
        InterfaceC1383z interfaceC1383z = this.f15073e;
        String str = W.J.f3263a;
        return interfaceC1383z.i(j4);
    }

    @Override // q0.InterfaceC1383z
    public final void j(long j4) {
        InterfaceC1383z interfaceC1383z = this.f15073e;
        String str = W.J.f3263a;
        interfaceC1383z.j(j4);
    }

    @Override // q0.d0
    public final boolean l() {
        InterfaceC1383z interfaceC1383z = this.f15073e;
        return interfaceC1383z != null && interfaceC1383z.l();
    }

    @Override // q0.InterfaceC1382y
    public final void m(InterfaceC1383z interfaceC1383z) {
        InterfaceC1382y interfaceC1382y = this.f15074f;
        String str = W.J.f3263a;
        interfaceC1382y.m(this);
    }

    @Override // q0.InterfaceC1383z
    public final long q() {
        InterfaceC1383z interfaceC1383z = this.f15073e;
        String str = W.J.f3263a;
        return interfaceC1383z.q();
    }

    @Override // q0.c0
    public final void s(d0 d0Var) {
        InterfaceC1382y interfaceC1382y = this.f15074f;
        String str = W.J.f3263a;
        interfaceC1382y.s(this);
    }

    @Override // q0.InterfaceC1383z
    public final j0 t() {
        InterfaceC1383z interfaceC1383z = this.f15073e;
        String str = W.J.f3263a;
        return interfaceC1383z.t();
    }

    @Override // q0.d0
    public final long u() {
        InterfaceC1383z interfaceC1383z = this.f15073e;
        String str = W.J.f3263a;
        return interfaceC1383z.u();
    }

    @Override // q0.d0
    public final boolean v(a0.Q q4) {
        InterfaceC1383z interfaceC1383z = this.f15073e;
        return interfaceC1383z != null && interfaceC1383z.v(q4);
    }

    @Override // q0.d0
    public final void w(long j4) {
        InterfaceC1383z interfaceC1383z = this.f15073e;
        String str = W.J.f3263a;
        interfaceC1383z.w(j4);
    }
}
