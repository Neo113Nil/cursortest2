package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0273b {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f5209a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f5210b;

    public C0273b(HashMap hashMap) {
        this.f5210b = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            EnumC0285n enumC0285n = (EnumC0285n) entry.getValue();
            List list = (List) this.f5209a.get(enumC0285n);
            if (list == null) {
                list = new ArrayList();
                this.f5209a.put(enumC0285n, list);
            }
            list.add((C0274c) entry.getKey());
        }
    }

    public static void a(List list, InterfaceC0292v interfaceC0292v, EnumC0285n enumC0285n, InterfaceC0291u interfaceC0291u) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C0274c c0274c = (C0274c) list.get(size);
                c0274c.getClass();
                try {
                    int i3 = c0274c.f5211a;
                    Method method = c0274c.f5212b;
                    if (i3 == 0) {
                        method.invoke(interfaceC0291u, null);
                    } else if (i3 == 1) {
                        method.invoke(interfaceC0291u, interfaceC0292v);
                    } else if (i3 == 2) {
                        method.invoke(interfaceC0291u, interfaceC0292v, enumC0285n);
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
