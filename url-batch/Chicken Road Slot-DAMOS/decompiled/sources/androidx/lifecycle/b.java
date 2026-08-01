package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f663a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f664b;

    public b(HashMap hashMap) {
        this.f664b = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            o oVar = (o) entry.getValue();
            List list = (List) this.f663a.get(oVar);
            if (list == null) {
                list = new ArrayList();
                this.f663a.put(oVar, list);
            }
            list.add((c) entry.getKey());
        }
    }

    public static void a(List list, u uVar, o oVar, Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                c cVar = (c) list.get(size);
                Method method = cVar.f674b;
                try {
                    int i3 = cVar.f673a;
                    if (i3 == 0) {
                        method.invoke(obj, null);
                    } else if (i3 == 1) {
                        method.invoke(obj, uVar);
                    } else if (i3 == 2) {
                        method.invoke(obj, uVar, oVar);
                    }
                } catch (IllegalAccessException e2) {
                    throw new RuntimeException(e2);
                } catch (InvocationTargetException e9) {
                    throw new RuntimeException("Failed to call observer method", e9.getCause());
                }
            }
        }
    }
}
