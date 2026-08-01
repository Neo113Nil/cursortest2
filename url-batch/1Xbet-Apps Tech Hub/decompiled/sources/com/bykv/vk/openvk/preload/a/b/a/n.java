package com.bykv.vk.openvk.preload.a.b.a;

import com.bykv.vk.openvk.preload.a.p;
import com.bykv.vk.openvk.preload.a.r;
import com.bykv.vk.openvk.preload.a.t;
import com.bykv.vk.openvk.preload.a.u;
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
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.slf4j.Marker;

/* compiled from: TypeAdapters.java */
/* loaded from: classes.dex */
public final class n {
    public static final t<String> A;
    public static final t<BigDecimal> B;
    public static final t<BigInteger> C;
    public static final u D;
    public static final t<StringBuilder> E;
    public static final u F;
    public static final t<StringBuffer> G;
    public static final u H;
    public static final t<URL> I;
    public static final u J;
    public static final t<URI> K;
    public static final u L;
    public static final t<InetAddress> M;
    public static final u N;
    public static final t<UUID> O;
    public static final u P;
    public static final t<Currency> Q;
    public static final u R;
    public static final u S;
    public static final t<Calendar> T;
    public static final u U;
    public static final t<Locale> V;
    public static final u W;
    public static final t<com.bykv.vk.openvk.preload.a.k> X;
    public static final u Y;
    public static final u Z;
    public static final t<Class> a;
    public static final u b;
    public static final t<BitSet> c;
    public static final u d;
    public static final t<Boolean> e;
    public static final t<Boolean> f;
    public static final u g;
    public static final t<Number> h;
    public static final u i;
    public static final t<Number> j;
    public static final u k;
    public static final t<Number> l;
    public static final u m;
    public static final t<AtomicInteger> n;
    public static final u o;
    public static final t<AtomicBoolean> p;
    public static final u q;
    public static final t<AtomicIntegerArray> r;
    public static final u s;
    public static final t<Number> t;
    public static final t<Number> u;
    public static final t<Number> v;
    public static final t<Number> w;
    public static final u x;
    public static final t<Character> y;
    public static final u z;

