package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* loaded from: classes.dex */
final class a73<K, V> extends y53<K, V> implements Serializable {

    /* renamed from: f, reason: collision with root package name */
    final K f2658f;

    /* renamed from: g, reason: collision with root package name */
    final V f2659g;

    a73(K k7, V v6) {
        this.f2658f = k7;
        this.f2659g = v6;
    }

    @Override // com.google.android.gms.internal.ads.y53, java.util.Map.Entry
    public final K getKey() {
        return this.f2658f;
    }

    @Override // com.google.android.gms.internal.ads.y53, java.util.Map.Entry
    public final V getValue() {
        return this.f2659g;
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v6) {
        throw new UnsupportedOperationException();
    }
}
