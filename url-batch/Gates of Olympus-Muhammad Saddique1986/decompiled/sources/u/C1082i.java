package u;

import R1.y;
import U.p;
import a0.C0239d;
import e2.InterfaceC0422a;
import m1.w;
import p.C0771k;
import q2.AbstractC0837y;
import r0.InterfaceC0919p;
import t0.AbstractC0993f;
import t0.InterfaceC1008v;
import t0.b0;
import t0.r0;

/* renamed from: u.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1082i extends p implements InterfaceC1074a, InterfaceC1008v, r0 {

    /* renamed from: s, reason: collision with root package name */
    public static final w f9111s = new w(3);

    /* renamed from: q, reason: collision with root package name */
    public C0771k f9112q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f9113r;

    public static final C0239d y0(C1082i c1082i, b0 b0Var, InterfaceC0422a interfaceC0422a) {
        C0239d c0239d;
        if (!c1082i.f4501p || !c1082i.f9113r) {
            return null;
        }
        b0 s3 = AbstractC0993f.s(c1082i);
        if (!b0Var.K0().f4501p) {
            b0Var = null;
        }
        if (b0Var == null || (c0239d = (C0239d) interfaceC0422a.b()) == null) {
            return null;
        }
        C0239d B3 = s3.B(b0Var, false);
        return c0239d.h(l0.c.e(B3.f4724a, B3.f4725b));
    }

    @Override // u.InterfaceC1074a
    public final Object P(b0 b0Var, InterfaceC0422a interfaceC0422a, X1.c cVar) {
        Object e3 = AbstractC0837y.e(new C1081h(this, b0Var, interfaceC0422a, new K2.i(this, b0Var, interfaceC0422a), null), cVar);
        return e3 == W1.a.f4608d ? e3 : y.f4171a;
    }

    @Override // U.p
    public final boolean n0() {
        return false;
    }

    @Override // t0.InterfaceC1008v
    public final void v(InterfaceC0919p interfaceC0919p) {
        this.f9113r = true;
    }

    @Override // t0.r0
    public final Object w() {
        return f9111s;
    }
}
