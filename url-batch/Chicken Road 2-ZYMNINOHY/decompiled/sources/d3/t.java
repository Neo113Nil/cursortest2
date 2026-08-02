package d3;

import a.AbstractC0124a;
import c3.C0292d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class t extends u {
    public static HashMap B(C0292d... c0292dArr) {
        HashMap hashMap = new HashMap(u.z(c0292dArr.length));
        D(hashMap, c0292dArr);
        return hashMap;
    }

    public static Map C(C0292d... c0292dArr) {
        if (c0292dArr.length <= 0) {
            return r.f8334a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(u.z(c0292dArr.length));
        D(linkedHashMap, c0292dArr);
        return linkedHashMap;
    }

    public static final void D(HashMap hashMap, C0292d[] c0292dArr) {
        for (C0292d c0292d : c0292dArr) {
            hashMap.put(c0292d.f5724a, c0292d.f5725b);
        }
    }

    public static List E(Map map) {
        if (map.size() != 0) {
            Iterator it = map.entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (!it.hasNext()) {
                    return AbstractC0124a.H(new C0292d(entry.getKey(), entry.getValue()));
                }
                ArrayList arrayList = new ArrayList(map.size());
                arrayList.add(new C0292d(entry.getKey(), entry.getValue()));
                do {
                    Map.Entry entry2 = (Map.Entry) it.next();
                    arrayList.add(new C0292d(entry2.getKey(), entry2.getValue()));
                } while (it.hasNext());
                return arrayList;
            }
        }
        return q.f8333a;
    }

    public static Map F(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return r.f8334a;
        }
        if (size == 1) {
            return u.A((C0292d) arrayList.get(0));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(u.z(arrayList.size()));
        int size2 = arrayList.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj = arrayList.get(i4);
            i4++;
            C0292d c0292d = (C0292d) obj;
            linkedHashMap.put(c0292d.f5724a, c0292d.f5725b);
        }
        return linkedHashMap;
    }

    public static Map G(Map map) {
        kotlin.jvm.internal.i.e(map, "<this>");
        int size = map.size();
        if (size == 0) {
            return r.f8334a;
        }
        if (size != 1) {
            return H(map);
        }
        kotlin.jvm.internal.i.e(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        kotlin.jvm.internal.i.d(singletonMap, "with(...)");
        return singletonMap;
    }

    public static LinkedHashMap H(Map map) {
        kotlin.jvm.internal.i.e(map, "<this>");
        return new LinkedHashMap(map);
    }
}
