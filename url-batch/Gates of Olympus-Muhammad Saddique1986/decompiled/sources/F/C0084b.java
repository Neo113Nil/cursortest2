package F;

import I.C0143d;
import I.C0167p;
import I.InterfaceC0164n0;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import e2.InterfaceC0426e;
import r.AbstractC0868o;
import r0.InterfaceC0885G;
import t0.C0995h;
import t0.C0996i;
import t0.C1001n;
import t0.InterfaceC0997j;

/* renamed from: F.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0084b extends f2.k implements InterfaceC0426e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1476e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0426e f1477f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0084b(InterfaceC0426e interfaceC0426e, int i3) {
        super(2);
        this.f1476e = i3;
        this.f1477f = interfaceC0426e;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        switch (this.f1476e) {
            case 0:
                C0167p c0167p = (C0167p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0167p.x()) {
                    c0167p.L();
                } else {
                    U.q i3 = androidx.compose.foundation.layout.b.e(U.n.f4488a, AbstractC0107m.f1663f).i(new HorizontalAlignElement(U.b.f4474q));
                    InterfaceC0885G e3 = AbstractC0868o.e(U.b.f4461d, false);
                    int i4 = c0167p.f2864P;
                    InterfaceC0164n0 m3 = c0167p.m();
                    U.q d3 = U.a.d(c0167p, i3);
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
                    if (c0167p.f2863O || !f2.j.a(c0167p.G(), Integer.valueOf(i4))) {
                        A.k.o(i4, c0167p, i4, c0995h);
                    }
                    C0143d.R(c0167p, C0996i.f8755c, d3);
                    this.f1477f.h(c0167p, 0);
                    c0167p.p(true);
                }
                return R1.y.f4171a;
            case 1:
                C0167p c0167p2 = (C0167p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0167p2.x()) {
                    c0167p2.L();
                } else {
                    if (1.0f <= 0.0d) {
                        throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero");
                    }
                    U.q i5 = androidx.compose.foundation.layout.b.e(new LayoutWeightElement(O2.d.v(1.0f, Float.MAX_VALUE), false), AbstractC0107m.f1665h).i(new HorizontalAlignElement(U.b.f4473p));
                    InterfaceC0885G e4 = AbstractC0868o.e(U.b.f4461d, false);
                    int i6 = c0167p2.f2864P;
                    InterfaceC0164n0 m4 = c0167p2.m();
                    U.q d4 = U.a.d(c0167p2, i5);
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
                    if (c0167p2.f2863O || !f2.j.a(c0167p2.G(), Integer.valueOf(i6))) {
                        A.k.o(i6, c0167p2, i6, c0995h2);
                    }
                    C0143d.R(c0167p2, C0996i.f8755c, d4);
                    this.f1477f.h(c0167p2, 0);
                    c0167p2.p(true);
                }
                return R1.y.f4171a;
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                C0167p c0167p3 = (C0167p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0167p3.x()) {
                    c0167p3.L();
                } else {
                    U.q b3 = androidx.compose.foundation.layout.c.b(U.n.f4488a, H.k.f2417d, 0.0f, 2);
                    InterfaceC0885G e5 = AbstractC0868o.e(U.b.f4461d, false);
                    int i7 = c0167p3.f2864P;
                    InterfaceC0164n0 m5 = c0167p3.m();
                    U.q d5 = U.a.d(c0167p3, b3);
                    InterfaceC0997j.f8759c.getClass();
                    C1001n c1001n3 = C0996i.f8754b;
                    c0167p3.U();
                    if (c0167p3.f2863O) {
                        c0167p3.l(c1001n3);
                    } else {
                        c0167p3.d0();
                    }
                    C0143d.R(c0167p3, C0996i.f8757e, e5);
                    C0143d.R(c0167p3, C0996i.f8756d, m5);
                    C0995h c0995h3 = C0996i.f8758f;
                    if (c0167p3.f2863O || !f2.j.a(c0167p3.G(), Integer.valueOf(i7))) {
                        A.k.o(i7, c0167p3, i7, c0995h3);
                    }
                    C0143d.R(c0167p3, C0996i.f8755c, d5);
                    this.f1477f.h(c0167p3, 0);
                    c0167p3.p(true);
                }
                return R1.y.f4171a;
            case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                C0167p c0167p4 = (C0167p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0167p4.x()) {
                    c0167p4.L();
                } else {
                    U.q b4 = androidx.compose.foundation.layout.c.b(U.n.f4488a, H.k.f2418e, 0.0f, 2);
                    InterfaceC0885G e6 = AbstractC0868o.e(U.b.f4461d, false);
                    int i8 = c0167p4.f2864P;
                    InterfaceC0164n0 m6 = c0167p4.m();
                    U.q d6 = U.a.d(c0167p4, b4);
                    InterfaceC0997j.f8759c.getClass();
                    C1001n c1001n4 = C0996i.f8754b;
                    c0167p4.U();
                    if (c0167p4.f2863O) {
                        c0167p4.l(c1001n4);
                    } else {
                        c0167p4.d0();
                    }
                    C0143d.R(c0167p4, C0996i.f8757e, e6);
                    C0143d.R(c0167p4, C0996i.f8756d, m6);
                    C0995h c0995h4 = C0996i.f8758f;
                    if (c0167p4.f2863O || !f2.j.a(c0167p4.G(), Integer.valueOf(i8))) {
                        A.k.o(i8, c0167p4, i8, c0995h4);
                    }
                    C0143d.R(c0167p4, C0996i.f8755c, d6);
                    this.f1477f.h(c0167p4, 0);
                    c0167p4.p(true);
                }
                return R1.y.f4171a;
            default:
                C0167p c0167p5 = (C0167p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0167p5.x()) {
                    c0167p5.L();
                } else {
                    this.f1477f.h(c0167p5, 0);
                }
                return R1.y.f4171a;
        }
    }
}
