package c2;

import a.AbstractC0129a;
import b2.C0190d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class p extends q {
    public static HashMap b0(C0190d... c0190dArr) {
        HashMap hashMap = new HashMap(q.Z(c0190dArr.length));
        d0(hashMap, c0190dArr);
        return hashMap;
    }

    public static Map c0(C0190d... c0190dArr) {
        if (c0190dArr.length <= 0) {
            return n.f2638a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(q.Z(c0190dArr.length));
        d0(linkedHashMap, c0190dArr);
        return linkedHashMap;
    }

    public static final void d0(HashMap hashMap, C0190d[] c0190dArr) {
        for (C0190d c0190d : c0190dArr) {
            hashMap.put(c0190d.f2547a, c0190d.f2548b);
        }
    }

    public static List e0(Map map) {
        int size = map.size();
        m mVar = m.f2637a;
        if (size != 0) {
            Iterator it = map.entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (!it.hasNext()) {
                    return AbstractC0129a.r(new C0190d(entry.getKey(), entry.getValue()));
                }
                ArrayList arrayList = new ArrayList(map.size());
                arrayList.add(new C0190d(entry.getKey(), entry.getValue()));
                do {
                    Map.Entry entry2 = (Map.Entry) it.next();
                    arrayList.add(new C0190d(entry2.getKey(), entry2.getValue()));
                } while (it.hasNext());
                return arrayList;
            }
        }
        return mVar;
    }

    public static Map f0(ArrayList arrayList) {
        n nVar = n.f2638a;
        int size = arrayList.size();
        if (size == 0) {
            return nVar;
        }
        if (size == 1) {
            return q.a0((C0190d) arrayList.get(0));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(q.Z(arrayList.size()));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0190d c0190d = (C0190d) it.next();
            linkedHashMap.put(c0190d.f2547a, c0190d.f2548b);
        }
        return linkedHashMap;
    }

    public static LinkedHashMap g0(Map map) {
        kotlin.jvm.internal.j.e(map, "<this>");
        return new LinkedHashMap(map);
    }
}
