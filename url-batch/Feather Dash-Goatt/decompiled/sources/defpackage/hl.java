package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class hl {
    public int A;
    public int B;
    public boolean C;
    public final gl D;
    public final ArrayList E;
    public boolean F;
    public za1 G;
    public ab1 H;
    public db1 I;
    public boolean J;
    public kw0 K;
    public dg L;
    public final cl M;
    public d3 N;
    public tz O;
    public na1 P;
    public final rl Q;
    public final CoroutineContext R;
    public boolean S;
    public long T;
    public pl U;
    public final mk1 a;
    public final ml b;
    public final ab1 c;
    public final yn0 d;
    public final dg e;
    public final dg f;
    public final s40 g;
    public final tl h;
    public gw0 j;
    public int k;
    public int l;
    public int m;
    public int[] o;
    public cn0 p;
    public boolean q;
    public boolean r;
    public en0 v;
    public boolean w;
    public boolean y;
    public final ArrayList i = new ArrayList();
    public final da0 n = new da0();
    public final ArrayList s = new ArrayList();
    public final da0 t = new da0();
    public kw0 u = kw0.k;
    public final da0 x = new da0();
    public int z = -1;

    public hl(mk1 mk1Var, ml mlVar, ab1 ab1Var, yn0 yn0Var, dg dgVar, dg dgVar2, s40 s40Var, tl tlVar) {
        this.a = mk1Var;
        this.b = mlVar;
        this.c = ab1Var;
        this.d = yn0Var;
        this.e = dgVar;
        this.f = dgVar2;
        this.g = s40Var;
        this.h = tlVar;
        this.C = mlVar.f() || mlVar.d();
        this.D = new gl(0, this);
        this.E = new ArrayList();
        za1 d = ab1Var.d();
        d.c();
        this.G = d;
        ab1 ab1Var2 = new ab1();
        if (mlVar.f()) {
            ab1Var2.b();
        }
        if (mlVar.d()) {
            ab1Var2.o = new en0();
        }
        this.H = ab1Var2;
        db1 e = ab1Var2.e();
        e.e(true);
        this.I = e;
        this.M = new cl(this, dgVar);
        za1 d2 = this.H.d();
        try {
            d3 a = d2.a(0);
            d2.c();
            this.N = a;
            this.O = new tz();
            this.Q = new rl(this);
            CoroutineContext j = mlVar.j();
            CoroutineContext z = z();
            this.R = j.i(z == null ? g.d : z);
        } catch (Throwable th) {
            d2.c();
            throw th;
        }
    }

    public static final int N(hl hlVar, int i, boolean z, int i2) {
        za1 za1Var = hlVar.G;
        if (za1Var.j(i)) {
            int i3 = za1Var.i(i);
            Object p = za1Var.p(za1Var.b, i);
            if (i3 == 206 && Intrinsics.a(p, kl.e)) {
                Object h = za1Var.h(i, 0);
                k21 k21Var = h instanceof k21 ? (k21) h : null;
                Object obj = k21Var != null ? k21Var.a : null;
                el elVar = obj instanceof el ? (el) obj : null;
                if (elVar != null) {
                    for (hl hlVar2 : elVar.d.e) {
                        ab1 ab1Var = hlVar2.c;
                        if (ab1Var.e > 0 && (ab1Var.d[1] & 67108864) != 0) {
                            tl tlVar = hlVar2.h;
                            synchronized (tlVar.h) {
                                tlVar.p();
                                vn0 vn0Var = tlVar.r;
                                tlVar.r = gb0.k();
                                try {
                                    tlVar.z.d0(vn0Var);
                                } finally {
                                }
                            }
                            dg dgVar = new dg();
                            hlVar2.L = dgVar;
                            za1 d = hlVar2.c.d();
                            try {
                                hlVar2.G = d;
                                cl clVar = hlVar2.M;
                                dg dgVar2 = clVar.b;
                                try {
                                    clVar.b = dgVar;
                                    hlVar2.M(0);
                                    cl clVar2 = hlVar2.M;
                                    clVar2.b();
                                    if (clVar2.c) {
                                        clVar2.b.a.D(ss0.c);
                                        if (clVar2.c) {
                                            clVar2.d(false);
                                            clVar2.d(false);
                                            clVar2.b.a.D(cs0.c);
                                            clVar2.c = false;
                                        }
                                    }
                                } finally {
                                }
                            } finally {
                                d.c();
                            }
                        }
                        hlVar.b.r(hlVar2.h);
                    }
                }
                return za1Var.o(i);
            }
            if (!za1Var.l(i)) {
                return za1Var.o(i);
            }
        } else if (za1Var.d(i)) {
            int i4 = za1Var.b[(i * 5) + 3] + i;
            int i5 = 0;
            for (int i6 = i + 1; i6 < i4; i6 += za1Var.b[(i6 * 5) + 3]) {
                boolean l = za1Var.l(i6);
                if (l) {
                    hlVar.M.c();
                    cl clVar3 = hlVar.M;
                    Object n = za1Var.n(i6);
                    clVar3.c();
                    clVar3.h.add(n);
                }
                i5 += N(hlVar, i6, l || z, l ? 0 : i2 + i5);
                if (l) {
                    hlVar.M.c();
                    hlVar.M.a();
                }
            }
            if (!za1Var.l(i)) {
                return i5;
            }
        } else if (!za1Var.l(i)) {
            return za1Var.o(i);
        }
        return 1;
    }

    public final boolean A() {
        i11 x;
        return (this.S || this.y || this.w || (x = x()) == null || (x.b & 8) != 0) ? false : true;
    }

    public final void B(ArrayList arrayList) {
        dg dgVar = this.f;
        cl clVar = this.M;
        dg dgVar2 = clVar.b;
        try {
            clVar.b = dgVar;
            dgVar.a.D(qs0.c);
            if (arrayList.size() <= 0) {
                clVar.b();
                clVar.b.a.D(ds0.c);
                clVar.f = 0;
            } else {
                Pair pair = (Pair) arrayList.get(0);
                xm0 xm0Var = (xm0) pair.d;
                xm0Var.getClass();
                throw null;
            }
        } finally {
            clVar.b = dgVar2;
        }
    }

    public final void C(kw0 kw0Var, Object obj) {
        S(126665345, null, 0, null);
        D();
        i0(obj);
        long j = this.T;
        try {
            this.T = 126665345L;
            if (this.S) {
                db1.z(this.I);
            }
            boolean z = (this.S || Intrinsics.a(this.G.f(), kw0Var)) ? false : true;
            if (z) {
                J(kw0Var);
            }
            S(202, kl.c, 0, kw0Var);
            this.K = null;
            this.w = z;
            throw null;
        } finally {
        }
    }

    public final Object D() {
        boolean z = this.S;
        j41 j41Var = bl.a;
        if (!z) {
            Object m = this.G.m();
            if (!this.y || (m instanceof p31)) {
                return m;
            }
        } else if (this.r) {
            kl.a("A call to createNode(), emitNode() or useNode() expected");
            return j41Var;
        }
        return j41Var;
    }

    public final List E() {
        ml mlVar = this.b;
        ll h = mlVar.h();
        tl tlVar = h != null ? (tl) h : null;
        if (tlVar == null) {
            return nv.d;
        }
        ab1 ab1Var = tlVar.j;
        za1 d = ab1Var.d();
        try {
            Integer F = uq1.F(d, mlVar, 0, d.c);
            if (F == null) {
                return nv.d;
            }
            d = ab1Var.d();
            try {
                ArrayList T = uq1.T(d, F.intValue(), 0);
                d.c();
                return CollectionsKt.u(T, tlVar.z.E());
            } finally {
            }
        } finally {
        }
    }

    public final int F(int i) {
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
    public final Object G(tl tlVar, tl tlVar2, Integer num, List list, Function0 function0) {
        Object invoke;
        boolean z = this.F;
        int i = this.k;
        try {
            this.F = true;
            this.k = 0;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Pair pair = (Pair) list.get(i2);
                i11 i11Var = (i11) pair.d;
                Object obj = pair.e;
                if (obj != null) {
                    c0(i11Var, obj);
                } else {
                    c0(i11Var, null);
                }
            }
            if (tlVar != null) {
                int intValue = num != null ? num.intValue() : -1;
                if (tlVar2 == null || tlVar2 == tlVar || intValue < 0) {
                    invoke = function0.invoke();
                } else {
                    tlVar.v = tlVar2;
                    tlVar.w = intValue;
                    try {
                        invoke = function0.invoke();
                        tlVar.v = null;
                        tlVar.w = 0;
                    } catch (Throwable th) {
                        tlVar.v = null;
                        tlVar.w = 0;
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
    public final void H() {
        va0 va0Var;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        long j;
        boolean z;
        ln0 ln0Var;
        long j2;
        int C;
        int i8;
        int hashCode;
        Object b;
        j41 j41Var = j41.o;
        boolean z2 = this.F;
        this.F = true;
        za1 za1Var = this.G;
        int i9 = za1Var.i;
        int i10 = (i9 * 5) + 3;
        int i11 = za1Var.b[i10] + i9;
        int i12 = this.k;
        long j3 = this.T;
        int i13 = this.l;
        int i14 = this.m;
        int i15 = za1Var.g;
        ArrayList arrayList = this.s;
        int C2 = la0.C(i15, arrayList);
        if (C2 < 0) {
            C2 = -(C2 + 1);
        }
        if (C2 < arrayList.size()) {
            va0Var = (va0) arrayList.get(C2);
        }
        va0Var = null;
        int i16 = 1;
        int i17 = i9;
        int i18 = 0;
        while (va0Var != null) {
            i11 i11Var = va0Var.a;
            int i19 = va0Var.b;
            j41 j41Var2 = j41Var;
            int C3 = la0.C(i19, arrayList);
            if (C3 >= 0) {
            }
            Object obj = va0Var.c;
            if (obj == null) {
                i11Var.getClass();
                i3 = i11;
                i = i10;
                i2 = i12;
            } else {
                int i20 = 8;
                vn0 vn0Var = i11Var.g;
                if (vn0Var == null) {
                    i3 = i11;
                    i = i10;
                    i2 = i12;
                } else {
                    i = i10;
                    if (obj instanceof xr) {
                        xr xrVar = (xr) obj;
                        vb1 vb1Var = xrVar.g;
                        if (vb1Var == null) {
                            vb1Var = j41Var2;
                        }
                        i2 = i12;
                        i6 = !vb1Var.b(xrVar.i().f, vn0Var.g(xrVar)) ? 1 : 0;
                        i3 = i11;
                        i4 = i13;
                        i5 = i14;
                    } else {
                        i2 = i12;
                        if (obj instanceof wn0) {
                            wn0 wn0Var = (wn0) obj;
                            if (wn0Var.h()) {
                                Object[] objArr = wn0Var.b;
                                long[] jArr = wn0Var.a;
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
                                                    if (!(obj2 instanceof xr)) {
                                                        break;
                                                    }
                                                    xr xrVar2 = (xr) obj2;
                                                    vb1 vb1Var2 = xrVar2.g;
                                                    if (vb1Var2 == null) {
                                                        vb1Var2 = j41Var2;
                                                    }
                                                    if (!vb1Var2.b(xrVar2.i().f, vn0Var.g(xrVar2))) {
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
                        K(i17, i24, i9);
                        int q = this.G.q(i24);
                        while (q != i9 && !this.G.l(q)) {
                            q = this.G.q(q);
                        }
                        int i25 = this.G.l(q) ? 0 : i2;
                        if (q != i24) {
                            int j0 = (j0(q) - this.G.o(i24)) + i25;
                            while (i25 < j0 && q != i19) {
                                q++;
                                while (q < i19) {
                                    za1 za1Var2 = this.G;
                                    int i26 = za1Var2.b[(q * 5) + 3] + q;
                                    if (i19 >= i26) {
                                        i25 += za1Var2.l(q) ? i16 : j0(q);
                                        q = i26;
                                    }
                                }
                                break;
                            }
                        }
                        this.k = i25;
                        this.m = F(i24);
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
                            za1 za1Var3 = this.G;
                            boolean k = za1Var3.k(q2);
                            int[] iArr = za1Var3.b;
                            if (k) {
                                Object p = za1Var3.p(iArr, q2);
                                if (p != null) {
                                    hashCode = p instanceof Enum ? ((Enum) p).ordinal() : p.hashCode();
                                    i8 = i24;
                                } else {
                                    i8 = i24;
                                    hashCode = 0;
                                }
                            } else {
                                int i29 = za1Var3.i(q2);
                                i8 = i24;
                                hashCode = (i29 != 207 || (b = za1Var3.b(iArr, q2)) == null || b.equals(bl.a)) ? i29 : b.hashCode();
                            }
                            if (hashCode == 126665345) {
                                j5 ^= Long.rotateLeft(hashCode, i28);
                                break;
                            }
                            j5 = (j5 ^ Long.rotateLeft(hashCode, i27)) ^ Long.rotateLeft(this.G.k(q2) ? 0 : F(q2), i28);
                            i27 = (i27 + 6) % 64;
                            i28 = (i28 + 6) % 64;
                            q2 = this.G.q(q2);
                            i24 = i8;
                        }
                        i8 = i24;
                        this.T = j5;
                        this.K = null;
                        Function2 function2 = i11Var.d;
                        if (function2 == null) {
                            dd0.j("Invalid restart scope");
                            return;
                        }
                        function2.b(this, Integer.valueOf(i16));
                        this.K = null;
                        za1 za1Var4 = this.G;
                        int i30 = za1Var4.b[i] + i9;
                        int i31 = za1Var4.g;
                        if (i31 < i9 || i31 > i30) {
                            kl.a("Index " + i9 + " is not a parent of " + i31);
                        }
                        za1Var4.i = i9;
                        za1Var4.h = i30;
                        za1Var4.l = 0;
                        za1Var4.m = 0;
                        z = z2;
                        i17 = i8;
                        i18 = i16;
                    } else {
                        ArrayList arrayList2 = this.E;
                        arrayList2.add(i11Var);
                        this.g.n();
                        tl tlVar = i11Var.a;
                        if (tlVar == null || (ln0Var = i11Var.f) == null) {
                            z = z2;
                        } else {
                            i11Var.d(i16);
                            try {
                                Object[] objArr3 = ln0Var.b;
                                int[] iArr2 = ln0Var.c;
                                long[] jArr2 = ln0Var.a;
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
                                                    tlVar.z(obj3);
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
                                i11Var.d(false);
                            } catch (Throwable th) {
                                i11Var.d(false);
                                throw th;
                            }
                        }
                        i16 = 1;
                        arrayList2.remove(arrayList2.size() - 1);
                    }
                    C = la0.C(this.G.g, arrayList);
                    if (C < 0) {
                        C = -(C + 1);
                    }
                    if (C >= arrayList.size()) {
                        va0 va0Var2 = (va0) arrayList.get(C);
                        i11 = i3;
                        if (va0Var2.b < i11) {
                            va0Var = va0Var2;
                            z2 = z;
                            j41Var = j41Var2;
                            i10 = i;
                            i12 = i2;
                            i13 = i4;
                            i14 = i5;
                        }
                    } else {
                        i11 = i3;
                    }
                    va0Var = null;
                    z2 = z;
                    j41Var = j41Var2;
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
            C = la0.C(this.G.g, arrayList);
            if (C < 0) {
            }
            if (C >= arrayList.size()) {
            }
            va0Var = null;
            z2 = z;
            j41Var = j41Var2;
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
            K(i17, i9, i9);
            this.G.t();
            int j02 = j0(i9);
            this.k = i37 + j02;
            this.l = i38 + j02;
            this.m = i39;
        } else {
            Q();
        }
        this.T = j3;
        this.F = z3;
    }

    public final void I() {
        int i;
        M(this.G.g);
        cl clVar = this.M;
        clVar.d(false);
        da0 da0Var = clVar.d;
        hl hlVar = clVar.a;
        za1 za1Var = hlVar.G;
        if (za1Var.c > 0 && da0Var.a(-2) != (i = za1Var.i)) {
            if (!clVar.c && clVar.e) {
                clVar.d(false);
                clVar.b.a.D(gs0.c);
                clVar.c = true;
            }
            if (i > 0) {
                d3 a = za1Var.a(i);
                da0Var.c(i);
                clVar.d(false);
                bt0 bt0Var = clVar.b.a;
                bt0Var.D(fs0.c);
                y90.D(bt0Var, 0, a);
                clVar.c = true;
            }
        }
        clVar.b.a.D(os0.c);
        int i2 = clVar.f;
        za1 za1Var2 = hlVar.G;
        clVar.f = za1Var2.b[(za1Var2.g * 5) + 3] + i2;
    }

    public final void J(kw0 kw0Var) {
        en0 en0Var = this.v;
        if (en0Var == null) {
            en0Var = new en0();
            this.v = en0Var;
        }
        en0Var.h(this.G.g, kw0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void K(int i, int i2, int i3) {
        za1 za1Var = this.G;
        if (i != i2) {
            if (i != i3 && i2 != i3) {
                if (za1Var.q(i) == i2) {
                    i3 = i2;
                } else if (za1Var.q(i2) != i) {
                    if (za1Var.q(i) == za1Var.q(i2)) {
                        i3 = za1Var.q(i);
                    } else {
                        int i4 = i;
                        int i5 = 0;
                        while (i4 > 0 && i4 != i3) {
                            i4 = za1Var.q(i4);
                            i5++;
                        }
                        int i6 = i2;
                        int i7 = 0;
                        while (i6 > 0 && i6 != i3) {
                            i6 = za1Var.q(i6);
                            i7++;
                        }
                        int i8 = i5 - i7;
                        int i9 = i;
                        for (int i10 = 0; i10 < i8; i10++) {
                            i9 = za1Var.q(i9);
                        }
                        int i11 = i7 - i5;
                        int i12 = i2;
                        for (int i13 = 0; i13 < i11; i13++) {
                            i12 = za1Var.q(i12);
                        }
                        i3 = i9;
                        for (int i14 = i12; i3 != i14; i14 = za1Var.q(i14)) {
                            i3 = za1Var.q(i3);
                        }
                    }
                }
            }
            while (i > 0 && i != i3) {
                if (!za1Var.l(i)) {
                    this.M.a();
                }
                i = za1Var.q(i);
            }
            o(i2, i3);
        }
        i3 = i;
        while (i > 0) {
            if (!za1Var.l(i)) {
            }
            i = za1Var.q(i);
        }
        o(i2, i3);
    }

    public final Object L() {
        boolean z = this.S;
        j41 j41Var = bl.a;
        if (!z) {
            Object m = this.G.m();
            if (!this.y || (m instanceof p31)) {
                return m instanceof k21 ? ((k21) m).a : m;
            }
        } else if (this.r) {
            kl.a("A call to createNode(), emitNode() or useNode() expected");
            return j41Var;
        }
        return j41Var;
    }

    public final void M(int i) {
        boolean l = this.G.l(i);
        cl clVar = this.M;
        if (l) {
            clVar.c();
            Object n = this.G.n(i);
            clVar.c();
            clVar.h.add(n);
        }
        N(this, i, l, 0);
        clVar.c();
        if (l) {
            clVar.a();
        }
    }

    public final boolean O(int i, boolean z) {
        i11 x;
        if ((i & 1) == 0 && (this.S || this.y)) {
            na1 na1Var = this.P;
            if (na1Var != null && (x = x()) != null && na1Var.a()) {
                int i2 = x.b;
                if ((i2 & 512) != 0) {
                    return true;
                }
                int i3 = i2 | 1;
                x.b = i3;
                x.b = (this.y ? i2 | 129 : i3 & (-129)) | 256;
                bt0 bt0Var = this.M.b.a;
                bt0Var.D(ns0.c);
                y90.D(bt0Var, 0, x);
                this.b.q(x);
                return false;
            }
        } else if (!z && A()) {
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
    public final void P() {
        long rotateLeft;
        if (this.s.isEmpty()) {
            this.l = this.G.s() + this.l;
            return;
        }
        za1 za1Var = this.G;
        int g = za1Var.g();
        int[] iArr = za1Var.b;
        int i = za1Var.g;
        Object p = i < za1Var.h ? za1Var.p(iArr, i) : null;
        Object f = za1Var.f();
        int i2 = this.m;
        j41 j41Var = bl.a;
        if (p != null) {
            rotateLeft = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ (p instanceof Enum ? ((Enum) p).ordinal() : p.hashCode()), 3);
        } else {
            if (f != null && g == 207 && !f.equals(j41Var)) {
                this.T = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ f.hashCode(), 3) ^ i2;
                V(null, (iArr[(za1Var.g * 5) + 1] & 1073741824) != 0);
                H();
                za1Var.e();
                if (p == null) {
                    if (p instanceof Enum) {
                        this.T = Long.rotateRight(Long.rotateRight(this.T, 3) ^ ((Enum) p).ordinal(), 3);
                        return;
                    } else {
                        this.T = Long.rotateRight(Long.rotateRight(this.T, 3) ^ p.hashCode(), 3);
                        return;
                    }
                }
                if (f == null || g != 207 || f.equals(j41Var)) {
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
        V(null, (iArr[(za1Var.g * 5) + 1] & 1073741824) != 0);
        H();
        za1Var.e();
        if (p == null) {
        }
    }

    public final void Q() {
        za1 za1Var = this.G;
        int i = za1Var.i;
        this.l = i >= 0 ? za1Var.b[(i * 5) + 1] & 67108863 : 0;
        za1Var.t();
    }

    public final void R() {
        if (this.l != 0) {
            kl.a("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (this.S) {
            return;
        }
        i11 x = x();
        if (x != null) {
            int i = x.b;
            if ((i & 128) == 0) {
                x.b = i | 16;
            }
        }
        if (this.s.isEmpty()) {
            Q();
        } else {
            H();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0143  */
    /* JADX WARN: Type inference failed for: r2v7, types: [db1] */
    /* JADX WARN: Type inference failed for: r30v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v46, types: [db1] */
    /* JADX WARN: Type inference failed for: r8v0, types: [j41, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void S(int i, sr0 sr0Var, int i2, Object obj) {
        long rotateLeft;
        boolean z;
        gw0 gw0Var;
        gw0 gw0Var2;
        int i3;
        int i4;
        Object[] objArr;
        Object[] objArr2;
        int i5;
        int i6;
        int i7;
        boolean z2;
        int i8;
        sr0 sr0Var2 = sr0Var;
        if (this.r) {
            kl.a("A call to createNode(), emitNode() or useNode() expected");
        }
        int i9 = this.m;
        ?? r8 = bl.a;
        if (sr0Var2 != null) {
            rotateLeft = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ sr0Var2.a.hashCode(), 3);
        } else {
            if (obj != 0 && i == 207 && !obj.equals(r8)) {
                this.T = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ obj.hashCode(), 3) ^ i9;
                if (sr0Var2 == null) {
                    this.m++;
                }
                boolean z3 = i2 == 0;
                if (!this.S) {
                    this.G.k++;
                    ?? r3 = this.I;
                    int i10 = r3.t;
                    if (z3) {
                        r3.Q(i, r8, r8, true);
                    } else if (obj != 0) {
                        if (sr0Var2 == null) {
                            sr0Var2 = r8;
                        }
                        r3.Q(i, sr0Var2, obj, false);
                    } else {
                        if (sr0Var2 == null) {
                            sr0Var2 = r8;
                        }
                        r3.Q(i, sr0Var2, r8, false);
                    }
                    gw0 gw0Var3 = this.j;
                    if (gw0Var3 != null) {
                        int i11 = (-2) - i10;
                        gc0 gc0Var = new gc0(-1, i, i11, -1);
                        gw0Var3.e.h(i11, new r50(-1, this.k - gw0Var3.b, 0));
                        gw0Var3.d.add(gc0Var);
                    }
                    u(z3, null);
                    return;
                }
                boolean z4 = i2 == 1 && this.y;
                if (this.j == null) {
                    int g = this.G.g();
                    if (!z4 && g == i) {
                        za1 za1Var = this.G;
                        int i12 = za1Var.g;
                        if (Intrinsics.a(sr0Var2, i12 < za1Var.h ? za1Var.p(za1Var.b, i12) : null)) {
                            V(obj, z3);
                        }
                    }
                    za1 za1Var2 = this.G;
                    int[] iArr = za1Var2.b;
                    ArrayList arrayList = new ArrayList();
                    if (za1Var2.k <= 0) {
                        int i13 = za1Var2.g;
                        while (i13 < za1Var2.h) {
                            int i14 = i13 * 5;
                            int i15 = iArr[i14];
                            Object p = za1Var2.p(iArr, i13);
                            int i16 = iArr[i14 + 1];
                            if ((i16 & 1073741824) != 0) {
                                z2 = z4;
                                i8 = 1;
                            } else {
                                z2 = z4;
                                i8 = i16 & 67108863;
                            }
                            arrayList.add(new gc0(p, i15, i13, i8));
                            i13 += iArr[i14 + 3];
                            z4 = z2;
                        }
                    }
                    z = z4;
                    this.j = new gw0(this.k, arrayList);
                    gw0Var = this.j;
                    if (gw0Var != null) {
                        ArrayList arrayList2 = gw0Var.d;
                        en0 en0Var = gw0Var.e;
                        int i17 = gw0Var.b;
                        Object rb0Var = sr0Var2 != null ? new rb0(Integer.valueOf(i), sr0Var2) : Integer.valueOf(i);
                        vn0 vn0Var = ((zm0) gw0Var.f.getValue()).a;
                        Object g2 = vn0Var.g(rb0Var);
                        if (g2 == null) {
                            g2 = null;
                        } else if (g2 instanceof mn0) {
                            mn0 mn0Var = (mn0) g2;
                            Object k = mn0Var.k(0);
                            if (mn0Var.h()) {
                                vn0Var.k(rb0Var);
                            }
                            if (mn0Var.b == 1) {
                                vn0Var.m(rb0Var, mn0Var.e());
                            }
                            g2 = k;
                        } else {
                            vn0Var.k(rb0Var);
                        }
                        gc0 gc0Var2 = (gc0) g2;
                        if (z || gc0Var2 == null) {
                            this.G.k++;
                            this.S = true;
                            this.K = null;
                            if (this.I.w) {
                                db1 e = this.H.e();
                                this.I = e;
                                e.M();
                                this.J = false;
                                this.K = null;
                            }
                            this.I.d();
                            ?? r2 = this.I;
                            int i18 = r2.t;
                            sr0 sr0Var3 = r8;
                            if (z3) {
                                r2.Q(i, r8, r8, true);
                                i3 = 0;
                            } else if (obj != 0) {
                                if (sr0Var != null) {
                                    sr0Var3 = sr0Var;
                                }
                                i3 = 0;
                                r2.Q(i, sr0Var3, obj, false);
                            } else {
                                i3 = 0;
                                r2.Q(i, sr0Var == null ? r8 : sr0Var, r8, false);
                            }
                            this.N = this.I.b(i18);
                            int i19 = (-2) - i18;
                            gc0 gc0Var3 = new gc0(-1, i, i19, -1);
                            en0Var.h(i19, new r50(-1, this.k - i17, i3));
                            arrayList2.add(gc0Var3);
                            gw0Var2 = new gw0(z3 ? i3 : this.k, new ArrayList());
                            u(z3, gw0Var2);
                            return;
                        }
                        int i20 = gc0Var2.c;
                        arrayList2.add(gc0Var2);
                        r50 r50Var = (r50) en0Var.b(i20);
                        this.k = (r50Var != null ? r50Var.b : -1) + i17;
                        r50 r50Var2 = (r50) en0Var.b(i20);
                        int i21 = r50Var2 != null ? r50Var2.a : -1;
                        int i22 = gw0Var.c;
                        int i23 = i21 - i22;
                        int i24 = 8;
                        if (i21 > i22) {
                            Object[] objArr3 = en0Var.c;
                            long[] jArr = en0Var.a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i25 = 0;
                                while (true) {
                                    long j = jArr[i25];
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i26 = 8 - ((~(i25 - length)) >>> 31);
                                        int i27 = 0;
                                        while (i27 < i26) {
                                            if ((j & 255) < 128) {
                                                i7 = i24;
                                                r50 r50Var3 = (r50) objArr3[(i25 << 3) + i27];
                                                i6 = i23;
                                                int i28 = r50Var3.a;
                                                if (i28 == i21) {
                                                    r50Var3.a = i22;
                                                } else if (i22 <= i28 && i28 < i21) {
                                                    r50Var3.a = i28 + 1;
                                                }
                                            } else {
                                                i6 = i23;
                                                i7 = i24;
                                            }
                                            j >>= i7;
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
                                Object[] objArr4 = en0Var.c;
                                long[] jArr2 = en0Var.a;
                                int length2 = jArr2.length - 2;
                                if (length2 >= 0) {
                                    int i29 = 0;
                                    while (true) {
                                        long j2 = jArr2[i29];
                                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i30 = 8 - ((~(i29 - length2)) >>> 31);
                                            int i31 = 0;
                                            while (i31 < i30) {
                                                if ((j2 & 255) < 128) {
                                                    r50 r50Var4 = (r50) objArr4[(i29 << 3) + i31];
                                                    int i32 = r50Var4.a;
                                                    if (i32 == i21) {
                                                        r50Var4.a = i22;
                                                    } else {
                                                        objArr2 = objArr4;
                                                        if (i21 + 1 <= i32 && i32 < i22) {
                                                            r50Var4.a = i32 - 1;
                                                        }
                                                        j2 >>= 8;
                                                        i31++;
                                                        objArr4 = objArr2;
                                                    }
                                                }
                                                objArr2 = objArr4;
                                                j2 >>= 8;
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
                        cl clVar = this.M;
                        int i33 = clVar.f;
                        hl hlVar = clVar.a;
                        clVar.f = (i20 - hlVar.G.g) + i33;
                        this.G.r(i20);
                        if (i4 > 0) {
                            clVar.d(false);
                            da0 da0Var = clVar.d;
                            za1 za1Var3 = hlVar.G;
                            if (za1Var3.c > 0 && da0Var.a(-2) != (i5 = za1Var3.i)) {
                                if (!clVar.c && clVar.e) {
                                    clVar.d(false);
                                    clVar.b.a.D(gs0.c);
                                    clVar.c = true;
                                }
                                if (i5 > 0) {
                                    d3 a = za1Var3.a(i5);
                                    da0Var.c(i5);
                                    clVar.d(false);
                                    bt0 bt0Var = clVar.b.a;
                                    bt0Var.D(fs0.c);
                                    y90.D(bt0Var, 0, a);
                                    clVar.c = true;
                                }
                            }
                            bt0 bt0Var2 = clVar.b.a;
                            bt0Var2.D(ks0.c);
                            bt0Var2.c[bt0Var2.d - bt0Var2.a[bt0Var2.b - 1].a] = i4;
                        }
                        V(obj, z3);
                    }
                    gw0Var2 = null;
                    u(z3, gw0Var2);
                    return;
                }
                z = z4;
                gw0Var = this.j;
                if (gw0Var != null) {
                }
                gw0Var2 = null;
                u(z3, gw0Var2);
                return;
            }
            rotateLeft = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ i, 3) ^ i9;
        }
        this.T = rotateLeft;
        if (sr0Var2 == null) {
        }
        if (i2 == 0) {
        }
        if (!this.S) {
        }
    }

    public final void T() {
        S(-127, null, 0, null);
    }

    public final void U(int i, sr0 sr0Var) {
        S(i, sr0Var, 0, null);
    }

    public final void V(Object obj, boolean z) {
        if (z) {
            za1 za1Var = this.G;
            if (za1Var.k <= 0) {
                if ((za1Var.b[(za1Var.g * 5) + 1] & 1073741824) == 0) {
                    cy0.a("Expected a node group");
                }
                za1Var.u();
                return;
            }
            return;
        }
        if (obj != null && this.G.f() != obj) {
            cl clVar = this.M;
            clVar.getClass();
            clVar.d(false);
            bt0 bt0Var = clVar.b.a;
            bt0Var.D(vs0.c);
            y90.D(bt0Var, 0, obj);
        }
        this.G.u();
    }

    public final void W(int i) {
        int i2;
        int i3;
        if (this.j != null) {
            S(i, null, 0, null);
            return;
        }
        if (this.r) {
            kl.a("A call to createNode(), emitNode() or useNode() expected");
        }
        this.T = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ i, 3) ^ this.m;
        this.m++;
        za1 za1Var = this.G;
        boolean z = this.S;
        j41 j41Var = bl.a;
        if (z) {
            za1Var.k++;
            this.I.Q(i, j41Var, j41Var, false);
            u(false, null);
            return;
        }
        if (za1Var.g() == i && ((i3 = za1Var.g) >= za1Var.h || (za1Var.b[(i3 * 5) + 1] & 536870912) == 0)) {
            za1Var.u();
            u(false, null);
            return;
        }
        if (za1Var.k <= 0 && (i2 = za1Var.g) != za1Var.h) {
            int i4 = this.k;
            I();
            this.M.e(i4, za1Var.s());
            la0.t(this.s, i2, za1Var.g);
        }
        za1Var.k++;
        this.S = true;
        this.K = null;
        if (this.I.w) {
            db1 e = this.H.e();
            this.I = e;
            e.M();
            this.J = false;
            this.K = null;
        }
        db1 db1Var = this.I;
        db1Var.d();
        int i5 = db1Var.t;
        db1Var.Q(i, j41Var, j41Var, false);
        this.N = db1Var.b(i5);
        u(false, null);
    }

    public final void X(int i) {
        S(i, null, 0, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final hl Y(int i) {
        i11 i11Var;
        boolean z;
        int i2;
        W(i);
        boolean z2 = this.S;
        s40 s40Var = this.g;
        ArrayList arrayList = this.E;
        tl tlVar = this.h;
        if (z2) {
            i11 i11Var2 = new i11(tlVar);
            arrayList.add(i11Var2);
            i0(i11Var2);
            i11Var2.e = this.B;
            i11Var2.b &= -17;
            s40Var.n();
            return this;
        }
        int i3 = this.G.i;
        ArrayList arrayList2 = this.s;
        int C = la0.C(i3, arrayList2);
        va0 va0Var = C >= 0 ? (va0) arrayList2.remove(C) : null;
        Object m = this.G.m();
        if (Intrinsics.a(m, bl.a)) {
            i11Var = new i11(tlVar);
            i0(i11Var);
        } else {
            m.getClass();
            i11Var = (i11) m;
        }
        if (va0Var == null) {
            int i4 = i11Var.b;
            boolean z3 = (i4 & 64) != 0;
            if (z3) {
                i11Var.b = i4 & (-65);
            }
            if (!z3) {
                z = false;
                int i5 = i11Var.b;
                i11Var.b = !z ? i5 | 8 : i5 & (-9);
                arrayList.add(i11Var);
                i11Var.e = this.B;
                i11Var.b &= -17;
                s40Var.n();
                i2 = i11Var.b;
                if ((i2 & 256) != 0) {
                    i11Var.b = (i2 & (-257)) | 512;
                    bt0 bt0Var = this.M.b.a;
                    bt0Var.D(ts0.c);
                    y90.D(bt0Var, 0, i11Var);
                    if (!this.y) {
                        int i6 = i11Var.b;
                        if ((i6 & 128) != 0) {
                            this.y = true;
                            i11Var.b = i6 | 1024;
                        }
                    }
                }
                return this;
            }
        }
        z = true;
        int i52 = i11Var.b;
        i11Var.b = !z ? i52 | 8 : i52 & (-9);
        arrayList.add(i11Var);
        i11Var.e = this.B;
        i11Var.b &= -17;
        s40Var.n();
        i2 = i11Var.b;
        if ((i2 & 256) != 0) {
        }
        return this;
    }

    public final void Z(Object obj) {
        if (!this.S && this.G.g() == 207 && !Intrinsics.a(this.G.f(), obj) && this.z < 0) {
            this.z = this.G.g;
            this.y = true;
        }
        S(207, null, 0, obj);
    }

    public final void a() {
        i();
        this.i.clear();
        this.n.b = 0;
        this.t.b = 0;
        this.x.b = 0;
        this.v = null;
        tz tzVar = this.O;
        tzVar.b.z();
        tzVar.a.z();
        this.T = 0L;
        this.A = 0;
        this.r = false;
        this.S = false;
        this.y = false;
        this.F = false;
        this.z = -1;
        za1 za1Var = this.G;
        if (!za1Var.f) {
            za1Var.c();
        }
        if (this.I.w) {
            return;
        }
        v();
    }

    public final void a0() {
        S(125, null, 2, null);
        this.r = true;
    }

    public final void b(Object obj, Function2 function2) {
        if (this.S) {
            bt0 bt0Var = this.O.a;
            bt0Var.D(ws0.c);
            y90.D(bt0Var, 0, obj);
            function2.getClass();
            tj1.b(2, function2);
            y90.D(bt0Var, 1, function2);
            return;
        }
        cl clVar = this.M;
        clVar.b();
        bt0 bt0Var2 = clVar.b.a;
        bt0Var2.D(ws0.c);
        function2.getClass();
        tj1.b(2, function2);
        y90.E(bt0Var2, 0, obj, 1, function2);
    }

    public final void b0() {
        this.m = 0;
        this.G = this.c.d();
        S(100, null, 0, null);
        ml mlVar = this.b;
        mlVar.t();
        kw0 i = mlVar.i();
        this.x.c(this.w ? 1 : 0);
        this.w = f(i);
        this.K = null;
        if (!this.q) {
            this.q = mlVar.e();
        }
        if (!this.C) {
            this.C = mlVar.f();
        }
        if (this.C) {
            ke1 ke1Var = sl.a;
            ke1Var.getClass();
            i = i.g(ke1Var, new le1(z()));
        }
        this.u = i;
        Set set = (Set) m90.I(i, j90.a);
        if (set != null) {
            set.add(w());
            mlVar.o(set);
        }
        S(Long.hashCode(mlVar.g()), null, 0, null);
    }

    public final boolean c(float f) {
        Object D = D();
        if ((D instanceof Float) && f == ((Number) D).floatValue()) {
            return false;
        }
        i0(Float.valueOf(f));
        return true;
    }

    public final boolean c0(i11 i11Var, Object obj) {
        d3 d3Var = i11Var.c;
        if (d3Var == null) {
            return false;
        }
        int a = this.G.a.a(d3Var);
        if (!this.F || a < this.G.g) {
            return false;
        }
        ArrayList arrayList = this.s;
        int C = la0.C(a, arrayList);
        if (C < 0) {
            int i = -(C + 1);
            if (!(obj instanceof xr)) {
                obj = null;
            }
            arrayList.add(i, new va0(i11Var, a, obj));
            return true;
        }
        va0 va0Var = (va0) arrayList.get(C);
        if (!(obj instanceof xr)) {
            va0Var.c = null;
            return true;
        }
        Object obj2 = va0Var.c;
        if (obj2 == null) {
            va0Var.c = obj;
            return true;
        }
        if (obj2 instanceof wn0) {
            ((wn0) obj2).a(obj);
            return true;
        }
        wn0 wn0Var = r61.a;
        wn0 wn0Var2 = new wn0(2);
        wn0Var2.k(obj2);
        wn0Var2.k(obj);
        va0Var.c = wn0Var2;
        return true;
    }

    public final boolean d(int i) {
        Object D = D();
        if ((D instanceof Integer) && i == ((Number) D).intValue()) {
            return false;
        }
        i0(Integer.valueOf(i));
        return true;
    }

    public final void d0(vn0 vn0Var) {
        ArrayList arrayList = this.s;
        for (int d = zh.d(arrayList); -1 < d; d--) {
            va0 va0Var = (va0) arrayList.get(d);
            d3 d3Var = va0Var.a.c;
            if (d3Var == null || !d3Var.a()) {
                arrayList.remove(d);
            } else {
                int i = va0Var.b;
                int i2 = d3Var.a;
                if (i != i2) {
                    va0Var.b = i2;
                }
            }
        }
        Object[] objArr = vn0Var.b;
        Object[] objArr2 = vn0Var.c;
        long[] jArr = vn0Var.a;
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
                            i11 i11Var = (i11) obj;
                            d3 d3Var2 = i11Var.c;
                            if (d3Var2 != null) {
                                int i7 = d3Var2.a;
                                if (obj2 == a60.n) {
                                    obj2 = null;
                                }
                                arrayList.add(new va0(i11Var, i7, obj2));
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
        di.i(arrayList, la0.n);
    }

    public final boolean e(long j) {
        Object D = D();
        if ((D instanceof Long) && j == ((Number) D).longValue()) {
            return false;
        }
        i0(Long.valueOf(j));
        return true;
    }

    public final void e0(int i, int i2) {
        if (j0(i) != i2) {
            if (i < 0) {
                cn0 cn0Var = this.p;
                if (cn0Var == null) {
                    cn0Var = new cn0();
                    this.p = cn0Var;
                }
                cn0Var.f(i, i2);
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

    public final boolean f(Object obj) {
        if (Intrinsics.a(D(), obj)) {
            return false;
        }
        i0(obj);
        return true;
    }

    public final void f0(int i, int i2) {
        int j0 = j0(i);
        if (j0 != i2) {
            int i3 = i2 - j0;
            ArrayList arrayList = this.i;
            int size = arrayList.size() - 1;
            while (i != -1) {
                int j02 = j0(i) + i3;
                e0(i, j02);
                int i4 = size;
                while (true) {
                    if (-1 < i4) {
                        gw0 gw0Var = (gw0) arrayList.get(i4);
                        if (gw0Var != null && gw0Var.a(i, j02)) {
                            size = i4 - 1;
                            break;
                        }
                        i4--;
                    } else {
                        break;
                    }
                }
                za1 za1Var = this.G;
                if (i < 0) {
                    i = za1Var.i;
                } else if (za1Var.l(i)) {
                    return;
                } else {
                    i = this.G.q(i);
                }
            }
        }
    }

    public final boolean g(boolean z) {
        Object D = D();
        if ((D instanceof Boolean) && z == ((Boolean) D).booleanValue()) {
            return false;
        }
        i0(Boolean.valueOf(z));
        return true;
    }

    public final kw0 g0(kw0 kw0Var, kw0 kw0Var2) {
        kw0Var.getClass();
        jw0 jw0Var = new jw0(kw0Var);
        jw0Var.putAll(kw0Var2);
        kw0 e = jw0Var.e();
        U(204, kl.d);
        D();
        i0(e);
        D();
        i0(kw0Var2);
        p(false);
        return e;
    }

    public final boolean h(Object obj) {
        if (D() == obj) {
            return false;
        }
        i0(obj);
        return true;
    }

    public final void h0(Object obj) {
        if (obj instanceof j21) {
            k21 k21Var = new k21((j21) obj, this.m - 1);
            if (this.S) {
                bt0 bt0Var = this.M.b.a;
                bt0Var.D(ms0.c);
                y90.D(bt0Var, 0, k21Var);
            }
            this.d.add(obj);
            obj = k21Var;
        }
        i0(obj);
    }

    public final void i() {
        this.j = null;
        this.k = 0;
        this.l = 0;
        this.T = 0L;
        this.r = false;
        cl clVar = this.M;
        clVar.c = false;
        clVar.d.b = 0;
        clVar.f = 0;
        clVar.e = true;
        clVar.g = 0;
        clVar.h.clear();
        clVar.i = -1;
        clVar.j = -1;
        clVar.k = -1;
        clVar.l = 0;
        this.E.clear();
        this.o = null;
        this.p = null;
    }

    public final void i0(Object obj) {
        if (this.S) {
            db1 db1Var = this.I;
            if (db1Var.n <= 0 || db1Var.i == db1Var.k) {
                db1Var.F(obj);
                return;
            }
            en0 en0Var = db1Var.s;
            if (en0Var == null) {
                en0Var = new en0();
            }
            db1Var.s = en0Var;
            int i = db1Var.v;
            Object b = en0Var.b(i);
            if (b == null) {
                b = new mn0();
                en0Var.h(i, b);
            }
            ((mn0) b).a(obj);
            return;
        }
        za1 za1Var = this.G;
        boolean z = za1Var.n;
        cl clVar = this.M;
        if (!z) {
            d3 a = za1Var.a(za1Var.i);
            bt0 bt0Var = clVar.b.a;
            bt0Var.D(ur0.c);
            y90.E(bt0Var, 0, a, 1, obj);
            return;
        }
        int b2 = (za1Var.l - cb1.b(za1Var.b, za1Var.i)) - 1;
        if (clVar.a.G.i - clVar.f >= 0) {
            clVar.d(true);
            bt0 bt0Var2 = clVar.b.a;
            bt0Var2.D(hs0.g);
            y90.D(bt0Var2, 0, obj);
            bt0Var2.c[bt0Var2.d - bt0Var2.a[bt0Var2.b - 1].a] = b2;
            return;
        }
        za1 za1Var2 = this.G;
        d3 a2 = za1Var2.a(za1Var2.i);
        bt0 bt0Var3 = clVar.b.a;
        bt0Var3.D(hs0.f);
        y90.E(bt0Var3, 0, obj, 1, a2);
        bt0Var3.c[bt0Var3.d - bt0Var3.a[bt0Var3.b - 1].a] = b2;
    }

    public final Object j(m01 m01Var) {
        return m90.I(l(), m01Var);
    }

    public final int j0(int i) {
        int i2;
        if (i >= 0) {
            int[] iArr = this.o;
            return (iArr == null || (i2 = iArr[i]) < 0) ? this.G.o(i) : i2;
        }
        cn0 cn0Var = this.p;
        if (cn0Var == null || cn0Var.c(i) < 0) {
            return 0;
        }
        int c = cn0Var.c(i);
        if (c >= 0) {
            return cn0Var.c[c];
        }
        throw new NoSuchElementException(qy0.i(i, "Cannot find value for key "));
    }

    public final void k(Function0 function0) {
        if (!this.r) {
            kl.a("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.r = false;
        if (!this.S) {
            kl.a("createNode() can only be called when inserting");
        }
        da0 da0Var = this.n;
        int i = da0Var.a[da0Var.b - 1];
        db1 db1Var = this.I;
        d3 b = db1Var.b(db1Var.v);
        this.l++;
        tz tzVar = this.O;
        bt0 bt0Var = tzVar.a;
        bt0Var.D(hs0.d);
        y90.D(bt0Var, 0, function0);
        bt0Var.c[bt0Var.d - bt0Var.a[bt0Var.b - 1].a] = i;
        y90.D(bt0Var, 1, b);
        bt0 bt0Var2 = tzVar.b;
        bt0Var2.D(hs0.e);
        bt0Var2.c[bt0Var2.d - bt0Var2.a[bt0Var2.b - 1].a] = i;
        y90.D(bt0Var2, 0, b);
    }

    public final void k0() {
        if (!this.r) {
            kl.a("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.r = false;
        if (this.S) {
            kl.a("useNode() called while inserting");
        }
        za1 za1Var = this.G;
        Object n = za1Var.n(za1Var.i);
        cl clVar = this.M;
        clVar.c();
        clVar.h.add(n);
        if (this.y && (n instanceof mk)) {
            clVar.b();
            clVar.b.a.D(ys0.c);
        }
    }

    public final kw0 l() {
        kw0 kw0Var;
        kw0 kw0Var2 = this.K;
        if (kw0Var2 != null) {
            return kw0Var2;
        }
        int i = this.G.i;
        boolean z = this.S;
        sr0 sr0Var = kl.c;
        if (z && this.J) {
            int i2 = this.I.v;
            while (i2 > 0) {
                if (this.I.s(i2) == 202 && Intrinsics.a(this.I.t(i2), sr0Var)) {
                    Object q = this.I.q(i2);
                    q.getClass();
                    kw0 kw0Var3 = (kw0) q;
                    this.K = kw0Var3;
                    return kw0Var3;
                }
                db1 db1Var = this.I;
                i2 = db1Var.E(db1Var.b, i2);
            }
        }
        if (this.G.c > 0) {
            while (i > 0) {
                if (this.G.i(i) == 202) {
                    za1 za1Var = this.G;
                    if (Intrinsics.a(za1Var.p(za1Var.b, i), sr0Var)) {
                        en0 en0Var = this.v;
                        if (en0Var == null || (kw0Var = (kw0) en0Var.b(i)) == null) {
                            za1 za1Var2 = this.G;
                            Object b = za1Var2.b(za1Var2.b, i);
                            b.getClass();
                            kw0Var = (kw0) b;
                        }
                        this.K = kw0Var;
                        return kw0Var;
                    }
                }
                i = this.G.q(i);
            }
        }
        kw0 kw0Var4 = this.u;
        this.K = kw0Var4;
        return kw0Var4;
    }

    public final vk m() {
        Collection collection;
        if (!this.b.k()) {
            return null;
        }
        vh0 vh0Var = new vh0(0, 1, null);
        db1 db1Var = this.I;
        vh0Var.addAll(uq1.x(db1Var, null, db1Var.t, null));
        za1 za1Var = this.G;
        boolean z = za1Var.f;
        int[] iArr = za1Var.b;
        if (z || za1Var.c == 0) {
            collection = nv.d;
        } else {
            e11 e11Var = new e11(za1Var);
            int i = za1Var.i;
            Object valueOf = Integer.valueOf(za1Var.l - cb1.b(iArr, i));
            while (i >= 0) {
                e11Var.c(za1Var.i(i), za1Var.k(i) ? za1Var.p(iArr, i) : bl.a, za1Var.a.g(i), valueOf);
                valueOf = za1Var.a(i);
                i = za1Var.q(i);
            }
            collection = e11Var.a;
        }
        vh0Var.addAll(collection);
        vh0Var.addAll(E());
        return new vk(yh.a(vh0Var));
    }

    public final void n(vn0 vn0Var, Function2 function2) {
        ArrayList arrayList = this.s;
        if (this.F) {
            kl.a("Reentrant composition is not supported");
        }
        this.g.n();
        Trace.beginSection("Compose:recompose");
        try {
            this.B = Long.hashCode(pb1.j().g());
            this.v = null;
            d0(vn0Var);
            this.k = 0;
            this.F = true;
            try {
                b0();
                Object D = D();
                if (D != function2 && function2 != null) {
                    i0(function2);
                }
                gl glVar = this.D;
                eo0 n = gb0.n();
                try {
                    n.b(glVar);
                    sr0 sr0Var = kl.a;
                    if (function2 != null) {
                        U(200, sr0Var);
                        tj1.b(2, function2);
                        function2.b(this, 1);
                        p(false);
                    } else if (!this.w || D == null || D.equals(bl.a)) {
                        P();
                    } else {
                        U(200, sr0Var);
                        tj1.b(2, D);
                        Function2 function22 = (Function2) D;
                        tj1.b(2, function22);
                        function22.b(this, 1);
                        p(false);
                    }
                    n.k(n.g - 1);
                    t();
                    this.F = false;
                    arrayList.clear();
                    if (!this.I.w) {
                        kl.a("Check failed");
                    }
                    v();
                } catch (Throwable th) {
                    n.k(n.g - 1);
                    throw th;
                }
            } finally {
            }
        } finally {
            Trace.endSection();
        }
    }

    public final void o(int i, int i2) {
        if (i <= 0 || i == i2) {
            return;
        }
        o(this.G.q(i), i2);
        if (this.G.l(i)) {
            Object n = this.G.n(i);
            cl clVar = this.M;
            clVar.c();
            clVar.h.add(n);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x05ad  */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v29, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v32 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p(boolean z) {
        long rotateRight;
        da0 da0Var;
        ArrayList arrayList;
        int i;
        boolean z2;
        int i2;
        za1 za1Var;
        gw0 gw0Var;
        ?? r3;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        da0 da0Var2;
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
        gw0 gw0Var2;
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
        da0 da0Var3 = this.n;
        int i17 = da0Var3.a[da0Var3.b - 2] - 1;
        boolean z3 = this.S;
        j41 j41Var = bl.a;
        if (z3) {
            db1 db1Var = this.I;
            int i18 = db1Var.v;
            int s = db1Var.s(i18);
            Object t = this.I.t(i18);
            Object q = this.I.q(i18);
            if (t != null) {
                rotateRight2 = Long.rotateRight(this.T, 3) ^ (t instanceof Enum ? ((Enum) t).ordinal() : t.hashCode());
            } else if (q == null || s != 207 || q.equals(j41Var)) {
                rotateRight2 = Long.rotateRight(this.T ^ i17, 3) ^ s;
            } else {
                this.T = Long.rotateRight(Long.rotateRight(this.T ^ i17, 3) ^ q.hashCode(), 3);
            }
            this.T = Long.rotateRight(rotateRight2, 3);
        } else {
            za1 za1Var2 = this.G;
            int i19 = za1Var2.i;
            int i20 = za1Var2.i(i19);
            za1 za1Var3 = this.G;
            Object p = za1Var3.p(za1Var3.b, i19);
            za1 za1Var4 = this.G;
            Object b = za1Var4.b(za1Var4.b, i19);
            if (p != null) {
                rotateRight = Long.rotateRight(this.T, 3) ^ (p instanceof Enum ? ((Enum) p).ordinal() : p.hashCode());
            } else if (b == null || i20 != 207 || b.equals(j41Var)) {
                rotateRight = Long.rotateRight(this.T ^ i17, 3) ^ i20;
            } else {
                this.T = Long.rotateRight(Long.rotateRight(this.T ^ i17, 3) ^ b.hashCode(), 3);
            }
            this.T = Long.rotateRight(rotateRight, 3);
        }
        int i21 = this.l;
        gw0 gw0Var3 = this.j;
        ArrayList arrayList5 = this.s;
        cl clVar = this.M;
        if (gw0Var3 != null) {
            en0 en0Var = gw0Var3.e;
            int i22 = gw0Var3.b;
            ArrayList arrayList6 = gw0Var3.a;
            if (arrayList6.size() > 0) {
                ArrayList arrayList7 = gw0Var3.d;
                HashSet hashSet2 = new HashSet(arrayList7.size());
                int size = arrayList7.size();
                for (int i23 = 0; i23 < size; i23++) {
                    hashSet2.add(arrayList7.get(i23));
                }
                i = -1;
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                int size2 = arrayList7.size();
                int size3 = arrayList6.size();
                int i24 = 0;
                int i25 = 0;
                int i26 = 0;
                while (i24 < size3) {
                    gc0 gc0Var = (gc0) arrayList6.get(i24);
                    if (hashSet2.contains(gc0Var)) {
                        da0Var2 = da0Var3;
                        i8 = i24;
                        if (!linkedHashSet2.contains(gc0Var)) {
                            int i27 = i25;
                            if (i27 < size2) {
                                gc0 gc0Var2 = (gc0) arrayList7.get(i27);
                                if (gc0Var2 != gc0Var) {
                                    r50 r50Var = (r50) en0Var.b(gc0Var2.c);
                                    int i28 = r50Var != null ? r50Var.b : -1;
                                    linkedHashSet2.add(gc0Var2);
                                    i9 = i27;
                                    i12 = i26;
                                    gw0Var2 = gw0Var3;
                                    if (i28 != i12) {
                                        r50 r50Var2 = (r50) en0Var.b(gc0Var2.c);
                                        int i29 = r50Var2 != null ? r50Var2.c : gc0Var2.d;
                                        linkedHashSet = linkedHashSet2;
                                        int i30 = i28 + i22;
                                        i10 = size2;
                                        int i31 = i12 + i22;
                                        if (i29 > 0) {
                                            i11 = i22;
                                            int i32 = clVar.l;
                                            if (i32 > 0) {
                                                arrayList3 = arrayList6;
                                                if (clVar.j == i30 - i32 && clVar.k == i31 - i32) {
                                                    clVar.l = i32 + i29;
                                                }
                                            } else {
                                                arrayList3 = arrayList6;
                                            }
                                            clVar.c();
                                            clVar.j = i30;
                                            clVar.k = i31;
                                            clVar.l = i29;
                                        } else {
                                            i11 = i22;
                                            arrayList3 = arrayList6;
                                            clVar.getClass();
                                        }
                                        if (i28 > i12) {
                                            Object[] objArr5 = en0Var.c;
                                            long[] jArr5 = en0Var.a;
                                            int length = jArr5.length - 2;
                                            if (length >= 0) {
                                                arrayList4 = arrayList7;
                                                hashSet = hashSet2;
                                                int i33 = 0;
                                                while (true) {
                                                    long j = jArr5[i33];
                                                    int i34 = i29;
                                                    arrayList2 = arrayList5;
                                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i35 = 8 - ((~(i33 - length)) >>> 31);
                                                        int i36 = 0;
                                                        while (i36 < i35) {
                                                            if ((j & 255) < 128) {
                                                                i16 = i36;
                                                                r50 r50Var3 = (r50) objArr5[(i33 << 3) + i36];
                                                                objArr4 = objArr5;
                                                                int i37 = r50Var3.b;
                                                                jArr4 = jArr5;
                                                                if (i28 <= i37 && i37 < i28 + i34) {
                                                                    r50Var3.b = (i37 - i28) + i12;
                                                                } else if (i12 <= i37 && i37 < i28) {
                                                                    r50Var3.b = i37 + i34;
                                                                }
                                                            } else {
                                                                i16 = i36;
                                                                objArr4 = objArr5;
                                                                jArr4 = jArr5;
                                                            }
                                                            j >>= 8;
                                                            i36 = i16 + 1;
                                                            objArr5 = objArr4;
                                                            jArr5 = jArr4;
                                                        }
                                                        objArr3 = objArr5;
                                                        jArr3 = jArr5;
                                                        if (i35 != 8) {
                                                            break;
                                                        }
                                                    } else {
                                                        objArr3 = objArr5;
                                                        jArr3 = jArr5;
                                                    }
                                                    if (i33 == length) {
                                                        break;
                                                    }
                                                    i33++;
                                                    arrayList5 = arrayList2;
                                                    i29 = i34;
                                                    objArr5 = objArr3;
                                                    jArr5 = jArr3;
                                                }
                                            } else {
                                                arrayList2 = arrayList5;
                                            }
                                        } else {
                                            int i38 = i29;
                                            arrayList2 = arrayList5;
                                            arrayList4 = arrayList7;
                                            hashSet = hashSet2;
                                            if (i12 > i28) {
                                                Object[] objArr6 = en0Var.c;
                                                long[] jArr6 = en0Var.a;
                                                int length2 = jArr6.length - 2;
                                                if (length2 >= 0) {
                                                    int i39 = 0;
                                                    while (true) {
                                                        long j2 = jArr6[i39];
                                                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                            int i40 = 8 - ((~(i39 - length2)) >>> 31);
                                                            int i41 = 0;
                                                            while (i41 < i40) {
                                                                if ((j2 & 255) < 128) {
                                                                    objArr2 = objArr6;
                                                                    r50 r50Var4 = (r50) objArr6[(i39 << 3) + i41];
                                                                    jArr2 = jArr6;
                                                                    int i42 = r50Var4.b;
                                                                    i15 = i28;
                                                                    if (i28 <= i42 && i42 < i15 + i38) {
                                                                        r50Var4.b = (i42 - i15) + i12;
                                                                    } else if (i15 + 1 <= i42 && i42 < i12) {
                                                                        r50Var4.b = i42 - i38;
                                                                    }
                                                                } else {
                                                                    objArr2 = objArr6;
                                                                    jArr2 = jArr6;
                                                                    i15 = i28;
                                                                }
                                                                j2 >>= 8;
                                                                i41++;
                                                                jArr6 = jArr2;
                                                                objArr6 = objArr2;
                                                                i28 = i15;
                                                            }
                                                            objArr = objArr6;
                                                            jArr = jArr6;
                                                            i14 = i28;
                                                            if (i40 != 8) {
                                                                break;
                                                            }
                                                        } else {
                                                            objArr = objArr6;
                                                            jArr = jArr6;
                                                            i14 = i28;
                                                        }
                                                        if (i39 == length2) {
                                                            break;
                                                        }
                                                        i39++;
                                                        jArr6 = jArr;
                                                        objArr6 = objArr;
                                                        i28 = i14;
                                                    }
                                                }
                                            }
                                        }
                                        i13 = i8;
                                    } else {
                                        arrayList2 = arrayList5;
                                        linkedHashSet = linkedHashSet2;
                                        i10 = size2;
                                        i11 = i22;
                                        arrayList3 = arrayList6;
                                    }
                                    arrayList4 = arrayList7;
                                    hashSet = hashSet2;
                                    i13 = i8;
                                } else {
                                    i9 = i27;
                                    arrayList2 = arrayList5;
                                    linkedHashSet = linkedHashSet2;
                                    i10 = size2;
                                    i11 = i22;
                                    arrayList3 = arrayList6;
                                    arrayList4 = arrayList7;
                                    hashSet = hashSet2;
                                    i12 = i26;
                                    gw0Var2 = gw0Var3;
                                    i13 = i8 + 1;
                                }
                                i25 = i9 + 1;
                                r50 r50Var5 = (r50) en0Var.b(gc0Var2.c);
                                int i43 = i12 + (r50Var5 != null ? r50Var5.c : gc0Var2.d);
                                i24 = i13;
                                gw0Var3 = gw0Var2;
                                linkedHashSet2 = linkedHashSet;
                                size2 = i10;
                                i22 = i11;
                                arrayList6 = arrayList3;
                                arrayList7 = arrayList4;
                                hashSet2 = hashSet;
                                arrayList5 = arrayList2;
                                i26 = i43;
                                da0Var3 = da0Var2;
                            } else {
                                i25 = i27;
                                da0Var3 = da0Var2;
                                i24 = i8;
                            }
                        }
                    } else {
                        da0Var2 = da0Var3;
                        r50 r50Var6 = (r50) en0Var.b(gc0Var.c);
                        int i44 = r50Var6 != null ? r50Var6.b : -1;
                        int i45 = gc0Var.c;
                        i8 = i24;
                        clVar.e(i44 + i22, gc0Var.d);
                        gw0Var3.a(i45, 0);
                        clVar.f = (i45 - clVar.a.G.g) + clVar.f;
                        this.G.r(i45);
                        I();
                        this.G.s();
                        la0.t(arrayList5, i45, this.G.b[(i45 * 5) + 3] + i45);
                    }
                    i24 = i8 + 1;
                    da0Var3 = da0Var2;
                }
                da0Var = da0Var3;
                arrayList = arrayList5;
                clVar.c();
                if (arrayList6.size() > 0) {
                    za1 za1Var5 = this.G;
                    clVar.f = (za1Var5.h - clVar.a.G.g) + clVar.f;
                    za1Var5.t();
                }
                z2 = this.S;
                if (!z2) {
                    za1 za1Var6 = this.G;
                    int i46 = za1Var6.m - za1Var6.l;
                    if (i46 > 0) {
                        if (i46 > 0) {
                            clVar.d(false);
                            da0 da0Var4 = clVar.d;
                            za1 za1Var7 = clVar.a.G;
                            if (za1Var7.c > 0 && da0Var4.a(-2) != (i7 = za1Var7.i)) {
                                if (!clVar.c && clVar.e) {
                                    clVar.d(false);
                                    clVar.b.a.D(gs0.c);
                                    clVar.c = true;
                                }
                                if (i7 > 0) {
                                    d3 a = za1Var7.a(i7);
                                    da0Var4.c(i7);
                                    clVar.d(false);
                                    bt0 bt0Var = clVar.b.a;
                                    bt0Var.D(fs0.c);
                                    y90.D(bt0Var, 0, a);
                                    clVar.c = true;
                                }
                            }
                            bt0 bt0Var2 = clVar.b.a;
                            bt0Var2.D(us0.c);
                            bt0Var2.c[bt0Var2.d - bt0Var2.a[bt0Var2.b - 1].a] = i46;
                        } else {
                            clVar.getClass();
                        }
                    }
                }
                i2 = this.k;
                while (true) {
                    za1Var = this.G;
                    if (za1Var.k > 0 && (i6 = za1Var.g) != za1Var.h) {
                        I();
                        clVar.e(i2, this.G.s());
                        la0.t(arrayList, i6, this.G.g);
                    }
                }
                if (z2) {
                    if (z) {
                        clVar.a();
                    }
                    int i47 = clVar.a.G.i;
                    da0 da0Var5 = clVar.d;
                    int i48 = i;
                    if (da0Var5.a(i48) > i47) {
                        kl.a("Missed recording an endGroup");
                    }
                    if (da0Var5.a(i48) == i47) {
                        clVar.d(false);
                        da0Var5.b();
                        clVar.b.a.D(cs0.c);
                    }
                    int i49 = this.G.i;
                    if (i21 != j0(i49)) {
                        f0(i49, i21);
                    }
                    if (z) {
                        i21 = 1;
                    }
                    this.G.e();
                    clVar.c();
                } else {
                    if (z) {
                        tz tzVar = this.O;
                        bt0 bt0Var3 = tzVar.b;
                        if (!bt0Var3.C()) {
                            kl.a("Cannot end node insertion, there are no pending operations that can be realized.");
                        }
                        bt0 bt0Var4 = tzVar.a;
                        zs0[] zs0VarArr = bt0Var3.a;
                        int i50 = bt0Var3.b - 1;
                        bt0Var3.b = i50;
                        zs0 zs0Var = zs0VarArr[i50];
                        zs0VarArr[i50] = null;
                        bt0Var4.D(zs0Var);
                        Object[] objArr7 = bt0Var3.e;
                        Object[] objArr8 = bt0Var4.e;
                        int i51 = bt0Var4.f;
                        int i52 = zs0Var.b;
                        int i53 = bt0Var3.f;
                        int i54 = i53 - i52;
                        System.arraycopy(objArr7, i54, objArr8, i51 - i52, i53 - i54);
                        Object[] objArr9 = bt0Var3.e;
                        int i55 = bt0Var3.f;
                        Arrays.fill(objArr9, i55 - i52, i55, (Object) null);
                        int[] iArr = bt0Var3.c;
                        int[] iArr2 = bt0Var4.c;
                        int i56 = bt0Var4.d;
                        int i57 = zs0Var.a;
                        int i58 = bt0Var3.d;
                        w9.a(iArr, iArr2, i56 - i57, i58 - i57, i58);
                        bt0Var3.f -= i52;
                        bt0Var3.d -= i57;
                        i21 = 1;
                    }
                    if (this.G.k <= 0) {
                        cy0.a("Unbalanced begin/end empty");
                    }
                    r4.k--;
                    db1 db1Var2 = this.I;
                    int i59 = db1Var2.v;
                    db1Var2.j();
                    if (this.G.k <= 0) {
                        int i60 = (-2) - i59;
                        this.I.k();
                        this.I.e(true);
                        d3 d3Var = this.N;
                        boolean B = this.O.a.B();
                        ab1 ab1Var = this.H;
                        if (B) {
                            clVar.b();
                            clVar.d(false);
                            da0 da0Var6 = clVar.d;
                            za1 za1Var8 = clVar.a.G;
                            if (za1Var8.c > 0 && da0Var6.a(-2) != (i5 = za1Var8.i)) {
                                if (!clVar.c && clVar.e) {
                                    clVar.d(false);
                                    clVar.b.a.D(gs0.c);
                                    clVar.c = true;
                                }
                                if (i5 > 0) {
                                    d3 a2 = za1Var8.a(i5);
                                    da0Var6.c(i5);
                                    clVar.d(false);
                                    bt0 bt0Var5 = clVar.b.a;
                                    bt0Var5.D(fs0.c);
                                    y90.D(bt0Var5, 0, a2);
                                    i4 = 1;
                                    clVar.c = true;
                                    clVar.c();
                                    bt0 bt0Var6 = clVar.b.a;
                                    bt0Var6.D(is0.c);
                                    y90.E(bt0Var6, 0, d3Var, i4, ab1Var);
                                    r3 = 0;
                                }
                            }
                            i4 = 1;
                            clVar.c();
                            bt0 bt0Var62 = clVar.b.a;
                            bt0Var62.D(is0.c);
                            y90.E(bt0Var62, 0, d3Var, i4, ab1Var);
                            r3 = 0;
                        } else {
                            tz tzVar2 = this.O;
                            clVar.b();
                            clVar.d(false);
                            da0 da0Var7 = clVar.d;
                            za1 za1Var9 = clVar.a.G;
                            if (za1Var9.c > 0 && da0Var7.a(-2) != (i3 = za1Var9.i)) {
                                if (!clVar.c && clVar.e) {
                                    clVar.d(false);
                                    clVar.b.a.D(gs0.c);
                                    clVar.c = true;
                                }
                                if (i3 > 0) {
                                    d3 a3 = za1Var9.a(i3);
                                    da0Var7.c(i3);
                                    clVar.d(false);
                                    bt0 bt0Var7 = clVar.b.a;
                                    bt0Var7.D(fs0.c);
                                    y90.D(bt0Var7, 0, a3);
                                    clVar.c = true;
                                }
                            }
                            clVar.c();
                            bt0 bt0Var8 = clVar.b.a;
                            bt0Var8.D(js0.c);
                            int i61 = bt0Var8.f - bt0Var8.a[bt0Var8.b - 1].b;
                            Object[] objArr10 = bt0Var8.e;
                            objArr10[i61] = d3Var;
                            objArr10[i61 + 1] = ab1Var;
                            objArr10[i61 + 2] = tzVar2;
                            this.O = new tz();
                            r3 = 0;
                        }
                        this.S = r3;
                        if (this.c.e != 0) {
                            e0(i60, r3);
                            f0(i60, i21);
                        }
                    }
                }
                gw0Var = (gw0) this.i.remove(r3.size() - 1);
                if (gw0Var != null && !z2) {
                    gw0Var.c++;
                }
                this.j = gw0Var;
                this.k = da0Var.b() + i21;
                this.m = da0Var.b();
                this.l = da0Var.b() + i21;
            }
        }
        da0Var = da0Var3;
        arrayList = arrayList5;
        i = -1;
        z2 = this.S;
        if (!z2) {
        }
        i2 = this.k;
        while (true) {
            za1Var = this.G;
            if (za1Var.k > 0) {
                break;
            }
            I();
            clVar.e(i2, this.G.s());
            la0.t(arrayList, i6, this.G.g);
        }
        if (z2) {
        }
        gw0Var = (gw0) this.i.remove(r3.size() - 1);
        if (gw0Var != null) {
            gw0Var.c++;
        }
        this.j = gw0Var;
        this.k = da0Var.b() + i21;
        this.m = da0Var.b();
        this.l = da0Var.b() + i21;
    }

    public final void q() {
        p(false);
        i11 x = x();
        if (x != null) {
            int i = x.b;
            if ((i & 1) != 0) {
                x.b = i | 2;
            }
        }
    }

    public final i11 r() {
        i11 i11Var;
        d3 a;
        h11 h11Var;
        ArrayList arrayList = this.E;
        i11 i11Var2 = !arrayList.isEmpty() ? (i11) arrayList.remove(arrayList.size() - 1) : null;
        int i = 0;
        if (i11Var2 != null) {
            i11Var2.b &= -9;
            this.g.n();
            int i2 = this.B;
            ln0 ln0Var = i11Var2.f;
            if (ln0Var != null && (i11Var2.b & 16) == 0) {
                Object[] objArr = ln0Var.b;
                int[] iArr = ln0Var.c;
                long[] jArr = ln0Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    loop0: while (true) {
                        long j = jArr[i3];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8 - ((~(i3 - length)) >>> 31);
                            for (int i5 = 0; i5 < i4; i5++) {
                                if ((j & 255) < 128) {
                                    int i6 = (i3 << 3) + i5;
                                    Object obj = objArr[i6];
                                    if (iArr[i6] != i2) {
                                        h11Var = new h11(i2, i, i11Var2, ln0Var);
                                        break loop0;
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
                        }
                        i3++;
                    }
                }
            }
            h11Var = null;
            cl clVar = this.M;
            if (h11Var != null) {
                bt0 bt0Var = clVar.b.a;
                bt0Var.D(bs0.c);
                y90.E(bt0Var, 0, h11Var, 1, this.h);
            }
            int i7 = i11Var2.b;
            if ((i7 & 512) != 0) {
                i11Var2.b = i7 & (-513);
                bt0 bt0Var2 = clVar.b.a;
                bt0Var2.D(es0.c);
                y90.D(bt0Var2, 0, i11Var2);
                int i8 = i11Var2.b;
                i11Var2.b = i8 & (-129);
                if ((i8 & 1024) != 0) {
                    i11Var2.b = i8 & (-1153);
                    this.y = false;
                }
            }
        }
        if (i11Var2 != null) {
            int i9 = i11Var2.b;
            if ((i9 & 16) == 0 && ((i9 & 1) != 0 || this.q)) {
                if (i11Var2.c == null) {
                    if (this.S) {
                        db1 db1Var = this.I;
                        a = db1Var.b(db1Var.v);
                    } else {
                        za1 za1Var = this.G;
                        a = za1Var.a(za1Var.i);
                    }
                    i11Var2.c = a;
                }
                i11Var2.b &= -5;
                i11Var = i11Var2;
                p(false);
                return i11Var;
            }
        }
        i11Var = null;
        p(false);
        return i11Var;
    }

    public final void s() {
        if (this.F || this.z != 100) {
            cy0.a("Cannot disable reuse from root if it was caused by other groups");
        }
        this.z = -1;
        this.y = false;
    }

    public final void t() {
        p(false);
        this.b.c();
        p(false);
        cl clVar = this.M;
        if (clVar.c) {
            clVar.d(false);
            clVar.d(false);
            clVar.b.a.D(cs0.c);
            clVar.c = false;
        }
        clVar.b();
        if (clVar.d.b != 0) {
            kl.a("Missed recording an endGroup()");
        }
        if (!this.i.isEmpty()) {
            kl.a("Start/end imbalance");
        }
        i();
        this.G.c();
        this.w = this.x.b() != 0;
    }

    public final void u(boolean z, gw0 gw0Var) {
        this.i.add(this.j);
        this.j = gw0Var;
        int i = this.l;
        da0 da0Var = this.n;
        da0Var.c(i);
        da0Var.c(this.m);
        da0Var.c(this.k);
        if (z) {
            this.k = 0;
        }
        this.l = 0;
        this.m = 0;
    }

    public final void v() {
        ab1 ab1Var = new ab1();
        if (this.C) {
            ab1Var.b();
        }
        if (this.b.d()) {
            ab1Var.o = new en0();
        }
        this.H = ab1Var;
        db1 e = ab1Var.e();
        e.e(true);
        this.I = e;
    }

    public final ol w() {
        pl plVar = this.U;
        if (plVar != null) {
            return plVar;
        }
        pl plVar2 = new pl(this.h);
        this.U = plVar2;
        return plVar2;
    }

    public final i11 x() {
        if (this.A != 0) {
            return null;
        }
        ArrayList arrayList = this.E;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (i11) arrayList.get(arrayList.size() - 1);
    }

    public final boolean y() {
        if (!A() || this.w) {
            return true;
        }
        i11 x = x();
        return (x == null || (x.b & 4) == 0) ? false : true;
    }

    public final rl z() {
        if (this.b.k()) {
            return this.Q;
        }
        return null;
    }
}
