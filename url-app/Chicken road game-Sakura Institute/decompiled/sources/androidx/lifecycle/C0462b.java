package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0462b {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f5468a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f5469b;

    public C0462b(HashMap hashMap) {
        this.f5469b = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            EnumC0474n enumC0474n = (EnumC0474n) entry.getValue();
            List list = (List) this.f5468a.get(enumC0474n);
            if (list == null) {
                list = new ArrayList();
                this.f5468a.put(enumC0474n, list);
            }
            list.add((C0463c) entry.getKey());
        }
    }

    public static void a(List list, InterfaceC0481v interfaceC0481v, EnumC0474n enumC0474n, InterfaceC0480u interfaceC0480u) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C0463c c0463c = (C0463c) list.get(size);
                c0463c.getClass();
                try {
                    int i2 = c0463c.f5470a;
                    Method method = c0463c.f5471b;
                    if (i2 == 0) {
                        method.invoke(interfaceC0480u, null);
                    } else if (i2 == 1) {
                        method.invoke(interfaceC0480u, interfaceC0481v);
                    } else if (i2 == 2) {
                        method.invoke(interfaceC0480u, interfaceC0481v, enumC0474n);
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
