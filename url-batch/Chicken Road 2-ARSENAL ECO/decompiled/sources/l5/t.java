package l5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import k5.C0477g;
import u0.AbstractC0676f;

/* loaded from: classes.dex */
public abstract class t extends A3.c {
    public static Object o0(Map map, Object obj) {
        kotlin.jvm.internal.i.e(map, "<this>");
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    public static int p0(int i7) {
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

    public static Map q0(C0477g pair) {
        kotlin.jvm.internal.i.e(pair, "pair");
        Map singletonMap = Collections.singletonMap(pair.f5198f, pair.f5199g);
        kotlin.jvm.internal.i.d(singletonMap, "singletonMap(...)");
        return singletonMap;
    }

    public static final void r0(LinkedHashMap linkedHashMap, C0477g[] c0477gArr) {
        for (C0477g c0477g : c0477gArr) {
            linkedHashMap.put(c0477g.f5198f, c0477g.f5199g);
        }
    }

    public static List s0(Map map) {
        kotlin.jvm.internal.i.e(map, "<this>");
        int size = map.size();
        C0512p c0512p = C0512p.f5303f;
        if (size == 0) {
            return c0512p;
        }
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return c0512p;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (!it.hasNext()) {
            return AbstractC0676f.n(new C0477g(entry.getKey(), entry.getValue()));
        }
        ArrayList arrayList = new ArrayList(map.size());
        arrayList.add(new C0477g(entry.getKey(), entry.getValue()));
        do {
            Map.Entry entry2 = (Map.Entry) it.next();
            arrayList.add(new C0477g(entry2.getKey(), entry2.getValue()));
        } while (it.hasNext());
        return arrayList;
    }

    public static Map t0(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return q.f5304f;
        }
        if (size == 1) {
            return q0((C0477g) arrayList.get(0));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(p0(arrayList.size()));
        int size2 = arrayList.size();
        int i7 = 0;
        while (i7 < size2) {
            Object obj = arrayList.get(i7);
            i7++;
            C0477g c0477g = (C0477g) obj;
            linkedHashMap.put(c0477g.f5198f, c0477g.f5199g);
        }
        return linkedHashMap;
    }

    public static Map u0(Map map) {
        kotlin.jvm.internal.i.e(map, "<this>");
        int size = map.size();
        if (size == 0) {
            return q.f5304f;
        }
        if (size != 1) {
            return v0(map);
        }
        kotlin.jvm.internal.i.e(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        kotlin.jvm.internal.i.d(singletonMap, "with(...)");
        return singletonMap;
    }

    public static LinkedHashMap v0(Map map) {
        kotlin.jvm.internal.i.e(map, "<this>");
        return new LinkedHashMap(map);
    }
}
