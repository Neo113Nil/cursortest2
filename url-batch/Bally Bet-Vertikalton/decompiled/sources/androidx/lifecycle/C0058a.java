package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0058a {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f1351a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f1352b;

    public C0058a(HashMap hashMap) {
        this.f1352b = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            EnumC0069l enumC0069l = (EnumC0069l) entry.getValue();
            List list = (List) this.f1351a.get(enumC0069l);
            if (list == null) {
                list = new ArrayList();
                this.f1351a.put(enumC0069l, list);
            }
            list.add((C0059b) entry.getKey());
        }
    }

    public static void a(List list, r rVar, EnumC0069l enumC0069l, q qVar) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C0059b c0059b = (C0059b) list.get(size);
                c0059b.getClass();
                try {
                    int i = c0059b.f1353a;
                    Method method = c0059b.f1354b;
                    if (i == 0) {
                        method.invoke(qVar, null);
                    } else if (i == 1) {
                        method.invoke(qVar, rVar);
                    } else if (i == 2) {
                        method.invoke(qVar, rVar, enumC0069l);
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
