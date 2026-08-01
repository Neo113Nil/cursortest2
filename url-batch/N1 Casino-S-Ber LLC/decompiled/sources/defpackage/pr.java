package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public abstract class pr extends o8 {
    public static Map F0(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return ei.f;
        }
        int i = 0;
        if (size == 1) {
            pw pwVar = (pw) arrayList.get(0);
            pwVar.getClass();
            Map singletonMap = Collections.singletonMap(pwVar.f, pwVar.g);
            singletonMap.getClass();
            return singletonMap;
        }
        int size2 = arrayList.size();
        if (size2 >= 0) {
            size2 = size2 < 3 ? size2 + 1 : size2 < 1073741824 ? (int) ((size2 / 0.75f) + 1.0f) : Integer.MAX_VALUE;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(size2);
        int size3 = arrayList.size();
        while (i < size3) {
            Object obj = arrayList.get(i);
            i++;
            pw pwVar2 = (pw) obj;
            linkedHashMap.put(pwVar2.f, pwVar2.g);
        }
        return linkedHashMap;
    }
}
