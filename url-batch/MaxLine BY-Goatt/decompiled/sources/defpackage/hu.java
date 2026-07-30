package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class hu {
    public final HashMap a = new HashMap();
    public final HashMap b;

    public hu(HashMap hashMap) {
        this.b = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            yc1 yc1Var = (yc1) entry.getValue();
            List list = (List) this.a.get(yc1Var);
            if (list == null) {
                list = new ArrayList();
                this.a.put(yc1Var, list);
            }
            list.add((iu) entry.getKey());
        }
    }

    public static void a(List list, id1 id1Var, yc1 yc1Var, Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                iu iuVar = (iu) list.get(size);
                Method method = iuVar.b;
                try {
                    int i = iuVar.a;
                    if (i == 0) {
                        method.invoke(obj, null);
                    } else if (i == 1) {
                        method.invoke(obj, id1Var);
                    } else if (i == 2) {
                        method.invoke(obj, id1Var, yc1Var);
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
