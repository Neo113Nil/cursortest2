package b1;

import java.util.HashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final a1.f f1028a = new a1.f(11);

    /* renamed from: b, reason: collision with root package name */
    public static final p.e f1029b = new p.e(15);

    /* renamed from: c, reason: collision with root package name */
    public static final Object f1030c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static o f1031d;

    /* renamed from: e, reason: collision with root package name */
    public static long f1032e;

    /* renamed from: f, reason: collision with root package name */
    public static final m f1033f;
    public static final c0 g;

    /* renamed from: h, reason: collision with root package name */
    public static Object f1034h;

    /* renamed from: i, reason: collision with root package name */
    public static Object f1035i;
    public static final c j;

    /* renamed from: k, reason: collision with root package name */
    public static final x0.a f1036k;

    /* JADX WARN: Type inference failed for: r5v1, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r5v2, types: [int[], java.io.Serializable] */
    static {
        o oVar = o.f1018s;
        f1031d = oVar;
        long j3 = 1;
        f1032e = j3 + j3;
        m mVar = new m();
        mVar.f1009c = new long[16];
        mVar.f1010d = new int[16];
        ?? r52 = new int[16];
        int i3 = 0;
        while (i3 < 16) {
            int i10 = i3 + 1;
            r52[i3] = i10;
            i3 = i10;
        }
        mVar.f1011e = r52;
        f1033f = mVar;
        c0 c0Var = new c0();
        c0Var.f954b = new int[16];
        c0Var.f955c = new x0.l[16];
        g = c0Var;
        kotlin.collections.j0 j0Var = kotlin.collections.j0.f5574d;
        f1034h = j0Var;
        f1035i = j0Var;
        long j10 = f1032e;
        f1032e = j3 + j10;
        c cVar = new c(j10, oVar, null, new a1.f(10));
        f1031d = f1031d.g(cVar.f984b);
        j = cVar;
        f1036k = new x0.a(0);
    }

    public static final void a() {
        e(f1028a);
    }

    public static final HashMap b(long j3, d dVar, o oVar) {
        long[] jArr;
        o oVar2;
        long[] jArr2;
        o oVar3;
        int i3;
        int i10;
        h0 s3;
        s.i0 x10 = dVar.x();
        if (x10 != null) {
            long g2 = dVar.g();
            o f3 = dVar.d().g(g2).f(dVar.j);
            Object[] objArr = x10.f8320b;
            long[] jArr3 = x10.f8319a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i11 = 0;
                HashMap hashMap = null;
                while (true) {
                    long j10 = jArr3[i11];
                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i12 = 8;
                        int i13 = 8 - ((~(i11 - length)) >>> 31);
                        int i14 = 0;
                        while (i14 < i13) {
                            if ((j10 & 255) < 128) {
                                f0 f0Var = (f0) objArr[(i11 << 3) + i14];
                                h0 c10 = f0Var.c();
                                jArr2 = jArr3;
                                i3 = i12;
                                i10 = i14;
                                h0 s10 = s(c10, j3, oVar);
                                if (s10 == null || (s3 = s(c10, g2, f3)) == null || s10.equals(s3)) {
                                    oVar3 = f3;
                                } else {
                                    oVar3 = f3;
                                    h0 s11 = s(c10, g2, dVar.d());
                                    if (s11 == null) {
                                        r();
                                        throw null;
                                    }
                                    h0 e2 = f0Var.e(s3, s10, s11);
                                    if (e2 == null) {
                                        return null;
                                    }
                                    if (hashMap == null) {
                                        hashMap = new HashMap();
                                    }
                                    hashMap.put(s10, e2);
                                    hashMap = hashMap;
                                }
                            } else {
                                jArr2 = jArr3;
                                oVar3 = f3;
                                i3 = i12;
                                i10 = i14;
                            }
                            j10 >>= i3;
                            i14 = i10 + 1;
                            i12 = i3;
                            jArr3 = jArr2;
                            f3 = oVar3;
                        }
                        jArr = jArr3;
                        oVar2 = f3;
                        if (i13 != i12) {
                            return hashMap;
                        }
                    } else {
                        jArr = jArr3;
                        oVar2 = f3;
                    }
                    if (i11 == length) {
                        return hashMap;
                    }
                    i11++;
                    jArr3 = jArr;
                    f3 = oVar2;
                }
            }
        }
        return null;
    }

    public static final void c(i iVar) {
        long j3;
        if (f1031d.e(iVar.g())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("Snapshot is not open: snapshotId=");
        sb2.append(iVar.g());
        sb2.append(", disposed=");
        sb2.append(iVar.f985c);
        sb2.append(", applied=");
        d dVar = iVar instanceof d ? (d) iVar : null;
        sb2.append(dVar != null ? Boolean.valueOf(dVar.f963m) : "read-only");
        sb2.append(", lowestPin=");
        synchronized (f1030c) {
            m mVar = f1033f;
            j3 = mVar.f1007a > 0 ? ((long[]) mVar.f1009c)[0] : -1L;
        }
        sb2.append(j3);
        throw new IllegalStateException(sb2.toString().toString());
    }

    public static final o d(o oVar, long j3, long j10) {
        while (Intrinsics.c(j3, j10) < 0) {
            oVar = oVar.g(j3);
            j3++;
        }
        return oVar;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public static final Object e(Function1 function1) {
        s.i0 i0Var;
        Object v10;
        c cVar = j;
        synchronized (f1030c) {
            try {
                i0Var = cVar.f959h;
                if (i0Var != null) {
                    f1036k.addAndGet(1);
                }
                v10 = v(cVar, function1);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i0Var != null) {
            try {
                ?? r42 = f1034h;
                o0.h hVar = new o0.h(i0Var);
                int size = r42.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((Function2) r42.get(i3)).invoke(hVar, cVar);
                }
            } finally {
                f1036k.addAndGet(-1);
            }
        }
        synchronized (f1030c) {
            f();
            if (i0Var != null) {
                Object[] objArr = i0Var.f8320b;
                long[] jArr = i0Var.f8319a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i10 = 0;
                    while (true) {
                        long j3 = jArr[i10];
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i11 = 8 - ((~(i10 - length)) >>> 31);
                            for (int i12 = 0; i12 < i11; i12++) {
                                if ((255 & j3) < 128) {
                                    q((f0) objArr[(i10 << 3) + i12]);
                                }
                                j3 >>= 8;
                            }
                            if (i11 != 8) {
                                break;
                            }
                        }
                        if (i10 == length) {
                            break;
                        }
                        i10++;
                    }
                }
            }
        }
        return v10;
    }

    public static final void f() {
        c0 c0Var = g;
        int i3 = c0Var.f953a;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 >= i3) {
                break;
            }
            x0.l lVar = ((x0.l[]) c0Var.f955c)[i10];
            Object obj = lVar != null ? lVar.get() : null;
            if (obj != null && p((f0) obj)) {
                if (i11 != i10) {
                    ((x0.l[]) c0Var.f955c)[i11] = lVar;
                    int[] iArr = (int[]) c0Var.f954b;
                    iArr[i11] = iArr[i10];
                }
                i11++;
            }
            i10++;
        }
        for (int i12 = i11; i12 < i3; i12++) {
            ((x0.l[]) c0Var.f955c)[i12] = null;
            ((int[]) c0Var.f954b)[i12] = 0;
        }
        if (i11 != i3) {
            c0Var.f953a = i11;
        }
    }

    public static final i g(i iVar, Function1 function1, boolean z10) {
        boolean z11 = iVar instanceof d;
        if (z11 || iVar == null) {
            return new k0(z11 ? (d) iVar : null, function1, null, false, z10);
        }
        return new l0(iVar, function1, false, z10);
    }

    public static final h0 h(h0 h0Var) {
        h0 s3;
        i j3 = j();
        h0 s10 = s(h0Var, j3.g(), j3.d());
        if (s10 != null) {
            return s10;
        }
        synchronized (f1030c) {
            i j10 = j();
            s3 = s(h0Var, j10.g(), j10.d());
        }
        if (s3 != null) {
            return s3;
        }
        r();
        throw null;
    }

    public static final h0 i(h0 h0Var, i iVar) {
        h0 s3;
        h0 s10 = s(h0Var, iVar.g(), iVar.d());
        if (s10 != null) {
            return s10;
        }
        synchronized (f1030c) {
            s3 = s(h0Var, iVar.g(), iVar.d());
        }
        if (s3 != null) {
            return s3;
        }
        r();
        throw null;
    }

    public static final i j() {
        i iVar = (i) f1029b.get();
        return iVar == null ? j : iVar;
    }

    public static final Function1 k(Function1 function1, Function1 function12, boolean z10) {
        if (!z10) {
            function12 = null;
        }
        return (function1 == null || function12 == null || function1 == function12) ? function1 == null ? function12 : function1 : new p(function1, function12, 0);
    }

    public static final Function1 l(Function1 function1, Function1 function12) {
        return (function1 == null || function12 == null || function1 == function12) ? function1 == null ? function12 : function1 : new p(function1, function12, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        r3 = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final h0 m(h0 h0Var, f0 f0Var) {
        h0 c10 = f0Var.c();
        long j3 = f1032e;
        m mVar = f1033f;
        if (mVar.f1007a > 0) {
            j3 = ((long[]) mVar.f1009c)[0];
        }
        long j10 = j3 - 1;
        h0 h0Var2 = null;
        h0 h0Var3 = null;
        while (true) {
            if (c10 == null) {
                break;
            }
            long j11 = c10.f981a;
            if (j11 == 0) {
                break;
            }
            if (j11 != 0 && Intrinsics.c(j11, j10) <= 0 && !o.f1018s.e(j11)) {
                if (h0Var3 == null) {
                    h0Var3 = c10;
                } else if (Intrinsics.c(c10.f981a, h0Var3.f981a) >= 0) {
                    h0Var2 = h0Var3;
                }
            }
            c10 = c10.f982b;
        }
        if (h0Var2 != null) {
            h0Var2.f981a = Long.MAX_VALUE;
            return h0Var2;
        }
        h0 b10 = h0Var.b(Long.MAX_VALUE);
        b10.f982b = f0Var.c();
        f0Var.b(b10);
        return b10;
    }

    public static final void n(i iVar, f0 f0Var) {
        iVar.t(iVar.h() + 1);
        Function1 i3 = iVar.i();
        if (i3 != null) {
            i3.invoke(f0Var);
        }
    }

    public static final h0 o(h0 h0Var, g0 g0Var, i iVar, h0 h0Var2) {
        h0 m10;
        if (iVar.f()) {
            iVar.n(g0Var);
        }
        long g2 = iVar.g();
        if (h0Var2.f981a == g2) {
            return h0Var2;
        }
        synchronized (f1030c) {
            m10 = m(h0Var, g0Var);
        }
        m10.f981a = g2;
        if (h0Var2.f981a != 1) {
            iVar.n(g0Var);
        }
        return m10;
    }

    public static final boolean p(f0 f0Var) {
        h0 h0Var;
        long j3 = f1032e;
        m mVar = f1033f;
        if (mVar.f1007a > 0) {
            j3 = ((long[]) mVar.f1009c)[0];
        }
        h0 h0Var2 = null;
        h0 h0Var3 = null;
        int i3 = 0;
        for (h0 c10 = f0Var.c(); c10 != null; c10 = c10.f982b) {
            long j10 = c10.f981a;
            if (j10 != 0) {
                if (Intrinsics.c(j10, j3) >= 0) {
                    i3++;
                } else if (h0Var2 == null) {
                    i3++;
                    h0Var2 = c10;
                } else {
                    if (Intrinsics.c(c10.f981a, h0Var2.f981a) < 0) {
                        h0Var = h0Var2;
                        h0Var2 = c10;
                    } else {
                        h0Var = c10;
                    }
                    if (h0Var3 == null) {
                        h0Var3 = f0Var.c();
                        h0 h0Var4 = h0Var3;
                        while (true) {
                            if (h0Var3 == null) {
                                h0Var3 = h0Var4;
                                break;
                            }
                            if (Intrinsics.c(h0Var3.f981a, j3) >= 0) {
                                break;
                            }
                            if (Intrinsics.c(h0Var4.f981a, h0Var3.f981a) < 0) {
                                h0Var4 = h0Var3;
                            }
                            h0Var3 = h0Var3.f982b;
                        }
                    }
                    h0Var2.f981a = 0L;
                    h0Var2.a(h0Var3);
                    h0Var2 = h0Var;
                }
            }
        }
        return i3 > 1;
    }

    public static final void q(f0 f0Var) {
        if (p(f0Var)) {
            c0 c0Var = g;
            int i3 = c0Var.f953a;
            int identityHashCode = System.identityHashCode(f0Var);
            int i10 = -1;
            if (i3 > 0) {
                int i11 = c0Var.f953a - 1;
                int i12 = 0;
                while (true) {
                    if (i12 > i11) {
                        i10 = -(i12 + 1);
                        break;
                    }
                    int i13 = (i12 + i11) >>> 1;
                    int i14 = ((int[]) c0Var.f954b)[i13];
                    if (i14 < identityHashCode) {
                        i12 = i13 + 1;
                    } else if (i14 > identityHashCode) {
                        i11 = i13 - 1;
                    } else {
                        x0.l lVar = ((x0.l[]) c0Var.f955c)[i13];
                        if (f0Var != (lVar != null ? lVar.get() : null)) {
                            for (int i15 = i13 - 1; -1 < i15 && ((int[]) c0Var.f954b)[i15] == identityHashCode; i15--) {
                                x0.l lVar2 = ((x0.l[]) c0Var.f955c)[i15];
                                if ((lVar2 != null ? lVar2.get() : null) == f0Var) {
                                    i10 = i15;
                                    break;
                                }
                            }
                            i13++;
                            int i16 = c0Var.f953a;
                            while (true) {
                                if (i13 >= i16) {
                                    i10 = -(c0Var.f953a + 1);
                                    break;
                                } else {
                                    if (((int[]) c0Var.f954b)[i13] != identityHashCode) {
                                        i10 = -(i13 + 1);
                                        break;
                                    }
                                    x0.l lVar3 = ((x0.l[]) c0Var.f955c)[i13];
                                    if ((lVar3 != null ? lVar3.get() : null) == f0Var) {
                                        break;
                                    } else {
                                        i13++;
                                    }
                                }
                            }
                        }
                        i10 = i13;
                    }
                }
                if (i10 >= 0) {
                    return;
                }
            }
            int i17 = -(i10 + 1);
            x0.l[] lVarArr = (x0.l[]) c0Var.f955c;
            int length = lVarArr.length;
            if (i3 == length) {
                int i18 = length * 2;
                x0.l[] lVarArr2 = new x0.l[i18];
                int[] iArr = new int[i18];
                int i19 = i17 + 1;
                System.arraycopy(lVarArr, i17, lVarArr2, i19, i3 - i17);
                System.arraycopy((x0.l[]) c0Var.f955c, 0, lVarArr2, 0, i17);
                kotlin.collections.v.c(i19, i17, i3, (int[]) c0Var.f954b, iArr);
                kotlin.collections.v.f(0, i17, 6, (int[]) c0Var.f954b, iArr);
                c0Var.f955c = lVarArr2;
                c0Var.f954b = iArr;
            } else {
                int i20 = i17 + 1;
                System.arraycopy(lVarArr, i17, lVarArr, i20, i3 - i17);
                int[] iArr2 = (int[]) c0Var.f954b;
                kotlin.collections.v.c(i20, i17, i3, iArr2, iArr2);
            }
            ((x0.l[]) c0Var.f955c)[i17] = new x0.l(f0Var);
            ((int[]) c0Var.f954b)[i17] = identityHashCode;
            c0Var.f953a++;
        }
    }

    public static final void r() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final h0 s(h0 h0Var, long j3, o oVar) {
        h0 h0Var2 = null;
        while (h0Var != null) {
            long j10 = h0Var.f981a;
            if (j10 != 0 && Intrinsics.c(j10, j3) <= 0 && !oVar.e(j10) && (h0Var2 == null || Intrinsics.c(h0Var2.f981a, h0Var.f981a) < 0)) {
                h0Var2 = h0Var;
            }
            h0Var = h0Var.f982b;
        }
        if (h0Var2 != null) {
            return h0Var2;
        }
        return null;
    }

    public static final h0 t(h0 h0Var, f0 f0Var) {
        h0 s3;
        i j3 = j();
        Function1 e2 = j3.e();
        if (e2 != null) {
            e2.invoke(f0Var);
        }
        h0 s10 = s(h0Var, j3.g(), j3.d());
        if (s10 != null) {
            return s10;
        }
        synchronized (f1030c) {
            i j10 = j();
            h0 c10 = f0Var.c();
            c10.getClass();
            s3 = s(c10, j10.g(), j10.d());
            if (s3 == null) {
                r();
                throw null;
            }
        }
        return s3;
    }

    public static final void u(int i3) {
        m mVar = f1033f;
        int i10 = ((int[]) mVar.f1011e)[i3];
        mVar.i(i10, mVar.f1007a - 1);
        mVar.f1007a--;
        long[] jArr = (long[]) mVar.f1009c;
        long j3 = jArr[i10];
        int i11 = i10;
        while (i11 > 0) {
            int i12 = ((i11 + 1) >> 1) - 1;
            if (Intrinsics.c(jArr[i12], j3) <= 0) {
                break;
            }
            mVar.i(i12, i11);
            i11 = i12;
        }
        long[] jArr2 = (long[]) mVar.f1009c;
        int i13 = mVar.f1007a >> 1;
        while (i10 < i13) {
            int i14 = (i10 + 1) << 1;
            int i15 = i14 - 1;
            if (i14 < mVar.f1007a && Intrinsics.c(jArr2[i14], jArr2[i15]) < 0) {
                if (Intrinsics.c(jArr2[i14], jArr2[i10]) >= 0) {
                    break;
                }
                mVar.i(i14, i10);
                i10 = i14;
            } else {
                if (Intrinsics.c(jArr2[i15], jArr2[i10]) >= 0) {
                    break;
                }
                mVar.i(i15, i10);
                i10 = i15;
            }
        }
        ((int[]) mVar.f1011e)[i3] = mVar.f1008b;
        mVar.f1008b = i3;
    }

    public static final Object v(c cVar, Function1 function1) {
        long j3 = cVar.f984b;
        Object invoke = function1.invoke(f1031d.c(j3));
        long j10 = f1032e;
        f1032e = 1 + j10;
        o c10 = f1031d.c(j3);
        f1031d = c10;
        cVar.f984b = j10;
        cVar.f983a = c10;
        cVar.g = 0;
        cVar.f959h = null;
        cVar.o();
        f1031d = f1031d.g(j10);
        return invoke;
    }

    public static final h0 w(h0 h0Var, f0 f0Var, i iVar) {
        h0 s3;
        if (iVar.f()) {
            iVar.n(f0Var);
        }
        long g2 = iVar.g();
        h0 s10 = s(h0Var, g2, iVar.d());
        if (s10 == null) {
            r();
            throw null;
        }
        if (s10.f981a == iVar.g()) {
            return s10;
        }
        synchronized (f1030c) {
            s3 = s(f0Var.c(), g2, iVar.d());
            if (s3 == null) {
                r();
                throw null;
            }
            if (s3.f981a != g2) {
                h0 m10 = m(s3, f0Var);
                m10.a(s3);
                m10.f981a = iVar.g();
                s3 = m10;
            }
        }
        if (s10.f981a != 1) {
            iVar.n(f0Var);
        }
        return s3;
    }
}
