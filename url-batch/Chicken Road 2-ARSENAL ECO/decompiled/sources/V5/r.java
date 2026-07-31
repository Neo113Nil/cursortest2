package V5;

import U5.AbstractC0216c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import l5.AbstractC0506j;
import l5.AbstractC0507k;

/* loaded from: classes.dex */
public final class r extends A3.c implements S5.b, S5.a {

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0216c f2754b;

    /* renamed from: c, reason: collision with root package name */
    public final w f2755c;

    /* renamed from: d, reason: collision with root package name */
    public final u f2756d;

    /* renamed from: e, reason: collision with root package name */
    public int f2757e;

    /* renamed from: f, reason: collision with root package name */
    public final N3.k f2758f;

    /* renamed from: g, reason: collision with root package name */
    public final k f2759g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(AbstractC0216c abstractC0216c, w wVar, u uVar, R5.e descriptor) {
        super(8);
        kotlin.jvm.internal.i.e(descriptor, "descriptor");
        this.f2754b = abstractC0216c;
        this.f2755c = wVar;
        this.f2756d = uVar;
        this.f2757e = -1;
        N3.k kVar = abstractC0216c.f2635a;
        this.f2758f = kVar;
        this.f2759g = kVar.f1722c ? null : new k(descriptor);
    }

    @Override // A3.c
    public final Object J(Q5.a deserializer) {
        kotlin.jvm.internal.i.e(deserializer, "deserializer");
        try {
            return deserializer.b(this);
        } catch (Q5.b e4) {
            String message = e4.getMessage();
            kotlin.jvm.internal.i.b(message);
            if (F5.j.L(message, "at path", false)) {
                throw e4;
            }
            String str = e4.getMessage() + " at path: " + ((D1.b) this.f2756d.f2769c).d();
            kotlin.jvm.internal.i.e(null, "missingFields");
            throw new Q5.b(str, e4);
        }
    }

    @Override // A3.c, S5.b
    public final long a() {
        return this.f2756d.h();
    }

    @Override // A3.c, S5.b
    public final boolean f() {
        boolean z5;
        boolean z6;
        u uVar = this.f2756d;
        int r6 = uVar.r();
        String str = (String) uVar.f2771e;
        if (r6 == str.length()) {
            u.m(uVar, "EOF", 0, 6);
            throw null;
        }
        if (str.charAt(r6) == '\"') {
            r6++;
            z5 = true;
        } else {
            z5 = false;
        }
        int q6 = uVar.q(r6);
        if (q6 >= str.length() || q6 == -1) {
            u.m(uVar, "EOF", 0, 6);
            throw null;
        }
        int i7 = q6 + 1;
        int charAt = str.charAt(q6) | ' ';
        if (charAt == 102) {
            uVar.c("alse", i7);
            z6 = false;
        } else {
            if (charAt != 116) {
                u.m(uVar, "Expected valid boolean literal prefix, but had '" + uVar.j() + '\'', 0, 6);
                throw null;
            }
            uVar.c("rue", i7);
            z6 = true;
        }
        if (!z5) {
            return z6;
        }
        if (uVar.f2768b == str.length()) {
            u.m(uVar, "EOF", 0, 6);
            throw null;
        }
        if (str.charAt(uVar.f2768b) == '\"') {
            uVar.f2768b++;
            return z6;
        }
        u.m(uVar, "Expected closing quotation mark", 0, 6);
        throw null;
    }

    @Override // A3.c, S5.b
    public final boolean g() {
        k kVar = this.f2759g;
        if (!(kVar != null ? kVar.f2737b : false)) {
            u uVar = this.f2756d;
            int q6 = uVar.q(uVar.r());
            String str = (String) uVar.f2771e;
            int length = str.length() - q6;
            boolean z5 = false;
            if (length >= 4 && q6 != -1) {
                int i7 = 0;
                while (true) {
                    if (i7 < 4) {
                        if ("null".charAt(i7) != str.charAt(q6 + i7)) {
                            break;
                        }
                        i7++;
                    } else if (length <= 4 || n.d(str.charAt(q6 + 4)) != 0) {
                        z5 = true;
                        uVar.f2768b = q6 + 4;
                    }
                }
            }
            if (!z5) {
                return true;
            }
        }
        return false;
    }

