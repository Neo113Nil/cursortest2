package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.AbstractC2029k;
import com.yandex.mobile.ads.impl.AbstractC2029k.a.C0196a;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
abstract class pt0<K, V> extends AbstractMap<K, V> {

    /* renamed from: b, reason: collision with root package name */
    private transient Set<Map.Entry<K, V>> f30560b;

    /* renamed from: c, reason: collision with root package name */
    private transient Collection<V> f30561c;

    pt0() {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f30560b;
        if (set != null) {
            return set;
        }
        AbstractC2029k.a.C0196a c0196a = ((AbstractC2029k.a) this).new C0196a();
        this.f30560b = c0196a;
        return c0196a;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection<V> values() {
        Collection<V> collection = this.f30561c;
        if (collection != null) {
            return collection;
        }
        ot0 ot0Var = new ot0(this);
        this.f30561c = ot0Var;
        return ot0Var;
    }
}
