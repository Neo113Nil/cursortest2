package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static final d f812c = new d();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f813a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f814b = new HashMap();

    public static void b(HashMap hashMap, c cVar, o oVar, Class cls) {
        o oVar2 = (o) hashMap.get(cVar);
        if (oVar2 == null || oVar == oVar2) {
            if (oVar2 == null) {
                hashMap.put(cVar, oVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + cVar.f811b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + oVar2 + ", new value " + oVar);
    }

    public final b a(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = this.f813a;
        if (superclass != null) {
            b bVar = (b) hashMap2.get(superclass);
            if (bVar == null) {
                bVar = a(superclass, null);
            }
            hashMap.putAll(bVar.f809b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            b bVar2 = (b) hashMap2.get(cls2);
            if (bVar2 == null) {
                bVar2 = a(cls2, null);
            }
            for (Map.Entry entry : bVar2.f809b.entrySet()) {
                b(hashMap, (c) entry.getKey(), (o) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e8) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e8);
            }
        }
        boolean z3 = false;
        for (Method method : methodArr) {
            a0 a0Var = (a0) method.getAnnotation(a0.class);
            if (a0Var != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!u.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i = 1;
                }
                o value = a0Var.value();
                if (parameterTypes.length > 1) {
                    if (!o.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (value != o.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                b(hashMap, new c(i, method), value, cls);
                z3 = true;
            }
        }
        b bVar3 = new b(hashMap);
        hashMap2.put(cls, bVar3);
        this.f814b.put(cls, Boolean.valueOf(z3));
        return bVar3;
    }
}
