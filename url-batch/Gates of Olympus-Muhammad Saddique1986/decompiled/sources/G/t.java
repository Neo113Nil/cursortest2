package G;

import C0.K;
import I.C0143d;
import I.C0159l;
import I.C0167p;
import I.InterfaceC0164n0;
import e2.InterfaceC0424c;
import e2.InterfaceC0426e;
import m.i0;
import r.AbstractC0868o;
import r0.InterfaceC0885G;
import t0.C0995h;
import t0.C0996i;
import t0.C1001n;
import t0.InterfaceC0997j;

/* loaded from: classes.dex */
public final class t extends f2.k implements InterfaceC0426e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2032e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i0 f2033f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f2034g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ K f2035h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0426e f2036i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(i0 i0Var, long j3, K k3, InterfaceC0426e interfaceC0426e, int i3) {
        super(2);
        this.f2032e = i3;
        this.f2033f = i0Var;
        this.f2034g = j3;
        this.f2035h = k3;
        this.f2036i = interfaceC0426e;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        switch (this.f2032e) {
            case 0:
                C0167p c0167p = (C0167p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0167p.x()) {
                    c0167p.L();
                } else {
                    U.n nVar = U.n.f4488a;
                    i0 i0Var = this.f2033f;
                    boolean f3 = c0167p.f(i0Var);
                    Object G3 = c0167p.G();
                    if (f3 || G3 == C0159l.f2829a) {
                        G3 = new r(i0Var, 1);
                        c0167p.a0(G3);
                    }
                    U.q a3 = androidx.compose.ui.graphics.a.a(nVar, (InterfaceC0424c) G3);
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
                    z.b(this.f2034g, this.f2035h, this.f2036i, c0167p, 0);
                    c0167p.p(true);
                }
                break;
            default:
                C0167p c0167p2 = (C0167p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0167p2.x()) {
                    c0167p2.L();
                } else {
                    U.n nVar2 = U.n.f4488a;
                    i0 i0Var2 = this.f2033f;
                    boolean f4 = c0167p2.f(i0Var2);
                    Object G4 = c0167p2.G();
                    if (f4 || G4 == C0159l.f2829a) {
                        G4 = new r(i0Var2, 2);
                        c0167p2.a0(G4);
                    }
                    U.q a4 = androidx.compose.ui.graphics.a.a(nVar2, (InterfaceC0424c) G4);
                    InterfaceC0885G e4 = AbstractC0868o.e(U.b.f4461d, false);
                    int i4 = c0167p2.f2864P;
                    InterfaceC0164n0 m4 = c0167p2.m();
                    U.q d4 = U.a.d(c0167p2, a4);
                    InterfaceC0997j.f8759c.getClass();
                    C1001n c1001n2 = C0996i.f8754b;
                    c0167p2.U();
                    if (c0167p2.f2863O) {
                        c0167p2.l(c1001n2);
                    } else {
                        c0167p2.d0();
                    }
                    C0143d.R(c0167p2, C0996i.f8757e, e4);
                    C0143d.R(c0167p2, C0996i.f8756d, m4);
                    C0995h c0995h2 = C0996i.f8758f;
                    if (c0167p2.f2863O || !f2.j.a(c0167p2.G(), Integer.valueOf(i4))) {
                        A.k.o(i4, c0167p2, i4, c0995h2);
                    }
                    C0143d.R(c0167p2, C0996i.f8755c, d4);
                    z.b(this.f2034g, this.f2035h, this.f2036i, c0167p2, 0);
                    c0167p2.p(true);
                }
                break;
        }
        return R1.y.f4171a;
    }
}
