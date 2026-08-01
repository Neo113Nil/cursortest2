package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class ra {
    public final HashMap a = new HashMap();
    public final HashMap b;

    public ra(HashMap hashMap) {
        this.b = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            gq gqVar = (gq) entry.getValue();
            List list = (List) this.a.get(gqVar);
            if (list == null) {
                list = new ArrayList();
                this.a.put(gqVar, list);
            }
            list.add((sa) entry.getKey());
        }
    }

    public static void a(List list, nq nqVar, gq gqVar, mq mqVar) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                sa saVar = (sa) list.get(size);
                Method method = saVar.b;
                try {
                    int i = saVar.a;
                    if (i == 0) {
                        method.invoke(mqVar, null);
                    } else if (i == 1) {
                        method.invoke(mqVar, nqVar);
                    } else if (i == 2) {
                        method.invoke(mqVar, nqVar, gqVar);
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
