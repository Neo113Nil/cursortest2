package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class ec {
    public final HashMap a = new HashMap();
    public final HashMap b;

    public ec(HashMap hashMap) {
        this.b = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            fx fxVar = (fx) entry.getValue();
            List list = (List) this.a.get(fxVar);
            if (list == null) {
                list = new ArrayList();
                this.a.put(fxVar, list);
            }
            list.add((fc) entry.getKey());
        }
    }

    public static void a(List list, lx lxVar, fx fxVar, kx kxVar) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                fc fcVar = (fc) list.get(size);
                Method method = fcVar.b;
                try {
                    int i = fcVar.a;
                    if (i == 0) {
                        method.invoke(kxVar, null);
                    } else if (i == 1) {
                        method.invoke(kxVar, lxVar);
                    } else if (i == 2) {
                        method.invoke(kxVar, lxVar, fxVar);
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
