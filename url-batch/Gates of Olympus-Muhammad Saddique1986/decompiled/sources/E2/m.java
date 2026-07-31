package E2;

import B.C0011l;
import C2.C0055s;
import D2.A;
import D2.t;
import D2.w;
import a.AbstractC0235a;
import f2.v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import n.T;
import n2.AbstractC0730j;

/* loaded from: classes.dex */
public final class m extends O2.l implements Decoder, B2.a {

    /* renamed from: g, reason: collision with root package name */
    public final D2.c f1070g;

    /* renamed from: h, reason: collision with root package name */
    public final r f1071h;

    /* renamed from: i, reason: collision with root package name */
    public final o f1072i;

    /* renamed from: j, reason: collision with root package name */
    public final A1.i f1073j;

    /* renamed from: k, reason: collision with root package name */
    public int f1074k;

    /* renamed from: l, reason: collision with root package name */
    public final D2.i f1075l;

    /* renamed from: m, reason: collision with root package name */
    public final e f1076m;

    public m(D2.c cVar, r rVar, o oVar, SerialDescriptor serialDescriptor) {
        f2.j.f(cVar, "json");
        f2.j.f(serialDescriptor, "descriptor");
        this.f1070g = cVar;
        this.f1071h = rVar;
        this.f1072i = oVar;
        this.f1073j = cVar.f872b;
        this.f1074k = -1;
        D2.i iVar = cVar.f871a;
        this.f1075l = iVar;
        this.f1076m = iVar.f884f ? null : new e(serialDescriptor);
    }

    @Override // O2.l, kotlinx.serialization.encoding.Decoder
    public final double C() {
        o oVar = this.f1072i;
        String j3 = oVar.j();
        try {
            double parseDouble = Double.parseDouble(j3);
            if (this.f1070g.f871a.f889k || !(Double.isInfinite(parseDouble) || Double.isNaN(parseDouble))) {
                return parseDouble;
            }
            h.j(oVar, Double.valueOf(parseDouble));
            throw null;
        } catch (IllegalArgumentException unused) {
            o.n(oVar, "Failed to parse type 'double' for input '" + j3 + '\'', 0, null, 6);
            throw null;
        }
    }

    @Override // O2.l, kotlinx.serialization.encoding.Decoder
    public final B2.a a(SerialDescriptor serialDescriptor) {
        r rVar;
        f2.j.f(serialDescriptor, "descriptor");
        D2.c cVar = this.f1070g;
        f2.j.f(cVar, "<this>");
        AbstractC0235a i3 = serialDescriptor.i();
        boolean z3 = i3 instanceof A2.c;
        D2.i iVar = cVar.f871a;
        if (z3) {
            rVar = r.POLY_OBJ;
        } else {
            boolean a3 = f2.j.a(i3, A2.k.f258d);
            r rVar2 = r.LIST;
            if (!a3) {
                if (f2.j.a(i3, A2.k.f259e)) {
                    SerialDescriptor c2 = h.c(serialDescriptor.h(0), cVar.f872b);
                    AbstractC0235a i4 = c2.i();
                    if ((i4 instanceof A2.e) || f2.j.a(i4, A2.j.f256d)) {
                        rVar = r.MAP;
                    } else if (!iVar.f882d) {
                        String str = "Value of type '" + c2.d() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + c2.i() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.";
                        f2.j.f(str, "message");
                        throw new c(str);
                    }
                } else {
                    rVar = r.OBJ;
                }
            }
            rVar = rVar2;
        }
        o oVar = this.f1072i;
        C0011l c0011l = oVar.f1079b;
        int i5 = c0011l.f421e + 1;
        c0011l.f421e = i5;
        Object[] objArr = (Object[]) c0011l.f422f;
        if (i5 == objArr.length) {
            int i6 = i5 * 2;
            Object[] copyOf = Arrays.copyOf(objArr, i6);
            f2.j.e(copyOf, "copyOf(...)");
            c0011l.f422f = copyOf;
            int[] copyOf2 = Arrays.copyOf((int[]) c0011l.f423g, i6);
            f2.j.e(copyOf2, "copyOf(...)");
            c0011l.f423g = copyOf2;
        }
        ((Object[]) c0011l.f422f)[i5] = serialDescriptor;
        oVar.g(rVar.f1089d);
        if (oVar.r() != 4) {
            int ordinal = rVar.ordinal();
            return (ordinal == 1 || ordinal == 2 || ordinal == 3) ? new m(cVar, rVar, oVar, serialDescriptor) : (this.f1071h == rVar && iVar.f884f) ? this : new m(cVar, rVar, oVar, serialDescriptor);
        }
        o.n(oVar, "Unexpected leading comma", 0, null, 6);
        throw null;
    }

