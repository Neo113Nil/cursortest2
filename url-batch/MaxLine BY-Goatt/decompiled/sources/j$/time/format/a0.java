package j$.time.format;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes2.dex */
public final class a0 {
    public final Map a;
    public final Map b;

    public a0(Map map) {
        this.a = map;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            HashMap hashMap2 = new HashMap();
            for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                String str = (String) entry2.getValue();
                String str2 = (String) entry2.getValue();
                Long l = (Long) entry2.getKey();
                ConcurrentMap concurrentMap = b0.a;
                hashMap2.put(str, new AbstractMap.SimpleImmutableEntry(str2, l));
            }
            ArrayList arrayList2 = new ArrayList(hashMap2.values());
            Collections.sort(arrayList2, b0.b);
            hashMap.put((g0) entry.getKey(), arrayList2);
            arrayList.addAll(arrayList2);
            hashMap.put(null, arrayList);
        }
        Collections.sort(arrayList, b0.b);
        this.b = hashMap;
    }

    public final String a(long j, g0 g0Var) {
        Map map = (Map) this.a.get(g0Var);
        if (map != null) {
            return (String) map.get(Long.valueOf(j));
        }
        return null;
    }
}
