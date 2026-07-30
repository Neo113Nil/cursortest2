package e6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class c0 extends d0 {
    public static Object i0(Object obj, Map map) {
        r6.k.f(map, "<this>");
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    public static final void j0(HashMap hashMap, d6.j[] jVarArr) {
        for (d6.j jVar : jVarArr) {
            hashMap.put(jVar.f2618f, jVar.f2619g);
        }
    }

    public static List k0(Map map) {
        r6.k.f(map, "<this>");
        int size = map.size();
        u uVar = u.f2826f;
        if (size == 0) {
            return uVar;
        }
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return uVar;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (!it.hasNext()) {
            return t6.a.F(new d6.j(entry.getKey(), entry.getValue()));
        }
        ArrayList arrayList = new ArrayList(map.size());
        arrayList.add(new d6.j(entry.getKey(), entry.getValue()));
        do {
            Map.Entry entry2 = (Map.Entry) it.next();
            arrayList.add(new d6.j(entry2.getKey(), entry2.getValue()));
        } while (it.hasNext());
        return arrayList;
    }

    public static Map l0(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return v.f2827f;
        }
        if (size == 1) {
            d6.j jVar = (d6.j) arrayList.get(0);
            r6.k.f(jVar, "pair");
            Map singletonMap = Collections.singletonMap(jVar.f2618f, jVar.f2619g);
            r6.k.e(singletonMap, "singletonMap(...)");
            return singletonMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d0.h0(arrayList.size()));
        int size2 = arrayList.size();
        int i7 = 0;
        while (i7 < size2) {
            Object obj = arrayList.get(i7);
            i7++;
            d6.j jVar2 = (d6.j) obj;
            linkedHashMap.put(jVar2.f2618f, jVar2.f2619g);
        }
        return linkedHashMap;
    }

    public static Map m0(Map map) {
        r6.k.f(map, "<this>");
        int size = map.size();
        if (size == 0) {
            return v.f2827f;
        }
        if (size != 1) {
            return n0(map);
        }
        r6.k.f(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        r6.k.e(singletonMap, "with(...)");
        return singletonMap;
    }

    public static LinkedHashMap n0(Map map) {
        r6.k.f(map, "<this>");
        return new LinkedHashMap(map);
    }
}
