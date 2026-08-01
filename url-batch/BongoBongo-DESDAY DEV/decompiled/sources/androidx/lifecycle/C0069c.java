package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.lifecycle.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0069c {

    /* renamed from: c, reason: collision with root package name */
    public static final C0069c f1564c = new C0069c();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f1565a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f1566b = new HashMap();

    public static void b(HashMap hashMap, C0068b c0068b, EnumC0078l enumC0078l, Class cls) {
        EnumC0078l enumC0078l2 = (EnumC0078l) hashMap.get(c0068b);
        if (enumC0078l2 == null || enumC0078l == enumC0078l2) {
            if (enumC0078l2 == null) {
                hashMap.put(c0068b, enumC0078l);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c0068b.f1563b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + enumC0078l2 + ", new value " + enumC0078l);
    }

    public final C0067a a(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = this.f1565a;
        if (superclass != null) {
            C0067a c0067a = (C0067a) hashMap2.get(superclass);
            if (c0067a == null) {
                c0067a = a(superclass, null);
            }
            hashMap.putAll(c0067a.f1561b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            C0067a c0067a2 = (C0067a) hashMap2.get(cls2);
            if (c0067a2 == null) {
                c0067a2 = a(cls2, null);
            }
            for (Map.Entry entry : c0067a2.f1561b.entrySet()) {
                b(hashMap, (C0068b) entry.getKey(), (EnumC0078l) entry.getValue(), cls);
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
                EnumC0078l value = xVar.value();
                if (parameterTypes.length > 1) {
                    if (!EnumC0078l.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (value != EnumC0078l.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                b(hashMap, new C0068b(i, method), value, cls);
                z2 = true;
            }
        }
        C0067a c0067a3 = new C0067a(hashMap);
        hashMap2.put(cls, c0067a3);
        this.f1566b.put(cls, Boolean.valueOf(z2));
        return c0067a3;
    }
}
