package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
class n53 extends a83 {

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ x53 f8941g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n53(x53 x53Var, Map map) {
        super(map);
        this.f8941g = x53Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        t73.b(iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<?> collection) {
        return this.f2680f.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return this == obj || this.f2680f.keySet().equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f2680f.keySet().hashCode();
    }

    @Override // com.google.android.gms.internal.ads.a83, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new m53(this, this.f2680f.entrySet().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i7;
        Collection collection = (Collection) this.f2680f.remove(obj);
        if (collection == null) {
            return false;
        }
        int size = collection.size();
        collection.clear();
        x53 x53Var = this.f8941g;
        i7 = x53Var.f14043j;
        x53Var.f14043j = i7 - size;
        return size > 0;
    }
}