    static {
        t<Class> a2 = new t<Class>() { // from class: com.bykv.vk.openvk.preload.a.b.a.n.1
            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* synthetic */ void a(com.bykv.vk.openvk.preload.a.d.c cVar, Class cls) throws IOException {
                throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?");
            }

            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* synthetic */ Class a(com.bykv.vk.openvk.preload.a.d.a aVar) throws IOException {
                throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
            }
        }.a();
        a = a2;
        b = a(Class.class, a2);
        t<BitSet> a3 = new t<BitSet>() { // from class: com.bykv.vk.openvk.preload.a.b.a.n.12
            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* synthetic */ BitSet a(com.bykv.vk.openvk.preload.a.d.a aVar) throws IOException {
                return b(aVar);
            }

            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* synthetic */ void a(com.bykv.vk.openvk.preload.a.d.c cVar, BitSet bitSet) throws IOException {
                BitSet bitSet2 = bitSet;
                cVar.a();
                int length = bitSet2.length();
                for (int i2 = 0; i2 < length; i2++) {
                    cVar.a(bitSet2.get(i2) ? 1L : 0L);
                }
                cVar.b();
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
            
                if (java.lang.Integer.parseInt(r1) != 0) goto L23;
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
            
                r5 = false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:29:0x0059, code lost:
            
                if (r7.n() != 0) goto L23;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static BitSet b(com.bykv.vk.openvk.preload.a.d.a aVar) throws IOException {
                BitSet bitSet = new BitSet();
                aVar.a();
                com.bykv.vk.openvk.preload.a.d.b f2 = aVar.f();
                int i2 = 0;
                while (f2 != com.bykv.vk.openvk.preload.a.d.b.END_ARRAY) {
                    int i3 = AnonymousClass30.a[f2.ordinal()];
                    boolean z2 = true;
                    if (i3 != 1) {
                        if (i3 == 2) {
                            z2 = aVar.j();
                        } else if (i3 == 3) {
                            String i4 = aVar.i();
                            try {
                            } catch (NumberFormatException unused) {
                                throw new r("Error: Expecting: bitset number value (1, 0), Found: ".concat(String.valueOf(i4)));
                            }
                        } else {
                            throw new r("Invalid bitset value type: ".concat(String.valueOf(f2)));
                        }
                        if (z2) {
                            bitSet.set(i2);
                        }
                        i2++;
                        f2 = aVar.f();
                    }
                }
                aVar.b();
                return bitSet;
            }
        }.a();
        c = a3;
        d = a(BitSet.class, a3);
        t<Boolean> tVar = new t<Boolean>() { // from class: com.bykv.vk.openvk.preload.a.b.a.n.23
            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* bridge */ /* synthetic */ void a(com.bykv.vk.openvk.preload.a.d.c cVar, Boolean bool) throws IOException {
                cVar.a(bool);
            }

            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* synthetic */ Boolean a(com.bykv.vk.openvk.preload.a.d.a aVar) throws IOException {
                com.bykv.vk.openvk.preload.a.d.b f2 = aVar.f();
                if (f2 == com.bykv.vk.openvk.preload.a.d.b.NULL) {
                    aVar.k();
                    return null;
                }
                if (f2 == com.bykv.vk.openvk.preload.a.d.b.STRING) {
                    return Boolean.valueOf(Boolean.parseBoolean(aVar.i()));
                }
                return Boolean.valueOf(aVar.j());
            }
        };
        e = tVar;
        f = new t<Boolean>() { // from class: com.bykv.vk.openvk.preload.a.b.a.n.31
            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* synthetic */ void a(com.bykv.vk.openvk.preload.a.d.c cVar, Boolean bool) throws IOException {
                Boolean bool2 = bool;
                cVar.b(bool2 == null ? AbstractJsonLexerKt.NULL : bool2.toString());
            }

            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* synthetic */ Boolean a(com.bykv.vk.openvk.preload.a.d.a aVar) throws IOException {
                if (aVar.f() == com.bykv.vk.openvk.preload.a.d.b.NULL) {
                    aVar.k();
                    return null;
                }
                return Boolean.valueOf(aVar.i());
            }
        };
        g = a(Boolean.TYPE, Boolean.class, tVar);
        t<Number> tVar2 = new t<Number>() { // from class: com.bykv.vk.openvk.preload.a.b.a.n.32
            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* synthetic */ Number a(com.bykv.vk.openvk.preload.a.d.a aVar) throws IOException {
                return b(aVar);
            }

            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* bridge */ /* synthetic */ void a(com.bykv.vk.openvk.preload.a.d.c cVar, Number number) throws IOException {
                cVar.a(number);
            }

            private static Number b(com.bykv.vk.openvk.preload.a.d.a aVar) throws IOException {
                if (aVar.f() == com.bykv.vk.openvk.preload.a.d.b.NULL) {
                    aVar.k();
                    return null;
                }
                try {
                    return Byte.valueOf((byte) aVar.n());
                } catch (NumberFormatException e2) {
                    throw new r(e2);
                }
            }
        };
        h = tVar2;
        i = a(Byte.TYPE, Byte.class, tVar2);
        t<Number> tVar3 = new t<Number>() { // from class: com.bykv.vk.openvk.preload.a.b.a.n.33
            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* synthetic */ Number a(com.bykv.vk.openvk.preload.a.d.a aVar) throws IOException {
                return b(aVar);
            }

            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* bridge */ /* synthetic */ void a(com.bykv.vk.openvk.preload.a.d.c cVar, Number number) throws IOException {
                cVar.a(number);
            }

            private static Number b(com.bykv.vk.openvk.preload.a.d.a aVar) throws IOException {
                if (aVar.f() == com.bykv.vk.openvk.preload.a.d.b.NULL) {
                    aVar.k();
                    return null;
                }
                try {
                    return Short.valueOf((short) aVar.n());
                } catch (NumberFormatException e2) {
                    throw new r(e2);
                }
            }
        };
        j = tVar3;
        k = a(Short.TYPE, Short.class, tVar3);
        t<Number> tVar4 = new t<Number>() { // from class: com.bykv.vk.openvk.preload.a.b.a.n.34
            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* synthetic */ Number a(com.bykv.vk.openvk.preload.a.d.a aVar) throws IOException {
                return b(aVar);
            }

            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* bridge */ /* synthetic */ void a(com.bykv.vk.openvk.preload.a.d.c cVar, Number number) throws IOException {
                cVar.a(number);
            }

            private static Number b(com.bykv.vk.openvk.preload.a.d.a aVar) throws IOException {
                if (aVar.f() == com.bykv.vk.openvk.preload.a.d.b.NULL) {
                    aVar.k();
                    return null;
                }
                try {
                    return Integer.valueOf(aVar.n());
                } catch (NumberFormatException e2) {
                    throw new r(e2);
                }
            }
        };
        l = tVar4;
        m = a(Integer.TYPE, Integer.class, tVar4);
        t<AtomicInteger> a4 = new t<AtomicInteger>() { // from class: com.bykv.vk.openvk.preload.a.b.a.n.35
            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* synthetic */ AtomicInteger a(com.bykv.vk.openvk.preload.a.d.a aVar) throws IOException {
                return b(aVar);
            }

            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* synthetic */ void a(com.bykv.vk.openvk.preload.a.d.c cVar, AtomicInteger atomicInteger) throws IOException {
                cVar.a(atomicInteger.get());
            }

            private static AtomicInteger b(com.bykv.vk.openvk.preload.a.d.a aVar) throws IOException {
                try {
                    return new AtomicInteger(aVar.n());
                } catch (NumberFormatException e2) {
                    throw new r(e2);
                }
            }
        }.a();
        n = a4;
        o = a(AtomicInteger.class, a4);
        t<AtomicBoolean> a5 = new t<AtomicBoolean>() { // from class: com.bykv.vk.openvk.preload.a.b.a.n.36
            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* synthetic */ void a(com.bykv.vk.openvk.preload.a.d.c cVar, AtomicBoolean atomicBoolean) throws IOException {
                cVar.a(atomicBoolean.get());
            }

            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* synthetic */ AtomicBoolean a(com.bykv.vk.openvk.preload.a.d.a aVar) throws IOException {
                return new AtomicBoolean(aVar.j());
            }
        }.a();
        p = a5;
        q = a(AtomicBoolean.class, a5);
        t<AtomicIntegerArray> a6 = new t<AtomicIntegerArray>() { // from class: com.bykv.vk.openvk.preload.a.b.a.n.2
            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* synthetic */ AtomicIntegerArray a(com.bykv.vk.openvk.preload.a.d.a aVar) throws IOException {
                return b(aVar);
            }

            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* synthetic */ void a(com.bykv.vk.openvk.preload.a.d.c cVar, AtomicIntegerArray atomicIntegerArray) throws IOException {
                cVar.a();
                int length = atomicIntegerArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    cVar.a(r6.get(i2));
                }
                cVar.b();
            }

            private static AtomicIntegerArray b(com.bykv.vk.openvk.preload.a.d.a aVar) throws IOException {
                ArrayList arrayList = new ArrayList();
                aVar.a();
                while (aVar.e()) {
                    try {
                        arrayList.add(Integer.valueOf(aVar.n()));
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
        }.a();
        r = a6;
        s = a(AtomicIntegerArray.class, a6);
        t = new t<Number>() { // from class: com.bykv.vk.openvk.preload.a.b.a.n.3
            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* synthetic */ Number a(com.bykv.vk.openvk.preload.a.d.a aVar) throws IOException {
                return b(aVar);
            }

            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* bridge */ /* synthetic */ void a(com.bykv.vk.openvk.preload.a.d.c cVar, Number number) throws IOException {
                cVar.a(number);
            }

            private static Number b(com.bykv.vk.openvk.preload.a.d.a aVar) throws IOException {
                if (aVar.f() == com.bykv.vk.openvk.preload.a.d.b.NULL) {
                    aVar.k();
                    return null;
                }
                try {
                    return Long.valueOf(aVar.m());
                } catch (NumberFormatException e2) {
                    throw new r(e2);
                }
            }
        };
        u = new t<Number>() { // from class: com.bykv.vk.openvk.preload.a.b.a.n.4
            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* bridge */ /* synthetic */ void a(com.bykv.vk.openvk.preload.a.d.c cVar, Number number) throws IOException {
                cVar.a(number);
            }

            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* synthetic */ Number a(com.bykv.vk.openvk.preload.a.d.a aVar) throws IOException {
                if (aVar.f() == com.bykv.vk.openvk.preload.a.d.b.NULL) {
                    aVar.k();
                    return null;
                }
                return Float.valueOf((float) aVar.l());
            }
        };
        v = new t<Number>() { // from class: com.bykv.vk.openvk.preload.a.b.a.n.5
            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* bridge */ /* synthetic */ void a(com.bykv.vk.openvk.preload.a.d.c cVar, Number number) throws IOException {
                cVar.a(number);
            }

            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* synthetic */ Number a(com.bykv.vk.openvk.preload.a.d.a aVar) throws IOException {
                if (aVar.f() == com.bykv.vk.openvk.preload.a.d.b.NULL) {
                    aVar.k();
                    return null;
                }
                return Double.valueOf(aVar.l());
            }
        };
        t<Number> tVar5 = new t<Number>() { // from class: com.bykv.vk.openvk.preload.a.b.a.n.6
            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* bridge */ /* synthetic */ void a(com.bykv.vk.openvk.preload.a.d.c cVar, Number number) throws IOException {
                cVar.a(number);
            }

            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* synthetic */ Number a(com.bykv.vk.openvk.preload.a.d.a aVar) throws IOException {
                com.bykv.vk.openvk.preload.a.d.b f2 = aVar.f();
                int i2 = AnonymousClass30.a[f2.ordinal()];
                if (i2 == 1 || i2 == 3) {
                    return new com.bykv.vk.openvk.preload.a.b.g(aVar.i());
                }
                if (i2 == 4) {
                    aVar.k();
                    return null;
                }
                throw new r("Expecting number, got: ".concat(String.valueOf(f2)));
            }
        };
        w = tVar5;
        x = a(Number.class, tVar5);
        t<Character> tVar6 = new t<Character>() { // from class: com.bykv.vk.openvk.preload.a.b.a.n.7
            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* synthetic */ void a(com.bykv.vk.openvk.preload.a.d.c cVar, Character ch) throws IOException {
                Character ch2 = ch;
                cVar.b(ch2 == null ? null : String.valueOf(ch2));
            }

            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* synthetic */ Character a(com.bykv.vk.openvk.preload.a.d.a aVar) throws IOException {
                if (aVar.f() == com.bykv.vk.openvk.preload.a.d.b.NULL) {
                    aVar.k();
                    return null;
                }
                String i2 = aVar.i();
                if (i2.length() != 1) {
                    throw new r("Expecting character, got: ".concat(String.valueOf(i2)));
                }
                return Character.valueOf(i2.charAt(0));
            }
        };
        y = tVar6;
        z = a(Character.TYPE, Character.class, tVar6);
        t<String> tVar7 = new t<String>() { // from class: com.bykv.vk.openvk.preload.a.b.a.n.8
            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* synthetic */ void a(com.bykv.vk.openvk.preload.a.d.c cVar, String str) throws IOException {
                cVar.b(str);
            }

            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* synthetic */ String a(com.bykv.vk.openvk.preload.a.d.a aVar) throws IOException {
                com.bykv.vk.openvk.preload.a.d.b f2 = aVar.f();
                if (f2 == com.bykv.vk.openvk.preload.a.d.b.NULL) {
                    aVar.k();
                    return null;
                }
                if (f2 == com.bykv.vk.openvk.preload.a.d.b.BOOLEAN) {
                    return Boolean.toString(aVar.j());
                }
                return aVar.i();
            }
        };
        A = tVar7;
        B = new t<BigDecimal>() { // from class: com.bykv.vk.openvk.preload.a.b.a.n.9
            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* synthetic */ BigDecimal a(com.bykv.vk.openvk.preload.a.d.a aVar) throws IOException {
                return b(aVar);
            }

            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* bridge */ /* synthetic */ void a(com.bykv.vk.openvk.preload.a.d.c cVar, BigDecimal bigDecimal) throws IOException {
                cVar.a(bigDecimal);
            }

            private static BigDecimal b(com.bykv.vk.openvk.preload.a.d.a aVar) throws IOException {
                if (aVar.f() == com.bykv.vk.openvk.preload.a.d.b.NULL) {
                    aVar.k();
                    return null;
                }
                try {
                    return new BigDecimal(aVar.i());
                } catch (NumberFormatException e2) {
                    throw new r(e2);
                }
            }
        };
        C = new t<BigInteger>() { // from class: com.bykv.vk.openvk.preload.a.b.a.n.10
            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* synthetic */ BigInteger a(com.bykv.vk.openvk.preload.a.d.a aVar) throws IOException {
                return b(aVar);
            }

            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* bridge */ /* synthetic */ void a(com.bykv.vk.openvk.preload.a.d.c cVar, BigInteger bigInteger) throws IOException {
                cVar.a(bigInteger);
            }

            private static BigInteger b(com.bykv.vk.openvk.preload.a.d.a aVar) throws IOException {
                if (aVar.f() == com.bykv.vk.openvk.preload.a.d.b.NULL) {
                    aVar.k();
                    return null;
                }
                try {
                    return new BigInteger(aVar.i());
                } catch (NumberFormatException e2) {
                    throw new r(e2);
                }
            }
        };
        D = a(String.class, tVar7);
        t<StringBuilder> tVar8 = new t<StringBuilder>() { // from class: com.bykv.vk.openvk.preload.a.b.a.n.11
            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* synthetic */ void a(com.bykv.vk.openvk.preload.a.d.c cVar, StringBuilder sb) throws IOException {
                StringBuilder sb2 = sb;
                cVar.b(sb2 == null ? null : sb2.toString());
            }

            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* synthetic */ StringBuilder a(com.bykv.vk.openvk.preload.a.d.a aVar) throws IOException {
                if (aVar.f() == com.bykv.vk.openvk.preload.a.d.b.NULL) {
                    aVar.k();
                    return null;
                }
                return new StringBuilder(aVar.i());
            }
        };
        E = tVar8;
        F = a(StringBuilder.class, tVar8);
        t<StringBuffer> tVar9 = new t<StringBuffer>() { // from class: com.bykv.vk.openvk.preload.a.b.a.n.13
            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* synthetic */ void a(com.bykv.vk.openvk.preload.a.d.c cVar, StringBuffer stringBuffer) throws IOException {
                StringBuffer stringBuffer2 = stringBuffer;
                cVar.b(stringBuffer2 == null ? null : stringBuffer2.toString());
            }

            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* synthetic */ StringBuffer a(com.bykv.vk.openvk.preload.a.d.a aVar) throws IOException {
                if (aVar.f() == com.bykv.vk.openvk.preload.a.d.b.NULL) {
                    aVar.k();
                    return null;
                }
                return new StringBuffer(aVar.i());
            }
        };
        G = tVar9;
        H = a(StringBuffer.class, tVar9);
        t<URL> tVar10 = new t<URL>() { // from class: com.bykv.vk.openvk.preload.a.b.a.n.14
            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* synthetic */ void a(com.bykv.vk.openvk.preload.a.d.c cVar, URL url) throws IOException {
                URL url2 = url;
                cVar.b(url2 == null ? null : url2.toExternalForm());
            }

            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* synthetic */ URL a(com.bykv.vk.openvk.preload.a.d.a aVar) throws IOException {
                if (aVar.f() == com.bykv.vk.openvk.preload.a.d.b.NULL) {
                    aVar.k();
                    return null;
                }
                String i2 = aVar.i();
                if (AbstractJsonLexerKt.NULL.equals(i2)) {
                    return null;
                }
                return new URL(i2);
            }
        };
        I = tVar10;
        J = a(URL.class, tVar10);
        t<URI> tVar11 = new t<URI>() { // from class: com.bykv.vk.openvk.preload.a.b.a.n.15
            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* synthetic */ URI a(com.bykv.vk.openvk.preload.a.d.a aVar) throws IOException {
                return b(aVar);
            }

            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* synthetic */ void a(com.bykv.vk.openvk.preload.a.d.c cVar, URI uri) throws IOException {
                URI uri2 = uri;
                cVar.b(uri2 == null ? null : uri2.toASCIIString());
            }

            private static URI b(com.bykv.vk.openvk.preload.a.d.a aVar) throws IOException {
                if (aVar.f() == com.bykv.vk.openvk.preload.a.d.b.NULL) {
                    aVar.k();
                    return null;
                }
                try {
                    String i2 = aVar.i();
                    if (AbstractJsonLexerKt.NULL.equals(i2)) {
                        return null;
                    }
                    return new URI(i2);
                } catch (URISyntaxException e2) {
                    throw new com.bykv.vk.openvk.preload.a.l(e2);
                }
            }
        };
        K = tVar11;
        L = a(URI.class, tVar11);
        t<InetAddress> tVar12 = new t<InetAddress>() { // from class: com.bykv.vk.openvk.preload.a.b.a.n.16
            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* synthetic */ void a(com.bykv.vk.openvk.preload.a.d.c cVar, InetAddress inetAddress) throws IOException {
                InetAddress inetAddress2 = inetAddress;
                cVar.b(inetAddress2 == null ? null : inetAddress2.getHostAddress());
            }

            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* synthetic */ InetAddress a(com.bykv.vk.openvk.preload.a.d.a aVar) throws IOException {
                if (aVar.f() == com.bykv.vk.openvk.preload.a.d.b.NULL) {
                    aVar.k();
                    return null;
                }
                return InetAddress.getByName(aVar.i());
            }
        };
        M = tVar12;
        N = b(InetAddress.class, tVar12);
        t<UUID> tVar13 = new t<UUID>() { // from class: com.bykv.vk.openvk.preload.a.b.a.n.17
            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* synthetic */ void a(com.bykv.vk.openvk.preload.a.d.c cVar, UUID uuid) throws IOException {
                UUID uuid2 = uuid;
                cVar.b(uuid2 == null ? null : uuid2.toString());
            }

            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* synthetic */ UUID a(com.bykv.vk.openvk.preload.a.d.a aVar) throws IOException {
                if (aVar.f() == com.bykv.vk.openvk.preload.a.d.b.NULL) {
                    aVar.k();
                    return null;
                }
                return UUID.fromString(aVar.i());
            }
        };
        O = tVar13;
        P = a(UUID.class, tVar13);
        t<Currency> a7 = new t<Currency>() { // from class: com.bykv.vk.openvk.preload.a.b.a.n.18
            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* synthetic */ void a(com.bykv.vk.openvk.preload.a.d.c cVar, Currency currency) throws IOException {
                cVar.b(currency.getCurrencyCode());
            }

            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* synthetic */ Currency a(com.bykv.vk.openvk.preload.a.d.a aVar) throws IOException {
                return Currency.getInstance(aVar.i());
            }
        }.a();
        Q = a7;
        R = a(Currency.class, a7);
        S = new u() { // from class: com.bykv.vk.openvk.preload.a.b.a.n.19
            @Override // com.bykv.vk.openvk.preload.a.u
            public final <T> t<T> a(com.bykv.vk.openvk.preload.a.f fVar, com.bykv.vk.openvk.preload.a.c.a<T> aVar) {
                if (aVar.b != Timestamp.class) {
                    return null;
                }
                final t<T> a8 = fVar.a((Class) Date.class);
                return (t<T>) new t<Timestamp>() { // from class: com.bykv.vk.openvk.preload.a.b.a.n.19.1
                    @Override // com.bykv.vk.openvk.preload.a.t
                    public final /* bridge */ /* synthetic */ void a(com.bykv.vk.openvk.preload.a.d.c cVar, Timestamp timestamp) throws IOException {
                        a8.a(cVar, timestamp);
                    }

                    @Override // com.bykv.vk.openvk.preload.a.t
                    public final /* synthetic */ Timestamp a(com.bykv.vk.openvk.preload.a.d.a aVar2) throws IOException {
                        Date date = (Date) a8.a(aVar2);
                        if (date != null) {
                            return new Timestamp(date.getTime());
                        }
                        return null;
                    }
                };
            }
        };
        final t<Calendar> tVar14 = new t<Calendar>() { // from class: com.bykv.vk.openvk.preload.a.b.a.n.20
            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* synthetic */ void a(com.bykv.vk.openvk.preload.a.d.c cVar, Calendar calendar) throws IOException {
                if (calendar == null) {
                    cVar.e();
                    return;
                }
                cVar.c();
                cVar.a("year");
                cVar.a(r4.get(1));
                cVar.a("month");
                cVar.a(r4.get(2));
                cVar.a("dayOfMonth");
                cVar.a(r4.get(5));
                cVar.a("hourOfDay");
                cVar.a(r4.get(11));
                cVar.a("minute");
                cVar.a(r4.get(12));
                cVar.a("second");
                cVar.a(r4.get(13));
                cVar.d();
            }

            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* synthetic */ Calendar a(com.bykv.vk.openvk.preload.a.d.a aVar) throws IOException {
                if (aVar.f() == com.bykv.vk.openvk.preload.a.d.b.NULL) {
                    aVar.k();
                    return null;
                }
                aVar.c();
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                int i7 = 0;
                while (aVar.f() != com.bykv.vk.openvk.preload.a.d.b.END_OBJECT) {
                    String h2 = aVar.h();
                    int n2 = aVar.n();
                    if ("year".equals(h2)) {
                        i2 = n2;
                    } else if ("month".equals(h2)) {
                        i3 = n2;
                    } else if ("dayOfMonth".equals(h2)) {
                        i4 = n2;
                    } else if ("hourOfDay".equals(h2)) {
                        i5 = n2;
                    } else if ("minute".equals(h2)) {
                        i6 = n2;
                    } else if ("second".equals(h2)) {
                        i7 = n2;
                    }
                }
                aVar.d();
                return new GregorianCalendar(i2, i3, i4, i5, i6, i7);
            }
        };
        T = tVar14;
        final Class<Calendar> cls = Calendar.class;
        final Class<GregorianCalendar> cls2 = GregorianCalendar.class;
        U = new u() { // from class: com.bykv.vk.openvk.preload.a.b.a.n.28
            public final String toString() {
                return "Factory[type=" + cls.getName() + Marker.ANY_NON_NULL_MARKER + cls2.getName() + ",adapter=" + tVar14 + "]";
            }

            @Override // com.bykv.vk.openvk.preload.a.u
            public final <T> t<T> a(com.bykv.vk.openvk.preload.a.f fVar, com.bykv.vk.openvk.preload.a.c.a<T> aVar) {
                Class<? super T> cls3 = aVar.b;
                if (cls3 == cls || cls3 == cls2) {
                    return tVar14;
                }
                return null;
            }
        };
        t<Locale> tVar15 = new t<Locale>() { // from class: com.bykv.vk.openvk.preload.a.b.a.n.21
            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* synthetic */ void a(com.bykv.vk.openvk.preload.a.d.c cVar, Locale locale) throws IOException {
                Locale locale2 = locale;
                cVar.b(locale2 == null ? null : locale2.toString());
            }

            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* synthetic */ Locale a(com.bykv.vk.openvk.preload.a.d.a aVar) throws IOException {
                if (aVar.f() == com.bykv.vk.openvk.preload.a.d.b.NULL) {
                    aVar.k();
                    return null;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(aVar.i(), "_");
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
        };
        V = tVar15;
        W = a(Locale.class, tVar15);
        t<com.bykv.vk.openvk.preload.a.k> tVar16 = new t<com.bykv.vk.openvk.preload.a.k>() { // from class: com.bykv.vk.openvk.preload.a.b.a.n.22
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.bykv.vk.openvk.preload.a.t
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public com.bykv.vk.openvk.preload.a.k a(com.bykv.vk.openvk.preload.a.d.a aVar) throws IOException {
                switch (AnonymousClass30.a[aVar.f().ordinal()]) {
                    case 1:
                        return new p(new com.bykv.vk.openvk.preload.a.b.g(aVar.i()));
                    case 2:
                        return new p(Boolean.valueOf(aVar.j()));
                    case 3:
                        return new p(aVar.i());
                    case 4:
                        aVar.k();
                        return com.bykv.vk.openvk.preload.a.m.a;
                    case 5:
                        com.bykv.vk.openvk.preload.a.i iVar = new com.bykv.vk.openvk.preload.a.i();
                        aVar.a();
                        while (aVar.e()) {
                            iVar.a(a(aVar));
                        }
                        aVar.b();
                        return iVar;
                    case 6:
                        com.bykv.vk.openvk.preload.a.n nVar = new com.bykv.vk.openvk.preload.a.n();
                        aVar.c();
                        while (aVar.e()) {
                            nVar.a(aVar.h(), a(aVar));
                        }
                        aVar.d();
                        return nVar;
                    default:
                        throw new IllegalArgumentException();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.bykv.vk.openvk.preload.a.t
            public void a(com.bykv.vk.openvk.preload.a.d.c cVar, com.bykv.vk.openvk.preload.a.k kVar) throws IOException {
                if (kVar == null || (kVar instanceof com.bykv.vk.openvk.preload.a.m)) {
                    cVar.e();
                    return;
                }
                if (kVar instanceof p) {
                    p g2 = kVar.g();
                    if (g2.a instanceof Number) {
                        cVar.a(g2.a());
                        return;
                    } else if (g2.a instanceof Boolean) {
                        cVar.a(g2.f());
                        return;
                    } else {
                        cVar.b(g2.b());
                        return;
                    }
                }
                boolean z2 = kVar instanceof com.bykv.vk.openvk.preload.a.i;
                if (z2) {
                    cVar.a();
                    if (z2) {
                        Iterator<com.bykv.vk.openvk.preload.a.k> it = ((com.bykv.vk.openvk.preload.a.i) kVar).iterator();
                        while (it.hasNext()) {
                            a(cVar, it.next());
                        }
                        cVar.b();
                        return;
                    }
                    throw new IllegalStateException("Not a JSON Array: ".concat(String.valueOf(kVar)));
                }
                boolean z3 = kVar instanceof com.bykv.vk.openvk.preload.a.n;
                if (z3) {
                    cVar.c();
                    if (z3) {
                        for (Map.Entry<String, com.bykv.vk.openvk.preload.a.k> entry : ((com.bykv.vk.openvk.preload.a.n) kVar).a.entrySet()) {
                            cVar.a(entry.getKey());
                            a(cVar, entry.getValue());
                        }
                        cVar.d();
                        return;
                    }
                    throw new IllegalStateException("Not a JSON Object: ".concat(String.valueOf(kVar)));
                }
                throw new IllegalArgumentException("Couldn't write " + kVar.getClass());
            }
        };
        X = tVar16;
        Y = b(com.bykv.vk.openvk.preload.a.k.class, tVar16);
        Z = new u() { // from class: com.bykv.vk.openvk.preload.a.b.a.n.24
            @Override // com.bykv.vk.openvk.preload.a.u
            public final <T> t<T> a(com.bykv.vk.openvk.preload.a.f fVar, com.bykv.vk.openvk.preload.a.c.a<T> aVar) {
                Class<? super T> cls3 = aVar.b;
                if (!Enum.class.isAssignableFrom(cls3) || cls3 == Enum.class) {
                    return null;
                }
                if (!cls3.isEnum()) {
                    cls3 = cls3.getSuperclass();
                }
                return new a(cls3);
            }
        };
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: com.bykv.vk.openvk.preload.a.b.a.n$30, reason: invalid class name */
    static /* synthetic */ class AnonymousClass30 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[com.bykv.vk.openvk.preload.a.d.b.values().length];
            a = iArr;
            try {
                iArr[com.bykv.vk.openvk.preload.a.d.b.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[com.bykv.vk.openvk.preload.a.d.b.BOOLEAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[com.bykv.vk.openvk.preload.a.d.b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[com.bykv.vk.openvk.preload.a.d.b.NULL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[com.bykv.vk.openvk.preload.a.d.b.BEGIN_ARRAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[com.bykv.vk.openvk.preload.a.d.b.BEGIN_OBJECT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[com.bykv.vk.openvk.preload.a.d.b.END_DOCUMENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[com.bykv.vk.openvk.preload.a.d.b.NAME.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[com.bykv.vk.openvk.preload.a.d.b.END_OBJECT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[com.bykv.vk.openvk.preload.a.d.b.END_ARRAY.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* compiled from: TypeAdapters.java */
    static final class a<T extends Enum<T>> extends t<T> {
        private final Map<String, T> a = new HashMap();
        private final Map<T, String> b = new HashMap();

        @Override // com.bykv.vk.openvk.preload.a.t
        public final /* synthetic */ void a(com.bykv.vk.openvk.preload.a.d.c cVar, Object obj) throws IOException {
            Enum r3 = (Enum) obj;
            cVar.b(r3 == null ? null : this.b.get(r3));
        }

        public a(Class<T> cls) {
            try {
                for (T t : cls.getEnumConstants()) {
                    String name = t.name();
                    com.bykv.vk.openvk.preload.a.a.c cVar = (com.bykv.vk.openvk.preload.a.a.c) cls.getField(name).getAnnotation(com.bykv.vk.openvk.preload.a.a.c.class);
                    if (cVar != null) {
                        name = cVar.a();
                        for (String str : cVar.b()) {
                            this.a.put(str, t);
                        }
                    }
                    this.a.put(name, t);
                    this.b.put(t, name);
                }
            } catch (NoSuchFieldException e) {
                throw new AssertionError(e);
            }
        }

        @Override // com.bykv.vk.openvk.preload.a.t
        public final /* synthetic */ Object a(com.bykv.vk.openvk.preload.a.d.a aVar) throws IOException {
            if (aVar.f() == com.bykv.vk.openvk.preload.a.d.b.NULL) {
                aVar.k();
                return null;
            }
            return this.a.get(aVar.i());
        }
    }

    public static <TT> u a(final com.bykv.vk.openvk.preload.a.c.a<TT> aVar, final t<TT> tVar) {
        return new u() { // from class: com.bykv.vk.openvk.preload.a.b.a.n.25
            @Override // com.bykv.vk.openvk.preload.a.u
            public final <T> t<T> a(com.bykv.vk.openvk.preload.a.f fVar, com.bykv.vk.openvk.preload.a.c.a<T> aVar2) {
                if (aVar2.equals(com.bykv.vk.openvk.preload.a.c.a.this)) {
                    return tVar;
                }
                return null;
            }
        };
    }

    public static <TT> u a(final Class<TT> cls, final t<TT> tVar) {
        return new u() { // from class: com.bykv.vk.openvk.preload.a.b.a.n.26
            public final String toString() {
                return "Factory[type=" + cls.getName() + ",adapter=" + tVar + "]";
            }

            @Override // com.bykv.vk.openvk.preload.a.u
            public final <T> t<T> a(com.bykv.vk.openvk.preload.a.f fVar, com.bykv.vk.openvk.preload.a.c.a<T> aVar) {
                if (aVar.b == cls) {
                    return tVar;
                }
                return null;
            }
        };
    }

    public static <TT> u a(final Class<TT> cls, final Class<TT> cls2, final t<? super TT> tVar) {
        return new u() { // from class: com.bykv.vk.openvk.preload.a.b.a.n.27
            public final String toString() {
                return "Factory[type=" + cls2.getName() + Marker.ANY_NON_NULL_MARKER + cls.getName() + ",adapter=" + tVar + "]";
            }

            @Override // com.bykv.vk.openvk.preload.a.u
            public final <T> t<T> a(com.bykv.vk.openvk.preload.a.f fVar, com.bykv.vk.openvk.preload.a.c.a<T> aVar) {
                Class<? super T> cls3 = aVar.b;
                if (cls3 == cls || cls3 == cls2) {
                    return tVar;
                }
                return null;
            }
        };
    }

    private static <T1> u b(final Class<T1> cls, final t<T1> tVar) {
        return new u() { // from class: com.bykv.vk.openvk.preload.a.b.a.n.29
            public final String toString() {
                return "Factory[typeHierarchy=" + cls.getName() + ",adapter=" + tVar + "]";
            }

            @Override // com.bykv.vk.openvk.preload.a.u
            public final <T2> t<T2> a(com.bykv.vk.openvk.preload.a.f fVar, com.bykv.vk.openvk.preload.a.c.a<T2> aVar) {
                final Class<? super T2> cls2 = aVar.b;
                if (cls.isAssignableFrom(cls2)) {
                    return (t<T2>) new t<T1>() { // from class: com.bykv.vk.openvk.preload.a.b.a.n.29.1
                        @Override // com.bykv.vk.openvk.preload.a.t
                        public final void a(com.bykv.vk.openvk.preload.a.d.c cVar, T1 t1) throws IOException {
                            tVar.a(cVar, t1);
                        }

                        @Override // com.bykv.vk.openvk.preload.a.t
                        public final T1 a(com.bykv.vk.openvk.preload.a.d.a aVar2) throws IOException {
                            T1 t1 = (T1) tVar.a(aVar2);
                            if (t1 == null || cls2.isInstance(t1)) {
                                return t1;
                            }
                            throw new r("Expected a " + cls2.getName() + " but was " + t1.getClass().getName());
                        }
                    };
                }
                return null;
            }
        };
    }
}
