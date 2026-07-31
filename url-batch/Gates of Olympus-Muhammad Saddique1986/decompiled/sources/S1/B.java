package S1;

import a.AbstractC0235a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class B extends AbstractC0235a {
    public static Object I(Object obj, Map map) {
        f2.j.f(map, "<this>");
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    public static int J(int i3) {
        if (i3 < 0) {
            return i3;
        }
        if (i3 < 3) {
            return i3 + 1;
        }
        if (i3 < 1073741824) {
            return (int) ((i3 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static final void K(HashMap hashMap, R1.i[] iVarArr) {
        for (R1.i iVar : iVarArr) {
            hashMap.put(iVar.f4150d, iVar.f4151e);
        }
    }

    public static Map L(ArrayList arrayList) {
        v vVar = v.f4321d;
        int size = arrayList.size();
        if (size == 0) {
            return vVar;
        }
        if (size == 1) {
            R1.i iVar = (R1.i) arrayList.get(0);
            f2.j.f(iVar, "pair");
            Map singletonMap = Collections.singletonMap(iVar.f4150d, iVar.f4151e);
            f2.j.e(singletonMap, "singletonMap(...)");
            return singletonMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(J(arrayList.size()));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            R1.i iVar2 = (R1.i) it.next();
            linkedHashMap.put(iVar2.f4150d, iVar2.f4151e);
        }
        return linkedHashMap;
    }

    public static Map M(Map map) {
        f2.j.f(map, "<this>");
        int size = map.size();
        if (size == 0) {
            return v.f4321d;
        }
        if (size != 1) {
            return N(map);
        }
        f2.j.f(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        f2.j.e(singletonMap, "with(...)");
        return singletonMap;
    }

    public static LinkedHashMap N(Map map) {
        f2.j.f(map, "<this>");
        return new LinkedHashMap(map);
    }
}
