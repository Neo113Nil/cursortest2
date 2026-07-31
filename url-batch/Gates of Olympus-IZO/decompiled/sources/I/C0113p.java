package I;

import D1.C0014b;
import H2.AbstractC0080b;
import J.C0134a;
import J.C0135b;
import J.C0136c;
import J.C0138e;
import a2.InterfaceC0184a;
import a2.InterfaceC0186c;
import android.os.Trace;
import android.util.SparseArray;
import j.AbstractC0479E;
import j.C0475A;
import j.C0496n;
import j.C0498p;
import j.C0503u;
import j.C0504v;
import j.C0506x;
import j.C0508z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import t0.C0906n;

/* renamed from: I.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0113p {

    /* renamed from: A, reason: collision with root package name */
    public int f2294A;
    public boolean B;
    public final C0111o C;
    public final A2.n D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f2295E;

    /* renamed from: F, reason: collision with root package name */
    public F0 f2296F;

    /* renamed from: G, reason: collision with root package name */
    public G0 f2297G;

    /* renamed from: H, reason: collision with root package name */
    public I0 f2298H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f2299I;

    /* renamed from: J, reason: collision with root package name */
    public InterfaceC0110n0 f2300J;

    /* renamed from: K, reason: collision with root package name */
    public C0134a f2301K;

    /* renamed from: L, reason: collision with root package name */
    public final C0135b f2302L;

    /* renamed from: M, reason: collision with root package name */
    public C0087c f2303M;

    /* renamed from: N, reason: collision with root package name */
    public C0136c f2304N;

    /* renamed from: O, reason: collision with root package name */
    public boolean f2305O;

    /* renamed from: P, reason: collision with root package name */
    public int f2306P;

    /* renamed from: a, reason: collision with root package name */
    public final C0014b f2307a;

    /* renamed from: b, reason: collision with root package name */
    public final r f2308b;

    /* renamed from: c, reason: collision with root package name */
    public final G0 f2309c;

    /* renamed from: d, reason: collision with root package name */
    public final C0508z f2310d;

    /* renamed from: e, reason: collision with root package name */
    public final C0134a f2311e;

    /* renamed from: f, reason: collision with root package name */
    public final C0134a f2312f;

    /* renamed from: g, reason: collision with root package name */
    public final C0122u f2313g;

    /* renamed from: i, reason: collision with root package name */
    public C0108m0 f2315i;

    /* renamed from: j, reason: collision with root package name */
    public int f2316j;

    /* renamed from: k, reason: collision with root package name */
    public int f2317k;

    /* renamed from: l, reason: collision with root package name */
    public int f2318l;

    /* renamed from: n, reason: collision with root package name */
    public int[] f2320n;

    /* renamed from: o, reason: collision with root package name */
    public C0496n f2321o;
    public boolean p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2322q;

    /* renamed from: u, reason: collision with root package name */
    public A2.g f2326u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2327v;

    /* renamed from: x, reason: collision with root package name */
    public boolean f2329x;

    /* renamed from: z, reason: collision with root package name */
    public int f2331z;

    /* renamed from: h, reason: collision with root package name */
    public final A2.n f2314h = new A2.n(1);

    /* renamed from: m, reason: collision with root package name */
    public final O f2319m = new O();

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList f2323r = new ArrayList();

    /* renamed from: s, reason: collision with root package name */
    public final O f2324s = new O();

    /* renamed from: t, reason: collision with root package name */
    public InterfaceC0110n0 f2325t = Q.d.f3088g;

    /* renamed from: w, reason: collision with root package name */
    public final O f2328w = new O();

    /* renamed from: y, reason: collision with root package name */
    public int f2330y = -1;

    public C0113p(C0014b c0014b, r rVar, G0 g02, C0508z c0508z, C0134a c0134a, C0134a c0134a2, C0122u c0122u) {
        this.f2307a = c0014b;
        this.f2308b = rVar;
        this.f2309c = g02;
        this.f2310d = c0508z;
        this.f2311e = c0134a;
        this.f2312f = c0134a2;
        this.f2313g = c0122u;
        this.B = rVar.e() || rVar.c();
        this.C = new C0111o(0, this);
        this.D = new A2.n(1);
        F0 d3 = g02.d();
        d3.c();
        this.f2296F = d3;
        G0 g03 = new G0();
        if (rVar.e()) {
            g03.c();
        }
        if (rVar.c()) {
            g03.f2127m = new C0498p();
        }
        this.f2297G = g03;
        I0 i3 = g03.i();
        i3.e(true);
        this.f2298H = i3;
        this.f2302L = new C0135b(this, c0134a);
        F0 d4 = this.f2297G.d();
        try {
            C0087c a3 = d4.a(0);
            d4.c();
            this.f2303M = a3;
            this.f2304N = new C0136c();
        } catch (Throwable th) {
            d4.c();
            throw th;
        }
    }

    public static final int I(C0113p c0113p, int i3, boolean z3, int i4) {
        F0 f02 = c0113p.f2296F;
        int[] iArr = f02.f2102b;
        int i5 = i3 * 5;
        if (!((iArr[i5 + 1] & 134217728) != 0)) {
            if (!C0089d.h(iArr, i3)) {
                if (C0089d.m(iArr, i3)) {
                    return 1;
                }
                return C0089d.o(iArr, i3);
            }
            int i6 = iArr[i5 + 3] + i3;
            int i7 = 0;
            for (int i8 = i3 + 1; i8 < i6; i8 += iArr[(i8 * 5) + 3]) {
                boolean m3 = C0089d.m(iArr, i8);
                C0135b c0135b = c0113p.f2302L;
                if (m3) {
                    c0135b.c();
                    Object i9 = f02.i(i8);
                    c0135b.c();
                    c0135b.f2545h.f118a.add(i9);
                }
                i7 += I(c0113p, i8, m3 || z3, m3 ? 0 : i4 + i7);
                if (m3) {
                    c0135b.c();
                    c0135b.a();
                }
            }
            if (C0089d.m(iArr, i3)) {
                return 1;
            }
            return i7;
        }
        int i10 = iArr[i5];
        Object j3 = f02.j(iArr, i3);
        if (i10 != 206 || !Z1.i.a(j3, C0089d.f2242e)) {
            if (C0089d.m(iArr, i3)) {
                return 1;
            }
            return C0089d.o(iArr, i3);
        }
        Object g3 = f02.g(i3, 0);
        C0107m c0107m = g3 instanceof C0107m ? (C0107m) g3 : null;
        if (c0107m != null) {
            for (C0113p c0113p2 : c0107m.f2276d.f2287e) {
                C0135b c0135b2 = c0113p2.f2302L;
                G0 g02 = c0113p2.f2309c;
                if (g02.f2119e > 0 && C0089d.h(g02.f2118d, 0)) {
                    C0134a c0134a = new C0134a();
                    c0113p2.f2301K = c0134a;
                    F0 d3 = g02.d();
                    try {
                        c0113p2.f2296F = d3;
                        C0134a c0134a2 = c0135b2.f2539b;
                        try {
                            c0135b2.f2539b = c0134a;
                            c0113p2.H(0);
                            c0135b2.b();
                            if (c0135b2.f2540c) {
                                C0134a c0134a3 = c0135b2.f2539b;
                                c0134a3.getClass();
                                c0134a3.f2537f.Z(J.w.f2575c);
                                if (c0135b2.f2540c) {
                                    c0135b2.d(false);
                                    c0135b2.d(false);
                                    C0134a c0134a4 = c0135b2.f2539b;
                                    c0134a4.getClass();
                                    c0134a4.f2537f.Z(J.i.f2557c);
                                    c0135b2.f2540c = false;
                                }
                            }
                            c0135b2.f2539b = c0134a2;
                        } catch (Throwable th) {
                            c0135b2.f2539b = c0134a2;
                            throw th;
                        }
                    } finally {
                        d3.c();
                    }
                }
                c0113p.f2308b.l(c0113p2.f2313g);
            }
        }
        return C0089d.o(iArr, i3);
    }

    public final int A(int i3) {
        int p = C0089d.p(this.f2296F.f2102b, i3) + 1;
        int i4 = 0;
        while (p < i3) {
            if (!C0089d.l(this.f2296F.f2102b, p)) {
                i4++;
            }
            p += C0089d.j(this.f2296F.f2102b, p);
        }
        return i4;
    }

    public final boolean B(A2.g gVar) {
        J.E e3 = this.f2311e.f2537f;
        if (!e3.W()) {
            C0089d.w("Expected applyChanges() to have been called");
            throw null;
        }
        if (((C0506x) gVar.f83b).f5230e <= 0 && this.f2323r.isEmpty()) {
            return false;
        }
        n(gVar, null);
        return e3.X();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0037, code lost:
    
        if (r3.f2175b < r5) goto L11;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0213  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void C() {
        P p;
        boolean z3;
        C0119s0 c0119s0;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z4;
        Object[] objArr;
        Object[] objArr2;
        boolean z5;
        boolean z6;
        C0113p c0113p;
        C0503u c0503u;
        long[] jArr;
        long[] jArr2;
        int E3;
        int i8;
        P p3;
        L1.z zVar;
        C0113p c0113p2 = this;
        boolean z7 = c0113p2.f2295E;
        c0113p2.f2295E = true;
        F0 f02 = c0113p2.f2296F;
        int i9 = f02.f2109i;
        int i10 = (i9 * 5) + 3;
        int i11 = f02.f2102b[i10] + i9;
        int i12 = c0113p2.f2316j;
        int i13 = c0113p2.f2306P;
        int i14 = c0113p2.f2317k;
        int i15 = c0113p2.f2318l;
        ArrayList arrayList = c0113p2.f2323r;
        int E4 = C0089d.E(f02.f2107g, arrayList);
        if (E4 < 0) {
            E4 = -(E4 + 1);
        }
        if (E4 < arrayList.size()) {
            p = (P) arrayList.get(E4);
        }
        p = null;
        int i16 = i9;
        boolean z8 = false;
        while (p != null) {
            int i17 = p.f2175b;
            int E5 = C0089d.E(i17, arrayList);
            if (E5 >= 0) {
            }
            Object obj = p.f2176c;
            C0119s0 c0119s02 = p.f2174a;
            if (obj == null) {
                c0119s02.getClass();
            } else {
                C0506x c0506x = c0119s02.f2350g;
                if (c0506x != null) {
                    z3 = z7;
                    if (obj instanceof G) {
                        z4 = C0119s0.a((G) obj, c0506x);
                        c0119s0 = c0119s02;
                        i3 = i11;
                        i4 = i10;
                        i5 = i12;
                        i6 = i14;
                        i7 = i15;
                    } else {
                        if (obj instanceof C0475A) {
                            C0475A c0475a = (C0475A) obj;
                            if (c0475a.h()) {
                                Object[] objArr3 = c0475a.f5130b;
                                long[] jArr3 = c0475a.f5129a;
                                i7 = i15;
                                int length = jArr3.length - 2;
                                if (length >= 0) {
                                    i3 = i11;
                                    i4 = i10;
                                    i6 = i14;
                                    int i18 = 0;
                                    while (true) {
                                        long j3 = jArr3[i18];
                                        long[] jArr4 = jArr3;
                                        c0119s0 = c0119s02;
                                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i19 = 8 - ((~(i18 - length)) >>> 31);
                                            int i20 = 0;
                                            while (i20 < i19) {
                                                if ((j3 & 255) < 128) {
                                                    i5 = i12;
                                                    Object obj2 = objArr3[(i18 << 3) + i20];
                                                    objArr2 = objArr3;
                                                    if (!(obj2 instanceof G)) {
                                                        break;
                                                    } else if (C0119s0.a((G) obj2, c0506x)) {
                                                        break;
                                                    }
                                                } else {
                                                    objArr2 = objArr3;
                                                    i5 = i12;
                                                }
                                                j3 >>= 8;
                                                i20++;
                                                objArr3 = objArr2;
                                                i12 = i5;
                                            }
                                            objArr = objArr3;
                                            i5 = i12;
                                            if (i19 != 8) {
                                                break;
                                            }
                                        } else {
                                            objArr = objArr3;
                                            i5 = i12;
                                        }
                                        if (i18 == length) {
                                            break;
                                        }
                                        i18++;
                                        c0119s02 = c0119s0;
                                        jArr3 = jArr4;
                                        objArr3 = objArr;
                                        i12 = i5;
                                    }
                                } else {
                                    c0119s0 = c0119s02;
                                    i3 = i11;
                                    i4 = i10;
                                    i5 = i12;
                                    i6 = i14;
                                }
                            } else {
                                c0119s0 = c0119s02;
                                i3 = i11;
                                i4 = i10;
                                i5 = i12;
                                i6 = i14;
                                i7 = i15;
                            }
                            z4 = false;
                        }
                        c0119s0 = c0119s02;
                        i3 = i11;
                        i4 = i10;
                        i5 = i12;
                        i6 = i14;
                        i7 = i15;
                        z4 = true;
                    }
                    if (z4) {
                        C0119s0 c0119s03 = c0119s0;
                        A2.n nVar = c0113p2.D;
                        nVar.f118a.add(c0119s03);
                        C0122u c0122u = c0119s03.f2345b;
                        if (c0122u == null || (c0503u = c0119s03.f2349f) == null) {
                            z5 = z8;
                        } else {
                            c0119s03.e(true);
                            try {
                                Object[] objArr4 = c0503u.f5213b;
                                int[] iArr = c0503u.f5214c;
                                long[] jArr5 = c0503u.f5212a;
                                int length2 = jArr5.length - 2;
                                if (length2 >= 0) {
                                    int i21 = 0;
                                    while (true) {
                                        long j4 = jArr5[i21];
                                        z5 = z8;
                                        if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i22 = 8 - ((~(i21 - length2)) >>> 31);
                                            int i23 = 0;
                                            while (i23 < i22) {
                                                if ((j4 & 255) < 128) {
                                                    int i24 = (i21 << 3) + i23;
                                                    jArr2 = jArr5;
                                                    Object obj3 = objArr4[i24];
                                                    int i25 = iArr[i24];
                                                    c0122u.w(obj3);
                                                } else {
                                                    jArr2 = jArr5;
                                                }
                                                j4 >>= 8;
                                                i23++;
                                                jArr5 = jArr2;
                                            }
                                            jArr = jArr5;
                                            if (i22 != 8) {
                                                break;
                                            }
                                        } else {
                                            jArr = jArr5;
                                        }
                                        if (i21 == length2) {
                                            break;
                                        }
                                        i21++;
                                        z8 = z5;
                                        jArr5 = jArr;
                                    }
                                } else {
                                    z5 = z8;
                                }
                                c0119s03.e(false);
                            } catch (Throwable th) {
                                c0119s03.e(false);
                                throw th;
                            }
                        }
                        ArrayList arrayList2 = nVar.f118a;
                        z6 = true;
                        arrayList2.remove(arrayList2.size() - 1);
                        c0113p = this;
                        z8 = z5;
                    } else {
                        c0113p2.f2296F.k(i17);
                        int i26 = c0113p2.f2296F.f2107g;
                        c0113p2.F(i16, i26, i9);
                        int i27 = (i26 * 5) + 2;
                        int i28 = c0113p2.f2296F.f2102b[i27];
                        while (i28 != i9 && !C0089d.m(c0113p2.f2296F.f2102b, i28)) {
                            i28 = c0113p2.f2296F.f2102b[(i28 * 5) + 2];
                        }
                        int i29 = C0089d.m(c0113p2.f2296F.f2102b, i28) ? 0 : i5;
                        if (i28 != i26) {
                            int c02 = (c0113p2.c0(i28) - C0089d.o(c0113p2.f2296F.f2102b, i26)) + i29;
                            while (i29 < c02 && i28 != i17) {
                                i28++;
                                while (i28 < i17) {
                                    int[] iArr2 = c0113p2.f2296F.f2102b;
                                    int i30 = iArr2[(i28 * 5) + 3] + i28;
                                    if (i17 >= i30) {
                                        i29 += C0089d.m(iArr2, i28) ? 1 : c0113p2.c0(i28);
                                        i28 = i30;
                                    }
                                }
                                break;
                            }
                        }
                        c0113p2.f2316j = i29;
                        c0113p2.f2318l = c0113p2.A(i26);
                        int i31 = c0113p2.f2296F.f2102b[i27];
                        c0113p2.f2306P = c0113p2.j(i31, c0113p2.A(i31), i9, i13);
                        c0113p2.f2300J = null;
                        Y1.e eVar = c0119s0.f2347d;
                        if (eVar != null) {
                            eVar.g(c0113p2, 1);
                            zVar = L1.z.f2729a;
                        } else {
                            zVar = null;
                        }
                        if (zVar == null) {
                            throw new IllegalStateException("Invalid restart scope");
                        }
                        c0113p2.f2300J = null;
                        F0 f03 = c0113p2.f2296F;
                        int i32 = f03.f2102b[i4] + i9;
                        int i33 = f03.f2107g;
                        if (!(i33 >= i9 && i33 <= i32)) {
                            C0089d.w("Index " + i9 + " is not a parent of " + i33);
                            throw null;
                        }
                        f03.f2109i = i9;
                        f03.f2108h = i32;
                        f03.f2112l = 0;
                        f03.f2113m = 0;
                        i16 = i26;
                        c0113p = c0113p2;
                        z6 = true;
                        z8 = true;
                    }
                    E3 = C0089d.E(c0113p.f2296F.f2107g, arrayList);
                    if (E3 < 0) {
                        E3 = -(E3 + 1);
                    }
                    if (E3 >= arrayList.size()) {
                        p3 = (P) arrayList.get(E3);
                        i8 = i3;
                        if (p3.f2175b < i8) {
                            c0113p2 = c0113p;
                            i11 = i8;
                            i15 = i7;
                            i14 = i6;
                            i10 = i4;
                            i12 = i5;
                            p = p3;
                            z7 = z3;
                        }
                    } else {
                        i8 = i3;
                    }
                    p3 = null;
                    c0113p2 = c0113p;
                    i11 = i8;
                    i15 = i7;
                    i14 = i6;
                    i10 = i4;
                    i12 = i5;
                    p = p3;
                    z7 = z3;
                }
            }
            z3 = z7;
            c0119s0 = c0119s02;
            i3 = i11;
            i4 = i10;
            i5 = i12;
            i6 = i14;
            i7 = i15;
            z4 = true;
            if (z4) {
            }
            E3 = C0089d.E(c0113p.f2296F.f2107g, arrayList);
            if (E3 < 0) {
            }
            if (E3 >= arrayList.size()) {
            }
            p3 = null;
            c0113p2 = c0113p;
            i11 = i8;
            i15 = i7;
            i14 = i6;
            i10 = i4;
            i12 = i5;
            p = p3;
            z7 = z3;
        }
        boolean z9 = z7;
        C0113p c0113p3 = c0113p2;
        int i34 = i12;
        int i35 = i14;
        int i36 = i15;
        if (z8) {
            c0113p3.F(i16, i9, i9);
            c0113p3.f2296F.m();
            int c03 = c0113p3.c0(i9);
            c0113p3.f2316j = i34 + c03;
            c0113p3.f2317k = i35 + c03;
            c0113p3.f2318l = i36;
        } else {
            K();
        }
        c0113p3.f2306P = i13;
        c0113p3.f2295E = z9;
    }

    public final void D() {
        H(this.f2296F.f2107g);
        C0135b c0135b = this.f2302L;
        c0135b.d(false);
        C0113p c0113p = c0135b.f2538a;
        F0 f02 = c0113p.f2296F;
        if (f02.f2103c > 0) {
            int i3 = f02.f2109i;
            O o3 = c0135b.f2541d;
            int i4 = o3.f2171b;
            if ((i4 > 0 ? o3.f2170a[i4 - 1] : -2) != i3) {
                if (!c0135b.f2540c && c0135b.f2542e) {
                    c0135b.d(false);
                    C0134a c0134a = c0135b.f2539b;
                    c0134a.getClass();
                    c0134a.f2537f.Z(J.l.f2560c);
                    c0135b.f2540c = true;
                }
                if (i3 > 0) {
                    C0087c a3 = f02.a(i3);
                    o3.b(i3);
                    c0135b.d(false);
                    C0134a c0134a2 = c0135b.f2539b;
                    c0134a2.getClass();
                    J.k kVar = J.k.f2559c;
                    J.E e3 = c0134a2.f2537f;
                    e3.a0(kVar);
                    I2.d.L(e3, 0, a3);
                    int i5 = e3.f2535l;
                    int i6 = kVar.f2523a;
                    int T2 = J.E.T(e3, i6);
                    int i7 = kVar.f2524b;
                    if (i5 != T2 || e3.f2536m != J.E.T(e3, i7)) {
                        StringBuilder sb = new StringBuilder();
                        int i8 = 0;
                        for (int i9 = 0; i9 < i6; i9++) {
                            if (((1 << i9) & e3.f2535l) != 0) {
                                if (i8 > 0) {
                                    sb.append(", ");
                                }
                                sb.append(kVar.b(i9));
                                i8++;
                            }
                        }
                        String sb2 = sb.toString();
                        StringBuilder m3 = AbstractC0080b.m(sb2, "StringBuilder().apply(builderAction).toString()");
                        int i10 = 0;
                        for (int i11 = 0; i11 < i7; i11++) {
                            if (((1 << i11) & e3.f2536m) != 0) {
                                if (i8 > 0) {
                                    m3.append(", ");
                                }
                                m3.append(kVar.c(i11));
                                i10++;
                            }
                        }
                        String sb3 = m3.toString();
                        Z1.i.e(sb3, "StringBuilder().apply(builderAction).toString()");
                        StringBuilder sb4 = new StringBuilder("Error while pushing ");
                        sb4.append(kVar);
                        sb4.append(". Not all arguments were provided. Missing ");
                        AbstractC0080b.t(sb4, i8, " int arguments (", sb2, ") and ");
                        AbstractC0080b.u(sb4, i10, " object arguments (", sb3, ").");
                        throw null;
                    }
                    c0135b.f2540c = true;
                }
            }
        }
        C0134a c0134a3 = c0135b.f2539b;
        c0134a3.getClass();
        c0134a3.f2537f.Z(J.s.f2571c);
        int i12 = c0135b.f2543f;
        F0 f03 = c0113p.f2296F;
        c0135b.f2543f = f03.f2102b[(f03.f2107g * 5) + 3] + i12;
    }

    public final void E(InterfaceC0110n0 interfaceC0110n0) {
        A2.g gVar = this.f2326u;
        if (gVar == null) {
            gVar = new A2.g(11);
            this.f2326u = gVar;
        }
        ((SparseArray) gVar.f83b).put(this.f2296F.f2107g, interfaceC0110n0);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0082 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void F(int i3, int i4, int i5) {
        int[] iArr;
        F0 f02 = this.f2296F;
        if (i3 != i4) {
            if (i3 != i5 && i4 != i5) {
                int[] iArr2 = f02.f2102b;
                int i6 = iArr2[(i3 * 5) + 2];
                if (i6 == i4) {
                    i5 = i4;
                } else {
                    int i7 = iArr2[(i4 * 5) + 2];
                    if (i7 != i3) {
                        if (i6 == i7) {
                            i5 = i6;
                        } else {
                            int i8 = i3;
                            int i9 = 0;
                            while (true) {
                                iArr = f02.f2102b;
                                if (i8 <= 0 || i8 == i5) {
                                    break;
                                }
                                i8 = C0089d.p(iArr, i8);
                                i9++;
                            }
                            int i10 = i4;
                            int i11 = 0;
                            while (i10 > 0 && i10 != i5) {
                                i10 = C0089d.p(iArr, i10);
                                i11++;
                            }
                            int i12 = i9 - i11;
                            int i13 = i3;
                            for (int i14 = 0; i14 < i12; i14++) {
                                i13 = iArr2[(i13 * 5) + 2];
                            }
                            int i15 = i11 - i9;
                            int i16 = i4;
                            for (int i17 = 0; i17 < i15; i17++) {
                                i16 = iArr2[(i16 * 5) + 2];
                            }
                            i5 = i13;
                            for (int i18 = i16; i5 != i18; i18 = iArr2[(i18 * 5) + 2]) {
                                i5 = iArr2[(i5 * 5) + 2];
                            }
                        }
                    }
                }
            }
            while (i3 > 0 && i3 != i5) {
                if (!C0089d.m(f02.f2102b, i3)) {
                    this.f2302L.a();
                }
                i3 = f02.f2102b[(i3 * 5) + 2];
            }
            o(i4, i5);
        }
        i5 = i3;
        while (i3 > 0) {
            if (!C0089d.m(f02.f2102b, i3)) {
            }
            i3 = f02.f2102b[(i3 * 5) + 2];
        }
        o(i4, i5);
    }

    public final Object G() {
        boolean z3 = this.f2305O;
        X x3 = C0105l.f2272a;
        if (!z3) {
            Object h3 = this.f2296F.h();
            return (!this.f2329x || (h3 instanceof C0107m)) ? h3 instanceof C0 ? ((C0) h3).f2083a : h3 : x3;
        }
        if (!this.f2322q) {
            return x3;
        }
        C0089d.w("A call to createNode(), emitNode() or useNode() expected");
        throw null;
    }

    public final void H(int i3) {
        I(this, i3, false, 0);
        this.f2302L.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void J() {
        int rotateLeft;
        int hashCode;
        if (this.f2323r.isEmpty()) {
            this.f2317k = this.f2296F.l() + this.f2317k;
            return;
        }
        F0 f02 = this.f2296F;
        int f3 = f02.f();
        int i3 = f02.f2107g;
        int i4 = f02.f2108h;
        int[] iArr = f02.f2102b;
        Object j3 = i3 < i4 ? f02.j(iArr, i3) : null;
        Object e3 = f02.e();
        int i5 = this.f2318l;
        X x3 = C0105l.f2272a;
        if (j3 != null) {
            rotateLeft = Integer.rotateLeft((j3 instanceof Enum ? ((Enum) j3).ordinal() : j3.hashCode()) ^ Integer.rotateLeft(this.f2306P, 3), 3);
        } else {
            if (e3 != null && f3 == 207 && !e3.equals(x3)) {
                this.f2306P = Integer.rotateLeft(e3.hashCode() ^ Integer.rotateLeft(this.f2306P, 3), 3) ^ i5;
                P(null, C0089d.m(iArr, f02.f2107g));
                C();
                f02.d();
                if (j3 == null) {
                    hashCode = Integer.hashCode(j3 instanceof Enum ? ((Enum) j3).ordinal() : j3.hashCode()) ^ Integer.rotateRight(this.f2306P, 3);
                } else {
                    if (e3 != null && f3 == 207 && !e3.equals(x3)) {
                        this.f2306P = Integer.rotateRight(Integer.hashCode(e3.hashCode()) ^ Integer.rotateRight(this.f2306P ^ i5, 3), 3);
                        return;
                    }
                    hashCode = Integer.rotateRight(this.f2306P ^ i5, 3) ^ Integer.hashCode(f3);
                }
                this.f2306P = Integer.rotateRight(hashCode, 3);
            }
            rotateLeft = Integer.rotateLeft(Integer.rotateLeft(this.f2306P, 3) ^ f3, 3) ^ i5;
        }
        this.f2306P = rotateLeft;
        P(null, C0089d.m(iArr, f02.f2107g));
        C();
        f02.d();
        if (j3 == null) {
        }
        this.f2306P = Integer.rotateRight(hashCode, 3);
    }

    public final void K() {
        F0 f02 = this.f2296F;
        int i3 = f02.f2109i;
        this.f2317k = i3 >= 0 ? C0089d.o(f02.f2102b, i3) : 0;
        this.f2296F.m();
    }

    public final void L() {
        if (this.f2317k != 0) {
            C0089d.w("No nodes can be emitted before calling skipAndEndGroup");
            throw null;
        }
        C0119s0 v3 = v();
        if (v3 != null) {
            v3.f2344a |= 16;
        }
        if (this.f2323r.isEmpty()) {
            K();
        } else {
            C();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void M(int i3, int i4, Object obj, Object obj2) {
        int rotateLeft;
        C0108m0 c0108m0;
        Object obj3;
        int i5;
        int i6;
        int i7;
        C0113p c0113p = this;
        Object obj4 = obj;
        if (c0113p.f2322q) {
            C0089d.w("A call to createNode(), emitNode() or useNode() expected");
            throw null;
        }
        int i8 = c0113p.f2318l;
        X x3 = C0105l.f2272a;
        if (obj4 != null) {
            rotateLeft = Integer.rotateLeft((obj4 instanceof Enum ? ((Enum) obj4).ordinal() : obj.hashCode()) ^ Integer.rotateLeft(c0113p.f2306P, 3), 3);
        } else {
            if (obj2 != null && i3 == 207 && !obj2.equals(x3)) {
                c0113p.f2306P = i8 ^ Integer.rotateLeft(obj2.hashCode() ^ Integer.rotateLeft(c0113p.f2306P, 3), 3);
                if (obj4 == null) {
                    c0113p.f2318l++;
                }
                boolean z3 = i4 == 0;
                if (!c0113p.f2305O) {
                    c0113p.f2296F.f2111k++;
                    I0 i02 = c0113p.f2298H;
                    int i9 = i02.f2151t;
                    if (z3) {
                        i02.I(i3, x3, true, x3);
                    } else if (obj2 != null) {
                        if (obj4 == null) {
                            obj4 = x3;
                        }
                        i02.I(i3, obj4, false, obj2);
                    } else {
                        if (obj4 == null) {
                            obj4 = x3;
                        }
                        i02.I(i3, obj4, false, x3);
                    }
                    C0108m0 c0108m02 = c0113p.f2315i;
                    if (c0108m02 != null) {
                        int i10 = (-2) - i9;
                        S s3 = new S(-1, i3, i10, -1);
                        c0108m02.f2281e.i(i10, new L(-1, c0113p.f2316j - c0108m02.f2278b, 0));
                        c0108m02.f2280d.add(s3);
                    }
                    c0113p.t(z3, null);
                    return;
                }
                boolean z4 = i4 == 1 && c0113p.f2329x;
                if (c0113p.f2315i == null) {
                    int f3 = c0113p.f2296F.f();
                    if (!z4 && f3 == i3) {
                        F0 f02 = c0113p.f2296F;
                        int i11 = f02.f2107g;
                        if (Z1.i.a(obj4, i11 < f02.f2108h ? f02.j(f02.f2102b, i11) : null)) {
                            c0113p.P(obj2, z3);
                        }
                    }
                    F0 f03 = c0113p.f2296F;
                    f03.getClass();
                    ArrayList arrayList = new ArrayList();
                    if (f03.f2111k <= 0) {
                        int i12 = f03.f2107g;
                        while (i12 < f03.f2108h) {
                            int i13 = i12 * 5;
                            int[] iArr = f03.f2102b;
                            arrayList.add(new S(f03.j(iArr, i12), iArr[i13], i12, C0089d.m(iArr, i12) ? 1 : C0089d.o(iArr, i12)));
                            i12 += iArr[i13 + 3];
                        }
                    }
                    c0113p.f2315i = new C0108m0(c0113p.f2316j, arrayList);
                }
                C0108m0 c0108m03 = c0113p.f2315i;
                if (c0108m03 != null) {
                    Object q2 = obj4 != null ? new Q(Integer.valueOf(i3), obj4) : Integer.valueOf(i3);
                    C0506x c0506x = ((C0086b0) c0108m03.f2282f.getValue()).f2236a;
                    Object e3 = c0506x.e(q2);
                    if (e3 != null) {
                        if (!(e3 instanceof List) || ((e3 instanceof InterfaceC0184a) && !(e3 instanceof InterfaceC0186c))) {
                            c0506x.g(q2);
                            obj3 = e3;
                        } else {
                            List b2 = Z1.w.b(e3);
                            obj3 = b2.remove(0);
                            if (b2.isEmpty()) {
                                c0506x.g(q2);
                            }
                        }
                        Z1.i.d(obj3, "null cannot be cast to non-null type V of androidx.compose.runtime.MutableScatterMultiMap.pop_impl$lambda$1");
                    } else {
                        obj3 = null;
                    }
                    S s4 = (S) obj3;
                    ArrayList arrayList2 = c0108m03.f2280d;
                    C0498p c0498p = c0108m03.f2281e;
                    int i14 = c0108m03.f2278b;
                    if (z4 || s4 == null) {
                        c0113p.f2296F.f2111k++;
                        c0113p.f2305O = true;
                        c0113p.f2300J = null;
                        if (c0113p.f2298H.f2154w) {
                            I0 i15 = c0113p.f2297G.i();
                            c0113p.f2298H = i15;
                            i15.D();
                            c0113p.f2299I = false;
                            c0113p.f2300J = null;
                        }
                        c0113p.f2298H.d();
                        I0 i03 = c0113p.f2298H;
                        int i16 = i03.f2151t;
                        if (z3) {
                            i03.I(i3, x3, true, x3);
                        } else if (obj2 != null) {
                            if (obj4 == null) {
                                obj4 = x3;
                            }
                            i03.I(i3, obj4, false, obj2);
                        } else {
                            if (obj4 == null) {
                                obj4 = x3;
                            }
                            i03.I(i3, obj4, false, x3);
                        }
                        c0113p.f2303M = c0113p.f2298H.b(i16);
                        int i17 = (-2) - i16;
                        S s5 = new S(-1, i3, i17, -1);
                        c0498p.i(i17, new L(-1, c0113p.f2316j - i14, 0));
                        arrayList2.add(s5);
                        c0108m0 = new C0108m0(z3 ? 0 : c0113p.f2316j, new ArrayList());
                        c0113p.t(z3, c0108m0);
                        return;
                    }
                    arrayList2.add(s4);
                    int i18 = s4.f2193c;
                    L l3 = (L) c0498p.f(i18);
                    c0113p.f2316j = (l3 != null ? l3.f2160b : -1) + i14;
                    L l4 = (L) c0498p.f(i18);
                    int i19 = l4 != null ? l4.f2159a : -1;
                    int i20 = c0108m03.f2279c;
                    int i21 = i19 - i20;
                    char c3 = 7;
                    int i22 = 8;
                    if (i19 > i20) {
                        Object[] objArr = c0498p.f5186c;
                        long[] jArr = c0498p.f5184a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i23 = 0;
                            while (true) {
                                long j3 = jArr[i23];
                                i5 = i21;
                                if ((((~j3) << c3) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i24 = 8 - ((~(i23 - length)) >>> 31);
                                    for (int i25 = 0; i25 < i24; i25++) {
                                        if ((j3 & 255) < 128) {
                                            L l5 = (L) objArr[(i23 << 3) + i25];
                                            int i26 = l5.f2159a;
                                            if (i26 == i19) {
                                                l5.f2159a = i20;
                                            } else if (i20 <= i26 && i26 < i19) {
                                                l5.f2159a = i26 + 1;
                                            }
                                        }
                                        j3 >>= 8;
                                    }
                                    if (i24 != 8) {
                                        break;
                                    }
                                }
                                if (i23 == length) {
                                    break;
                                }
                                i23++;
                                i21 = i5;
                                c3 = 7;
                            }
                        } else {
                            i5 = i21;
                        }
                    } else {
                        i5 = i21;
                        if (i20 > i19) {
                            Object[] objArr2 = c0498p.f5186c;
                            long[] jArr2 = c0498p.f5184a;
                            int length2 = jArr2.length - 2;
                            if (length2 >= 0) {
                                int i27 = 0;
                                while (true) {
                                    long j4 = jArr2[i27];
                                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i28 = 8 - ((~(i27 - length2)) >>> 31);
                                        int i29 = 0;
                                        while (i29 < i28) {
                                            if ((j4 & 255) < 128) {
                                                L l6 = (L) objArr2[(i27 << 3) + i29];
                                                int i30 = l6.f2159a;
                                                if (i30 == i19) {
                                                    l6.f2159a = i20;
                                                } else if (i19 + 1 <= i30 && i30 < i20) {
                                                    l6.f2159a = i30 - 1;
                                                }
                                                i7 = 8;
                                            } else {
                                                i7 = i22;
                                            }
                                            j4 >>= i7;
                                            i29++;
                                            i22 = i7;
                                        }
                                        i6 = i22;
                                        if (i28 != i6) {
                                            break;
                                        }
                                    } else {
                                        i6 = i22;
                                    }
                                    if (i27 == length2) {
                                        break;
                                    }
                                    i27++;
                                    i22 = i6;
                                }
                            }
                        }
                    }
                    C0135b c0135b = c0113p.f2302L;
                    int i31 = c0135b.f2543f;
                    C0113p c0113p2 = c0135b.f2538a;
                    c0135b.f2543f = (i18 - c0113p2.f2296F.f2107g) + i31;
                    c0113p.f2296F.k(i18);
                    if (i5 > 0) {
                        c0135b.d(false);
                        F0 f04 = c0113p2.f2296F;
                        if (f04.f2103c > 0) {
                            int i32 = f04.f2109i;
                            O o3 = c0135b.f2541d;
                            int i33 = o3.f2171b;
                            if ((i33 > 0 ? o3.f2170a[i33 - 1] : -2) != i32) {
                                if (!c0135b.f2540c && c0135b.f2542e) {
                                    c0135b.d(false);
                                    C0134a c0134a = c0135b.f2539b;
                                    c0134a.getClass();
                                    c0134a.f2537f.Z(J.l.f2560c);
                                    c0135b.f2540c = true;
                                }
                                if (i32 > 0) {
                                    C0087c a3 = f04.a(i32);
                                    o3.b(i32);
                                    c0135b.d(false);
                                    C0134a c0134a2 = c0135b.f2539b;
                                    c0134a2.getClass();
                                    J.k kVar = J.k.f2559c;
                                    J.E e4 = c0134a2.f2537f;
                                    e4.a0(kVar);
                                    I2.d.L(e4, 0, a3);
                                    int i34 = e4.f2535l;
                                    int i35 = kVar.f2523a;
                                    int T2 = J.E.T(e4, i35);
                                    int i36 = kVar.f2524b;
                                    if (i34 != T2 || e4.f2536m != J.E.T(e4, i36)) {
                                        int i37 = 1;
                                        StringBuilder sb = new StringBuilder();
                                        int i38 = 0;
                                        int i39 = 0;
                                        while (i38 < i35) {
                                            if (((i37 << i38) & e4.f2535l) != 0) {
                                                if (i39 > 0) {
                                                    sb.append(", ");
                                                }
                                                sb.append(kVar.b(i38));
                                                i39++;
                                            }
                                            i38++;
                                            i37 = 1;
                                        }
                                        String sb2 = sb.toString();
                                        StringBuilder m3 = AbstractC0080b.m(sb2, "StringBuilder().apply(builderAction).toString()");
                                        int i40 = 0;
                                        int i41 = 0;
                                        while (i40 < i36) {
                                            int i42 = i36;
                                            if (((1 << i40) & e4.f2536m) != 0) {
                                                if (i39 > 0) {
                                                    m3.append(", ");
                                                }
                                                m3.append(kVar.c(i40));
                                                i41++;
                                            }
                                            i40++;
                                            i36 = i42;
                                        }
                                        String sb3 = m3.toString();
                                        Z1.i.e(sb3, "StringBuilder().apply(builderAction).toString()");
                                        StringBuilder sb4 = new StringBuilder("Error while pushing ");
                                        sb4.append(kVar);
                                        sb4.append(". Not all arguments were provided. Missing ");
                                        AbstractC0080b.t(sb4, i39, " int arguments (", sb2, ") and ");
                                        AbstractC0080b.u(sb4, i41, " object arguments (", sb3, ").");
                                        throw null;
                                    }
                                    c0135b.f2540c = true;
                                }
                            }
                        }
                        C0134a c0134a3 = c0135b.f2539b;
                        c0134a3.getClass();
                        J.p pVar = J.p.f2568c;
                        J.E e5 = c0134a3.f2537f;
                        e5.a0(pVar);
                        I2.d.K(e5, 0, i5);
                        int i43 = e5.f2535l;
                        int i44 = pVar.f2523a;
                        int T3 = J.E.T(e5, i44);
                        int i45 = pVar.f2524b;
                        if (i43 != T3 || e5.f2536m != J.E.T(e5, i45)) {
                            StringBuilder sb5 = new StringBuilder();
                            int i46 = 0;
                            for (int i47 = 0; i47 < i44; i47++) {
                                if (((1 << i47) & e5.f2535l) != 0) {
                                    if (i46 > 0) {
                                        sb5.append(", ");
                                    }
                                    sb5.append(pVar.b(i47));
                                    i46++;
                                }
                            }
                            String sb6 = sb5.toString();
                            StringBuilder m4 = AbstractC0080b.m(sb6, "StringBuilder().apply(builderAction).toString()");
                            int i48 = 0;
                            int i49 = 0;
                            while (i48 < i45) {
                                int i50 = i45;
                                if (((1 << i48) & e5.f2536m) != 0) {
                                    if (i46 > 0) {
                                        m4.append(", ");
                                    }
                                    m4.append(pVar.c(i48));
                                    i49++;
                                }
                                i48++;
                                i45 = i50;
                            }
                            String sb7 = m4.toString();
                            Z1.i.e(sb7, "StringBuilder().apply(builderAction).toString()");
                            StringBuilder sb8 = new StringBuilder("Error while pushing ");
                            sb8.append(pVar);
                            sb8.append(". Not all arguments were provided. Missing ");
                            AbstractC0080b.t(sb8, i46, " int arguments (", sb6, ") and ");
                            AbstractC0080b.u(sb8, i49, " object arguments (", sb7, ").");
                            throw null;
                        }
                    }
                    c0113p = this;
                    c0113p.P(obj2, z3);
                }
                c0108m0 = null;
                c0113p.t(z3, c0108m0);
                return;
            }
            rotateLeft = i8 ^ Integer.rotateLeft(Integer.rotateLeft(c0113p.f2306P, 3) ^ i3, 3);
        }
        c0113p.f2306P = rotateLeft;
        if (obj4 == null) {
        }
        if (i4 == 0) {
        }
        if (!c0113p.f2305O) {
        }
    }

    public final void N() {
        M(-127, 0, null, null);
    }

    public final void O(int i3, C0090d0 c0090d0) {
        M(i3, 0, c0090d0, null);
    }

    public final void P(Object obj, boolean z3) {
        if (z3) {
            F0 f02 = this.f2296F;
            if (f02.f2111k <= 0) {
                if (C0089d.m(f02.f2102b, f02.f2107g)) {
                    f02.n();
                    return;
                } else {
                    C0089d.R("Expected a node group");
                    throw null;
                }
            }
            return;
        }
        if (obj != null && this.f2296F.e() != obj) {
            C0135b c0135b = this.f2302L;
            c0135b.getClass();
            c0135b.d(false);
            C0134a c0134a = c0135b.f2539b;
            c0134a.getClass();
            J.y yVar = J.y.f2577c;
            J.E e3 = c0134a.f2537f;
            e3.a0(yVar);
            I2.d.L(e3, 0, obj);
            int i3 = e3.f2535l;
            int i4 = yVar.f2523a;
            int T2 = J.E.T(e3, i4);
            int i5 = yVar.f2524b;
            if (i3 != T2 || e3.f2536m != J.E.T(e3, i5)) {
                StringBuilder sb = new StringBuilder();
                int i6 = 0;
                for (int i7 = 0; i7 < i4; i7++) {
                    if (((1 << i7) & e3.f2535l) != 0) {
                        if (i6 > 0) {
                            sb.append(", ");
                        }
                        sb.append(yVar.b(i7));
                        i6++;
                    }
                }
                String sb2 = sb.toString();
                StringBuilder m3 = AbstractC0080b.m(sb2, "StringBuilder().apply(builderAction).toString()");
                int i8 = 0;
                for (int i9 = 0; i9 < i5; i9++) {
                    if (((1 << i9) & e3.f2536m) != 0) {
                        if (i6 > 0) {
                            m3.append(", ");
                        }
                        m3.append(yVar.c(i9));
                        i8++;
                    }
                }
                String sb3 = m3.toString();
                Z1.i.e(sb3, "StringBuilder().apply(builderAction).toString()");
                StringBuilder sb4 = new StringBuilder("Error while pushing ");
                sb4.append(yVar);
                sb4.append(". Not all arguments were provided. Missing ");
                AbstractC0080b.t(sb4, i6, " int arguments (", sb2, ") and ");
                AbstractC0080b.u(sb4, i8, " object arguments (", sb3, ").");
                throw null;
            }
        }
        this.f2296F.n();
    }

    public final void Q(int i3) {
        int i4;
        int i5;
        if (this.f2315i != null) {
            M(i3, 0, null, null);
            return;
        }
        if (this.f2322q) {
            C0089d.w("A call to createNode(), emitNode() or useNode() expected");
            throw null;
        }
        this.f2306P = this.f2318l ^ Integer.rotateLeft(Integer.rotateLeft(this.f2306P, 3) ^ i3, 3);
        this.f2318l++;
        F0 f02 = this.f2296F;
        boolean z3 = this.f2305O;
        X x3 = C0105l.f2272a;
        if (z3) {
            f02.f2111k++;
            this.f2298H.I(i3, x3, false, x3);
            t(false, null);
            return;
        }
        if (f02.f() == i3 && ((i5 = f02.f2107g) >= f02.f2108h || !C0089d.l(f02.f2102b, i5))) {
            f02.n();
            t(false, null);
            return;
        }
        if (f02.f2111k <= 0 && (i4 = f02.f2107g) != f02.f2108h) {
            int i6 = this.f2316j;
            D();
            this.f2302L.e(i6, f02.l());
            C0089d.q(this.f2323r, i4, f02.f2107g);
        }
        f02.f2111k++;
        this.f2305O = true;
        this.f2300J = null;
        if (this.f2298H.f2154w) {
            I0 i7 = this.f2297G.i();
            this.f2298H = i7;
            i7.D();
            this.f2299I = false;
            this.f2300J = null;
        }
        I0 i02 = this.f2298H;
        i02.d();
        int i8 = i02.f2151t;
        i02.I(i3, x3, false, x3);
        this.f2303M = i02.b(i8);
        t(false, null);
    }

    public final void R(int i3) {
        M(i3, 0, null, null);
    }

    public final C0113p S(int i3) {
        C0119s0 c0119s0;
        Q(i3);
        boolean z3 = this.f2305O;
        C0122u c0122u = this.f2313g;
        A2.n nVar = this.D;
        if (z3) {
            C0119s0 c0119s02 = new C0119s0(c0122u);
            nVar.f118a.add(c0119s02);
            b0(c0119s02);
            c0119s02.f2348e = this.f2294A;
            c0119s02.f2344a &= -17;
        } else {
            ArrayList arrayList = this.f2323r;
            int E3 = C0089d.E(this.f2296F.f2109i, arrayList);
            P p = E3 >= 0 ? (P) arrayList.remove(E3) : null;
            Object h3 = this.f2296F.h();
            if (Z1.i.a(h3, C0105l.f2272a)) {
                c0119s0 = new C0119s0(c0122u);
                b0(c0119s0);
            } else {
                Z1.i.d(h3, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
                c0119s0 = (C0119s0) h3;
            }
            if (p == null) {
                int i4 = c0119s0.f2344a;
                boolean z4 = (i4 & 64) != 0;
                if (z4) {
                    c0119s0.f2344a = i4 & (-65);
                }
                if (!z4) {
                    c0119s0.f2344a &= -9;
                    nVar.f118a.add(c0119s0);
                    c0119s0.f2348e = this.f2294A;
                    c0119s0.f2344a &= -17;
                }
            }
            c0119s0.f2344a |= 8;
            nVar.f118a.add(c0119s0);
            c0119s0.f2348e = this.f2294A;
            c0119s0.f2344a &= -17;
        }
        return this;
    }

    public final void T(Object obj) {
        if (!this.f2305O && this.f2296F.f() == 207 && !Z1.i.a(this.f2296F.e(), obj) && this.f2330y < 0) {
            this.f2330y = this.f2296F.f2107g;
            this.f2329x = true;
        }
        M(207, 0, null, obj);
    }

    public final void U() {
        M(125, 2, null, null);
        this.f2322q = true;
    }

    public final void V() {
        this.f2318l = 0;
        G0 g02 = this.f2309c;
        this.f2296F = g02.d();
        M(100, 0, null, null);
        r rVar = this.f2308b;
        rVar.m();
        this.f2325t = rVar.f();
        this.f2328w.b(this.f2327v ? 1 : 0);
        this.f2327v = f(this.f2325t);
        this.f2300J = null;
        if (!this.p) {
            this.p = rVar.d();
        }
        if (!this.B) {
            this.B = rVar.e();
        }
        Set set = (Set) C0089d.K(this.f2325t, T.b.f3278a);
        if (set != null) {
            set.add(g02);
            rVar.j(set);
        }
        M(rVar.g(), 0, null, null);
    }

    public final boolean W(C0119s0 c0119s0, Object obj) {
        C0087c c0087c = c0119s0.f2346c;
        if (c0087c == null) {
            return false;
        }
        int b2 = this.f2296F.f2101a.b(c0087c);
        if (!this.f2295E || b2 < this.f2296F.f2107g) {
            return false;
        }
        ArrayList arrayList = this.f2323r;
        int E3 = C0089d.E(b2, arrayList);
        if (E3 < 0) {
            int i3 = -(E3 + 1);
            if (!(obj instanceof G)) {
                obj = null;
            }
            arrayList.add(i3, new P(c0119s0, b2, obj));
        } else {
            P p = (P) arrayList.get(E3);
            if (obj instanceof G) {
                Object obj2 = p.f2176c;
                if (obj2 == null) {
                    p.f2176c = obj;
                } else if (obj2 instanceof C0475A) {
                    ((C0475A) obj2).a(obj);
                } else {
                    int i4 = AbstractC0479E.f5137a;
                    C0475A c0475a = new C0475A(2);
                    c0475a.f5130b[c0475a.d(obj2)] = obj2;
                    c0475a.f5130b[c0475a.d(obj)] = obj;
                    p.f2176c = c0475a;
                }
            } else {
                p.f2176c = null;
            }
        }
        return true;
    }

    public final void X(int i3, int i4) {
        if (c0(i3) != i4) {
            if (i3 < 0) {
                C0496n c0496n = this.f2321o;
                if (c0496n == null) {
                    c0496n = new C0496n();
                    this.f2321o = c0496n;
                }
                c0496n.f(i3, i4);
                return;
            }
            int[] iArr = this.f2320n;
            if (iArr == null) {
                int i5 = this.f2296F.f2103c;
                int[] iArr2 = new int[i5];
                Arrays.fill(iArr2, 0, i5, -1);
                this.f2320n = iArr2;
                iArr = iArr2;
            }
            iArr[i3] = i4;
        }
    }

    public final void Y(int i3, int i4) {
        int c02 = c0(i3);
        if (c02 != i4) {
            int i5 = i4 - c02;
            A2.n nVar = this.f2314h;
            int size = nVar.f118a.size() - 1;
            while (i3 != -1) {
                int c03 = c0(i3) + i5;
                X(i3, c03);
                int i6 = size;
                while (true) {
                    if (-1 < i6) {
                        C0108m0 c0108m0 = (C0108m0) nVar.f118a.get(i6);
                        if (c0108m0 != null && c0108m0.a(i3, c03)) {
                            size = i6 - 1;
                            break;
                        }
                        i6--;
                    } else {
                        break;
                    }
                }
                if (i3 < 0) {
                    i3 = this.f2296F.f2109i;
                } else if (C0089d.m(this.f2296F.f2102b, i3)) {
                    return;
                } else {
                    i3 = C0089d.p(this.f2296F.f2102b, i3);
                }
            }
        }
    }

    public final Q.d Z(InterfaceC0110n0 interfaceC0110n0, Q.d dVar) {
        Q.d dVar2 = (Q.d) interfaceC0110n0;
        dVar2.getClass();
        Q.c cVar = new Q.c(dVar2);
        cVar.putAll(dVar);
        Q.d a3 = cVar.a();
        O(204, C0089d.f2241d);
        z();
        b0(a3);
        z();
        b0(dVar);
        p(false);
        return a3;
    }

    public final void a() {
        i();
        this.f2314h.f118a.clear();
        this.f2319m.f2171b = 0;
        this.f2324s.f2171b = 0;
        this.f2328w.f2171b = 0;
        this.f2326u = null;
        C0136c c0136c = this.f2304N;
        c0136c.f2551g.U();
        c0136c.f2550f.U();
        this.f2306P = 0;
        this.f2331z = 0;
        this.f2322q = false;
        this.f2305O = false;
        this.f2329x = false;
        this.f2295E = false;
        this.f2330y = -1;
        F0 f02 = this.f2296F;
        if (!f02.f2106f) {
            f02.c();
        }
        if (this.f2298H.f2154w) {
            return;
        }
        u();
    }

    public final void a0(Object obj) {
        int i3;
        F0 f02;
        int i4;
        I0 i02;
        if (obj instanceof B0) {
            C0087c c0087c = null;
            if (this.f2305O) {
                C0134a c0134a = this.f2302L.f2539b;
                c0134a.getClass();
                J.r rVar = J.r.f2570c;
                J.E e3 = c0134a.f2537f;
                e3.a0(rVar);
                I2.d.L(e3, 0, (B0) obj);
                int i5 = e3.f2535l;
                int i6 = rVar.f2523a;
                int T2 = J.E.T(e3, i6);
                int i7 = rVar.f2524b;
                if (i5 != T2 || e3.f2536m != J.E.T(e3, i7)) {
                    StringBuilder sb = new StringBuilder();
                    int i8 = 0;
                    for (int i9 = 0; i9 < i6; i9++) {
                        if (((1 << i9) & e3.f2535l) != 0) {
                            if (i8 > 0) {
                                sb.append(", ");
                            }
                            sb.append(rVar.b(i9));
                            i8++;
                        }
                    }
                    String sb2 = sb.toString();
                    StringBuilder m3 = AbstractC0080b.m(sb2, "StringBuilder().apply(builderAction).toString()");
                    int i10 = 0;
                    for (int i11 = 0; i11 < i7; i11++) {
                        if (((1 << i11) & e3.f2536m) != 0) {
                            if (i8 > 0) {
                                m3.append(", ");
                            }
                            m3.append(rVar.c(i11));
                            i10++;
                        }
                    }
                    String sb3 = m3.toString();
                    Z1.i.e(sb3, "StringBuilder().apply(builderAction).toString()");
                    StringBuilder sb4 = new StringBuilder("Error while pushing ");
                    sb4.append(rVar);
                    sb4.append(". Not all arguments were provided. Missing ");
                    AbstractC0080b.t(sb4, i8, " int arguments (", sb2, ") and ");
                    AbstractC0080b.u(sb4, i10, " object arguments (", sb3, ").");
                    throw null;
                }
            }
            this.f2310d.add(obj);
            B0 b02 = (B0) obj;
            if (this.f2305O) {
                I0 i03 = this.f2298H;
                int i12 = i03.f2151t;
                if (i12 > i03.f2153v + 1) {
                    int i13 = i12 - 1;
                    int x3 = i03.x(i03.f2134b, i13);
                    while (true) {
                        i4 = i13;
                        i13 = x3;
                        i02 = this.f2298H;
                        if (i13 == i02.f2153v || i13 < 0) {
                            break;
                        } else {
                            x3 = i02.x(i02.f2134b, i13);
                        }
                    }
                    c0087c = i02.b(i4);
                }
            } else {
                F0 f03 = this.f2296F;
                int i14 = f03.f2107g;
                if (i14 > f03.f2109i + 1) {
                    int i15 = i14 - 1;
                    int i16 = f03.f2102b[(i15 * 5) + 2];
                    while (true) {
                        i3 = i15;
                        i15 = i16;
                        f02 = this.f2296F;
                        if (i15 == f02.f2109i || i15 < 0) {
                            break;
                        } else {
                            i16 = f02.f2102b[(i15 * 5) + 2];
                        }
                    }
                    c0087c = f02.a(i3);
                }
            }
            C0 c02 = new C0();
            c02.f2083a = b02;
            c02.f2084b = c0087c;
            obj = c02;
        }
        b0(obj);
    }

    public final void b(Object obj, Y1.e eVar) {
        int i3 = 0;
        if (this.f2305O) {
            C0136c c0136c = this.f2304N;
            c0136c.getClass();
            J.z zVar = J.z.f2578c;
            J.E e3 = c0136c.f2550f;
            e3.a0(zVar);
            I2.d.L(e3, 0, obj);
            Z1.i.d(eVar, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
            Z1.w.d(2, eVar);
            I2.d.L(e3, 1, eVar);
            int i4 = e3.f2535l;
            int i5 = zVar.f2523a;
            int T2 = J.E.T(e3, i5);
            int i6 = zVar.f2524b;
            if (i4 == T2 && e3.f2536m == J.E.T(e3, i6)) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            int i7 = 0;
            while (i7 < i5) {
                int i8 = i5;
                if (((1 << i7) & e3.f2535l) != 0) {
                    if (i3 > 0) {
                        sb.append(", ");
                    }
                    sb.append(zVar.b(i7));
                    i3++;
                }
                i7++;
                i5 = i8;
            }
            String sb2 = sb.toString();
            StringBuilder m3 = AbstractC0080b.m(sb2, "StringBuilder().apply(builderAction).toString()");
            int i9 = 0;
            int i10 = 0;
            while (i10 < i6) {
                int i11 = i6;
                if (((1 << i10) & e3.f2536m) != 0) {
                    if (i3 > 0) {
                        m3.append(", ");
                    }
                    m3.append(zVar.c(i10));
                    i9++;
                }
                i10++;
                i6 = i11;
            }
            String sb3 = m3.toString();
            Z1.i.e(sb3, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb4 = new StringBuilder("Error while pushing ");
            sb4.append(zVar);
            sb4.append(". Not all arguments were provided. Missing ");
            AbstractC0080b.t(sb4, i3, " int arguments (", sb2, ") and ");
            AbstractC0080b.u(sb4, i9, " object arguments (", sb3, ").");
            throw null;
        }
        C0135b c0135b = this.f2302L;
        c0135b.b();
        C0134a c0134a = c0135b.f2539b;
        c0134a.getClass();
        J.z zVar2 = J.z.f2578c;
        J.E e4 = c0134a.f2537f;
        e4.a0(zVar2);
        int i12 = 0;
        I2.d.L(e4, 0, obj);
        Z1.i.d(eVar, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
        Z1.w.d(2, eVar);
        I2.d.L(e4, 1, eVar);
        int i13 = e4.f2535l;
        int i14 = zVar2.f2523a;
        int T3 = J.E.T(e4, i14);
        int i15 = zVar2.f2524b;
        if (i13 == T3 && e4.f2536m == J.E.T(e4, i15)) {
            return;
        }
        StringBuilder sb5 = new StringBuilder();
        for (int i16 = 0; i16 < i14; i16++) {
            if (((1 << i16) & e4.f2535l) != 0) {
                if (i12 > 0) {
                    sb5.append(", ");
                }
                sb5.append(zVar2.b(i16));
                i12++;
            }
        }
        String sb6 = sb5.toString();
        StringBuilder m4 = AbstractC0080b.m(sb6, "StringBuilder().apply(builderAction).toString()");
        int i17 = 0;
        int i18 = 0;
        while (i17 < i15) {
            int i19 = i15;
            if (((1 << i17) & e4.f2536m) != 0) {
                if (i12 > 0) {
                    m4.append(", ");
                }
                m4.append(zVar2.c(i17));
                i18++;
            }
            i17++;
            i15 = i19;
        }
        String sb7 = m4.toString();
        Z1.i.e(sb7, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb8 = new StringBuilder("Error while pushing ");
        sb8.append(zVar2);
        sb8.append(". Not all arguments were provided. Missing ");
        AbstractC0080b.t(sb8, i12, " int arguments (", sb6, ") and ");
        AbstractC0080b.u(sb8, i18, " object arguments (", sb7, ").");
        throw null;
    }

    public final void b0(Object obj) {
        int i3;
        int i4;
        if (this.f2305O) {
            I0 i02 = this.f2298H;
            if (i02.f2146n <= 0 || i02.f2141i == i02.f2143k) {
                i02.y(obj);
                return;
            }
            C0498p c0498p = i02.f2150s;
            if (c0498p == null) {
                c0498p = new C0498p();
            }
            i02.f2150s = c0498p;
            int i5 = i02.f2153v;
            Object f3 = c0498p.f(i5);
            if (f3 == null) {
                f3 = new C0504v();
                c0498p.i(i5, f3);
            }
            ((C0504v) f3).a(obj);
            return;
        }
        F0 f02 = this.f2296F;
        boolean z3 = f02.f2114n;
        int i6 = 1;
        C0135b c0135b = this.f2302L;
        if (!z3) {
            C0087c a3 = f02.a(f02.f2109i);
            C0134a c0134a = c0135b.f2539b;
            c0134a.getClass();
            C0138e c0138e = C0138e.f2553c;
            J.E e3 = c0134a.f2537f;
            e3.a0(c0138e);
            int i7 = 0;
            I2.d.L(e3, 0, a3);
            I2.d.L(e3, 1, obj);
            int i8 = e3.f2535l;
            int i9 = c0138e.f2523a;
            int T2 = J.E.T(e3, i9);
            int i10 = c0138e.f2524b;
            if (i8 == T2 && e3.f2536m == J.E.T(e3, i10)) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            int i11 = 0;
            while (i11 < i9) {
                if (((i6 << i11) & e3.f2535l) != 0) {
                    if (i7 > 0) {
                        sb.append(", ");
                    }
                    sb.append(c0138e.b(i11));
                    i7++;
                }
                i11++;
                i6 = 1;
            }
            String sb2 = sb.toString();
            StringBuilder m3 = AbstractC0080b.m(sb2, "StringBuilder().apply(builderAction).toString()");
            int i12 = 0;
            int i13 = 0;
            while (i12 < i10) {
                int i14 = i10;
                if (((1 << i12) & e3.f2536m) != 0) {
                    if (i7 > 0) {
                        m3.append(", ");
                    }
                    m3.append(c0138e.c(i12));
                    i13++;
                }
                i12++;
                i10 = i14;
            }
            String sb3 = m3.toString();
            Z1.i.e(sb3, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb4 = new StringBuilder("Error while pushing ");
            sb4.append(c0138e);
            sb4.append(". Not all arguments were provided. Missing ");
            AbstractC0080b.t(sb4, i7, " int arguments (", sb2, ") and ");
            AbstractC0080b.u(sb4, i13, " object arguments (", sb3, ").");
            throw null;
        }
        int r3 = (f02.f2112l - C0089d.r(f02.f2102b, f02.f2109i)) - 1;
        if (c0135b.f2538a.f2296F.f2109i - c0135b.f2543f >= 0) {
            c0135b.d(true);
            C0134a c0134a2 = c0135b.f2539b;
            J.m mVar = J.m.f2564g;
            J.E e4 = c0134a2.f2537f;
            e4.a0(mVar);
            I2.d.L(e4, 0, obj);
            I2.d.K(e4, 0, r3);
            if (e4.f2535l == J.E.T(e4, 1) && e4.f2536m == J.E.T(e4, 1)) {
                return;
            }
            StringBuilder sb5 = new StringBuilder();
            if ((e4.f2535l & 1) != 0) {
                sb5.append(mVar.b(0));
                i3 = 1;
            } else {
                i3 = 0;
            }
            String sb6 = sb5.toString();
            StringBuilder m4 = AbstractC0080b.m(sb6, "StringBuilder().apply(builderAction).toString()");
            if ((e4.f2536m & 1) != 0) {
                if (i3 > 0) {
                    m4.append(", ");
                }
                m4.append(mVar.c(0));
            } else {
                i6 = 0;
            }
            String sb7 = m4.toString();
            Z1.i.e(sb7, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb8 = new StringBuilder("Error while pushing ");
            sb8.append(mVar);
            sb8.append(". Not all arguments were provided. Missing ");
            AbstractC0080b.t(sb8, i3, " int arguments (", sb6, ") and ");
            AbstractC0080b.u(sb8, i6, " object arguments (", sb7, ").");
            throw null;
        }
        F0 f03 = this.f2296F;
        C0087c a4 = f03.a(f03.f2109i);
        C0134a c0134a3 = c0135b.f2539b;
        J.m mVar2 = J.m.f2563f;
        J.E e5 = c0134a3.f2537f;
        e5.a0(mVar2);
        I2.d.L(e5, 0, obj);
        I2.d.L(e5, 1, a4);
        I2.d.K(e5, 0, r3);
        if (e5.f2535l == J.E.T(e5, 1) && e5.f2536m == J.E.T(e5, 2)) {
            return;
        }
        StringBuilder sb9 = new StringBuilder();
        if ((e5.f2535l & 1) != 0) {
            sb9.append(mVar2.b(0));
            i4 = 1;
        } else {
            i4 = 0;
        }
        String sb10 = sb9.toString();
        StringBuilder m5 = AbstractC0080b.m(sb10, "StringBuilder().apply(builderAction).toString()");
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 2; i15 < i17; i17 = 2) {
            if (((1 << i15) & e5.f2536m) != 0) {
                if (i4 > 0) {
                    m5.append(", ");
                }
                m5.append(mVar2.c(i15));
                i16++;
            }
            i15++;
        }
        String sb11 = m5.toString();
        Z1.i.e(sb11, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb12 = new StringBuilder("Error while pushing ");
        sb12.append(mVar2);
        sb12.append(". Not all arguments were provided. Missing ");
        AbstractC0080b.t(sb12, i4, " int arguments (", sb10, ") and ");
        AbstractC0080b.u(sb12, i16, " object arguments (", sb11, ").");
        throw null;
    }

    public final boolean c(float f3) {
        Object z3 = z();
        if ((z3 instanceof Float) && f3 == ((Number) z3).floatValue()) {
            return false;
        }
        b0(Float.valueOf(f3));
        return true;
    }

    public final int c0(int i3) {
        int i4;
        if (i3 >= 0) {
            int[] iArr = this.f2320n;
            return (iArr == null || (i4 = iArr[i3]) < 0) ? C0089d.o(this.f2296F.f2102b, i3) : i4;
        }
        C0496n c0496n = this.f2321o;
        if (c0496n == null || c0496n.c(i3) < 0) {
            return 0;
        }
        return c0496n.d(i3);
    }

    public final boolean d(int i3) {
        Object z3 = z();
        if ((z3 instanceof Integer) && i3 == ((Number) z3).intValue()) {
            return false;
        }
        b0(Integer.valueOf(i3));
        return true;
    }

    public final void d0() {
        if (!this.f2322q) {
            C0089d.w("A call to createNode(), emitNode() or useNode() expected was not expected");
            throw null;
        }
        this.f2322q = false;
        if (this.f2305O) {
            C0089d.w("useNode() called while inserting");
            throw null;
        }
        F0 f02 = this.f2296F;
        Object i3 = f02.i(f02.f2109i);
        C0135b c0135b = this.f2302L;
        c0135b.c();
        c0135b.f2545h.f118a.add(i3);
        if (this.f2329x && (i3 instanceof InterfaceC0101j)) {
            c0135b.b();
            C0134a c0134a = c0135b.f2539b;
            c0134a.getClass();
            if (i3 instanceof InterfaceC0101j) {
                c0134a.f2537f.Z(J.B.f2522c);
            }
        }
    }

    public final boolean e(long j3) {
        Object z3 = z();
        if ((z3 instanceof Long) && j3 == ((Number) z3).longValue()) {
            return false;
        }
        b0(Long.valueOf(j3));
        return true;
    }

    public final boolean f(Object obj) {
        if (Z1.i.a(z(), obj)) {
            return false;
        }
        b0(obj);
        return true;
    }

    public final boolean g(boolean z3) {
        Object z4 = z();
        if ((z4 instanceof Boolean) && z3 == ((Boolean) z4).booleanValue()) {
            return false;
        }
        b0(Boolean.valueOf(z3));
        return true;
    }

    public final boolean h(Object obj) {
        if (z() == obj) {
            return false;
        }
        b0(obj);
        return true;
    }

    public final void i() {
        this.f2315i = null;
        this.f2316j = 0;
        this.f2317k = 0;
        this.f2306P = 0;
        this.f2322q = false;
        C0135b c0135b = this.f2302L;
        c0135b.f2540c = false;
        c0135b.f2541d.f2171b = 0;
        c0135b.f2543f = 0;
        this.D.f118a.clear();
        this.f2320n = null;
        this.f2321o = null;
    }

    public final int j(int i3, int i4, int i5, int i6) {
        int i7;
        Object b2;
        if (i3 == i5) {
            return i6;
        }
        F0 f02 = this.f2296F;
        boolean l3 = C0089d.l(f02.f2102b, i3);
        int[] iArr = f02.f2102b;
        if (l3) {
            Object j3 = f02.j(iArr, i3);
            i7 = j3 != null ? j3 instanceof Enum ? ((Enum) j3).ordinal() : j3.hashCode() : 0;
        } else {
            int i8 = iArr[i3 * 5];
            if (i8 == 207 && (b2 = f02.b(iArr, i3)) != null && !b2.equals(C0105l.f2272a)) {
                i8 = b2.hashCode();
            }
            i7 = i8;
        }
        if (i7 == 126665345) {
            return i7;
        }
        int i9 = this.f2296F.f2102b[(i3 * 5) + 2];
        if (i9 != i5) {
            i6 = j(i9, A(i9), i5, i6);
        }
        if (C0089d.l(this.f2296F.f2102b, i3)) {
            i4 = 0;
        }
        return Integer.rotateLeft(Integer.rotateLeft(i6, 3) ^ i7, 3) ^ i4;
    }

    public final Object k(AbstractC0114p0 abstractC0114p0) {
        return C0089d.K(m(), abstractC0114p0);
    }

    public final void l(C0906n c0906n) {
        int i3;
        int i4;
        int i5;
        if (!this.f2322q) {
            C0089d.w("A call to createNode(), emitNode() or useNode() expected was not expected");
            throw null;
        }
        this.f2322q = false;
        if (!this.f2305O) {
            C0089d.w("createNode() can only be called when inserting");
            throw null;
        }
        O o3 = this.f2319m;
        int i6 = o3.f2170a[o3.f2171b - 1];
        I0 i02 = this.f2298H;
        C0087c b2 = i02.b(i02.f2153v);
        this.f2317k++;
        C0136c c0136c = this.f2304N;
        J.m mVar = J.m.f2561d;
        J.E e3 = c0136c.f2550f;
        e3.a0(mVar);
        I2.d.L(e3, 0, c0906n);
        I2.d.K(e3, 0, i6);
        I2.d.L(e3, 1, b2);
        if (!(e3.f2535l == J.E.T(e3, 1) && e3.f2536m == J.E.T(e3, 2))) {
            StringBuilder sb = new StringBuilder();
            if ((e3.f2535l & 1) != 0) {
                sb.append(mVar.b(0));
                i5 = 1;
            } else {
                i5 = 0;
            }
            String sb2 = sb.toString();
            StringBuilder m3 = AbstractC0080b.m(sb2, "StringBuilder().apply(builderAction).toString()");
            int i7 = 0;
            for (int i8 = 0; i8 < 2; i8++) {
                if (((1 << i8) & e3.f2536m) != 0) {
                    if (i5 > 0) {
                        m3.append(", ");
                    }
                    m3.append(mVar.c(i8));
                    i7++;
                }
            }
            String sb3 = m3.toString();
            Z1.i.e(sb3, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb4 = new StringBuilder("Error while pushing ");
            sb4.append(mVar);
            sb4.append(". Not all arguments were provided. Missing ");
            AbstractC0080b.t(sb4, i5, " int arguments (", sb2, ") and ");
            AbstractC0080b.u(sb4, i7, " object arguments (", sb3, ").");
            throw null;
        }
        J.m mVar2 = J.m.f2562e;
        J.E e4 = c0136c.f2551g;
        e4.a0(mVar2);
        I2.d.K(e4, 0, i6);
        I2.d.L(e4, 0, b2);
        if (e4.f2535l == J.E.T(e4, 1) && e4.f2536m == J.E.T(e4, 1)) {
            return;
        }
        StringBuilder sb5 = new StringBuilder();
        if ((e4.f2535l & 1) != 0) {
            sb5.append(mVar2.b(0));
            i3 = 1;
        } else {
            i3 = 0;
        }
        String sb6 = sb5.toString();
        StringBuilder m4 = AbstractC0080b.m(sb6, "StringBuilder().apply(builderAction).toString()");
        if ((e4.f2536m & 1) != 0) {
            if (i3 > 0) {
                m4.append(", ");
            }
            m4.append(mVar2.c(0));
            i4 = 1;
        } else {
            i4 = 0;
        }
        String sb7 = m4.toString();
        Z1.i.e(sb7, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb8 = new StringBuilder("Error while pushing ");
        sb8.append(mVar2);
        sb8.append(". Not all arguments were provided. Missing ");
        AbstractC0080b.t(sb8, i3, " int arguments (", sb6, ") and ");
        AbstractC0080b.u(sb8, i4, " object arguments (", sb7, ").");
        throw null;
    }

    public final InterfaceC0110n0 m() {
        InterfaceC0110n0 interfaceC0110n0;
        InterfaceC0110n0 interfaceC0110n02;
        Object obj;
        Object obj2;
        InterfaceC0110n0 interfaceC0110n03 = this.f2300J;
        if (interfaceC0110n03 != null) {
            return interfaceC0110n03;
        }
        int i3 = this.f2296F.f2109i;
        boolean z3 = this.f2305O;
        C0090d0 c0090d0 = C0089d.f2240c;
        if (z3 && this.f2299I) {
            int i4 = this.f2298H.f2153v;
            while (i4 > 0) {
                I0 i02 = this.f2298H;
                if (i02.f2134b[i02.p(i4) * 5] == 202) {
                    I0 i03 = this.f2298H;
                    int p = i03.p(i4);
                    if (C0089d.l(i03.f2134b, p)) {
                        Object[] objArr = i03.f2135c;
                        int[] iArr = i03.f2134b;
                        int i5 = p * 5;
                        obj = objArr[C0089d.y(iArr[i5 + 1] >> 30) + iArr[i5 + 4]];
                    } else {
                        obj = null;
                    }
                    if (Z1.i.a(obj, c0090d0)) {
                        I0 i04 = this.f2298H;
                        int p3 = i04.p(i4);
                        if (C0089d.k(i04.f2134b, p3)) {
                            Object[] objArr2 = i04.f2135c;
                            int[] iArr2 = i04.f2134b;
                            obj2 = objArr2[C0089d.y(iArr2[(p3 * 5) + 1] >> 29) + i04.f(iArr2, p3)];
                        } else {
                            obj2 = C0105l.f2272a;
                        }
                        Z1.i.d(obj2, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                        InterfaceC0110n0 interfaceC0110n04 = (InterfaceC0110n0) obj2;
                        this.f2300J = interfaceC0110n04;
                        return interfaceC0110n04;
                    }
                }
                I0 i05 = this.f2298H;
                i4 = i05.x(i05.f2134b, i4);
            }
        }
        if (this.f2296F.f2103c > 0) {
            while (i3 > 0) {
                F0 f02 = this.f2296F;
                int i6 = i3 * 5;
                int[] iArr3 = f02.f2102b;
                if (iArr3[i6] == 202 && Z1.i.a(f02.j(iArr3, i3), c0090d0)) {
                    A2.g gVar = this.f2326u;
                    if (gVar == null || (interfaceC0110n02 = (InterfaceC0110n0) ((SparseArray) gVar.f83b).get(i3)) == null) {
                        F0 f03 = this.f2296F;
                        Object b2 = f03.b(f03.f2102b, i3);
                        Z1.i.d(b2, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                        interfaceC0110n0 = (InterfaceC0110n0) b2;
                    } else {
                        interfaceC0110n0 = interfaceC0110n02;
                    }
                    this.f2300J = interfaceC0110n0;
                    return interfaceC0110n0;
                }
                i3 = this.f2296F.f2102b[i6 + 2];
            }
        }
        InterfaceC0110n0 interfaceC0110n05 = this.f2325t;
        this.f2300J = interfaceC0110n05;
        return interfaceC0110n05;
    }

    public final void n(A2.g gVar, Q.a aVar) {
        int i3;
        if (this.f2295E) {
            C0089d.w("Reentrant composition is not supported");
            throw null;
        }
        Trace.beginSection("Compose:recompose");
        try {
            this.f2294A = S.q.k().d();
            this.f2326u = null;
            C0506x c0506x = (C0506x) gVar.f83b;
            Object[] objArr = c0506x.f5227b;
            Object[] objArr2 = c0506x.f5228c;
            long[] jArr = c0506x.f5226a;
            int length = jArr.length - 2;
            ArrayList arrayList = this.f2323r;
            if (length >= 0) {
                int i4 = 0;
                while (true) {
                    long j3 = jArr[i4];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i5 = 8;
                        int i6 = 8 - ((~(i4 - length)) >>> 31);
                        int i7 = 0;
                        while (i7 < i6) {
                            if ((j3 & 255) < 128) {
                                int i8 = (i4 << 3) + i7;
                                Object obj = objArr[i8];
                                Object obj2 = objArr2[i8];
                                Z1.i.d(obj, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
                                C0087c c0087c = ((C0119s0) obj).f2346c;
                                if (c0087c != null) {
                                    int i9 = c0087c.f2237a;
                                    C0119s0 c0119s0 = (C0119s0) obj;
                                    if (obj2 == X.f2227h) {
                                        obj2 = null;
                                    }
                                    arrayList.add(new P(c0119s0, i9, obj2));
                                }
                                i3 = 8;
                            } else {
                                i3 = i5;
                            }
                            j3 >>= i3;
                            i7++;
                            i5 = i3;
                        }
                        if (i6 != i5) {
                            break;
                        }
                    }
                    if (i4 == length) {
                        break;
                    } else {
                        i4++;
                    }
                }
            }
            M1.q.h0(arrayList, C0089d.f2243f);
            this.f2316j = 0;
            this.f2295E = true;
            try {
                V();
                Object z3 = z();
                if (z3 != aVar && aVar != null) {
                    b0(aVar);
                }
                C0111o c0111o = this.C;
                K.d C = C0089d.C();
                try {
                    C.b(c0111o);
                    C0090d0 c0090d0 = C0089d.f2238a;
                    if (aVar != null) {
                        O(200, c0090d0);
                        C0089d.G(this, aVar);
                        p(false);
                    } else if (!this.f2327v || z3 == null || z3.equals(C0105l.f2272a)) {
                        J();
                    } else {
                        O(200, c0090d0);
                        Z1.w.d(2, z3);
                        C0089d.G(this, (Y1.e) z3);
                        p(false);
                    }
                    C.o(C.f2642f - 1);
                    s();
                    this.f2295E = false;
                    arrayList.clear();
                    C0089d.O(this.f2298H.f2154w);
                    u();
                    Trace.endSection();
                } finally {
                    C.o(C.f2642f - 1);
                }
            } catch (Throwable th) {
                this.f2295E = false;
                arrayList.clear();
                a();
                C0089d.O(this.f2298H.f2154w);
                u();
                throw th;
            }
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public final void o(int i3, int i4) {
        if (i3 <= 0 || i3 == i4) {
            return;
        }
        o(this.f2296F.f2102b[(i3 * 5) + 2], i4);
        if (C0089d.m(this.f2296F.f2102b, i3)) {
            Object i5 = this.f2296F.i(i3);
            C0135b c0135b = this.f2302L;
            c0135b.c();
            c0135b.f2545h.f118a.add(i5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:155:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0624  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x064f  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0847  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p(boolean z3) {
        int hashCode;
        O o3;
        int i3;
        ArrayList arrayList;
        C0135b c0135b;
        int i4;
        F0 f02;
        boolean z4;
        boolean z5;
        C0113p c0113p;
        int i5;
        C0108m0 c0108m0;
        String str;
        String str2;
        int i6;
        int i7;
        int i8;
        G0 g02;
        C0136c c0136c;
        C0113p c0113p2;
        J.n nVar;
        int i9;
        int i10;
        int T2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        char c3;
        O o4;
        int i18;
        LinkedHashSet linkedHashSet;
        ArrayList arrayList2;
        int i19;
        C0498p c0498p;
        C0135b c0135b2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        int i20;
        C0108m0 c0108m02;
        int i21;
        C0498p c0498p2;
        Object[] objArr;
        long[] jArr;
        int i22;
        Object[] objArr2;
        long[] jArr2;
        Object[] objArr3;
        long[] jArr3;
        Object[] objArr4;
        long[] jArr4;
        Object obj;
        Object obj2;
        int hashCode2;
        C0113p c0113p3 = this;
        O o5 = c0113p3.f2319m;
        int i23 = o5.f2170a[o5.f2171b - 2] - 1;
        boolean z6 = c0113p3.f2305O;
        X x3 = C0105l.f2272a;
        if (z6) {
            I0 i02 = c0113p3.f2298H;
            int i24 = i02.f2153v;
            int i25 = i02.f2134b[i02.p(i24) * 5];
            I0 i03 = c0113p3.f2298H;
            int p = i03.p(i24);
            if (C0089d.l(i03.f2134b, p)) {
                Object[] objArr5 = i03.f2135c;
                int[] iArr = i03.f2134b;
                int i26 = p * 5;
                obj = objArr5[C0089d.y(iArr[i26 + 1] >> 30) + iArr[i26 + 4]];
            } else {
                obj = null;
            }
            I0 i04 = c0113p3.f2298H;
            int p3 = i04.p(i24);
            if (C0089d.k(i04.f2134b, p3)) {
                Object[] objArr6 = i04.f2135c;
                int[] iArr2 = i04.f2134b;
                obj2 = objArr6[C0089d.y(iArr2[(p3 * 5) + 1] >> 29) + i04.f(iArr2, p3)];
            } else {
                obj2 = x3;
            }
            if (obj != null) {
                hashCode2 = Integer.hashCode(obj instanceof Enum ? ((Enum) obj).ordinal() : obj.hashCode()) ^ Integer.rotateRight(c0113p3.f2306P, 3);
            } else if (obj2 == null || i25 != 207 || obj2.equals(x3)) {
                hashCode2 = Integer.rotateRight(i23 ^ c0113p3.f2306P, 3) ^ Integer.hashCode(i25);
            } else {
                c0113p3.f2306P = Integer.rotateRight(Integer.rotateRight(i23 ^ c0113p3.f2306P, 3) ^ Integer.hashCode(obj2.hashCode()), 3);
            }
            c0113p3.f2306P = Integer.rotateRight(hashCode2, 3);
        } else {
            F0 f03 = c0113p3.f2296F;
            int i27 = f03.f2109i;
            int[] iArr3 = f03.f2102b;
            int i28 = iArr3[i27 * 5];
            Object j3 = f03.j(iArr3, i27);
            F0 f04 = c0113p3.f2296F;
            Object b2 = f04.b(f04.f2102b, i27);
            if (j3 != null) {
                hashCode = Integer.hashCode(j3 instanceof Enum ? ((Enum) j3).ordinal() : j3.hashCode()) ^ Integer.rotateRight(c0113p3.f2306P, 3);
            } else if (b2 == null || i28 != 207 || b2.equals(x3)) {
                hashCode = Integer.rotateRight(i23 ^ c0113p3.f2306P, 3) ^ Integer.hashCode(i28);
            } else {
                c0113p3.f2306P = Integer.rotateRight(Integer.rotateRight(i23 ^ c0113p3.f2306P, 3) ^ Integer.hashCode(b2.hashCode()), 3);
            }
            c0113p3.f2306P = Integer.rotateRight(hashCode, 3);
        }
        int i29 = c0113p3.f2317k;
        C0108m0 c0108m03 = c0113p3.f2315i;
        ArrayList arrayList5 = c0113p3.f2323r;
        C0135b c0135b3 = c0113p3.f2302L;
        if (c0108m03 != null) {
            ArrayList arrayList6 = c0108m03.f2277a;
            if (arrayList6.size() > 0) {
                ArrayList arrayList7 = c0108m03.f2280d;
                HashSet hashSet = new HashSet(arrayList7.size());
                int size = arrayList7.size();
                for (int i30 = 0; i30 < size; i30++) {
                    hashSet.add(arrayList7.get(i30));
                }
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                int size2 = arrayList7.size();
                int size3 = arrayList6.size();
                int i31 = 0;
                int i32 = 0;
                int i33 = 0;
                while (i32 < size3) {
                    S s3 = (S) arrayList6.get(i32);
                    boolean contains = hashSet.contains(s3);
                    C0498p c0498p3 = c0108m03.f2281e;
                    HashSet hashSet2 = hashSet;
                    int i34 = c0108m03.f2278b;
                    if (contains) {
                        i17 = size3;
                        c3 = 3;
                        if (!linkedHashSet2.contains(s3)) {
                            if (i31 < size2) {
                                S s4 = (S) arrayList7.get(i31);
                                if (s4 != s3) {
                                    L l3 = (L) c0498p3.f(s4.f2193c);
                                    int i35 = l3 != null ? l3.f2160b : -1;
                                    linkedHashSet2.add(s4);
                                    linkedHashSet = linkedHashSet2;
                                    i20 = i33;
                                    if (i35 != i20) {
                                        c0108m02 = c0108m03;
                                        L l4 = (L) c0498p3.f(s4.f2193c);
                                        int i36 = l4 != null ? l4.f2161c : s4.f2194d;
                                        i19 = size2;
                                        int i37 = i35 + i34;
                                        int i38 = i34 + i20;
                                        if (i36 > 0) {
                                            arrayList4 = arrayList7;
                                            int i39 = c0135b3.f2549l;
                                            if (i39 > 0) {
                                                arrayList2 = arrayList5;
                                                o4 = o5;
                                                if (c0135b3.f2547j == i37 - i39 && c0135b3.f2548k == i38 - i39) {
                                                    c0135b3.f2549l = i39 + i36;
                                                }
                                            } else {
                                                o4 = o5;
                                                arrayList2 = arrayList5;
                                            }
                                            c0135b3.c();
                                            c0135b3.f2547j = i37;
                                            c0135b3.f2548k = i38;
                                            c0135b3.f2549l = i36;
                                        } else {
                                            o4 = o5;
                                            arrayList2 = arrayList5;
                                            arrayList4 = arrayList7;
                                            c0135b3.getClass();
                                        }
                                        char c4 = 7;
                                        if (i35 > i20) {
                                            Object[] objArr7 = c0498p3.f5186c;
                                            long[] jArr5 = c0498p3.f5184a;
                                            int length = jArr5.length - 2;
                                            if (length >= 0) {
                                                c0135b2 = c0135b3;
                                                arrayList3 = arrayList6;
                                                int i40 = 0;
                                                while (true) {
                                                    long j4 = jArr5[i40];
                                                    i21 = i32;
                                                    c0498p2 = c0498p3;
                                                    if ((((~j4) << c4) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i41 = 8 - ((~(i40 - length)) >>> 31);
                                                        int i42 = 0;
                                                        while (i42 < i41) {
                                                            if ((j4 & 255) < 128) {
                                                                L l5 = (L) objArr7[(i40 << 3) + i42];
                                                                objArr4 = objArr7;
                                                                int i43 = l5.f2160b;
                                                                jArr4 = jArr5;
                                                                if (i35 <= i43 && i43 < i35 + i36) {
                                                                    l5.f2160b = (i43 - i35) + i20;
                                                                } else if (i20 <= i43 && i43 < i35) {
                                                                    l5.f2160b = i43 + i36;
                                                                }
                                                            } else {
                                                                objArr4 = objArr7;
                                                                jArr4 = jArr5;
                                                            }
                                                            j4 >>= 8;
                                                            i42++;
                                                            objArr7 = objArr4;
                                                            jArr5 = jArr4;
                                                        }
                                                        objArr3 = objArr7;
                                                        jArr3 = jArr5;
                                                        if (i41 != 8) {
                                                            break;
                                                        }
                                                    } else {
                                                        objArr3 = objArr7;
                                                        jArr3 = jArr5;
                                                    }
                                                    if (i40 == length) {
                                                        break;
                                                    }
                                                    i40++;
                                                    c0498p3 = c0498p2;
                                                    i32 = i21;
                                                    objArr7 = objArr3;
                                                    jArr5 = jArr3;
                                                    c4 = 7;
                                                }
                                            } else {
                                                i21 = i32;
                                                c0498p2 = c0498p3;
                                                c0135b2 = c0135b3;
                                                arrayList3 = arrayList6;
                                            }
                                        } else {
                                            i21 = i32;
                                            c0498p2 = c0498p3;
                                            c0135b2 = c0135b3;
                                            arrayList3 = arrayList6;
                                            if (i20 > i35) {
                                                c0498p = c0498p2;
                                                Object[] objArr8 = c0498p.f5186c;
                                                long[] jArr6 = c0498p.f5184a;
                                                int length2 = jArr6.length - 2;
                                                if (length2 >= 0) {
                                                    int i44 = 0;
                                                    while (true) {
                                                        long j5 = jArr6[i44];
                                                        if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                            int i45 = 8 - ((~(i44 - length2)) >>> 31);
                                                            int i46 = 0;
                                                            while (i46 < i45) {
                                                                if ((j5 & 255) < 128) {
                                                                    objArr2 = objArr8;
                                                                    L l6 = (L) objArr8[(i44 << 3) + i46];
                                                                    jArr2 = jArr6;
                                                                    int i47 = l6.f2160b;
                                                                    i22 = i29;
                                                                    if (i35 <= i47 && i47 < i35 + i36) {
                                                                        l6.f2160b = (i47 - i35) + i20;
                                                                    } else if (i35 + 1 <= i47 && i47 < i20) {
                                                                        l6.f2160b = i47 - i36;
                                                                    }
                                                                } else {
                                                                    i22 = i29;
                                                                    objArr2 = objArr8;
                                                                    jArr2 = jArr6;
                                                                }
                                                                j5 >>= 8;
                                                                i46++;
                                                                jArr6 = jArr2;
                                                                objArr8 = objArr2;
                                                                i29 = i22;
                                                            }
                                                            i18 = i29;
                                                            objArr = objArr8;
                                                            jArr = jArr6;
                                                            if (i45 != 8) {
                                                                break;
                                                            }
                                                        } else {
                                                            i18 = i29;
                                                            objArr = objArr8;
                                                            jArr = jArr6;
                                                        }
                                                        if (i44 == length2) {
                                                            break;
                                                        }
                                                        i44++;
                                                        jArr6 = jArr;
                                                        objArr8 = objArr;
                                                        i29 = i18;
                                                    }
                                                } else {
                                                    i18 = i29;
                                                }
                                            }
                                        }
                                        i18 = i29;
                                        c0498p = c0498p2;
                                    } else {
                                        o4 = o5;
                                        i18 = i29;
                                        c0108m02 = c0108m03;
                                        arrayList2 = arrayList5;
                                        i19 = size2;
                                        i21 = i32;
                                        c0498p = c0498p3;
                                        c0135b2 = c0135b3;
                                        arrayList3 = arrayList6;
                                        arrayList4 = arrayList7;
                                    }
                                    i32 = i21;
                                } else {
                                    o4 = o5;
                                    i18 = i29;
                                    linkedHashSet = linkedHashSet2;
                                    arrayList2 = arrayList5;
                                    i19 = size2;
                                    c0498p = c0498p3;
                                    c0135b2 = c0135b3;
                                    arrayList3 = arrayList6;
                                    arrayList4 = arrayList7;
                                    i20 = i33;
                                    c0108m02 = c0108m03;
                                    i32++;
                                }
                                i31++;
                                L l7 = (L) c0498p.f(s4.f2193c);
                                int i48 = (l7 != null ? l7.f2161c : s4.f2194d) + i20;
                                c0108m03 = c0108m02;
                                size3 = i17;
                                linkedHashSet2 = linkedHashSet;
                                hashSet = hashSet2;
                                size2 = i19;
                                arrayList7 = arrayList4;
                                arrayList5 = arrayList2;
                                c0135b3 = c0135b2;
                                arrayList6 = arrayList3;
                                i29 = i18;
                                i33 = i48;
                                o5 = o4;
                            } else {
                                size3 = i17;
                                linkedHashSet2 = linkedHashSet2;
                                hashSet = hashSet2;
                            }
                        }
                    } else {
                        i17 = size3;
                        L l8 = (L) c0498p3.f(s3.f2193c);
                        c0135b3.e((l8 != null ? l8.f2160b : -1) + i34, s3.f2194d);
                        int i49 = s3.f2193c;
                        c0108m03.a(i49, 0);
                        c0135b3.f2543f = (i49 - c0135b3.f2538a.f2296F.f2107g) + c0135b3.f2543f;
                        c0113p3.f2296F.k(i49);
                        D();
                        c0113p3.f2296F.l();
                        c3 = 3;
                        C0089d.q(arrayList5, i49, c0113p3.f2296F.f2102b[(i49 * 5) + 3] + i49);
                    }
                    i32++;
                    size3 = i17;
                    hashSet = hashSet2;
                }
                o3 = o5;
                i3 = i29;
                arrayList = arrayList5;
                C0135b c0135b4 = c0135b3;
                c0135b4.c();
                if (arrayList6.size() > 0) {
                    F0 f05 = c0113p3.f2296F;
                    c0135b = c0135b4;
                    c0135b.f2543f = (f05.f2108h - c0135b.f2538a.f2296F.f2107g) + c0135b.f2543f;
                    f05.m();
                } else {
                    c0135b = c0135b4;
                }
                i4 = c0113p3.f2316j;
                while (true) {
                    f02 = c0113p3.f2296F;
                    if (f02.f2111k > 0 && (i16 = f02.f2107g) != f02.f2108h) {
                        C0113p c0113p4 = c0113p3;
                        D();
                        c0135b.e(i4, c0113p4.f2296F.l());
                        ArrayList arrayList8 = arrayList;
                        C0089d.q(arrayList8, i16, c0113p4.f2296F.f2107g);
                        c0113p3 = c0113p4;
                        i3 = i3;
                        arrayList = arrayList8;
                    }
                }
                z4 = c0113p3.f2305O;
                String str3 = " object arguments (";
                if (z4) {
                    z5 = z4;
                    if (z3) {
                        c0135b.a();
                    }
                    F0 f06 = this.f2296F;
                    int i50 = f06.f2113m - f06.f2112l;
                    if (i50 > 0) {
                        if (i50 > 0) {
                            c0135b.d(false);
                            F0 f07 = c0135b.f2538a.f2296F;
                            if (f07.f2103c > 0) {
                                int i51 = f07.f2109i;
                                O o6 = c0135b.f2541d;
                                int i52 = o6.f2171b;
                                if ((i52 > 0 ? o6.f2170a[i52 - 1] : -2) != i51) {
                                    if (!c0135b.f2540c && c0135b.f2542e) {
                                        c0135b.d(false);
                                        C0134a c0134a = c0135b.f2539b;
                                        c0134a.getClass();
                                        c0134a.f2537f.Z(J.l.f2560c);
                                        c0135b.f2540c = true;
                                    }
                                    if (i51 > 0) {
                                        C0087c a3 = f07.a(i51);
                                        o6.b(i51);
                                        c0135b.d(false);
                                        C0134a c0134a2 = c0135b.f2539b;
                                        c0134a2.getClass();
                                        J.k kVar = J.k.f2559c;
                                        J.E e3 = c0134a2.f2537f;
                                        e3.a0(kVar);
                                        I2.d.L(e3, 0, a3);
                                        int i53 = e3.f2535l;
                                        int i54 = kVar.f2523a;
                                        int T3 = J.E.T(e3, i54);
                                        int i55 = kVar.f2524b;
                                        if (i53 != T3 || e3.f2536m != J.E.T(e3, i55)) {
                                            int i56 = 1;
                                            StringBuilder sb = new StringBuilder();
                                            int i57 = 0;
                                            int i58 = 0;
                                            while (i57 < i54) {
                                                if (((i56 << i57) & e3.f2535l) != 0) {
                                                    if (i58 > 0) {
                                                        sb.append(", ");
                                                    }
                                                    sb.append(kVar.b(i57));
                                                    i58++;
                                                }
                                                i57++;
                                                i56 = 1;
                                            }
                                            String sb2 = sb.toString();
                                            StringBuilder m3 = AbstractC0080b.m(sb2, "StringBuilder().apply(builderAction).toString()");
                                            int i59 = 0;
                                            int i60 = 0;
                                            while (i59 < i55) {
                                                int i61 = i55;
                                                if (((1 << i59) & e3.f2536m) != 0) {
                                                    if (i58 > 0) {
                                                        m3.append(", ");
                                                    }
                                                    m3.append(kVar.c(i59));
                                                    i60++;
                                                }
                                                i59++;
                                                i55 = i61;
                                            }
                                            String sb3 = m3.toString();
                                            Z1.i.e(sb3, "StringBuilder().apply(builderAction).toString()");
                                            StringBuilder sb4 = new StringBuilder("Error while pushing ");
                                            sb4.append(kVar);
                                            sb4.append(". Not all arguments were provided. Missing ");
                                            AbstractC0080b.t(sb4, i58, " int arguments (", sb2, ") and ");
                                            AbstractC0080b.u(sb4, i60, " object arguments (", sb3, ").");
                                            throw null;
                                        }
                                        c0135b.f2540c = true;
                                    }
                                }
                            }
                            C0134a c0134a3 = c0135b.f2539b;
                            c0134a3.getClass();
                            J.x xVar = J.x.f2576c;
                            J.E e4 = c0134a3.f2537f;
                            e4.a0(xVar);
                            I2.d.K(e4, 0, i50);
                            int i62 = e4.f2535l;
                            int i63 = xVar.f2523a;
                            int T4 = J.E.T(e4, i63);
                            int i64 = xVar.f2524b;
                            if (i62 != T4 || e4.f2536m != J.E.T(e4, i64)) {
                                StringBuilder sb5 = new StringBuilder();
                                int i65 = 0;
                                for (int i66 = 0; i66 < i63; i66++) {
                                    if (((1 << i66) & e4.f2535l) != 0) {
                                        if (i65 > 0) {
                                            sb5.append(", ");
                                        }
                                        sb5.append(xVar.b(i66));
                                        i65++;
                                    }
                                }
                                String sb6 = sb5.toString();
                                StringBuilder m4 = AbstractC0080b.m(sb6, "StringBuilder().apply(builderAction).toString()");
                                int i67 = 0;
                                int i68 = 0;
                                while (i67 < i64) {
                                    int i69 = i64;
                                    if (((1 << i67) & e4.f2536m) != 0) {
                                        if (i65 > 0) {
                                            m4.append(", ");
                                        }
                                        m4.append(xVar.c(i67));
                                        i68++;
                                    }
                                    i67++;
                                    i64 = i69;
                                }
                                String sb7 = m4.toString();
                                Z1.i.e(sb7, "StringBuilder().apply(builderAction).toString()");
                                StringBuilder sb8 = new StringBuilder("Error while pushing ");
                                sb8.append(xVar);
                                sb8.append(". Not all arguments were provided. Missing ");
                                AbstractC0080b.t(sb8, i65, " int arguments (", sb6, ") and ");
                                AbstractC0080b.u(sb8, i68, " object arguments (", sb7, ").");
                                throw null;
                            }
                        } else {
                            c0135b.getClass();
                        }
                    }
                    int i70 = c0135b.f2538a.f2296F.f2109i;
                    O o7 = c0135b.f2541d;
                    int i71 = o7.f2171b;
                    if ((i71 > 0 ? o7.f2170a[i71 - 1] : -1) > i70) {
                        C0089d.w("Missed recording an endGroup");
                        throw null;
                    }
                    if ((i71 > 0 ? o7.f2170a[i71 - 1] : -1) == i70) {
                        c0135b.d(false);
                        o7.a();
                        C0134a c0134a4 = c0135b.f2539b;
                        c0134a4.getClass();
                        c0134a4.f2537f.Z(J.i.f2557c);
                    }
                    c0113p = this;
                    int i72 = c0113p.f2296F.f2109i;
                    int i73 = i3;
                    if (i73 != c0113p.c0(i72)) {
                        c0113p.Y(i72, i73);
                    }
                    if (z3) {
                        i73 = 1;
                    }
                    c0113p.f2296F.d();
                    c0135b.c();
                    i5 = i73;
                } else {
                    if (z3) {
                        C0136c c0136c2 = c0113p3.f2304N;
                        J.E e5 = c0136c2.f2551g;
                        if (!e5.X()) {
                            C0089d.w("Cannot end node insertion, there are no pending operations that can be realized.");
                            throw null;
                        }
                        if (e5.W()) {
                            throw new NoSuchElementException("Cannot pop(), because the stack is empty.");
                        }
                        J.C[] cArr = e5.f2529f;
                        int i74 = e5.f2530g - 1;
                        e5.f2530g = i74;
                        J.C c5 = cArr[i74];
                        Z1.i.c(c5);
                        e5.f2529f[e5.f2530g] = null;
                        J.E e6 = c0136c2.f2550f;
                        e6.a0(c5);
                        int i75 = e5.f2534k;
                        int i76 = e6.f2534k;
                        z5 = z4;
                        str = ").";
                        int i77 = 0;
                        while (true) {
                            i14 = c5.f2524b;
                            if (i77 >= i14) {
                                break;
                            }
                            i76--;
                            i75--;
                            Object[] objArr9 = e6.f2533j;
                            String str4 = str3;
                            Object[] objArr10 = e5.f2533j;
                            objArr9[i76] = objArr10[i75];
                            objArr10[i75] = null;
                            i77++;
                            str3 = str4;
                        }
                        str2 = str3;
                        int i78 = e5.f2532i;
                        int i79 = e6.f2532i;
                        int i80 = 0;
                        while (true) {
                            i15 = c5.f2523a;
                            if (i80 >= i15) {
                                break;
                            }
                            i79--;
                            i78--;
                            int[] iArr4 = e6.f2531h;
                            J.E e7 = e6;
                            int[] iArr5 = e5.f2531h;
                            iArr4[i79] = iArr5[i78];
                            iArr5[i78] = 0;
                            i80++;
                            e6 = e7;
                        }
                        e5.f2534k -= i14;
                        e5.f2532i -= i15;
                        i6 = 1;
                    } else {
                        z5 = z4;
                        str = ").";
                        str2 = " object arguments (";
                        i6 = i3;
                    }
                    F0 f08 = c0113p3.f2296F;
                    int i81 = f08.f2111k;
                    if (i81 <= 0) {
                        C0089d.R("Unbalanced begin/end empty");
                        throw null;
                    }
                    f08.f2111k = i81 - 1;
                    I0 i05 = c0113p3.f2298H;
                    int i82 = i05.f2153v;
                    i05.i();
                    if (c0113p3.f2296F.f2111k > 0) {
                        c0113p2 = c0113p3;
                        i5 = i6;
                    } else {
                        int i83 = (-2) - i82;
                        c0113p3.f2298H.j();
                        c0113p3.f2298H.e(true);
                        C0087c c0087c = c0113p3.f2303M;
                        if (c0113p3.f2304N.f2550f.W()) {
                            G0 g03 = c0113p3.f2297G;
                            c0135b.b();
                            c0135b.d(false);
                            F0 f09 = c0135b.f2538a.f2296F;
                            if (f09.f2103c > 0) {
                                int i84 = f09.f2109i;
                                O o8 = c0135b.f2541d;
                                int i85 = o8.f2171b;
                                i7 = i6;
                                if ((i85 > 0 ? o8.f2170a[i85 - 1] : -2) != i84) {
                                    if (!c0135b.f2540c && c0135b.f2542e) {
                                        c0135b.d(false);
                                        C0134a c0134a5 = c0135b.f2539b;
                                        c0134a5.getClass();
                                        c0134a5.f2537f.Z(J.l.f2560c);
                                        c0135b.f2540c = true;
                                    }
                                    if (i84 > 0) {
                                        C0087c a4 = f09.a(i84);
                                        o8.b(i84);
                                        c0135b.d(false);
                                        C0134a c0134a6 = c0135b.f2539b;
                                        c0134a6.getClass();
                                        J.k kVar2 = J.k.f2559c;
                                        J.E e8 = c0134a6.f2537f;
                                        e8.a0(kVar2);
                                        I2.d.L(e8, 0, a4);
                                        int i86 = e8.f2535l;
                                        int i87 = kVar2.f2523a;
                                        int T5 = J.E.T(e8, i87);
                                        i8 = i83;
                                        int i88 = kVar2.f2524b;
                                        if (i86 != T5 || e8.f2536m != J.E.T(e8, i88)) {
                                            int i89 = 1;
                                            StringBuilder sb9 = new StringBuilder();
                                            int i90 = 0;
                                            int i91 = 0;
                                            while (i90 < i87) {
                                                if ((e8.f2535l & (i89 << i90)) != 0) {
                                                    if (i91 > 0) {
                                                        sb9.append(", ");
                                                    }
                                                    sb9.append(kVar2.b(i90));
                                                    i91++;
                                                }
                                                i90++;
                                                i89 = 1;
                                            }
                                            String sb10 = sb9.toString();
                                            StringBuilder m5 = AbstractC0080b.m(sb10, "StringBuilder().apply(builderAction).toString()");
                                            int i92 = 0;
                                            for (int i93 = 0; i93 < i88; i93++) {
                                                if (((1 << i93) & e8.f2536m) != 0) {
                                                    if (i91 > 0) {
                                                        m5.append(", ");
                                                    }
                                                    m5.append(kVar2.c(i93));
                                                    i92++;
                                                }
                                            }
                                            String sb11 = m5.toString();
                                            Z1.i.e(sb11, "StringBuilder().apply(builderAction).toString()");
                                            StringBuilder sb12 = new StringBuilder("Error while pushing ");
                                            sb12.append(kVar2);
                                            sb12.append(". Not all arguments were provided. Missing ");
                                            AbstractC0080b.t(sb12, i91, " int arguments (", sb10, ") and ");
                                            AbstractC0080b.u(sb12, i92, str2, sb11, str);
                                            throw null;
                                        }
                                        c0135b.f2540c = true;
                                        String str5 = str;
                                        String str6 = str2;
                                        c0135b.c();
                                        C0134a c0134a7 = c0135b.f2539b;
                                        c0134a7.getClass();
                                        nVar = J.n.f2566c;
                                        J.E e9 = c0134a7.f2537f;
                                        e9.a0(nVar);
                                        I2.d.L(e9, 0, c0087c);
                                        I2.d.L(e9, 1, g03);
                                        i9 = e9.f2535l;
                                        i10 = nVar.f2523a;
                                        T2 = J.E.T(e9, i10);
                                        i11 = nVar.f2524b;
                                        if (i9 == T2 || e9.f2536m != J.E.T(e9, i11)) {
                                            StringBuilder sb13 = new StringBuilder();
                                            i12 = 0;
                                            int i94 = 0;
                                            while (i12 < i10) {
                                                int i95 = i10;
                                                if (((1 << i12) & e9.f2535l) != 0) {
                                                    if (i94 > 0) {
                                                        sb13.append(", ");
                                                    }
                                                    sb13.append(nVar.b(i12));
                                                    i94++;
                                                }
                                                i12++;
                                                i10 = i95;
                                            }
                                            String sb14 = sb13.toString();
                                            StringBuilder m6 = AbstractC0080b.m(sb14, "StringBuilder().apply(builderAction).toString()");
                                            int i96 = 0;
                                            i13 = 0;
                                            while (i13 < i11) {
                                                int i97 = i11;
                                                if (((1 << i13) & e9.f2536m) != 0) {
                                                    if (i94 > 0) {
                                                        m6.append(", ");
                                                    }
                                                    m6.append(nVar.c(i13));
                                                    i96++;
                                                }
                                                i13++;
                                                i11 = i97;
                                            }
                                            String sb15 = m6.toString();
                                            Z1.i.e(sb15, "StringBuilder().apply(builderAction).toString()");
                                            StringBuilder sb16 = new StringBuilder("Error while pushing ");
                                            sb16.append(nVar);
                                            sb16.append(". Not all arguments were provided. Missing ");
                                            AbstractC0080b.t(sb16, i94, " int arguments (", sb14, ") and ");
                                            AbstractC0080b.u(sb16, i96, str6, sb15, str5);
                                            throw null;
                                        }
                                        c0113p2 = c0113p3;
                                    }
                                }
                            } else {
                                i7 = i6;
                            }
                            i8 = i83;
                            String str52 = str;
                            String str62 = str2;
                            c0135b.c();
                            C0134a c0134a72 = c0135b.f2539b;
                            c0134a72.getClass();
                            nVar = J.n.f2566c;
                            J.E e92 = c0134a72.f2537f;
                            e92.a0(nVar);
                            I2.d.L(e92, 0, c0087c);
                            I2.d.L(e92, 1, g03);
                            i9 = e92.f2535l;
                            i10 = nVar.f2523a;
                            T2 = J.E.T(e92, i10);
                            i11 = nVar.f2524b;
                            if (i9 == T2) {
                            }
                            StringBuilder sb132 = new StringBuilder();
                            i12 = 0;
                            int i942 = 0;
                            while (i12 < i10) {
                            }
                            String sb142 = sb132.toString();
                            StringBuilder m62 = AbstractC0080b.m(sb142, "StringBuilder().apply(builderAction).toString()");
                            int i962 = 0;
                            i13 = 0;
                            while (i13 < i11) {
                            }
                            String sb152 = m62.toString();
                            Z1.i.e(sb152, "StringBuilder().apply(builderAction).toString()");
                            StringBuilder sb162 = new StringBuilder("Error while pushing ");
                            sb162.append(nVar);
                            sb162.append(". Not all arguments were provided. Missing ");
                            AbstractC0080b.t(sb162, i942, " int arguments (", sb142, ") and ");
                            AbstractC0080b.u(sb162, i962, str62, sb152, str52);
                            throw null;
                        }
                        i7 = i6;
                        i8 = i83;
                        String str7 = str;
                        String str8 = str2;
                        G0 g04 = c0113p3.f2297G;
                        C0136c c0136c3 = c0113p3.f2304N;
                        c0135b.b();
                        c0135b.d(false);
                        F0 f010 = c0135b.f2538a.f2296F;
                        if (f010.f2103c > 0) {
                            int i98 = f010.f2109i;
                            O o9 = c0135b.f2541d;
                            int i99 = o9.f2171b;
                            c0136c = c0136c3;
                            if ((i99 > 0 ? o9.f2170a[i99 - 1] : -2) != i98) {
                                if (!c0135b.f2540c && c0135b.f2542e) {
                                    c0135b.d(false);
                                    C0134a c0134a8 = c0135b.f2539b;
                                    c0134a8.getClass();
                                    c0134a8.f2537f.Z(J.l.f2560c);
                                    c0135b.f2540c = true;
                                }
                                if (i98 > 0) {
                                    C0087c a5 = f010.a(i98);
                                    o9.b(i98);
                                    c0135b.d(false);
                                    C0134a c0134a9 = c0135b.f2539b;
                                    c0134a9.getClass();
                                    J.k kVar3 = J.k.f2559c;
                                    J.E e10 = c0134a9.f2537f;
                                    e10.a0(kVar3);
                                    I2.d.L(e10, 0, a5);
                                    int i100 = e10.f2535l;
                                    int i101 = kVar3.f2523a;
                                    int T6 = J.E.T(e10, i101);
                                    g02 = g04;
                                    int i102 = kVar3.f2524b;
                                    if (i100 != T6 || e10.f2536m != J.E.T(e10, i102)) {
                                        int i103 = 1;
                                        StringBuilder sb17 = new StringBuilder();
                                        int i104 = 0;
                                        int i105 = 0;
                                        while (i104 < i101) {
                                            if (((i103 << i104) & e10.f2535l) != 0) {
                                                if (i105 > 0) {
                                                    sb17.append(", ");
                                                }
                                                sb17.append(kVar3.b(i104));
                                                i105++;
                                            }
                                            i104++;
                                            i103 = 1;
                                        }
                                        String sb18 = sb17.toString();
                                        StringBuilder m7 = AbstractC0080b.m(sb18, "StringBuilder().apply(builderAction).toString()");
                                        int i106 = 0;
                                        int i107 = 0;
                                        while (i106 < i102) {
                                            int i108 = i102;
                                            if (((1 << i106) & e10.f2536m) != 0) {
                                                if (i105 > 0) {
                                                    m7.append(", ");
                                                }
                                                m7.append(kVar3.c(i106));
                                                i107++;
                                            }
                                            i106++;
                                            i102 = i108;
                                        }
                                        String sb19 = m7.toString();
                                        Z1.i.e(sb19, "StringBuilder().apply(builderAction).toString()");
                                        StringBuilder sb20 = new StringBuilder("Error while pushing ");
                                        sb20.append(kVar3);
                                        sb20.append(". Not all arguments were provided. Missing ");
                                        AbstractC0080b.t(sb20, i105, " int arguments (", sb18, ") and ");
                                        AbstractC0080b.u(sb20, i107, str8, sb19, str7);
                                        throw null;
                                    }
                                    c0135b.f2540c = true;
                                }
                            }
                            g02 = g04;
                        } else {
                            g02 = g04;
                            c0136c = c0136c3;
                        }
                        c0135b.c();
                        C0134a c0134a10 = c0135b.f2539b;
                        c0134a10.getClass();
                        J.o oVar = J.o.f2567c;
                        J.E e11 = c0134a10.f2537f;
                        e11.a0(oVar);
                        I2.d.L(e11, 0, c0087c);
                        I2.d.L(e11, 1, g02);
                        I2.d.L(e11, 2, c0136c);
                        int i109 = e11.f2535l;
                        int i110 = oVar.f2523a;
                        int T7 = J.E.T(e11, i110);
                        int i111 = oVar.f2524b;
                        if (i109 != T7 || e11.f2536m != J.E.T(e11, i111)) {
                            StringBuilder sb21 = new StringBuilder();
                            int i112 = 0;
                            int i113 = 0;
                            while (i112 < i110) {
                                int i114 = i110;
                                if (((1 << i112) & e11.f2535l) != 0) {
                                    if (i113 > 0) {
                                        sb21.append(", ");
                                    }
                                    sb21.append(oVar.b(i112));
                                    i113++;
                                }
                                i112++;
                                i110 = i114;
                            }
                            String sb22 = sb21.toString();
                            StringBuilder m8 = AbstractC0080b.m(sb22, "StringBuilder().apply(builderAction).toString()");
                            int i115 = 0;
                            int i116 = 0;
                            while (i116 < i111) {
                                int i117 = i111;
                                if (((1 << i116) & e11.f2536m) != 0) {
                                    if (i113 > 0) {
                                        m8.append(", ");
                                    }
                                    m8.append(oVar.c(i116));
                                    i115++;
                                }
                                i116++;
                                i111 = i117;
                            }
                            String sb23 = m8.toString();
                            Z1.i.e(sb23, "StringBuilder().apply(builderAction).toString()");
                            StringBuilder sb24 = new StringBuilder("Error while pushing ");
                            sb24.append(oVar);
                            sb24.append(". Not all arguments were provided. Missing ");
                            AbstractC0080b.t(sb24, i113, " int arguments (", sb22, ") and ");
                            AbstractC0080b.u(sb24, i115, str8, sb23, str7);
                            throw null;
                        }
                        c0113p2 = this;
                        c0113p2.f2304N = new C0136c();
                        c0113p2.f2305O = false;
                        if (c0113p2.f2309c.f2119e == 0) {
                            i5 = i7;
                        } else {
                            int i118 = i8;
                            c0113p2.X(i118, 0);
                            i5 = i7;
                            c0113p2.Y(i118, i5);
                        }
                    }
                    c0113p = c0113p2;
                }
                ArrayList arrayList9 = c0113p.f2314h.f118a;
                c0108m0 = (C0108m0) arrayList9.remove(arrayList9.size() - 1);
                if (c0108m0 != null && !z5) {
                    c0108m0.f2279c++;
                }
                c0113p.f2315i = c0108m0;
                c0113p.f2316j = o3.a() + i5;
                c0113p.f2318l = o3.a();
                c0113p.f2317k = o3.a() + i5;
            }
        }
        o3 = o5;
        i3 = i29;
        arrayList = arrayList5;
        c0135b = c0135b3;
        i4 = c0113p3.f2316j;
        while (true) {
            f02 = c0113p3.f2296F;
            if (f02.f2111k > 0) {
                break;
            }
            C0113p c0113p42 = c0113p3;
            D();
            c0135b.e(i4, c0113p42.f2296F.l());
            ArrayList arrayList82 = arrayList;
            C0089d.q(arrayList82, i16, c0113p42.f2296F.f2107g);
            c0113p3 = c0113p42;
            i3 = i3;
            arrayList = arrayList82;
        }
        z4 = c0113p3.f2305O;
        String str32 = " object arguments (";
        if (z4) {
        }
        ArrayList arrayList92 = c0113p.f2314h.f118a;
        c0108m0 = (C0108m0) arrayList92.remove(arrayList92.size() - 1);
        if (c0108m0 != null) {
            c0108m0.f2279c++;
        }
        c0113p.f2315i = c0108m0;
        c0113p.f2316j = o3.a() + i5;
        c0113p.f2318l = o3.a();
        c0113p.f2317k = o3.a() + i5;
    }

    public final void q() {
        p(false);
        C0119s0 v3 = v();
        if (v3 != null) {
            int i3 = v3.f2344a;
            if ((i3 & 1) != 0) {
                v3.f2344a = i3 | 2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0119s0 r() {
        C0119s0 c0119s0;
        C0087c a3;
        C0117r0 c0117r0;
        A2.n nVar = this.D;
        if (nVar.f118a.isEmpty()) {
            c0119s0 = null;
        } else {
            ArrayList arrayList = nVar.f118a;
            c0119s0 = (C0119s0) arrayList.remove(arrayList.size() - 1);
        }
        if (c0119s0 != null) {
            c0119s0.f2344a &= -9;
        }
        if (c0119s0 != null) {
            int i3 = this.f2294A;
            C0503u c0503u = c0119s0.f2349f;
            if (c0503u != null && (c0119s0.f2344a & 16) == 0) {
                Object[] objArr = c0503u.f5213b;
                int[] iArr = c0503u.f5214c;
                long[] jArr = c0503u.f5212a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i4 = 0;
                    loop0: while (true) {
                        long j3 = jArr[i4];
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i5 = 8 - ((~(i4 - length)) >>> 31);
                            for (int i6 = 0; i6 < i5; i6++) {
                                if ((j3 & 255) < 128) {
                                    int i7 = (i4 << 3) + i6;
                                    Object obj = objArr[i7];
                                    if (iArr[i7] != i3) {
                                        c0117r0 = new C0117r0(i3, 0, c0119s0, c0503u);
                                        break loop0;
                                    }
                                }
                                j3 >>= 8;
                            }
                            if (i5 != 8) {
                                break;
                            }
                        }
                        if (i4 == length) {
                            break;
                        }
                        i4++;
                    }
                    if (c0117r0 != null) {
                        C0134a c0134a = this.f2302L.f2539b;
                        c0134a.getClass();
                        J.h hVar = J.h.f2556c;
                        J.E e3 = c0134a.f2537f;
                        e3.a0(hVar);
                        I2.d.L(e3, 0, c0117r0);
                        I2.d.L(e3, 1, this.f2313g);
                        int i8 = e3.f2535l;
                        int i9 = hVar.f2523a;
                        int T2 = J.E.T(e3, i9);
                        int i10 = hVar.f2524b;
                        if (i8 != T2 || e3.f2536m != J.E.T(e3, i10)) {
                            StringBuilder sb = new StringBuilder();
                            int i11 = 0;
                            for (int i12 = 0; i12 < i9; i12++) {
                                if ((e3.f2535l & (1 << i12)) != 0) {
                                    if (i11 > 0) {
                                        sb.append(", ");
                                    }
                                    sb.append(hVar.b(i12));
                                    i11++;
                                }
                            }
                            String sb2 = sb.toString();
                            StringBuilder m3 = AbstractC0080b.m(sb2, "StringBuilder().apply(builderAction).toString()");
                            int i13 = 0;
                            for (int i14 = 0; i14 < i10; i14++) {
                                if ((e3.f2536m & (1 << i14)) != 0) {
                                    if (i11 > 0) {
                                        m3.append(", ");
                                    }
                                    m3.append(hVar.c(i14));
                                    i13++;
                                }
                            }
                            String sb3 = m3.toString();
                            Z1.i.e(sb3, "StringBuilder().apply(builderAction).toString()");
                            StringBuilder sb4 = new StringBuilder("Error while pushing ");
                            sb4.append(hVar);
                            sb4.append(". Not all arguments were provided. Missing ");
                            AbstractC0080b.t(sb4, i11, " int arguments (", sb2, ") and ");
                            AbstractC0080b.u(sb4, i13, " object arguments (", sb3, ").");
                            throw null;
                        }
                    }
                }
            }
            c0117r0 = null;
            if (c0117r0 != null) {
            }
        }
        C0119s0 c0119s02 = null;
        if (c0119s0 != null) {
            int i15 = c0119s0.f2344a;
            if ((i15 & 16) == 0 && ((i15 & 1) != 0 || this.p)) {
                if (c0119s0.f2346c == null) {
                    if (this.f2305O) {
                        I0 i02 = this.f2298H;
                        a3 = i02.b(i02.f2153v);
                    } else {
                        F0 f02 = this.f2296F;
                        a3 = f02.a(f02.f2109i);
                    }
                    c0119s0.f2346c = a3;
                }
                c0119s0.f2344a &= -5;
                c0119s02 = c0119s0;
            }
        }
        p(false);
        return c0119s02;
    }

    public final void s() {
        p(false);
        this.f2308b.b();
        p(false);
        C0135b c0135b = this.f2302L;
        if (c0135b.f2540c) {
            c0135b.d(false);
            c0135b.d(false);
            C0134a c0134a = c0135b.f2539b;
            c0134a.getClass();
            c0134a.f2537f.Z(J.i.f2557c);
            c0135b.f2540c = false;
        }
        c0135b.b();
        if (!(c0135b.f2541d.f2171b == 0)) {
            C0089d.w("Missed recording an endGroup()");
            throw null;
        }
        if (!this.f2314h.f118a.isEmpty()) {
            C0089d.w("Start/end imbalance");
            throw null;
        }
        i();
        this.f2296F.c();
        this.f2327v = this.f2328w.a() != 0;
    }

    public final void t(boolean z3, C0108m0 c0108m0) {
        this.f2314h.f118a.add(this.f2315i);
        this.f2315i = c0108m0;
        int i3 = this.f2317k;
        O o3 = this.f2319m;
        o3.b(i3);
        o3.b(this.f2318l);
        o3.b(this.f2316j);
        if (z3) {
            this.f2316j = 0;
        }
        this.f2317k = 0;
        this.f2318l = 0;
    }

    public final void u() {
        G0 g02 = new G0();
        if (this.B) {
            g02.c();
        }
        if (this.f2308b.c()) {
            g02.f2127m = new C0498p();
        }
        this.f2297G = g02;
        I0 i3 = g02.i();
        i3.e(true);
        this.f2298H = i3;
    }

    public final C0119s0 v() {
        if (this.f2331z == 0) {
            A2.n nVar = this.D;
            if (!nVar.f118a.isEmpty()) {
                return (C0119s0) nVar.f118a.get(r0.size() - 1);
            }
        }
        return null;
    }

    public final boolean w() {
        C0119s0 v3;
        return (x() && !this.f2327v && ((v3 = v()) == null || (v3.f2344a & 4) == 0)) ? false : true;
    }

    public final boolean x() {
        C0119s0 v3;
        return (this.f2305O || this.f2329x || this.f2327v || (v3 = v()) == null || (v3.f2344a & 8) != 0) ? false : true;
    }

    public final void y(ArrayList arrayList) {
        C0134a c0134a = this.f2312f;
        C0135b c0135b = this.f2302L;
        C0134a c0134a2 = c0135b.f2539b;
        try {
            c0135b.f2539b = c0134a;
            c0134a.f2537f.Z(J.u.f2573c);
            if (arrayList.size() > 0) {
                L1.j jVar = (L1.j) arrayList.get(0);
                AbstractC0084a0 abstractC0084a0 = (AbstractC0084a0) jVar.f2708d;
                abstractC0084a0.getClass();
                throw null;
            }
            C0134a c0134a3 = c0135b.f2539b;
            c0134a3.getClass();
            c0134a3.f2537f.Z(J.j.f2558c);
            c0135b.f2543f = 0;
        } finally {
            c0135b.f2539b = c0134a2;
        }
    }

    public final Object z() {
        boolean z3 = this.f2305O;
        X x3 = C0105l.f2272a;
        if (!z3) {
            Object h3 = this.f2296F.h();
            return (!this.f2329x || (h3 instanceof C0107m)) ? h3 : x3;
        }
        if (!this.f2322q) {
            return x3;
        }
        C0089d.w("A call to createNode(), emitNode() or useNode() expected");
        throw null;
    }
}
