package kotlin.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Pair;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class p0 extends o0 {
    public static Object c(Object obj, Map map) {
        map.getClass();
        map.getClass();
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    public static Map d(Pair... pairArr) {
        if (pairArr.length > 0) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(o0.a(pairArr.length));
            f(linkedHashMap, pairArr);
            return linkedHashMap;
        }
        k0 k0Var = k0.f5575d;
        k0Var.getClass();
        return k0Var;
    }

    public static LinkedHashMap e(Pair... pairArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(o0.a(pairArr.length));
        f(linkedHashMap, pairArr);
        return linkedHashMap;
    }

    public static final void f(HashMap hashMap, Pair[] pairArr) {
        for (Pair pair : pairArr) {
            hashMap.put(pair.f5552d, pair.f5553e);
        }
    }

    public static Map g(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            k0 k0Var = k0.f5575d;
            k0Var.getClass();
            return k0Var;
        }
        if (size == 1) {
            return o0.b((Pair) arrayList.get(0));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(o0.a(arrayList.size()));
        int size2 = arrayList.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj = arrayList.get(i3);
            i3++;
            Pair pair = (Pair) obj;
            linkedHashMap.put(pair.f5552d, pair.f5553e);
        }
        return linkedHashMap;
    }

    public static Map h(Map map) {
        map.getClass();
        int size = map.size();
        if (size == 0) {
            k0 k0Var = k0.f5575d;
            k0Var.getClass();
            return k0Var;
        }
        if (size != 1) {
            return new LinkedHashMap(map);
        }
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        singletonMap.getClass();
        return singletonMap;
    }

    public static LinkedHashMap i(Map map) {
        map.getClass();
        return new LinkedHashMap(map);
    }
}
