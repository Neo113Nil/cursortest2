package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static final d f675c = new d();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f676a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f677b = new HashMap();

    public static void b(HashMap hashMap, c cVar, o oVar, Class cls) {
        o oVar2 = (o) hashMap.get(cVar);
        if (oVar2 == null || oVar == oVar2) {
            if (oVar2 == null) {
                hashMap.put(cVar, oVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + cVar.f674b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + oVar2 + ", new value " + oVar);
    }

    public final b a(Class cls, Method[] methodArr) {
        int i3;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = this.f676a;
        if (superclass != null) {
            b bVar = (b) hashMap2.get(superclass);
            if (bVar == null) {
                bVar = a(superclass, null);
            }
            hashMap.putAll(bVar.f664b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            b bVar2 = (b) hashMap2.get(cls2);
            if (bVar2 == null) {
                bVar2 = a(cls2, null);
            }
            for (Map.Entry entry : bVar2.f664b.entrySet()) {
                b(hashMap, (c) entry.getKey(), (o) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e2) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e2);
            }
        }
        boolean z10 = false;
        for (Method method : methodArr) {
            c0 c0Var = (c0) method.getAnnotation(c0.class);
            if (c0Var != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i3 = 0;
                } else {
                    if (!u.class.isAssignableFrom(parameterTypes[0])) {
                        te.a1.e("invalid parameter type. Must be one and instanceof LifecycleOwner");
                        return null;
                    }
                    i3 = 1;
                }
                o value = c0Var.value();
                if (parameterTypes.length > 1) {
                    if (!o.class.isAssignableFrom(parameterTypes[1])) {
                        te.a1.e("invalid parameter type. second arg must be an event");
                        return null;
                    }
                    if (value != o.ON_ANY) {
                        te.a1.e("Second arg is supported only for ON_ANY value");
                        return null;
                    }
                    i3 = 2;
                }
                if (parameterTypes.length > 2) {
                    te.a1.e("cannot have more than 2 params");
                    return null;
                }
                b(hashMap, new c(i3, method), value, cls);
                z10 = true;
            }
        }
        b bVar3 = new b(hashMap);
        hashMap2.put(cls, bVar3);
        this.f677b.put(cls, Boolean.valueOf(z10));
        return bVar3;
    }
}
