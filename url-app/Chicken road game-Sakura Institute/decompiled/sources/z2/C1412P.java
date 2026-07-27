package z2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: z2.P, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1412P extends C1411O {
    public static Map c() {
        C1406J c1406j = C1406J.f11932d;
        Intrinsics.d(c1406j, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return c1406j;
    }

    public static Object d(Object obj, Map map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(map, "<this>");
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    public static Map e(Pair... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        if (pairs.length <= 0) {
            return c();
        }
        LinkedHashMap destination = new LinkedHashMap(C1411O.a(pairs.length));
        Intrinsics.checkNotNullParameter(pairs, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        g(destination, pairs);
        return destination;
    }

    public static LinkedHashMap f(Pair... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C1411O.a(pairs.length));
        g(linkedHashMap, pairs);
        return linkedHashMap;
    }

    public static final void g(HashMap hashMap, Pair[] pairs) {
        Intrinsics.checkNotNullParameter(hashMap, "<this>");
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        for (Pair pair : pairs) {
            hashMap.put(pair.f7485d, pair.f7486e);
        }
    }

    public static Map h(ArrayList pairs) {
        Intrinsics.checkNotNullParameter(pairs, "<this>");
        int size = pairs.size();
        if (size == 0) {
            return c();
        }
        if (size == 1) {
            return C1411O.b((Pair) pairs.get(0));
        }
        LinkedHashMap destination = new LinkedHashMap(C1411O.a(pairs.size()));
        Intrinsics.checkNotNullParameter(pairs, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(destination, "<this>");
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        Iterator it = pairs.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            destination.put(pair.f7485d, pair.f7486e);
        }
        return destination;
    }

    public static Map i(Map map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        int size = map.size();
        if (size == 0) {
            return c();
        }
        if (size != 1) {
            return j(map);
        }
        Intrinsics.checkNotNullParameter(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        Intrinsics.checkNotNullExpressionValue(singletonMap, "with(...)");
        return singletonMap;
    }

    public static LinkedHashMap j(Map map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return new LinkedHashMap(map);
    }
}
