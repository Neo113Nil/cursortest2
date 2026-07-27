package R4;

import Q4.AbstractC0149c;
import g4.AbstractC0465j;
import g4.AbstractC0466k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class r extends K1.b implements O4.b, O4.a {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0149c f2705a;

    /* renamed from: b, reason: collision with root package name */
    public final w f2706b;

    /* renamed from: c, reason: collision with root package name */
    public final u f2707c;

    /* renamed from: d, reason: collision with root package name */
    public int f2708d;

    /* renamed from: e, reason: collision with root package name */
    public final Q4.j f2709e;

    /* renamed from: f, reason: collision with root package name */
    public final k f2710f;

    public r(AbstractC0149c json, w wVar, u uVar, N4.e descriptor) {
        kotlin.jvm.internal.i.e(json, "json");
        kotlin.jvm.internal.i.e(descriptor, "descriptor");
        this.f2705a = json;
        this.f2706b = wVar;
        this.f2707c = uVar;
        this.f2708d = -1;
        Q4.j jVar = json.f2501a;
        this.f2709e = jVar;
        this.f2710f = jVar.f2531f ? null : new k(descriptor);
    }

    @Override // K1.b
    public final Object Q(M4.a deserializer) {
        kotlin.jvm.internal.i.e(deserializer, "deserializer");
        try {
            return deserializer.a(this);
        } catch (M4.b e3) {
            String message = e3.getMessage();
            kotlin.jvm.internal.i.b(message);
            if (B4.k.R(message, "at path", false)) {
                throw e3;
            }
            String str = e3.getMessage() + " at path: " + ((B3.d) this.f2707c.f2721c).d();
            kotlin.jvm.internal.i.e(null, "missingFields");
            throw new M4.b(str, e3);
        }
    }

    @Override // K1.b, O4.a
    public final Object b(N4.e descriptor, int i2, M4.a deserializer, Object obj) {
        kotlin.jvm.internal.i.e(descriptor, "descriptor");
        kotlin.jvm.internal.i.e(deserializer, "deserializer");
        boolean z = this.f2706b == w.f2729e && (i2 & 1) == 0;
        B3.d dVar = (B3.d) this.f2707c.f2721c;
        if (z) {
            int[] iArr = (int[]) dVar.f278d;
            int i3 = dVar.f276b;
            if (iArr[i3] == -2) {
                ((Object[]) dVar.f277c)[i3] = n.f2689a;
            }
        }
        Object b6 = super.b(descriptor, i2, deserializer, obj);
        if (z) {
            int[] iArr2 = (int[]) dVar.f278d;
            int i6 = dVar.f276b;
            if (iArr2[i6] != -2) {
                int i7 = i6 + 1;
                dVar.f276b = i7;
                Object[] objArr = (Object[]) dVar.f277c;
                if (i7 == objArr.length) {
                    int i8 = i7 * 2;
                    Object[] copyOf = Arrays.copyOf(objArr, i8);
                    kotlin.jvm.internal.i.d(copyOf, "copyOf(...)");
                    dVar.f277c = copyOf;
                    int[] copyOf2 = Arrays.copyOf((int[]) dVar.f278d, i8);
                    kotlin.jvm.internal.i.d(copyOf2, "copyOf(...)");
                    dVar.f278d = copyOf2;
                }
            }
            Object[] objArr2 = (Object[]) dVar.f277c;
            int i9 = dVar.f276b;
            objArr2[i9] = b6;
            ((int[]) dVar.f278d)[i9] = -2;
        }
        return b6;
    }

    @Override // K1.b, O4.b
    public final long c() {
        return this.f2707c.h();
    }

    @Override // K1.b, O4.b
    public final boolean d() {
        boolean z;
        boolean z5;
        u uVar = this.f2707c;
        int s2 = uVar.s();
        String str = (String) uVar.f2723e;
        if (s2 == str.length()) {
            u.n(uVar, "EOF", 0, null, 6);
            throw null;
        }
        if (str.charAt(s2) == '\"') {
            s2++;
            z = true;
        } else {
            z = false;
        }
        int r5 = uVar.r(s2);
        if (r5 >= str.length() || r5 == -1) {
            u.n(uVar, "EOF", 0, null, 6);
            throw null;
        }
        int i2 = r5 + 1;
        int charAt = str.charAt(r5) | ' ';
        if (charAt == 102) {
            uVar.c(i2, "alse");
            z5 = false;
        } else {
            if (charAt != 116) {
                u.n(uVar, "Expected valid boolean literal prefix, but had '" + uVar.j() + '\'', 0, null, 6);
                throw null;
            }
            uVar.c(i2, "rue");
            z5 = true;
        }
        if (z) {
            if (uVar.f2720b == str.length()) {
                u.n(uVar, "EOF", 0, null, 6);
                throw null;
            }
            if (str.charAt(uVar.f2720b) != '\"') {
                u.n(uVar, "Expected closing quotation mark", 0, null, 6);
                throw null;
            }
            uVar.f2720b++;
        }
        return z5;
    }

    @Override // K1.b, O4.b
    public final boolean e() {
        k kVar = this.f2710f;
        return ((kVar != null ? kVar.f2687b : false) || this.f2707c.u(true)) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x011f, code lost:
    
        if (r12 == null) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0121, code lost:
    
        r1 = r12.f2686a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0125, code lost:
    
        if (r10 >= 64) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0127, code lost:
    
        r1.f2395c |= 1 << r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x012f, code lost:
    
        r3 = (r10 >>> 6) - 1;
        r1 = r1.f2396d;
        r1[r3] = r1[r3] | (1 << (r10 & 63));
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x013e, code lost:
    
        r12 = r10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // O4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int g(N4.e descriptor) {
        boolean z;
        boolean z5;
        String i2;
        kotlin.jvm.internal.i.e(descriptor, "descriptor");
        w wVar = this.f2706b;
        int ordinal = wVar.ordinal();
        u uVar = this.f2707c;
        int i3 = 0;
        r7 = false;
        boolean z6 = false;
        Throwable th = null;
        char c2 = ':';
        AbstractC0149c abstractC0149c = this.f2705a;
        int i6 = -1;
        B3.d dVar = (B3.d) uVar.f2721c;
        if (ordinal == 0) {
            boolean t5 = uVar.t();
            while (true) {
                boolean b6 = uVar.b();
                k kVar = this.f2710f;
                if (b6) {
                    Q4.j jVar = this.f2709e;
                    boolean z7 = jVar.f2528c;
                    String k3 = z7 ? uVar.k() : uVar.d();
                    uVar.g(c2);
                    int g6 = m.g(descriptor, abstractC0149c, k3);
                    if (g6 == -3) {
                        z = true;
                        z5 = false;
                    } else {
                        if (!jVar.f2533h || !descriptor.i(g6)) {
                            break;
                        }
                        N4.e h3 = descriptor.h(g6);
                        h3.f();
                        if (!uVar.u(true)) {
                            if (!kotlin.jvm.internal.i.a(h3.c(), N4.i.f2189c)) {
                                break;
                            }
                            h3.f();
                            byte q5 = uVar.q();
                            if (z7) {
                                if (q5 == 1 || q5 == 0) {
                                    i2 = uVar.j();
                                    uVar.f2722d = i2;
                                }
                                i2 = null;
                            } else {
                                if (q5 == 1) {
                                    i2 = uVar.i();
                                    uVar.f2722d = i2;
                                }
                                i2 = null;
                            }
                            if (i2 == null || m.g(h3, abstractC0149c, i2) != -3) {
                                break;
                            }
                            uVar.i();
                        }
                        z5 = uVar.t();
                        z = false;
                    }
                    if (z) {
                        boolean z8 = jVar.f2527b;
                        String str = (String) uVar.f2723e;
                        if (!z8) {
                            uVar.m(B4.k.a0(6, str.subSequence(0, uVar.f2720b).toString(), k3), B0.o.j("Encountered an unknown key '", k3, '\''), "Use 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.");
                            throw null;
                        }
                        ArrayList arrayList = new ArrayList();
                        byte q6 = uVar.q();
                        if (q6 == 8 || q6 == 6) {
                            while (true) {
                                byte q7 = uVar.q();
                                if (q7 != 1) {
                                    if (q7 == 8 || q7 == 6) {
                                        arrayList.add(Byte.valueOf(q7));
                                    } else if (q7 == 9) {
                                        if (((Number) AbstractC0465j.L0(arrayList)).byteValue() != 8) {
                                            throw m.b(uVar.f2720b, "found ] instead of } at path: " + dVar, str);
                                        }
                                        if (arrayList.isEmpty()) {
                                            throw new NoSuchElementException("List is empty.");
                                        }
                                        arrayList.remove(AbstractC0466k.z0(arrayList));
                                    } else if (q7 == 7) {
                                        if (((Number) AbstractC0465j.L0(arrayList)).byteValue() != 6) {
                                            throw m.b(uVar.f2720b, "found } instead of ] at path: " + dVar, str);
                                        }
                                        if (arrayList.isEmpty()) {
                                            throw new NoSuchElementException("List is empty.");
                                        }
                                        arrayList.remove(AbstractC0466k.z0(arrayList));
                                    } else if (q7 == 10) {
                                        u.n(uVar, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6);
                                        throw null;
                                    }
                                    uVar.e();
                                    if (arrayList.size() == 0) {
                                        break;
                                    }
                                } else if (z7) {
                                    uVar.j();
                                } else {
                                    uVar.d();
                                }
                            }
                        } else {
                            uVar.j();
                        }
                        t5 = uVar.t();
                    } else {
                        t5 = z5;
                    }
                    i3 = 0;
                    th = null;
                    c2 = ':';
                } else {
                    Throwable th2 = th;
                    int i7 = i3;
                    if (t5 && !abstractC0149c.f2501a.f2539n) {
                        m.h(uVar, "object");
                        throw th2;
                    }
                    if (kVar != null) {
                        P4.r rVar = kVar.f2686a;
                        N4.e eVar = rVar.f2393a;
                        int d6 = eVar.d();
                        while (true) {
                            long j2 = rVar.f2395c;
                            long j6 = -1;
                            j jVar2 = rVar.f2394b;
                            if (j2 != -1) {
                                int numberOfTrailingZeros = Long.numberOfTrailingZeros(~j2);
                                rVar.f2395c |= 1 << numberOfTrailingZeros;
                                jVar2.invoke(eVar, Integer.valueOf(numberOfTrailingZeros));
                                if (Boolean.FALSE.booleanValue()) {
                                    i6 = numberOfTrailingZeros;
                                    break;
                                }
                            } else if (d6 > 64) {
                                long[] jArr = rVar.f2396d;
                                int length = jArr.length;
                                loop3: while (i7 < length) {
                                    int i8 = i7 + 1;
                                    int i9 = i8 * 64;
                                    long j7 = jArr[i7];
                                    while (j7 != j6) {
                                        int numberOfTrailingZeros2 = Long.numberOfTrailingZeros(~j7);
                                        j7 |= 1 << numberOfTrailingZeros2;
                                        int i10 = numberOfTrailingZeros2 + i9;
                                        jVar2.invoke(eVar, Integer.valueOf(i10));
                                        if (Boolean.FALSE.booleanValue()) {
                                            jArr[i7] = j7;
                                            i6 = i10;
                                            break loop3;
                                        }
                                        j6 = -1;
                                    }
                                    jArr[i7] = j7;
                                    i7 = i8;
                                    j6 = -1;
                                }
                            }
                        }
                    }
                    i6 = -1;
                }
            }
        } else if (ordinal != 2) {
            boolean t6 = uVar.t();
            if (uVar.b()) {
                int i11 = this.f2708d;
                if (i11 != -1 && !t6) {
                    u.n(uVar, "Expected end of the array or comma", 0, null, 6);
                    throw null;
                }
                i6 = i11 + 1;
                this.f2708d = i6;
            } else if (t6 && !abstractC0149c.f2501a.f2539n) {
                m.h(uVar, "array");
                throw null;
            }
        } else {
            int i12 = this.f2708d;
            Object[] objArr = i12 % 2 != 0;
            if (objArr != true) {
                uVar.g(':');
            } else if (i12 != -1) {
                z6 = uVar.t();
            }
            if (uVar.b()) {
                if (objArr != false) {
                    if (this.f2708d == -1) {
                        int i13 = uVar.f2720b;
                        if (z6) {
                            u.n(uVar, "Unexpected leading comma", i13, null, 4);
                            throw null;
                        }
                    } else {
                        int i14 = uVar.f2720b;
                        if (!z6) {
                            u.n(uVar, "Expected comma after the key-value pair", i14, null, 4);
                            throw null;
                        }
                    }
                }
                i6 = this.f2708d + 1;
                this.f2708d = i6;
            } else if (z6 && !abstractC0149c.f2501a.f2539n) {
                m.h(uVar, "object");
                throw null;
            }
        }
        if (wVar != w.f2729e) {
            ((int[]) dVar.f278d)[dVar.f276b] = i6;
        }
        return i6;
    }

    @Override // K1.b, O4.b
    public final char h() {
        u uVar = this.f2707c;
        String j2 = uVar.j();
        if (j2.length() == 1) {
            return j2.charAt(0);
        }
        u.n(uVar, B0.o.j("Expected single char, but got '", j2, '\''), 0, null, 6);
        throw null;
    }

    @Override // K1.b, O4.a
    public final void l(N4.e descriptor) {
        kotlin.jvm.internal.i.e(descriptor, "descriptor");
        AbstractC0149c abstractC0149c = this.f2705a;
        if (abstractC0149c.f2501a.f2527b && descriptor.d() == 0) {
            while (g(descriptor) != -1) {
            }
        }
        u uVar = this.f2707c;
        if (uVar.t() && !abstractC0149c.f2501a.f2539n) {
            m.h(uVar, "");
            throw null;
        }
        uVar.g(this.f2706b.f2734b);
        B3.d dVar = (B3.d) uVar.f2721c;
        int i2 = dVar.f276b;
        int[] iArr = (int[]) dVar.f278d;
        if (iArr[i2] == -2) {
            iArr[i2] = -1;
            dVar.f276b = i2 - 1;
        }
        int i3 = dVar.f276b;
        if (i3 != -1) {
            dVar.f276b = i3 - 1;
        }
    }

    @Override // K1.b, O4.b
    public final O4.b n(N4.e descriptor) {
        kotlin.jvm.internal.i.e(descriptor, "descriptor");
        return t.a(descriptor) ? new h(this.f2707c, this.f2705a) : this;
    }

    @Override // K1.b, O4.b
    public final O4.a o(N4.e descriptor) {
        kotlin.jvm.internal.i.e(descriptor, "descriptor");
        AbstractC0149c abstractC0149c = this.f2705a;
        w k3 = m.k(descriptor, abstractC0149c);
        u uVar = this.f2707c;
        B3.d dVar = (B3.d) uVar.f2721c;
        int i2 = dVar.f276b + 1;
        dVar.f276b = i2;
        Object[] objArr = (Object[]) dVar.f277c;
        if (i2 == objArr.length) {
            int i3 = i2 * 2;
            Object[] copyOf = Arrays.copyOf(objArr, i3);
            kotlin.jvm.internal.i.d(copyOf, "copyOf(...)");
            dVar.f277c = copyOf;
            int[] copyOf2 = Arrays.copyOf((int[]) dVar.f278d, i3);
            kotlin.jvm.internal.i.d(copyOf2, "copyOf(...)");
            dVar.f278d = copyOf2;
        }
        ((Object[]) dVar.f277c)[i2] = descriptor;
        uVar.g(k3.f2733a);
        if (uVar.q() != 4) {
            int ordinal = k3.ordinal();
            return (ordinal == 1 || ordinal == 2 || ordinal == 3) ? new r(abstractC0149c, k3, uVar, descriptor) : (this.f2706b == k3 && abstractC0149c.f2501a.f2531f) ? this : new r(abstractC0149c, k3, uVar, descriptor);
        }
        u.n(uVar, "Unexpected leading comma", 0, null, 6);
        throw null;
    }

    @Override // K1.b, O4.b
    public final int q() {
        u uVar = this.f2707c;
        long h3 = uVar.h();
        int i2 = (int) h3;
        if (h3 == i2) {
            return i2;
        }
        u.n(uVar, "Failed to parse int for input '" + h3 + '\'', 0, null, 6);
        throw null;
    }

    @Override // K1.b, O4.b
    public final byte s() {
        u uVar = this.f2707c;
        long h3 = uVar.h();
        byte b6 = (byte) h3;
        if (h3 == b6) {
            return b6;
        }
        u.n(uVar, "Failed to parse byte for input '" + h3 + '\'', 0, null, 6);
        throw null;
    }

    @Override // K1.b, O4.b
    public final short t() {
        u uVar = this.f2707c;
        long h3 = uVar.h();
        short s2 = (short) h3;
        if (h3 == s2) {
            return s2;
        }
        u.n(uVar, "Failed to parse short for input '" + h3 + '\'', 0, null, 6);
        throw null;
    }

    @Override // K1.b, O4.b
    public final String u() {
        boolean z = this.f2709e.f2528c;
        u uVar = this.f2707c;
        return z ? uVar.k() : uVar.i();
    }

    @Override // K1.b, O4.b
    public final float v() {
        u uVar = this.f2707c;
        String j2 = uVar.j();
        try {
            float parseFloat = Float.parseFloat(j2);
            if (this.f2705a.f2501a.f2536k || !(Float.isInfinite(parseFloat) || Float.isNaN(parseFloat))) {
                return parseFloat;
            }
            m.l(uVar, Float.valueOf(parseFloat));
            throw null;
        } catch (IllegalArgumentException unused) {
            u.n(uVar, B0.o.j("Failed to parse type 'float' for input '", j2, '\''), 0, null, 6);
            throw null;
        }
    }

    @Override // K1.b, O4.b
    public final double x() {
        u uVar = this.f2707c;
        String j2 = uVar.j();
        try {
            double parseDouble = Double.parseDouble(j2);
            if (this.f2705a.f2501a.f2536k || !(Double.isInfinite(parseDouble) || Double.isNaN(parseDouble))) {
                return parseDouble;
            }
            m.l(uVar, Double.valueOf(parseDouble));
            throw null;
        } catch (IllegalArgumentException unused) {
            u.n(uVar, B0.o.j("Failed to parse type 'double' for input '", j2, '\''), 0, null, 6);
            throw null;
        }
    }

    public final Q4.l z0() {
        return new q(this.f2705a.f2501a, this.f2707c).b();
    }
}
