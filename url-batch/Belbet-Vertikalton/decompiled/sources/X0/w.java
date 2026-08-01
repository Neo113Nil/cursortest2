package X0;

import a.AbstractC0058a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class w extends AbstractC0058a {
    public static int h0(int i) {
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

    public static Map i0(ArrayList arrayList) {
        u uVar = u.f1386a;
        int size = arrayList.size();
        if (size == 0) {
            return uVar;
        }
        if (size == 1) {
            W0.d dVar = (W0.d) arrayList.get(0);
            j1.h.e(dVar, "pair");
            Map singletonMap = Collections.singletonMap(dVar.f1338a, dVar.f1339b);
            j1.h.d(singletonMap, "singletonMap(...)");
            return singletonMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(h0(arrayList.size()));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            W0.d dVar2 = (W0.d) it.next();
            linkedHashMap.put(dVar2.f1338a, dVar2.f1339b);
        }
        return linkedHashMap;
    }
}
