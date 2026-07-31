package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
abstract class gv3<K, V, V2> implements kv3<Map<K, V2>> {

    /* renamed from: a, reason: collision with root package name */
    private final Map<K, yv3<V>> f5779a;

    gv3(Map<K, yv3<V>> map) {
        this.f5779a = Collections.unmodifiableMap(map);
    }

    final Map<K, yv3<V>> b() {
        return this.f5779a;
    }
}
