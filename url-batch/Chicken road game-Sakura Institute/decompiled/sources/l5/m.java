package l5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f6052a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final n5.a f6053b;

    public m(n5.a aVar) {
        this.f6053b = aVar;
    }

    public final ArrayList a(l3.g gVar, androidx.room.c cVar, t5.s sVar) {
        q5.h hVar = ((m5.d) gVar.f5901b).f6430b;
        HashMap hashMap = this.f6052a;
        if (hVar != null) {
            q5.j jVar = (q5.j) hashMap.get(hVar);
            o5.j.c(jVar != null);
            return b(jVar, gVar, cVar, sVar);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.addAll(b((q5.j) ((Map.Entry) it.next()).getValue(), gVar, cVar, sVar));
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x03f0, code lost:
    
        if (r5.equals(r8 ? r7.f7513a.f8910f : null) != false) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x040c, code lost:
    
        if (r5.equals((r6.f7514b ? r6.f7513a.f8910f : null).c()) == false) goto L195;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList b(q5.j jVar, l3.g gVar, androidx.room.c cVar, t5.s sVar) {
        q5.g gVar2;
        q5.g b9;
        q5.g gVar3;
        a aVar;
        a aVar2;
        a aVar3;
        q5.g p6;
        q5.g gVar4;
        androidx.room.c cVar2 = cVar;
        f fVar = (f) cVar2.f1069g;
        x xVar = (x) cVar2.f1070h;
        jVar.getClass();
        q5.i iVar = jVar.f7537a;
        int i7 = gVar.f5900a;
        if (i7 == 2 && ((m5.d) gVar.f5901b).f6430b != null) {
            o5.j.b("We should always have a full cache before handling merges", jVar.f7539c.j() != null);
            q5.a aVar4 = (q5.a) jVar.f7539c.f7527g;
            o5.j.b("Missing event cache, even though we have a server cache", (aVar4.f7514b ? aVar4.f7513a.f8910f : null) != null);
        }
        q5.g gVar5 = jVar.f7539c;
        q5.k kVar = jVar.f7538b;
        kVar.getClass();
        r5.c cVar3 = kVar.f7543a;
        a aVar5 = new a();
        int d8 = l.h.d(i7);
        if (d8 == 0) {
            gVar2 = gVar5;
            m5.e eVar = (m5.e) gVar;
            m5.d dVar = (m5.d) eVar.f5901b;
            int i8 = dVar.f6429a;
            if (i8 == 1) {
                b9 = kVar.c(gVar2, (f) eVar.f5902c, eVar.f6432d, cVar, sVar, aVar5);
            } else {
                o5.j.c(i8 == 2);
                b9 = kVar.b(gVar2, (f) eVar.f5902c, eVar.f6432d, cVar, sVar, dVar.f6431c || (((q5.a) gVar2.f7528h).f7515c && !((f) eVar.f5902c).isEmpty()), aVar5);
            }
        } else if (d8 == 1) {
            a aVar6 = aVar5;
            gVar3 = gVar5;
            t5.s sVar2 = sVar;
            m5.c cVar4 = (m5.c) gVar;
            m5.d dVar2 = (m5.d) cVar4.f5901b;
            int i9 = dVar2.f6429a;
            if (i9 == 1) {
                f fVar2 = (f) cVar4.f5902c;
                o5.e eVar2 = cVar4.f6426d.f6007f;
                o5.j.b("Can't have a merge that is an overwrite", ((t5.s) eVar2.f6846f) == null);
                Iterator it = eVar2.iterator();
                q5.g gVar6 = gVar3;
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    f g9 = fVar2.g((f) entry.getKey());
                    if (((q5.a) gVar3.f7527g).a(g9.z())) {
                        t5.s sVar3 = sVar2;
                        a aVar7 = aVar6;
                        gVar6 = kVar.c(gVar6, g9, (t5.s) entry.getValue(), cVar2, sVar3, aVar7);
                        aVar2 = aVar7;
                    } else {
                        aVar2 = aVar6;
                    }
                    cVar2 = cVar;
                    sVar2 = sVar;
                    aVar6 = aVar2;
                }
                aVar = aVar6;
                Iterator it2 = eVar2.iterator();
                while (it2.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) it2.next();
                    f g10 = fVar2.g((f) entry2.getKey());
                    if (!((q5.a) gVar3.f7527g).a(g10.z())) {
                        gVar6 = kVar.c(gVar6, g10, (t5.s) entry2.getValue(), cVar, sVar, aVar);
                    }
                }
                b9 = gVar6;
                gVar2 = gVar3;
                aVar5 = aVar;
            } else {
                o5.j.c(i9 == 2);
                boolean z8 = dVar2.f6431c || ((q5.a) gVar3.f7528h).f7515c;
                f fVar3 = (f) cVar4.f5902c;
                b bVar = cVar4.f6426d;
                gVar2 = gVar3;
                aVar5 = aVar6;
                b9 = kVar.a(gVar2, fVar3, bVar, cVar, sVar, z8, aVar5);
            }
        } else if (d8 == 2) {
            m5.a aVar8 = (m5.a) gVar;
            f fVar4 = (f) aVar8.f5902c;
            if (aVar8.f6424d) {
                if (cVar2.z(fVar4) != null) {
                    p6 = gVar5;
                    aVar3 = aVar5;
                } else {
                    b1.b bVar2 = new b1.b(cVar2, gVar5, sVar, 18);
                    q5.a aVar9 = (q5.a) gVar5.f7527g;
                    q5.a aVar10 = (q5.a) gVar5.f7528h;
                    boolean z9 = aVar10.f7514b;
                    t5.m mVar = aVar9.f7513a;
                    if (fVar4.isEmpty() || fVar4.z().equals(t5.c.f8888i)) {
                        aVar3 = aVar5;
                        mVar = cVar3.i(mVar, new t5.m(z9 ? xVar.a(fVar, gVar5.j(), Collections.EMPTY_LIST, false) : cVar2.p(aVar10.f7513a.f8910f), cVar3.getIndex()), aVar3);
                    } else {
                        t5.c z10 = fVar4.z();
                        t5.s o2 = cVar2.o(z10, aVar10);
                        if (o2 == null && aVar10.a(z10)) {
                            o2 = mVar.f8910f.d(z10);
                        }
                        t5.s sVar4 = o2;
                        if (sVar4 != null) {
                            mVar = cVar3.d(mVar, z10, sVar4, fVar4.C(), bVar2, aVar5);
                        } else if (sVar4 == null && ((q5.a) gVar5.f7527g).f7513a.f8910f.s(z10)) {
                            mVar = cVar3.d(mVar, z10, t5.k.f8908j, fVar4.C(), bVar2, aVar5);
                        }
                        aVar3 = aVar5;
                        if (mVar.f8910f.isEmpty() && z9) {
                            t5.s a3 = xVar.a(fVar, gVar5.j(), Collections.EMPTY_LIST, false);
                            if (a3.i()) {
                                mVar = cVar3.i(mVar, new t5.m(a3, cVar3.getIndex()), aVar3);
                            }
                        }
                    }
                    p6 = gVar5.p(mVar, z9 || cVar2.z(f.f6023i) != null, cVar3.h());
                }
                b9 = p6;
                gVar2 = gVar5;
                aVar5 = aVar3;
            } else {
                o5.e eVar3 = aVar8.f6425e;
                if (cVar2.z(fVar4) == null) {
                    q5.a aVar11 = (q5.a) gVar5.f7528h;
                    boolean z11 = aVar11.f7515c;
                    t5.m mVar2 = aVar11.f7513a;
                    if (eVar3.f6846f == null) {
                        b bVar3 = b.f6006g;
                        Iterator it3 = eVar3.iterator();
                        while (it3.hasNext()) {
                            f fVar5 = (f) ((Map.Entry) it3.next()).getKey();
                            f g11 = fVar4.g(fVar5);
                            if (aVar11.b(g11)) {
                                bVar3 = bVar3.a(fVar5, mVar2.f8910f.b(g11));
                            }
                        }
                        gVar4 = gVar5;
                        gVar5 = kVar.a(gVar4, fVar4, bVar3, cVar, sVar, z11, aVar5);
                    } else if ((fVar4.isEmpty() && aVar11.f7514b) || aVar11.b(fVar4)) {
                        gVar4 = gVar5;
                        gVar5 = kVar.b(gVar4, fVar4, mVar2.f8910f.b(fVar4), cVar2, sVar, z11, aVar5);
                    } else {
                        gVar4 = gVar5;
                        if (fVar4.isEmpty()) {
                            b bVar4 = b.f6006g;
                            for (t5.q qVar : mVar2.f8910f) {
                                t5.c cVar5 = qVar.f8919a;
                                t5.s sVar5 = qVar.f8920b;
                                bVar4.getClass();
                                bVar4 = bVar4.a(new f(cVar5), sVar5);
                            }
                            gVar5 = kVar.a(gVar4, fVar4, bVar4, cVar, sVar, z11, aVar5);
                        } else {
                            gVar5 = gVar4;
                        }
                    }
                    aVar = aVar5;
                    gVar3 = gVar4;
                    b9 = gVar5;
                    gVar2 = gVar3;
                    aVar5 = aVar;
                }
                aVar = aVar5;
                gVar3 = gVar5;
                b9 = gVar5;
                gVar2 = gVar3;
                aVar5 = aVar;
            }
        } else {
            if (d8 != 3) {
                throw new AssertionError("Unknown operation: ".concat(i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? "null" : "ListenComplete" : "AckUserWrite" : "Merge" : "Overwrite"));
            }
            f fVar6 = (f) gVar.f5902c;
            q5.a aVar12 = (q5.a) gVar5.f7528h;
            b9 = kVar.d(new q5.g((q5.a) gVar5.f7527g, 1, new q5.a(aVar12.f7513a, aVar12.f7514b || fVar6.isEmpty(), aVar12.f7515c)), fVar6, cVar, q5.k.f7542b, aVar5);
            gVar2 = gVar5;
        }
        ArrayList arrayList = new ArrayList(new ArrayList(aVar5.f6005f.values()));
        q5.a aVar13 = (q5.a) b9.f7527g;
        boolean z12 = aVar13.f7514b;
        t5.m mVar3 = aVar13.f7513a;
        if (z12) {
            t5.s sVar6 = mVar3.f8910f;
            boolean z13 = sVar6.i() || sVar6.isEmpty();
            if (arrayList.isEmpty() && (r8 = (r7 = (q5.a) gVar2.f7527g).f7514b)) {
                if (z13) {
                }
                t5.s c4 = sVar6.c();
                q5.a aVar14 = (q5.a) gVar2.f7527g;
            }
            arrayList.add(new q5.c(5, mVar3, null, null));
        }
        o5.j.b("Once a server snap is complete, it should never go back", ((q5.a) b9.f7528h).f7514b || !((q5.a) gVar2.f7528h).f7514b);
        jVar.f7539c = b9;
        ArrayList a9 = jVar.a(arrayList, ((q5.a) b9.f7527g).f7513a, null);
        if (!iVar.f7536b.d()) {
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                q5.c cVar6 = (q5.c) obj;
                int i11 = cVar6.f7519a;
                t5.c cVar7 = cVar6.f7522d;
                if (i11 == 2) {
                    hashSet2.add(cVar7);
                } else if (i11 == 1) {
                    hashSet.add(cVar7);
                }
            }
            if (!hashSet2.isEmpty() || !hashSet.isEmpty()) {
                this.f6053b.b();
                return a9;
            }
        }
        return a9;
    }

    public final t5.s c(f fVar) {
        t5.s sVar;
        Iterator it = this.f6052a.values().iterator();
        do {
            sVar = null;
            if (!it.hasNext()) {
                break;
            }
            q5.j jVar = (q5.j) it.next();
            t5.s j8 = jVar.f7539c.j();
            if (j8 != null && (jVar.f7537a.f7536b.d() || (!fVar.isEmpty() && !j8.d(fVar.z()).isEmpty()))) {
                sVar = j8.b(fVar);
            }
        } while (sVar == null);
        return sVar;
    }

    public final q5.j d() {
        Iterator it = this.f6052a.entrySet().iterator();
        while (it.hasNext()) {
            q5.j jVar = (q5.j) ((Map.Entry) it.next()).getValue();
            if (jVar.f7537a.f7536b.d()) {
                return jVar;
            }
        }
        return null;
    }

    public final ArrayList e() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f6052a.entrySet().iterator();
        while (it.hasNext()) {
            q5.j jVar = (q5.j) ((Map.Entry) it.next()).getValue();
            if (!jVar.f7537a.f7536b.d()) {
                arrayList.add(jVar);
            }
        }
        return arrayList;
    }

    public final boolean f() {
        return d() != null;
    }

    public final q5.j g(q5.i iVar) {
        return iVar.f7536b.d() ? d() : (q5.j) this.f6052a.get(iVar.f7536b);
    }
}
