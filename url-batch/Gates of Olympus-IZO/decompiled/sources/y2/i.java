package y2;

import M1.r;
import e2.AbstractC0381e;
import f.AbstractC0382a;
import h2.AbstractC0447i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import k.C0523b;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import t.u;
import u0.C0986n;
import w2.C1039s;
import x2.A;
import x2.t;
import x2.w;

/* loaded from: classes.dex */
public final class i extends g2.i implements Decoder, v2.a {

    /* renamed from: a, reason: collision with root package name */
    public final x2.c f8849a;

    /* renamed from: b, reason: collision with root package name */
    public final m f8850b;

    /* renamed from: c, reason: collision with root package name */
    public final u f8851c;

    /* renamed from: d, reason: collision with root package name */
    public final C0523b f8852d;

    /* renamed from: e, reason: collision with root package name */
    public int f8853e;

    /* renamed from: f, reason: collision with root package name */
    public final x2.i f8854f;

    /* renamed from: g, reason: collision with root package name */
    public final d f8855g;

    public i(x2.c cVar, m mVar, u uVar, SerialDescriptor serialDescriptor) {
        Z1.i.f(cVar, "json");
        Z1.i.f(serialDescriptor, "descriptor");
        this.f8849a = cVar;
        this.f8850b = mVar;
        this.f8851c = uVar;
        this.f8852d = cVar.f8733b;
        this.f8853e = -1;
        x2.i iVar = cVar.f8732a;
        this.f8854f = iVar;
        this.f8855g = iVar.f8745f ? null : new d(serialDescriptor);
    }

    @Override // g2.i, kotlinx.serialization.encoding.Decoder
    public final double A() {
        u uVar = this.f8851c;
        String j3 = uVar.j();
        try {
            double parseDouble = Double.parseDouble(j3);
            if (this.f8849a.f8732a.f8750k || !(Double.isInfinite(parseDouble) || Double.isNaN(parseDouble))) {
                return parseDouble;
            }
            e.j(uVar, Double.valueOf(parseDouble));
            throw null;
        } catch (IllegalArgumentException unused) {
            u.n(uVar, "Failed to parse type 'double' for input '" + j3 + '\'', 0, null, 6);
            throw null;
        }
    }

    @Override // g2.i, kotlinx.serialization.encoding.Decoder
    public final v2.a a(SerialDescriptor serialDescriptor) {
        m mVar;
        Z1.i.f(serialDescriptor, "descriptor");
        x2.c cVar = this.f8849a;
        Z1.i.f(cVar, "<this>");
        AbstractC0381e i3 = serialDescriptor.i();
        boolean z3 = i3 instanceof u2.c;
        x2.i iVar = cVar.f8732a;
        if (z3) {
            mVar = m.f8861i;
        } else if (Z1.i.a(i3, u2.h.f8551c)) {
            mVar = m.f8859g;
        } else if (Z1.i.a(i3, u2.h.f8552d)) {
            SerialDescriptor c3 = e.c(serialDescriptor.h(0), cVar.f8733b);
            AbstractC0381e i4 = c3.i();
            if ((i4 instanceof u2.e) || Z1.i.a(i4, u2.g.f8549c)) {
                mVar = m.f8860h;
            } else {
                if (!iVar.f8743d) {
                    String str = "Value of type '" + c3.d() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + c3.i() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.";
                    Z1.i.f(str, "message");
                    throw new c(str);
                }
                mVar = m.f8859g;
            }
        } else {
            mVar = m.f8858f;
        }
        u uVar = this.f8851c;
        F2.h hVar = (F2.h) uVar.f7672c;
        int i5 = hVar.f1502e + 1;
        hVar.f1502e = i5;
        Object[] objArr = (Object[]) hVar.f1503f;
        if (i5 == objArr.length) {
            int i6 = i5 * 2;
            Object[] copyOf = Arrays.copyOf(objArr, i6);
            Z1.i.e(copyOf, "copyOf(...)");
            hVar.f1503f = copyOf;
            int[] copyOf2 = Arrays.copyOf((int[]) hVar.f1504g, i6);
            Z1.i.e(copyOf2, "copyOf(...)");
            hVar.f1504g = copyOf2;
        }
        ((Object[]) hVar.f1503f)[i5] = serialDescriptor;
        uVar.g(mVar.f8863d);
        if (uVar.u() != 4) {
            int ordinal = mVar.ordinal();
            return (ordinal == 1 || ordinal == 2 || ordinal == 3) ? new i(cVar, mVar, uVar, serialDescriptor) : (this.f8850b == mVar && iVar.f8745f) ? this : new i(cVar, mVar, uVar, serialDescriptor);
        }
        u.n(uVar, "Unexpected leading comma", 0, null, 6);
        throw null;
    }

