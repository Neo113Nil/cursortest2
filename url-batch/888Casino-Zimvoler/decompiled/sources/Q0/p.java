package Q0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class p extends q1.l {
    public static int d0(int i) {
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

    public static Map e0(ArrayList arrayList) {
        n nVar = n.f666a;
        int size = arrayList.size();
        if (size == 0) {
            return nVar;
        }
        if (size == 1) {
            P0.b bVar = (P0.b) arrayList.get(0);
            X0.e.e(bVar, "pair");
            Map singletonMap = Collections.singletonMap(bVar.f621a, bVar.f622b);
            X0.e.d(singletonMap, "singletonMap(...)");
            return singletonMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d0(arrayList.size()));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            P0.b bVar2 = (P0.b) it.next();
            linkedHashMap.put(bVar2.f621a, bVar2.f622b);
        }
        return linkedHashMap;
    }
}
