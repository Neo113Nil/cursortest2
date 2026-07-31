package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class Gb {

    /* renamed from: a, reason: collision with root package name */
    public final P2 f857a;
    public final C0215h2 b;
    public final ArrayList c;

    public Gb(P2 p2, C0215h2 c0215h2) {
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        this.f857a = p2;
        arrayList.add(p2);
        this.b = c0215h2;
        arrayList.add(c0215h2);
    }

    public final synchronized void a() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((InterfaceC0361mk) it.next()).onCreate();
        }
    }

    public final synchronized void a(C0376na c0376na) {
        this.c.add(c0376na);
    }
}
