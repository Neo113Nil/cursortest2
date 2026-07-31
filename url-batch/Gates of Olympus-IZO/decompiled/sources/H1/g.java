package H1;

import F.AbstractC0029a0;
import F.J;
import F.L;
import I.C0113p;
import L1.z;
import M1.B;
import h0.C0425f;

/* loaded from: classes.dex */
public final class g implements Y1.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1867d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f1868e;

    public /* synthetic */ g(int i3, boolean z3) {
        this.f1867d = i3;
        this.f1868e = z3;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        long j3;
        long j4;
        switch (this.f1867d) {
            case 0:
                C0113p c0113p = (C0113p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0113p.x()) {
                    c0113p.L();
                } else {
                    boolean z3 = this.f1868e;
                    C0425f C = z3 ? B.C() : I2.l.C();
                    if (z3) {
                        c0113p.Q(220371015);
                        j3 = ((J) c0113p.k(L.f1045a)).f997f;
                        c0113p.p(false);
                    } else {
                        c0113p.Q(220373351);
                        j3 = ((J) c0113p.k(L.f1045a)).f1007q;
                        c0113p.p(false);
                    }
                    AbstractC0029a0.a(C, "Bookmark", null, j3, c0113p, 48, 4);
                }
                break;
            default:
                C0113p c0113p2 = (C0113p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0113p2.x()) {
                    c0113p2.L();
                } else {
                    boolean z4 = this.f1868e;
                    C0425f C3 = z4 ? B.C() : I2.l.C();
                    String str = z4 ? "Remove bookmark" : "Bookmark";
                    if (z4) {
                        c0113p2.Q(-2127767782);
                        j4 = ((J) c0113p2.k(L.f1045a)).f997f;
                        c0113p2.p(false);
                    } else {
                        c0113p2.Q(-2127765823);
                        j4 = ((J) c0113p2.k(L.f1045a)).f1009s;
                        c0113p2.p(false);
                    }
                    AbstractC0029a0.a(C3, str, null, j4, c0113p2, 0, 4);
                }
                break;
        }
        return z.f2729a;
    }
}
