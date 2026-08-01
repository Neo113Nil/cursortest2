package T0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class t extends u1.l {
    public static int j0(int i) {
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

    public static Map k0(ArrayList arrayList) {
        r rVar = r.f830a;
        int size = arrayList.size();
        if (size == 0) {
            return rVar;
        }
        if (size == 1) {
            S0.c cVar = (S0.c) arrayList.get(0);
            b1.d.e(cVar, "pair");
            Map singletonMap = Collections.singletonMap(cVar.f752a, cVar.f753b);
            b1.d.d(singletonMap, "singletonMap(...)");
            return singletonMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(j0(arrayList.size()));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            S0.c cVar2 = (S0.c) it.next();
            linkedHashMap.put(cVar2.f752a, cVar2.f753b);
        }
        return linkedHashMap;
    }
}
