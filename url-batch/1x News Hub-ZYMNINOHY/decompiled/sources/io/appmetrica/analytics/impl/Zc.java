package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class Zc {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f6940a = new ArrayList();

    public final synchronized List a() {
        ArrayList arrayList;
        try {
            ArrayList arrayList2 = this.f6940a;
            ArrayList arrayList3 = new ArrayList(c2.g.N(arrayList2));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(((Yc) it.next()).a());
            }
            arrayList = new ArrayList();
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                if (((String) next).length() > 0) {
                    arrayList.add(next);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return c2.e.Y(new LinkedHashSet(arrayList));
    }

    public final synchronized void a(Yc... ycArr) {
        c2.k.P(this.f6940a, ycArr);
    }
}
