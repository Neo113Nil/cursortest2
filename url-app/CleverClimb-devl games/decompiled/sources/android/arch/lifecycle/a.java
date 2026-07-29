package android.arch.lifecycle;

import android.arch.lifecycle.c;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: ClassesInfoCache.java */
/* loaded from: classes.dex */
class a {

    /* renamed from: a, reason: collision with root package name */
    static a f1351a = new a();

    /* renamed from: b, reason: collision with root package name */
    private final Map<Class, C0001a> f1352b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Map<Class, Boolean> f1353c = new HashMap();

    a() {
    }

    boolean a(Class cls) {
        if (this.f1353c.containsKey(cls)) {
            return this.f1353c.get(cls).booleanValue();
        }
        Method[] c2 = c(cls);
        for (Method method : c2) {
            if (((l) method.getAnnotation(l.class)) != null) {
                a(cls, c2);
                return true;
            }
        }
        this.f1353c.put(cls, false);
        return false;
    }

    private Method[] c(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }

    C0001a b(Class cls) {
        C0001a c0001a = this.f1352b.get(cls);
        return c0001a != null ? c0001a : a(cls, null);
    }

    private void a(Map<b, c.a> map, b bVar, c.a aVar, Class cls) {
        c.a aVar2 = map.get(bVar);
        if (aVar2 == null || aVar == aVar2) {
            if (aVar2 == null) {
                map.put(bVar, aVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + bVar.f1357b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + aVar2 + ", new value " + aVar);
    }

    private C0001a a(Class cls, Method[] methodArr) {
        int i;
        C0001a b2;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null && (b2 = b(superclass)) != null) {
            hashMap.putAll(b2.f1355b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<b, c.a> entry : b(cls2).f1355b.entrySet()) {
                a(hashMap, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = c(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            l lVar = (l) method.getAnnotation(l.class);
            if (lVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!parameterTypes[0].isAssignableFrom(e.class)) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i = 1;
                }
                c.a a2 = lVar.a();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(c.a.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (a2 != c.a.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                a(hashMap, new b(i, method), a2, cls);
                z = true;
            }
        }
        C0001a c0001a = new C0001a(hashMap);
        this.f1352b.put(cls, c0001a);
        this.f1353c.put(cls, Boolean.valueOf(z));
        return c0001a;
    }

    /* compiled from: ClassesInfoCache.java */
    /* renamed from: android.arch.lifecycle.a$a, reason: collision with other inner class name */
    static class C0001a {

        /* renamed from: a, reason: collision with root package name */
        final Map<c.a, List<b>> f1354a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        final Map<b, c.a> f1355b;

        C0001a(Map<b, c.a> map) {
            this.f1355b = map;
            for (Map.Entry<b, c.a> entry : map.entrySet()) {
                c.a value = entry.getValue();
                List<b> list = this.f1354a.get(value);
                if (list == null) {
                    list = new ArrayList<>();
                    this.f1354a.put(value, list);
                }
                list.add(entry.getKey());
            }
        }

        void a(e eVar, c.a aVar, Object obj) {
            a(this.f1354a.get(aVar), eVar, aVar, obj);
            a(this.f1354a.get(c.a.ON_ANY), eVar, aVar, obj);
        }

        private static void a(List<b> list, e eVar, c.a aVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).a(eVar, aVar, obj);
                }
            }
        }
    }

    /* compiled from: ClassesInfoCache.java */
    static class b {

        /* renamed from: a, reason: collision with root package name */
        final int f1356a;

        /* renamed from: b, reason: collision with root package name */
        final Method f1357b;

        b(int i, Method method) {
            this.f1356a = i;
            this.f1357b = method;
            this.f1357b.setAccessible(true);
        }

        void a(e eVar, c.a aVar, Object obj) {
            try {
                switch (this.f1356a) {
                    case 0:
                        this.f1357b.invoke(obj, new Object[0]);
                        return;
                    case 1:
                        this.f1357b.invoke(obj, eVar);
                        return;
                    case 2:
                        this.f1357b.invoke(obj, eVar, aVar);
                        return;
                    default:
                        return;
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e2) {
                throw new RuntimeException("Failed to call observer method", e2.getCause());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.f1356a == bVar.f1356a && this.f1357b.getName().equals(bVar.f1357b.getName());
        }

        public int hashCode() {
            return (this.f1356a * 31) + this.f1357b.getName().hashCode();
        }
    }
}
