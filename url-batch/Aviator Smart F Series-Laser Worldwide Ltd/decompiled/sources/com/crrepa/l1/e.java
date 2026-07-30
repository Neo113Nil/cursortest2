package com.crrepa.l1;

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

/* loaded from: classes3.dex */
public final class e {
    static final boolean A = true;
    static final boolean B = false;
    static final boolean C = false;
    static final boolean D = false;
    private static final com.crrepa.s1.a E = com.crrepa.s1.a.a(Object.class);
    private static final String F = ")]}'\n";

    /* renamed from: x, reason: collision with root package name */
    static final boolean f13203x = false;

    /* renamed from: y, reason: collision with root package name */
    static final boolean f13204y = false;

    /* renamed from: z, reason: collision with root package name */
    static final boolean f13205z = false;

    /* renamed from: a, reason: collision with root package name */
    private final ThreadLocal<Map<com.crrepa.s1.a, f>> f13206a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<com.crrepa.s1.a, n> f13207b;

    /* renamed from: c, reason: collision with root package name */
    private final com.crrepa.n1.c f13208c;

    /* renamed from: d, reason: collision with root package name */
    private final com.crrepa.o1.e f13209d;

    /* renamed from: e, reason: collision with root package name */
    final List<p> f13210e;

    /* renamed from: f, reason: collision with root package name */
    final com.crrepa.n1.d f13211f;

    /* renamed from: g, reason: collision with root package name */
    final com.crrepa.l1.d f13212g;

    /* renamed from: h, reason: collision with root package name */
    final Map<Type, Object> f13213h;

    /* renamed from: i, reason: collision with root package name */
    final boolean f13214i;

    /* renamed from: j, reason: collision with root package name */
    final boolean f13215j;

    /* renamed from: k, reason: collision with root package name */
    final boolean f13216k;

    /* renamed from: l, reason: collision with root package name */
    final boolean f13217l;

    /* renamed from: m, reason: collision with root package name */
    final boolean f13218m;

    /* renamed from: n, reason: collision with root package name */
    final boolean f13219n;

    /* renamed from: o, reason: collision with root package name */
    final boolean f13220o;

    /* renamed from: p, reason: collision with root package name */
    final String f13221p;

    /* renamed from: q, reason: collision with root package name */
    final int f13222q;

    /* renamed from: r, reason: collision with root package name */
    final int f13223r;

    /* renamed from: s, reason: collision with root package name */
    final v f13224s;

    /* renamed from: t, reason: collision with root package name */
    final List<p> f13225t;

    /* renamed from: u, reason: collision with root package name */
    final List<p> f13226u;

    /* renamed from: v, reason: collision with root package name */
    final m f13227v;

    /* renamed from: w, reason: collision with root package name */
    final m f13228w;

    class a extends n {
        a() {
        }

        @Override // com.crrepa.l1.n
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Double a(com.crrepa.t1.a aVar) {
            if (aVar.t() != com.crrepa.t1.c.NULL) {
                return Double.valueOf(aVar.m());
            }
            aVar.q();
            return null;
        }

        @Override // com.crrepa.l1.n
        public void a(com.crrepa.t1.b bVar, Number number) {
            if (number == null) {
                bVar.k();
            } else {
                e.a(number.doubleValue());
                bVar.a(number);
            }
        }
    }

    class b extends n {
        b() {
        }

        @Override // com.crrepa.l1.n
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Float a(com.crrepa.t1.a aVar) {
            if (aVar.t() != com.crrepa.t1.c.NULL) {
                return Float.valueOf((float) aVar.m());
            }
            aVar.q();
            return null;
        }

        @Override // com.crrepa.l1.n
        public void a(com.crrepa.t1.b bVar, Number number) {
            if (number == null) {
                bVar.k();
            } else {
                e.a(number.floatValue());
                bVar.a(number);
            }
        }
    }

    class c extends n {
        c() {
        }

