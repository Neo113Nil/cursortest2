package x2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public abstract class t extends r1.b {
    public static int F(int i) {
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

    public static Map G(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return r.f3888f;
        }
        if (size == 1) {
            w2.a aVar = (w2.a) arrayList.get(0);
            i3.d.e(aVar, "pair");
            Map singletonMap = Collections.singletonMap(aVar.f3814f, aVar.f3815g);
            i3.d.d(singletonMap, "singletonMap(...)");
            return singletonMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(F(arrayList.size()));
        int size2 = arrayList.size();
        int i = 0;
        while (i < size2) {
            Object obj = arrayList.get(i);
            i++;
            w2.a aVar2 = (w2.a) obj;
            linkedHashMap.put(aVar2.f3814f, aVar2.f3815g);
        }
        return linkedHashMap;
    }
}
