package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.lifecycle.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0062c {

    /* renamed from: c, reason: collision with root package name */
    public static final C0062c f1472c = new C0062c();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f1473a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f1474b = new HashMap();

    public static void b(HashMap hashMap, C0061b c0061b, EnumC0071l enumC0071l, Class cls) {
        EnumC0071l enumC0071l2 = (EnumC0071l) hashMap.get(c0061b);
        if (enumC0071l2 == null || enumC0071l == enumC0071l2) {
            if (enumC0071l2 == null) {
                hashMap.put(c0061b, enumC0071l);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c0061b.f1471b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + enumC0071l2 + ", new value " + enumC0071l);
    }

    public final C0060a a(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = this.f1473a;
        if (superclass != null) {
            C0060a c0060a = (C0060a) hashMap2.get(superclass);
            if (c0060a == null) {
                c0060a = a(superclass, null);
            }
            hashMap.putAll(c0060a.f1469b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            C0060a c0060a2 = (C0060a) hashMap2.get(cls2);
            if (c0060a2 == null) {
                c0060a2 = a(cls2, null);
            }
            for (Map.Entry entry : c0060a2.f1469b.entrySet()) {
                b(hashMap, (C0061b) entry.getKey(), (EnumC0071l) entry.getValue(), cls);
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
            x xVar = (x) method.getAnnotation(x.class);
            if (xVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!r.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i = 1;
                }
                EnumC0071l value = xVar.value();
                if (parameterTypes.length > 1) {
                    if (!EnumC0071l.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (value != EnumC0071l.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                b(hashMap, new C0061b(i, method), value, cls);
                z2 = true;
            }
        }
        C0060a c0060a3 = new C0060a(hashMap);
        hashMap2.put(cls, c0060a3);
        this.f1474b.put(cls, Boolean.valueOf(z2));
        return c0060a3;
    }
}
