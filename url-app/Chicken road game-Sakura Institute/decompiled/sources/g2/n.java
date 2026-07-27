package g2;

import G.C0231x;
import f1.C0607a;
import j2.AbstractC0720j;
import j2.C0715e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import l2.C0821a;
import l2.C0823c;
import o2.C0924c;

/* loaded from: classes.dex */
public final class n implements Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6730d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s f6731e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f6732i;

    public /* synthetic */ n(s sVar, Object obj, int i2) {
        this.f6730d = i2;
        this.f6731e = sVar;
        this.f6732i = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C0821a c0821a;
        o2.s c4;
        boolean z4;
        boolean z5;
        switch (this.f6730d) {
            case 0:
                w wVar = (w) this.f6732i;
                l2.i iVar = wVar.f6769f;
                e eVar = iVar.f7984a;
                s sVar = this.f6731e;
                C0715e c0715e = (C0715e) sVar.f6752b;
                e eVar2 = eVar;
                boolean z6 = false;
                o2.s sVar2 = null;
                while (!c0715e.isEmpty()) {
                    l lVar = (l) c0715e.f7159d;
                    if (lVar != null) {
                        if (sVar2 == null) {
                            sVar2 = lVar.c(eVar2);
                        }
                        z6 = z6 || lVar.f();
                    }
                    c0715e = c0715e.s(eVar2.isEmpty() ? C0924c.c("") : eVar2.C());
                    eVar2 = eVar2.F();
                }
                l lVar2 = (l) ((C0715e) sVar.f6752b).j(eVar);
                C0231x c0231x = (C0231x) sVar.f6757g;
                if (lVar2 == null) {
                    lVar2 = new l(c0231x);
                    sVar.f6752b = ((C0715e) sVar.f6752b).B(eVar, lVar2);
                } else {
                    z6 = z6 || lVar2.f();
                    if (sVar2 == null) {
                        sVar2 = lVar2.c(e.f6694j);
                    }
                }
                c0231x.b();
                l2.h hVar = iVar.f7985b;
                if (sVar2 != null) {
                    c0821a = new C0821a(new o2.m(sVar2, hVar.f7983e), true, false);
                } else {
                    o2.s sVar3 = o2.k.f8939k;
                    o2.m mVar = new o2.m(sVar3, hVar.f7983e);
                    for (Map.Entry entry : ((C0715e) sVar.f6752b).D(eVar).f7160e) {
                        l lVar3 = (l) ((C0715e) entry.getValue()).f7159d;
                        if (lVar3 != null && (c4 = lVar3.c(e.f6694j)) != null) {
                            sVar3 = sVar3.m((C0924c) entry.getKey(), c4);
                        }
                    }
                    for (o2.q qVar : mVar.f8941d) {
                        if (!sVar3.i(qVar.f8950a)) {
                            sVar3 = sVar3.m(qVar.f8950a, qVar.f8951b);
                        }
                    }
                    c0821a = new C0821a(new o2.m(sVar3, hVar.f7983e), false, false);
                }
                boolean z7 = lVar2.g(iVar) != null;
                if (z7 || hVar.d()) {
                    z4 = z7;
                } else {
                    HashMap hashMap = (HashMap) sVar.f6755e;
                    AbstractC0720j.b("View does not exist but we have a tag", !hashMap.containsKey(iVar));
                    long j4 = sVar.f6751a;
                    z4 = z7;
                    sVar.f6751a = j4 + 1;
                    t tVar = new t(j4);
                    hashMap.put(iVar, tVar);
                    ((HashMap) sVar.f6754d).put(tVar, iVar);
                }
                x xVar = (x) sVar.f6753c;
                xVar.getClass();
                y.t tVar2 = new y.t(eVar, 25, xVar);
                HashMap hashMap2 = lVar2.f6723a;
                l2.j jVar = (l2.j) hashMap2.get(iVar.f7985b);
                l2.h hVar2 = iVar.f7985b;
                if (jVar == null) {
                    boolean z8 = c0821a.f7963b;
                    o2.m mVar2 = c0821a.f7962a;
                    o2.s a4 = xVar.a(eVar, z8 ? mVar2.f8941d : null, Collections.emptyList(), false);
                    if (a4 != null) {
                        z5 = true;
                    } else {
                        o2.s sVar4 = mVar2.f8941d;
                        if (sVar4 == null) {
                            sVar4 = o2.k.f8939k;
                        }
                        a4 = tVar2.k(sVar4);
                        z5 = false;
                    }
                    jVar = new l2.j(iVar, new l2.g(new C0821a(new o2.m(a4, hVar2.f7983e), z5, false), 1, c0821a));
                }
                if (!hVar2.d()) {
                    HashSet hashSet = new HashSet();
                    Iterator it = ((C0821a) jVar.f7988c.f7976b).f7962a.f8941d.iterator();
                    while (it.hasNext()) {
                        hashSet.add(((o2.q) it.next()).f8950a);
                    }
                    lVar2.f6724b.b();
                }
                if (!hashMap2.containsKey(hVar2)) {
                    hashMap2.put(hVar2, jVar);
                }
                hashMap2.put(hVar2, jVar);
                jVar.f7989d.add(wVar);
                C0821a c0821a2 = (C0821a) jVar.f7988c.f7976b;
                ArrayList arrayList = new ArrayList();
                o2.m mVar3 = c0821a2.f7962a;
                for (o2.q qVar2 : mVar3.f8941d) {
                    arrayList.add(new C0823c(2, new o2.m(qVar2.f8951b, o2.t.f8953a), qVar2.f8950a, null));
                }
                if (c0821a2.f7963b) {
                    arrayList.add(new C0823c(5, mVar3, null, null));
                }
                ArrayList a5 = jVar.a(arrayList, mVar3, wVar);
                if (!z4 && !z6) {
                    l2.j g4 = lVar2.g(iVar);
                    t p4 = sVar.p(iVar);
                    x xVar2 = new x(sVar, g4);
                    ((g) sVar.f6756f).a(s.n(iVar), p4, xVar2, xVar2);
                    C0715e D3 = ((C0715e) sVar.f6752b).D(iVar.f7984a);
                    if (p4 != null) {
                        AbstractC0720j.b("If we're adding a query, it shouldn't be shadowed", !((l) D3.f7159d).f());
                    } else {
                        C0607a c0607a = new C0607a(4, sVar);
                        D3.getClass();
                        D3.h(e.f6694j, c0607a, null);
                    }
                }
                return a5;
            case 1:
                s sVar5 = this.f6731e;
                C0231x c0231x2 = (C0231x) sVar5.f6757g;
                e eVar3 = (e) this.f6732i;
                l2.i.a(eVar3);
                c0231x2.b();
                return s.h(sVar5, new h2.b(h2.e.f6877e, eVar3));
            default:
                s sVar6 = this.f6731e;
                l2.i iVar2 = (l2.i) ((HashMap) sVar6.f6754d).get((t) this.f6732i);
                if (iVar2 == null) {
                    return Collections.emptyList();
                }
                ((C0231x) sVar6.f6757g).b();
                return s.i(sVar6, iVar2, new h2.b(new h2.e(2, iVar2.f7985b, true), e.f6694j));
        }
    }
}