    @Override // O2.l, kotlinx.serialization.encoding.Decoder
    public final Decoder b(SerialDescriptor serialDescriptor) {
        f2.j.f(serialDescriptor, "descriptor");
        Set set = n.f1077a;
        return (serialDescriptor.b() && n.f1077a.contains(serialDescriptor)) ? new b(this.f1072i, this.f1070g) : this;
    }

    @Override // O2.l, kotlinx.serialization.encoding.Decoder
    public final long c() {
        return this.f1072i.h();
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012a  */
    @Override // O2.l, kotlinx.serialization.encoding.Decoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(KSerializer kSerializer) {
        String message;
        String str;
        D2.c cVar = this.f1070g;
        o oVar = this.f1072i;
        C0011l c0011l = oVar.f1079b;
        f2.j.f(kSerializer, "deserializer");
        try {
        } catch (z2.a e3) {
            message = e3.getMessage();
            f2.j.c(message);
            if (!AbstractC0730j.C(message, "at path")) {
            }
        }
        if ((kSerializer instanceof z2.b) && !cVar.f871a.f887i) {
            String q3 = oVar.q(h.e(cVar, ((z2.b) kSerializer).getDescriptor()), this.f1075l.f881c);
            if (q3 != null) {
                try {
                    T.k((z2.b) kSerializer, this, q3);
                    throw null;
                } catch (z2.c e4) {
                    String message2 = e4.getMessage();
                    f2.j.c(message2);
                    int H3 = AbstractC0730j.H(message2, '\n', 0, false, 6);
                    if (H3 != -1) {
                        message2 = message2.substring(0, H3);
                        f2.j.e(message2, "substring(...)");
                    }
                    String R2 = AbstractC0730j.R(message2, ".");
                    String message3 = e4.getMessage();
                    f2.j.c(message3);
                    o.n(oVar, R2, 0, AbstractC0730j.U(message3, '\n', ""), 2);
                    throw null;
                }
            }
            if ((kSerializer instanceof z2.b) && !cVar.f871a.f887i) {
                String e5 = h.e(cVar, ((z2.b) kSerializer).getDescriptor());
                D2.k x02 = x0();
                String d3 = ((z2.b) kSerializer).getDescriptor().d();
                if (!(x02 instanceof w)) {
                    throw h.a(-1, "Expected " + v.a(w.class).b() + ", but had " + v.a(x02.getClass()).b() + " as the serialized body of " + d3 + " at element: " + c0011l.f(), x02.toString());
                }
                w wVar = (w) x02;
                D2.k kVar = (D2.k) wVar.get((Object) e5);
                try {
                    if (kVar != null) {
                        A a3 = D2.l.a(kVar);
                        if (!(a3 instanceof t)) {
                            str = a3.getContent();
                            T.k((z2.b) kSerializer, this, str);
                            throw null;
                        }
                    }
                    T.k((z2.b) kSerializer, this, str);
                    throw null;
                } catch (z2.c e6) {
                    String message4 = e6.getMessage();
                    f2.j.c(message4);
                    throw h.a(-1, message4, wVar.toString());
                }
                str = null;
            }
            return kSerializer.deserialize(this);
            message = e3.getMessage();
            f2.j.c(message);
            if (!AbstractC0730j.C(message, "at path")) {
                throw e3;
            }
            throw new z2.a(e3.f10547d, e3.getMessage() + " at path: " + c0011l.f(), e3);
        }
        return kSerializer.deserialize(this);
    }

