package q5;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import l5.x;
import t5.m;
import t5.n;
import t5.s;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: b, reason: collision with root package name */
    public static final m4.f f7542b = new m4.f();

    /* renamed from: a, reason: collision with root package name */
    public final r5.c f7543a;

    public k(r5.c cVar) {
        this.f7543a = cVar;
    }

    public final g a(g gVar, l5.f fVar, l5.b bVar, androidx.room.c cVar, s sVar, boolean z8, l5.a aVar) {
        g gVar2;
        t5.c cVar2;
        g gVar3 = gVar;
        l5.b bVar2 = bVar;
        a aVar2 = (a) gVar3.f7528h;
        if (aVar2.f7513a.f8910f.isEmpty() && !aVar2.f7514b) {
            return gVar3;
        }
        o5.j.b("Can't have a merge that is an overwrite", ((s) bVar2.f6007f.f6846f) == null);
        if (!fVar.isEmpty()) {
            bVar2 = l5.b.f6006g.g(fVar, bVar2);
        }
        s sVar2 = aVar2.f7513a.f8910f;
        bVar2.getClass();
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : bVar2.f6007f.f6847g) {
            hashMap.put((t5.c) entry.getKey(), new l5.b((o5.e) entry.getValue()));
        }
        loop1: while (true) {
            gVar2 = gVar3;
            for (Map.Entry entry2 : hashMap.entrySet()) {
                cVar2 = (t5.c) entry2.getKey();
                if (sVar2.s(cVar2)) {
                    break;
                }
            }
            gVar3 = b(gVar2, new l5.f(cVar2), ((l5.b) entry2.getValue()).m(sVar2.d(cVar2)), cVar, sVar, z8, aVar);
        }
        for (Map.Entry entry3 : hashMap.entrySet()) {
            t5.c cVar3 = (t5.c) entry3.getKey();
            boolean z9 = !aVar2.a(cVar3) && ((s) ((l5.b) entry3.getValue()).f6007f.f6846f) == null;
            if (!sVar2.s(cVar3) && !z9) {
                gVar2 = b(gVar2, new l5.f(cVar3), ((l5.b) entry3.getValue()).m(sVar2.d(cVar3)), cVar, sVar, z8, aVar);
            }
        }
        return gVar2;
    }

    public final g b(g gVar, l5.f fVar, s sVar, androidx.room.c cVar, s sVar2, boolean z8, l5.a aVar) {
        l5.f fVar2;
        m l8;
        a aVar2 = (a) gVar.f7528h;
        m mVar = aVar2.f7513a;
        r5.c cVar2 = this.f7543a;
        if (!z8) {
            cVar2 = cVar2.g();
        }
        r5.c cVar3 = cVar2;
        boolean z9 = true;
        if (fVar.isEmpty()) {
            l8 = cVar3.i(mVar, new m(sVar, cVar3.getIndex()), null);
        } else {
            if (!cVar3.h() || aVar2.f7515c) {
                t5.c z10 = fVar.z();
                fVar2 = fVar;
                if (!aVar2.b(fVar2) && fVar2.size() > 1) {
                    return gVar;
                }
                l5.f C = fVar2.C();
                s u8 = mVar.f8910f.d(z10).u(C, sVar);
                l8 = z10.equals(t5.c.f8888i) ? cVar3.l(mVar, u8) : cVar3.d(aVar2.f7513a, z10, u8, C, f7542b, null);
                if (!aVar2.f7514b && !fVar2.isEmpty()) {
                    z9 = false;
                }
                g gVar2 = new g((a) gVar.f7527g, 1, new a(l8, z9, cVar3.h()));
                return d(gVar2, fVar, cVar, new b1.b(cVar, gVar2, sVar2, 18), aVar);
            }
            o5.j.b("An empty path should have been caught in the other branch", !fVar.isEmpty());
            t5.c z11 = fVar.z();
            l8 = cVar3.i(mVar, mVar.g(z11, mVar.f8910f.d(z11).u(fVar.C(), sVar)), null);
        }
        fVar2 = fVar;
        if (!aVar2.f7514b) {
            z9 = false;
        }
        g gVar22 = new g((a) gVar.f7527g, 1, new a(l8, z9, cVar3.h()));
        return d(gVar22, fVar, cVar, new b1.b(cVar, gVar22, sVar2, 18), aVar);
    }

    public final g c(g gVar, l5.f fVar, s sVar, androidx.room.c cVar, s sVar2, l5.a aVar) {
        r5.c cVar2;
        a aVar2;
        s o2;
        s sVar3;
        s sVar4;
        a aVar3 = (a) gVar.f7527g;
        boolean z8 = aVar3.f7514b;
        m mVar = aVar3.f7513a;
        b1.b bVar = new b1.b(cVar, gVar, sVar2, 18);
        boolean isEmpty = fVar.isEmpty();
        r5.c cVar3 = this.f7543a;
        if (isEmpty) {
            return gVar.p(cVar3.i(mVar, new m(sVar, cVar3.getIndex()), aVar), true, cVar3.h());
        }
        t5.c z9 = fVar.z();
        t5.c cVar4 = t5.c.f8888i;
        if (z9.equals(cVar4)) {
            return gVar.p(cVar3.l(mVar, sVar), z8, aVar3.f7515c);
        }
        l5.f C = fVar.C();
        s d8 = aVar3.f7513a.f8910f.d(z9);
        if (C.isEmpty()) {
            sVar4 = sVar;
            cVar2 = cVar3;
        } else {
            if (aVar3.a(z9)) {
                o2 = mVar.f8910f.d(z9);
                cVar2 = cVar3;
            } else {
                if (sVar2 != null) {
                    cVar2 = cVar3;
                    aVar2 = new a(new m(sVar2, n.f8913a), true, false);
                } else {
                    cVar2 = cVar3;
                    aVar2 = (a) gVar.f7528h;
                }
                o2 = cVar.o(z9, aVar2);
            }
            if (o2 == null) {
                sVar3 = t5.k.f8908j;
            } else if (C.y().equals(cVar4) && o2.b(C.A()).isEmpty()) {
                sVar4 = o2;
            } else {
                sVar3 = o2.u(C, sVar);
            }
            sVar4 = sVar3;
        }
        if (d8.equals(sVar4)) {
            return gVar;
        }
        return gVar.p(cVar2.d(aVar3.f7513a, z9, sVar4, C, bVar, aVar), z8, cVar2.h());
    }

    public final g d(g gVar, l5.f fVar, androidx.room.c cVar, r5.b bVar, l5.a aVar) {
        s o2;
        s a3;
        a aVar2 = (a) gVar.f7527g;
        m mVar = aVar2.f7513a;
        a aVar3 = (a) gVar.f7528h;
        m mVar2 = aVar3.f7513a;
        if (cVar.z(fVar) != null) {
            return gVar;
        }
        boolean isEmpty = fVar.isEmpty();
        r5.c cVar2 = this.f7543a;
        if (isEmpty) {
            o5.j.b("If change path is empty, we must have complete server data", aVar3.f7514b);
            if (aVar3.f7515c) {
                s j8 = gVar.j();
                if (!(j8 instanceof t5.f)) {
                    j8 = t5.k.f8908j;
                }
                a3 = cVar.p(j8);
            } else {
                a3 = ((x) cVar.f1070h).a((l5.f) cVar.f1069g, gVar.j(), Collections.EMPTY_LIST, false);
            }
            mVar = cVar2.i(aVar2.f7513a, new m(a3, cVar2.getIndex()), aVar);
        } else {
            t5.c z8 = fVar.z();
            if (z8.equals(t5.c.f8888i)) {
                o5.j.b("Can't have a priority with additional path components", fVar.size() == 1);
                s q8 = cVar.q(fVar, mVar.f8910f, mVar2.f8910f);
                if (q8 != null) {
                    mVar = cVar2.l(mVar, q8);
                }
            } else {
                l5.f C = fVar.C();
                if (aVar2.a(z8)) {
                    s sVar = mVar2.f8910f;
                    s sVar2 = mVar.f8910f;
                    s sVar3 = mVar.f8910f;
                    s q9 = cVar.q(fVar, sVar2, sVar);
                    o2 = q9 != null ? sVar3.d(z8).u(C, q9) : sVar3.d(z8);
                } else {
                    o2 = cVar.o(z8, aVar3);
                }
                s sVar4 = o2;
                if (sVar4 != null) {
                    mVar = cVar2.d(aVar2.f7513a, z8, sVar4, C, bVar, aVar);
                }
            }
        }
        return gVar.p(mVar, aVar2.f7514b || fVar.isEmpty(), cVar2.h());
    }
}
