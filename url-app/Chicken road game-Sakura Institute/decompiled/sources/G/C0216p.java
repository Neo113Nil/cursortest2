package G;

import A.AbstractC0017m;
import B1.C0097d;
import H.C0244a;
import H.C0245b;
import H.C0246c;
import android.os.Trace;
import android.util.SparseArray;
import i.AbstractC0665F;
import i.C0660A;
import i.C0661B;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import w2.C1294c;
import z2.C1399C;
import z2.C1436t;

/* renamed from: G.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0216p {

    /* renamed from: A, reason: collision with root package name */
    public int f2847A;
    public boolean B;

    /* renamed from: C, reason: collision with root package name */
    public final C0214o f2848C;

    /* renamed from: D, reason: collision with root package name */
    public final W0 f2849D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f2850E;

    /* renamed from: F, reason: collision with root package name */
    public E0 f2851F;

    /* renamed from: G, reason: collision with root package name */
    public F0 f2852G;

    /* renamed from: H, reason: collision with root package name */
    public H0 f2853H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f2854I;

    /* renamed from: J, reason: collision with root package name */
    public InterfaceC0213n0 f2855J;

    /* renamed from: K, reason: collision with root package name */
    public C0244a f2856K;

    /* renamed from: L, reason: collision with root package name */
    public final C0245b f2857L;

    /* renamed from: M, reason: collision with root package name */
    public C0190c f2858M;

    /* renamed from: N, reason: collision with root package name */
    public C0246c f2859N;

    /* renamed from: O, reason: collision with root package name */
    public boolean f2860O;

    /* renamed from: P, reason: collision with root package name */
    public int f2861P;

    /* renamed from: a, reason: collision with root package name */
    public final C0097d f2862a;

    /* renamed from: b, reason: collision with root package name */
    public final r f2863b;

    /* renamed from: c, reason: collision with root package name */
    public final F0 f2864c;

    /* renamed from: d, reason: collision with root package name */
    public final C0660A f2865d;

    /* renamed from: e, reason: collision with root package name */
    public final C0244a f2866e;

    /* renamed from: f, reason: collision with root package name */
    public final C0244a f2867f;

    /* renamed from: g, reason: collision with root package name */
    public final C0225u f2868g;

    /* renamed from: i, reason: collision with root package name */
    public C0211m0 f2870i;

    /* renamed from: j, reason: collision with root package name */
    public int f2871j;

    /* renamed from: k, reason: collision with root package name */
    public int f2872k;

    /* renamed from: l, reason: collision with root package name */
    public int f2873l;

    /* renamed from: n, reason: collision with root package name */
    public int[] f2875n;

    /* renamed from: o, reason: collision with root package name */
    public i.o f2876o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2877p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2878q;

    /* renamed from: u, reason: collision with root package name */
    public C1294c f2882u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2883v;

    /* renamed from: x, reason: collision with root package name */
    public boolean f2885x;

    /* renamed from: z, reason: collision with root package name */
    public int f2887z;

    /* renamed from: h, reason: collision with root package name */
    public final W0 f2869h = new W0(0);

    /* renamed from: m, reason: collision with root package name */
    public final N f2874m = new N();

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList f2879r = new ArrayList();

    /* renamed from: s, reason: collision with root package name */
    public final N f2880s = new N();

    /* renamed from: t, reason: collision with root package name */
    public InterfaceC0213n0 f2881t = O.d.f3626m;

    /* renamed from: w, reason: collision with root package name */
    public final N f2884w = new N();

    /* renamed from: y, reason: collision with root package name */
    public int f2886y = -1;

    public C0216p(C0097d c0097d, r rVar, F0 f02, C0660A c0660a, C0244a c0244a, C0244a c0244a2, C0225u c0225u) {
        this.f2862a = c0097d;
        this.f2863b = rVar;
        this.f2864c = f02;
        this.f2865d = c0660a;
        this.f2866e = c0244a;
        this.f2867f = c0244a2;
        this.f2868g = c0225u;
        this.B = rVar.e() || rVar.c();
        this.f2848C = new C0214o(0, this);
        this.f2849D = new W0(0);
        E0 s4 = f02.s();
        s4.c();
        this.f2851F = s4;
        F0 f03 = new F0();
        if (rVar.e()) {
            f03.h();
        }
        if (rVar.c()) {
            f03.f2679p = new i.q();
        }
        this.f2852G = f03;
        H0 w4 = f03.w();
        w4.e(true);
        this.f2853H = w4;
        this.f2857L = new C0245b(this, c0244a);
        E0 s5 = this.f2852G.s();
        try {
            C0190c a4 = s5.a(0);
            s5.c();
            this.f2858M = a4;
            this.f2859N = new C0246c();
        } catch (Throwable th) {
            s5.c();
            throw th;
        }
    }

    public static final int K(C0216p c0216p, int i2, boolean z4, int i4) {
        E0 e02 = c0216p.f2851F;
        int[] iArr = e02.f2654b;
        int i5 = i2 * 5;
        if (!((iArr[i5 + 1] & 134217728) != 0)) {
            if (!C0192d.h(iArr, i2)) {
                if (C0192d.m(iArr, i2)) {
                    return 1;
                }
                return C0192d.o(iArr, i2);
            }
            int i6 = iArr[i5 + 3] + i2;
            int i7 = 0;
            for (int i8 = i2 + 1; i8 < i6; i8 += iArr[(i8 * 5) + 3]) {
                boolean m4 = C0192d.m(iArr, i8);
                C0245b c0245b = c0216p.f2857L;
                if (m4) {
                    c0245b.c();
                    Object i9 = e02.i(i8);
                    c0245b.c();
                    c0245b.f3190h.f2781d.add(i9);
                }
                i7 += K(c0216p, i8, m4 || z4, m4 ? 0 : i4 + i7);
                if (m4) {
                    c0245b.c();
                    c0245b.a();
                }
            }
            if (C0192d.m(iArr, i2)) {
                return 1;
            }
            return i7;
        }
        int i10 = iArr[i5];
        Object j4 = e02.j(iArr, i2);
        if (i10 != 206 || !Intrinsics.a(j4, C0192d.f2796e)) {
            if (C0192d.m(iArr, i2)) {
                return 1;
            }
            return C0192d.o(iArr, i2);
        }
        Object g4 = e02.g(i2, 0);
        C0210m c0210m = g4 instanceof C0210m ? (C0210m) g4 : null;
        if (c0210m != null) {
            for (C0216p c0216p2 : c0210m.f2829d.f2840e) {
                C0245b c0245b2 = c0216p2.f2857L;
                F0 f02 = c0216p2.f2864c;
                if (f02.f2671e > 0 && C0192d.h(f02.f2670d, 0)) {
                    C0244a c0244a = new C0244a();
                    c0216p2.f2856K = c0244a;
                    E0 s4 = f02.s();
                    try {
                        c0216p2.f2851F = s4;
                        C0244a c0244a2 = c0245b2.f3184b;
                        try {
                            c0245b2.f3184b = c0244a;
                            c0216p2.J(0);
                            c0245b2.b();
                            if (c0245b2.f3185c) {
                                C0244a c0244a3 = c0245b2.f3184b;
                                c0244a3.getClass();
                                c0244a3.f3182h.c0(H.w.f3220c);
                                if (c0245b2.f3185c) {
                                    c0245b2.d(false);
                                    c0245b2.d(false);
                                    C0244a c0244a4 = c0245b2.f3184b;
                                    c0244a4.getClass();
                                    c0244a4.f3182h.c0(H.i.f3202c);
                                    c0245b2.f3185c = false;
                                }
                            }
                            c0245b2.f3184b = c0244a2;
                            Unit unit = Unit.f7487a;
                        } catch (Throwable th) {
                            c0245b2.f3184b = c0244a2;
                            throw th;
                        }
                    } finally {
                        s4.c();
                    }
                }
                c0216p.f2863b.l(c0216p2.f2868g);
            }
        }
        return C0192d.o(iArr, i2);
    }

    public final void A(ArrayList arrayList) {
        C0244a c0244a = this.f2867f;
        C0245b c0245b = this.f2857L;
        C0244a c0244a2 = c0245b.f3184b;
        try {
            c0245b.f3184b = c0244a;
            c0244a.f3182h.c0(H.u.f3218c);
            if (arrayList.size() > 0) {
                Pair pair = (Pair) arrayList.get(0);
                AbstractC0187a0 abstractC0187a0 = (AbstractC0187a0) pair.f7485d;
                abstractC0187a0.getClass();
                throw null;
            }
            C0244a c0244a3 = c0245b.f3184b;
            c0244a3.getClass();
            c0244a3.f3182h.c0(H.j.f3203c);
            c0245b.f3188f = 0;
        } finally {
            c0245b.f3184b = c0244a2;
        }
    }

    public final Object B() {
        boolean z4 = this.f2860O;
        W w4 = C0208l.f2826a;
        if (!z4) {
            Object h4 = this.f2851F.h();
            return (!this.f2885x || (h4 instanceof C0210m)) ? h4 : w4;
        }
        if (!this.f2878q) {
            return w4;
        }
        C0192d.w("A call to createNode(), emitNode() or useNode() expected");
        throw null;
    }

    public final int C(int i2) {
        int p4 = C0192d.p(this.f2851F.f2654b, i2) + 1;
        int i4 = 0;
        while (p4 < i2) {
            if (!C0192d.l(this.f2851F.f2654b, p4)) {
                i4++;
            }
            p4 += C0192d.j(this.f2851F.f2654b, p4);
        }
        return i4;
    }

    public final boolean D(C1294c c1294c) {
        H.D d4 = this.f2866e.f3182h;
        if (!d4.Z()) {
            C0192d.w("Expected applyChanges() to have been called");
            throw null;
        }
        if (((i.y) c1294c.f11388d).f6986e <= 0 && this.f2879r.isEmpty()) {
            return false;
        }
        o(c1294c, null);
        return d4.a0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0037, code lost:
    
        if (r3.f2728b < r5) goto L11;
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
    public final void E() {
        O o4;
        boolean z4;
        C0222s0 c0222s0;
        int i2;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z5;
        Object[] objArr;
        Object[] objArr2;
        boolean z6;
        boolean z7;
        C0216p c0216p;
        i.v vVar;
        long[] jArr;
        long[] jArr2;
        int E3;
        int i8;
        O o5;
        Unit unit;
        C0216p c0216p2 = this;
        boolean z8 = c0216p2.f2850E;
        c0216p2.f2850E = true;
        E0 e02 = c0216p2.f2851F;
        int i9 = e02.f2661i;
        int i10 = (i9 * 5) + 3;
        int i11 = e02.f2654b[i10] + i9;
        int i12 = c0216p2.f2871j;
        int i13 = c0216p2.f2861P;
        int i14 = c0216p2.f2872k;
        int i15 = c0216p2.f2873l;
        ArrayList arrayList = c0216p2.f2879r;
        int E4 = C0192d.E(e02.f2659g, arrayList);
        if (E4 < 0) {
            E4 = -(E4 + 1);
        }
        if (E4 < arrayList.size()) {
            o4 = (O) arrayList.get(E4);
        }
        o4 = null;
        int i16 = i9;
        boolean z9 = false;
        while (o4 != null) {
            int i17 = o4.f2728b;
            int E5 = C0192d.E(i17, arrayList);
            if (E5 >= 0) {
            }
            Object obj = o4.f2729c;
            C0222s0 c0222s02 = o4.f2727a;
            if (obj == null) {
                c0222s02.getClass();
            } else {
                i.y yVar = c0222s02.f2906g;
                if (yVar != null) {
                    z4 = z8;
                    if (obj instanceof F) {
                        z5 = C0222s0.a((F) obj, yVar);
                        c0222s0 = c0222s02;
                        i2 = i11;
                        i4 = i10;
                        i5 = i12;
                        i6 = i14;
                        i7 = i15;
                    } else {
                        if (obj instanceof C0661B) {
                            C0661B c0661b = (C0661B) obj;
                            if (c0661b.h()) {
                                Object[] objArr3 = c0661b.f6885b;
                                long[] jArr3 = c0661b.f6884a;
                                i7 = i15;
                                int length = jArr3.length - 2;
                                if (length >= 0) {
                                    i2 = i11;
                                    i4 = i10;
                                    i6 = i14;
                                    int i18 = 0;
                                    while (true) {
                                        long j4 = jArr3[i18];
                                        long[] jArr4 = jArr3;
                                        c0222s0 = c0222s02;
                                        if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i19 = 8 - ((~(i18 - length)) >>> 31);
                                            int i20 = 0;
                                            while (i20 < i19) {
                                                if ((j4 & 255) < 128) {
                                                    i5 = i12;
                                                    Object obj2 = objArr3[(i18 << 3) + i20];
                                                    objArr2 = objArr3;
                                                    if (!(obj2 instanceof F)) {
                                                        break;
                                                    } else if (C0222s0.a((F) obj2, yVar)) {
                                                        break;
                                                    }
                                                } else {
                                                    objArr2 = objArr3;
                                                    i5 = i12;
                                                }
                                                j4 >>= 8;
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
                                        c0222s02 = c0222s0;
                                        jArr3 = jArr4;
                                        objArr3 = objArr;
                                        i12 = i5;
                                    }
                                } else {
                                    c0222s0 = c0222s02;
                                    i2 = i11;
                                    i4 = i10;
                                    i5 = i12;
                                    i6 = i14;
                                }
                            } else {
                                c0222s0 = c0222s02;
                                i2 = i11;
                                i4 = i10;
                                i5 = i12;
                                i6 = i14;
                                i7 = i15;
                            }
                            z5 = false;
                        }
                        c0222s0 = c0222s02;
                        i2 = i11;
                        i4 = i10;
                        i5 = i12;
                        i6 = i14;
                        i7 = i15;
                        z5 = true;
                    }
                    if (z5) {
                        C0222s0 c0222s03 = c0222s0;
                        W0 w02 = c0216p2.f2849D;
                        w02.f2781d.add(c0222s03);
                        C0225u c0225u = c0222s03.f2901b;
                        if (c0225u == null || (vVar = c0222s03.f2905f) == null) {
                            z6 = z9;
                        } else {
                            c0222s03.e(true);
                            try {
                                Object[] objArr4 = vVar.f6969b;
                                int[] iArr = vVar.f6970c;
                                long[] jArr5 = vVar.f6968a;
                                int length2 = jArr5.length - 2;
                                if (length2 >= 0) {
                                    int i21 = 0;
                                    while (true) {
                                        long j5 = jArr5[i21];
                                        z6 = z9;
                                        if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i22 = 8 - ((~(i21 - length2)) >>> 31);
                                            int i23 = 0;
                                            while (i23 < i22) {
                                                if ((j5 & 255) < 128) {
                                                    int i24 = (i21 << 3) + i23;
                                                    jArr2 = jArr5;
                                                    Object obj3 = objArr4[i24];
                                                    int i25 = iArr[i24];
                                                    c0225u.w(obj3);
                                                } else {
                                                    jArr2 = jArr5;
                                                }
                                                j5 >>= 8;
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
                                        z9 = z6;
                                        jArr5 = jArr;
                                    }
                                } else {
                                    z6 = z9;
                                }
                                c0222s03.e(false);
                            } catch (Throwable th) {
                                c0222s03.e(false);
                                throw th;
                            }
                        }
                        ArrayList arrayList2 = w02.f2781d;
                        z7 = true;
                        arrayList2.remove(arrayList2.size() - 1);
                        c0216p = this;
                        z9 = z6;
                    } else {
                        c0216p2.f2851F.k(i17);
                        int i26 = c0216p2.f2851F.f2659g;
                        c0216p2.H(i16, i26, i9);
                        int i27 = (i26 * 5) + 2;
                        int i28 = c0216p2.f2851F.f2654b[i27];
                        while (i28 != i9 && !C0192d.m(c0216p2.f2851F.f2654b, i28)) {
                            i28 = c0216p2.f2851F.f2654b[(i28 * 5) + 2];
                        }
                        int i29 = C0192d.m(c0216p2.f2851F.f2654b, i28) ? 0 : i5;
                        if (i28 != i26) {
                            int e03 = (c0216p2.e0(i28) - C0192d.o(c0216p2.f2851F.f2654b, i26)) + i29;
                            while (i29 < e03 && i28 != i17) {
                                i28++;
                                while (i28 < i17) {
                                    int[] iArr2 = c0216p2.f2851F.f2654b;
                                    int i30 = iArr2[(i28 * 5) + 3] + i28;
                                    if (i17 >= i30) {
                                        i29 += C0192d.m(iArr2, i28) ? 1 : c0216p2.e0(i28);
                                        i28 = i30;
                                    }
                                }
                                break;
                            }
                        }
                        c0216p2.f2871j = i29;
                        c0216p2.f2873l = c0216p2.C(i26);
                        int i31 = c0216p2.f2851F.f2654b[i27];
                        c0216p2.f2861P = c0216p2.j(i31, c0216p2.C(i31), i9, i13);
                        c0216p2.f2855J = null;
                        Function2 function2 = c0222s0.f2903d;
                        if (function2 != null) {
                            function2.h(c0216p2, 1);
                            unit = Unit.f7487a;
                        } else {
                            unit = null;
                        }
                        if (unit == null) {
                            throw new IllegalStateException("Invalid restart scope");
                        }
                        c0216p2.f2855J = null;
                        E0 e04 = c0216p2.f2851F;
                        int i32 = e04.f2654b[i4] + i9;
                        int i33 = e04.f2659g;
                        if (!(i33 >= i9 && i33 <= i32)) {
                            C0192d.w("Index " + i9 + " is not a parent of " + i33);
                            throw null;
                        }
                        e04.f2661i = i9;
                        e04.f2660h = i32;
                        e04.f2664l = 0;
                        e04.f2665m = 0;
                        i16 = i26;
                        c0216p = c0216p2;
                        z7 = true;
                        z9 = true;
                    }
                    E3 = C0192d.E(c0216p.f2851F.f2659g, arrayList);
                    if (E3 < 0) {
                        E3 = -(E3 + 1);
                    }
                    if (E3 >= arrayList.size()) {
                        o5 = (O) arrayList.get(E3);
                        i8 = i2;
                        if (o5.f2728b < i8) {
                            c0216p2 = c0216p;
                            i11 = i8;
                            i15 = i7;
                            i14 = i6;
                            i10 = i4;
                            i12 = i5;
                            o4 = o5;
                            z8 = z4;
                        }
                    } else {
                        i8 = i2;
                    }
                    o5 = null;
                    c0216p2 = c0216p;
                    i11 = i8;
                    i15 = i7;
                    i14 = i6;
                    i10 = i4;
                    i12 = i5;
                    o4 = o5;
                    z8 = z4;
                }
            }
            z4 = z8;
            c0222s0 = c0222s02;
            i2 = i11;
            i4 = i10;
            i5 = i12;
            i6 = i14;
            i7 = i15;
            z5 = true;
            if (z5) {
            }
            E3 = C0192d.E(c0216p.f2851F.f2659g, arrayList);
            if (E3 < 0) {
            }
            if (E3 >= arrayList.size()) {
            }
            o5 = null;
            c0216p2 = c0216p;
            i11 = i8;
            i15 = i7;
            i14 = i6;
            i10 = i4;
            i12 = i5;
            o4 = o5;
            z8 = z4;
        }
        boolean z10 = z8;
        C0216p c0216p3 = c0216p2;
        int i34 = i12;
        int i35 = i14;
        int i36 = i15;
        if (z9) {
            c0216p3.H(i16, i9, i9);
            c0216p3.f2851F.m();
            int e05 = c0216p3.e0(i9);
            c0216p3.f2871j = i34 + e05;
            c0216p3.f2872k = i35 + e05;
            c0216p3.f2873l = i36;
        } else {
            M();
        }
        c0216p3.f2861P = i13;
        c0216p3.f2850E = z10;
    }

    public final void F() {
        J(this.f2851F.f2659g);
        C0245b c0245b = this.f2857L;
        c0245b.d(false);
        C0216p c0216p = c0245b.f3183a;
        E0 e02 = c0216p.f2851F;
        if (e02.f2655c > 0) {
            int i2 = e02.f2661i;
            N n2 = c0245b.f3186d;
            int i4 = n2.f2724b;
            if ((i4 > 0 ? n2.f2723a[i4 - 1] : -2) != i2) {
                if (!c0245b.f3185c && c0245b.f3187e) {
                    c0245b.d(false);
                    C0244a c0244a = c0245b.f3184b;
                    c0244a.getClass();
                    c0244a.f3182h.c0(H.l.f3205c);
                    c0245b.f3185c = true;
                }
                if (i2 > 0) {
                    C0190c a4 = e02.a(i2);
                    n2.b(i2);
                    c0245b.d(false);
                    C0244a c0244a2 = c0245b.f3184b;
                    c0244a2.getClass();
                    H.k kVar = H.k.f3204c;
                    H.D d4 = c0244a2.f3182h;
                    d4.d0(kVar);
                    j0.c.Q(d4, 0, a4);
                    int i5 = d4.f3180n;
                    int i6 = kVar.f3172a;
                    int W3 = H.D.W(d4, i6);
                    int i7 = kVar.f3173b;
                    if (i5 != W3 || d4.f3181o != H.D.W(d4, i7)) {
                        StringBuilder sb = new StringBuilder();
                        int i8 = 0;
                        for (int i9 = 0; i9 < i6; i9++) {
                            if (((1 << i9) & d4.f3180n) != 0) {
                                if (i8 > 0) {
                                    sb.append(", ");
                                }
                                sb.append(kVar.b(i9));
                                i8++;
                            }
                        }
                        String sb2 = sb.toString();
                        StringBuilder p4 = AbstractC0017m.p(sb2, "StringBuilder().apply(builderAction).toString()");
                        int i10 = 0;
                        for (int i11 = 0; i11 < i7; i11++) {
                            if (((1 << i11) & d4.f3181o) != 0) {
                                if (i8 > 0) {
                                    p4.append(", ");
                                }
                                p4.append(kVar.c(i11));
                                i10++;
                            }
                        }
                        String sb3 = p4.toString();
                        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
                        StringBuilder sb4 = new StringBuilder("Error while pushing ");
                        sb4.append(kVar);
                        sb4.append(". Not all arguments were provided. Missing ");
                        AbstractC0017m.t(sb4, i8, " int arguments (", sb2, ") and ");
                        AbstractC0017m.u(sb4, i10, " object arguments (", sb3, ").");
                        throw null;
                    }
                    c0245b.f3185c = true;
                }
            }
        }
        C0244a c0244a3 = c0245b.f3184b;
        c0244a3.getClass();
        c0244a3.f3182h.c0(H.s.f3216c);
        int i12 = c0245b.f3188f;
        E0 e03 = c0216p.f2851F;
        c0245b.f3188f = e03.f2654b[(e03.f2659g * 5) + 3] + i12;
    }

    public final void G(InterfaceC0213n0 interfaceC0213n0) {
        C1294c c1294c = this.f2882u;
        if (c1294c == null) {
            c1294c = new C1294c(12);
            this.f2882u = c1294c;
        }
        ((SparseArray) c1294c.f11388d).put(this.f2851F.f2659g, interfaceC0213n0);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0082 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void H(int i2, int i4, int i5) {
        int[] iArr;
        E0 e02 = this.f2851F;
        if (i2 != i4) {
            if (i2 != i5 && i4 != i5) {
                int[] iArr2 = e02.f2654b;
                int i6 = iArr2[(i2 * 5) + 2];
                if (i6 == i4) {
                    i5 = i4;
                } else {
                    int i7 = iArr2[(i4 * 5) + 2];
                    if (i7 != i2) {
                        if (i6 == i7) {
                            i5 = i6;
                        } else {
                            int i8 = i2;
                            int i9 = 0;
                            while (true) {
                                iArr = e02.f2654b;
                                if (i8 <= 0 || i8 == i5) {
                                    break;
                                }
                                i8 = C0192d.p(iArr, i8);
                                i9++;
                            }
                            int i10 = i4;
                            int i11 = 0;
                            while (i10 > 0 && i10 != i5) {
                                i10 = C0192d.p(iArr, i10);
                                i11++;
                            }
                            int i12 = i9 - i11;
                            int i13 = i2;
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
            while (i2 > 0 && i2 != i5) {
                if (!C0192d.m(e02.f2654b, i2)) {
                    this.f2857L.a();
                }
                i2 = e02.f2654b[(i2 * 5) + 2];
            }
            p(i4, i5);
        }
        i5 = i2;
        while (i2 > 0) {
            if (!C0192d.m(e02.f2654b, i2)) {
            }
            i2 = e02.f2654b[(i2 * 5) + 2];
        }
        p(i4, i5);
    }

    public final Object I() {
        boolean z4 = this.f2860O;
        W w4 = C0208l.f2826a;
        if (!z4) {
            Object h4 = this.f2851F.h();
            return (!this.f2885x || (h4 instanceof C0210m)) ? h4 instanceof B0 ? ((B0) h4).f2637a : h4 : w4;
        }
        if (!this.f2878q) {
            return w4;
        }
        C0192d.w("A call to createNode(), emitNode() or useNode() expected");
        throw null;
    }

    public final void J(int i2) {
        K(this, i2, false, 0);
        this.f2857L.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void L() {
        int rotateLeft;
        int hashCode;
        if (this.f2879r.isEmpty()) {
            this.f2872k = this.f2851F.l() + this.f2872k;
            return;
        }
        E0 e02 = this.f2851F;
        int f4 = e02.f();
        int i2 = e02.f2659g;
        int i4 = e02.f2660h;
        int[] iArr = e02.f2654b;
        Object j4 = i2 < i4 ? e02.j(iArr, i2) : null;
        Object e4 = e02.e();
        int i5 = this.f2873l;
        W w4 = C0208l.f2826a;
        if (j4 != null) {
            rotateLeft = Integer.rotateLeft((j4 instanceof Enum ? ((Enum) j4).ordinal() : j4.hashCode()) ^ Integer.rotateLeft(this.f2861P, 3), 3);
        } else {
            if (e4 != null && f4 == 207 && !e4.equals(w4)) {
                this.f2861P = Integer.rotateLeft(e4.hashCode() ^ Integer.rotateLeft(this.f2861P, 3), 3) ^ i5;
                R(null, C0192d.m(iArr, e02.f2659g));
                E();
                e02.d();
                if (j4 == null) {
                    hashCode = Integer.hashCode(j4 instanceof Enum ? ((Enum) j4).ordinal() : j4.hashCode()) ^ Integer.rotateRight(this.f2861P, 3);
                } else {
                    if (e4 != null && f4 == 207 && !e4.equals(w4)) {
                        this.f2861P = Integer.rotateRight(Integer.hashCode(e4.hashCode()) ^ Integer.rotateRight(this.f2861P ^ i5, 3), 3);
                        return;
                    }
                    hashCode = Integer.rotateRight(this.f2861P ^ i5, 3) ^ Integer.hashCode(f4);
                }
                this.f2861P = Integer.rotateRight(hashCode, 3);
            }
            rotateLeft = Integer.rotateLeft(Integer.rotateLeft(this.f2861P, 3) ^ f4, 3) ^ i5;
        }
        this.f2861P = rotateLeft;
        R(null, C0192d.m(iArr, e02.f2659g));
        E();
        e02.d();
        if (j4 == null) {
        }
        this.f2861P = Integer.rotateRight(hashCode, 3);
    }

    public final void M() {
        E0 e02 = this.f2851F;
        int i2 = e02.f2661i;
        this.f2872k = i2 >= 0 ? C0192d.o(e02.f2654b, i2) : 0;
        this.f2851F.m();
    }

    public final void N() {
        if (this.f2872k != 0) {
            C0192d.w("No nodes can be emitted before calling skipAndEndGroup");
            throw null;
        }
        C0222s0 x2 = x();
        if (x2 != null) {
            x2.f2900a |= 16;
        }
        if (this.f2879r.isEmpty()) {
            M();
        } else {
            E();
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
    public final void O(int i2, int i4, Object obj, Object obj2) {
        int rotateLeft;
        C0211m0 c0211m0;
        Object obj3;
        int i5;
        int i6;
        int i7;
        C0216p c0216p = this;
        Object obj4 = obj;
        if (c0216p.f2878q) {
            C0192d.w("A call to createNode(), emitNode() or useNode() expected");
            throw null;
        }
        int i8 = c0216p.f2873l;
        W w4 = C0208l.f2826a;
        if (obj4 != null) {
            rotateLeft = Integer.rotateLeft((obj4 instanceof Enum ? ((Enum) obj4).ordinal() : obj.hashCode()) ^ Integer.rotateLeft(c0216p.f2861P, 3), 3);
        } else {
            if (obj2 != null && i2 == 207 && !obj2.equals(w4)) {
                c0216p.f2861P = i8 ^ Integer.rotateLeft(obj2.hashCode() ^ Integer.rotateLeft(c0216p.f2861P, 3), 3);
                if (obj4 == null) {
                    c0216p.f2873l++;
                }
                boolean z4 = i4 == 0;
                if (!c0216p.f2860O) {
                    c0216p.f2851F.f2663k++;
                    H0 h02 = c0216p.f2853H;
                    int i9 = h02.f2704t;
                    if (z4) {
                        h02.I(i2, w4, w4, true);
                    } else if (obj2 != null) {
                        if (obj4 == null) {
                            obj4 = w4;
                        }
                        h02.I(i2, obj4, obj2, false);
                    } else {
                        if (obj4 == null) {
                            obj4 = w4;
                        }
                        h02.I(i2, obj4, w4, false);
                    }
                    C0211m0 c0211m02 = c0216p.f2870i;
                    if (c0211m02 != null) {
                        int i10 = (-2) - i9;
                        Q q2 = new Q(-1, i2, i10, -1);
                        c0211m02.f2834e.i(i10, new K(-1, c0216p.f2871j - c0211m02.f2831b, 0));
                        c0211m02.f2833d.add(q2);
                    }
                    c0216p.v(z4, null);
                    return;
                }
                boolean z5 = i4 == 1 && c0216p.f2885x;
                if (c0216p.f2870i == null) {
                    int f4 = c0216p.f2851F.f();
                    if (!z5 && f4 == i2) {
                        E0 e02 = c0216p.f2851F;
                        int i11 = e02.f2659g;
                        if (Intrinsics.a(obj4, i11 < e02.f2660h ? e02.j(e02.f2654b, i11) : null)) {
                            c0216p.R(obj2, z4);
                        }
                    }
                    E0 e03 = c0216p.f2851F;
                    e03.getClass();
                    ArrayList arrayList = new ArrayList();
                    if (e03.f2663k <= 0) {
                        int i12 = e03.f2659g;
                        while (i12 < e03.f2660h) {
                            int i13 = i12 * 5;
                            int[] iArr = e03.f2654b;
                            arrayList.add(new Q(e03.j(iArr, i12), iArr[i13], i12, C0192d.m(iArr, i12) ? 1 : C0192d.o(iArr, i12)));
                            i12 += iArr[i13 + 3];
                        }
                    }
                    c0216p.f2870i = new C0211m0(c0216p.f2871j, arrayList);
                }
                C0211m0 c0211m03 = c0216p.f2870i;
                if (c0211m03 != null) {
                    Object p4 = obj4 != null ? new P(Integer.valueOf(i2), obj4) : Integer.valueOf(i2);
                    i.y yVar = ((C0189b0) c0211m03.f2835f.getValue()).f2790a;
                    Object e4 = yVar.e(p4);
                    if (e4 != null) {
                        if (!(e4 instanceof List) || ((e4 instanceof N2.a) && !(e4 instanceof N2.c))) {
                            yVar.g(p4);
                            obj3 = e4;
                        } else {
                            List b4 = M2.J.b(e4);
                            obj3 = b4.remove(0);
                            if (b4.isEmpty()) {
                                yVar.g(p4);
                            }
                        }
                        Intrinsics.d(obj3, "null cannot be cast to non-null type V of androidx.compose.runtime.MutableScatterMultiMap.pop_impl$lambda$1");
                    } else {
                        obj3 = null;
                    }
                    Q q4 = (Q) obj3;
                    ArrayList arrayList2 = c0211m03.f2833d;
                    i.q qVar = c0211m03.f2834e;
                    int i14 = c0211m03.f2831b;
                    if (z5 || q4 == null) {
                        c0216p.f2851F.f2663k++;
                        c0216p.f2860O = true;
                        c0216p.f2855J = null;
                        if (c0216p.f2853H.f2707w) {
                            H0 w5 = c0216p.f2852G.w();
                            c0216p.f2853H = w5;
                            w5.D();
                            c0216p.f2854I = false;
                            c0216p.f2855J = null;
                        }
                        c0216p.f2853H.d();
                        H0 h03 = c0216p.f2853H;
                        int i15 = h03.f2704t;
                        if (z4) {
                            h03.I(i2, w4, w4, true);
                        } else if (obj2 != null) {
                            if (obj4 == null) {
                                obj4 = w4;
                            }
                            h03.I(i2, obj4, obj2, false);
                        } else {
                            if (obj4 == null) {
                                obj4 = w4;
                            }
                            h03.I(i2, obj4, w4, false);
                        }
                        c0216p.f2858M = c0216p.f2853H.b(i15);
                        int i16 = (-2) - i15;
                        Q q5 = new Q(-1, i2, i16, -1);
                        qVar.i(i16, new K(-1, c0216p.f2871j - i14, 0));
                        arrayList2.add(q5);
                        c0211m0 = new C0211m0(z4 ? 0 : c0216p.f2871j, new ArrayList());
                        c0216p.v(z4, c0211m0);
                        return;
                    }
                    arrayList2.add(q4);
                    int i17 = q4.f2742c;
                    K k4 = (K) qVar.f(i17);
                    c0216p.f2871j = (k4 != null ? k4.f2713b : -1) + i14;
                    K k5 = (K) qVar.f(i17);
                    int i18 = k5 != null ? k5.f2712a : -1;
                    int i19 = c0211m03.f2832c;
                    int i20 = i18 - i19;
                    char c4 = 7;
                    int i21 = 8;
                    if (i18 > i19) {
                        Object[] objArr = qVar.f6942c;
                        long[] jArr = qVar.f6940a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i22 = 0;
                            while (true) {
                                long j4 = jArr[i22];
                                i5 = i20;
                                if ((((~j4) << c4) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i23 = 8 - ((~(i22 - length)) >>> 31);
                                    for (int i24 = 0; i24 < i23; i24++) {
                                        if ((j4 & 255) < 128) {
                                            K k6 = (K) objArr[(i22 << 3) + i24];
                                            int i25 = k6.f2712a;
                                            if (i25 == i18) {
                                                k6.f2712a = i19;
                                            } else if (i19 <= i25 && i25 < i18) {
                                                k6.f2712a = i25 + 1;
                                            }
                                        }
                                        j4 >>= 8;
                                    }
                                    if (i23 != 8) {
                                        break;
                                    }
                                }
                                if (i22 == length) {
                                    break;
                                }
                                i22++;
                                i20 = i5;
                                c4 = 7;
                            }
                        } else {
                            i5 = i20;
                        }
                    } else {
                        i5 = i20;
                        if (i19 > i18) {
                            Object[] objArr2 = qVar.f6942c;
                            long[] jArr2 = qVar.f6940a;
                            int length2 = jArr2.length - 2;
                            if (length2 >= 0) {
                                int i26 = 0;
                                while (true) {
                                    long j5 = jArr2[i26];
                                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i27 = 8 - ((~(i26 - length2)) >>> 31);
                                        int i28 = 0;
                                        while (i28 < i27) {
                                            if ((j5 & 255) < 128) {
                                                K k7 = (K) objArr2[(i26 << 3) + i28];
                                                int i29 = k7.f2712a;
                                                if (i29 == i18) {
                                                    k7.f2712a = i19;
                                                } else if (i18 + 1 <= i29 && i29 < i19) {
                                                    k7.f2712a = i29 - 1;
                                                }
                                                i7 = 8;
                                            } else {
                                                i7 = i21;
                                            }
                                            j5 >>= i7;
                                            i28++;
                                            i21 = i7;
                                        }
                                        i6 = i21;
                                        if (i27 != i6) {
                                            break;
                                        }
                                    } else {
                                        i6 = i21;
                                    }
                                    if (i26 == length2) {
                                        break;
                                    }
                                    i26++;
                                    i21 = i6;
                                }
                            }
                        }
                    }
                    C0245b c0245b = c0216p.f2857L;
                    int i30 = c0245b.f3188f;
                    C0216p c0216p2 = c0245b.f3183a;
                    c0245b.f3188f = (i17 - c0216p2.f2851F.f2659g) + i30;
                    c0216p.f2851F.k(i17);
                    if (i5 > 0) {
                        c0245b.d(false);
                        E0 e04 = c0216p2.f2851F;
                        if (e04.f2655c > 0) {
                            int i31 = e04.f2661i;
                            N n2 = c0245b.f3186d;
                            int i32 = n2.f2724b;
                            if ((i32 > 0 ? n2.f2723a[i32 - 1] : -2) != i31) {
                                if (!c0245b.f3185c && c0245b.f3187e) {
                                    c0245b.d(false);
                                    C0244a c0244a = c0245b.f3184b;
                                    c0244a.getClass();
                                    c0244a.f3182h.c0(H.l.f3205c);
                                    c0245b.f3185c = true;
                                }
                                if (i31 > 0) {
                                    C0190c a4 = e04.a(i31);
                                    n2.b(i31);
                                    c0245b.d(false);
                                    C0244a c0244a2 = c0245b.f3184b;
                                    c0244a2.getClass();
                                    H.k kVar = H.k.f3204c;
                                    H.D d4 = c0244a2.f3182h;
                                    d4.d0(kVar);
                                    j0.c.Q(d4, 0, a4);
                                    int i33 = d4.f3180n;
                                    int i34 = kVar.f3172a;
                                    int W3 = H.D.W(d4, i34);
                                    int i35 = kVar.f3173b;
                                    if (i33 != W3 || d4.f3181o != H.D.W(d4, i35)) {
                                        int i36 = 1;
                                        StringBuilder sb = new StringBuilder();
                                        int i37 = 0;
                                        int i38 = 0;
                                        while (i37 < i34) {
                                            if (((i36 << i37) & d4.f3180n) != 0) {
                                                if (i38 > 0) {
                                                    sb.append(", ");
                                                }
                                                sb.append(kVar.b(i37));
                                                i38++;
                                            }
                                            i37++;
                                            i36 = 1;
                                        }
                                        String sb2 = sb.toString();
                                        StringBuilder p5 = AbstractC0017m.p(sb2, "StringBuilder().apply(builderAction).toString()");
                                        int i39 = 0;
                                        int i40 = 0;
                                        while (i39 < i35) {
                                            int i41 = i35;
                                            if (((1 << i39) & d4.f3181o) != 0) {
                                                if (i38 > 0) {
                                                    p5.append(", ");
                                                }
                                                p5.append(kVar.c(i39));
                                                i40++;
                                            }
                                            i39++;
                                            i35 = i41;
                                        }
                                        String sb3 = p5.toString();
                                        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
                                        StringBuilder sb4 = new StringBuilder("Error while pushing ");
                                        sb4.append(kVar);
                                        sb4.append(". Not all arguments were provided. Missing ");
                                        AbstractC0017m.t(sb4, i38, " int arguments (", sb2, ") and ");
                                        AbstractC0017m.u(sb4, i40, " object arguments (", sb3, ").");
                                        throw null;
                                    }
                                    c0245b.f3185c = true;
                                }
                            }
                        }
                        C0244a c0244a3 = c0245b.f3184b;
                        c0244a3.getClass();
                        H.p pVar = H.p.f3213c;
                        H.D d5 = c0244a3.f3182h;
                        d5.d0(pVar);
                        j0.c.P(d5, 0, i5);
                        int i42 = d5.f3180n;
                        int i43 = pVar.f3172a;
                        int W4 = H.D.W(d5, i43);
                        int i44 = pVar.f3173b;
                        if (i42 != W4 || d5.f3181o != H.D.W(d5, i44)) {
                            StringBuilder sb5 = new StringBuilder();
                            int i45 = 0;
                            for (int i46 = 0; i46 < i43; i46++) {
                                if (((1 << i46) & d5.f3180n) != 0) {
                                    if (i45 > 0) {
                                        sb5.append(", ");
                                    }
                                    sb5.append(pVar.b(i46));
                                    i45++;
                                }
                            }
                            String sb6 = sb5.toString();
                            StringBuilder p6 = AbstractC0017m.p(sb6, "StringBuilder().apply(builderAction).toString()");
                            int i47 = 0;
                            int i48 = 0;
                            while (i47 < i44) {
                                int i49 = i44;
                                if (((1 << i47) & d5.f3181o) != 0) {
                                    if (i45 > 0) {
                                        p6.append(", ");
                                    }
                                    p6.append(pVar.c(i47));
                                    i48++;
                                }
                                i47++;
                                i44 = i49;
                            }
                            String sb7 = p6.toString();
                            Intrinsics.checkNotNullExpressionValue(sb7, "StringBuilder().apply(builderAction).toString()");
                            StringBuilder sb8 = new StringBuilder("Error while pushing ");
                            sb8.append(pVar);
                            sb8.append(". Not all arguments were provided. Missing ");
                            AbstractC0017m.t(sb8, i45, " int arguments (", sb6, ") and ");
                            AbstractC0017m.u(sb8, i48, " object arguments (", sb7, ").");
                            throw null;
                        }
                    }
                    c0216p = this;
                    c0216p.R(obj2, z4);
                }
                c0211m0 = null;
                c0216p.v(z4, c0211m0);
                return;
            }
            rotateLeft = i8 ^ Integer.rotateLeft(Integer.rotateLeft(c0216p.f2861P, 3) ^ i2, 3);
        }
        c0216p.f2861P = rotateLeft;
        if (obj4 == null) {
        }
        if (i4 == 0) {
        }
        if (!c0216p.f2860O) {
        }
    }

    public final void P() {
        O(-127, 0, null, null);
    }

    public final void Q(int i2, C0193d0 c0193d0) {
        O(i2, 0, c0193d0, null);
    }

    public final void R(Object obj, boolean z4) {
        if (z4) {
            E0 e02 = this.f2851F;
            if (e02.f2663k <= 0) {
                if (C0192d.m(e02.f2654b, e02.f2659g)) {
                    e02.n();
                    return;
                } else {
                    C0192d.S("Expected a node group");
                    throw null;
                }
            }
            return;
        }
        if (obj != null && this.f2851F.e() != obj) {
            C0245b c0245b = this.f2857L;
            c0245b.getClass();
            c0245b.d(false);
            C0244a c0244a = c0245b.f3184b;
            c0244a.getClass();
            H.y yVar = H.y.f3222c;
            H.D d4 = c0244a.f3182h;
            d4.d0(yVar);
            j0.c.Q(d4, 0, obj);
            int i2 = d4.f3180n;
            int i4 = yVar.f3172a;
            int W3 = H.D.W(d4, i4);
            int i5 = yVar.f3173b;
            if (i2 != W3 || d4.f3181o != H.D.W(d4, i5)) {
                StringBuilder sb = new StringBuilder();
                int i6 = 0;
                for (int i7 = 0; i7 < i4; i7++) {
                    if (((1 << i7) & d4.f3180n) != 0) {
                        if (i6 > 0) {
                            sb.append(", ");
                        }
                        sb.append(yVar.b(i7));
                        i6++;
                    }
                }
                String sb2 = sb.toString();
                StringBuilder p4 = AbstractC0017m.p(sb2, "StringBuilder().apply(builderAction).toString()");
                int i8 = 0;
                for (int i9 = 0; i9 < i5; i9++) {
                    if (((1 << i9) & d4.f3181o) != 0) {
                        if (i6 > 0) {
                            p4.append(", ");
                        }
                        p4.append(yVar.c(i9));
                        i8++;
                    }
                }
                String sb3 = p4.toString();
                Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
                StringBuilder sb4 = new StringBuilder("Error while pushing ");
                sb4.append(yVar);
                sb4.append(". Not all arguments were provided. Missing ");
                AbstractC0017m.t(sb4, i6, " int arguments (", sb2, ") and ");
                AbstractC0017m.u(sb4, i8, " object arguments (", sb3, ").");
                throw null;
            }
        }
        this.f2851F.n();
    }

    public final void S(int i2) {
        int i4;
        int i5;
        if (this.f2870i != null) {
            O(i2, 0, null, null);
            return;
        }
        if (this.f2878q) {
            C0192d.w("A call to createNode(), emitNode() or useNode() expected");
            throw null;
        }
        this.f2861P = this.f2873l ^ Integer.rotateLeft(Integer.rotateLeft(this.f2861P, 3) ^ i2, 3);
        this.f2873l++;
        E0 e02 = this.f2851F;
        boolean z4 = this.f2860O;
        W w4 = C0208l.f2826a;
        if (z4) {
            e02.f2663k++;
            this.f2853H.I(i2, w4, w4, false);
            v(false, null);
            return;
        }
        if (e02.f() == i2 && ((i5 = e02.f2659g) >= e02.f2660h || !C0192d.l(e02.f2654b, i5))) {
            e02.n();
            v(false, null);
            return;
        }
        if (e02.f2663k <= 0 && (i4 = e02.f2659g) != e02.f2660h) {
            int i6 = this.f2871j;
            F();
            this.f2857L.e(i6, e02.l());
            C0192d.q(this.f2879r, i4, e02.f2659g);
        }
        e02.f2663k++;
        this.f2860O = true;
        this.f2855J = null;
        if (this.f2853H.f2707w) {
            H0 w5 = this.f2852G.w();
            this.f2853H = w5;
            w5.D();
            this.f2854I = false;
            this.f2855J = null;
        }
        H0 h02 = this.f2853H;
        h02.d();
        int i7 = h02.f2704t;
        h02.I(i2, w4, w4, false);
        this.f2858M = h02.b(i7);
        v(false, null);
    }

    public final void T(int i2) {
        O(i2, 0, null, null);
    }

    public final C0216p U(int i2) {
        C0222s0 c0222s0;
        S(i2);
        boolean z4 = this.f2860O;
        C0225u c0225u = this.f2868g;
        W0 w02 = this.f2849D;
        if (z4) {
            C0222s0 c0222s02 = new C0222s0(c0225u);
            w02.f2781d.add(c0222s02);
            d0(c0222s02);
            c0222s02.f2904e = this.f2847A;
            c0222s02.f2900a &= -17;
        } else {
            ArrayList arrayList = this.f2879r;
            int E3 = C0192d.E(this.f2851F.f2661i, arrayList);
            O o4 = E3 >= 0 ? (O) arrayList.remove(E3) : null;
            Object h4 = this.f2851F.h();
            if (Intrinsics.a(h4, C0208l.f2826a)) {
                c0222s0 = new C0222s0(c0225u);
                d0(c0222s0);
            } else {
                Intrinsics.d(h4, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
                c0222s0 = (C0222s0) h4;
            }
            if (o4 == null) {
                int i4 = c0222s0.f2900a;
                boolean z5 = (i4 & 64) != 0;
                if (z5) {
                    c0222s0.f2900a = i4 & (-65);
                }
                if (!z5) {
                    c0222s0.f2900a &= -9;
                    w02.f2781d.add(c0222s0);
                    c0222s0.f2904e = this.f2847A;
                    c0222s0.f2900a &= -17;
                }
            }
            c0222s0.f2900a |= 8;
            w02.f2781d.add(c0222s0);
            c0222s0.f2904e = this.f2847A;
            c0222s0.f2900a &= -17;
        }
        return this;
    }

    public final void V(Object obj) {
        if (!this.f2860O && this.f2851F.f() == 207 && !Intrinsics.a(this.f2851F.e(), obj) && this.f2886y < 0) {
            this.f2886y = this.f2851F.f2659g;
            this.f2885x = true;
        }
        O(207, 0, null, obj);
    }

    public final void W() {
        O(125, 2, null, null);
        this.f2878q = true;
    }

    public final void X() {
        this.f2873l = 0;
        F0 f02 = this.f2864c;
        this.f2851F = f02.s();
        O(100, 0, null, null);
        r rVar = this.f2863b;
        rVar.m();
        this.f2881t = rVar.f();
        this.f2884w.b(this.f2883v ? 1 : 0);
        this.f2883v = f(this.f2881t);
        this.f2855J = null;
        if (!this.f2877p) {
            this.f2877p = rVar.d();
        }
        if (!this.B) {
            this.B = rVar.e();
        }
        Set set = (Set) C0192d.L(this.f2881t, R.b.f3941a);
        if (set != null) {
            set.add(f02);
            rVar.j(set);
        }
        O(rVar.g(), 0, null, null);
    }

    public final boolean Y(C0222s0 c0222s0, Object obj) {
        C0190c c0190c = c0222s0.f2902c;
        if (c0190c == null) {
            return false;
        }
        int e4 = this.f2851F.f2653a.e(c0190c);
        if (!this.f2850E || e4 < this.f2851F.f2659g) {
            return false;
        }
        ArrayList arrayList = this.f2879r;
        int E3 = C0192d.E(e4, arrayList);
        if (E3 < 0) {
            int i2 = -(E3 + 1);
            if (!(obj instanceof F)) {
                obj = null;
            }
            arrayList.add(i2, new O(c0222s0, e4, obj));
        } else {
            O o4 = (O) arrayList.get(E3);
            if (obj instanceof F) {
                Object obj2 = o4.f2729c;
                if (obj2 == null) {
                    o4.f2729c = obj;
                } else if (obj2 instanceof C0661B) {
                    ((C0661B) obj2).a(obj);
                } else {
                    int i4 = AbstractC0665F.f6892a;
                    C0661B c0661b = new C0661B(2);
                    c0661b.f6885b[c0661b.d(obj2)] = obj2;
                    c0661b.f6885b[c0661b.d(obj)] = obj;
                    o4.f2729c = c0661b;
                }
            } else {
                o4.f2729c = null;
            }
        }
        return true;
    }

    public final void Z(int i2, int i4) {
        if (e0(i2) != i4) {
            if (i2 < 0) {
                i.o oVar = this.f2876o;
                if (oVar == null) {
                    oVar = new i.o();
                    this.f2876o = oVar;
                }
                oVar.f(i2, i4);
                return;
            }
            int[] iArr = this.f2875n;
            if (iArr == null) {
                iArr = new int[this.f2851F.f2655c];
                C1436t.l(iArr, -1);
                this.f2875n = iArr;
            }
            iArr[i2] = i4;
        }
    }

    public final void a() {
        i();
        this.f2869h.f2781d.clear();
        this.f2874m.f2724b = 0;
        this.f2880s.f2724b = 0;
        this.f2884w.f2724b = 0;
        this.f2882u = null;
        C0246c c0246c = this.f2859N;
        c0246c.f3196i.X();
        c0246c.f3195h.X();
        this.f2861P = 0;
        this.f2887z = 0;
        this.f2878q = false;
        this.f2860O = false;
        this.f2885x = false;
        this.f2850E = false;
        this.f2886y = -1;
        E0 e02 = this.f2851F;
        if (!e02.f2658f) {
            e02.c();
        }
        if (this.f2853H.f2707w) {
            return;
        }
        w();
    }

    public final void a0(int i2, int i4) {
        int e02 = e0(i2);
        if (e02 != i4) {
            int i5 = i4 - e02;
            W0 w02 = this.f2869h;
            int size = w02.f2781d.size() - 1;
            while (i2 != -1) {
                int e03 = e0(i2) + i5;
                Z(i2, e03);
                int i6 = size;
                while (true) {
                    if (-1 < i6) {
                        C0211m0 c0211m0 = (C0211m0) w02.f2781d.get(i6);
                        if (c0211m0 != null && c0211m0.a(i2, e03)) {
                            size = i6 - 1;
                            break;
                        }
                        i6--;
                    } else {
                        break;
                    }
                }
                if (i2 < 0) {
                    i2 = this.f2851F.f2661i;
                } else if (C0192d.m(this.f2851F.f2654b, i2)) {
                    return;
                } else {
                    i2 = C0192d.p(this.f2851F.f2654b, i2);
                }
            }
        }
    }

    public final void b(Object obj, Function2 function2) {
        int i2 = 0;
        if (this.f2860O) {
            C0246c c0246c = this.f2859N;
            c0246c.getClass();
            H.z zVar = H.z.f3223c;
            H.D d4 = c0246c.f3195h;
            d4.d0(zVar);
            j0.c.Q(d4, 0, obj);
            Intrinsics.d(function2, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
            M2.J.d(2, function2);
            j0.c.Q(d4, 1, function2);
            int i4 = d4.f3180n;
            int i5 = zVar.f3172a;
            int W3 = H.D.W(d4, i5);
            int i6 = zVar.f3173b;
            if (i4 == W3 && d4.f3181o == H.D.W(d4, i6)) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            int i7 = 0;
            while (i7 < i5) {
                int i8 = i5;
                if (((1 << i7) & d4.f3180n) != 0) {
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    sb.append(zVar.b(i7));
                    i2++;
                }
                i7++;
                i5 = i8;
            }
            String sb2 = sb.toString();
            StringBuilder p4 = AbstractC0017m.p(sb2, "StringBuilder().apply(builderAction).toString()");
            int i9 = 0;
            int i10 = 0;
            while (i10 < i6) {
                int i11 = i6;
                if (((1 << i10) & d4.f3181o) != 0) {
                    if (i2 > 0) {
                        p4.append(", ");
                    }
                    p4.append(zVar.c(i10));
                    i9++;
                }
                i10++;
                i6 = i11;
            }
            String sb3 = p4.toString();
            Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb4 = new StringBuilder("Error while pushing ");
            sb4.append(zVar);
            sb4.append(". Not all arguments were provided. Missing ");
            AbstractC0017m.t(sb4, i2, " int arguments (", sb2, ") and ");
            AbstractC0017m.u(sb4, i9, " object arguments (", sb3, ").");
            throw null;
        }
        C0245b c0245b = this.f2857L;
        c0245b.b();
        C0244a c0244a = c0245b.f3184b;
        c0244a.getClass();
        H.z zVar2 = H.z.f3223c;
        H.D d5 = c0244a.f3182h;
        d5.d0(zVar2);
        int i12 = 0;
        j0.c.Q(d5, 0, obj);
        Intrinsics.d(function2, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
        M2.J.d(2, function2);
        j0.c.Q(d5, 1, function2);
        int i13 = d5.f3180n;
        int i14 = zVar2.f3172a;
        int W4 = H.D.W(d5, i14);
        int i15 = zVar2.f3173b;
        if (i13 == W4 && d5.f3181o == H.D.W(d5, i15)) {
            return;
        }
        StringBuilder sb5 = new StringBuilder();
        for (int i16 = 0; i16 < i14; i16++) {
            if (((1 << i16) & d5.f3180n) != 0) {
                if (i12 > 0) {
                    sb5.append(", ");
                }
                sb5.append(zVar2.b(i16));
                i12++;
            }
        }
        String sb6 = sb5.toString();
        StringBuilder p5 = AbstractC0017m.p(sb6, "StringBuilder().apply(builderAction).toString()");
        int i17 = 0;
        int i18 = 0;
        while (i17 < i15) {
            int i19 = i15;
            if (((1 << i17) & d5.f3181o) != 0) {
                if (i12 > 0) {
                    p5.append(", ");
                }
                p5.append(zVar2.c(i17));
                i18++;
            }
            i17++;
            i15 = i19;
        }
        String sb7 = p5.toString();
        Intrinsics.checkNotNullExpressionValue(sb7, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb8 = new StringBuilder("Error while pushing ");
        sb8.append(zVar2);
        sb8.append(". Not all arguments were provided. Missing ");
        AbstractC0017m.t(sb8, i12, " int arguments (", sb6, ") and ");
        AbstractC0017m.u(sb8, i18, " object arguments (", sb7, ").");
        throw null;
    }

    public final O.d b0(InterfaceC0213n0 interfaceC0213n0, O.d dVar) {
        O.d dVar2 = (O.d) interfaceC0213n0;
        dVar2.getClass();
        O.c cVar = new O.c(dVar2);
        cVar.f3625m = dVar2;
        cVar.putAll(dVar);
        O.d j4 = cVar.j();
        Q(204, C0192d.f2795d);
        B();
        d0(j4);
        B();
        d0(dVar);
        q(false);
        return j4;
    }

    public final boolean c(float f4) {
        Object B = B();
        if ((B instanceof Float) && f4 == ((Number) B).floatValue()) {
            return false;
        }
        d0(Float.valueOf(f4));
        return true;
    }

    public final void c0(Object obj) {
        int i2;
        E0 e02;
        int i4;
        H0 h02;
        if (obj instanceof A0) {
            C0190c c0190c = null;
            if (this.f2860O) {
                C0244a c0244a = this.f2857L.f3184b;
                c0244a.getClass();
                H.r rVar = H.r.f3215c;
                H.D d4 = c0244a.f3182h;
                d4.d0(rVar);
                j0.c.Q(d4, 0, (A0) obj);
                int i5 = d4.f3180n;
                int i6 = rVar.f3172a;
                int W3 = H.D.W(d4, i6);
                int i7 = rVar.f3173b;
                if (i5 != W3 || d4.f3181o != H.D.W(d4, i7)) {
                    StringBuilder sb = new StringBuilder();
                    int i8 = 0;
                    for (int i9 = 0; i9 < i6; i9++) {
                        if (((1 << i9) & d4.f3180n) != 0) {
                            if (i8 > 0) {
                                sb.append(", ");
                            }
                            sb.append(rVar.b(i9));
                            i8++;
                        }
                    }
                    String sb2 = sb.toString();
                    StringBuilder p4 = AbstractC0017m.p(sb2, "StringBuilder().apply(builderAction).toString()");
                    int i10 = 0;
                    for (int i11 = 0; i11 < i7; i11++) {
                        if (((1 << i11) & d4.f3181o) != 0) {
                            if (i8 > 0) {
                                p4.append(", ");
                            }
                            p4.append(rVar.c(i11));
                            i10++;
                        }
                    }
                    String sb3 = p4.toString();
                    Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
                    StringBuilder sb4 = new StringBuilder("Error while pushing ");
                    sb4.append(rVar);
                    sb4.append(". Not all arguments were provided. Missing ");
                    AbstractC0017m.t(sb4, i8, " int arguments (", sb2, ") and ");
                    AbstractC0017m.u(sb4, i10, " object arguments (", sb3, ").");
                    throw null;
                }
            }
            this.f2865d.add(obj);
            A0 a02 = (A0) obj;
            if (this.f2860O) {
                H0 h03 = this.f2853H;
                int i12 = h03.f2704t;
                if (i12 > h03.f2706v + 1) {
                    int i13 = i12 - 1;
                    int x2 = h03.x(h03.f2686b, i13);
                    while (true) {
                        i4 = i13;
                        i13 = x2;
                        h02 = this.f2853H;
                        if (i13 == h02.f2706v || i13 < 0) {
                            break;
                        } else {
                            x2 = h02.x(h02.f2686b, i13);
                        }
                    }
                    c0190c = h02.b(i4);
                }
            } else {
                E0 e03 = this.f2851F;
                int i14 = e03.f2659g;
                if (i14 > e03.f2661i + 1) {
                    int i15 = i14 - 1;
                    int i16 = e03.f2654b[(i15 * 5) + 2];
                    while (true) {
                        i2 = i15;
                        i15 = i16;
                        e02 = this.f2851F;
                        if (i15 == e02.f2661i || i15 < 0) {
                            break;
                        } else {
                            i16 = e02.f2654b[(i15 * 5) + 2];
                        }
                    }
                    c0190c = e02.a(i2);
                }
            }
            B0 b02 = new B0();
            b02.f2637a = a02;
            b02.f2638b = c0190c;
            obj = b02;
        }
        d0(obj);
    }

    public final boolean d(int i2) {
        Object B = B();
        if ((B instanceof Integer) && i2 == ((Number) B).intValue()) {
            return false;
        }
        d0(Integer.valueOf(i2));
        return true;
    }

    public final void d0(Object obj) {
        int i2;
        int i4;
        if (this.f2860O) {
            H0 h02 = this.f2853H;
            if (h02.f2698n <= 0 || h02.f2693i == h02.f2695k) {
                h02.y(obj);
                return;
            }
            i.q qVar = h02.f2703s;
            if (qVar == null) {
                qVar = new i.q();
            }
            h02.f2703s = qVar;
            int i5 = h02.f2706v;
            Object f4 = qVar.f(i5);
            if (f4 == null) {
                f4 = new i.w();
                qVar.i(i5, f4);
            }
            ((i.w) f4).a(obj);
            return;
        }
        E0 e02 = this.f2851F;
        boolean z4 = e02.f2666n;
        int i6 = 1;
        C0245b c0245b = this.f2857L;
        if (!z4) {
            C0190c a4 = e02.a(e02.f2661i);
            C0244a c0244a = c0245b.f3184b;
            c0244a.getClass();
            H.e eVar = H.e.f3198c;
            H.D d4 = c0244a.f3182h;
            d4.d0(eVar);
            int i7 = 0;
            j0.c.Q(d4, 0, a4);
            j0.c.Q(d4, 1, obj);
            int i8 = d4.f3180n;
            int i9 = eVar.f3172a;
            int W3 = H.D.W(d4, i9);
            int i10 = eVar.f3173b;
            if (i8 == W3 && d4.f3181o == H.D.W(d4, i10)) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            int i11 = 0;
            while (i11 < i9) {
                if (((i6 << i11) & d4.f3180n) != 0) {
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
            StringBuilder p4 = AbstractC0017m.p(sb2, "StringBuilder().apply(builderAction).toString()");
            int i12 = 0;
            int i13 = 0;
            while (i12 < i10) {
                int i14 = i10;
                if (((1 << i12) & d4.f3181o) != 0) {
                    if (i7 > 0) {
                        p4.append(", ");
                    }
                    p4.append(eVar.c(i12));
                    i13++;
                }
                i12++;
                i10 = i14;
            }
            String sb3 = p4.toString();
            Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb4 = new StringBuilder("Error while pushing ");
            sb4.append(eVar);
            sb4.append(". Not all arguments were provided. Missing ");
            AbstractC0017m.t(sb4, i7, " int arguments (", sb2, ") and ");
            AbstractC0017m.u(sb4, i13, " object arguments (", sb3, ").");
            throw null;
        }
        int r2 = (e02.f2664l - C0192d.r(e02.f2654b, e02.f2661i)) - 1;
        if (c0245b.f3183a.f2851F.f2661i - c0245b.f3188f >= 0) {
            c0245b.d(true);
            C0244a c0244a2 = c0245b.f3184b;
            H.m mVar = H.m.f3209g;
            H.D d5 = c0244a2.f3182h;
            d5.d0(mVar);
            j0.c.Q(d5, 0, obj);
            j0.c.P(d5, 0, r2);
            if (d5.f3180n == H.D.W(d5, 1) && d5.f3181o == H.D.W(d5, 1)) {
                return;
            }
            StringBuilder sb5 = new StringBuilder();
            if ((d5.f3180n & 1) != 0) {
                sb5.append(mVar.b(0));
                i2 = 1;
            } else {
                i2 = 0;
            }
            String sb6 = sb5.toString();
            StringBuilder p5 = AbstractC0017m.p(sb6, "StringBuilder().apply(builderAction).toString()");
            if ((d5.f3181o & 1) != 0) {
                if (i2 > 0) {
                    p5.append(", ");
                }
                p5.append(mVar.c(0));
            } else {
                i6 = 0;
            }
            String sb7 = p5.toString();
            Intrinsics.checkNotNullExpressionValue(sb7, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb8 = new StringBuilder("Error while pushing ");
            sb8.append(mVar);
            sb8.append(". Not all arguments were provided. Missing ");
            AbstractC0017m.t(sb8, i2, " int arguments (", sb6, ") and ");
            AbstractC0017m.u(sb8, i6, " object arguments (", sb7, ").");
            throw null;
        }
        E0 e03 = this.f2851F;
        C0190c a5 = e03.a(e03.f2661i);
        C0244a c0244a3 = c0245b.f3184b;
        H.m mVar2 = H.m.f3208f;
        H.D d6 = c0244a3.f3182h;
        d6.d0(mVar2);
        j0.c.Q(d6, 0, obj);
        j0.c.Q(d6, 1, a5);
        j0.c.P(d6, 0, r2);
        if (d6.f3180n == H.D.W(d6, 1) && d6.f3181o == H.D.W(d6, 2)) {
            return;
        }
        StringBuilder sb9 = new StringBuilder();
        if ((d6.f3180n & 1) != 0) {
            sb9.append(mVar2.b(0));
            i4 = 1;
        } else {
            i4 = 0;
        }
        String sb10 = sb9.toString();
        StringBuilder p6 = AbstractC0017m.p(sb10, "StringBuilder().apply(builderAction).toString()");
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 2; i15 < i17; i17 = 2) {
            if (((1 << i15) & d6.f3181o) != 0) {
                if (i4 > 0) {
                    p6.append(", ");
                }
                p6.append(mVar2.c(i15));
                i16++;
            }
            i15++;
        }
        String sb11 = p6.toString();
        Intrinsics.checkNotNullExpressionValue(sb11, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb12 = new StringBuilder("Error while pushing ");
        sb12.append(mVar2);
        sb12.append(". Not all arguments were provided. Missing ");
        AbstractC0017m.t(sb12, i4, " int arguments (", sb10, ") and ");
        AbstractC0017m.u(sb12, i16, " object arguments (", sb11, ").");
        throw null;
    }

    public final boolean e(long j4) {
        Object B = B();
        if ((B instanceof Long) && j4 == ((Number) B).longValue()) {
            return false;
        }
        d0(Long.valueOf(j4));
        return true;
    }

    public final int e0(int i2) {
        int i4;
        if (i2 >= 0) {
            int[] iArr = this.f2875n;
            return (iArr == null || (i4 = iArr[i2]) < 0) ? C0192d.o(this.f2851F.f2654b, i2) : i4;
        }
        i.o oVar = this.f2876o;
        if (oVar == null || oVar.c(i2) < 0) {
            return 0;
        }
        return oVar.d(i2);
    }

    public final boolean f(Object obj) {
        if (Intrinsics.a(B(), obj)) {
            return false;
        }
        d0(obj);
        return true;
    }

    public final void f0() {
        if (!this.f2878q) {
            C0192d.w("A call to createNode(), emitNode() or useNode() expected was not expected");
            throw null;
        }
        this.f2878q = false;
        if (this.f2860O) {
            C0192d.w("useNode() called while inserting");
            throw null;
        }
        E0 e02 = this.f2851F;
        Object i2 = e02.i(e02.f2661i);
        C0245b c0245b = this.f2857L;
        c0245b.c();
        c0245b.f3190h.f2781d.add(i2);
        if (this.f2885x && (i2 instanceof InterfaceC0204j)) {
            c0245b.b();
            C0244a c0244a = c0245b.f3184b;
            c0244a.getClass();
            if (i2 instanceof InterfaceC0204j) {
                c0244a.f3182h.c0(H.B.f3171c);
            }
        }
    }

    public final boolean g(boolean z4) {
        Object B = B();
        if ((B instanceof Boolean) && z4 == ((Boolean) B).booleanValue()) {
            return false;
        }
        d0(Boolean.valueOf(z4));
        return true;
    }

    public final boolean h(Object obj) {
        if (B() == obj) {
            return false;
        }
        d0(obj);
        return true;
    }

    public final void i() {
        this.f2870i = null;
        this.f2871j = 0;
        this.f2872k = 0;
        this.f2861P = 0;
        this.f2878q = false;
        C0245b c0245b = this.f2857L;
        c0245b.f3185c = false;
        c0245b.f3186d.f2724b = 0;
        c0245b.f3188f = 0;
        this.f2849D.f2781d.clear();
        this.f2875n = null;
        this.f2876o = null;
    }

    public final int j(int i2, int i4, int i5, int i6) {
        int i7;
        Object b4;
        if (i2 == i5) {
            return i6;
        }
        E0 e02 = this.f2851F;
        boolean l4 = C0192d.l(e02.f2654b, i2);
        int[] iArr = e02.f2654b;
        if (l4) {
            Object j4 = e02.j(iArr, i2);
            i7 = j4 != null ? j4 instanceof Enum ? ((Enum) j4).ordinal() : j4.hashCode() : 0;
        } else {
            int i8 = iArr[i2 * 5];
            if (i8 == 207 && (b4 = e02.b(iArr, i2)) != null && !b4.equals(C0208l.f2826a)) {
                i8 = b4.hashCode();
            }
            i7 = i8;
        }
        if (i7 == 126665345) {
            return i7;
        }
        int i9 = this.f2851F.f2654b[(i2 * 5) + 2];
        if (i9 != i5) {
            i6 = j(i9, C(i9), i5, i6);
        }
        if (C0192d.l(this.f2851F.f2654b, i2)) {
            i4 = 0;
        }
        return Integer.rotateLeft(Integer.rotateLeft(i6, 3) ^ i7, 3) ^ i4;
    }

    public final Object k(AbstractC0217p0 abstractC0217p0) {
        return C0192d.L(m(), abstractC0217p0);
    }

    public final void l(Function0 function0) {
        int i2;
        int i4;
        int i5;
        if (!this.f2878q) {
            C0192d.w("A call to createNode(), emitNode() or useNode() expected was not expected");
            throw null;
        }
        this.f2878q = false;
        if (!this.f2860O) {
            C0192d.w("createNode() can only be called when inserting");
            throw null;
        }
        N n2 = this.f2874m;
        int i6 = n2.f2723a[n2.f2724b - 1];
        H0 h02 = this.f2853H;
        C0190c b4 = h02.b(h02.f2706v);
        this.f2872k++;
        C0246c c0246c = this.f2859N;
        H.m mVar = H.m.f3206d;
        H.D d4 = c0246c.f3195h;
        d4.d0(mVar);
        j0.c.Q(d4, 0, function0);
        j0.c.P(d4, 0, i6);
        j0.c.Q(d4, 1, b4);
        if (!(d4.f3180n == H.D.W(d4, 1) && d4.f3181o == H.D.W(d4, 2))) {
            StringBuilder sb = new StringBuilder();
            if ((d4.f3180n & 1) != 0) {
                sb.append(mVar.b(0));
                i5 = 1;
            } else {
                i5 = 0;
            }
            String sb2 = sb.toString();
            StringBuilder p4 = AbstractC0017m.p(sb2, "StringBuilder().apply(builderAction).toString()");
            int i7 = 0;
            for (int i8 = 0; i8 < 2; i8++) {
                if (((1 << i8) & d4.f3181o) != 0) {
                    if (i5 > 0) {
                        p4.append(", ");
                    }
                    p4.append(mVar.c(i8));
                    i7++;
                }
            }
            String sb3 = p4.toString();
            Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb4 = new StringBuilder("Error while pushing ");
            sb4.append(mVar);
            sb4.append(". Not all arguments were provided. Missing ");
            AbstractC0017m.t(sb4, i5, " int arguments (", sb2, ") and ");
            AbstractC0017m.u(sb4, i7, " object arguments (", sb3, ").");
            throw null;
        }
        H.m mVar2 = H.m.f3207e;
        H.D d5 = c0246c.f3196i;
        d5.d0(mVar2);
        j0.c.P(d5, 0, i6);
        j0.c.Q(d5, 0, b4);
        if (d5.f3180n == H.D.W(d5, 1) && d5.f3181o == H.D.W(d5, 1)) {
            return;
        }
        StringBuilder sb5 = new StringBuilder();
        if ((d5.f3180n & 1) != 0) {
            sb5.append(mVar2.b(0));
            i2 = 1;
        } else {
            i2 = 0;
        }
        String sb6 = sb5.toString();
        StringBuilder p5 = AbstractC0017m.p(sb6, "StringBuilder().apply(builderAction).toString()");
        if ((d5.f3181o & 1) != 0) {
            if (i2 > 0) {
                p5.append(", ");
            }
            p5.append(mVar2.c(0));
            i4 = 1;
        } else {
            i4 = 0;
        }
        String sb7 = p5.toString();
        Intrinsics.checkNotNullExpressionValue(sb7, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb8 = new StringBuilder("Error while pushing ");
        sb8.append(mVar2);
        sb8.append(". Not all arguments were provided. Missing ");
        AbstractC0017m.t(sb8, i2, " int arguments (", sb6, ") and ");
        AbstractC0017m.u(sb8, i4, " object arguments (", sb7, ").");
        throw null;
    }

    public final InterfaceC0213n0 m() {
        InterfaceC0213n0 interfaceC0213n0;
        InterfaceC0213n0 interfaceC0213n02;
        Object obj;
        Object obj2;
        InterfaceC0213n0 interfaceC0213n03 = this.f2855J;
        if (interfaceC0213n03 != null) {
            return interfaceC0213n03;
        }
        int i2 = this.f2851F.f2661i;
        boolean z4 = this.f2860O;
        C0193d0 c0193d0 = C0192d.f2794c;
        if (z4 && this.f2854I) {
            int i4 = this.f2853H.f2706v;
            while (i4 > 0) {
                H0 h02 = this.f2853H;
                if (h02.f2686b[h02.p(i4) * 5] == 202) {
                    H0 h03 = this.f2853H;
                    int p4 = h03.p(i4);
                    if (C0192d.l(h03.f2686b, p4)) {
                        Object[] objArr = h03.f2687c;
                        int[] iArr = h03.f2686b;
                        int i5 = p4 * 5;
                        obj = objArr[C0192d.y(iArr[i5 + 1] >> 30) + iArr[i5 + 4]];
                    } else {
                        obj = null;
                    }
                    if (Intrinsics.a(obj, c0193d0)) {
                        H0 h04 = this.f2853H;
                        int p5 = h04.p(i4);
                        if (C0192d.k(h04.f2686b, p5)) {
                            Object[] objArr2 = h04.f2687c;
                            int[] iArr2 = h04.f2686b;
                            obj2 = objArr2[C0192d.y(iArr2[(p5 * 5) + 1] >> 29) + h04.f(iArr2, p5)];
                        } else {
                            obj2 = C0208l.f2826a;
                        }
                        Intrinsics.d(obj2, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                        InterfaceC0213n0 interfaceC0213n04 = (InterfaceC0213n0) obj2;
                        this.f2855J = interfaceC0213n04;
                        return interfaceC0213n04;
                    }
                }
                H0 h05 = this.f2853H;
                i4 = h05.x(h05.f2686b, i4);
            }
        }
        if (this.f2851F.f2655c > 0) {
            while (i2 > 0) {
                E0 e02 = this.f2851F;
                int i6 = i2 * 5;
                int[] iArr3 = e02.f2654b;
                if (iArr3[i6] == 202 && Intrinsics.a(e02.j(iArr3, i2), c0193d0)) {
                    C1294c c1294c = this.f2882u;
                    if (c1294c == null || (interfaceC0213n02 = (InterfaceC0213n0) ((SparseArray) c1294c.f11388d).get(i2)) == null) {
                        E0 e03 = this.f2851F;
                        Object b4 = e03.b(e03.f2654b, i2);
                        Intrinsics.d(b4, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                        interfaceC0213n0 = (InterfaceC0213n0) b4;
                    } else {
                        interfaceC0213n0 = interfaceC0213n02;
                    }
                    this.f2855J = interfaceC0213n0;
                    return interfaceC0213n0;
                }
                i2 = this.f2851F.f2654b[i6 + 2];
            }
        }
        InterfaceC0213n0 interfaceC0213n05 = this.f2881t;
        this.f2855J = interfaceC0213n05;
        return interfaceC0213n05;
    }

    public final void n(boolean z4) {
        if (!(this.f2872k == 0)) {
            C0192d.w("No nodes can be emitted before calling dactivateToEndGroup");
            throw null;
        }
        if (this.f2860O) {
            return;
        }
        if (!z4) {
            M();
            return;
        }
        E0 e02 = this.f2851F;
        int i2 = e02.f2659g;
        int i4 = e02.f2660h;
        C0245b c0245b = this.f2857L;
        c0245b.getClass();
        c0245b.d(false);
        C0244a c0244a = c0245b.f3184b;
        c0244a.getClass();
        c0244a.f3182h.c0(H.f.f3199c);
        C0192d.q(this.f2879r, i2, i4);
        this.f2851F.m();
    }

    public final void o(C1294c c1294c, O.a aVar) {
        int i2;
        int i4;
        if (this.f2850E) {
            C0192d.w("Reentrant composition is not supported");
            throw null;
        }
        Trace.beginSection("Compose:recompose");
        try {
            this.f2847A = Q.q.k().d();
            this.f2882u = null;
            i.y yVar = (i.y) c1294c.f11388d;
            Object[] objArr = yVar.f6983b;
            Object[] objArr2 = yVar.f6984c;
            long[] jArr = yVar.f6982a;
            int length = jArr.length - 2;
            ArrayList arrayList = this.f2879r;
            if (length >= 0) {
                int i5 = 0;
                while (true) {
                    long j4 = jArr[i5];
                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i6 = 8;
                        int i7 = 8 - ((~(i5 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((j4 & 255) < 128) {
                                int i9 = (i5 << 3) + i8;
                                Object obj = objArr[i9];
                                Object obj2 = objArr2[i9];
                                Intrinsics.d(obj, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
                                C0190c c0190c = ((C0222s0) obj).f2902c;
                                if (c0190c != null) {
                                    int i10 = c0190c.f2791a;
                                    C0222s0 c0222s0 = (C0222s0) obj;
                                    if (obj2 == W.f2778k) {
                                        obj2 = null;
                                    }
                                    arrayList.add(new O(c0222s0, i10, obj2));
                                }
                                i4 = 8;
                            } else {
                                i4 = i6;
                            }
                            j4 >>= i4;
                            i8++;
                            i6 = i4;
                        }
                        i2 = 1;
                        if (i7 != i6) {
                            break;
                        }
                    } else {
                        i2 = 1;
                    }
                    if (i5 == length) {
                        break;
                    } else {
                        i5 += i2;
                    }
                }
            }
            C1399C.i(arrayList, C0192d.f2797f);
            this.f2871j = 0;
            this.f2850E = true;
            try {
                X();
                Object B = B();
                if (B != aVar && aVar != null) {
                    d0(aVar);
                }
                C0214o c0214o = this.f2848C;
                I.d C3 = C0192d.C();
                try {
                    C3.b(c0214o);
                    C0193d0 c0193d0 = C0192d.f2792a;
                    if (aVar != null) {
                        Q(200, c0193d0);
                        C0192d.G(this, aVar);
                        q(false);
                    } else if (!this.f2883v || B == null || B.equals(C0208l.f2826a)) {
                        L();
                    } else {
                        Q(200, c0193d0);
                        M2.J.d(2, B);
                        C0192d.G(this, (Function2) B);
                        q(false);
                    }
                    C3.n(C3.f3332i - 1);
                    u();
                    this.f2850E = false;
                    arrayList.clear();
                    C0192d.P(this.f2853H.f2707w);
                    w();
                    Unit unit = Unit.f7487a;
                    Trace.endSection();
                } finally {
                    C3.n(C3.f3332i - 1);
                }
            } catch (Throwable th) {
                this.f2850E = false;
                arrayList.clear();
                a();
                C0192d.P(this.f2853H.f2707w);
                w();
                throw th;
            }
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public final void p(int i2, int i4) {
        if (i2 <= 0 || i2 == i4) {
            return;
        }
        p(this.f2851F.f2654b[(i2 * 5) + 2], i4);
        if (C0192d.m(this.f2851F.f2654b, i2)) {
            Object i5 = this.f2851F.i(i2);
            C0245b c0245b = this.f2857L;
            c0245b.c();
            c0245b.f3190h.f2781d.add(i5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:155:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0624  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x064f  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0847  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q(boolean z4) {
        int hashCode;
        N n2;
        int i2;
        ArrayList arrayList;
        C0245b c0245b;
        int i4;
        E0 e02;
        boolean z5;
        boolean z6;
        C0216p c0216p;
        int i5;
        C0211m0 c0211m0;
        String str;
        String str2;
        int i6;
        int i7;
        int i8;
        F0 f02;
        C0246c c0246c;
        C0216p c0216p2;
        H.n nVar;
        int i9;
        int i10;
        int W3;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        char c4;
        N n4;
        int i18;
        LinkedHashSet linkedHashSet;
        ArrayList arrayList2;
        int i19;
        i.q qVar;
        C0245b c0245b2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        int i20;
        C0211m0 c0211m02;
        int i21;
        i.q qVar2;
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
        C0216p c0216p3 = this;
        N n5 = c0216p3.f2874m;
        int i23 = n5.f2723a[n5.f2724b - 2] - 1;
        boolean z7 = c0216p3.f2860O;
        W w4 = C0208l.f2826a;
        if (z7) {
            H0 h02 = c0216p3.f2853H;
            int i24 = h02.f2706v;
            int i25 = h02.f2686b[h02.p(i24) * 5];
            H0 h03 = c0216p3.f2853H;
            int p4 = h03.p(i24);
            if (C0192d.l(h03.f2686b, p4)) {
                Object[] objArr5 = h03.f2687c;
                int[] iArr = h03.f2686b;
                int i26 = p4 * 5;
                obj = objArr5[C0192d.y(iArr[i26 + 1] >> 30) + iArr[i26 + 4]];
            } else {
                obj = null;
            }
            H0 h04 = c0216p3.f2853H;
            int p5 = h04.p(i24);
            if (C0192d.k(h04.f2686b, p5)) {
                Object[] objArr6 = h04.f2687c;
                int[] iArr2 = h04.f2686b;
                obj2 = objArr6[C0192d.y(iArr2[(p5 * 5) + 1] >> 29) + h04.f(iArr2, p5)];
            } else {
                obj2 = w4;
            }
            if (obj != null) {
                hashCode2 = Integer.hashCode(obj instanceof Enum ? ((Enum) obj).ordinal() : obj.hashCode()) ^ Integer.rotateRight(c0216p3.f2861P, 3);
            } else if (obj2 == null || i25 != 207 || obj2.equals(w4)) {
                hashCode2 = Integer.rotateRight(i23 ^ c0216p3.f2861P, 3) ^ Integer.hashCode(i25);
            } else {
                c0216p3.f2861P = Integer.rotateRight(Integer.rotateRight(i23 ^ c0216p3.f2861P, 3) ^ Integer.hashCode(obj2.hashCode()), 3);
            }
            c0216p3.f2861P = Integer.rotateRight(hashCode2, 3);
        } else {
            E0 e03 = c0216p3.f2851F;
            int i27 = e03.f2661i;
            int[] iArr3 = e03.f2654b;
            int i28 = iArr3[i27 * 5];
            Object j4 = e03.j(iArr3, i27);
            E0 e04 = c0216p3.f2851F;
            Object b4 = e04.b(e04.f2654b, i27);
            if (j4 != null) {
                hashCode = Integer.hashCode(j4 instanceof Enum ? ((Enum) j4).ordinal() : j4.hashCode()) ^ Integer.rotateRight(c0216p3.f2861P, 3);
            } else if (b4 == null || i28 != 207 || b4.equals(w4)) {
                hashCode = Integer.rotateRight(i23 ^ c0216p3.f2861P, 3) ^ Integer.hashCode(i28);
            } else {
                c0216p3.f2861P = Integer.rotateRight(Integer.rotateRight(i23 ^ c0216p3.f2861P, 3) ^ Integer.hashCode(b4.hashCode()), 3);
            }
            c0216p3.f2861P = Integer.rotateRight(hashCode, 3);
        }
        int i29 = c0216p3.f2872k;
        C0211m0 c0211m03 = c0216p3.f2870i;
        ArrayList arrayList5 = c0216p3.f2879r;
        C0245b c0245b3 = c0216p3.f2857L;
        if (c0211m03 != null) {
            ArrayList arrayList6 = c0211m03.f2830a;
            if (arrayList6.size() > 0) {
                ArrayList arrayList7 = c0211m03.f2833d;
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
                    Q q2 = (Q) arrayList6.get(i32);
                    boolean contains = hashSet.contains(q2);
                    i.q qVar3 = c0211m03.f2834e;
                    HashSet hashSet2 = hashSet;
                    int i34 = c0211m03.f2831b;
                    if (contains) {
                        i17 = size3;
                        c4 = 3;
                        if (!linkedHashSet2.contains(q2)) {
                            if (i31 < size2) {
                                Q q4 = (Q) arrayList7.get(i31);
                                if (q4 != q2) {
                                    K k4 = (K) qVar3.f(q4.f2742c);
                                    int i35 = k4 != null ? k4.f2713b : -1;
                                    linkedHashSet2.add(q4);
                                    linkedHashSet = linkedHashSet2;
                                    i20 = i33;
                                    if (i35 != i20) {
                                        c0211m02 = c0211m03;
                                        K k5 = (K) qVar3.f(q4.f2742c);
                                        int i36 = k5 != null ? k5.f2714c : q4.f2743d;
                                        i19 = size2;
                                        int i37 = i35 + i34;
                                        int i38 = i34 + i20;
                                        if (i36 > 0) {
                                            arrayList4 = arrayList7;
                                            int i39 = c0245b3.f3194l;
                                            if (i39 > 0) {
                                                arrayList2 = arrayList5;
                                                n4 = n5;
                                                if (c0245b3.f3192j == i37 - i39 && c0245b3.f3193k == i38 - i39) {
                                                    c0245b3.f3194l = i39 + i36;
                                                }
                                            } else {
                                                n4 = n5;
                                                arrayList2 = arrayList5;
                                            }
                                            c0245b3.c();
                                            c0245b3.f3192j = i37;
                                            c0245b3.f3193k = i38;
                                            c0245b3.f3194l = i36;
                                        } else {
                                            n4 = n5;
                                            arrayList2 = arrayList5;
                                            arrayList4 = arrayList7;
                                            c0245b3.getClass();
                                        }
                                        char c5 = 7;
                                        if (i35 > i20) {
                                            Object[] objArr7 = qVar3.f6942c;
                                            long[] jArr5 = qVar3.f6940a;
                                            int length = jArr5.length - 2;
                                            if (length >= 0) {
                                                c0245b2 = c0245b3;
                                                arrayList3 = arrayList6;
                                                int i40 = 0;
                                                while (true) {
                                                    long j5 = jArr5[i40];
                                                    i21 = i32;
                                                    qVar2 = qVar3;
                                                    if ((((~j5) << c5) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i41 = 8 - ((~(i40 - length)) >>> 31);
                                                        int i42 = 0;
                                                        while (i42 < i41) {
                                                            if ((j5 & 255) < 128) {
                                                                K k6 = (K) objArr7[(i40 << 3) + i42];
                                                                objArr4 = objArr7;
                                                                int i43 = k6.f2713b;
                                                                jArr4 = jArr5;
                                                                if (i35 <= i43 && i43 < i35 + i36) {
                                                                    k6.f2713b = (i43 - i35) + i20;
                                                                } else if (i20 <= i43 && i43 < i35) {
                                                                    k6.f2713b = i43 + i36;
                                                                }
                                                            } else {
                                                                objArr4 = objArr7;
                                                                jArr4 = jArr5;
                                                            }
                                                            j5 >>= 8;
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
                                                    qVar3 = qVar2;
                                                    i32 = i21;
                                                    objArr7 = objArr3;
                                                    jArr5 = jArr3;
                                                    c5 = 7;
                                                }
                                            } else {
                                                i21 = i32;
                                                qVar2 = qVar3;
                                                c0245b2 = c0245b3;
                                                arrayList3 = arrayList6;
                                            }
                                        } else {
                                            i21 = i32;
                                            qVar2 = qVar3;
                                            c0245b2 = c0245b3;
                                            arrayList3 = arrayList6;
                                            if (i20 > i35) {
                                                qVar = qVar2;
                                                Object[] objArr8 = qVar.f6942c;
                                                long[] jArr6 = qVar.f6940a;
                                                int length2 = jArr6.length - 2;
                                                if (length2 >= 0) {
                                                    int i44 = 0;
                                                    while (true) {
                                                        long j6 = jArr6[i44];
                                                        if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                            int i45 = 8 - ((~(i44 - length2)) >>> 31);
                                                            int i46 = 0;
                                                            while (i46 < i45) {
                                                                if ((j6 & 255) < 128) {
                                                                    objArr2 = objArr8;
                                                                    K k7 = (K) objArr8[(i44 << 3) + i46];
                                                                    jArr2 = jArr6;
                                                                    int i47 = k7.f2713b;
                                                                    i22 = i29;
                                                                    if (i35 <= i47 && i47 < i35 + i36) {
                                                                        k7.f2713b = (i47 - i35) + i20;
                                                                    } else if (i35 + 1 <= i47 && i47 < i20) {
                                                                        k7.f2713b = i47 - i36;
                                                                    }
                                                                } else {
                                                                    i22 = i29;
                                                                    objArr2 = objArr8;
                                                                    jArr2 = jArr6;
                                                                }
                                                                j6 >>= 8;
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
                                        qVar = qVar2;
                                    } else {
                                        n4 = n5;
                                        i18 = i29;
                                        c0211m02 = c0211m03;
                                        arrayList2 = arrayList5;
                                        i19 = size2;
                                        i21 = i32;
                                        qVar = qVar3;
                                        c0245b2 = c0245b3;
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
                                    qVar = qVar3;
                                    c0245b2 = c0245b3;
                                    arrayList3 = arrayList6;
                                    arrayList4 = arrayList7;
                                    i20 = i33;
                                    c0211m02 = c0211m03;
                                    i32++;
                                }
                                i31++;
                                K k8 = (K) qVar.f(q4.f2742c);
                                int i48 = (k8 != null ? k8.f2714c : q4.f2743d) + i20;
                                c0211m03 = c0211m02;
                                size3 = i17;
                                linkedHashSet2 = linkedHashSet;
                                hashSet = hashSet2;
                                size2 = i19;
                                arrayList7 = arrayList4;
                                arrayList5 = arrayList2;
                                c0245b3 = c0245b2;
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
                        K k9 = (K) qVar3.f(q2.f2742c);
                        c0245b3.e((k9 != null ? k9.f2713b : -1) + i34, q2.f2743d);
                        int i49 = q2.f2742c;
                        c0211m03.a(i49, 0);
                        c0245b3.f3188f = (i49 - c0245b3.f3183a.f2851F.f2659g) + c0245b3.f3188f;
                        c0216p3.f2851F.k(i49);
                        F();
                        c0216p3.f2851F.l();
                        c4 = 3;
                        C0192d.q(arrayList5, i49, c0216p3.f2851F.f2654b[(i49 * 5) + 3] + i49);
                    }
                    i32++;
                    size3 = i17;
                    hashSet = hashSet2;
                }
                n2 = n5;
                i2 = i29;
                arrayList = arrayList5;
                C0245b c0245b4 = c0245b3;
                c0245b4.c();
                if (arrayList6.size() > 0) {
                    E0 e05 = c0216p3.f2851F;
                    c0245b = c0245b4;
                    c0245b.f3188f = (e05.f2660h - c0245b.f3183a.f2851F.f2659g) + c0245b.f3188f;
                    e05.m();
                } else {
                    c0245b = c0245b4;
                }
                i4 = c0216p3.f2871j;
                while (true) {
                    e02 = c0216p3.f2851F;
                    if (e02.f2663k > 0 && (i16 = e02.f2659g) != e02.f2660h) {
                        C0216p c0216p4 = c0216p3;
                        F();
                        c0245b.e(i4, c0216p4.f2851F.l());
                        ArrayList arrayList8 = arrayList;
                        C0192d.q(arrayList8, i16, c0216p4.f2851F.f2659g);
                        c0216p3 = c0216p4;
                        i2 = i2;
                        arrayList = arrayList8;
                    }
                }
                z5 = c0216p3.f2860O;
                String str3 = " object arguments (";
                if (z5) {
                    z6 = z5;
                    if (z4) {
                        c0245b.a();
                    }
                    E0 e06 = this.f2851F;
                    int i50 = e06.f2665m - e06.f2664l;
                    if (i50 > 0) {
                        if (i50 > 0) {
                            c0245b.d(false);
                            E0 e07 = c0245b.f3183a.f2851F;
                            if (e07.f2655c > 0) {
                                int i51 = e07.f2661i;
                                N n6 = c0245b.f3186d;
                                int i52 = n6.f2724b;
                                if ((i52 > 0 ? n6.f2723a[i52 - 1] : -2) != i51) {
                                    if (!c0245b.f3185c && c0245b.f3187e) {
                                        c0245b.d(false);
                                        C0244a c0244a = c0245b.f3184b;
                                        c0244a.getClass();
                                        c0244a.f3182h.c0(H.l.f3205c);
                                        c0245b.f3185c = true;
                                    }
                                    if (i51 > 0) {
                                        C0190c a4 = e07.a(i51);
                                        n6.b(i51);
                                        c0245b.d(false);
                                        C0244a c0244a2 = c0245b.f3184b;
                                        c0244a2.getClass();
                                        H.k kVar = H.k.f3204c;
                                        H.D d4 = c0244a2.f3182h;
                                        d4.d0(kVar);
                                        j0.c.Q(d4, 0, a4);
                                        int i53 = d4.f3180n;
                                        int i54 = kVar.f3172a;
                                        int W4 = H.D.W(d4, i54);
                                        int i55 = kVar.f3173b;
                                        if (i53 != W4 || d4.f3181o != H.D.W(d4, i55)) {
                                            int i56 = 1;
                                            StringBuilder sb = new StringBuilder();
                                            int i57 = 0;
                                            int i58 = 0;
                                            while (i57 < i54) {
                                                if (((i56 << i57) & d4.f3180n) != 0) {
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
                                            StringBuilder p6 = AbstractC0017m.p(sb2, "StringBuilder().apply(builderAction).toString()");
                                            int i59 = 0;
                                            int i60 = 0;
                                            while (i59 < i55) {
                                                int i61 = i55;
                                                if (((1 << i59) & d4.f3181o) != 0) {
                                                    if (i58 > 0) {
                                                        p6.append(", ");
                                                    }
                                                    p6.append(kVar.c(i59));
                                                    i60++;
                                                }
                                                i59++;
                                                i55 = i61;
                                            }
                                            String sb3 = p6.toString();
                                            Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
                                            StringBuilder sb4 = new StringBuilder("Error while pushing ");
                                            sb4.append(kVar);
                                            sb4.append(". Not all arguments were provided. Missing ");
                                            AbstractC0017m.t(sb4, i58, " int arguments (", sb2, ") and ");
                                            AbstractC0017m.u(sb4, i60, " object arguments (", sb3, ").");
                                            throw null;
                                        }
                                        c0245b.f3185c = true;
                                    }
                                }
                            }
                            C0244a c0244a3 = c0245b.f3184b;
                            c0244a3.getClass();
                            H.x xVar = H.x.f3221c;
                            H.D d5 = c0244a3.f3182h;
                            d5.d0(xVar);
                            j0.c.P(d5, 0, i50);
                            int i62 = d5.f3180n;
                            int i63 = xVar.f3172a;
                            int W5 = H.D.W(d5, i63);
                            int i64 = xVar.f3173b;
                            if (i62 != W5 || d5.f3181o != H.D.W(d5, i64)) {
                                StringBuilder sb5 = new StringBuilder();
                                int i65 = 0;
                                for (int i66 = 0; i66 < i63; i66++) {
                                    if (((1 << i66) & d5.f3180n) != 0) {
                                        if (i65 > 0) {
                                            sb5.append(", ");
                                        }
                                        sb5.append(xVar.b(i66));
                                        i65++;
                                    }
                                }
                                String sb6 = sb5.toString();
                                StringBuilder p7 = AbstractC0017m.p(sb6, "StringBuilder().apply(builderAction).toString()");
                                int i67 = 0;
                                int i68 = 0;
                                while (i67 < i64) {
                                    int i69 = i64;
                                    if (((1 << i67) & d5.f3181o) != 0) {
                                        if (i65 > 0) {
                                            p7.append(", ");
                                        }
                                        p7.append(xVar.c(i67));
                                        i68++;
                                    }
                                    i67++;
                                    i64 = i69;
                                }
                                String sb7 = p7.toString();
                                Intrinsics.checkNotNullExpressionValue(sb7, "StringBuilder().apply(builderAction).toString()");
                                StringBuilder sb8 = new StringBuilder("Error while pushing ");
                                sb8.append(xVar);
                                sb8.append(". Not all arguments were provided. Missing ");
                                AbstractC0017m.t(sb8, i65, " int arguments (", sb6, ") and ");
                                AbstractC0017m.u(sb8, i68, " object arguments (", sb7, ").");
                                throw null;
                            }
                        } else {
                            c0245b.getClass();
                        }
                    }
                    int i70 = c0245b.f3183a.f2851F.f2661i;
                    N n7 = c0245b.f3186d;
                    int i71 = n7.f2724b;
                    if ((i71 > 0 ? n7.f2723a[i71 - 1] : -1) > i70) {
                        C0192d.w("Missed recording an endGroup");
                        throw null;
                    }
                    if ((i71 > 0 ? n7.f2723a[i71 - 1] : -1) == i70) {
                        c0245b.d(false);
                        n7.a();
                        C0244a c0244a4 = c0245b.f3184b;
                        c0244a4.getClass();
                        c0244a4.f3182h.c0(H.i.f3202c);
                    }
                    c0216p = this;
                    int i72 = c0216p.f2851F.f2661i;
                    int i73 = i2;
                    if (i73 != c0216p.e0(i72)) {
                        c0216p.a0(i72, i73);
                    }
                    if (z4) {
                        i73 = 1;
                    }
                    c0216p.f2851F.d();
                    c0245b.c();
                    i5 = i73;
                } else {
                    if (z4) {
                        C0246c c0246c2 = c0216p3.f2859N;
                        H.D d6 = c0246c2.f3196i;
                        if (!d6.a0()) {
                            C0192d.w("Cannot end node insertion, there are no pending operations that can be realized.");
                            throw null;
                        }
                        if (d6.Z()) {
                            throw new NoSuchElementException("Cannot pop(), because the stack is empty.");
                        }
                        H.C[] cArr = d6.f3174h;
                        int i74 = d6.f3175i - 1;
                        d6.f3175i = i74;
                        H.C c6 = cArr[i74];
                        Intrinsics.c(c6);
                        d6.f3174h[d6.f3175i] = null;
                        H.D d7 = c0246c2.f3195h;
                        d7.d0(c6);
                        int i75 = d6.f3179m;
                        int i76 = d7.f3179m;
                        z6 = z5;
                        str = ").";
                        int i77 = 0;
                        while (true) {
                            i14 = c6.f3173b;
                            if (i77 >= i14) {
                                break;
                            }
                            i76--;
                            i75--;
                            Object[] objArr9 = d7.f3178l;
                            String str4 = str3;
                            Object[] objArr10 = d6.f3178l;
                            objArr9[i76] = objArr10[i75];
                            objArr10[i75] = null;
                            i77++;
                            str3 = str4;
                        }
                        str2 = str3;
                        int i78 = d6.f3177k;
                        int i79 = d7.f3177k;
                        int i80 = 0;
                        while (true) {
                            i15 = c6.f3172a;
                            if (i80 >= i15) {
                                break;
                            }
                            i79--;
                            i78--;
                            int[] iArr4 = d7.f3176j;
                            H.D d8 = d7;
                            int[] iArr5 = d6.f3176j;
                            iArr4[i79] = iArr5[i78];
                            iArr5[i78] = 0;
                            i80++;
                            d7 = d8;
                        }
                        d6.f3179m -= i14;
                        d6.f3177k -= i15;
                        i6 = 1;
                    } else {
                        z6 = z5;
                        str = ").";
                        str2 = " object arguments (";
                        i6 = i2;
                    }
                    E0 e08 = c0216p3.f2851F;
                    int i81 = e08.f2663k;
                    if (i81 <= 0) {
                        C0192d.S("Unbalanced begin/end empty");
                        throw null;
                    }
                    e08.f2663k = i81 - 1;
                    H0 h05 = c0216p3.f2853H;
                    int i82 = h05.f2706v;
                    h05.i();
                    if (c0216p3.f2851F.f2663k > 0) {
                        c0216p2 = c0216p3;
                        i5 = i6;
                    } else {
                        int i83 = (-2) - i82;
                        c0216p3.f2853H.j();
                        c0216p3.f2853H.e(true);
                        C0190c c0190c = c0216p3.f2858M;
                        if (c0216p3.f2859N.f3195h.Z()) {
                            F0 f03 = c0216p3.f2852G;
                            c0245b.b();
                            c0245b.d(false);
                            E0 e09 = c0245b.f3183a.f2851F;
                            if (e09.f2655c > 0) {
                                int i84 = e09.f2661i;
                                N n8 = c0245b.f3186d;
                                int i85 = n8.f2724b;
                                i7 = i6;
                                if ((i85 > 0 ? n8.f2723a[i85 - 1] : -2) != i84) {
                                    if (!c0245b.f3185c && c0245b.f3187e) {
                                        c0245b.d(false);
                                        C0244a c0244a5 = c0245b.f3184b;
                                        c0244a5.getClass();
                                        c0244a5.f3182h.c0(H.l.f3205c);
                                        c0245b.f3185c = true;
                                    }
                                    if (i84 > 0) {
                                        C0190c a5 = e09.a(i84);
                                        n8.b(i84);
                                        c0245b.d(false);
                                        C0244a c0244a6 = c0245b.f3184b;
                                        c0244a6.getClass();
                                        H.k kVar2 = H.k.f3204c;
                                        H.D d9 = c0244a6.f3182h;
                                        d9.d0(kVar2);
                                        j0.c.Q(d9, 0, a5);
                                        int i86 = d9.f3180n;
                                        int i87 = kVar2.f3172a;
                                        int W6 = H.D.W(d9, i87);
                                        i8 = i83;
                                        int i88 = kVar2.f3173b;
                                        if (i86 != W6 || d9.f3181o != H.D.W(d9, i88)) {
                                            int i89 = 1;
                                            StringBuilder sb9 = new StringBuilder();
                                            int i90 = 0;
                                            int i91 = 0;
                                            while (i90 < i87) {
                                                if ((d9.f3180n & (i89 << i90)) != 0) {
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
                                            StringBuilder p8 = AbstractC0017m.p(sb10, "StringBuilder().apply(builderAction).toString()");
                                            int i92 = 0;
                                            for (int i93 = 0; i93 < i88; i93++) {
                                                if (((1 << i93) & d9.f3181o) != 0) {
                                                    if (i91 > 0) {
                                                        p8.append(", ");
                                                    }
                                                    p8.append(kVar2.c(i93));
                                                    i92++;
                                                }
                                            }
                                            String sb11 = p8.toString();
                                            Intrinsics.checkNotNullExpressionValue(sb11, "StringBuilder().apply(builderAction).toString()");
                                            StringBuilder sb12 = new StringBuilder("Error while pushing ");
                                            sb12.append(kVar2);
                                            sb12.append(". Not all arguments were provided. Missing ");
                                            AbstractC0017m.t(sb12, i91, " int arguments (", sb10, ") and ");
                                            AbstractC0017m.u(sb12, i92, str2, sb11, str);
                                            throw null;
                                        }
                                        c0245b.f3185c = true;
                                        String str5 = str;
                                        String str6 = str2;
                                        c0245b.c();
                                        C0244a c0244a7 = c0245b.f3184b;
                                        c0244a7.getClass();
                                        nVar = H.n.f3211c;
                                        H.D d10 = c0244a7.f3182h;
                                        d10.d0(nVar);
                                        j0.c.Q(d10, 0, c0190c);
                                        j0.c.Q(d10, 1, f03);
                                        i9 = d10.f3180n;
                                        i10 = nVar.f3172a;
                                        W3 = H.D.W(d10, i10);
                                        i11 = nVar.f3173b;
                                        if (i9 == W3 || d10.f3181o != H.D.W(d10, i11)) {
                                            StringBuilder sb13 = new StringBuilder();
                                            i12 = 0;
                                            int i94 = 0;
                                            while (i12 < i10) {
                                                int i95 = i10;
                                                if (((1 << i12) & d10.f3180n) != 0) {
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
                                            StringBuilder p9 = AbstractC0017m.p(sb14, "StringBuilder().apply(builderAction).toString()");
                                            int i96 = 0;
                                            i13 = 0;
                                            while (i13 < i11) {
                                                int i97 = i11;
                                                if (((1 << i13) & d10.f3181o) != 0) {
                                                    if (i94 > 0) {
                                                        p9.append(", ");
                                                    }
                                                    p9.append(nVar.c(i13));
                                                    i96++;
                                                }
                                                i13++;
                                                i11 = i97;
                                            }
                                            String sb15 = p9.toString();
                                            Intrinsics.checkNotNullExpressionValue(sb15, "StringBuilder().apply(builderAction).toString()");
                                            StringBuilder sb16 = new StringBuilder("Error while pushing ");
                                            sb16.append(nVar);
                                            sb16.append(". Not all arguments were provided. Missing ");
                                            AbstractC0017m.t(sb16, i94, " int arguments (", sb14, ") and ");
                                            AbstractC0017m.u(sb16, i96, str6, sb15, str5);
                                            throw null;
                                        }
                                        c0216p2 = c0216p3;
                                    }
                                }
                            } else {
                                i7 = i6;
                            }
                            i8 = i83;
                            String str52 = str;
                            String str62 = str2;
                            c0245b.c();
                            C0244a c0244a72 = c0245b.f3184b;
                            c0244a72.getClass();
                            nVar = H.n.f3211c;
                            H.D d102 = c0244a72.f3182h;
                            d102.d0(nVar);
                            j0.c.Q(d102, 0, c0190c);
                            j0.c.Q(d102, 1, f03);
                            i9 = d102.f3180n;
                            i10 = nVar.f3172a;
                            W3 = H.D.W(d102, i10);
                            i11 = nVar.f3173b;
                            if (i9 == W3) {
                            }
                            StringBuilder sb132 = new StringBuilder();
                            i12 = 0;
                            int i942 = 0;
                            while (i12 < i10) {
                            }
                            String sb142 = sb132.toString();
                            StringBuilder p92 = AbstractC0017m.p(sb142, "StringBuilder().apply(builderAction).toString()");
                            int i962 = 0;
                            i13 = 0;
                            while (i13 < i11) {
                            }
                            String sb152 = p92.toString();
                            Intrinsics.checkNotNullExpressionValue(sb152, "StringBuilder().apply(builderAction).toString()");
                            StringBuilder sb162 = new StringBuilder("Error while pushing ");
                            sb162.append(nVar);
                            sb162.append(". Not all arguments were provided. Missing ");
                            AbstractC0017m.t(sb162, i942, " int arguments (", sb142, ") and ");
                            AbstractC0017m.u(sb162, i962, str62, sb152, str52);
                            throw null;
                        }
                        i7 = i6;
                        i8 = i83;
                        String str7 = str;
                        String str8 = str2;
                        F0 f04 = c0216p3.f2852G;
                        C0246c c0246c3 = c0216p3.f2859N;
                        c0245b.b();
                        c0245b.d(false);
                        E0 e010 = c0245b.f3183a.f2851F;
                        if (e010.f2655c > 0) {
                            int i98 = e010.f2661i;
                            N n9 = c0245b.f3186d;
                            int i99 = n9.f2724b;
                            c0246c = c0246c3;
                            if ((i99 > 0 ? n9.f2723a[i99 - 1] : -2) != i98) {
                                if (!c0245b.f3185c && c0245b.f3187e) {
                                    c0245b.d(false);
                                    C0244a c0244a8 = c0245b.f3184b;
                                    c0244a8.getClass();
                                    c0244a8.f3182h.c0(H.l.f3205c);
                                    c0245b.f3185c = true;
                                }
                                if (i98 > 0) {
                                    C0190c a6 = e010.a(i98);
                                    n9.b(i98);
                                    c0245b.d(false);
                                    C0244a c0244a9 = c0245b.f3184b;
                                    c0244a9.getClass();
                                    H.k kVar3 = H.k.f3204c;
                                    H.D d11 = c0244a9.f3182h;
                                    d11.d0(kVar3);
                                    j0.c.Q(d11, 0, a6);
                                    int i100 = d11.f3180n;
                                    int i101 = kVar3.f3172a;
                                    int W7 = H.D.W(d11, i101);
                                    f02 = f04;
                                    int i102 = kVar3.f3173b;
                                    if (i100 != W7 || d11.f3181o != H.D.W(d11, i102)) {
                                        int i103 = 1;
                                        StringBuilder sb17 = new StringBuilder();
                                        int i104 = 0;
                                        int i105 = 0;
                                        while (i104 < i101) {
                                            if (((i103 << i104) & d11.f3180n) != 0) {
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
                                        StringBuilder p10 = AbstractC0017m.p(sb18, "StringBuilder().apply(builderAction).toString()");
                                        int i106 = 0;
                                        int i107 = 0;
                                        while (i106 < i102) {
                                            int i108 = i102;
                                            if (((1 << i106) & d11.f3181o) != 0) {
                                                if (i105 > 0) {
                                                    p10.append(", ");
                                                }
                                                p10.append(kVar3.c(i106));
                                                i107++;
                                            }
                                            i106++;
                                            i102 = i108;
                                        }
                                        String sb19 = p10.toString();
                                        Intrinsics.checkNotNullExpressionValue(sb19, "StringBuilder().apply(builderAction).toString()");
                                        StringBuilder sb20 = new StringBuilder("Error while pushing ");
                                        sb20.append(kVar3);
                                        sb20.append(". Not all arguments were provided. Missing ");
                                        AbstractC0017m.t(sb20, i105, " int arguments (", sb18, ") and ");
                                        AbstractC0017m.u(sb20, i107, str8, sb19, str7);
                                        throw null;
                                    }
                                    c0245b.f3185c = true;
                                }
                            }
                            f02 = f04;
                        } else {
                            f02 = f04;
                            c0246c = c0246c3;
                        }
                        c0245b.c();
                        C0244a c0244a10 = c0245b.f3184b;
                        c0244a10.getClass();
                        H.o oVar = H.o.f3212c;
                        H.D d12 = c0244a10.f3182h;
                        d12.d0(oVar);
                        j0.c.Q(d12, 0, c0190c);
                        j0.c.Q(d12, 1, f02);
                        j0.c.Q(d12, 2, c0246c);
                        int i109 = d12.f3180n;
                        int i110 = oVar.f3172a;
                        int W8 = H.D.W(d12, i110);
                        int i111 = oVar.f3173b;
                        if (i109 != W8 || d12.f3181o != H.D.W(d12, i111)) {
                            StringBuilder sb21 = new StringBuilder();
                            int i112 = 0;
                            int i113 = 0;
                            while (i112 < i110) {
                                int i114 = i110;
                                if (((1 << i112) & d12.f3180n) != 0) {
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
                            StringBuilder p11 = AbstractC0017m.p(sb22, "StringBuilder().apply(builderAction).toString()");
                            int i115 = 0;
                            int i116 = 0;
                            while (i116 < i111) {
                                int i117 = i111;
                                if (((1 << i116) & d12.f3181o) != 0) {
                                    if (i113 > 0) {
                                        p11.append(", ");
                                    }
                                    p11.append(oVar.c(i116));
                                    i115++;
                                }
                                i116++;
                                i111 = i117;
                            }
                            String sb23 = p11.toString();
                            Intrinsics.checkNotNullExpressionValue(sb23, "StringBuilder().apply(builderAction).toString()");
                            StringBuilder sb24 = new StringBuilder("Error while pushing ");
                            sb24.append(oVar);
                            sb24.append(". Not all arguments were provided. Missing ");
                            AbstractC0017m.t(sb24, i113, " int arguments (", sb22, ") and ");
                            AbstractC0017m.u(sb24, i115, str8, sb23, str7);
                            throw null;
                        }
                        c0216p2 = this;
                        c0216p2.f2859N = new C0246c();
                        c0216p2.f2860O = false;
                        if (c0216p2.f2864c.f2671e == 0) {
                            i5 = i7;
                        } else {
                            int i118 = i8;
                            c0216p2.Z(i118, 0);
                            i5 = i7;
                            c0216p2.a0(i118, i5);
                        }
                    }
                    c0216p = c0216p2;
                }
                ArrayList arrayList9 = c0216p.f2869h.f2781d;
                c0211m0 = (C0211m0) arrayList9.remove(arrayList9.size() - 1);
                if (c0211m0 != null && !z6) {
                    c0211m0.f2832c++;
                }
                c0216p.f2870i = c0211m0;
                c0216p.f2871j = n2.a() + i5;
                c0216p.f2873l = n2.a();
                c0216p.f2872k = n2.a() + i5;
            }
        }
        n2 = n5;
        i2 = i29;
        arrayList = arrayList5;
        c0245b = c0245b3;
        i4 = c0216p3.f2871j;
        while (true) {
            e02 = c0216p3.f2851F;
            if (e02.f2663k > 0) {
                break;
            }
            C0216p c0216p42 = c0216p3;
            F();
            c0245b.e(i4, c0216p42.f2851F.l());
            ArrayList arrayList82 = arrayList;
            C0192d.q(arrayList82, i16, c0216p42.f2851F.f2659g);
            c0216p3 = c0216p42;
            i2 = i2;
            arrayList = arrayList82;
        }
        z5 = c0216p3.f2860O;
        String str32 = " object arguments (";
        if (z5) {
        }
        ArrayList arrayList92 = c0216p.f2869h.f2781d;
        c0211m0 = (C0211m0) arrayList92.remove(arrayList92.size() - 1);
        if (c0211m0 != null) {
            c0211m0.f2832c++;
        }
        c0216p.f2870i = c0211m0;
        c0216p.f2871j = n2.a() + i5;
        c0216p.f2873l = n2.a();
        c0216p.f2872k = n2.a() + i5;
    }

    public final void r() {
        q(false);
        C0222s0 x2 = x();
        if (x2 != null) {
            int i2 = x2.f2900a;
            if ((i2 & 1) != 0) {
                x2.f2900a = i2 | 2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0222s0 s() {
        C0222s0 c0222s0;
        C0190c a4;
        C0220r0 c0220r0;
        W0 w02 = this.f2849D;
        if (w02.f2781d.isEmpty()) {
            c0222s0 = null;
        } else {
            ArrayList arrayList = w02.f2781d;
            c0222s0 = (C0222s0) arrayList.remove(arrayList.size() - 1);
        }
        if (c0222s0 != null) {
            c0222s0.f2900a &= -9;
        }
        if (c0222s0 != null) {
            int i2 = this.f2847A;
            i.v vVar = c0222s0.f2905f;
            if (vVar != null && (c0222s0.f2900a & 16) == 0) {
                Object[] objArr = vVar.f6969b;
                int[] iArr = vVar.f6970c;
                long[] jArr = vVar.f6968a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i4 = 0;
                    loop0: while (true) {
                        long j4 = jArr[i4];
                        if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i5 = 8 - ((~(i4 - length)) >>> 31);
                            for (int i6 = 0; i6 < i5; i6++) {
                                if ((j4 & 255) < 128) {
                                    int i7 = (i4 << 3) + i6;
                                    Object obj = objArr[i7];
                                    if (iArr[i7] != i2) {
                                        c0220r0 = new C0220r0(i2, 0, c0222s0, vVar);
                                        break loop0;
                                    }
                                }
                                j4 >>= 8;
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
                    if (c0220r0 != null) {
                        C0244a c0244a = this.f2857L.f3184b;
                        c0244a.getClass();
                        H.h hVar = H.h.f3201c;
                        H.D d4 = c0244a.f3182h;
                        d4.d0(hVar);
                        j0.c.Q(d4, 0, c0220r0);
                        j0.c.Q(d4, 1, this.f2868g);
                        int i8 = d4.f3180n;
                        int i9 = hVar.f3172a;
                        int W3 = H.D.W(d4, i9);
                        int i10 = hVar.f3173b;
                        if (i8 != W3 || d4.f3181o != H.D.W(d4, i10)) {
                            StringBuilder sb = new StringBuilder();
                            int i11 = 0;
                            for (int i12 = 0; i12 < i9; i12++) {
                                if ((d4.f3180n & (1 << i12)) != 0) {
                                    if (i11 > 0) {
                                        sb.append(", ");
                                    }
                                    sb.append(hVar.b(i12));
                                    i11++;
                                }
                            }
                            String sb2 = sb.toString();
                            StringBuilder p4 = AbstractC0017m.p(sb2, "StringBuilder().apply(builderAction).toString()");
                            int i13 = 0;
                            for (int i14 = 0; i14 < i10; i14++) {
                                if ((d4.f3181o & (1 << i14)) != 0) {
                                    if (i11 > 0) {
                                        p4.append(", ");
                                    }
                                    p4.append(hVar.c(i14));
                                    i13++;
                                }
                            }
                            String sb3 = p4.toString();
                            Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
                            StringBuilder sb4 = new StringBuilder("Error while pushing ");
                            sb4.append(hVar);
                            sb4.append(". Not all arguments were provided. Missing ");
                            AbstractC0017m.t(sb4, i11, " int arguments (", sb2, ") and ");
                            AbstractC0017m.u(sb4, i13, " object arguments (", sb3, ").");
                            throw null;
                        }
                    }
                }
            }
            c0220r0 = null;
            if (c0220r0 != null) {
            }
        }
        C0222s0 c0222s02 = null;
        if (c0222s0 != null) {
            int i15 = c0222s0.f2900a;
            if ((i15 & 16) == 0 && ((i15 & 1) != 0 || this.f2877p)) {
                if (c0222s0.f2902c == null) {
                    if (this.f2860O) {
                        H0 h02 = this.f2853H;
                        a4 = h02.b(h02.f2706v);
                    } else {
                        E0 e02 = this.f2851F;
                        a4 = e02.a(e02.f2661i);
                    }
                    c0222s0.f2902c = a4;
                }
                c0222s0.f2900a &= -5;
                c0222s02 = c0222s0;
            }
        }
        q(false);
        return c0222s02;
    }

    public final void t() {
        if (this.f2885x && this.f2851F.f2661i == this.f2886y) {
            this.f2886y = -1;
            this.f2885x = false;
        }
        q(false);
    }

    public final void u() {
        q(false);
        this.f2863b.b();
        q(false);
        C0245b c0245b = this.f2857L;
        if (c0245b.f3185c) {
            c0245b.d(false);
            c0245b.d(false);
            C0244a c0244a = c0245b.f3184b;
            c0244a.getClass();
            c0244a.f3182h.c0(H.i.f3202c);
            c0245b.f3185c = false;
        }
        c0245b.b();
        if (!(c0245b.f3186d.f2724b == 0)) {
            C0192d.w("Missed recording an endGroup()");
            throw null;
        }
        if (!this.f2869h.f2781d.isEmpty()) {
            C0192d.w("Start/end imbalance");
            throw null;
        }
        i();
        this.f2851F.c();
        this.f2883v = this.f2884w.a() != 0;
    }

    public final void v(boolean z4, C0211m0 c0211m0) {
        this.f2869h.f2781d.add(this.f2870i);
        this.f2870i = c0211m0;
        int i2 = this.f2872k;
        N n2 = this.f2874m;
        n2.b(i2);
        n2.b(this.f2873l);
        n2.b(this.f2871j);
        if (z4) {
            this.f2871j = 0;
        }
        this.f2872k = 0;
        this.f2873l = 0;
    }

    public final void w() {
        F0 f02 = new F0();
        if (this.B) {
            f02.h();
        }
        if (this.f2863b.c()) {
            f02.f2679p = new i.q();
        }
        this.f2852G = f02;
        H0 w4 = f02.w();
        w4.e(true);
        this.f2853H = w4;
    }

    public final C0222s0 x() {
        if (this.f2887z == 0) {
            W0 w02 = this.f2849D;
            if (!w02.f2781d.isEmpty()) {
                return (C0222s0) w02.f2781d.get(r0.size() - 1);
            }
        }
        return null;
    }

    public final boolean y() {
        C0222s0 x2;
        return (z() && !this.f2883v && ((x2 = x()) == null || (x2.f2900a & 4) == 0)) ? false : true;
    }

    public final boolean z() {
        C0222s0 x2;
        return (this.f2860O || this.f2885x || this.f2883v || (x2 = x()) == null || (x2.f2900a & 8) != 0) ? false : true;
    }
}