        @Override // com.crrepa.l1.n
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Number a(com.crrepa.t1.a aVar) {
            if (aVar.t() != com.crrepa.t1.c.NULL) {
                return Long.valueOf(aVar.o());
            }
            aVar.q();
            return null;
        }

        @Override // com.crrepa.l1.n
        public void a(com.crrepa.t1.b bVar, Number number) {
            if (number == null) {
                bVar.k();
            } else {
                bVar.e(number.toString());
            }
        }
    }

    static class f extends n {

        /* renamed from: a, reason: collision with root package name */
        private n f13233a;

        f() {
        }

        @Override // com.crrepa.l1.n
        public Object a(com.crrepa.t1.a aVar) {
            n nVar = this.f13233a;
            if (nVar != null) {
                return nVar.a(aVar);
            }
            throw new IllegalStateException();
        }

        public void a(n nVar) {
            if (this.f13233a != null) {
                throw new AssertionError();
            }
            this.f13233a = nVar;
        }

        @Override // com.crrepa.l1.n
        public void a(com.crrepa.t1.b bVar, Object obj) {
            n nVar = this.f13233a;
            if (nVar == null) {
                throw new IllegalStateException();
            }
            nVar.a(bVar, obj);
        }
    }

    public e() {
        this(com.crrepa.n1.d.f13415h, com.crrepa.l1.c.f13196a, Collections.emptyMap(), false, false, false, true, false, false, false, v.f13260a, null, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), w.f13263a, w.f13264b);
    }

    private static n a(v vVar) {
        return vVar == v.f13260a ? com.crrepa.o1.m.f13546t : new c();
    }

    public com.crrepa.l1.d b() {
        return this.f13212g;
    }

    public boolean c() {
        return this.f13217l;
    }

    public com.crrepa.l1.f d() {
        return new com.crrepa.l1.f(this);
    }

    public boolean e() {
        return this.f13214i;
    }

    public String toString() {
        return "{serializeNulls:" + this.f13214i + ",factories:" + this.f13210e + ",instanceCreators:" + this.f13208c + "}";
    }

    class d extends n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ n f13231a;

        d(n nVar) {
            this.f13231a = nVar;
        }

        @Override // com.crrepa.l1.n
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public AtomicLong a(com.crrepa.t1.a aVar) {
            return new AtomicLong(((Number) this.f13231a.a(aVar)).longValue());
        }

        @Override // com.crrepa.l1.n
        public void a(com.crrepa.t1.b bVar, AtomicLong atomicLong) {
            this.f13231a.a(bVar, Long.valueOf(atomicLong.get()));
        }
    }

    /* renamed from: com.crrepa.l1.e$e, reason: collision with other inner class name */
    class C0226e extends n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ n f13232a;

        C0226e(n nVar) {
            this.f13232a = nVar;
        }

        @Override // com.crrepa.l1.n
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public AtomicLongArray a(com.crrepa.t1.a aVar) {
            ArrayList arrayList = new ArrayList();
            aVar.a();
            while (aVar.i()) {
                arrayList.add(Long.valueOf(((Number) this.f13232a.a(aVar)).longValue()));
            }
            aVar.f();
            int size = arrayList.size();
            AtomicLongArray atomicLongArray = new AtomicLongArray(size);
            for (int i8 = 0; i8 < size; i8++) {
                atomicLongArray.set(i8, ((Long) arrayList.get(i8)).longValue());
            }
            return atomicLongArray;
        }

        @Override // com.crrepa.l1.n
        public void a(com.crrepa.t1.b bVar, AtomicLongArray atomicLongArray) {
            bVar.c();
            int length = atomicLongArray.length();
            for (int i8 = 0; i8 < length; i8++) {
                this.f13232a.a(bVar, Long.valueOf(atomicLongArray.get(i8)));
            }
            bVar.e();
        }
    }

    e(com.crrepa.n1.d dVar, com.crrepa.l1.d dVar2, Map<Type, Object> map, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, v vVar, String str, int i8, int i9, List<p> list, List<p> list2, List<p> list3, m mVar, m mVar2) {
        this.f13206a = new ThreadLocal<>();
        this.f13207b = new ConcurrentHashMap();
        this.f13211f = dVar;
        this.f13212g = dVar2;
        this.f13213h = map;
        com.crrepa.n1.c cVar = new com.crrepa.n1.c(map);
        this.f13208c = cVar;
        this.f13214i = z7;
        this.f13215j = z8;
        this.f13216k = z9;
        this.f13217l = z10;
        this.f13218m = z11;
        this.f13219n = z12;
        this.f13220o = z13;
        this.f13224s = vVar;
        this.f13221p = str;
        this.f13222q = i8;
        this.f13223r = i9;
        this.f13225t = list;
        this.f13226u = list2;
        this.f13227v = mVar;
        this.f13228w = mVar2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(com.crrepa.o1.m.V);
        arrayList.add(com.crrepa.o1.j.a(mVar));
        arrayList.add(dVar);
        arrayList.addAll(list3);
        arrayList.add(com.crrepa.o1.m.B);
        arrayList.add(com.crrepa.o1.m.f13539m);
        arrayList.add(com.crrepa.o1.m.f13533g);
        arrayList.add(com.crrepa.o1.m.f13535i);
        arrayList.add(com.crrepa.o1.m.f13537k);
        n a8 = a(vVar);
        arrayList.add(com.crrepa.o1.m.a(Long.TYPE, Long.class, a8));
        arrayList.add(com.crrepa.o1.m.a(Double.TYPE, Double.class, a(z13)));
        arrayList.add(com.crrepa.o1.m.a(Float.TYPE, Float.class, b(z13)));
        arrayList.add(com.crrepa.o1.i.a(mVar2));
        arrayList.add(com.crrepa.o1.m.f13541o);
        arrayList.add(com.crrepa.o1.m.f13543q);
        arrayList.add(com.crrepa.o1.m.a(AtomicLong.class, a(a8)));
        arrayList.add(com.crrepa.o1.m.a(AtomicLongArray.class, b(a8)));
        arrayList.add(com.crrepa.o1.m.f13545s);
        arrayList.add(com.crrepa.o1.m.f13550x);
        arrayList.add(com.crrepa.o1.m.D);
        arrayList.add(com.crrepa.o1.m.F);
        arrayList.add(com.crrepa.o1.m.a(BigDecimal.class, com.crrepa.o1.m.f13552z));
        arrayList.add(com.crrepa.o1.m.a(BigInteger.class, com.crrepa.o1.m.A));
        arrayList.add(com.crrepa.o1.m.H);
        arrayList.add(com.crrepa.o1.m.J);
        arrayList.add(com.crrepa.o1.m.N);
        arrayList.add(com.crrepa.o1.m.P);
        arrayList.add(com.crrepa.o1.m.T);
        arrayList.add(com.crrepa.o1.m.L);
        arrayList.add(com.crrepa.o1.m.f13530d);
        arrayList.add(com.crrepa.o1.c.f13479b);
        arrayList.add(com.crrepa.o1.m.R);
        if (com.crrepa.r1.d.f13755a) {
            arrayList.add(com.crrepa.r1.d.f13759e);
            arrayList.add(com.crrepa.r1.d.f13758d);
            arrayList.add(com.crrepa.r1.d.f13760f);
        }
        arrayList.add(com.crrepa.o1.a.f13473c);
        arrayList.add(com.crrepa.o1.m.f13528b);
        arrayList.add(new com.crrepa.o1.b(cVar));
        arrayList.add(new com.crrepa.o1.h(cVar, z8));
        com.crrepa.o1.e eVar = new com.crrepa.o1.e(cVar);
        this.f13209d = eVar;
        arrayList.add(eVar);
        arrayList.add(com.crrepa.o1.m.W);
        arrayList.add(new com.crrepa.o1.k(cVar, dVar2, dVar, eVar));
        this.f13210e = Collections.unmodifiableList(arrayList);
    }

    private static n a(n nVar) {
        return new d(nVar).a();
    }

    public h b(Object obj) {
        return obj == null ? i.f13253a : b(obj, obj.getClass());
    }

    public <T> n a(p pVar, com.crrepa.s1.a aVar) {
        if (!this.f13210e.contains(pVar)) {
            pVar = this.f13209d;
        }
        boolean z7 = false;
        for (p pVar2 : this.f13210e) {
            if (z7) {
                n a8 = pVar2.a(this, aVar);
                if (a8 != null) {
                    return a8;
                }
            } else if (pVar2 == pVar) {
                z7 = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + aVar);
    }

    public h b(Object obj, Type type) {
        com.crrepa.o1.g gVar = new com.crrepa.o1.g();
        a(obj, type, gVar);
        return gVar.n();
    }

    private static n b(n nVar) {
        return new C0226e(nVar).a();
    }

    public <T> n a(com.crrepa.s1.a aVar) {
        boolean z7;
        n nVar = this.f13207b.get(aVar == null ? E : aVar);
        if (nVar != null) {
            return nVar;
        }
        Map<com.crrepa.s1.a, f> map = this.f13206a.get();
        if (map == null) {
            map = new HashMap<>();
            this.f13206a.set(map);
            z7 = true;
        } else {
            z7 = false;
        }
        f fVar = map.get(aVar);
        if (fVar != null) {
            return fVar;
        }
        try {
            f fVar2 = new f();
            map.put(aVar, fVar2);
            Iterator<p> it = this.f13210e.iterator();
            while (it.hasNext()) {
                n a8 = it.next().a(this, aVar);
                if (a8 != null) {
                    fVar2.a(a8);
                    this.f13207b.put(aVar, a8);
                    return a8;
                }
            }
            throw new IllegalArgumentException("GSON (2.8.9) cannot handle " + aVar);
        } finally {
            map.remove(aVar);
            if (z7) {
                this.f13206a.remove();
            }
        }
    }

    private n b(boolean z7) {
        return z7 ? com.crrepa.o1.m.f13547u : new b();
    }

    public <T> n a(Class<T> cls) {
        return a(com.crrepa.s1.a.a((Class) cls));
    }

    private n a(boolean z7) {
        return z7 ? com.crrepa.o1.m.f13548v : new a();
    }

    @Deprecated
    public com.crrepa.n1.d a() {
        return this.f13211f;
    }

    public com.crrepa.t1.a a(Reader reader) {
        com.crrepa.t1.a aVar = new com.crrepa.t1.a(reader);
        aVar.b(this.f13219n);
        return aVar;
    }

    public com.crrepa.t1.b a(Writer writer) {
        if (this.f13216k) {
            writer.write(F);
        }
        com.crrepa.t1.b bVar = new com.crrepa.t1.b(writer);
        if (this.f13218m) {
            bVar.c("  ");
        }
        bVar.c(this.f13214i);
        return bVar;
    }

    public <T> T a(h hVar, Class<T> cls) {
        return (T) com.crrepa.n1.k.b((Class) cls).cast(a(hVar, (Type) cls));
    }

    public <T> T a(h hVar, Type type) {
        if (hVar == null) {
            return null;
        }
        return (T) a((com.crrepa.t1.a) new com.crrepa.o1.f(hVar), type);
    }

    public <T> T a(com.crrepa.t1.a aVar, Type type) {
        boolean j8 = aVar.j();
        boolean z7 = true;
        aVar.b(true);
        try {
            try {
                try {
                    aVar.t();
                    z7 = false;
                    return (T) a(com.crrepa.s1.a.a(type)).a(aVar);
                } catch (EOFException e8) {
                    if (!z7) {
                        throw new u(e8);
                    }
                    aVar.b(j8);
                    return null;
                } catch (IllegalStateException e9) {
                    throw new u(e9);
                }
            } catch (IOException e10) {
                throw new u(e10);
            } catch (AssertionError e11) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.9): " + e11.getMessage());
                assertionError.initCause(e11);
                throw assertionError;
            }
        } finally {
            aVar.b(j8);
        }
    }

    public <T> T a(Reader reader, Class<T> cls) {
        com.crrepa.t1.a a8 = a(reader);
        Object a9 = a(a8, (Type) cls);
        a(a9, a8);
        return (T) com.crrepa.n1.k.b((Class) cls).cast(a9);
    }

    public <T> T a(Reader reader, Type type) {
        com.crrepa.t1.a a8 = a(reader);
        T t7 = (T) a(a8, type);
        a(t7, a8);
        return t7;
    }

    public <T> T a(String str, Class<T> cls) {
        return (T) com.crrepa.n1.k.b((Class) cls).cast(a(str, (Type) cls));
    }

    public <T> T a(String str, Type type) {
        if (str == null) {
            return null;
        }
        return (T) a((Reader) new StringReader(str), type);
    }

    public String a(h hVar) {
        StringWriter stringWriter = new StringWriter();
        a(hVar, (Appendable) stringWriter);
        return stringWriter.toString();
    }

    public String a(Object obj) {
        return obj == null ? a((h) i.f13253a) : a(obj, obj.getClass());
    }

    public String a(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        a(obj, type, stringWriter);
        return stringWriter.toString();
    }

    static void a(double d8) {
        if (Double.isNaN(d8) || Double.isInfinite(d8)) {
            throw new IllegalArgumentException(d8 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public void a(h hVar, com.crrepa.t1.b bVar) {
        boolean i8 = bVar.i();
        bVar.b(true);
        boolean h8 = bVar.h();
        bVar.a(this.f13217l);
        boolean g8 = bVar.g();
        bVar.c(this.f13214i);
        try {
            try {
                com.crrepa.n1.l.a(hVar, bVar);
            } catch (IOException e8) {
                throw new l(e8);
            } catch (AssertionError e9) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.9): " + e9.getMessage());
                assertionError.initCause(e9);
                throw assertionError;
            }
        } finally {
            bVar.b(i8);
            bVar.a(h8);
            bVar.c(g8);
        }
    }

    public void a(h hVar, Appendable appendable) {
        try {
            a(hVar, a(com.crrepa.n1.l.a(appendable)));
        } catch (IOException e8) {
            throw new l(e8);
        }
    }

    private static void a(Object obj, com.crrepa.t1.a aVar) {
        if (obj != null) {
            try {
                if (aVar.t() == com.crrepa.t1.c.END_DOCUMENT) {
                } else {
                    throw new l("JSON document was not fully consumed.");
                }
            } catch (com.crrepa.t1.e e8) {
                throw new u(e8);
            } catch (IOException e9) {
                throw new l(e9);
            }
        }
    }

    public void a(Object obj, Appendable appendable) {
        if (obj != null) {
            a(obj, obj.getClass(), appendable);
        } else {
            a((h) i.f13253a, appendable);
        }
    }

    public void a(Object obj, Type type, com.crrepa.t1.b bVar) {
        n a8 = a(com.crrepa.s1.a.a(type));
        boolean i8 = bVar.i();
        bVar.b(true);
        boolean h8 = bVar.h();
        bVar.a(this.f13217l);
        boolean g8 = bVar.g();
        bVar.c(this.f13214i);
        try {
            try {
                a8.a(bVar, obj);
            } catch (IOException e8) {
                throw new l(e8);
            } catch (AssertionError e9) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.9): " + e9.getMessage());
                assertionError.initCause(e9);
                throw assertionError;
            }
        } finally {
            bVar.b(i8);
            bVar.a(h8);
            bVar.c(g8);
        }
    }

    public void a(Object obj, Type type, Appendable appendable) {
        try {
            a(obj, type, a(com.crrepa.n1.l.a(appendable)));
        } catch (IOException e8) {
            throw new l(e8);
        }
    }
}