    @Override // O2.l, B2.a
    public final Object g(SerialDescriptor serialDescriptor, int i3, KSerializer kSerializer, Object obj) {
        f2.j.f(serialDescriptor, "descriptor");
        f2.j.f(kSerializer, "deserializer");
        boolean z3 = this.f1071h == r.MAP && (i3 & 1) == 0;
        C0011l c0011l = this.f1072i.f1079b;
        if (z3) {
            int[] iArr = (int[]) c0011l.f423g;
            int i4 = c0011l.f421e;
            if (iArr[i4] == -2) {
                ((Object[]) c0011l.f422f)[i4] = i.f1055a;
            }
        }
        Object g3 = super.g(serialDescriptor, i3, kSerializer, obj);
        if (z3) {
            int[] iArr2 = (int[]) c0011l.f423g;
            int i5 = c0011l.f421e;
            if (iArr2[i5] != -2) {
                int i6 = i5 + 1;
                c0011l.f421e = i6;
                Object[] objArr = (Object[]) c0011l.f422f;
                if (i6 == objArr.length) {
                    int i7 = i6 * 2;
                    Object[] copyOf = Arrays.copyOf(objArr, i7);
                    f2.j.e(copyOf, "copyOf(...)");
                    c0011l.f422f = copyOf;
                    int[] copyOf2 = Arrays.copyOf((int[]) c0011l.f423g, i7);
                    f2.j.e(copyOf2, "copyOf(...)");
                    c0011l.f423g = copyOf2;
                }
            }
            Object[] objArr2 = (Object[]) c0011l.f422f;
            int i8 = c0011l.f421e;
            objArr2[i8] = g3;
            ((int[]) c0011l.f423g)[i8] = -2;
        }
        return g3;
    }

    @Override // O2.l, kotlinx.serialization.encoding.Decoder
    public final boolean h() {
        boolean z3;
        boolean z4;
        o oVar = this.f1072i;
        int u3 = oVar.u();
        String str = oVar.f1082e;
        if (u3 == str.length()) {
            o.n(oVar, "EOF", 0, null, 6);
            throw null;
        }
        if (str.charAt(u3) == '\"') {
            u3++;
            z3 = true;
        } else {
            z3 = false;
        }
        int t3 = oVar.t(u3);
        if (t3 >= str.length() || t3 == -1) {
            o.n(oVar, "EOF", 0, null, 6);
            throw null;
        }
        int i3 = t3 + 1;
        int charAt = str.charAt(t3) | ' ';
        if (charAt == 102) {
            oVar.c("alse", i3);
            z4 = false;
        } else {
            if (charAt != 116) {
                o.n(oVar, "Expected valid boolean literal prefix, but had '" + oVar.j() + '\'', 0, null, 6);
                throw null;
            }
            oVar.c("rue", i3);
            z4 = true;
        }
        if (z3) {
            if (oVar.f1078a == str.length()) {
                o.n(oVar, "EOF", 0, null, 6);
                throw null;
            }
            if (str.charAt(oVar.f1078a) != '\"') {
                o.n(oVar, "Expected closing quotation mark", 0, null, 6);
                throw null;
            }
            oVar.f1078a++;
        }
        return z4;
    }

    @Override // O2.l, kotlinx.serialization.encoding.Decoder
    public final int i() {
        o oVar = this.f1072i;
        long h3 = oVar.h();
        int i3 = (int) h3;
        if (h3 == i3) {
            return i3;
        }
        o.n(oVar, "Failed to parse int for input '" + h3 + '\'', 0, null, 6);
        throw null;
    }

    @Override // O2.l, kotlinx.serialization.encoding.Decoder
    public final boolean j() {
        e eVar = this.f1076m;
        return ((eVar != null ? eVar.f1050b : false) || this.f1072i.w(true)) ? false : true;
    }

    @Override // B2.a
    public final A1.i m() {
        return this.f1073j;
    }

    @Override // O2.l, kotlinx.serialization.encoding.Decoder
    public final char n() {
        o oVar = this.f1072i;
        String j3 = oVar.j();
        if (j3.length() == 1) {
            return j3.charAt(0);
        }
        o.n(oVar, "Expected single char, but got '" + j3 + '\'', 0, null, 6);
        throw null;
    }

