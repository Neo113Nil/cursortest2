package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class m53 implements Iterator {

    /* renamed from: f, reason: collision with root package name */
    Map.Entry f8422f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ Iterator f8423g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ n53 f8424h;

    m53(n53 n53Var, Iterator it) {
        this.f8424h = n53Var;
        this.f8423g = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8423g.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f8423g.next();
        this.f8422f = entry;
        return entry.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i7;
        q43.g(this.f8422f != null, "no calls to next() since the last call to remove()");
        Collection collection = (Collection) this.f8422f.getValue();
        this.f8423g.remove();
        x53 x53Var = this.f8424h.f8941g;
        i7 = x53Var.f14043j;
        x53Var.f14043j = i7 - collection.size();
        collection.clear();
        this.f8422f = null;
    }
}
