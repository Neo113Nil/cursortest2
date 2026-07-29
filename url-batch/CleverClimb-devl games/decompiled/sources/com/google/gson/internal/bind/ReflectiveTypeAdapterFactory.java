package com.google.gson.internal.bind;

import com.google.gson.internal.Excluder;
import com.google.gson.r;
import com.google.gson.t;
import com.google.gson.u;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class ReflectiveTypeAdapterFactory implements u {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.gson.internal.c f6548a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.gson.d f6549b;

    /* renamed from: c, reason: collision with root package name */
    private final Excluder f6550c;

    /* renamed from: d, reason: collision with root package name */
    private final JsonAdapterAnnotationTypeAdapterFactory f6551d;
    private final com.google.gson.internal.a.b e = com.google.gson.internal.a.b.a();

    public ReflectiveTypeAdapterFactory(com.google.gson.internal.c cVar, com.google.gson.d dVar, Excluder excluder, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory) {
        this.f6548a = cVar;
        this.f6549b = dVar;
        this.f6550c = excluder;
        this.f6551d = jsonAdapterAnnotationTypeAdapterFactory;
    }

    public boolean a(Field field, boolean z) {
        return a(field, z, this.f6550c);
    }

    static boolean a(Field field, boolean z, Excluder excluder) {
        return (excluder.a(field.getType(), z) || excluder.a(field, z)) ? false : true;
    }

    private List<String> a(Field field) {
        com.google.gson.a.c cVar = (com.google.gson.a.c) field.getAnnotation(com.google.gson.a.c.class);
        if (cVar == null) {
            return Collections.singletonList(this.f6549b.a(field));
        }
        String a2 = cVar.a();
        String[] b2 = cVar.b();
        if (b2.length == 0) {
            return Collections.singletonList(a2);
        }
        ArrayList arrayList = new ArrayList(b2.length + 1);
        arrayList.add(a2);
        for (String str : b2) {
            arrayList.add(str);
        }
        return arrayList;
    }

    @Override // com.google.gson.u
    public <T> t<T> a(com.google.gson.e eVar, com.google.gson.b.a<T> aVar) {
        Class<? super T> rawType = aVar.getRawType();
        if (Object.class.isAssignableFrom(rawType)) {
            return new a(this.f6548a.a(aVar), a(eVar, (com.google.gson.b.a<?>) aVar, (Class<?>) rawType));
        }
        return null;
    }

    private b a(final com.google.gson.e eVar, final Field field, String str, final com.google.gson.b.a<?> aVar, boolean z, boolean z2) {
        final boolean a2 = com.google.gson.internal.i.a((Type) aVar.getRawType());
        com.google.gson.a.b bVar = (com.google.gson.a.b) field.getAnnotation(com.google.gson.a.b.class);
        t<?> a3 = bVar != null ? this.f6551d.a(this.f6548a, eVar, aVar, bVar) : null;
        final boolean z3 = a3 != null;
        if (a3 == null) {
            a3 = eVar.a((com.google.gson.b.a) aVar);
        }
        final t<?> tVar = a3;
        return new b(str, z, z2) { // from class: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.1
            @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.b
            void a(com.google.gson.c.c cVar, Object obj) throws IOException, IllegalAccessException {
                (z3 ? tVar : new h(eVar, tVar, aVar.getType())).a(cVar, field.get(obj));
            }

            @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.b
            void a(com.google.gson.c.a aVar2, Object obj) throws IOException, IllegalAccessException {
                Object b2 = tVar.b(aVar2);
                if (b2 == null && a2) {
                    return;
                }
                field.set(obj, b2);
            }

            @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.b
            public boolean a(Object obj) throws IOException, IllegalAccessException {
                return this.i && field.get(obj) != obj;
            }
        };
    }

    private Map<String, b> a(com.google.gson.e eVar, com.google.gson.b.a<?> aVar, Class<?> cls) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap;
        }
        Type type = aVar.getType();
        com.google.gson.b.a<?> aVar2 = aVar;
        Class<?> cls2 = cls;
        while (cls2 != Object.class) {
            Field[] declaredFields = cls2.getDeclaredFields();
            int length = declaredFields.length;
            boolean z = false;
            int i = 0;
            while (i < length) {
                Field field = declaredFields[i];
                boolean a2 = a(field, true);
                boolean a3 = a(field, z);
                if (a2 || a3) {
                    this.e.a(field);
                    Type a4 = com.google.gson.internal.b.a(aVar2.getType(), cls2, field.getGenericType());
                    List<String> a5 = a(field);
                    int size = a5.size();
                    b bVar = null;
                    int i2 = 0;
                    while (i2 < size) {
                        String str = a5.get(i2);
                        boolean z2 = i2 != 0 ? false : a2;
                        b bVar2 = bVar;
                        int i3 = i2;
                        int i4 = size;
                        List<String> list = a5;
                        Field field2 = field;
                        bVar = bVar2 == null ? (b) linkedHashMap.put(str, a(eVar, field, str, com.google.gson.b.a.get(a4), z2, a3)) : bVar2;
                        i2 = i3 + 1;
                        a2 = z2;
                        a5 = list;
                        size = i4;
                        field = field2;
                    }
                    b bVar3 = bVar;
                    if (bVar3 != null) {
                        throw new IllegalArgumentException(type + " declares multiple JSON fields named " + bVar3.h);
                    }
                }
                i++;
                z = false;
            }
            aVar2 = com.google.gson.b.a.get(com.google.gson.internal.b.a(aVar2.getType(), cls2, cls2.getGenericSuperclass()));
            cls2 = aVar2.getRawType();
        }
        return linkedHashMap;
    }

    static abstract class b {
        final String h;
        final boolean i;
        final boolean j;

        abstract void a(com.google.gson.c.a aVar, Object obj) throws IOException, IllegalAccessException;

        abstract void a(com.google.gson.c.c cVar, Object obj) throws IOException, IllegalAccessException;

        abstract boolean a(Object obj) throws IOException, IllegalAccessException;

        protected b(String str, boolean z, boolean z2) {
            this.h = str;
            this.i = z;
            this.j = z2;
        }
    }

    public static final class a<T> extends t<T> {

        /* renamed from: a, reason: collision with root package name */
        private final com.google.gson.internal.g<T> f6556a;

        /* renamed from: b, reason: collision with root package name */
        private final Map<String, b> f6557b;

        a(com.google.gson.internal.g<T> gVar, Map<String, b> map) {
            this.f6556a = gVar;
            this.f6557b = map;
        }

        @Override // com.google.gson.t
        public T b(com.google.gson.c.a aVar) throws IOException {
            if (aVar.f() == com.google.gson.c.b.NULL) {
                aVar.j();
                return null;
            }
            T a2 = this.f6556a.a();
            try {
                aVar.c();
                while (aVar.e()) {
                    b bVar = this.f6557b.get(aVar.g());
                    if (bVar != null && bVar.j) {
                        bVar.a(aVar, a2);
                    }
                    aVar.n();
                }
                aVar.d();
                return a2;
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (IllegalStateException e2) {
                throw new r(e2);
            }
        }

        @Override // com.google.gson.t
        public void a(com.google.gson.c.c cVar, T t) throws IOException {
            if (t == null) {
                cVar.f();
                return;
            }
            cVar.d();
            try {
                for (b bVar : this.f6557b.values()) {
                    if (bVar.a(t)) {
                        cVar.a(bVar.h);
                        bVar.a(cVar, t);
                    }
                }
                cVar.e();
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }
    }
}
