package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public abstract class bs extends vw {
    public static int s0(int i) {
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

    public static Map t0(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return wh.f;
        }
        int i = 0;
        if (size == 1) {
            cx cxVar = (cx) arrayList.get(0);
            cxVar.getClass();
            Map singletonMap = Collections.singletonMap(cxVar.f, cxVar.g);
            singletonMap.getClass();
            return singletonMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(s0(arrayList.size()));
        int size2 = arrayList.size();
        while (i < size2) {
            Object obj = arrayList.get(i);
            i++;
            cx cxVar2 = (cx) obj;
            linkedHashMap.put(cxVar2.f, cxVar2.g);
        }
        return linkedHashMap;
    }
}
