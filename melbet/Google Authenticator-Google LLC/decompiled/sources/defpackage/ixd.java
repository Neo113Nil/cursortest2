package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ixd {
    public static int b(int i) {
        return Integer.highestOneBit(ksl.f(i, 1) * 3);
    }

    public static int c(Object[] objArr, int i, int i2) {
        int i3 = 1;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i + i4];
            i3 = (i3 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i3;
    }

    public static String d(Object[] objArr, int i, int i2, Collection collection) {
        StringBuilder sb = new StringBuilder((i2 * 3) + 2);
        sb.append("[");
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i + i3];
            if (obj == collection) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static void e(Object[] objArr, int i) {
        objArr.getClass();
        objArr[i] = null;
    }

    public static void f(Object[] objArr, int i, int i2) {
        objArr.getClass();
        while (i < i2) {
            e(objArr, i);
            i++;
        }
    }

    public static boolean g(Object[] objArr, int i, int i2, List list) {
        if (i2 != list.size()) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (!ksp.b(objArr[i + i3], list.get(i3))) {
                return false;
            }
        }
        return true;
    }

    public static Object[] h(int i) {
        if (i >= 0) {
            return new Object[i];
        }
        throw new IllegalArgumentException("capacity must be non-negative.");
    }

    public static Object[] i(Object[] objArr, int i) {
        objArr.getClass();
        Object[] copyOf = Arrays.copyOf(objArr, i);
        copyOf.getClass();
        return copyOf;
    }

    public static Set j(Set set) {
        ((kqd) set).b.e();
        return ((kpg) set).a() > 0 ? set : kqd.a;
    }

    public static Set k(Object obj) {
        Set singleton = Collections.singleton(obj);
        singleton.getClass();
        return singleton;
    }

    public static Set l(Set set, Iterable iterable) {
        int i;
        set.getClass();
        iterable.getClass();
        Integer valueOf = iterable instanceof Collection ? Integer.valueOf(((Collection) iterable).size()) : null;
        if (valueOf != null) {
            i = set.size() + valueOf.intValue();
        } else {
            int size = set.size();
            i = size + size;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(m(i));
        linkedHashSet.addAll(set);
        ixc.v(linkedHashSet, iterable);
        return linkedHashSet;
    }

    public static int m(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i >= 1073741824) {
            return Integer.MAX_VALUE;
        }
        return (int) ((i / 0.75f) + 1.0f);
    }

    public static Map n(kol kolVar) {
        kolVar.getClass();
        Map singletonMap = Collections.singletonMap(kolVar.a, kolVar.b);
        singletonMap.getClass();
        return singletonMap;
    }

    public static Map o(Map map) {
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        singletonMap.getClass();
        return singletonMap;
    }

    public static Object p(Map map, Object obj) {
        map.getClass();
        if (map instanceof kpp) {
            return ((kpp) map).a();
        }
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException(a.ab(obj, "Key ", " is missing in the map."));
    }

    public static Map q(Map map, Map map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static Map r(Map map, kol kolVar) {
        if (map.isEmpty()) {
            return n(kolVar);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(kolVar.a, kolVar.b);
        return linkedHashMap;
    }

    public static Map s(Iterable iterable) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            u(linkedHashMap, iterable);
            int size = linkedHashMap.size();
            return size != 0 ? size != 1 ? linkedHashMap : o(linkedHashMap) : kpl.a;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return kpl.a;
        }
        if (size2 == 1) {
            return n((kol) (iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next()));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(m(collection.size()));
        u(linkedHashMap2, iterable);
        return linkedHashMap2;
    }

    public static Map t(Map map) {
        int size = map.size();
        return size != 0 ? size != 1 ? new LinkedHashMap(map) : o(map) : kpl.a;
    }

    public static void u(Map map, Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            kol kolVar = (kol) it.next();
            map.put(kolVar.a, kolVar.b);
        }
    }

    public kbq a(kao kaoVar) {
        throw null;
    }
}
