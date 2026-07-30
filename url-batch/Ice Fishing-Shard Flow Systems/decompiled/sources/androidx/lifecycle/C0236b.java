package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0236b {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f3892a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f3893b;

    public C0236b(HashMap hashMap) {
        this.f3893b = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            EnumC0248n enumC0248n = (EnumC0248n) entry.getValue();
            List list = (List) this.f3892a.get(enumC0248n);
            if (list == null) {
                list = new ArrayList();
                this.f3892a.put(enumC0248n, list);
            }
            list.add((C0237c) entry.getKey());
        }
    }

    public static void a(List list, InterfaceC0256w interfaceC0256w, EnumC0248n enumC0248n, InterfaceC0255v interfaceC0255v) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C0237c c0237c = (C0237c) list.get(size);
                Method method = c0237c.f3896b;
                try {
                    int i2 = c0237c.f3895a;
                    if (i2 == 0) {
                        method.invoke(interfaceC0255v, null);
                    } else if (i2 == 1) {
                        method.invoke(interfaceC0255v, interfaceC0256w);
                    } else if (i2 == 2) {
                        method.invoke(interfaceC0255v, interfaceC0256w, enumC0248n);
                    }
                } catch (IllegalAccessException e7) {
                    throw new RuntimeException(e7);
                } catch (InvocationTargetException e8) {
                    throw new RuntimeException("Failed to call observer method", e8.getCause());
                }
            }
        }
    }
}
