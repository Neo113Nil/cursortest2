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
        r rVar = r.f695a;
        int size = arrayList.size();
        if (size == 0) {
            return rVar;
        }
        if (size == 1) {
            N0.c cVar = (N0.c) arrayList.get(0);
            X0.f.e(cVar, "pair");
            Map singletonMap = Collections.singletonMap(cVar.f670a, cVar.f671b);
            X0.f.d(singletonMap, "singletonMap(...)");
            return singletonMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(u0(arrayList.size()));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            N0.c cVar2 = (N0.c) it.next();
            linkedHashMap.put(cVar2.f670a, cVar2.f671b);
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
