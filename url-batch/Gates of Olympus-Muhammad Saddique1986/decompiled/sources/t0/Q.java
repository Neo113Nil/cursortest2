package t0;

import e2.InterfaceC0424c;
import java.util.LinkedHashMap;
import r0.C0883E;
import r0.InterfaceC0884F;
import r0.InterfaceC0886H;
import r0.InterfaceC0919p;

/* loaded from: classes.dex */
public abstract class Q extends P implements InterfaceC0884F {

    /* renamed from: o, reason: collision with root package name */
    public final b0 f8658o;

    /* renamed from: q, reason: collision with root package name */
    public LinkedHashMap f8660q;

    /* renamed from: s, reason: collision with root package name */
    public InterfaceC0886H f8662s;

    /* renamed from: p, reason: collision with root package name */
    public long f8659p = 0;

    /* renamed from: r, reason: collision with root package name */
    public final C0883E f8661r = new C0883E(this);

    /* renamed from: t, reason: collision with root package name */
    public final LinkedHashMap f8663t = new LinkedHashMap();

    public Q(b0 b0Var) {
        this.f8658o = b0Var;
    }

    public static final void y0(Q q3, InterfaceC0886H interfaceC0886H) {
        R1.y yVar;
        LinkedHashMap linkedHashMap;
        if (interfaceC0886H != null) {
            q3.g0(O2.d.d(interfaceC0886H.f(), interfaceC0886H.h()));
            yVar = R1.y.f4171a;
        } else {
            yVar = null;
        }
        if (yVar == null) {
            q3.g0(0L);
        }
        if (!f2.j.a(q3.f8662s, interfaceC0886H) && interfaceC0886H != null && ((((linkedHashMap = q3.f8660q) != null && !linkedHashMap.isEmpty()) || !interfaceC0886H.i().isEmpty()) && !f2.j.a(interfaceC0886H.i(), q3.f8660q))) {
            J j3 = q3.f8658o.f8711o.f8562z.f8643s;
            f2.j.c(j3);
            j3.f8591t.f();
            LinkedHashMap linkedHashMap2 = q3.f8660q;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                q3.f8660q = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(interfaceC0886H.i());
        }
        q3.f8662s = interfaceC0886H;
    }

    public final void A0(long j3) {
        if (!O0.h.a(this.f8659p, j3)) {
            this.f8659p = j3;
            b0 b0Var = this.f8658o;
            J j4 = b0Var.f8711o.f8562z.f8643s;
            if (j4 != null) {
                j4.p0();
            }
            P.w0(b0Var);
        }
        if (this.f8654k) {
            return;
        }
        o0(new l0(t0(), this));
    }

    public final long B0(Q q3, boolean z3) {
        long j3 = 0;
        Q q4 = this;
        while (!q4.equals(q3)) {
            if (!q4.f8652i || !z3) {
                j3 = O0.h.c(j3, q4.f8659p);
            }
            b0 b0Var = q4.f8658o.f8713q;
            f2.j.c(b0Var);
            q4 = b0Var.I0();
            f2.j.c(q4);
        }
        return j3;
    }

    @Override // t0.P, r0.InterfaceC0916m
    public final boolean D() {
        return true;
    }

    @Override // O0.b
    public final float a() {
        return this.f8658o.a();
    }

    @Override // r0.AbstractC0893O
    public final void f0(long j3, float f3, InterfaceC0424c interfaceC0424c) {
        A0(j3);
        if (this.f8653j) {
            return;
        }
        z0();
    }

    @Override // r0.InterfaceC0916m
    public final O0.k getLayoutDirection() {
        return this.f8658o.f8711o.f8557u;
    }

    @Override // t0.P
    public final P p0() {
        b0 b0Var = this.f8658o.f8712p;
        if (b0Var != null) {
            return b0Var.I0();
        }
        return null;
    }

    @Override // t0.P
    public final InterfaceC0919p q0() {
        return this.f8661r;
    }

    @Override // O0.b
    public final float r() {
        return this.f8658o.r();
    }

    @Override // t0.P
    public final boolean r0() {
        return this.f8662s != null;
    }

    @Override // t0.P
    public final E s0() {
        return this.f8658o.f8711o;
    }

    @Override // r0.AbstractC0893O, r0.InterfaceC0884F
    public final Object t() {
        return this.f8658o.t();
    }

    @Override // t0.P
    public final InterfaceC0886H t0() {
        InterfaceC0886H interfaceC0886H = this.f8662s;
        if (interfaceC0886H != null) {
            return interfaceC0886H;
        }
        throw new IllegalStateException("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    @Override // t0.P
    public final P u0() {
        b0 b0Var = this.f8658o.f8713q;
        if (b0Var != null) {
            return b0Var.I0();
        }
        return null;
    }

    @Override // t0.P
    public final long v0() {
        return this.f8659p;
    }

    @Override // t0.P
    public final void x0() {
        f0(this.f8659p, 0.0f, null);
    }

    public void z0() {
        t0().j();
    }
}
