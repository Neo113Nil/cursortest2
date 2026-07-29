package com.google.gson.internal.bind;

import com.google.gson.internal.bind.i;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.l;
import com.google.gson.m;
import com.google.gson.o;
import com.google.gson.r;
import com.google.gson.t;
import com.google.gson.u;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
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

/* compiled from: TypeAdapters.java */
/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final t<Class> f6606a = new t<Class>() { // from class: com.google.gson.internal.bind.i.1
        @Override // com.google.gson.t
        public void a(com.google.gson.c.c cVar, Class cls) throws IOException {
            throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?");
        }

        @Override // com.google.gson.t
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Class b(com.google.gson.c.a aVar) throws IOException {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }
    }.a();

    /* renamed from: b, reason: collision with root package name */
    public static final u f6607b = a(Class.class, f6606a);

    /* renamed from: c, reason: collision with root package name */
    public static final t<BitSet> f6608c = new t<BitSet>() { // from class: com.google.gson.internal.bind.i.12
        /* JADX WARN: Code restructure failed: missing block: B:10:0x0040, code lost:
        
            r5 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
        
            if (r7.m() != 0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x003d, code lost:
        
            if (java.lang.Integer.parseInt(r1) != 0) goto L19;
         */
        @Override // com.google.gson.t
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public BitSet b(com.google.gson.c.a aVar) throws IOException {
            BitSet bitSet = new BitSet();
            aVar.a();
            com.google.gson.c.b f2 = aVar.f();
            int i2 = 0;
            while (f2 != com.google.gson.c.b.END_ARRAY) {
                boolean z2 = true;
                switch (AnonymousClass23.f6610a[f2.ordinal()]) {
                    case 1:
                        break;
                    case 2:
                        z2 = aVar.i();
                        if (z2) {
                            bitSet.set(i2);
                        }
                        i2++;
                        f2 = aVar.f();
                    case 3:
                        String h2 = aVar.h();
                        try {
                            break;
                        } catch (NumberFormatException unused) {
                            throw new r("Error: Expecting: bitset number value (1, 0), Found: " + h2);
                        }
                    default:
                        throw new r("Invalid bitset value type: " + f2);
                }
            }
            aVar.b();
            return bitSet;
        }

        @Override // com.google.gson.t
        public void a(com.google.gson.c.c cVar, BitSet bitSet) throws IOException {
            cVar.b();
            int length = bitSet.length();
            for (int i2 = 0; i2 < length; i2++) {
                cVar.a(bitSet.get(i2) ? 1L : 0L);
            }
            cVar.c();
        }
    }.a();

    /* renamed from: d, reason: collision with root package name */
    public static final u f6609d = a(BitSet.class, f6608c);
    public static final t<Boolean> e = new t<Boolean>() { // from class: com.google.gson.internal.bind.i.22
        @Override // com.google.gson.t
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean b(com.google.gson.c.a aVar) throws IOException {
            com.google.gson.c.b f2 = aVar.f();
            if (f2 == com.google.gson.c.b.NULL) {
                aVar.j();
                return null;
            }
            if (f2 == com.google.gson.c.b.STRING) {
                return Boolean.valueOf(Boolean.parseBoolean(aVar.h()));
            }
            return Boolean.valueOf(aVar.i());
        }

        @Override // com.google.gson.t
        public void a(com.google.gson.c.c cVar, Boolean bool) throws IOException {
            cVar.a(bool);
        }
    };
    public static final t<Boolean> f = new t<Boolean>() { // from class: com.google.gson.internal.bind.i.24
        @Override // com.google.gson.t
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean b(com.google.gson.c.a aVar) throws IOException {
            if (aVar.f() == com.google.gson.c.b.NULL) {
                aVar.j();
                return null;
            }
            return Boolean.valueOf(aVar.h());
        }

        @Override // com.google.gson.t
        public void a(com.google.gson.c.c cVar, Boolean bool) throws IOException {
            cVar.b(bool == null ? "null" : bool.toString());
        }
    };
    public static final u g = a(Boolean.TYPE, Boolean.class, e);
    public static final t<Number> h = new t<Number>() { // from class: com.google.gson.internal.bind.i.25
        @Override // com.google.gson.t
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Number b(com.google.gson.c.a aVar) throws IOException {
            if (aVar.f() == com.google.gson.c.b.NULL) {
                aVar.j();
                return null;
            }
            try {
                return Byte.valueOf((byte) aVar.m());
            } catch (NumberFormatException e2) {
                throw new r(e2);
            }
        }

        @Override // com.google.gson.t
        public void a(com.google.gson.c.c cVar, Number number) throws IOException {
            cVar.a(number);
        }
    };
    public static final u i = a(Byte.TYPE, Byte.class, h);
    public static final t<Number> j = new t<Number>() { // from class: com.google.gson.internal.bind.i.26
        @Override // com.google.gson.t
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Number b(com.google.gson.c.a aVar) throws IOException {
            if (aVar.f() == com.google.gson.c.b.NULL) {
                aVar.j();
                return null;
            }
            try {
                return Short.valueOf((short) aVar.m());
            } catch (NumberFormatException e2) {
                throw new r(e2);
            }
        }

        @Override // com.google.gson.t
        public void a(com.google.gson.c.c cVar, Number number) throws IOException {
            cVar.a(number);
        }
    };
    public static final u k = a(Short.TYPE, Short.class, j);
    public static final t<Number> l = new t<Number>() { // from class: com.google.gson.internal.bind.i.27
        @Override // com.google.gson.t
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Number b(com.google.gson.c.a aVar) throws IOException {
            if (aVar.f() == com.google.gson.c.b.NULL) {
                aVar.j();
                return null;
            }
            try {
                return Integer.valueOf(aVar.m());
            } catch (NumberFormatException e2) {
                throw new r(e2);
            }
        }

        @Override // com.google.gson.t
        public void a(com.google.gson.c.c cVar, Number number) throws IOException {
            cVar.a(number);
        }
    };
    public static final u m = a(Integer.TYPE, Integer.class, l);
    public static final t<AtomicInteger> n = new t<AtomicInteger>() { // from class: com.google.gson.internal.bind.i.28
        @Override // com.google.gson.t
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AtomicInteger b(com.google.gson.c.a aVar) throws IOException {
            try {
                return new AtomicInteger(aVar.m());
            } catch (NumberFormatException e2) {
                throw new r(e2);
            }
        }

        @Override // com.google.gson.t
        public void a(com.google.gson.c.c cVar, AtomicInteger atomicInteger) throws IOException {
            cVar.a(atomicInteger.get());
        }
    }.a();
    public static final u o = a(AtomicInteger.class, n);
    public static final t<AtomicBoolean> p = new t<AtomicBoolean>() { // from class: com.google.gson.internal.bind.i.29
        @Override // com.google.gson.t
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AtomicBoolean b(com.google.gson.c.a aVar) throws IOException {
            return new AtomicBoolean(aVar.i());
        }

        @Override // com.google.gson.t
        public void a(com.google.gson.c.c cVar, AtomicBoolean atomicBoolean) throws IOException {
            cVar.a(atomicBoolean.get());
        }
    }.a();
    public static final u q = a(AtomicBoolean.class, p);
    public static final t<AtomicIntegerArray> r = new t<AtomicIntegerArray>() { // from class: com.google.gson.internal.bind.i.2
        @Override // com.google.gson.t
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AtomicIntegerArray b(com.google.gson.c.a aVar) throws IOException {
            ArrayList arrayList = new ArrayList();
            aVar.a();
            while (aVar.e()) {
                try {
                    arrayList.add(Integer.valueOf(aVar.m()));
                } catch (NumberFormatException e2) {
                    throw new r(e2);
                }
            }
            aVar.b();
            int size = arrayList.size();
            AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
            for (int i2 = 0; i2 < size; i2++) {
                atomicIntegerArray.set(i2, ((Integer) arrayList.get(i2)).intValue());
            }
            return atomicIntegerArray;
        }

        @Override // com.google.gson.t
        public void a(com.google.gson.c.c cVar, AtomicIntegerArray atomicIntegerArray) throws IOException {
            cVar.b();
            int length = atomicIntegerArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                cVar.a(atomicIntegerArray.get(i2));
            }
            cVar.c();
        }
    }.a();
    public static final u s = a(AtomicIntegerArray.class, r);
    public static final t<Number> t = new t<Number>() { // from class: com.google.gson.internal.bind.i.3
        @Override // com.google.gson.t
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Number b(com.google.gson.c.a aVar) throws IOException {
            if (aVar.f() == com.google.gson.c.b.NULL) {
                aVar.j();
                return null;
            }
            try {
                return Long.valueOf(aVar.l());
            } catch (NumberFormatException e2) {
                throw new r(e2);
            }
        }

        @Override // com.google.gson.t
        public void a(com.google.gson.c.c cVar, Number number) throws IOException {
            cVar.a(number);
        }
    };
    public static final t<Number> u = new t<Number>() { // from class: com.google.gson.internal.bind.i.4
        @Override // com.google.gson.t
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Number b(com.google.gson.c.a aVar) throws IOException {
            if (aVar.f() == com.google.gson.c.b.NULL) {
                aVar.j();
                return null;
            }
            return Float.valueOf((float) aVar.k());
        }

        @Override // com.google.gson.t
        public void a(com.google.gson.c.c cVar, Number number) throws IOException {
            cVar.a(number);
        }
    };
    public static final t<Number> v = new t<Number>() { // from class: com.google.gson.internal.bind.i.5
        @Override // com.google.gson.t
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Number b(com.google.gson.c.a aVar) throws IOException {
            if (aVar.f() == com.google.gson.c.b.NULL) {
                aVar.j();
                return null;
            }
            return Double.valueOf(aVar.k());
        }

        @Override // com.google.gson.t
        public void a(com.google.gson.c.c cVar, Number number) throws IOException {
            cVar.a(number);
        }
    };
    public static final t<Number> w = new t<Number>() { // from class: com.google.gson.internal.bind.i.6
        @Override // com.google.gson.t
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Number b(com.google.gson.c.a aVar) throws IOException {
            com.google.gson.c.b f2 = aVar.f();
            int i2 = AnonymousClass23.f6610a[f2.ordinal()];
            if (i2 != 1) {
                switch (i2) {
                    case 3:
                        break;
                    case 4:
                        aVar.j();
                        return null;
                    default:
                        throw new r("Expecting number, got: " + f2);
                }
            }
            return new com.google.gson.internal.e(aVar.h());
        }

        @Override // com.google.gson.t
        public void a(com.google.gson.c.c cVar, Number number) throws IOException {
            cVar.a(number);
        }
    };
    public static final u x = a(Number.class, w);
    public static final t<Character> y = new t<Character>() { // from class: com.google.gson.internal.bind.i.7
        @Override // com.google.gson.t
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Character b(com.google.gson.c.a aVar) throws IOException {
            if (aVar.f() == com.google.gson.c.b.NULL) {
                aVar.j();
                return null;
            }
            String h2 = aVar.h();
            if (h2.length() != 1) {
                throw new r("Expecting character, got: " + h2);
            }
            return Character.valueOf(h2.charAt(0));
        }

        @Override // com.google.gson.t
        public void a(com.google.gson.c.c cVar, Character ch) throws IOException {
            cVar.b(ch == null ? null : String.valueOf(ch));
        }
    };
    public static final u z = a(Character.TYPE, Character.class, y);
    public static final t<String> A = new t<String>() { // from class: com.google.gson.internal.bind.i.8
        @Override // com.google.gson.t
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String b(com.google.gson.c.a aVar) throws IOException {
            com.google.gson.c.b f2 = aVar.f();
            if (f2 == com.google.gson.c.b.NULL) {
                aVar.j();
                return null;
            }
            if (f2 == com.google.gson.c.b.BOOLEAN) {
                return Boolean.toString(aVar.i());
            }
            return aVar.h();
        }

        @Override // com.google.gson.t
        public void a(com.google.gson.c.c cVar, String str) throws IOException {
            cVar.b(str);
        }
    };
    public static final t<BigDecimal> B = new t<BigDecimal>() { // from class: com.google.gson.internal.bind.i.9
        @Override // com.google.gson.t
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public BigDecimal b(com.google.gson.c.a aVar) throws IOException {
            if (aVar.f() == com.google.gson.c.b.NULL) {
                aVar.j();
                return null;
            }
            try {
                return new BigDecimal(aVar.h());
            } catch (NumberFormatException e2) {
                throw new r(e2);
            }
        }

        @Override // com.google.gson.t
        public void a(com.google.gson.c.c cVar, BigDecimal bigDecimal) throws IOException {
            cVar.a(bigDecimal);
        }
    };
    public static final t<BigInteger> C = new t<BigInteger>() { // from class: com.google.gson.internal.bind.i.10
        @Override // com.google.gson.t
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public BigInteger b(com.google.gson.c.a aVar) throws IOException {
            if (aVar.f() == com.google.gson.c.b.NULL) {
                aVar.j();
                return null;
            }
            try {
                return new BigInteger(aVar.h());
            } catch (NumberFormatException e2) {
                throw new r(e2);
            }
        }

        @Override // com.google.gson.t
        public void a(com.google.gson.c.c cVar, BigInteger bigInteger) throws IOException {
            cVar.a(bigInteger);
        }
    };
    public static final u D = a(String.class, A);
    public static final t<StringBuilder> E = new t<StringBuilder>() { // from class: com.google.gson.internal.bind.i.11
        @Override // com.google.gson.t
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public StringBuilder b(com.google.gson.c.a aVar) throws IOException {
            if (aVar.f() == com.google.gson.c.b.NULL) {
                aVar.j();
                return null;
            }
            return new StringBuilder(aVar.h());
        }

        @Override // com.google.gson.t
        public void a(com.google.gson.c.c cVar, StringBuilder sb) throws IOException {
            cVar.b(sb == null ? null : sb.toString());
        }
    };
    public static final u F = a(StringBuilder.class, E);
    public static final t<StringBuffer> G = new t<StringBuffer>() { // from class: com.google.gson.internal.bind.i.13
        @Override // com.google.gson.t
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public StringBuffer b(com.google.gson.c.a aVar) throws IOException {
            if (aVar.f() == com.google.gson.c.b.NULL) {
                aVar.j();
                return null;
            }
            return new StringBuffer(aVar.h());
        }

        @Override // com.google.gson.t
        public void a(com.google.gson.c.c cVar, StringBuffer stringBuffer) throws IOException {
            cVar.b(stringBuffer == null ? null : stringBuffer.toString());
        }
    };
    public static final u H = a(StringBuffer.class, G);
    public static final t<URL> I = new t<URL>() { // from class: com.google.gson.internal.bind.i.14
        @Override // com.google.gson.t
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public URL b(com.google.gson.c.a aVar) throws IOException {
            if (aVar.f() == com.google.gson.c.b.NULL) {
                aVar.j();
                return null;
            }
            String h2 = aVar.h();
            if ("null".equals(h2)) {
                return null;
            }
            return new URL(h2);
        }

        @Override // com.google.gson.t
        public void a(com.google.gson.c.c cVar, URL url) throws IOException {
            cVar.b(url == null ? null : url.toExternalForm());
        }
    };
    public static final u J = a(URL.class, I);
    public static final t<URI> K = new t<URI>() { // from class: com.google.gson.internal.bind.i.15
        @Override // com.google.gson.t
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public URI b(com.google.gson.c.a aVar) throws IOException {
            if (aVar.f() == com.google.gson.c.b.NULL) {
                aVar.j();
                return null;
            }
            try {
                String h2 = aVar.h();
                if ("null".equals(h2)) {
                    return null;
                }
                return new URI(h2);
            } catch (URISyntaxException e2) {
                throw new k(e2);
            }
        }

        @Override // com.google.gson.t
        public void a(com.google.gson.c.c cVar, URI uri) throws IOException {
            cVar.b(uri == null ? null : uri.toASCIIString());
        }
    };
    public static final u L = a(URI.class, K);
    public static final t<InetAddress> M = new t<InetAddress>() { // from class: com.google.gson.internal.bind.i.16
        @Override // com.google.gson.t
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public InetAddress b(com.google.gson.c.a aVar) throws IOException {
            if (aVar.f() == com.google.gson.c.b.NULL) {
                aVar.j();
                return null;
            }
            return InetAddress.getByName(aVar.h());
        }

        @Override // com.google.gson.t
        public void a(com.google.gson.c.c cVar, InetAddress inetAddress) throws IOException {
            cVar.b(inetAddress == null ? null : inetAddress.getHostAddress());
        }
    };
    public static final u N = b(InetAddress.class, M);
    public static final t<UUID> O = new t<UUID>() { // from class: com.google.gson.internal.bind.i.17
        @Override // com.google.gson.t
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public UUID b(com.google.gson.c.a aVar) throws IOException {
            if (aVar.f() == com.google.gson.c.b.NULL) {
                aVar.j();
                return null;
            }
            return UUID.fromString(aVar.h());
        }

        @Override // com.google.gson.t
        public void a(com.google.gson.c.c cVar, UUID uuid) throws IOException {
            cVar.b(uuid == null ? null : uuid.toString());
        }
    };
    public static final u P = a(UUID.class, O);
    public static final t<Currency> Q = new t<Currency>() { // from class: com.google.gson.internal.bind.i.18
        @Override // com.google.gson.t
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Currency b(com.google.gson.c.a aVar) throws IOException {
            return Currency.getInstance(aVar.h());
        }

        @Override // com.google.gson.t
        public void a(com.google.gson.c.c cVar, Currency currency) throws IOException {
            cVar.b(currency.getCurrencyCode());
        }
    }.a();
    public static final u R = a(Currency.class, Q);
    public static final u S = new u() { // from class: com.google.gson.internal.bind.TypeAdapters$26
        @Override // com.google.gson.u
        public <T> t<T> a(com.google.gson.e eVar, com.google.gson.b.a<T> aVar) {
            if (aVar.getRawType() != Timestamp.class) {
                return null;
            }
            final t<T> a2 = eVar.a((Class) Date.class);
            return (t<T>) new t<Timestamp>() { // from class: com.google.gson.internal.bind.TypeAdapters$26.1
                @Override // com.google.gson.t
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public Timestamp b(com.google.gson.c.a aVar2) throws IOException {
                    Date date = (Date) a2.b(aVar2);
                    if (date != null) {
                        return new Timestamp(date.getTime());
                    }
                    return null;
                }

                @Override // com.google.gson.t
                public void a(com.google.gson.c.c cVar, Timestamp timestamp) throws IOException {
                    a2.a(cVar, timestamp);
                }
            };
        }
    };
    public static final t<Calendar> T = new t<Calendar>() { // from class: com.google.gson.internal.bind.i.19
        @Override // com.google.gson.t
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Calendar b(com.google.gson.c.a aVar) throws IOException {
            if (aVar.f() == com.google.gson.c.b.NULL) {
                aVar.j();
                return null;
            }
            aVar.c();
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            while (aVar.f() != com.google.gson.c.b.END_OBJECT) {
                String g2 = aVar.g();
                int m2 = aVar.m();
                if ("year".equals(g2)) {
                    i2 = m2;
                } else if ("month".equals(g2)) {
                    i3 = m2;
                } else if ("dayOfMonth".equals(g2)) {
                    i4 = m2;
                } else if ("hourOfDay".equals(g2)) {
                    i5 = m2;
                } else if ("minute".equals(g2)) {
                    i6 = m2;
                } else if ("second".equals(g2)) {
                    i7 = m2;
                }
            }
            aVar.d();
            return new GregorianCalendar(i2, i3, i4, i5, i6, i7);
        }

        @Override // com.google.gson.t
        public void a(com.google.gson.c.c cVar, Calendar calendar) throws IOException {
            if (calendar == null) {
                cVar.f();
                return;
            }
            cVar.d();
            cVar.a("year");
            cVar.a(calendar.get(1));
            cVar.a("month");
            cVar.a(calendar.get(2));
            cVar.a("dayOfMonth");
            cVar.a(calendar.get(5));
            cVar.a("hourOfDay");
            cVar.a(calendar.get(11));
            cVar.a("minute");
            cVar.a(calendar.get(12));
            cVar.a("second");
            cVar.a(calendar.get(13));
            cVar.e();
        }
    };
    public static final u U = b(Calendar.class, GregorianCalendar.class, T);
    public static final t<Locale> V = new t<Locale>() { // from class: com.google.gson.internal.bind.i.20
        @Override // com.google.gson.t
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Locale b(com.google.gson.c.a aVar) throws IOException {
            if (aVar.f() == com.google.gson.c.b.NULL) {
                aVar.j();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(aVar.h(), "_");
            String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String nextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            if (nextToken2 == null && nextToken3 == null) {
                return new Locale(nextToken);
            }
            if (nextToken3 == null) {
                return new Locale(nextToken, nextToken2);
            }
            return new Locale(nextToken, nextToken2, nextToken3);
        }

        @Override // com.google.gson.t
        public void a(com.google.gson.c.c cVar, Locale locale) throws IOException {
            cVar.b(locale == null ? null : locale.toString());
        }
    };
    public static final u W = a(Locale.class, V);
    public static final t<j> X = new t<j>() { // from class: com.google.gson.internal.bind.i.21
        @Override // com.google.gson.t
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public j b(com.google.gson.c.a aVar) throws IOException {
            switch (AnonymousClass23.f6610a[aVar.f().ordinal()]) {
                case 1:
                    return new o((Number) new com.google.gson.internal.e(aVar.h()));
                case 2:
                    return new o(Boolean.valueOf(aVar.i()));
                case 3:
                    return new o(aVar.h());
                case 4:
                    aVar.j();
                    return l.f6665a;
                case 5:
                    com.google.gson.g gVar = new com.google.gson.g();
                    aVar.a();
                    while (aVar.e()) {
                        gVar.a(b(aVar));
                    }
                    aVar.b();
                    return gVar;
                case 6:
                    m mVar = new m();
                    aVar.c();
                    while (aVar.e()) {
                        mVar.a(aVar.g(), b(aVar));
                    }
                    aVar.d();
                    return mVar;
                default:
                    throw new IllegalArgumentException();
            }
        }

        @Override // com.google.gson.t
        public void a(com.google.gson.c.c cVar, j jVar) throws IOException {
            if (jVar == null || jVar.l()) {
                cVar.f();
                return;
            }
            if (jVar.k()) {
                o o2 = jVar.o();
                if (o2.q()) {
                    cVar.a(o2.b());
                    return;
                } else if (o2.a()) {
                    cVar.a(o2.h());
                    return;
                } else {
                    cVar.b(o2.c());
                    return;
                }
            }
            if (jVar.i()) {
                cVar.b();
                Iterator<j> it = jVar.n().iterator();
                while (it.hasNext()) {
                    a(cVar, it.next());
                }
                cVar.c();
                return;
            }
            if (jVar.j()) {
                cVar.d();
                for (Map.Entry<String, j> entry : jVar.m().a()) {
                    cVar.a(entry.getKey());
                    a(cVar, entry.getValue());
                }
                cVar.e();
                return;
            }
            throw new IllegalArgumentException("Couldn't write " + jVar.getClass());
        }
    };
    public static final u Y = b(j.class, X);
    public static final u Z = new u() { // from class: com.google.gson.internal.bind.TypeAdapters$30
        @Override // com.google.gson.u
        public <T> t<T> a(com.google.gson.e eVar, com.google.gson.b.a<T> aVar) {
            Class<? super T> rawType = aVar.getRawType();
            if (!Enum.class.isAssignableFrom(rawType) || rawType == Enum.class) {
                return null;
            }
            if (!rawType.isEnum()) {
                rawType = rawType.getSuperclass();
            }
            return new i.a(rawType);
        }
    };

    /* compiled from: TypeAdapters.java */
    /* renamed from: com.google.gson.internal.bind.i$23, reason: invalid class name */
    static /* synthetic */ class AnonymousClass23 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f6610a = new int[com.google.gson.c.b.values().length];

        static {
            try {
                f6610a[com.google.gson.c.b.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6610a[com.google.gson.c.b.BOOLEAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6610a[com.google.gson.c.b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6610a[com.google.gson.c.b.NULL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6610a[com.google.gson.c.b.BEGIN_ARRAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6610a[com.google.gson.c.b.BEGIN_OBJECT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f6610a[com.google.gson.c.b.END_DOCUMENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f6610a[com.google.gson.c.b.NAME.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f6610a[com.google.gson.c.b.END_OBJECT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f6610a[com.google.gson.c.b.END_ARRAY.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TypeAdapters.java */
    static final class a<T extends Enum<T>> extends t<T> {

        /* renamed from: a, reason: collision with root package name */
        private final Map<String, T> f6611a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        private final Map<T, String> f6612b = new HashMap();

        public a(Class<T> cls) {
            try {
                for (T t : cls.getEnumConstants()) {
                    String name = t.name();
                    com.google.gson.a.c cVar = (com.google.gson.a.c) cls.getField(name).getAnnotation(com.google.gson.a.c.class);
                    if (cVar != null) {
                        name = cVar.a();
                        for (String str : cVar.b()) {
                            this.f6611a.put(str, t);
                        }
                    }
                    this.f6611a.put(name, t);
                    this.f6612b.put(t, name);
                }
            } catch (NoSuchFieldException e) {
                throw new AssertionError(e);
            }
        }

        @Override // com.google.gson.t
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public T b(com.google.gson.c.a aVar) throws IOException {
            if (aVar.f() == com.google.gson.c.b.NULL) {
                aVar.j();
                return null;
            }
            return this.f6611a.get(aVar.h());
        }

        @Override // com.google.gson.t
        public void a(com.google.gson.c.c cVar, T t) throws IOException {
            cVar.b(t == null ? null : this.f6612b.get(t));
        }
    }

    public static <TT> u a(final Class<TT> cls, final t<TT> tVar) {
        return new u() { // from class: com.google.gson.internal.bind.TypeAdapters$32
            @Override // com.google.gson.u
            public <T> t<T> a(com.google.gson.e eVar, com.google.gson.b.a<T> aVar) {
                if (aVar.getRawType() == cls) {
                    return tVar;
                }
                return null;
            }

            public String toString() {
                return "Factory[type=" + cls.getName() + ",adapter=" + tVar + "]";
            }
        };
    }

    public static <TT> u a(final Class<TT> cls, final Class<TT> cls2, final t<? super TT> tVar) {
        return new u() { // from class: com.google.gson.internal.bind.TypeAdapters$33
            @Override // com.google.gson.u
            public <T> t<T> a(com.google.gson.e eVar, com.google.gson.b.a<T> aVar) {
                Class<? super T> rawType = aVar.getRawType();
                if (rawType == cls || rawType == cls2) {
                    return tVar;
                }
                return null;
            }

            public String toString() {
                return "Factory[type=" + cls2.getName() + "+" + cls.getName() + ",adapter=" + tVar + "]";
            }
        };
    }

    public static <TT> u b(final Class<TT> cls, final Class<? extends TT> cls2, final t<? super TT> tVar) {
        return new u() { // from class: com.google.gson.internal.bind.TypeAdapters$34
            @Override // com.google.gson.u
            public <T> t<T> a(com.google.gson.e eVar, com.google.gson.b.a<T> aVar) {
                Class<? super T> rawType = aVar.getRawType();
                if (rawType == cls || rawType == cls2) {
                    return tVar;
                }
                return null;
            }

            public String toString() {
                return "Factory[type=" + cls.getName() + "+" + cls2.getName() + ",adapter=" + tVar + "]";
            }
        };
    }

    public static <T1> u b(final Class<T1> cls, final t<T1> tVar) {
        return new u() { // from class: com.google.gson.internal.bind.TypeAdapters$35
            @Override // com.google.gson.u
            public <T2> t<T2> a(com.google.gson.e eVar, com.google.gson.b.a<T2> aVar) {
                final Class<? super T2> rawType = aVar.getRawType();
                if (cls.isAssignableFrom(rawType)) {
                    return (t<T2>) new t<T1>() { // from class: com.google.gson.internal.bind.TypeAdapters$35.1
                        @Override // com.google.gson.t
                        public void a(com.google.gson.c.c cVar, T1 t1) throws IOException {
                            tVar.a(cVar, t1);
                        }

                        @Override // com.google.gson.t
                        public T1 b(com.google.gson.c.a aVar2) throws IOException {
                            T1 t1 = (T1) tVar.b(aVar2);
                            if (t1 == null || rawType.isInstance(t1)) {
                                return t1;
                            }
                            throw new r("Expected a " + rawType.getName() + " but was " + t1.getClass().getName());
                        }
                    };
                }
                return null;
            }

            public String toString() {
                return "Factory[typeHierarchy=" + cls.getName() + ",adapter=" + tVar + "]";
            }
        };
    }
}
