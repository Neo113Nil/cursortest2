package com.google.gson;

import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.CollectionTypeAdapterFactory;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.MapTypeAdapterFactory;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* compiled from: Gson.java */
/* loaded from: classes2.dex */
public final class e {
    private static final com.google.gson.b.a<?> r = com.google.gson.b.a.get(Object.class);

    /* renamed from: a, reason: collision with root package name */
    final List<u> f6509a;

    /* renamed from: b, reason: collision with root package name */
    final Excluder f6510b;

    /* renamed from: c, reason: collision with root package name */
    final d f6511c;

    /* renamed from: d, reason: collision with root package name */
    final Map<Type, f<?>> f6512d;
    final boolean e;
    final boolean f;
    final boolean g;
    final boolean h;
    final boolean i;
    final boolean j;
    final boolean k;
    final String l;
    final int m;
    final int n;
    final s o;
    final List<u> p;
    final List<u> q;
    private final ThreadLocal<Map<com.google.gson.b.a<?>, a<?>>> s;
    private final Map<com.google.gson.b.a<?>, t<?>> t;
    private final com.google.gson.internal.c u;
    private final JsonAdapterAnnotationTypeAdapterFactory v;

    public e() {
        this(Excluder.f6519a, c.IDENTITY, Collections.emptyMap(), false, false, false, true, false, false, false, s.DEFAULT, null, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList());
    }

    e(Excluder excluder, d dVar, Map<Type, f<?>> map, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, s sVar, String str, int i, int i2, List<u> list, List<u> list2, List<u> list3) {
        this.s = new ThreadLocal<>();
        this.t = new ConcurrentHashMap();
        this.f6510b = excluder;
        this.f6511c = dVar;
        this.f6512d = map;
        this.u = new com.google.gson.internal.c(map);
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = z5;
        this.j = z6;
        this.k = z7;
        this.o = sVar;
        this.l = str;
        this.m = i;
        this.n = i2;
        this.p = list;
        this.q = list2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(com.google.gson.internal.bind.i.Y);
        arrayList.add(com.google.gson.internal.bind.e.f6596a);
        arrayList.add(excluder);
        arrayList.addAll(list3);
        arrayList.add(com.google.gson.internal.bind.i.D);
        arrayList.add(com.google.gson.internal.bind.i.m);
        arrayList.add(com.google.gson.internal.bind.i.g);
        arrayList.add(com.google.gson.internal.bind.i.i);
        arrayList.add(com.google.gson.internal.bind.i.k);
        t<Number> a2 = a(sVar);
        arrayList.add(com.google.gson.internal.bind.i.a(Long.TYPE, Long.class, a2));
        arrayList.add(com.google.gson.internal.bind.i.a(Double.TYPE, Double.class, a(z7)));
        arrayList.add(com.google.gson.internal.bind.i.a(Float.TYPE, Float.class, b(z7)));
        arrayList.add(com.google.gson.internal.bind.i.x);
        arrayList.add(com.google.gson.internal.bind.i.o);
        arrayList.add(com.google.gson.internal.bind.i.q);
        arrayList.add(com.google.gson.internal.bind.i.a(AtomicLong.class, a(a2)));
        arrayList.add(com.google.gson.internal.bind.i.a(AtomicLongArray.class, b(a2)));
        arrayList.add(com.google.gson.internal.bind.i.s);
        arrayList.add(com.google.gson.internal.bind.i.z);
        arrayList.add(com.google.gson.internal.bind.i.F);
        arrayList.add(com.google.gson.internal.bind.i.H);
        arrayList.add(com.google.gson.internal.bind.i.a(BigDecimal.class, com.google.gson.internal.bind.i.B));
        arrayList.add(com.google.gson.internal.bind.i.a(BigInteger.class, com.google.gson.internal.bind.i.C));
        arrayList.add(com.google.gson.internal.bind.i.J);
        arrayList.add(com.google.gson.internal.bind.i.L);
        arrayList.add(com.google.gson.internal.bind.i.P);
        arrayList.add(com.google.gson.internal.bind.i.R);
        arrayList.add(com.google.gson.internal.bind.i.W);
        arrayList.add(com.google.gson.internal.bind.i.N);
        arrayList.add(com.google.gson.internal.bind.i.f6609d);
        arrayList.add(com.google.gson.internal.bind.b.f6587a);
        arrayList.add(com.google.gson.internal.bind.i.U);
        arrayList.add(com.google.gson.internal.bind.g.f6601a);
        arrayList.add(com.google.gson.internal.bind.f.f6599a);
        arrayList.add(com.google.gson.internal.bind.i.S);
        arrayList.add(com.google.gson.internal.bind.a.f6583a);
        arrayList.add(com.google.gson.internal.bind.i.f6607b);
        arrayList.add(new CollectionTypeAdapterFactory(this.u));
        arrayList.add(new MapTypeAdapterFactory(this.u, z2));
        this.v = new JsonAdapterAnnotationTypeAdapterFactory(this.u);
        arrayList.add(this.v);
        arrayList.add(com.google.gson.internal.bind.i.Z);
        arrayList.add(new ReflectiveTypeAdapterFactory(this.u, dVar, excluder, this.v));
        this.f6509a = Collections.unmodifiableList(arrayList);
    }

