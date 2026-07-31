package androidx.lifecycle;

import androidx.lifecycle.AbstractC1346l;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1336b {

    /* renamed from: c, reason: collision with root package name */
    static C1336b f12628c = new C1336b();

    /* renamed from: a, reason: collision with root package name */
    private final Map f12629a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Map f12630b = new HashMap();

    /* renamed from: androidx.lifecycle.b$a */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        final Map f12631a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        final Map f12632b;

        a(Map map) {
            this.f12632b = map;
            for (Map.Entry entry : map.entrySet()) {
                AbstractC1346l.a aVar = (AbstractC1346l.a) entry.getValue();
                List list = (List) this.f12631a.get(aVar);
                if (list == null) {
                    list = new ArrayList();
                    this.f12631a.put(aVar, list);
                }
                list.add((C0111b) entry.getKey());
            }
        }

        private static void b(List list, InterfaceC1354u interfaceC1354u, AbstractC1346l.a aVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((C0111b) list.get(size)).a(interfaceC1354u, aVar, obj);
                }
            }
        }

        void a(InterfaceC1354u interfaceC1354u, AbstractC1346l.a aVar, Object obj) {
            b((List) this.f12631a.get(aVar), interfaceC1354u, aVar, obj);
            b((List) this.f12631a.get(AbstractC1346l.a.ON_ANY), interfaceC1354u, aVar, obj);
        }
    }

    /* renamed from: androidx.lifecycle.b$b, reason: collision with other inner class name */
    static final class C0111b {

        /* renamed from: a, reason: collision with root package name */
        final int f12633a;

        /* renamed from: b, reason: collision with root package name */
        final Method f12634b;

        C0111b(int i4, Method method) {
            this.f12633a = i4;
            this.f12634b = method;
            method.setAccessible(true);
        }

        void a(InterfaceC1354u interfaceC1354u, AbstractC1346l.a aVar, Object obj) {
            try {
                int i4 = this.f12633a;
                if (i4 == 0) {
                    this.f12634b.invoke(obj, null);
                } else if (i4 == 1) {
                    this.f12634b.invoke(obj, interfaceC1354u);
                } else {
                    if (i4 != 2) {
                        return;
                    }
                    this.f12634b.invoke(obj, interfaceC1354u, aVar);
                }
            } catch (IllegalAccessException e4) {
                throw new RuntimeException(e4);
            } catch (InvocationTargetException e5) {
                throw new RuntimeException("Failed to call observer method", e5.getCause());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0111b)) {
                return false;
            }
            C0111b c0111b = (C0111b) obj;
            return this.f12633a == c0111b.f12633a && this.f12634b.getName().equals(c0111b.f12634b.getName());
        }

        public int hashCode() {
            return (this.f12633a * 31) + this.f12634b.getName().hashCode();
        }
    }

    C1336b() {
    }

    private a a(Class cls, Method[] methodArr) {
        int i4;
        a c4;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null && (c4 = c(superclass)) != null) {
            hashMap.putAll(c4.f12632b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry entry : c(cls2).f12632b.entrySet()) {
                e(hashMap, (C0111b) entry.getKey(), (AbstractC1346l.a) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = b(cls);
        }
        boolean z4 = false;
        for (Method method : methodArr) {
            D d4 = (D) method.getAnnotation(D.class);
            if (d4 != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i4 = 0;
                } else {
                    if (!InterfaceC1354u.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i4 = 1;
                }
                AbstractC1346l.a value = d4.value();
                if (parameterTypes.length > 1) {
                    if (!AbstractC1346l.a.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (value != AbstractC1346l.a.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i4 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                e(hashMap, new C0111b(i4, method), value, cls);
                z4 = true;
            }
        }
        a aVar = new a(hashMap);
        this.f12629a.put(cls, aVar);
        this.f12630b.put(cls, Boolean.valueOf(z4));
        return aVar;
    }

    private Method[] b(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e4) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e4);
        }
    }

    private void e(Map map, C0111b c0111b, AbstractC1346l.a aVar, Class cls) {
        AbstractC1346l.a aVar2 = (AbstractC1346l.a) map.get(c0111b);
        if (aVar2 == null || aVar == aVar2) {
            if (aVar2 == null) {
                map.put(c0111b, aVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c0111b.f12634b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + aVar2 + ", new value " + aVar);
    }

    a c(Class cls) {
        a aVar = (a) this.f12629a.get(cls);
        return aVar != null ? aVar : a(cls, null);
    }

    boolean d(Class cls) {
        Boolean bool = (Boolean) this.f12630b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] b4 = b(cls);
        for (Method method : b4) {
            if (((D) method.getAnnotation(D.class)) != null) {
                a(cls, b4);
                return true;
            }
        }
        this.f12630b.put(cls, Boolean.FALSE);
        return false;
    }
}
