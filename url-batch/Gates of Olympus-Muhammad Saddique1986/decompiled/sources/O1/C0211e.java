package O1;

import C0.K;
import F.A1;
import F.B1;
import F.M;
import F.O;
import F.d1;
import F.x1;
import I.C0143d;
import I.C0159l;
import I.C0167p;
import I.InterfaceC0142c0;
import I.InterfaceC0164n0;
import I.X0;
import e2.InterfaceC0422a;
import e2.InterfaceC0427f;
import java.util.List;
import n2.AbstractC0730j;
import r.AbstractC0864k;
import r.AbstractC0871s;
import r.C0873u;
import r.C0874v;
import r.P;
import r.Q;
import r.S;
import t0.C0995h;
import t0.C0996i;
import t0.C1001n;
import t0.InterfaceC0997j;

/* renamed from: O1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0211e implements InterfaceC0427f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3787d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3788e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f3789f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f3790g;

    public /* synthetic */ C0211e(Object obj, Object obj2, Object obj3, int i3) {
        this.f3787d = i3;
        this.f3788e = obj;
        this.f3789f = obj2;
        this.f3790g = obj3;
    }

    @Override // e2.InterfaceC0427f
    public final Object g(Object obj, Object obj2, Object obj3) {
        J1.b bVar;
        J1.a aVar;
        X0 x02;
        C0167p c0167p;
        switch (this.f3787d) {
            case 0:
                C0167p c0167p2 = (C0167p) obj2;
                int intValue = ((Number) obj3).intValue();
                f2.j.f((C0874v) obj, "$this$Card");
                if ((intValue & 17) == 16 && c0167p2.x()) {
                    c0167p2.L();
                } else {
                    U.n nVar = U.n.f4488a;
                    U.q f3 = androidx.compose.foundation.layout.b.f(androidx.compose.foundation.layout.c.c(nVar, 1.0f), 14);
                    Q a3 = P.a(AbstractC0864k.f8056f, U.b.f4471n, c0167p2, 54);
                    int i3 = c0167p2.f2864P;
                    InterfaceC0164n0 m3 = c0167p2.m();
                    U.q d3 = U.a.d(c0167p2, f3);
                    InterfaceC0997j.f8759c.getClass();
                    C1001n c1001n = C0996i.f8754b;
                    c0167p2.U();
                    if (c0167p2.f2863O) {
                        c0167p2.l(c1001n);
                    } else {
                        c0167p2.d0();
                    }
                    C0995h c0995h = C0996i.f8757e;
                    C0143d.R(c0167p2, c0995h, a3);
                    C0995h c0995h2 = C0996i.f8756d;
                    C0143d.R(c0167p2, c0995h2, m3);
                    C0995h c0995h3 = C0996i.f8758f;
                    if (c0167p2.f2863O || !f2.j.a(c0167p2.G(), Integer.valueOf(i3))) {
                        A.k.o(i3, c0167p2, i3, c0995h3);
                    }
                    C0995h c0995h4 = C0996i.f8755c;
                    C0143d.R(c0167p2, c0995h4, d3);
                    U.q a4 = S.a(S.f7990a, nVar);
                    C0873u a5 = AbstractC0871s.a(AbstractC0864k.f8053c, c0167p2, 0);
                    int i4 = c0167p2.f2864P;
                    InterfaceC0164n0 m4 = c0167p2.m();
                    U.q d4 = U.a.d(c0167p2, a4);
                    c0167p2.U();
                    if (c0167p2.f2863O) {
                        c0167p2.l(c1001n);
                    } else {
                        c0167p2.d0();
                    }
                    C0143d.R(c0167p2, c0995h, a5);
                    C0143d.R(c0167p2, c0995h2, m4);
                    if (c0167p2.f2863O || !f2.j.a(c0167p2.G(), Integer.valueOf(i4))) {
                        A.k.o(i4, c0167p2, i4, c0995h3);
                    }
                    C0143d.R(c0167p2, c0995h4, d4);
                    J1.b bVar2 = (J1.b) this.f3788e;
                    J1.a aVar2 = bVar2.f3164a;
                    H0.k kVar = H0.k.f2599h;
                    X0 x03 = B1.f1124a;
                    x1.b(aVar2.f3160b, null, 0L, 0L, null, kVar, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((A1) c0167p2.k(x03)).f1107h, c0167p2, 196608, 0, 65502);
                    C0167p c0167p3 = c0167p2;
                    c0167p3.Q(-921204393);
                    J1.a aVar3 = bVar2.f3164a;
                    if (AbstractC0730j.K(aVar3.f3161c)) {
                        bVar = bVar2;
                        aVar = aVar3;
                        x02 = x03;
                    } else {
                        x02 = x03;
                        aVar = aVar3;
                        bVar = bVar2;
                        x1.b(aVar3.f3161c, null, ((M) c0167p3.k(O.f1301a)).f1256s, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((A1) c0167p3.k(x03)).f1111l, c0167p3, 0, 0, 65530);
                        c0167p3 = c0167p3;
                    }
                    c0167p3.p(false);
                    J1.b bVar3 = bVar;
                    String str = bVar3.f3165b + " visits · " + M1.b.a(bVar3.f3166c) + " total";
                    X0 x04 = x02;
                    K k3 = ((A1) c0167p3.k(x04)).f1111l;
                    X0 x05 = O.f1301a;
                    C0167p c0167p4 = c0167p3;
                    x1.b(str, null, ((M) c0167p3.k(x05)).f1238a, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, k3, c0167p4, 0, 0, 65530);
                    c0167p4.Q(-921186699);
                    J1.a aVar4 = aVar;
                    if (AbstractC0730j.K(aVar4.f3162d)) {
                        c0167p = c0167p4;
                    } else {
                        x1.b(aVar4.f3162d, null, ((M) c0167p4.k(x05)).f1256s, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((A1) c0167p4.k(x04)).f1111l, c0167p4, 0, 0, 65530);
                        c0167p = c0167p4;
                    }
                    c0167p.p(false);
                    c0167p.p(true);
                    Q a6 = P.a(AbstractC0864k.f8051a, U.b.f4470m, c0167p, 0);
                    int i5 = c0167p.f2864P;
                    InterfaceC0164n0 m5 = c0167p.m();
                    U.q d5 = U.a.d(c0167p, nVar);
                    c0167p.U();
                    if (c0167p.f2863O) {
                        c0167p.l(c1001n);
                    } else {
                        c0167p.d0();
                    }
                    C0143d.R(c0167p, c0995h, a6);
                    C0143d.R(c0167p, c0995h2, m5);
                    if (c0167p.f2863O || !f2.j.a(c0167p.G(), Integer.valueOf(i5))) {
                        A.k.o(i5, c0167p, i5, c0995h3);
                    }
                    C0143d.R(c0167p, c0995h4, d5);
                    d1.e((InterfaceC0422a) this.f3789f, null, false, null, null, null, null, null, null, p.f3843c, c0167p, 805306368, 510);
                    d1.d((InterfaceC0422a) this.f3790g, null, false, null, null, p.f3844d, c0167p, 196608);
                    c0167p.p(true);
                    c0167p.p(true);
                }
                break;
            default:
                C0167p c0167p5 = (C0167p) obj2;
                int intValue2 = ((Number) obj3).intValue();
                f2.j.f((C0874v) obj, "$this$DropdownMenu");
                if ((intValue2 & 17) == 16 && c0167p5.x()) {
                    c0167p5.L();
                } else {
                    Q.a aVar5 = s.f3862i;
                    c0167p5.Q(1753481678);
                    Object G3 = c0167p5.G();
                    Object obj4 = C0159l.f2829a;
                    final InterfaceC0142c0 interfaceC0142c0 = (InterfaceC0142c0) this.f3789f;
                    final InterfaceC0142c0 interfaceC0142c02 = (InterfaceC0142c0) this.f3790g;
                    if (G3 == obj4) {
                        G3 = new C0208b(interfaceC0142c0, interfaceC0142c02, 1);
                        c0167p5.a0(G3);
                    }
                    c0167p5.p(false);
                    F.r.b(aVar5, (InterfaceC0422a) G3, null, null, null, false, null, null, null, c0167p5, 54);
                    for (final J1.a aVar6 : (List) this.f3788e) {
                        Q.a b3 = Q.f.b(1040983668, new h(aVar6, 1), c0167p5);
                        c0167p5.Q(1533575946);
                        boolean f4 = c0167p5.f(aVar6);
                        Object G4 = c0167p5.G();
                        if (f4 || G4 == obj4) {
                            G4 = new InterfaceC0422a() { // from class: O1.C
                                @Override // e2.InterfaceC0422a
                                public final Object b() {
                                    interfaceC0142c0.setValue(J1.a.this);
                                    interfaceC0142c02.setValue(Boolean.FALSE);
                                    return R1.y.f4171a;
                                }
                            };
                            c0167p5.a0(G4);
                        }
                        c0167p5.p(false);
                        F.r.b(b3, (InterfaceC0422a) G4, null, null, null, false, null, null, null, c0167p5, 6);
                    }
                }
                break;
        }
        return R1.y.f4171a;
    }
}
