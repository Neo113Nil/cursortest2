package com.yandex.mobile.ads.impl;

import java.util.Collection;
import java.util.Map;

/* loaded from: classes3.dex */
public interface g31<K, V> {
    Map<K, Collection<V>> a();

    boolean put(K k4, V v4);

    Collection<V> values();
}
