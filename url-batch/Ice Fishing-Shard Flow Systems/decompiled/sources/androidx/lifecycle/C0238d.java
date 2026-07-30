package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.lifecycle.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0238d {

    /* renamed from: c, reason: collision with root package name */
    public static final C0238d f3897c = new C0238d();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f3898a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f3899b = new HashMap();

    public static void b(HashMap hashMap, C0237c c0237c, EnumC0248n enumC0248n, Class cls) {
        EnumC0248n enumC0248n2 = (EnumC0248n) hashMap.get(c0237c);
        if (enumC0248n2 == null || enumC0248n == enumC0248n2) {
            if (enumC0248n2 == null) {
                hashMap.put(c0237c, enumC0248n);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c0237c.f3896b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + enumC0248n2 + ", new value " + enumC0248n);
    }

    public final C0236b a(Class cls, Method[] methodArr) {
        int i2;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = this.f3898a;
        if (superclass != null) {
            C0236b c0236b = (C0236b) hashMap2.get(superclass);
            if (c0236b == null) {
                c0236b = a(superclass, null);
            }
            hashMap.putAll(c0236b.f3893b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            C0236b c0236b2 = (C0236b) hashMap2.get(cls2);
            if (c0236b2 == null) {
                c0236b2 = a(cls2, null);
            }
            for (Map.Entry entry : c0236b2.f3893b.entrySet()) {
                b(hashMap, (C0237c) entry.getKey(), (EnumC0248n) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e7) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e7);
            }
        }
        boolean z7 = false;
        for (Method method : methodArr) {
            D d7 = (D) method.getAnnotation(D.class);
            if (d7 != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i2 = 0;
                } else {
                    if (!InterfaceC0256w.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i2 = 1;
                }
                EnumC0248n value = d7.value();
                if (parameterTypes.length > 1) {
                    if (!EnumC0248n.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (value != EnumC0248n.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i2 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                b(hashMap, new C0237c(i2, method), value, cls);
                z7 = true;
            }
        }
        C0236b c0236b3 = new C0236b(hashMap);
        hashMap2.put(cls, c0236b3);
        this.f3899b.put(cls, Boolean.valueOf(z7));
        return c0236b3;
    }
}
