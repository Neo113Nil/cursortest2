package defpackage;

import androidx.lifecycle.OnLifecycleEvent;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
final class aeb {
    static final aeb a = new aeb();
    private final Map c = new HashMap();
    public final Map b = new HashMap();

    private static final void d(Map map, aea aeaVar, aej aejVar, Class cls) {
        aej aejVar2 = (aej) map.get(aeaVar);
        if (aejVar2 == null || aejVar == aejVar2) {
            if (aejVar2 == null) {
                map.put(aeaVar, aejVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + aeaVar.b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + aejVar2.toString() + ", new value " + String.valueOf(aejVar));
    }

    public final Method[] a(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, java.util.Map] */
    public final chp b(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null) {
            hashMap.putAll(c(superclass).b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry entry : c(cls2).b.entrySet()) {
                d(hashMap, (aea) entry.getKey(), (aej) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = a(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            OnLifecycleEvent onLifecycleEvent = (OnLifecycleEvent) method.getAnnotation(OnLifecycleEvent.class);
            if (onLifecycleEvent != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                int length = parameterTypes.length;
                if (length <= 0) {
                    i = 0;
                } else {
                    if (!aer.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i = 1;
                }
                aej a2 = onLifecycleEvent.a();
                if (length > 1) {
                    if (!aej.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (a2 != aej.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                d(hashMap, new aea(i, method), a2, cls);
                z = true;
            }
        }
        chp chpVar = new chp(hashMap);
        this.c.put(cls, chpVar);
        this.b.put(cls, Boolean.valueOf(z));
        return chpVar;
    }

    final chp c(Class cls) {
        chp chpVar = (chp) this.c.get(cls);
        return chpVar != null ? chpVar : b(cls, null);
    }
}
