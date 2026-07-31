package t0;

import java.util.LinkedHashMap;
import r0.InterfaceC0838k;

/* loaded from: classes.dex */
public abstract class P extends O implements r0.z {

    /* renamed from: o, reason: collision with root package name */
    public final a0 f7829o;

    /* renamed from: q, reason: collision with root package name */
    public LinkedHashMap f7830q;

    /* renamed from: s, reason: collision with root package name */
    public r0.B f7832s;
    public long p = 0;

    /* renamed from: r, reason: collision with root package name */
    public final r0.y f7831r = new r0.y(this);

    /* renamed from: t, reason: collision with root package name */
    public final LinkedHashMap f7833t = new LinkedHashMap();

    public P(a0 a0Var) {
        this.f7829o = a0Var;
    }

    public static final void p0(P p, r0.B b2) {
        L1.z zVar;
        LinkedHashMap linkedHashMap;
        if (b2 != null) {
            p.T(I2.l.e(b2.f(), b2.h()));
            zVar = L1.z.f2729a;
        } else {
            zVar = null;
        }
        if (zVar == null) {
            p.T(0L);
        }
        if (!Z1.i.a(p.f7832s, b2) && b2 != null && ((((linkedHashMap = p.f7830q) != null && !linkedHashMap.isEmpty()) || !b2.i().isEmpty()) && !Z1.i.a(b2.i(), p.f7830q))) {
            I i3 = p.f7829o.f7877o.f7736y.f7814s;
            Z1.i.c(i3);
            i3.f7765t.f();
            LinkedHashMap linkedHashMap2 = p.f7830q;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                p.f7830q = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(b2.i());
        }
        p.f7832s = b2;
    }

    @Override // t0.O, r0.C
    public final boolean B() {
        return true;
    }

    @Override // r0.H
    public final void Q(long j3, float f3, Y1.c cVar) {
        r0(j3);
        if (this.f7824j) {
            return;
        }
        q0();
    }

    @Override // M0.b
    public final float a() {
        return this.f7829o.a();
    }

    @Override // t0.O
    public final O d0() {
        a0 a0Var = this.f7829o.p;
        if (a0Var != null) {
            return a0Var.z0();
        }
        return null;
    }

    @Override // t0.O
    public final InterfaceC0838k e0() {
        return this.f7831r;
    }

    @Override // t0.O
    public final boolean f0() {
        return this.f7832s != null;
    }

    @Override // r0.C
    public final M0.j getLayoutDirection() {
        return this.f7829o.f7877o.f7731t;
    }

    @Override // t0.O
    public final D j0() {
        return this.f7829o.f7877o;
    }

    @Override // t0.O
    public final r0.B k0() {
        r0.B b2 = this.f7832s;
        if (b2 != null) {
            return b2;
        }
        throw new IllegalStateException("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    @Override // t0.O
    public final O l0() {
        a0 a0Var = this.f7829o.f7878q;
        if (a0Var != null) {
            return a0Var.z0();
        }
        return null;
    }

    @Override // t0.O
    public final long m0() {
        return this.p;
    }

    @Override // t0.O
    public final void o0() {
        Q(this.p, 0.0f, null);
    }

    @Override // M0.b
    public final float p() {
        return this.f7829o.p();
    }

    public void q0() {
        k0().j();
    }

    @Override // r0.H, r0.z
    public final Object r() {
        return this.f7829o.r();
    }

    public final void r0(long j3) {
        if (!M0.g.a(this.p, j3)) {
            this.p = j3;
            a0 a0Var = this.f7829o;
            I i3 = a0Var.f7877o.f7736y.f7814s;
            if (i3 != null) {
                i3.d0();
            }
            O.n0(a0Var);
        }
        if (this.f7825k) {
            return;
        }
        b0(new k0(k0(), this));
    }

    public final long s0(P p, boolean z3) {
        long j3 = 0;
        P p3 = this;
        while (!p3.equals(p)) {
            if (!p3.f7823i || !z3) {
                j3 = M0.g.c(j3, p3.p);
            }
            a0 a0Var = p3.f7829o.f7878q;
            Z1.i.c(a0Var);
            p3 = a0Var.z0();
            Z1.i.c(p3);
        }
        return j3;
    }
}
