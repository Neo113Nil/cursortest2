package com.crrepa.o1;

import com.crrepa.l1.n;
import com.crrepa.l1.p;
import com.crrepa.l1.u;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class k implements p {

    /* renamed from: a, reason: collision with root package name */
    private final com.crrepa.n1.c f13507a;

    /* renamed from: b, reason: collision with root package name */
    private final com.crrepa.l1.d f13508b;

    /* renamed from: c, reason: collision with root package name */
    private final com.crrepa.n1.d f13509c;

    /* renamed from: d, reason: collision with root package name */
    private final e f13510d;

    /* renamed from: e, reason: collision with root package name */
    private final com.crrepa.q1.b f13511e = com.crrepa.q1.b.a();

    class a extends c {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Field f13512d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f13513e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ n f13514f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ com.crrepa.l1.e f13515g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ com.crrepa.s1.a f13516h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f13517i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, boolean z7, boolean z8, Field field, boolean z9, n nVar, com.crrepa.l1.e eVar, com.crrepa.s1.a aVar, boolean z10) {
            super(str, z7, z8);
            this.f13512d = field;
            this.f13513e = z9;
            this.f13514f = nVar;
            this.f13515g = eVar;
            this.f13516h = aVar;
            this.f13517i = z10;
        }

        @Override // com.crrepa.o1.k.c
        void a(com.crrepa.t1.a aVar, Object obj) {
            Object a8 = this.f13514f.a(aVar);
            if (a8 == null && this.f13517i) {
                return;
            }
            this.f13512d.set(obj, a8);
        }

        @Override // com.crrepa.o1.k.c
        void a(com.crrepa.t1.b bVar, Object obj) {
            (this.f13513e ? this.f13514f : new l(this.f13515g, this.f13514f, this.f13516h.b())).a(bVar, this.f13512d.get(obj));
        }

        @Override // com.crrepa.o1.k.c
        public boolean a(Object obj) {
            return this.f13522b && this.f13512d.get(obj) != obj;
        }
    }

    public static final class b extends n {

        /* renamed from: a, reason: collision with root package name */
        private final com.crrepa.n1.g f13519a;

        /* renamed from: b, reason: collision with root package name */
        private final Map<String, c> f13520b;

        b(com.crrepa.n1.g gVar, Map<String, c> map) {
            this.f13519a = gVar;
            this.f13520b = map;
        }

        @Override // com.crrepa.l1.n
        public Object a(com.crrepa.t1.a aVar) {
            if (aVar.t() == com.crrepa.t1.c.NULL) {
                aVar.q();
                return null;
            }
            Object a8 = this.f13519a.a();
            try {
                aVar.b();
                while (aVar.i()) {
                    c cVar = this.f13520b.get(aVar.p());
                    if (cVar != null && cVar.f13523c) {
                        cVar.a(aVar, a8);
                    }
                    aVar.z();
                }
                aVar.g();
                return a8;
            } catch (IllegalAccessException e8) {
                throw new AssertionError(e8);
            } catch (IllegalStateException e9) {
                throw new u(e9);
            }
        }

        @Override // com.crrepa.l1.n
        public void a(com.crrepa.t1.b bVar, Object obj) {
            if (obj == null) {
                bVar.k();
                return;
            }
            bVar.d();
            try {
                for (c cVar : this.f13520b.values()) {
                    if (cVar.a(obj)) {
                        bVar.b(cVar.f13521a);
                        cVar.a(bVar, obj);
                    }
                }
                bVar.f();
            } catch (IllegalAccessException e8) {
                throw new AssertionError(e8);
            }
        }
    }

    static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        final String f13521a;

        /* renamed from: b, reason: collision with root package name */
        final boolean f13522b;

        /* renamed from: c, reason: collision with root package name */
        final boolean f13523c;

        protected c(String str, boolean z7, boolean z8) {
            this.f13521a = str;
            this.f13522b = z7;
            this.f13523c = z8;
        }

        abstract void a(com.crrepa.t1.a aVar, Object obj);

        abstract void a(com.crrepa.t1.b bVar, Object obj);

        abstract boolean a(Object obj);
    }

    public k(com.crrepa.n1.c cVar, com.crrepa.l1.d dVar, com.crrepa.n1.d dVar2, e eVar) {
        this.f13507a = cVar;
        this.f13508b = dVar;
        this.f13509c = dVar2;
        this.f13510d = eVar;
    }

    @Override // com.crrepa.l1.p
    public <T> n a(com.crrepa.l1.e eVar, com.crrepa.s1.a aVar) {
        Class<Object> a8 = aVar.a();
        if (Object.class.isAssignableFrom(a8)) {
            return new b(this.f13507a.a(aVar), a(eVar, aVar, (Class<?>) a8));
        }
        return null;
    }

    private c a(com.crrepa.l1.e eVar, Field field, String str, com.crrepa.s1.a aVar, boolean z7, boolean z8) {
        boolean a8 = com.crrepa.n1.k.a((Type) aVar.a());
        i4.b bVar = (i4.b) field.getAnnotation(i4.b.class);
        n a9 = bVar != null ? this.f13510d.a(this.f13507a, eVar, aVar, bVar) : null;
        boolean z9 = a9 != null;
        if (a9 == null) {
            a9 = eVar.a(aVar);
        }
        return new a(str, z7, z8, field, z9, a9, eVar, aVar, a8);
    }

    private List<String> a(Field field) {
        i4.c cVar = (i4.c) field.getAnnotation(i4.c.class);
        if (cVar == null) {
            return Collections.singletonList(this.f13508b.a(field));
        }
        String value = cVar.value();
        String[] alternate = cVar.alternate();
        if (alternate.length == 0) {
            return Collections.singletonList(value);
        }
        ArrayList arrayList = new ArrayList(alternate.length + 1);
        arrayList.add(value);
        for (String str : alternate) {
            arrayList.add(str);
        }
        return arrayList;
    }

    private Map<String, c> a(com.crrepa.l1.e eVar, com.crrepa.s1.a aVar, Class<?> cls) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap;
        }
        Type b8 = aVar.b();
        com.crrepa.s1.a aVar2 = aVar;
        Class<?> cls2 = cls;
        while (cls2 != Object.class) {
            Field[] declaredFields = cls2.getDeclaredFields();
            int length = declaredFields.length;
            boolean z7 = false;
            int i8 = 0;
            while (i8 < length) {
                Field field = declaredFields[i8];
                boolean a8 = a(field, true);
                boolean a9 = a(field, z7);
                if (a8 || a9) {
                    this.f13511e.a(field);
                    Type a10 = com.crrepa.n1.b.a(aVar2.b(), cls2, field.getGenericType());
                    List<String> a11 = a(field);
                    int size = a11.size();
                    c cVar = null;
                    int i9 = 0;
                    while (i9 < size) {
                        String str = a11.get(i9);
                        boolean z8 = i9 != 0 ? false : a8;
                        int i10 = i9;
                        c cVar2 = cVar;
                        int i11 = size;
                        List<String> list = a11;
                        Field field2 = field;
                        cVar = cVar2 == null ? (c) linkedHashMap.put(str, a(eVar, field, str, com.crrepa.s1.a.a(a10), z8, a9)) : cVar2;
                        i9 = i10 + 1;
                        a8 = z8;
                        a11 = list;
                        size = i11;
                        field = field2;
                    }
                    c cVar3 = cVar;
                    if (cVar3 != null) {
                        throw new IllegalArgumentException(b8 + " declares multiple JSON fields named " + cVar3.f13521a);
                    }
                }
                i8++;
                z7 = false;
            }
            aVar2 = com.crrepa.s1.a.a(com.crrepa.n1.b.a(aVar2.b(), cls2, cls2.getGenericSuperclass()));
            cls2 = aVar2.a();
        }
        return linkedHashMap;
    }

    public boolean a(Field field, boolean z7) {
        return a(field, z7, this.f13509c);
    }

    static boolean a(Field field, boolean z7, com.crrepa.n1.d dVar) {
        return (dVar.a(field.getType(), z7) || dVar.a(field, z7)) ? false : true;
    }
}
