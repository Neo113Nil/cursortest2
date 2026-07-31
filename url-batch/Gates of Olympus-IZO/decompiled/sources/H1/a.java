package H1;

import F.AbstractC0029a0;
import F.X0;
import I.C0113p;
import L1.z;
import b0.C0265P;
import b0.C0288u;
import h0.C0424e;
import h0.C0425f;
import h0.G;

/* loaded from: classes.dex */
public final class a implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public static final a f1852e = new a(0);

    /* renamed from: f, reason: collision with root package name */
    public static final a f1853f = new a(1);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1854d;

    public /* synthetic */ a(int i3) {
        this.f1854d = i3;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        C0425f c0425f;
        z zVar = z.f2729a;
        switch (this.f1854d) {
            case 0:
                C0113p c0113p = (C0113p) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !c0113p.x()) {
                    C0425f c0425f2 = I2.l.f2512a;
                    if (c0425f2 != null) {
                        c0425f = c0425f2;
                    } else {
                        C0424e c0424e = new C0424e("AutoMirrored.Filled.ArrowBack", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
                        int i3 = G.f4893a;
                        C0265P c0265p = new C0265P(C0288u.f4292b);
                        A2.n nVar = new A2.n(2);
                        nVar.j(20.0f, 11.0f);
                        nVar.f(7.83f);
                        nVar.i(5.59f, -5.59f);
                        nVar.h(12.0f, 4.0f);
                        nVar.i(-8.0f, 8.0f);
                        nVar.i(8.0f, 8.0f);
                        nVar.i(1.41f, -1.41f);
                        nVar.h(7.83f, 13.0f);
                        nVar.f(20.0f);
                        nVar.m(-2.0f);
                        nVar.c();
                        C0424e.a(c0424e, nVar.f118a, c0265p);
                        C0425f b2 = c0424e.b();
                        I2.l.f2512a = b2;
                        c0425f = b2;
                    }
                    AbstractC0029a0.a(c0425f, "Back", null, 0L, c0113p, 48, 12);
                    break;
                } else {
                    c0113p.L();
                    break;
                }
            default:
                C0113p c0113p2 = (C0113p) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !c0113p2.x()) {
                    X0.b("All", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0113p2, 6, 0, 131070);
                    break;
                } else {
                    c0113p2.L();
                    break;
                }
        }
        return zVar;
    }
}
