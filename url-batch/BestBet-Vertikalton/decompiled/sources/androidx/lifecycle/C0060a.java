package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0060a {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f1872a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f1873b;

    public C0060a(HashMap hashMap) {
        this.f1873b = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            EnumC0071l enumC0071l = (EnumC0071l) entry.getValue();
            List list = (List) this.f1872a.get(enumC0071l);
            if (list == null) {
                list = new ArrayList();
                this.f1872a.put(enumC0071l, list);
            }
            list.add((C0061b) entry.getKey());
        }
    }

    public static void a(List list, t tVar, EnumC0071l enumC0071l, InterfaceC0077s interfaceC0077s) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C0061b c0061b = (C0061b) list.get(size);
                c0061b.getClass();
                try {
                    int i = c0061b.f1874a;
                    Method method = c0061b.f1875b;
                    if (i == 0) {
                        method.invoke(interfaceC0077s, null);
                    } else if (i == 1) {
                        method.invoke(interfaceC0077s, tVar);
                    } else if (i == 2) {
                        method.invoke(interfaceC0077s, tVar, enumC0071l);
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
