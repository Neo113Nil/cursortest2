package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0232b {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f4564a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f4565b;

    public C0232b(HashMap hashMap) {
        this.f4565b = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            EnumC0243m enumC0243m = (EnumC0243m) entry.getValue();
            List list = (List) this.f4564a.get(enumC0243m);
            if (list == null) {
                list = new ArrayList();
                this.f4564a.put(enumC0243m, list);
            }
            list.add((C0233c) entry.getKey());
        }
    }

    public static void a(List list, InterfaceC0250u interfaceC0250u, EnumC0243m enumC0243m, InterfaceC0249t interfaceC0249t) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C0233c c0233c = (C0233c) list.get(size);
                c0233c.getClass();
                try {
                    int i2 = c0233c.f4566a;
                    Method method = c0233c.f4567b;
                    if (i2 == 0) {
                        method.invoke(interfaceC0249t, null);
                    } else if (i2 == 1) {
                        method.invoke(interfaceC0249t, interfaceC0250u);
                    } else if (i2 == 2) {
                        method.invoke(interfaceC0249t, interfaceC0250u, enumC0243m);
                    }
                } catch (IllegalAccessException e3) {
                    throw new RuntimeException(e3);
                } catch (InvocationTargetException e6) {
                    throw new RuntimeException("Failed to call observer method", e6.getCause());
                }
            }
        }
    }
}
