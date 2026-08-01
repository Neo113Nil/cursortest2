package defpackage;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class ta {
    public static final ta c = new ta();
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();

    public static void b(HashMap hashMap, sa saVar, gq gqVar, Class cls) {
        gq gqVar2 = (gq) hashMap.get(saVar);
        if (gqVar2 == null || gqVar == gqVar2) {
            if (gqVar2 == null) {
                hashMap.put(saVar, gqVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + saVar.b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + gqVar2 + ", new value " + gqVar);
    }

    public final ra a(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = this.a;
        if (superclass != null) {
            ra raVar = (ra) hashMap2.get(superclass);
            if (raVar == null) {
                raVar = a(superclass, null);
            }
            hashMap.putAll(raVar.b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            ra raVar2 = (ra) hashMap2.get(cls2);
            if (raVar2 == null) {
                raVar2 = a(cls2, null);
            }
            for (Map.Entry entry : raVar2.b.entrySet()) {
                b(hashMap, (sa) entry.getKey(), (gq) entry.getValue(), cls);
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
            pw pwVar = (pw) method.getAnnotation(pw.class);
            if (pwVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!nq.class.isAssignableFrom(parameterTypes[0])) {
                        o8.j("invalid parameter type. Must be one and instanceof LifecycleOwner");
                        return null;
                    }
                    i = 1;
                }
                gq value = pwVar.value();
                if (parameterTypes.length > 1) {
                    if (!gq.class.isAssignableFrom(parameterTypes[1])) {
                        o8.j("invalid parameter type. second arg must be an event");
                        return null;
                    }
                    if (value != gq.ON_ANY) {
                        o8.j("Second arg is supported only for ON_ANY value");
                        return null;
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    o8.j("cannot have more than 2 params");
                    return null;
                }
                b(hashMap, new sa(i, method), value, cls);
                z = true;
            }
        }
        ra raVar3 = new ra(hashMap);
        hashMap2.put(cls, raVar3);
        this.b.put(cls, Boolean.valueOf(z));
        return raVar3;
    }
}
