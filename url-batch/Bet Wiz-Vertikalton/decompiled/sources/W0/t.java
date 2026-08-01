package W0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class t extends x1.d {
    public static int o0(int i) {
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

    public static Map p0(ArrayList arrayList) {
        r rVar = r.f897a;
        int size = arrayList.size();
        if (size == 0) {
            return rVar;
        }
        if (size == 1) {
            V0.c cVar = (V0.c) arrayList.get(0);
            e1.d.e(cVar, "pair");
            Map singletonMap = Collections.singletonMap(cVar.f872a, cVar.f873b);
            e1.d.d(singletonMap, "singletonMap(...)");
            return singletonMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(o0(arrayList.size()));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            V0.c cVar2 = (V0.c) it.next();
            linkedHashMap.put(cVar2.f872a, cVar2.f873b);
        }
        return linkedHashMap;
    }
}
