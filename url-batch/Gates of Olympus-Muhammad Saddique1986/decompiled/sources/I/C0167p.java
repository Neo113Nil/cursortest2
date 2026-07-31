package I;

import J.C0196a;
import J.C0197b;
import J.C0198c;
import android.os.Trace;
import android.util.SparseArray;
import e2.InterfaceC0426e;
import g2.InterfaceC0439a;
import g2.InterfaceC0441c;
import j.AbstractC0523E;
import j.C0519A;
import j.C0540n;
import j.C0542p;
import j.C0547u;
import j.C0548v;
import j.C0550x;
import j.C0552z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import t0.C1001n;

/* renamed from: I.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0167p {

    /* renamed from: A, reason: collision with root package name */
    public int f2851A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f2852B;
    public final C0165o C;
    public final G2.k D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f2853E;

    /* renamed from: F, reason: collision with root package name */
    public E0 f2854F;

    /* renamed from: G, reason: collision with root package name */
    public F0 f2855G;

    /* renamed from: H, reason: collision with root package name */
    public H0 f2856H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f2857I;

    /* renamed from: J, reason: collision with root package name */
    public InterfaceC0164n0 f2858J;

    /* renamed from: K, reason: collision with root package name */
    public C0196a f2859K;

    /* renamed from: L, reason: collision with root package name */
    public final C0197b f2860L;

    /* renamed from: M, reason: collision with root package name */
    public C0141c f2861M;

    /* renamed from: N, reason: collision with root package name */
    public C0198c f2862N;

    /* renamed from: O, reason: collision with root package name */
    public boolean f2863O;

    /* renamed from: P, reason: collision with root package name */
    public int f2864P;

    /* renamed from: a, reason: collision with root package name */
    public final G1.m f2865a;

    /* renamed from: b, reason: collision with root package name */
    public final r f2866b;

    /* renamed from: c, reason: collision with root package name */
    public final F0 f2867c;

    /* renamed from: d, reason: collision with root package name */
    public final C0552z f2868d;

    /* renamed from: e, reason: collision with root package name */
    public final C0196a f2869e;

    /* renamed from: f, reason: collision with root package name */
    public final C0196a f2870f;

    /* renamed from: g, reason: collision with root package name */
    public final C0176u f2871g;

    /* renamed from: i, reason: collision with root package name */
    public C0162m0 f2873i;

    /* renamed from: j, reason: collision with root package name */
    public int f2874j;

    /* renamed from: k, reason: collision with root package name */
    public int f2875k;

    /* renamed from: l, reason: collision with root package name */
    public int f2876l;

    /* renamed from: n, reason: collision with root package name */
    public int[] f2878n;

    /* renamed from: o, reason: collision with root package name */
    public C0540n f2879o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2880p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2881q;

    /* renamed from: u, reason: collision with root package name */
    public B.Y f2885u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2886v;

    /* renamed from: x, reason: collision with root package name */
    public boolean f2888x;

    /* renamed from: z, reason: collision with root package name */
    public int f2890z;

    /* renamed from: h, reason: collision with root package name */
    public final G2.k f2872h = new G2.k(1);

    /* renamed from: m, reason: collision with root package name */
    public final N f2877m = new N();

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList f2882r = new ArrayList();

    /* renamed from: s, reason: collision with root package name */
    public final N f2883s = new N();

    /* renamed from: t, reason: collision with root package name */
    public InterfaceC0164n0 f2884t = Q.d.f3954g;

    /* renamed from: w, reason: collision with root package name */
    public final N f2887w = new N();

    /* renamed from: y, reason: collision with root package name */
    public int f2889y = -1;

    public C0167p(G1.m mVar, r rVar, F0 f02, C0552z c0552z, C0196a c0196a, C0196a c0196a2, C0176u c0176u) {
        this.f2865a = mVar;
        this.f2866b = rVar;
        this.f2867c = f02;
        this.f2868d = c0552z;
        this.f2869e = c0196a;
        this.f2870f = c0196a2;
        this.f2871g = c0176u;
        this.f2852B = rVar.e() || rVar.c();
        this.C = new C0165o(0, this);
        this.D = new G2.k(1);
        E0 d3 = f02.d();
        d3.c();
        this.f2854F = d3;
        F0 f03 = new F0();
        if (rVar.e()) {
            f03.c();
        }
        if (rVar.c()) {
            f03.f2681m = new C0542p();
        }
        this.f2855G = f03;
        H0 i3 = f03.i();
        i3.e(true);
        this.f2856H = i3;
        this.f2860L = new C0197b(this, c0196a);
        E0 d4 = this.f2855G.d();
        try {
            C0141c a3 = d4.a(0);
            d4.c();
            this.f2861M = a3;
            this.f2862N = new C0198c();
        } catch (Throwable th) {
            d4.c();
            throw th;
        }
    }

    public static final int I(C0167p c0167p, int i3, boolean z3, int i4) {
        E0 e02 = c0167p.f2854F;
        int[] iArr = e02.f2656b;
        int i5 = i3 * 5;
        if (!((iArr[i5 + 1] & 134217728) != 0)) {
            if (!C0143d.h(iArr, i3)) {
                if (C0143d.m(iArr, i3)) {
                    return 1;
                }
                return C0143d.o(iArr, i3);
            }
            int i6 = iArr[i5 + 3] + i3;
            int i7 = 0;
            for (int i8 = i3 + 1; i8 < i6; i8 += iArr[(i8 * 5) + 3]) {
                boolean m3 = C0143d.m(iArr, i8);
                C0197b c0197b = c0167p.f2860L;
                if (m3) {
                    c0197b.c();
                    Object i9 = e02.i(i8);
                    c0197b.c();
                    c0197b.f3120h.f2203d.add(i9);
                }
                i7 += I(c0167p, i8, m3 || z3, m3 ? 0 : i4 + i7);
                if (m3) {
                    c0197b.c();
                    c0197b.a();
                }
            }
            if (C0143d.m(iArr, i3)) {
                return 1;
            }
            return i7;
        }
        int i10 = iArr[i5];
        Object j3 = e02.j(iArr, i3);
        if (i10 != 206 || !f2.j.a(j3, C0143d.f2799e)) {
            if (C0143d.m(iArr, i3)) {
                return 1;
            }
            return C0143d.o(iArr, i3);
        }
        Object g3 = e02.g(i3, 0);
        C0161m c0161m = g3 instanceof C0161m ? (C0161m) g3 : null;
        if (c0161m != null) {
            for (C0167p c0167p2 : c0161m.f2833d.f2844e) {
                C0197b c0197b2 = c0167p2.f2860L;
                F0 f02 = c0167p2.f2867c;
                if (f02.f2673e > 0 && C0143d.h(f02.f2672d, 0)) {
                    C0196a c0196a = new C0196a();
                    c0167p2.f2859K = c0196a;
                    E0 d3 = f02.d();
                    try {
                        c0167p2.f2854F = d3;
                        C0196a c0196a2 = c0197b2.f3114b;
                        try {
                            c0197b2.f3114b = c0196a;
                            c0167p2.H(0);
                            c0197b2.b();
                            if (c0197b2.f3115c) {
                                C0196a c0196a3 = c0197b2.f3114b;
                                c0196a3.getClass();
                                c0196a3.f3112b.n0(J.w.f3150c);
                                if (c0197b2.f3115c) {
                                    c0197b2.d(false);
                                    c0197b2.d(false);
                                    C0196a c0196a4 = c0197b2.f3114b;
                                    c0196a4.getClass();
                                    c0196a4.f3112b.n0(J.i.f3132c);
                                    c0197b2.f3115c = false;
                                }
                            }
                            c0197b2.f3114b = c0196a2;
                        } catch (Throwable th) {
                            c0197b2.f3114b = c0196a2;
                            throw th;
                        }
                    } finally {
                        d3.c();
                    }
                }
                c0167p.f2866b.l(c0167p2.f2871g);
            }
        }
        return C0143d.o(iArr, i3);
    }

    public final int A(int i3) {
        int p3 = C0143d.p(this.f2854F.f2656b, i3) + 1;
        int i4 = 0;
        while (p3 < i3) {
            if (!C0143d.l(this.f2854F.f2656b, p3)) {
                i4++;
            }
            p3 += C0143d.j(this.f2854F.f2656b, p3);
        }
        return i4;
    }

    public final boolean B(B.Y y3) {
        J.D d3 = this.f2869e.f3112b;
        if (!d3.k0()) {
            C0143d.w("Expected applyChanges() to have been called");
            throw null;
        }
        if (((C0550x) y3.f334d).f6348e <= 0 && this.f2882r.isEmpty()) {
            return false;
        }
        n(y3, null);
        return d3.l0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0037, code lost:
    
        if (r3.f2730b < r5) goto L11;
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
        O o3;
        boolean z3;
        C0173s0 c0173s0;
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
        C0167p c0167p;
        C0547u c0547u;
        long[] jArr;
        long[] jArr2;
        int E3;
        int i8;
        O o4;
        R1.y yVar;
        C0167p c0167p2 = this;
        boolean z7 = c0167p2.f2853E;
        c0167p2.f2853E = true;
        E0 e02 = c0167p2.f2854F;
        int i9 = e02.f2663i;
        int i10 = (i9 * 5) + 3;
        int i11 = e02.f2656b[i10] + i9;
        int i12 = c0167p2.f2874j;
        int i13 = c0167p2.f2864P;
        int i14 = c0167p2.f2875k;
        int i15 = c0167p2.f2876l;
        ArrayList arrayList = c0167p2.f2882r;
        int E4 = C0143d.E(e02.f2661g, arrayList);
        if (E4 < 0) {
            E4 = -(E4 + 1);
        }
        if (E4 < arrayList.size()) {
            o3 = (O) arrayList.get(E4);
        }
        o3 = null;
        int i16 = i9;
        boolean z8 = false;
        while (o3 != null) {
            int i17 = o3.f2730b;
            int E5 = C0143d.E(i17, arrayList);
            if (E5 >= 0) {
            }
            Object obj = o3.f2731c;
            C0173s0 c0173s02 = o3.f2729a;
            if (obj == null) {
                c0173s02.getClass();
            } else {
                C0550x c0550x = c0173s02.f2909g;
                if (c0550x != null) {
                    z3 = z7;
                    if (obj instanceof F) {
                        z4 = C0173s0.a((F) obj, c0550x);
                        c0173s0 = c0173s02;
                        i3 = i11;
                        i4 = i10;
                        i5 = i12;
                        i6 = i14;
                        i7 = i15;
                    } else {
                        if (obj instanceof C0519A) {
                            C0519A c0519a = (C0519A) obj;
                            if (c0519a.h()) {
                                Object[] objArr3 = c0519a.f6248b;
                                long[] jArr3 = c0519a.f6247a;
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
                                        c0173s0 = c0173s02;
                                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i19 = 8 - ((~(i18 - length)) >>> 31);
                                            int i20 = 0;
                                            while (i20 < i19) {
                                                if ((j3 & 255) < 128) {
                                                    i5 = i12;
                                                    Object obj2 = objArr3[(i18 << 3) + i20];
                                                    objArr2 = objArr3;
                                                    if (!(obj2 instanceof F)) {
                                                        break;
                                                    } else if (C0173s0.a((F) obj2, c0550x)) {
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
                                        c0173s02 = c0173s0;
                                        jArr3 = jArr4;
                                        objArr3 = objArr;
                                        i12 = i5;
                                    }
                                } else {
                                    c0173s0 = c0173s02;
                                    i3 = i11;
                                    i4 = i10;
                                    i5 = i12;
                                    i6 = i14;
                                }
                            } else {
                                c0173s0 = c0173s02;
                                i3 = i11;
                                i4 = i10;
                                i5 = i12;
                                i6 = i14;
                                i7 = i15;
                            }
                            z4 = false;
                        }
                        c0173s0 = c0173s02;
                        i3 = i11;
                        i4 = i10;
                        i5 = i12;
                        i6 = i14;
                        i7 = i15;
                        z4 = true;
                    }
                    if (z4) {
                        C0173s0 c0173s03 = c0173s0;
                        G2.k kVar = c0167p2.D;
                        kVar.f2203d.add(c0173s03);
                        C0176u c0176u = c0173s03.f2904b;
                        if (c0176u == null || (c0547u = c0173s03.f2908f) == null) {
                            z5 = z8;
                        } else {
                            c0173s03.e(true);
                            try {
                                Object[] objArr4 = c0547u.f6331b;
                                int[] iArr = c0547u.f6332c;
                                long[] jArr5 = c0547u.f6330a;
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
                                                    c0176u.w(obj3);
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
                                c0173s03.e(false);
                            } catch (Throwable th) {
                                c0173s03.e(false);
                                throw th;
                            }
                        }
                        ArrayList arrayList2 = kVar.f2203d;
                        z6 = true;
                        arrayList2.remove(arrayList2.size() - 1);
                        c0167p = this;
                        z8 = z5;
                    } else {
                        c0167p2.f2854F.k(i17);
                        int i26 = c0167p2.f2854F.f2661g;
                        c0167p2.F(i16, i26, i9);
                        int i27 = (i26 * 5) + 2;
                        int i28 = c0167p2.f2854F.f2656b[i27];
                        while (i28 != i9 && !C0143d.m(c0167p2.f2854F.f2656b, i28)) {
                            i28 = c0167p2.f2854F.f2656b[(i28 * 5) + 2];
                        }
                        int i29 = C0143d.m(c0167p2.f2854F.f2656b, i28) ? 0 : i5;
                        if (i28 != i26) {
                            int c02 = (c0167p2.c0(i28) - C0143d.o(c0167p2.f2854F.f2656b, i26)) + i29;
                            while (i29 < c02 && i28 != i17) {
                                i28++;
                                while (i28 < i17) {
                                    int[] iArr2 = c0167p2.f2854F.f2656b;
                                    int i30 = iArr2[(i28 * 5) + 3] + i28;
                                    if (i17 >= i30) {
                                        i29 += C0143d.m(iArr2, i28) ? 1 : c0167p2.c0(i28);
                                        i28 = i30;
                                    }
                                }
                                break;
                            }
                        }
                        c0167p2.f2874j = i29;
                        c0167p2.f2876l = c0167p2.A(i26);
                        int i31 = c0167p2.f2854F.f2656b[i27];
                        c0167p2.f2864P = c0167p2.j(i31, c0167p2.A(i31), i9, i13);
                        c0167p2.f2858J = null;
                        InterfaceC0426e interfaceC0426e = c0173s0.f2906d;
                        if (interfaceC0426e != null) {
                            interfaceC0426e.h(c0167p2, 1);
                            yVar = R1.y.f4171a;
                        } else {
                            yVar = null;
                        }
                        if (yVar == null) {
                            throw new IllegalStateException("Invalid restart scope");
                        }
                        c0167p2.f2858J = null;
                        E0 e03 = c0167p2.f2854F;
                        int i32 = e03.f2656b[i4] + i9;
                        int i33 = e03.f2661g;
                        if (!(i33 >= i9 && i33 <= i32)) {
                            C0143d.w("Index " + i9 + " is not a parent of " + i33);
                            throw null;
                        }
                        e03.f2663i = i9;
                        e03.f2662h = i32;
                        e03.f2666l = 0;
                        e03.f2667m = 0;
                        i16 = i26;
                        c0167p = c0167p2;
                        z6 = true;
                        z8 = true;
                    }
                    E3 = C0143d.E(c0167p.f2854F.f2661g, arrayList);
                    if (E3 < 0) {
                        E3 = -(E3 + 1);
                    }
                    if (E3 >= arrayList.size()) {
                        o4 = (O) arrayList.get(E3);
                        i8 = i3;
                        if (o4.f2730b < i8) {
                            c0167p2 = c0167p;
                            i11 = i8;
                            i15 = i7;
                            i14 = i6;
                            i10 = i4;
                            i12 = i5;
                            o3 = o4;
                            z7 = z3;
                        }
                    } else {
                        i8 = i3;
                    }
                    o4 = null;
                    c0167p2 = c0167p;
                    i11 = i8;
                    i15 = i7;
                    i14 = i6;
                    i10 = i4;
                    i12 = i5;
                    o3 = o4;
                    z7 = z3;
                }
            }
            z3 = z7;
            c0173s0 = c0173s02;
            i3 = i11;
            i4 = i10;
            i5 = i12;
            i6 = i14;
            i7 = i15;
            z4 = true;
            if (z4) {
            }
            E3 = C0143d.E(c0167p.f2854F.f2661g, arrayList);
            if (E3 < 0) {
            }
            if (E3 >= arrayList.size()) {
            }
            o4 = null;
            c0167p2 = c0167p;
            i11 = i8;
            i15 = i7;
            i14 = i6;
            i10 = i4;
            i12 = i5;
            o3 = o4;
            z7 = z3;
        }
        boolean z9 = z7;
        C0167p c0167p3 = c0167p2;
        int i34 = i12;
        int i35 = i14;
        int i36 = i15;
        if (z8) {
            c0167p3.F(i16, i9, i9);
            c0167p3.f2854F.m();
            int c03 = c0167p3.c0(i9);
            c0167p3.f2874j = i34 + c03;
            c0167p3.f2875k = i35 + c03;
            c0167p3.f2876l = i36;
        } else {
            K();
        }
        c0167p3.f2864P = i13;
        c0167p3.f2853E = z9;
    }

    public final void D() {
        H(this.f2854F.f2661g);
        C0197b c0197b = this.f2860L;
        c0197b.d(false);
        C0167p c0167p = c0197b.f3113a;
        E0 e02 = c0167p.f2854F;
        if (e02.f2657c > 0) {
            int i3 = e02.f2663i;
            N n3 = c0197b.f3116d;
            int i4 = n3.f2726b;
            if ((i4 > 0 ? n3.f2725a[i4 - 1] : -2) != i3) {
                if (!c0197b.f3115c && c0197b.f3117e) {
                    c0197b.d(false);
                    C0196a c0196a = c0197b.f3114b;
                    c0196a.getClass();
                    c0196a.f3112b.n0(J.l.f3135c);
                    c0197b.f3115c = true;
                }
                if (i3 > 0) {
                    C0141c a3 = e02.a(i3);
                    n3.b(i3);
                    c0197b.d(false);
                    C0196a c0196a2 = c0197b.f3114b;
                    c0196a2.getClass();
                    J.k kVar = J.k.f3134c;
                    J.D d3 = c0196a2.f3112b;
                    d3.o0(kVar);
                    l0.c.O(d3, 0, a3);
                    int i5 = d3.f3110h;
                    int i6 = kVar.f3102a;
                    int h02 = J.D.h0(d3, i6);
                    int i7 = kVar.f3103b;
                    if (i5 != h02 || d3.f3111i != J.D.h0(d3, i7)) {
                        StringBuilder sb = new StringBuilder();
                        int i8 = 0;
                        for (int i9 = 0; i9 < i6; i9++) {
                            if (((1 << i9) & d3.f3110h) != 0) {
                                if (i8 > 0) {
                                    sb.append(", ");
                                }
                                sb.append(kVar.b(i9));
                                i8++;
                            }
                        }
                        String sb2 = sb.toString();
                        StringBuilder l3 = A.k.l(sb2, "StringBuilder().apply(builderAction).toString()");
                        int i10 = 0;
                        for (int i11 = 0; i11 < i7; i11++) {
                            if (((1 << i11) & d3.f3111i) != 0) {
                                if (i8 > 0) {
                                    l3.append(", ");
                                }
                                l3.append(kVar.c(i11));
                                i10++;
                            }
                        }
                        String sb3 = l3.toString();
                        f2.j.e(sb3, "StringBuilder().apply(builderAction).toString()");
                        StringBuilder sb4 = new StringBuilder("Error while pushing ");
                        sb4.append(kVar);
                        sb4.append(". Not all arguments were provided. Missing ");
                        A.k.t(sb4, i8, " int arguments (", sb2, ") and ");
                        A.k.u(sb4, i10, " object arguments (", sb3, ").");
                        throw null;
                    }
                    c0197b.f3115c = true;
                }
            }
        }
        C0196a c0196a3 = c0197b.f3114b;
        c0196a3.getClass();
        c0196a3.f3112b.n0(J.s.f3146c);
        int i12 = c0197b.f3118f;
        E0 e03 = c0167p.f2854F;
        c0197b.f3118f = e03.f2656b[(e03.f2661g * 5) + 3] + i12;
    }

    public final void E(InterfaceC0164n0 interfaceC0164n0) {
        B.Y y3 = this.f2885u;
        if (y3 == null) {
            y3 = new B.Y(11);
            this.f2885u = y3;
        }
        ((SparseArray) y3.f334d).put(this.f2854F.f2661g, interfaceC0164n0);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0082 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void F(int i3, int i4, int i5) {
        int[] iArr;
        E0 e02 = this.f2854F;
        if (i3 != i4) {
            if (i3 != i5 && i4 != i5) {
                int[] iArr2 = e02.f2656b;
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
                                iArr = e02.f2656b;
                                if (i8 <= 0 || i8 == i5) {
                                    break;
                                }
                                i8 = C0143d.p(iArr, i8);
                                i9++;
                            }
                            int i10 = i4;
                            int i11 = 0;
                            while (i10 > 0 && i10 != i5) {
                                i10 = C0143d.p(iArr, i10);
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
                if (!C0143d.m(e02.f2656b, i3)) {
                    this.f2860L.a();
                }
                i3 = e02.f2656b[(i3 * 5) + 2];
            }
            o(i4, i5);
        }
        i5 = i3;
        while (i3 > 0) {
            if (!C0143d.m(e02.f2656b, i3)) {
            }
            i3 = e02.f2656b[(i3 * 5) + 2];
        }
        o(i4, i5);
    }

    public final Object G() {
        boolean z3 = this.f2863O;
        W w2 = C0159l.f2829a;
        if (!z3) {
            Object h3 = this.f2854F.h();
            return (!this.f2888x || (h3 instanceof C0161m)) ? h3 instanceof B0 ? ((B0) h3).f2639a : h3 : w2;
        }
        if (!this.f2881q) {
            return w2;
        }
        C0143d.w("A call to createNode(), emitNode() or useNode() expected");
        throw null;
    }

    public final void H(int i3) {
        I(this, i3, false, 0);
        this.f2860L.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void J() {
        int rotateLeft;
        int hashCode;
        if (this.f2882r.isEmpty()) {
            this.f2875k = this.f2854F.l() + this.f2875k;
            return;
        }
        E0 e02 = this.f2854F;
        int f3 = e02.f();
        int i3 = e02.f2661g;
        int i4 = e02.f2662h;
        int[] iArr = e02.f2656b;
        Object j3 = i3 < i4 ? e02.j(iArr, i3) : null;
        Object e3 = e02.e();
        int i5 = this.f2876l;
        W w2 = C0159l.f2829a;
        if (j3 != null) {
            rotateLeft = Integer.rotateLeft((j3 instanceof Enum ? ((Enum) j3).ordinal() : j3.hashCode()) ^ Integer.rotateLeft(this.f2864P, 3), 3);
        } else {
            if (e3 != null && f3 == 207 && !e3.equals(w2)) {
                this.f2864P = Integer.rotateLeft(e3.hashCode() ^ Integer.rotateLeft(this.f2864P, 3), 3) ^ i5;
                P(null, C0143d.m(iArr, e02.f2661g));
                C();
                e02.d();
                if (j3 == null) {
                    hashCode = Integer.hashCode(j3 instanceof Enum ? ((Enum) j3).ordinal() : j3.hashCode()) ^ Integer.rotateRight(this.f2864P, 3);
                } else {
                    if (e3 != null && f3 == 207 && !e3.equals(w2)) {
                        this.f2864P = Integer.rotateRight(Integer.hashCode(e3.hashCode()) ^ Integer.rotateRight(this.f2864P ^ i5, 3), 3);
                        return;
                    }
                    hashCode = Integer.rotateRight(this.f2864P ^ i5, 3) ^ Integer.hashCode(f3);
                }
                this.f2864P = Integer.rotateRight(hashCode, 3);
            }
            rotateLeft = Integer.rotateLeft(Integer.rotateLeft(this.f2864P, 3) ^ f3, 3) ^ i5;
        }
        this.f2864P = rotateLeft;
        P(null, C0143d.m(iArr, e02.f2661g));
        C();
        e02.d();
        if (j3 == null) {
        }
        this.f2864P = Integer.rotateRight(hashCode, 3);
    }

    public final void K() {
        E0 e02 = this.f2854F;
        int i3 = e02.f2663i;
        this.f2875k = i3 >= 0 ? C0143d.o(e02.f2656b, i3) : 0;
        this.f2854F.m();
    }

    public final void L() {
        if (this.f2875k != 0) {
            C0143d.w("No nodes can be emitted before calling skipAndEndGroup");
            throw null;
        }
        C0173s0 v3 = v();
        if (v3 != null) {
            v3.f2903a |= 16;
        }
        if (this.f2882r.isEmpty()) {
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
        C0162m0 c0162m0;
        Object obj3;
        int i5;
        int i6;
        int i7;
        C0167p c0167p = this;
        Object obj4 = obj;
        if (c0167p.f2881q) {
            C0143d.w("A call to createNode(), emitNode() or useNode() expected");
            throw null;
        }
        int i8 = c0167p.f2876l;
        W w2 = C0159l.f2829a;
        if (obj4 != null) {
            rotateLeft = Integer.rotateLeft((obj4 instanceof Enum ? ((Enum) obj4).ordinal() : obj.hashCode()) ^ Integer.rotateLeft(c0167p.f2864P, 3), 3);
        } else {
            if (obj2 != null && i3 == 207 && !obj2.equals(w2)) {
                c0167p.f2864P = i8 ^ Integer.rotateLeft(obj2.hashCode() ^ Integer.rotateLeft(c0167p.f2864P, 3), 3);
                if (obj4 == null) {
                    c0167p.f2876l++;
                }
                boolean z3 = i4 == 0;
                if (!c0167p.f2863O) {
                    c0167p.f2854F.f2665k++;
                    H0 h02 = c0167p.f2856H;
                    int i9 = h02.f2706t;
                    if (z3) {
                        h02.I(i3, w2, true, w2);
                    } else if (obj2 != null) {
                        if (obj4 == null) {
                            obj4 = w2;
                        }
                        h02.I(i3, obj4, false, obj2);
                    } else {
                        if (obj4 == null) {
                            obj4 = w2;
                        }
                        h02.I(i3, obj4, false, w2);
                    }
                    C0162m0 c0162m02 = c0167p.f2873i;
                    if (c0162m02 != null) {
                        int i10 = (-2) - i9;
                        Q q3 = new Q(-1, i3, i10, -1);
                        c0162m02.f2838e.i(i10, new K(-1, c0167p.f2874j - c0162m02.f2835b, 0));
                        c0162m02.f2837d.add(q3);
                    }
                    c0167p.t(z3, null);
                    return;
                }
                boolean z4 = i4 == 1 && c0167p.f2888x;
                if (c0167p.f2873i == null) {
                    int f3 = c0167p.f2854F.f();
                    if (!z4 && f3 == i3) {
                        E0 e02 = c0167p.f2854F;
                        int i11 = e02.f2661g;
                        if (f2.j.a(obj4, i11 < e02.f2662h ? e02.j(e02.f2656b, i11) : null)) {
                            c0167p.P(obj2, z3);
                        }
                    }
                    E0 e03 = c0167p.f2854F;
                    e03.getClass();
                    ArrayList arrayList = new ArrayList();
                    if (e03.f2665k <= 0) {
                        int i12 = e03.f2661g;
                        while (i12 < e03.f2662h) {
                            int i13 = i12 * 5;
                            int[] iArr = e03.f2656b;
                            arrayList.add(new Q(e03.j(iArr, i12), iArr[i13], i12, C0143d.m(iArr, i12) ? 1 : C0143d.o(iArr, i12)));
                            i12 += iArr[i13 + 3];
                        }
                    }
                    c0167p.f2873i = new C0162m0(c0167p.f2874j, arrayList);
                }
                C0162m0 c0162m03 = c0167p.f2873i;
                if (c0162m03 != null) {
                    Object p3 = obj4 != null ? new P(Integer.valueOf(i3), obj4) : Integer.valueOf(i3);
                    C0550x c0550x = ((C0140b0) c0162m03.f2839f.getValue()).f2793a;
                    Object e3 = c0550x.e(p3);
                    if (e3 != null) {
                        if (!(e3 instanceof List) || ((e3 instanceof InterfaceC0439a) && !(e3 instanceof InterfaceC0441c))) {
                            c0550x.g(p3);
                            obj3 = e3;
                        } else {
                            List b3 = f2.x.b(e3);
                            obj3 = b3.remove(0);
                            if (b3.isEmpty()) {
                                c0550x.g(p3);
                            }
                        }
                        f2.j.d(obj3, "null cannot be cast to non-null type V of androidx.compose.runtime.MutableScatterMultiMap.pop_impl$lambda$1");
                    } else {
                        obj3 = null;
                    }
                    Q q4 = (Q) obj3;
                    ArrayList arrayList2 = c0162m03.f2837d;
                    C0542p c0542p = c0162m03.f2838e;
                    int i14 = c0162m03.f2835b;
                    if (z4 || q4 == null) {
                        c0167p.f2854F.f2665k++;
                        c0167p.f2863O = true;
                        c0167p.f2858J = null;
                        if (c0167p.f2856H.f2709w) {
                            H0 i15 = c0167p.f2855G.i();
                            c0167p.f2856H = i15;
                            i15.D();
                            c0167p.f2857I = false;
                            c0167p.f2858J = null;
                        }
                        c0167p.f2856H.d();
                        H0 h03 = c0167p.f2856H;
                        int i16 = h03.f2706t;
                        if (z3) {
                            h03.I(i3, w2, true, w2);
                        } else if (obj2 != null) {
                            if (obj4 == null) {
                                obj4 = w2;
                            }
                            h03.I(i3, obj4, false, obj2);
                        } else {
                            if (obj4 == null) {
                                obj4 = w2;
                            }
                            h03.I(i3, obj4, false, w2);
                        }
                        c0167p.f2861M = c0167p.f2856H.b(i16);
                        int i17 = (-2) - i16;
                        Q q5 = new Q(-1, i3, i17, -1);
                        c0542p.i(i17, new K(-1, c0167p.f2874j - i14, 0));
                        arrayList2.add(q5);
                        c0162m0 = new C0162m0(z3 ? 0 : c0167p.f2874j, new ArrayList());
                        c0167p.t(z3, c0162m0);
                        return;
                    }
                    arrayList2.add(q4);
                    int i18 = q4.f2744c;
                    K k3 = (K) c0542p.f(i18);
                    c0167p.f2874j = (k3 != null ? k3.f2715b : -1) + i14;
                    K k4 = (K) c0542p.f(i18);
                    int i19 = k4 != null ? k4.f2714a : -1;
                    int i20 = c0162m03.f2836c;
                    int i21 = i19 - i20;
                    char c2 = 7;
                    int i22 = 8;
                    if (i19 > i20) {
                        Object[] objArr = c0542p.f6304c;
                        long[] jArr = c0542p.f6302a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i23 = 0;
                            while (true) {
                                long j3 = jArr[i23];
                                i5 = i21;
                                if ((((~j3) << c2) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i24 = 8 - ((~(i23 - length)) >>> 31);
                                    for (int i25 = 0; i25 < i24; i25++) {
                                        if ((j3 & 255) < 128) {
                                            K k5 = (K) objArr[(i23 << 3) + i25];
                                            int i26 = k5.f2714a;
                                            if (i26 == i19) {
                                                k5.f2714a = i20;
                                            } else if (i20 <= i26 && i26 < i19) {
                                                k5.f2714a = i26 + 1;
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
                                c2 = 7;
                            }
                        } else {
                            i5 = i21;
                        }
                    } else {
                        i5 = i21;
                        if (i20 > i19) {
                            Object[] objArr2 = c0542p.f6304c;
                            long[] jArr2 = c0542p.f6302a;
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
                                                K k6 = (K) objArr2[(i27 << 3) + i29];
                                                int i30 = k6.f2714a;
                                                if (i30 == i19) {
                                                    k6.f2714a = i20;
                                                } else if (i19 + 1 <= i30 && i30 < i20) {
                                                    k6.f2714a = i30 - 1;
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
                    C0197b c0197b = c0167p.f2860L;
                    int i31 = c0197b.f3118f;
                    C0167p c0167p2 = c0197b.f3113a;
                    c0197b.f3118f = (i18 - c0167p2.f2854F.f2661g) + i31;
                    c0167p.f2854F.k(i18);
                    if (i5 > 0) {
                        c0197b.d(false);
                        E0 e04 = c0167p2.f2854F;
                        if (e04.f2657c > 0) {
                            int i32 = e04.f2663i;
                            N n3 = c0197b.f3116d;
                            int i33 = n3.f2726b;
                            if ((i33 > 0 ? n3.f2725a[i33 - 1] : -2) != i32) {
                                if (!c0197b.f3115c && c0197b.f3117e) {
                                    c0197b.d(false);
                                    C0196a c0196a = c0197b.f3114b;
                                    c0196a.getClass();
                                    c0196a.f3112b.n0(J.l.f3135c);
                                    c0197b.f3115c = true;
                                }
                                if (i32 > 0) {
                                    C0141c a3 = e04.a(i32);
                                    n3.b(i32);
                                    c0197b.d(false);
                                    C0196a c0196a2 = c0197b.f3114b;
                                    c0196a2.getClass();
                                    J.k kVar = J.k.f3134c;
                                    J.D d3 = c0196a2.f3112b;
                                    d3.o0(kVar);
                                    l0.c.O(d3, 0, a3);
                                    int i34 = d3.f3110h;
                                    int i35 = kVar.f3102a;
                                    int h04 = J.D.h0(d3, i35);
                                    int i36 = kVar.f3103b;
                                    if (i34 != h04 || d3.f3111i != J.D.h0(d3, i36)) {
                                        int i37 = 1;
                                        StringBuilder sb = new StringBuilder();
                                        int i38 = 0;
                                        int i39 = 0;
                                        while (i38 < i35) {
                                            if (((i37 << i38) & d3.f3110h) != 0) {
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
                                        StringBuilder l3 = A.k.l(sb2, "StringBuilder().apply(builderAction).toString()");
                                        int i40 = 0;
                                        int i41 = 0;
                                        while (i40 < i36) {
                                            int i42 = i36;
                                            if (((1 << i40) & d3.f3111i) != 0) {
                                                if (i39 > 0) {
                                                    l3.append(", ");
                                                }
                                                l3.append(kVar.c(i40));
                                                i41++;
                                            }
                                            i40++;
                                            i36 = i42;
                                        }
                                        String sb3 = l3.toString();
                                        f2.j.e(sb3, "StringBuilder().apply(builderAction).toString()");
                                        StringBuilder sb4 = new StringBuilder("Error while pushing ");
                                        sb4.append(kVar);
                                        sb4.append(". Not all arguments were provided. Missing ");
                                        A.k.t(sb4, i39, " int arguments (", sb2, ") and ");
                                        A.k.u(sb4, i41, " object arguments (", sb3, ").");
                                        throw null;
                                    }
                                    c0197b.f3115c = true;
                                }
                            }
                        }
                        C0196a c0196a3 = c0197b.f3114b;
                        c0196a3.getClass();
                        J.p pVar = J.p.f3143c;
                        J.D d4 = c0196a3.f3112b;
                        d4.o0(pVar);
                        l0.c.N(d4, 0, i5);
                        int i43 = d4.f3110h;
                        int i44 = pVar.f3102a;
                        int h05 = J.D.h0(d4, i44);
                        int i45 = pVar.f3103b;
                        if (i43 != h05 || d4.f3111i != J.D.h0(d4, i45)) {
                            StringBuilder sb5 = new StringBuilder();
                            int i46 = 0;
                            for (int i47 = 0; i47 < i44; i47++) {
                                if (((1 << i47) & d4.f3110h) != 0) {
                                    if (i46 > 0) {
                                        sb5.append(", ");
                                    }
                                    sb5.append(pVar.b(i47));
                                    i46++;
                                }
                            }
                            String sb6 = sb5.toString();
                            StringBuilder l4 = A.k.l(sb6, "StringBuilder().apply(builderAction).toString()");
                            int i48 = 0;
                            int i49 = 0;
                            while (i48 < i45) {
                                int i50 = i45;
                                if (((1 << i48) & d4.f3111i) != 0) {
                                    if (i46 > 0) {
                                        l4.append(", ");
                                    }
                                    l4.append(pVar.c(i48));
                                    i49++;
                                }
                                i48++;
                                i45 = i50;
                            }
                            String sb7 = l4.toString();
                            f2.j.e(sb7, "StringBuilder().apply(builderAction).toString()");
                            StringBuilder sb8 = new StringBuilder("Error while pushing ");
                            sb8.append(pVar);
                            sb8.append(". Not all arguments were provided. Missing ");
                            A.k.t(sb8, i46, " int arguments (", sb6, ") and ");
                            A.k.u(sb8, i49, " object arguments (", sb7, ").");
                            throw null;
                        }
                    }
                    c0167p = this;
                    c0167p.P(obj2, z3);
                }
                c0162m0 = null;
                c0167p.t(z3, c0162m0);
                return;
            }
            rotateLeft = i8 ^ Integer.rotateLeft(Integer.rotateLeft(c0167p.f2864P, 3) ^ i3, 3);
        }
        c0167p.f2864P = rotateLeft;
        if (obj4 == null) {
        }
        if (i4 == 0) {
        }
        if (!c0167p.f2863O) {
        }
    }

    public final void N() {
        M(-127, 0, null, null);
    }

    public final void O(int i3, C0144d0 c0144d0) {
        M(i3, 0, c0144d0, null);
    }

    public final void P(Object obj, boolean z3) {
        if (z3) {
            E0 e02 = this.f2854F;
            if (e02.f2665k <= 0) {
                if (C0143d.m(e02.f2656b, e02.f2661g)) {
                    e02.n();
                    return;
                } else {
                    C0143d.S("Expected a node group");
                    throw null;
                }
            }
            return;
        }
        if (obj != null && this.f2854F.e() != obj) {
            C0197b c0197b = this.f2860L;
            c0197b.getClass();
            c0197b.d(false);
            C0196a c0196a = c0197b.f3114b;
            c0196a.getClass();
            J.y yVar = J.y.f3152c;
            J.D d3 = c0196a.f3112b;
            d3.o0(yVar);
            l0.c.O(d3, 0, obj);
            int i3 = d3.f3110h;
            int i4 = yVar.f3102a;
            int h02 = J.D.h0(d3, i4);
            int i5 = yVar.f3103b;
            if (i3 != h02 || d3.f3111i != J.D.h0(d3, i5)) {
                StringBuilder sb = new StringBuilder();
                int i6 = 0;
                for (int i7 = 0; i7 < i4; i7++) {
                    if (((1 << i7) & d3.f3110h) != 0) {
                        if (i6 > 0) {
                            sb.append(", ");
                        }
                        sb.append(yVar.b(i7));
                        i6++;
                    }
                }
                String sb2 = sb.toString();
                StringBuilder l3 = A.k.l(sb2, "StringBuilder().apply(builderAction).toString()");
                int i8 = 0;
                for (int i9 = 0; i9 < i5; i9++) {
                    if (((1 << i9) & d3.f3111i) != 0) {
                        if (i6 > 0) {
                            l3.append(", ");
                        }
                        l3.append(yVar.c(i9));
                        i8++;
                    }
                }
                String sb3 = l3.toString();
                f2.j.e(sb3, "StringBuilder().apply(builderAction).toString()");
                StringBuilder sb4 = new StringBuilder("Error while pushing ");
                sb4.append(yVar);
                sb4.append(". Not all arguments were provided. Missing ");
                A.k.t(sb4, i6, " int arguments (", sb2, ") and ");
                A.k.u(sb4, i8, " object arguments (", sb3, ").");
                throw null;
            }
        }
        this.f2854F.n();
    }

    public final void Q(int i3) {
        int i4;
        int i5;
        if (this.f2873i != null) {
            M(i3, 0, null, null);
            return;
        }
        if (this.f2881q) {
            C0143d.w("A call to createNode(), emitNode() or useNode() expected");
            throw null;
        }
        this.f2864P = this.f2876l ^ Integer.rotateLeft(Integer.rotateLeft(this.f2864P, 3) ^ i3, 3);
        this.f2876l++;
        E0 e02 = this.f2854F;
        boolean z3 = this.f2863O;
        W w2 = C0159l.f2829a;
        if (z3) {
            e02.f2665k++;
            this.f2856H.I(i3, w2, false, w2);
            t(false, null);
            return;
        }
        if (e02.f() == i3 && ((i5 = e02.f2661g) >= e02.f2662h || !C0143d.l(e02.f2656b, i5))) {
            e02.n();
            t(false, null);
            return;
        }
        if (e02.f2665k <= 0 && (i4 = e02.f2661g) != e02.f2662h) {
            int i6 = this.f2874j;
            D();
            this.f2860L.e(i6, e02.l());
            C0143d.q(this.f2882r, i4, e02.f2661g);
        }
        e02.f2665k++;
        this.f2863O = true;
        this.f2858J = null;
        if (this.f2856H.f2709w) {
            H0 i7 = this.f2855G.i();
            this.f2856H = i7;
            i7.D();
            this.f2857I = false;
            this.f2858J = null;
        }
        H0 h02 = this.f2856H;
        h02.d();
        int i8 = h02.f2706t;
        h02.I(i3, w2, false, w2);
        this.f2861M = h02.b(i8);
        t(false, null);
    }

    public final void R(int i3) {
        M(i3, 0, null, null);
    }

    public final C0167p S(int i3) {
        C0173s0 c0173s0;
        Q(i3);
        boolean z3 = this.f2863O;
        C0176u c0176u = this.f2871g;
        G2.k kVar = this.D;
        if (z3) {
            C0173s0 c0173s02 = new C0173s0(c0176u);
            kVar.f2203d.add(c0173s02);
            b0(c0173s02);
            c0173s02.f2907e = this.f2851A;
            c0173s02.f2903a &= -17;
        } else {
            ArrayList arrayList = this.f2882r;
            int E3 = C0143d.E(this.f2854F.f2663i, arrayList);
            O o3 = E3 >= 0 ? (O) arrayList.remove(E3) : null;
            Object h3 = this.f2854F.h();
            if (f2.j.a(h3, C0159l.f2829a)) {
                c0173s0 = new C0173s0(c0176u);
                b0(c0173s0);
            } else {
                f2.j.d(h3, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
                c0173s0 = (C0173s0) h3;
            }
            if (o3 == null) {
                int i4 = c0173s0.f2903a;
                boolean z4 = (i4 & 64) != 0;
                if (z4) {
                    c0173s0.f2903a = i4 & (-65);
                }
                if (!z4) {
                    c0173s0.f2903a &= -9;
                    kVar.f2203d.add(c0173s0);
                    c0173s0.f2907e = this.f2851A;
                    c0173s0.f2903a &= -17;
                }
            }
            c0173s0.f2903a |= 8;
            kVar.f2203d.add(c0173s0);
            c0173s0.f2907e = this.f2851A;
            c0173s0.f2903a &= -17;
        }
        return this;
    }

    public final void T(Object obj) {
        if (!this.f2863O && this.f2854F.f() == 207 && !f2.j.a(this.f2854F.e(), obj) && this.f2889y < 0) {
            this.f2889y = this.f2854F.f2661g;
            this.f2888x = true;
        }
        M(207, 0, null, obj);
    }

    public final void U() {
        M(125, 2, null, null);
        this.f2881q = true;
    }

    public final void V() {
        this.f2876l = 0;
        F0 f02 = this.f2867c;
        this.f2854F = f02.d();
        M(100, 0, null, null);
        r rVar = this.f2866b;
        rVar.m();
        this.f2884t = rVar.f();
        this.f2887w.b(this.f2886v ? 1 : 0);
        this.f2886v = f(this.f2884t);
        this.f2858J = null;
        if (!this.f2880p) {
            this.f2880p = rVar.d();
        }
        if (!this.f2852B) {
            this.f2852B = rVar.e();
        }
        Set set = (Set) C0143d.L(this.f2884t, T.b.f4334a);
        if (set != null) {
            set.add(f02);
            rVar.j(set);
        }
        M(rVar.g(), 0, null, null);
    }

    public final boolean W(C0173s0 c0173s0, Object obj) {
        C0141c c0141c = c0173s0.f2905c;
        if (c0141c == null) {
            return false;
        }
        int b3 = this.f2854F.f2655a.b(c0141c);
        if (!this.f2853E || b3 < this.f2854F.f2661g) {
            return false;
        }
        ArrayList arrayList = this.f2882r;
        int E3 = C0143d.E(b3, arrayList);
        if (E3 < 0) {
            int i3 = -(E3 + 1);
            if (!(obj instanceof F)) {
                obj = null;
            }
            arrayList.add(i3, new O(c0173s0, b3, obj));
        } else {
            O o3 = (O) arrayList.get(E3);
            if (obj instanceof F) {
                Object obj2 = o3.f2731c;
                if (obj2 == null) {
                    o3.f2731c = obj;
                } else if (obj2 instanceof C0519A) {
                    ((C0519A) obj2).a(obj);
                } else {
                    int i4 = AbstractC0523E.f6255a;
                    C0519A c0519a = new C0519A(2);
                    c0519a.f6248b[c0519a.d(obj2)] = obj2;
                    c0519a.f6248b[c0519a.d(obj)] = obj;
                    o3.f2731c = c0519a;
                }
            } else {
                o3.f2731c = null;
            }
        }
        return true;
    }

    public final void X(int i3, int i4) {
        if (c0(i3) != i4) {
            if (i3 < 0) {
                C0540n c0540n = this.f2879o;
                if (c0540n == null) {
                    c0540n = new C0540n();
                    this.f2879o = c0540n;
                }
                c0540n.f(i3, i4);
                return;
            }
            int[] iArr = this.f2878n;
            if (iArr == null) {
                int i5 = this.f2854F.f2657c;
                int[] iArr2 = new int[i5];
                Arrays.fill(iArr2, 0, i5, -1);
                this.f2878n = iArr2;
                iArr = iArr2;
            }
            iArr[i3] = i4;
        }
    }

    public final void Y(int i3, int i4) {
        int c02 = c0(i3);
        if (c02 != i4) {
            int i5 = i4 - c02;
            G2.k kVar = this.f2872h;
            int size = kVar.f2203d.size() - 1;
            while (i3 != -1) {
                int c03 = c0(i3) + i5;
                X(i3, c03);
                int i6 = size;
                while (true) {
                    if (-1 < i6) {
                        C0162m0 c0162m0 = (C0162m0) kVar.f2203d.get(i6);
                        if (c0162m0 != null && c0162m0.a(i3, c03)) {
                            size = i6 - 1;
                            break;
                        }
                        i6--;
                    } else {
                        break;
                    }
                }
                if (i3 < 0) {
                    i3 = this.f2854F.f2663i;
                } else if (C0143d.m(this.f2854F.f2656b, i3)) {
                    return;
                } else {
                    i3 = C0143d.p(this.f2854F.f2656b, i3);
                }
            }
        }
    }

    public final Q.d Z(InterfaceC0164n0 interfaceC0164n0, Q.d dVar) {
        Q.d dVar2 = (Q.d) interfaceC0164n0;
        dVar2.getClass();
        Q.c cVar = new Q.c(dVar2);
        cVar.putAll(dVar);
        Q.d a3 = cVar.a();
        O(204, C0143d.f2798d);
        z();
        b0(a3);
        z();
        b0(dVar);
        p(false);
        return a3;
    }

    public final void a() {
        i();
        this.f2872h.f2203d.clear();
        this.f2877m.f2726b = 0;
        this.f2883s.f2726b = 0;
        this.f2887w.f2726b = 0;
        this.f2885u = null;
        C0198c c0198c = this.f2862N;
        c0198c.f3126c.i0();
        c0198c.f3125b.i0();
        this.f2864P = 0;
        this.f2890z = 0;
        this.f2881q = false;
        this.f2863O = false;
        this.f2888x = false;
        this.f2853E = false;
        this.f2889y = -1;
        E0 e02 = this.f2854F;
        if (!e02.f2660f) {
            e02.c();
        }
        if (this.f2856H.f2709w) {
            return;
        }
        u();
    }

    public final void a0(Object obj) {
        int i3;
        E0 e02;
        int i4;
        H0 h02;
        if (obj instanceof A0) {
            C0141c c0141c = null;
            if (this.f2863O) {
                C0196a c0196a = this.f2860L.f3114b;
                c0196a.getClass();
                J.r rVar = J.r.f3145c;
                J.D d3 = c0196a.f3112b;
                d3.o0(rVar);
                l0.c.O(d3, 0, (A0) obj);
                int i5 = d3.f3110h;
                int i6 = rVar.f3102a;
                int h03 = J.D.h0(d3, i6);
                int i7 = rVar.f3103b;
                if (i5 != h03 || d3.f3111i != J.D.h0(d3, i7)) {
                    StringBuilder sb = new StringBuilder();
                    int i8 = 0;
                    for (int i9 = 0; i9 < i6; i9++) {
                        if (((1 << i9) & d3.f3110h) != 0) {
                            if (i8 > 0) {
                                sb.append(", ");
                            }
                            sb.append(rVar.b(i9));
                            i8++;
                        }
                    }
                    String sb2 = sb.toString();
                    StringBuilder l3 = A.k.l(sb2, "StringBuilder().apply(builderAction).toString()");
                    int i10 = 0;
                    for (int i11 = 0; i11 < i7; i11++) {
                        if (((1 << i11) & d3.f3111i) != 0) {
                            if (i8 > 0) {
                                l3.append(", ");
                            }
                            l3.append(rVar.c(i11));
                            i10++;
                        }
                    }
                    String sb3 = l3.toString();
                    f2.j.e(sb3, "StringBuilder().apply(builderAction).toString()");
                    StringBuilder sb4 = new StringBuilder("Error while pushing ");
                    sb4.append(rVar);
                    sb4.append(". Not all arguments were provided. Missing ");
                    A.k.t(sb4, i8, " int arguments (", sb2, ") and ");
                    A.k.u(sb4, i10, " object arguments (", sb3, ").");
                    throw null;
                }
            }
            this.f2868d.add(obj);
            A0 a02 = (A0) obj;
            if (this.f2863O) {
                H0 h04 = this.f2856H;
                int i12 = h04.f2706t;
                if (i12 > h04.f2708v + 1) {
                    int i13 = i12 - 1;
                    int x3 = h04.x(h04.f2688b, i13);
                    while (true) {
                        i4 = i13;
                        i13 = x3;
                        h02 = this.f2856H;
                        if (i13 == h02.f2708v || i13 < 0) {
                            break;
                        } else {
                            x3 = h02.x(h02.f2688b, i13);
                        }
                    }
                    c0141c = h02.b(i4);
                }
            } else {
                E0 e03 = this.f2854F;
                int i14 = e03.f2661g;
                if (i14 > e03.f2663i + 1) {
                    int i15 = i14 - 1;
                    int i16 = e03.f2656b[(i15 * 5) + 2];
                    while (true) {
                        i3 = i15;
                        i15 = i16;
                        e02 = this.f2854F;
                        if (i15 == e02.f2663i || i15 < 0) {
                            break;
                        } else {
                            i16 = e02.f2656b[(i15 * 5) + 2];
                        }
                    }
                    c0141c = e02.a(i3);
                }
            }
            B0 b02 = new B0();
            b02.f2639a = a02;
            b02.f2640b = c0141c;
            obj = b02;
        }
        b0(obj);
    }

    public final void b(Object obj, InterfaceC0426e interfaceC0426e) {
        int i3 = 0;
        if (this.f2863O) {
            C0198c c0198c = this.f2862N;
            c0198c.getClass();
            J.z zVar = J.z.f3153c;
            J.D d3 = c0198c.f3125b;
            d3.o0(zVar);
            l0.c.O(d3, 0, obj);
            f2.j.d(interfaceC0426e, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
            f2.x.d(2, interfaceC0426e);
            l0.c.O(d3, 1, interfaceC0426e);
            int i4 = d3.f3110h;
            int i5 = zVar.f3102a;
            int h02 = J.D.h0(d3, i5);
            int i6 = zVar.f3103b;
            if (i4 == h02 && d3.f3111i == J.D.h0(d3, i6)) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            int i7 = 0;
            while (i7 < i5) {
                int i8 = i5;
                if (((1 << i7) & d3.f3110h) != 0) {
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
            StringBuilder l3 = A.k.l(sb2, "StringBuilder().apply(builderAction).toString()");
            int i9 = 0;
            int i10 = 0;
            while (i10 < i6) {
                int i11 = i6;
                if (((1 << i10) & d3.f3111i) != 0) {
                    if (i3 > 0) {
                        l3.append(", ");
                    }
                    l3.append(zVar.c(i10));
                    i9++;
                }
                i10++;
                i6 = i11;
            }
            String sb3 = l3.toString();
            f2.j.e(sb3, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb4 = new StringBuilder("Error while pushing ");
            sb4.append(zVar);
            sb4.append(". Not all arguments were provided. Missing ");
            A.k.t(sb4, i3, " int arguments (", sb2, ") and ");
            A.k.u(sb4, i9, " object arguments (", sb3, ").");
            throw null;
        }
        C0197b c0197b = this.f2860L;
        c0197b.b();
        C0196a c0196a = c0197b.f3114b;
        c0196a.getClass();
        J.z zVar2 = J.z.f3153c;
        J.D d4 = c0196a.f3112b;
        d4.o0(zVar2);
        int i12 = 0;
        l0.c.O(d4, 0, obj);
        f2.j.d(interfaceC0426e, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
        f2.x.d(2, interfaceC0426e);
        l0.c.O(d4, 1, interfaceC0426e);
        int i13 = d4.f3110h;
        int i14 = zVar2.f3102a;
        int h03 = J.D.h0(d4, i14);
        int i15 = zVar2.f3103b;
        if (i13 == h03 && d4.f3111i == J.D.h0(d4, i15)) {
            return;
        }
        StringBuilder sb5 = new StringBuilder();
        for (int i16 = 0; i16 < i14; i16++) {
            if (((1 << i16) & d4.f3110h) != 0) {
                if (i12 > 0) {
                    sb5.append(", ");
                }
                sb5.append(zVar2.b(i16));
                i12++;
            }
        }
        String sb6 = sb5.toString();
        StringBuilder l4 = A.k.l(sb6, "StringBuilder().apply(builderAction).toString()");
        int i17 = 0;
        int i18 = 0;
        while (i17 < i15) {
            int i19 = i15;
            if (((1 << i17) & d4.f3111i) != 0) {
                if (i12 > 0) {
                    l4.append(", ");
                }
                l4.append(zVar2.c(i17));
                i18++;
            }
            i17++;
            i15 = i19;
        }
        String sb7 = l4.toString();
        f2.j.e(sb7, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb8 = new StringBuilder("Error while pushing ");
        sb8.append(zVar2);
        sb8.append(". Not all arguments were provided. Missing ");
        A.k.t(sb8, i12, " int arguments (", sb6, ") and ");
        A.k.u(sb8, i18, " object arguments (", sb7, ").");
        throw null;
    }

    public final void b0(Object obj) {
        int i3;
        int i4;
        if (this.f2863O) {
            H0 h02 = this.f2856H;
            if (h02.f2700n <= 0 || h02.f2695i == h02.f2697k) {
                h02.y(obj);
                return;
            }
            C0542p c0542p = h02.f2705s;
            if (c0542p == null) {
                c0542p = new C0542p();
            }
            h02.f2705s = c0542p;
            int i5 = h02.f2708v;
            Object f3 = c0542p.f(i5);
            if (f3 == null) {
                f3 = new C0548v();
                c0542p.i(i5, f3);
            }
            ((C0548v) f3).a(obj);
            return;
        }
        E0 e02 = this.f2854F;
        boolean z3 = e02.f2668n;
        int i6 = 1;
        C0197b c0197b = this.f2860L;
        if (!z3) {
            C0141c a3 = e02.a(e02.f2663i);
            C0196a c0196a = c0197b.f3114b;
            c0196a.getClass();
            J.e eVar = J.e.f3128c;
            J.D d3 = c0196a.f3112b;
            d3.o0(eVar);
            int i7 = 0;
            l0.c.O(d3, 0, a3);
            l0.c.O(d3, 1, obj);
            int i8 = d3.f3110h;
            int i9 = eVar.f3102a;
            int h03 = J.D.h0(d3, i9);
            int i10 = eVar.f3103b;
            if (i8 == h03 && d3.f3111i == J.D.h0(d3, i10)) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            int i11 = 0;
            while (i11 < i9) {
                if (((i6 << i11) & d3.f3110h) != 0) {
                    if (i7 > 0) {
                        sb.append(", ");
                    }
                    sb.append(eVar.b(i11));
                    i7++;
                }
                i11++;
                i6 = 1;
            }
            String sb2 = sb.toString();
            StringBuilder l3 = A.k.l(sb2, "StringBuilder().apply(builderAction).toString()");
            int i12 = 0;
            int i13 = 0;
            while (i12 < i10) {
                int i14 = i10;
                if (((1 << i12) & d3.f3111i) != 0) {
                    if (i7 > 0) {
                        l3.append(", ");
                    }
                    l3.append(eVar.c(i12));
                    i13++;
                }
                i12++;
                i10 = i14;
            }
            String sb3 = l3.toString();
            f2.j.e(sb3, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb4 = new StringBuilder("Error while pushing ");
            sb4.append(eVar);
            sb4.append(". Not all arguments were provided. Missing ");
            A.k.t(sb4, i7, " int arguments (", sb2, ") and ");
            A.k.u(sb4, i13, " object arguments (", sb3, ").");
            throw null;
        }
        int r3 = (e02.f2666l - C0143d.r(e02.f2656b, e02.f2663i)) - 1;
        if (c0197b.f3113a.f2854F.f2663i - c0197b.f3118f >= 0) {
            c0197b.d(true);
            C0196a c0196a2 = c0197b.f3114b;
            J.m mVar = J.m.f3139g;
            J.D d4 = c0196a2.f3112b;
            d4.o0(mVar);
            l0.c.O(d4, 0, obj);
            l0.c.N(d4, 0, r3);
            if (d4.f3110h == J.D.h0(d4, 1) && d4.f3111i == J.D.h0(d4, 1)) {
                return;
            }
            StringBuilder sb5 = new StringBuilder();
            if ((d4.f3110h & 1) != 0) {
                sb5.append(mVar.b(0));
                i3 = 1;
            } else {
                i3 = 0;
            }
            String sb6 = sb5.toString();
            StringBuilder l4 = A.k.l(sb6, "StringBuilder().apply(builderAction).toString()");
            if ((d4.f3111i & 1) != 0) {
                if (i3 > 0) {
                    l4.append(", ");
                }
                l4.append(mVar.c(0));
            } else {
                i6 = 0;
            }
            String sb7 = l4.toString();
            f2.j.e(sb7, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb8 = new StringBuilder("Error while pushing ");
            sb8.append(mVar);
            sb8.append(". Not all arguments were provided. Missing ");
            A.k.t(sb8, i3, " int arguments (", sb6, ") and ");
            A.k.u(sb8, i6, " object arguments (", sb7, ").");
            throw null;
        }
        E0 e03 = this.f2854F;
        C0141c a4 = e03.a(e03.f2663i);
        C0196a c0196a3 = c0197b.f3114b;
        J.m mVar2 = J.m.f3138f;
        J.D d5 = c0196a3.f3112b;
        d5.o0(mVar2);
        l0.c.O(d5, 0, obj);
        l0.c.O(d5, 1, a4);
        l0.c.N(d5, 0, r3);
        if (d5.f3110h == J.D.h0(d5, 1) && d5.f3111i == J.D.h0(d5, 2)) {
            return;
        }
        StringBuilder sb9 = new StringBuilder();
        if ((d5.f3110h & 1) != 0) {
            sb9.append(mVar2.b(0));
            i4 = 1;
        } else {
            i4 = 0;
        }
        String sb10 = sb9.toString();
        StringBuilder l5 = A.k.l(sb10, "StringBuilder().apply(builderAction).toString()");
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 2; i15 < i17; i17 = 2) {
            if (((1 << i15) & d5.f3111i) != 0) {
                if (i4 > 0) {
                    l5.append(", ");
                }
                l5.append(mVar2.c(i15));
                i16++;
            }
            i15++;
        }
        String sb11 = l5.toString();
        f2.j.e(sb11, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb12 = new StringBuilder("Error while pushing ");
        sb12.append(mVar2);
        sb12.append(". Not all arguments were provided. Missing ");
        A.k.t(sb12, i4, " int arguments (", sb10, ") and ");
        A.k.u(sb12, i16, " object arguments (", sb11, ").");
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
            int[] iArr = this.f2878n;
            return (iArr == null || (i4 = iArr[i3]) < 0) ? C0143d.o(this.f2854F.f2656b, i3) : i4;
        }
        C0540n c0540n = this.f2879o;
        if (c0540n == null || c0540n.c(i3) < 0) {
            return 0;
        }
        return c0540n.d(i3);
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
        if (!this.f2881q) {
            C0143d.w("A call to createNode(), emitNode() or useNode() expected was not expected");
            throw null;
        }
        this.f2881q = false;
        if (this.f2863O) {
            C0143d.w("useNode() called while inserting");
            throw null;
        }
        E0 e02 = this.f2854F;
        Object i3 = e02.i(e02.f2663i);
        C0197b c0197b = this.f2860L;
        c0197b.c();
        c0197b.f3120h.f2203d.add(i3);
        if (this.f2888x && (i3 instanceof InterfaceC0155j)) {
            c0197b.b();
            C0196a c0196a = c0197b.f3114b;
            c0196a.getClass();
            if (i3 instanceof InterfaceC0155j) {
                c0196a.f3112b.n0(J.B.f3101c);
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
        if (f2.j.a(z(), obj)) {
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
        this.f2873i = null;
        this.f2874j = 0;
        this.f2875k = 0;
        this.f2864P = 0;
        this.f2881q = false;
        C0197b c0197b = this.f2860L;
        c0197b.f3115c = false;
        c0197b.f3116d.f2726b = 0;
        c0197b.f3118f = 0;
        this.D.f2203d.clear();
        this.f2878n = null;
        this.f2879o = null;
    }

    public final int j(int i3, int i4, int i5, int i6) {
        int i7;
        Object b3;
        if (i3 == i5) {
            return i6;
        }
        E0 e02 = this.f2854F;
        boolean l3 = C0143d.l(e02.f2656b, i3);
        int[] iArr = e02.f2656b;
        if (l3) {
            Object j3 = e02.j(iArr, i3);
            i7 = j3 != null ? j3 instanceof Enum ? ((Enum) j3).ordinal() : j3.hashCode() : 0;
        } else {
            int i8 = iArr[i3 * 5];
            if (i8 == 207 && (b3 = e02.b(iArr, i3)) != null && !b3.equals(C0159l.f2829a)) {
                i8 = b3.hashCode();
            }
            i7 = i8;
        }
        if (i7 == 126665345) {
            return i7;
        }
        int i9 = this.f2854F.f2656b[(i3 * 5) + 2];
        if (i9 != i5) {
            i6 = j(i9, A(i9), i5, i6);
        }
        if (C0143d.l(this.f2854F.f2656b, i3)) {
            i4 = 0;
        }
        return Integer.rotateLeft(Integer.rotateLeft(i6, 3) ^ i7, 3) ^ i4;
    }

    public final Object k(AbstractC0168p0 abstractC0168p0) {
        return C0143d.L(m(), abstractC0168p0);
    }

    public final void l(C1001n c1001n) {
        int i3;
        int i4;
        int i5;
        if (!this.f2881q) {
            C0143d.w("A call to createNode(), emitNode() or useNode() expected was not expected");
            throw null;
        }
        this.f2881q = false;
        if (!this.f2863O) {
            C0143d.w("createNode() can only be called when inserting");
            throw null;
        }
        N n3 = this.f2877m;
        int i6 = n3.f2725a[n3.f2726b - 1];
        H0 h02 = this.f2856H;
        C0141c b3 = h02.b(h02.f2708v);
        this.f2875k++;
        C0198c c0198c = this.f2862N;
        J.m mVar = J.m.f3136d;
        J.D d3 = c0198c.f3125b;
        d3.o0(mVar);
        l0.c.O(d3, 0, c1001n);
        l0.c.N(d3, 0, i6);
        l0.c.O(d3, 1, b3);
        if (!(d3.f3110h == J.D.h0(d3, 1) && d3.f3111i == J.D.h0(d3, 2))) {
            StringBuilder sb = new StringBuilder();
            if ((d3.f3110h & 1) != 0) {
                sb.append(mVar.b(0));
                i5 = 1;
            } else {
                i5 = 0;
            }
            String sb2 = sb.toString();
            StringBuilder l3 = A.k.l(sb2, "StringBuilder().apply(builderAction).toString()");
            int i7 = 0;
            for (int i8 = 0; i8 < 2; i8++) {
                if (((1 << i8) & d3.f3111i) != 0) {
                    if (i5 > 0) {
                        l3.append(", ");
                    }
                    l3.append(mVar.c(i8));
                    i7++;
                }
            }
            String sb3 = l3.toString();
            f2.j.e(sb3, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb4 = new StringBuilder("Error while pushing ");
            sb4.append(mVar);
            sb4.append(". Not all arguments were provided. Missing ");
            A.k.t(sb4, i5, " int arguments (", sb2, ") and ");
            A.k.u(sb4, i7, " object arguments (", sb3, ").");
            throw null;
        }
        J.m mVar2 = J.m.f3137e;
        J.D d4 = c0198c.f3126c;
        d4.o0(mVar2);
        l0.c.N(d4, 0, i6);
        l0.c.O(d4, 0, b3);
        if (d4.f3110h == J.D.h0(d4, 1) && d4.f3111i == J.D.h0(d4, 1)) {
            return;
        }
        StringBuilder sb5 = new StringBuilder();
        if ((d4.f3110h & 1) != 0) {
            sb5.append(mVar2.b(0));
            i3 = 1;
        } else {
            i3 = 0;
        }
        String sb6 = sb5.toString();
        StringBuilder l4 = A.k.l(sb6, "StringBuilder().apply(builderAction).toString()");
        if ((d4.f3111i & 1) != 0) {
            if (i3 > 0) {
                l4.append(", ");
            }
            l4.append(mVar2.c(0));
            i4 = 1;
        } else {
            i4 = 0;
        }
        String sb7 = l4.toString();
        f2.j.e(sb7, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb8 = new StringBuilder("Error while pushing ");
        sb8.append(mVar2);
        sb8.append(". Not all arguments were provided. Missing ");
        A.k.t(sb8, i3, " int arguments (", sb6, ") and ");
        A.k.u(sb8, i4, " object arguments (", sb7, ").");
        throw null;
    }

    public final InterfaceC0164n0 m() {
        InterfaceC0164n0 interfaceC0164n0;
        InterfaceC0164n0 interfaceC0164n02;
        Object obj;
        Object obj2;
        InterfaceC0164n0 interfaceC0164n03 = this.f2858J;
        if (interfaceC0164n03 != null) {
            return interfaceC0164n03;
        }
        int i3 = this.f2854F.f2663i;
        boolean z3 = this.f2863O;
        C0144d0 c0144d0 = C0143d.f2797c;
        if (z3 && this.f2857I) {
            int i4 = this.f2856H.f2708v;
            while (i4 > 0) {
                H0 h02 = this.f2856H;
                if (h02.f2688b[h02.p(i4) * 5] == 202) {
                    H0 h03 = this.f2856H;
                    int p3 = h03.p(i4);
                    if (C0143d.l(h03.f2688b, p3)) {
                        Object[] objArr = h03.f2689c;
                        int[] iArr = h03.f2688b;
                        int i5 = p3 * 5;
                        obj = objArr[C0143d.y(iArr[i5 + 1] >> 30) + iArr[i5 + 4]];
                    } else {
                        obj = null;
                    }
                    if (f2.j.a(obj, c0144d0)) {
                        H0 h04 = this.f2856H;
                        int p4 = h04.p(i4);
                        if (C0143d.k(h04.f2688b, p4)) {
                            Object[] objArr2 = h04.f2689c;
                            int[] iArr2 = h04.f2688b;
                            obj2 = objArr2[C0143d.y(iArr2[(p4 * 5) + 1] >> 29) + h04.f(iArr2, p4)];
                        } else {
                            obj2 = C0159l.f2829a;
                        }
                        f2.j.d(obj2, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                        InterfaceC0164n0 interfaceC0164n04 = (InterfaceC0164n0) obj2;
                        this.f2858J = interfaceC0164n04;
                        return interfaceC0164n04;
                    }
                }
                H0 h05 = this.f2856H;
                i4 = h05.x(h05.f2688b, i4);
            }
        }
        if (this.f2854F.f2657c > 0) {
            while (i3 > 0) {
                E0 e02 = this.f2854F;
                int i6 = i3 * 5;
                int[] iArr3 = e02.f2656b;
                if (iArr3[i6] == 202 && f2.j.a(e02.j(iArr3, i3), c0144d0)) {
                    B.Y y3 = this.f2885u;
                    if (y3 == null || (interfaceC0164n02 = (InterfaceC0164n0) ((SparseArray) y3.f334d).get(i3)) == null) {
                        E0 e03 = this.f2854F;
                        Object b3 = e03.b(e03.f2656b, i3);
                        f2.j.d(b3, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                        interfaceC0164n0 = (InterfaceC0164n0) b3;
                    } else {
                        interfaceC0164n0 = interfaceC0164n02;
                    }
                    this.f2858J = interfaceC0164n0;
                    return interfaceC0164n0;
                }
                i3 = this.f2854F.f2656b[i6 + 2];
            }
        }
        InterfaceC0164n0 interfaceC0164n05 = this.f2884t;
        this.f2858J = interfaceC0164n05;
        return interfaceC0164n05;
    }

    public final void n(B.Y y3, Q.a aVar) {
        int i3;
        if (this.f2853E) {
            C0143d.w("Reentrant composition is not supported");
            throw null;
        }
        Trace.beginSection("Compose:recompose");
        try {
            this.f2851A = S.p.k().d();
            this.f2885u = null;
            C0550x c0550x = (C0550x) y3.f334d;
            Object[] objArr = c0550x.f6345b;
            Object[] objArr2 = c0550x.f6346c;
            long[] jArr = c0550x.f6344a;
            int length = jArr.length - 2;
            ArrayList arrayList = this.f2882r;
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
                                f2.j.d(obj, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
                                C0141c c0141c = ((C0173s0) obj).f2905c;
                                if (c0141c != null) {
                                    int i9 = c0141c.f2794a;
                                    C0173s0 c0173s0 = (C0173s0) obj;
                                    if (obj2 == W.f2782h) {
                                        obj2 = null;
                                    }
                                    arrayList.add(new O(c0173s0, i9, obj2));
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
            S1.q.F0(arrayList, C0143d.f2800f);
            this.f2874j = 0;
            this.f2853E = true;
            try {
                V();
                Object z3 = z();
                if (z3 != aVar && aVar != null) {
                    b0(aVar);
                }
                C0165o c0165o = this.C;
                K.d C = C0143d.C();
                try {
                    C.b(c0165o);
                    C0144d0 c0144d0 = C0143d.f2795a;
                    if (aVar != null) {
                        O(200, c0144d0);
                        C0143d.G(this, aVar);
                        p(false);
                    } else if (!this.f2886v || z3 == null || z3.equals(C0159l.f2829a)) {
                        J();
                    } else {
                        O(200, c0144d0);
                        f2.x.d(2, z3);
                        C0143d.G(this, (InterfaceC0426e) z3);
                        p(false);
                    }
                    C.o(C.f3216f - 1);
                    s();
                    this.f2853E = false;
                    arrayList.clear();
                    C0143d.P(this.f2856H.f2709w);
                    u();
                    Trace.endSection();
                } finally {
                    C.o(C.f3216f - 1);
                }
            } catch (Throwable th) {
                this.f2853E = false;
                arrayList.clear();
                a();
                C0143d.P(this.f2856H.f2709w);
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
        o(this.f2854F.f2656b[(i3 * 5) + 2], i4);
        if (C0143d.m(this.f2854F.f2656b, i3)) {
            Object i5 = this.f2854F.i(i3);
            C0197b c0197b = this.f2860L;
            c0197b.c();
            c0197b.f3120h.f2203d.add(i5);
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
        N n3;
        int i3;
        ArrayList arrayList;
        C0197b c0197b;
        int i4;
        E0 e02;
        boolean z4;
        boolean z5;
        C0167p c0167p;
        int i5;
        C0162m0 c0162m0;
        String str;
        String str2;
        int i6;
        int i7;
        int i8;
        F0 f02;
        C0198c c0198c;
        C0167p c0167p2;
        J.n nVar;
        int i9;
        int i10;
        int h02;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        char c2;
        N n4;
        int i18;
        LinkedHashSet linkedHashSet;
        ArrayList arrayList2;
        int i19;
        C0542p c0542p;
        C0197b c0197b2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        int i20;
        C0162m0 c0162m02;
        int i21;
        C0542p c0542p2;
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
        C0167p c0167p3 = this;
        N n5 = c0167p3.f2877m;
        int i23 = n5.f2725a[n5.f2726b - 2] - 1;
        boolean z6 = c0167p3.f2863O;
        W w2 = C0159l.f2829a;
        if (z6) {
            H0 h03 = c0167p3.f2856H;
            int i24 = h03.f2708v;
            int i25 = h03.f2688b[h03.p(i24) * 5];
            H0 h04 = c0167p3.f2856H;
            int p3 = h04.p(i24);
            if (C0143d.l(h04.f2688b, p3)) {
                Object[] objArr5 = h04.f2689c;
                int[] iArr = h04.f2688b;
                int i26 = p3 * 5;
                obj = objArr5[C0143d.y(iArr[i26 + 1] >> 30) + iArr[i26 + 4]];
            } else {
                obj = null;
            }
            H0 h05 = c0167p3.f2856H;
            int p4 = h05.p(i24);
            if (C0143d.k(h05.f2688b, p4)) {
                Object[] objArr6 = h05.f2689c;
                int[] iArr2 = h05.f2688b;
                obj2 = objArr6[C0143d.y(iArr2[(p4 * 5) + 1] >> 29) + h05.f(iArr2, p4)];
            } else {
                obj2 = w2;
            }
            if (obj != null) {
                hashCode2 = Integer.hashCode(obj instanceof Enum ? ((Enum) obj).ordinal() : obj.hashCode()) ^ Integer.rotateRight(c0167p3.f2864P, 3);
            } else if (obj2 == null || i25 != 207 || obj2.equals(w2)) {
                hashCode2 = Integer.rotateRight(i23 ^ c0167p3.f2864P, 3) ^ Integer.hashCode(i25);
            } else {
                c0167p3.f2864P = Integer.rotateRight(Integer.rotateRight(i23 ^ c0167p3.f2864P, 3) ^ Integer.hashCode(obj2.hashCode()), 3);
            }
            c0167p3.f2864P = Integer.rotateRight(hashCode2, 3);
        } else {
            E0 e03 = c0167p3.f2854F;
            int i27 = e03.f2663i;
            int[] iArr3 = e03.f2656b;
            int i28 = iArr3[i27 * 5];
            Object j3 = e03.j(iArr3, i27);
            E0 e04 = c0167p3.f2854F;
            Object b3 = e04.b(e04.f2656b, i27);
            if (j3 != null) {
                hashCode = Integer.hashCode(j3 instanceof Enum ? ((Enum) j3).ordinal() : j3.hashCode()) ^ Integer.rotateRight(c0167p3.f2864P, 3);
            } else if (b3 == null || i28 != 207 || b3.equals(w2)) {
                hashCode = Integer.rotateRight(i23 ^ c0167p3.f2864P, 3) ^ Integer.hashCode(i28);
            } else {
                c0167p3.f2864P = Integer.rotateRight(Integer.rotateRight(i23 ^ c0167p3.f2864P, 3) ^ Integer.hashCode(b3.hashCode()), 3);
            }
            c0167p3.f2864P = Integer.rotateRight(hashCode, 3);
        }
        int i29 = c0167p3.f2875k;
        C0162m0 c0162m03 = c0167p3.f2873i;
        ArrayList arrayList5 = c0167p3.f2882r;
        C0197b c0197b3 = c0167p3.f2860L;
        if (c0162m03 != null) {
            ArrayList arrayList6 = c0162m03.f2834a;
            if (arrayList6.size() > 0) {
                ArrayList arrayList7 = c0162m03.f2837d;
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
                    Q q3 = (Q) arrayList6.get(i32);
                    boolean contains = hashSet.contains(q3);
                    C0542p c0542p3 = c0162m03.f2838e;
                    HashSet hashSet2 = hashSet;
                    int i34 = c0162m03.f2835b;
                    if (contains) {
                        i17 = size3;
                        c2 = 3;
                        if (!linkedHashSet2.contains(q3)) {
                            if (i31 < size2) {
                                Q q4 = (Q) arrayList7.get(i31);
                                if (q4 != q3) {
                                    K k3 = (K) c0542p3.f(q4.f2744c);
                                    int i35 = k3 != null ? k3.f2715b : -1;
                                    linkedHashSet2.add(q4);
                                    linkedHashSet = linkedHashSet2;
                                    i20 = i33;
                                    if (i35 != i20) {
                                        c0162m02 = c0162m03;
                                        K k4 = (K) c0542p3.f(q4.f2744c);
                                        int i36 = k4 != null ? k4.f2716c : q4.f2745d;
                                        i19 = size2;
                                        int i37 = i35 + i34;
                                        int i38 = i34 + i20;
                                        if (i36 > 0) {
                                            arrayList4 = arrayList7;
                                            int i39 = c0197b3.f3124l;
                                            if (i39 > 0) {
                                                arrayList2 = arrayList5;
                                                n4 = n5;
                                                if (c0197b3.f3122j == i37 - i39 && c0197b3.f3123k == i38 - i39) {
                                                    c0197b3.f3124l = i39 + i36;
                                                }
                                            } else {
                                                n4 = n5;
                                                arrayList2 = arrayList5;
                                            }
                                            c0197b3.c();
                                            c0197b3.f3122j = i37;
                                            c0197b3.f3123k = i38;
                                            c0197b3.f3124l = i36;
                                        } else {
                                            n4 = n5;
                                            arrayList2 = arrayList5;
                                            arrayList4 = arrayList7;
                                            c0197b3.getClass();
                                        }
                                        char c3 = 7;
                                        if (i35 > i20) {
                                            Object[] objArr7 = c0542p3.f6304c;
                                            long[] jArr5 = c0542p3.f6302a;
                                            int length = jArr5.length - 2;
                                            if (length >= 0) {
                                                c0197b2 = c0197b3;
                                                arrayList3 = arrayList6;
                                                int i40 = 0;
                                                while (true) {
                                                    long j4 = jArr5[i40];
                                                    i21 = i32;
                                                    c0542p2 = c0542p3;
                                                    if ((((~j4) << c3) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i41 = 8 - ((~(i40 - length)) >>> 31);
                                                        int i42 = 0;
                                                        while (i42 < i41) {
                                                            if ((j4 & 255) < 128) {
                                                                K k5 = (K) objArr7[(i40 << 3) + i42];
                                                                objArr4 = objArr7;
                                                                int i43 = k5.f2715b;
                                                                jArr4 = jArr5;
                                                                if (i35 <= i43 && i43 < i35 + i36) {
                                                                    k5.f2715b = (i43 - i35) + i20;
                                                                } else if (i20 <= i43 && i43 < i35) {
                                                                    k5.f2715b = i43 + i36;
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
                                                    c0542p3 = c0542p2;
                                                    i32 = i21;
                                                    objArr7 = objArr3;
                                                    jArr5 = jArr3;
                                                    c3 = 7;
                                                }
                                            } else {
                                                i21 = i32;
                                                c0542p2 = c0542p3;
                                                c0197b2 = c0197b3;
                                                arrayList3 = arrayList6;
                                            }
                                        } else {
                                            i21 = i32;
                                            c0542p2 = c0542p3;
                                            c0197b2 = c0197b3;
                                            arrayList3 = arrayList6;
                                            if (i20 > i35) {
                                                c0542p = c0542p2;
                                                Object[] objArr8 = c0542p.f6304c;
                                                long[] jArr6 = c0542p.f6302a;
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
                                                                    K k6 = (K) objArr8[(i44 << 3) + i46];
                                                                    jArr2 = jArr6;
                                                                    int i47 = k6.f2715b;
                                                                    i22 = i29;
                                                                    if (i35 <= i47 && i47 < i35 + i36) {
                                                                        k6.f2715b = (i47 - i35) + i20;
                                                                    } else if (i35 + 1 <= i47 && i47 < i20) {
                                                                        k6.f2715b = i47 - i36;
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
                                        c0542p = c0542p2;
                                    } else {
                                        n4 = n5;
                                        i18 = i29;
                                        c0162m02 = c0162m03;
                                        arrayList2 = arrayList5;
                                        i19 = size2;
                                        i21 = i32;
                                        c0542p = c0542p3;
                                        c0197b2 = c0197b3;
                                        arrayList3 = arrayList6;
                                        arrayList4 = arrayList7;
                                    }
                                    i32 = i21;
                                } else {
                                    n4 = n5;
                                    i18 = i29;
                                    linkedHashSet = linkedHashSet2;
                                    arrayList2 = arrayList5;
                                    i19 = size2;
                                    c0542p = c0542p3;
                                    c0197b2 = c0197b3;
                                    arrayList3 = arrayList6;
                                    arrayList4 = arrayList7;
                                    i20 = i33;
                                    c0162m02 = c0162m03;
                                    i32++;
                                }
                                i31++;
                                K k7 = (K) c0542p.f(q4.f2744c);
                                int i48 = (k7 != null ? k7.f2716c : q4.f2745d) + i20;
                                c0162m03 = c0162m02;
                                size3 = i17;
                                linkedHashSet2 = linkedHashSet;
                                hashSet = hashSet2;
                                size2 = i19;
                                arrayList7 = arrayList4;
                                arrayList5 = arrayList2;
                                c0197b3 = c0197b2;
                                arrayList6 = arrayList3;
                                i29 = i18;
                                i33 = i48;
                                n5 = n4;
                            } else {
                                size3 = i17;
                                linkedHashSet2 = linkedHashSet2;
                                hashSet = hashSet2;
                            }
                        }
                    } else {
                        i17 = size3;
                        K k8 = (K) c0542p3.f(q3.f2744c);
                        c0197b3.e((k8 != null ? k8.f2715b : -1) + i34, q3.f2745d);
                        int i49 = q3.f2744c;
                        c0162m03.a(i49, 0);
                        c0197b3.f3118f = (i49 - c0197b3.f3113a.f2854F.f2661g) + c0197b3.f3118f;
                        c0167p3.f2854F.k(i49);
                        D();
                        c0167p3.f2854F.l();
                        c2 = 3;
                        C0143d.q(arrayList5, i49, c0167p3.f2854F.f2656b[(i49 * 5) + 3] + i49);
                    }
                    i32++;
                    size3 = i17;
                    hashSet = hashSet2;
                }
                n3 = n5;
                i3 = i29;
                arrayList = arrayList5;
                C0197b c0197b4 = c0197b3;
                c0197b4.c();
                if (arrayList6.size() > 0) {
                    E0 e05 = c0167p3.f2854F;
                    c0197b = c0197b4;
                    c0197b.f3118f = (e05.f2662h - c0197b.f3113a.f2854F.f2661g) + c0197b.f3118f;
                    e05.m();
                } else {
                    c0197b = c0197b4;
                }
                i4 = c0167p3.f2874j;
                while (true) {
                    e02 = c0167p3.f2854F;
                    if (e02.f2665k > 0 && (i16 = e02.f2661g) != e02.f2662h) {
                        C0167p c0167p4 = c0167p3;
                        D();
                        c0197b.e(i4, c0167p4.f2854F.l());
                        ArrayList arrayList8 = arrayList;
                        C0143d.q(arrayList8, i16, c0167p4.f2854F.f2661g);
                        c0167p3 = c0167p4;
                        i3 = i3;
                        arrayList = arrayList8;
                    }
                }
                z4 = c0167p3.f2863O;
                String str3 = " object arguments (";
                if (z4) {
                    z5 = z4;
                    if (z3) {
                        c0197b.a();
                    }
                    E0 e06 = this.f2854F;
                    int i50 = e06.f2667m - e06.f2666l;
                    if (i50 > 0) {
                        if (i50 > 0) {
                            c0197b.d(false);
                            E0 e07 = c0197b.f3113a.f2854F;
                            if (e07.f2657c > 0) {
                                int i51 = e07.f2663i;
                                N n6 = c0197b.f3116d;
                                int i52 = n6.f2726b;
                                if ((i52 > 0 ? n6.f2725a[i52 - 1] : -2) != i51) {
                                    if (!c0197b.f3115c && c0197b.f3117e) {
                                        c0197b.d(false);
                                        C0196a c0196a = c0197b.f3114b;
                                        c0196a.getClass();
                                        c0196a.f3112b.n0(J.l.f3135c);
                                        c0197b.f3115c = true;
                                    }
                                    if (i51 > 0) {
                                        C0141c a3 = e07.a(i51);
                                        n6.b(i51);
                                        c0197b.d(false);
                                        C0196a c0196a2 = c0197b.f3114b;
                                        c0196a2.getClass();
                                        J.k kVar = J.k.f3134c;
                                        J.D d3 = c0196a2.f3112b;
                                        d3.o0(kVar);
                                        l0.c.O(d3, 0, a3);
                                        int i53 = d3.f3110h;
                                        int i54 = kVar.f3102a;
                                        int h06 = J.D.h0(d3, i54);
                                        int i55 = kVar.f3103b;
                                        if (i53 != h06 || d3.f3111i != J.D.h0(d3, i55)) {
                                            int i56 = 1;
                                            StringBuilder sb = new StringBuilder();
                                            int i57 = 0;
                                            int i58 = 0;
                                            while (i57 < i54) {
                                                if (((i56 << i57) & d3.f3110h) != 0) {
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
                                            StringBuilder l3 = A.k.l(sb2, "StringBuilder().apply(builderAction).toString()");
                                            int i59 = 0;
                                            int i60 = 0;
                                            while (i59 < i55) {
                                                int i61 = i55;
                                                if (((1 << i59) & d3.f3111i) != 0) {
                                                    if (i58 > 0) {
                                                        l3.append(", ");
                                                    }
                                                    l3.append(kVar.c(i59));
                                                    i60++;
                                                }
                                                i59++;
                                                i55 = i61;
                                            }
                                            String sb3 = l3.toString();
                                            f2.j.e(sb3, "StringBuilder().apply(builderAction).toString()");
                                            StringBuilder sb4 = new StringBuilder("Error while pushing ");
                                            sb4.append(kVar);
                                            sb4.append(". Not all arguments were provided. Missing ");
                                            A.k.t(sb4, i58, " int arguments (", sb2, ") and ");
                                            A.k.u(sb4, i60, " object arguments (", sb3, ").");
                                            throw null;
                                        }
                                        c0197b.f3115c = true;
                                    }
                                }
                            }
                            C0196a c0196a3 = c0197b.f3114b;
                            c0196a3.getClass();
                            J.x xVar = J.x.f3151c;
                            J.D d4 = c0196a3.f3112b;
                            d4.o0(xVar);
                            l0.c.N(d4, 0, i50);
                            int i62 = d4.f3110h;
                            int i63 = xVar.f3102a;
                            int h07 = J.D.h0(d4, i63);
                            int i64 = xVar.f3103b;
                            if (i62 != h07 || d4.f3111i != J.D.h0(d4, i64)) {
                                StringBuilder sb5 = new StringBuilder();
                                int i65 = 0;
                                for (int i66 = 0; i66 < i63; i66++) {
                                    if (((1 << i66) & d4.f3110h) != 0) {
                                        if (i65 > 0) {
                                            sb5.append(", ");
                                        }
                                        sb5.append(xVar.b(i66));
                                        i65++;
                                    }
                                }
                                String sb6 = sb5.toString();
                                StringBuilder l4 = A.k.l(sb6, "StringBuilder().apply(builderAction).toString()");
                                int i67 = 0;
                                int i68 = 0;
                                while (i67 < i64) {
                                    int i69 = i64;
                                    if (((1 << i67) & d4.f3111i) != 0) {
                                        if (i65 > 0) {
                                            l4.append(", ");
                                        }
                                        l4.append(xVar.c(i67));
                                        i68++;
                                    }
                                    i67++;
                                    i64 = i69;
                                }
                                String sb7 = l4.toString();
                                f2.j.e(sb7, "StringBuilder().apply(builderAction).toString()");
                                StringBuilder sb8 = new StringBuilder("Error while pushing ");
                                sb8.append(xVar);
                                sb8.append(". Not all arguments were provided. Missing ");
                                A.k.t(sb8, i65, " int arguments (", sb6, ") and ");
                                A.k.u(sb8, i68, " object arguments (", sb7, ").");
                                throw null;
                            }
                        } else {
                            c0197b.getClass();
                        }
                    }
                    int i70 = c0197b.f3113a.f2854F.f2663i;
                    N n7 = c0197b.f3116d;
                    int i71 = n7.f2726b;
                    if ((i71 > 0 ? n7.f2725a[i71 - 1] : -1) > i70) {
                        C0143d.w("Missed recording an endGroup");
                        throw null;
                    }
                    if ((i71 > 0 ? n7.f2725a[i71 - 1] : -1) == i70) {
                        c0197b.d(false);
                        n7.a();
                        C0196a c0196a4 = c0197b.f3114b;
                        c0196a4.getClass();
                        c0196a4.f3112b.n0(J.i.f3132c);
                    }
                    c0167p = this;
                    int i72 = c0167p.f2854F.f2663i;
                    int i73 = i3;
                    if (i73 != c0167p.c0(i72)) {
                        c0167p.Y(i72, i73);
                    }
                    if (z3) {
                        i73 = 1;
                    }
                    c0167p.f2854F.d();
                    c0197b.c();
                    i5 = i73;
                } else {
                    if (z3) {
                        C0198c c0198c2 = c0167p3.f2862N;
                        J.D d5 = c0198c2.f3126c;
                        if (!d5.l0()) {
                            C0143d.w("Cannot end node insertion, there are no pending operations that can be realized.");
                            throw null;
                        }
                        if (d5.k0()) {
                            throw new NoSuchElementException("Cannot pop(), because the stack is empty.");
                        }
                        J.C[] cArr = d5.f3104b;
                        int i74 = d5.f3105c - 1;
                        d5.f3105c = i74;
                        J.C c4 = cArr[i74];
                        f2.j.c(c4);
                        d5.f3104b[d5.f3105c] = null;
                        J.D d6 = c0198c2.f3125b;
                        d6.o0(c4);
                        int i75 = d5.f3109g;
                        int i76 = d6.f3109g;
                        z5 = z4;
                        str = ").";
                        int i77 = 0;
                        while (true) {
                            i14 = c4.f3103b;
                            if (i77 >= i14) {
                                break;
                            }
                            i76--;
                            i75--;
                            Object[] objArr9 = d6.f3108f;
                            String str4 = str3;
                            Object[] objArr10 = d5.f3108f;
                            objArr9[i76] = objArr10[i75];
                            objArr10[i75] = null;
                            i77++;
                            str3 = str4;
                        }
                        str2 = str3;
                        int i78 = d5.f3107e;
                        int i79 = d6.f3107e;
                        int i80 = 0;
                        while (true) {
                            i15 = c4.f3102a;
                            if (i80 >= i15) {
                                break;
                            }
                            i79--;
                            i78--;
                            int[] iArr4 = d6.f3106d;
                            J.D d7 = d6;
                            int[] iArr5 = d5.f3106d;
                            iArr4[i79] = iArr5[i78];
                            iArr5[i78] = 0;
                            i80++;
                            d6 = d7;
                        }
                        d5.f3109g -= i14;
                        d5.f3107e -= i15;
                        i6 = 1;
                    } else {
                        z5 = z4;
                        str = ").";
                        str2 = " object arguments (";
                        i6 = i3;
                    }
                    E0 e08 = c0167p3.f2854F;
                    int i81 = e08.f2665k;
                    if (i81 <= 0) {
                        C0143d.S("Unbalanced begin/end empty");
                        throw null;
                    }
                    e08.f2665k = i81 - 1;
                    H0 h08 = c0167p3.f2856H;
                    int i82 = h08.f2708v;
                    h08.i();
                    if (c0167p3.f2854F.f2665k > 0) {
                        c0167p2 = c0167p3;
                        i5 = i6;
                    } else {
                        int i83 = (-2) - i82;
                        c0167p3.f2856H.j();
                        c0167p3.f2856H.e(true);
                        C0141c c0141c = c0167p3.f2861M;
                        if (c0167p3.f2862N.f3125b.k0()) {
                            F0 f03 = c0167p3.f2855G;
                            c0197b.b();
                            c0197b.d(false);
                            E0 e09 = c0197b.f3113a.f2854F;
                            if (e09.f2657c > 0) {
                                int i84 = e09.f2663i;
                                N n8 = c0197b.f3116d;
                                int i85 = n8.f2726b;
                                i7 = i6;
                                if ((i85 > 0 ? n8.f2725a[i85 - 1] : -2) != i84) {
                                    if (!c0197b.f3115c && c0197b.f3117e) {
                                        c0197b.d(false);
                                        C0196a c0196a5 = c0197b.f3114b;
                                        c0196a5.getClass();
                                        c0196a5.f3112b.n0(J.l.f3135c);
                                        c0197b.f3115c = true;
                                    }
                                    if (i84 > 0) {
                                        C0141c a4 = e09.a(i84);
                                        n8.b(i84);
                                        c0197b.d(false);
                                        C0196a c0196a6 = c0197b.f3114b;
                                        c0196a6.getClass();
                                        J.k kVar2 = J.k.f3134c;
                                        J.D d8 = c0196a6.f3112b;
                                        d8.o0(kVar2);
                                        l0.c.O(d8, 0, a4);
                                        int i86 = d8.f3110h;
                                        int i87 = kVar2.f3102a;
                                        int h09 = J.D.h0(d8, i87);
                                        i8 = i83;
                                        int i88 = kVar2.f3103b;
                                        if (i86 != h09 || d8.f3111i != J.D.h0(d8, i88)) {
                                            int i89 = 1;
                                            StringBuilder sb9 = new StringBuilder();
                                            int i90 = 0;
                                            int i91 = 0;
                                            while (i90 < i87) {
                                                if ((d8.f3110h & (i89 << i90)) != 0) {
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
                                            StringBuilder l5 = A.k.l(sb10, "StringBuilder().apply(builderAction).toString()");
                                            int i92 = 0;
                                            for (int i93 = 0; i93 < i88; i93++) {
                                                if (((1 << i93) & d8.f3111i) != 0) {
                                                    if (i91 > 0) {
                                                        l5.append(", ");
                                                    }
                                                    l5.append(kVar2.c(i93));
                                                    i92++;
                                                }
                                            }
                                            String sb11 = l5.toString();
                                            f2.j.e(sb11, "StringBuilder().apply(builderAction).toString()");
                                            StringBuilder sb12 = new StringBuilder("Error while pushing ");
                                            sb12.append(kVar2);
                                            sb12.append(". Not all arguments were provided. Missing ");
                                            A.k.t(sb12, i91, " int arguments (", sb10, ") and ");
                                            A.k.u(sb12, i92, str2, sb11, str);
                                            throw null;
                                        }
                                        c0197b.f3115c = true;
                                        String str5 = str;
                                        String str6 = str2;
                                        c0197b.c();
                                        C0196a c0196a7 = c0197b.f3114b;
                                        c0196a7.getClass();
                                        nVar = J.n.f3141c;
                                        J.D d9 = c0196a7.f3112b;
                                        d9.o0(nVar);
                                        l0.c.O(d9, 0, c0141c);
                                        l0.c.O(d9, 1, f03);
                                        i9 = d9.f3110h;
                                        i10 = nVar.f3102a;
                                        h02 = J.D.h0(d9, i10);
                                        i11 = nVar.f3103b;
                                        if (i9 == h02 || d9.f3111i != J.D.h0(d9, i11)) {
                                            StringBuilder sb13 = new StringBuilder();
                                            i12 = 0;
                                            int i94 = 0;
                                            while (i12 < i10) {
                                                int i95 = i10;
                                                if (((1 << i12) & d9.f3110h) != 0) {
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
                                            StringBuilder l6 = A.k.l(sb14, "StringBuilder().apply(builderAction).toString()");
                                            int i96 = 0;
                                            i13 = 0;
                                            while (i13 < i11) {
                                                int i97 = i11;
                                                if (((1 << i13) & d9.f3111i) != 0) {
                                                    if (i94 > 0) {
                                                        l6.append(", ");
                                                    }
                                                    l6.append(nVar.c(i13));
                                                    i96++;
                                                }
                                                i13++;
                                                i11 = i97;
                                            }
                                            String sb15 = l6.toString();
                                            f2.j.e(sb15, "StringBuilder().apply(builderAction).toString()");
                                            StringBuilder sb16 = new StringBuilder("Error while pushing ");
                                            sb16.append(nVar);
                                            sb16.append(". Not all arguments were provided. Missing ");
                                            A.k.t(sb16, i94, " int arguments (", sb14, ") and ");
                                            A.k.u(sb16, i96, str6, sb15, str5);
                                            throw null;
                                        }
                                        c0167p2 = c0167p3;
                                    }
                                }
                            } else {
                                i7 = i6;
                            }
                            i8 = i83;
                            String str52 = str;
                            String str62 = str2;
                            c0197b.c();
                            C0196a c0196a72 = c0197b.f3114b;
                            c0196a72.getClass();
                            nVar = J.n.f3141c;
                            J.D d92 = c0196a72.f3112b;
                            d92.o0(nVar);
                            l0.c.O(d92, 0, c0141c);
                            l0.c.O(d92, 1, f03);
                            i9 = d92.f3110h;
                            i10 = nVar.f3102a;
                            h02 = J.D.h0(d92, i10);
                            i11 = nVar.f3103b;
                            if (i9 == h02) {
                            }
                            StringBuilder sb132 = new StringBuilder();
                            i12 = 0;
                            int i942 = 0;
                            while (i12 < i10) {
                            }
                            String sb142 = sb132.toString();
                            StringBuilder l62 = A.k.l(sb142, "StringBuilder().apply(builderAction).toString()");
                            int i962 = 0;
                            i13 = 0;
                            while (i13 < i11) {
                            }
                            String sb152 = l62.toString();
                            f2.j.e(sb152, "StringBuilder().apply(builderAction).toString()");
                            StringBuilder sb162 = new StringBuilder("Error while pushing ");
                            sb162.append(nVar);
                            sb162.append(". Not all arguments were provided. Missing ");
                            A.k.t(sb162, i942, " int arguments (", sb142, ") and ");
                            A.k.u(sb162, i962, str62, sb152, str52);
                            throw null;
                        }
                        i7 = i6;
                        i8 = i83;
                        String str7 = str;
                        String str8 = str2;
                        F0 f04 = c0167p3.f2855G;
                        C0198c c0198c3 = c0167p3.f2862N;
                        c0197b.b();
                        c0197b.d(false);
                        E0 e010 = c0197b.f3113a.f2854F;
                        if (e010.f2657c > 0) {
                            int i98 = e010.f2663i;
                            N n9 = c0197b.f3116d;
                            int i99 = n9.f2726b;
                            c0198c = c0198c3;
                            if ((i99 > 0 ? n9.f2725a[i99 - 1] : -2) != i98) {
                                if (!c0197b.f3115c && c0197b.f3117e) {
                                    c0197b.d(false);
                                    C0196a c0196a8 = c0197b.f3114b;
                                    c0196a8.getClass();
                                    c0196a8.f3112b.n0(J.l.f3135c);
                                    c0197b.f3115c = true;
                                }
                                if (i98 > 0) {
                                    C0141c a5 = e010.a(i98);
                                    n9.b(i98);
                                    c0197b.d(false);
                                    C0196a c0196a9 = c0197b.f3114b;
                                    c0196a9.getClass();
                                    J.k kVar3 = J.k.f3134c;
                                    J.D d10 = c0196a9.f3112b;
                                    d10.o0(kVar3);
                                    l0.c.O(d10, 0, a5);
                                    int i100 = d10.f3110h;
                                    int i101 = kVar3.f3102a;
                                    int h010 = J.D.h0(d10, i101);
                                    f02 = f04;
                                    int i102 = kVar3.f3103b;
                                    if (i100 != h010 || d10.f3111i != J.D.h0(d10, i102)) {
                                        int i103 = 1;
                                        StringBuilder sb17 = new StringBuilder();
                                        int i104 = 0;
                                        int i105 = 0;
                                        while (i104 < i101) {
                                            if (((i103 << i104) & d10.f3110h) != 0) {
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
                                        StringBuilder l7 = A.k.l(sb18, "StringBuilder().apply(builderAction).toString()");
                                        int i106 = 0;
                                        int i107 = 0;
                                        while (i106 < i102) {
                                            int i108 = i102;
                                            if (((1 << i106) & d10.f3111i) != 0) {
                                                if (i105 > 0) {
                                                    l7.append(", ");
                                                }
                                                l7.append(kVar3.c(i106));
                                                i107++;
                                            }
                                            i106++;
                                            i102 = i108;
                                        }
                                        String sb19 = l7.toString();
                                        f2.j.e(sb19, "StringBuilder().apply(builderAction).toString()");
                                        StringBuilder sb20 = new StringBuilder("Error while pushing ");
                                        sb20.append(kVar3);
                                        sb20.append(". Not all arguments were provided. Missing ");
                                        A.k.t(sb20, i105, " int arguments (", sb18, ") and ");
                                        A.k.u(sb20, i107, str8, sb19, str7);
                                        throw null;
                                    }
                                    c0197b.f3115c = true;
                                }
                            }
                            f02 = f04;
                        } else {
                            f02 = f04;
                            c0198c = c0198c3;
                        }
                        c0197b.c();
                        C0196a c0196a10 = c0197b.f3114b;
                        c0196a10.getClass();
                        J.o oVar = J.o.f3142c;
                        J.D d11 = c0196a10.f3112b;
                        d11.o0(oVar);
                        l0.c.O(d11, 0, c0141c);
                        l0.c.O(d11, 1, f02);
                        l0.c.O(d11, 2, c0198c);
                        int i109 = d11.f3110h;
                        int i110 = oVar.f3102a;
                        int h011 = J.D.h0(d11, i110);
                        int i111 = oVar.f3103b;
                        if (i109 != h011 || d11.f3111i != J.D.h0(d11, i111)) {
                            StringBuilder sb21 = new StringBuilder();
                            int i112 = 0;
                            int i113 = 0;
                            while (i112 < i110) {
                                int i114 = i110;
                                if (((1 << i112) & d11.f3110h) != 0) {
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
                            StringBuilder l8 = A.k.l(sb22, "StringBuilder().apply(builderAction).toString()");
                            int i115 = 0;
                            int i116 = 0;
                            while (i116 < i111) {
                                int i117 = i111;
                                if (((1 << i116) & d11.f3111i) != 0) {
                                    if (i113 > 0) {
                                        l8.append(", ");
                                    }
                                    l8.append(oVar.c(i116));
                                    i115++;
                                }
                                i116++;
                                i111 = i117;
                            }
                            String sb23 = l8.toString();
                            f2.j.e(sb23, "StringBuilder().apply(builderAction).toString()");
                            StringBuilder sb24 = new StringBuilder("Error while pushing ");
                            sb24.append(oVar);
                            sb24.append(". Not all arguments were provided. Missing ");
                            A.k.t(sb24, i113, " int arguments (", sb22, ") and ");
                            A.k.u(sb24, i115, str8, sb23, str7);
                            throw null;
                        }
                        c0167p2 = this;
                        c0167p2.f2862N = new C0198c();
                        c0167p2.f2863O = false;
                        if (c0167p2.f2867c.f2673e == 0) {
                            i5 = i7;
                        } else {
                            int i118 = i8;
                            c0167p2.X(i118, 0);
                            i5 = i7;
                            c0167p2.Y(i118, i5);
                        }
                    }
                    c0167p = c0167p2;
                }
                ArrayList arrayList9 = c0167p.f2872h.f2203d;
                c0162m0 = (C0162m0) arrayList9.remove(arrayList9.size() - 1);
                if (c0162m0 != null && !z5) {
                    c0162m0.f2836c++;
                }
                c0167p.f2873i = c0162m0;
                c0167p.f2874j = n3.a() + i5;
                c0167p.f2876l = n3.a();
                c0167p.f2875k = n3.a() + i5;
            }
        }
        n3 = n5;
        i3 = i29;
        arrayList = arrayList5;
        c0197b = c0197b3;
        i4 = c0167p3.f2874j;
        while (true) {
            e02 = c0167p3.f2854F;
            if (e02.f2665k > 0) {
                break;
            }
            C0167p c0167p42 = c0167p3;
            D();
            c0197b.e(i4, c0167p42.f2854F.l());
            ArrayList arrayList82 = arrayList;
            C0143d.q(arrayList82, i16, c0167p42.f2854F.f2661g);
            c0167p3 = c0167p42;
            i3 = i3;
            arrayList = arrayList82;
        }
        z4 = c0167p3.f2863O;
        String str32 = " object arguments (";
        if (z4) {
        }
        ArrayList arrayList92 = c0167p.f2872h.f2203d;
        c0162m0 = (C0162m0) arrayList92.remove(arrayList92.size() - 1);
        if (c0162m0 != null) {
            c0162m0.f2836c++;
        }
        c0167p.f2873i = c0162m0;
        c0167p.f2874j = n3.a() + i5;
        c0167p.f2876l = n3.a();
        c0167p.f2875k = n3.a() + i5;
    }

    public final void q() {
        p(false);
        C0173s0 v3 = v();
        if (v3 != null) {
            int i3 = v3.f2903a;
            if ((i3 & 1) != 0) {
                v3.f2903a = i3 | 2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0173s0 r() {
        C0173s0 c0173s0;
        C0141c a3;
        C0171r0 c0171r0;
        G2.k kVar = this.D;
        if (kVar.f2203d.isEmpty()) {
            c0173s0 = null;
        } else {
            ArrayList arrayList = kVar.f2203d;
            c0173s0 = (C0173s0) arrayList.remove(arrayList.size() - 1);
        }
        if (c0173s0 != null) {
            c0173s0.f2903a &= -9;
        }
        if (c0173s0 != null) {
            int i3 = this.f2851A;
            C0547u c0547u = c0173s0.f2908f;
            if (c0547u != null && (c0173s0.f2903a & 16) == 0) {
                Object[] objArr = c0547u.f6331b;
                int[] iArr = c0547u.f6332c;
                long[] jArr = c0547u.f6330a;
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
                                        c0171r0 = new C0171r0(i3, 0, c0173s0, c0547u);
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
                    if (c0171r0 != null) {
                        C0196a c0196a = this.f2860L.f3114b;
                        c0196a.getClass();
                        J.h hVar = J.h.f3131c;
                        J.D d3 = c0196a.f3112b;
                        d3.o0(hVar);
                        l0.c.O(d3, 0, c0171r0);
                        l0.c.O(d3, 1, this.f2871g);
                        int i8 = d3.f3110h;
                        int i9 = hVar.f3102a;
                        int h02 = J.D.h0(d3, i9);
                        int i10 = hVar.f3103b;
                        if (i8 != h02 || d3.f3111i != J.D.h0(d3, i10)) {
                            StringBuilder sb = new StringBuilder();
                            int i11 = 0;
                            for (int i12 = 0; i12 < i9; i12++) {
                                if ((d3.f3110h & (1 << i12)) != 0) {
                                    if (i11 > 0) {
                                        sb.append(", ");
                                    }
                                    sb.append(hVar.b(i12));
                                    i11++;
                                }
                            }
                            String sb2 = sb.toString();
                            StringBuilder l3 = A.k.l(sb2, "StringBuilder().apply(builderAction).toString()");
                            int i13 = 0;
                            for (int i14 = 0; i14 < i10; i14++) {
                                if ((d3.f3111i & (1 << i14)) != 0) {
                                    if (i11 > 0) {
                                        l3.append(", ");
                                    }
                                    l3.append(hVar.c(i14));
                                    i13++;
                                }
                            }
                            String sb3 = l3.toString();
                            f2.j.e(sb3, "StringBuilder().apply(builderAction).toString()");
                            StringBuilder sb4 = new StringBuilder("Error while pushing ");
                            sb4.append(hVar);
                            sb4.append(". Not all arguments were provided. Missing ");
                            A.k.t(sb4, i11, " int arguments (", sb2, ") and ");
                            A.k.u(sb4, i13, " object arguments (", sb3, ").");
                            throw null;
                        }
                    }
                }
            }
            c0171r0 = null;
            if (c0171r0 != null) {
            }
        }
        C0173s0 c0173s02 = null;
        if (c0173s0 != null) {
            int i15 = c0173s0.f2903a;
            if ((i15 & 16) == 0 && ((i15 & 1) != 0 || this.f2880p)) {
                if (c0173s0.f2905c == null) {
                    if (this.f2863O) {
                        H0 h03 = this.f2856H;
                        a3 = h03.b(h03.f2708v);
                    } else {
                        E0 e02 = this.f2854F;
                        a3 = e02.a(e02.f2663i);
                    }
                    c0173s0.f2905c = a3;
                }
                c0173s0.f2903a &= -5;
                c0173s02 = c0173s0;
            }
        }
        p(false);
        return c0173s02;
    }

    public final void s() {
        p(false);
        this.f2866b.b();
        p(false);
        C0197b c0197b = this.f2860L;
        if (c0197b.f3115c) {
            c0197b.d(false);
            c0197b.d(false);
            C0196a c0196a = c0197b.f3114b;
            c0196a.getClass();
            c0196a.f3112b.n0(J.i.f3132c);
            c0197b.f3115c = false;
        }
        c0197b.b();
        if (!(c0197b.f3116d.f2726b == 0)) {
            C0143d.w("Missed recording an endGroup()");
            throw null;
        }
        if (!this.f2872h.f2203d.isEmpty()) {
            C0143d.w("Start/end imbalance");
            throw null;
        }
        i();
        this.f2854F.c();
        this.f2886v = this.f2887w.a() != 0;
    }

    public final void t(boolean z3, C0162m0 c0162m0) {
        this.f2872h.f2203d.add(this.f2873i);
        this.f2873i = c0162m0;
        int i3 = this.f2875k;
        N n3 = this.f2877m;
        n3.b(i3);
        n3.b(this.f2876l);
        n3.b(this.f2874j);
        if (z3) {
            this.f2874j = 0;
        }
        this.f2875k = 0;
        this.f2876l = 0;
    }

    public final void u() {
        F0 f02 = new F0();
        if (this.f2852B) {
            f02.c();
        }
        if (this.f2866b.c()) {
            f02.f2681m = new C0542p();
        }
        this.f2855G = f02;
        H0 i3 = f02.i();
        i3.e(true);
        this.f2856H = i3;
    }

    public final C0173s0 v() {
        if (this.f2890z == 0) {
            G2.k kVar = this.D;
            if (!kVar.f2203d.isEmpty()) {
                return (C0173s0) kVar.f2203d.get(r0.size() - 1);
            }
        }
        return null;
    }

    public final boolean w() {
        C0173s0 v3;
        return (x() && !this.f2886v && ((v3 = v()) == null || (v3.f2903a & 4) == 0)) ? false : true;
    }

    public final boolean x() {
        C0173s0 v3;
        return (this.f2863O || this.f2888x || this.f2886v || (v3 = v()) == null || (v3.f2903a & 8) != 0) ? false : true;
    }

    public final void y(ArrayList arrayList) {
        C0196a c0196a = this.f2870f;
        C0197b c0197b = this.f2860L;
        C0196a c0196a2 = c0197b.f3114b;
        try {
            c0197b.f3114b = c0196a;
            c0196a.f3112b.n0(J.u.f3148c);
            if (arrayList.size() > 0) {
                R1.i iVar = (R1.i) arrayList.get(0);
                AbstractC0138a0 abstractC0138a0 = (AbstractC0138a0) iVar.f4150d;
                abstractC0138a0.getClass();
                throw null;
            }
            C0196a c0196a3 = c0197b.f3114b;
            c0196a3.getClass();
            c0196a3.f3112b.n0(J.j.f3133c);
            c0197b.f3118f = 0;
        } finally {
            c0197b.f3114b = c0196a2;
        }
    }

    public final Object z() {
        boolean z3 = this.f2863O;
        W w2 = C0159l.f2829a;
        if (!z3) {
            Object h3 = this.f2854F.h();
            return (!this.f2888x || (h3 instanceof C0161m)) ? h3 : w2;
        }
        if (!this.f2881q) {
            return w2;
        }
        C0143d.w("A call to createNode(), emitNode() or useNode() expected");
        throw null;
    }
}
