package io.appmetrica.analytics.impl;

import g4.AbstractC0465j;
import g4.AbstractC0467l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class Zc {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f7780a = new ArrayList();

    public final synchronized List a() {
        ArrayList arrayList;
        try {
            ArrayList arrayList2 = this.f7780a;
            ArrayList arrayList3 = new ArrayList(AbstractC0467l.D0(arrayList2, 10));
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
        return AbstractC0465j.S0(AbstractC0465j.W0(arrayList));
    }

    public final synchronized void a(Yc... ycArr) {
        AbstractC0465j.E0(this.f7780a, ycArr);
    }
}
