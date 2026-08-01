package O0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class t extends q1.l {
    public static int u0(int i) {
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

    public static Map v0(ArrayList arrayList) {
        r rVar = r.f696a;
        int size = arrayList.size();
        if (size == 0) {
            return rVar;
        }
        if (size == 1) {
            N0.d dVar = (N0.d) arrayList.get(0);
            X0.f.e(dVar, "pair");
            Map singletonMap = Collections.singletonMap(dVar.f671a, dVar.f672b);
            X0.f.d(singletonMap, "singletonMap(...)");
            return singletonMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(u0(arrayList.size()));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            N0.d dVar2 = (N0.d) it.next();
            linkedHashMap.put(dVar2.f671a, dVar2.f672b);
        }
        return linkedHashMap;
    }

    public static final Map w0(LinkedHashMap linkedHashMap) {
        X0.f.e(linkedHashMap, "<this>");
        Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
        Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        X0.f.d(singletonMap, "with(...)");
        return singletonMap;
    }
}
