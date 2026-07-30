package defpackage;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ju {
    public static final ju c = new ju();
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();

    public static void b(HashMap hashMap, iu iuVar, yc1 yc1Var, Class cls) {
        yc1 yc1Var2 = (yc1) hashMap.get(iuVar);
        if (yc1Var2 == null || yc1Var == yc1Var2) {
            if (yc1Var2 == null) {
                hashMap.put(iuVar, yc1Var);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + iuVar.b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + yc1Var2 + ", new value " + yc1Var);
    }

    public final hu a(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = this.a;
        if (superclass != null) {
            hu huVar = (hu) hashMap2.get(superclass);
            if (huVar == null) {
                huVar = a(superclass, null);
            }
            hashMap.putAll(huVar.b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            hu huVar2 = (hu) hashMap2.get(cls2);
            if (huVar2 == null) {
                huVar2 = a(cls2, null);
            }
            for (Map.Entry entry : huVar2.b.entrySet()) {
                b(hashMap, (iu) entry.getKey(), (yc1) entry.getValue(), cls);
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
            zu1 zu1Var = (zu1) method.getAnnotation(zu1.class);
            if (zu1Var != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!id1.class.isAssignableFrom(parameterTypes[0])) {
                        lh.e("invalid parameter type. Must be one and instanceof LifecycleOwner");
                        return null;
                    }
                    i = 1;
                }
                yc1 value = zu1Var.value();
                if (parameterTypes.length > 1) {
                    if (!yc1.class.isAssignableFrom(parameterTypes[1])) {
                        lh.e("invalid parameter type. second arg must be an event");
                        return null;
                    }
                    if (value != yc1.ON_ANY) {
                        lh.e("Second arg is supported only for ON_ANY value");
                        return null;
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    lh.e("cannot have more than 2 params");
                    return null;
                }
                b(hashMap, new iu(i, method), value, cls);
                z = true;
            }
        }
        hu huVar3 = new hu(hashMap);
        hashMap2.put(cls, huVar3);
        this.b.put(cls, Boolean.valueOf(z));
        return huVar3;
    }
}
