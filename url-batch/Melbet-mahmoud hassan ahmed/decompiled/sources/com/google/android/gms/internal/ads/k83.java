package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class k83<K0> {
    k83() {
    }

    abstract <K extends K0, V> Map<K, Collection<V>> a();

    public final i83<K0, Object> b(int i7) {
        return new j83(this, 2);
    }
}
