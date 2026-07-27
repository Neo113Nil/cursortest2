package p0;

import a.AbstractC0345a;
import kotlin.jvm.internal.Intrinsics;
import n.AbstractC0864b;

/* renamed from: p0.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0943D implements InterfaceC0980p {

    /* renamed from: d, reason: collision with root package name */
    public final r0.P f8996d;

    public C0943D(r0.P p4) {
        this.f8996d = p4;
    }

    @Override // p0.InterfaceC0980p
    public final long K() {
        r0.P p4 = this.f8996d;
        return u3.d.c(p4.f9005d, p4.f9006e);
    }

    @Override // p0.InterfaceC0980p
    public final long Q(long j4) {
        return this.f8996d.f9707r.Q(Y.c.h(j4, a()));
    }

    public final long a() {
        r0.P p4 = this.f8996d;
        r0.P h4 = AbstractC0960V.h(p4);
        return Y.c.g(b(h4.f9710u, 0L), p4.f9707r.W0(h4.f9707r, 0L));
    }

    public final long b(InterfaceC0980p interfaceC0980p, long j4) {
        boolean z4 = interfaceC0980p instanceof C0943D;
        r0.P p4 = this.f8996d;
        if (!z4) {
            r0.P h4 = AbstractC0960V.h(p4);
            long b4 = b(h4.f9710u, j4);
            r0.a0 a0Var = h4.f9707r;
            a0Var.getClass();
            return Y.c.h(b4, a0Var.W0(interfaceC0980p, 0L));
        }
        r0.P p5 = ((C0943D) interfaceC0980p).f8996d;
        p5.f9707r.X0();
        r0.P M02 = p4.f9707r.K0(p5.f9707r).M0();
        if (M02 != null) {
            long b5 = M0.h.b(M0.h.c(p5.F0(M02, false), j0.c.L(j4)), p4.F0(M02, false));
            return AbstractC0345a.c((int) (b5 >> 32), (int) (b5 & 4294967295L));
        }
        r0.P h5 = AbstractC0960V.h(p5);
        long c4 = M0.h.c(M0.h.c(p5.F0(h5, false), h5.f9708s), j0.c.L(j4));
        r0.P h6 = AbstractC0960V.h(p4);
        long b6 = M0.h.b(c4, M0.h.c(p4.F0(h6, false), h6.f9708s));
        long c5 = AbstractC0345a.c((int) (b6 >> 32), (int) (b6 & 4294967295L));
        r0.a0 a0Var2 = h6.f9707r.f9764t;
        Intrinsics.c(a0Var2);
        r0.a0 a0Var3 = h5.f9707r.f9764t;
        Intrinsics.c(a0Var3);
        return a0Var2.W0(a0Var3, c5);
    }

    @Override // p0.InterfaceC0980p
    public final long c(long j4) {
        return Y.c.h(this.f8996d.f9707r.c(j4), a());
    }

    @Override // p0.InterfaceC0980p
    public final void i(InterfaceC0980p interfaceC0980p, float[] fArr) {
        this.f8996d.f9707r.i(interfaceC0980p, fArr);
    }

    @Override // p0.InterfaceC0980p
    public final long j(long j4) {
        return this.f8996d.f9707r.j(Y.c.h(j4, a()));
    }

    @Override // p0.InterfaceC0980p
    public final long m(long j4) {
        return Y.c.h(this.f8996d.f9707r.m(j4), a());
    }

    @Override // p0.InterfaceC0980p
    public final Y.d n(InterfaceC0980p interfaceC0980p, boolean z4) {
        return this.f8996d.f9707r.n(interfaceC0980p, z4);
    }

    @Override // p0.InterfaceC0980p
    public final boolean p() {
        return this.f8996d.f9707r.O0().f3990s;
    }

    @Override // p0.InterfaceC0980p
    public final void u(float[] fArr) {
        this.f8996d.f9707r.u(fArr);
    }

    @Override // p0.InterfaceC0980p
    public final InterfaceC0980p x() {
        r0.P M02;
        if (!p()) {
            AbstractC0864b.D("LayoutCoordinate operations are only valid when isAttached is true");
            throw null;
        }
        r0.a0 a0Var = ((r0.a0) this.f8996d.f9707r.f9762r.B.f2910d).f9764t;
        if (a0Var == null || (M02 = a0Var.M0()) == null) {
            return null;
        }
        return M02.f9710u;
    }

    @Override // p0.InterfaceC0980p
    public final long y(InterfaceC0980p interfaceC0980p, long j4) {
        return b(interfaceC0980p, j4);
    }
}
