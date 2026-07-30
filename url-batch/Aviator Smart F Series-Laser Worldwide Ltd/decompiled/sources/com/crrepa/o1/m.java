package com.crrepa.o1;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* loaded from: classes3.dex */
public final class m {
    public static final com.crrepa.l1.n A;
    public static final com.crrepa.l1.p B;
    public static final com.crrepa.l1.n C;
    public static final com.crrepa.l1.p D;
    public static final com.crrepa.l1.n E;
    public static final com.crrepa.l1.p F;
    public static final com.crrepa.l1.n G;
    public static final com.crrepa.l1.p H;
    public static final com.crrepa.l1.n I;
    public static final com.crrepa.l1.p J;
    public static final com.crrepa.l1.n K;
    public static final com.crrepa.l1.p L;
    public static final com.crrepa.l1.n M;
    public static final com.crrepa.l1.p N;
    public static final com.crrepa.l1.n O;
    public static final com.crrepa.l1.p P;
    public static final com.crrepa.l1.n Q;
    public static final com.crrepa.l1.p R;
    public static final com.crrepa.l1.n S;
    public static final com.crrepa.l1.p T;
    public static final com.crrepa.l1.n U;
    public static final com.crrepa.l1.p V;
    public static final com.crrepa.l1.p W;

    /* renamed from: a, reason: collision with root package name */
    public static final com.crrepa.l1.n f13527a;

    /* renamed from: b, reason: collision with root package name */
    public static final com.crrepa.l1.p f13528b;

    /* renamed from: c, reason: collision with root package name */
    public static final com.crrepa.l1.n f13529c;

    /* renamed from: d, reason: collision with root package name */
    public static final com.crrepa.l1.p f13530d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.crrepa.l1.n f13531e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.crrepa.l1.n f13532f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.crrepa.l1.p f13533g;

    /* renamed from: h, reason: collision with root package name */
    public static final com.crrepa.l1.n f13534h;

    /* renamed from: i, reason: collision with root package name */
    public static final com.crrepa.l1.p f13535i;

    /* renamed from: j, reason: collision with root package name */
    public static final com.crrepa.l1.n f13536j;

    /* renamed from: k, reason: collision with root package name */
    public static final com.crrepa.l1.p f13537k;

    /* renamed from: l, reason: collision with root package name */
    public static final com.crrepa.l1.n f13538l;

    /* renamed from: m, reason: collision with root package name */
    public static final com.crrepa.l1.p f13539m;

    /* renamed from: n, reason: collision with root package name */
    public static final com.crrepa.l1.n f13540n;

    /* renamed from: o, reason: collision with root package name */
    public static final com.crrepa.l1.p f13541o;

    /* renamed from: p, reason: collision with root package name */
    public static final com.crrepa.l1.n f13542p;

    /* renamed from: q, reason: collision with root package name */
    public static final com.crrepa.l1.p f13543q;

    /* renamed from: r, reason: collision with root package name */
    public static final com.crrepa.l1.n f13544r;

    /* renamed from: s, reason: collision with root package name */
    public static final com.crrepa.l1.p f13545s;

    /* renamed from: t, reason: collision with root package name */
    public static final com.crrepa.l1.n f13546t;

    /* renamed from: u, reason: collision with root package name */
    public static final com.crrepa.l1.n f13547u;

    /* renamed from: v, reason: collision with root package name */
    public static final com.crrepa.l1.n f13548v;

    /* renamed from: w, reason: collision with root package name */
    public static final com.crrepa.l1.n f13549w;

    /* renamed from: x, reason: collision with root package name */
    public static final com.crrepa.l1.p f13550x;

    /* renamed from: y, reason: collision with root package name */
    public static final com.crrepa.l1.n f13551y;

    /* renamed from: z, reason: collision with root package name */
    public static final com.crrepa.l1.n f13552z;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f13553a;

