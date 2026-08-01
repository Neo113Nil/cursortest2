package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0059a {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f1384a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f1385b;

    public C0059a(HashMap hashMap) {
        this.f1385b = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            EnumC0070l enumC0070l = (EnumC0070l) entry.getValue();
            List list = (List) this.f1384a.get(enumC0070l);
            if (list == null) {
                list = new ArrayList();
                this.f1384a.put(enumC0070l, list);
            }
            list.add((C0060b) entry.getKey());
        }
    }

    public static void a(List list, r rVar, EnumC0070l enumC0070l, q qVar) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C0060b c0060b = (C0060b) list.get(size);
                c0060b.getClass();
                try {
                    int i = c0060b.f1386a;
                    Method method = c0060b.f1387b;
                    if (i == 0) {
                        method.invoke(qVar, null);
                    } else if (i == 1) {
                        method.invoke(qVar, rVar);
                    } else if (i == 2) {
                        method.invoke(qVar, rVar, enumC0070l);
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
