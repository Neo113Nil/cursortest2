package com.yandex.mobile.ads.impl;

import java.io.Serializable;

/* loaded from: classes3.dex */
final class rj0<K, V> extends AbstractC2053l<K, V> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: b, reason: collision with root package name */
    final K f31242b;

    /* renamed from: c, reason: collision with root package name */
    final V f31243c;

    rj0(K k4, V v4) {
        this.f31242b = k4;
        this.f31243c = v4;
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.f31242b;
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        return this.f31243c;
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v4) {
        throw new UnsupportedOperationException();
    }
}
