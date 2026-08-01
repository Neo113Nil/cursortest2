package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.lifecycle.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0059c {

    /* renamed from: c, reason: collision with root package name */
    public static final C0059c f1349c = new C0059c();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f1350a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f1351b = new HashMap();

    public static void b(HashMap hashMap, C0058b c0058b, EnumC0068l enumC0068l, Class cls) {
        EnumC0068l enumC0068l2 = (EnumC0068l) hashMap.get(c0058b);
        if (enumC0068l2 == null || enumC0068l == enumC0068l2) {
            if (enumC0068l2 == null) {
                hashMap.put(c0058b, enumC0068l);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c0058b.f1348b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + enumC0068l2 + ", new value " + enumC0068l);
    }

    public final C0057a a(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = this.f1350a;
        if (superclass != null) {
            C0057a c0057a = (C0057a) hashMap2.get(superclass);
            if (c0057a == null) {
                c0057a = a(superclass, null);
            }
            hashMap.putAll(c0057a.f1346b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            C0057a c0057a2 = (C0057a) hashMap2.get(cls2);
            if (c0057a2 == null) {
                c0057a2 = a(cls2, null);
            }
            for (Map.Entry entry : c0057a2.f1346b.entrySet()) {
                b(hashMap, (C0058b) entry.getKey(), (EnumC0068l) entry.getValue(), cls);
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
                EnumC0068l value = xVar.value();
                if (parameterTypes.length > 1) {
                    if (!EnumC0068l.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (value != EnumC0068l.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                b(hashMap, new C0058b(i, method), value, cls);
                z2 = true;
            }
        }
        C0057a c0057a3 = new C0057a(hashMap);
        hashMap2.put(cls, c0057a3);
        this.f1351b.put(cls, Boolean.valueOf(z2));
        return c0057a3;
    }
}