    private t<Number> a(boolean z) {
        if (z) {
            return com.google.gson.internal.bind.i.v;
        }
        return new t<Number>() { // from class: com.google.gson.e.1
            @Override // com.google.gson.t
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Double b(com.google.gson.c.a aVar) throws IOException {
                if (aVar.f() == com.google.gson.c.b.NULL) {
                    aVar.j();
                    return null;
                }
                return Double.valueOf(aVar.k());
            }

            @Override // com.google.gson.t
            public void a(com.google.gson.c.c cVar, Number number) throws IOException {
                if (number == null) {
                    cVar.f();
                } else {
                    e.a(number.doubleValue());
                    cVar.a(number);
                }
            }
        };
    }

    private t<Number> b(boolean z) {
        if (z) {
            return com.google.gson.internal.bind.i.u;
        }
        return new t<Number>() { // from class: com.google.gson.e.2
            @Override // com.google.gson.t
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Float b(com.google.gson.c.a aVar) throws IOException {
                if (aVar.f() == com.google.gson.c.b.NULL) {
                    aVar.j();
                    return null;
                }
                return Float.valueOf((float) aVar.k());
            }

            @Override // com.google.gson.t
            public void a(com.google.gson.c.c cVar, Number number) throws IOException {
                if (number == null) {
                    cVar.f();
                } else {
                    e.a(number.floatValue());
                    cVar.a(number);
                }
            }
        };
    }

