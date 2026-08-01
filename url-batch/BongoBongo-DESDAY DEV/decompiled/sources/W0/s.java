package W0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class s extends A1.m {
    public static int q0(int i) {
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

    public static Map r0(ArrayList arrayList) {
        q qVar = q.f960a;
        int size = arrayList.size();
        if (size == 0) {
            return qVar;
        }
        if (size == 1) {
            V0.b bVar = (V0.b) arrayList.get(0);
            h1.d.e(bVar, "pair");
            Map singletonMap = Collections.singletonMap(bVar.f939a, bVar.f940b);
            h1.d.d(singletonMap, "singletonMap(...)");
            return singletonMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(q0(arrayList.size()));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            V0.b bVar2 = (V0.b) it.next();
            linkedHashMap.put(bVar2.f939a, bVar2.f940b);
        }
        return linkedHashMap;
    }
}
