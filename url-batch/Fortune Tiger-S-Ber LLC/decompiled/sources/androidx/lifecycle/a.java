package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f566a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f567b;

    public a(HashMap hashMap) {
        this.f567b = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            l lVar = (l) entry.getValue();
            List list = (List) this.f566a.get(lVar);
            if (list == null) {
                list = new ArrayList();
                this.f566a.put(lVar, list);
            }
            list.add((b) entry.getKey());
        }
    }

    public static void a(List list, r rVar, l lVar, q qVar) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                b bVar = (b) list.get(size);
                Method method = bVar.f569b;
                try {
                    int i4 = bVar.f568a;
                    if (i4 == 0) {
                        method.invoke(qVar, null);
                    } else if (i4 == 1) {
                        method.invoke(qVar, rVar);
                    } else if (i4 == 2) {
                        method.invoke(qVar, rVar, lVar);
                    }
                } catch (IllegalAccessException e4) {
                    throw new RuntimeException(e4);
                } catch (InvocationTargetException e5) {
                    throw new RuntimeException("Failed to call observer method", e5.getCause());
                }
            }
        }
    }
}
