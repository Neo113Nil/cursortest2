package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0057a {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f1349a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f1350b;

    public C0057a(HashMap hashMap) {
        this.f1350b = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            EnumC0068l enumC0068l = (EnumC0068l) entry.getValue();
            List list = (List) this.f1349a.get(enumC0068l);
            if (list == null) {
                list = new ArrayList();
                this.f1349a.put(enumC0068l, list);
            }
            list.add((C0058b) entry.getKey());
        }
    }

    public static void a(List list, r rVar, EnumC0068l enumC0068l, q qVar) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C0058b c0058b = (C0058b) list.get(size);
                c0058b.getClass();
                try {
                    int i = c0058b.f1351a;
                    Method method = c0058b.f1352b;
                    if (i == 0) {
                        method.invoke(qVar, null);
                    } else if (i == 1) {
                        method.invoke(qVar, rVar);
                    } else if (i == 2) {
                        method.invoke(qVar, rVar, enumC0068l);
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