    public final x2.k a0() {
        return new E2.b(this.f8849a.f8732a, this.f8851c).c();
    }

    @Override // g2.i, kotlinx.serialization.encoding.Decoder
    public final Decoder c(SerialDescriptor serialDescriptor) {
        Z1.i.f(serialDescriptor, "descriptor");
        LinkedHashSet linkedHashSet = j.f8856a;
        return (serialDescriptor.b() && j.f8856a.contains(serialDescriptor)) ? new b(this.f8851c, this.f8849a) : this;
    }

    @Override // g2.i, kotlinx.serialization.encoding.Decoder
    public final long d() {
        return this.f8851c.h();
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012c  */
    @Override // g2.i, kotlinx.serialization.encoding.Decoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(KSerializer kSerializer) {
        String message;
        String str;
        x2.c cVar = this.f8849a;
        u uVar = this.f8851c;
        F2.h hVar = (F2.h) uVar.f7672c;
        Z1.i.f(kSerializer, "deserializer");
        try {
        } catch (t2.a e3) {
            message = e3.getMessage();
            Z1.i.c(message);
            if (!AbstractC0447i.l0(message, "at path")) {
            }
        }
        if ((kSerializer instanceof t2.b) && !cVar.f8732a.f8748i) {
            String t3 = uVar.t(e.e(((t2.b) kSerializer).getDescriptor(), cVar), this.f8854f.f8742c);
            if (t3 != null) {
                try {
                    AbstractC0382a.j((t2.b) kSerializer, this, t3);
                    throw null;
                } catch (t2.c e4) {
                    String message2 = e4.getMessage();
                    Z1.i.c(message2);
                    int q0 = AbstractC0447i.q0(message2, '\n', 0, false, 6);
                    if (q0 != -1) {
                        message2 = message2.substring(0, q0);
                        Z1.i.e(message2, "substring(...)");
                    }
                    String A02 = AbstractC0447i.A0(message2, ".");
                    String message3 = e4.getMessage();
                    Z1.i.c(message3);
                    u.n(uVar, A02, 0, AbstractC0447i.D0(message3, '\n', ""), 2);
                    throw null;
                }
            }
            if ((kSerializer instanceof t2.b) && !cVar.f8732a.f8748i) {
                String e5 = e.e(((t2.b) kSerializer).getDescriptor(), cVar);
                x2.k a02 = a0();
                String d3 = ((t2.b) kSerializer).getDescriptor().d();
                if (!(a02 instanceof w)) {
                    throw e.a(-1, "Expected " + Z1.u.a(w.class).b() + ", but had " + Z1.u.a(a02.getClass()).b() + " as the serialized body of " + d3 + " at element: " + hVar.g(), a02.toString());
                }
                w wVar = (w) a02;
                x2.k kVar = (x2.k) wVar.get((Object) e5);
                try {
                    if (kVar != null) {
                        A a3 = x2.l.a(kVar);
                        if (!(a3 instanceof t)) {
                            str = a3.getContent();
                            AbstractC0382a.j((t2.b) kSerializer, this, str);
                            throw null;
                        }
                    }
                    AbstractC0382a.j((t2.b) kSerializer, this, str);
                    throw null;
                } catch (t2.c e6) {
                    String message4 = e6.getMessage();
                    Z1.i.c(message4);
                    throw e.a(-1, message4, wVar.toString());
                }
                str = null;
            }
            return kSerializer.deserialize(this);
            message = e3.getMessage();
            Z1.i.c(message);
            if (!AbstractC0447i.l0(message, "at path")) {
                throw e3;
            }
            throw new t2.a(e3.f7994d, e3.getMessage() + " at path: " + hVar.g(), e3);
        }
        return kSerializer.deserialize(this);
    }

