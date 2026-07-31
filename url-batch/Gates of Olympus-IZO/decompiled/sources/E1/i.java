package E1;

import G1.r;
import H1.y;
import I.C0105l;
import I.C0113p;
import L1.z;
import f.AbstractC0382a;
import h.AbstractC0416e;
import q1.C0772A;
import q1.C0775D;
import r.InterfaceC0796H;

/* loaded from: classes.dex */
public final class i implements Y1.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0775D f760d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y f761e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r f762f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ I1.m f763g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ J1.k f764h;

    public i(C0775D c0775d, y yVar, r rVar, I1.m mVar, J1.k kVar) {
        this.f760d = c0775d;
        this.f761e = yVar;
        this.f762f = rVar;
        this.f763g = mVar;
        this.f764h = kVar;
    }

    @Override // Y1.f
    public final Object f(Object obj, Object obj2, Object obj3) {
        final InterfaceC0796H interfaceC0796H = (InterfaceC0796H) obj;
        C0113p c0113p = (C0113p) obj2;
        int intValue = ((Number) obj3).intValue();
        Z1.i.f(interfaceC0796H, "inner");
        if ((intValue & 6) == 0) {
            intValue |= c0113p.f(interfaceC0796H) ? 4 : 2;
        }
        if ((intValue & 19) == 18 && c0113p.x()) {
            c0113p.L();
        } else {
            c0113p.Q(-1753466476);
            final y yVar = this.f761e;
            boolean h3 = ((intValue & 14) == 4) | c0113p.h(yVar) | c0113p.h(this.f760d);
            final r rVar = this.f762f;
            boolean h4 = h3 | c0113p.h(rVar);
            final I1.m mVar = this.f763g;
            boolean h5 = h4 | c0113p.h(mVar);
            final J1.k kVar = this.f764h;
            boolean h6 = h5 | c0113p.h(kVar);
            Object G3 = c0113p.G();
            if (h6 || G3 == C0105l.f2272a) {
                final C0775D c0775d = this.f760d;
                Y1.c cVar = new Y1.c() { // from class: E1.f
                    @Override // Y1.c
                    public final Object j(Object obj4) {
                        C0772A c0772a = (C0772A) obj4;
                        Z1.i.f(c0772a, "$this$NavHost");
                        y yVar2 = y.this;
                        C0775D c0775d2 = c0775d;
                        InterfaceC0796H interfaceC0796H2 = interfaceC0796H;
                        AbstractC0382a.f(c0772a, "joints", new Q.a(-531398691, new g(yVar2, c0775d2, interfaceC0796H2, 0), true));
                        AbstractC0382a.f(c0772a, "guess", new Q.a(940973830, new h(rVar, interfaceC0796H2, 0), true));
                        AbstractC0382a.f(c0772a, "match", new Q.a(2090806117, new h(mVar, interfaceC0796H2, 1), true));
                        AbstractC0382a.f(c0772a, "saved", new Q.a(-1054328892, new g(kVar, c0775d2, interfaceC0796H2, 1), true));
                        AbstractC0382a.f(c0772a, "detail/{jointId}", new Q.a(95503395, new h(yVar2, c0775d2, 2), true));
                        return z.f2729a;
                    }
                };
                c0113p.a0(cVar);
                G3 = cVar;
            }
            c0113p.p(false);
            AbstractC0416e.g(this.f760d, null, null, null, null, null, null, null, null, (Y1.c) G3, c0113p, 48, 0);
        }
        return z.f2729a;
    }
}
