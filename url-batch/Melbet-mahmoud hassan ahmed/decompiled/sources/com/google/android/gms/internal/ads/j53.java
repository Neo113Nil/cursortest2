package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
class j53 extends c83 {

    /* renamed from: h, reason: collision with root package name */
    final transient Map f6980h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ x53 f6981i;

    j53(x53 x53Var, Map map) {
        this.f6981i = x53Var;
        this.f6980h = map;
    }

    @Override // com.google.android.gms.internal.ads.c83
    protected final Set<Map.Entry> a() {
        return new h53(this);
    }

    final Map.Entry b(Map.Entry entry) {
        Object key = entry.getKey();
        return new a73(key, this.f6981i.k(key, (Collection) entry.getValue()));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Map map;
        Map map2 = this.f6980h;
        map = this.f6981i.f14042i;
        if (map2 == map) {
            this.f6981i.l();
        } else {
            t73.b(new i53(this));
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.f6980h;
        Objects.requireNonNull(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.f6980h.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        Collection collection = (Collection) d83.a(this.f6980h, obj);
        if (collection == null) {
            return null;
        }
        return this.f6981i.k(obj, collection);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.f6980h.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        return this.f6981i.g();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        int i7;
        Collection collection = (Collection) this.f6980h.remove(obj);
        if (collection == null) {
            return null;
        }
        Collection i8 = this.f6981i.i();
        i8.addAll(collection);
        x53 x53Var = this.f6981i;
        i7 = x53Var.f14043j;
        x53Var.f14043j = i7 - collection.size();
        collection.clear();
        return i8;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f6980h.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.f6980h.toString();
    }
}
