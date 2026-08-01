package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0061a {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f1499a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f1500b;

    public C0061a(HashMap hashMap) {
        this.f1500b = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            EnumC0072l enumC0072l = (EnumC0072l) entry.getValue();
            List list = (List) this.f1499a.get(enumC0072l);
            if (list == null) {
                list = new ArrayList();
                this.f1499a.put(enumC0072l, list);
            }
            list.add((C0062b) entry.getKey());
        }
    }

    public static void a(List list, r rVar, EnumC0072l enumC0072l, q qVar) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C0062b c0062b = (C0062b) list.get(size);
                c0062b.getClass();
                try {
                    int i = c0062b.f1501a;
                    Method method = c0062b.f1502b;
                    if (i == 0) {
                        method.invoke(qVar, null);
                    } else if (i == 1) {
                        method.invoke(qVar, rVar);
                    } else if (i == 2) {
                        method.invoke(qVar, rVar, enumC0072l);
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
