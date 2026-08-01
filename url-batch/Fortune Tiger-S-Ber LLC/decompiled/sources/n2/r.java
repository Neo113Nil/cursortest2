package n2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public abstract class r extends l0.g {
    public static int B(int i4) {
        if (i4 < 0) {
            return i4;
        }
        if (i4 < 3) {
            return i4 + 1;
        }
        if (i4 < 1073741824) {
            return (int) ((i4 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Map C(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return p.f2954f;
        }
        if (size == 1) {
            m2.a aVar = (m2.a) arrayList.get(0);
            u2.c.e(aVar, "pair");
            Map singletonMap = Collections.singletonMap(aVar.f2914f, aVar.g);
            u2.c.d(singletonMap, "singletonMap(...)");
            return singletonMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(B(arrayList.size()));
        int size2 = arrayList.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj = arrayList.get(i4);
            i4++;
            m2.a aVar2 = (m2.a) obj;
            linkedHashMap.put(aVar2.f2914f, aVar2.g);
        }
        return linkedHashMap;
    }
}
