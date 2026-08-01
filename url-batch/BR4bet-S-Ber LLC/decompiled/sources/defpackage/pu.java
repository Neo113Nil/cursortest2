package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public abstract class pu extends la0 {
    public static final int p0(int i) {
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

    public static Map q0(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return jk.f;
        }
        int i = 0;
        if (size == 1) {
            tz tzVar = (tz) arrayList.get(0);
            tzVar.getClass();
            Map singletonMap = Collections.singletonMap(tzVar.f, tzVar.g);
            singletonMap.getClass();
            return singletonMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(p0(arrayList.size()));
        int size2 = arrayList.size();
        while (i < size2) {
            Object obj = arrayList.get(i);
            i++;
            tz tzVar2 = (tz) obj;
            linkedHashMap.put(tzVar2.f, tzVar2.g);
        }
        return linkedHashMap;
    }
}
