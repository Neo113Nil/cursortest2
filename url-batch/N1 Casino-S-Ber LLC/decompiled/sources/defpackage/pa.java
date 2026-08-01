package defpackage;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class pa {
    public static final pa c = new pa();
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();

    public static void b(HashMap hashMap, oa oaVar, up upVar, Class cls) {
        up upVar2 = (up) hashMap.get(oaVar);
        if (upVar2 == null || upVar == upVar2) {
            if (upVar2 == null) {
                hashMap.put(oaVar, upVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + oaVar.b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + upVar2 + ", new value " + upVar);
    }

    public final na a(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = this.a;
        if (superclass != null) {
            na naVar = (na) hashMap2.get(superclass);
            if (naVar == null) {
                naVar = a(superclass, null);
            }
            hashMap.putAll(naVar.b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            na naVar2 = (na) hashMap2.get(cls2);
            if (naVar2 == null) {
                naVar2 = a(cls2, null);
            }
            for (Map.Entry entry : naVar2.b.entrySet()) {
                b(hashMap, (oa) entry.getKey(), (up) entry.getValue(), cls);
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
            gw gwVar = (gw) method.getAnnotation(gw.class);
            if (gwVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!aq.class.isAssignableFrom(parameterTypes[0])) {
                        t8.k("invalid parameter type. Must be one and instanceof LifecycleOwner");
                        return null;
                    }
                    i = 1;
                }
                up value = gwVar.value();
                if (parameterTypes.length > 1) {
                    if (!up.class.isAssignableFrom(parameterTypes[1])) {
                        t8.k("invalid parameter type. second arg must be an event");
                        return null;
                    }
                    if (value != up.ON_ANY) {
                        t8.k("Second arg is supported only for ON_ANY value");
                        return null;
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    t8.k("cannot have more than 2 params");
                    return null;
                }
                b(hashMap, new oa(i, method), value, cls);
                z = true;
            }
        }
        na naVar3 = new na(hashMap);
        hashMap2.put(cls, naVar3);
        this.b.put(cls, Boolean.valueOf(z));
        return naVar3;
    }
}
