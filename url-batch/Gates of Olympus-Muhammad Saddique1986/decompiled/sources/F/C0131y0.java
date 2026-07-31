package F;

import B.C0022x;
import I.C0143d;
import I.C0167p;
import I.InterfaceC0142c0;
import I.InterfaceC0164n0;
import e2.InterfaceC0426e;
import o.C0740b;
import p.C0787s0;
import p.C0793v0;
import q2.AbstractC0837y;
import q2.InterfaceC0835w;
import r.AbstractC0864k;
import r.AbstractC0868o;
import r.AbstractC0871s;
import r.C0873u;
import r.C0874v;
import r.InterfaceC0849K;
import r0.InterfaceC0885G;
import t0.C0995h;
import t0.C0996i;
import t0.C1001n;
import t0.InterfaceC0997j;
import t1.C1028h;
import u0.AbstractC1101g0;
import u0.C1123s;

/* renamed from: F.y0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0131y0 extends f2.k implements InterfaceC0426e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1898e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f1899f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f1900g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f1901h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0131y0(Object obj, Object obj2, Object obj3, int i3) {
        super(2);
        this.f1898e = i3;
        this.f1900g = obj;
        this.f1901h = obj2;
        this.f1899f = obj3;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        U.n nVar = U.n.f4488a;
        int i3 = 2;
        R1.y yVar = R1.y.f4171a;
        int i4 = 3;
        Object obj3 = this.f1900g;
        Object obj4 = this.f1901h;
        Object obj5 = this.f1899f;
        switch (this.f1898e) {
            case 0:
                C0167p c0167p = (C0167p) obj;
                if ((3 & ((Number) obj2).intValue()) != 2 || !c0167p.x()) {
                    U.q w2 = n.t0.w(androidx.compose.foundation.layout.b.j(androidx.compose.foundation.layout.b.h((U.q) obj3, 0.0f, B0.f1121d, 1)), (n.y0) obj4);
                    C0873u a3 = AbstractC0871s.a(AbstractC0864k.f8053c, c0167p, 0);
                    int i5 = c0167p.f2864P;
                    InterfaceC0164n0 m3 = c0167p.m();
                    U.q d3 = U.a.d(c0167p, w2);
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
                    if (c0167p.f2863O || !f2.j.a(c0167p.G(), Integer.valueOf(i5))) {
                        A.k.o(i5, c0167p, i5, c0995h);
                    }
                    C0143d.R(c0167p, C0996i.f8755c, d3);
                    ((Q.a) obj5).g(C0874v.f8090a, c0167p, 6);
                    c0167p.p(true);
                    break;
                } else {
                    c0167p.L();
                    break;
                }
                break;
            case 1:
                C0167p c0167p2 = (C0167p) obj;
                if ((3 & ((Number) obj2).intValue()) != 2 || !c0167p2.x()) {
                    U.q i6 = androidx.compose.foundation.layout.b.i(r.S.a(r.S.f7990a, nVar), ((InterfaceC0426e) obj3) != null ? B0.f1120c : 0, 0.0f, ((InterfaceC0426e) obj4) != null ? B0.f1120c : 0, 10);
                    InterfaceC0885G e3 = AbstractC0868o.e(U.b.f4461d, false);
                    int i7 = c0167p2.f2864P;
                    InterfaceC0164n0 m4 = c0167p2.m();
                    U.q d4 = U.a.d(c0167p2, i6);
                    InterfaceC0997j.f8759c.getClass();
                    C1001n c1001n2 = C0996i.f8754b;
                    c0167p2.U();
                    if (c0167p2.f2863O) {
                        c0167p2.l(c1001n2);
                    } else {
                        c0167p2.d0();
                    }
                    C0143d.R(c0167p2, C0996i.f8757e, e3);
                    C0143d.R(c0167p2, C0996i.f8756d, m4);
                    C0995h c0995h2 = C0996i.f8758f;
                    if (c0167p2.f2863O || !f2.j.a(c0167p2.G(), Integer.valueOf(i7))) {
                        A.k.o(i7, c0167p2, i7, c0995h2);
                    }
                    C0143d.R(c0167p2, C0996i.f8755c, d4);
                    ((Q.a) obj5).h(c0167p2, 0);
                    c0167p2.p(true);
                    break;
                } else {
                    c0167p2.L();
                    break;
                }
                break;
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                C0167p c0167p3 = (C0167p) obj;
                if ((3 & ((Number) obj2).intValue()) != 2 || !c0167p3.x()) {
                    U.q c2 = androidx.compose.ui.layout.a.c(nVar, "Container");
                    G.o oVar = new G.o(0, 0, InterfaceC0142c0.class, (InterfaceC0142c0) obj3, "value", "getValue()Ljava/lang/Object;");
                    float f3 = Z0.f1459a;
                    U.q c3 = androidx.compose.ui.draw.a.c(c2, new C0022x(oVar, i3, (InterfaceC0849K) obj4));
                    InterfaceC0885G e4 = AbstractC0868o.e(U.b.f4461d, true);
                    int i8 = c0167p3.f2864P;
                    InterfaceC0164n0 m5 = c0167p3.m();
                    U.q d5 = U.a.d(c0167p3, c3);
                    InterfaceC0997j.f8759c.getClass();
                    C1001n c1001n3 = C0996i.f8754b;
                    c0167p3.U();
                    if (c0167p3.f2863O) {
                        c0167p3.l(c1001n3);
                    } else {
                        c0167p3.d0();
                    }
                    C0143d.R(c0167p3, C0996i.f8757e, e4);
                    C0143d.R(c0167p3, C0996i.f8756d, m5);
                    C0995h c0995h3 = C0996i.f8758f;
                    if (c0167p3.f2863O || !f2.j.a(c0167p3.G(), Integer.valueOf(i8))) {
                        A.k.o(i8, c0167p3, i8, c0995h3);
                    }
                    C0143d.R(c0167p3, C0996i.f8755c, d5);
                    ((InterfaceC0426e) obj5).h(c0167p3, 0);
                    c0167p3.p(true);
                    break;
                } else {
                    c0167p3.L();
                    break;
                }
                break;
            case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                C0167p c0167p4 = (C0167p) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !c0167p4.x()) {
                    C0740b c0740b = (C0740b) obj4;
                    o.p.a(c0740b, (U.q) obj3, Q.f.b(1156688164, new B.I((C0022x) obj5, i4, c0740b), c0167p4), c0167p4, 384);
                    break;
                } else {
                    c0167p4.L();
                    break;
                }
            case k1.i.LONG_FIELD_NUMBER /* 4 */:
                float floatValue = ((Number) obj).floatValue();
                ((Number) obj2).floatValue();
                f2.r rVar = (f2.r) obj3;
                C0793v0 c0793v0 = (C0793v0) obj4;
                long g3 = c0793v0.g(c0793v0.c(floatValue - rVar.f5829d));
                C0793v0 c0793v02 = ((C0787s0) obj5).f7767a;
                rVar.f5829d += c0793v0.c(c0793v0.f(C0793v0.a(c0793v02, c0793v02.f7785h, g3, 1)));
                break;
            case 5:
                C0167p c0167p5 = (C0167p) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !c0167p5.x()) {
                    AbstractC1101g0.a((C1123s) obj3, (u0.X) obj4, (Q.a) obj5, c0167p5, 0);
                    break;
                } else {
                    c0167p5.L();
                    break;
                }
                break;
            default:
                float floatValue2 = ((Number) obj).floatValue();
                ((Number) obj2).floatValue();
                AbstractC0837y.r((InterfaceC0835w) obj3, null, null, new u1.u(floatValue2, (m.U) obj4, (C1028h) obj5, null), 3);
                break;
        }
        return yVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0131y0(C0740b c0740b, U.q qVar, C0022x c0022x) {
        super(2);
        this.f1898e = 3;
        this.f1901h = c0740b;
        this.f1900g = qVar;
        this.f1899f = c0022x;
    }
}
