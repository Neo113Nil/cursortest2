package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0217b {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f4008a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f4009b;

    public C0217b(HashMap hashMap) {
        this.f4009b = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            EnumC0229n enumC0229n = (EnumC0229n) entry.getValue();
            List list = (List) this.f4008a.get(enumC0229n);
            if (list == null) {
                list = new ArrayList();
                this.f4008a.put(enumC0229n, list);
            }
            list.add((C0218c) entry.getKey());
        }
    }

    public static void a(List list, InterfaceC0236v interfaceC0236v, EnumC0229n enumC0229n, InterfaceC0235u interfaceC0235u) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C0218c c0218c = (C0218c) list.get(size);
                c0218c.getClass();
                try {
                    int i3 = c0218c.f4010a;
                    Method method = c0218c.f4011b;
                    if (i3 == 0) {
                        method.invoke(interfaceC0235u, null);
                    } else if (i3 == 1) {
                        method.invoke(interfaceC0235u, interfaceC0236v);
                    } else if (i3 == 2) {
                        method.invoke(interfaceC0235u, interfaceC0236v, enumC0229n);
                    }
                } catch (IllegalAccessException e3) {
                    throw new RuntimeException(e3);
                } catch (InvocationTargetException e4) {
                    throw new RuntimeException("Failed to call observer method", e4.getCause());
                }
            }
        }
    }
}
