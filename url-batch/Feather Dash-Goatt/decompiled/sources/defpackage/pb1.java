package defpackage;

import java.util.HashMap;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class pb1 {
    public static final k61 a = new k61(9);
    public static final i8 b = new i8(21);
    public static final Object c = new Object();
    public static mb1 d;
    public static long e;
    public static final pl0 f;
    public static final u5 g;
    public static List h;
    public static List i;
    public static final x40 j;
    public static final ha k;

    /* JADX WARN: Type inference failed for: r2v1, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r2v2, types: [int[], java.io.Serializable] */
    static {
        mb1 mb1Var = mb1.i;
        d = mb1Var;
        e = 2L;
        pl0 pl0Var = new pl0();
        pl0Var.c = new long[16];
        pl0Var.d = new int[16];
        ?? r2 = new int[16];
        int i2 = 0;
        while (i2 < 16) {
            int i3 = i2 + 1;
            r2[i2] = i3;
            i2 = i3;
        }
        pl0Var.e = r2;
        f = pl0Var;
        u5 u5Var = new u5();
        u5Var.b = new int[16];
        u5Var.c = new co1[16];
        g = u5Var;
        nv nvVar = nv.d;
        h = nvVar;
        i = nvVar;
        long j2 = e;
        e = 1 + j2;
        x40 x40Var = new x40(j2, mb1Var, null, new q1(8));
        d = d.f(x40Var.b);
        j = x40Var;
        k = new ha(0);
    }

    public static final void a() {
        e(a);
    }

    public static final HashMap b(long j2, zn0 zn0Var, mb1 mb1Var) {
        long[] jArr;
        mb1 mb1Var2;
        long[] jArr2;
        mb1 mb1Var3;
        int i2;
        int i3;
        ie1 s;
        wn0 x = zn0Var.x();
        if (x != null) {
            long g2 = zn0Var.g();
            mb1 e2 = zn0Var.d().f(g2).e(zn0Var.j);
            Object[] objArr = x.b;
            long[] jArr3 = x.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i4 = 0;
                HashMap hashMap = null;
                while (true) {
                    long j3 = jArr3[i4];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i5 = 8;
                        int i6 = 8 - ((~(i4 - length)) >>> 31);
                        int i7 = 0;
                        while (i7 < i6) {
                            if ((j3 & 255) < 128) {
                                ge1 ge1Var = (ge1) objArr[(i4 << 3) + i7];
                                ie1 a2 = ge1Var.a();
                                jArr2 = jArr3;
                                i2 = i5;
                                i3 = i7;
                                ie1 s2 = s(a2, j2, mb1Var);
                                if (s2 == null || (s = s(a2, g2, e2)) == null || s2.equals(s)) {
                                    mb1Var3 = e2;
                                } else {
                                    mb1Var3 = e2;
                                    ie1 s3 = s(a2, g2, zn0Var.d());
                                    if (s3 == null) {
                                        r();
                                        throw null;
                                    }
                                    ie1 b2 = ge1Var.b(s, s2, s3);
                                    if (b2 == null) {
                                        return null;
                                    }
                                    if (hashMap == null) {
                                        hashMap = new HashMap();
                                    }
                                    hashMap.put(s2, b2);
                                    hashMap = hashMap;
                                }
                            } else {
                                jArr2 = jArr3;
                                mb1Var3 = e2;
                                i2 = i5;
                                i3 = i7;
                            }
                            j3 >>= i2;
                            i7 = i3 + 1;
                            i5 = i2;
                            jArr3 = jArr2;
                            e2 = mb1Var3;
                        }
                        jArr = jArr3;
                        mb1Var2 = e2;
                        if (i6 != i5) {
                            return hashMap;
                        }
                    } else {
                        jArr = jArr3;
                        mb1Var2 = e2;
                    }
                    if (i4 == length) {
                        return hashMap;
                    }
                    i4++;
                    jArr3 = jArr;
                    e2 = mb1Var2;
                }
            }
        }
        return null;
    }

    public static final void c(ib1 ib1Var) {
        long j2;
        if (d.d(ib1Var.g())) {
            return;
        }
        StringBuilder sb = new StringBuilder("Snapshot is not open: snapshotId=");
        sb.append(ib1Var.g());
        sb.append(", disposed=");
        sb.append(ib1Var.c);
        sb.append(", applied=");
        zn0 zn0Var = ib1Var instanceof zn0 ? (zn0) ib1Var : null;
        sb.append(zn0Var != null ? Boolean.valueOf(zn0Var.m) : "read-only");
        sb.append(", lowestPin=");
        synchronized (c) {
            pl0 pl0Var = f;
            j2 = pl0Var.a > 0 ? ((long[]) pl0Var.c)[0] : -1L;
        }
        sb.append(j2);
        throw new IllegalStateException(sb.toString().toString());
    }

    public static final mb1 d(mb1 mb1Var, long j2, long j3) {
        while (Intrinsics.c(j2, j3) < 0) {
            mb1Var = mb1Var.f(j2);
            j2++;
        }
        return mb1Var;
    }

    public static final Object e(Function1 function1) {
        wn0 wn0Var;
        Object v;
        x40 x40Var = j;
        synchronized (c) {
            try {
                wn0Var = x40Var.h;
                if (wn0Var != null) {
                    k.addAndGet(1);
                }
                v = v(x40Var, function1);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (wn0Var != null) {
            try {
                List list = h;
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((Function2) list.get(i2)).b(new s61(wn0Var), x40Var);
                }
            } finally {
                k.addAndGet(-1);
            }
        }
        synchronized (c) {
            f();
            if (wn0Var != null) {
                Object[] objArr = wn0Var.b;
                long[] jArr = wn0Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    while (true) {
                        long j2 = jArr[i3];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8 - ((~(i3 - length)) >>> 31);
                            for (int i5 = 0; i5 < i4; i5++) {
                                if ((255 & j2) < 128) {
                                    q((ge1) objArr[(i3 << 3) + i5]);
                                }
                                j2 >>= 8;
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
        }
        return v;
    }

    public static final void f() {
        u5 u5Var = g;
        int i2 = u5Var.a;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            co1 co1Var = ((co1[]) u5Var.c)[i3];
            Object obj = co1Var != null ? co1Var.get() : null;
            if (obj != null && p((ge1) obj)) {
                if (i4 != i3) {
                    ((co1[]) u5Var.c)[i4] = co1Var;
                    int[] iArr = (int[]) u5Var.b;
                    iArr[i4] = iArr[i3];
                }
                i4++;
            }
            i3++;
        }
        for (int i5 = i4; i5 < i2; i5++) {
            ((co1[]) u5Var.c)[i5] = null;
            ((int[]) u5Var.b)[i5] = 0;
        }
        if (i4 != i2) {
            u5Var.a = i4;
        }
    }

    public static final ib1 g(ib1 ib1Var, Function1 function1, boolean z) {
        boolean z2 = ib1Var instanceof zn0;
        if (z2 || ib1Var == null) {
            return new cj1(z2 ? (zn0) ib1Var : null, function1, null, false, z);
        }
        return new dj1(ib1Var, function1, false, z);
    }

    public static final ie1 h(ie1 ie1Var) {
        ie1 s;
        ib1 j2 = j();
        ie1 s2 = s(ie1Var, j2.g(), j2.d());
        if (s2 != null) {
            return s2;
        }
        synchronized (c) {
            ib1 j3 = j();
            s = s(ie1Var, j3.g(), j3.d());
        }
        if (s != null) {
            return s;
        }
        r();
        throw null;
    }

    public static final ie1 i(ie1 ie1Var, ib1 ib1Var) {
        ie1 s;
        ie1 s2 = s(ie1Var, ib1Var.g(), ib1Var.d());
        if (s2 != null) {
            return s2;
        }
        synchronized (c) {
            s = s(ie1Var, ib1Var.g(), ib1Var.d());
        }
        if (s != null) {
            return s;
        }
        r();
        throw null;
    }

    public static final ib1 j() {
        ib1 ib1Var = (ib1) b.get();
        return ib1Var == null ? j : ib1Var;
    }

    public static final Function1 k(Function1 function1, Function1 function12, boolean z) {
        if (!z) {
            function12 = null;
        }
        return (function1 == null || function12 == null || function1 == function12) ? function1 == null ? function12 : function1 : new nb1(function1, function12, 0);
    }

    public static final Function1 l(Function1 function1, Function1 function12) {
        return (function1 == null || function12 == null || function1 == function12) ? function1 == null ? function12 : function1 : new nb1(function1, function12, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0043, code lost:
    
        r3 = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ie1 m(ie1 ie1Var, ge1 ge1Var) {
        ie1 a2 = ge1Var.a();
        long j2 = e;
        pl0 pl0Var = f;
        if (pl0Var.a > 0) {
            j2 = ((long[]) pl0Var.c)[0];
        }
        long j3 = j2 - 1;
        ie1 ie1Var2 = null;
        ie1 ie1Var3 = null;
        while (true) {
            if (a2 == null) {
                break;
            }
            long j4 = a2.a;
            if (j4 == 0) {
                break;
            }
            if (j4 != 0 && Intrinsics.c(j4, j3) <= 0 && !mb1.i.d(j4)) {
                if (ie1Var3 == null) {
                    ie1Var3 = a2;
                } else if (Intrinsics.c(a2.a, ie1Var3.a) >= 0) {
                    ie1Var2 = ie1Var3;
                }
            }
            a2 = a2.b;
        }
        if (ie1Var2 != null) {
            ie1Var2.a = Long.MAX_VALUE;
            return ie1Var2;
        }
        ie1 b2 = ie1Var.b(Long.MAX_VALUE);
        b2.b = ge1Var.a();
        ge1Var.d(b2);
        return b2;
    }

    public static final void n(ib1 ib1Var, ge1 ge1Var) {
        ib1Var.t(ib1Var.h() + 1);
        Function1 i2 = ib1Var.i();
        if (i2 != null) {
            i2.invoke(ge1Var);
        }
    }

    public static final ie1 o(ie1 ie1Var, he1 he1Var, ib1 ib1Var, ie1 ie1Var2) {
        ie1 m;
        if (ib1Var.f()) {
            ib1Var.n(he1Var);
        }
        long g2 = ib1Var.g();
        if (ie1Var2.a == g2) {
            return ie1Var2;
        }
        synchronized (c) {
            m = m(ie1Var, he1Var);
        }
        m.a = g2;
        if (ie1Var2.a != 1) {
            ib1Var.n(he1Var);
        }
        return m;
    }

    public static final boolean p(ge1 ge1Var) {
        ie1 ie1Var;
        long j2 = e;
        pl0 pl0Var = f;
        if (pl0Var.a > 0) {
            j2 = ((long[]) pl0Var.c)[0];
        }
        ie1 ie1Var2 = null;
        ie1 ie1Var3 = null;
        int i2 = 0;
        for (ie1 a2 = ge1Var.a(); a2 != null; a2 = a2.b) {
            long j3 = a2.a;
            if (j3 != 0) {
                if (Intrinsics.c(j3, j2) >= 0) {
                    i2++;
                } else if (ie1Var2 == null) {
                    i2++;
                    ie1Var2 = a2;
                } else {
                    if (Intrinsics.c(a2.a, ie1Var2.a) < 0) {
                        ie1Var = ie1Var2;
                        ie1Var2 = a2;
                    } else {
                        ie1Var = a2;
                    }
                    if (ie1Var3 == null) {
                        ie1Var3 = ge1Var.a();
                        ie1 ie1Var4 = ie1Var3;
                        while (true) {
                            if (ie1Var3 == null) {
                                ie1Var3 = ie1Var4;
                                break;
                            }
                            if (Intrinsics.c(ie1Var3.a, j2) >= 0) {
                                break;
                            }
                            if (Intrinsics.c(ie1Var4.a, ie1Var3.a) < 0) {
                                ie1Var4 = ie1Var3;
                            }
                            ie1Var3 = ie1Var3.b;
                        }
                    }
                    ie1Var2.a = 0L;
                    ie1Var2.a(ie1Var3);
                    ie1Var2 = ie1Var;
                }
            }
        }
        return i2 > 1;
    }

    public static final void q(ge1 ge1Var) {
        if (p(ge1Var)) {
            u5 u5Var = g;
            int i2 = u5Var.a;
            int identityHashCode = System.identityHashCode(ge1Var);
            int i3 = -1;
            if (i2 > 0) {
                int i4 = u5Var.a - 1;
                int i5 = 0;
                while (true) {
                    if (i5 > i4) {
                        i3 = -(i5 + 1);
                        break;
                    }
                    int i6 = (i5 + i4) >>> 1;
                    int i7 = ((int[]) u5Var.b)[i6];
                    if (i7 < identityHashCode) {
                        i5 = i6 + 1;
                    } else if (i7 > identityHashCode) {
                        i4 = i6 - 1;
                    } else {
                        co1 co1Var = ((co1[]) u5Var.c)[i6];
                        if (ge1Var != (co1Var != null ? co1Var.get() : null)) {
                            for (int i8 = i6 - 1; -1 < i8 && ((int[]) u5Var.b)[i8] == identityHashCode; i8--) {
                                co1 co1Var2 = ((co1[]) u5Var.c)[i8];
                                if ((co1Var2 != null ? co1Var2.get() : null) == ge1Var) {
                                    i3 = i8;
                                    break;
                                }
                            }
                            i6++;
                            int i9 = u5Var.a;
                            while (true) {
                                if (i6 >= i9) {
                                    i3 = -(u5Var.a + 1);
                                    break;
                                } else {
                                    if (((int[]) u5Var.b)[i6] != identityHashCode) {
                                        i3 = -(i6 + 1);
                                        break;
                                    }
                                    co1 co1Var3 = ((co1[]) u5Var.c)[i6];
                                    if ((co1Var3 != null ? co1Var3.get() : null) == ge1Var) {
                                        break;
                                    } else {
                                        i6++;
                                    }
                                }
                            }
                        }
                        i3 = i6;
                    }
                }
                if (i3 >= 0) {
                    return;
                }
            }
            int i10 = -(i3 + 1);
            co1[] co1VarArr = (co1[]) u5Var.c;
            int length = co1VarArr.length;
            if (i2 == length) {
                int i11 = length * 2;
                co1[] co1VarArr2 = new co1[i11];
                int[] iArr = new int[i11];
                int i12 = i10 + 1;
                System.arraycopy(co1VarArr, i10, co1VarArr2, i12, i2 - i10);
                System.arraycopy((co1[]) u5Var.c, 0, co1VarArr2, 0, i10);
                w9.a((int[]) u5Var.b, iArr, i12, i10, i2);
                w9.d((int[]) u5Var.b, iArr, 0, i10, 6);
                u5Var.c = co1VarArr2;
                u5Var.b = iArr;
            } else {
                int i13 = i10 + 1;
                System.arraycopy(co1VarArr, i10, co1VarArr, i13, i2 - i10);
                int[] iArr2 = (int[]) u5Var.b;
                w9.a(iArr2, iArr2, i13, i10, i2);
            }
            ((co1[]) u5Var.c)[i10] = new co1(ge1Var);
            ((int[]) u5Var.b)[i10] = identityHashCode;
            u5Var.a++;
        }
    }

    public static final void r() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final ie1 s(ie1 ie1Var, long j2, mb1 mb1Var) {
        ie1 ie1Var2 = null;
        while (ie1Var != null) {
            long j3 = ie1Var.a;
            if (j3 != 0 && Intrinsics.c(j3, j2) <= 0 && !mb1Var.d(j3) && (ie1Var2 == null || Intrinsics.c(ie1Var2.a, ie1Var.a) < 0)) {
                ie1Var2 = ie1Var;
            }
            ie1Var = ie1Var.b;
        }
        if (ie1Var2 != null) {
            return ie1Var2;
        }
        return null;
    }

    public static final ie1 t(ie1 ie1Var, ge1 ge1Var) {
        ie1 s;
        ib1 j2 = j();
        Function1 e2 = j2.e();
        if (e2 != null) {
            e2.invoke(ge1Var);
        }
        ie1 s2 = s(ie1Var, j2.g(), j2.d());
        if (s2 != null) {
            return s2;
        }
        synchronized (c) {
            ib1 j3 = j();
            ie1 a2 = ge1Var.a();
            a2.getClass();
            s = s(a2, j3.g(), j3.d());
            if (s == null) {
                r();
                throw null;
            }
        }
        return s;
    }

    public static final void u(int i2) {
        pl0 pl0Var = f;
        int i3 = ((int[]) pl0Var.e)[i2];
        pl0Var.h(i3, pl0Var.a - 1);
        pl0Var.a--;
        long[] jArr = (long[]) pl0Var.c;
        long j2 = jArr[i3];
        int i4 = i3;
        while (i4 > 0) {
            int i5 = ((i4 + 1) >> 1) - 1;
            if (Intrinsics.c(jArr[i5], j2) <= 0) {
                break;
            }
            pl0Var.h(i5, i4);
            i4 = i5;
        }
        long[] jArr2 = (long[]) pl0Var.c;
        int i6 = pl0Var.a >> 1;
        while (i3 < i6) {
            int i7 = (i3 + 1) << 1;
            int i8 = i7 - 1;
            if (i7 < pl0Var.a && Intrinsics.c(jArr2[i7], jArr2[i8]) < 0) {
                if (Intrinsics.c(jArr2[i7], jArr2[i3]) >= 0) {
                    break;
                }
                pl0Var.h(i7, i3);
                i3 = i7;
            } else {
                if (Intrinsics.c(jArr2[i8], jArr2[i3]) >= 0) {
                    break;
                }
                pl0Var.h(i8, i3);
                i3 = i8;
            }
        }
        ((int[]) pl0Var.e)[i2] = pl0Var.b;
        pl0Var.b = i2;
    }

    public static final Object v(x40 x40Var, Function1 function1) {
        long j2 = x40Var.b;
        Object invoke = function1.invoke(d.b(j2));
        long j3 = e;
        e = 1 + j3;
        mb1 b2 = d.b(j2);
        d = b2;
        x40Var.b = j3;
        x40Var.a = b2;
        x40Var.g = 0;
        x40Var.h = null;
        x40Var.o();
        d = d.f(j3);
        return invoke;
    }

    public static final ie1 w(ie1 ie1Var, ge1 ge1Var, ib1 ib1Var) {
        ie1 s;
        if (ib1Var.f()) {
            ib1Var.n(ge1Var);
        }
        long g2 = ib1Var.g();
        ie1 s2 = s(ie1Var, g2, ib1Var.d());
        if (s2 == null) {
            r();
            throw null;
        }
        if (s2.a == ib1Var.g()) {
            return s2;
        }
        synchronized (c) {
            s = s(ge1Var.a(), g2, ib1Var.d());
            if (s == null) {
                r();
                throw null;
            }
            if (s.a != g2) {
                ie1 m = m(s, ge1Var);
                m.a(s);
                m.a = ib1Var.g();
                s = m;
            }
        }
        if (s2.a != 1) {
            ib1Var.n(ge1Var);
        }
        return s;
    }
}
