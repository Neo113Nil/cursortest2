package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.lifecycle.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0275d {

    /* renamed from: c, reason: collision with root package name */
    public static final C0275d f5218c = new C0275d();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f5219a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f5220b = new HashMap();

    public static void b(HashMap hashMap, C0274c c0274c, EnumC0285n enumC0285n, Class cls) {
        EnumC0285n enumC0285n2 = (EnumC0285n) hashMap.get(c0274c);
        if (enumC0285n2 == null || enumC0285n == enumC0285n2) {
            if (enumC0285n2 == null) {
                hashMap.put(c0274c, enumC0285n);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c0274c.f5212b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + enumC0285n2 + ", new value " + enumC0285n);
    }

    public final C0273b a(Class cls, Method[] methodArr) {
        int i3;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = this.f5219a;
        if (superclass != null) {
            C0273b c0273b = (C0273b) hashMap2.get(superclass);
            if (c0273b == null) {
                c0273b = a(superclass, null);
            }
            hashMap.putAll(c0273b.f5210b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            C0273b c0273b2 = (C0273b) hashMap2.get(cls2);
            if (c0273b2 == null) {
                c0273b2 = a(cls2, null);
            }
            for (Map.Entry entry : c0273b2.f5210b.entrySet()) {
                b(hashMap, (C0274c) entry.getKey(), (EnumC0285n) entry.getValue(), cls);
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
            InterfaceC0296z interfaceC0296z = (InterfaceC0296z) method.getAnnotation(InterfaceC0296z.class);
            if (interfaceC0296z != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i3 = 0;
                } else {
                    if (!InterfaceC0292v.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i3 = 1;
                }
                EnumC0285n value = interfaceC0296z.value();
                if (parameterTypes.length > 1) {
                    if (!EnumC0285n.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (value != EnumC0285n.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i3 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                b(hashMap, new C0274c(i3, method), value, cls);
                z3 = true;
            }
        }
        C0273b c0273b3 = new C0273b(hashMap);
        hashMap2.put(cls, c0273b3);
        this.f5220b.put(cls, Boolean.valueOf(z3));
        return c0273b3;
    }
}
