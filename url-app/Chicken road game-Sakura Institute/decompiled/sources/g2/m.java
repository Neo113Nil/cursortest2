package g2;

import G.C0231x;
import b2.C0517a;
import j2.AbstractC0720j;
import j2.C0715e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import o2.C0924c;

/* loaded from: classes.dex */
public final class m implements Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6725d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s f6726e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f6727i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f6728j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f6729k;

    public /* synthetic */ m(s sVar, Object obj, Object obj2, Object obj3, int i2) {
        this.f6725d = i2;
        this.f6726e = sVar;
        this.f6727i = obj;
        this.f6728j = obj2;
        this.f6729k = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01d2  */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object call() {
        Iterator it;
        C0715e D3;
        Object obj;
        switch (this.f6725d) {
            case 0:
                t tVar = (t) this.f6727i;
                s sVar = this.f6726e;
                l2.i iVar = (l2.i) ((HashMap) sVar.f6754d).get(tVar);
                if (iVar == null) {
                    return Collections.emptyList();
                }
                e E3 = e.E(iVar.f7984a, (e) this.f6728j);
                C0639b B = C0639b.B((HashMap) this.f6729k);
                ((C0231x) sVar.f6757g).b();
                return s.i(sVar, iVar, new h2.c(new h2.e(2, iVar.f7985b, true), E3, B));
            case 1:
                l2.i iVar2 = (l2.i) this.f6727i;
                e eVar = iVar2.f7984a;
                s sVar2 = this.f6726e;
                l lVar = (l) ((C0715e) sVar2.f6752b).j(eVar);
                ArrayList arrayList = new ArrayList();
                if (lVar == null) {
                    return arrayList;
                }
                if (!iVar2.b() && lVar.g(iVar2) == null) {
                    return arrayList;
                }
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                boolean f4 = lVar.f();
                boolean b4 = iVar2.b();
                HashMap hashMap = lVar.f6723a;
                C0517a c0517a = (C0517a) this.f6729k;
                w wVar = (w) this.f6728j;
                if (b4) {
                    Iterator it2 = hashMap.entrySet().iterator();
                    while (it2.hasNext()) {
                        l2.j jVar = (l2.j) ((Map.Entry) it2.next()).getValue();
                        arrayList3.addAll(jVar.b(wVar, c0517a));
                        if (jVar.f7989d.isEmpty()) {
                            it2.remove();
                            l2.i iVar3 = jVar.f7986a;
                            if (!iVar3.f7985b.d()) {
                                arrayList2.add(iVar3);
                            }
                        }
                    }
                } else {
                    l2.h hVar = iVar2.f7985b;
                    l2.j jVar2 = (l2.j) hashMap.get(hVar);
                    if (jVar2 != null) {
                        arrayList3.addAll(jVar2.b(wVar, c0517a));
                        if (jVar2.f7989d.isEmpty()) {
                            hashMap.remove(hVar);
                            l2.i iVar4 = jVar2.f7986a;
                            if (!iVar4.f7985b.d()) {
                                arrayList2.add(iVar4);
                            }
                        }
                    }
                }
                if (f4 && !lVar.f()) {
                    arrayList2.add(l2.i.a(iVar2.f7984a));
                }
                if (hashMap.isEmpty()) {
                    sVar2.f6752b = ((C0715e) sVar2.f6752b).w(eVar);
                }
                Iterator it3 = arrayList2.iterator();
                while (true) {
                    boolean z4 = false;
                    while (it3.hasNext()) {
                        l2.i iVar5 = (l2.i) it3.next();
                        ((C0231x) sVar2.f6757g).b();
                        if (z4 || iVar5.f7985b.d()) {
                            z4 = true;
                        }
                    }
                    C0715e c0715e = (C0715e) sVar2.f6752b;
                    Object obj2 = c0715e.f7159d;
                    boolean z5 = obj2 != null && ((l) obj2).f();
                    d2.l lVar2 = new d2.l(eVar);
                    while (lVar2.hasNext()) {
                        c0715e = c0715e.s((C0924c) lVar2.next());
                        z5 = z5 || ((obj = c0715e.f7159d) != null && ((l) obj).f());
                        if (!z5 && !c0715e.isEmpty()) {
                        }
                        g gVar = (g) sVar2.f6756f;
                        if (z4 && !z5) {
                            D3 = ((C0715e) sVar2.f6752b).D(eVar);
                            if (!D3.isEmpty()) {
                                ArrayList arrayList4 = new ArrayList();
                                s.m(D3, arrayList4);
                                Iterator it4 = arrayList4.iterator();
                                while (it4.hasNext()) {
                                    l2.j jVar3 = (l2.j) it4.next();
                                    x xVar = new x(sVar2, jVar3);
                                    gVar.a(s.n(jVar3.f7986a), (t) xVar.f6772b, xVar, xVar);
                                }
                            }
                        }
                        if (!z5 && !arrayList2.isEmpty() && c0517a == null) {
                            if (z4) {
                                Iterator it5 = arrayList2.iterator();
                                while (it5.hasNext()) {
                                    l2.i iVar6 = (l2.i) it5.next();
                                    AbstractC0720j.c(sVar2.p(iVar6) != null);
                                    gVar.b(s.n(iVar6));
                                }
                            } else {
                                gVar.b(s.n(iVar2));
                            }
                        }
                        it = arrayList2.iterator();
                        while (it.hasNext()) {
                            l2.i iVar7 = (l2.i) it.next();
                            if (!iVar7.f7985b.d()) {
                                t p4 = sVar2.p(iVar7);
                                AbstractC0720j.c(p4 != null);
                                ((HashMap) sVar2.f6755e).remove(iVar7);
                                ((HashMap) sVar2.f6754d).remove(p4);
                            }
                        }
                        return arrayList3;
                        break;
                    }
                    g gVar2 = (g) sVar2.f6756f;
                    if (z4) {
                        D3 = ((C0715e) sVar2.f6752b).D(eVar);
                        if (!D3.isEmpty()) {
                        }
                    }
                    if (!z5) {
                        if (z4) {
                        }
                    }
                    it = arrayList2.iterator();
                    while (it.hasNext()) {
                    }
                    return arrayList3;
                }
                break;
            default:
                t tVar2 = (t) this.f6727i;
                s sVar3 = this.f6726e;
                l2.i iVar8 = (l2.i) ((HashMap) sVar3.f6754d).get(tVar2);
                if (iVar8 == null) {
                    return Collections.emptyList();
                }
                e eVar2 = (e) this.f6728j;
                e E4 = e.E(iVar8.f7984a, eVar2);
                if (!E4.isEmpty()) {
                    l2.i.a(eVar2);
                }
                ((C0231x) sVar3.f6757g).b();
                return s.i(sVar3, iVar8, new h2.f(new h2.e(2, iVar8.f7985b, true), E4, (o2.s) this.f6729k));
        }
    }
}
