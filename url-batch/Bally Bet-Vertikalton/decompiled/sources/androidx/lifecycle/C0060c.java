package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.lifecycle.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0060c {

    /* renamed from: c, reason: collision with root package name */
    public static final C0060c f1355c = new C0060c();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f1356a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f1357b = new HashMap();

    public static void b(HashMap hashMap, C0059b c0059b, EnumC0069l enumC0069l, Class cls) {
        EnumC0069l enumC0069l2 = (EnumC0069l) hashMap.get(c0059b);
        if (enumC0069l2 == null || enumC0069l == enumC0069l2) {
            if (enumC0069l2 == null) {
                hashMap.put(c0059b, enumC0069l);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c0059b.f1354b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + enumC0069l2 + ", new value " + enumC0069l);
    }

    public final C0058a a(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = this.f1356a;
        if (superclass != null) {
            C0058a c0058a = (C0058a) hashMap2.get(superclass);
            if (c0058a == null) {
                c0058a = a(superclass, null);
            }
            hashMap.putAll(c0058a.f1352b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            C0058a c0058a2 = (C0058a) hashMap2.get(cls2);
            if (c0058a2 == null) {
                c0058a2 = a(cls2, null);
            }
            for (Map.Entry entry : c0058a2.f1352b.entrySet()) {
                b(hashMap, (C0059b) entry.getKey(), (EnumC0069l) entry.getValue(), cls);
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
                EnumC0069l value = xVar.value();
                if (parameterTypes.length > 1) {
                    if (!EnumC0069l.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (value != EnumC0069l.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                b(hashMap, new C0059b(i, method), value, cls);
                z2 = true;
            }
        }
        C0058a c0058a3 = new C0058a(hashMap);
        hashMap2.put(cls, c0058a3);
        this.f1357b.put(cls, Boolean.valueOf(z2));
        return c0058a3;
    }
}
