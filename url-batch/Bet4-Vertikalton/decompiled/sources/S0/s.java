package S0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class s extends w1.l {
    public static int b0(int i) {
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

    public static Map c0(ArrayList arrayList) {
        q qVar = q.f796a;
        int size = arrayList.size();
        if (size == 0) {
            return qVar;
        }
        if (size == 1) {
            R0.c cVar = (R0.c) arrayList.get(0);
            d1.d.e(cVar, "pair");
            Map singletonMap = Collections.singletonMap(cVar.f773a, cVar.f774b);
            d1.d.d(singletonMap, "singletonMap(...)");
            return singletonMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(b0(arrayList.size()));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            R0.c cVar2 = (R0.c) it.next();
            linkedHashMap.put(cVar2.f773a, cVar2.f774b);
        }
        return linkedHashMap;
    }
}
