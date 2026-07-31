package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class ov3<K, V> extends gv3<K, V, V> {

    /* renamed from: b, reason: collision with root package name */
    private static final yv3<Map<Object, Object>> f9840b = lv3.b(Collections.emptyMap());

    /* synthetic */ ov3(Map map, mv3 mv3Var) {
        super(map);
    }

    public static <K, V> nv3<K, V> c(int i7) {
        return new nv3<>(i7, null);
    }

    @Override // com.google.android.gms.internal.ads.yv3
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final Map<K, V> a() {
        LinkedHashMap b7 = hv3.b(b().size());
        for (Map.Entry<K, yv3<V>> entry : b().entrySet()) {
            b7.put(entry.getKey(), entry.getValue().a());
        }
        return Collections.unmodifiableMap(b7);
    }
}
