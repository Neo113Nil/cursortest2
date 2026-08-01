package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class hb {
    public final HashMap a = new HashMap();
    public final HashMap b;

    public hb(HashMap hashMap) {
        this.b = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            gs gsVar = (gs) entry.getValue();
            List list = (List) this.a.get(gsVar);
            if (list == null) {
                list = new ArrayList();
                this.a.put(gsVar, list);
            }
            list.add((ib) entry.getKey());
        }
    }

    public static void a(List list, ms msVar, gs gsVar, ls lsVar) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ib ibVar = (ib) list.get(size);
                Method method = ibVar.b;
                try {
                    int i = ibVar.a;
                    if (i == 0) {
                        method.invoke(lsVar, null);
                    } else if (i == 1) {
                        method.invoke(lsVar, msVar);
                    } else if (i == 2) {
                        method.invoke(lsVar, msVar, gsVar);
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e2) {
                    throw new RuntimeException("Failed to call observer method", e2.getCause());
                }
            }
        }
    }
}
