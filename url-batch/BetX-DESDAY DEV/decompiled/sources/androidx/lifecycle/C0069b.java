package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0069b {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f1477a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f1478b;

    public C0069b(HashMap hashMap) {
        this.f1478b = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            EnumC0080m enumC0080m = (EnumC0080m) entry.getValue();
            List list = (List) this.f1477a.get(enumC0080m);
            if (list == null) {
                list = new ArrayList();
                this.f1477a.put(enumC0080m, list);
            }
            list.add((C0070c) entry.getKey());
        }
    }

    public static void a(List list, InterfaceC0086t interfaceC0086t, EnumC0080m enumC0080m, InterfaceC0085s interfaceC0085s) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C0070c c0070c = (C0070c) list.get(size);
                c0070c.getClass();
                try {
                    int i = c0070c.f1479a;
                    Method method = c0070c.f1480b;
                    if (i == 0) {
                        method.invoke(interfaceC0085s, null);
                    } else if (i == 1) {
                        method.invoke(interfaceC0085s, interfaceC0086t);
                    } else if (i == 2) {
                        method.invoke(interfaceC0085s, interfaceC0086t, enumC0080m);
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
