package B;

import I.C0143d;
import I.C0159l;
import I.C0167p;
import I.C0184y;
import I.InterfaceC0142c0;
import I.W0;
import a0.C0238c;
import android.graphics.Typeface;
import android.text.Spannable;
import e2.InterfaceC0422a;
import e2.InterfaceC0424c;
import e2.InterfaceC0426e;
import e2.InterfaceC0427f;
import m.C0619d;
import m.C0628m;
import o.C0740b;
import o0.C0744c;
import p.C0758d0;
import p.C0776m0;
import p.C0788t;
import q2.AbstractC0837y;

/* loaded from: classes.dex */
public final class I extends f2.k implements InterfaceC0427f {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f287e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f288f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f289g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(InterfaceC0424c interfaceC0424c, q.k kVar) {
        super(3);
        this.f287e = 5;
        this.f289g = interfaceC0424c;
        this.f288f = kVar;
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [e2.c, f2.k] */
    @Override // e2.InterfaceC0427f
    public final Object g(Object obj, Object obj2, Object obj3) {
        Typeface typeface;
        switch (this.f287e) {
            case 0:
                C0167p c0167p = (C0167p) obj2;
                ((Number) obj3).intValue();
                c0167p.Q(759876635);
                Object G3 = c0167p.G();
                I.W w2 = C0159l.f2829a;
                if (G3 == w2) {
                    G3 = C0143d.D((InterfaceC0422a) this.f288f);
                    c0167p.a0(G3);
                }
                W0 w02 = (W0) G3;
                Object G4 = c0167p.G();
                if (G4 == w2) {
                    G4 = new C0619d(new C0238c(((C0238c) w02.getValue()).f4722a), N.f303b, new C0238c(N.f304c), 8);
                    c0167p.a0(G4);
                }
                C0619d c0619d = (C0619d) G4;
                R1.y yVar = R1.y.f4171a;
                boolean h3 = c0167p.h(c0619d);
                Object G5 = c0167p.G();
                if (h3 || G5 == w2) {
                    G5 = new M(w02, c0619d, null);
                    c0167p.a0(G5);
                }
                C0143d.e(c0167p, (InterfaceC0426e) G5, yVar);
                C0628m c0628m = c0619d.f6759c;
                boolean f3 = c0167p.f(c0628m);
                Object G6 = c0167p.G();
                if (f3 || G6 == w2) {
                    G6 = new H(c0628m, 0);
                    c0167p.a0(G6);
                }
                U.q qVar = (U.q) ((InterfaceC0424c) this.f289g).n((InterfaceC0422a) G6);
                c0167p.p(false);
                return qVar;
            case 1:
                C0.D d3 = (C0.D) obj;
                int intValue = ((Number) obj2).intValue();
                int intValue2 = ((Number) obj3).intValue();
                H0.q qVar2 = d3.f530f;
                H0.k kVar = d3.f527c;
                if (kVar == null) {
                    kVar = H0.k.f2597f;
                }
                H0.i iVar = d3.f528d;
                int i3 = iVar != null ? iVar.f2594a : 0;
                H0.j jVar = d3.f529e;
                int i4 = jVar != null ? jVar.f2595a : 1;
                K0.c cVar = (K0.c) ((A1.b) this.f289g).f200f;
                H0.s b3 = ((H0.e) cVar.f3233e).b(qVar2, kVar, i3, i4);
                if (b3 instanceof H0.s) {
                    Object obj4 = b3.f2611d;
                    f2.j.d(obj4, "null cannot be cast to non-null type android.graphics.Typeface");
                    typeface = (Typeface) obj4;
                } else {
                    G1.m mVar = new G1.m(b3, cVar.f3238j);
                    cVar.f3238j = mVar;
                    Object obj5 = mVar.f2118d;
                    f2.j.d(obj5, "null cannot be cast to non-null type android.graphics.Typeface");
                    typeface = (Typeface) obj5;
                }
                ((Spannable) this.f288f).setSpan(new F0.b(1, typeface), intValue, intValue2, 33);
                return R1.y.f4171a;
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                C0167p c0167p2 = (C0167p) obj2;
                ((Number) obj3).intValue();
                c0167p2.Q(-353972293);
                n.V a3 = ((n.U) this.f288f).a((q.j) this.f289g, c0167p2);
                boolean f4 = c0167p2.f(a3);
                Object G7 = c0167p2.G();
                if (f4 || G7 == C0159l.f2829a) {
                    G7 = new n.X(a3);
                    c0167p2.a0(G7);
                }
                n.X x3 = (n.X) G7;
                c0167p2.p(false);
                return x3;
            case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                C0167p c0167p3 = (C0167p) obj2;
                if ((((Number) obj3).intValue() & 17) == 16 && c0167p3.x()) {
                    c0167p3.L();
                } else {
                    Object G8 = c0167p3.G();
                    if (G8 == C0159l.f2829a) {
                        G8 = new o.i();
                        c0167p3.a0(G8);
                    }
                    o.i iVar2 = (o.i) G8;
                    iVar2.f7402a.clear();
                    ((C0022x) this.f288f).n(iVar2);
                    iVar2.a((C0740b) this.f289g, c0167p3, 0);
                }
                return R1.y.f4171a;
            case k1.i.LONG_FIELD_NUMBER /* 4 */:
                n0.s sVar = (n0.s) obj;
                n0.s sVar2 = (n0.s) obj2;
                long j3 = ((C0238c) obj3).f4722a;
                C0776m0 c0776m0 = (C0776m0) this.f288f;
                if (((Boolean) c0776m0.f7727t.n(sVar)).booleanValue()) {
                    if (!c0776m0.f7732y) {
                        if (c0776m0.f7730w == null) {
                            c0776m0.f7730w = n.r.a(Integer.MAX_VALUE, 6, null);
                        }
                        c0776m0.f7732y = true;
                        AbstractC0837y.r(c0776m0.m0(), null, null, new p.K(c0776m0, null), 3);
                    }
                    n.T.g((C0744c) this.f289g, sVar);
                    long g3 = C0238c.g(sVar2.f7310c, j3);
                    s2.g gVar = c0776m0.f7730w;
                    if (gVar != null) {
                        gVar.p(new C0788t(g3));
                    }
                }
                return R1.y.f4171a;
            default:
                C0167p c0167p4 = (C0167p) obj2;
                ((Number) obj3).intValue();
                c0167p4.Q(-102778667);
                Object G9 = c0167p4.G();
                I.W w3 = C0159l.f2829a;
                if (G9 == w3) {
                    C0184y c0184y = new C0184y(C0143d.z(c0167p4));
                    c0167p4.a0(c0184y);
                    G9 = c0184y;
                }
                v2.c cVar2 = ((C0184y) G9).f2968d;
                Object G10 = c0167p4.G();
                if (G10 == w3) {
                    G10 = C0143d.K(null, I.W.f2783i);
                    c0167p4.a0(G10);
                }
                InterfaceC0142c0 interfaceC0142c0 = (InterfaceC0142c0) G10;
                InterfaceC0142c0 N3 = C0143d.N((InterfaceC0424c) this.f289g, c0167p4);
                q.k kVar2 = (q.k) this.f288f;
                boolean f5 = c0167p4.f(kVar2);
                Object G11 = c0167p4.G();
                if (f5 || G11 == w3) {
                    G11 = new C0758d0(interfaceC0142c0, 17, kVar2);
                    c0167p4.a0(G11);
                }
                C0143d.c(kVar2, (InterfaceC0424c) G11, c0167p4);
                U.n nVar = U.n.f4488a;
                boolean h4 = c0167p4.h(cVar2) | c0167p4.f(kVar2) | c0167p4.f(N3);
                Object G12 = c0167p4.G();
                if (h4 || G12 == w3) {
                    x.i0 i0Var = new x.i0(cVar2, interfaceC0142c0, (q.k) this.f288f, N3, null);
                    c0167p4.a0(i0Var);
                    G12 = i0Var;
                }
                U.q a4 = n0.w.a(nVar, kVar2, (InterfaceC0426e) G12);
                c0167p4.p(false);
                return a4;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ I(Object obj, int i3, Object obj2) {
        super(3);
        this.f287e = i3;
        this.f288f = obj;
        this.f289g = obj2;
    }
}
