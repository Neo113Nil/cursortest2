package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.h;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class a00 {
    public int A;
    public int B;
    public boolean C;
    public final yz D;
    public final ArrayList E;
    public boolean F;
    public vl2 G;
    public wl2 H;
    public zl2 I;
    public boolean J;
    public v02 K;
    public et L;
    public final tz M;
    public m6 N;
    public nm0 O;
    public b71 P;
    public final i00 Q;
    public final CoroutineContext R;
    public boolean S;
    public long T;
    public f00 U;
    public final t13 a;
    public final d00 b;
    public final wl2 c;
    public final wn1 d;
    public final et e;
    public final et f;
    public final ar0 g;
    public final k00 h;
    public s02 j;
    public int k;
    public int l;
    public int m;
    public int[] o;
    public xm1 p;
    public boolean q;
    public boolean r;
    public zm1 v;
    public boolean w;
    public boolean y;
    public final ArrayList i = new ArrayList();
    public final y31 n = new y31();
    public final ArrayList s = new ArrayList();
    public final y31 t = new y31();
    public v02 u = v02.s;
    public final y31 x = new y31();
    public int z = -1;

    public a00(t13 t13Var, d00 d00Var, wl2 wl2Var, wn1 wn1Var, et etVar, et etVar2, ar0 ar0Var, k00 k00Var) {
        this.a = t13Var;
        this.b = d00Var;
        this.c = wl2Var;
        this.d = wn1Var;
        this.e = etVar;
        this.f = etVar2;
        this.g = ar0Var;
        this.h = k00Var;
        this.C = d00Var.e() || d00Var.c();
        this.D = new yz(0, this);
        this.E = new ArrayList();
        vl2 c = wl2Var.c();
        c.c();
        this.G = c;
        wl2 wl2Var2 = new wl2();
        if (d00Var.e()) {
            wl2Var2.b();
        }
        if (d00Var.c()) {
            wl2Var2.w = new zm1();
        }
        this.H = wl2Var2;
        zl2 d = wl2Var2.d();
        d.e(true);
        this.I = d;
        this.M = new tz(this, etVar);
        vl2 c2 = this.H.c();
        try {
            m6 a = c2.a(0);
            c2.c();
            this.N = a;
            this.O = new nm0();
            this.Q = new i00(this);
            CoroutineContext i = d00Var.i();
            CoroutineContext A = A();
            this.R = i.p(A == null ? h.m : A);
        } catch (Throwable th) {
            c2.c();
            throw th;
        }
    }

    public static final int O(a00 a00Var, int i, boolean z, int i2) {
        vl2 vl2Var = a00Var.G;
        if (vl2Var.j(i)) {
            int i3 = vl2Var.i(i);
            Object p = vl2Var.p(vl2Var.b, i);
            if (i3 == 206 && Intrinsics.b(p, b00.e)) {
                Object h = vl2Var.h(i, 0);
                wz wzVar = h instanceof wz ? (wz) h : null;
                if (wzVar != null) {
                    for (a00 a00Var2 : wzVar.m.e) {
                        wl2 wl2Var = a00Var2.c;
                        if (wl2Var.n > 0 && (wl2Var.m[1] & 67108864) != 0) {
                            k00 k00Var = a00Var2.h;
                            synchronized (k00Var.p) {
                                k00Var.o();
                                tn1 tn1Var = k00Var.z;
                                k00Var.z = z71.k();
                                try {
                                    k00Var.F.e0(tn1Var);
                                    Unit unit = Unit.a;
                                } finally {
                                }
                            }
                            et etVar = new et();
                            a00Var2.L = etVar;
                            vl2 c = a00Var2.c.c();
                            try {
                                a00Var2.G = c;
                                tz tzVar = a00Var2.M;
                                et etVar2 = tzVar.b;
                                try {
                                    tzVar.b = etVar;
                                    a00Var2.N(0);
                                    tz tzVar2 = a00Var2.M;
                                    tzVar2.b();
                                    if (tzVar2.c) {
                                        tzVar2.b.s.Y(iw1.c);
                                        if (tzVar2.c) {
                                            tzVar2.d(false);
                                            tzVar2.d(false);
                                            tzVar2.b.s.Y(tv1.c);
                                            tzVar2.c = false;
                                        }
                                    }
                                } finally {
                                }
                            } finally {
                                c.c();
                            }
                        }
                        a00Var.b.n(a00Var2.h);
                    }
                }
                return vl2Var.o(i);
            }
            if (!vl2Var.l(i)) {
                return vl2Var.o(i);
            }
        } else if (vl2Var.d(i)) {
            int i4 = vl2Var.b[(i * 5) + 3] + i;
            int i5 = 0;
            for (int i6 = i + 1; i6 < i4; i6 += vl2Var.b[(i6 * 5) + 3]) {
                boolean l = vl2Var.l(i6);
                if (l) {
                    a00Var.M.c();
                    tz tzVar3 = a00Var.M;
                    Object n = vl2Var.n(i6);
                    tzVar3.c();
                    tzVar3.h.add(n);
                }
                i5 += O(a00Var, i6, l || z, l ? 0 : i2 + i5);
                if (l) {
                    a00Var.M.c();
                    a00Var.M.a();
                }
            }
            if (!vl2Var.l(i)) {
                return i5;
            }
        } else if (!vl2Var.l(i)) {
            return vl2Var.o(i);
        }
        return 1;
    }

    public final i00 A() {
        if (this.C) {
            return this.Q;
        }
        return null;
    }

    public final boolean B() {
        n72 y;
        return (this.S || this.y || this.w || (y = y()) == null || (y.b & 8) != 0) ? false : true;
    }

    public final void C(ArrayList arrayList) {
        et etVar = this.f;
        tz tzVar = this.M;
        et etVar2 = tzVar.b;
        try {
            tzVar.b = etVar;
            etVar.s.Y(gw1.c);
            if (arrayList.size() <= 0) {
                tzVar.b.s.Y(uv1.c);
                tzVar.f = 0;
            } else {
                Pair pair = (Pair) arrayList.get(0);
                lm1 lm1Var = (lm1) pair.m;
                lm1Var.getClass();
                throw null;
            }
        } finally {
            tzVar.b = etVar2;
        }
    }

    public final void D(v02 v02Var, Object obj) {
        T(126665345, 0, null, null);
        E();
        j0(obj);
        long j = this.T;
        try {
            this.T = 126665345L;
            if (this.S) {
                zl2.y(this.I);
            }
            boolean z = (this.S || Intrinsics.b(this.G.f(), v02Var)) ? false : true;
            if (z) {
                K(v02Var);
            }
            T(202, 0, b00.c, v02Var);
            this.K = null;
            boolean z2 = this.w;
            this.w = z;
            l41.J(this, new my(316014703, new zz(obj), true));
            this.w = z2;
        } finally {
        }
    }

    public final Object E() {
        boolean z = this.S;
        nj njVar = sz.a;
        if (!z) {
            Object m = this.G.m();
            if (!this.y || (m instanceof wz)) {
                return m;
            }
        } else if (this.r) {
            b00.c("A call to createNode(), emitNode() or useNode() expected");
            return njVar;
        }
        return njVar;
    }

    public final List F() {
        d00 d00Var = this.b;
        c00 g = d00Var.g();
        k00 k00Var = g != null ? (k00) g : null;
        if (k00Var == null) {
            return ah0.m;
        }
        wl2 wl2Var = k00Var.r;
        vl2 c = wl2Var.c();
        try {
            Integer q = s03.q(c, d00Var, 0, c.c);
            if (q == null) {
                return ah0.m;
            }
            try {
                return s03.Q(wl2Var.c(), q.intValue(), 0);
            } finally {
            }
        } finally {
        }
    }

    public final int G(int i) {
        int q = this.G.q(i) + 1;
        int i2 = 0;
        while (q < i) {
            if (!this.G.k(q)) {
                i2++;
            }
            q += this.G.b[(q * 5) + 3];
        }
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:
    
        if (r10 == null) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object H(k00 k00Var, k00 k00Var2, Integer num, List list, Function0 function0) {
        Object invoke;
        boolean z = this.F;
        int i = this.k;
        try {
            this.F = true;
            this.k = 0;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Pair pair = (Pair) list.get(i2);
                n72 n72Var = (n72) pair.m;
                Object obj = pair.n;
                if (obj != null) {
                    d0(n72Var, obj);
                } else {
                    d0(n72Var, null);
                }
            }
            if (k00Var != null) {
                int intValue = num != null ? num.intValue() : -1;
                if (k00Var2 == null || k00Var2 == k00Var || intValue < 0) {
                    invoke = function0.invoke();
                } else {
                    k00Var.B = k00Var2;
                    k00Var.C = intValue;
                    try {
                        invoke = function0.invoke();
                        k00Var.B = null;
                        k00Var.C = 0;
                    } catch (Throwable th) {
                        k00Var.B = null;
                        k00Var.C = 0;
                        throw th;
                    }
                }
            }
            invoke = function0.invoke();
            this.F = z;
            this.k = i;
            return invoke;
        } catch (Throwable th2) {
            this.F = z;
            this.k = i;
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x003b, code lost:
    
        if (r4.b < r6) goto L11;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0339  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void I() {
        x41 x41Var;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        long j;
        boolean z;
        hn1 hn1Var;
        long j2;
        int e;
        int i8;
        int hashCode;
        Object b;
        by1 by1Var = by1.B;
        boolean z2 = this.F;
        this.F = true;
        vl2 vl2Var = this.G;
        int i9 = vl2Var.i;
        int i10 = (i9 * 5) + 3;
        int i11 = vl2Var.b[i10] + i9;
        int i12 = this.k;
        long j3 = this.T;
        int i13 = this.l;
        int i14 = this.m;
        int i15 = vl2Var.g;
        ArrayList arrayList = this.s;
        int e2 = b00.e(i15, arrayList);
        if (e2 < 0) {
            e2 = -(e2 + 1);
        }
        if (e2 < arrayList.size()) {
            x41Var = (x41) arrayList.get(e2);
        }
        x41Var = null;
        int i16 = 1;
        int i17 = i9;
        int i18 = 0;
        while (x41Var != null) {
            n72 n72Var = x41Var.a;
            int i19 = x41Var.b;
            by1 by1Var2 = by1Var;
            int e3 = b00.e(i19, arrayList);
            if (e3 >= 0) {
            }
            Object obj = x41Var.c;
            if (obj == null) {
                n72Var.getClass();
                i3 = i11;
                i = i10;
                i2 = i12;
            } else {
                int i20 = 8;
                tn1 tn1Var = n72Var.g;
                if (tn1Var == null) {
                    i3 = i11;
                    i = i10;
                    i2 = i12;
                } else {
                    i = i10;
                    if (obj instanceof ia0) {
                        ia0 ia0Var = (ia0) obj;
                        zm2 zm2Var = ia0Var.o;
                        if (zm2Var == null) {
                            zm2Var = by1Var2;
                        }
                        i2 = i12;
                        i6 = !zm2Var.d(ia0Var.i().f, tn1Var.g(ia0Var)) ? 1 : 0;
                        i3 = i11;
                        i4 = i13;
                        i5 = i14;
                    } else {
                        i2 = i12;
                        if (obj instanceof un1) {
                            un1 un1Var = (un1) obj;
                            if (un1Var.h()) {
                                Object[] objArr = un1Var.b;
                                long[] jArr = un1Var.a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    i4 = i13;
                                    i5 = i14;
                                    int i21 = 0;
                                    while (true) {
                                        long j4 = jArr[i21];
                                        i3 = i11;
                                        Object[] objArr2 = objArr;
                                        if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i22 = 8 - ((~(i21 - length)) >>> 31);
                                            int i23 = 0;
                                            while (i23 < i22) {
                                                if ((j4 & 255) < 128) {
                                                    i7 = i23;
                                                    Object obj2 = objArr2[(i21 << 3) + i23];
                                                    j = j4;
                                                    if (!(obj2 instanceof ia0)) {
                                                        break;
                                                    }
                                                    ia0 ia0Var2 = (ia0) obj2;
                                                    zm2 zm2Var2 = ia0Var2.o;
                                                    if (zm2Var2 == null) {
                                                        zm2Var2 = by1Var2;
                                                    }
                                                    if (!zm2Var2.d(ia0Var2.i().f, tn1Var.g(ia0Var2))) {
                                                        break;
                                                    }
                                                } else {
                                                    i7 = i23;
                                                    j = j4;
                                                }
                                                j4 = j >> i20;
                                                i23 = i7 + 1;
                                            }
                                            if (i22 != i20) {
                                                break;
                                            }
                                        }
                                        if (i21 == length) {
                                            break;
                                        }
                                        i21++;
                                        i11 = i3;
                                        objArr = objArr2;
                                        i20 = 8;
                                    }
                                    i6 = 0;
                                }
                            }
                            i3 = i11;
                            i4 = i13;
                            i5 = i14;
                            i6 = 0;
                        } else {
                            i3 = i11;
                        }
                    }
                    if (i6 == 0) {
                        this.G.r(i19);
                        int i24 = this.G.g;
                        L(i17, i24, i9);
                        int q = this.G.q(i24);
                        while (q != i9 && !this.G.l(q)) {
                            q = this.G.q(q);
                        }
                        int i25 = this.G.l(q) ? 0 : i2;
                        if (q != i24) {
                            int k0 = (k0(q) - this.G.o(i24)) + i25;
                            while (i25 < k0 && q != i19) {
                                q++;
                                while (q < i19) {
                                    vl2 vl2Var2 = this.G;
                                    int i26 = vl2Var2.b[(q * 5) + 3] + q;
                                    if (i19 >= i26) {
                                        i25 += vl2Var2.l(q) ? i16 : k0(q);
                                        q = i26;
                                    }
                                }
                                break;
                            }
                        }
                        this.k = i25;
                        this.m = G(i24);
                        int q2 = this.G.q(i24);
                        long j5 = 0;
                        int i27 = 3;
                        int i28 = 0;
                        while (true) {
                            if (q2 < 0) {
                                break;
                            }
                            if (q2 == i9) {
                                j5 ^= Long.rotateLeft(j3, i28);
                                break;
                            }
                            vl2 vl2Var3 = this.G;
                            boolean k = vl2Var3.k(q2);
                            int[] iArr = vl2Var3.b;
                            if (k) {
                                Object p = vl2Var3.p(iArr, q2);
                                if (p != null) {
                                    hashCode = p instanceof Enum ? ((Enum) p).ordinal() : p.hashCode();
                                    i8 = i24;
                                } else {
                                    i8 = i24;
                                    hashCode = 0;
                                }
                            } else {
                                int i29 = vl2Var3.i(q2);
                                i8 = i24;
                                hashCode = (i29 != 207 || (b = vl2Var3.b(iArr, q2)) == null || b.equals(sz.a)) ? i29 : b.hashCode();
                            }
                            if (hashCode == 126665345) {
                                j5 ^= Long.rotateLeft(hashCode, i28);
                                break;
                            }
                            j5 = (j5 ^ Long.rotateLeft(hashCode, i27)) ^ Long.rotateLeft(this.G.k(q2) ? 0 : G(q2), i28);
                            i27 = (i27 + 6) % 64;
                            i28 = (i28 + 6) % 64;
                            q2 = this.G.q(q2);
                            i24 = i8;
                        }
                        i8 = i24;
                        this.T = j5;
                        this.K = null;
                        Function2 function2 = n72Var.d;
                        if (function2 == null) {
                            lh.g("Invalid restart scope");
                            return;
                        }
                        function2.invoke(this, Integer.valueOf(i16));
                        this.K = null;
                        vl2 vl2Var4 = this.G;
                        int i30 = vl2Var4.b[i] + i9;
                        int i31 = vl2Var4.g;
                        if (i31 < i9 || i31 > i30) {
                            b00.c("Index " + i9 + " is not a parent of " + i31);
                        }
                        vl2Var4.i = i9;
                        vl2Var4.h = i30;
                        vl2Var4.l = 0;
                        vl2Var4.m = 0;
                        z = z2;
                        i17 = i8;
                        i18 = i16;
                    } else {
                        ArrayList arrayList2 = this.E;
                        arrayList2.add(n72Var);
                        this.g.s();
                        k00 k00Var = n72Var.a;
                        if (k00Var == null || (hn1Var = n72Var.f) == null) {
                            z = z2;
                        } else {
                            n72Var.d(i16);
                            try {
                                Object[] objArr3 = hn1Var.b;
                                int[] iArr2 = hn1Var.c;
                                long[] jArr2 = hn1Var.a;
                                int length2 = jArr2.length - 2;
                                z = z2;
                                if (length2 >= 0) {
                                    int i32 = 0;
                                    while (true) {
                                        long j6 = jArr2[i32];
                                        long[] jArr3 = jArr2;
                                        Object[] objArr4 = objArr3;
                                        if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i33 = 8 - ((~(i32 - length2)) >>> 31);
                                            int i34 = 0;
                                            while (i34 < i33) {
                                                if ((j6 & 255) < 128) {
                                                    int i35 = (i32 << 3) + i34;
                                                    j2 = j6;
                                                    Object obj3 = objArr4[i35];
                                                    int i36 = iArr2[i35];
                                                    k00Var.y(obj3);
                                                } else {
                                                    j2 = j6;
                                                }
                                                i34++;
                                                j6 = j2 >> 8;
                                            }
                                            if (i33 != 8) {
                                                break;
                                            }
                                        }
                                        if (i32 == length2) {
                                            break;
                                        }
                                        i32++;
                                        objArr3 = objArr4;
                                        jArr2 = jArr3;
                                    }
                                }
                                n72Var.d(false);
                            } catch (Throwable th) {
                                n72Var.d(false);
                                throw th;
                            }
                        }
                        i16 = 1;
                        arrayList2.remove(arrayList2.size() - 1);
                    }
                    e = b00.e(this.G.g, arrayList);
                    if (e < 0) {
                        e = -(e + 1);
                    }
                    if (e >= arrayList.size()) {
                        x41 x41Var2 = (x41) arrayList.get(e);
                        i11 = i3;
                        if (x41Var2.b < i11) {
                            x41Var = x41Var2;
                            z2 = z;
                            by1Var = by1Var2;
                            i10 = i;
                            i12 = i2;
                            i13 = i4;
                            i14 = i5;
                        }
                    } else {
                        i11 = i3;
                    }
                    x41Var = null;
                    z2 = z;
                    by1Var = by1Var2;
                    i10 = i;
                    i12 = i2;
                    i13 = i4;
                    i14 = i5;
                }
            }
            i4 = i13;
            i5 = i14;
            i6 = i16;
            if (i6 == 0) {
            }
            e = b00.e(this.G.g, arrayList);
            if (e < 0) {
            }
            if (e >= arrayList.size()) {
            }
            x41Var = null;
            z2 = z;
            by1Var = by1Var2;
            i10 = i;
            i12 = i2;
            i13 = i4;
            i14 = i5;
        }
        boolean z3 = z2;
        int i37 = i12;
        int i38 = i13;
        int i39 = i14;
        if (i18 != 0) {
            L(i17, i9, i9);
            this.G.t();
            int k02 = k0(i9);
            this.k = i37 + k02;
            this.l = i38 + k02;
            this.m = i39;
        } else {
            R();
        }
        this.T = j3;
        this.F = z3;
    }

    public final void J() {
        int i;
        N(this.G.g);
        tz tzVar = this.M;
        tzVar.d(false);
        y31 y31Var = tzVar.d;
        a00 a00Var = tzVar.a;
        vl2 vl2Var = a00Var.G;
        if (vl2Var.c > 0 && y31Var.a(-2) != (i = vl2Var.i)) {
            if (!tzVar.c && tzVar.e) {
                tzVar.d(false);
                tzVar.b.s.Y(xv1.c);
                tzVar.c = true;
            }
            if (i > 0) {
                m6 a = vl2Var.a(i);
                y31Var.c(i);
                tzVar.d(false);
                rw1 rw1Var = tzVar.b.s;
                rw1Var.Y(wv1.c);
                s03.M(rw1Var, 0, a);
                tzVar.c = true;
            }
        }
        tzVar.b.s.Y(ew1.c);
        int i2 = tzVar.f;
        vl2 vl2Var2 = a00Var.G;
        tzVar.f = vl2Var2.b[(vl2Var2.g * 5) + 3] + i2;
    }

    public final void K(v02 v02Var) {
        zm1 zm1Var = this.v;
        if (zm1Var == null) {
            zm1Var = new zm1();
            this.v = zm1Var;
        }
        zm1Var.h(this.G.g, v02Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void L(int i, int i2, int i3) {
        vl2 vl2Var = this.G;
        if (i != i2) {
            if (i != i3 && i2 != i3) {
                if (vl2Var.q(i) == i2) {
                    i3 = i2;
                } else if (vl2Var.q(i2) != i) {
                    if (vl2Var.q(i) == vl2Var.q(i2)) {
                        i3 = vl2Var.q(i);
                    } else {
                        int i4 = i;
                        int i5 = 0;
                        while (i4 > 0 && i4 != i3) {
                            i4 = vl2Var.q(i4);
                            i5++;
                        }
                        int i6 = i2;
                        int i7 = 0;
                        while (i6 > 0 && i6 != i3) {
                            i6 = vl2Var.q(i6);
                            i7++;
                        }
                        int i8 = i5 - i7;
                        int i9 = i;
                        for (int i10 = 0; i10 < i8; i10++) {
                            i9 = vl2Var.q(i9);
                        }
                        int i11 = i7 - i5;
                        int i12 = i2;
                        for (int i13 = 0; i13 < i11; i13++) {
                            i12 = vl2Var.q(i12);
                        }
                        i3 = i9;
                        for (int i14 = i12; i3 != i14; i14 = vl2Var.q(i14)) {
                            i3 = vl2Var.q(i3);
                        }
                    }
                }
            }
            while (i > 0 && i != i3) {
                if (!vl2Var.l(i)) {
                    this.M.a();
                }
                i = vl2Var.q(i);
            }
            p(i2, i3);
        }
        i3 = i;
        while (i > 0) {
            if (!vl2Var.l(i)) {
            }
            i = vl2Var.q(i);
        }
        p(i2, i3);
    }

    public final Object M() {
        boolean z = this.S;
        nj njVar = sz.a;
        if (!z) {
            Object m = this.G.m();
            if (!this.y || (m instanceof wz)) {
                return m instanceof s82 ? ((s82) m).a : m;
            }
        } else if (this.r) {
            b00.c("A call to createNode(), emitNode() or useNode() expected");
            return njVar;
        }
        return njVar;
    }

    public final void N(int i) {
        boolean l = this.G.l(i);
        tz tzVar = this.M;
        if (l) {
            tzVar.c();
            Object n = this.G.n(i);
            tzVar.c();
            tzVar.h.add(n);
        }
        O(this, i, l, 0);
        tzVar.c();
        if (l) {
            tzVar.a();
        }
    }

    public final boolean P(int i, boolean z) {
        if ((i & 1) == 0 && (this.S || this.y)) {
            if (this.P != null) {
                y();
                return true;
            }
        } else if (!z && B()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Q() {
        long rotateLeft;
        if (this.s.isEmpty()) {
            this.l = this.G.s() + this.l;
            return;
        }
        vl2 vl2Var = this.G;
        int g = vl2Var.g();
        int[] iArr = vl2Var.b;
        int i = vl2Var.g;
        Object p = i < vl2Var.h ? vl2Var.p(iArr, i) : null;
        Object f = vl2Var.f();
        int i2 = this.m;
        nj njVar = sz.a;
        if (p != null) {
            rotateLeft = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ (p instanceof Enum ? ((Enum) p).ordinal() : p.hashCode()), 3);
        } else {
            if (f != null && g == 207 && !f.equals(njVar)) {
                this.T = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ f.hashCode(), 3) ^ i2;
                W(null, (iArr[(vl2Var.g * 5) + 1] & 1073741824) != 0);
                I();
                vl2Var.e();
                if (p == null) {
                    if (p instanceof Enum) {
                        this.T = Long.rotateRight(Long.rotateRight(this.T, 3) ^ ((Enum) p).ordinal(), 3);
                        return;
                    } else {
                        this.T = Long.rotateRight(Long.rotateRight(this.T, 3) ^ p.hashCode(), 3);
                        return;
                    }
                }
                if (f == null || g != 207 || f.equals(njVar)) {
                    this.T = Long.rotateRight(g ^ Long.rotateRight(this.T ^ i2, 3), 3);
                    return;
                } else {
                    this.T = Long.rotateRight(Long.rotateRight(this.T ^ i2, 3) ^ f.hashCode(), 3);
                    return;
                }
            }
            rotateLeft = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ g, 3) ^ i2;
        }
        this.T = rotateLeft;
        W(null, (iArr[(vl2Var.g * 5) + 1] & 1073741824) != 0);
        I();
        vl2Var.e();
        if (p == null) {
        }
    }

    public final void R() {
        vl2 vl2Var = this.G;
        int i = vl2Var.i;
        this.l = i >= 0 ? vl2Var.b[(i * 5) + 1] & 67108863 : 0;
        vl2Var.t();
    }

    public final void S() {
        if (this.l != 0) {
            b00.c("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (this.S) {
            return;
        }
        n72 y = y();
        if (y != null) {
            int i = y.b;
            if ((i & 128) == 0) {
                y.b = i | 16;
            }
        }
        if (this.s.isEmpty()) {
            R();
        } else {
            I();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x014d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void T(int i, int i2, Object obj, Object obj2) {
        long rotateLeft;
        boolean z;
        s02 s02Var;
        s02 s02Var2;
        int i3;
        int i4;
        Object[] objArr;
        Object[] objArr2;
        int i5;
        int i6;
        int i7;
        boolean z2;
        int i8;
        Object obj3 = obj;
        if (this.r) {
            b00.c("A call to createNode(), emitNode() or useNode() expected");
        }
        int i9 = this.m;
        Object obj4 = sz.a;
        if (obj3 != null) {
            rotateLeft = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ (obj3 instanceof Enum ? ((Enum) obj3).ordinal() : obj3.hashCode()), 3);
        } else {
            if (obj2 != null && i == 207 && !obj2.equals(obj4)) {
                this.T = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ obj2.hashCode(), 3) ^ i9;
                if (obj3 == null) {
                    this.m++;
                }
                boolean z3 = i2 == 0;
                if (!this.S) {
                    this.G.k++;
                    zl2 zl2Var = this.I;
                    int i10 = zl2Var.t;
                    if (z3) {
                        zl2Var.P(i, obj4, obj4, true);
                    } else if (obj2 != null) {
                        if (obj3 == null) {
                            obj3 = obj4;
                        }
                        zl2Var.P(i, obj3, obj2, false);
                    } else {
                        if (obj3 == null) {
                            obj3 = obj4;
                        }
                        zl2Var.P(i, obj3, obj4, false);
                    }
                    s02 s02Var3 = this.j;
                    if (s02Var3 != null) {
                        int i11 = (-2) - i10;
                        a81 a81Var = new a81(-1, i, i11, -1);
                        s02Var3.e.h(i11, new pw0(-1, this.k - s02Var3.b, 0));
                        s02Var3.d.add(a81Var);
                    }
                    w(z3, null);
                    return;
                }
                boolean z4 = i2 == 1 && this.y;
                if (this.j == null) {
                    int g = this.G.g();
                    if (!z4 && g == i) {
                        vl2 vl2Var = this.G;
                        int i12 = vl2Var.g;
                        if (Intrinsics.b(obj3, i12 < vl2Var.h ? vl2Var.p(vl2Var.b, i12) : null)) {
                            W(obj2, z3);
                        }
                    }
                    vl2 vl2Var2 = this.G;
                    int[] iArr = vl2Var2.b;
                    ArrayList arrayList = new ArrayList();
                    if (vl2Var2.k <= 0) {
                        int i13 = vl2Var2.g;
                        while (i13 < vl2Var2.h) {
                            int i14 = i13 * 5;
                            int i15 = iArr[i14];
                            Object p = vl2Var2.p(iArr, i13);
                            int i16 = iArr[i14 + 1];
                            if ((i16 & 1073741824) != 0) {
                                z2 = z4;
                                i8 = 1;
                            } else {
                                z2 = z4;
                                i8 = i16 & 67108863;
                            }
                            arrayList.add(new a81(p, i15, i13, i8));
                            i13 += iArr[i14 + 3];
                            z4 = z2;
                        }
                    }
                    z = z4;
                    this.j = new s02(this.k, arrayList);
                    s02Var = this.j;
                    if (s02Var != null) {
                        ArrayList arrayList2 = s02Var.d;
                        zm1 zm1Var = s02Var.e;
                        int i17 = s02Var.b;
                        Object o61Var = obj3 != null ? new o61(Integer.valueOf(i), obj3) : Integer.valueOf(i);
                        tn1 tn1Var = ((um1) s02Var.f.getValue()).a;
                        Object g2 = tn1Var.g(o61Var);
                        if (g2 == null) {
                            g2 = null;
                        } else if (g2 instanceof jn1) {
                            jn1 jn1Var = (jn1) g2;
                            Object j = jn1Var.j(0);
                            if (jn1Var.g()) {
                                tn1Var.k(o61Var);
                            }
                            if (jn1Var.b == 1) {
                                tn1Var.m(o61Var, jn1Var.d());
                            }
                            g2 = j;
                        } else {
                            tn1Var.k(o61Var);
                        }
                        a81 a81Var2 = (a81) g2;
                        if (z || a81Var2 == null) {
                            this.G.k++;
                            this.S = true;
                            this.K = null;
                            if (this.I.w) {
                                zl2 d = this.H.d();
                                this.I = d;
                                d.L();
                                this.J = false;
                                this.K = null;
                            }
                            this.I.d();
                            zl2 zl2Var2 = this.I;
                            int i18 = zl2Var2.t;
                            if (z3) {
                                zl2Var2.P(i, obj4, obj4, true);
                                i3 = 0;
                            } else if (obj2 != null) {
                                if (obj != null) {
                                    obj4 = obj;
                                }
                                i3 = 0;
                                zl2Var2.P(i, obj4, obj2, false);
                            } else {
                                i3 = 0;
                                zl2Var2.P(i, obj == null ? obj4 : obj, obj4, false);
                            }
                            this.N = this.I.b(i18);
                            int i19 = (-2) - i18;
                            a81 a81Var3 = new a81(-1, i, i19, -1);
                            zm1Var.h(i19, new pw0(-1, this.k - i17, i3));
                            arrayList2.add(a81Var3);
                            s02Var2 = new s02(z3 ? i3 : this.k, new ArrayList());
                            w(z3, s02Var2);
                            return;
                        }
                        int i20 = a81Var2.c;
                        arrayList2.add(a81Var2);
                        pw0 pw0Var = (pw0) zm1Var.b(i20);
                        this.k = (pw0Var != null ? pw0Var.b : -1) + i17;
                        pw0 pw0Var2 = (pw0) zm1Var.b(i20);
                        int i21 = pw0Var2 != null ? pw0Var2.a : -1;
                        int i22 = s02Var.c;
                        int i23 = i21 - i22;
                        int i24 = 8;
                        if (i21 > i22) {
                            Object[] objArr3 = zm1Var.c;
                            long[] jArr = zm1Var.a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i25 = 0;
                                while (true) {
                                    long j2 = jArr[i25];
                                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i26 = 8 - ((~(i25 - length)) >>> 31);
                                        int i27 = 0;
                                        while (i27 < i26) {
                                            if ((j2 & 255) < 128) {
                                                i7 = i24;
                                                pw0 pw0Var3 = (pw0) objArr3[(i25 << 3) + i27];
                                                i6 = i23;
                                                int i28 = pw0Var3.a;
                                                if (i28 == i21) {
                                                    pw0Var3.a = i22;
                                                } else if (i22 <= i28 && i28 < i21) {
                                                    pw0Var3.a = i28 + 1;
                                                }
                                            } else {
                                                i6 = i23;
                                                i7 = i24;
                                            }
                                            j2 >>= i7;
                                            i27++;
                                            i23 = i6;
                                            i24 = i7;
                                        }
                                        i4 = i23;
                                        if (i26 != i24) {
                                            break;
                                        }
                                    } else {
                                        i4 = i23;
                                    }
                                    if (i25 == length) {
                                        break;
                                    }
                                    i25++;
                                    i23 = i4;
                                    i24 = 8;
                                }
                            } else {
                                i4 = i23;
                            }
                        } else {
                            i4 = i23;
                            if (i22 > i21) {
                                Object[] objArr4 = zm1Var.c;
                                long[] jArr2 = zm1Var.a;
                                int length2 = jArr2.length - 2;
                                if (length2 >= 0) {
                                    int i29 = 0;
                                    while (true) {
                                        long j3 = jArr2[i29];
                                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i30 = 8 - ((~(i29 - length2)) >>> 31);
                                            int i31 = 0;
                                            while (i31 < i30) {
                                                if ((j3 & 255) < 128) {
                                                    pw0 pw0Var4 = (pw0) objArr4[(i29 << 3) + i31];
                                                    int i32 = pw0Var4.a;
                                                    if (i32 == i21) {
                                                        pw0Var4.a = i22;
                                                    } else {
                                                        objArr2 = objArr4;
                                                        if (i21 + 1 <= i32 && i32 < i22) {
                                                            pw0Var4.a = i32 - 1;
                                                        }
                                                        j3 >>= 8;
                                                        i31++;
                                                        objArr4 = objArr2;
                                                    }
                                                }
                                                objArr2 = objArr4;
                                                j3 >>= 8;
                                                i31++;
                                                objArr4 = objArr2;
                                            }
                                            objArr = objArr4;
                                            if (i30 != 8) {
                                                break;
                                            }
                                        } else {
                                            objArr = objArr4;
                                        }
                                        if (i29 == length2) {
                                            break;
                                        }
                                        i29++;
                                        objArr4 = objArr;
                                    }
                                }
                            }
                        }
                        tz tzVar = this.M;
                        int i33 = tzVar.f;
                        a00 a00Var = tzVar.a;
                        tzVar.f = (i20 - a00Var.G.g) + i33;
                        this.G.r(i20);
                        if (i4 > 0) {
                            tzVar.d(false);
                            y31 y31Var = tzVar.d;
                            vl2 vl2Var3 = a00Var.G;
                            if (vl2Var3.c > 0 && y31Var.a(-2) != (i5 = vl2Var3.i)) {
                                if (!tzVar.c && tzVar.e) {
                                    tzVar.d(false);
                                    tzVar.b.s.Y(xv1.c);
                                    tzVar.c = true;
                                }
                                if (i5 > 0) {
                                    m6 a = vl2Var3.a(i5);
                                    y31Var.c(i5);
                                    tzVar.d(false);
                                    rw1 rw1Var = tzVar.b.s;
                                    rw1Var.Y(wv1.c);
                                    s03.M(rw1Var, 0, a);
                                    tzVar.c = true;
                                }
                            }
                            rw1 rw1Var2 = tzVar.b.s;
                            rw1Var2.Y(bw1.c);
                            rw1Var2.u[rw1Var2.v - rw1Var2.s[rw1Var2.t - 1].a] = i4;
                        }
                        W(obj2, z3);
                    }
                    s02Var2 = null;
                    w(z3, s02Var2);
                    return;
                }
                z = z4;
                s02Var = this.j;
                if (s02Var != null) {
                }
                s02Var2 = null;
                w(z3, s02Var2);
                return;
            }
            rotateLeft = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ i, 3) ^ i9;
        }
        this.T = rotateLeft;
        if (obj3 == null) {
        }
        if (i2 == 0) {
        }
        if (!this.S) {
        }
    }

    public final void U() {
        T(-127, 0, null, null);
    }

    public final void V(int i, hv1 hv1Var) {
        T(i, 0, hv1Var, null);
    }

    public final void W(Object obj, boolean z) {
        if (z) {
            vl2 vl2Var = this.G;
            if (vl2Var.k <= 0) {
                if ((vl2Var.b[(vl2Var.g * 5) + 1] & 1073741824) == 0) {
                    v32.a("Expected a node group");
                }
                vl2Var.u();
                return;
            }
            return;
        }
        if (obj != null && this.G.f() != obj) {
            tz tzVar = this.M;
            tzVar.getClass();
            tzVar.d(false);
            rw1 rw1Var = tzVar.b.s;
            rw1Var.Y(lw1.c);
            s03.M(rw1Var, 0, obj);
        }
        this.G.u();
    }

    public final void X(int i) {
        int i2;
        int i3;
        if (this.j != null) {
            T(i, 0, null, null);
            return;
        }
        if (this.r) {
            b00.c("A call to createNode(), emitNode() or useNode() expected");
        }
        this.T = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ i, 3) ^ this.m;
        this.m++;
        vl2 vl2Var = this.G;
        boolean z = this.S;
        nj njVar = sz.a;
        if (z) {
            vl2Var.k++;
            this.I.P(i, njVar, njVar, false);
            w(false, null);
            return;
        }
        if (vl2Var.g() == i && ((i3 = vl2Var.g) >= vl2Var.h || (vl2Var.b[(i3 * 5) + 1] & 536870912) == 0)) {
            vl2Var.u();
            w(false, null);
            return;
        }
        if (vl2Var.k <= 0 && (i2 = vl2Var.g) != vl2Var.h) {
            int i4 = this.k;
            J();
            this.M.e(i4, vl2Var.s());
            b00.a(this.s, i2, vl2Var.g);
        }
        vl2Var.k++;
        this.S = true;
        this.K = null;
        if (this.I.w) {
            zl2 d = this.H.d();
            this.I = d;
            d.L();
            this.J = false;
            this.K = null;
        }
        zl2 zl2Var = this.I;
        zl2Var.d();
        int i5 = zl2Var.t;
        zl2Var.P(i, njVar, njVar, false);
        this.N = zl2Var.b(i5);
        w(false, null);
    }

    public final void Y(int i) {
        T(i, 0, null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final a00 Z(int i) {
        n72 n72Var;
        boolean z;
        int i2;
        X(i);
        boolean z2 = this.S;
        ar0 ar0Var = this.g;
        ArrayList arrayList = this.E;
        k00 k00Var = this.h;
        if (z2) {
            n72 n72Var2 = new n72(k00Var);
            arrayList.add(n72Var2);
            j0(n72Var2);
            n72Var2.e = this.B;
            n72Var2.b &= -17;
            ar0Var.s();
            return this;
        }
        int i3 = this.G.i;
        ArrayList arrayList2 = this.s;
        int e = b00.e(i3, arrayList2);
        x41 x41Var = e >= 0 ? (x41) arrayList2.remove(e) : null;
        Object m = this.G.m();
        if (Intrinsics.b(m, sz.a)) {
            n72Var = new n72(k00Var);
            j0(n72Var);
        } else {
            m.getClass();
            n72Var = (n72) m;
        }
        if (x41Var == null) {
            int i4 = n72Var.b;
            boolean z3 = (i4 & 64) != 0;
            if (z3) {
                n72Var.b = i4 & (-65);
            }
            if (!z3) {
                z = false;
                int i5 = n72Var.b;
                n72Var.b = !z ? i5 | 8 : i5 & (-9);
                arrayList.add(n72Var);
                n72Var.e = this.B;
                n72Var.b &= -17;
                ar0Var.s();
                i2 = n72Var.b;
                if ((i2 & 256) != 0) {
                    n72Var.b = (i2 & (-257)) | 512;
                    rw1 rw1Var = this.M.b.s;
                    rw1Var.Y(jw1.c);
                    s03.M(rw1Var, 0, n72Var);
                    if (!this.y) {
                        int i6 = n72Var.b;
                        if ((i6 & 128) != 0) {
                            this.y = true;
                            n72Var.b = i6 | 1024;
                        }
                    }
                }
                return this;
            }
        }
        z = true;
        int i52 = n72Var.b;
        n72Var.b = !z ? i52 | 8 : i52 & (-9);
        arrayList.add(n72Var);
        n72Var.e = this.B;
        n72Var.b &= -17;
        ar0Var.s();
        i2 = n72Var.b;
        if ((i2 & 256) != 0) {
        }
        return this;
    }

    public final void a() {
        i();
        this.i.clear();
        this.n.b = 0;
        this.t.b = 0;
        this.x.b = 0;
        this.v = null;
        nm0 nm0Var = this.O;
        nm0Var.t.U();
        nm0Var.s.U();
        this.T = 0L;
        this.A = 0;
        this.r = false;
        this.S = false;
        this.y = false;
        this.F = false;
        this.z = -1;
        vl2 vl2Var = this.G;
        if (!vl2Var.f) {
            vl2Var.c();
        }
        if (this.I.w) {
            return;
        }
        x();
    }

    public final void a0(Object obj) {
        if (!this.S && this.G.g() == 207 && !Intrinsics.b(this.G.f(), obj) && this.z < 0) {
            this.z = this.G.g;
            this.y = true;
        }
        T(207, 0, null, obj);
    }

    public final void b(Object obj, Function2 function2) {
        if (this.S) {
            rw1 rw1Var = this.O.s;
            rw1Var.Y(mw1.c);
            s03.M(rw1Var, 0, obj);
            function2.getClass();
            s03.f(2, function2);
            s03.M(rw1Var, 1, function2);
            return;
        }
        tz tzVar = this.M;
        tzVar.b();
        rw1 rw1Var2 = tzVar.b.s;
        rw1Var2.Y(mw1.c);
        function2.getClass();
        s03.f(2, function2);
        s03.N(rw1Var2, 0, obj, 1, function2);
    }

    public final void b0() {
        T(125, 2, null, null);
        this.r = true;
    }

    public final boolean c(float f) {
        Object E = E();
        if ((E instanceof Float) && f == ((Number) E).floatValue()) {
            return false;
        }
        j0(Float.valueOf(f));
        return true;
    }

    public final void c0() {
        this.m = 0;
        this.G = this.c.c();
        T(100, 0, null, null);
        d00 d00Var = this.b;
        d00Var.o();
        v02 h = d00Var.h();
        this.x.c(this.w ? 1 : 0);
        this.w = f(h);
        this.K = null;
        if (!this.q) {
            this.q = d00Var.d();
        }
        if (!this.C) {
            this.C = d00Var.e();
        }
        if (this.C) {
            bp2 bp2Var = j00.a;
            bp2Var.getClass();
            h = h.g(bp2Var, new cp2(A()));
        }
        this.u = h;
        Set set = (Set) ll3.P(h, h31.a);
        if (set != null) {
            f00 f00Var = this.U;
            if (f00Var == null) {
                f00Var = new f00(this.h);
                this.U = f00Var;
            }
            set.add(f00Var);
            d00Var.l(set);
        }
        T(Long.hashCode(d00Var.f()), 0, null, null);
    }

    public final boolean d(int i) {
        Object E = E();
        if ((E instanceof Integer) && i == ((Number) E).intValue()) {
            return false;
        }
        j0(Integer.valueOf(i));
        return true;
    }

    public final boolean d0(n72 n72Var, Object obj) {
        m6 m6Var = n72Var.c;
        if (m6Var == null) {
            return false;
        }
        int a = this.G.a.a(m6Var);
        if (!this.F || a < this.G.g) {
            return false;
        }
        ArrayList arrayList = this.s;
        int e = b00.e(a, arrayList);
        if (e < 0) {
            int i = -(e + 1);
            if (!(obj instanceof ia0)) {
                obj = null;
            }
            arrayList.add(i, new x41(n72Var, a, obj));
            return true;
        }
        x41 x41Var = (x41) arrayList.get(e);
        if (!(obj instanceof ia0)) {
            x41Var.c = null;
            return true;
        }
        Object obj2 = x41Var.c;
        if (obj2 == null) {
            x41Var.c = obj;
            return true;
        }
        if (obj2 instanceof un1) {
            ((un1) obj2).a(obj);
            return true;
        }
        int i2 = pe2.a;
        un1 un1Var = new un1(2);
        un1Var.j(obj2);
        un1Var.j(obj);
        x41Var.c = un1Var;
        return true;
    }

    public final boolean e(long j) {
        Object E = E();
        if ((E instanceof Long) && j == ((Number) E).longValue()) {
            return false;
        }
        j0(Long.valueOf(j));
        return true;
    }

    public final void e0(tn1 tn1Var) {
        ArrayList arrayList = this.s;
        for (int f = qv.f(arrayList); -1 < f; f--) {
            x41 x41Var = (x41) arrayList.get(f);
            m6 m6Var = x41Var.a.c;
            if (m6Var == null || !m6Var.a()) {
                arrayList.remove(f);
            } else {
                int i = x41Var.b;
                int i2 = m6Var.a;
                if (i != i2) {
                    x41Var.b = i2;
                }
            }
        }
        Object[] objArr = tn1Var.b;
        Object[] objArr2 = tn1Var.c;
        long[] jArr = tn1Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128) {
                            int i6 = (i3 << 3) + i5;
                            Object obj = objArr[i6];
                            Object obj2 = objArr2[i6];
                            obj.getClass();
                            n72 n72Var = (n72) obj;
                            m6 m6Var2 = n72Var.c;
                            if (m6Var2 != null) {
                                int i7 = m6Var2.a;
                                if (obj2 == by1.r) {
                                    obj2 = null;
                                }
                                arrayList.add(new x41(n72Var, i7, obj2));
                            }
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    }
                }
                if (i3 == length) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        uv.n(arrayList, b00.f);
    }

    public final boolean f(Object obj) {
        if (Intrinsics.b(E(), obj)) {
            return false;
        }
        j0(obj);
        return true;
    }

    public final void f0(int i, int i2) {
        if (k0(i) != i2) {
            if (i < 0) {
                xm1 xm1Var = this.p;
                if (xm1Var == null) {
                    xm1Var = new xm1();
                    this.p = xm1Var;
                }
                xm1Var.f(i, i2);
                return;
            }
            int[] iArr = this.o;
            if (iArr == null) {
                int i3 = this.G.c;
                int[] iArr2 = new int[i3];
                Arrays.fill(iArr2, 0, i3, -1);
                this.o = iArr2;
                iArr = iArr2;
            }
            iArr[i] = i2;
        }
    }

    public final boolean g(boolean z) {
        Object E = E();
        if ((E instanceof Boolean) && z == ((Boolean) E).booleanValue()) {
            return false;
        }
        j0(Boolean.valueOf(z));
        return true;
    }

    public final void g0(int i, int i2) {
        int k0 = k0(i);
        if (k0 != i2) {
            int i3 = i2 - k0;
            ArrayList arrayList = this.i;
            int size = arrayList.size() - 1;
            while (i != -1) {
                int k02 = k0(i) + i3;
                f0(i, k02);
                int i4 = size;
                while (true) {
                    if (-1 < i4) {
                        s02 s02Var = (s02) arrayList.get(i4);
                        if (s02Var != null && s02Var.a(i, k02)) {
                            size = i4 - 1;
                            break;
                        }
                        i4--;
                    } else {
                        break;
                    }
                }
                vl2 vl2Var = this.G;
                if (i < 0) {
                    i = vl2Var.i;
                } else if (vl2Var.l(i)) {
                    return;
                } else {
                    i = this.G.q(i);
                }
            }
        }
    }

    public final boolean h(Object obj) {
        if (E() == obj) {
            return false;
        }
        j0(obj);
        return true;
    }

    public final v02 h0(v02 v02Var, v02 v02Var2) {
        v02Var.getClass();
        u02 u02Var = new u02(v02Var);
        u02Var.putAll(v02Var2);
        v02 e = u02Var.e();
        V(204, b00.d);
        E();
        j0(e);
        E();
        j0(v02Var2);
        q(false);
        return e;
    }

    public final void i() {
        this.j = null;
        this.k = 0;
        this.l = 0;
        this.T = 0L;
        this.r = false;
        tz tzVar = this.M;
        tzVar.c = false;
        tzVar.d.b = 0;
        tzVar.f = 0;
        tzVar.e = true;
        tzVar.g = 0;
        tzVar.h.clear();
        tzVar.i = -1;
        tzVar.j = -1;
        tzVar.k = -1;
        tzVar.l = 0;
        this.E.clear();
        this.o = null;
        this.p = null;
    }

    public final void i0(Object obj) {
        int i;
        vl2 vl2Var;
        int i2;
        zl2 zl2Var;
        if (obj instanceof r82) {
            r82 r82Var = (r82) obj;
            m6 m6Var = null;
            if (this.S) {
                zl2 zl2Var2 = this.I;
                int i3 = zl2Var2.t;
                if (i3 > zl2Var2.v + 1) {
                    int i4 = i3 - 1;
                    int D = zl2Var2.D(zl2Var2.b, i4);
                    while (true) {
                        i2 = i4;
                        i4 = D;
                        zl2Var = this.I;
                        if (i4 == zl2Var.v || i4 < 0) {
                            break;
                        } else {
                            D = zl2Var.D(zl2Var.b, i4);
                        }
                    }
                    m6Var = zl2Var.b(i2);
                }
            } else {
                vl2 vl2Var2 = this.G;
                int i5 = vl2Var2.g;
                if (i5 > vl2Var2.i + 1) {
                    int i6 = i5 - 1;
                    int q = vl2Var2.q(i6);
                    while (true) {
                        i = i6;
                        i6 = q;
                        vl2Var = this.G;
                        if (i6 == vl2Var.i || i6 < 0) {
                            break;
                        } else {
                            q = vl2Var.q(i6);
                        }
                    }
                    m6Var = vl2Var.a(i);
                }
            }
            s82 s82Var = new s82(r82Var, m6Var);
            if (this.S) {
                rw1 rw1Var = this.M.b.s;
                rw1Var.Y(dw1.c);
                s03.M(rw1Var, 0, s82Var);
            }
            this.d.add(obj);
            obj = s82Var;
        }
        j0(obj);
    }

    public final Object j(t52 t52Var) {
        return ll3.P(l(), t52Var);
    }

    public final void j0(Object obj) {
        if (this.S) {
            zl2 zl2Var = this.I;
            if (zl2Var.n <= 0 || zl2Var.i == zl2Var.k) {
                zl2Var.E(obj);
                return;
            }
            zm1 zm1Var = zl2Var.s;
            if (zm1Var == null) {
                zm1Var = new zm1();
            }
            zl2Var.s = zm1Var;
            int i = zl2Var.v;
            Object b = zm1Var.b(i);
            if (b == null) {
                b = new jn1();
                zm1Var.h(i, b);
            }
            ((jn1) b).a(obj);
            return;
        }
        vl2 vl2Var = this.G;
        boolean z = vl2Var.n;
        tz tzVar = this.M;
        if (!z) {
            m6 a = vl2Var.a(vl2Var.i);
            rw1 rw1Var = tzVar.b.s;
            rw1Var.Y(lv1.c);
            s03.N(rw1Var, 0, a, 1, obj);
            return;
        }
        int b2 = (vl2Var.l - yl2.b(vl2Var.b, vl2Var.i)) - 1;
        if (tzVar.a.G.i - tzVar.f >= 0) {
            tzVar.d(true);
            rw1 rw1Var2 = tzVar.b.s;
            rw1Var2.Y(yv1.g);
            s03.M(rw1Var2, 0, obj);
            rw1Var2.u[rw1Var2.v - rw1Var2.s[rw1Var2.t - 1].a] = b2;
            return;
        }
        vl2 vl2Var2 = this.G;
        m6 a2 = vl2Var2.a(vl2Var2.i);
        rw1 rw1Var3 = tzVar.b.s;
        rw1Var3.Y(yv1.f);
        s03.N(rw1Var3, 0, obj, 1, a2);
        rw1Var3.u[rw1Var3.v - rw1Var3.s[rw1Var3.t - 1].a] = b2;
    }

    public final void k(Function0 function0) {
        if (!this.r) {
            b00.c("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.r = false;
        if (!this.S) {
            b00.c("createNode() can only be called when inserting");
        }
        y31 y31Var = this.n;
        int i = y31Var.a[y31Var.b - 1];
        zl2 zl2Var = this.I;
        m6 b = zl2Var.b(zl2Var.v);
        this.l++;
        nm0 nm0Var = this.O;
        rw1 rw1Var = nm0Var.s;
        rw1Var.Y(yv1.d);
        s03.M(rw1Var, 0, function0);
        rw1Var.u[rw1Var.v - rw1Var.s[rw1Var.t - 1].a] = i;
        s03.M(rw1Var, 1, b);
        rw1 rw1Var2 = nm0Var.t;
        rw1Var2.Y(yv1.e);
        rw1Var2.u[rw1Var2.v - rw1Var2.s[rw1Var2.t - 1].a] = i;
        s03.M(rw1Var2, 0, b);
    }

    public final int k0(int i) {
        int i2;
        if (i >= 0) {
            int[] iArr = this.o;
            return (iArr == null || (i2 = iArr[i]) < 0) ? this.G.o(i) : i2;
        }
        xm1 xm1Var = this.p;
        if (xm1Var != null && xm1Var.c(i) >= 0) {
            int c = xm1Var.c(i);
            if (c >= 0) {
                return xm1Var.c[c];
            }
            ch2.k(in1.k(i, "Cannot find value for key "));
        }
        return 0;
    }

    public final v02 l() {
        v02 v02Var;
        v02 v02Var2 = this.K;
        if (v02Var2 != null) {
            return v02Var2;
        }
        int i = this.G.i;
        boolean z = this.S;
        hv1 hv1Var = b00.c;
        if (z && this.J) {
            int i2 = this.I.v;
            while (i2 > 0) {
                zl2 zl2Var = this.I;
                if (zl2Var.b[zl2Var.r(i2) * 5] == 202 && Intrinsics.b(this.I.s(i2), hv1Var)) {
                    Object q = this.I.q(i2);
                    q.getClass();
                    v02 v02Var3 = (v02) q;
                    this.K = v02Var3;
                    return v02Var3;
                }
                zl2 zl2Var2 = this.I;
                i2 = zl2Var2.D(zl2Var2.b, i2);
            }
        }
        if (this.G.c > 0) {
            while (i > 0) {
                if (this.G.i(i) == 202) {
                    vl2 vl2Var = this.G;
                    if (Intrinsics.b(vl2Var.p(vl2Var.b, i), hv1Var)) {
                        zm1 zm1Var = this.v;
                        if (zm1Var == null || (v02Var = (v02) zm1Var.b(i)) == null) {
                            vl2 vl2Var2 = this.G;
                            Object b = vl2Var2.b(vl2Var2.b, i);
                            b.getClass();
                            v02Var = (v02) b;
                        }
                        this.K = v02Var;
                        return v02Var;
                    }
                }
                i = this.G.q(i);
            }
        }
        v02 v02Var4 = this.u;
        this.K = v02Var4;
        return v02Var4;
    }

    public final void l0() {
        if (!this.r) {
            b00.c("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.r = false;
        if (this.S) {
            b00.c("useNode() called while inserting");
        }
        vl2 vl2Var = this.G;
        Object n = vl2Var.n(vl2Var.i);
        tz tzVar = this.M;
        tzVar.c();
        tzVar.h.add(n);
        if (this.y && (n instanceof gz)) {
            tzVar.b();
            tzVar.b.s.Y(ow1.c);
        }
    }

    public final List m() {
        RandomAccess randomAccess;
        if (!this.C) {
            return ah0.m;
        }
        ArrayList arrayList = new ArrayList();
        zl2 zl2Var = this.I;
        arrayList.addAll(s03.g(zl2Var, null, zl2Var.t, null));
        vl2 vl2Var = this.G;
        if (vl2Var.f || vl2Var.c == 0) {
            randomAccess = ah0.m;
        } else {
            j62 j62Var = new j62(vl2Var);
            int i = vl2Var.i;
            Object valueOf = Integer.valueOf(vl2Var.l - yl2.b(vl2Var.b, i));
            while (i >= 0) {
                j62Var.l(vl2Var.a.f(i), valueOf);
                valueOf = vl2Var.a(i);
                i = vl2Var.q(i);
            }
            randomAccess = (ArrayList) j62Var.m;
        }
        arrayList.addAll(randomAccess);
        arrayList.addAll(F());
        return arrayList;
    }

    public final void n(boolean z) {
        if (this.l != 0) {
            b00.c("No nodes can be emitted before calling dactivateToEndGroup");
        }
        if (this.S) {
            return;
        }
        if (!z) {
            R();
            return;
        }
        vl2 vl2Var = this.G;
        int i = vl2Var.g;
        int i2 = vl2Var.h;
        tz tzVar = this.M;
        tzVar.getClass();
        tzVar.d(false);
        tzVar.b.s.Y(pv1.c);
        b00.a(this.s, i, i2);
        this.G.t();
    }

    public final void o(tn1 tn1Var, Function2 function2) {
        ArrayList arrayList = this.s;
        if (this.F) {
            b00.c("Reentrant composition is not supported");
        }
        this.g.s();
        Trace.beginSection("Compose:recompose");
        try {
            this.B = Long.hashCode(tm2.k().g());
            this.v = null;
            e0(tn1Var);
            this.k = 0;
            this.F = true;
            try {
                c0();
                Object E = E();
                if (E != function2 && function2 != null) {
                    j0(function2);
                }
                yz yzVar = this.D;
                eo1 d = ij2.d();
                try {
                    d.b(yzVar);
                    hv1 hv1Var = b00.a;
                    if (function2 != null) {
                        V(200, hv1Var);
                        l41.J(this, function2);
                        q(false);
                    } else if (!this.w || E == null || E.equals(sz.a)) {
                        Q();
                    } else {
                        V(200, hv1Var);
                        s03.f(2, E);
                        l41.J(this, (Function2) E);
                        q(false);
                    }
                    d.l(d.o - 1);
                    v();
                    this.F = false;
                    arrayList.clear();
                    if (!this.I.w) {
                        b00.c("Check failed");
                    }
                    x();
                    Unit unit = Unit.a;
                } catch (Throwable th) {
                    d.l(d.o - 1);
                    throw th;
                }
            } finally {
            }
        } finally {
            Trace.endSection();
        }
    }

    public final void p(int i, int i2) {
        if (i <= 0 || i == i2) {
            return;
        }
        p(this.G.q(i), i2);
        if (this.G.l(i)) {
            Object n = this.G.n(i);
            tz tzVar = this.M;
            tzVar.c();
            tzVar.h.add(n);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x05b3  */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v29, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v32 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q(boolean z) {
        long rotateRight;
        y31 y31Var;
        ArrayList arrayList;
        int i;
        boolean z2;
        int i2;
        vl2 vl2Var;
        s02 s02Var;
        ?? r3;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        y31 y31Var2;
        int i8;
        int i9;
        ArrayList arrayList2;
        LinkedHashSet linkedHashSet;
        int i10;
        int i11;
        ArrayList arrayList3;
        ArrayList arrayList4;
        HashSet hashSet;
        int i12;
        s02 s02Var2;
        int i13;
        Object[] objArr;
        long[] jArr;
        int i14;
        Object[] objArr2;
        long[] jArr2;
        int i15;
        Object[] objArr3;
        long[] jArr3;
        int i16;
        Object[] objArr4;
        long[] jArr4;
        long rotateRight2;
        y31 y31Var3 = this.n;
        int i17 = y31Var3.a[y31Var3.b - 2] - 1;
        boolean z3 = this.S;
        nj njVar = sz.a;
        if (z3) {
            zl2 zl2Var = this.I;
            int i18 = zl2Var.v;
            int i19 = zl2Var.b[zl2Var.r(i18) * 5];
            Object s = this.I.s(i18);
            Object q = this.I.q(i18);
            if (s != null) {
                rotateRight2 = Long.rotateRight(this.T, 3) ^ (s instanceof Enum ? ((Enum) s).ordinal() : s.hashCode());
            } else if (q == null || i19 != 207 || q.equals(njVar)) {
                rotateRight2 = Long.rotateRight(this.T ^ i17, 3) ^ i19;
            } else {
                this.T = Long.rotateRight(Long.rotateRight(this.T ^ i17, 3) ^ q.hashCode(), 3);
            }
            this.T = Long.rotateRight(rotateRight2, 3);
        } else {
            vl2 vl2Var2 = this.G;
            int i20 = vl2Var2.i;
            int i21 = vl2Var2.i(i20);
            vl2 vl2Var3 = this.G;
            Object p = vl2Var3.p(vl2Var3.b, i20);
            vl2 vl2Var4 = this.G;
            Object b = vl2Var4.b(vl2Var4.b, i20);
            if (p != null) {
                rotateRight = Long.rotateRight(this.T, 3) ^ (p instanceof Enum ? ((Enum) p).ordinal() : p.hashCode());
            } else if (b == null || i21 != 207 || b.equals(njVar)) {
                rotateRight = Long.rotateRight(this.T ^ i17, 3) ^ i21;
            } else {
                this.T = Long.rotateRight(Long.rotateRight(this.T ^ i17, 3) ^ b.hashCode(), 3);
            }
            this.T = Long.rotateRight(rotateRight, 3);
        }
        int i22 = this.l;
        s02 s02Var3 = this.j;
        ArrayList arrayList5 = this.s;
        tz tzVar = this.M;
        if (s02Var3 != null) {
            zm1 zm1Var = s02Var3.e;
            int i23 = s02Var3.b;
            ArrayList arrayList6 = s02Var3.a;
            if (arrayList6.size() > 0) {
                ArrayList arrayList7 = s02Var3.d;
                HashSet hashSet2 = new HashSet(arrayList7.size());
                int size = arrayList7.size();
                for (int i24 = 0; i24 < size; i24++) {
                    hashSet2.add(arrayList7.get(i24));
                }
                i = -1;
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                int size2 = arrayList7.size();
                int size3 = arrayList6.size();
                int i25 = 0;
                int i26 = 0;
                int i27 = 0;
                while (i25 < size3) {
                    a81 a81Var = (a81) arrayList6.get(i25);
                    if (hashSet2.contains(a81Var)) {
                        y31Var2 = y31Var3;
                        i8 = i25;
                        if (!linkedHashSet2.contains(a81Var)) {
                            int i28 = i26;
                            if (i28 < size2) {
                                a81 a81Var2 = (a81) arrayList7.get(i28);
                                if (a81Var2 != a81Var) {
                                    pw0 pw0Var = (pw0) zm1Var.b(a81Var2.c);
                                    int i29 = pw0Var != null ? pw0Var.b : -1;
                                    linkedHashSet2.add(a81Var2);
                                    i9 = i28;
                                    i12 = i27;
                                    s02Var2 = s02Var3;
                                    if (i29 != i12) {
                                        pw0 pw0Var2 = (pw0) zm1Var.b(a81Var2.c);
                                        int i30 = pw0Var2 != null ? pw0Var2.c : a81Var2.d;
                                        linkedHashSet = linkedHashSet2;
                                        int i31 = i29 + i23;
                                        i10 = size2;
                                        int i32 = i12 + i23;
                                        if (i30 > 0) {
                                            i11 = i23;
                                            int i33 = tzVar.l;
                                            if (i33 > 0) {
                                                arrayList3 = arrayList6;
                                                if (tzVar.j == i31 - i33 && tzVar.k == i32 - i33) {
                                                    tzVar.l = i33 + i30;
                                                }
                                            } else {
                                                arrayList3 = arrayList6;
                                            }
                                            tzVar.c();
                                            tzVar.j = i31;
                                            tzVar.k = i32;
                                            tzVar.l = i30;
                                        } else {
                                            i11 = i23;
                                            arrayList3 = arrayList6;
                                            tzVar.getClass();
                                        }
                                        if (i29 > i12) {
                                            Object[] objArr5 = zm1Var.c;
                                            long[] jArr5 = zm1Var.a;
                                            int length = jArr5.length - 2;
                                            if (length >= 0) {
                                                arrayList4 = arrayList7;
                                                hashSet = hashSet2;
                                                int i34 = 0;
                                                while (true) {
                                                    long j = jArr5[i34];
                                                    int i35 = i30;
                                                    arrayList2 = arrayList5;
                                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i36 = 8 - ((~(i34 - length)) >>> 31);
                                                        int i37 = 0;
                                                        while (i37 < i36) {
                                                            if ((j & 255) < 128) {
                                                                i16 = i37;
                                                                pw0 pw0Var3 = (pw0) objArr5[(i34 << 3) + i37];
                                                                objArr4 = objArr5;
                                                                int i38 = pw0Var3.b;
                                                                jArr4 = jArr5;
                                                                if (i29 <= i38 && i38 < i29 + i35) {
                                                                    pw0Var3.b = (i38 - i29) + i12;
                                                                } else if (i12 <= i38 && i38 < i29) {
                                                                    pw0Var3.b = i38 + i35;
                                                                }
                                                            } else {
                                                                i16 = i37;
                                                                objArr4 = objArr5;
                                                                jArr4 = jArr5;
                                                            }
                                                            j >>= 8;
                                                            i37 = i16 + 1;
                                                            objArr5 = objArr4;
                                                            jArr5 = jArr4;
                                                        }
                                                        objArr3 = objArr5;
                                                        jArr3 = jArr5;
                                                        if (i36 != 8) {
                                                            break;
                                                        }
                                                    } else {
                                                        objArr3 = objArr5;
                                                        jArr3 = jArr5;
                                                    }
                                                    if (i34 == length) {
                                                        break;
                                                    }
                                                    i34++;
                                                    arrayList5 = arrayList2;
                                                    i30 = i35;
                                                    objArr5 = objArr3;
                                                    jArr5 = jArr3;
                                                }
                                            } else {
                                                arrayList2 = arrayList5;
                                            }
                                        } else {
                                            int i39 = i30;
                                            arrayList2 = arrayList5;
                                            arrayList4 = arrayList7;
                                            hashSet = hashSet2;
                                            if (i12 > i29) {
                                                Object[] objArr6 = zm1Var.c;
                                                long[] jArr6 = zm1Var.a;
                                                int length2 = jArr6.length - 2;
                                                if (length2 >= 0) {
                                                    int i40 = 0;
                                                    while (true) {
                                                        long j2 = jArr6[i40];
                                                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                            int i41 = 8 - ((~(i40 - length2)) >>> 31);
                                                            int i42 = 0;
                                                            while (i42 < i41) {
                                                                if ((j2 & 255) < 128) {
                                                                    objArr2 = objArr6;
                                                                    pw0 pw0Var4 = (pw0) objArr6[(i40 << 3) + i42];
                                                                    jArr2 = jArr6;
                                                                    int i43 = pw0Var4.b;
                                                                    i15 = i29;
                                                                    if (i29 <= i43 && i43 < i15 + i39) {
                                                                        pw0Var4.b = (i43 - i15) + i12;
                                                                    } else if (i15 + 1 <= i43 && i43 < i12) {
                                                                        pw0Var4.b = i43 - i39;
                                                                    }
                                                                } else {
                                                                    objArr2 = objArr6;
                                                                    jArr2 = jArr6;
                                                                    i15 = i29;
                                                                }
                                                                j2 >>= 8;
                                                                i42++;
                                                                jArr6 = jArr2;
                                                                objArr6 = objArr2;
                                                                i29 = i15;
                                                            }
                                                            objArr = objArr6;
                                                            jArr = jArr6;
                                                            i14 = i29;
                                                            if (i41 != 8) {
                                                                break;
                                                            }
                                                        } else {
                                                            objArr = objArr6;
                                                            jArr = jArr6;
                                                            i14 = i29;
                                                        }
                                                        if (i40 == length2) {
                                                            break;
                                                        }
                                                        i40++;
                                                        jArr6 = jArr;
                                                        objArr6 = objArr;
                                                        i29 = i14;
                                                    }
                                                }
                                            }
                                        }
                                        i13 = i8;
                                    } else {
                                        arrayList2 = arrayList5;
                                        linkedHashSet = linkedHashSet2;
                                        i10 = size2;
                                        i11 = i23;
                                        arrayList3 = arrayList6;
                                    }
                                    arrayList4 = arrayList7;
                                    hashSet = hashSet2;
                                    i13 = i8;
                                } else {
                                    i9 = i28;
                                    arrayList2 = arrayList5;
                                    linkedHashSet = linkedHashSet2;
                                    i10 = size2;
                                    i11 = i23;
                                    arrayList3 = arrayList6;
                                    arrayList4 = arrayList7;
                                    hashSet = hashSet2;
                                    i12 = i27;
                                    s02Var2 = s02Var3;
                                    i13 = i8 + 1;
                                }
                                i26 = i9 + 1;
                                pw0 pw0Var5 = (pw0) zm1Var.b(a81Var2.c);
                                int i44 = i12 + (pw0Var5 != null ? pw0Var5.c : a81Var2.d);
                                i25 = i13;
                                s02Var3 = s02Var2;
                                linkedHashSet2 = linkedHashSet;
                                size2 = i10;
                                i23 = i11;
                                arrayList6 = arrayList3;
                                arrayList7 = arrayList4;
                                hashSet2 = hashSet;
                                arrayList5 = arrayList2;
                                i27 = i44;
                                y31Var3 = y31Var2;
                            } else {
                                i26 = i28;
                                y31Var3 = y31Var2;
                                i25 = i8;
                            }
                        }
                    } else {
                        y31Var2 = y31Var3;
                        pw0 pw0Var6 = (pw0) zm1Var.b(a81Var.c);
                        int i45 = pw0Var6 != null ? pw0Var6.b : -1;
                        int i46 = a81Var.c;
                        i8 = i25;
                        tzVar.e(i45 + i23, a81Var.d);
                        s02Var3.a(i46, 0);
                        tzVar.f = (i46 - tzVar.a.G.g) + tzVar.f;
                        this.G.r(i46);
                        J();
                        this.G.s();
                        b00.a(arrayList5, i46, this.G.b[(i46 * 5) + 3] + i46);
                    }
                    i25 = i8 + 1;
                    y31Var3 = y31Var2;
                }
                y31Var = y31Var3;
                arrayList = arrayList5;
                tzVar.c();
                if (arrayList6.size() > 0) {
                    vl2 vl2Var5 = this.G;
                    tzVar.f = (vl2Var5.h - tzVar.a.G.g) + tzVar.f;
                    vl2Var5.t();
                }
                z2 = this.S;
                if (!z2) {
                    vl2 vl2Var6 = this.G;
                    int i47 = vl2Var6.m - vl2Var6.l;
                    if (i47 > 0) {
                        if (i47 > 0) {
                            tzVar.d(false);
                            y31 y31Var4 = tzVar.d;
                            vl2 vl2Var7 = tzVar.a.G;
                            if (vl2Var7.c > 0 && y31Var4.a(-2) != (i7 = vl2Var7.i)) {
                                if (!tzVar.c && tzVar.e) {
                                    tzVar.d(false);
                                    tzVar.b.s.Y(xv1.c);
                                    tzVar.c = true;
                                }
                                if (i7 > 0) {
                                    m6 a = vl2Var7.a(i7);
                                    y31Var4.c(i7);
                                    tzVar.d(false);
                                    rw1 rw1Var = tzVar.b.s;
                                    rw1Var.Y(wv1.c);
                                    s03.M(rw1Var, 0, a);
                                    tzVar.c = true;
                                }
                            }
                            rw1 rw1Var2 = tzVar.b.s;
                            rw1Var2.Y(kw1.c);
                            rw1Var2.u[rw1Var2.v - rw1Var2.s[rw1Var2.t - 1].a] = i47;
                        } else {
                            tzVar.getClass();
                        }
                    }
                }
                i2 = this.k;
                while (true) {
                    vl2Var = this.G;
                    if (vl2Var.k > 0 && (i6 = vl2Var.g) != vl2Var.h) {
                        J();
                        tzVar.e(i2, this.G.s());
                        b00.a(arrayList, i6, this.G.g);
                    }
                }
                if (z2) {
                    if (z) {
                        tzVar.a();
                    }
                    int i48 = tzVar.a.G.i;
                    y31 y31Var5 = tzVar.d;
                    int i49 = i;
                    if (y31Var5.a(i49) > i48) {
                        b00.c("Missed recording an endGroup");
                    }
                    if (y31Var5.a(i49) == i48) {
                        tzVar.d(false);
                        y31Var5.b();
                        tzVar.b.s.Y(tv1.c);
                    }
                    int i50 = this.G.i;
                    if (i22 != k0(i50)) {
                        g0(i50, i22);
                    }
                    if (z) {
                        i22 = 1;
                    }
                    this.G.e();
                    tzVar.c();
                } else {
                    if (z) {
                        nm0 nm0Var = this.O;
                        rw1 rw1Var3 = nm0Var.t;
                        if (!rw1Var3.X()) {
                            b00.c("Cannot end node insertion, there are no pending operations that can be realized.");
                        }
                        rw1 rw1Var4 = nm0Var.s;
                        pw1[] pw1VarArr = rw1Var3.s;
                        int i51 = rw1Var3.t - 1;
                        rw1Var3.t = i51;
                        pw1 pw1Var = pw1VarArr[i51];
                        pw1VarArr[i51] = null;
                        rw1Var4.Y(pw1Var);
                        Object[] objArr7 = rw1Var3.w;
                        Object[] objArr8 = rw1Var4.w;
                        int i52 = rw1Var4.x;
                        int i53 = pw1Var.b;
                        int i54 = rw1Var3.x;
                        int i55 = i54 - i53;
                        System.arraycopy(objArr7, i55, objArr8, i52 - i53, i54 - i55);
                        Object[] objArr9 = rw1Var3.w;
                        int i56 = rw1Var3.x;
                        Arrays.fill(objArr9, i56 - i53, i56, (Object) null);
                        int[] iArr = rw1Var3.u;
                        int[] iArr2 = rw1Var4.u;
                        int i57 = rw1Var4.v;
                        int i58 = pw1Var.a;
                        int i59 = rw1Var3.v;
                        ni.d(i57 - i58, i59 - i58, i59, iArr, iArr2);
                        rw1Var3.x -= i53;
                        rw1Var3.v -= i58;
                        i22 = 1;
                    }
                    if (this.G.k <= 0) {
                        v32.a("Unbalanced begin/end empty");
                    }
                    r4.k--;
                    zl2 zl2Var2 = this.I;
                    int i60 = zl2Var2.v;
                    zl2Var2.j();
                    if (this.G.k <= 0) {
                        int i61 = (-2) - i60;
                        this.I.k();
                        this.I.e(true);
                        m6 m6Var = this.N;
                        boolean W = this.O.s.W();
                        wl2 wl2Var = this.H;
                        if (W) {
                            tzVar.b();
                            tzVar.d(false);
                            y31 y31Var6 = tzVar.d;
                            vl2 vl2Var8 = tzVar.a.G;
                            if (vl2Var8.c > 0 && y31Var6.a(-2) != (i5 = vl2Var8.i)) {
                                if (!tzVar.c && tzVar.e) {
                                    tzVar.d(false);
                                    tzVar.b.s.Y(xv1.c);
                                    tzVar.c = true;
                                }
                                if (i5 > 0) {
                                    m6 a2 = vl2Var8.a(i5);
                                    y31Var6.c(i5);
                                    tzVar.d(false);
                                    rw1 rw1Var5 = tzVar.b.s;
                                    rw1Var5.Y(wv1.c);
                                    s03.M(rw1Var5, 0, a2);
                                    i4 = 1;
                                    tzVar.c = true;
                                    tzVar.c();
                                    rw1 rw1Var6 = tzVar.b.s;
                                    rw1Var6.Y(zv1.c);
                                    s03.N(rw1Var6, 0, m6Var, i4, wl2Var);
                                    r3 = 0;
                                }
                            }
                            i4 = 1;
                            tzVar.c();
                            rw1 rw1Var62 = tzVar.b.s;
                            rw1Var62.Y(zv1.c);
                            s03.N(rw1Var62, 0, m6Var, i4, wl2Var);
                            r3 = 0;
                        } else {
                            nm0 nm0Var2 = this.O;
                            tzVar.b();
                            tzVar.d(false);
                            y31 y31Var7 = tzVar.d;
                            vl2 vl2Var9 = tzVar.a.G;
                            if (vl2Var9.c > 0 && y31Var7.a(-2) != (i3 = vl2Var9.i)) {
                                if (!tzVar.c && tzVar.e) {
                                    tzVar.d(false);
                                    tzVar.b.s.Y(xv1.c);
                                    tzVar.c = true;
                                }
                                if (i3 > 0) {
                                    m6 a3 = vl2Var9.a(i3);
                                    y31Var7.c(i3);
                                    tzVar.d(false);
                                    rw1 rw1Var7 = tzVar.b.s;
                                    rw1Var7.Y(wv1.c);
                                    s03.M(rw1Var7, 0, a3);
                                    tzVar.c = true;
                                }
                            }
                            tzVar.c();
                            rw1 rw1Var8 = tzVar.b.s;
                            rw1Var8.Y(aw1.c);
                            int i62 = rw1Var8.x - rw1Var8.s[rw1Var8.t - 1].b;
                            Object[] objArr10 = rw1Var8.w;
                            objArr10[i62] = m6Var;
                            objArr10[i62 + 1] = wl2Var;
                            objArr10[i62 + 2] = nm0Var2;
                            this.O = new nm0();
                            r3 = 0;
                        }
                        this.S = r3;
                        if (this.c.n != 0) {
                            f0(i61, r3);
                            g0(i61, i22);
                        }
                    }
                }
                s02Var = (s02) this.i.remove(r3.size() - 1);
                if (s02Var != null && !z2) {
                    s02Var.c++;
                }
                this.j = s02Var;
                this.k = y31Var.b() + i22;
                this.m = y31Var.b();
                this.l = y31Var.b() + i22;
            }
        }
        y31Var = y31Var3;
        arrayList = arrayList5;
        i = -1;
        z2 = this.S;
        if (!z2) {
        }
        i2 = this.k;
        while (true) {
            vl2Var = this.G;
            if (vl2Var.k > 0) {
                break;
            }
            J();
            tzVar.e(i2, this.G.s());
            b00.a(arrayList, i6, this.G.g);
        }
        if (z2) {
        }
        s02Var = (s02) this.i.remove(r3.size() - 1);
        if (s02Var != null) {
            s02Var.c++;
        }
        this.j = s02Var;
        this.k = y31Var.b() + i22;
        this.m = y31Var.b();
        this.l = y31Var.b() + i22;
    }

    public final void r() {
        q(false);
        n72 y = y();
        if (y != null) {
            int i = y.b;
            if ((i & 1) != 0) {
                y.b = i | 2;
            }
        }
    }

    public final n72 s() {
        n72 n72Var;
        m6 a;
        Function1 function1;
        ArrayList arrayList = this.E;
        final n72 n72Var2 = !arrayList.isEmpty() ? (n72) arrayList.remove(arrayList.size() - 1) : null;
        if (n72Var2 != null) {
            n72Var2.b &= -9;
            this.g.s();
            final int i = this.B;
            final hn1 hn1Var = n72Var2.f;
            if (hn1Var != null && (n72Var2.b & 16) == 0) {
                Object[] objArr = hn1Var.b;
                int[] iArr = hn1Var.c;
                long[] jArr = hn1Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    loop0: while (true) {
                        long j = jArr[i2];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            for (int i4 = 0; i4 < i3; i4++) {
                                if ((j & 255) < 128) {
                                    int i5 = (i2 << 3) + i4;
                                    Object obj = objArr[i5];
                                    if (iArr[i5] != i) {
                                        function1 = new Function1() { // from class: m72
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                c00 c00Var;
                                                c00 c00Var2;
                                                int i6;
                                                c00 c00Var3 = (c00) obj2;
                                                n72 n72Var3 = n72.this;
                                                int i7 = n72Var3.e;
                                                int i8 = i;
                                                if (i7 == i8) {
                                                    hn1 hn1Var2 = n72Var3.f;
                                                    hn1 hn1Var3 = hn1Var;
                                                    if (Intrinsics.b(hn1Var3, hn1Var2) && (c00Var3 instanceof k00)) {
                                                        long[] jArr2 = hn1Var3.a;
                                                        int length2 = jArr2.length - 2;
                                                        if (length2 >= 0) {
                                                            int i9 = 0;
                                                            while (true) {
                                                                long j2 = jArr2[i9];
                                                                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                    int i10 = 8;
                                                                    int i11 = 8 - ((~(i9 - length2)) >>> 31);
                                                                    int i12 = 0;
                                                                    while (i12 < i11) {
                                                                        if ((255 & j2) < 128) {
                                                                            int i13 = (i9 << 3) + i12;
                                                                            Object obj3 = hn1Var3.b[i13];
                                                                            boolean z = hn1Var3.c[i13] != i8;
                                                                            if (z) {
                                                                                k00 k00Var = (k00) c00Var3;
                                                                                i6 = i10;
                                                                                tn1 tn1Var = k00Var.s;
                                                                                z71.M(tn1Var, obj3, n72Var3);
                                                                                c00Var2 = c00Var3;
                                                                                if (obj3 instanceof ia0) {
                                                                                    ia0 ia0Var = (ia0) obj3;
                                                                                    if (!tn1Var.c(ia0Var)) {
                                                                                        z71.N(k00Var.v, ia0Var);
                                                                                    }
                                                                                    tn1 tn1Var2 = n72Var3.g;
                                                                                    if (tn1Var2 != null) {
                                                                                        tn1Var2.k(obj3);
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                c00Var2 = c00Var3;
                                                                                i6 = i10;
                                                                            }
                                                                            if (z) {
                                                                                hn1Var3.g(i13);
                                                                            }
                                                                        } else {
                                                                            c00Var2 = c00Var3;
                                                                            i6 = i10;
                                                                        }
                                                                        j2 >>= i6;
                                                                        i12++;
                                                                        i10 = i6;
                                                                        c00Var3 = c00Var2;
                                                                    }
                                                                    c00Var = c00Var3;
                                                                    if (i11 != i10) {
                                                                        break;
                                                                    }
                                                                } else {
                                                                    c00Var = c00Var3;
                                                                }
                                                                if (i9 == length2) {
                                                                    break;
                                                                }
                                                                i9++;
                                                                c00Var3 = c00Var;
                                                            }
                                                        }
                                                    }
                                                }
                                                return Unit.a;
                                            }
                                        };
                                        break loop0;
                                    }
                                }
                                j >>= 8;
                            }
                            if (i3 != 8) {
                                break;
                            }
                        }
                        if (i2 == length) {
                            break;
                        }
                        i2++;
                    }
                }
            }
            function1 = null;
            tz tzVar = this.M;
            if (function1 != null) {
                rw1 rw1Var = tzVar.b.s;
                rw1Var.Y(sv1.c);
                s03.N(rw1Var, 0, function1, 1, this.h);
            }
            int i6 = n72Var2.b;
            if ((i6 & 512) != 0) {
                n72Var2.b = i6 & (-513);
                rw1 rw1Var2 = tzVar.b.s;
                rw1Var2.Y(vv1.c);
                s03.M(rw1Var2, 0, n72Var2);
                int i7 = n72Var2.b;
                n72Var2.b = i7 & (-129);
                if ((i7 & 1024) != 0) {
                    n72Var2.b = i7 & (-1153);
                    this.y = false;
                }
            }
        }
        if (n72Var2 != null) {
            int i8 = n72Var2.b;
            if ((i8 & 16) == 0 && ((i8 & 1) != 0 || this.q)) {
                if (n72Var2.c == null) {
                    if (this.S) {
                        zl2 zl2Var = this.I;
                        a = zl2Var.b(zl2Var.v);
                    } else {
                        vl2 vl2Var = this.G;
                        a = vl2Var.a(vl2Var.i);
                    }
                    n72Var2.c = a;
                }
                n72Var2.b &= -5;
                n72Var = n72Var2;
                q(false);
                return n72Var;
            }
        }
        n72Var = null;
        q(false);
        return n72Var;
    }

    public final void t() {
        if (this.y && this.G.i == this.z) {
            this.z = -1;
            this.y = false;
        }
        q(false);
    }

    public final void u() {
        if (this.F || this.z != 100) {
            v32.a("Cannot disable reuse from root if it was caused by other groups");
        }
        this.z = -1;
        this.y = false;
    }

    public final void v() {
        q(false);
        this.b.b();
        q(false);
        tz tzVar = this.M;
        if (tzVar.c) {
            tzVar.d(false);
            tzVar.d(false);
            tzVar.b.s.Y(tv1.c);
            tzVar.c = false;
        }
        tzVar.b();
        if (tzVar.d.b != 0) {
            b00.c("Missed recording an endGroup()");
        }
        if (!this.i.isEmpty()) {
            b00.c("Start/end imbalance");
        }
        i();
        this.G.c();
        this.w = this.x.b() != 0;
    }

    public final void w(boolean z, s02 s02Var) {
        this.i.add(this.j);
        this.j = s02Var;
        int i = this.l;
        y31 y31Var = this.n;
        y31Var.c(i);
        y31Var.c(this.m);
        y31Var.c(this.k);
        if (z) {
            this.k = 0;
        }
        this.l = 0;
        this.m = 0;
    }

    public final void x() {
        wl2 wl2Var = new wl2();
        if (this.C) {
            wl2Var.b();
        }
        if (this.b.c()) {
            wl2Var.w = new zm1();
        }
        this.H = wl2Var;
        zl2 d = wl2Var.d();
        d.e(true);
        this.I = d;
    }

    public final n72 y() {
        if (this.A != 0) {
            return null;
        }
        ArrayList arrayList = this.E;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (n72) arrayList.get(arrayList.size() - 1);
    }

    public final boolean z() {
        if (!B() || this.w) {
            return true;
        }
        n72 y = y();
        return (y == null || (y.b & 4) == 0) ? false : true;
    }
}
