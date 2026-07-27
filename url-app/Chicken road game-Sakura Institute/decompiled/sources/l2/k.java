package l2;

import B1.C0097d;
import g2.C0638a;
import g2.C0639b;
import g2.x;
import j2.AbstractC0720j;
import j2.C0715e;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import m2.InterfaceC0860b;
import m2.InterfaceC0861c;
import o2.C0924c;
import o2.m;
import o2.n;
import o2.s;
import y.t;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: b, reason: collision with root package name */
    public static final H1.f f7991b = new H1.f(17, false);

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0861c f7992a;

    public k(InterfaceC0861c interfaceC0861c) {
        this.f7992a = interfaceC0861c;
    }

    public final g a(g gVar, g2.e eVar, C0639b c0639b, t tVar, s sVar, boolean z4, C0638a c0638a) {
        g gVar2;
        C0924c c0924c;
        g gVar3 = gVar;
        C0639b c0639b2 = c0639b;
        boolean isEmpty = ((C0821a) gVar3.f7977c).f7962a.f8941d.isEmpty();
        C0821a c0821a = (C0821a) gVar3.f7977c;
        if (isEmpty && !c0821a.f7963b) {
            return gVar3;
        }
        AbstractC0720j.b("Can't have a merge that is an overwrite", ((s) c0639b2.f6678d.f7159d) == null);
        if (!eVar.isEmpty()) {
            c0639b2 = C0639b.f6677e.h(eVar, c0639b2);
        }
        s sVar2 = c0821a.f7962a.f8941d;
        c0639b2.getClass();
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : c0639b2.f6678d.f7160e) {
            hashMap.put((C0924c) entry.getKey(), new C0639b((C0715e) entry.getValue()));
        }
        loop1: while (true) {
            gVar2 = gVar3;
            for (Map.Entry entry2 : hashMap.entrySet()) {
                c0924c = (C0924c) entry2.getKey();
                if (sVar2.i(c0924c)) {
                    break;
                }
            }
            gVar3 = b(gVar2, new g2.e(c0924c), ((C0639b) entry2.getValue()).j(sVar2.b(c0924c)), tVar, sVar, z4, c0638a);
        }
        g gVar4 = gVar2;
        for (Map.Entry entry3 : hashMap.entrySet()) {
            C0924c c0924c2 = (C0924c) entry3.getKey();
            boolean z5 = !c0821a.a(c0924c2) && ((s) ((C0639b) entry3.getValue()).f6678d.f7159d) == null;
            if (!sVar2.i(c0924c2) && !z5) {
                gVar4 = b(gVar4, new g2.e(c0924c2), ((C0639b) entry3.getValue()).j(sVar2.b(c0924c2)), tVar, sVar, z4, c0638a);
            }
        }
        return gVar4;
    }

    public final g b(g gVar, g2.e eVar, s sVar, t tVar, s sVar2, boolean z4, C0638a c0638a) {
        m l4;
        C0821a c0821a = (C0821a) gVar.f7977c;
        InterfaceC0861c interfaceC0861c = this.f7992a;
        if (!z4) {
            interfaceC0861c = interfaceC0861c.j();
        }
        boolean isEmpty = eVar.isEmpty();
        m mVar = c0821a.f7962a;
        boolean z5 = true;
        if (isEmpty) {
            l4 = interfaceC0861c.m(mVar, new m(sVar, interfaceC0861c.getIndex()), null);
        } else {
            if (!interfaceC0861c.p() || c0821a.f7964c) {
                C0924c C3 = eVar.C();
                if (!c0821a.b(eVar) && eVar.size() > 1) {
                    return gVar;
                }
                g2.e F3 = eVar.F();
                s d4 = mVar.f8941d.b(C3).d(F3, sVar);
                if (C3.equals(C0924c.f8919j)) {
                    l4 = interfaceC0861c.o(mVar, d4);
                } else {
                    l4 = interfaceC0861c.l(c0821a.f7962a, C3, d4, F3, f7991b, null);
                }
                if (!c0821a.f7963b && !eVar.isEmpty()) {
                    z5 = false;
                }
                g gVar2 = new g((C0821a) gVar.f7976b, 1, new C0821a(l4, z5, interfaceC0861c.p()));
                return d(gVar2, eVar, tVar, new C0097d(tVar, gVar2, sVar2, 16), c0638a);
            }
            AbstractC0720j.b("An empty path should have been caught in the other branch", !eVar.isEmpty());
            C0924c C4 = eVar.C();
            l4 = interfaceC0861c.m(mVar, mVar.h(C4, mVar.f8941d.b(C4).d(eVar.F(), sVar)), null);
        }
        if (!c0821a.f7963b) {
            z5 = false;
        }
        g gVar22 = new g((C0821a) gVar.f7976b, 1, new C0821a(l4, z5, interfaceC0861c.p()));
        return d(gVar22, eVar, tVar, new C0097d(tVar, gVar22, sVar2, 16), c0638a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final g c(g gVar, g2.e eVar, s sVar, t tVar, s sVar2, C0638a c0638a) {
        s j4;
        s sVar3;
        s sVar4 = sVar;
        C0821a c0821a = (C0821a) gVar.f7976b;
        C0097d c0097d = new C0097d(tVar, gVar, sVar2, 16);
        boolean isEmpty = eVar.isEmpty();
        InterfaceC0861c interfaceC0861c = this.f7992a;
        C0821a c0821a2 = (C0821a) gVar.f7976b;
        m mVar = c0821a2.f7962a;
        if (isEmpty) {
            return gVar.n(interfaceC0861c.m(mVar, new m(sVar4, interfaceC0861c.getIndex()), c0638a), true, interfaceC0861c.p());
        }
        C0924c C3 = eVar.C();
        C0924c c0924c = C0924c.f8919j;
        boolean equals = C3.equals(c0924c);
        boolean z4 = c0821a.f7963b;
        if (equals) {
            return gVar.n(interfaceC0861c.o(mVar, sVar4), z4, c0821a.f7964c);
        }
        g2.e F3 = eVar.F();
        s b4 = c0821a.f7962a.f8941d.b(C3);
        if (!F3.isEmpty()) {
            if (c0821a2.a(C3)) {
                j4 = mVar.f8941d.b(C3);
            } else {
                j4 = tVar.j(C3, sVar2 != null ? new C0821a(new m(sVar2, n.f8944a), true, false) : (C0821a) gVar.f7977c);
            }
            if (j4 == null) {
                sVar4 = o2.k.f8939k;
            } else {
                if (F3.B().equals(c0924c) && j4.p(F3.D()).isEmpty()) {
                    sVar3 = j4;
                    return b4.equals(sVar3) ? gVar.n(interfaceC0861c.l(c0821a.f7962a, C3, sVar3, F3, c0097d, c0638a), z4, interfaceC0861c.p()) : gVar;
                }
                sVar4 = j4.d(F3, sVar4);
            }
        }
        sVar3 = sVar4;
        if (b4.equals(sVar3)) {
        }
    }

    public final g d(g gVar, g2.e eVar, t tVar, InterfaceC0860b interfaceC0860b, C0638a c0638a) {
        s j4;
        m l4;
        s a4;
        C0821a c0821a = (C0821a) gVar.f7976b;
        if (tVar.u(eVar) != null) {
            return gVar;
        }
        boolean isEmpty = eVar.isEmpty();
        InterfaceC0861c interfaceC0861c = this.f7992a;
        C0821a c0821a2 = (C0821a) gVar.f7977c;
        if (isEmpty) {
            AbstractC0720j.b("If change path is empty, we must have complete server data", c0821a2.f7963b);
            if (c0821a2.f7964c) {
                s h4 = gVar.h();
                if (!(h4 instanceof o2.f)) {
                    h4 = o2.k.f8939k;
                }
                a4 = tVar.k(h4);
            } else {
                a4 = ((x) tVar.f11495i).a((g2.e) tVar.f11494e, gVar.h(), Collections.emptyList(), false);
            }
            l4 = interfaceC0861c.m(c0821a.f7962a, new m(a4, interfaceC0861c.getIndex()), c0638a);
        } else {
            C0924c C3 = eVar.C();
            boolean equals = C3.equals(C0924c.f8919j);
            m mVar = c0821a.f7962a;
            m mVar2 = c0821a2.f7962a;
            if (equals) {
                AbstractC0720j.b("Can't have a priority with additional path components", eVar.size() == 1);
                s l5 = tVar.l(eVar, mVar.f8941d, mVar2.f8941d);
                if (l5 != null) {
                    l4 = interfaceC0861c.o(mVar, l5);
                }
                l4 = mVar;
            } else {
                g2.e F3 = eVar.F();
                if (c0821a.a(C3)) {
                    s l6 = tVar.l(eVar, mVar.f8941d, mVar2.f8941d);
                    s sVar = mVar.f8941d;
                    j4 = l6 != null ? sVar.b(C3).d(F3, l6) : sVar.b(C3);
                } else {
                    j4 = tVar.j(C3, c0821a2);
                }
                if (j4 != null) {
                    l4 = interfaceC0861c.l(c0821a.f7962a, C3, j4, F3, interfaceC0860b, c0638a);
                }
                l4 = mVar;
            }
        }
        return gVar.n(l4, c0821a.f7963b || eVar.isEmpty(), interfaceC0861c.p());
    }
}
