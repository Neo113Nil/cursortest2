package t5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final l5.f f8923a;

    /* renamed from: b, reason: collision with root package name */
    public final l5.f f8924b;

    /* renamed from: c, reason: collision with root package name */
    public final s f8925c;

    public u(j5.o oVar) {
        List list = oVar.f5102a;
        this.f8923a = list != null ? new l5.f(list) : null;
        List list2 = oVar.f5103b;
        this.f8924b = list2 != null ? new l5.f(list2) : null;
        this.f8925c = a8.m.d(oVar.f5104c, k.f8908j);
    }

    public final s a(l5.f fVar, s sVar, s sVar2) {
        boolean z8 = true;
        l5.f fVar2 = this.f8923a;
        int compareTo = fVar2 == null ? 1 : fVar.compareTo(fVar2);
        l5.f fVar3 = this.f8924b;
        int compareTo2 = fVar3 == null ? -1 : fVar.compareTo(fVar3);
        int i7 = 0;
        boolean z9 = fVar2 != null && fVar.x(fVar2);
        boolean z10 = fVar3 != null && fVar.x(fVar3);
        if (compareTo > 0 && compareTo2 < 0 && !z10) {
            return sVar2;
        }
        if (compareTo > 0 && z10 && sVar2.i()) {
            return sVar2;
        }
        if (compareTo > 0 && compareTo2 == 0) {
            o5.j.c(z10);
            o5.j.c(!sVar2.i());
            return sVar.i() ? k.f8908j : sVar;
        }
        if (!z9 && !z10) {
            if (compareTo2 <= 0 && compareTo > 0) {
                z8 = false;
            }
            o5.j.c(z8);
            return sVar;
        }
        HashSet hashSet = new HashSet();
        Iterator it = sVar.iterator();
        while (it.hasNext()) {
            hashSet.add(((q) it.next()).f8919a);
        }
        Iterator it2 = sVar2.iterator();
        while (it2.hasNext()) {
            hashSet.add(((q) it2.next()).f8919a);
        }
        ArrayList arrayList = new ArrayList(hashSet.size() + 1);
        arrayList.addAll(hashSet);
        if (!sVar2.c().isEmpty() || !sVar.c().isEmpty()) {
            arrayList.add(c.f8888i);
        }
        int size = arrayList.size();
        s sVar3 = sVar;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            c cVar = (c) obj;
            s d8 = sVar.d(cVar);
            s a3 = a(fVar.m(cVar), sVar.d(cVar), sVar2.d(cVar));
            if (a3 != d8) {
                sVar3 = sVar3.o(cVar, a3);
            }
        }
        return sVar3;
    }

    public final String toString() {
        return "RangeMerge{optExclusiveStart=" + this.f8923a + ", optInclusiveEnd=" + this.f8924b + ", snap=" + this.f8925c + '}';
    }
}
