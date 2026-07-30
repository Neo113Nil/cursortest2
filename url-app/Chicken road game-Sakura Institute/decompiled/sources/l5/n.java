package l5;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class n implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6054a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l.v f6055b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6056c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f6057d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f6058e;

    public /* synthetic */ n(l.v vVar, Object obj, Object obj2, Object obj3, int i7) {
        this.f6054a = i7;
        this.f6055b = vVar;
        this.f6056c = obj;
        this.f6057d = obj2;
        this.f6058e = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01d2  */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object call() {
        int size;
        int i7;
        o5.e A;
        Object obj;
        switch (this.f6054a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                f fVar = (f) this.f6057d;
                t tVar = (t) this.f6056c;
                l.v vVar = this.f6055b;
                q5.i iVar = (q5.i) ((HashMap) vVar.f5683d).get(tVar);
                if (iVar == null) {
                    return Collections.EMPTY_LIST;
                }
                f B = f.B(iVar.f7535a, fVar);
                b y4 = b.y((HashMap) this.f6058e);
                ((n5.a) vVar.f5686g).b();
                return l.v.i(vVar, iVar, new m5.c(new m5.d(2, iVar.f7536b, true), B, y4));
            case 1:
                g5.a aVar = (g5.a) this.f6058e;
                q5.i iVar2 = (q5.i) this.f6056c;
                f fVar2 = iVar2.f7535a;
                l.v vVar2 = this.f6055b;
                o5.e eVar = (o5.e) vVar2.f5681b;
                h hVar = (h) vVar2.f5685f;
                m mVar = (m) eVar.m(fVar2);
                ArrayList arrayList = new ArrayList();
                if (mVar == null) {
                    return arrayList;
                }
                HashMap hashMap = mVar.f6052a;
                if (!iVar2.b() && mVar.g(iVar2) == null) {
                    return arrayList;
                }
                w wVar = (w) this.f6057d;
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                boolean f9 = mVar.f();
                boolean b9 = iVar2.b();
                q5.h hVar2 = iVar2.f7536b;
                if (b9) {
                    Iterator it = hashMap.entrySet().iterator();
                    while (it.hasNext()) {
                        q5.j jVar = (q5.j) ((Map.Entry) it.next()).getValue();
                        List b10 = jVar.b(wVar, aVar);
                        q5.i iVar3 = jVar.f7537a;
                        arrayList3.addAll(b10);
                        if (jVar.f7540d.isEmpty()) {
                            it.remove();
                            if (!iVar3.f7536b.d()) {
                                arrayList2.add(iVar3);
                            }
                        }
                    }
                } else {
                    q5.j jVar2 = (q5.j) hashMap.get(hVar2);
                    if (jVar2 != null) {
                        q5.i iVar4 = jVar2.f7537a;
                        arrayList3.addAll(jVar2.b(wVar, aVar));
                        if (jVar2.f7540d.isEmpty()) {
                            hashMap.remove(hVar2);
                            if (!iVar4.f7536b.d()) {
                                arrayList2.add(iVar4);
                            }
                        }
                    }
                }
                if (f9 && !mVar.f()) {
                    arrayList2.add(q5.i.a(iVar2.f7535a));
                }
                if (hashMap.isEmpty()) {
                    vVar2.f5681b = ((o5.e) vVar2.f5681b).x(fVar2);
                }
                int size2 = arrayList2.size();
                boolean z8 = false;
                int i8 = 0;
                while (i8 < size2) {
                    Object obj2 = arrayList2.get(i8);
                    i8++;
                    q5.i iVar5 = (q5.i) obj2;
                    ((n5.a) vVar2.f5686g).b();
                    z8 = z8 || iVar5.f7536b.d();
                }
                o5.e eVar2 = (o5.e) vVar2.f5681b;
                Object obj3 = eVar2.f6846f;
                boolean z9 = obj3 != null && ((m) obj3).f();
                i5.l lVar = new i5.l(fVar2);
                while (lVar.hasNext()) {
                    eVar2 = eVar2.w((t5.c) lVar.next());
                    z9 = z9 || ((obj = eVar2.f6846f) != null && ((m) obj).f());
                    if (!z9 && !eVar2.isEmpty()) {
                    }
                    if (z8 && !z9) {
                        A = ((o5.e) vVar2.f5681b).A(fVar2);
                        if (!A.isEmpty()) {
                            ArrayList arrayList4 = new ArrayList();
                            l.v.m(A, arrayList4);
                            int size3 = arrayList4.size();
                            int i9 = 0;
                            while (i9 < size3) {
                                Object obj4 = arrayList4.get(i9);
                                i9++;
                                q5.j jVar3 = (q5.j) obj4;
                                x xVar = new x(vVar2, jVar3);
                                hVar.a(l.v.n(jVar3.f7537a), (t) xVar.f6093b, xVar, xVar);
                            }
                        }
                    }
                    if (!z9 && !arrayList2.isEmpty() && aVar == null) {
                        if (z8) {
                            int size4 = arrayList2.size();
                            int i10 = 0;
                            while (i10 < size4) {
                                Object obj5 = arrayList2.get(i10);
                                i10++;
                                q5.i iVar6 = (q5.i) obj5;
                                o5.j.c(vVar2.p(iVar6) != null);
                                hVar.b(l.v.n(iVar6));
                            }
                        } else {
                            hVar.b(l.v.n(iVar2));
                        }
                    }
                    size = arrayList2.size();
                    i7 = 0;
                    while (i7 < size) {
                        Object obj6 = arrayList2.get(i7);
                        i7++;
                        q5.i iVar7 = (q5.i) obj6;
                        if (!iVar7.f7536b.d()) {
                            t p6 = vVar2.p(iVar7);
                            o5.j.c(p6 != null);
                            ((HashMap) vVar2.f5684e).remove(iVar7);
                            ((HashMap) vVar2.f5683d).remove(p6);
                        }
                    }
                    return arrayList3;
                    break;
                }
                if (z8) {
                    A = ((o5.e) vVar2.f5681b).A(fVar2);
                    if (!A.isEmpty()) {
                    }
                }
                if (!z9) {
                    if (z8) {
                    }
                }
                size = arrayList2.size();
                i7 = 0;
                while (i7 < size) {
                }
                return arrayList3;
            default:
                t5.s sVar = (t5.s) this.f6058e;
                f fVar3 = (f) this.f6057d;
                t tVar2 = (t) this.f6056c;
                l.v vVar3 = this.f6055b;
                q5.i iVar8 = (q5.i) ((HashMap) vVar3.f5683d).get(tVar2);
                if (iVar8 == null) {
                    return Collections.EMPTY_LIST;
                }
                f B2 = f.B(iVar8.f7535a, fVar3);
                if (!B2.isEmpty()) {
                    q5.i.a(fVar3);
                }
                ((n5.a) vVar3.f5686g).b();
                return l.v.i(vVar3, iVar8, new m5.e(new m5.d(2, iVar8.f7536b, true), B2, sVar));
        }
    }
}
