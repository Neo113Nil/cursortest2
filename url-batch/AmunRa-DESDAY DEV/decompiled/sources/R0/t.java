package R0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class t extends s1.d {
    public static int n0(int i) {
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

    public static Map o0(ArrayList arrayList) {
        r rVar = r.f713a;
        int size = arrayList.size();
        if (size == 0) {
            return rVar;
        }
        if (size == 1) {
            Q0.c cVar = (Q0.c) arrayList.get(0);
            Z0.d.e(cVar, "pair");
            Map singletonMap = Collections.singletonMap(cVar.f688a, cVar.f689b);
            Z0.d.d(singletonMap, "singletonMap(...)");
            return singletonMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(n0(arrayList.size()));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Q0.c cVar2 = (Q0.c) it.next();
            linkedHashMap.put(cVar2.f688a, cVar2.f689b);
        }
        return linkedHashMap;
    }
}
