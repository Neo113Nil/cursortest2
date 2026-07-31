package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.lifecycle.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0237d {

    /* renamed from: c, reason: collision with root package name */
    public static final C0237d f3503c = new C0237d();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f3504a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f3505b = new HashMap();

    public static void b(HashMap hashMap, C0236c c0236c, EnumC0246m enumC0246m, Class cls) {
        EnumC0246m enumC0246m2 = (EnumC0246m) hashMap.get(c0236c);
        if (enumC0246m2 == null || enumC0246m == enumC0246m2) {
            if (enumC0246m2 == null) {
                hashMap.put(c0236c, enumC0246m);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c0236c.f3502b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + enumC0246m2 + ", new value " + enumC0246m);
    }

    public final C0235b a(Class cls, Method[] methodArr) {
        int i7;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = this.f3504a;
        if (superclass != null) {
            C0235b c0235b = (C0235b) hashMap2.get(superclass);
            if (c0235b == null) {
                c0235b = a(superclass, null);
            }
            hashMap.putAll(c0235b.f3500b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            C0235b c0235b2 = (C0235b) hashMap2.get(cls2);
            if (c0235b2 == null) {
                c0235b2 = a(cls2, null);
            }
            for (Map.Entry entry : c0235b2.f3500b.entrySet()) {
                b(hashMap, (C0236c) entry.getKey(), (EnumC0246m) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e4) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e4);
            }
        }
        boolean z5 = false;
        for (Method method : methodArr) {
            B b7 = (B) method.getAnnotation(B.class);
            if (b7 != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i7 = 0;
                } else {
                    if (!InterfaceC0253u.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i7 = 1;
                }
                EnumC0246m value = b7.value();
                if (parameterTypes.length > 1) {
                    if (!EnumC0246m.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (value != EnumC0246m.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i7 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                b(hashMap, new C0236c(i7, method), value, cls);
                z5 = true;
            }
        }
        C0235b c0235b3 = new C0235b(hashMap);
        hashMap2.put(cls, c0235b3);
        this.f3505b.put(cls, Boolean.valueOf(z5));
        return c0235b3;
    }
}
