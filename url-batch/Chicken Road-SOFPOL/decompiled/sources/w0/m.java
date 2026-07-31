package w0;

import a0.b1;
import a0.g1;
import java.util.HashMap;
import o.k0;
import r.s1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final s1 f7535a = new s1(22);

    /* renamed from: b, reason: collision with root package name */
    public static final g1 f7536b = new g1(10);

    /* renamed from: c, reason: collision with root package name */
    public static final Object f7537c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static k f7538d;

    /* renamed from: e, reason: collision with root package name */
    public static long f7539e;

    /* renamed from: f, reason: collision with root package name */
    public static final g2.l f7540f;

    /* renamed from: g, reason: collision with root package name */
    public static final b1 f7541g;

    /* renamed from: h, reason: collision with root package name */
    public static Object f7542h;
    public static Object i;

    /* renamed from: j, reason: collision with root package name */
    public static final a f7543j;

    /* renamed from: k, reason: collision with root package name */
    public static final u0.a f7544k;

    static {
        k kVar = k.f7527h;
        f7538d = kVar;
        long j7 = 1;
        f7539e = j7 + j7;
        g2.l lVar = new g2.l();
        lVar.f2973c = new long[16];
        lVar.f2974d = new int[16];
        int[] iArr = new int[16];
        int i8 = 0;
        while (i8 < 16) {
            int i9 = i8 + 1;
            iArr[i8] = i9;
            i8 = i9;
        }
        lVar.f2975e = iArr;
        f7540f = lVar;
        b1 b1Var = new b1();
        b1Var.f23b = new int[16];
        b1Var.f24c = new u0.l[16];
        f7541g = b1Var;
        d6.u uVar = d6.u.f2326d;
        f7542h = uVar;
        i = uVar;
        long j8 = f7539e;
        f7539e = j7 + j8;
        a aVar = new a(j8, kVar, null, new s1(21));
        f7538d = f7538d.f(aVar.f7517b);
        f7543j = aVar;
        f7544k = new u0.a(0);
    }

    public static final void a() {
        f(f7535a);
    }

    public static final p6.c b(p6.c cVar, p6.c cVar2) {
        return (cVar == null || cVar2 == null || cVar == cVar2) ? cVar == null ? cVar2 : cVar : new l(cVar, cVar2, 1);
    }

    public static final HashMap c(long j7, b bVar, k kVar) {
        long[] jArr;
        k kVar2;
        long[] jArr2;
        k kVar3;
        int i8;
        w s5;
        long j8 = j7;
        k0 x7 = bVar.x();
        if (x7 != null) {
            k e8 = bVar.d().f(bVar.g()).e(bVar.f7506j);
            Object[] objArr = x7.f5490b;
            long[] jArr3 = x7.f5489a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i9 = 0;
                HashMap hashMap = null;
                while (true) {
                    long j9 = jArr3[i9];
                    if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i10 = 8;
                        int i11 = 8 - ((~(i9 - length)) >>> 31);
                        int i12 = 0;
                        while (i12 < i11) {
                            if ((j9 & 255) < 128) {
                                u uVar = (u) objArr[(i9 << 3) + i12];
                                w a8 = uVar.a();
                                jArr2 = jArr3;
                                i8 = i10;
                                w s7 = s(a8, j8, kVar);
                                if (s7 == null || (s5 = s(a8, j8, e8)) == null || s7.equals(s5)) {
                                    kVar3 = e8;
                                } else {
                                    kVar3 = e8;
                                    w s8 = s(a8, bVar.g(), bVar.d());
                                    if (s8 == null) {
                                        r();
                                        throw null;
                                    }
                                    w b8 = uVar.b(s5, s7, s8);
                                    if (b8 == null) {
                                        return null;
                                    }
                                    if (hashMap == null) {
                                        hashMap = new HashMap();
                                    }
                                    hashMap.put(s7, b8);
                                    hashMap = hashMap;
                                }
                            } else {
                                jArr2 = jArr3;
                                kVar3 = e8;
                                i8 = i10;
                            }
                            j9 >>= i8;
                            i12++;
                            j8 = j7;
                            i10 = i8;
                            jArr3 = jArr2;
                            e8 = kVar3;
                        }
                        jArr = jArr3;
                        kVar2 = e8;
                        if (i11 != i10) {
                            return hashMap;
                        }
                    } else {
                        jArr = jArr3;
                        kVar2 = e8;
                    }
                    if (i9 == length) {
                        return hashMap;
                    }
                    i9++;
                    j8 = j7;
                    jArr3 = jArr;
                    e8 = kVar2;
                }
            }
        }
        return null;
    }

    public static final void d(f fVar) {
        long j7;
        if (f7538d.c(fVar.g())) {
            return;
        }
        StringBuilder sb = new StringBuilder("Snapshot is not open: snapshotId=");
        sb.append(fVar.g());
        sb.append(", disposed=");
        sb.append(fVar.f7518c);
        sb.append(", applied=");
        b bVar = fVar instanceof b ? (b) fVar : null;
        sb.append(bVar != null ? Boolean.valueOf(bVar.f7509m) : "read-only");
        sb.append(", lowestPin=");
        synchronized (f7537c) {
            g2.l lVar = f7540f;
            j7 = lVar.f2971a > 0 ? ((long[]) lVar.f2973c)[0] : -1L;
        }
        sb.append(j7);
        throw new IllegalStateException(sb.toString().toString());
    }

    public static final k e(k kVar, long j7, long j8) {
        while (q6.i.g(j7, j8) < 0) {
            kVar = kVar.f(j7);
            j7++;
        }
        return kVar;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public static final Object f(p6.c cVar) {
        k0 k0Var;
        Object v7;
        a aVar = f7543j;
        synchronized (f7537c) {
            try {
                k0Var = aVar.f7505h;
                if (k0Var != null) {
                    f7544k.addAndGet(1);
                }
                v7 = v(aVar, cVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (k0Var != null) {
            try {
                ?? r42 = f7542h;
                int size = r42.size();
                for (int i8 = 0; i8 < size; i8++) {
                    ((p6.e) r42.get(i8)).g(new o0.g(k0Var), aVar);
                }
            } finally {
                f7544k.addAndGet(-1);
            }
        }
        synchronized (f7537c) {
            g();
            if (k0Var != null) {
                Object[] objArr = k0Var.f5490b;
                long[] jArr = k0Var.f5489a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i9 = 0;
                    while (true) {
                        long j7 = jArr[i9];
                        if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i10 = 8 - ((~(i9 - length)) >>> 31);
                            for (int i11 = 0; i11 < i10; i11++) {
                                if ((255 & j7) < 128) {
                                    q((u) objArr[(i9 << 3) + i11]);
                                }
                                j7 >>= 8;
                            }
                            if (i10 != 8) {
                                break;
                            }
                        }
                        if (i9 == length) {
                            break;
                        }
                        i9++;
                    }
                }
            }
        }
        return v7;
    }

    public static final void g() {
        b1 b1Var = f7541g;
        int i8 = b1Var.f22a;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            if (i9 >= i8) {
                break;
            }
            u0.l lVar = ((u0.l[]) b1Var.f24c)[i9];
            Object obj = lVar != null ? lVar.get() : null;
            if (obj != null && p((u) obj)) {
                if (i10 != i9) {
                    ((u0.l[]) b1Var.f24c)[i10] = lVar;
                    int[] iArr = (int[]) b1Var.f23b;
                    iArr[i10] = iArr[i9];
                }
                i10++;
            }
            i9++;
        }
        for (int i11 = i10; i11 < i8; i11++) {
            ((u0.l[]) b1Var.f24c)[i11] = null;
            ((int[]) b1Var.f23b)[i11] = 0;
        }
        if (i10 != i8) {
            b1Var.f22a = i10;
        }
    }

    public static final f h(f fVar, p6.c cVar, boolean z3) {
        boolean z7 = fVar instanceof b;
        if (z7 || fVar == null) {
            return new y(z7 ? (b) fVar : null, cVar, null, false, z3);
        }
        return new z(fVar, cVar, false, z3);
    }

    public static final w i(w wVar) {
        w s5;
        f k3 = k();
        w s7 = s(wVar, k3.g(), k3.d());
        if (s7 != null) {
            return s7;
        }
        synchronized (f7537c) {
            f k7 = k();
            s5 = s(wVar, k7.g(), k7.d());
        }
        if (s5 != null) {
            return s5;
        }
        r();
        throw null;
    }

    public static final w j(w wVar, f fVar) {
        w s5;
        w s7 = s(wVar, fVar.g(), fVar.d());
        if (s7 != null) {
            return s7;
        }
        synchronized (f7537c) {
            s5 = s(wVar, fVar.g(), fVar.d());
        }
        if (s5 != null) {
            return s5;
        }
        r();
        throw null;
    }

    public static final f k() {
        f fVar = (f) f7536b.l();
        return fVar == null ? f7543j : fVar;
    }

    public static final p6.c l(p6.c cVar, p6.c cVar2, boolean z3) {
        if (!z3) {
            cVar2 = null;
        }
        return (cVar == null || cVar2 == null || cVar == cVar2) ? cVar == null ? cVar2 : cVar : new l(cVar, cVar2, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        r3 = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final w m(w wVar, u uVar) {
        w a8 = uVar.a();
        long j7 = f7539e;
        g2.l lVar = f7540f;
        if (lVar.f2971a > 0) {
            j7 = ((long[]) lVar.f2973c)[0];
        }
        long j8 = j7 - 1;
        w wVar2 = null;
        w wVar3 = null;
        while (true) {
            if (a8 == null) {
                break;
            }
            long j9 = a8.f7572a;
            if (j9 == 0) {
                break;
            }
            if (j9 != 0 && q6.i.g(j9, j8) <= 0 && !k.f7527h.c(j9)) {
                if (wVar3 == null) {
                    wVar3 = a8;
                } else if (q6.i.g(a8.f7572a, wVar3.f7572a) >= 0) {
                    wVar2 = wVar3;
                }
            }
            a8 = a8.f7573b;
        }
        if (wVar2 != null) {
            wVar2.f7572a = Long.MAX_VALUE;
            return wVar2;
        }
        w b8 = wVar.b(Long.MAX_VALUE);
        b8.f7573b = uVar.a();
        uVar.c(b8);
        return b8;
    }

    public static final void n(f fVar, u uVar) {
        fVar.t(fVar.h() + 1);
        p6.c i8 = fVar.i();
        if (i8 != null) {
            i8.i(uVar);
        }
    }

    public static final w o(w wVar, v vVar, f fVar, w wVar2) {
        w m7;
        if (fVar.f()) {
            fVar.n(vVar);
        }
        long g3 = fVar.g();
        if (wVar2.f7572a == g3) {
            return wVar2;
        }
        synchronized (f7537c) {
            m7 = m(wVar, vVar);
        }
        m7.f7572a = g3;
        if (wVar2.f7572a != 1) {
            fVar.n(vVar);
        }
        return m7;
    }

    public static final boolean p(u uVar) {
        w wVar;
        long j7 = f7539e;
        g2.l lVar = f7540f;
        if (lVar.f2971a > 0) {
            j7 = ((long[]) lVar.f2973c)[0];
        }
        w wVar2 = null;
        w wVar3 = null;
        int i8 = 0;
        for (w a8 = uVar.a(); a8 != null; a8 = a8.f7573b) {
            long j8 = a8.f7572a;
            if (j8 != 0) {
                if (q6.i.g(j8, j7) >= 0) {
                    i8++;
                } else if (wVar2 == null) {
                    i8++;
                    wVar2 = a8;
                } else {
                    if (q6.i.g(a8.f7572a, wVar2.f7572a) < 0) {
                        wVar = wVar2;
                        wVar2 = a8;
                    } else {
                        wVar = a8;
                    }
                    if (wVar3 == null) {
                        wVar3 = uVar.a();
                        w wVar4 = wVar3;
                        while (true) {
                            if (wVar3 == null) {
                                wVar3 = wVar4;
                                break;
                            }
                            if (q6.i.g(wVar3.f7572a, j7) >= 0) {
                                break;
                            }
                            if (q6.i.g(wVar4.f7572a, wVar3.f7572a) < 0) {
                                wVar4 = wVar3;
                            }
                            wVar3 = wVar3.f7573b;
                        }
                    }
                    wVar2.f7572a = 0L;
                    wVar2.a(wVar3);
                    wVar2 = wVar;
                }
            }
        }
        return i8 > 1;
    }

    public static final void q(u uVar) {
        if (p(uVar)) {
            b1 b1Var = f7541g;
            int i8 = b1Var.f22a;
            int identityHashCode = System.identityHashCode(uVar);
            int i9 = -1;
            if (i8 > 0) {
                int i10 = b1Var.f22a - 1;
                int i11 = 0;
                while (true) {
                    if (i11 > i10) {
                        i9 = -(i11 + 1);
                        break;
                    }
                    int i12 = (i11 + i10) >>> 1;
                    int i13 = ((int[]) b1Var.f23b)[i12];
                    if (i13 < identityHashCode) {
                        i11 = i12 + 1;
                    } else if (i13 > identityHashCode) {
                        i10 = i12 - 1;
                    } else {
                        u0.l lVar = ((u0.l[]) b1Var.f24c)[i12];
                        if (uVar != (lVar != null ? lVar.get() : null)) {
                            for (int i14 = i12 - 1; -1 < i14 && ((int[]) b1Var.f23b)[i14] == identityHashCode; i14--) {
                                u0.l lVar2 = ((u0.l[]) b1Var.f24c)[i14];
                                if ((lVar2 != null ? lVar2.get() : null) == uVar) {
                                    i9 = i14;
                                    break;
                                }
                            }
                            i12++;
                            int i15 = b1Var.f22a;
                            while (true) {
                                if (i12 >= i15) {
                                    i9 = -(b1Var.f22a + 1);
                                    break;
                                } else {
                                    if (((int[]) b1Var.f23b)[i12] != identityHashCode) {
                                        i9 = -(i12 + 1);
                                        break;
                                    }
                                    u0.l lVar3 = ((u0.l[]) b1Var.f24c)[i12];
                                    if ((lVar3 != null ? lVar3.get() : null) == uVar) {
                                        break;
                                    } else {
                                        i12++;
                                    }
                                }
                            }
                        }
                        i9 = i12;
                    }
                }
                if (i9 >= 0) {
                    return;
                }
            }
            int i16 = -(i9 + 1);
            u0.l[] lVarArr = (u0.l[]) b1Var.f24c;
            int length = lVarArr.length;
            if (i8 == length) {
                int i17 = length * 2;
                u0.l[] lVarArr2 = new u0.l[i17];
                int[] iArr = new int[i17];
                int i18 = i16 + 1;
                System.arraycopy(lVarArr, i16, lVarArr2, i18, i8 - i16);
                System.arraycopy((u0.l[]) b1Var.f24c, 0, lVarArr2, 0, i16);
                d6.l.F(i18, i16, i8, (int[]) b1Var.f23b, iArr);
                d6.l.I(0, i16, 6, (int[]) b1Var.f23b, iArr);
                b1Var.f24c = lVarArr2;
                b1Var.f23b = iArr;
            } else {
                int i19 = i16 + 1;
                System.arraycopy(lVarArr, i16, lVarArr, i19, i8 - i16);
                int[] iArr2 = (int[]) b1Var.f23b;
                d6.l.F(i19, i16, i8, iArr2, iArr2);
            }
            ((u0.l[]) b1Var.f24c)[i16] = new u0.l(uVar);
            ((int[]) b1Var.f23b)[i16] = identityHashCode;
            b1Var.f22a++;
        }
    }

    public static final void r() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final w s(w wVar, long j7, k kVar) {
        w wVar2 = null;
        while (wVar != null) {
            long j8 = wVar.f7572a;
            if (j8 != 0 && q6.i.g(j8, j7) <= 0 && !kVar.c(j8) && (wVar2 == null || q6.i.g(wVar2.f7572a, wVar.f7572a) < 0)) {
                wVar2 = wVar;
            }
            wVar = wVar.f7573b;
        }
        if (wVar2 != null) {
            return wVar2;
        }
        return null;
    }

    public static final w t(w wVar, u uVar) {
        w s5;
        f k3 = k();
        p6.c e8 = k3.e();
        if (e8 != null) {
            e8.i(uVar);
        }
        w s7 = s(wVar, k3.g(), k3.d());
        if (s7 != null) {
            return s7;
        }
        synchronized (f7537c) {
            f k7 = k();
            w a8 = uVar.a();
            q6.i.c(a8, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable");
            s5 = s(a8, k7.g(), k7.d());
            if (s5 == null) {
                r();
                throw null;
            }
        }
        return s5;
    }

    public static final void u(int i8) {
        g2.l lVar = f7540f;
        int i9 = ((int[]) lVar.f2975e)[i8];
        lVar.c(i9, lVar.f2971a - 1);
        lVar.f2971a--;
        long[] jArr = (long[]) lVar.f2973c;
        long j7 = jArr[i9];
        int i10 = i9;
        while (i10 > 0) {
            int i11 = ((i10 + 1) >> 1) - 1;
            if (q6.i.g(jArr[i11], j7) <= 0) {
                break;
            }
            lVar.c(i11, i10);
            i10 = i11;
        }
        long[] jArr2 = (long[]) lVar.f2973c;
        int i12 = lVar.f2971a >> 1;
        while (i9 < i12) {
            int i13 = (i9 + 1) << 1;
            int i14 = i13 - 1;
            if (i13 < lVar.f2971a && q6.i.g(jArr2[i13], jArr2[i14]) < 0) {
                if (q6.i.g(jArr2[i13], jArr2[i9]) >= 0) {
                    break;
                }
                lVar.c(i13, i9);
                i9 = i13;
            } else {
                if (q6.i.g(jArr2[i14], jArr2[i9]) >= 0) {
                    break;
                }
                lVar.c(i14, i9);
                i9 = i14;
            }
        }
        ((int[]) lVar.f2975e)[i8] = lVar.f2972b;
        lVar.f2972b = i8;
    }

    public static final Object v(a aVar, p6.c cVar) {
        long j7 = aVar.f7517b;
        Object i8 = cVar.i(f7538d.b(j7));
        long j8 = f7539e;
        f7539e = 1 + j8;
        k b8 = f7538d.b(j7);
        f7538d = b8;
        aVar.f7517b = j8;
        aVar.f7516a = b8;
        aVar.f7504g = 0;
        aVar.f7505h = null;
        aVar.o();
        f7538d = f7538d.f(j8);
        return i8;
    }

    public static final w w(w wVar, u uVar, f fVar) {
        w s5;
        if (fVar.f()) {
            fVar.n(uVar);
        }
        long g3 = fVar.g();
        w s7 = s(wVar, g3, fVar.d());
        if (s7 == null) {
            r();
            throw null;
        }
        if (s7.f7572a == fVar.g()) {
            return s7;
        }
        synchronized (f7537c) {
            s5 = s(uVar.a(), g3, fVar.d());
            if (s5 == null) {
                r();
                throw null;
            }
            if (s5.f7572a != g3) {
                w m7 = m(s5, uVar);
                m7.a(s5);
                m7.f7572a = fVar.g();
                s5 = m7;
            }
        }
        if (s7.f7572a != 1) {
            fVar.n(uVar);
        }
        return s5;
    }
}
