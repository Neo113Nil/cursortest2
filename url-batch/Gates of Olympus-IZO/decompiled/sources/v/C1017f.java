package v;

import E2.j;
import I2.l;
import L1.z;
import R1.i;
import U.k;
import k.C0523b;
import k2.AbstractC0552y;
import o.C0735k;
import r0.InterfaceC0838k;
import t0.AbstractC0898f;
import t0.InterfaceC0913v;
import t0.a0;
import t0.q0;

/* renamed from: v.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1017f extends k implements InterfaceC1012a, InterfaceC0913v, q0 {

    /* renamed from: s, reason: collision with root package name */
    public static final C0523b f8569s = new C0523b(8);

    /* renamed from: q, reason: collision with root package name */
    public C0735k f8570q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f8571r;

    public static final a0.d v0(C1017f c1017f, a0 a0Var, Y1.a aVar) {
        a0.d dVar;
        if (!c1017f.p || !c1017f.f8571r) {
            return null;
        }
        a0 s3 = AbstractC0898f.s(c1017f);
        if (!a0Var.B0().p) {
            a0Var = null;
        }
        if (a0Var == null || (dVar = (a0.d) aVar.b()) == null) {
            return null;
        }
        a0.d u3 = s3.u(a0Var, false);
        return dVar.e(l.f(u3.f3491a, u3.f3492b));
    }

    @Override // v.InterfaceC1012a
    public final Object Q(a0 a0Var, Y1.a aVar, i iVar) {
        Object d3 = AbstractC0552y.d(new C1016e(this, a0Var, aVar, new j(this, a0Var, aVar), null), iVar);
        return d3 == Q1.a.f3113d ? d3 : z.f2729a;
    }

    @Override // U.k
    public final boolean k0() {
        return false;
    }

    @Override // t0.InterfaceC0913v
    public final void u(InterfaceC0838k interfaceC0838k) {
        this.f8571r = true;
    }

    @Override // t0.q0
    public final Object v() {
        return f8569s;
    }
}
