package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class er3<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: g, reason: collision with root package name */
    private static final er3 f4731g;

    /* renamed from: f, reason: collision with root package name */
    private boolean f4732f;

    static {
        er3 er3Var = new er3();
        f4731g = er3Var;
        er3Var.f4732f = false;
    }

    private er3() {
        this.f4732f = true;
    }

    private er3(Map<K, V> map) {
        super(map);
        this.f4732f = true;
    }

    public static <K, V> er3<K, V> a() {
        return f4731g;
    }

    private static int h(Object obj) {
        if (obj instanceof byte[]) {
            return kq3.b((byte[]) obj);
        }
        if (obj instanceof cq3) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    private final void i() {
        if (!this.f4732f) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        i();
        super.clear();
    }

    public final er3<K, V> d() {
        return isEmpty() ? new er3<>() : new er3<>(this);
    }

    public final void e() {
        this.f4732f = false;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        for (Map.Entry<K, V> entry : entrySet()) {
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            V value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                return false;
            }
        }
        return true;
    }

    public final void f(er3<K, V> er3Var) {
        i();
        if (er3Var.isEmpty()) {
            return;
        }
        putAll(er3Var);
    }

    public final boolean g() {
        return this.f4732f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i7 = 0;
        for (Map.Entry<K, V> entry : entrySet()) {
            i7 += h(entry.getValue()) ^ h(entry.getKey());
        }
        return i7;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V put(K k7, V v6) {
        i();
        kq3.e(k7);
        kq3.e(v6);
        return (V) super.put(k7, v6);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        i();
        for (K k7 : map.keySet()) {
            kq3.e(k7);
            kq3.e(map.get(k7));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        i();
        return (V) super.remove(obj);
    }
}
