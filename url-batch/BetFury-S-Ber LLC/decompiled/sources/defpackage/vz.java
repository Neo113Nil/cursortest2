package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public abstract class vz extends gk0 {
    public static Object Y(LinkedHashMap linkedHashMap, Object obj) {
        linkedHashMap.getClass();
        Object obj2 = linkedHashMap.get(obj);
        if (obj2 != null || linkedHashMap.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    public static int Z(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Map a0(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return xm.f;
        }
        int i = 0;
        if (size == 1) {
            k50 k50Var = (k50) arrayList.get(0);
            k50Var.getClass();
            Map singletonMap = Collections.singletonMap(k50Var.f, k50Var.g);
            singletonMap.getClass();
            return singletonMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(Z(arrayList.size()));
        int size2 = arrayList.size();
        while (i < size2) {
            Object obj = arrayList.get(i);
            i++;
            k50 k50Var2 = (k50) obj;
            linkedHashMap.put(k50Var2.f, k50Var2.g);
        }
        return linkedHashMap;
    }

    public static Map b0(LinkedHashMap linkedHashMap) {
        linkedHashMap.getClass();
        int size = linkedHashMap.size();
        if (size == 0) {
            return xm.f;
        }
        if (size != 1) {
            return new LinkedHashMap(linkedHashMap);
        }
        Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
        Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        singletonMap.getClass();
        return singletonMap;
    }
}
