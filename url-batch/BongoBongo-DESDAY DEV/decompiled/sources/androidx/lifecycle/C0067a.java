package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0067a {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f1560a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f1561b;

    public C0067a(HashMap hashMap) {
        this.f1561b = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            EnumC0078l enumC0078l = (EnumC0078l) entry.getValue();
            List list = (List) this.f1560a.get(enumC0078l);
            if (list == null) {
                list = new ArrayList();
                this.f1560a.put(enumC0078l, list);
            }
            list.add((C0068b) entry.getKey());
        }
    }

    public static void a(List list, r rVar, EnumC0078l enumC0078l, q qVar) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C0068b c0068b = (C0068b) list.get(size);
                c0068b.getClass();
                try {
                    int i = c0068b.f1562a;
                    Method method = c0068b.f1563b;
                    if (i == 0) {
                        method.invoke(qVar, null);
                    } else if (i == 1) {
                        method.invoke(qVar, rVar);
                    } else if (i == 2) {
                        method.invoke(qVar, rVar, enumC0078l);
                    }
                } catch (IllegalAccessException e2) {
                    throw new RuntimeException(e2);
                } catch (InvocationTargetException e3) {
                    throw new RuntimeException("Failed to call observer method", e3.getCause());
                }
            }
        }
    }
}
