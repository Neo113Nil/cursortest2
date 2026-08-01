package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.lifecycle.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0071d {

    /* renamed from: c, reason: collision with root package name */
    public static final C0071d f1480c = new C0071d();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f1481a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f1482b = new HashMap();

    public static void b(HashMap hashMap, C0070c c0070c, EnumC0080m enumC0080m, Class cls) {
        EnumC0080m enumC0080m2 = (EnumC0080m) hashMap.get(c0070c);
        if (enumC0080m2 == null || enumC0080m == enumC0080m2) {
            if (enumC0080m2 == null) {
                hashMap.put(c0070c, enumC0080m);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c0070c.f1479b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + enumC0080m2 + ", new value " + enumC0080m);
    }

    public final C0069b a(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = this.f1481a;
        if (superclass != null) {
            C0069b c0069b = (C0069b) hashMap2.get(superclass);
            if (c0069b == null) {
                c0069b = a(superclass, null);
            }
            hashMap.putAll(c0069b.f1477b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            C0069b c0069b2 = (C0069b) hashMap2.get(cls2);
            if (c0069b2 == null) {
                c0069b2 = a(cls2, null);
            }
            for (Map.Entry entry : c0069b2.f1477b.entrySet()) {
                b(hashMap, (C0070c) entry.getKey(), (EnumC0080m) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e2) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e2);
            }
        }
        boolean z2 = false;
        for (Method method : methodArr) {
            z zVar = (z) method.getAnnotation(z.class);
            if (zVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!InterfaceC0086t.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i = 1;
                }
                EnumC0080m value = zVar.value();
                if (parameterTypes.length > 1) {
                    if (!EnumC0080m.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (value != EnumC0080m.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                b(hashMap, new C0070c(i, method), value, cls);
                z2 = true;
            }
        }
        C0069b c0069b3 = new C0069b(hashMap);
        hashMap2.put(cls, c0069b3);
        this.f1482b.put(cls, Boolean.valueOf(z2));
        return c0069b3;
    }
}
