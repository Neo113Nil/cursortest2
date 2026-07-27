package k3;

import A.C0016l;
import M2.F;
import e2.C0559a;
import i3.C0697s;
import j3.AbstractC0724c;
import j3.B;
import j3.x;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.y;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import z2.C1400D;
import z2.C1403G;

/* loaded from: classes.dex */
public final class q extends u3.l implements j3.k {

    /* renamed from: j, reason: collision with root package name */
    public final AbstractC0724c f7468j;

    /* renamed from: k, reason: collision with root package name */
    public final u f7469k;

    /* renamed from: l, reason: collision with root package name */
    public final C0559a f7470l;

    /* renamed from: m, reason: collision with root package name */
    public final A0.q f7471m;

    /* renamed from: n, reason: collision with root package name */
    public int f7472n;

    /* renamed from: o, reason: collision with root package name */
    public b3.t f7473o;

    /* renamed from: p, reason: collision with root package name */
    public final j3.j f7474p;

    /* renamed from: q, reason: collision with root package name */
    public final f f7475q;

    public q(AbstractC0724c json, u mode, C0559a lexer, SerialDescriptor descriptor, b3.t tVar) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(lexer, "lexer");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.f7468j = json;
        this.f7469k = mode;
        this.f7470l = lexer;
        this.f7471m = json.f7174b;
        this.f7472n = -1;
        this.f7473o = tVar;
        j3.j jVar = json.f7173a;
        this.f7474p = jVar;
        this.f7475q = jVar.f7203f ? null : new f(descriptor);
    }

    @Override // u3.l, h3.a
    public final void A(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        AbstractC0724c abstractC0724c = this.f7468j;
        if (abstractC0724c.f7173a.f7199b && descriptor.l() == 0) {
            while (s(descriptor) != -1) {
            }
        }
        C0559a c0559a = this.f7470l;
        if (c0559a.C() && !abstractC0724c.f7173a.f7211n) {
            h.l(c0559a, "");
            throw null;
        }
        c0559a.h(this.f7469k.f7484e);
        C0016l c0016l = (C0016l) c0559a.f6166c;
        int i2 = c0016l.f163b;
        int[] iArr = (int[]) c0016l.f165d;
        if (iArr[i2] == -2) {
            iArr[i2] = -1;
            c0016l.f163b = i2 - 1;
        }
        int i4 = c0016l.f163b;
        if (i4 != -1) {
            c0016l.f163b = i4 - 1;
        }
    }

    @Override // u3.l, kotlinx.serialization.encoding.Decoder
    public final double D() {
        C0559a c0559a = this.f7470l;
        String k4 = c0559a.k();
        try {
            double parseDouble = Double.parseDouble(k4);
            if (this.f7468j.f7173a.f7208k || !(Double.isInfinite(parseDouble) || Double.isNaN(parseDouble))) {
                return parseDouble;
            }
            h.p(c0559a, Double.valueOf(parseDouble));
            throw null;
        } catch (IllegalArgumentException unused) {
            C0559a.o(c0559a, "Failed to parse type 'double' for input '" + k4 + '\'', 0, null, 6);
            throw null;
        }
    }

    @Override // u3.l, kotlinx.serialization.encoding.Decoder
    public final h3.a a(SerialDescriptor sd) {
        u uVar;
        Intrinsics.checkNotNullParameter(sd, "descriptor");
        AbstractC0724c abstractC0724c = this.f7468j;
        Intrinsics.checkNotNullParameter(abstractC0724c, "<this>");
        Intrinsics.checkNotNullParameter(sd, "desc");
        u3.d i2 = sd.i();
        if (i2 instanceof g3.c) {
            uVar = u.f7481l;
        } else if (Intrinsics.a(i2, g3.i.f6808i)) {
            uVar = u.f7479j;
        } else if (Intrinsics.a(i2, g3.i.f6809j)) {
            SerialDescriptor g4 = h.g(sd.h(0), abstractC0724c.f7174b);
            u3.d i4 = g4.i();
            if ((i4 instanceof g3.e) || Intrinsics.a(i4, g3.h.f6806h)) {
                uVar = u.f7480k;
            } else {
                if (!abstractC0724c.f7173a.f7201d) {
                    throw h.b(g4);
                }
                uVar = u.f7479j;
            }
        } else {
            uVar = u.f7478i;
        }
        u uVar2 = uVar;
        C0559a c0559a = this.f7470l;
        C0016l c0016l = (C0016l) c0559a.f6166c;
        Intrinsics.checkNotNullParameter(sd, "sd");
        int i5 = c0016l.f163b + 1;
        c0016l.f163b = i5;
        Object[] objArr = (Object[]) c0016l.f164c;
        if (i5 == objArr.length) {
            int i6 = i5 * 2;
            Object[] copyOf = Arrays.copyOf(objArr, i6);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            c0016l.f164c = copyOf;
            int[] copyOf2 = Arrays.copyOf((int[]) c0016l.f165d, i6);
            Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(...)");
            c0016l.f165d = copyOf2;
        }
        ((Object[]) c0016l.f164c)[i5] = sd;
        c0559a.h(uVar2.f7483d);
        if (c0559a.y() == 4) {
            C0559a.o(c0559a, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        int ordinal = uVar2.ordinal();
        if (ordinal == 1 || ordinal == 2 || ordinal == 3) {
            return new q(this.f7468j, uVar2, c0559a, sd, this.f7473o);
        }
        if (this.f7469k == uVar2 && abstractC0724c.f7173a.f7203f) {
            return this;
        }
        return new q(this.f7468j, uVar2, c0559a, sd, this.f7473o);
    }

    @Override // u3.l, kotlinx.serialization.encoding.Decoder
    public final Decoder d(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Set set = r.f7476a;
        Intrinsics.checkNotNullParameter(descriptor, "<this>");
        if (descriptor.b() && r.f7476a.contains(descriptor)) {
            return new c(this.f7470l, this.f7468j);
        }
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this;
    }

    @Override // u3.l, kotlinx.serialization.encoding.Decoder
    public final long e() {
        return this.f7470l.i();
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0150  */
    @Override // u3.l, kotlinx.serialization.encoding.Decoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(KSerializer deserializer) {
        String message;
        AbstractC0724c abstractC0724c = this.f7468j;
        C0559a c0559a = this.f7470l;
        C0016l c0016l = (C0016l) c0559a.f6166c;
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        try {
        } catch (f3.a e4) {
            message = e4.getMessage();
            Intrinsics.c(message);
            if (!y.p(message, "at path")) {
            }
        }
        if ((deserializer instanceof f3.b) && !abstractC0724c.f7173a.f7206i) {
            String i2 = h.i(abstractC0724c, ((f3.b) deserializer).getDescriptor());
            String x2 = c0559a.x(i2, this.f7474p.f7200c);
            String str = null;
            if (x2 != null) {
                try {
                    KSerializer B = u3.d.B((f3.b) deserializer, this, x2);
                    b3.t tVar = new b3.t(2);
                    tVar.f5689e = i2;
                    this.f7473o = tVar;
                    return B.deserialize(this);
                } catch (f3.c e5) {
                    String missingDelimiterValue = e5.getMessage();
                    Intrinsics.c(missingDelimiterValue);
                    Intrinsics.checkNotNullParameter(missingDelimiterValue, "<this>");
                    Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
                    int u4 = y.u(missingDelimiterValue, '\n', 0, false, 6);
                    if (u4 != -1) {
                        missingDelimiterValue = missingDelimiterValue.substring(0, u4);
                        Intrinsics.checkNotNullExpressionValue(missingDelimiterValue, "substring(...)");
                    }
                    String E3 = y.E(missingDelimiterValue, ".");
                    String message2 = e5.getMessage();
                    Intrinsics.c(message2);
                    C0559a.o(c0559a, E3, 0, y.J(message2, '\n', ""), 2);
                    throw null;
                }
            }
            if ((deserializer instanceof f3.b) && !abstractC0724c.f7173a.f7206i) {
                String i4 = h.i(abstractC0724c, ((f3.b) deserializer).getDescriptor());
                j3.m i5 = i();
                String d4 = ((f3.b) deserializer).getDescriptor().d();
                if (!(i5 instanceof x)) {
                    throw h.d(-1, "Expected " + F.a(x.class).b() + ", but had " + F.a(i5.getClass()).b() + " as the serialized body of " + d4 + " at element: " + c0016l.e(), i5.toString());
                }
                x xVar = (x) i5;
                j3.m mVar = (j3.m) xVar.get((Object) i4);
                if (mVar != null) {
                    B b4 = j3.n.b(mVar);
                    Intrinsics.checkNotNullParameter(b4, "<this>");
                    if (!(b4 instanceof j3.u)) {
                        str = b4.getContent();
                    }
                }
                try {
                    return h.o(abstractC0724c, i4, xVar, u3.d.B((f3.b) deserializer, this, str));
                } catch (f3.c e6) {
                    String message3 = e6.getMessage();
                    Intrinsics.c(message3);
                    throw h.d(-1, message3, xVar.toString());
                }
            }
            return ((f3.b) deserializer).deserialize(this);
            message = e4.getMessage();
            Intrinsics.c(message);
            if (!y.p(message, "at path")) {
                throw e4;
            }
            throw new f3.a(e4.f6662d, e4.getMessage() + " at path: " + c0016l.e(), e4);
        }
        return deserializer.deserialize(this);
    }

    @Override // j3.k
    public final j3.m i() {
        return new p(this.f7468j.f7173a, this.f7470l).c();
    }

    @Override // u3.l, h3.a
    public final Object j(SerialDescriptor descriptor, int i2, KSerializer deserializer, Object obj) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        boolean z4 = this.f7469k == u.f7480k && (i2 & 1) == 0;
        C0016l c0016l = (C0016l) this.f7470l.f6166c;
        if (z4) {
            int[] iArr = (int[]) c0016l.f165d;
            int i4 = c0016l.f163b;
            if (iArr[i4] == -2) {
                ((Object[]) c0016l.f164c)[i4] = i.f7441a;
            }
        }
        Object j4 = super.j(descriptor, i2, deserializer, obj);
        if (z4) {
            int[] iArr2 = (int[]) c0016l.f165d;
            int i5 = c0016l.f163b;
            if (iArr2[i5] != -2) {
                int i6 = i5 + 1;
                c0016l.f163b = i6;
                Object[] objArr = (Object[]) c0016l.f164c;
                if (i6 == objArr.length) {
                    int i7 = i6 * 2;
                    Object[] copyOf = Arrays.copyOf(objArr, i7);
                    Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
                    c0016l.f164c = copyOf;
                    int[] copyOf2 = Arrays.copyOf((int[]) c0016l.f165d, i7);
                    Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(...)");
                    c0016l.f165d = copyOf2;
                }
            }
            Object[] objArr2 = (Object[]) c0016l.f164c;
            int i8 = c0016l.f163b;
            objArr2[i8] = j4;
            ((int[]) c0016l.f165d)[i8] = -2;
        }
        return j4;
    }

    @Override // u3.l, kotlinx.serialization.encoding.Decoder
    public final boolean k() {
        boolean z4;
        boolean z5;
        C0559a c0559a = this.f7470l;
        int B = c0559a.B();
        String str = (String) c0559a.f6169f;
        if (B == str.length()) {
            C0559a.o(c0559a, "EOF", 0, null, 6);
            throw null;
        }
        if (str.charAt(B) == '\"') {
            B++;
            z4 = true;
        } else {
            z4 = false;
        }
        int A4 = c0559a.A(B);
        if (A4 >= str.length() || A4 == -1) {
            C0559a.o(c0559a, "EOF", 0, null, 6);
            throw null;
        }
        int i2 = A4 + 1;
        int charAt = str.charAt(A4) | ' ';
        if (charAt == 102) {
            c0559a.d(i2, "alse");
            z5 = false;
        } else {
            if (charAt != 116) {
                C0559a.o(c0559a, "Expected valid boolean literal prefix, but had '" + c0559a.k() + '\'', 0, null, 6);
                throw null;
            }
            c0559a.d(i2, "rue");
            z5 = true;
        }
        if (z4) {
            if (c0559a.f6165b == str.length()) {
                C0559a.o(c0559a, "EOF", 0, null, 6);
                throw null;
            }
            if (str.charAt(c0559a.f6165b) != '\"') {
                C0559a.o(c0559a, "Expected closing quotation mark", 0, null, 6);
                throw null;
            }
            c0559a.f6165b++;
        }
        return z5;
    }

    @Override // u3.l, kotlinx.serialization.encoding.Decoder
    public final int l() {
        C0559a c0559a = this.f7470l;
        long i2 = c0559a.i();
        int i4 = (int) i2;
        if (i2 == i4) {
            return i4;
        }
        C0559a.o(c0559a, "Failed to parse int for input '" + i2 + '\'', 0, null, 6);
        throw null;
    }

    @Override // u3.l, kotlinx.serialization.encoding.Decoder
    public final boolean m() {
        f fVar = this.f7475q;
        return ((fVar != null ? fVar.f7439b : false) || this.f7470l.D(true)) ? false : true;
    }

    @Override // h3.a
    public final A0.q n() {
        return this.f7471m;
    }

    @Override // u3.l, kotlinx.serialization.encoding.Decoder
    public final char p() {
        C0559a c0559a = this.f7470l;
        String k4 = c0559a.k();
        if (k4.length() == 1) {
            return k4.charAt(0);
        }
        C0559a.o(c0559a, "Expected single char, but got '" + k4 + '\'', 0, null, 6);
        throw null;
    }

    @Override // u3.l, kotlinx.serialization.encoding.Decoder
    public final byte r() {
        C0559a c0559a = this.f7470l;
        long i2 = c0559a.i();
        byte b4 = (byte) i2;
        if (i2 == b4) {
            return b4;
        }
        C0559a.o(c0559a, "Failed to parse byte for input '" + i2 + '\'', 0, null, 6);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:143:0x012c, code lost:
    
        r1 = r12.f7438a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0130, code lost:
    
        if (r10 >= 64) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0132, code lost:
    
        r1.f7108c |= 1 << r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x013a, code lost:
    
        r3 = (r10 >>> 6) - 1;
        r1 = r1.f7109d;
        r1[r3] = r1[r3] | (1 << (r10 & 63));
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x016a, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, "key");
        r4.n(kotlin.text.y.y(6, r7.subSequence(0, r4.f6165b).toString(), r8), "Encountered an unknown key '" + r8 + '\'', "Use 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0198, code lost:
    
        throw null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01b1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x023e A[EDGE_INSN: B:99:0x023e->B:85:0x023e BREAK  A[LOOP:1: B:89:0x01b1->B:101:0x01b1], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v8 */
    @Override // h3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int s(SerialDescriptor descriptor) {
        int k4;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        char c4;
        ?? r10;
        String z8;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        u uVar = this.f7469k;
        int ordinal = uVar.ordinal();
        C0559a c0559a = this.f7470l;
        boolean z9 = true;
        int i2 = 0;
        r7 = false;
        boolean z10 = false;
        char c5 = ':';
        AbstractC0724c abstractC0724c = this.f7468j;
        int i4 = -1;
        C0016l c0016l = (C0016l) c0559a.f6166c;
        if (ordinal == 0) {
            boolean C3 = c0559a.C();
            while (true) {
                boolean b4 = c0559a.b();
                f fVar = this.f7475q;
                if (b4) {
                    j3.j jVar = this.f7474p;
                    boolean z11 = jVar.f7200c;
                    String key = z11 ? c0559a.l() : c0559a.e();
                    c0559a.h(c5);
                    k4 = h.k(descriptor, abstractC0724c, key);
                    if (k4 == -3) {
                        z4 = false;
                        z5 = true;
                    } else {
                        if (!jVar.f7205h) {
                            break;
                        }
                        boolean j4 = descriptor.j(k4);
                        SerialDescriptor h4 = descriptor.h(k4);
                        if (!j4 || h4.f() || !c0559a.D(z9)) {
                            if (!Intrinsics.a(h4.i(), g3.h.f6806h) || ((h4.f() && c0559a.D(false)) || (z8 = c0559a.z(z11)) == null)) {
                                break;
                            }
                            int k5 = h.k(h4, abstractC0724c, z8);
                            boolean z12 = !abstractC0724c.f7173a.f7203f && h4.f();
                            if (k5 != -3 || (!j4 && !z12)) {
                                break;
                            }
                            c0559a.j();
                        }
                        z4 = c0559a.C();
                        z5 = false;
                    }
                    if (z5) {
                        boolean z13 = jVar.f7199b;
                        String str = (String) c0559a.f6169f;
                        if (!z13) {
                            b3.t tVar = this.f7473o;
                            if (tVar == null || !Intrinsics.a(tVar.f5689e, key)) {
                                break;
                            }
                            tVar.f5689e = null;
                        }
                        ArrayList arrayList = new ArrayList();
                        byte y4 = c0559a.y();
                        if (y4 == 8 || y4 == 6) {
                            while (true) {
                                byte y5 = c0559a.y();
                                z6 = true;
                                if (y5 != 1) {
                                    if (y5 == 8) {
                                        z7 = false;
                                        c4 = 6;
                                    } else if (y5 == 6) {
                                        c4 = 6;
                                        z7 = false;
                                    } else {
                                        if (y5 == 9) {
                                            if (((Number) C1403G.x(arrayList)).byteValue() != 8) {
                                                throw h.d(c0559a.f6165b, "found ] instead of } at path: " + c0016l, str);
                                            }
                                            C1400D.n(arrayList);
                                        } else if (y5 == 7) {
                                            if (((Number) C1403G.x(arrayList)).byteValue() != 6) {
                                                throw h.d(c0559a.f6165b, "found } instead of ] at path: " + c0016l, str);
                                            }
                                            C1400D.n(arrayList);
                                        } else if (y5 == 10) {
                                            C0559a.o(c0559a, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6);
                                            throw null;
                                        }
                                        r10 = false;
                                        c4 = 6;
                                        c0559a.f();
                                        if (arrayList.size() != 0) {
                                            break;
                                        }
                                    }
                                    arrayList.add(Byte.valueOf(y5));
                                    r10 = z7;
                                    c0559a.f();
                                    if (arrayList.size() != 0) {
                                    }
                                } else if (z11) {
                                    c0559a.k();
                                } else {
                                    c0559a.e();
                                }
                            }
                        } else {
                            c0559a.k();
                            z6 = true;
                            r10 = false;
                            c4 = 6;
                        }
                        C3 = c0559a.C();
                        z9 = z6;
                        i2 = r10;
                    } else {
                        C3 = z4;
                        z9 = true;
                        i2 = 0;
                    }
                    c5 = ':';
                } else {
                    int i5 = i2;
                    if (C3 && !abstractC0724c.f7173a.f7211n) {
                        h.l(c0559a, "object");
                        throw null;
                    }
                    if (fVar != null) {
                        C0697s c0697s = fVar.f7438a;
                        SerialDescriptor serialDescriptor = c0697s.f7106a;
                        int l4 = serialDescriptor.l();
                        while (true) {
                            long j5 = c0697s.f7108c;
                            long j6 = -1;
                            e eVar = c0697s.f7107b;
                            if (j5 != -1) {
                                int numberOfTrailingZeros = Long.numberOfTrailingZeros(~j5);
                                c0697s.f7108c |= 1 << numberOfTrailingZeros;
                                if (((Boolean) eVar.h(serialDescriptor, Integer.valueOf(numberOfTrailingZeros))).booleanValue()) {
                                    i4 = numberOfTrailingZeros;
                                    break;
                                }
                            } else if (l4 > 64) {
                                long[] jArr = c0697s.f7109d;
                                int length = jArr.length;
                                loop3: while (i5 < length) {
                                    int i6 = i5 + 1;
                                    int i7 = i6 * 64;
                                    long j7 = jArr[i5];
                                    while (j7 != j6) {
                                        int numberOfTrailingZeros2 = Long.numberOfTrailingZeros(~j7);
                                        j7 |= 1 << numberOfTrailingZeros2;
                                        int i8 = numberOfTrailingZeros2 + i7;
                                        if (((Boolean) eVar.h(serialDescriptor, Integer.valueOf(i8))).booleanValue()) {
                                            jArr[i5] = j7;
                                            i4 = i8;
                                            break loop3;
                                        }
                                        j6 = -1;
                                    }
                                    jArr[i5] = j7;
                                    i5 = i6;
                                    j6 = -1;
                                }
                            }
                        }
                    }
                    i4 = -1;
                }
            }
            i4 = k4;
        } else if (ordinal != 2) {
            boolean C4 = c0559a.C();
            if (c0559a.b()) {
                int i9 = this.f7472n;
                if (i9 != -1 && !C4) {
                    C0559a.o(c0559a, "Expected end of the array or comma", 0, null, 6);
                    throw null;
                }
                i4 = i9 + 1;
                this.f7472n = i4;
            } else if (C4 && !abstractC0724c.f7173a.f7211n) {
                h.l(c0559a, "array");
                throw null;
            }
        } else {
            int i10 = this.f7472n;
            boolean z14 = i10 % 2 != 0;
            if (!z14) {
                c0559a.h(':');
            } else if (i10 != -1) {
                z10 = c0559a.C();
            }
            if (c0559a.b()) {
                if (z14) {
                    if (this.f7472n == -1) {
                        int i11 = c0559a.f6165b;
                        if (z10) {
                            C0559a.o(c0559a, "Unexpected leading comma", i11, null, 4);
                            throw null;
                        }
                    } else {
                        int i12 = c0559a.f6165b;
                        if (!z10) {
                            C0559a.o(c0559a, "Expected comma after the key-value pair", i12, null, 4);
                            throw null;
                        }
                    }
                }
                i4 = this.f7472n + 1;
                this.f7472n = i4;
            } else if (z10 && !abstractC0724c.f7173a.f7211n) {
                h.l(c0559a, "object");
                throw null;
            }
        }
        if (uVar != u.f7480k) {
            ((int[]) c0016l.f165d)[c0016l.f163b] = i4;
        }
        return i4;
    }

    @Override // u3.l, kotlinx.serialization.encoding.Decoder
    public final short t() {
        C0559a c0559a = this.f7470l;
        long i2 = c0559a.i();
        short s4 = (short) i2;
        if (i2 == s4) {
            return s4;
        }
        C0559a.o(c0559a, "Failed to parse short for input '" + i2 + '\'', 0, null, 6);
        throw null;
    }

    @Override // u3.l, kotlinx.serialization.encoding.Decoder
    public final String u() {
        boolean z4 = this.f7474p.f7200c;
        C0559a c0559a = this.f7470l;
        return z4 ? c0559a.l() : c0559a.j();
    }

    @Override // u3.l, kotlinx.serialization.encoding.Decoder
    public final float v() {
        C0559a c0559a = this.f7470l;
        String k4 = c0559a.k();
        try {
            float parseFloat = Float.parseFloat(k4);
            if (this.f7468j.f7173a.f7208k || !(Float.isInfinite(parseFloat) || Float.isNaN(parseFloat))) {
                return parseFloat;
            }
            h.p(c0559a, Float.valueOf(parseFloat));
            throw null;
        } catch (IllegalArgumentException unused) {
            C0559a.o(c0559a, "Failed to parse type 'float' for input '" + k4 + '\'', 0, null, 6);
            throw null;
        }
    }
}