        static {
            int[] iArr = new int[com.crrepa.t1.c.values().length];
            f13553a = iArr;
            try {
                iArr[com.crrepa.t1.c.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13553a[com.crrepa.t1.c.BOOLEAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13553a[com.crrepa.t1.c.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13553a[com.crrepa.t1.c.NULL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13553a[com.crrepa.t1.c.BEGIN_ARRAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13553a[com.crrepa.t1.c.BEGIN_OBJECT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13553a[com.crrepa.t1.c.END_DOCUMENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f13553a[com.crrepa.t1.c.NAME.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f13553a[com.crrepa.t1.c.END_OBJECT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f13553a[com.crrepa.t1.c.END_ARRAY.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    class b0 extends com.crrepa.l1.n {
        b0() {
        }

        @Override // com.crrepa.l1.n
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public com.crrepa.l1.h a(com.crrepa.t1.a aVar) {
            if (aVar instanceof com.crrepa.o1.f) {
                return ((com.crrepa.o1.f) aVar).A();
            }
            switch (a.f13553a[aVar.t().ordinal()]) {
                case 1:
                    return new com.crrepa.l1.k(new com.crrepa.n1.h(aVar.r()));
                case 2:
                    return new com.crrepa.l1.k(Boolean.valueOf(aVar.l()));
                case 3:
                    return new com.crrepa.l1.k(aVar.r());
                case 4:
                    aVar.q();
                    return com.crrepa.l1.i.f13253a;
                case 5:
                    com.crrepa.l1.g gVar = new com.crrepa.l1.g();
                    aVar.a();
                    while (aVar.i()) {
                        gVar.a(a(aVar));
                    }
                    aVar.f();
                    return gVar;
                case 6:
                    com.crrepa.l1.j jVar = new com.crrepa.l1.j();
                    aVar.b();
                    while (aVar.i()) {
                        jVar.a(aVar.p(), a(aVar));
                    }
                    aVar.g();
                    return jVar;
                default:
                    throw new IllegalArgumentException();
            }
        }

        @Override // com.crrepa.l1.n
        public void a(com.crrepa.t1.b bVar, com.crrepa.l1.h hVar) {
            if (hVar == null || hVar.s()) {
                bVar.k();
                return;
            }
            if (hVar.u()) {
                com.crrepa.l1.k m8 = hVar.m();
                if (m8.x()) {
                    bVar.a(m8.o());
                    return;
                } else if (m8.w()) {
                    bVar.d(m8.d());
                    return;
                } else {
                    bVar.e(m8.q());
                    return;
                }
            }
            if (hVar.r()) {
                bVar.c();
                Iterator<com.crrepa.l1.h> it = hVar.j().iterator();
                while (it.hasNext()) {
                    a(bVar, it.next());
                }
                bVar.e();
                return;
            }
            if (!hVar.t()) {
                throw new IllegalArgumentException("Couldn't write " + hVar.getClass());
            }
            bVar.d();
            for (Map.Entry<String, com.crrepa.l1.h> entry : hVar.l().w()) {
                bVar.b(entry.getKey());
                a(bVar, entry.getValue());
            }
            bVar.f();
        }
    }

    class c extends com.crrepa.l1.n {
        c() {
        }

        @Override // com.crrepa.l1.n
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Boolean a(com.crrepa.t1.a aVar) {
            com.crrepa.t1.c t7 = aVar.t();
            if (t7 != com.crrepa.t1.c.NULL) {
                return t7 == com.crrepa.t1.c.STRING ? Boolean.valueOf(Boolean.parseBoolean(aVar.r())) : Boolean.valueOf(aVar.l());
            }
            aVar.q();
            return null;
        }

        @Override // com.crrepa.l1.n
        public void a(com.crrepa.t1.b bVar, Boolean bool) {
            bVar.a(bool);
        }
    }

    class c0 implements com.crrepa.l1.p {
        c0() {
        }

        @Override // com.crrepa.l1.p
        public <T> com.crrepa.l1.n a(com.crrepa.l1.e eVar, com.crrepa.s1.a aVar) {
            Class<? super Object> a8 = aVar.a();
            if (!Enum.class.isAssignableFrom(a8) || a8 == Enum.class) {
                return null;
            }
            if (!a8.isEnum()) {
                a8 = a8.getSuperclass();
            }
            return new q(a8);
        }
    }

    class d extends com.crrepa.l1.n {
        d() {
        }

        @Override // com.crrepa.l1.n
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Number a(com.crrepa.t1.a aVar) {
            if (aVar.t() == com.crrepa.t1.c.NULL) {
                aVar.q();
                return null;
            }
            try {
                return Long.valueOf(aVar.o());
            } catch (NumberFormatException e8) {
                throw new com.crrepa.l1.u(e8);
            }
        }

        @Override // com.crrepa.l1.n
        public void a(com.crrepa.t1.b bVar, Number number) {
            bVar.a(number);
        }
    }

    class d0 implements com.crrepa.l1.p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.crrepa.s1.a f13554a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.crrepa.l1.n f13555b;

        d0(com.crrepa.s1.a aVar, com.crrepa.l1.n nVar) {
            this.f13554a = aVar;
            this.f13555b = nVar;
        }

        @Override // com.crrepa.l1.p
        public <T> com.crrepa.l1.n a(com.crrepa.l1.e eVar, com.crrepa.s1.a aVar) {
            if (aVar.equals(this.f13554a)) {
                return this.f13555b;
            }
            return null;
        }
    }

    class e extends com.crrepa.l1.n {
        e() {
        }

        @Override // com.crrepa.l1.n
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Boolean a(com.crrepa.t1.a aVar) {
            if (aVar.t() != com.crrepa.t1.c.NULL) {
                return Boolean.valueOf(aVar.r());
            }
            aVar.q();
            return null;
        }

        @Override // com.crrepa.l1.n
        public void a(com.crrepa.t1.b bVar, Boolean bool) {
            bVar.e(bool == null ? "null" : bool.toString());
        }
    }

    class f extends com.crrepa.l1.n {
        f() {
        }

        @Override // com.crrepa.l1.n
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Number a(com.crrepa.t1.a aVar) {
            if (aVar.t() != com.crrepa.t1.c.NULL) {
                return Float.valueOf((float) aVar.m());
            }
            aVar.q();
            return null;
        }

        @Override // com.crrepa.l1.n
        public void a(com.crrepa.t1.b bVar, Number number) {
            bVar.a(number);
        }
    }

    class f0 implements com.crrepa.l1.p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Class f13556a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.crrepa.l1.n f13557b;

        f0(Class cls, com.crrepa.l1.n nVar) {
            this.f13556a = cls;
            this.f13557b = nVar;
        }

        @Override // com.crrepa.l1.p
        public <T> com.crrepa.l1.n a(com.crrepa.l1.e eVar, com.crrepa.s1.a aVar) {
            if (aVar.a() == this.f13556a) {
                return this.f13557b;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f13556a.getName() + ",adapter=" + this.f13557b + "]";
        }
    }

    class g extends com.crrepa.l1.n {
        g() {
        }

        @Override // com.crrepa.l1.n
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Number a(com.crrepa.t1.a aVar) {
            if (aVar.t() == com.crrepa.t1.c.NULL) {
                aVar.q();
                return null;
            }
            try {
                return Byte.valueOf((byte) aVar.n());
            } catch (NumberFormatException e8) {
                throw new com.crrepa.l1.u(e8);
            }
        }

        @Override // com.crrepa.l1.n
        public void a(com.crrepa.t1.b bVar, Number number) {
            bVar.a(number);
        }
    }

    class g0 implements com.crrepa.l1.p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Class f13558a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Class f13559b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.crrepa.l1.n f13560c;

        g0(Class cls, Class cls2, com.crrepa.l1.n nVar) {
            this.f13558a = cls;
            this.f13559b = cls2;
            this.f13560c = nVar;
        }

        @Override // com.crrepa.l1.p
        public <T> com.crrepa.l1.n a(com.crrepa.l1.e eVar, com.crrepa.s1.a aVar) {
            Class<Object> a8 = aVar.a();
            if (a8 == this.f13558a || a8 == this.f13559b) {
                return this.f13560c;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f13559b.getName() + "+" + this.f13558a.getName() + ",adapter=" + this.f13560c + "]";
        }
    }

    class h extends com.crrepa.l1.n {
        h() {
        }

        @Override // com.crrepa.l1.n
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Number a(com.crrepa.t1.a aVar) {
            if (aVar.t() != com.crrepa.t1.c.NULL) {
                return Double.valueOf(aVar.m());
            }
            aVar.q();
            return null;
        }

        @Override // com.crrepa.l1.n
        public void a(com.crrepa.t1.b bVar, Number number) {
            bVar.a(number);
        }
    }

    class h0 implements com.crrepa.l1.p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Class f13561a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Class f13562b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.crrepa.l1.n f13563c;

        h0(Class cls, Class cls2, com.crrepa.l1.n nVar) {
            this.f13561a = cls;
            this.f13562b = cls2;
            this.f13563c = nVar;
        }

        @Override // com.crrepa.l1.p
        public <T> com.crrepa.l1.n a(com.crrepa.l1.e eVar, com.crrepa.s1.a aVar) {
            Class<Object> a8 = aVar.a();
            if (a8 == this.f13561a || a8 == this.f13562b) {
                return this.f13563c;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f13561a.getName() + "+" + this.f13562b.getName() + ",adapter=" + this.f13563c + "]";
        }
    }

    class i extends com.crrepa.l1.n {
        i() {
        }

        @Override // com.crrepa.l1.n
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Number a(com.crrepa.t1.a aVar) {
            if (aVar.t() == com.crrepa.t1.c.NULL) {
                aVar.q();
                return null;
            }
            try {
                return Short.valueOf((short) aVar.n());
            } catch (NumberFormatException e8) {
                throw new com.crrepa.l1.u(e8);
            }
        }

        @Override // com.crrepa.l1.n
        public void a(com.crrepa.t1.b bVar, Number number) {
            bVar.a(number);
        }
    }

    class i0 implements com.crrepa.l1.p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Class f13564a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.crrepa.l1.n f13565b;

        class a extends com.crrepa.l1.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Class f13566a;

            a(Class cls) {
                this.f13566a = cls;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v1, types: [T1, java.lang.Object] */
            @Override // com.crrepa.l1.n
            public T1 a(com.crrepa.t1.a aVar) {
                ?? a8 = i0.this.f13565b.a(aVar);
                if (a8 == 0 || this.f13566a.isInstance(a8)) {
                    return a8;
                }
                throw new com.crrepa.l1.u("Expected a " + this.f13566a.getName() + " but was " + a8.getClass().getName());
            }

            @Override // com.crrepa.l1.n
            public void a(com.crrepa.t1.b bVar, T1 t12) {
                i0.this.f13565b.a(bVar, t12);
            }
        }

        i0(Class cls, com.crrepa.l1.n nVar) {
            this.f13564a = cls;
            this.f13565b = nVar;
        }

        @Override // com.crrepa.l1.p
        public <T2> com.crrepa.l1.n a(com.crrepa.l1.e eVar, com.crrepa.s1.a aVar) {
            Class<?> a8 = aVar.a();
            if (this.f13564a.isAssignableFrom(a8)) {
                return new a(a8);
            }
            return null;
        }

        public String toString() {
            return "Factory[typeHierarchy=" + this.f13564a.getName() + ",adapter=" + this.f13565b + "]";
        }
    }

    class j extends com.crrepa.l1.n {
        j() {
        }

        @Override // com.crrepa.l1.n
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Character a(com.crrepa.t1.a aVar) {
            if (aVar.t() == com.crrepa.t1.c.NULL) {
                aVar.q();
                return null;
            }
            String r8 = aVar.r();
            if (r8.length() == 1) {
                return Character.valueOf(r8.charAt(0));
            }
            throw new com.crrepa.l1.u("Expecting character, got: " + r8);
        }

        @Override // com.crrepa.l1.n
        public void a(com.crrepa.t1.b bVar, Character ch) {
            bVar.e(ch == null ? null : String.valueOf(ch));
        }
    }

    class k extends com.crrepa.l1.n {
        k() {
        }

        @Override // com.crrepa.l1.n
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Number a(com.crrepa.t1.a aVar) {
            if (aVar.t() == com.crrepa.t1.c.NULL) {
                aVar.q();
                return null;
            }
            try {
                return Integer.valueOf(aVar.n());
            } catch (NumberFormatException e8) {
                throw new com.crrepa.l1.u(e8);
            }
        }

        @Override // com.crrepa.l1.n
        public void a(com.crrepa.t1.b bVar, Number number) {
            bVar.a(number);
        }
    }

    private static final class q extends com.crrepa.l1.n {

        /* renamed from: a, reason: collision with root package name */
        private final Map<String, Enum<Object>> f13568a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        private final Map<Enum<Object>, String> f13569b = new HashMap();

        class a implements PrivilegedAction {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Field f13570a;

            a(Field field) {
                this.f13570a = field;
            }

            @Override // java.security.PrivilegedAction
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Void run() {
                this.f13570a.setAccessible(true);
                return null;
            }
        }

        public q(Class<Enum<Object>> cls) {
            try {
                for (Field field : cls.getDeclaredFields()) {
                    if (field.isEnumConstant()) {
                        AccessController.doPrivileged(new a(field));
                        Enum<Object> r42 = (Enum) field.get(null);
                        String name = r42.name();
                        i4.c cVar = (i4.c) field.getAnnotation(i4.c.class);
                        if (cVar != null) {
                            name = cVar.value();
                            for (String str : cVar.alternate()) {
                                this.f13568a.put(str, r42);
                            }
                        }
                        this.f13568a.put(name, r42);
                        this.f13569b.put(r42, name);
                    }
                }
            } catch (IllegalAccessException e8) {
                throw new AssertionError(e8);
            }
        }

        @Override // com.crrepa.l1.n
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Enum<Object> a(com.crrepa.t1.a aVar) {
            if (aVar.t() != com.crrepa.t1.c.NULL) {
                return this.f13568a.get(aVar.r());
            }
            aVar.q();
            return null;
        }

        @Override // com.crrepa.l1.n
        public void a(com.crrepa.t1.b bVar, Enum<Object> r32) {
            bVar.e(r32 == null ? null : this.f13569b.get(r32));
        }
    }

    class t extends com.crrepa.l1.n {
        t() {
        }

        @Override // com.crrepa.l1.n
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Class a(com.crrepa.t1.a aVar) {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }

        @Override // com.crrepa.l1.n
        public void a(com.crrepa.t1.b bVar, Class cls) {
            throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?");
        }
    }

    static {
        com.crrepa.l1.n a8 = new t().a();
        f13527a = a8;
        f13528b = a(Class.class, a8);
        com.crrepa.l1.n a9 = new e0().a();
        f13529c = a9;
        f13530d = a(BitSet.class, a9);
        c cVar = new c();
        f13531e = cVar;
        f13532f = new e();
        f13533g = a(Boolean.TYPE, Boolean.class, cVar);
        g gVar = new g();
        f13534h = gVar;
        f13535i = a(Byte.TYPE, Byte.class, gVar);
        i iVar = new i();
        f13536j = iVar;
        f13537k = a(Short.TYPE, Short.class, iVar);
        k kVar = new k();
        f13538l = kVar;
        f13539m = a(Integer.TYPE, Integer.class, kVar);
        com.crrepa.l1.n a10 = new C0236m().a();
        f13540n = a10;
        f13541o = a(AtomicInteger.class, a10);
        com.crrepa.l1.n a11 = new o().a();
        f13542p = a11;
        f13543q = a(AtomicBoolean.class, a11);
        com.crrepa.l1.n a12 = new b().a();
        f13544r = a12;
        f13545s = a(AtomicIntegerArray.class, a12);
        f13546t = new d();
        f13547u = new f();
        f13548v = new h();
        j jVar = new j();
        f13549w = jVar;
        f13550x = a(Character.TYPE, Character.class, jVar);
        l lVar = new l();
        f13551y = lVar;
        f13552z = new n();
        A = new p();
        B = a(String.class, lVar);
        r rVar = new r();
        C = rVar;
        D = a(StringBuilder.class, rVar);
        s sVar = new s();
        E = sVar;
        F = a(StringBuffer.class, sVar);
        u uVar = new u();
        G = uVar;
        H = a(URL.class, uVar);
        v vVar = new v();
        I = vVar;
        J = a(URI.class, vVar);
        w wVar = new w();
        K = wVar;
        L = b(InetAddress.class, wVar);
        x xVar = new x();
        M = xVar;
        N = a(UUID.class, xVar);
        com.crrepa.l1.n a13 = new y().a();
        O = a13;
        P = a(Currency.class, a13);
        z zVar = new z();
        Q = zVar;
        R = b(Calendar.class, GregorianCalendar.class, zVar);
        a0 a0Var = new a0();
        S = a0Var;
        T = a(Locale.class, a0Var);
        b0 b0Var = new b0();
        U = b0Var;
        V = b(com.crrepa.l1.h.class, b0Var);
        W = new c0();
    }

    private m() {
        throw new UnsupportedOperationException();
    }

    public static <TT> com.crrepa.l1.p a(com.crrepa.s1.a aVar, com.crrepa.l1.n nVar) {
        return new d0(aVar, nVar);
    }

    public static <T1> com.crrepa.l1.p b(Class<T1> cls, com.crrepa.l1.n nVar) {
        return new i0(cls, nVar);
    }

    class a0 extends com.crrepa.l1.n {
        a0() {
        }

        @Override // com.crrepa.l1.n
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Locale a(com.crrepa.t1.a aVar) {
            if (aVar.t() == com.crrepa.t1.c.NULL) {
                aVar.q();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(aVar.r(), "_");
            String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String nextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            return (nextToken2 == null && nextToken3 == null) ? new Locale(nextToken) : nextToken3 == null ? new Locale(nextToken, nextToken2) : new Locale(nextToken, nextToken2, nextToken3);
        }

        @Override // com.crrepa.l1.n
        public void a(com.crrepa.t1.b bVar, Locale locale) {
            bVar.e(locale == null ? null : locale.toString());
        }
    }

    class b extends com.crrepa.l1.n {
        b() {
        }

        @Override // com.crrepa.l1.n
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public AtomicIntegerArray a(com.crrepa.t1.a aVar) {
            ArrayList arrayList = new ArrayList();
            aVar.a();
            while (aVar.i()) {
                try {
                    arrayList.add(Integer.valueOf(aVar.n()));
                } catch (NumberFormatException e8) {
                    throw new com.crrepa.l1.u(e8);
                }
            }
            aVar.f();
            int size = arrayList.size();
            AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
            for (int i8 = 0; i8 < size; i8++) {
                atomicIntegerArray.set(i8, ((Integer) arrayList.get(i8)).intValue());
            }
            return atomicIntegerArray;
        }

        @Override // com.crrepa.l1.n
        public void a(com.crrepa.t1.b bVar, AtomicIntegerArray atomicIntegerArray) {
            bVar.c();
            int length = atomicIntegerArray.length();
            for (int i8 = 0; i8 < length; i8++) {
                bVar.a(atomicIntegerArray.get(i8));
            }
            bVar.e();
        }
    }

    class e0 extends com.crrepa.l1.n {
        e0() {
        }

        @Override // com.crrepa.l1.n
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public BitSet a(com.crrepa.t1.a aVar) {
            BitSet bitSet = new BitSet();
            aVar.a();
            com.crrepa.t1.c t7 = aVar.t();
            int i8 = 0;
            while (t7 != com.crrepa.t1.c.END_ARRAY) {
                int i9 = a.f13553a[t7.ordinal()];
                if (i9 == 1) {
                    if (aVar.n() == 0) {
                        i8++;
                        t7 = aVar.t();
                    }
                    bitSet.set(i8);
                    i8++;
                    t7 = aVar.t();
                } else if (i9 == 2) {
                    if (!aVar.l()) {
                        i8++;
                        t7 = aVar.t();
                    }
                    bitSet.set(i8);
                    i8++;
                    t7 = aVar.t();
                } else {
                    if (i9 != 3) {
                        throw new com.crrepa.l1.u("Invalid bitset value type: " + t7);
                    }
                    String r8 = aVar.r();
                    try {
                        if (Integer.parseInt(r8) == 0) {
                            i8++;
                            t7 = aVar.t();
                        }
                        bitSet.set(i8);
                        i8++;
                        t7 = aVar.t();
                    } catch (NumberFormatException unused) {
                        throw new com.crrepa.l1.u("Error: Expecting: bitset number value (1, 0), Found: " + r8);
                    }
                }
            }
            aVar.f();
            return bitSet;
        }

        @Override // com.crrepa.l1.n
        public void a(com.crrepa.t1.b bVar, BitSet bitSet) {
            bVar.c();
            int length = bitSet.length();
            for (int i8 = 0; i8 < length; i8++) {
                bVar.a(bitSet.get(i8) ? 1L : 0L);
            }
            bVar.e();
        }
    }

    class l extends com.crrepa.l1.n {
        l() {
        }

        @Override // com.crrepa.l1.n
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public String a(com.crrepa.t1.a aVar) {
            com.crrepa.t1.c t7 = aVar.t();
            if (t7 != com.crrepa.t1.c.NULL) {
                return t7 == com.crrepa.t1.c.BOOLEAN ? Boolean.toString(aVar.l()) : aVar.r();
            }
            aVar.q();
            return null;
        }

        @Override // com.crrepa.l1.n
        public void a(com.crrepa.t1.b bVar, String str) {
            bVar.e(str);
        }
    }

    /* renamed from: com.crrepa.o1.m$m, reason: collision with other inner class name */
    class C0236m extends com.crrepa.l1.n {
        C0236m() {
        }

        @Override // com.crrepa.l1.n
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public AtomicInteger a(com.crrepa.t1.a aVar) {
            try {
                return new AtomicInteger(aVar.n());
            } catch (NumberFormatException e8) {
                throw new com.crrepa.l1.u(e8);
            }
        }

        @Override // com.crrepa.l1.n
        public void a(com.crrepa.t1.b bVar, AtomicInteger atomicInteger) {
            bVar.a(atomicInteger.get());
        }
    }

    class n extends com.crrepa.l1.n {
        n() {
        }

        @Override // com.crrepa.l1.n
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public BigDecimal a(com.crrepa.t1.a aVar) {
            if (aVar.t() == com.crrepa.t1.c.NULL) {
                aVar.q();
                return null;
            }
            try {
                return new BigDecimal(aVar.r());
            } catch (NumberFormatException e8) {
                throw new com.crrepa.l1.u(e8);
            }
        }

        @Override // com.crrepa.l1.n
        public void a(com.crrepa.t1.b bVar, BigDecimal bigDecimal) {
            bVar.a(bigDecimal);
        }
    }

    class o extends com.crrepa.l1.n {
        o() {
        }

        @Override // com.crrepa.l1.n
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public AtomicBoolean a(com.crrepa.t1.a aVar) {
            return new AtomicBoolean(aVar.l());
        }

        @Override // com.crrepa.l1.n
        public void a(com.crrepa.t1.b bVar, AtomicBoolean atomicBoolean) {
            bVar.d(atomicBoolean.get());
        }
    }

    class p extends com.crrepa.l1.n {
        p() {
        }

        @Override // com.crrepa.l1.n
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public BigInteger a(com.crrepa.t1.a aVar) {
            if (aVar.t() == com.crrepa.t1.c.NULL) {
                aVar.q();
                return null;
            }
            try {
                return new BigInteger(aVar.r());
            } catch (NumberFormatException e8) {
                throw new com.crrepa.l1.u(e8);
            }
        }

        @Override // com.crrepa.l1.n
        public void a(com.crrepa.t1.b bVar, BigInteger bigInteger) {
            bVar.a(bigInteger);
        }
    }

    class r extends com.crrepa.l1.n {
        r() {
        }

        @Override // com.crrepa.l1.n
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public StringBuilder a(com.crrepa.t1.a aVar) {
            if (aVar.t() != com.crrepa.t1.c.NULL) {
                return new StringBuilder(aVar.r());
            }
            aVar.q();
            return null;
        }

        @Override // com.crrepa.l1.n
        public void a(com.crrepa.t1.b bVar, StringBuilder sb) {
            bVar.e(sb == null ? null : sb.toString());
        }
    }

    class s extends com.crrepa.l1.n {
        s() {
        }

        @Override // com.crrepa.l1.n
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public StringBuffer a(com.crrepa.t1.a aVar) {
            if (aVar.t() != com.crrepa.t1.c.NULL) {
                return new StringBuffer(aVar.r());
            }
            aVar.q();
            return null;
        }

        @Override // com.crrepa.l1.n
        public void a(com.crrepa.t1.b bVar, StringBuffer stringBuffer) {
            bVar.e(stringBuffer == null ? null : stringBuffer.toString());
        }
    }

    class u extends com.crrepa.l1.n {
        u() {
        }

        @Override // com.crrepa.l1.n
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public URL a(com.crrepa.t1.a aVar) {
            if (aVar.t() == com.crrepa.t1.c.NULL) {
                aVar.q();
                return null;
            }
            String r8 = aVar.r();
            if ("null".equals(r8)) {
                return null;
            }
            return new URL(r8);
        }

        @Override // com.crrepa.l1.n
        public void a(com.crrepa.t1.b bVar, URL url) {
            bVar.e(url == null ? null : url.toExternalForm());
        }
    }

    class v extends com.crrepa.l1.n {
        v() {
        }

        @Override // com.crrepa.l1.n
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public URI a(com.crrepa.t1.a aVar) {
            if (aVar.t() == com.crrepa.t1.c.NULL) {
                aVar.q();
                return null;
            }
            try {
                String r8 = aVar.r();
                if ("null".equals(r8)) {
                    return null;
                }
                return new URI(r8);
            } catch (URISyntaxException e8) {
                throw new com.crrepa.l1.l(e8);
            }
        }

        @Override // com.crrepa.l1.n
        public void a(com.crrepa.t1.b bVar, URI uri) {
            bVar.e(uri == null ? null : uri.toASCIIString());
        }
    }

    class w extends com.crrepa.l1.n {
        w() {
        }

        @Override // com.crrepa.l1.n
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public InetAddress a(com.crrepa.t1.a aVar) {
            if (aVar.t() != com.crrepa.t1.c.NULL) {
                return InetAddress.getByName(aVar.r());
            }
            aVar.q();
            return null;
        }

        @Override // com.crrepa.l1.n
        public void a(com.crrepa.t1.b bVar, InetAddress inetAddress) {
            bVar.e(inetAddress == null ? null : inetAddress.getHostAddress());
        }
    }

    class x extends com.crrepa.l1.n {
        x() {
        }

        @Override // com.crrepa.l1.n
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public UUID a(com.crrepa.t1.a aVar) {
            if (aVar.t() != com.crrepa.t1.c.NULL) {
                return UUID.fromString(aVar.r());
            }
            aVar.q();
            return null;
        }

        @Override // com.crrepa.l1.n
        public void a(com.crrepa.t1.b bVar, UUID uuid) {
            bVar.e(uuid == null ? null : uuid.toString());
        }
    }

    class y extends com.crrepa.l1.n {
        y() {
        }

        @Override // com.crrepa.l1.n
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Currency a(com.crrepa.t1.a aVar) {
            return Currency.getInstance(aVar.r());
        }

        @Override // com.crrepa.l1.n
        public void a(com.crrepa.t1.b bVar, Currency currency) {
            bVar.e(currency.getCurrencyCode());
        }
    }

    class z extends com.crrepa.l1.n {

        /* renamed from: a, reason: collision with root package name */
        private static final String f13572a = "year";

        /* renamed from: b, reason: collision with root package name */
        private static final String f13573b = "month";

        /* renamed from: c, reason: collision with root package name */
        private static final String f13574c = "dayOfMonth";

        /* renamed from: d, reason: collision with root package name */
        private static final String f13575d = "hourOfDay";

        /* renamed from: e, reason: collision with root package name */
        private static final String f13576e = "minute";

        /* renamed from: f, reason: collision with root package name */
        private static final String f13577f = "second";

        z() {
        }

        @Override // com.crrepa.l1.n
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Calendar a(com.crrepa.t1.a aVar) {
            if (aVar.t() == com.crrepa.t1.c.NULL) {
                aVar.q();
                return null;
            }
            aVar.b();
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            while (aVar.t() != com.crrepa.t1.c.END_OBJECT) {
                String p8 = aVar.p();
                int n8 = aVar.n();
                if (f13572a.equals(p8)) {
                    i8 = n8;
                } else if (f13573b.equals(p8)) {
                    i9 = n8;
                } else if (f13574c.equals(p8)) {
                    i10 = n8;
                } else if (f13575d.equals(p8)) {
                    i11 = n8;
                } else if (f13576e.equals(p8)) {
                    i12 = n8;
                } else if (f13577f.equals(p8)) {
                    i13 = n8;
                }
            }
            aVar.g();
            return new GregorianCalendar(i8, i9, i10, i11, i12, i13);
        }

        @Override // com.crrepa.l1.n
        public void a(com.crrepa.t1.b bVar, Calendar calendar) {
            if (calendar == null) {
                bVar.k();
                return;
            }
            bVar.d();
            bVar.b(f13572a);
            bVar.a(calendar.get(1));
            bVar.b(f13573b);
            bVar.a(calendar.get(2));
            bVar.b(f13574c);
            bVar.a(calendar.get(5));
            bVar.b(f13575d);
            bVar.a(calendar.get(11));
            bVar.b(f13576e);
            bVar.a(calendar.get(12));
            bVar.b(f13577f);
            bVar.a(calendar.get(13));
            bVar.f();
        }
    }

    public static <TT> com.crrepa.l1.p a(Class<TT> cls, com.crrepa.l1.n nVar) {
        return new f0(cls, nVar);
    }

    public static <TT> com.crrepa.l1.p b(Class<TT> cls, Class<? extends TT> cls2, com.crrepa.l1.n nVar) {
        return new h0(cls, cls2, nVar);
    }

    public static <TT> com.crrepa.l1.p a(Class<TT> cls, Class<TT> cls2, com.crrepa.l1.n nVar) {
        return new g0(cls, cls2, nVar);
    }
}
