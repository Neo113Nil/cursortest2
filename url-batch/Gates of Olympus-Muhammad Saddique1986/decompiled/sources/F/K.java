package F;

import I.C0143d;
import I.C0167p;
import I.InterfaceC0164n0;
import e2.InterfaceC0426e;
import r.AbstractC0864k;
import r.AbstractC0868o;
import r.AbstractC0871s;
import r.C0873u;
import r.C0874v;
import r0.InterfaceC0885G;
import t0.C0995h;
import t0.C0996i;
import t0.C1001n;
import t0.InterfaceC0997j;

/* loaded from: classes.dex */
public final class K extends f2.k implements InterfaceC0426e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1206e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Q.a f1207f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ K(Q.a aVar, int i3) {
        super(2);
        this.f1206e = i3;
        this.f1207f = aVar;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        switch (this.f1206e) {
            case 0:
                C0167p c0167p = (C0167p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0167p.x()) {
                    c0167p.L();
                } else {
                    U.n nVar = U.n.f4488a;
                    C0873u a3 = AbstractC0871s.a(AbstractC0864k.f8053c, c0167p, 0);
                    int i3 = c0167p.f2864P;
                    InterfaceC0164n0 m3 = c0167p.m();
                    U.q d3 = U.a.d(c0167p, nVar);
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
                    this.f1207f.g(C0874v.f8090a, c0167p, 6);
                    c0167p.p(true);
                }
                break;
            default:
                C0167p c0167p2 = (C0167p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0167p2.x()) {
                    c0167p2.L();
                } else {
                    U.q a4 = androidx.compose.foundation.layout.c.a(U.n.f4488a, H.g.f2398c, H.g.f2397b);
                    InterfaceC0885G e3 = AbstractC0868o.e(U.b.f4465h, false);
                    int i4 = c0167p2.f2864P;
                    InterfaceC0164n0 m4 = c0167p2.m();
                    U.q d4 = U.a.d(c0167p2, a4);
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
                    if (c0167p2.f2863O || !f2.j.a(c0167p2.G(), Integer.valueOf(i4))) {
                        A.k.o(i4, c0167p2, i4, c0995h2);
                    }
                    C0143d.R(c0167p2, C0996i.f8755c, d4);
                    this.f1207f.h(c0167p2, 0);
                    c0167p2.p(true);
                }
                break;
        }
        return R1.y.f4171a;
    }
}