    @Override // O2.l, kotlinx.serialization.encoding.Decoder
    public final byte o() {
        o oVar = this.f1072i;
        long h3 = oVar.h();
        byte b3 = (byte) h3;
        if (h3 == b3) {
            return b3;
        }
        o.n(oVar, "Failed to parse byte for input '" + h3 + '\'', 0, null, 6);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x012a, code lost:
    
        r1 = r12.f1049a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x012e, code lost:
    
        if (r10 >= 64) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0130, code lost:
    
        r1.f786c |= 1 << r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0138, code lost:
    
        r3 = (r10 >>> 6) - 1;
        r1 = r1.f787d;
        r1[r3] = r1[r3] | (1 << (r10 & 63));
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // B2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int r(SerialDescriptor serialDescriptor) {
        int g3;
        boolean z3;
        boolean z4;
        boolean z5;
        String s3;
        f2.j.f(serialDescriptor, "descriptor");
        r rVar = this.f1071h;
        int ordinal = rVar.ordinal();
        o oVar = this.f1072i;
        boolean z6 = true;
        int i3 = 0;
        r7 = false;
        boolean z7 = false;
        Throwable th = null;
        char c2 = ':';
        D2.c cVar = this.f1070g;
        int i4 = -1;
        C0011l c0011l = oVar.f1079b;
        if (ordinal == 0) {
            boolean v3 = oVar.v();
            while (true) {
                boolean b3 = oVar.b();
                e eVar = this.f1076m;
                if (b3) {
                    D2.i iVar = this.f1075l;
                    boolean z8 = iVar.f881c;
                    String k3 = z8 ? oVar.k() : oVar.d();
                    oVar.g(c2);
                    g3 = h.g(serialDescriptor, cVar, k3);
                    if (g3 == -3) {
                        z3 = false;
                        z4 = true;
                    } else {
                        if (!iVar.f886h) {
                            break;
                        }
                        boolean j3 = serialDescriptor.j(g3);
                        SerialDescriptor h3 = serialDescriptor.h(g3);
                        if (!j3 || h3.f() || !oVar.w(z6)) {
                            if (!f2.j.a(h3.i(), A2.j.f256d) || ((h3.f() && oVar.w(false)) || (s3 = oVar.s(z8)) == null)) {
                                break;
                            }
                            int g4 = h.g(h3, cVar, s3);
                            boolean z9 = !cVar.f871a.f884f && h3.f();
                            if (g4 != -3 || (!j3 && !z9)) {
                                break;
                            }
                            oVar.i();
                        }
                        z3 = oVar.v();
                        z4 = false;
                    }
                    if (z4) {
                        boolean z10 = iVar.f880b;
                        String str = oVar.f1082e;
                        if (!z10) {
                            oVar.m(AbstractC0730j.M(6, str.subSequence(0, oVar.f1078a).toString(), k3), "Encountered an unknown key '" + k3 + '\'', "Use 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.");
                            throw null;
                        }
                        ArrayList arrayList = new ArrayList();
                        byte r3 = oVar.r();
                        if (r3 == 8 || r3 == 6) {
                            while (true) {
                                byte r4 = oVar.r();
                                z5 = true;
                                if (r4 != 1) {
                                    if (r4 == 8 || r4 == 6) {
                                        arrayList.add(Byte.valueOf(r4));
                                    } else if (r4 == 9) {
                                        if (((Number) S1.l.Q0(arrayList)).byteValue() != 8) {
                                            throw h.a(oVar.f1078a, "found ] instead of } at path: " + c0011l, str);
                                        }
                                        S1.r.I0(arrayList);
                                    } else if (r4 == 7) {
                                        if (((Number) S1.l.Q0(arrayList)).byteValue() != 6) {
                                            throw h.a(oVar.f1078a, "found } instead of ] at path: " + c0011l, str);
                                        }
                                        S1.r.I0(arrayList);
                                    } else if (r4 == 10) {
                                        o.n(oVar, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6);
                                        throw null;
                                    }
                                    oVar.e();
                                    if (arrayList.size() == 0) {
                                        break;
                                    }
                                } else if (z8) {
                                    oVar.j();
                                } else {
                                    oVar.d();
                                }
                            }
                        } else {
                            oVar.j();
                            z5 = true;
                        }
                        v3 = oVar.v();
                        z6 = z5;
                    } else {
                        v3 = z3;
                        z6 = true;
                    }
                    i3 = 0;
                    th = null;
                    c2 = ':';
                } else {
                    if (v3 && !cVar.f871a.f892n) {
                        h.h(oVar, "object");
                        throw th;
                    }
                    if (eVar != null) {
                        C0055s c0055s = eVar.f1049a;
                        SerialDescriptor serialDescriptor2 = c0055s.f784a;
                        int l3 = serialDescriptor2.l();
                        while (true) {
                            long j4 = c0055s.f786c;
                            long j5 = -1;
                            d dVar = c0055s.f785b;
                            if (j4 != -1) {
                                int numberOfTrailingZeros = Long.numberOfTrailingZeros(~j4);
                                c0055s.f786c |= 1 << numberOfTrailingZeros;
                                if (((Boolean) dVar.h(serialDescriptor2, Integer.valueOf(numberOfTrailingZeros))).booleanValue()) {
                                    i4 = numberOfTrailingZeros;
                                    break;
                                }
                            } else if (l3 > 64) {
                                long[] jArr = c0055s.f787d;
                                int length = jArr.length;
                                loop3: while (i3 < length) {
                                    int i5 = i3 + 1;
                                    int i6 = i5 * 64;
                                    long j6 = jArr[i3];
                                    while (j6 != j5) {
                                        int numberOfTrailingZeros2 = Long.numberOfTrailingZeros(~j6);
                                        j6 |= 1 << numberOfTrailingZeros2;
                                        int i7 = numberOfTrailingZeros2 + i6;
                                        if (((Boolean) dVar.h(serialDescriptor2, Integer.valueOf(i7))).booleanValue()) {
                                            jArr[i3] = j6;
                                            i4 = i7;
                                            break loop3;
                                        }
                                        j5 = -1;
                                    }
                                    jArr[i3] = j6;
                                    i3 = i5;
                                    j5 = -1;
                                }
                            }
                        }
                    }
                    i4 = -1;
                }
            }
            i4 = g3;
        } else if (ordinal != 2) {
            boolean v4 = oVar.v();
            if (oVar.b()) {
                int i8 = this.f1074k;
                if (i8 != -1 && !v4) {
                    o.n(oVar, "Expected end of the array or comma", 0, null, 6);
                    throw null;
                }
                i4 = i8 + 1;
                this.f1074k = i4;
            } else if (v4 && !cVar.f871a.f892n) {
                h.h(oVar, "array");
                throw null;
            }
        } else {
            int i9 = this.f1074k;
            Object[] objArr = i9 % 2 != 0;
            if (objArr != true) {
                oVar.g(':');
            } else if (i9 != -1) {
                z7 = oVar.v();
            }
            if (oVar.b()) {
                if (objArr != false) {
                    if (this.f1074k == -1) {
                        int i10 = oVar.f1078a;
                        if (z7) {
                            o.n(oVar, "Unexpected leading comma", i10, null, 4);
                            throw null;
                        }
                    } else {
                        int i11 = oVar.f1078a;
                        if (!z7) {
                            o.n(oVar, "Expected comma after the key-value pair", i11, null, 4);
                            throw null;
                        }
                    }
                }
                i4 = this.f1074k + 1;
                this.f1074k = i4;
            } else if (z7 && !cVar.f871a.f892n) {
                h.h(oVar, "object");
                throw null;
            }
        }
        if (rVar != r.MAP) {
            ((int[]) c0011l.f423g)[c0011l.f421e] = i4;
        }
        return i4;
    }

