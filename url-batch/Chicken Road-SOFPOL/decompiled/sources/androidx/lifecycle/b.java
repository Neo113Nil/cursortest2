package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f808a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f809b;

    public b(HashMap hashMap) {
        this.f809b = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            o oVar = (o) entry.getValue();
            List list = (List) this.f808a.get(oVar);
            if (list == null) {
                list = new ArrayList();
                this.f808a.put(oVar, list);
            }
            list.add((c) entry.getKey());
        }
    }

    public static void a(List list, u uVar, o oVar, Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                c cVar = (c) list.get(size);
                Method method = cVar.f811b;
                try {
                    int i = cVar.f810a;
                    if (i == 0) {
                        method.invoke(obj, null);
                    } else if (i == 1) {
                        method.invoke(obj, uVar);
                    } else if (i == 2) {
                        method.invoke(obj, uVar, oVar);
                    }
                } catch (IllegalAccessException e8) {
                    throw new RuntimeException(e8);
                } catch (InvocationTargetException e9) {
                    throw new RuntimeException("Failed to call observer method", e9.getCause());
                }
            }
        }
    }
}
