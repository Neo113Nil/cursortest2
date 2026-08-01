package T0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class t extends u1.l {
    public static int r0(int i) {
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

    public static Map s0(ArrayList arrayList) {
        r rVar = r.f845a;
        int size = arrayList.size();
        if (size == 0) {
            return rVar;
        }
        if (size == 1) {
            S0.b bVar = (S0.b) arrayList.get(0);
            b1.d.e(bVar, "pair");
            Map singletonMap = Collections.singletonMap(bVar.f768a, bVar.f769b);
            b1.d.d(singletonMap, "singletonMap(...)");
            return singletonMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(r0(arrayList.size()));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            S0.b bVar2 = (S0.b) it.next();
            linkedHashMap.put(bVar2.f768a, bVar2.f769b);
        }
        return linkedHashMap;
    }
}
