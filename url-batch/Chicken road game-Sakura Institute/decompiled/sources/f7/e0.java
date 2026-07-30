package f7;

import c7.x0;
import java.util.Arrays;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public class e0 extends g7.b implements w, f, g7.s {

    /* renamed from: j, reason: collision with root package name */
    public final int f3461j;

    /* renamed from: k, reason: collision with root package name */
    public final int f3462k;

    /* renamed from: l, reason: collision with root package name */
    public final e7.a f3463l;

    /* renamed from: m, reason: collision with root package name */
    public Object[] f3464m;

    /* renamed from: n, reason: collision with root package name */
    public long f3465n;

    /* renamed from: o, reason: collision with root package name */
    public long f3466o;

    /* renamed from: p, reason: collision with root package name */
    public int f3467p;

    /* renamed from: q, reason: collision with root package name */
    public int f3468q;

    public e0(int i7, int i8, e7.a aVar) {
        this.f3461j = i7;
        this.f3462k = i8;
        this.f3463l = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0081 A[Catch: all -> 0x0036, TRY_ENTER, TryCatch #1 {all -> 0x0036, blocks: (B:14:0x002f, B:18:0x0077, B:21:0x0081, B:30:0x0094, B:33:0x009b, B:34:0x009f, B:36:0x00a0, B:42:0x0049), top: B:7:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /* JADX WARN: Type inference failed for: r4v1, types: [g7.b] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4, types: [f7.e0] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r9v0, types: [f7.g] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v2, types: [g7.d] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [f7.g0] */
    /* JADX WARN: Type inference failed for: r9v8, types: [f7.g0] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00ae -> B:15:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m(e0 e0Var, g gVar, h6.d dVar) {
        d0 d0Var;
        int i7;
        ?? r42;
        g gVar2;
        x0 x0Var;
        x0 x0Var2;
        g gVar3;
        Object u8;
        h7.s sVar;
        i6.a aVar;
        g0 g0Var;
        try {
            try {
                if (dVar instanceof d0) {
                    d0Var = (d0) dVar;
                    int i8 = d0Var.f3459l;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        d0Var.f3459l = i8 - Integer.MIN_VALUE;
                        Object obj = d0Var.f3457j;
                        i7 = d0Var.f3459l;
                        if (i7 != 0) {
                            d6.a.e(obj);
                            gVar2 = gVar;
                            gVar = (g0) e0Var.c();
                        } else {
                            if (i7 != 1) {
                                if (i7 == 2) {
                                    x0Var2 = d0Var.f3456i;
                                    g0 g0Var2 = d0Var.f3455h;
                                    gVar3 = d0Var.f3454g;
                                    e0 e0Var2 = d0Var.f3453f;
                                    d6.a.e(obj);
                                    r42 = e0Var2;
                                    gVar = g0Var2;
                                    do {
                                        u8 = r42.u(gVar);
                                        sVar = f0.f3469a;
                                        aVar = i6.a.f4956f;
                                        if (u8 == sVar) {
                                        }
                                    } while (r42.j(gVar, d0Var) != aVar);
                                    return;
                                }
                                if (i7 != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                x0Var2 = d0Var.f3456i;
                                g0 g0Var3 = d0Var.f3455h;
                                gVar3 = d0Var.f3454g;
                                e0 e0Var3 = d0Var.f3453f;
                                d6.a.e(obj);
                                e0 e0Var4 = e0Var3;
                                g0 g0Var4 = g0Var3;
                                gVar2 = gVar3;
                                x0Var = x0Var2;
                                e0Var = e0Var4;
                                g0Var = g0Var4;
                                r42 = e0Var;
                                x0Var2 = x0Var;
                                gVar3 = gVar2;
                                gVar = g0Var;
                                do {
                                    u8 = r42.u(gVar);
                                    sVar = f0.f3469a;
                                    aVar = i6.a.f4956f;
                                    if (u8 == sVar) {
                                        if (x0Var2 != null && !x0Var2.b()) {
                                            throw x0Var2.w();
                                        }
                                        d0Var.f3453f = r42;
                                        d0Var.f3454g = gVar3;
                                        d0Var.f3455h = gVar;
                                        d0Var.f3456i = x0Var2;
                                        d0Var.f3459l = 3;
                                        e0Var4 = r42;
                                        g0Var4 = gVar;
                                        if (gVar3.k(u8, d0Var) == aVar) {
                                            return;
                                        }
                                        gVar2 = gVar3;
                                        x0Var = x0Var2;
                                        e0Var = e0Var4;
                                        g0Var = g0Var4;
                                        r42 = e0Var;
                                        x0Var2 = x0Var;
                                        gVar3 = gVar2;
                                        gVar = g0Var;
                                        u8 = r42.u(gVar);
                                        sVar = f0.f3469a;
                                        aVar = i6.a.f4956f;
                                        if (u8 == sVar) {
                                            d0Var.f3453f = r42;
                                            d0Var.f3454g = gVar3;
                                            d0Var.f3455h = gVar;
                                            d0Var.f3456i = x0Var2;
                                            d0Var.f3459l = 2;
                                        }
                                    }
                                } while (r42.j(gVar, d0Var) != aVar);
                                return;
                            }
                            gVar = d0Var.f3455h;
                            g gVar4 = d0Var.f3454g;
                            e0 e0Var5 = d0Var.f3453f;
                            try {
                                d6.a.e(obj);
                                gVar2 = gVar4;
                                e0Var = e0Var5;
                                gVar = gVar;
                            } catch (Throwable th) {
                                th = th;
                                r42 = e0Var5;
                                r42.f(gVar);
                                throw th;
                            }
                        }
                        x0Var = (x0) d0Var.getContext().u(c7.u.f1748g);
                        g0Var = gVar;
                        r42 = e0Var;
                        x0Var2 = x0Var;
                        gVar3 = gVar2;
                        gVar = g0Var;
                        do {
                            u8 = r42.u(gVar);
                            sVar = f0.f3469a;
                            aVar = i6.a.f4956f;
                            if (u8 == sVar) {
                            }
                        } while (r42.j(gVar, d0Var) != aVar);
                        return;
                    }
                }
                x0Var = (x0) d0Var.getContext().u(c7.u.f1748g);
                g0Var = gVar;
                r42 = e0Var;
                x0Var2 = x0Var;
                gVar3 = gVar2;
                gVar = g0Var;
                do {
                    u8 = r42.u(gVar);
                    sVar = f0.f3469a;
                    aVar = i6.a.f4956f;
                    if (u8 == sVar) {
                    }
                } while (r42.j(gVar, d0Var) != aVar);
                return;
            } catch (Throwable th2) {
                r42 = e0Var;
                th = th2;
                r42.f(gVar);
                throw th;
            }
            if (i7 != 0) {
            }
        } catch (Throwable th3) {
            th = th3;
        }
        d0Var = new d0(e0Var, dVar);
        Object obj2 = d0Var.f3457j;
        i7 = d0Var.f3459l;
    }

    @Override // g7.s
    public final f a(h6.i iVar, int i7, e7.a aVar) {
        return f0.l(this, iVar, i7, aVar);
    }

    @Override // f7.f
    public final Object b(g gVar, h6.d dVar) {
        m(this, gVar, dVar);
        return i6.a.f4956f;
    }

    @Override // g7.b
    public final g7.d d() {
        g0 g0Var = new g0();
        g0Var.f3472a = -1L;
        return g0Var;
    }

    @Override // g7.b
    public final g7.d[] e() {
        return new g0[2];
    }

    @Override // f7.w
    public final void h() {
        synchronized (this) {
            try {
                try {
                    v(q() + this.f3467p, this.f3466o, q() + this.f3467p, q() + this.f3467p + this.f3468q);
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    @Override // f7.w
    public final boolean i(Object obj) {
        int i7;
        boolean z8;
        h6.d[] dVarArr = g7.c.f4480a;
        synchronized (this) {
            if (s(obj)) {
                dVarArr = p(dVarArr);
                z8 = true;
            } else {
                z8 = false;
            }
        }
        for (h6.d dVar : dVarArr) {
            if (dVar != null) {
                dVar.resumeWith(d6.z.f2639a);
            }
        }
        return z8;
    }

    public final Object j(g0 g0Var, d0 d0Var) {
        c7.h hVar = new c7.h(1, a8.m.A(d0Var));
        hVar.r();
        synchronized (this) {
            try {
                if (t(g0Var) < 0) {
                    g0Var.f3473b = hVar;
                } else {
                    hVar.resumeWith(d6.z.f2639a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Object q8 = hVar.q();
        return q8 == i6.a.f4956f ? q8 : d6.z.f2639a;
    }

    @Override // f7.g
    public final Object k(Object obj, h6.d dVar) {
        Throwable th;
        h6.d[] p6;
        c0 c0Var;
        if (i(obj)) {
            return d6.z.f2639a;
        }
        c7.h hVar = new c7.h(1, a8.m.A(dVar));
        hVar.r();
        h6.d[] dVarArr = g7.c.f4480a;
        synchronized (this) {
            try {
                if (s(obj)) {
                    try {
                        hVar.resumeWith(d6.z.f2639a);
                        p6 = p(dVarArr);
                        c0Var = null;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } else {
                    try {
                        c0 c0Var2 = new c0(this, q() + this.f3467p + this.f3468q, obj, hVar);
                        o(c0Var2);
                        this.f3468q++;
                        if (this.f3462k == 0) {
                            dVarArr = p(dVarArr);
                        }
                        p6 = dVarArr;
                        c0Var = c0Var2;
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        throw th;
                    }
                }
                if (c0Var != null) {
                    hVar.u(new c7.e(2, c0Var));
                }
                for (h6.d dVar2 : p6) {
                    if (dVar2 != null) {
                        dVar2.resumeWith(d6.z.f2639a);
                    }
                }
                Object q8 = hVar.q();
                i6.a aVar = i6.a.f4956f;
                if (q8 != aVar) {
                    q8 = d6.z.f2639a;
                }
                return q8 == aVar ? q8 : d6.z.f2639a;
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    public final void l() {
        if (this.f3462k != 0 || this.f3468q > 1) {
            Object[] objArr = this.f3464m;
            r6.k.c(objArr);
            while (this.f3468q > 0) {
                long q8 = q();
                int i7 = this.f3467p;
                int i8 = this.f3468q;
                if (objArr[((int) ((q8 + (i7 + i8)) - 1)) & (objArr.length - 1)] != f0.f3469a) {
                    return;
                }
                this.f3468q = i8 - 1;
                f0.e(objArr, q() + this.f3467p + this.f3468q, null);
            }
        }
    }

    public final void n() {
        g7.d[] dVarArr;
        Object[] objArr = this.f3464m;
        r6.k.c(objArr);
        f0.e(objArr, q(), null);
        this.f3467p--;
        long q8 = q() + 1;
        if (this.f3465n < q8) {
            this.f3465n = q8;
        }
        if (this.f3466o < q8) {
            if (this.f4477g != 0 && (dVarArr = this.f4476f) != null) {
                for (g7.d dVar : dVarArr) {
                    if (dVar != null) {
                        g0 g0Var = (g0) dVar;
                        long j8 = g0Var.f3472a;
                        if (j8 >= 0 && j8 < q8) {
                            g0Var.f3472a = q8;
                        }
                    }
                }
            }
            this.f3466o = q8;
        }
    }

    public final void o(Object obj) {
        int i7 = this.f3467p + this.f3468q;
        Object[] objArr = this.f3464m;
        if (objArr == null) {
            objArr = r(null, 0, 2);
        } else if (i7 >= objArr.length) {
            objArr = r(objArr, i7, objArr.length * 2);
        }
        f0.e(objArr, q() + i7, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object, java.lang.Object[]] */
    public final h6.d[] p(h6.d[] dVarArr) {
        g7.d[] dVarArr2;
        g0 g0Var;
        c7.h hVar;
        int length = dVarArr.length;
        if (this.f4477g != 0 && (dVarArr2 = this.f4476f) != null) {
            int length2 = dVarArr2.length;
            int i7 = 0;
            dVarArr = dVarArr;
            while (i7 < length2) {
                g7.d dVar = dVarArr2[i7];
                if (dVar != null && (hVar = (g0Var = (g0) dVar).f3473b) != null && t(g0Var) >= 0) {
                    int length3 = dVarArr.length;
                    dVarArr = dVarArr;
                    if (length >= length3) {
                        ?? copyOf = Arrays.copyOf(dVarArr, Math.max(2, dVarArr.length * 2));
                        r6.k.e(copyOf, "copyOf(...)");
                        dVarArr = copyOf;
                    }
                    dVarArr[length] = hVar;
                    g0Var.f3473b = null;
                    length++;
                }
                i7++;
                dVarArr = dVarArr;
            }
        }
        return dVarArr;
    }

    public final long q() {
        return Math.min(this.f3466o, this.f3465n);
    }

    public final Object[] r(Object[] objArr, int i7, int i8) {
        if (i8 <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] objArr2 = new Object[i8];
        this.f3464m = objArr2;
        if (objArr != null) {
            long q8 = q();
            for (int i9 = 0; i9 < i7; i9++) {
                long j8 = i9 + q8;
                f0.e(objArr2, j8, objArr[((int) j8) & (objArr.length - 1)]);
            }
        }
        return objArr2;
    }

    public final boolean s(Object obj) {
        int i7 = this.f4477g;
        int i8 = this.f3461j;
        if (i7 != 0) {
            int i9 = this.f3467p;
            int i10 = this.f3462k;
            if (i9 >= i10 && this.f3466o <= this.f3465n) {
                int ordinal = this.f3463l.ordinal();
                if (ordinal == 0) {
                    return false;
                }
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        throw new b4.c();
                    }
                }
            }
            o(obj);
            int i11 = this.f3467p + 1;
            this.f3467p = i11;
            if (i11 > i10) {
                n();
            }
            long q8 = q() + this.f3467p;
            long j8 = this.f3465n;
            if (((int) (q8 - j8)) > i8) {
                v(1 + j8, this.f3466o, q() + this.f3467p, q() + this.f3467p + this.f3468q);
            }
        } else if (i8 != 0) {
            o(obj);
            int i12 = this.f3467p + 1;
            this.f3467p = i12;
            if (i12 > i8) {
                n();
            }
            this.f3466o = q() + this.f3467p;
            return true;
        }
        return true;
    }

    public final long t(g0 g0Var) {
        long j8 = g0Var.f3472a;
        if (j8 < q() + this.f3467p) {
            return j8;
        }
        if (this.f3462k <= 0 && j8 <= q() && this.f3468q != 0) {
            return j8;
        }
        return -1L;
    }

    public final Object u(g0 g0Var) {
        Object obj;
        h6.d[] dVarArr = g7.c.f4480a;
        synchronized (this) {
            try {
                long t2 = t(g0Var);
                if (t2 < 0) {
                    obj = f0.f3469a;
                } else {
                    long j8 = g0Var.f3472a;
                    Object[] objArr = this.f3464m;
                    r6.k.c(objArr);
                    Object obj2 = objArr[((int) t2) & (objArr.length - 1)];
                    if (obj2 instanceof c0) {
                        obj2 = ((c0) obj2).f3448h;
                    }
                    g0Var.f3472a = t2 + 1;
                    Object obj3 = obj2;
                    dVarArr = w(j8);
                    obj = obj3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (h6.d dVar : dVarArr) {
            if (dVar != null) {
                dVar.resumeWith(d6.z.f2639a);
            }
        }
        return obj;
    }

    public final void v(long j8, long j9, long j10, long j11) {
        long min = Math.min(j9, j8);
        for (long q8 = q(); q8 < min; q8++) {
            Object[] objArr = this.f3464m;
            r6.k.c(objArr);
            f0.e(objArr, q8, null);
        }
        this.f3465n = j8;
        this.f3466o = j9;
        this.f3467p = (int) (j10 - min);
        this.f3468q = (int) (j11 - j10);
    }

    public final h6.d[] w(long j8) {
        long j9;
        long j10;
        long j11;
        h6.d[] dVarArr;
        h6.d[] dVarArr2;
        g7.d[] dVarArr3;
        h7.s sVar = f0.f3469a;
        h6.d[] dVarArr4 = g7.c.f4480a;
        if (j8 <= this.f3466o) {
            long q8 = q();
            long j12 = this.f3467p + q8;
            int i7 = this.f3462k;
            if (i7 == 0 && this.f3468q > 0) {
                j12++;
            }
            int i8 = 0;
            if (this.f4477g != 0 && (dVarArr3 = this.f4476f) != null) {
                for (g7.d dVar : dVarArr3) {
                    if (dVar != null) {
                        long j13 = ((g0) dVar).f3472a;
                        if (j13 >= 0 && j13 < j12) {
                            j12 = j13;
                        }
                    }
                }
            }
            if (j12 > this.f3466o) {
                long q9 = q() + this.f3467p;
                int min = this.f4477g > 0 ? Math.min(this.f3468q, i7 - ((int) (q9 - j12))) : this.f3468q;
                long j14 = this.f3468q + q9;
                if (min > 0) {
                    j11 = 1;
                    Object[] objArr = this.f3464m;
                    r6.k.c(objArr);
                    j9 = q8;
                    h6.d[] dVarArr5 = new h6.d[min];
                    long j15 = q9;
                    while (true) {
                        if (q9 >= j14) {
                            dVarArr2 = dVarArr5;
                            j10 = j12;
                            break;
                        }
                        dVarArr2 = dVarArr5;
                        Object obj = objArr[(objArr.length - 1) & ((int) q9)];
                        if (obj != sVar) {
                            r6.k.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                            c0 c0Var = (c0) obj;
                            int i9 = i8 + 1;
                            j10 = j12;
                            dVarArr2[i8] = c0Var.f3449i;
                            f0.e(objArr, q9, sVar);
                            f0.e(objArr, j15, c0Var.f3448h);
                            j15++;
                            if (i9 >= min) {
                                break;
                            }
                            i8 = i9;
                        } else {
                            j10 = j12;
                        }
                        q9++;
                        dVarArr5 = dVarArr2;
                        j12 = j10;
                    }
                    q9 = j15;
                    dVarArr = dVarArr2;
                } else {
                    j9 = q8;
                    j10 = j12;
                    j11 = 1;
                    dVarArr = dVarArr4;
                }
                int i10 = (int) (q9 - j9);
                long j16 = this.f4477g == 0 ? q9 : j10;
                long max = Math.max(this.f3465n, q9 - Math.min(this.f3461j, i10));
                if (i7 == 0 && max < j14) {
                    Object[] objArr2 = this.f3464m;
                    r6.k.c(objArr2);
                    if (r6.k.a(objArr2[((int) max) & (objArr2.length - 1)], sVar)) {
                        q9 += j11;
                        max += j11;
                    }
                }
                v(max, j16, q9, j14);
                l();
                return dVarArr.length == 0 ? dVarArr : p(dVarArr);
            }
        }
        return dVarArr4;
    }
}
