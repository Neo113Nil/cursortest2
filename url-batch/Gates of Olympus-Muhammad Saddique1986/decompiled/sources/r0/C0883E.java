package r0;

import a0.C0238c;
import a0.C0239d;
import n.z0;
import t0.b0;

/* renamed from: r0.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0883E implements InterfaceC0919p {

    /* renamed from: d, reason: collision with root package name */
    public final t0.Q f8118d;

    public C0883E(t0.Q q3) {
        this.f8118d = q3;
    }

    @Override // r0.InterfaceC0919p
    public final C0239d B(InterfaceC0919p interfaceC0919p, boolean z3) {
        return this.f8118d.f8658o.B(interfaceC0919p, z3);
    }

    @Override // r0.InterfaceC0919p
    public final long I() {
        t0.Q q3 = this.f8118d;
        return O2.d.d(q3.f8126d, q3.f8127e);
    }

    @Override // r0.InterfaceC0919p
    public final long N(long j3) {
        return this.f8118d.f8658o.N(C0238c.h(j3, a()));
    }

    @Override // r0.InterfaceC0919p
    public final long P(InterfaceC0919p interfaceC0919p, long j3) {
        return b(interfaceC0919p, j3);
    }

    public final long a() {
        t0.Q q3 = this.f8118d;
        t0.Q h3 = AbstractC0898U.h(q3);
        return C0238c.g(b(h3.f8661r, 0L), q3.f8658o.S0(h3.f8658o, 0L));
    }

    public final long b(InterfaceC0919p interfaceC0919p, long j3) {
        boolean z3 = interfaceC0919p instanceof C0883E;
        t0.Q q3 = this.f8118d;
        if (!z3) {
            t0.Q h3 = AbstractC0898U.h(q3);
            long b3 = b(h3.f8661r, j3);
            b0 b0Var = h3.f8658o;
            b0Var.getClass();
            return C0238c.h(b3, b0Var.S0(interfaceC0919p, 0L));
        }
        t0.Q q4 = ((C0883E) interfaceC0919p).f8118d;
        q4.f8658o.T0();
        t0.Q I02 = q3.f8658o.G0(q4.f8658o).I0();
        if (I02 != null) {
            long b4 = O0.h.b(O0.h.c(q4.B0(I02, false), l0.c.K(j3)), q3.B0(I02, false));
            return l0.c.e((int) (b4 >> 32), (int) (b4 & 4294967295L));
        }
        t0.Q h4 = AbstractC0898U.h(q4);
        long c2 = O0.h.c(O0.h.c(q4.B0(h4, false), h4.f8659p), l0.c.K(j3));
        t0.Q h5 = AbstractC0898U.h(q3);
        long b5 = O0.h.b(c2, O0.h.c(q3.B0(h5, false), h5.f8659p));
        long e3 = l0.c.e((int) (b5 >> 32), (int) (b5 & 4294967295L));
        b0 b0Var2 = h5.f8658o.f8713q;
        f2.j.c(b0Var2);
        b0 b0Var3 = h4.f8658o.f8713q;
        f2.j.c(b0Var3);
        return b0Var2.S0(b0Var3, e3);
    }

    @Override // r0.InterfaceC0919p
    public final long f(long j3) {
        return C0238c.h(this.f8118d.f8658o.f(j3), a());
    }

    @Override // r0.InterfaceC0919p
    public final long m(long j3) {
        return this.f8118d.f8658o.m(C0238c.h(j3, a()));
    }

    @Override // r0.InterfaceC0919p
    public final long n(long j3) {
        return C0238c.h(this.f8118d.f8658o.n(j3), a());
    }

    @Override // r0.InterfaceC0919p
    public final boolean o() {
        return this.f8118d.f8658o.K0().f4501p;
    }

    @Override // r0.InterfaceC0919p
    public final void u(float[] fArr) {
        this.f8118d.f8658o.u(fArr);
    }

    @Override // r0.InterfaceC0919p
    public final InterfaceC0919p v() {
        t0.Q I02;
        if (!o()) {
            z0.o("LayoutCoordinate operations are only valid when isAttached is true");
            throw null;
        }
        b0 b0Var = ((b0) this.f8118d.f8658o.f8711o.f8561y.f2913d).f8713q;
        if (b0Var == null || (I02 = b0Var.I0()) == null) {
            return null;
        }
        return I02.f8661r;
    }

    @Override // r0.InterfaceC0919p
    public final void w(InterfaceC0919p interfaceC0919p, float[] fArr) {
        this.f8118d.f8658o.w(interfaceC0919p, fArr);
    }
}
