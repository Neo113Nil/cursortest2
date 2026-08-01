package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.lifecycle.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0068c {

    /* renamed from: c, reason: collision with root package name */
    public static final C0068c f1926c = new C0068c();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f1927a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f1928b = new HashMap();

    public static void b(HashMap hashMap, C0067b c0067b, EnumC0077l enumC0077l, Class cls) {
        EnumC0077l enumC0077l2 = (EnumC0077l) hashMap.get(c0067b);
        if (enumC0077l2 == null || enumC0077l == enumC0077l2) {
            if (enumC0077l2 == null) {
                hashMap.put(c0067b, enumC0077l);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c0067b.f1925b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + enumC0077l2 + ", new value " + enumC0077l);
    }

    public final C0066a a(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = this.f1927a;
        if (superclass != null) {
            C0066a c0066a = (C0066a) hashMap2.get(superclass);
            if (c0066a == null) {
                c0066a = a(superclass, null);
            }
            hashMap.putAll(c0066a.f1923b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            C0066a c0066a2 = (C0066a) hashMap2.get(cls2);
            if (c0066a2 == null) {
                c0066a2 = a(cls2, null);
            }
            for (Map.Entry entry : c0066a2.f1923b.entrySet()) {
                b(hashMap, (C0067b) entry.getKey(), (EnumC0077l) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
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
                    if (!t.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i = 1;
                }
                EnumC0077l value = zVar.value();
                if (parameterTypes.length > 1) {
                    if (!EnumC0077l.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (value != EnumC0077l.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                b(hashMap, new C0067b(i, method), value, cls);
                z2 = true;
            }
        }
        C0066a c0066a3 = new C0066a(hashMap);
        hashMap2.put(cls, c0066a3);
        this.f1928b.put(cls, Boolean.valueOf(z2));
        return c0066a3;
    }
}
