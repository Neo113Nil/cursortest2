package g4;

import a.AbstractC0169a;
import f4.C0430g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: g4.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0476u extends AbstractC0169a {
    public static Object U(Map map, Object obj) {
        kotlin.jvm.internal.i.e(map, "<this>");
        if (map instanceof InterfaceC0475t) {
            return ((InterfaceC0475t) map).b();
        }
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    public static HashMap V(C0430g... c0430gArr) {
        HashMap hashMap = new HashMap(W(c0430gArr.length));
        a0(hashMap, c0430gArr);
        return hashMap;
    }

    public static int W(int i2) {
        if (i2 < 0) {
            return i2;
        }
        if (i2 < 3) {
            return i2 + 1;
        }
        if (i2 < 1073741824) {
            return (int) ((i2 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Map X(C0430g pair) {
        kotlin.jvm.internal.i.e(pair, "pair");
        Map singletonMap = Collections.singletonMap(pair.f5668a, pair.f5669b);
        kotlin.jvm.internal.i.d(singletonMap, "singletonMap(...)");
        return singletonMap;
    }

    public static Map Y(C0430g... c0430gArr) {
        if (c0430gArr.length <= 0) {
            return C0472q.f5751a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(W(c0430gArr.length));
        a0(linkedHashMap, c0430gArr);
        return linkedHashMap;
    }

    public static Map Z(Map map, C0430g c0430g) {
        kotlin.jvm.internal.i.e(map, "<this>");
        if (map.isEmpty()) {
            return X(c0430g);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(c0430g.f5668a, c0430g.f5669b);
        return linkedHashMap;
    }

    public static final void a0(HashMap hashMap, C0430g[] c0430gArr) {
        for (C0430g c0430g : c0430gArr) {
            hashMap.put(c0430g.f5668a, c0430g.f5669b);
        }
    }

    public static List b0(Map map) {
        kotlin.jvm.internal.i.e(map, "<this>");
        int size = map.size();
        C0471p c0471p = C0471p.f5750a;
        if (size == 0) {
            return c0471p;
        }
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return c0471p;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (!it.hasNext()) {
            return K1.b.W(new C0430g(entry.getKey(), entry.getValue()));
        }
        ArrayList arrayList = new ArrayList(map.size());
        arrayList.add(new C0430g(entry.getKey(), entry.getValue()));
        do {
            Map.Entry entry2 = (Map.Entry) it.next();
            arrayList.add(new C0430g(entry2.getKey(), entry2.getValue()));
        } while (it.hasNext());
        return arrayList;
    }

    public static Map c0(ArrayList arrayList) {
        C0472q c0472q = C0472q.f5751a;
        int size = arrayList.size();
        if (size == 0) {
            return c0472q;
        }
        if (size == 1) {
            return X((C0430g) arrayList.get(0));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(W(arrayList.size()));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0430g c0430g = (C0430g) it.next();
            linkedHashMap.put(c0430g.f5668a, c0430g.f5669b);
        }
        return linkedHashMap;
    }

    public static Map d0(Map map) {
        kotlin.jvm.internal.i.e(map, "<this>");
        int size = map.size();
        if (size == 0) {
            return C0472q.f5751a;
        }
        if (size != 1) {
            return e0(map);
        }
        kotlin.jvm.internal.i.e(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        kotlin.jvm.internal.i.d(singletonMap, "with(...)");
        return singletonMap;
    }

    public static LinkedHashMap e0(Map map) {
        kotlin.jvm.internal.i.e(map, "<this>");
        return new LinkedHashMap(map);
    }
}
