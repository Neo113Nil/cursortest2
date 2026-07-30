package defpackage;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class bh {
    public static final bh c = new bh();
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();

    public static void b(HashMap hashMap, ah ahVar, ng0 ng0Var, Class cls) {
        ng0 ng0Var2 = (ng0) hashMap.get(ahVar);
        if (ng0Var2 == null || ng0Var == ng0Var2) {
            if (ng0Var2 == null) {
                hashMap.put(ahVar, ng0Var);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + ahVar.b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + ng0Var2 + ", new value " + ng0Var);
    }

    public final zg a(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = this.a;
        if (superclass != null) {
            zg zgVar = (zg) hashMap2.get(superclass);
            if (zgVar == null) {
                zgVar = a(superclass, null);
            }
            hashMap.putAll(zgVar.b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            zg zgVar2 = (zg) hashMap2.get(cls2);
            if (zgVar2 == null) {
                zgVar2 = a(cls2, null);
            }
            for (Map.Entry entry : zgVar2.b.entrySet()) {
                b(hashMap, (ah) entry.getKey(), (ng0) entry.getValue(), cls);
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
            pr0 pr0Var = (pr0) method.getAnnotation(pr0.class);
            if (pr0Var != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!vg0.class.isAssignableFrom(parameterTypes[0])) {
                        dd0.e("invalid parameter type. Must be one and instanceof LifecycleOwner");
                        return null;
                    }
                    i = 1;
                }
                ng0 value = pr0Var.value();
                if (parameterTypes.length > 1) {
                    if (!ng0.class.isAssignableFrom(parameterTypes[1])) {
                        dd0.e("invalid parameter type. second arg must be an event");
                        return null;
                    }
                    if (value != ng0.ON_ANY) {
                        dd0.e("Second arg is supported only for ON_ANY value");
                        return null;
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    dd0.e("cannot have more than 2 params");
                    return null;
                }
                b(hashMap, new ah(i, method), value, cls);
                z = true;
            }
        }
        zg zgVar3 = new zg(hashMap);
        hashMap2.put(cls, zgVar3);
        this.b.put(cls, Boolean.valueOf(z));
        return zgVar3;
    }
}
