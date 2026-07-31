package u;

import D1.C0014b;
import I.C0089d;
import I.C0102j0;
import I.C0105l;
import I.C0113p;
import I.C0119s0;
import I.X;
import I.Y0;
import java.util.LinkedHashSet;
import java.util.Map;

/* loaded from: classes.dex */
public final class P implements R.k, R.c {

    /* renamed from: a, reason: collision with root package name */
    public final R.l f8031a;

    /* renamed from: b, reason: collision with root package name */
    public final C0102j0 f8032b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f8033c;

    public P(R.k kVar, Map map) {
        C0932N c0932n = new C0932N(kVar, 0);
        Y0 y02 = R.m.f3163a;
        this.f8031a = new R.l(map, c0932n);
        this.f8032b = C0089d.J(null, X.f2228i);
        this.f8033c = new LinkedHashSet();
    }

    @Override // R.k
    public final C0014b a(String str, A2.l lVar) {
        return this.f8031a.a(str, lVar);
    }

    @Override // R.c
    public final void b(Object obj) {
        R.c cVar = (R.c) this.f8032b.getValue();
        if (cVar == null) {
            throw new IllegalArgumentException("null wrappedHolder");
        }
        cVar.b(obj);
    }

    @Override // R.k
    public final boolean c(Object obj) {
        return this.f8031a.c(obj);
    }

    @Override // R.k
    public final Object d(String str) {
        return this.f8031a.d(str);
    }

    @Override // R.c
    public final void e(Object obj, Q.a aVar, C0113p c0113p, int i3) {
        int i4;
        c0113p.S(-697180401);
        if ((i3 & 6) == 0) {
            i4 = (c0113p.h(obj) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= c0113p.h(aVar) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= c0113p.h(this) ? 256 : 128;
        }
        if ((i4 & 147) == 146 && c0113p.x()) {
            c0113p.L();
        } else {
            R.c cVar = (R.c) this.f8032b.getValue();
            if (cVar == null) {
                throw new IllegalArgumentException("null wrappedHolder");
            }
            cVar.e(obj, aVar, c0113p, i4 & 126);
            boolean h3 = c0113p.h(this) | c0113p.h(obj);
            Object G3 = c0113p.G();
            if (h3 || G3 == C0105l.f2272a) {
                G3 = new t.o(this, 1, obj);
                c0113p.a0(G3);
            }
            C0089d.c(obj, (Y1.c) G3, c0113p);
        }
        C0119s0 r3 = c0113p.r();
        if (r3 != null) {
            r3.f2347d = new P0.d(this, obj, aVar, i3, 5);
        }
    }
}
