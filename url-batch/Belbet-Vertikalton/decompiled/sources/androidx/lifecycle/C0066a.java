package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0066a {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f1922a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f1923b;

    public C0066a(HashMap hashMap) {
        this.f1923b = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            EnumC0077l enumC0077l = (EnumC0077l) entry.getValue();
            List list = (List) this.f1922a.get(enumC0077l);
            if (list == null) {
                list = new ArrayList();
                this.f1922a.put(enumC0077l, list);
            }
            list.add((C0067b) entry.getKey());
        }
    }

    public static void a(List list, t tVar, EnumC0077l enumC0077l, InterfaceC0083s interfaceC0083s) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C0067b c0067b = (C0067b) list.get(size);
                c0067b.getClass();
                try {
                    int i = c0067b.f1924a;
                    Method method = c0067b.f1925b;
                    if (i == 0) {
                        method.invoke(interfaceC0083s, null);
                    } else if (i == 1) {
                        method.invoke(interfaceC0083s, tVar);
                    } else if (i == 2) {
                        method.invoke(interfaceC0083s, tVar, enumC0077l);
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e2) {
                    throw new RuntimeException("Failed to call observer method", e2.getCause());
                }
            }
        }
    }
}
