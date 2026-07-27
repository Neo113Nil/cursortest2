package g2;

import B1.C0097d;
import G.C0231x;
import h2.C0659a;
import j2.AbstractC0720j;
import j2.C0715e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import l.AbstractC0784j;
import l2.C0821a;
import l2.C0823c;
import m2.InterfaceC0861c;
import o2.C0924c;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f6723a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final C0231x f6724b;

    public l(C0231x c0231x) {
        this.f6724b = c0231x;
    }

    public final ArrayList a(h2.d dVar, y.t tVar, o2.s sVar) {
        l2.h hVar = ((h2.e) dVar.f6874b).f6879b;
        HashMap hashMap = this.f6723a;
        if (hVar != null) {
            l2.j jVar = (l2.j) hashMap.get(hVar);
            AbstractC0720j.c(jVar != null);
            return b(jVar, dVar, tVar, sVar);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.addAll(b((l2.j) ((Map.Entry) it.next()).getValue(), dVar, tVar, sVar));
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x03e8, code lost:
    
        if (r5.equals(r7 ? r6.f7962a.f8941d : null) != false) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0404, code lost:
    
        if (r4.equals((r5.f7963b ? r5.f7962a.f8941d : null).k()) == false) goto L193;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList b(l2.j jVar, h2.d dVar, y.t tVar, o2.s sVar) {
        C0638a c0638a;
        l2.g b4;
        e eVar;
        e eVar2;
        C0715e c0715e;
        C0638a c0638a2;
        jVar.getClass();
        int i2 = dVar.f6873a;
        if (i2 == 2 && ((h2.e) dVar.f6874b).f6879b != null) {
            AbstractC0720j.b("We should always have a full cache before handling merges", jVar.f7988c.h() != null);
            C0821a c0821a = (C0821a) jVar.f7988c.f7976b;
            AbstractC0720j.b("Missing event cache, even though we have a server cache", (c0821a.f7963b ? c0821a.f7962a.f8941d : null) != null);
        }
        l2.g gVar = jVar.f7988c;
        l2.k kVar = jVar.f7987b;
        kVar.getClass();
        C0638a c0638a3 = new C0638a();
        int d4 = AbstractC0784j.d(i2);
        if (d4 == 0) {
            c0638a = c0638a3;
            h2.f fVar = (h2.f) dVar;
            h2.e eVar3 = (h2.e) fVar.f6874b;
            int i4 = eVar3.f6878a;
            if (i4 == 1) {
                b4 = kVar.c(gVar, (e) fVar.f6875c, fVar.f6881d, tVar, sVar, c0638a);
            } else {
                AbstractC0720j.c(i4 == 2);
                b4 = kVar.b(gVar, (e) fVar.f6875c, fVar.f6881d, tVar, sVar, eVar3.f6880c || (((C0821a) gVar.f7977c).f7964c && !((e) fVar.f6875c).isEmpty()), c0638a);
            }
        } else if (d4 != 1) {
            if (d4 == 2) {
                C0659a c0659a = (C0659a) dVar;
                boolean z4 = c0659a.f6870d;
                e eVar4 = (e) c0659a.f6875c;
                if (z4) {
                    if (tVar.u(eVar4) != null) {
                        b4 = gVar;
                        c0638a2 = c0638a3;
                    } else {
                        C0097d c0097d = new C0097d(tVar, gVar, sVar, 16);
                        C0821a c0821a2 = (C0821a) gVar.f7976b;
                        boolean isEmpty = eVar4.isEmpty();
                        InterfaceC0861c interfaceC0861c = kVar.f7992a;
                        C0821a c0821a3 = (C0821a) gVar.f7977c;
                        x xVar = (x) tVar.f11495i;
                        e eVar5 = (e) tVar.f11494e;
                        o2.m mVar = c0821a2.f7962a;
                        boolean z5 = c0821a3.f7963b;
                        if (isEmpty || eVar4.C().equals(C0924c.f8919j)) {
                            c0638a2 = c0638a3;
                            mVar = interfaceC0861c.m(mVar, new o2.m(z5 ? xVar.a(eVar5, gVar.h(), Collections.emptyList(), false) : tVar.k(c0821a3.f7962a.f8941d), interfaceC0861c.getIndex()), c0638a2);
                        } else {
                            C0924c C3 = eVar4.C();
                            o2.s j4 = tVar.j(C3, c0821a3);
                            o2.s b5 = (j4 == null && c0821a3.a(C3)) ? mVar.f8941d.b(C3) : j4;
                            if (b5 != null) {
                                c0638a2 = c0638a3;
                                mVar = interfaceC0861c.l(mVar, C3, b5, eVar4.F(), c0097d, c0638a2);
                            } else {
                                c0638a2 = c0638a3;
                                if (b5 == null && ((C0821a) gVar.f7976b).f7962a.f8941d.i(C3)) {
                                    mVar = interfaceC0861c.l(mVar, C3, o2.k.f8939k, eVar4.F(), c0097d, c0638a2);
                                }
                            }
                            if (mVar.f8941d.isEmpty() && z5) {
                                o2.s a4 = xVar.a(eVar5, gVar.h(), Collections.emptyList(), false);
                                if (a4.y()) {
                                    mVar = interfaceC0861c.m(mVar, new o2.m(a4, interfaceC0861c.getIndex()), c0638a2);
                                }
                            }
                        }
                        b4 = gVar.n(mVar, z5 || tVar.u(e.f6694j) != null, interfaceC0861c.p());
                    }
                    c0638a = c0638a2;
                } else {
                    if (tVar.u(eVar4) == null) {
                        C0821a c0821a4 = (C0821a) gVar.f7977c;
                        C0715e c0715e2 = c0659a.f6871e;
                        Object obj = c0715e2.f7159d;
                        boolean z6 = c0821a4.f7964c;
                        o2.m mVar2 = c0821a4.f7962a;
                        if (obj == null) {
                            C0639b c0639b = C0639b.f6677e;
                            Iterator it = c0715e2.iterator();
                            while (it.hasNext()) {
                                e eVar6 = (e) ((Map.Entry) it.next()).getKey();
                                e h4 = eVar4.h(eVar6);
                                if (c0821a4.b(h4)) {
                                    c0639b = c0639b.e(eVar6, mVar2.f8941d.p(h4));
                                }
                            }
                            b4 = kVar.a(gVar, eVar4, c0639b, tVar, sVar, z6, c0638a3);
                        } else if ((eVar4.isEmpty() && c0821a4.f7963b) || c0821a4.b(eVar4)) {
                            b4 = kVar.b(gVar, eVar4, mVar2.f8941d.p(eVar4), tVar, sVar, z6, c0638a3);
                        } else if (eVar4.isEmpty()) {
                            C0639b c0639b2 = C0639b.f6677e;
                            C0639b c0639b3 = c0639b2;
                            for (o2.q qVar : mVar2.f8941d) {
                                C0924c c0924c = qVar.f8950a;
                                c0639b3.getClass();
                                c0639b3 = c0639b3.e(new e(c0924c), qVar.f8951b);
                            }
                            b4 = kVar.a(gVar, eVar4, c0639b3, tVar, sVar, z6, c0638a3);
                        }
                    }
                    b4 = gVar;
                }
            } else {
                if (d4 != 3) {
                    throw new AssertionError("Unknown operation: ".concat(i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "null" : "ListenComplete" : "AckUserWrite" : "Merge" : "Overwrite"));
                }
                C0821a c0821a5 = (C0821a) gVar.f7977c;
                boolean z7 = c0821a5.f7963b;
                e eVar7 = (e) dVar.f6875c;
                b4 = kVar.d(new l2.g((C0821a) gVar.f7976b, 1, new C0821a(c0821a5.f7962a, z7 || eVar7.isEmpty(), c0821a5.f7964c)), eVar7, tVar, l2.k.f7991b, c0638a3);
            }
            c0638a = c0638a3;
        } else {
            c0638a = c0638a3;
            h2.c cVar = (h2.c) dVar;
            h2.e eVar8 = (h2.e) cVar.f6874b;
            int i5 = eVar8.f6878a;
            if (i5 == 1) {
                C0639b c0639b4 = cVar.f6872d;
                AbstractC0720j.b("Can't have a merge that is an overwrite", ((o2.s) c0639b4.f6678d.f7159d) == null);
                C0715e c0715e3 = c0639b4.f6678d;
                Iterator it2 = c0715e3.iterator();
                l2.g gVar2 = gVar;
                while (true) {
                    boolean hasNext = it2.hasNext();
                    eVar = (e) cVar.f6875c;
                    if (!hasNext) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it2.next();
                    e h5 = eVar.h((e) entry.getKey());
                    if (((C0821a) gVar.f7976b).a(h5.C())) {
                        c0715e = c0715e3;
                        gVar2 = kVar.c(gVar2, h5, (o2.s) entry.getValue(), tVar, sVar, c0638a);
                    } else {
                        c0715e = c0715e3;
                    }
                    c0715e3 = c0715e;
                }
                Iterator it3 = c0715e3.iterator();
                while (it3.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) it3.next();
                    e h6 = eVar.h((e) entry2.getKey());
                    if (((C0821a) gVar.f7976b).a(h6.C())) {
                        eVar2 = eVar;
                    } else {
                        eVar2 = eVar;
                        gVar2 = kVar.c(gVar2, h6, (o2.s) entry2.getValue(), tVar, sVar, c0638a);
                    }
                    eVar = eVar2;
                }
                b4 = gVar2;
            } else {
                AbstractC0720j.c(i5 == 2);
                b4 = kVar.a(gVar, (e) cVar.f6875c, cVar.f6872d, tVar, sVar, eVar8.f6880c || ((C0821a) gVar.f7977c).f7964c, c0638a);
            }
        }
        ArrayList arrayList = new ArrayList(new ArrayList(c0638a.f6676d.values()));
        C0821a c0821a6 = (C0821a) b4.f7976b;
        if (c0821a6.f7963b) {
            o2.m mVar3 = c0821a6.f7962a;
            boolean y4 = mVar3.f8941d.y();
            o2.s sVar2 = mVar3.f8941d;
            boolean z8 = y4 || sVar2.isEmpty();
            if (arrayList.isEmpty() && (r7 = (r6 = (C0821a) gVar.f7976b).f7963b)) {
                if (z8) {
                }
                o2.s k4 = sVar2.k();
                C0821a c0821a7 = (C0821a) gVar.f7976b;
            }
            arrayList.add(new C0823c(5, mVar3, null, null));
        }
        AbstractC0720j.b("Once a server snap is complete, it should never go back", ((C0821a) b4.f7977c).f7963b || !((C0821a) gVar.f7977c).f7963b);
        jVar.f7988c = b4;
        ArrayList a5 = jVar.a(arrayList, ((C0821a) b4.f7976b).f7962a, null);
        if (!jVar.f7986a.f7985b.d()) {
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                C0823c c0823c = (C0823c) it4.next();
                int i6 = c0823c.f7968a;
                C0924c c0924c2 = c0823c.f7971d;
                if (i6 == 2) {
                    hashSet2.add(c0924c2);
                } else if (i6 == 1) {
                    hashSet.add(c0924c2);
                }
            }
            if (!hashSet2.isEmpty() || !hashSet.isEmpty()) {
                this.f6724b.b();
                return a5;
            }
        }
        return a5;
    }

    public final o2.s c(e eVar) {
        o2.s sVar;
        Iterator it = this.f6723a.values().iterator();
        do {
            sVar = null;
            if (!it.hasNext()) {
                break;
            }
            l2.j jVar = (l2.j) it.next();
            o2.s h4 = jVar.f7988c.h();
            if (h4 != null && (jVar.f7986a.f7985b.d() || (!eVar.isEmpty() && !h4.b(eVar.C()).isEmpty()))) {
                sVar = h4.p(eVar);
            }
        } while (sVar == null);
        return sVar;
    }

    public final l2.j d() {
        Iterator it = this.f6723a.entrySet().iterator();
        while (it.hasNext()) {
            l2.j jVar = (l2.j) ((Map.Entry) it.next()).getValue();
            if (jVar.f7986a.f7985b.d()) {
                return jVar;
            }
        }
        return null;
    }

    public final ArrayList e() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f6723a.entrySet().iterator();
        while (it.hasNext()) {
            l2.j jVar = (l2.j) ((Map.Entry) it.next()).getValue();
            if (!jVar.f7986a.f7985b.d()) {
                arrayList.add(jVar);
            }
        }
        return arrayList;
    }

    public final boolean f() {
        return d() != null;
    }

    public final l2.j g(l2.i iVar) {
        return iVar.f7985b.d() ? d() : (l2.j) this.f6723a.get(iVar.f7985b);
    }
}
