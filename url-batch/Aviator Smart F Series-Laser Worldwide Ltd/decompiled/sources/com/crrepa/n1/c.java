package com.crrepa.n1;

import cn.hutool.core.convert.impl.s;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final Map<Type, Object> f13395a;

    /* renamed from: b, reason: collision with root package name */
    private final com.crrepa.q1.b f13396b = com.crrepa.q1.b.a();

    class a implements com.crrepa.n1.g {
        a() {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [T, java.util.concurrent.ConcurrentHashMap] */
        @Override // com.crrepa.n1.g
        public T a() {
            return new ConcurrentHashMap();
        }
    }

    class b implements com.crrepa.n1.g {
        b() {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [T, java.util.TreeMap] */
        @Override // com.crrepa.n1.g
        public T a() {
            return new TreeMap();
        }
    }

    /* renamed from: com.crrepa.n1.c$c, reason: collision with other inner class name */
    class C0230c implements com.crrepa.n1.g {
        C0230c() {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [T, java.util.LinkedHashMap] */
        @Override // com.crrepa.n1.g
        public T a() {
            return new LinkedHashMap();
        }
    }

    class d implements com.crrepa.n1.g {
        d() {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [T, com.crrepa.n1.j] */
        @Override // com.crrepa.n1.g
        public T a() {
            return new com.crrepa.n1.j();
        }
    }

    class e implements com.crrepa.n1.g {

        /* renamed from: a, reason: collision with root package name */
        private final m f13401a = m.a();

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Class f13402b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Type f13403c;

        e(Class cls, Type type) {
            this.f13402b = cls;
            this.f13403c = type;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
        @Override // com.crrepa.n1.g
        public T a() {
            try {
                return this.f13401a.b(this.f13402b);
            } catch (Exception e8) {
                throw new RuntimeException("Unable to invoke no-args constructor for " + this.f13403c + ". Registering an InstanceCreator with Gson for this type may fix this problem.", e8);
            }
        }
    }

    class f implements com.crrepa.n1.g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Constructor f13405a;

        f(Constructor constructor) {
            this.f13405a = constructor;
        }

        /* JADX WARN: Type inference failed for: r0v6, types: [T, java.lang.Object] */
        @Override // com.crrepa.n1.g
        public T a() {
            try {
                return this.f13405a.newInstance(null);
            } catch (IllegalAccessException e8) {
                throw new AssertionError(e8);
            } catch (InstantiationException e9) {
                throw new RuntimeException("Failed to invoke " + this.f13405a + " with no args", e9);
            } catch (InvocationTargetException e10) {
                throw new RuntimeException("Failed to invoke " + this.f13405a + " with no args", e10.getTargetException());
            }
        }
    }

    class g implements com.crrepa.n1.g {
        g() {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [T, java.util.TreeSet] */
        @Override // com.crrepa.n1.g
        public T a() {
            return new TreeSet();
        }
    }

    class h implements com.crrepa.n1.g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Type f13408a;

        h(Type type) {
            this.f13408a = type;
        }

        /* JADX WARN: Type inference failed for: r0v7, types: [T, java.util.EnumSet] */
        @Override // com.crrepa.n1.g
        public T a() {
            Type type = this.f13408a;
            if (!(type instanceof ParameterizedType)) {
                throw new com.crrepa.l1.l("Invalid EnumSet type: " + this.f13408a.toString());
            }
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return EnumSet.noneOf((Class) type2);
            }
            throw new com.crrepa.l1.l("Invalid EnumSet type: " + this.f13408a.toString());
        }
    }

    class i implements com.crrepa.n1.g {
        i() {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [T, java.util.LinkedHashSet] */
        @Override // com.crrepa.n1.g
        public T a() {
            return new LinkedHashSet();
        }
    }

    class j implements com.crrepa.n1.g {
        j() {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [T, java.util.ArrayDeque] */
        @Override // com.crrepa.n1.g
        public T a() {
            return new ArrayDeque();
        }
    }

    class k implements com.crrepa.n1.g {
        k() {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [T, java.util.ArrayList] */
        @Override // com.crrepa.n1.g
        public T a() {
            return new ArrayList();
        }
    }

    class l implements com.crrepa.n1.g {
        l() {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [T, java.util.concurrent.ConcurrentSkipListMap] */
        @Override // com.crrepa.n1.g
        public T a() {
            return new ConcurrentSkipListMap();
        }
    }

    public c(Map<Type, Object> map) {
        this.f13395a = map;
    }

    private <T> com.crrepa.n1.g b(Type type, Class<? super T> cls) {
        return new e(cls, type);
    }

    public <T> com.crrepa.n1.g a(com.crrepa.s1.a aVar) {
        Type b8 = aVar.b();
        Class<Object> a8 = aVar.a();
        s.a(this.f13395a.get(b8));
        s.a(this.f13395a.get(a8));
        com.crrepa.n1.g a9 = a(a8);
        if (a9 != null) {
            return a9;
        }
        com.crrepa.n1.g a10 = a(b8, a8);
        return a10 != null ? a10 : b(b8, a8);
    }

    public String toString() {
        return this.f13395a.toString();
    }

    private <T> com.crrepa.n1.g a(Class<? super T> cls) {
        try {
            Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                this.f13396b.a(declaredConstructor);
            }
            return new f(declaredConstructor);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    private <T> com.crrepa.n1.g a(Type type, Class<? super T> cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            return SortedSet.class.isAssignableFrom(cls) ? new g() : EnumSet.class.isAssignableFrom(cls) ? new h(type) : Set.class.isAssignableFrom(cls) ? new i() : Queue.class.isAssignableFrom(cls) ? new j() : new k();
        }
        if (Map.class.isAssignableFrom(cls)) {
            return ConcurrentNavigableMap.class.isAssignableFrom(cls) ? new l() : ConcurrentMap.class.isAssignableFrom(cls) ? new a() : SortedMap.class.isAssignableFrom(cls) ? new b() : (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(com.crrepa.s1.a.a(((ParameterizedType) type).getActualTypeArguments()[0]).a())) ? new d() : new C0230c();
        }
        return null;
    }
}
