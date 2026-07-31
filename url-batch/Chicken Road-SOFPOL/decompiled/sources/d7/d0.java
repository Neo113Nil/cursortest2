package d7;

import a7.s0;
import java.util.Arrays;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public class d0 extends e7.b implements a0, g, f, e7.n {

    /* renamed from: h, reason: collision with root package name */
    public final int f2348h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public Object[] f2349j;

    /* renamed from: k, reason: collision with root package name */
    public long f2350k;

    /* renamed from: l, reason: collision with root package name */
    public long f2351l;

    /* renamed from: m, reason: collision with root package name */
    public int f2352m;

    /* renamed from: n, reason: collision with root package name */
    public int f2353n;

    public d0(int i, int i8) {
        this.f2348h = i;
        this.i = i8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0082 A[Catch: all -> 0x0036, TRY_ENTER, TryCatch #1 {all -> 0x0036, blocks: (B:14:0x002f, B:18:0x0078, B:21:0x0082, B:30:0x0095, B:33:0x009c, B:34:0x00a0, B:36:0x00a1, B:42:0x0049), top: B:7:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0093 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /* JADX WARN: Type inference failed for: r4v1, types: [e7.b] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4, types: [d7.d0] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r9v0, types: [d7.g] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v2, types: [e7.d] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [d7.f0] */
    /* JADX WARN: Type inference failed for: r9v8, types: [d7.f0] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00af -> B:15:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void j(d0 d0Var, g gVar, g6.c cVar) {
        c0 c0Var;
        int i;
        ?? r42;
        g gVar2;
        s0 s0Var;
        s0 s0Var2;
        g gVar3;
        Object s5;
        d4.t tVar;
        h6.a aVar;
        f0 f0Var;
        try {
            try {
                if (cVar instanceof c0) {
                    c0Var = (c0) cVar;
                    int i8 = c0Var.f2344m;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        c0Var.f2344m = i8 - Integer.MIN_VALUE;
                        Object obj = c0Var.f2342k;
                        i = c0Var.f2344m;
                        if (i != 0) {
                            s6.a.K(obj);
                            gVar2 = gVar;
                            gVar = (f0) d0Var.d();
                        } else {
                            if (i != 1) {
                                if (i == 2) {
                                    s0Var2 = c0Var.f2341j;
                                    f0 f0Var2 = c0Var.i;
                                    gVar3 = c0Var.f2340h;
                                    d0 d0Var2 = c0Var.f2339g;
                                    s6.a.K(obj);
                                    r42 = d0Var2;
                                    gVar = f0Var2;
                                    do {
                                        s5 = r42.s(gVar);
                                        tVar = e0.f2355a;
                                        aVar = h6.a.f3204d;
                                        if (s5 == tVar) {
                                        }
                                    } while (r42.i(gVar, c0Var) != aVar);
                                    return;
                                }
                                if (i != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                s0Var2 = c0Var.f2341j;
                                f0 f0Var3 = c0Var.i;
                                gVar3 = c0Var.f2340h;
                                d0 d0Var3 = c0Var.f2339g;
                                s6.a.K(obj);
                                d0 d0Var4 = d0Var3;
                                f0 f0Var4 = f0Var3;
                                gVar2 = gVar3;
                                s0Var = s0Var2;
                                d0Var = d0Var4;
                                f0Var = f0Var4;
                                r42 = d0Var;
                                s0Var2 = s0Var;
                                gVar3 = gVar2;
                                gVar = f0Var;
                                do {
                                    s5 = r42.s(gVar);
                                    tVar = e0.f2355a;
                                    aVar = h6.a.f3204d;
                                    if (s5 == tVar) {
                                        if (s0Var2 != null && !s0Var2.b()) {
                                            throw s0Var2.p();
                                        }
                                        c0Var.f2339g = r42;
                                        c0Var.f2340h = gVar3;
                                        c0Var.i = gVar;
                                        c0Var.f2341j = s0Var2;
                                        c0Var.f2344m = 3;
                                        d0Var4 = r42;
                                        f0Var4 = gVar;
                                        if (gVar3.a(s5, c0Var) == aVar) {
                                            return;
                                        }
                                        gVar2 = gVar3;
                                        s0Var = s0Var2;
                                        d0Var = d0Var4;
                                        f0Var = f0Var4;
                                        r42 = d0Var;
                                        s0Var2 = s0Var;
                                        gVar3 = gVar2;
                                        gVar = f0Var;
                                        s5 = r42.s(gVar);
                                        tVar = e0.f2355a;
                                        aVar = h6.a.f3204d;
                                        if (s5 == tVar) {
                                            c0Var.f2339g = r42;
                                            c0Var.f2340h = gVar3;
                                            c0Var.i = gVar;
                                            c0Var.f2341j = s0Var2;
                                            c0Var.f2344m = 2;
                                        }
                                    }
                                } while (r42.i(gVar, c0Var) != aVar);
                                return;
                            }
                            gVar = c0Var.i;
                            g gVar4 = c0Var.f2340h;
                            d0 d0Var5 = c0Var.f2339g;
                            try {
                                s6.a.K(obj);
                                gVar2 = gVar4;
                                d0Var = d0Var5;
                                gVar = gVar;
                            } catch (Throwable th) {
                                th = th;
                                r42 = d0Var5;
                                r42.g(gVar);
                                throw th;
                            }
                        }
                        g6.h hVar = c0Var.f3460e;
                        q6.i.b(hVar);
                        s0Var = (s0) hVar.l(a7.r.f297e);
                        f0Var = gVar;
                        r42 = d0Var;
                        s0Var2 = s0Var;
                        gVar3 = gVar2;
                        gVar = f0Var;
                        do {
                            s5 = r42.s(gVar);
                            tVar = e0.f2355a;
                            aVar = h6.a.f3204d;
                            if (s5 == tVar) {
                            }
                        } while (r42.i(gVar, c0Var) != aVar);
                        return;
                    }
                }
                g6.h hVar2 = c0Var.f3460e;
                q6.i.b(hVar2);
                s0Var = (s0) hVar2.l(a7.r.f297e);
                f0Var = gVar;
                r42 = d0Var;
                s0Var2 = s0Var;
                gVar3 = gVar2;
                gVar = f0Var;
                do {
                    s5 = r42.s(gVar);
                    tVar = e0.f2355a;
                    aVar = h6.a.f3204d;
                    if (s5 == tVar) {
                    }
                } while (r42.i(gVar, c0Var) != aVar);
                return;
            } catch (Throwable th2) {
                r42 = d0Var;
                th = th2;
                r42.g(gVar);
                throw th;
            }
            if (i != 0) {
            }
        } catch (Throwable th3) {
            th = th3;
        }
        c0Var = new c0(d0Var, cVar);
        Object obj2 = c0Var.f2342k;
        i = c0Var.f2344m;
    }

    @Override // d7.g
    public final Object a(Object obj, g6.c cVar) {
        p(obj);
        return c6.m.f1757a;
    }

    @Override // e7.n
    public final f b(g6.h hVar, int i, c7.a aVar) {
        return e0.i(this, hVar, i, aVar);
    }

    @Override // d7.f
    public final Object c(g gVar, g6.c cVar) {
        j(this, gVar, cVar);
        return h6.a.f3204d;
    }

    @Override // e7.b
    public final e7.d e() {
        f0 f0Var = new f0();
        f0Var.f2358a = -1L;
        return f0Var;
    }

    @Override // e7.b
    public final e7.d[] f() {
        return new f0[2];
    }

    public final Object i(f0 f0Var, c0 c0Var) {
        a7.h hVar = new a7.h(1, m.a.G(c0Var));
        hVar.t();
        synchronized (this) {
            try {
                if (r(f0Var) < 0) {
                    f0Var.f2359b = hVar;
                } else {
                    hVar.k(c6.m.f1757a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Object s5 = hVar.s();
        return s5 == h6.a.f3204d ? s5 : c6.m.f1757a;
    }

    public final void k() {
        e7.d[] dVarArr;
        Object[] objArr = this.f2349j;
        q6.i.b(objArr);
        e0.d(objArr, n(), null);
        this.f2352m--;
        long n6 = n() + 1;
        if (this.f2350k < n6) {
            this.f2350k = n6;
        }
        if (this.f2351l < n6) {
            if (this.f2540e != 0 && (dVarArr = this.f2539d) != null) {
                for (e7.d dVar : dVarArr) {
                    if (dVar != null) {
                        f0 f0Var = (f0) dVar;
                        long j7 = f0Var.f2358a;
                        if (j7 >= 0 && j7 < n6) {
                            f0Var.f2358a = n6;
                        }
                    }
                }
            }
            this.f2351l = n6;
        }
    }

    public final void l(Object obj) {
        int i = this.f2352m + this.f2353n;
        Object[] objArr = this.f2349j;
        if (objArr == null) {
            objArr = o(null, 0, 2);
        } else if (i >= objArr.length) {
            objArr = o(objArr, i, objArr.length * 2);
        }
        e0.d(objArr, n() + i, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object, java.lang.Object[]] */
    public final g6.c[] m(g6.c[] cVarArr) {
        e7.d[] dVarArr;
        f0 f0Var;
        a7.h hVar;
        int length = cVarArr.length;
        if (this.f2540e != 0 && (dVarArr = this.f2539d) != null) {
            int length2 = dVarArr.length;
            int i = 0;
            cVarArr = cVarArr;
            while (i < length2) {
                e7.d dVar = dVarArr[i];
                if (dVar != null && (hVar = (f0Var = (f0) dVar).f2359b) != null && r(f0Var) >= 0) {
                    int length3 = cVarArr.length;
                    cVarArr = cVarArr;
                    if (length >= length3) {
                        ?? copyOf = Arrays.copyOf(cVarArr, Math.max(2, cVarArr.length * 2));
                        q6.i.d(copyOf, "copyOf(...)");
                        cVarArr = copyOf;
                    }
                    cVarArr[length] = hVar;
                    f0Var.f2359b = null;
                    length++;
                }
                i++;
                cVarArr = cVarArr;
            }
        }
        return cVarArr;
    }

    public final long n() {
        return Math.min(this.f2351l, this.f2350k);
    }

    public final Object[] o(Object[] objArr, int i, int i8) {
        if (i8 <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] objArr2 = new Object[i8];
        this.f2349j = objArr2;
        if (objArr != null) {
            long n6 = n();
            for (int i9 = 0; i9 < i; i9++) {
                long j7 = i9 + n6;
                e0.d(objArr2, j7, objArr[((int) j7) & (objArr.length - 1)]);
            }
        }
        return objArr2;
    }

    public final boolean p(Object obj) {
        g6.c[] m7;
        g6.c[] cVarArr = e7.c.f2543a;
        synchronized (this) {
            q(obj);
            m7 = m(cVarArr);
        }
        for (g6.c cVar : m7) {
            if (cVar != null) {
                cVar.k(c6.m.f1757a);
            }
        }
        return true;
    }

    public final boolean q(Object obj) {
        int i = this.f2540e;
        int i8 = this.f2348h;
        if (i != 0) {
            int i9 = this.i;
            l(obj);
            int i10 = this.f2352m + 1;
            this.f2352m = i10;
            if (i10 > i9) {
                k();
            }
            long n6 = n() + this.f2352m;
            long j7 = this.f2350k;
            if (((int) (n6 - j7)) > i8) {
                t(1 + j7, this.f2351l, n() + this.f2352m, n() + this.f2352m + this.f2353n);
            }
        } else if (i8 != 0) {
            l(obj);
            int i11 = this.f2352m + 1;
            this.f2352m = i11;
            if (i11 > i8) {
                k();
            }
            this.f2351l = n() + this.f2352m;
            return true;
        }
        return true;
    }

    public final long r(f0 f0Var) {
        long j7 = f0Var.f2358a;
        if (j7 < n() + this.f2352m) {
            return j7;
        }
        if (this.i <= 0 && j7 <= n() && this.f2353n != 0) {
            return j7;
        }
        return -1L;
    }

    public final Object s(f0 f0Var) {
        Object obj;
        g6.c[] cVarArr = e7.c.f2543a;
        synchronized (this) {
            try {
                long r7 = r(f0Var);
                if (r7 < 0) {
                    obj = e0.f2355a;
                } else {
                    long j7 = f0Var.f2358a;
                    Object[] objArr = this.f2349j;
                    q6.i.b(objArr);
                    Object obj2 = objArr[((int) r7) & (objArr.length - 1)];
                    if (obj2 instanceof b0) {
                        obj2 = null;
                    }
                    f0Var.f2358a = r7 + 1;
                    Object obj3 = obj2;
                    cVarArr = u(j7);
                    obj = obj3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (g6.c cVar : cVarArr) {
            if (cVar != null) {
                cVar.k(c6.m.f1757a);
            }
        }
        return obj;
    }

    public final void t(long j7, long j8, long j9, long j10) {
        long min = Math.min(j8, j7);
        for (long n6 = n(); n6 < min; n6++) {
            Object[] objArr = this.f2349j;
            q6.i.b(objArr);
            e0.d(objArr, n6, null);
        }
        this.f2350k = j7;
        this.f2351l = j8;
        this.f2352m = (int) (j9 - min);
        this.f2353n = (int) (j10 - j9);
    }

    public final g6.c[] u(long j7) {
        long j8;
        long j9;
        g6.c[] cVarArr;
        g6.c[] cVarArr2;
        e7.d[] dVarArr;
        d4.t tVar = e0.f2355a;
        g6.c[] cVarArr3 = e7.c.f2543a;
        if (j7 <= this.f2351l) {
            long n6 = n();
            long j10 = this.f2352m + n6;
            int i = this.i;
            if (i == 0 && this.f2353n > 0) {
                j10++;
            }
            int i8 = 0;
            if (this.f2540e != 0 && (dVarArr = this.f2539d) != null) {
                for (e7.d dVar : dVarArr) {
                    if (dVar != null) {
                        long j11 = ((f0) dVar).f2358a;
                        if (j11 >= 0 && j11 < j10) {
                            j10 = j11;
                        }
                    }
                }
            }
            if (j10 > this.f2351l) {
                long n7 = n() + this.f2352m;
                int min = this.f2540e > 0 ? Math.min(this.f2353n, i - ((int) (n7 - j10))) : this.f2353n;
                long j12 = this.f2353n + n7;
                if (min > 0) {
                    j9 = 1;
                    Object[] objArr = this.f2349j;
                    q6.i.b(objArr);
                    j8 = n6;
                    g6.c[] cVarArr4 = new g6.c[min];
                    long j13 = n7;
                    while (true) {
                        if (n7 >= j12) {
                            cVarArr2 = cVarArr4;
                            break;
                        }
                        cVarArr2 = cVarArr4;
                        Object obj = objArr[(objArr.length - 1) & ((int) n7)];
                        if (obj != tVar) {
                            q6.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                            int i9 = i8 + 1;
                            ((b0) obj).getClass();
                            cVarArr2[i8] = null;
                            e0.d(objArr, n7, tVar);
                            e0.d(objArr, j13, null);
                            j13++;
                            if (i9 >= min) {
                                break;
                            }
                            i8 = i9;
                        }
                        n7++;
                        cVarArr4 = cVarArr2;
                    }
                    n7 = j13;
                    cVarArr = cVarArr2;
                } else {
                    j8 = n6;
                    j9 = 1;
                    cVarArr = cVarArr3;
                }
                int i10 = (int) (n7 - j8);
                long j14 = this.f2540e == 0 ? n7 : j10;
                long max = Math.max(this.f2350k, n7 - Math.min(this.f2348h, i10));
                if (i == 0 && max < j12) {
                    Object[] objArr2 = this.f2349j;
                    q6.i.b(objArr2);
                    if (q6.i.a(objArr2[((int) max) & (objArr2.length - 1)], tVar)) {
                        n7 += j9;
                        max += j9;
                    }
                }
                t(max, j14, n7, j12);
                if (this.i != 0 || this.f2353n > 1) {
                    Object[] objArr3 = this.f2349j;
                    q6.i.b(objArr3);
                    while (this.f2353n > 0) {
                        long n8 = n();
                        int i11 = this.f2352m;
                        int i12 = this.f2353n;
                        if (objArr3[((int) ((n8 + (i11 + i12)) - 1)) & (objArr3.length - 1)] != e0.f2355a) {
                            break;
                        }
                        this.f2353n = i12 - 1;
                        e0.d(objArr3, n() + this.f2352m + this.f2353n, null);
                    }
                }
                return cVarArr.length == 0 ? cVarArr : m(cVarArr);
            }
        }
        return cVarArr3;
    }
}
