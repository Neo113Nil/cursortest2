package G;

import C0.K;
import I.C0143d;
import I.C0159l;
import I.C0167p;
import I.InterfaceC0164n0;
import e2.InterfaceC0424c;
import e2.InterfaceC0426e;
import e2.InterfaceC0427f;
import m.i0;
import r.AbstractC0868o;
import r0.InterfaceC0885G;
import t0.C0995h;
import t0.C0996i;
import t0.C1001n;
import t0.InterfaceC0997j;

/* loaded from: classes.dex */
public final class s extends f2.k implements InterfaceC0427f {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i0 f2028e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f2029f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ K f2030g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0426e f2031h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(i0 i0Var, long j3, K k3, InterfaceC0426e interfaceC0426e) {
        super(3);
        this.f2028e = i0Var;
        this.f2029f = j3;
        this.f2030g = k3;
        this.f2031h = interfaceC0426e;
    }

    @Override // e2.InterfaceC0427f
    public final Object g(Object obj, Object obj2, Object obj3) {
        U.q qVar = (U.q) obj;
        C0167p c0167p = (C0167p) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= c0167p.f(qVar) ? 4 : 2;
        }
        if ((intValue & 19) == 18 && c0167p.x()) {
            c0167p.L();
        } else {
            i0 i0Var = this.f2028e;
            boolean f3 = c0167p.f(i0Var);
            Object G3 = c0167p.G();
            if (f3 || G3 == C0159l.f2829a) {
                G3 = new r(i0Var, 0);
                c0167p.a0(G3);
            }
            U.q a3 = androidx.compose.ui.graphics.a.a(qVar, (InterfaceC0424c) G3);
            InterfaceC0885G e3 = AbstractC0868o.e(U.b.f4461d, false);
            int i3 = c0167p.f2864P;
            InterfaceC0164n0 m3 = c0167p.m();
            U.q d3 = U.a.d(c0167p, a3);
            InterfaceC0997j.f8759c.getClass();
            C1001n c1001n = C0996i.f8754b;
            c0167p.U();
            if (c0167p.f2863O) {
                c0167p.l(c1001n);
            } else {
                c0167p.d0();
            }
            C0143d.R(c0167p, C0996i.f8757e, e3);
            C0143d.R(c0167p, C0996i.f8756d, m3);
            C0995h c0995h = C0996i.f8758f;
            if (c0167p.f2863O || !f2.j.a(c0167p.G(), Integer.valueOf(i3))) {
                A.k.o(i3, c0167p, i3, c0995h);
            }
            C0143d.R(c0167p, C0996i.f8755c, d3);
            z.b(this.f2029f, this.f2030g, this.f2031h, c0167p, 0);
            c0167p.p(true);
        }
        return R1.y.f4171a;
    }
}
