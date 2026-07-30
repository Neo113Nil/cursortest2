package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f947a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f948b;

    public b(HashMap hashMap) {
        this.f948b = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            n nVar = (n) entry.getValue();
            List list = (List) this.f947a.get(nVar);
            if (list == null) {
                list = new ArrayList();
                this.f947a.put(nVar, list);
            }
            list.add((c) entry.getKey());
        }
    }

    public static void a(List list, v vVar, n nVar, Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                c cVar = (c) list.get(size);
                Method method = cVar.f951b;
                try {
                    int i7 = cVar.f950a;
                    if (i7 == 0) {
                        method.invoke(obj, null);
                    } else if (i7 == 1) {
                        method.invoke(obj, vVar);
                    } else if (i7 == 2) {
                        method.invoke(obj, vVar, nVar);
                    }
                } catch (IllegalAccessException e9) {
                    throw new RuntimeException(e9);
                } catch (InvocationTargetException e10) {
                    throw new RuntimeException("Failed to call observer method", e10.getCause());
                }
            }
        }
    }
}
