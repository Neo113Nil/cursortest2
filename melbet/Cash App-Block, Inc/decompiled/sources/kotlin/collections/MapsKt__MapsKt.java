package kotlin.collections;

import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;

/* loaded from: classes.dex */
public class MapsKt__MapsKt extends MapsKt__MapsJVMKt {
    public static EmptyMap emptyMap() {
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        emptyMap.getClass();
        return emptyMap;
    }

    public static Object getValue(Map map, Object obj) {
        map.getClass();
        if (map instanceof MutableMapWithDefaultImpl) {
            MutableMapWithDefaultImpl mutableMapWithDefaultImpl = (MutableMapWithDefaultImpl) map;
            LinkedHashMap linkedHashMap = mutableMapWithDefaultImpl.map;
            Object obj2 = linkedHashMap.get(obj);
            return (obj2 != null || linkedHashMap.containsKey(obj)) ? obj2 : mutableMapWithDefaultImpl.f832default.invoke(obj);
        }
        Object obj3 = map.get(obj);
        if (obj3 != null || map.containsKey(obj)) {
            return obj3;
        }
        OptionalProvider$$ExternalSyntheticLambda0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Key ", " is missing in the map.", obj));
        return null;
    }

    public static HashMap hashMapOf(Pair... pairArr) {
        HashMap hashMap = new HashMap(MapsKt__MapsJVMKt.mapCapacity(pairArr.length));
        putAll(hashMap, pairArr);
        return hashMap;
    }

    public static Map mapOf(Pair... pairArr) {
        pairArr.getClass();
        if (pairArr.length > 0) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt__MapsJVMKt.mapCapacity(pairArr.length));
            putAll(linkedHashMap, pairArr);
            return linkedHashMap;
        }
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        emptyMap.getClass();
        return emptyMap;
    }

    public static Map minus(Map map, Iterable iterable) {
        map.getClass();
        iterable.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        Set keySet = linkedHashMap.keySet();
        keySet.getClass();
        keySet.removeAll(CollectionsKt__MutableCollectionsKt.convertToListIfNotCollection(iterable));
        return optimizeReadOnlyMap(linkedHashMap);
    }

    public static LinkedHashMap mutableMapOf(Pair... pairArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt__MapsJVMKt.mapCapacity(pairArr.length));
        putAll(linkedHashMap, pairArr);
        return linkedHashMap;
    }

    public static final Map optimizeReadOnlyMap(LinkedHashMap linkedHashMap) {
        int size = linkedHashMap.size();
        if (size == 0) {
            EmptyMap emptyMap = EmptyMap.INSTANCE;
            emptyMap.getClass();
            return emptyMap;
        }
        if (size != 1) {
            return linkedHashMap;
        }
        Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
        Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        singletonMap.getClass();
        return singletonMap;
    }

    public static Map plus(Map map, Pair pair) {
        map.getClass();
        if (map.isEmpty()) {
            return MapsKt__MapsJVMKt.mapOf(pair);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(pair.first, pair.second);
        return linkedHashMap;
    }

    public static final void putAll(LinkedHashMap linkedHashMap, Iterable iterable) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            linkedHashMap.put(pair.first, pair.second);
        }
    }

    public static Map toMap(Iterable iterable) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            putAll(linkedHashMap, iterable);
            return optimizeReadOnlyMap(linkedHashMap);
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            EmptyMap emptyMap = EmptyMap.INSTANCE;
            emptyMap.getClass();
            return emptyMap;
        }
        if (size == 1) {
            return MapsKt__MapsJVMKt.mapOf((Pair) (iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next()));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt__MapsJVMKt.mapCapacity(collection.size()));
        putAll(linkedHashMap2, iterable);
        return linkedHashMap2;
    }

    public static LinkedHashMap toMutableMap(Map map) {
        map.getClass();
        return new LinkedHashMap(map);
    }

    public static Map plus(Map map, Iterable iterable) {
        map.getClass();
        iterable.getClass();
        if (map.isEmpty()) {
            return toMap(iterable);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        putAll(linkedHashMap, iterable);
        return linkedHashMap;
    }

    public static LinkedHashMap plus(Map map, Map map2) {
        map.getClass();
        map2.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static void putAll(Map map, Pair[] pairArr) {
        map.getClass();
        pairArr.getClass();
        for (Pair pair : pairArr) {
            map.put(pair.first, pair.second);
        }
    }

    public static Map minus(Map map, Object obj) {
        map.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.remove(obj);
        return optimizeReadOnlyMap(linkedHashMap);
    }

    public static Map toMap(Pair[] pairArr) {
        pairArr.getClass();
        int length = pairArr.length;
        if (length == 0) {
            EmptyMap emptyMap = EmptyMap.INSTANCE;
            emptyMap.getClass();
            return emptyMap;
        }
        if (length != 1) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt__MapsJVMKt.mapCapacity(pairArr.length));
            putAll(linkedHashMap, pairArr);
            return linkedHashMap;
        }
        return MapsKt__MapsJVMKt.mapOf(pairArr[0]);
    }

    public static Map toMap(Map map) {
        map.getClass();
        int size = map.size();
        if (size == 0) {
            EmptyMap emptyMap = EmptyMap.INSTANCE;
            emptyMap.getClass();
            return emptyMap;
        }
        if (size != 1) {
            return new LinkedHashMap(map);
        }
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        singletonMap.getClass();
        return singletonMap;
    }
}
