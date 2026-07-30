package kotlin.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class m0 extends l0 {
    private static final <K, V> Map<K, V> buildMap(f6.l builderAction) {
        Map<K, V> build;
        kotlin.jvm.internal.s.checkNotNullParameter(builderAction, "builderAction");
        Map createMapBuilder = l0.createMapBuilder();
        builderAction.invoke(createMapBuilder);
        build = l0.build(createMapBuilder);
        return build;
    }

    private static final <K, V> K component1(Map.Entry<? extends K, ? extends V> entry) {
        kotlin.jvm.internal.s.checkNotNullParameter(entry, "<this>");
        return entry.getKey();
    }

    private static final <K, V> V component2(Map.Entry<? extends K, ? extends V> entry) {
        kotlin.jvm.internal.s.checkNotNullParameter(entry, "<this>");
        return entry.getValue();
    }

    private static final <K, V> boolean contains(Map<? extends K, ? extends V> map, K k8) {
        kotlin.jvm.internal.s.checkNotNullParameter(map, "<this>");
        return map.containsKey(k8);
    }

    private static final <K> boolean containsKey(Map<? extends K, ?> map, K k8) {
        kotlin.jvm.internal.s.checkNotNullParameter(map, "<this>");
        return map.containsKey(k8);
    }

    private static final <K, V> boolean containsValue(Map<K, ? extends V> map, V v7) {
        kotlin.jvm.internal.s.checkNotNullParameter(map, "<this>");
        return map.containsValue(v7);
    }

    public static <K, V> Map<K, V> emptyMap() {
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        kotlin.jvm.internal.s.checkNotNull(emptyMap, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return emptyMap;
    }

    public static final <K, V> Map<K, V> filter(Map<? extends K, ? extends V> map, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (((Boolean) predicate.invoke(entry)).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public static final <K, V> Map<K, V> filterKeys(Map<? extends K, ? extends V> map, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (((Boolean) predicate.invoke(entry.getKey())).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public static final <K, V> Map<K, V> filterNot(Map<? extends K, ? extends V> map, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (!((Boolean) predicate.invoke(entry)).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M filterNotTo(Map<? extends K, ? extends V> map, M destination, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (!((Boolean) predicate.invoke(entry)).booleanValue()) {
                destination.put(entry.getKey(), entry.getValue());
            }
        }
        return destination;
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M filterTo(Map<? extends K, ? extends V> map, M destination, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (((Boolean) predicate.invoke(entry)).booleanValue()) {
                destination.put(entry.getKey(), entry.getValue());
            }
        }
        return destination;
    }

    public static final <K, V> Map<K, V> filterValues(Map<? extends K, ? extends V> map, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (((Boolean) predicate.invoke(entry.getValue())).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    private static final <K, V> V get(Map<? extends K, ? extends V> map, K k8) {
        kotlin.jvm.internal.s.checkNotNullParameter(map, "<this>");
        return map.get(k8);
    }

    private static final <K, V> V getOrElse(Map<K, ? extends V> map, K k8, f6.a defaultValue) {
        kotlin.jvm.internal.s.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(defaultValue, "defaultValue");
        V v7 = map.get(k8);
        return v7 == null ? (V) defaultValue.invoke() : v7;
    }

    public static final <K, V> V getOrElseNullable(Map<K, ? extends V> map, K k8, f6.a defaultValue) {
        kotlin.jvm.internal.s.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(defaultValue, "defaultValue");
        V v7 = map.get(k8);
        return (v7 != null || map.containsKey(k8)) ? v7 : (V) defaultValue.invoke();
    }

    public static final <K, V> V getOrPut(Map<K, V> map, K k8, f6.a defaultValue) {
        kotlin.jvm.internal.s.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(defaultValue, "defaultValue");
        V v7 = map.get(k8);
        if (v7 != null) {
            return v7;
        }
        V v8 = (V) defaultValue.invoke();
        map.put(k8, v8);
        return v8;
    }

    public static final <K, V> V getValue(Map<K, ? extends V> map, K k8) {
        kotlin.jvm.internal.s.checkNotNullParameter(map, "<this>");
        return (V) k0.getOrImplicitDefaultNullable(map, k8);
    }

    private static final <K, V> HashMap<K, V> hashMapOf() {
        return new HashMap<>();
    }

    /* JADX WARN: Incorrect types in method signature: <M::Ljava/util/Map<**>;:TR;R:Ljava/lang/Object;>(TM;Lf6/a;)TR; */
    private static final Object ifEmpty(Map map, f6.a defaultValue) {
        kotlin.jvm.internal.s.checkNotNullParameter(defaultValue, "defaultValue");
        return map.isEmpty() ? defaultValue.invoke() : map;
    }

    private static final <K, V> boolean isNotEmpty(Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.s.checkNotNullParameter(map, "<this>");
        return !map.isEmpty();
    }

    private static final <K, V> boolean isNullOrEmpty(Map<? extends K, ? extends V> map) {
        return map == null || map.isEmpty();
    }

    private static final <K, V> Iterator<Map.Entry<K, V>> iterator(Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.s.checkNotNullParameter(map, "<this>");
        return map.entrySet().iterator();
    }

    private static final <K, V> LinkedHashMap<K, V> linkedMapOf() {
        return new LinkedHashMap<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V, R> Map<R, V> mapKeys(Map<? extends K, ? extends V> map, f6.l transform) {
        int mapCapacity;
        kotlin.jvm.internal.s.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        mapCapacity = l0.mapCapacity(map.size());
        LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity);
        for (Object obj : map.entrySet()) {
            linkedHashMap.put(transform.invoke(obj), ((Map.Entry) obj).getValue());
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V, R, M extends Map<? super R, ? super V>> M mapKeysTo(Map<? extends K, ? extends V> map, M destination, f6.l transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        for (Object obj : map.entrySet()) {
            destination.put(transform.invoke(obj), ((Map.Entry) obj).getValue());
        }
        return destination;
    }

    public static <K, V> Map<K, V> mapOf(Pair<? extends K, ? extends V>... pairs) {
        Map<K, V> emptyMap;
        int mapCapacity;
        kotlin.jvm.internal.s.checkNotNullParameter(pairs, "pairs");
        if (pairs.length > 0) {
            mapCapacity = l0.mapCapacity(pairs.length);
            return toMap(pairs, new LinkedHashMap(mapCapacity));
        }
        emptyMap = emptyMap();
        return emptyMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V, R> Map<K, R> mapValues(Map<? extends K, ? extends V> map, f6.l transform) {
        int mapCapacity;
        kotlin.jvm.internal.s.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        mapCapacity = l0.mapCapacity(map.size());
        LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity);
        for (Object obj : map.entrySet()) {
            linkedHashMap.put(((Map.Entry) obj).getKey(), transform.invoke(obj));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V, R, M extends Map<? super K, ? super R>> M mapValuesTo(Map<? extends K, ? extends V> map, M destination, f6.l transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        for (Object obj : map.entrySet()) {
            destination.put(((Map.Entry) obj).getKey(), transform.invoke(obj));
        }
        return destination;
    }

    public static final <K, V> Map<K, V> minus(Map<? extends K, ? extends V> map, K k8) {
        Map mutableMap;
        kotlin.jvm.internal.s.checkNotNullParameter(map, "<this>");
        mutableMap = toMutableMap(map);
        mutableMap.remove(k8);
        return optimizeReadOnlyMap(mutableMap);
    }

    private static final <K, V> void minusAssign(Map<K, V> map, K k8) {
        kotlin.jvm.internal.s.checkNotNullParameter(map, "<this>");
        map.remove(k8);
    }

    private static final <K, V> Iterator<Map.Entry<K, V>> mutableIterator(Map<K, V> map) {
        kotlin.jvm.internal.s.checkNotNullParameter(map, "<this>");
        return map.entrySet().iterator();
    }

    private static final <K, V> Map<K, V> mutableMapOf() {
        return new LinkedHashMap();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> optimizeReadOnlyMap(Map<K, ? extends V> map) {
        Map<K, V> emptyMap;
        kotlin.jvm.internal.s.checkNotNullParameter(map, "<this>");
        int size = map.size();
        if (size != 0) {
            return size != 1 ? map : l0.toSingletonMap(map);
        }
        emptyMap = emptyMap();
        return emptyMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <K, V> Map<K, V> orEmpty(Map<K, ? extends V> map) {
        Map<K, V> emptyMap;
        if (map != 0) {
            return map;
        }
        emptyMap = emptyMap();
        return emptyMap;
    }

    public static final <K, V> Map<K, V> plus(Map<? extends K, ? extends V> map, Pair<? extends K, ? extends V> pair) {
        Map<K, V> mapOf;
        kotlin.jvm.internal.s.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(pair, "pair");
        if (map.isEmpty()) {
            mapOf = l0.mapOf(pair);
            return mapOf;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(pair.getFirst(), pair.getSecond());
        return linkedHashMap;
    }

    private static final <K, V> void plusAssign(Map<? super K, ? super V> map, Pair<? extends K, ? extends V> pair) {
        kotlin.jvm.internal.s.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(pair, "pair");
        map.put(pair.getFirst(), pair.getSecond());
    }

    public static final <K, V> void putAll(Map<? super K, ? super V> map, Pair<? extends K, ? extends V>[] pairs) {
        kotlin.jvm.internal.s.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(pairs, "pairs");
        for (Pair<? extends K, ? extends V> pair : pairs) {
            map.put(pair.component1(), pair.component2());
        }
    }

    private static final <K, V> V remove(Map<? extends K, V> map, K k8) {
        kotlin.jvm.internal.s.checkNotNullParameter(map, "<this>");
        return (V) kotlin.jvm.internal.x.asMutableMap(map).remove(k8);
    }

    private static final <K, V> void set(Map<K, V> map, K k8, V v7) {
        kotlin.jvm.internal.s.checkNotNullParameter(map, "<this>");
        map.put(k8, v7);
    }

    public static <K, V> Map<K, V> toMap(Iterable<? extends Pair<? extends K, ? extends V>> iterable) {
        Map<K, V> emptyMap;
        Map<K, V> mapOf;
        int mapCapacity;
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return optimizeReadOnlyMap(toMap(iterable, new LinkedHashMap()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            emptyMap = emptyMap();
            return emptyMap;
        }
        if (size != 1) {
            mapCapacity = l0.mapCapacity(collection.size());
            return toMap(iterable, new LinkedHashMap(mapCapacity));
        }
        mapOf = l0.mapOf(iterable instanceof List ? (Pair<? extends K, ? extends V>) ((List) iterable).get(0) : iterable.iterator().next());
        return mapOf;
    }

    public static <K, V> Map<K, V> toMutableMap(Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.s.checkNotNullParameter(map, "<this>");
        return new LinkedHashMap(map);
    }

    private static final <K, V> Pair<K, V> toPair(Map.Entry<? extends K, ? extends V> entry) {
        kotlin.jvm.internal.s.checkNotNullParameter(entry, "<this>");
        return new Pair<>(entry.getKey(), entry.getValue());
    }

    private static final <K, V> Map<K, V> buildMap(int i8, f6.l builderAction) {
        Map createMapBuilder;
        Map<K, V> build;
        kotlin.jvm.internal.s.checkNotNullParameter(builderAction, "builderAction");
        createMapBuilder = l0.createMapBuilder(i8);
        builderAction.invoke(createMapBuilder);
        build = l0.build(createMapBuilder);
        return build;
    }

    public static <K, V> HashMap<K, V> hashMapOf(Pair<? extends K, ? extends V>... pairs) {
        int mapCapacity;
        kotlin.jvm.internal.s.checkNotNullParameter(pairs, "pairs");
        mapCapacity = l0.mapCapacity(pairs.length);
        HashMap<K, V> hashMap = new HashMap<>(mapCapacity);
        putAll(hashMap, pairs);
        return hashMap;
    }

    public static final <K, V> LinkedHashMap<K, V> linkedMapOf(Pair<? extends K, ? extends V>... pairs) {
        int mapCapacity;
        kotlin.jvm.internal.s.checkNotNullParameter(pairs, "pairs");
        mapCapacity = l0.mapCapacity(pairs.length);
        return (LinkedHashMap) toMap(pairs, new LinkedHashMap(mapCapacity));
    }

    private static final <K, V> Map<K, V> mapOf() {
        Map<K, V> emptyMap;
        emptyMap = emptyMap();
        return emptyMap;
    }

    public static final <K, V> Map<K, V> minus(Map<? extends K, ? extends V> map, Iterable<? extends K> keys) {
        Map mutableMap;
        kotlin.jvm.internal.s.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(keys, "keys");
        mutableMap = toMutableMap(map);
        v.removeAll(mutableMap.keySet(), keys);
        return optimizeReadOnlyMap(mutableMap);
    }

    private static final <K, V> void minusAssign(Map<K, V> map, Iterable<? extends K> keys) {
        kotlin.jvm.internal.s.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(keys, "keys");
        v.removeAll(map.keySet(), keys);
    }

    public static final <K, V> Map<K, V> mutableMapOf(Pair<? extends K, ? extends V>... pairs) {
        int mapCapacity;
        kotlin.jvm.internal.s.checkNotNullParameter(pairs, "pairs");
        mapCapacity = l0.mapCapacity(pairs.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity);
        putAll(linkedHashMap, pairs);
        return linkedHashMap;
    }

    public static final <K, V> Map<K, V> plus(Map<? extends K, ? extends V> map, Iterable<? extends Pair<? extends K, ? extends V>> pairs) {
        Map<K, V> map2;
        kotlin.jvm.internal.s.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(pairs, "pairs");
        if (map.isEmpty()) {
            map2 = toMap(pairs);
            return map2;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        putAll(linkedHashMap, pairs);
        return linkedHashMap;
    }

    private static final <K, V> void plusAssign(Map<? super K, ? super V> map, Iterable<? extends Pair<? extends K, ? extends V>> pairs) {
        kotlin.jvm.internal.s.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(pairs, "pairs");
        putAll(map, pairs);
    }

    public static final <K, V> Map<K, V> minus(Map<? extends K, ? extends V> map, K[] keys) {
        Map mutableMap;
        kotlin.jvm.internal.s.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(keys, "keys");
        mutableMap = toMutableMap(map);
        v.removeAll(mutableMap.keySet(), keys);
        return optimizeReadOnlyMap(mutableMap);
    }

    private static final <K, V> void minusAssign(Map<K, V> map, K[] keys) {
        kotlin.jvm.internal.s.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(keys, "keys");
        v.removeAll(map.keySet(), keys);
    }

    public static final <K, V> Map<K, V> plus(Map<? extends K, ? extends V> map, Pair<? extends K, ? extends V>[] pairs) {
        Map<K, V> map2;
        kotlin.jvm.internal.s.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(pairs, "pairs");
        if (map.isEmpty()) {
            map2 = toMap(pairs);
            return map2;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        putAll(linkedHashMap, pairs);
        return linkedHashMap;
    }

    private static final <K, V> void plusAssign(Map<? super K, ? super V> map, Pair<? extends K, ? extends V>[] pairs) {
        kotlin.jvm.internal.s.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(pairs, "pairs");
        putAll(map, pairs);
    }

    public static final <K, V> void putAll(Map<? super K, ? super V> map, Iterable<? extends Pair<? extends K, ? extends V>> pairs) {
        kotlin.jvm.internal.s.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(pairs, "pairs");
        for (Pair<? extends K, ? extends V> pair : pairs) {
            map.put(pair.component1(), pair.component2());
        }
    }

    public static final <K, V> Map<K, V> minus(Map<? extends K, ? extends V> map, kotlin.sequences.m keys) {
        Map mutableMap;
        kotlin.jvm.internal.s.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(keys, "keys");
        mutableMap = toMutableMap(map);
        v.removeAll(mutableMap.keySet(), keys);
        return optimizeReadOnlyMap(mutableMap);
    }

    private static final <K, V> void minusAssign(Map<K, V> map, kotlin.sequences.m keys) {
        kotlin.jvm.internal.s.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(keys, "keys");
        v.removeAll(map.keySet(), keys);
    }

    public static final <K, V> Map<K, V> plus(Map<? extends K, ? extends V> map, kotlin.sequences.m pairs) {
        kotlin.jvm.internal.s.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(pairs, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        putAll(linkedHashMap, pairs);
        return optimizeReadOnlyMap(linkedHashMap);
    }

    private static final <K, V> void plusAssign(Map<? super K, ? super V> map, kotlin.sequences.m pairs) {
        kotlin.jvm.internal.s.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(pairs, "pairs");
        putAll(map, pairs);
    }

    public static final <K, V> Map<K, V> plus(Map<? extends K, ? extends V> map, Map<? extends K, ? extends V> map2) {
        kotlin.jvm.internal.s.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <K, V> void plusAssign(Map<? super K, ? super V> map, Map<K, ? extends V> map2) {
        kotlin.jvm.internal.s.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(map2, "map");
        map.putAll(map2);
    }

    public static final <K, V> void putAll(Map<? super K, ? super V> map, kotlin.sequences.m pairs) {
        kotlin.jvm.internal.s.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(pairs, "pairs");
        Iterator<Object> it = pairs.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            map.put((Object) pair.component1(), (Object) pair.component2());
        }
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M toMap(Iterable<? extends Pair<? extends K, ? extends V>> iterable, M destination) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        putAll(destination, iterable);
        return destination;
    }

    public static <K, V> Map<K, V> toMap(Pair<? extends K, ? extends V>[] pairArr) {
        Map<K, V> emptyMap;
        Map<K, V> mapOf;
        int mapCapacity;
        kotlin.jvm.internal.s.checkNotNullParameter(pairArr, "<this>");
        int length = pairArr.length;
        if (length == 0) {
            emptyMap = emptyMap();
            return emptyMap;
        }
        if (length != 1) {
            mapCapacity = l0.mapCapacity(pairArr.length);
            return toMap(pairArr, new LinkedHashMap(mapCapacity));
        }
        mapOf = l0.mapOf(pairArr[0]);
        return mapOf;
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M toMap(Pair<? extends K, ? extends V>[] pairArr, M destination) {
        kotlin.jvm.internal.s.checkNotNullParameter(pairArr, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        putAll(destination, pairArr);
        return destination;
    }

    public static final <K, V> Map<K, V> toMap(kotlin.sequences.m mVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        return optimizeReadOnlyMap(toMap(mVar, new LinkedHashMap()));
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M toMap(kotlin.sequences.m mVar, M destination) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        putAll(destination, mVar);
        return destination;
    }

    public static <K, V> Map<K, V> toMap(Map<? extends K, ? extends V> map) {
        Map<K, V> emptyMap;
        Map<K, V> mutableMap;
        kotlin.jvm.internal.s.checkNotNullParameter(map, "<this>");
        int size = map.size();
        if (size == 0) {
            emptyMap = emptyMap();
            return emptyMap;
        }
        if (size != 1) {
            mutableMap = toMutableMap(map);
            return mutableMap;
        }
        return l0.toSingletonMap(map);
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M toMap(Map<? extends K, ? extends V> map, M destination) {
        kotlin.jvm.internal.s.checkNotNullParameter(map, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        destination.putAll(map);
        return destination;
    }
}
