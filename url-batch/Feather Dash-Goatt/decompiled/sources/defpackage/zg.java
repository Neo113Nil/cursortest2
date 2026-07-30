package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class zg {
    public final HashMap a = new HashMap();
    public final HashMap b;

    public zg(HashMap hashMap) {
        this.b = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            ng0 ng0Var = (ng0) entry.getValue();
            List list = (List) this.a.get(ng0Var);
            if (list == null) {
                list = new ArrayList();
                this.a.put(ng0Var, list);
            }
            list.add((ah) entry.getKey());
        }
    }

    public static void a(List list, vg0 vg0Var, ng0 ng0Var, Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ah ahVar = (ah) list.get(size);
                Method method = ahVar.b;
                try {
                    int i = ahVar.a;
                    if (i == 0) {
                        method.invoke(obj, null);
                    } else if (i == 1) {
                        method.invoke(obj, vg0Var);
                    } else if (i == 2) {
                        method.invoke(obj, vg0Var, ng0Var);
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
