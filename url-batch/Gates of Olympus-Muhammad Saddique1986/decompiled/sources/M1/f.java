package M1;

import C0.K;
import F.A1;
import F.B1;
import F.M;
import F.O;
import F.O0;
import F.d1;
import F.x1;
import I.C0143d;
import I.C0159l;
import I.C0167p;
import I.InterfaceC0142c0;
import I.InterfaceC0164n0;
import I.X0;
import N2.l;
import O1.s;
import Q1.k;
import R1.y;
import U.n;
import U.q;
import e2.InterfaceC0422a;
import e2.InterfaceC0424c;
import e2.InterfaceC0427f;
import f2.j;
import h2.AbstractC0508a;
import java.util.Date;
import java.util.Iterator;
import k1.i;
import n.r;
import n.z0;
import n2.AbstractC0730j;
import r.AbstractC0864k;
import r.AbstractC0871s;
import r.C0855b;
import r.C0861h;
import r.C0873u;
import r.C0874v;
import r.InterfaceC0849K;
import r.P;
import r.Q;
import r.S;
import s.C0934c;
import t0.C0995h;
import t0.C0996i;
import t0.C1001n;
import t0.InterfaceC0997j;
import t1.C1013A;
import t1.u;

/* loaded from: classes.dex */
public final class f implements InterfaceC0427f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3473d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3474e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f3475f;

    public /* synthetic */ f(Object obj, int i3, Object obj2) {
        this.f3473d = i3;
        this.f3475f = obj;
        this.f3474e = obj2;
    }

    @Override // e2.InterfaceC0427f
    public final Object g(Object obj, Object obj2, Object obj3) {
        boolean z3;
        boolean h3;
        Object G3;
        S s3 = S.f7990a;
        Object obj4 = C0159l.f2829a;
        n nVar = n.f4488a;
        y yVar = y.f4171a;
        Object obj5 = this.f3474e;
        Object obj6 = this.f3475f;
        switch (this.f3473d) {
            case 0:
                S s4 = (S) obj;
                C0167p c0167p = (C0167p) obj2;
                int intValue = ((Number) obj3).intValue();
                j.f(s4, "$this$NavigationBar");
                if ((6 & intValue) == 0) {
                    intValue |= c0167p.f(s4) ? 4 : 2;
                }
                if ((intValue & 19) != 18 || !c0167p.x()) {
                    Iterator it = a.f3461l.iterator();
                    while (it.hasNext()) {
                        a aVar = (a) it.next();
                        u uVar = (u) obj6;
                        if (uVar != null) {
                            int i3 = u.f8930l;
                            Iterator it2 = r.m(uVar).iterator();
                            while (it2.hasNext()) {
                                if (j.a(((u) it2.next()).f8937j, aVar.f3462d)) {
                                    z3 = true;
                                    c0167p.Q(-960957749);
                                    Object obj7 = (C1013A) obj5;
                                    h3 = c0167p.h(obj7) | c0167p.f(aVar);
                                    G3 = c0167p.G();
                                    if (!h3 || G3 == obj4) {
                                        G3 = new E2.g(obj7, 1, aVar);
                                        c0167p.a0(G3);
                                    }
                                    c0167p.p(false);
                                    O0.b(s4, z3, (InterfaceC0422a) G3, Q.f.b(488978106, new e(aVar, 0), c0167p), null, false, Q.f.b(-1830840553, new e(aVar, 1), c0167p), false, null, null, c0167p, (intValue & 14) | 1575936);
                                }
                            }
                        }
                        z3 = false;
                        c0167p.Q(-960957749);
                        Object obj72 = (C1013A) obj5;
                        h3 = c0167p.h(obj72) | c0167p.f(aVar);
                        G3 = c0167p.G();
                        if (!h3) {
                        }
                        G3 = new E2.g(obj72, 1, aVar);
                        c0167p.a0(G3);
                        c0167p.p(false);
                        O0.b(s4, z3, (InterfaceC0422a) G3, Q.f.b(488978106, new e(aVar, 0), c0167p), null, false, Q.f.b(-1830840553, new e(aVar, 1), c0167p), false, null, null, c0167p, (intValue & 14) | 1575936);
                    }
                    break;
                } else {
                    c0167p.L();
                    break;
                }
                break;
            case 1:
                InterfaceC0849K interfaceC0849K = (InterfaceC0849K) obj;
                C0167p c0167p2 = (C0167p) obj2;
                int intValue2 = ((Number) obj3).intValue();
                j.f(interfaceC0849K, "innerPadding");
                if ((intValue2 & 6) == 0) {
                    intValue2 |= c0167p2.f(interfaceC0849K) ? 4 : 2;
                }
                if ((intValue2 & 19) != 18 || !c0167p2.x()) {
                    String str = a.f3456g.f3462d;
                    q e3 = androidx.compose.foundation.layout.b.e(nVar, interfaceC0849K);
                    c0167p2.Q(-1537079368);
                    k kVar = (k) obj6;
                    boolean h4 = c0167p2.h(kVar);
                    Object G4 = c0167p2.G();
                    if (h4 || G4 == obj4) {
                        G4 = new A2.g(4, kVar);
                        c0167p2.a0(G4);
                    }
                    c0167p2.p(false);
                    z0.c((C1013A) obj5, str, e3, null, null, null, null, null, null, null, (InterfaceC0424c) G4, c0167p2, 48, 0);
                    break;
                } else {
                    c0167p2.L();
                    break;
                }
                break;
            case i.FLOAT_FIELD_NUMBER /* 2 */:
                C0167p c0167p3 = (C0167p) obj2;
                int intValue3 = ((Number) obj3).intValue();
                j.f((C0874v) obj, "$this$Card");
                if ((intValue3 & 17) != 16 || !c0167p3.x()) {
                    q f3 = androidx.compose.foundation.layout.b.f(nVar, 16);
                    C0873u a3 = AbstractC0871s.a(AbstractC0864k.f8053c, c0167p3, 0);
                    int i4 = c0167p3.f2864P;
                    InterfaceC0164n0 m3 = c0167p3.m();
                    q d3 = U.a.d(c0167p3, f3);
                    InterfaceC0997j.f8759c.getClass();
                    C1001n c1001n = C0996i.f8754b;
                    c0167p3.U();
                    if (c0167p3.f2863O) {
                        c0167p3.l(c1001n);
                    } else {
                        c0167p3.d0();
                    }
                    C0143d.R(c0167p3, C0996i.f8757e, a3);
                    C0143d.R(c0167p3, C0996i.f8756d, m3);
                    C0995h c0995h = C0996i.f8758f;
                    if (c0167p3.f2863O || !j.a(c0167p3.G(), Integer.valueOf(i4))) {
                        A.k.o(i4, c0167p3, i4, c0995h);
                    }
                    C0143d.R(c0167p3, C0996i.f8755c, d3);
                    X0 x02 = B1.f1124a;
                    K k3 = ((A1) c0167p3.k(x02)).f1105f;
                    H0.k kVar2 = H0.k.f2600i;
                    X0 x03 = O.f1301a;
                    x1.b((String) obj6, null, ((M) c0167p3.k(x03)).f1238a, 0L, null, kVar2, null, 0L, null, null, 0L, 0, false, 0, 0, null, k3, c0167p3, 196608, 0, 65498);
                    x1.b((String) obj5, null, ((M) c0167p3.k(x03)).f1256s, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((A1) c0167p3.k(x02)).f1110k, c0167p3, 0, 0, 65530);
                    c0167p3.p(true);
                    break;
                } else {
                    c0167p3.L();
                    break;
                }
                break;
            case i.INTEGER_FIELD_NUMBER /* 3 */:
                C0167p c0167p4 = (C0167p) obj2;
                int intValue4 = ((Number) obj3).intValue();
                j.f((C0934c) obj, "$this$item");
                if ((intValue4 & 17) != 16 || !c0167p4.x()) {
                    C0855b c0855b = AbstractC0864k.f8051a;
                    C0861h c0861h = new C0861h(12);
                    q c2 = androidx.compose.foundation.layout.c.c(nVar, 1.0f);
                    Q a4 = P.a(c0861h, U.b.f4470m, c0167p4, 6);
                    int i5 = c0167p4.f2864P;
                    InterfaceC0164n0 m4 = c0167p4.m();
                    q d4 = U.a.d(c0167p4, c2);
                    InterfaceC0997j.f8759c.getClass();
                    C1001n c1001n2 = C0996i.f8754b;
                    c0167p4.U();
                    if (c0167p4.f2863O) {
                        c0167p4.l(c1001n2);
                    } else {
                        c0167p4.d0();
                    }
                    C0143d.R(c0167p4, C0996i.f8757e, a4);
                    C0143d.R(c0167p4, C0996i.f8756d, m4);
                    C0995h c0995h2 = C0996i.f8758f;
                    if (c0167p4.f2863O || !j.a(c0167p4.G(), Integer.valueOf(i5))) {
                        A.k.o(i5, c0167p4, i5, c0995h2);
                    }
                    C0143d.R(c0167p4, C0996i.f8755c, d4);
                    AbstractC0508a.k("Clients", String.valueOf(((Q1.d) ((InterfaceC0142c0) obj5).getValue()).f3972b), S.a(s3, nVar), c0167p4, 6);
                    AbstractC0508a.k("All-time", b.a(((J1.c) obj6).f3170d), S.a(s3, nVar), c0167p4, 6);
                    c0167p4.p(true);
                    break;
                } else {
                    c0167p4.L();
                    break;
                }
                break;
            default:
                C0167p c0167p5 = (C0167p) obj2;
                int intValue5 = ((Number) obj3).intValue();
                j.f((C0874v) obj, "$this$Card");
                if ((intValue5 & 17) != 16 || !c0167p5.x()) {
                    q f4 = androidx.compose.foundation.layout.b.f(androidx.compose.foundation.layout.c.c(nVar, 1.0f), 14);
                    Q a5 = P.a(AbstractC0864k.f8056f, U.b.f4471n, c0167p5, 54);
                    int i6 = c0167p5.f2864P;
                    InterfaceC0164n0 m5 = c0167p5.m();
                    q d5 = U.a.d(c0167p5, f4);
                    InterfaceC0997j.f8759c.getClass();
                    C1001n c1001n3 = C0996i.f8754b;
                    c0167p5.U();
                    if (c0167p5.f2863O) {
                        c0167p5.l(c1001n3);
                    } else {
                        c0167p5.d0();
                    }
                    C0995h c0995h3 = C0996i.f8757e;
                    C0143d.R(c0167p5, c0995h3, a5);
                    C0995h c0995h4 = C0996i.f8756d;
                    C0143d.R(c0167p5, c0995h4, m5);
                    C0995h c0995h5 = C0996i.f8758f;
                    if (c0167p5.f2863O || !j.a(c0167p5.G(), Integer.valueOf(i6))) {
                        A.k.o(i6, c0167p5, i6, c0995h5);
                    }
                    C0995h c0995h6 = C0996i.f8755c;
                    C0143d.R(c0167p5, c0995h6, d5);
                    q a6 = S.a(s3, nVar);
                    C0873u a7 = AbstractC0871s.a(AbstractC0864k.f8053c, c0167p5, 0);
                    int i7 = c0167p5.f2864P;
                    InterfaceC0164n0 m6 = c0167p5.m();
                    q d6 = U.a.d(c0167p5, a6);
                    c0167p5.U();
                    if (c0167p5.f2863O) {
                        c0167p5.l(c1001n3);
                    } else {
                        c0167p5.d0();
                    }
                    C0143d.R(c0167p5, c0995h3, a7);
                    C0143d.R(c0167p5, c0995h4, m6);
                    if (c0167p5.f2863O || !j.a(c0167p5.G(), Integer.valueOf(i7))) {
                        A.k.o(i7, c0167p5, i7, c0995h5);
                    }
                    C0143d.R(c0167p5, c0995h6, d6);
                    J1.d dVar = (J1.d) obj6;
                    x1.b(dVar.f3177c, null, 0L, 0L, null, H0.k.f2599h, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0167p5, 196608, 0, 131038);
                    String format = b.f3465a.format(new Date(dVar.f3181g));
                    StringBuilder l3 = A.k.l(format, "format(...)");
                    l3.append(dVar.f3178d);
                    l3.append(" · ");
                    l3.append(format);
                    String sb = l3.toString();
                    X0 x04 = B1.f1124a;
                    K k4 = ((A1) c0167p5.k(x04)).f1111l;
                    X0 x05 = O.f1301a;
                    x1.b(sb, null, ((M) c0167p5.k(x05)).f1256s, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, k4, c0167p5, 0, 0, 65530);
                    c0167p5.Q(-580427078);
                    if (!AbstractC0730j.K(dVar.f3180f)) {
                        x1.b(dVar.f3180f, null, ((M) c0167p5.k(x05)).f1256s, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((A1) c0167p5.k(x04)).f1111l, c0167p5, 0, 0, 65530);
                    }
                    c0167p5.p(false);
                    c0167p5.p(true);
                    x1.b(b.a(dVar.f3179e), null, ((M) c0167p5.k(x05)).f1238a, 0L, null, H0.k.f2600i, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0167p5, 196608, 0, 131034);
                    c0167p5.Q(-2028896419);
                    Q1.j jVar = (Q1.j) obj5;
                    boolean h5 = c0167p5.h(jVar) | c0167p5.f(dVar);
                    Object G5 = c0167p5.G();
                    if (h5 || G5 == obj4) {
                        G5 = new l(jVar, dVar, 2);
                        c0167p5.a0(G5);
                    }
                    c0167p5.p(false);
                    d1.d((InterfaceC0422a) G5, null, false, null, null, s.f3854a, c0167p5, 196608);
                    c0167p5.p(true);
                    break;
                } else {
                    c0167p5.L();
                    break;
                }
                break;
        }
        return yVar;
    }

    public f(C1013A c1013a, k kVar) {
        this.f3473d = 1;
        this.f3474e = c1013a;
        this.f3475f = kVar;
    }
}
