package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.lifecycle.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0061c {

    /* renamed from: c, reason: collision with root package name */
    public static final C0061c f1388c = new C0061c();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f1389a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f1390b = new HashMap();

    public static void b(HashMap hashMap, C0060b c0060b, EnumC0070l enumC0070l, Class cls) {
        EnumC0070l enumC0070l2 = (EnumC0070l) hashMap.get(c0060b);
        if (enumC0070l2 == null || enumC0070l == enumC0070l2) {
            if (enumC0070l2 == null) {
                hashMap.put(c0060b, enumC0070l);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c0060b.f1387b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + enumC0070l2 + ", new value " + enumC0070l);
    }

    public final C0059a a(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = this.f1389a;
        if (superclass != null) {
            C0059a c0059a = (C0059a) hashMap2.get(superclass);
            if (c0059a == null) {
                c0059a = a(superclass, null);
            }
            hashMap.putAll(c0059a.f1385b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            C0059a c0059a2 = (C0059a) hashMap2.get(cls2);
            if (c0059a2 == null) {
                c0059a2 = a(cls2, null);
            }
            for (Map.Entry entry : c0059a2.f1385b.entrySet()) {
                b(hashMap, (C0060b) entry.getKey(), (EnumC0070l) entry.getValue(), cls);
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
                EnumC0070l value = xVar.value();
                if (parameterTypes.length > 1) {
                    if (!EnumC0070l.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (value != EnumC0070l.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                b(hashMap, new C0060b(i, method), value, cls);
                z2 = true;
            }
        }
        C0059a c0059a3 = new C0059a(hashMap);
        hashMap2.put(cls, c0059a3);
        this.f1390b.put(cls, Boolean.valueOf(z2));
        return c0059a3;
    }
}
