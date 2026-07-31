package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class d83 {
    static <V> V a(Map<?, V> map, Object obj) {
        Objects.requireNonNull(map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }
}
