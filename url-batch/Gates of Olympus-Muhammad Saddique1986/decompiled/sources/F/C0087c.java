package F;

import I.C0143d;
import I.C0159l;
import I.C0167p;
import I.InterfaceC0142c0;
import I.InterfaceC0164n0;
import J.C0196a;
import J.C0197b;
import R0.C0215d;
import a0.C0238c;
import android.content.Context;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.gatesof.olympus.martu.marku.R;
import e2.InterfaceC0424c;
import e2.InterfaceC0426e;
import l.C0582h;
import n.AbstractC0695v;
import o0.C0744c;
import p.C0776m0;
import p.C0786s;
import r.AbstractC0856c;
import r.AbstractC0864k;
import r.AbstractC0868o;
import r.C0855b;
import r.C0861h;
import r.InterfaceC0849K;
import r0.C0923t;
import r0.C0929z;
import r0.InterfaceC0885G;
import r0.InterfaceC0886H;
import r0.InterfaceC0902Y;
import s.C0939h;
import s0.C0962h;
import t0.C0995h;
import t0.C0996i;
import t0.C1001n;
import t0.InterfaceC0997j;
import t1.C1028h;
import v.C1157a;

/* renamed from: F.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0087c extends f2.k implements InterfaceC0426e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1485e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f1486f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f1487g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0087c(Object obj, int i3, Object obj2) {
        super(2);
        this.f1485e = i3;
        this.f1486f = obj;
        this.f1487g = obj2;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        r.S s3 = r.S.f7990a;
        int i3 = 6;
        I.W w2 = C0159l.f2829a;
        U.n nVar = U.n.f4488a;
        R1.y yVar = R1.y.f4171a;
        int i4 = 2;
        int i5 = 3;
        Object obj3 = this.f1487g;
        Object obj4 = this.f1486f;
        switch (this.f1485e) {
            case 0:
                C0167p c0167p = (C0167p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0167p.x()) {
                    c0167p.L();
                } else {
                    U.q i6 = androidx.compose.foundation.layout.b.e(nVar, AbstractC0107m.f1664g).i(new HorizontalAlignElement(((InterfaceC0426e) obj4) == null ? U.b.f4473p : U.b.f4474q));
                    InterfaceC0885G e3 = AbstractC0868o.e(U.b.f4461d, false);
                    int i7 = c0167p.f2864P;
                    InterfaceC0164n0 m3 = c0167p.m();
                    U.q d3 = U.a.d(c0167p, i6);
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
                    if (c0167p.f2863O || !f2.j.a(c0167p.G(), Integer.valueOf(i7))) {
                        A.k.o(i7, c0167p, i7, c0995h);
                    }
                    C0143d.R(c0167p, C0996i.f8755c, d3);
                    ((InterfaceC0426e) obj3).h(c0167p, 0);
                    c0167p.p(true);
                }
                return yVar;
            case 1:
                C0167p c0167p2 = (C0167p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0167p2.x()) {
                    c0167p2.L();
                } else {
                    c0167p2.k(AndroidCompositionLocals_androidKt.f4937a);
                    String string = ((Context) c0167p2.k(AndroidCompositionLocals_androidKt.f4938b)).getResources().getString(R.string.m3c_dialog);
                    U.q k3 = androidx.compose.foundation.layout.c.k((U.q) obj4, AbstractC0107m.f1658a, 0.0f, AbstractC0107m.f1659b, 10);
                    boolean f3 = c0167p2.f(string);
                    Object G3 = c0167p2.G();
                    if (f3 || G3 == w2) {
                        G3 = new A0.m(string, r9);
                        c0167p2.a0(G3);
                    }
                    U.q i8 = k3.i(A0.k.a(nVar, (InterfaceC0424c) G3));
                    InterfaceC0885G e4 = AbstractC0868o.e(U.b.f4461d, true);
                    int i9 = c0167p2.f2864P;
                    InterfaceC0164n0 m4 = c0167p2.m();
                    U.q d4 = U.a.d(c0167p2, i8);
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
                    if (c0167p2.f2863O || !f2.j.a(c0167p2.G(), Integer.valueOf(i9))) {
                        A.k.o(i9, c0167p2, i9, c0995h2);
                    }
                    C0143d.R(c0167p2, C0996i.f8755c, d4);
                    ((Q.a) obj3).h(c0167p2, 0);
                    c0167p2.p(true);
                }
                return yVar;
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                C0167p c0167p3 = (C0167p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0167p3.x()) {
                    c0167p3.L();
                } else {
                    U.q e5 = androidx.compose.foundation.layout.b.e(androidx.compose.foundation.layout.c.a(nVar, B.f1116b, B.f1117c), (InterfaceC0849K) obj4);
                    r.Q a3 = r.P.a(AbstractC0864k.f8055e, U.b.f4471n, c0167p3, 54);
                    int i10 = c0167p3.f2864P;
                    InterfaceC0164n0 m5 = c0167p3.m();
                    U.q d5 = U.a.d(c0167p3, e5);
                    InterfaceC0997j.f8759c.getClass();
                    C1001n c1001n3 = C0996i.f8754b;
                    c0167p3.U();
                    if (c0167p3.f2863O) {
                        c0167p3.l(c1001n3);
                    } else {
                        c0167p3.d0();
                    }
                    C0143d.R(c0167p3, C0996i.f8757e, a3);
                    C0143d.R(c0167p3, C0996i.f8756d, m5);
                    C0995h c0995h3 = C0996i.f8758f;
                    if (c0167p3.f2863O || !f2.j.a(c0167p3.G(), Integer.valueOf(i10))) {
                        A.k.o(i10, c0167p3, i10, c0995h3);
                    }
                    C0143d.R(c0167p3, C0996i.f8755c, d5);
                    ((Q.a) obj3).g(s3, c0167p3, 6);
                    c0167p3.p(true);
                }
                return yVar;
            case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                C0167p c0167p4 = (C0167p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0167p4.x()) {
                    c0167p4.L();
                } else {
                    x1.a(((A1) obj4).f1109j, (Q.a) obj3, c0167p4, 0);
                }
                return yVar;
            case k1.i.LONG_FIELD_NUMBER /* 4 */:
                C0167p c0167p5 = (C0167p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0167p5.x()) {
                    c0167p5.L();
                } else {
                    U.q c2 = androidx.compose.foundation.layout.c.c(nVar, 1.0f);
                    C0962h c0962h = r.a0.f8028a;
                    U.q a4 = A0.k.a(androidx.compose.foundation.layout.c.b(U.a.b(c2, new B.h0(i3, (r.X) obj4)), 0.0f, O0.f1303a, 1), C1157a.f9741e);
                    C0855b c0855b = AbstractC0864k.f8051a;
                    r.Q a5 = r.P.a(new C0861h(O0.f1304b), U.b.f4471n, c0167p5, 54);
                    int i11 = c0167p5.f2864P;
                    InterfaceC0164n0 m6 = c0167p5.m();
                    U.q d6 = U.a.d(c0167p5, a4);
                    InterfaceC0997j.f8759c.getClass();
                    C1001n c1001n4 = C0996i.f8754b;
                    c0167p5.U();
                    if (c0167p5.f2863O) {
                        c0167p5.l(c1001n4);
                    } else {
                        c0167p5.d0();
                    }
                    C0143d.R(c0167p5, C0996i.f8757e, a5);
                    C0143d.R(c0167p5, C0996i.f8756d, m6);
                    C0995h c0995h4 = C0996i.f8758f;
                    if (c0167p5.f2863O || !f2.j.a(c0167p5.G(), Integer.valueOf(i11))) {
                        A.k.o(i11, c0167p5, i11, c0995h4);
                    }
                    C0143d.R(c0167p5, C0996i.f8755c, d6);
                    ((Q.a) obj3).g(s3, c0167p5, 6);
                    c0167p5.p(true);
                }
                return yVar;
            case 5:
                C0167p c0167p6 = (C0167p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0167p6.x()) {
                    c0167p6.L();
                } else {
                    U.q c3 = androidx.compose.ui.layout.a.c(nVar, "indicator");
                    I.W0 w02 = (I.W0) obj4;
                    boolean f4 = c0167p6.f(w02);
                    Object G4 = c0167p6.G();
                    if (f4 || G4 == w2) {
                        G4 = new A0.l(4, w02);
                        c0167p6.a0(G4);
                    }
                    U.q a6 = androidx.compose.ui.graphics.a.a(c3, (InterfaceC0424c) G4);
                    long j3 = ((F0) obj3).f1149c;
                    float f5 = H.n.f2429a;
                    AbstractC0868o.a(androidx.compose.foundation.a.a(a6, j3, n1.a(5, c0167p6)), c0167p6, 0);
                }
                return yVar;
            case 6:
                C0167p c0167p7 = (C0167p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0167p7.x()) {
                    c0167p7.L();
                } else {
                    U.q a7 = A0.k.a(nVar, C0215d.f4072i);
                    R0.A a8 = (R0.A) obj4;
                    boolean h3 = c0167p7.h(a8);
                    Object G5 = c0167p7.G();
                    if (h3 || G5 == w2) {
                        G5 = new R0.k(a8, 1);
                        c0167p7.a0(G5);
                    }
                    U.q e6 = androidx.compose.ui.layout.a.e(a7, (InterfaceC0424c) G5);
                    float f6 = a8.getCanCalculatePosition() ? 1.0f : 0.0f;
                    if (f6 != 1.0f) {
                        e6 = androidx.compose.ui.graphics.a.b(e6, f6, 0.0f, null, true, 126971);
                    }
                    U.q qVar = e6;
                    Q.a b3 = Q.f.b(606497925, new C0113p((InterfaceC0142c0) obj3, i5), c0167p7);
                    R0.f fVar = R0.f.f4081c;
                    int i12 = c0167p7.f2864P;
                    InterfaceC0164n0 m7 = c0167p7.m();
                    U.q d7 = U.a.d(c0167p7, qVar);
                    InterfaceC0997j.f8759c.getClass();
                    C1001n c1001n5 = C0996i.f8754b;
                    c0167p7.U();
                    if (c0167p7.f2863O) {
                        c0167p7.l(c1001n5);
                    } else {
                        c0167p7.d0();
                    }
                    C0143d.R(c0167p7, C0996i.f8757e, fVar);
                    C0143d.R(c0167p7, C0996i.f8756d, m7);
                    C0995h c0995h5 = C0996i.f8758f;
                    if (c0167p7.f2863O || !f2.j.a(c0167p7.G(), Integer.valueOf(i12))) {
                        A.k.o(i12, c0167p7, i12, c0995h5);
                    }
                    C0143d.R(c0167p7, C0996i.f8755c, d7);
                    b3.h(c0167p7, 6);
                    c0167p7.p(true);
                }
                return yVar;
            case k1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                long j4 = ((C0238c) obj2).f4722a;
                n.T.g((C0744c) obj4, (n0.s) obj);
                s2.g gVar = ((C0776m0) obj3).f7730w;
                if (gVar != null) {
                    gVar.p(new C0786s(j4));
                }
                return yVar;
            case k1.i.BYTES_FIELD_NUMBER /* 8 */:
                C0167p c0167p8 = (C0167p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0167p8.x()) {
                    c0167p8.L();
                } else {
                    Boolean bool = (Boolean) ((C0923t) obj3).f8178f.getValue();
                    boolean booleanValue = bool.booleanValue();
                    c0167p8.T(bool);
                    boolean g3 = c0167p8.g(booleanValue);
                    c0167p8.Q(-869707859);
                    if (booleanValue) {
                        ((InterfaceC0426e) obj4).h(c0167p8, 0);
                    } else {
                        if ((c0167p8.f2875k != 0 ? 0 : 1) == 0) {
                            C0143d.w("No nodes can be emitted before calling dactivateToEndGroup");
                            throw null;
                        }
                        if (!c0167p8.f2863O) {
                            if (g3) {
                                I.E0 e02 = c0167p8.f2854F;
                                int i13 = e02.f2661g;
                                int i14 = e02.f2662h;
                                C0197b c0197b = c0167p8.f2860L;
                                c0197b.getClass();
                                c0197b.d(false);
                                C0196a c0196a = c0197b.f3114b;
                                c0196a.getClass();
                                c0196a.f3112b.n0(J.f.f3129c);
                                C0143d.q(c0167p8.f2882r, i13, i14);
                                c0167p8.f2854F.m();
                            } else {
                                c0167p8.K();
                            }
                        }
                    }
                    c0167p8.p(false);
                    if (c0167p8.f2888x && c0167p8.f2854F.f2663i == c0167p8.f2889y) {
                        c0167p8.f2889y = -1;
                        c0167p8.f2888x = false;
                    }
                    c0167p8.p(false);
                }
                return yVar;
            case AbstractC0856c.f8037c /* 9 */:
                C0167p c0167p9 = (C0167p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0167p9.x()) {
                    c0167p9.L();
                } else {
                    t.r rVar = (t.r) obj4;
                    C0939h c0939h = (C0939h) rVar.f8503b.b();
                    t.q qVar2 = (t.q) obj3;
                    int i15 = qVar2.f8499c;
                    int c4 = c0939h.c();
                    Object obj5 = qVar2.f8497a;
                    if ((i15 >= c4 || !c0939h.d(i15).equals(obj5)) && (i15 = c0939h.f8237d.b(obj5)) != -1) {
                        qVar2.f8499c = i15;
                    }
                    if (i15 != -1) {
                        c0167p9.Q(-660479623);
                        n.z0.f(c0939h, rVar.f8502a, i15, obj5, c0167p9, 0);
                        c0167p9.p(false);
                    } else {
                        c0167p9.Q(-660272047);
                        c0167p9.p(false);
                    }
                    boolean h4 = c0167p9.h(qVar2);
                    Object G6 = c0167p9.G();
                    if (h4 || G6 == w2) {
                        G6 = new C0929z(i4, qVar2);
                        c0167p9.a0(G6);
                    }
                    C0143d.c(obj5, (InterfaceC0424c) G6, c0167p9);
                }
                return yVar;
            case AbstractC0856c.f8039e /* 10 */:
                return (InterfaceC0886H) ((InterfaceC0426e) obj4).h(new t.u((t.r) obj3, (InterfaceC0902Y) obj), new O0.a(((O0.a) obj2).f3725a));
            case 11:
                C0167p c0167p10 = (C0167p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0167p10.x()) {
                    c0167p10.L();
                } else {
                    t.I i16 = (t.I) obj4;
                    i16.f8443b.setValue(O2.l.t0(c0167p10));
                    ((Q.a) obj3).g(i16, c0167p10, 0);
                }
                return yVar;
            case 12:
                C0167p c0167p11 = (C0167p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0167p11.x()) {
                    c0167p11.L();
                } else {
                    ((u1.o) obj4).f9616n.g((C1028h) obj3, c0167p11, 0);
                }
                return yVar;
            case 13:
                C0167p c0167p12 = (C0167p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0167p12.x()) {
                    c0167p12.L();
                } else {
                    AbstractC0695v.d((R.i) obj4, (Q.a) obj3, c0167p12, 0);
                }
                return yVar;
            default:
                C0167p c0167p13 = (C0167p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0167p13.x()) {
                    c0167p13.L();
                } else {
                    C1028h c1028h = (C1028h) obj4;
                    t1.u uVar = c1028h.f8874e;
                    f2.j.d(uVar, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                    ((u1.h) uVar).f9587m.f((C0582h) obj3, c1028h, c0167p13, 0);
                }
                return yVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0087c(Object obj, InterfaceC0426e interfaceC0426e, int i3) {
        super(2);
        this.f1485e = i3;
        this.f1487g = obj;
        this.f1486f = interfaceC0426e;
    }
}
