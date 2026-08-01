package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f693a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f694b;

    public a(HashMap hashMap) {
        this.f694b = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            l lVar = (l) entry.getValue();
            List list = (List) this.f693a.get(lVar);
            if (list == null) {
                list = new ArrayList();
                this.f693a.put(lVar, list);
            }
            list.add((b) entry.getKey());
        }
    }

    public static void a(List list, r rVar, l lVar, q qVar) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                b bVar = (b) list.get(size);
                Method method = bVar.f696b;
                try {
                    int i = bVar.f695a;
                    if (i == 0) {
                        method.invoke(qVar, null);
                    } else if (i == 1) {
                        method.invoke(qVar, rVar);
                    } else if (i == 2) {
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
