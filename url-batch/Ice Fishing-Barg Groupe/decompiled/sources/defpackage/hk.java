package defpackage;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class hk {
    public static final hk TSizfFm2Yiuu = new hk();
    public final HashMap PxuCJdSBwIXG = new HashMap();
    public final HashMap lS5Rgt96tfkO = new HashMap();

    public static void lS5Rgt96tfkO(HashMap hashMap, gk gkVar, e01 e01Var, Class cls) {
        e01 e01Var2 = (e01) hashMap.get(gkVar);
        if (e01Var2 == null || e01Var == e01Var2) {
            if (e01Var2 == null) {
                hashMap.put(gkVar, e01Var);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + gkVar.lS5Rgt96tfkO.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + String.valueOf(e01Var2) + ", new value " + String.valueOf(e01Var));
    }

    public final fk PxuCJdSBwIXG(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = this.PxuCJdSBwIXG;
        if (superclass != null) {
            fk fkVar = (fk) hashMap2.get(superclass);
            if (fkVar == null) {
                fkVar = PxuCJdSBwIXG(superclass, null);
            }
            hashMap.putAll(fkVar.lS5Rgt96tfkO);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            fk fkVar2 = (fk) hashMap2.get(cls2);
            if (fkVar2 == null) {
                fkVar2 = PxuCJdSBwIXG(cls2, null);
            }
            for (Map.Entry entry : fkVar2.lS5Rgt96tfkO.entrySet()) {
                lS5Rgt96tfkO(hashMap, (gk) entry.getKey(), (e01) entry.getValue(), cls);
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
            zf1 zf1Var = (zf1) method.getAnnotation(zf1.class);
            if (zf1Var != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!o01.class.isAssignableFrom(parameterTypes[0])) {
                        u9.XL4ISE6Oc65B("invalid parameter type. Must be one and instanceof LifecycleOwner");
                        return null;
                    }
                    i = 1;
                }
                e01 value = zf1Var.value();
                if (parameterTypes.length > 1) {
                    if (!e01.class.isAssignableFrom(parameterTypes[1])) {
                        u9.XL4ISE6Oc65B("invalid parameter type. second arg must be an event");
                        return null;
                    }
                    if (value != e01.ON_ANY) {
                        u9.XL4ISE6Oc65B("Second arg is supported only for ON_ANY value");
                        return null;
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    u9.XL4ISE6Oc65B("cannot have more than 2 params");
                    return null;
                }
                lS5Rgt96tfkO(hashMap, new gk(i, method), value, cls);
                z = true;
            }
        }
        fk fkVar3 = new fk(hashMap);
        hashMap2.put(cls, fkVar3);
        this.lS5Rgt96tfkO.put(cls, Boolean.valueOf(z));
        return fkVar3;
    }
}
