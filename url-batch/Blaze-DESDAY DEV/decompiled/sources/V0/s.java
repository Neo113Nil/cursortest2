package V0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class s extends z1.l {
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
        q qVar = q.f918a;
        int size = arrayList.size();
        if (size == 0) {
            return qVar;
        }
        if (size == 1) {
            U0.c cVar = (U0.c) arrayList.get(0);
            g1.d.e(cVar, "pair");
            Map singletonMap = Collections.singletonMap(cVar.f897a, cVar.f898b);
            g1.d.d(singletonMap, "singletonMap(...)");
            return singletonMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d0(arrayList.size()));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            U0.c cVar2 = (U0.c) it.next();
            linkedHashMap.put(cVar2.f897a, cVar2.f898b);
        }
        return linkedHashMap;
    }
}
