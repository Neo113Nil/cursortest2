package androidx.lifecycle;

import androidx.lifecycle.e;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class a {

    /* renamed from: c, reason: collision with root package name */
    static a f880c = new a();

    /* renamed from: a, reason: collision with root package name */
    private final Map<Class<?>, C0015a> f881a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Map<Class<?>, Boolean> f882b = new HashMap();

    /* renamed from: androidx.lifecycle.a$a, reason: collision with other inner class name */
    static class C0015a {

        /* renamed from: a, reason: collision with root package name */
        final Map<e.b, List<b>> f883a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        final Map<b, e.b> f884b;

        C0015a(Map<b, e.b> map) {
            this.f884b = map;
            for (Map.Entry<b, e.b> entry : map.entrySet()) {
                e.b value = entry.getValue();
                List<b> list = this.f883a.get(value);
                if (list == null) {
                    list = new ArrayList<>();
                    this.f883a.put(value, list);
                }
                list.add(entry.getKey());
            }
        }

        private static void b(List<b> list, i iVar, e.b bVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).a(iVar, bVar, obj);
                }
            }
        }

        void a(i iVar, e.b bVar, Object obj) {
            b(this.f883a.get(bVar), iVar, bVar, obj);
            b(this.f883a.get(e.b.ON_ANY), iVar, bVar, obj);
        }
    }

    static final class b {

        /* renamed from: a, reason: collision with root package name */
        final int f885a;

        /* renamed from: b, reason: collision with root package name */
        final Method f886b;

        b(int i7, Method method) {
            this.f885a = i7;
            this.f886b = method;
            method.setAccessible(true);
        }

        void a(i iVar, e.b bVar, Object obj) {
            try {
                int i7 = this.f885a;
                if (i7 == 0) {
                    this.f886b.invoke(obj, new Object[0]);
                } else if (i7 == 1) {
                    this.f886b.invoke(obj, iVar);
                } else {
                    if (i7 != 2) {
                        return;
                    }
                    this.f886b.invoke(obj, iVar, bVar);
                }
            } catch (IllegalAccessException e7) {
                throw new RuntimeException(e7);
            } catch (InvocationTargetException e8) {
                throw new RuntimeException("Failed to call observer method", e8.getCause());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f885a == bVar.f885a && this.f886b.getName().equals(bVar.f886b.getName());
        }

        public int hashCode() {
            return (this.f885a * 31) + this.f886b.getName().hashCode();
        }
    }

    a() {
    }

    private C0015a a(Class<?> cls, Method[] methodArr) {
        int i7;
        C0015a c7;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null && (c7 = c(superclass)) != null) {
            hashMap.putAll(c7.f884b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<b, e.b> entry : c(cls2).f884b.entrySet()) {
                e(hashMap, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = b(cls);
        }
        boolean z6 = false;
        for (Method method : methodArr) {
            q qVar = (q) method.getAnnotation(q.class);
            if (qVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i7 = 0;
                } else {
                    if (!parameterTypes[0].isAssignableFrom(i.class)) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i7 = 1;
                }
                e.b value = qVar.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(e.b.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (value != e.b.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i7 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                e(hashMap, new b(i7, method), value, cls);
                z6 = true;
            }
        }
        C0015a c0015a = new C0015a(hashMap);
        this.f881a.put(cls, c0015a);
        this.f882b.put(cls, Boolean.valueOf(z6));
        return c0015a;
    }

    private Method[] b(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e7) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e7);
        }
    }

    private void e(Map<b, e.b> map, b bVar, e.b bVar2, Class<?> cls) {
        e.b bVar3 = map.get(bVar);
        if (bVar3 == null || bVar2 == bVar3) {
            if (bVar3 == null) {
                map.put(bVar, bVar2);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + bVar.f886b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + bVar3 + ", new value " + bVar2);
    }

    C0015a c(Class<?> cls) {
        C0015a c0015a = this.f881a.get(cls);
        return c0015a != null ? c0015a : a(cls, null);
    }

    boolean d(Class<?> cls) {
        Boolean bool = this.f882b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] b7 = b(cls);
        for (Method method : b7) {
            if (((q) method.getAnnotation(q.class)) != null) {
                a(cls, b7);
                return true;
            }
        }
        this.f882b.put(cls, Boolean.FALSE);
        return false;
    }
}
