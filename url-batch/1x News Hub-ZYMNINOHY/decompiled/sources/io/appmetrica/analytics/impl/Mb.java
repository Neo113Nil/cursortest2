package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class Mb {

    /* renamed from: a, reason: collision with root package name */
    public final W2 f6328a;

    /* renamed from: b, reason: collision with root package name */
    public final C0739p2 f6329b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f6330c;

    public Mb(W2 w22, C0739p2 c0739p2) {
        ArrayList arrayList = new ArrayList();
        this.f6330c = arrayList;
        this.f6328a = w22;
        arrayList.add(w22);
        this.f6329b = c0739p2;
        arrayList.add(c0739p2);
    }

    public final synchronized void a() {
        Iterator it = this.f6330c.iterator();
        while (it.hasNext()) {
            ((InterfaceC0757pk) it.next()).onCreate();
        }
    }

    public final synchronized void a(C0850ta c0850ta) {
        this.f6330c.add(c0850ta);
    }
}
