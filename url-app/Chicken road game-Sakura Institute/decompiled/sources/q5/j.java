package q5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import l1.x;
import l5.w;
import t5.l;
import t5.m;
import t5.q;
import t5.s;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final i f7537a;

    /* renamed from: b, reason: collision with root package name */
    public final k f7538b;

    /* renamed from: c, reason: collision with root package name */
    public g f7539c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f7540d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.room.c f7541e;

    public j(i iVar, g gVar) {
        r5.c kVar;
        this.f7537a = iVar;
        h hVar = iVar.f7536b;
        x xVar = new x(11, hVar.f7534e);
        if (hVar.d()) {
            kVar = new x(11, hVar.f7534e);
        } else {
            kVar = new g3.k(hVar);
        }
        this.f7538b = new k(kVar);
        a aVar = (a) gVar.f7528h;
        a aVar2 = (a) gVar.f7527g;
        m mVar = new m(t5.k.f8908j, iVar.f7536b.f7534e);
        m mVar2 = aVar.f7513a;
        xVar.i(mVar, mVar2, null);
        m i7 = kVar.i(mVar, aVar2.f7513a, null);
        this.f7539c = new g(new a(i7, aVar2.f7514b, kVar.h()), 1, new a(mVar2, aVar.f7514b, false));
        this.f7540d = new ArrayList();
        this.f7541e = new androidx.room.c(iVar);
    }

    public final ArrayList a(ArrayList arrayList, m mVar, w wVar) {
        List asList = wVar == null ? this.f7540d : Arrays.asList(wVar);
        androidx.room.c cVar = this.f7541e;
        cVar.getClass();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            c cVar2 = (c) obj;
            int i8 = cVar2.f7519a;
            m mVar2 = cVar2.f7520b;
            if (l.h.b(i8, 4)) {
                l lVar = (l) cVar.f1070h;
                s sVar = cVar2.f7521c.f8910f;
                s sVar2 = mVar2.f8910f;
                t5.c cVar3 = t5.c.f8886g;
                if (lVar.compare(new q(cVar3, sVar), new q(cVar3, sVar2)) != 0) {
                    arrayList3.add(new c(3, mVar2, cVar2.f7522d, null));
                }
            }
        }
        cVar.s(arrayList2, 1, arrayList, asList, mVar);
        cVar.s(arrayList2, 2, arrayList, asList, mVar);
        cVar.s(arrayList2, 3, arrayList3, asList, mVar);
        cVar.s(arrayList2, 4, arrayList, asList, mVar);
        cVar.s(arrayList2, 5, arrayList, asList, mVar);
        return arrayList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList] */
    public final List b(w wVar, g5.a aVar) {
        ?? r22;
        int i7 = 0;
        ArrayList arrayList = this.f7540d;
        if (aVar != null) {
            r22 = new ArrayList();
            o5.j.b("A cancel should cancel all event registrations", wVar == null);
            l5.f fVar = this.f7537a.f7535a;
            int size = arrayList.size();
            int i8 = 0;
            while (i8 < size) {
                Object obj = arrayList.get(i8);
                i8++;
                r22.add(new b((w) obj, aVar, fVar));
            }
        } else {
            r22 = Collections.EMPTY_LIST;
        }
        if (wVar == null) {
            int size2 = arrayList.size();
            while (i7 < size2) {
                Object obj2 = arrayList.get(i7);
                i7++;
                ((w) obj2).a();
            }
            arrayList.clear();
            return r22;
        }
        int i9 = -1;
        while (true) {
            if (i7 >= arrayList.size()) {
                i7 = i9;
                break;
            }
            w wVar2 = (w) arrayList.get(i7);
            wVar2.getClass();
            if (wVar.f6089e.equals(wVar2.f6089e)) {
                if (wVar2.f6085a.get()) {
                    break;
                }
                i9 = i7;
            }
            i7++;
        }
        if (i7 != -1) {
            w wVar3 = (w) arrayList.get(i7);
            arrayList.remove(i7);
            wVar3.a();
        }
        return r22;
    }
}