    @Override // g2.i, v2.a
    public final Object i(SerialDescriptor serialDescriptor, int i3, KSerializer kSerializer, Object obj) {
        Z1.i.f(serialDescriptor, "descriptor");
        Z1.i.f(kSerializer, "deserializer");
        boolean z3 = this.f8850b == m.f8860h && (i3 & 1) == 0;
        F2.h hVar = (F2.h) this.f8851c.f7672c;
        if (z3) {
            int[] iArr = (int[]) hVar.f1504g;
            int i4 = hVar.f1502e;
            if (iArr[i4] == -2) {
                ((Object[]) hVar.f1503f)[i4] = f.f8838a;
            }
        }
        Object i5 = super.i(serialDescriptor, i3, kSerializer, obj);
        if (z3) {
            int[] iArr2 = (int[]) hVar.f1504g;
            int i6 = hVar.f1502e;
            if (iArr2[i6] != -2) {
                int i7 = i6 + 1;
                hVar.f1502e = i7;
                Object[] objArr = (Object[]) hVar.f1503f;
                if (i7 == objArr.length) {
                    int i8 = i7 * 2;
                    Object[] copyOf = Arrays.copyOf(objArr, i8);
                    Z1.i.e(copyOf, "copyOf(...)");
                    hVar.f1503f = copyOf;
                    int[] copyOf2 = Arrays.copyOf((int[]) hVar.f1504g, i8);
                    Z1.i.e(copyOf2, "copyOf(...)");
                    hVar.f1504g = copyOf2;
                }
            }
            Object[] objArr2 = (Object[]) hVar.f1503f;
            int i9 = hVar.f1502e;
            objArr2[i9] = i5;
            ((int[]) hVar.f1504g)[i9] = -2;
        }
        return i5;
    }

    @Override // g2.i, kotlinx.serialization.encoding.Decoder
    public final boolean k() {
        boolean z3;
        boolean z4;
        u uVar = this.f8851c;
        int x3 = uVar.x();
        String str = (String) uVar.f7675f;
        if (x3 == str.length()) {
            u.n(uVar, "EOF", 0, null, 6);
            throw null;
        }
        if (str.charAt(x3) == '\"') {
            x3++;
            z3 = true;
        } else {
            z3 = false;
        }
        int w3 = uVar.w(x3);
        if (w3 >= str.length() || w3 == -1) {
            u.n(uVar, "EOF", 0, null, 6);
            throw null;
        }
        int i3 = w3 + 1;
        int charAt = str.charAt(w3) | ' ';
        if (charAt == 102) {
            uVar.c("alse", i3);
            z4 = false;
        } else {
            if (charAt != 116) {
                u.n(uVar, "Expected valid boolean literal prefix, but had '" + uVar.j() + '\'', 0, null, 6);
                throw null;
            }
            uVar.c("rue", i3);
            z4 = true;
        }
        if (z3) {
            if (uVar.f7671b == str.length()) {
                u.n(uVar, "EOF", 0, null, 6);
                throw null;
            }
            if (str.charAt(uVar.f7671b) != '\"') {
                u.n(uVar, "Expected closing quotation mark", 0, null, 6);
                throw null;
            }
            uVar.f7671b++;
        }
        return z4;
    }

    @Override // g2.i, kotlinx.serialization.encoding.Decoder
    public final int l() {
        u uVar = this.f8851c;
        long h3 = uVar.h();
        int i3 = (int) h3;
        if (h3 == i3) {
            return i3;
        }
        u.n(uVar, "Failed to parse int for input '" + h3 + '\'', 0, null, 6);
        throw null;
    }

    @Override // g2.i, kotlinx.serialization.encoding.Decoder
    public final boolean m() {
        d dVar = this.f8855g;
        return ((dVar != null ? dVar.f8836b : false) || this.f8851c.A(true)) ? false : true;
    }

    @Override // v2.a
    public final C0523b o() {
        return this.f8852d;
    }

    @Override // g2.i, kotlinx.serialization.encoding.Decoder
    public final char p() {
        u uVar = this.f8851c;
        String j3 = uVar.j();
        if (j3.length() == 1) {
            return j3.charAt(0);
        }
        u.n(uVar, "Expected single char, but got '" + j3 + '\'', 0, null, 6);
        throw null;
    }

