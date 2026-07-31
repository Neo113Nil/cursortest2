package F;

import H2.AbstractC0080b;
import I.C0089d;
import I.C0105l;
import I.C0113p;
import I.InterfaceC0110n0;
import J.C0134a;
import J.C0135b;
import e2.AbstractC0381e;
import f.AbstractC0382a;
import h.AbstractC0416e;
import h1.C0438i;
import java.util.ArrayList;
import l.C0558c;
import l.C0564i;
import q1.C0784h;
import r.AbstractC0801M;
import r.AbstractC0813j;
import r.AbstractC0818o;
import r.C0802N;
import r.C0803O;
import r.C0807d;
import r.C0810g;
import r.InterfaceC0796H;
import r.InterfaceC0808e;
import r0.C0842o;
import r1.C0856h;
import t.C0891a;
import t0.C0900h;
import t0.C0901i;
import t0.C0906n;
import t0.InterfaceC0902j;
import u.C0950s;
import u.C0951t;
import u.InterfaceC0953v;
import w.C1019a;

/* renamed from: F.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0060q extends Z1.j implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1336e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f1337f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f1338g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0060q(Object obj, int i3, Object obj2) {
        super(2);
        this.f1336e = i3;
        this.f1338g = obj;
        this.f1337f = obj2;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        U.l g3;
        C0803O c0803o = C0803O.f7016a;
        I.X x3 = C0105l.f2272a;
        L1.z zVar = L1.z.f2729a;
        int i3 = 2;
        Object obj3 = this.f1337f;
        Object obj4 = this.f1338g;
        int i4 = 3;
        switch (this.f1336e) {
            case 0:
                C0113p c0113p = (C0113p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0113p.x()) {
                    c0113p.L();
                } else {
                    U.l k3 = androidx.compose.foundation.layout.a.k(androidx.compose.foundation.layout.a.f(U.i.f3302a, AbstractC0048k.f1276b, AbstractC0048k.f1277c), (InterfaceC0796H) obj4);
                    C0802N a3 = AbstractC0801M.a(AbstractC0813j.f7065e, U.a.f3290n, c0113p, 54);
                    int i5 = c0113p.f2306P;
                    InterfaceC0110n0 m3 = c0113p.m();
                    U.l c3 = U.m.c(c0113p, k3);
                    InterfaceC0902j.f7933c.getClass();
                    C0906n c0906n = C0901i.f7920b;
                    c0113p.U();
                    if (c0113p.f2305O) {
                        c0113p.l(c0906n);
                    } else {
                        c0113p.d0();
                    }
                    C0089d.Q(c0113p, C0901i.f7923e, a3);
                    C0089d.Q(c0113p, C0901i.f7922d, m3);
                    C0900h c0900h = C0901i.f7924f;
                    if (c0113p.f2305O || !Z1.i.a(c0113p.G(), Integer.valueOf(i5))) {
                        AbstractC0080b.p(i5, c0113p, i5, c0900h);
                    }
                    C0089d.Q(c0113p, C0901i.f7921c, c3);
                    ((Q.a) obj3).f(c0803o, c0113p, 6);
                    c0113p.p(true);
                }
                return zVar;
            case 1:
                C0113p c0113p2 = (C0113p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0113p2.x()) {
                    c0113p2.L();
                } else {
                    X0.a(((a1) obj4).f1193j, (Q.a) obj3, c0113p2, 0);
                }
                return zVar;
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                C0113p c0113p3 = (C0113p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0113p3.x()) {
                    c0113p3.L();
                } else {
                    g3 = androidx.compose.foundation.layout.a.g(U.i.f3302a, 1.0f);
                    s0.h hVar = r.X.f7049a;
                    U.l a4 = z0.k.a(androidx.compose.foundation.layout.a.f(g3.e(new U.g(new C0558c(i3, (r.U) obj4))), Float.NaN, AbstractC0062r0.f1356a), C1019a.f8573e);
                    C0807d c0807d = AbstractC0813j.f7061a;
                    C0802N a5 = AbstractC0801M.a(new C0810g(AbstractC0062r0.f1357b), U.a.f3290n, c0113p3, 54);
                    int i6 = c0113p3.f2306P;
                    InterfaceC0110n0 m4 = c0113p3.m();
                    U.l c4 = U.m.c(c0113p3, a4);
                    InterfaceC0902j.f7933c.getClass();
                    C0906n c0906n2 = C0901i.f7920b;
                    c0113p3.U();
                    if (c0113p3.f2305O) {
                        c0113p3.l(c0906n2);
                    } else {
                        c0113p3.d0();
                    }
                    C0089d.Q(c0113p3, C0901i.f7923e, a5);
                    C0089d.Q(c0113p3, C0901i.f7922d, m4);
                    C0900h c0900h2 = C0901i.f7924f;
                    if (c0113p3.f2305O || !Z1.i.a(c0113p3.G(), Integer.valueOf(i6))) {
                        AbstractC0080b.p(i6, c0113p3, i6, c0900h2);
                    }
                    C0089d.Q(c0113p3, C0901i.f7921c, c4);
                    ((Q.a) obj3).f(c0803o, c0113p3, 6);
                    c0113p3.p(true);
                }
                return zVar;
            case C0438i.INTEGER_FIELD_NUMBER /* 3 */:
                C0113p c0113p4 = (C0113p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0113p4.x()) {
                    c0113p4.L();
                } else {
                    U.l c5 = androidx.compose.ui.layout.a.c("indicator");
                    I.X0 x02 = (I.X0) obj4;
                    boolean f3 = c0113p4.f(x02);
                    Object G3 = c0113p4.G();
                    if (f3 || G3 == x3) {
                        G3 = new C0047j0(r6, x02);
                        c0113p4.a0(G3);
                    }
                    U.l a6 = androidx.compose.ui.graphics.a.a(c5, (Y1.c) G3);
                    long j3 = ((C0043h0) obj3).f1255c;
                    float f4 = H.h.f1694a;
                    AbstractC0818o.a(androidx.compose.foundation.a.a(a6, j3, P0.a(5, c0113p4)), c0113p4, 0);
                }
                return zVar;
            case C0438i.LONG_FIELD_NUMBER /* 4 */:
                long j4 = ((a0.c) obj2).f3489a;
                AbstractC0381e.k((o0.c) obj4, (n0.m) obj);
                m2.e eVar = ((o.g0) obj3).f6526w;
                if (eVar != null) {
                    eVar.g(new o.r(j4));
                }
                return zVar;
            case 5:
                C0113p c0113p5 = (C0113p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0113p5.x()) {
                    c0113p5.L();
                } else {
                    Boolean bool = (Boolean) ((C0842o) obj4).f7156f.getValue();
                    boolean booleanValue = bool.booleanValue();
                    c0113p5.T(bool);
                    boolean g4 = c0113p5.g(booleanValue);
                    c0113p5.Q(-869707859);
                    if (booleanValue) {
                        ((Y1.e) obj3).g(c0113p5, 0);
                    } else {
                        if ((c0113p5.f2317k != 0 ? 0 : 1) == 0) {
                            C0089d.w("No nodes can be emitted before calling dactivateToEndGroup");
                            throw null;
                        }
                        if (!c0113p5.f2305O) {
                            if (g4) {
                                I.F0 f02 = c0113p5.f2296F;
                                int i7 = f02.f2107g;
                                int i8 = f02.f2108h;
                                C0135b c0135b = c0113p5.f2302L;
                                c0135b.getClass();
                                c0135b.d(false);
                                C0134a c0134a = c0135b.f2539b;
                                c0134a.getClass();
                                c0134a.f2537f.Z(J.f.f2554c);
                                C0089d.q(c0113p5.f2323r, i7, i8);
                                c0113p5.f2296F.m();
                            } else {
                                c0113p5.K();
                            }
                        }
                    }
                    c0113p5.p(false);
                    if (c0113p5.f2329x && c0113p5.f2296F.f2109i == c0113p5.f2330y) {
                        c0113p5.f2330y = -1;
                        c0113p5.f2329x = false;
                    }
                    c0113p5.p(false);
                }
                return zVar;
            case 6:
                C0113p c0113p6 = (C0113p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0113p6.x()) {
                    c0113p6.L();
                } else {
                    ((r1.o) obj4).f7246n.f((C0784h) obj3, c0113p6, 0);
                }
                return zVar;
            case C0438i.DOUBLE_FIELD_NUMBER /* 7 */:
                C0113p c0113p7 = (C0113p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0113p7.x()) {
                    c0113p7.L();
                } else {
                    AbstractC0381e.i((R.i) obj4, (Q.a) obj3, c0113p7, 0);
                }
                return zVar;
            case 8:
                C0113p c0113p8 = (C0113p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0113p8.x()) {
                    c0113p8.L();
                } else {
                    C0784h c0784h = (C0784h) obj4;
                    q1.w wVar = c0784h.f6895e;
                    Z1.i.d(wVar, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                    ((C0856h) wVar).f7218m.e((C0564i) obj3, c0784h, c0113p8, 0);
                }
                return zVar;
            case AbstractC0382a.f4777a /* 9 */:
                M0.b bVar = (M0.b) obj;
                long j5 = ((M0.a) obj2).f2760a;
                if (M0.a.h(j5) == Integer.MAX_VALUE) {
                    throw new IllegalArgumentException("LazyVerticalGrid's width should be bound by parent.");
                }
                M0.j jVar = M0.j.f2775d;
                InterfaceC0796H interfaceC0796H = (InterfaceC0796H) obj4;
                int h3 = M0.a.h(j5) - bVar.k(androidx.compose.foundation.layout.a.d(interfaceC0796H, jVar) + androidx.compose.foundation.layout.a.e(interfaceC0796H, jVar));
                InterfaceC0808e interfaceC0808e = (InterfaceC0808e) obj3;
                int k4 = h3 - (bVar.k(interfaceC0808e.a()) * 2);
                int i9 = k4 / 3;
                int i10 = k4 % 3;
                ArrayList arrayList = new ArrayList(3);
                int i11 = 0;
                while (i11 < 3) {
                    arrayList.add(Integer.valueOf((i11 < i10 ? 1 : 0) + i9));
                    i11++;
                }
                int[] B02 = M1.l.B0(arrayList);
                int[] iArr = new int[B02.length];
                interfaceC0808e.b(bVar, h3, B02, jVar, iArr);
                return new t.s(B02, iArr);
            case AbstractC0382a.f4779c /* 10 */:
                C0113p c0113p9 = (C0113p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0113p9.x()) {
                    c0113p9.L();
                } else {
                    C0951t c0951t = (C0951t) obj4;
                    InterfaceC0953v interfaceC0953v = (InterfaceC0953v) c0951t.f8091b.b();
                    C0950s c0950s = (C0950s) obj3;
                    int i12 = c0950s.f8087c;
                    int a7 = interfaceC0953v.a();
                    Object obj5 = c0950s.f8085a;
                    if ((i12 >= a7 || !interfaceC0953v.c(i12).equals(obj5)) && (i12 = interfaceC0953v.b(obj5)) != -1) {
                        c0950s.f8087c = i12;
                    }
                    int i13 = i12;
                    if (i13 != -1) {
                        c0113p9.Q(-660479623);
                        AbstractC0416e.k(interfaceC0953v, c0951t.f8090a, i13, c0950s.f8085a, c0113p9, 0);
                        c0113p9.p(false);
                    } else {
                        c0113p9.Q(-660272047);
                        c0113p9.p(false);
                    }
                    boolean h4 = c0113p9.h(c0950s);
                    Object G4 = c0113p9.G();
                    if (h4 || G4 == x3) {
                        G4 = new t.x(i4, c0950s);
                        c0113p9.a0(G4);
                    }
                    C0089d.c(obj5, (Y1.c) G4, c0113p9);
                }
                return zVar;
            case 11:
                return (r0.B) ((Y1.e) obj3).g(new u.y((C0951t) obj4, (r0.Q) obj), new M0.a(((M0.a) obj2).f2760a));
            default:
                C0113p c0113p10 = (C0113p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0113p10.x()) {
                    c0113p10.L();
                } else {
                    u.P p = (u.P) obj4;
                    p.f8032b.setValue(I2.l.N(c0113p10));
                    ((Q.a) obj3).f(p, c0113p10, 0);
                }
                return zVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0060q(InterfaceC0796H interfaceC0796H, C0891a c0891a, InterfaceC0808e interfaceC0808e) {
        super(2);
        this.f1336e = 9;
        this.f1338g = interfaceC0796H;
        this.f1337f = interfaceC0808e;
    }
}
