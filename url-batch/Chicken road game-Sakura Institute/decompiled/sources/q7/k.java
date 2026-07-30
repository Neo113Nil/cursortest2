package q7;

import e6.r;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import l1.x;
import p7.s;
import p7.v;
import p7.z;
import r6.w;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class k extends j1.c implements Decoder, n7.a {

    /* renamed from: d, reason: collision with root package name */
    public final p7.c f7566d;

    /* renamed from: e, reason: collision with root package name */
    public final n f7567e;

    /* renamed from: f, reason: collision with root package name */
    public final j5.a f7568f;

    /* renamed from: g, reason: collision with root package name */
    public final j4.i f7569g;

    /* renamed from: h, reason: collision with root package name */
    public int f7570h;

    /* renamed from: i, reason: collision with root package name */
    public final p7.i f7571i;

    /* renamed from: j, reason: collision with root package name */
    public final e f7572j;

    public k(p7.c cVar, n nVar, j5.a aVar, SerialDescriptor serialDescriptor) {
        r6.k.f(serialDescriptor, "descriptor");
        this.f7566d = cVar;
        this.f7567e = nVar;
        this.f7568f = aVar;
        this.f7569g = cVar.f7216b;
        this.f7570h = -1;
        p7.i iVar = cVar.f7215a;
        this.f7571i = iVar;
        this.f7572j = iVar.f7225c ? null : new e(serialDescriptor);
    }

    @Override // j1.c, kotlinx.serialization.encoding.Decoder
    public final double A() {
        j5.a aVar = this.f7568f;
        String k8 = aVar.k();
        try {
            double parseDouble = Double.parseDouble(k8);
            if (!Double.isInfinite(parseDouble) && !Double.isNaN(parseDouble)) {
                return parseDouble;
            }
            f.g(aVar, Double.valueOf(parseDouble));
            throw null;
        } catch (IllegalArgumentException unused) {
            j5.a.o(aVar, "Failed to parse type 'double' for input '" + k8 + '\'', 0, null, 6);
            throw null;
        }
    }

    @Override // j1.c, kotlinx.serialization.encoding.Decoder
    public final n7.a a(SerialDescriptor serialDescriptor) {
        n nVar;
        r6.k.f(serialDescriptor, "descriptor");
        a8.m c4 = serialDescriptor.c();
        boolean z8 = c4 instanceof m7.c;
        p7.c cVar = this.f7566d;
        if (z8) {
            nVar = n.POLY_OBJ;
        } else if (r6.k.a(c4, m7.h.f6464h)) {
            nVar = n.LIST;
        } else if (r6.k.a(c4, m7.h.f6465i)) {
            SerialDescriptor b9 = f.b(serialDescriptor.j(0), cVar.f7216b);
            a8.m c6 = b9.c();
            if (!(c6 instanceof m7.e) && !r6.k.a(c6, m7.g.f6462h)) {
                String str = "Value of type '" + b9.b() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + b9.c() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.";
                r6.k.f(str, "message");
                throw new c(str);
            }
            nVar = n.MAP;
        } else {
            nVar = n.OBJ;
        }
        j5.a aVar = this.f7568f;
        a0.l lVar = (a0.l) aVar.f5035c;
        int i7 = lVar.f100g + 1;
        lVar.f100g = i7;
        Object[] objArr = (Object[]) lVar.f101h;
        if (i7 == objArr.length) {
            int i8 = i7 * 2;
            Object[] copyOf = Arrays.copyOf(objArr, i8);
            r6.k.e(copyOf, "copyOf(...)");
            lVar.f101h = copyOf;
            int[] copyOf2 = Arrays.copyOf((int[]) lVar.f102i, i8);
            r6.k.e(copyOf2, "copyOf(...)");
            lVar.f102i = copyOf2;
        }
        ((Object[]) lVar.f101h)[i7] = serialDescriptor;
        aVar.h(nVar.f7580f);
        if (aVar.y() != 4) {
            int ordinal = nVar.ordinal();
            return (ordinal == 1 || ordinal == 2 || ordinal == 3) ? new k(cVar, nVar, aVar, serialDescriptor) : (this.f7567e == nVar && cVar.f7215a.f7225c) ? this : new k(cVar, nVar, aVar, serialDescriptor);
        }
        j5.a.o(aVar, "Unexpected leading comma", 0, null, 6);
        throw null;
    }

    @Override // j1.c, kotlinx.serialization.encoding.Decoder
    public final long d() {
        return this.f7568f.i();
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011c  */
    @Override // j1.c, kotlinx.serialization.encoding.Decoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(KSerializer kSerializer) {
        String message;
        String str;
        p7.c cVar = this.f7566d;
        j5.a aVar = this.f7568f;
        a0.l lVar = (a0.l) aVar.f5035c;
        r6.k.f(kSerializer, "deserializer");
        try {
        } catch (l7.a e9) {
            message = e9.getMessage();
            r6.k.c(message);
            if (!z6.h.y(message, "at path")) {
            }
        }
        if (!(kSerializer instanceof l7.b)) {
            return kSerializer.deserialize(this);
        }
        String x8 = aVar.x(f.d(((l7.b) kSerializer).getDescriptor(), cVar), this.f7571i.f7224b);
        if (x8 != null) {
            try {
                a8.d.F((l7.b) kSerializer, this, x8);
                throw null;
            } catch (l7.c e10) {
                String message2 = e10.getMessage();
                r6.k.c(message2);
                int D = z6.h.D(message2, '\n', 0, 6);
                if (D != -1) {
                    message2 = message2.substring(0, D);
                    r6.k.e(message2, "substring(...)");
                }
                String O = z6.h.O(message2, ".");
                String message3 = e10.getMessage();
                r6.k.c(message3);
                j5.a.o(aVar, O, 0, z6.h.S(message3, '\n', ""), 2);
                throw null;
            }
        }
        if (!(kSerializer instanceof l7.b)) {
            return kSerializer.deserialize(this);
        }
        String d8 = f.d(((l7.b) kSerializer).getDescriptor(), cVar);
        p7.k p02 = p0();
        String b9 = ((l7.b) kSerializer).getDescriptor().b();
        if (!(p02 instanceof v)) {
            throw f.a(-1, "Expected " + w.a(v.class).b() + ", but had " + w.a(p02.getClass()).b() + " as the serialized body of " + b9 + " at element: " + lVar.e(), p02.toString());
        }
        v vVar = (v) p02;
        p7.k kVar = (p7.k) vVar.get((Object) d8);
        try {
            if (kVar != null) {
                z a3 = p7.l.a(kVar);
                if (!(a3 instanceof s)) {
                    str = a3.getContent();
                    a8.d.F((l7.b) kSerializer, this, str);
                    throw null;
                }
            }
            a8.d.F((l7.b) kSerializer, this, str);
            throw null;
        } catch (l7.c e11) {
            String message4 = e11.getMessage();
            r6.k.c(message4);
            throw f.a(-1, message4, vVar.toString());
        }
        str = null;
        message = e9.getMessage();
        r6.k.c(message);
        if (!z6.h.y(message, "at path")) {
            throw e9;
        }
        throw new l7.a(e9.f6098f, e9.getMessage() + " at path: " + lVar.e(), e9);
    }

    @Override // j1.c, kotlinx.serialization.encoding.Decoder
    public final boolean h() {
        boolean z8;
        boolean z9;
        j5.a aVar = this.f7568f;
        int B = aVar.B();
        String str = (String) aVar.f5038f;
        if (B == str.length()) {
            j5.a.o(aVar, "EOF", 0, null, 6);
            throw null;
        }
        if (str.charAt(B) == '\"') {
            B++;
            z8 = true;
        } else {
            z8 = false;
        }
        int A = aVar.A(B);
        if (A >= str.length() || A == -1) {
            j5.a.o(aVar, "EOF", 0, null, 6);
            throw null;
        }
        int i7 = A + 1;
        int charAt = str.charAt(A) | ' ';
        if (charAt == 102) {
            aVar.d("alse", i7);
            z9 = false;
        } else {
            if (charAt != 116) {
                j5.a.o(aVar, "Expected valid boolean literal prefix, but had '" + aVar.k() + '\'', 0, null, 6);
                throw null;
            }
            aVar.d("rue", i7);
            z9 = true;
        }
        if (!z8) {
            return z9;
        }
        if (aVar.f5034b == str.length()) {
            j5.a.o(aVar, "EOF", 0, null, 6);
            throw null;
        }
        if (str.charAt(aVar.f5034b) == '\"') {
            aVar.f5034b++;
            return z9;
        }
        j5.a.o(aVar, "Expected closing quotation mark", 0, null, 6);
        throw null;
    }

    @Override // j1.c, kotlinx.serialization.encoding.Decoder
    public final boolean j() {
        e eVar = this.f7572j;
        if (!(eVar != null ? eVar.f7550b : false)) {
            j5.a aVar = this.f7568f;
            int A = aVar.A(aVar.B());
            String str = (String) aVar.f5038f;
            int length = str.length() - A;
            boolean z8 = false;
            if (length >= 4 && A != -1) {
                int i7 = 0;
                while (true) {
                    if (i7 < 4) {
                        if ("null".charAt(i7) != str.charAt(A + i7)) {
                            break;
                        }
                        i7++;
                    } else if (length <= 4 || f.c(str.charAt(A + 4)) != 0) {
                        z8 = true;
                        aVar.f5034b = A + 4;
                    }
                }
            }
            if (!z8) {
                return true;
            }
        }
        return false;
    }

    @Override // j1.c, kotlinx.serialization.encoding.Decoder
    public final char l() {
        j5.a aVar = this.f7568f;
        String k8 = aVar.k();
        if (k8.length() == 1) {
            return k8.charAt(0);
        }
        j5.a.o(aVar, "Expected single char, but got '" + k8 + '\'', 0, null, 6);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x0158, code lost:
    
        r13 = r10;
     */
    @Override // n7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m(SerialDescriptor serialDescriptor) {
        int i7;
        int numberOfTrailingZeros;
        byte b9;
        j5.a aVar = this.f7568f;
        a0.l lVar = (a0.l) aVar.f5035c;
        String str = (String) aVar.f5038f;
        r6.k.f(serialDescriptor, "descriptor");
        n nVar = this.f7567e;
        int ordinal = nVar.ordinal();
        char c4 = ':';
        int i8 = 0;
        r11 = false;
        boolean z8 = false;
        byte b10 = 1;
        int i9 = -1;
        if (ordinal == 0) {
            boolean C = aVar.C();
            while (true) {
                boolean b11 = aVar.b();
                e eVar = this.f7572j;
                if (b11) {
                    p7.i iVar = this.f7571i;
                    boolean z9 = iVar.f7224b;
                    String l8 = z9 ? aVar.l() : aVar.e();
                    aVar.h(c4);
                    r6.k.f(serialDescriptor, "<this>");
                    p7.c cVar = this.f7566d;
                    r6.k.f(cVar, "json");
                    r6.k.f(l8, "name");
                    f.f(serialDescriptor, cVar);
                    i7 = serialDescriptor.a(l8);
                    byte b12 = b10;
                    if (i7 == -3 && cVar.f7215a.f7228f) {
                        r6.k.f(cVar, "<this>");
                        r6.k.f(serialDescriptor, "descriptor");
                        x xVar = cVar.f7217c;
                        g4.a aVar2 = new g4.a(serialDescriptor, 1, cVar);
                        xVar.getClass();
                        xVar.getClass();
                        r6.k.f(serialDescriptor, "descriptor");
                        Map map = (Map) ((ConcurrentHashMap) xVar.f5847g).get(serialDescriptor);
                        Object obj = map != null ? map.get(f.f7551a) : null;
                        Object obj2 = obj == null ? null : obj;
                        if (obj2 == null) {
                            obj2 = aVar2.a();
                            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) xVar.f5847g;
                            Object obj3 = concurrentHashMap.get(serialDescriptor);
                            Object obj4 = obj3;
                            if (obj3 == null) {
                                ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap(2);
                                concurrentHashMap.put(serialDescriptor, concurrentHashMap2);
                                obj4 = concurrentHashMap2;
                            }
                            ((Map) obj4).put(f.f7551a, obj2);
                        }
                        Integer num = (Integer) ((Map) obj2).get(l8);
                        i7 = num != null ? num.intValue() : -3;
                    }
                    if (i7 != -3) {
                        if (eVar != null) {
                            o7.s sVar = eVar.f7549a;
                            if (i7 < 64) {
                                sVar.f6942c |= 1 << i7;
                            } else {
                                int i10 = (i7 >>> 6) - 1;
                                long[] jArr = sVar.f6943d;
                                jArr[i10] = jArr[i10] | (1 << (i7 & 63));
                            }
                        }
                    } else {
                        if (!iVar.f7223a) {
                            aVar.n(z6.h.I(6, str.subSequence(0, aVar.f5034b).toString(), l8), "Encountered an unknown key '" + l8 + '\'', "Use 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.");
                            throw null;
                        }
                        ArrayList arrayList = new ArrayList();
                        byte y4 = aVar.y();
                        if (y4 == 8 || y4 == 6) {
                            while (true) {
                                byte y8 = aVar.y();
                                b9 = b12;
                                if (y8 != b9) {
                                    if (y8 == 8 || y8 == 6) {
                                        arrayList.add(Byte.valueOf(y8));
                                    } else if (y8 == 9) {
                                        if (((Number) e6.l.n0(arrayList)).byteValue() != 8) {
                                            throw f.a(aVar.f5034b, "found ] instead of } at path: " + lVar, str);
                                        }
                                        r.e0(arrayList);
                                    } else if (y8 == 7) {
                                        if (((Number) e6.l.n0(arrayList)).byteValue() != 6) {
                                            throw f.a(aVar.f5034b, "found } instead of ] at path: " + lVar, str);
                                        }
                                        r.e0(arrayList);
                                    } else if (y8 == 10) {
                                        j5.a.o(aVar, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6);
                                        throw null;
                                    }
                                    aVar.f();
                                    if (arrayList.size() == 0) {
                                        break;
                                    }
                                } else if (z9) {
                                    aVar.k();
                                } else {
                                    aVar.e();
                                }
                                b12 = b9;
                            }
                        } else {
                            aVar.k();
                            b9 = b12;
                        }
                        C = aVar.C();
                        b10 = b9;
                        c4 = ':';
                        i8 = 0;
                    }
                } else {
                    int i11 = i8;
                    if (C) {
                        f.e(aVar, "object");
                        throw null;
                    }
                    if (eVar != null) {
                        o7.s sVar2 = eVar.f7549a;
                        d dVar = sVar2.f6941b;
                        SerialDescriptor serialDescriptor2 = sVar2.f6940a;
                        int d8 = serialDescriptor2.d();
                        do {
                            long j8 = sVar2.f6942c;
                            long j9 = -1;
                            if (j8 != -1) {
                                numberOfTrailingZeros = Long.numberOfTrailingZeros(~j8);
                                sVar2.f6942c |= 1 << numberOfTrailingZeros;
                            } else if (d8 > 64) {
                                long[] jArr2 = sVar2.f6943d;
                                int length = jArr2.length;
                                loop3: while (i11 < length) {
                                    int i12 = i11 + 1;
                                    int i13 = i12 * 64;
                                    long j10 = jArr2[i11];
                                    while (j10 != j9) {
                                        int numberOfTrailingZeros2 = Long.numberOfTrailingZeros(~j10);
                                        j10 |= 1 << numberOfTrailingZeros2;
                                        i7 = numberOfTrailingZeros2 + i13;
                                        if (((Boolean) dVar.d(serialDescriptor2, Integer.valueOf(i7))).booleanValue()) {
                                            jArr2[i11] = j10;
                                        } else {
                                            j9 = -1;
                                        }
                                    }
                                    jArr2[i11] = j10;
                                    i11 = i12;
                                    j9 = -1;
                                }
                            }
                        } while (!((Boolean) dVar.d(serialDescriptor2, Integer.valueOf(numberOfTrailingZeros))).booleanValue());
                        i9 = numberOfTrailingZeros;
                    }
                    i9 = -1;
                }
            }
        } else if (ordinal != 2) {
            boolean C2 = aVar.C();
            if (aVar.b()) {
                int i14 = this.f7570h;
                if (i14 != -1 && !C2) {
                    j5.a.o(aVar, "Expected end of the array or comma", 0, null, 6);
                    throw null;
                }
                i9 = i14 + 1;
                this.f7570h = i9;
            } else if (C2) {
                f.e(aVar, "array");
                throw null;
            }
        } else {
            int i15 = this.f7570h;
            boolean z10 = i15 % 2 != 0;
            if (!z10) {
                aVar.h(':');
            } else if (i15 != -1) {
                z8 = aVar.C();
            }
            if (aVar.b()) {
                if (z10) {
                    if (this.f7570h == -1) {
                        int i16 = aVar.f5034b;
                        if (z8) {
                            j5.a.o(aVar, "Unexpected leading comma", i16, null, 4);
                            throw null;
                        }
                    } else {
                        int i17 = aVar.f5034b;
                        if (!z8) {
                            j5.a.o(aVar, "Expected comma after the key-value pair", i17, null, 4);
                            throw null;
                        }
                    }
                }
                i9 = this.f7570h + 1;
                this.f7570h = i9;
            } else if (z8) {
                f.e(aVar, "object");
                throw null;
            }
        }
        if (nVar != n.MAP) {
            ((int[]) lVar.f102i)[lVar.f100g] = i9;
        }
        return i9;
    }

    @Override // j1.c, n7.a
    public final void n(SerialDescriptor serialDescriptor) {
        r6.k.f(serialDescriptor, "descriptor");
        if (this.f7566d.f7215a.f7223a && serialDescriptor.d() == 0) {
            while (m(serialDescriptor) != -1) {
            }
        }
        j5.a aVar = this.f7568f;
        if (aVar.C()) {
            f.e(aVar, "");
            throw null;
        }
        aVar.h(this.f7567e.f7581g);
        a0.l lVar = (a0.l) aVar.f5035c;
        int i7 = lVar.f100g;
        int[] iArr = (int[]) lVar.f102i;
        if (iArr[i7] == -2) {
            iArr[i7] = -1;
            lVar.f100g = i7 - 1;
        }
        int i8 = lVar.f100g;
        if (i8 != -1) {
            lVar.f100g = i8 - 1;
        }
    }

    @Override // j1.c, kotlinx.serialization.encoding.Decoder
    public final Decoder o(SerialDescriptor serialDescriptor) {
        r6.k.f(serialDescriptor, "descriptor");
        Set set = l.f7573a;
        return (serialDescriptor.f() && l.f7573a.contains(serialDescriptor)) ? new b(this.f7568f, this.f7566d) : this;
    }

    public final p7.k p0() {
        p7.i iVar = this.f7566d.f7215a;
        j jVar = new j();
        jVar.f7565c = this.f7568f;
        jVar.f7564b = iVar.f7224b;
        return jVar.b();
    }

    @Override // j1.c, n7.a
    public final Object q(SerialDescriptor serialDescriptor, int i7, KSerializer kSerializer, Object obj) {
        a0.l lVar = (a0.l) this.f7568f.f5035c;
        r6.k.f(serialDescriptor, "descriptor");
        r6.k.f(kSerializer, "deserializer");
        boolean z8 = this.f7567e == n.MAP && (i7 & 1) == 0;
        if (z8) {
            int[] iArr = (int[]) lVar.f102i;
            int i8 = lVar.f100g;
            if (iArr[i8] == -2) {
                ((Object[]) lVar.f101h)[i8] = g.f7552a;
            }
        }
        Object q8 = super.q(serialDescriptor, i7, kSerializer, obj);
        if (z8) {
            int[] iArr2 = (int[]) lVar.f102i;
            int i9 = lVar.f100g;
            if (iArr2[i9] != -2) {
                int i10 = i9 + 1;
                lVar.f100g = i10;
                Object[] objArr = (Object[]) lVar.f101h;
                if (i10 == objArr.length) {
                    int i11 = i10 * 2;
                    Object[] copyOf = Arrays.copyOf(objArr, i11);
                    r6.k.e(copyOf, "copyOf(...)");
                    lVar.f101h = copyOf;
                    int[] copyOf2 = Arrays.copyOf((int[]) lVar.f102i, i11);
                    r6.k.e(copyOf2, "copyOf(...)");
                    lVar.f102i = copyOf2;
                }
            }
            Object[] objArr2 = (Object[]) lVar.f101h;
            int i12 = lVar.f100g;
            objArr2[i12] = q8;
            ((int[]) lVar.f102i)[i12] = -2;
        }
        return q8;
    }

    @Override // j1.c, kotlinx.serialization.encoding.Decoder
    public final int s() {
        j5.a aVar = this.f7568f;
        long i7 = aVar.i();
        int i8 = (int) i7;
        if (i7 == i8) {
            return i8;
        }
        j5.a.o(aVar, "Failed to parse int for input '" + i7 + '\'', 0, null, 6);
        throw null;
    }

    @Override // n7.a
    public final j4.i t() {
        return this.f7569g;
    }

    @Override // j1.c, kotlinx.serialization.encoding.Decoder
    public final byte v() {
        j5.a aVar = this.f7568f;
        long i7 = aVar.i();
        byte b9 = (byte) i7;
        if (i7 == b9) {
            return b9;
        }
        j5.a.o(aVar, "Failed to parse byte for input '" + i7 + '\'', 0, null, 6);
        throw null;
    }

    @Override // j1.c, kotlinx.serialization.encoding.Decoder
    public final short x() {
        j5.a aVar = this.f7568f;
        long i7 = aVar.i();
        short s5 = (short) i7;
        if (i7 == s5) {
            return s5;
        }
        j5.a.o(aVar, "Failed to parse short for input '" + i7 + '\'', 0, null, 6);
        throw null;
    }

    @Override // j1.c, kotlinx.serialization.encoding.Decoder
    public final String y() {
        boolean z8 = this.f7571i.f7224b;
        j5.a aVar = this.f7568f;
        return z8 ? aVar.l() : aVar.j();
    }

    @Override // j1.c, kotlinx.serialization.encoding.Decoder
    public final float z() {
        j5.a aVar = this.f7568f;
        String k8 = aVar.k();
        try {
            float parseFloat = Float.parseFloat(k8);
            if (!Float.isInfinite(parseFloat) && !Float.isNaN(parseFloat)) {
                return parseFloat;
            }
            f.g(aVar, Float.valueOf(parseFloat));
            throw null;
        } catch (IllegalArgumentException unused) {
            j5.a.o(aVar, "Failed to parse type 'float' for input '" + k8 + '\'', 0, null, 6);
            throw null;
        }
    }
}
