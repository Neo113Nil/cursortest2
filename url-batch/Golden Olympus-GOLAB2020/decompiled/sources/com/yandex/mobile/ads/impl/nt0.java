package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.lx1;
import java.util.Map;

/* loaded from: classes3.dex */
class nt0<K, V> extends lx1.c<K> {

    /* renamed from: b, reason: collision with root package name */
    final Map<K, V> f29755b;

    nt0(Map<K, V> map) {
        this.f29755b = (Map) nj1.a(map);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f29755b.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f29755b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f29755b.size();
    }
}
