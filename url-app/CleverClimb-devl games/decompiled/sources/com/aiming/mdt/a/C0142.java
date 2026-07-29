package com.aiming.mdt.a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.aiming.mdt.a.ʼʿˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0142<K, V> {

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private Map<K, List<V>> f467;

    public C0142(Map<K, List<V>> map) {
        this.f467 = map;
    }

    /* renamed from: ʻ */
    public boolean mo407(K k) {
        return this.f467.containsKey(k);
    }

    /* renamed from: ʻʽ */
    public void mo411(K k, List<V> list) {
        Iterator<V> it = list.iterator();
        while (it.hasNext()) {
            mo417(k, it.next());
        }
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    public final boolean m538() {
        return this.f467.isEmpty();
    }

    /* renamed from: ʼ */
    public V mo412(K k) {
        List<V> list = this.f467.get(k);
        if (list == null || list.size() <= 0) {
            return null;
        }
        return list.get(0);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public final Set<Map.Entry<K, List<V>>> m539() {
        return this.f467.entrySet();
    }

    /* renamed from: ʼ */
    public void mo414(K k, V v) {
        this.f467.remove(k);
        mo417(k, v);
    }

    /* renamed from: ʽ */
    public List<V> mo416(K k) {
        return this.f467.get(k);
    }

    /* renamed from: ʽ */
    public void mo417(K k, V v) {
        if (!this.f467.containsKey(k)) {
            this.f467.put(k, new ArrayList(1));
        }
        this.f467.get(k).add(v);
    }
}
