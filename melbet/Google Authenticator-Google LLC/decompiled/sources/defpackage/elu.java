package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class elu {
    public abstract jll a(String str, Object obj);

    public abstract jll b(jll jllVar, jll jllVar2);

    public abstract String c(jll jllVar);

    public final List e(Map map) {
        jll a;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue() != null && (a = a((String) entry.getKey(), entry.getValue())) != null) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    final List f(List list, List list2) {
        jll jllVar;
        if (list.isEmpty()) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jll jllVar2 = (jll) it.next();
            String c = c(jllVar2);
            Iterator it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    jllVar = null;
                    break;
                }
                jllVar = (jll) it2.next();
                if (c.equals(c(jllVar))) {
                    break;
                }
            }
            jll b = b(jllVar2, jllVar);
            if (b != null) {
                arrayList.add(b);
            }
        }
        return arrayList;
    }
}
