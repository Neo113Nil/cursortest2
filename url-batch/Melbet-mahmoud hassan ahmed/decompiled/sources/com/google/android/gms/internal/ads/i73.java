package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class i73<K, V> implements Map<K, V>, Serializable {

    /* renamed from: f, reason: collision with root package name */
    private transient p73<Map.Entry<K, V>> f6559f;

    /* renamed from: g, reason: collision with root package name */
    private transient p73<K> f6560g;

    /* renamed from: h, reason: collision with root package name */
    private transient z63<V> f6561h;

    i73() {
    }

    public static <K, V> i73<K, V> c(Map<? extends K, ? extends V> map) {
        Set<Map.Entry<? extends K, ? extends V>> entrySet = map.entrySet();
        h73 h73Var = new h73(entrySet instanceof Collection ? entrySet.size() : 4);
        h73Var.b(entrySet);
        return h73Var.c();
    }

    public static <K, V> i73<K, V> d() {
        return (i73<K, V>) y83.f14578l;
    }

    abstract z63<V> a();

    @Override // java.util.Map
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final z63<V> values() {
        z63<V> z63Var = this.f6561h;
        if (z63Var != null) {
            return z63Var;
        }
        z63<V> a7 = a();
        this.f6561h = a7;
        return a7;
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    abstract p73<Map.Entry<K, V>> e();

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    abstract p73<K> f();

    @Override // java.util.Map
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final p73<Map.Entry<K, V>> entrySet() {
        p73<Map.Entry<K, V>> p73Var = this.f6559f;
        if (p73Var != null) {
            return p73Var;
        }
        p73<Map.Entry<K, V>> e7 = e();
        this.f6559f = e7;
        return e7;
    }

    @Override // java.util.Map
    public abstract V get(Object obj);

    @Override // java.util.Map
    public final V getOrDefault(Object obj, V v6) {
        V v7 = get(obj);
        return v7 != null ? v7 : v6;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return d93.a(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        p73<K> p73Var = this.f6560g;
        if (p73Var != null) {
            return p73Var;
        }
        p73<K> f7 = f();
        this.f6560g = f7;
        return f7;
    }

    @Override // java.util.Map
    @Deprecated
    public final V put(K k7, V v6) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        c63.a(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(size * 8, 1073741824L));
        sb.append('{');
        boolean z6 = true;
        for (Map.Entry<K, V> entry : entrySet()) {
            if (!z6) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z6 = false;
        }
        sb.append('}');
        return sb.toString();
    }
}
