package H1;

import F.AbstractC0044i;
import F.J;
import F.L;
import F.Z0;
import I.C0113p;
import I.Y0;
import L1.z;
import b0.C0288u;

/* loaded from: classes.dex */
public final class i implements Y1.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.gates.olympus.miruv.data.b f1873d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Y1.a f1874e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ y f1875f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f1876g;

    public i(com.gates.olympus.miruv.data.b bVar, Y1.a aVar, y yVar, boolean z3) {
        this.f1873d = bVar;
        this.f1874e = aVar;
        this.f1875f = yVar;
        this.f1876g = z3;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        int i3 = 2;
        C0113p c0113p = (C0113p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0113p.x()) {
            c0113p.L();
        } else {
            com.gates.olympus.miruv.data.b bVar = this.f1873d;
            Q.a b2 = Q.f.b(-2101700731, new f(bVar, 0), c0113p);
            Q.a b3 = Q.f.b(-87855353, new G1.k(i3, this.f1874e), c0113p);
            Q.a b4 = Q.f.b(-1566307216, new h(bVar, this.f1875f, this.f1876g), c0113p);
            float f3 = Z0.f1174a;
            Y0 y02 = L.f1045a;
            long j3 = ((J) c0113p.k(y02)).f992a;
            long j4 = ((J) c0113p.k(y02)).f993b;
            long j5 = ((J) c0113p.k(y02)).f993b;
            long j6 = C0288u.f4296f;
            J j7 = (J) c0113p.k(y02);
            F.Y0 y03 = j7.f989O;
            if (y03 == null) {
                int i4 = H.o.f1754a;
                y03 = new F.Y0(L.c(j7, 35), L.c(j7, H.o.f1756c), L.c(j7, H.o.f1755b), L.c(j7, H.o.f1754a), L.c(j7, H.o.f1757d));
                j7.f989O = y03;
            }
            if (j3 == 16) {
                j3 = y03.f1167a;
            }
            long j8 = j3;
            long j9 = j6 != 16 ? j6 : y03.f1168b;
            if (j5 == 16) {
                j5 = y03.f1169c;
            }
            long j10 = j5;
            if (j4 == 16) {
                j4 = y03.f1170d;
            }
            long j11 = j4;
            if (j6 == 16) {
                j6 = y03.f1171e;
            }
            AbstractC0044i.a(b2, null, b3, b4, 0.0f, null, new F.Y0(j8, j9, j10, j11, j6), c0113p, 3462);
        }
        return z.f2729a;
    }
}
