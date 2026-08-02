package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class Sc {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f10942a = new ArrayList();

    public final synchronized List a() {
        ArrayList arrayList;
        try {
            ArrayList arrayList2 = this.f10942a;
            ArrayList arrayList3 = new ArrayList(d3.k.Y(arrayList2));
            int size = arrayList2.size();
            int i4 = 0;
            int i5 = 0;
            while (i5 < size) {
                Object obj = arrayList2.get(i5);
                i5++;
                arrayList3.add(((Rc) obj).a());
            }
            arrayList = new ArrayList();
            int size2 = arrayList3.size();
            while (i4 < size2) {
                Object obj2 = arrayList3.get(i4);
                i4++;
                if (((String) obj2).length() > 0) {
                    arrayList.add(obj2);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return d3.i.n0(new LinkedHashSet(arrayList));
    }

    public final synchronized void a(Rc... rcArr) {
        d3.o.a0(this.f10942a, rcArr);
    }
}
