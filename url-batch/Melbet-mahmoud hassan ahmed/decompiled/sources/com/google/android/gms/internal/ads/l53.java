package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
class l53<T> implements Iterator<T> {

    /* renamed from: f, reason: collision with root package name */
    final Iterator<Map.Entry> f7825f;

    /* renamed from: g, reason: collision with root package name */
    Object f7826g;

    /* renamed from: h, reason: collision with root package name */
    Collection f7827h;

    /* renamed from: i, reason: collision with root package name */
    Iterator f7828i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ x53 f7829j;

    l53(x53 x53Var) {
        Map map;
        this.f7829j = x53Var;
        map = x53Var.f14042i;
        this.f7825f = map.entrySet().iterator();
        this.f7826g = null;
        this.f7827h = null;
        this.f7828i = s73.INSTANCE;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7825f.hasNext() || this.f7828i.hasNext();
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!this.f7828i.hasNext()) {
            Map.Entry next = this.f7825f.next();
            this.f7826g = next.getKey();
            Collection collection = (Collection) next.getValue();
            this.f7827h = collection;
            this.f7828i = collection.iterator();
        }
        return (T) this.f7828i.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i7;
        this.f7828i.remove();
        Collection collection = this.f7827h;
        collection.getClass();
        if (collection.isEmpty()) {
            this.f7825f.remove();
        }
        x53 x53Var = this.f7829j;
        i7 = x53Var.f14043j;
        x53Var.f14043j = i7 - 1;
    }
}
