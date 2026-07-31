package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
class f53<K, V> extends x53<K, V> implements u73<K, V> {
    protected f53(Map<K, Collection<V>> map) {
        super(map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.x53
    final <E> Collection<E> j(Collection<E> collection) {
        return Collections.unmodifiableList(collection);
    }

    @Override // com.google.android.gms.internal.ads.x53
    final Collection<V> k(K k7, Collection<V> collection) {
        return n(k7, (List) collection, null);
    }
}
