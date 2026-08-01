package defpackage;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class gc {
    public static final gc c = new gc();
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();

    public static void b(HashMap hashMap, fc fcVar, fx fxVar, Class cls) {
        fx fxVar2 = (fx) hashMap.get(fcVar);
        if (fxVar2 == null || fxVar == fxVar2) {
            if (fxVar2 == null) {
                hashMap.put(fcVar, fxVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + fcVar.b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + fxVar2 + ", new value " + fxVar);
    }

    public final ec a(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = this.a;
        if (superclass != null) {
            ec ecVar = (ec) hashMap2.get(superclass);
            if (ecVar == null) {
                ecVar = a(superclass, null);
            }
            hashMap.putAll(ecVar.b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            ec ecVar2 = (ec) hashMap2.get(cls2);
            if (ecVar2 == null) {
                ecVar2 = a(cls2, null);
            }
            for (Map.Entry entry : ecVar2.b.entrySet()) {
                b(hashMap, (fc) entry.getKey(), (fx) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            a50 a50Var = (a50) method.getAnnotation(a50.class);
            if (a50Var != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!lx.class.isAssignableFrom(parameterTypes[0])) {
                        s9.k("invalid parameter type. Must be one and instanceof LifecycleOwner");
                        return null;
                    }
                    i = 1;
                }
                fx value = a50Var.value();
                if (parameterTypes.length > 1) {
                    if (!fx.class.isAssignableFrom(parameterTypes[1])) {
                        s9.k("invalid parameter type. second arg must be an event");
                        return null;
                    }
                    if (value != fx.ON_ANY) {
                        s9.k("Second arg is supported only for ON_ANY value");
                        return null;
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    s9.k("cannot have more than 2 params");
                    return null;
                }
                b(hashMap, new fc(i, method), value, cls);
                z = true;
            }
        }
        ec ecVar3 = new ec(hashMap);
        hashMap2.put(cls, ecVar3);
        this.b.put(cls, Boolean.valueOf(z));
        return ecVar3;
    }
}
