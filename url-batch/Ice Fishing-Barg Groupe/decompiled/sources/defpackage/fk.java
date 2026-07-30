package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class fk {
    public final HashMap PxuCJdSBwIXG = new HashMap();
    public final HashMap lS5Rgt96tfkO;

    public fk(HashMap hashMap) {
        this.lS5Rgt96tfkO = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            e01 e01Var = (e01) entry.getValue();
            List list = (List) this.PxuCJdSBwIXG.get(e01Var);
            if (list == null) {
                list = new ArrayList();
                this.PxuCJdSBwIXG.put(e01Var, list);
            }
            list.add((gk) entry.getKey());
        }
    }

    public static void PxuCJdSBwIXG(List list, o01 o01Var, e01 e01Var, Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                gk gkVar = (gk) list.get(size);
                Method method = gkVar.lS5Rgt96tfkO;
                try {
                    int i = gkVar.PxuCJdSBwIXG;
                    if (i == 0) {
                        method.invoke(obj, null);
                    } else if (i == 1) {
                        method.invoke(obj, o01Var);
                    } else if (i == 2) {
                        method.invoke(obj, o01Var, e01Var);
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
