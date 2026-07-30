package defpackage;

import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class tm2 {
    public static final de2 a = new de2(24);
    public static final mh b = new mh(23);
    public static final Object c = new Object();
    public static rm2 d;
    public static long e;
    public static final m42 f;
    public static final yf g;
    public static List h;
    public static List i;
    public static final mv0 j;
    public static final al k;

    static {
        rm2 rm2Var = rm2.q;
        d = rm2Var;
        e = 2L;
        m42 m42Var = new m42();
        m42Var.c = new long[16];
        m42Var.d = new int[16];
        int[] iArr = new int[16];
        byte b2 = 0;
        int i2 = 0;
        while (i2 < 16) {
            int i3 = i2 + 1;
            iArr[i2] = i3;
            i2 = i3;
        }
        m42Var.e = iArr;
        f = m42Var;
        yf yfVar = new yf(6, b2);
        yfVar.o = new int[16];
        yfVar.p = new l63[16];
        g = yfVar;
        ah0 ah0Var = ah0.m;
        h = ah0Var;
        i = ah0Var;
        long j2 = e;
        e = 1 + j2;
        mv0 mv0Var = new mv0(j2, rm2Var, null, new zd(13));
        d = d.e(mv0Var.b);
        j = mv0Var;
        k = new al(0);
    }

    public static final void a() {
        f(a);
    }

    public static final Function1 b(Function1 function1, Function1 function12) {
        return (function1 == null || function12 == null || function1 == function12) ? function1 == null ? function12 : function1 : new sm2(function1, function12, 1);
    }

    public static final HashMap c(long j2, yn1 yn1Var, rm2 rm2Var) {
        long[] jArr;
        rm2 rm2Var2;
        long[] jArr2;
        rm2 rm2Var3;
        int i2;
        ap2 s;
        long j3 = j2;
        un1 x = yn1Var.x();
        if (x != null) {
            rm2 d2 = yn1Var.d().e(yn1Var.g()).d(yn1Var.j);
            Object[] objArr = x.b;
            long[] jArr3 = x.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i3 = 0;
                HashMap hashMap = null;
                while (true) {
                    long j4 = jArr3[i3];
                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = 8;
                        int i5 = 8 - ((~(i3 - length)) >>> 31);
                        int i6 = 0;
                        while (i6 < i5) {
                            if ((j4 & 255) < 128) {
                                yo2 yo2Var = (yo2) objArr[(i3 << 3) + i6];
                                ap2 a2 = yo2Var.a();
                                jArr2 = jArr3;
                                i2 = i4;
                                ap2 s2 = s(a2, j3, rm2Var);
                                if (s2 == null || (s = s(a2, j3, d2)) == null || s2.equals(s)) {
                                    rm2Var3 = d2;
                                } else {
                                    rm2Var3 = d2;
                                    ap2 s3 = s(a2, yn1Var.g(), yn1Var.d());
                                    if (s3 == null) {
                                        r();
                                        throw null;
                                    }
                                    ap2 b2 = yo2Var.b(s, s2, s3);
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
                                rm2Var3 = d2;
                                i2 = i4;
                            }
                            j4 >>= i2;
                            i6++;
                            j3 = j2;
                            i4 = i2;
                            jArr3 = jArr2;
                            d2 = rm2Var3;
                        }
                        jArr = jArr3;
                        rm2Var2 = d2;
                        if (i5 != i4) {
                            return hashMap;
                        }
                    } else {
                        jArr = jArr3;
                        rm2Var2 = d2;
                    }
                    if (i3 == length) {
                        return hashMap;
                    }
                    i3++;
                    j3 = j2;
                    jArr3 = jArr;
                    d2 = rm2Var2;
                }
            }
        }
        return null;
    }

    public static final void d(nm2 nm2Var) {
        long j2;
        if (d.c(nm2Var.g())) {
            return;
        }
        StringBuilder sb = new StringBuilder("Snapshot is not open: snapshotId=");
        sb.append(nm2Var.g());
        sb.append(", disposed=");
        sb.append(nm2Var.c);
        sb.append(", applied=");
        yn1 yn1Var = nm2Var instanceof yn1 ? (yn1) nm2Var : null;
        sb.append(yn1Var != null ? Boolean.valueOf(yn1Var.m) : "read-only");
        sb.append(", lowestPin=");
        synchronized (c) {
            m42 m42Var = f;
            j2 = m42Var.a > 0 ? ((long[]) m42Var.c)[0] : -1L;
        }
        sb.append(j2);
        throw new IllegalStateException(sb.toString().toString());
    }

    public static final rm2 e(rm2 rm2Var, long j2, long j3) {
        while (Intrinsics.d(j2, j3) < 0) {
            rm2Var = rm2Var.e(j2);
            j2++;
        }
        return rm2Var;
    }

    public static final Object f(Function1 function1) {
        un1 un1Var;
        Object v;
        mv0 mv0Var = j;
        synchronized (c) {
            try {
                un1Var = mv0Var.h;
                if (un1Var != null) {
                    k.addAndGet(1);
                }
                v = v(mv0Var, function1);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (un1Var != null) {
            try {
                List list = h;
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((Function2) list.get(i2)).invoke(new qe2(un1Var), mv0Var);
                }
            } finally {
                k.addAndGet(-1);
            }
        }
        synchronized (c) {
            try {
                g();
                if (un1Var != null) {
                    Object[] objArr = un1Var.b;
                    long[] jArr = un1Var.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i3 = 0;
                        while (true) {
                            long j2 = jArr[i3];
                            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i4 = 8 - ((~(i3 - length)) >>> 31);
                                for (int i5 = 0; i5 < i4; i5++) {
                                    if ((255 & j2) < 128) {
                                        q((yo2) objArr[(i3 << 3) + i5]);
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
                    Unit unit = Unit.a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return v;
    }

    public static final void g() {
        yf yfVar = g;
        int i2 = yfVar.n;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            l63 l63Var = ((l63[]) yfVar.p)[i3];
            Object obj = l63Var != null ? l63Var.get() : null;
            if (obj != null && p((yo2) obj)) {
                if (i4 != i3) {
                    ((l63[]) yfVar.p)[i4] = l63Var;
                    int[] iArr = (int[]) yfVar.o;
                    iArr[i4] = iArr[i3];
                }
                i4++;
            }
            i3++;
        }
        for (int i5 = i4; i5 < i2; i5++) {
            ((l63[]) yfVar.p)[i5] = null;
            ((int[]) yfVar.o)[i5] = 0;
        }
        if (i4 != i2) {
            yfVar.n = i4;
        }
    }

    public static final nm2 h(nm2 nm2Var, Function1 function1, boolean z) {
        boolean z2 = nm2Var instanceof yn1;
        if (z2 || nm2Var == null) {
            return new kz2(z2 ? (yn1) nm2Var : null, function1, null, false, z);
        }
        return new lz2(nm2Var, function1, false, z);
    }

    public static final ap2 i(ap2 ap2Var) {
        ap2 s;
        nm2 k2 = k();
        ap2 s2 = s(ap2Var, k2.g(), k2.d());
        if (s2 != null) {
            return s2;
        }
        synchronized (c) {
            nm2 k3 = k();
            s = s(ap2Var, k3.g(), k3.d());
        }
        if (s != null) {
            return s;
        }
        r();
        throw null;
    }

    public static final ap2 j(ap2 ap2Var, nm2 nm2Var) {
        ap2 s;
        ap2 s2 = s(ap2Var, nm2Var.g(), nm2Var.d());
        if (s2 != null) {
            return s2;
        }
        synchronized (c) {
            s = s(ap2Var, nm2Var.g(), nm2Var.d());
        }
        if (s != null) {
            return s;
        }
        r();
        throw null;
    }

    public static final nm2 k() {
        nm2 nm2Var = (nm2) b.get();
        return nm2Var == null ? j : nm2Var;
    }

    public static final Function1 l(Function1 function1, Function1 function12, boolean z) {
        if (!z) {
            function12 = null;
        }
        return (function1 == null || function12 == null || function1 == function12) ? function1 == null ? function12 : function1 : new sm2(function1, function12, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        r3 = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ap2 m(ap2 ap2Var, yo2 yo2Var) {
        ap2 a2 = yo2Var.a();
        long j2 = e;
        m42 m42Var = f;
        if (m42Var.a > 0) {
            j2 = ((long[]) m42Var.c)[0];
        }
        long j3 = j2 - 1;
        ap2 ap2Var2 = null;
        ap2 ap2Var3 = null;
        while (true) {
            if (a2 == null) {
                break;
            }
            long j4 = a2.a;
            if (j4 == 0) {
                break;
            }
            if (j4 != 0 && Intrinsics.d(j4, j3) <= 0 && !rm2.q.c(j4)) {
                if (ap2Var3 == null) {
                    ap2Var3 = a2;
                } else if (Intrinsics.d(a2.a, ap2Var3.a) >= 0) {
                    ap2Var2 = ap2Var3;
                }
            }
            a2 = a2.b;
        }
        if (ap2Var2 != null) {
            ap2Var2.a = Long.MAX_VALUE;
            return ap2Var2;
        }
        ap2 b2 = ap2Var.b(Long.MAX_VALUE);
        b2.b = yo2Var.a();
        yo2Var.d(b2);
        return b2;
    }

    public static final void n(nm2 nm2Var, yo2 yo2Var) {
        nm2Var.t(nm2Var.h() + 1);
        Function1 i2 = nm2Var.i();
        if (i2 != null) {
            i2.invoke(yo2Var);
        }
    }

    public static final ap2 o(ap2 ap2Var, zo2 zo2Var, nm2 nm2Var, ap2 ap2Var2) {
        ap2 m;
        if (nm2Var.f()) {
            nm2Var.n(zo2Var);
        }
        long g2 = nm2Var.g();
        if (ap2Var2.a == g2) {
            return ap2Var2;
        }
        synchronized (c) {
            m = m(ap2Var, zo2Var);
        }
        m.a = g2;
        if (ap2Var2.a != 1) {
            nm2Var.n(zo2Var);
        }
        return m;
    }

    public static final boolean p(yo2 yo2Var) {
        ap2 ap2Var;
        long j2 = e;
        m42 m42Var = f;
        if (m42Var.a > 0) {
            j2 = ((long[]) m42Var.c)[0];
        }
        ap2 ap2Var2 = null;
        ap2 ap2Var3 = null;
        int i2 = 0;
        for (ap2 a2 = yo2Var.a(); a2 != null; a2 = a2.b) {
            long j3 = a2.a;
            if (j3 != 0) {
                if (Intrinsics.d(j3, j2) >= 0) {
                    i2++;
                } else if (ap2Var2 == null) {
                    i2++;
                    ap2Var2 = a2;
                } else {
                    if (Intrinsics.d(a2.a, ap2Var2.a) < 0) {
                        ap2Var = ap2Var2;
                        ap2Var2 = a2;
                    } else {
                        ap2Var = a2;
                    }
                    if (ap2Var3 == null) {
                        ap2Var3 = yo2Var.a();
                        ap2 ap2Var4 = ap2Var3;
                        while (true) {
                            if (ap2Var3 == null) {
                                ap2Var3 = ap2Var4;
                                break;
                            }
                            if (Intrinsics.d(ap2Var3.a, j2) >= 0) {
                                break;
                            }
                            if (Intrinsics.d(ap2Var4.a, ap2Var3.a) < 0) {
                                ap2Var4 = ap2Var3;
                            }
                            ap2Var3 = ap2Var3.b;
                        }
                    }
                    ap2Var2.a = 0L;
                    ap2Var2.a(ap2Var3);
                    ap2Var2 = ap2Var;
                }
            }
        }
        return i2 > 1;
    }

    public static final void q(yo2 yo2Var) {
        if (p(yo2Var)) {
            yf yfVar = g;
            int i2 = yfVar.n;
            int identityHashCode = System.identityHashCode(yo2Var);
            int i3 = -1;
            if (i2 > 0) {
                int i4 = yfVar.n - 1;
                int i5 = 0;
                while (true) {
                    if (i5 > i4) {
                        i3 = -(i5 + 1);
                        break;
                    }
                    int i6 = (i5 + i4) >>> 1;
                    int i7 = ((int[]) yfVar.o)[i6];
                    if (i7 < identityHashCode) {
                        i5 = i6 + 1;
                    } else if (i7 > identityHashCode) {
                        i4 = i6 - 1;
                    } else {
                        l63 l63Var = ((l63[]) yfVar.p)[i6];
                        if (yo2Var != (l63Var != null ? l63Var.get() : null)) {
                            for (int i8 = i6 - 1; -1 < i8 && ((int[]) yfVar.o)[i8] == identityHashCode; i8--) {
                                l63 l63Var2 = ((l63[]) yfVar.p)[i8];
                                if ((l63Var2 != null ? l63Var2.get() : null) == yo2Var) {
                                    i3 = i8;
                                    break;
                                }
                            }
                            i6++;
                            int i9 = yfVar.n;
                            while (true) {
                                if (i6 >= i9) {
                                    i3 = -(yfVar.n + 1);
                                    break;
                                } else {
                                    if (((int[]) yfVar.o)[i6] != identityHashCode) {
                                        i3 = -(i6 + 1);
                                        break;
                                    }
                                    l63 l63Var3 = ((l63[]) yfVar.p)[i6];
                                    if ((l63Var3 != null ? l63Var3.get() : null) == yo2Var) {
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
            l63[] l63VarArr = (l63[]) yfVar.p;
            int length = l63VarArr.length;
            if (i2 == length) {
                int i11 = length * 2;
                l63[] l63VarArr2 = new l63[i11];
                int[] iArr = new int[i11];
                int i12 = i10 + 1;
                System.arraycopy(l63VarArr, i10, l63VarArr2, i12, i2 - i10);
                System.arraycopy((l63[]) yfVar.p, 0, l63VarArr2, 0, i10);
                ni.d(i12, i10, i2, (int[]) yfVar.o, iArr);
                ni.h(0, i10, 6, (int[]) yfVar.o, iArr);
                yfVar.p = l63VarArr2;
                yfVar.o = iArr;
            } else {
                int i13 = i10 + 1;
                System.arraycopy(l63VarArr, i10, l63VarArr, i13, i2 - i10);
                int[] iArr2 = (int[]) yfVar.o;
                ni.d(i13, i10, i2, iArr2, iArr2);
            }
            ((l63[]) yfVar.p)[i10] = new l63(yo2Var);
            ((int[]) yfVar.o)[i10] = identityHashCode;
            yfVar.n++;
        }
    }

    public static final void r() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final ap2 s(ap2 ap2Var, long j2, rm2 rm2Var) {
        ap2 ap2Var2 = null;
        while (ap2Var != null) {
            long j3 = ap2Var.a;
            if (j3 != 0 && Intrinsics.d(j3, j2) <= 0 && !rm2Var.c(j3) && (ap2Var2 == null || Intrinsics.d(ap2Var2.a, ap2Var.a) < 0)) {
                ap2Var2 = ap2Var;
            }
            ap2Var = ap2Var.b;
        }
        if (ap2Var2 != null) {
            return ap2Var2;
        }
        return null;
    }

    public static final ap2 t(ap2 ap2Var, yo2 yo2Var) {
        ap2 s;
        nm2 k2 = k();
        Function1 e2 = k2.e();
        if (e2 != null) {
            e2.invoke(yo2Var);
        }
        ap2 s2 = s(ap2Var, k2.g(), k2.d());
        if (s2 != null) {
            return s2;
        }
        synchronized (c) {
            nm2 k3 = k();
            ap2 a2 = yo2Var.a();
            a2.getClass();
            s = s(a2, k3.g(), k3.d());
            if (s == null) {
                r();
                throw null;
            }
        }
        return s;
    }

    public static final void u(int i2) {
        m42 m42Var = f;
        int i3 = ((int[]) m42Var.e)[i2];
        m42Var.b(i3, m42Var.a - 1);
        m42Var.a--;
        long[] jArr = (long[]) m42Var.c;
        long j2 = jArr[i3];
        int i4 = i3;
        while (i4 > 0) {
            int i5 = ((i4 + 1) >> 1) - 1;
            if (Intrinsics.d(jArr[i5], j2) <= 0) {
                break;
            }
            m42Var.b(i5, i4);
            i4 = i5;
        }
        long[] jArr2 = (long[]) m42Var.c;
        int i6 = m42Var.a >> 1;
        while (i3 < i6) {
            int i7 = (i3 + 1) << 1;
            int i8 = i7 - 1;
            if (i7 < m42Var.a && Intrinsics.d(jArr2[i7], jArr2[i8]) < 0) {
                if (Intrinsics.d(jArr2[i7], jArr2[i3]) >= 0) {
                    break;
                }
                m42Var.b(i7, i3);
                i3 = i7;
            } else {
                if (Intrinsics.d(jArr2[i8], jArr2[i3]) >= 0) {
                    break;
                }
                m42Var.b(i8, i3);
                i3 = i8;
            }
        }
        ((int[]) m42Var.e)[i2] = m42Var.b;
        m42Var.b = i2;
    }

    public static final Object v(mv0 mv0Var, Function1 function1) {
        long j2 = mv0Var.b;
        Object invoke = function1.invoke(d.b(j2));
        long j3 = e;
        e = 1 + j3;
        rm2 b2 = d.b(j2);
        d = b2;
        mv0Var.b = j3;
        mv0Var.a = b2;
        mv0Var.g = 0;
        mv0Var.h = null;
        mv0Var.o();
        d = d.e(j3);
        return invoke;
    }

    public static final ap2 w(ap2 ap2Var, yo2 yo2Var, nm2 nm2Var) {
        ap2 s;
        if (nm2Var.f()) {
            nm2Var.n(yo2Var);
        }
        long g2 = nm2Var.g();
        ap2 s2 = s(ap2Var, g2, nm2Var.d());
        if (s2 == null) {
            r();
            throw null;
        }
        if (s2.a == nm2Var.g()) {
            return s2;
        }
        synchronized (c) {
            s = s(yo2Var.a(), g2, nm2Var.d());
            if (s == null) {
                r();
                throw null;
            }
            if (s.a != g2) {
                ap2 m = m(s, yo2Var);
                m.a(s);
                m.a = nm2Var.g();
                s = m;
            }
        }
        if (s2.a != 1) {
            nm2Var.n(yo2Var);
        }
        return s;
    }
}
