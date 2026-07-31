package B;

import F.AbstractC0110n0;
import I.C0143d;
import I.C0159l;
import I.C0167p;
import I.InterfaceC0142c0;
import I.InterfaceC0164n0;
import I.W0;
import a.AbstractC0235a;
import a0.C0238c;
import androidx.compose.ui.semantics.ClearAndSetSemanticsElement;
import e2.InterfaceC0422a;
import e2.InterfaceC0424c;
import e2.InterfaceC0427f;
import java.util.concurrent.atomic.AtomicInteger;
import m.C0630o;
import m.l0;
import r.AbstractC0856c;
import r.AbstractC0864k;
import r.C0842D;
import r.C0875w;
import r0.AbstractC0893O;
import r0.InterfaceC0884F;
import r0.InterfaceC0887I;
import t0.C0995h;
import t0.C0996i;
import t0.C1001n;
import t0.InterfaceC0997j;
import u0.AbstractC1101g0;
import x.o0;

/* loaded from: classes.dex */
public final class h0 extends f2.k implements InterfaceC0427f {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f408e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f409f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0(int i3, Object obj) {
        super(3);
        this.f408e = i3;
        this.f409f = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0205, code lost:
    
        if (r9.booleanValue() == false) goto L64;
     */
    @Override // e2.InterfaceC0427f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(Object obj, Object obj2, Object obj3) {
        long a3;
        long a4;
        long j3 = 0;
        R1.y yVar = R1.y.f4171a;
        S1.v vVar = S1.v.f4321d;
        I.W w2 = C0159l.f2829a;
        int i3 = 0;
        Object obj4 = this.f409f;
        switch (this.f408e) {
            case 0:
                U.q qVar = (U.q) obj;
                C0167p c0167p = (C0167p) obj2;
                ((Number) obj3).intValue();
                c0167p.Q(1980580247);
                O0.b bVar = (O0.b) c0167p.k(AbstractC1101g0.f9354f);
                Object G3 = c0167p.G();
                if (G3 == w2) {
                    G3 = C0143d.K(new O0.j(0L), I.W.f2783i);
                    c0167p.a0(G3);
                }
                InterfaceC0142c0 interfaceC0142c0 = (InterfaceC0142c0) G3;
                a0 a0Var = (a0) obj4;
                boolean h3 = c0167p.h(a0Var);
                Object G4 = c0167p.G();
                if (h3 || G4 == w2) {
                    G4 = new f0(a0Var, 0, interfaceC0142c0);
                    c0167p.a0(G4);
                }
                InterfaceC0422a interfaceC0422a = (InterfaceC0422a) G4;
                boolean f3 = c0167p.f(bVar);
                Object G5 = c0167p.G();
                if (f3 || G5 == w2) {
                    G5 = new g0(bVar, interfaceC0142c0, r8);
                    c0167p.a0(G5);
                }
                C0630o c0630o = N.f302a;
                U.q b3 = U.a.b(qVar, new I(interfaceC0422a, i3, (InterfaceC0424c) G5));
                c0167p.p(false);
                return b3;
            case 1:
                C0167p c0167p2 = (C0167p) obj2;
                ((Number) obj3).intValue();
                F.F f4 = F.F.f1141g;
                AtomicInteger atomicInteger = A0.k.f132a;
                ClearAndSetSemanticsElement clearAndSetSemanticsElement = new ClearAndSetSemanticsElement(f4);
                r.Q a5 = r.P.a(AbstractC0864k.f8051a, U.b.f4470m, c0167p2, 0);
                int i4 = c0167p2.f2864P;
                InterfaceC0164n0 m3 = c0167p2.m();
                U.q d3 = U.a.d(c0167p2, clearAndSetSemanticsElement);
                InterfaceC0997j.f8759c.getClass();
                C1001n c1001n = C0996i.f8754b;
                c0167p2.U();
                if (c0167p2.f2863O) {
                    c0167p2.l(c1001n);
                } else {
                    c0167p2.d0();
                }
                C0143d.R(c0167p2, C0996i.f8757e, a5);
                C0143d.R(c0167p2, C0996i.f8756d, m3);
                C0995h c0995h = C0996i.f8758f;
                if (c0167p2.f2863O || !f2.j.a(c0167p2.G(), Integer.valueOf(i4))) {
                    A.k.o(i4, c0167p2, i4, c0995h);
                }
                C0143d.R(c0167p2, C0996i.f8755c, d3);
                float f5 = AbstractC0110n0.f1690a;
                AbstractC0856c.a(c0167p2, androidx.compose.foundation.layout.c.l());
                ((Q.a) obj4).h(c0167p2, 0);
                c0167p2.p(true);
                return yVar;
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                AbstractC0893O b4 = ((InterfaceC0884F) obj2).b(((O0.a) obj3).f3725a);
                return ((InterfaceC0887I) obj).i0(b4.f8126d, b4.f8127e, vVar, new C0022x(b4, 19, (l.w) obj4));
            case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                InterfaceC0887I interfaceC0887I = (InterfaceC0887I) obj;
                AbstractC0893O b5 = ((InterfaceC0884F) obj2).b(((O0.a) obj3).f3725a);
                if (interfaceC0887I.D()) {
                    Boolean bool = (Boolean) ((l0) obj4).f6839d.getValue();
                    bool.booleanValue();
                    break;
                }
                j3 = O2.d.d(b5.f8126d, b5.f8127e);
                return interfaceC0887I.i0((int) (j3 >> 32), (int) (j3 & 4294967295L), vVar, new A.i(b5, 4));
            case k1.i.LONG_FIELD_NUMBER /* 4 */:
                long j4 = ((C0238c) obj3).f4722a;
                ((B) obj4).f267f.c(((n0.s) obj2).f7310c);
                return yVar;
            case 5:
                C0167p c0167p3 = (C0167p) obj2;
                ((Number) obj3).intValue();
                c0167p3.Q(-1608161351);
                InterfaceC0424c interfaceC0424c = (InterfaceC0424c) obj4;
                boolean f6 = c0167p3.f(interfaceC0424c);
                Object G6 = c0167p3.G();
                if (f6 || G6 == w2) {
                    G6 = new C0875w(interfaceC0424c);
                    c0167p3.a0(G6);
                }
                C0875w c0875w = (C0875w) G6;
                c0167p3.p(false);
                return c0875w;
            case 6:
                C0167p c0167p4 = (C0167p) obj2;
                ((Number) obj3).intValue();
                c0167p4.Q(-1415685722);
                r.X x3 = (r.X) obj4;
                boolean f7 = c0167p4.f(x3);
                Object G7 = c0167p4.G();
                if (f7 || G7 == w2) {
                    G7 = new C0842D(x3);
                    c0167p4.a0(G7);
                }
                C0842D c0842d = (C0842D) G7;
                c0167p4.p(false);
                return c0842d;
            case k1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                long j5 = ((O0.a) obj3).f3725a;
                long j6 = ((o0) obj4).f10210f;
                AbstractC0893O b6 = ((InterfaceC0884F) obj2).b(O0.a.a(j5, O2.d.y((int) (j6 >> 32), O0.a.j(j5), O0.a.h(j5)), 0, O2.d.y((int) (j6 & 4294967295L), O0.a.i(j5), O0.a.g(j5)), 0, 10));
                return ((InterfaceC0887I) obj).i0(b6.f8126d, b6.f8127e, vVar, new A.i(b6, 12));
            default:
                C0167p c0167p5 = (C0167p) obj2;
                ((Number) obj3).intValue();
                c0167p5.Q(1582736677);
                O0.b bVar2 = (O0.b) c0167p5.k(AbstractC1101g0.f9354f);
                H0.d dVar = (H0.d) c0167p5.k(AbstractC1101g0.f9357i);
                O0.k kVar = (O0.k) c0167p5.k(AbstractC1101g0.f9360l);
                C0.K k3 = (C0.K) obj4;
                boolean f8 = c0167p5.f(k3) | c0167p5.f(kVar);
                Object G8 = c0167p5.G();
                if (f8 || G8 == w2) {
                    G8 = AbstractC0235a.G(k3, kVar);
                    c0167p5.a0(G8);
                }
                C0.K k4 = (C0.K) G8;
                boolean f9 = c0167p5.f(dVar) | c0167p5.f(k4);
                Object G9 = c0167p5.G();
                if (f9 || G9 == w2) {
                    C0.D d4 = k4.f571a;
                    H0.q qVar2 = d4.f530f;
                    H0.k kVar2 = d4.f527c;
                    if (kVar2 == null) {
                        kVar2 = H0.k.f2597f;
                    }
                    H0.i iVar = d4.f528d;
                    int i5 = iVar != null ? iVar.f2594a : 0;
                    H0.j jVar = d4.f529e;
                    G9 = ((H0.e) dVar).b(qVar2, kVar2, i5, jVar != null ? jVar.f2595a : 1);
                    c0167p5.a0(G9);
                }
                W0 w02 = (W0) G9;
                Object G10 = c0167p5.G();
                Object obj5 = G10;
                if (G10 == w2) {
                    Object value = w02.getValue();
                    o0 o0Var = new o0();
                    o0Var.f10205a = kVar;
                    o0Var.f10206b = bVar2;
                    o0Var.f10207c = dVar;
                    o0Var.f10208d = k3;
                    o0Var.f10209e = value;
                    a4 = x.c0.a(k3, bVar2, dVar, x.c0.f10059a, 1);
                    o0Var.f10210f = a4;
                    c0167p5.a0(o0Var);
                    obj5 = o0Var;
                }
                o0 o0Var2 = (o0) obj5;
                Object value2 = w02.getValue();
                if (kVar != o0Var2.f10205a || !f2.j.a(bVar2, o0Var2.f10206b) || !f2.j.a(dVar, o0Var2.f10207c) || !f2.j.a(k4, o0Var2.f10208d) || !f2.j.a(value2, o0Var2.f10209e)) {
                    o0Var2.f10205a = kVar;
                    o0Var2.f10206b = bVar2;
                    o0Var2.f10207c = dVar;
                    o0Var2.f10208d = k4;
                    o0Var2.f10209e = value2;
                    a3 = x.c0.a(k4, bVar2, dVar, x.c0.f10059a, 1);
                    o0Var2.f10210f = a3;
                }
                U.n nVar = U.n.f4488a;
                boolean h4 = c0167p5.h(o0Var2);
                Object G11 = c0167p5.G();
                if (h4 || G11 == w2) {
                    G11 = new h0(7, o0Var2);
                    c0167p5.a0(G11);
                }
                U.q b7 = androidx.compose.ui.layout.a.b(nVar, (InterfaceC0427f) G11);
                c0167p5.p(false);
                return b7;
        }
    }
}
