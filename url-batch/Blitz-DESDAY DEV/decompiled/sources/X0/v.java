package X0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class v extends z1.d {
    public static int g0(int i) {
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

    public static Map h0(ArrayList arrayList) {
        t tVar = t.f993a;
        int size = arrayList.size();
        if (size == 0) {
            return tVar;
        }
        if (size == 1) {
            W0.c cVar = (W0.c) arrayList.get(0);
            g1.d.e(cVar, "pair");
            Map singletonMap = Collections.singletonMap(cVar.f950a, cVar.f951b);
            g1.d.d(singletonMap, "singletonMap(...)");
            return singletonMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(g0(arrayList.size()));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            W0.c cVar2 = (W0.c) it.next();
            linkedHashMap.put(cVar2.f950a, cVar2.f951b);
        }
        return linkedHashMap;
    }
}
