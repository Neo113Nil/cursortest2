package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
abstract class a63<K, V> implements e83<K, V> {

    /* renamed from: f, reason: collision with root package name */
    private transient Set<K> f2649f;

    /* renamed from: g, reason: collision with root package name */
    private transient Collection<V> f2650g;

    /* renamed from: h, reason: collision with root package name */
    private transient Map<K, Collection<V>> f2651h;

    a63() {
    }

    abstract Collection<V> c();

    Iterator<V> d() {
        throw null;
    }

    abstract Map<K, Collection<V>> e();

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e83) {
            return p().equals(((e83) obj).p());
        }
        return false;
    }

    abstract Set<K> f();

    public final Set<K> g() {
        Set<K> set = this.f2649f;
        if (set != null) {
            return set;
        }
        Set<K> f7 = f();
        this.f2649f = f7;
        return f7;
    }

    public boolean h(Object obj) {
        Iterator<Collection<V>> it = p().values().iterator();
        while (it.hasNext()) {
            if (it.next().contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return p().hashCode();
    }

    @Override // com.google.android.gms.internal.ads.e83
    public Map<K, Collection<V>> p() {
        Map<K, Collection<V>> map = this.f2651h;
        if (map != null) {
            return map;
        }
        Map<K, Collection<V>> e7 = e();
        this.f2651h = e7;
        return e7;
    }

    @Override // com.google.android.gms.internal.ads.e83
    public Collection<V> t() {
        Collection<V> collection = this.f2650g;
        if (collection != null) {
            return collection;
        }
        Collection<V> c7 = c();
        this.f2650g = c7;
        return c7;
    }

    public final String toString() {
        return p().toString();
    }
}
