package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0235b {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f3499a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f3500b;

    public C0235b(HashMap hashMap) {
        this.f3500b = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            EnumC0246m enumC0246m = (EnumC0246m) entry.getValue();
            List list = (List) this.f3499a.get(enumC0246m);
            if (list == null) {
                list = new ArrayList();
                this.f3499a.put(enumC0246m, list);
            }
            list.add((C0236c) entry.getKey());
        }
    }

    public static void a(List list, InterfaceC0253u interfaceC0253u, EnumC0246m enumC0246m, InterfaceC0252t interfaceC0252t) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C0236c c0236c = (C0236c) list.get(size);
                Method method = c0236c.f3502b;
                try {
                    int i7 = c0236c.f3501a;
                    if (i7 == 0) {
                        method.invoke(interfaceC0252t, null);
                    } else if (i7 == 1) {
                        method.invoke(interfaceC0252t, interfaceC0253u);
                    } else if (i7 == 2) {
                        method.invoke(interfaceC0252t, interfaceC0253u, enumC0246m);
                    }
                } catch (IllegalAccessException e4) {
                    throw new RuntimeException(e4);
                } catch (InvocationTargetException e7) {
                    throw new RuntimeException("Failed to call observer method", e7.getCause());
                }
            }
        }
    }
}
