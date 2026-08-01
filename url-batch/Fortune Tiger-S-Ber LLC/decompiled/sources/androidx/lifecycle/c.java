package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class c {
    public static final c c = new c();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f577a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f578b = new HashMap();

    public static void b(HashMap hashMap, b bVar, l lVar, Class cls) {
        l lVar2 = (l) hashMap.get(bVar);
        if (lVar2 == null || lVar == lVar2) {
            if (lVar2 == null) {
                hashMap.put(bVar, lVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + bVar.f569b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + lVar2 + ", new value " + lVar);
    }

    public final a a(Class cls, Method[] methodArr) {
        int i4;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = this.f577a;
        if (superclass != null) {
            a aVar = (a) hashMap2.get(superclass);
            if (aVar == null) {
                aVar = a(superclass, null);
            }
            hashMap.putAll(aVar.f567b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            a aVar2 = (a) hashMap2.get(cls2);
            if (aVar2 == null) {
                aVar2 = a(cls2, null);
            }
            for (Map.Entry entry : aVar2.f567b.entrySet()) {
                b(hashMap, (b) entry.getKey(), (l) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e4) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e4);
            }
        }
        boolean z3 = false;
        for (Method method : methodArr) {
            y yVar = (y) method.getAnnotation(y.class);
            if (yVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i4 = 0;
                } else {
                    if (!r.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i4 = 1;
                }
                l value = yVar.value();
                if (parameterTypes.length > 1) {
                    if (!l.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (value != l.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i4 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                b(hashMap, new b(i4, method), value, cls);
                z3 = true;
            }
        }
        a aVar3 = new a(hashMap);
        hashMap2.put(cls, aVar3);
        this.f578b.put(cls, Boolean.valueOf(z3));
        return aVar3;
    }
}
