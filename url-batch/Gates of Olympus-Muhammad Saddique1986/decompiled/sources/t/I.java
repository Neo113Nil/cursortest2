package t;

import B.C0000a;
import I.C0143d;
import I.C0156j0;
import I.C0159l;
import I.C0167p;
import I.C0173s0;
import I.W;
import I.X0;
import e2.InterfaceC0424c;
import java.util.LinkedHashSet;
import java.util.Map;
import p.C0758d0;

/* loaded from: classes.dex */
public final class I implements R.k, R.c {

    /* renamed from: a, reason: collision with root package name */
    public final R.l f8442a;

    /* renamed from: b, reason: collision with root package name */
    public final C0156j0 f8443b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f8444c;

    public I(R.k kVar, Map map) {
        G g3 = new G(kVar, 0);
        X0 x02 = R.m.f4036a;
        this.f8442a = new R.l(map, g3);
        this.f8443b = C0143d.K(null, W.f2783i);
        this.f8444c = new LinkedHashSet();
    }

    @Override // R.c
    public final void a(Object obj) {
        R.c cVar = (R.c) this.f8443b.getValue();
        if (cVar == null) {
            throw new IllegalArgumentException("null wrappedHolder");
        }
        cVar.a(obj);
    }

    @Override // R.k
    public final boolean b(Object obj) {
        return this.f8442a.b(obj);
    }

    @Override // R.k
    public final Object c(String str) {
        return this.f8442a.c(str);
    }

    @Override // R.k
    public final G1.m d(String str, A.h hVar) {
        return this.f8442a.d(str, hVar);
    }

    @Override // R.c
    public final void e(Object obj, Q.a aVar, C0167p c0167p, int i3) {
        int i4;
        c0167p.S(-697180401);
        if ((i3 & 6) == 0) {
            i4 = (c0167p.h(obj) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= c0167p.h(aVar) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= c0167p.h(this) ? 256 : 128;
        }
        if ((i4 & 147) == 146 && c0167p.x()) {
            c0167p.L();
        } else {
            R.c cVar = (R.c) this.f8443b.getValue();
            if (cVar == null) {
                throw new IllegalArgumentException("null wrappedHolder");
            }
            cVar.e(obj, aVar, c0167p, i4 & 126);
            boolean h3 = c0167p.h(this) | c0167p.h(obj);
            Object G3 = c0167p.G();
            if (h3 || G3 == C0159l.f2829a) {
                G3 = new C0758d0(this, 3, obj);
                c0167p.a0(G3);
            }
            C0143d.c(obj, (InterfaceC0424c) G3, c0167p);
        }
        C0173s0 r3 = c0167p.r();
        if (r3 != null) {
            r3.f2906d = new C0000a(this, obj, aVar, i3, 6);
        }
    }
}
