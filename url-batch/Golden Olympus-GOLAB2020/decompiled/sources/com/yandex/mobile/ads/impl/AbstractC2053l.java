package com.yandex.mobile.ads.impl;

import java.util.Map;

/* renamed from: com.yandex.mobile.ads.impl.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract class AbstractC2053l<K, V> implements Map.Entry<K, V> {
    AbstractC2053l() {
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (nd1.a(getKey(), entry.getKey()) && nd1.a(getValue(), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        K key = getKey();
        V value = getValue();
        return (key == null ? 0 : key.hashCode()) ^ (value != null ? value.hashCode() : 0);
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
