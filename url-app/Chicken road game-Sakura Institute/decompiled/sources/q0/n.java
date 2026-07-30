package q0;

import g0.q2;
import i.b0;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final b1.b f7426a = new b1.b(3);

    /* renamed from: b, reason: collision with root package name */
    public static final Object f7427b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static l f7428c;

    /* renamed from: d, reason: collision with root package name */
    public static int f7429d;

    /* renamed from: e, reason: collision with root package name */
    public static final j f7430e;

    /* renamed from: f, reason: collision with root package name */
    public static final a0.l f7431f;

    /* renamed from: g, reason: collision with root package name */
    public static Object f7432g;

    /* renamed from: h, reason: collision with root package name */
    public static Object f7433h;

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicReference f7434i;

    /* renamed from: j, reason: collision with root package name */
    public static final g f7435j;

    /* renamed from: k, reason: collision with root package name */
    public static final g0.e f7436k;

    static {
        l lVar = l.f7418j;
        f7428c = lVar;
        f7429d = 2;
        j jVar = new j();
        jVar.f7409c = new int[16];
        jVar.f7410d = new int[16];
        int[] iArr = new int[16];
        int i7 = 0;
        while (i7 < 16) {
            int i8 = i7 + 1;
            iArr[i7] = i8;
            i7 = i8;
        }
        jVar.f7411e = iArr;
        f7430e = jVar;
        a0.l lVar2 = new a0.l(2, (byte) 0);
        lVar2.f101h = new int[16];
        lVar2.f102i = new q2[16];
        f7431f = lVar2;
        e6.u uVar = e6.u.f2826f;
        f7432g = uVar;
        f7433h = uVar;
        int i9 = f7429d;
        f7429d = i9 + 1;
        b bVar = new b(i9, lVar);
        f7428c = f7428c.x(bVar.f7403b);
        AtomicReference atomicReference = new AtomicReference(bVar);
        f7434i = atomicReference;
        f7435j = (g) atomicReference.get();
        f7436k = new g0.e(0);
    }

    public static final void a() {
        f(m.f7423h);
    }

    public static final q6.c b(q6.c cVar, q6.c cVar2) {
        return (cVar == null || cVar2 == null || cVar == cVar2) ? cVar == null ? cVar2 : cVar : new a(cVar, cVar2, 2);
    }

    public static final HashMap c(c cVar, c cVar2, l lVar) {
        long[] jArr;
        int i7;
        l lVar2;
        long[] jArr2;
        int i8;
        l lVar3;
        int i9;
        b0 w4 = cVar2.w();
        int d8 = cVar.d();
        if (w4 != null) {
            l w5 = cVar2.e().x(cVar2.d()).w(cVar2.f7392j);
            Object[] objArr = w4.f4722b;
            long[] jArr3 = w4.f4721a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i10 = 0;
                HashMap hashMap = null;
                while (true) {
                    long j8 = jArr3[i10];
                    if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i11 = 8;
                        int i12 = 8 - ((~(i10 - length)) >>> 31);
                        int i13 = 0;
                        while (i13 < i12) {
                            if ((255 & j8) < 128) {
                                u uVar = (u) objArr[(i10 << 3) + i13];
                                w a3 = uVar.a();
                                i9 = i11;
                                w s5 = s(a3, d8, lVar);
                                if (s5 == null) {
                                    jArr2 = jArr3;
                                } else {
                                    jArr2 = jArr3;
                                    w s8 = s(a3, d8, w5);
                                    if (s8 != null && !s5.equals(s8)) {
                                        i8 = d8;
                                        lVar3 = w5;
                                        w s9 = s(a3, cVar2.d(), cVar2.e());
                                        if (s9 == null) {
                                            r();
                                            throw null;
                                        }
                                        w g9 = uVar.g(s8, s5, s9);
                                        if (g9 == null) {
                                            return null;
                                        }
                                        if (hashMap == null) {
                                            hashMap = new HashMap();
                                        }
                                        hashMap.put(s5, g9);
                                        hashMap = hashMap;
                                    }
                                }
                                i8 = d8;
                                lVar3 = w5;
                            } else {
                                jArr2 = jArr3;
                                i8 = d8;
                                lVar3 = w5;
                                i9 = i11;
                            }
                            j8 >>= i9;
                            i13++;
                            i11 = i9;
                            jArr3 = jArr2;
                            d8 = i8;
                            w5 = lVar3;
                        }
                        jArr = jArr3;
                        i7 = d8;
                        lVar2 = w5;
                        if (i12 != i11) {
                            return hashMap;
                        }
                    } else {
                        jArr = jArr3;
                        i7 = d8;
                        lVar2 = w5;
                    }
                    if (i10 == length) {
                        return hashMap;
                    }
                    i10++;
                    jArr3 = jArr;
                    d8 = i7;
                    w5 = lVar2;
                }
            }
        }
        return null;
    }

    public static final void d(g gVar) {
        int i7;
        if (f7428c.m(gVar.d())) {
            return;
        }
        StringBuilder sb = new StringBuilder("Snapshot is not open: id=");
        sb.append(gVar.d());
        sb.append(", disposed=");
        sb.append(gVar.f7404c);
        sb.append(", applied=");
        c cVar = gVar instanceof c ? (c) gVar : null;
        sb.append(cVar != null ? Boolean.valueOf(cVar.f7395m) : "read-only");
        sb.append(", lowestPin=");
        synchronized (f7427b) {
            j jVar = f7430e;
            i7 = jVar.f7407a > 0 ? ((int[]) jVar.f7409c)[0] : -1;
        }
        sb.append(i7);
        throw new IllegalStateException(sb.toString().toString());
    }

    public static final l e(l lVar, int i7, int i8) {
        while (i7 < i8) {
            lVar = lVar.x(i7);
            i7++;
        }
        return lVar;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.List] */
    public static final Object f(q6.c cVar) {
        Object obj;
        b0 b0Var;
        Object v5;
        g gVar = f7435j;
        r6.k.d(gVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.GlobalSnapshot");
        synchronized (f7427b) {
            try {
                obj = f7434i.get();
                b0Var = ((b) obj).f7390h;
                if (b0Var != null) {
                    f7436k.addAndGet(1);
                }
                v5 = v((g) obj, cVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (b0Var != null) {
            try {
                ?? r42 = f7432g;
                int size = r42.size();
                for (int i7 = 0; i7 < size; i7++) {
                    ((q6.e) r42.get(i7)).d(new i0.f(b0Var), obj);
                }
            } finally {
                f7436k.addAndGet(-1);
            }
        }
        synchronized (f7427b) {
            g();
            if (b0Var != null) {
                Object[] objArr = b0Var.f4722b;
                long[] jArr = b0Var.f4721a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i8 = 0;
                    while (true) {
                        long j8 = jArr[i8];
                        if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i9 = 8 - ((~(i8 - length)) >>> 31);
                            for (int i10 = 0; i10 < i9; i10++) {
                                if ((255 & j8) < 128) {
                                    q((u) objArr[(i8 << 3) + i10]);
                                }
                                j8 >>= 8;
                            }
                            if (i9 != 8) {
                                break;
                            }
                        }
                        if (i8 == length) {
                            break;
                        }
                        i8++;
                    }
                }
            }
        }
        return v5;
    }

    public static final void g() {
        a0.l lVar = f7431f;
        int i7 = lVar.f100g;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            if (i8 >= i7) {
                break;
            }
            q2 q2Var = ((q2[]) lVar.f102i)[i8];
            Object obj = q2Var != null ? q2Var.get() : null;
            if (obj != null && p((u) obj)) {
                if (i9 != i8) {
                    ((q2[]) lVar.f102i)[i9] = q2Var;
                    int[] iArr = (int[]) lVar.f101h;
                    iArr[i9] = iArr[i8];
                }
                i9++;
            }
            i8++;
        }
        for (int i10 = i9; i10 < i7; i10++) {
            ((q2[]) lVar.f102i)[i10] = null;
            ((int[]) lVar.f101h)[i10] = 0;
        }
        if (i9 != i7) {
            lVar.f100g = i9;
        }
    }

    public static final g h(g gVar, q6.c cVar, boolean z8) {
        boolean z9 = gVar instanceof c;
        if (z9 || gVar == null) {
            return new y(z9 ? (c) gVar : null, cVar, null, false, z8);
        }
        return new z(gVar, cVar, z8);
    }

    public static final w i(w wVar) {
        w s5;
        g k8 = k();
        w s8 = s(wVar, k8.d(), k8.e());
        if (s8 != null) {
            return s8;
        }
        synchronized (f7427b) {
            g k9 = k();
            s5 = s(wVar, k9.d(), k9.e());
        }
        if (s5 != null) {
            return s5;
        }
        r();
        throw null;
    }

    public static final w j(w wVar, g gVar) {
        w s5 = s(wVar, gVar.d(), gVar.e());
        if (s5 != null) {
            return s5;
        }
        r();
        throw null;
    }

    public static final g k() {
        g gVar = (g) f7426a.j();
        return gVar == null ? (g) f7434i.get() : gVar;
    }

    public static final q6.c l(q6.c cVar, q6.c cVar2, boolean z8) {
        if (!z8) {
            cVar2 = null;
        }
        return (cVar == null || cVar2 == null || cVar == cVar2) ? cVar == null ? cVar2 : cVar : new a(cVar, cVar2, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
    
        r6 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final w m(w wVar, u uVar) {
        w a3 = uVar.a();
        int i7 = f7429d;
        j jVar = f7430e;
        if (jVar.f7407a > 0) {
            i7 = ((int[]) jVar.f7409c)[0];
        }
        int i8 = i7 - 1;
        w wVar2 = null;
        w wVar3 = null;
        while (true) {
            if (a3 != null) {
                int i9 = a3.f7464a;
                if (i9 == 0) {
                    break;
                }
                if (i9 != 0 && i9 <= i8) {
                    if ((r6 = i9 + 0) >= 0) {
                    }
                    boolean z8 = false;
                    if (z8) {
                        continue;
                    } else if (wVar3 == null) {
                        wVar3 = a3;
                    } else if (a3.f7464a >= wVar3.f7464a) {
                        wVar2 = wVar3;
                    }
                }
                a3 = a3.f7465b;
            } else {
                break;
            }
        }
        wVar2 = a3;
        if (wVar2 != null) {
            wVar2.f7464a = Integer.MAX_VALUE;
            return wVar2;
        }
        w b9 = wVar.b();
        b9.f7464a = Integer.MAX_VALUE;
        b9.f7465b = uVar.a();
        uVar.m(b9);
        return b9;
    }

    public static final void n(g gVar, u uVar) {
        gVar.s(gVar.h() + 1);
        q6.c i7 = gVar.i();
        if (i7 != null) {
            i7.f(uVar);
        }
    }

    public static final w o(w wVar, v vVar, g gVar, w wVar2) {
        w m8;
        if (gVar.g()) {
            gVar.n(vVar);
        }
        int d8 = gVar.d();
        if (wVar2.f7464a == d8) {
            return wVar2;
        }
        synchronized (f7427b) {
            m8 = m(wVar, vVar);
        }
        m8.f7464a = d8;
        if (wVar2.f7464a != 1) {
            gVar.n(vVar);
        }
        return m8;
    }

    public static final boolean p(u uVar) {
        w wVar;
        int i7 = f7429d;
        j jVar = f7430e;
        if (jVar.f7407a > 0) {
            i7 = ((int[]) jVar.f7409c)[0];
        }
        w wVar2 = null;
        w wVar3 = null;
        int i8 = 0;
        for (w a3 = uVar.a(); a3 != null; a3 = a3.f7465b) {
            int i9 = a3.f7464a;
            if (i9 != 0) {
                if (i9 >= i7) {
                    i8++;
                } else if (wVar2 == null) {
                    i8++;
                    wVar2 = a3;
                } else {
                    if (i9 < wVar2.f7464a) {
                        wVar = wVar2;
                        wVar2 = a3;
                    } else {
                        wVar = a3;
                    }
                    if (wVar3 == null) {
                        wVar3 = uVar.a();
                        w wVar4 = wVar3;
                        while (true) {
                            if (wVar3 == null) {
                                wVar3 = wVar4;
                                break;
                            }
                            int i10 = wVar3.f7464a;
                            if (i10 >= i7) {
                                break;
                            }
                            if (wVar4.f7464a < i10) {
                                wVar4 = wVar3;
                            }
                            wVar3 = wVar3.f7465b;
                        }
                    }
                    wVar2.f7464a = 0;
                    wVar2.a(wVar3);
                    wVar2 = wVar;
                }
            }
        }
        return i8 > 1;
    }

    public static final void q(u uVar) {
        if (p(uVar)) {
            a0.l lVar = f7431f;
            int i7 = lVar.f100g;
            int identityHashCode = System.identityHashCode(uVar);
            int i8 = -1;
            if (i7 > 0) {
                int i9 = lVar.f100g - 1;
                int i10 = 0;
                while (true) {
                    if (i10 > i9) {
                        i8 = -(i10 + 1);
                        break;
                    }
                    int i11 = (i10 + i9) >>> 1;
                    int i12 = ((int[]) lVar.f101h)[i11];
                    if (i12 < identityHashCode) {
                        i10 = i11 + 1;
                    } else if (i12 > identityHashCode) {
                        i9 = i11 - 1;
                    } else {
                        q2 q2Var = ((q2[]) lVar.f102i)[i11];
                        if (uVar != (q2Var != null ? q2Var.get() : null)) {
                            for (int i13 = i11 - 1; -1 < i13 && ((int[]) lVar.f101h)[i13] == identityHashCode; i13--) {
                                q2 q2Var2 = ((q2[]) lVar.f102i)[i13];
                                if ((q2Var2 != null ? q2Var2.get() : null) == uVar) {
                                    i8 = i13;
                                    break;
                                }
                            }
                            i11++;
                            int i14 = lVar.f100g;
                            while (true) {
                                if (i11 >= i14) {
                                    i8 = -(lVar.f100g + 1);
                                    break;
                                } else {
                                    if (((int[]) lVar.f101h)[i11] != identityHashCode) {
                                        i8 = -(i11 + 1);
                                        break;
                                    }
                                    q2 q2Var3 = ((q2[]) lVar.f102i)[i11];
                                    if ((q2Var3 != null ? q2Var3.get() : null) == uVar) {
                                        break;
                                    } else {
                                        i11++;
                                    }
                                }
                            }
                        }
                        i8 = i11;
                    }
                }
                if (i8 >= 0) {
                    return;
                }
            }
            int i15 = -(i8 + 1);
            q2[] q2VarArr = (q2[]) lVar.f102i;
            int length = q2VarArr.length;
            if (i7 == length) {
                int i16 = length * 2;
                q2[] q2VarArr2 = new q2[i16];
                int[] iArr = new int[i16];
                int i17 = i15 + 1;
                e6.k.X(q2VarArr, q2VarArr2, i17, i15, i7);
                e6.k.Z((q2[]) lVar.f102i, q2VarArr2, 0, i15, 6);
                e6.k.W((int[]) lVar.f101h, iArr, i17, i15, i7);
                e6.k.Y((int[]) lVar.f101h, iArr, 0, i15, 6);
                lVar.f102i = q2VarArr2;
                lVar.f101h = iArr;
            } else {
                int i18 = i15 + 1;
                e6.k.X(q2VarArr, q2VarArr, i18, i15, i7);
                int[] iArr2 = (int[]) lVar.f101h;
                e6.k.W(iArr2, iArr2, i18, i15, i7);
            }
            ((q2[]) lVar.f102i)[i15] = new q2(uVar);
            ((int[]) lVar.f101h)[i15] = identityHashCode;
            lVar.f100g++;
        }
    }

    public static final void r() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final w s(w wVar, int i7, l lVar) {
        w wVar2 = null;
        while (wVar != null) {
            int i8 = wVar.f7464a;
            if (i8 != 0 && i8 <= i7 && !lVar.m(i8) && (wVar2 == null || wVar2.f7464a < wVar.f7464a)) {
                wVar2 = wVar;
            }
            wVar = wVar.f7465b;
        }
        if (wVar2 != null) {
            return wVar2;
        }
        return null;
    }

    public static final w t(w wVar, u uVar) {
        w s5;
        g k8 = k();
        q6.c f9 = k8.f();
        if (f9 != null) {
            f9.f(uVar);
        }
        w s8 = s(wVar, k8.d(), k8.e());
        if (s8 != null) {
            return s8;
        }
        synchronized (f7427b) {
            g k9 = k();
            w a3 = uVar.a();
            r6.k.d(a3, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable$lambda$9");
            s5 = s(a3, k9.d(), k9.e());
            if (s5 == null) {
                r();
                throw null;
            }
        }
        return s5;
    }

    public static final void u(int i7) {
        int i8;
        j jVar = f7430e;
        int i9 = ((int[]) jVar.f7411e)[i7];
        jVar.b(i9, jVar.f7407a - 1);
        jVar.f7407a--;
        int[] iArr = (int[]) jVar.f7409c;
        int i10 = iArr[i9];
        int i11 = i9;
        while (i11 > 0) {
            int i12 = ((i11 + 1) >> 1) - 1;
            if (iArr[i12] <= i10) {
                break;
            }
            jVar.b(i12, i11);
            i11 = i12;
        }
        int[] iArr2 = (int[]) jVar.f7409c;
        int i13 = jVar.f7407a >> 1;
        while (i9 < i13) {
            int i14 = (i9 + 1) << 1;
            int i15 = i14 - 1;
            if (i14 < jVar.f7407a && (i8 = iArr2[i14]) < iArr2[i15]) {
                if (i8 >= iArr2[i9]) {
                    break;
                }
                jVar.b(i14, i9);
                i9 = i14;
            } else {
                if (iArr2[i15] >= iArr2[i9]) {
                    break;
                }
                jVar.b(i15, i9);
                i9 = i15;
            }
        }
        ((int[]) jVar.f7411e)[i7] = jVar.f7408b;
        jVar.f7408b = i7;
    }

    public static final Object v(g gVar, q6.c cVar) {
        Object f9 = cVar.f(f7428c.g(gVar.d()));
        synchronized (f7427b) {
            int i7 = f7429d;
            f7429d = i7 + 1;
            l g9 = f7428c.g(gVar.d());
            f7428c = g9;
            f7434i.set(new b(i7, g9));
            gVar.c();
            f7428c = f7428c.x(i7);
        }
        return f9;
    }

    public static final w w(w wVar, u uVar, g gVar) {
        w s5;
        if (gVar.g()) {
            gVar.n(uVar);
        }
        int d8 = gVar.d();
        w s8 = s(wVar, d8, gVar.e());
        if (s8 == null) {
            r();
            throw null;
        }
        if (s8.f7464a == gVar.d()) {
            return s8;
        }
        synchronized (f7427b) {
            s5 = s(uVar.a(), d8, gVar.e());
            if (s5 == null) {
                r();
                throw null;
            }
            if (s5.f7464a != d8) {
                w m8 = m(s5, uVar);
                m8.a(s5);
                m8.f7464a = gVar.d();
                s5 = m8;
            }
        }
        if (s8.f7464a != 1) {
            gVar.n(uVar);
        }
        return s5;
    }
}
