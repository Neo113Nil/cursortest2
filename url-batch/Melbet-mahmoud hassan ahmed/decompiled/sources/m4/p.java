package m4;

import java.io.Serializable;

/* loaded from: classes.dex */
class p<K, V> extends e<K, V> implements Serializable {

    /* renamed from: f, reason: collision with root package name */
    final K f19188f;

    /* renamed from: g, reason: collision with root package name */
    final V f19189g;

    p(K k7, V v6) {
        this.f19188f = k7;
        this.f19189g = v6;
    }

    @Override // m4.e, java.util.Map.Entry
    public final K getKey() {
        return this.f19188f;
    }

    @Override // m4.e, java.util.Map.Entry
    public final V getValue() {
        return this.f19189g;
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v6) {
        throw new UnsupportedOperationException();
    }
}
