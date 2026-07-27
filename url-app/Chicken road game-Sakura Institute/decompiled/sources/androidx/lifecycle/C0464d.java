package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.lifecycle.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0464d {

    /* renamed from: c, reason: collision with root package name */
    public static final C0464d f5472c = new C0464d();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f5473a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f5474b = new HashMap();

    public static void b(HashMap hashMap, C0463c c0463c, EnumC0474n enumC0474n, Class cls) {
        EnumC0474n enumC0474n2 = (EnumC0474n) hashMap.get(c0463c);
        if (enumC0474n2 == null || enumC0474n == enumC0474n2) {
            if (enumC0474n2 == null) {
                hashMap.put(c0463c, enumC0474n);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c0463c.f5471b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + enumC0474n2 + ", new value " + enumC0474n);
    }

    public final C0462b a(Class cls, Method[] methodArr) {
        int i2;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = this.f5473a;
        if (superclass != null) {
            C0462b c0462b = (C0462b) hashMap2.get(superclass);
            if (c0462b == null) {
                c0462b = a(superclass, null);
            }
            hashMap.putAll(c0462b.f5469b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            C0462b c0462b2 = (C0462b) hashMap2.get(cls2);
            if (c0462b2 == null) {
                c0462b2 = a(cls2, null);
            }
            for (Map.Entry entry : c0462b2.f5469b.entrySet()) {
                b(hashMap, (C0463c) entry.getKey(), (EnumC0474n) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e4) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e4);
            }
        }
        boolean z4 = false;
        for (Method method : methodArr) {
            B b4 = (B) method.getAnnotation(B.class);
            if (b4 != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i2 = 0;
                } else {
                    if (!InterfaceC0481v.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i2 = 1;
                }
                EnumC0474n value = b4.value();
                if (parameterTypes.length > 1) {
                    if (!EnumC0474n.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (value != EnumC0474n.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i2 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                b(hashMap, new C0463c(i2, method), value, cls);
                z4 = true;
            }
        }
        C0462b c0462b3 = new C0462b(hashMap);
        hashMap2.put(cls, c0462b3);
        this.f5474b.put(cls, Boolean.valueOf(z4));
        return c0462b3;
    }
}
