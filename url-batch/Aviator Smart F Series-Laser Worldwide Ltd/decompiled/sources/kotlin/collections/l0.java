package kotlin.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Properties;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.Pair;
import kotlin.collections.builders.MapBuilder;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class l0 extends k0 {
    private static final int INT_MAX_POWER_OF_TWO = 1073741824;

    public static <K, V> Map<K, V> build(Map<K, V> builder) {
        kotlin.jvm.internal.s.checkNotNullParameter(builder, "builder");
        return ((MapBuilder) builder).build();
    }

    private static final <K, V> Map<K, V> buildMapInternal(f6.l builderAction) {
        Map<K, V> build;
        kotlin.jvm.internal.s.checkNotNullParameter(builderAction, "builderAction");
        Map createMapBuilder = createMapBuilder();
        builderAction.invoke(createMapBuilder);
        build = build(createMapBuilder);
        return build;
    }

    public static final <K, V> Map<K, V> createMapBuilder() {
        return new MapBuilder();
    }

    public static final <K, V> V getOrPut(ConcurrentMap<K, V> concurrentMap, K k8, f6.a defaultValue) {
        kotlin.jvm.internal.s.checkNotNullParameter(concurrentMap, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(defaultValue, "defaultValue");
        V v7 = concurrentMap.get(k8);
        if (v7 != null) {
            return v7;
        }
        V v8 = (V) defaultValue.invoke();
        V putIfAbsent = concurrentMap.putIfAbsent(k8, v8);
        return putIfAbsent == null ? v8 : putIfAbsent;
    }

    public static int mapCapacity(int i8) {
        if (i8 < 0) {
            return i8;
        }
        if (i8 < 3) {
            return i8 + 1;
        }
        if (i8 < 1073741824) {
            return (int) ((i8 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static <K, V> Map<K, V> mapOf(Pair<? extends K, ? extends V> pair) {
        kotlin.jvm.internal.s.checkNotNullParameter(pair, "pair");
        Map<K, V> singletonMap = Collections.singletonMap(pair.getFirst(), pair.getSecond());
        kotlin.jvm.internal.s.checkNotNullExpressionValue(singletonMap, "singletonMap(pair.first, pair.second)");
        return singletonMap;
    }

    public static final <K extends Comparable<? super K>, V> SortedMap<K, V> sortedMapOf(Pair<? extends K, ? extends V>... pairs) {
        kotlin.jvm.internal.s.checkNotNullParameter(pairs, "pairs");
        TreeMap treeMap = new TreeMap();
        m0.putAll(treeMap, pairs);
        return treeMap;
    }

    private static final Properties toProperties(Map<String, String> map) {
        kotlin.jvm.internal.s.checkNotNullParameter(map, "<this>");
        Properties properties = new Properties();
        properties.putAll(map);
        return properties;
    }

    public static final <K, V> Map<K, V> toSingletonMap(Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.s.checkNotNullParameter(map, "<this>");
        Map.Entry<? extends K, ? extends V> next = map.entrySet().iterator().next();
        Map<K, V> singletonMap = Collections.singletonMap(next.getKey(), next.getValue());
        kotlin.jvm.internal.s.checkNotNullExpressionValue(singletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        return singletonMap;
    }

    private static final <K, V> Map<K, V> toSingletonMapOrSelf(Map<K, ? extends V> map) {
        kotlin.jvm.internal.s.checkNotNullParameter(map, "<this>");
        return toSingletonMap(map);
    }

    public static final <K extends Comparable<? super K>, V> SortedMap<K, V> toSortedMap(Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.s.checkNotNullParameter(map, "<this>");
        return new TreeMap(map);
    }

    private static final <K, V> Map<K, V> buildMapInternal(int i8, f6.l builderAction) {
        Map createMapBuilder;
        Map<K, V> build;
        kotlin.jvm.internal.s.checkNotNullParameter(builderAction, "builderAction");
        createMapBuilder = createMapBuilder(i8);
        builderAction.invoke(createMapBuilder);
        build = build(createMapBuilder);
        return build;
    }

    public static <K, V> Map<K, V> createMapBuilder(int i8) {
        return new MapBuilder(i8);
    }

    public static final <K, V> SortedMap<K, V> sortedMapOf(Comparator<? super K> comparator, Pair<? extends K, ? extends V>... pairs) {
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        kotlin.jvm.internal.s.checkNotNullParameter(pairs, "pairs");
        TreeMap treeMap = new TreeMap(comparator);
        m0.putAll(treeMap, pairs);
        return treeMap;
    }

    public static final <K, V> SortedMap<K, V> toSortedMap(Map<? extends K, ? extends V> map, Comparator<? super K> comparator) {
        kotlin.jvm.internal.s.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        TreeMap treeMap = new TreeMap(comparator);
        treeMap.putAll(map);
        return treeMap;
    }
}
