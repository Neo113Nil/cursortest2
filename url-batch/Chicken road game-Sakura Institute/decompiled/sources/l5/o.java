package l5;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class o implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6059a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l.v f6060b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6061c;

    public /* synthetic */ o(l.v vVar, Object obj, int i7) {
        this.f6059a = i7;
        this.f6060b = vVar;
        this.f6061c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        boolean z8;
        q5.a aVar;
        t5.s c4;
        boolean z9;
        switch (this.f6059a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                w wVar = (w) this.f6061c;
                q5.i iVar = wVar.f6090f;
                f fVar = iVar.f7535a;
                q5.h hVar = iVar.f7536b;
                l.v vVar = this.f6060b;
                o5.e eVar = (o5.e) vVar.f5681b;
                HashMap hashMap = (HashMap) vVar.f5684e;
                n5.a aVar2 = (n5.a) vVar.f5686g;
                f fVar2 = fVar;
                boolean z10 = false;
                t5.s sVar = null;
                while (true) {
                    boolean z11 = true;
                    if (eVar.isEmpty()) {
                        m mVar = (m) ((o5.e) vVar.f5681b).m(fVar);
                        if (mVar == null) {
                            mVar = new m(aVar2);
                            vVar.f5681b = ((o5.e) vVar.f5681b).y(fVar, mVar);
                        } else {
                            z10 = z10 || mVar.f();
                            if (sVar == null) {
                                sVar = mVar.c(f.f6023i);
                            }
                        }
                        aVar2.b();
                        if (sVar != null) {
                            aVar = new q5.a(new t5.m(sVar, hVar.f7534e), true, false);
                            z8 = true;
                        } else {
                            t5.s sVar2 = t5.k.f8908j;
                            t5.m mVar2 = new t5.m(sVar2, hVar.f7534e);
                            for (Map.Entry entry : ((o5.e) vVar.f5681b).A(fVar).f6847g) {
                                boolean z12 = z11;
                                m mVar3 = (m) ((o5.e) entry.getValue()).f6846f;
                                if (mVar3 != null && (c4 = mVar3.c(f.f6023i)) != null) {
                                    sVar2 = sVar2.o((t5.c) entry.getKey(), c4);
                                }
                                z11 = z12;
                            }
                            z8 = z11;
                            for (t5.q qVar : mVar2.f8910f) {
                                if (!sVar2.s(qVar.f8919a)) {
                                    sVar2 = sVar2.o(qVar.f8919a, qVar.f8920b);
                                }
                            }
                            aVar = new q5.a(new t5.m(sVar2, hVar.f7534e), false, false);
                        }
                        boolean z13 = mVar.g(iVar) != null ? z8 : false;
                        if (!z13 && !hVar.d()) {
                            o5.j.b("View does not exist but we have a tag", !hashMap.containsKey(iVar));
                            long j8 = vVar.f5680a;
                            vVar.f5680a = 1 + j8;
                            t tVar = new t(j8);
                            hashMap.put(iVar, tVar);
                            ((HashMap) vVar.f5683d).put(tVar, iVar);
                        }
                        x xVar = (x) vVar.f5682c;
                        xVar.getClass();
                        androidx.room.c cVar = new androidx.room.c(fVar, 23, xVar);
                        HashMap hashMap2 = mVar.f6052a;
                        q5.h hVar2 = iVar.f7536b;
                        q5.j jVar = (q5.j) hashMap2.get(hVar2);
                        if (jVar == null) {
                            boolean z14 = aVar.f7514b;
                            t5.m mVar4 = aVar.f7513a;
                            t5.s a3 = xVar.a(fVar, z14 ? mVar4.f8910f : null, Collections.EMPTY_LIST, false);
                            if (a3 != null) {
                                z9 = z8;
                            } else {
                                t5.s sVar3 = mVar4.f8910f;
                                if (sVar3 == null) {
                                    sVar3 = t5.k.f8908j;
                                }
                                a3 = cVar.p(sVar3);
                                z9 = false;
                            }
                            jVar = new q5.j(iVar, new q5.g(new q5.a(new t5.m(a3, hVar2.f7534e), z9, false), 1, aVar));
                        }
                        if (!hVar2.d()) {
                            HashSet hashSet = new HashSet();
                            Iterator it = ((q5.a) jVar.f7539c.f7527g).f7513a.f8910f.iterator();
                            while (it.hasNext()) {
                                hashSet.add(((t5.q) it.next()).f8919a);
                            }
                            mVar.f6053b.b();
                        }
                        if (!hashMap2.containsKey(hVar2)) {
                            hashMap2.put(hVar2, jVar);
                        }
                        hashMap2.put(hVar2, jVar);
                        jVar.f7540d.add(wVar);
                        q5.a aVar3 = (q5.a) jVar.f7539c.f7527g;
                        ArrayList arrayList = new ArrayList();
                        t5.m mVar5 = aVar3.f7513a;
                        for (t5.q qVar2 : mVar5.f8910f) {
                            arrayList.add(new q5.c(2, new t5.m(qVar2.f8920b, t5.t.f8922a), qVar2.f8919a, null));
                        }
                        if (aVar3.f7514b) {
                            arrayList.add(new q5.c(5, mVar5, null, null));
                        }
                        ArrayList a9 = jVar.a(arrayList, mVar5, wVar);
                        if (!z13 && !z10) {
                            q5.j g9 = mVar.g(iVar);
                            f fVar3 = iVar.f7535a;
                            t p6 = vVar.p(iVar);
                            x xVar2 = new x(vVar, g9);
                            ((h) vVar.f5685f).a(l.v.n(iVar), p6, xVar2, xVar2);
                            o5.e A = ((o5.e) vVar.f5681b).A(fVar3);
                            if (p6 != null) {
                                o5.j.b("If we're adding a query, it shouldn't be shadowed", !((m) A.f6846f).f());
                            } else {
                                l1.x xVar3 = new l1.x(5, vVar);
                                A.getClass();
                                A.g(f.f6023i, xVar3, null);
                            }
                        }
                        return a9;
                    }
                    m mVar6 = (m) eVar.f6846f;
                    if (mVar6 != null) {
                        if (sVar == null) {
                            sVar = mVar6.c(fVar2);
                        }
                        z10 = z10 || mVar6.f();
                    }
                    eVar = eVar.w(fVar2.isEmpty() ? t5.c.e("") : fVar2.z());
                    fVar2 = fVar2.C();
                }
                break;
            case 1:
                l.v vVar2 = this.f6060b;
                n5.a aVar4 = (n5.a) vVar2.f5686g;
                f fVar4 = (f) this.f6061c;
                q5.i.a(fVar4);
                aVar4.b();
                return l.v.h(vVar2, new m5.b(m5.d.f6428e, fVar4));
            default:
                t tVar2 = (t) this.f6061c;
                l.v vVar3 = this.f6060b;
                q5.i iVar2 = (q5.i) ((HashMap) vVar3.f5683d).get(tVar2);
                if (iVar2 == null) {
                    return Collections.EMPTY_LIST;
                }
                ((n5.a) vVar3.f5686g).b();
                return l.v.i(vVar3, iVar2, new m5.b(new m5.d(2, iVar2.f7536b, true), f.f6023i));
        }
    }
}
