package a3;

import a.y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public abstract class p extends y {
    public static Map W(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return n.f114f;
        }
        if (size == 1) {
            z2.a aVar = (z2.a) arrayList.get(0);
            f3.d.e(aVar, "pair");
            Map singletonMap = Collections.singletonMap(aVar.f3879f, aVar.f3880g);
            f3.d.d(singletonMap, "singletonMap(...)");
            return singletonMap;
        }
        int size2 = arrayList.size();
        if (size2 >= 0) {
            size2 = size2 < 3 ? size2 + 1 : size2 < 1073741824 ? (int) ((size2 / 0.75f) + 1.0f) : Integer.MAX_VALUE;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(size2);
        int size3 = arrayList.size();
        int i = 0;
        while (i < size3) {
            Object obj = arrayList.get(i);
            i++;
            z2.a aVar2 = (z2.a) obj;
            linkedHashMap.put(aVar2.f3879f, aVar2.f3880g);
        }
        return linkedHashMap;
    }
}