    static void a(double d2) {
        if (Double.isNaN(d2) || Double.isInfinite(d2)) {
            throw new IllegalArgumentException(d2 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    private static t<Number> a(s sVar) {
        if (sVar == s.DEFAULT) {
            return com.google.gson.internal.bind.i.t;
        }
        return new t<Number>() { // from class: com.google.gson.e.3
            @Override // com.google.gson.t
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Number b(com.google.gson.c.a aVar) throws IOException {
                if (aVar.f() == com.google.gson.c.b.NULL) {
                    aVar.j();
                    return null;
                }
                return Long.valueOf(aVar.l());
            }

            @Override // com.google.gson.t
            public void a(com.google.gson.c.c cVar, Number number) throws IOException {
                if (number == null) {
                    cVar.f();
                } else {
                    cVar.b(number.toString());
                }
            }
        };
    }

    private static t<AtomicLong> a(final t<Number> tVar) {
        return new t<AtomicLong>() { // from class: com.google.gson.e.4
            @Override // com.google.gson.t
            public void a(com.google.gson.c.c cVar, AtomicLong atomicLong) throws IOException {
                t.this.a(cVar, Long.valueOf(atomicLong.get()));
            }

            @Override // com.google.gson.t
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public AtomicLong b(com.google.gson.c.a aVar) throws IOException {
                return new AtomicLong(((Number) t.this.b(aVar)).longValue());
            }
        }.a();
    }

    private static t<AtomicLongArray> b(final t<Number> tVar) {
        return new t<AtomicLongArray>() { // from class: com.google.gson.e.5
            @Override // com.google.gson.t
            public void a(com.google.gson.c.c cVar, AtomicLongArray atomicLongArray) throws IOException {
                cVar.b();
                int length = atomicLongArray.length();
                for (int i = 0; i < length; i++) {
                    t.this.a(cVar, Long.valueOf(atomicLongArray.get(i)));
                }
                cVar.c();
            }

            @Override // com.google.gson.t
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public AtomicLongArray b(com.google.gson.c.a aVar) throws IOException {
                ArrayList arrayList = new ArrayList();
                aVar.a();
                while (aVar.e()) {
                    arrayList.add(Long.valueOf(((Number) t.this.b(aVar)).longValue()));
                }
                aVar.b();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i = 0; i < size; i++) {
                    atomicLongArray.set(i, ((Long) arrayList.get(i)).longValue());
                }
                return atomicLongArray;
            }
        }.a();
    }

    public <T> t<T> a(com.google.gson.b.a<T> aVar) {
        t<T> tVar = (t) this.t.get(aVar == null ? r : aVar);
        if (tVar != null) {
            return tVar;
        }
        Map<com.google.gson.b.a<?>, a<?>> map = this.s.get();
        boolean z = false;
        if (map == null) {
            map = new HashMap<>();
            this.s.set(map);
            z = true;
        }
        a<?> aVar2 = map.get(aVar);
        if (aVar2 != null) {
            return aVar2;
        }
        try {
            a<?> aVar3 = new a<>();
            map.put(aVar, aVar3);
            Iterator<u> it = this.f6509a.iterator();
            while (it.hasNext()) {
                t<T> a2 = it.next().a(this, aVar);
                if (a2 != null) {
                    aVar3.a((t<?>) a2);
                    this.t.put(aVar, a2);
                    return a2;
                }
            }
            throw new IllegalArgumentException("GSON cannot handle " + aVar);
        } finally {
            map.remove(aVar);
            if (z) {
                this.s.remove();
            }
        }
    }

    public <T> t<T> a(u uVar, com.google.gson.b.a<T> aVar) {
        if (!this.f6509a.contains(uVar)) {
            uVar = this.v;
        }
        boolean z = false;
        for (u uVar2 : this.f6509a) {
            if (z) {
                t<T> a2 = uVar2.a(this, aVar);
                if (a2 != null) {
                    return a2;
                }
            } else if (uVar2 == uVar) {
                z = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + aVar);
    }

    public <T> t<T> a(Class<T> cls) {
        return a((com.google.gson.b.a) com.google.gson.b.a.get((Class) cls));
    }

    public j a(Object obj) {
        if (obj == null) {
            return l.f6665a;
        }
        return a(obj, obj.getClass());
    }

    public j a(Object obj, Type type) {
        com.google.gson.internal.bind.d dVar = new com.google.gson.internal.bind.d();
        a(obj, type, dVar);
        return dVar.a();
    }

    public String b(Object obj) {
        if (obj == null) {
            return a((j) l.f6665a);
        }
        return b(obj, obj.getClass());
    }

    public String b(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        a(obj, type, stringWriter);
        return stringWriter.toString();
    }

    public void a(Object obj, Type type, Appendable appendable) throws k {
        try {
            a(obj, type, a(com.google.gson.internal.j.a(appendable)));
        } catch (IOException e) {
            throw new k(e);
        }
    }

    public void a(Object obj, Type type, com.google.gson.c.c cVar) throws k {
        t a2 = a((com.google.gson.b.a) com.google.gson.b.a.get(type));
        boolean g = cVar.g();
        cVar.b(true);
        boolean h = cVar.h();
        cVar.c(this.h);
        boolean i = cVar.i();
        cVar.d(this.e);
        try {
            try {
                a2.a(cVar, obj);
            } catch (IOException e) {
                throw new k(e);
            }
        } finally {
            cVar.b(g);
            cVar.c(h);
            cVar.d(i);
        }
    }

    public String a(j jVar) {
        StringWriter stringWriter = new StringWriter();
        a(jVar, stringWriter);
        return stringWriter.toString();
    }

    public void a(j jVar, Appendable appendable) throws k {
        try {
            a(jVar, a(com.google.gson.internal.j.a(appendable)));
        } catch (IOException e) {
            throw new k(e);
        }
    }

    public com.google.gson.c.c a(Writer writer) throws IOException {
        if (this.g) {
            writer.write(")]}'\n");
        }
        com.google.gson.c.c cVar = new com.google.gson.c.c(writer);
        if (this.i) {
            cVar.c("  ");
        }
        cVar.d(this.e);
        return cVar;
    }

    public com.google.gson.c.a a(Reader reader) {
        com.google.gson.c.a aVar = new com.google.gson.c.a(reader);
        aVar.a(this.j);
        return aVar;
    }

    public void a(j jVar, com.google.gson.c.c cVar) throws k {
        boolean g = cVar.g();
        cVar.b(true);
        boolean h = cVar.h();
        cVar.c(this.h);
        boolean i = cVar.i();
        cVar.d(this.e);
        try {
            try {
                com.google.gson.internal.j.a(jVar, cVar);
            } catch (IOException e) {
                throw new k(e);
            }
        } finally {
            cVar.b(g);
            cVar.c(h);
            cVar.d(i);
        }
    }

    public <T> T a(String str, Class<T> cls) throws r {
        return (T) com.google.gson.internal.i.a((Class) cls).cast(a(str, (Type) cls));
    }

    public <T> T a(String str, Type type) throws r {
        if (str == null) {
            return null;
        }
        return (T) a((Reader) new StringReader(str), type);
    }

    public <T> T a(Reader reader, Class<T> cls) throws r, k {
        com.google.gson.c.a a2 = a(reader);
        Object a3 = a(a2, (Type) cls);
        a(a3, a2);
        return (T) com.google.gson.internal.i.a((Class) cls).cast(a3);
    }

    public <T> T a(Reader reader, Type type) throws k, r {
        com.google.gson.c.a a2 = a(reader);
        T t = (T) a(a2, type);
        a(t, a2);
        return t;
    }

    private static void a(Object obj, com.google.gson.c.a aVar) {
        if (obj != null) {
            try {
                if (aVar.f() == com.google.gson.c.b.END_DOCUMENT) {
                } else {
                    throw new k("JSON document was not fully consumed.");
                }
            } catch (com.google.gson.c.d e) {
                throw new r(e);
            } catch (IOException e2) {
                throw new k(e2);
            }
        }
    }

    public <T> T a(com.google.gson.c.a aVar, Type type) throws k, r {
        boolean q = aVar.q();
        boolean z = true;
        aVar.a(true);
        try {
            try {
                try {
                    aVar.f();
                    z = false;
                    T b2 = a((com.google.gson.b.a) com.google.gson.b.a.get(type)).b(aVar);
                    aVar.a(q);
                    return b2;
                } catch (IOException e) {
                    throw new r(e);
                }
            } catch (EOFException e2) {
                if (!z) {
                    throw new r(e2);
                }
                aVar.a(q);
                return null;
            } catch (IllegalStateException e3) {
                throw new r(e3);
            }
        } catch (Throwable th) {
            aVar.a(q);
            throw th;
        }
    }

    /* compiled from: Gson.java */
    static class a<T> extends t<T> {

        /* renamed from: a, reason: collision with root package name */
        private t<T> f6517a;

        a() {
        }

        public void a(t<T> tVar) {
            if (this.f6517a != null) {
                throw new AssertionError();
            }
            this.f6517a = tVar;
        }

        @Override // com.google.gson.t
        public T b(com.google.gson.c.a aVar) throws IOException {
            if (this.f6517a == null) {
                throw new IllegalStateException();
            }
            return this.f6517a.b(aVar);
        }

        @Override // com.google.gson.t
        public void a(com.google.gson.c.c cVar, T t) throws IOException {
            if (this.f6517a == null) {
                throw new IllegalStateException();
            }
            this.f6517a.a(cVar, t);
        }
    }

    public String toString() {
        return "{serializeNulls:" + this.e + ",factories:" + this.f6509a + ",instanceCreators:" + this.u + "}";
    }
}
