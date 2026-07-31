package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
abstract class c83<K, V> extends AbstractMap<K, V> {

    /* renamed from: f, reason: collision with root package name */
    private transient Set<Map.Entry<K, V>> f3761f;

    /* renamed from: g, reason: collision with root package name */
    private transient Collection<V> f3762g;

    c83() {
    }

    abstract Set<Map.Entry<K, V>> a();

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f3761f;
        if (set != null) {
            return set;
        }
        Set<Map.Entry<K, V>> a7 = a();
        this.f3761f = a7;
        return a7;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection<V> values() {
        Collection<V> collection = this.f3762g;
        if (collection != null) {
            return collection;
        }
        b83 b83Var = new b83(this);
        this.f3762g = b83Var;
        return b83Var;
    }
}
