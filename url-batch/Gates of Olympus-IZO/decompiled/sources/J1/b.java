package J1;

import A2.n;
import F.AbstractC0029a0;
import F.J;
import F.L;
import F.X0;
import F.a1;
import F.b1;
import I.C0113p;
import L1.z;
import a.AbstractC0157a;
import b0.C0265P;
import b0.C0288u;
import h0.C0424e;
import h0.C0425f;
import h0.G;

/* loaded from: classes.dex */
public final class b implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public static final b f2587e = new b(0);

    /* renamed from: f, reason: collision with root package name */
    public static final b f2588f = new b(1);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2589d;

    public /* synthetic */ b(int i3) {
        this.f2589d = i3;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        C0425f c0425f;
        z zVar = z.f2729a;
        switch (this.f2589d) {
            case 0:
                C0113p c0113p = (C0113p) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !c0113p.x()) {
                    X0.b("No bookmarks yet. Tap the ribbon on any joint in the Library to keep it here.", androidx.compose.foundation.layout.a.l(U.i.f3302a, 16), ((J) c0113p.k(L.f1045a)).f1009s, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((a1) c0113p.k(b1.f1200a)).f1194k, c0113p, 54, 0, 65528);
                    break;
                } else {
                    c0113p.L();
                    break;
                }
            default:
                C0113p c0113p2 = (C0113p) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !c0113p2.x()) {
                    C0425f c0425f2 = AbstractC0157a.f3482a;
                    if (c0425f2 != null) {
                        c0425f = c0425f2;
                    } else {
                        C0424e c0424e = new C0424e("Filled.Close", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i3 = G.f4893a;
                        C0265P c0265p = new C0265P(C0288u.f4292b);
                        n nVar = new n(2);
                        nVar.j(19.0f, 6.41f);
                        nVar.h(17.59f, 5.0f);
                        nVar.h(12.0f, 10.59f);
                        nVar.h(6.41f, 5.0f);
                        nVar.h(5.0f, 6.41f);
                        nVar.h(10.59f, 12.0f);
                        nVar.h(5.0f, 17.59f);
                        nVar.h(6.41f, 19.0f);
                        nVar.h(12.0f, 13.41f);
                        nVar.h(17.59f, 19.0f);
                        nVar.h(19.0f, 17.59f);
                        nVar.h(13.41f, 12.0f);
                        nVar.c();
                        C0424e.a(c0424e, nVar.f118a, c0265p);
                        C0425f b2 = c0424e.b();
                        AbstractC0157a.f3482a = b2;
                        c0425f = b2;
                    }
                    AbstractC0029a0.a(c0425f, "Remove", null, ((J) c0113p2.k(L.f1045a)).f1009s, c0113p2, 48, 4);
                    break;
                } else {
                    c0113p2.L();
                    break;
                }
        }
        return zVar;
    }
}
