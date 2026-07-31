package F;

import G.AbstractC0136c;
import I.C0143d;
import I.C0167p;
import I.InterfaceC0164n0;
import e2.InterfaceC0426e;
import r.AbstractC0868o;
import r0.InterfaceC0885G;
import t0.C0995h;
import t0.C0996i;
import t0.C1001n;
import t0.InterfaceC0997j;
import x.AbstractC1191d;

/* renamed from: F.l0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0106l0 extends f2.k implements InterfaceC0426e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1650e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f1651f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f1652g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0106l0(int i3, long j3, Object obj) {
        super(2);
        this.f1650e = i3;
        this.f1651f = j3;
        this.f1652g = obj;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        switch (this.f1650e) {
            case 0:
                C0167p c0167p = (C0167p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0167p.x()) {
                    c0167p.L();
                } else {
                    AbstractC0136c.a(this.f1651f, B1.a(H.e.f2394b, c0167p), Q.f.b(-1771489750, new K((Q.a) this.f1652g, 1), c0167p), c0167p, 384);
                }
                break;
            default:
                C0167p c0167p2 = (C0167p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0167p2.x()) {
                    c0167p2.L();
                } else {
                    long j3 = this.f1651f;
                    if (j3 != 9205357640488583168L) {
                        c0167p2.Q(1828881000);
                        U.q g3 = androidx.compose.foundation.layout.c.g((U.q) this.f1652g, Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), 0.0f, 0.0f, 12);
                        InterfaceC0885G e3 = AbstractC0868o.e(U.b.f4462e, false);
                        int i3 = c0167p2.f2864P;
                        InterfaceC0164n0 m3 = c0167p2.m();
                        U.q d3 = U.a.d(c0167p2, g3);
                        InterfaceC0997j.f8759c.getClass();
                        C1001n c1001n = C0996i.f8754b;
                        c0167p2.U();
                        if (c0167p2.f2863O) {
                            c0167p2.l(c1001n);
                        } else {
                            c0167p2.d0();
                        }
                        C0143d.R(c0167p2, C0996i.f8757e, e3);
                        C0143d.R(c0167p2, C0996i.f8756d, m3);
                        C0995h c0995h = C0996i.f8758f;
                        if (c0167p2.f2863O || !f2.j.a(c0167p2.G(), Integer.valueOf(i3))) {
                            A.k.o(i3, c0167p2, i3, c0995h);
                        }
                        C0143d.R(c0167p2, C0996i.f8755c, d3);
                        AbstractC1191d.b(null, c0167p2, 0, 1);
                        c0167p2.p(true);
                        c0167p2.p(false);
                    } else {
                        c0167p2.Q(1829217412);
                        AbstractC1191d.b((U.q) this.f1652g, c0167p2, 0, 0);
                        c0167p2.p(false);
                    }
                }
                break;
        }
        return R1.y.f4171a;
    }
}
