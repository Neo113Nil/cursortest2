package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class na {
    public final HashMap a = new HashMap();
    public final HashMap b;

    public na(HashMap hashMap) {
        this.b = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            up upVar = (up) entry.getValue();
            List list = (List) this.a.get(upVar);
            if (list == null) {
                list = new ArrayList();
                this.a.put(upVar, list);
            }
            list.add((oa) entry.getKey());
        }
    }

    public static void a(List list, aq aqVar, up upVar, zp zpVar) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                oa oaVar = (oa) list.get(size);
                Method method = oaVar.b;
                try {
                    int i = oaVar.a;
                    if (i == 0) {
                        method.invoke(zpVar, null);
                    } else if (i == 1) {
                        method.invoke(zpVar, aqVar);
                    } else if (i == 2) {
                        method.invoke(zpVar, aqVar, upVar);
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