    @Override // O2.l, kotlinx.serialization.encoding.Decoder
    public final short s() {
        o oVar = this.f1072i;
        long h3 = oVar.h();
        short s3 = (short) h3;
        if (h3 == s3) {
            return s3;
        }
        o.n(oVar, "Failed to parse short for input '" + h3 + '\'', 0, null, 6);
        throw null;
    }

    @Override // O2.l, kotlinx.serialization.encoding.Decoder
    public final String t() {
        boolean z3 = this.f1075l.f881c;
        o oVar = this.f1072i;
        return z3 ? oVar.k() : oVar.i();
    }

    @Override // O2.l, kotlinx.serialization.encoding.Decoder
    public final float u() {
        o oVar = this.f1072i;
        String j3 = oVar.j();
        try {
            float parseFloat = Float.parseFloat(j3);
            if (this.f1070g.f871a.f889k || !(Float.isInfinite(parseFloat) || Float.isNaN(parseFloat))) {
                return parseFloat;
            }
            h.j(oVar, Float.valueOf(parseFloat));
            throw null;
        } catch (IllegalArgumentException unused) {
            o.n(oVar, "Failed to parse type 'float' for input '" + j3 + '\'', 0, null, 6);
            throw null;
        }
    }

    public final D2.k x0() {
        return new l(this.f1070g.f871a, this.f1072i).c();
    }

    @Override // O2.l, B2.a
    public final void z(SerialDescriptor serialDescriptor) {
        f2.j.f(serialDescriptor, "descriptor");
        D2.c cVar = this.f1070g;
        if (cVar.f871a.f880b && serialDescriptor.l() == 0) {
            while (r(serialDescriptor) != -1) {
            }
        }
        o oVar = this.f1072i;
        if (oVar.v() && !cVar.f871a.f892n) {
            h.h(oVar, "");
            throw null;
        }
        oVar.g(this.f1071h.f1090e);
        C0011l c0011l = oVar.f1079b;
        int i3 = c0011l.f421e;
        int[] iArr = (int[]) c0011l.f423g;
        if (iArr[i3] == -2) {
            iArr[i3] = -1;
            c0011l.f421e = i3 - 1;
        }
        int i4 = c0011l.f421e;
        if (i4 != -1) {
            c0011l.f421e = i4 - 1;
        }
    }
}
