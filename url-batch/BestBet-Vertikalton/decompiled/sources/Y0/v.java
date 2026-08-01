package Y0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class v extends H1.l {
    public static int i0(int i) {
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

    public static Map j0(ArrayList arrayList) {
        t tVar = t.f1517a;
        int size = arrayList.size();
        if (size == 0) {
            return tVar;
        }
        if (size == 1) {
            X0.c cVar = (X0.c) arrayList.get(0);
            k1.e.e(cVar, "pair");
            Map singletonMap = Collections.singletonMap(cVar.f1270a, cVar.f1271b);
            k1.e.d(singletonMap, "singletonMap(...)");
            return singletonMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(i0(arrayList.size()));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            X0.c cVar2 = (X0.c) it.next();
            linkedHashMap.put(cVar2.f1270a, cVar2.f1271b);
        }
        return linkedHashMap;
    }
}
