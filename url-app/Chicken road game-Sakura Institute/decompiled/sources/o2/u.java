package o2;

import j2.AbstractC0720j;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final g2.e f8954a;

    /* renamed from: b, reason: collision with root package name */
    public final g2.e f8955b;

    /* renamed from: c, reason: collision with root package name */
    public final s f8956c;

    public u(e2.o oVar) {
        ArrayList arrayList = oVar.f6238a;
        this.f8954a = arrayList != null ? new g2.e(arrayList) : null;
        ArrayList arrayList2 = oVar.f6239b;
        this.f8955b = arrayList2 != null ? new g2.e(arrayList2) : null;
        this.f8956c = m3.o.c(oVar.f6240c, k.f8939k);
    }

    public final s a(g2.e eVar, s sVar, s sVar2) {
        boolean z4 = true;
        g2.e eVar2 = this.f8954a;
        int compareTo = eVar2 == null ? 1 : eVar.compareTo(eVar2);
        g2.e eVar3 = this.f8955b;
        int compareTo2 = eVar3 == null ? -1 : eVar.compareTo(eVar3);
        boolean z5 = eVar2 != null && eVar.w(eVar2);
        boolean z6 = eVar3 != null && eVar.w(eVar3);
        if (compareTo > 0 && compareTo2 < 0 && !z6) {
            return sVar2;
        }
        if (compareTo > 0 && z6 && sVar2.y()) {
            return sVar2;
        }
        if (compareTo > 0 && compareTo2 == 0) {
            AbstractC0720j.c(z6);
            AbstractC0720j.c(!sVar2.y());
            return sVar.y() ? k.f8939k : sVar;
        }
        if (!z5 && !z6) {
            if (compareTo2 <= 0 && compareTo > 0) {
                z4 = false;
            }
            AbstractC0720j.c(z4);
            return sVar;
        }
        HashSet hashSet = new HashSet();
        Iterator it = sVar.iterator();
        while (it.hasNext()) {
            hashSet.add(((q) it.next()).f8950a);
        }
        Iterator it2 = sVar2.iterator();
        while (it2.hasNext()) {
            hashSet.add(((q) it2.next()).f8950a);
        }
        ArrayList arrayList = new ArrayList(hashSet.size() + 1);
        arrayList.addAll(hashSet);
        if (!sVar2.k().isEmpty() || !sVar.k().isEmpty()) {
            arrayList.add(C0924c.f8919j);
        }
        Iterator it3 = arrayList.iterator();
        s sVar3 = sVar;
        while (it3.hasNext()) {
            C0924c c0924c = (C0924c) it3.next();
            s b4 = sVar.b(c0924c);
            s a4 = a(eVar.j(c0924c), sVar.b(c0924c), sVar2.b(c0924c));
            if (a4 != b4) {
                sVar3 = sVar3.m(c0924c, a4);
            }
        }
        return sVar3;
    }

    public final String toString() {
        return "RangeMerge{optExclusiveStart=" + this.f8954a + ", optInclusiveEnd=" + this.f8955b + ", snap=" + this.f8956c + '}';
    }
}
