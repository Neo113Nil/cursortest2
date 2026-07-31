package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;

/* loaded from: classes.dex */
abstract class x53<K, V> extends a63<K, V> implements Serializable {

    /* renamed from: i, reason: collision with root package name */
    private transient Map<K, Collection<V>> f14042i;

    /* renamed from: j, reason: collision with root package name */
    private transient int f14043j;

    protected x53(Map<K, Collection<V>> map) {
        if (!map.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.f14042i = map;
    }

    static /* bridge */ /* synthetic */ void u(x53 x53Var, Object obj) {
        Collection<V> collection;
        Map<K, Collection<V>> map = x53Var.f14042i;
        Objects.requireNonNull(map);
        try {
            collection = map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            collection = null;
        }
        Collection<V> collection2 = collection;
        if (collection2 != null) {
            int size = collection2.size();
            collection2.clear();
            x53Var.f14043j -= size;
        }
    }

    @Override // com.google.android.gms.internal.ads.e83
    public final boolean a(K k7, V v6) {
        Collection<V> collection = this.f14042i.get(k7);
        if (collection != null) {
            if (!collection.add(v6)) {
                return false;
            }
            this.f14043j++;
            return true;
        }
        Collection<V> i7 = i();
        if (!i7.add(v6)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.f14043j++;
        this.f14042i.put(k7, i7);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.e83
    public final int b() {
        return this.f14043j;
    }

    @Override // com.google.android.gms.internal.ads.a63
    final Collection<V> c() {
        return new z53(this);
    }

    @Override // com.google.android.gms.internal.ads.a63
    final Iterator<V> d() {
        return new g53(this);
    }

    abstract Collection<V> i();

    abstract <E> Collection<E> j(Collection<E> collection);

    abstract Collection<V> k(K k7, Collection<V> collection);

    @Override // com.google.android.gms.internal.ads.e83
    public final void l() {
        Iterator<Collection<V>> it = this.f14042i.values().iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
        this.f14042i.clear();
        this.f14043j = 0;
    }

    final List<V> n(K k7, List<V> list, u53 u53Var) {
        return list instanceof RandomAccess ? new q53(this, k7, list, u53Var) : new w53(this, k7, list, u53Var);
    }

    final Map<K, Collection<V>> q() {
        Map<K, Collection<V>> map = this.f14042i;
        return map instanceof NavigableMap ? new o53(this, (NavigableMap) map) : map instanceof SortedMap ? new r53(this, (SortedMap) map) : new j53(this, map);
    }

    final Set<K> r() {
        Map<K, Collection<V>> map = this.f14042i;
        return map instanceof NavigableMap ? new p53(this, (NavigableMap) map) : map instanceof SortedMap ? new s53(this, (SortedMap) map) : new n53(this, map);
    }
}