    @Override // A3.c, S5.b
    public final char h() {
        u uVar = this.f2756d;
        String j4 = uVar.j();
        if (j4.length() == 1) {
            return j4.charAt(0);
        }
        u.m(uVar, "Expected single char, but got '" + j4 + '\'', 0, 6);
        throw null;
    }

    @Override // A3.c, S5.a
    public final void i(R5.e descriptor) {
        kotlin.jvm.internal.i.e(descriptor, "descriptor");
        if (this.f2754b.f2635a.f1721b && descriptor.d() == 0) {
            while (j(descriptor) != -1) {
            }
        }
        u uVar = this.f2756d;
        if (uVar.s()) {
            n.e(uVar, "");
            throw null;
        }
        uVar.g(this.f2755c.f2782g);
        D1.b bVar = (D1.b) uVar.f2769c;
        int i7 = bVar.f368b;
        int[] iArr = (int[]) bVar.f370d;
        if (iArr[i7] == -2) {
            iArr[i7] = -1;
            bVar.f368b = i7 - 1;
        }
        int i8 = bVar.f368b;
        if (i8 != -1) {
            bVar.f368b = i8 - 1;
        }
    }

    @Override // S5.a
    public final int j(R5.e descriptor) {
        byte b7;
        byte b8;
        Object invoke;
        Object obj;
        u uVar = this.f2756d;
        D1.b bVar = (D1.b) uVar.f2769c;
        String str = (String) uVar.f2771e;
        kotlin.jvm.internal.i.e(descriptor, "descriptor");
        w wVar = this.f2755c;
        int ordinal = wVar.ordinal();
        Throwable th = null;
        char c7 = ':';
        int i7 = 0;
        r11 = false;
        boolean z5 = false;
        byte b9 = 1;
        int i8 = -1;
        if (ordinal == 0) {
            boolean s6 = uVar.s();
            while (true) {
                boolean b10 = uVar.b();
                Throwable th2 = th;
                k kVar = this.f2759g;
                if (b10) {
                    String name = uVar.d();
                    uVar.g(c7);
                    kotlin.jvm.internal.i.e(descriptor, "<this>");
                    AbstractC0216c json = this.f2754b;
                    kotlin.jvm.internal.i.e(json, "json");
                    kotlin.jvm.internal.i.e(name, "name");
                    n.g(descriptor, json);
                    int a7 = descriptor.a(name);
                    if (a7 == -3 && json.f2635a.f1723d) {
                        g gVar = json.f2637c;
                        m mVar = new m(descriptor, 0, json);
                        gVar.getClass();
                        gVar.getClass();
                        kotlin.jvm.internal.i.e(descriptor, "descriptor");
                        Map map = (Map) ((ConcurrentHashMap) gVar.f2734g).get(descriptor);
                        o oVar = n.f2741a;
                        Object obj2 = map != null ? map.get(oVar) : null;
                        Object obj3 = obj2 != null ? obj2 : null;
                        if (obj3 != null) {
                            invoke = obj3;
                            b7 = b9;
                        } else {
                            invoke = mVar.invoke();
                            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) gVar.f2734g;
                            Object obj4 = concurrentHashMap.get(descriptor);
                            if (obj4 == null) {
                                b7 = b9;
                                ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap(2);
                                concurrentHashMap.put(descriptor, concurrentHashMap2);
                                obj = concurrentHashMap2;
                            } else {
                                b7 = b9;
                                obj = obj4;
                            }
                            ((Map) obj).put(oVar, invoke);
                        }
                        Integer num = (Integer) ((Map) invoke).get(name);
                        a7 = num != null ? num.intValue() : -3;
                    } else {
                        b7 = b9;
                    }
                    if (a7 != -3) {
                        if (kVar != null) {
                            T5.r rVar = kVar.f2736a;
                            if (a7 < 64) {
                                rVar.f2458c |= 1 << a7;
                            } else {
                                int i9 = (a7 >>> 6) - 1;
                                long[] jArr = rVar.f2459d;
                                jArr[i9] = jArr[i9] | (1 << (a7 & 63));
                            }
                        }
                        i8 = a7;
                    } else {
                        if (!this.f2758f.f1721b) {
                            uVar.l("Encountered an unknown key '" + name + '\'', F5.j.V(str.subSequence(0, uVar.f2768b).toString(), 6, name), "Use 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.");
                            throw th2;
                        }
                        ArrayList arrayList = new ArrayList();
                        byte p4 = uVar.p();
                        if (p4 == 8 || p4 == 6) {
                            while (true) {
                                byte p6 = uVar.p();
                                b8 = b7;
                                if (p6 == b8) {
                                    uVar.d();
                                } else {
                                    if (p6 == 8 || p6 == 6) {
                                        arrayList.add(Byte.valueOf(p6));
                                    } else if (p6 == 9) {
                                        if (((Number) AbstractC0506j.J(arrayList)).byteValue() != 8) {
                                            throw n.b(uVar.f2768b, str, "found ] instead of } at path: " + bVar);
                                        }
                                        if (arrayList.isEmpty()) {
                                            throw new NoSuchElementException("List is empty.");
                                        }
                                        arrayList.remove(AbstractC0507k.y(arrayList));
                                    } else if (p6 == 7) {
                                        if (((Number) AbstractC0506j.J(arrayList)).byteValue() != 6) {
                                            throw n.b(uVar.f2768b, str, "found } instead of ] at path: " + bVar);
                                        }
                                        if (arrayList.isEmpty()) {
                                            throw new NoSuchElementException("List is empty.");
                                        }
                                        arrayList.remove(AbstractC0507k.y(arrayList));
                                    } else if (p6 == 10) {
                                        u.m(uVar, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, 6);
                                        throw th2;
                                    }
                                    uVar.e();
                                    if (arrayList.size() == 0) {
                                        break;
                                    }
                                }
                                b7 = b8;
                            }
                        } else {
                            uVar.j();
                            b8 = b7;
                        }
                        s6 = uVar.s();
                        b9 = b8;
                        th = th2;
                        c7 = ':';
                        i7 = 0;
                    }
                } else {
                    int i10 = i7;
                    if (s6) {
                        n.e(uVar, "object");
                        throw th2;
                    }
                    if (kVar != null) {
                        T5.r rVar2 = kVar.f2736a;
                        j jVar = rVar2.f2457b;
                        R5.e eVar = rVar2.f2456a;
                        int d7 = eVar.d();
                        while (true) {
                            long j4 = rVar2.f2458c;
                            long j7 = -1;
                            if (j4 != -1) {
                                int numberOfTrailingZeros = Long.numberOfTrailingZeros(~j4);
                                rVar2.f2458c |= 1 << numberOfTrailingZeros;
                                if (((Boolean) jVar.invoke(eVar, Integer.valueOf(numberOfTrailingZeros))).booleanValue()) {
                                    i8 = numberOfTrailingZeros;
                                    break;
                                }
                            } else if (d7 > 64) {
                                long[] jArr2 = rVar2.f2459d;
                                int length = jArr2.length;
                                loop3: while (i10 < length) {
                                    int i11 = i10 + 1;
                                    int i12 = i11 * 64;
                                    long j8 = jArr2[i10];
                                    while (j8 != j7) {
                                        int numberOfTrailingZeros2 = Long.numberOfTrailingZeros(~j8);
                                        j8 |= 1 << numberOfTrailingZeros2;
                                        int i13 = numberOfTrailingZeros2 + i12;
                                        if (((Boolean) jVar.invoke(eVar, Integer.valueOf(i13))).booleanValue()) {
                                            jArr2[i10] = j8;
                                            i8 = i13;
                                            break loop3;
                                        }
                                        j7 = -1;
                                    }
                                    jArr2[i10] = j8;
                                    i10 = i11;
                                    j7 = -1;
                                }
                            }
                        }
                    }
                    i8 = -1;
                }
            }
        } else if (ordinal != 2) {
            boolean s7 = uVar.s();
            if (uVar.b()) {
                int i14 = this.f2757e;
                if (i14 != -1 && !s7) {
                    u.m(uVar, "Expected end of the array or comma", 0, 6);
                    throw null;
                }
                i8 = i14 + 1;
                this.f2757e = i8;
            } else if (s7) {
                n.e(uVar, "array");
                throw null;
            }
        } else {
            int i15 = this.f2757e;
            boolean z6 = i15 % 2 != 0;
            if (!z6) {
                uVar.g(':');
            } else if (i15 != -1) {
                z5 = uVar.s();
            }
            if (uVar.b()) {
                if (z6) {
                    if (this.f2757e == -1) {
                        int i16 = uVar.f2768b;
                        if (z5) {
                            u.m(uVar, "Unexpected leading comma", i16, 4);
                            throw null;
                        }
                    } else {
                        int i17 = uVar.f2768b;
                        if (!z5) {
                            u.m(uVar, "Expected comma after the key-value pair", i17, 4);
                            throw null;
                        }
                    }
                }
                i8 = this.f2757e + 1;
                this.f2757e = i8;
            } else if (z5) {
                n.e(uVar, "object");
                throw null;
            }
        }
        if (wVar != w.f2777j) {
            ((int[]) bVar.f370d)[bVar.f368b] = i8;
        }
        return i8;
    }

    @Override // A3.c, S5.a
    public final Object k(R5.e descriptor, int i7, Q5.a deserializer, Object obj) {
        D1.b bVar = (D1.b) this.f2756d.f2769c;
        kotlin.jvm.internal.i.e(descriptor, "descriptor");
        kotlin.jvm.internal.i.e(deserializer, "deserializer");
        boolean z5 = this.f2755c == w.f2777j && (i7 & 1) == 0;
        if (z5) {
            int[] iArr = (int[]) bVar.f370d;
            int i8 = bVar.f368b;
            if (iArr[i8] == -2) {
                ((Object[]) bVar.f369c)[i8] = o.f2742a;
            }
        }
        Object k4 = super.k(descriptor, i7, deserializer, obj);
        if (z5) {
            int[] iArr2 = (int[]) bVar.f370d;
            int i9 = bVar.f368b;
            if (iArr2[i9] != -2) {
                int i10 = i9 + 1;
                bVar.f368b = i10;
                Object[] objArr = (Object[]) bVar.f369c;
                if (i10 == objArr.length) {
                    int i11 = i10 * 2;
                    Object[] copyOf = Arrays.copyOf(objArr, i11);
                    kotlin.jvm.internal.i.d(copyOf, "copyOf(...)");
                    bVar.f369c = copyOf;
                    int[] copyOf2 = Arrays.copyOf((int[]) bVar.f370d, i11);
                    kotlin.jvm.internal.i.d(copyOf2, "copyOf(...)");
                    bVar.f370d = copyOf2;
                }
            }
            Object[] objArr2 = (Object[]) bVar.f369c;
            int i12 = bVar.f368b;
            objArr2[i12] = k4;
            ((int[]) bVar.f370d)[i12] = -2;
        }
        return k4;
    }

    public final U5.k o0() {
        return new A.j(this.f2754b.f2635a, this.f2756d).d();
    }

    @Override // A3.c, S5.b
    public final int p() {
        u uVar = this.f2756d;
        long h7 = uVar.h();
        int i7 = (int) h7;
        if (h7 == i7) {
            return i7;
        }
        u.m(uVar, "Failed to parse int for input '" + h7 + '\'', 0, 6);
        throw null;
    }

    @Override // A3.c, S5.b
    public final byte r() {
        u uVar = this.f2756d;
        long h7 = uVar.h();
        byte b7 = (byte) h7;
        if (h7 == b7) {
            return b7;
        }
        u.m(uVar, "Failed to parse byte for input '" + h7 + '\'', 0, 6);
        throw null;
    }

    @Override // A3.c, S5.b
    public final S5.b s(R5.e descriptor) {
        kotlin.jvm.internal.i.e(descriptor, "descriptor");
        return t.a(descriptor) ? new h(this.f2756d, this.f2754b) : this;
    }

    @Override // A3.c, S5.b
    public final short t() {
        u uVar = this.f2756d;
        long h7 = uVar.h();
        short s6 = (short) h7;
        if (h7 == s6) {
            return s6;
        }
        u.m(uVar, "Failed to parse short for input '" + h7 + '\'', 0, 6);
        throw null;
    }

    @Override // A3.c, S5.b
    public final String u() {
        return this.f2756d.i();
    }

    @Override // A3.c, S5.b
    public final float v() {
        u uVar = this.f2756d;
        String j4 = uVar.j();
        try {
            float parseFloat = Float.parseFloat(j4);
            if (!Float.isInfinite(parseFloat) && !Float.isNaN(parseFloat)) {
                return parseFloat;
            }
            n.i(uVar, Float.valueOf(parseFloat));
            throw null;
        } catch (IllegalArgumentException unused) {
            u.m(uVar, "Failed to parse type 'float' for input '" + j4 + '\'', 0, 6);
            throw null;
        }
    }

    @Override // A3.c, S5.b
    public final S5.a w(R5.e descriptor) {
        kotlin.jvm.internal.i.e(descriptor, "descriptor");
        AbstractC0216c abstractC0216c = this.f2754b;
        w h7 = n.h(descriptor, abstractC0216c);
        u uVar = this.f2756d;
        D1.b bVar = (D1.b) uVar.f2769c;
        int i7 = bVar.f368b + 1;
        bVar.f368b = i7;
        Object[] objArr = (Object[]) bVar.f369c;
        if (i7 == objArr.length) {
            int i8 = i7 * 2;
            Object[] copyOf = Arrays.copyOf(objArr, i8);
            kotlin.jvm.internal.i.d(copyOf, "copyOf(...)");
            bVar.f369c = copyOf;
            int[] copyOf2 = Arrays.copyOf((int[]) bVar.f370d, i8);
            kotlin.jvm.internal.i.d(copyOf2, "copyOf(...)");
            bVar.f370d = copyOf2;
        }
        ((Object[]) bVar.f369c)[i7] = descriptor;
        uVar.g(h7.f2781f);
        if (uVar.p() != 4) {
            int ordinal = h7.ordinal();
            return (ordinal == 1 || ordinal == 2 || ordinal == 3) ? new r(abstractC0216c, h7, uVar, descriptor) : (this.f2755c == h7 && abstractC0216c.f2635a.f1722c) ? this : new r(abstractC0216c, h7, uVar, descriptor);
        }
        u.m(uVar, "Unexpected leading comma", 0, 6);
        throw null;
    }

    @Override // A3.c, S5.b
    public final double x() {
        u uVar = this.f2756d;
        String j4 = uVar.j();
        try {
            double parseDouble = Double.parseDouble(j4);
            if (!Double.isInfinite(parseDouble) && !Double.isNaN(parseDouble)) {
                return parseDouble;
            }
            n.i(uVar, Double.valueOf(parseDouble));
            throw null;
        } catch (IllegalArgumentException unused) {
            u.m(uVar, "Failed to parse type 'double' for input '" + j4 + '\'', 0, 6);
            throw null;
        }
    }
}
