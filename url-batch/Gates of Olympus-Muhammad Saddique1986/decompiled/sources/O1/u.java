package O1;

import C0.K;
import F.A1;
import F.B1;
import F.M;
import F.O;
import F.x1;
import I.C0143d;
import I.C0167p;
import I.InterfaceC0164n0;
import I.X0;
import e2.InterfaceC0427f;
import h2.AbstractC0508a;
import java.util.Date;
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
public final class u implements InterfaceC0427f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3870d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3871e;

    public /* synthetic */ u(int i3, Object obj) {
        this.f3870d = i3;
        this.f3871e = obj;
    }

    @Override // e2.InterfaceC0427f
    public final Object g(Object obj, Object obj2, Object obj3) {
        S s3 = S.f7990a;
        R1.y yVar = R1.y.f4171a;
        Object obj4 = this.f3871e;
        U.n nVar = U.n.f4488a;
        switch (this.f3870d) {
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
                    J1.c cVar = (J1.c) obj4;
                    AbstractC0508a.k("Earned today", M1.b.a(cVar.f3167a), S.a(s3, nVar), c0167p, 6);
                    AbstractC0508a.k("Cuts today", String.valueOf(cVar.f3171e), S.a(s3, nVar), c0167p, 6);
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
                    J1.c cVar2 = (J1.c) obj4;
                    AbstractC0508a.k("This week", M1.b.a(cVar2.f3168b), S.a(s3, nVar), c0167p2, 6);
                    AbstractC0508a.k("This month", M1.b.a(cVar2.f3169c), S.a(s3, nVar), c0167p2, 6);
                    c0167p2.p(true);
                    break;
                } else {
                    c0167p2.L();
                    break;
                }
                break;
            default:
                C0167p c0167p3 = (C0167p) obj2;
                int intValue3 = ((Number) obj3).intValue();
                f2.j.f((C0874v) obj, "$this$Card");
                if ((intValue3 & 17) != 16 || !c0167p3.x()) {
                    U.q f3 = androidx.compose.foundation.layout.b.f(androidx.compose.foundation.layout.c.c(nVar, 1.0f), 14);
                    Q a5 = P.a(AbstractC0864k.f8056f, U.b.f4470m, c0167p3, 6);
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
                    C0995h c0995h3 = C0996i.f8757e;
                    C0143d.R(c0167p3, c0995h3, a5);
                    C0995h c0995h4 = C0996i.f8756d;
                    C0143d.R(c0167p3, c0995h4, m5);
                    C0995h c0995h5 = C0996i.f8758f;
                    if (c0167p3.f2863O || !f2.j.a(c0167p3.G(), Integer.valueOf(i5))) {
                        A.k.o(i5, c0167p3, i5, c0995h5);
                    }
                    C0995h c0995h6 = C0996i.f8755c;
                    C0143d.R(c0167p3, c0995h6, d5);
                    C0873u a6 = AbstractC0871s.a(AbstractC0864k.f8053c, c0167p3, 0);
                    int i6 = c0167p3.f2864P;
                    InterfaceC0164n0 m6 = c0167p3.m();
                    U.q d6 = U.a.d(c0167p3, nVar);
                    c0167p3.U();
                    if (c0167p3.f2863O) {
                        c0167p3.l(c1001n3);
                    } else {
                        c0167p3.d0();
                    }
                    C0143d.R(c0167p3, c0995h3, a6);
                    C0143d.R(c0167p3, c0995h4, m6);
                    if (c0167p3.f2863O || !f2.j.a(c0167p3.G(), Integer.valueOf(i6))) {
                        A.k.o(i6, c0167p3, i6, c0995h5);
                    }
                    C0143d.R(c0167p3, c0995h6, d6);
                    J1.d dVar = (J1.d) obj4;
                    x1.b(dVar.f3177c, null, 0L, 0L, null, H0.k.f2599h, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0167p3, 196608, 0, 131038);
                    String format = M1.b.f3465a.format(new Date(dVar.f3181g));
                    StringBuilder l3 = A.k.l(format, "format(...)");
                    l3.append(dVar.f3178d);
                    l3.append(" · ");
                    l3.append(format);
                    String sb = l3.toString();
                    K k3 = ((A1) c0167p3.k(B1.f1124a)).f1111l;
                    X0 x02 = O.f1301a;
                    x1.b(sb, null, ((M) c0167p3.k(x02)).f1256s, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, k3, c0167p3, 0, 0, 65530);
                    c0167p3.p(true);
                    x1.b(M1.b.a(dVar.f3179e), null, ((M) c0167p3.k(x02)).f1238a, 0L, null, H0.k.f2600i, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0167p3, 196608, 0, 131034);
                    c0167p3.p(true);
                    break;
                } else {
                    c0167p3.L();
                    break;
                }
                break;
        }
        return yVar;
    }
}
