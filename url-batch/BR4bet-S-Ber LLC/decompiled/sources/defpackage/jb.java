package defpackage;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class jb {
    public static final jb c = new jb();
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();

    public static void b(HashMap hashMap, ib ibVar, gs gsVar, Class cls) {
        gs gsVar2 = (gs) hashMap.get(ibVar);
        if (gsVar2 == null || gsVar == gsVar2) {
            if (gsVar2 == null) {
                hashMap.put(ibVar, gsVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + ibVar.b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + gsVar2 + ", new value " + gsVar);
    }

    public final hb a(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = this.a;
        if (superclass != null) {
            hb hbVar = (hb) hashMap2.get(superclass);
            if (hbVar == null) {
                hbVar = a(superclass, null);
            }
            hashMap.putAll(hbVar.b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            hb hbVar2 = (hb) hashMap2.get(cls2);
            if (hbVar2 == null) {
                hbVar2 = a(cls2, null);
            }
            for (Map.Entry entry : hbVar2.b.entrySet()) {
                b(hashMap, (ib) entry.getKey(), (gs) entry.getValue(), cls);
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
            jz jzVar = (jz) method.getAnnotation(jz.class);
            if (jzVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!ms.class.isAssignableFrom(parameterTypes[0])) {
                        g9.i("invalid parameter type. Must be one and instanceof LifecycleOwner");
                        return null;
                    }
                    i = 1;
                }
                gs value = jzVar.value();
                if (parameterTypes.length > 1) {
                    if (!gs.class.isAssignableFrom(parameterTypes[1])) {
                        g9.i("invalid parameter type. second arg must be an event");
                        return null;
                    }
                    if (value != gs.ON_ANY) {
                        g9.i("Second arg is supported only for ON_ANY value");
                        return null;
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    g9.i("cannot have more than 2 params");
                    return null;
                }
                b(hashMap, new ib(i, method), value, cls);
                z = true;
            }
        }
        hb hbVar3 = new hb(hashMap);
        hashMap2.put(cls, hbVar3);
        this.b.put(cls, Boolean.valueOf(z));
        return hbVar3;
    }
}