    @Override // g2.i, kotlinx.serialization.encoding.Decoder
    public final byte q() {
        u uVar = this.f8851c;
        long h3 = uVar.h();
        byte b2 = (byte) h3;
        if (h3 == b2) {
            return b2;
        }
        u.n(uVar, "Failed to parse byte for input '" + h3 + '\'', 0, null, 6);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x012c, code lost:
    
        r1 = r12.f8835a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0130, code lost:
    
        if (r10 >= 64) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0132, code lost:
    
        r1.f8699c |= 1 << r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x013a, code lost:
    
        r3 = (r10 >>> 6) - 1;
        r1 = r1.f8700d;
        r1[r3] = r1[r3] | (1 << (r10 & 63));
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int s(SerialDescriptor serialDescriptor) {
        int g3;
        boolean z3;
        boolean z4;
        boolean z5;
        String v3;
        Z1.i.f(serialDescriptor, "descriptor");
        m mVar = this.f8850b;
        int ordinal = mVar.ordinal();
        u uVar = this.f8851c;
        boolean z6 = true;
        int i3 = 0;
        r7 = false;
        boolean z7 = false;
        Throwable th = null;
        char c3 = ':';
        x2.c cVar = this.f8849a;
        int i4 = -1;
        F2.h hVar = (F2.h) uVar.f7672c;
        if (ordinal == 0) {
            boolean z8 = uVar.z();
            while (true) {
                boolean b2 = uVar.b();
                d dVar = this.f8855g;
                if (b2) {
                    x2.i iVar = this.f8854f;
                    boolean z9 = iVar.f8742c;
                    String k3 = z9 ? uVar.k() : uVar.d();
                    uVar.g(c3);
                    g3 = e.g(serialDescriptor, cVar, k3);
                    if (g3 == -3) {
                        z3 = false;
                        z4 = true;
                    } else {
                        if (!iVar.f8747h) {
                            break;
                        }
                        boolean j3 = serialDescriptor.j(g3);
                        SerialDescriptor h3 = serialDescriptor.h(g3);
                        if (!j3 || h3.f() || !uVar.A(z6)) {
                            if (!Z1.i.a(h3.i(), u2.g.f8549c) || ((h3.f() && uVar.A(false)) || (v3 = uVar.v(z9)) == null)) {
                                break;
                            }
                            int g4 = e.g(h3, cVar, v3);
                            boolean z10 = !cVar.f8732a.f8745f && h3.f();
                            if (g4 != -3 || (!j3 && !z10)) {
                                break;
                            }
                            uVar.i();
                        }
                        z3 = uVar.z();
                        z4 = false;
                    }
                    if (z4) {
                        boolean z11 = iVar.f8741b;
                        String str = (String) uVar.f7675f;
                        if (!z11) {
                            uVar.m("Encountered an unknown key '" + k3 + '\'', AbstractC0447i.w0(str.subSequence(0, uVar.f7671b).toString(), 6, k3), "Use 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.");
                            throw null;
                        }
                        ArrayList arrayList = new ArrayList();
                        byte u3 = uVar.u();
                        if (u3 == 8 || u3 == 6) {
                            while (true) {
                                byte u4 = uVar.u();
                                z5 = true;
                                if (u4 != 1) {
                                    if (u4 == 8 || u4 == 6) {
                                        arrayList.add(Byte.valueOf(u4));
                                    } else if (u4 == 9) {
                                        if (((Number) M1.l.s0(arrayList)).byteValue() != 8) {
                                            throw e.a(uVar.f7671b, "found ] instead of } at path: " + hVar, str);
                                        }
                                        r.k0(arrayList);
                                    } else if (u4 == 7) {
                                        if (((Number) M1.l.s0(arrayList)).byteValue() != 6) {
                                            throw e.a(uVar.f7671b, "found } instead of ] at path: " + hVar, str);
                                        }
                                        r.k0(arrayList);
                                    } else if (u4 == 10) {
                                        u.n(uVar, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6);
                                        throw null;
                                    }
                                    uVar.e();
                                    if (arrayList.size() == 0) {
                                        break;
                                    }
                                } else if (z9) {
                                    uVar.j();
                                } else {
                                    uVar.d();
                                }
                            }
                        } else {
                            uVar.j();
                            z5 = true;
                        }
                        z8 = uVar.z();
                        z6 = z5;
                    } else {
                        z8 = z3;
                        z6 = true;
                    }
                    i3 = 0;
                    th = null;
                    c3 = ':';
                } else {
                    if (z8 && !cVar.f8732a.f8753n) {
                        e.h(uVar, "object");
                        throw th;
                    }
                    if (dVar != null) {
                        C1039s c1039s = dVar.f8835a;
                        SerialDescriptor serialDescriptor2 = c1039s.f8697a;
                        int l3 = serialDescriptor2.l();
                        while (true) {
                            long j4 = c1039s.f8699c;
                            long j5 = -1;
                            C0986n c0986n = c1039s.f8698b;
                            if (j4 != -1) {
                                int numberOfTrailingZeros = Long.numberOfTrailingZeros(~j4);
                                c1039s.f8699c |= 1 << numberOfTrailingZeros;
                                if (((Boolean) c0986n.g(serialDescriptor2, Integer.valueOf(numberOfTrailingZeros))).booleanValue()) {
                                    i4 = numberOfTrailingZeros;
                                    break;
                                }
                            } else if (l3 > 64) {
                                long[] jArr = c1039s.f8700d;
                                int length = jArr.length;
                                loop3: while (i3 < length) {
                                    int i5 = i3 + 1;
                                    int i6 = i5 * 64;
                                    long j6 = jArr[i3];
                                    while (j6 != j5) {
                                        int numberOfTrailingZeros2 = Long.numberOfTrailingZeros(~j6);
                                        j6 |= 1 << numberOfTrailingZeros2;
                                        int i7 = numberOfTrailingZeros2 + i6;
                                        if (((Boolean) c0986n.g(serialDescriptor2, Integer.valueOf(i7))).booleanValue()) {
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
            boolean z12 = uVar.z();
            if (uVar.b()) {
                int i8 = this.f8853e;
                if (i8 != -1 && !z12) {
                    u.n(uVar, "Expected end of the array or comma", 0, null, 6);
                    throw null;
                }
                i4 = i8 + 1;
                this.f8853e = i4;
            } else if (z12 && !cVar.f8732a.f8753n) {
                e.h(uVar, "array");
                throw null;
            }
        } else {
            int i9 = this.f8853e;
            Object[] objArr = i9 % 2 != 0;
            if (objArr != true) {
                uVar.g(':');
            } else if (i9 != -1) {
                z7 = uVar.z();
            }
            if (uVar.b()) {
                if (objArr != false) {
                    if (this.f8853e == -1) {
                        int i10 = uVar.f7671b;
                        if (z7) {
                            u.n(uVar, "Unexpected leading comma", i10, null, 4);
                            throw null;
                        }
                    } else {
                        int i11 = uVar.f7671b;
                        if (!z7) {
                            u.n(uVar, "Expected comma after the key-value pair", i11, null, 4);
                            throw null;
                        }
                    }
                }
                i4 = this.f8853e + 1;
                this.f8853e = i4;
            } else if (z7 && !cVar.f8732a.f8753n) {
                e.h(uVar, "object");
                throw null;
            }
        }
        if (mVar != m.f8860h) {
            ((int[]) hVar.f1504g)[hVar.f1502e] = i4;
        }
        return i4;
    }

    @Override // g2.i, kotlinx.serialization.encoding.Decoder
    public final short t() {
        u uVar = this.f8851c;
        long h3 = uVar.h();
        short s3 = (short) h3;
        if (h3 == s3) {
            return s3;
        }
        u.n(uVar, "Failed to parse short for input '" + h3 + '\'', 0, null, 6);
        throw null;
    }

    @Override // g2.i, kotlinx.serialization.encoding.Decoder
    public final String u() {
        boolean z3 = this.f8854f.f8742c;
        u uVar = this.f8851c;
        return z3 ? uVar.k() : uVar.i();
    }

    @Override // g2.i, kotlinx.serialization.encoding.Decoder
    public final float v() {
        u uVar = this.f8851c;
        String j3 = uVar.j();
        try {
            float parseFloat = Float.parseFloat(j3);
            if (this.f8849a.f8732a.f8750k || !(Float.isInfinite(parseFloat) || Float.isNaN(parseFloat))) {
                return parseFloat;
            }
            e.j(uVar, Float.valueOf(parseFloat));
            throw null;
        } catch (IllegalArgumentException unused) {
            u.n(uVar, "Failed to parse type 'float' for input '" + j3 + '\'', 0, null, 6);
            throw null;
        }
    }

    @Override // g2.i, v2.a
    public final void z(SerialDescriptor serialDescriptor) {
        Z1.i.f(serialDescriptor, "descriptor");
        x2.c cVar = this.f8849a;
        if (cVar.f8732a.f8741b && serialDescriptor.l() == 0) {
            while (s(serialDescriptor) != -1) {
            }
        }
        u uVar = this.f8851c;
        if (uVar.z() && !cVar.f8732a.f8753n) {
            e.h(uVar, "");
            throw null;
        }
        uVar.g(this.f8850b.f8864e);
        F2.h hVar = (F2.h) uVar.f7672c;
        int i3 = hVar.f1502e;
        int[] iArr = (int[]) hVar.f1504g;
        if (iArr[i3] == -2) {
            iArr[i3] = -1;
            hVar.f1502e = i3 - 1;
        }
        int i4 = hVar.f1502e;
        if (i4 != -1) {
            hVar.f1502e = i4 - 1;
        }
    }
}
