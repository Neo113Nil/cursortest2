package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class w41 extends th0 {
    public static Object POWyO8hTM6YC(Object obj, Map map) {
        map.getClass();
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    public static int i68hK7ahKtgp(int i) {
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

    public static Map wLFCmsViZrNT(Map map) {
        map.getClass();
        int size = map.size();
        if (size == 0) {
            return q50.rtx2ld2ELZv4;
        }
        if (size != 1) {
            return new LinkedHashMap(map);
        }
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        singletonMap.getClass();
        return singletonMap;
    }

    public static Map zf8DYfih6EZu(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return q50.rtx2ld2ELZv4;
        }
        int i = 0;
        if (size == 1) {
            vi1 vi1Var = (vi1) arrayList.get(0);
            vi1Var.getClass();
            Map singletonMap = Collections.singletonMap(vi1Var.rtx2ld2ELZv4, vi1Var.OPXfSBeufaJ8);
            singletonMap.getClass();
            return singletonMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(i68hK7ahKtgp(arrayList.size()));
        int size2 = arrayList.size();
        while (i < size2) {
            Object obj = arrayList.get(i);
            i++;
            vi1 vi1Var2 = (vi1) obj;
            linkedHashMap.put(vi1Var2.rtx2ld2ELZv4, vi1Var2.OPXfSBeufaJ8);
        }
        return linkedHashMap;
    }
}
