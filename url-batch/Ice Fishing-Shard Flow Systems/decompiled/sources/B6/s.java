package B6;

import A6.AbstractC0091c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class s extends O6.g implements y6.b, y6.a {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0091c f245a;

    /* renamed from: b, reason: collision with root package name */
    public final x f246b;

    /* renamed from: c, reason: collision with root package name */
    public final v f247c;

    /* renamed from: d, reason: collision with root package name */
    public int f248d;

    /* renamed from: e, reason: collision with root package name */
    public final A6.j f249e;

    /* renamed from: f, reason: collision with root package name */
    public final k f250f;

    public s(AbstractC0091c json, x mode, v lexer, x6.e descriptor) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(lexer, "lexer");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.f245a = json;
        this.f246b = mode;
        this.f247c = lexer;
        this.f248d = -1;
        A6.j jVar = json.f97a;
        this.f249e = jVar;
        this.f250f = jVar.f115c ? null : new k(descriptor);
    }

    @Override // O6.g
    public final Object C(w6.a deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        try {
            return deserializer.a(this);
        } catch (w6.b e7) {
            String message = e7.getMessage();
            Intrinsics.b(message);
            if (StringsKt.u(message, "at path", false)) {
                throw e7;
            }
            String str = e7.getMessage() + " at path: " + ((o) this.f247c.f260c).d();
            Intrinsics.checkNotNullParameter(null, "missingFields");
            throw new w6.b(str, e7);
        }
    }

    @Override // O6.g, y6.b
    public final long a() {
        return this.f247c.h();
    }

    @Override // O6.g, y6.a
    public final void b(x6.e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (this.f245a.f97a.f114b && descriptor.d() == 0) {
            while (o(descriptor) != -1) {
            }
        }
        v vVar = this.f247c;
        if (vVar.s()) {
            m.f(vVar, "");
            throw null;
        }
        vVar.g(this.f246b.f273e);
        o oVar = (o) vVar.f260c;
        int i2 = oVar.f229b;
        int[] iArr = (int[]) oVar.f231d;
        if (iArr[i2] == -2) {
            iArr[i2] = -1;
            oVar.f229b = i2 - 1;
        }
        int i5 = oVar.f229b;
        if (i5 != -1) {
            oVar.f229b = i5 - 1;
        }
    }

    @Override // O6.g, y6.b
    public final boolean d() {
        boolean z7;
        boolean z8;
        v vVar = this.f247c;
        int r7 = vVar.r();
        String str = (String) vVar.f262e;
        if (r7 == str.length()) {
            v.m(vVar, "EOF", 0, 6);
            throw null;
        }
        if (str.charAt(r7) == '\"') {
            r7++;
            z7 = true;
        } else {
            z7 = false;
        }
        int q4 = vVar.q(r7);
        if (q4 >= str.length() || q4 == -1) {
            v.m(vVar, "EOF", 0, 6);
            throw null;
        }
        int i2 = q4 + 1;
        int charAt = str.charAt(q4) | ' ';
        if (charAt == 102) {
            vVar.c(i2, "alse");
            z8 = false;
        } else {
            if (charAt != 116) {
                v.m(vVar, "Expected valid boolean literal prefix, but had '" + vVar.j() + '\'', 0, 6);
                throw null;
            }
            vVar.c(i2, "rue");
            z8 = true;
        }
        if (!z7) {
            return z8;
        }
        if (vVar.f259b == str.length()) {
            v.m(vVar, "EOF", 0, 6);
            throw null;
        }
        if (str.charAt(vVar.f259b) == '\"') {
            vVar.f259b++;
            return z8;
        }
        v.m(vVar, "Expected closing quotation mark", 0, 6);
        throw null;
    }

    public final A6.l d0() {
        return new p(this.f245a.f97a, this.f247c).e();
    }

    @Override // O6.g, y6.b
    public final boolean e() {
        k kVar = this.f250f;
        if (!(kVar != null ? kVar.f225b : false)) {
            v vVar = this.f247c;
            int q4 = vVar.q(vVar.r());
            String str = (String) vVar.f262e;
            int length = str.length() - q4;
            boolean z7 = false;
            if (length >= 4 && q4 != -1) {
                int i2 = 0;
                while (true) {
                    if (i2 < 4) {
                        if ("null".charAt(i2) != str.charAt(q4 + i2)) {
                            break;
                        }
                        i2++;
                    } else if (length <= 4 || m.d(str.charAt(q4 + 4)) != 0) {
                        z7 = true;
                        vVar.f259b = q4 + 4;
                    }
                }
            }
            if (!z7) {
                return true;
            }
        }
        return false;
    }

    @Override // O6.g, y6.b
    public final char f() {
        v vVar = this.f247c;
        String j = vVar.j();
        if (j.length() == 1) {
            return j.charAt(0);
        }
        v.m(vVar, C4.p.i("Expected single char, but got '", j, '\''), 0, 6);
        throw null;
    }

    @Override // O6.g, y6.a
    public final Object g(x6.e descriptor, int i2, w6.a deserializer, Object obj) {
        o oVar = (o) this.f247c.f260c;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        boolean z7 = this.f246b == x.f268m && (i2 & 1) == 0;
        if (z7) {
            int[] iArr = (int[]) oVar.f231d;
            int i5 = oVar.f229b;
            if (iArr[i5] == -2) {
                ((Object[]) oVar.f230c)[i5] = n.f227a;
            }
        }
        Object g7 = super.g(descriptor, i2, deserializer, obj);
        if (z7) {
            int[] iArr2 = (int[]) oVar.f231d;
            int i7 = oVar.f229b;
            if (iArr2[i7] != -2) {
                int i8 = i7 + 1;
                oVar.f229b = i8;
                Object[] objArr = (Object[]) oVar.f230c;
                if (i8 == objArr.length) {
                    int i9 = i8 * 2;
                    Object[] copyOf = Arrays.copyOf(objArr, i9);
                    Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
                    oVar.f230c = copyOf;
                    int[] copyOf2 = Arrays.copyOf((int[]) oVar.f231d, i9);
                    Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(...)");
                    oVar.f231d = copyOf2;
                }
            }
            Object[] objArr2 = (Object[]) oVar.f230c;
            int i10 = oVar.f229b;
            objArr2[i10] = g7;
            ((int[]) oVar.f231d)[i10] = -2;
        }
        return g7;
    }

    @Override // O6.g, y6.b
    public final y6.b k(x6.e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (u.a(descriptor)) {
            return new h(this.f247c, this.f245a);
        }
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this;
    }

    @Override // y6.a
    public final int o(x6.e descriptor) {
        int i2;
        int numberOfTrailingZeros;
        byte b7;
        byte b8;
        v vVar = this.f247c;
        o oVar = (o) vVar.f260c;
        String str = (String) vVar.f262e;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        x xVar = this.f246b;
        int ordinal = xVar.ordinal();
        Throwable th = null;
        char c7 = ':';
        int i5 = 0;
        r11 = false;
        boolean z7 = false;
        byte b9 = 1;
        int i7 = -1;
        if (ordinal == 0) {
            boolean s7 = vVar.s();
            while (true) {
                boolean b10 = vVar.b();
                Throwable th2 = th;
                k kVar = this.f250f;
                if (b10) {
                    String key = vVar.d();
                    vVar.g(c7);
                    Intrinsics.checkNotNullParameter(descriptor, "<this>");
                    AbstractC0091c json = this.f245a;
                    Intrinsics.checkNotNullParameter(json, "json");
                    Intrinsics.checkNotNullParameter(key, "name");
                    A6.j jVar = json.f97a;
                    m.h(json, descriptor);
                    i2 = descriptor.a(key);
                    if (i2 == -3 && json.f97a.f116d) {
                        Intrinsics.checkNotNullParameter(json, "<this>");
                        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
                        Intrinsics.checkNotNullParameter(json, "<this>");
                        l2.c cVar = json.f99c;
                        b7 = b9;
                        A0.j defaultValue = new A0.j(descriptor, 1, json);
                        cVar.getClass();
                        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
                        n key2 = m.f226a;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
                        cVar.getClass();
                        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
                        Intrinsics.checkNotNullParameter(key2, "key");
                        Map map = (Map) ((ConcurrentHashMap) cVar.f6269d).get(descriptor);
                        Object obj = map != null ? map.get(key2) : null;
                        Object obj2 = obj != null ? obj : null;
                        if (obj2 == null) {
                            Object value = defaultValue.invoke();
                            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
                            Intrinsics.checkNotNullParameter(key2, "key");
                            Intrinsics.checkNotNullParameter(value, "value");
                            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) cVar.f6269d;
                            Object obj3 = concurrentHashMap.get(descriptor);
                            Object obj4 = obj3;
                            if (obj3 == null) {
                                ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap(2);
                                concurrentHashMap.put(descriptor, concurrentHashMap2);
                                obj4 = concurrentHashMap2;
                            }
                            ((Map) obj4).put(key2, value);
                            obj2 = value;
                        }
                        Integer num = (Integer) ((Map) obj2).get(key);
                        i2 = num != null ? num.intValue() : -3;
                    } else {
                        b7 = b9;
                    }
                    if (i2 != -3) {
                        if (kVar != null) {
                            z6.r rVar = kVar.f224a;
                            if (i2 < 64) {
                                rVar.f8810c |= 1 << i2;
                            } else {
                                int i8 = (i2 >>> 6) - 1;
                                long[] jArr = rVar.f8811d;
                                jArr[i8] = jArr[i8] | (1 << (i2 & 63));
                            }
                        }
                    } else {
                        if (!this.f249e.f114b) {
                            Intrinsics.checkNotNullParameter(key, "key");
                            vVar.l(StringsKt.A(6, str.subSequence(0, vVar.f259b).toString(), key), C4.p.i("Encountered an unknown key '", key, '\''), "Use 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.");
                            throw th2;
                        }
                        ArrayList arrayList = new ArrayList();
                        byte p7 = vVar.p();
                        byte b11 = 6;
                        if (p7 == 8 || p7 == 6) {
                            while (true) {
                                byte p8 = vVar.p();
                                b8 = b7;
                                if (p8 == b8) {
                                    vVar.d();
                                    b7 = b8;
                                } else {
                                    if (p8 == 8 || p8 == b11) {
                                        arrayList.add(Byte.valueOf(p8));
                                    } else if (p8 == 9) {
                                        if (((Number) CollectionsKt.t(arrayList)).byteValue() != 8) {
                                            throw m.b(vVar.f259b, "found ] instead of } at path: " + oVar, str);
                                        }
                                        Intrinsics.checkNotNullParameter(arrayList, "<this>");
                                        if (arrayList.isEmpty()) {
                                            throw new NoSuchElementException("List is empty.");
                                        }
                                        arrayList.remove(kotlin.collections.r.c(arrayList));
                                    } else if (p8 == 7) {
                                        if (((Number) CollectionsKt.t(arrayList)).byteValue() != 6) {
                                            throw m.b(vVar.f259b, "found } instead of ] at path: " + oVar, str);
                                        }
                                        Intrinsics.checkNotNullParameter(arrayList, "<this>");
                                        if (arrayList.isEmpty()) {
                                            throw new NoSuchElementException("List is empty.");
                                        }
                                        arrayList.remove(kotlin.collections.r.c(arrayList));
                                    } else if (p8 == 10) {
                                        v.m(vVar, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, 6);
                                        throw th2;
                                    }
                                    vVar.e();
                                    if (arrayList.size() == 0) {
                                        break;
                                    }
                                    b7 = b8;
                                    b11 = 6;
                                }
                            }
                        } else {
                            vVar.j();
                            b8 = b7;
                        }
                        s7 = vVar.s();
                        b9 = b8;
                        th = th2;
                        c7 = ':';
                        i5 = 0;
                    }
                } else {
                    int i9 = i5;
                    if (s7) {
                        m.f(vVar, "object");
                        throw th2;
                    }
                    if (kVar != null) {
                        z6.r rVar2 = kVar.f224a;
                        j jVar2 = rVar2.f8809b;
                        x6.e eVar = rVar2.f8808a;
                        int d7 = eVar.d();
                        do {
                            long j = rVar2.f8810c;
                            long j7 = -1;
                            if (j != -1) {
                                numberOfTrailingZeros = Long.numberOfTrailingZeros(~j);
                                rVar2.f8810c |= 1 << numberOfTrailingZeros;
                                jVar2.invoke(eVar, Integer.valueOf(numberOfTrailingZeros));
                            } else if (d7 > 64) {
                                long[] jArr2 = rVar2.f8811d;
                                int length = jArr2.length;
                                loop3: while (i9 < length) {
                                    int i10 = i9 + 1;
                                    int i11 = i10 * 64;
                                    long j8 = jArr2[i9];
                                    while (j8 != j7) {
                                        int numberOfTrailingZeros2 = Long.numberOfTrailingZeros(~j8);
                                        j8 |= 1 << numberOfTrailingZeros2;
                                        i2 = numberOfTrailingZeros2 + i11;
                                        jVar2.invoke(eVar, Integer.valueOf(i2));
                                        if (Boolean.FALSE.booleanValue()) {
                                            jArr2[i9] = j8;
                                        } else {
                                            j7 = -1;
                                        }
                                    }
                                    jArr2[i9] = j8;
                                    i9 = i10;
                                    j7 = -1;
                                }
                            }
                        } while (!Boolean.FALSE.booleanValue());
                        i7 = numberOfTrailingZeros;
                    }
                    i7 = -1;
                }
            }
            i7 = i2;
            break loop3;
        } else if (ordinal != 2) {
            boolean s8 = vVar.s();
            if (vVar.b()) {
                int i12 = this.f248d;
                if (i12 != -1 && !s8) {
                    v.m(vVar, "Expected end of the array or comma", 0, 6);
                    throw null;
                }
                i7 = i12 + 1;
                this.f248d = i7;
            } else if (s8) {
                m.f(vVar, "array");
                throw null;
            }
        } else {
            int i13 = this.f248d;
            boolean z8 = i13 % 2 != 0;
            if (!z8) {
                vVar.g(':');
            } else if (i13 != -1) {
                z7 = vVar.s();
            }
            if (vVar.b()) {
                if (z8) {
                    if (this.f248d == -1) {
                        int i14 = vVar.f259b;
                        if (z7) {
                            v.m(vVar, "Unexpected leading comma", i14, 4);
                            throw null;
                        }
                    } else {
                        int i15 = vVar.f259b;
                        if (!z7) {
                            v.m(vVar, "Expected comma after the key-value pair", i15, 4);
                            throw null;
                        }
                    }
                }
                i7 = this.f248d + 1;
                this.f248d = i7;
            } else if (z7) {
                m.f(vVar, "object");
                throw null;
            }
        }
        if (xVar != x.f268m) {
            ((int[]) oVar.f231d)[oVar.f229b] = i7;
        }
        return i7;
    }

    @Override // O6.g, y6.b
    public final int p() {
        v vVar = this.f247c;
        long h7 = vVar.h();
        int i2 = (int) h7;
        if (h7 == i2) {
            return i2;
        }
        v.m(vVar, "Failed to parse int for input '" + h7 + '\'', 0, 6);
        throw null;
    }

    @Override // O6.g, y6.b
    public final byte q() {
        v vVar = this.f247c;
        long h7 = vVar.h();
        byte b7 = (byte) h7;
        if (h7 == b7) {
            return b7;
        }
        v.m(vVar, "Failed to parse byte for input '" + h7 + '\'', 0, 6);
        throw null;
    }

    @Override // O6.g, y6.b
    public final y6.a t(x6.e sd) {
        Intrinsics.checkNotNullParameter(sd, "descriptor");
        AbstractC0091c abstractC0091c = this.f245a;
        x i2 = m.i(abstractC0091c, sd);
        v vVar = this.f247c;
        o oVar = (o) vVar.f260c;
        Intrinsics.checkNotNullParameter(sd, "sd");
        int i5 = oVar.f229b + 1;
        oVar.f229b = i5;
        Object[] objArr = (Object[]) oVar.f230c;
        if (i5 == objArr.length) {
            int i7 = i5 * 2;
            Object[] copyOf = Arrays.copyOf(objArr, i7);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            oVar.f230c = copyOf;
            int[] copyOf2 = Arrays.copyOf((int[]) oVar.f231d, i7);
            Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(...)");
            oVar.f231d = copyOf2;
        }
        ((Object[]) oVar.f230c)[i5] = sd;
        vVar.g(i2.f272d);
        if (vVar.p() != 4) {
            int ordinal = i2.ordinal();
            return (ordinal == 1 || ordinal == 2 || ordinal == 3) ? new s(abstractC0091c, i2, vVar, sd) : (this.f246b == i2 && abstractC0091c.f97a.f115c) ? this : new s(abstractC0091c, i2, vVar, sd);
        }
        v.m(vVar, "Unexpected leading comma", 0, 6);
        throw null;
    }

    @Override // O6.g, y6.b
    public final short u() {
        v vVar = this.f247c;
        long h7 = vVar.h();
        short s7 = (short) h7;
        if (h7 == s7) {
            return s7;
        }
        v.m(vVar, "Failed to parse short for input '" + h7 + '\'', 0, 6);
        throw null;
    }

    @Override // O6.g, y6.b
    public final String v() {
        return this.f247c.i();
    }

    @Override // O6.g, y6.b
    public final float w() {
        v vVar = this.f247c;
        String j = vVar.j();
        try {
            float parseFloat = Float.parseFloat(j);
            if (!Float.isInfinite(parseFloat) && !Float.isNaN(parseFloat)) {
                return parseFloat;
            }
            m.j(vVar, Float.valueOf(parseFloat));
            throw null;
        } catch (IllegalArgumentException unused) {
            v.m(vVar, C4.p.i("Failed to parse type 'float' for input '", j, '\''), 0, 6);
            throw null;
        }
    }

    @Override // O6.g, y6.b
    public final double x() {
        v vVar = this.f247c;
        String j = vVar.j();
        try {
            double parseDouble = Double.parseDouble(j);
            if (!Double.isInfinite(parseDouble) && !Double.isNaN(parseDouble)) {
                return parseDouble;
            }
            m.j(vVar, Double.valueOf(parseDouble));
            throw null;
        } catch (IllegalArgumentException unused) {
            v.m(vVar, C4.p.i("Failed to parse type 'double' for input '", j, '\''), 0, 6);
            throw null;
        }
    }
}
