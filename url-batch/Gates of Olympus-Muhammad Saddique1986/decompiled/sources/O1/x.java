package O1;

import F.M;
import F.O;
import F.d1;
import I.C0143d;
import I.C0167p;
import I.InterfaceC0142c0;
import I.InterfaceC0164n0;
import e2.InterfaceC0427f;
import h2.AbstractC0508a;
import r.AbstractC0864k;
import r.AbstractC0871s;
import r.C0855b;
import r.C0861h;
import r.C0873u;
import r.C0874v;
import r.P;
import r.Q;
import r.S;
import s.C0934c;
import t0.C0995h;
import t0.C0996i;
import t0.C1001n;
import t0.InterfaceC0997j;

/* loaded from: classes.dex */
public final class x implements InterfaceC0427f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3877d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0142c0 f3878e;

    public /* synthetic */ x(InterfaceC0142c0 interfaceC0142c0, int i3) {
        this.f3877d = i3;
        this.f3878e = interfaceC0142c0;
    }

    @Override // e2.InterfaceC0427f
    public final Object g(Object obj, Object obj2, Object obj3) {
        S s3 = S.f7990a;
        U.n nVar = U.n.f4488a;
        R1.y yVar = R1.y.f4171a;
        InterfaceC0142c0 interfaceC0142c0 = this.f3878e;
        switch (this.f3877d) {
            case 0:
                C0167p c0167p = (C0167p) obj2;
                int intValue = ((Number) obj3).intValue();
                f2.j.f((C0934c) obj, "$this$item");
                if ((intValue & 17) != 16 || !c0167p.x()) {
                    C0855b c0855b = AbstractC0864k.f8051a;
                    C0861h c0861h = new C0861h(12);
                    U.q c2 = androidx.compose.foundation.layout.c.c(nVar, 1.0f);
                    Q a3 = P.a(c0861h, U.b.f4470m, c0167p, 6);
                    int i3 = c0167p.f2864P;
                    InterfaceC0164n0 m3 = c0167p.m();
                    U.q d3 = U.a.d(c0167p, c2);
                    InterfaceC0997j.f8759c.getClass();
                    C1001n c1001n = C0996i.f8754b;
                    c0167p.U();
                    if (c0167p.f2863O) {
                        c0167p.l(c1001n);
                    } else {
                        c0167p.d0();
                    }
                    C0143d.R(c0167p, C0996i.f8757e, a3);
                    C0143d.R(c0167p, C0996i.f8756d, m3);
                    C0995h c0995h = C0996i.f8758f;
                    if (c0167p.f2863O || !f2.j.a(c0167p.G(), Integer.valueOf(i3))) {
                        A.k.o(i3, c0167p, i3, c0995h);
                    }
                    C0143d.R(c0167p, C0996i.f8755c, d3);
                    AbstractC0508a.k("All-time", M1.b.a(((J1.c) interfaceC0142c0.getValue()).f3170d), S.a(s3, nVar), c0167p, 6);
                    AbstractC0508a.k("This month", M1.b.a(((J1.c) interfaceC0142c0.getValue()).f3169c), S.a(s3, nVar), c0167p, 6);
                    c0167p.p(true);
                    break;
                } else {
                    c0167p.L();
                    break;
                }
                break;
            case 1:
                C0167p c0167p2 = (C0167p) obj2;
                int intValue2 = ((Number) obj3).intValue();
                f2.j.f((C0934c) obj, "$this$item");
                if ((intValue2 & 17) != 16 || !c0167p2.x()) {
                    C0855b c0855b2 = AbstractC0864k.f8051a;
                    C0861h c0861h2 = new C0861h(12);
                    U.q c3 = androidx.compose.foundation.layout.c.c(nVar, 1.0f);
                    Q a4 = P.a(c0861h2, U.b.f4470m, c0167p2, 6);
                    int i4 = c0167p2.f2864P;
                    InterfaceC0164n0 m4 = c0167p2.m();
                    U.q d4 = U.a.d(c0167p2, c3);
                    InterfaceC0997j.f8759c.getClass();
                    C1001n c1001n2 = C0996i.f8754b;
                    c0167p2.U();
                    if (c0167p2.f2863O) {
                        c0167p2.l(c1001n2);
                    } else {
                        c0167p2.d0();
                    }
                    C0143d.R(c0167p2, C0996i.f8757e, a4);
                    C0143d.R(c0167p2, C0996i.f8756d, m4);
                    C0995h c0995h2 = C0996i.f8758f;
                    if (c0167p2.f2863O || !f2.j.a(c0167p2.G(), Integer.valueOf(i4))) {
                        A.k.o(i4, c0167p2, i4, c0995h2);
                    }
                    C0143d.R(c0167p2, C0996i.f8755c, d4);
                    AbstractC0508a.k("Avg / cut", M1.b.a(((J1.c) interfaceC0142c0.getValue()).f3173g), S.a(s3, nVar), c0167p2, 6);
                    AbstractC0508a.k("Cuts this month", String.valueOf(((J1.c) interfaceC0142c0.getValue()).f3172f), S.a(s3, nVar), c0167p2, 6);
                    c0167p2.p(true);
                    break;
                } else {
                    c0167p2.L();
                    break;
                }
                break;
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                C0167p c0167p3 = (C0167p) obj2;
                int intValue3 = ((Number) obj3).intValue();
                f2.j.f((C0874v) obj, "$this$Card");
                if ((intValue3 & 17) != 16 || !c0167p3.x()) {
                    U.q f3 = androidx.compose.foundation.layout.b.f(nVar, 16);
                    C0873u a5 = AbstractC0871s.a(AbstractC0864k.f8053c, c0167p3, 0);
                    int i5 = c0167p3.f2864P;
                    InterfaceC0164n0 m5 = c0167p3.m();
                    U.q d5 = U.a.d(c0167p3, f3);
                    InterfaceC0997j.f8759c.getClass();
                    C1001n c1001n3 = C0996i.f8754b;
                    c0167p3.U();
                    if (c0167p3.f2863O) {
                        c0167p3.l(c1001n3);
                    } else {
                        c0167p3.d0();
                    }
                    C0143d.R(c0167p3, C0996i.f8757e, a5);
                    C0143d.R(c0167p3, C0996i.f8756d, m5);
                    C0995h c0995h3 = C0996i.f8758f;
                    if (c0167p3.f2863O || !f2.j.a(c0167p3.G(), Integer.valueOf(i5))) {
                        A.k.o(i5, c0167p3, i5, c0995h3);
                    }
                    C0143d.R(c0167p3, C0996i.f8755c, d5);
                    AbstractC0508a.f("Today", M1.b.a(((J1.c) interfaceC0142c0.getValue()).f3167a), c0167p3, 6);
                    AbstractC0508a.f("This week", M1.b.a(((J1.c) interfaceC0142c0.getValue()).f3168b), c0167p3, 6);
                    AbstractC0508a.f("This month", M1.b.a(((J1.c) interfaceC0142c0.getValue()).f3169c), c0167p3, 6);
                    c0167p3.p(true);
                    break;
                } else {
                    c0167p3.L();
                    break;
                }
                break;
            default:
                C0167p c0167p4 = (C0167p) obj2;
                int intValue4 = ((Number) obj3).intValue();
                f2.j.f((C0934c) obj, "$this$item");
                if ((intValue4 & 17) != 16 || !c0167p4.x()) {
                    d1.c(null, null, d1.f(((M) c0167p4.k(O.f1301a)).f1253p, c0167p4), null, null, Q.f.b(-637833642, new x(interfaceC0142c0, 2), c0167p4), c0167p4, 196608, 27);
                    break;
                } else {
                    c0167p4.L();
                    break;
                }
                break;
        }
        return yVar;
    }
}
