package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class Mb {

    /* renamed from: a, reason: collision with root package name */
    public final W2 f7137a;

    /* renamed from: b, reason: collision with root package name */
    public final C0890p2 f7138b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f7139c;

    public Mb(W2 w22, C0890p2 c0890p2) {
        ArrayList arrayList = new ArrayList();
        this.f7139c = arrayList;
        this.f7137a = w22;
        arrayList.add(w22);
        this.f7138b = c0890p2;
        arrayList.add(c0890p2);
    }

    public final synchronized void a() {
        Iterator it = this.f7139c.iterator();
        while (it.hasNext()) {
            ((InterfaceC0908pk) it.next()).onCreate();
        }
    }

    public final synchronized void a(C1001ta c1001ta) {
        this.f7139c.add(c1001ta);
    }
}
