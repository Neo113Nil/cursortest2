package com.facebook.appevents;

import android.content.Context;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* compiled from: AppEventCollection.java */
/* loaded from: classes.dex */
class c {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap<a, l> f5955a = new HashMap<>();

    public synchronized void a(k kVar) {
        if (kVar == null) {
            return;
        }
        for (a aVar : kVar.keySet()) {
            l b2 = b(aVar);
            Iterator<b> it = kVar.get(aVar).iterator();
            while (it.hasNext()) {
                b2.a(it.next());
            }
        }
    }

    public synchronized void a(a aVar, b bVar) {
        b(aVar).a(bVar);
    }

    public synchronized Set<a> a() {
        return this.f5955a.keySet();
    }

    public synchronized l a(a aVar) {
        return this.f5955a.get(aVar);
    }

    public synchronized int b() {
        int i;
        i = 0;
        Iterator<l> it = this.f5955a.values().iterator();
        while (it.hasNext()) {
            i += it.next().a();
        }
        return i;
    }

    private synchronized l b(a aVar) {
        l lVar;
        lVar = this.f5955a.get(aVar);
        if (lVar == null) {
            Context d2 = f.d();
            lVar = new l(com.facebook.internal.c.a(d2), f.d(d2));
        }
        this.f5955a.put(aVar, lVar);
        return lVar;
    }
}
