package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.lifecycle.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0219d {

    /* renamed from: c, reason: collision with root package name */
    public static final C0219d f4017c = new C0219d();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f4018a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f4019b = new HashMap();

    public static void b(HashMap hashMap, C0218c c0218c, EnumC0229n enumC0229n, Class cls) {
        EnumC0229n enumC0229n2 = (EnumC0229n) hashMap.get(c0218c);
        if (enumC0229n2 == null || enumC0229n == enumC0229n2) {
            if (enumC0229n2 == null) {
                hashMap.put(c0218c, enumC0229n);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c0218c.f4011b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + enumC0229n2 + ", new value " + enumC0229n);
    }

    public final C0217b a(Class cls, Method[] methodArr) {
        int i3;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = this.f4018a;
        if (superclass != null) {
            C0217b c0217b = (C0217b) hashMap2.get(superclass);
            if (c0217b == null) {
                c0217b = a(superclass, null);
            }
            hashMap.putAll(c0217b.f4009b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            C0217b c0217b2 = (C0217b) hashMap2.get(cls2);
            if (c0217b2 == null) {
                c0217b2 = a(cls2, null);
            }
            for (Map.Entry entry : c0217b2.f4009b.entrySet()) {
                b(hashMap, (C0218c) entry.getKey(), (EnumC0229n) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e3) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e3);
            }
        }
        boolean z3 = false;
        for (Method method : methodArr) {
            InterfaceC0240z interfaceC0240z = (InterfaceC0240z) method.getAnnotation(InterfaceC0240z.class);
            if (interfaceC0240z != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i3 = 0;
                } else {
                    if (!InterfaceC0236v.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i3 = 1;
                }
                EnumC0229n value = interfaceC0240z.value();
                if (parameterTypes.length > 1) {
                    if (!EnumC0229n.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (value != EnumC0229n.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i3 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                b(hashMap, new C0218c(i3, method), value, cls);
                z3 = true;
            }
        }
        C0217b c0217b3 = new C0217b(hashMap);
        hashMap2.put(cls, c0217b3);
        this.f4019b.put(cls, Boolean.valueOf(z3));
        return c0217b3;
    }
}
