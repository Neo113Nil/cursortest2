package w5;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
class y extends x {
    public static int a(int i7) {
        if (i7 < 0) {
            return i7;
        }
        if (i7 < 3) {
            return i7 + 1;
        }
        if (i7 < 1073741824) {
            return (int) ((i7 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static final <K, V> Map<K, V> b(v5.j<? extends K, ? extends V> jVar) {
        kotlin.jvm.internal.i.d(jVar, "pair");
        Map<K, V> singletonMap = Collections.singletonMap(jVar.c(), jVar.d());
        kotlin.jvm.internal.i.c(singletonMap, "singletonMap(pair.first, pair.second)");
        return singletonMap;
    }

    public static final <K, V> Map<K, V> c(Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.i.d(map, "<this>");
        Map.Entry<? extends K, ? extends V> next = map.entrySet().iterator().next();
        Map<K, V> singletonMap = Collections.singletonMap(next.getKey(), next.getValue());
        kotlin.jvm.internal.i.c(singletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        return singletonMap;
    }
}
