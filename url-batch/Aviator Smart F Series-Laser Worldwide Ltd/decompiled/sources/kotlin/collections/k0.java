package kotlin.collections;

import java.util.Map;
import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
class k0 {
    public static final <K, V> V getOrImplicitDefaultNullable(Map<K, ? extends V> map, K k8) {
        kotlin.jvm.internal.s.checkNotNullParameter(map, "<this>");
        if (map instanceof h0) {
            return (V) ((h0) map).getOrImplicitDefault(k8);
        }
        V v7 = map.get(k8);
        if (v7 != null || map.containsKey(k8)) {
            return v7;
        }
        throw new NoSuchElementException("Key " + k8 + " is missing in the map.");
    }

    public static final <K, V> Map<K, V> withDefault(Map<K, ? extends V> map, f6.l defaultValue) {
        kotlin.jvm.internal.s.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(defaultValue, "defaultValue");
        return map instanceof h0 ? withDefault(((h0) map).getMap(), defaultValue) : new i0(map, defaultValue);
    }

    public static final <K, V> Map<K, V> withDefaultMutable(Map<K, V> map, f6.l defaultValue) {
        kotlin.jvm.internal.s.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(defaultValue, "defaultValue");
        return map instanceof q0 ? withDefaultMutable(((q0) map).getMap(), defaultValue) : new r0(map, defaultValue);
    }
}
