package com.google.android.gms.internal.ads;

import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public class fv3<K, V, V2> {

    /* renamed from: a, reason: collision with root package name */
    final LinkedHashMap<K, yv3<V>> f5252a;

    fv3(int i7) {
        this.f5252a = hv3.b(i7);
    }

    final fv3<K, V, V2> a(K k7, yv3<V> yv3Var) {
        LinkedHashMap<K, yv3<V>> linkedHashMap = this.f5252a;
        sv3.a(k7, "key");
        sv3.a(yv3Var, "provider");
        linkedHashMap.put(k7, yv3Var);
        return this;
    }
}
