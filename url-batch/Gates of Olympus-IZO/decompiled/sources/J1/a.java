package J1;

import B0.C;
import F.J;
import F.L;
import F.U0;
import F.X0;
import F.a1;
import F.b1;
import I.C0113p;
import L1.z;
import U.l;
import s.C0860c;
import x.C1050d;

/* loaded from: classes.dex */
public final class a implements Y1.f {

    /* renamed from: e, reason: collision with root package name */
    public static final a f2583e = new a(0);

    /* renamed from: f, reason: collision with root package name */
    public static final a f2584f = new a(1);

    /* renamed from: g, reason: collision with root package name */
    public static final a f2585g = new a(2);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2586d;

    public /* synthetic */ a(int i3) {
        this.f2586d = i3;
    }

    @Override // Y1.f
    public final Object f(Object obj, Object obj2, Object obj3) {
        l g3;
        switch (this.f2586d) {
            case 0:
                C0113p c0113p = (C0113p) obj2;
                int intValue = ((Number) obj3).intValue();
                Z1.i.f((C0860c) obj, "$this$item");
                if ((intValue & 17) == 16 && c0113p.x()) {
                    c0113p.L();
                } else {
                    X0.b("Your Bench", null, ((J) c0113p.k(L.f1045a)).f1006o, 0L, null, F0.l.f1457i, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((a1) c0113p.k(b1.f1200a)).f1189f, c0113p, 196614, 0, 65498);
                }
                break;
            case 1:
                C0113p c0113p2 = (C0113p) obj2;
                int intValue2 = ((Number) obj3).intValue();
                Z1.i.f((C0860c) obj, "$this$item");
                if ((intValue2 & 17) == 16 && c0113p2.x()) {
                    c0113p2.L();
                } else {
                    C c3 = ((a1) c0113p2.k(b1.f1200a)).f1191h;
                    X0.b("Bookmarked joints", androidx.compose.foundation.layout.a.p(U.i.f3302a, 0.0f, 4, 0.0f, 0.0f, 13), ((J) c0113p2.k(L.f1045a)).f992a, 0L, null, F0.l.f1456h, null, 0L, null, null, 0L, 0, false, 0, 0, null, c3, c0113p2, 196662, 0, 65496);
                }
                break;
            default:
                C0113p c0113p3 = (C0113p) obj2;
                int intValue3 = ((Number) obj3).intValue();
                Z1.i.f((C0860c) obj, "$this$item");
                if ((intValue3 & 17) == 16 && c0113p3.x()) {
                    c0113p3.L();
                } else {
                    long j3 = ((J) c0113p3.k(L.f1045a)).f1008r;
                    C1050d a3 = x.e.a(14);
                    g3 = androidx.compose.foundation.layout.a.g(U.i.f3302a, 1.0f);
                    U0.a(g3, a3, j3, 0L, 0.0f, 0.0f, null, c.f2592c, c0113p3, 12582918, 120);
                }
                break;
        }
        return z.f2729a;
    }
}
