package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Pair;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class mi1 extends li1 {
    public static Map c() {
        bh0 bh0Var = bh0.m;
        bh0Var.getClass();
        return bh0Var;
    }

    public static Object d(HashMap hashMap, Object obj) {
        hashMap.getClass();
        Object obj2 = hashMap.get(obj);
        if (obj2 != null || hashMap.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    public static HashMap e(Pair... pairArr) {
        HashMap hashMap = new HashMap(li1.a(pairArr.length));
        g(hashMap, pairArr);
        return hashMap;
    }

    public static Map f(Pair... pairArr) {
        if (pairArr.length > 0) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(li1.a(pairArr.length));
            g(linkedHashMap, pairArr);
            return linkedHashMap;
        }
        bh0 bh0Var = bh0.m;
        bh0Var.getClass();
        return bh0Var;
    }

    public static final void g(HashMap hashMap, Pair[] pairArr) {
        for (Pair pair : pairArr) {
            hashMap.put(pair.m, pair.n);
        }
    }

    public static Map h(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            bh0 bh0Var = bh0.m;
            bh0Var.getClass();
            return bh0Var;
        }
        int i = 0;
        if (size == 1) {
            return li1.b((Pair) arrayList.get(0));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(li1.a(arrayList.size()));
        int size2 = arrayList.size();
        while (i < size2) {
            Object obj = arrayList.get(i);
            i++;
            Pair pair = (Pair) obj;
            linkedHashMap.put(pair.m, pair.n);
        }
        return linkedHashMap;
    }

    public static Map i(Map map) {
        map.getClass();
        int size = map.size();
        if (size == 0) {
            bh0 bh0Var = bh0.m;
            bh0Var.getClass();
            return bh0Var;
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
