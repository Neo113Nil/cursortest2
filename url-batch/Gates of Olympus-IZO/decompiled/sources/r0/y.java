package r0;

import e2.AbstractC0381e;
import t0.a0;

/* loaded from: classes.dex */
public final class y implements InterfaceC0838k {

    /* renamed from: d, reason: collision with root package name */
    public final t0.P f7194d;

    public y(t0.P p) {
        this.f7194d = p;
    }

    public final long a(InterfaceC0838k interfaceC0838k, long j3) {
        boolean z3 = interfaceC0838k instanceof y;
        t0.P p = this.f7194d;
        if (!z3) {
            t0.P h3 = M.h(p);
            long a3 = a(h3.f7831r, j3);
            a0 a0Var = h3.f7829o;
            a0Var.getClass();
            return a0.c.h(a3, a0Var.J0(interfaceC0838k, 0L));
        }
        t0.P p3 = ((y) interfaceC0838k).f7194d;
        p3.f7829o.L0();
        t0.P z02 = p.f7829o.x0(p3.f7829o).z0();
        if (z02 != null) {
            long b2 = M0.g.b(M0.g.c(p3.s0(z02, false), (Math.round(a0.c.e(j3)) & 4294967295L) | (Math.round(a0.c.d(j3)) << 32)), p.s0(z02, false));
            return I2.l.f((int) (b2 >> 32), (int) (b2 & 4294967295L));
        }
        t0.P h4 = M.h(p3);
        long c3 = M0.g.c(M0.g.c(p3.s0(h4, false), h4.p), (Math.round(a0.c.e(j3)) & 4294967295L) | (Math.round(a0.c.d(j3)) << 32));
        t0.P h5 = M.h(p);
        long b3 = M0.g.b(c3, M0.g.c(p.s0(h5, false), h5.p));
        long f3 = I2.l.f((int) (b3 >> 32), (int) (b3 & 4294967295L));
        a0 a0Var2 = h5.f7829o.f7878q;
        Z1.i.c(a0Var2);
        a0 a0Var3 = h4.f7829o.f7878q;
        Z1.i.c(a0Var3);
        return a0Var2.J0(a0Var3, f3);
    }

    @Override // r0.InterfaceC0838k
    public final long m(long j3) {
        t0.P p = this.f7194d;
        a0 a0Var = p.f7829o;
        t0.P h3 = M.h(p);
        return a0Var.m(a0.c.h(j3, a0.c.g(a(h3.f7831r, 0L), p.f7829o.J0(h3.f7829o, 0L))));
    }

    @Override // r0.InterfaceC0838k
    public final boolean n() {
        return this.f7194d.f7829o.B0().p;
    }

    @Override // r0.InterfaceC0838k
    public final InterfaceC0838k t() {
        t0.P z02;
        if (!n()) {
            AbstractC0381e.N("LayoutCoordinate operations are only valid when isAttached is true");
            throw null;
        }
        a0 a0Var = ((a0) this.f7194d.f7829o.f7877o.f7735x.f2354d).f7878q;
        if (a0Var == null || (z02 = a0Var.z0()) == null) {
            return null;
        }
        return z02.f7831r;
    }

    @Override // r0.InterfaceC0838k
    public final a0.d u(InterfaceC0838k interfaceC0838k, boolean z3) {
        return this.f7194d.f7829o.u(interfaceC0838k, z3);
    }

    @Override // r0.InterfaceC0838k
    public final long y() {
        t0.P p = this.f7194d;
        return I2.l.e(p.f7114d, p.f7115e);
    }
}
