package defpackage;

import defpackage.aa2;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class sk2 extends k1 implements xn1, xm0, hu0 {
    public final int q;
    public final int r;
    public final hq s;
    public Object[] t;
    public long u;
    public long v;
    public int w;
    public int x;

    public sk2(int i, int i2, hq hqVar) {
        this.q = i;
        this.r = i2;
        this.s = hqVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(7:(2:3|(10:5|6|7|(2:9|(1:(1:(7:13|14|15|16|17|(2:18|(9:27|(2:32|33)|35|(1:37)|15|16|17|18|(0)(1:20))(0))|24)(2:38|39))(5:40|41|17|(2:18|(0)(0))|24))(4:42|43|44|45))(1:56)|46|47|16|17|(2:18|(0)(0))|24))|46|47|16|17|(2:18|(0)(0))|24)|58|6|7|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0038, code lost:
    
        r8 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007f A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:14:0x0031, B:18:0x0077, B:20:0x007f, B:29:0x0092, B:32:0x0099, B:33:0x009d, B:35:0x009e, B:41:0x0049), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0090 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r5v1, types: [k1] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [sk2] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r9v0, types: [ym0] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v2, types: [l1] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [tk2] */
    /* JADX WARN: Type inference failed for: r9v8, types: [tk2] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00ac -> B:15:0x0034). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void k(sk2 sk2Var, ym0 ym0Var, o30 o30Var) {
        rk2 rk2Var;
        b50 b50Var;
        int i;
        ?? r5;
        ym0 ym0Var2;
        g61 g61Var;
        g61 g61Var2;
        ym0 ym0Var3;
        Object t;
        tk2 tk2Var;
        try {
            if (o30Var instanceof rk2) {
                rk2Var = (rk2) o30Var;
                int i2 = rk2Var.s;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    rk2Var.s = i2 - Integer.MIN_VALUE;
                    Object obj = rk2Var.q;
                    b50Var = b50.m;
                    i = rk2Var.s;
                    if (i != 0) {
                        ca2.b(obj);
                        ym0Var2 = ym0Var;
                        ym0Var = (tk2) sk2Var.c();
                    } else {
                        if (i != 1) {
                            if (i == 2) {
                                g61Var2 = rk2Var.p;
                                tk2 tk2Var2 = rk2Var.o;
                                ym0Var3 = rk2Var.n;
                                sk2 sk2Var2 = rk2Var.m;
                                ca2.b(obj);
                                r5 = sk2Var2;
                                ym0Var = tk2Var2;
                                do {
                                    t = r5.t(ym0Var);
                                    if (t == s93.m) {
                                    }
                                } while (r5.i(ym0Var, rk2Var) != b50Var);
                                return;
                            }
                            if (i != 3) {
                                lh.g("call to 'resume' before 'invoke' with coroutine");
                                return;
                            }
                            g61Var2 = rk2Var.p;
                            tk2 tk2Var3 = rk2Var.o;
                            ym0Var3 = rk2Var.n;
                            sk2 sk2Var3 = rk2Var.m;
                            ca2.b(obj);
                            sk2 sk2Var4 = sk2Var3;
                            tk2 tk2Var4 = tk2Var3;
                            ym0Var2 = ym0Var3;
                            g61Var = g61Var2;
                            sk2Var = sk2Var4;
                            tk2Var = tk2Var4;
                            r5 = sk2Var;
                            g61Var2 = g61Var;
                            ym0Var3 = ym0Var2;
                            ym0Var = tk2Var;
                            do {
                                t = r5.t(ym0Var);
                                if (t == s93.m) {
                                    if (g61Var2 != null && !g61Var2.b()) {
                                        throw g61Var2.v();
                                    }
                                    rk2Var.m = r5;
                                    rk2Var.n = ym0Var3;
                                    rk2Var.o = ym0Var;
                                    rk2Var.p = g61Var2;
                                    rk2Var.s = 3;
                                    sk2Var4 = r5;
                                    tk2Var4 = ym0Var;
                                    if (ym0Var3.d(t, rk2Var) == b50Var) {
                                        return;
                                    }
                                    ym0Var2 = ym0Var3;
                                    g61Var = g61Var2;
                                    sk2Var = sk2Var4;
                                    tk2Var = tk2Var4;
                                    r5 = sk2Var;
                                    g61Var2 = g61Var;
                                    ym0Var3 = ym0Var2;
                                    ym0Var = tk2Var;
                                    t = r5.t(ym0Var);
                                    if (t == s93.m) {
                                        rk2Var.m = r5;
                                        rk2Var.n = ym0Var3;
                                        rk2Var.o = ym0Var;
                                        rk2Var.p = g61Var2;
                                        rk2Var.s = 2;
                                    }
                                }
                            } while (r5.i(ym0Var, rk2Var) != b50Var);
                            return;
                        }
                        ym0Var = rk2Var.o;
                        ym0 ym0Var4 = rk2Var.n;
                        sk2 sk2Var5 = rk2Var.m;
                        try {
                            ca2.b(obj);
                            ym0Var2 = ym0Var4;
                            sk2Var = sk2Var5;
                            ym0Var = ym0Var;
                        } catch (Throwable th) {
                            th = th;
                            r5 = sk2Var5;
                            r5.g(ym0Var);
                            throw th;
                        }
                    }
                    g61Var = (g61) rk2Var.getContext().m(qb2.U);
                    tk2Var = ym0Var;
                    r5 = sk2Var;
                    g61Var2 = g61Var;
                    ym0Var3 = ym0Var2;
                    ym0Var = tk2Var;
                    do {
                        t = r5.t(ym0Var);
                        if (t == s93.m) {
                        }
                    } while (r5.i(ym0Var, rk2Var) != b50Var);
                    return;
                }
            }
            g61Var = (g61) rk2Var.getContext().m(qb2.U);
            tk2Var = ym0Var;
            r5 = sk2Var;
            g61Var2 = g61Var;
            ym0Var3 = ym0Var2;
            ym0Var = tk2Var;
            do {
                t = r5.t(ym0Var);
                if (t == s93.m) {
                }
            } while (r5.i(ym0Var, rk2Var) != b50Var);
            return;
        } catch (Throwable th2) {
            r5 = sk2Var;
            th = th2;
            r5.g(ym0Var);
            throw th;
        }
        rk2Var = new rk2(sk2Var, o30Var);
        Object obj2 = rk2Var.q;
        b50Var = b50.m;
        i = rk2Var.s;
        if (i != 0) {
        }
    }

    @Override // defpackage.xm0
    public final Object a(ym0 ym0Var, o30 o30Var) {
        k(this, ym0Var, o30Var);
        return b50.m;
    }

    @Override // defpackage.hu0
    public final xm0 b(CoroutineContext coroutineContext, int i, hq hqVar) {
        return s93.E(this, coroutineContext, i, hqVar);
    }

    @Override // defpackage.ym0
    public final Object d(Object obj, o30 o30Var) {
        sk2 sk2Var;
        Throwable th;
        o30[] n;
        qk2 qk2Var;
        if (q(obj)) {
            return Unit.a;
        }
        fs fsVar = new fs(1, q41.b(o30Var));
        fsVar.u();
        o30[] o30VarArr = l41.a;
        synchronized (this) {
            try {
                if (r(obj)) {
                    try {
                        aa2.a aVar = aa2.m;
                        fsVar.resumeWith(Unit.a);
                        n = n(o30VarArr);
                        qk2Var = null;
                        sk2Var = this;
                    } catch (Throwable th2) {
                        th = th2;
                        sk2Var = this;
                        throw th;
                    }
                } else {
                    try {
                        sk2Var = this;
                        try {
                            qk2 qk2Var2 = new qk2(sk2Var, o() + this.w + this.x, obj, fsVar);
                            sk2Var.m(qk2Var2);
                            sk2Var.x++;
                            if (sk2Var.r == 0) {
                                o30VarArr = sk2Var.n(o30VarArr);
                            }
                            n = o30VarArr;
                            qk2Var = qk2Var2;
                        } catch (Throwable th3) {
                            th = th3;
                            th = th;
                            throw th;
                        }
                    } catch (Throwable th4) {
                        sk2Var = this;
                        th = th4;
                        throw th;
                    }
                }
                if (qk2Var != null) {
                    fsVar.x(new as(2, qk2Var));
                }
                for (o30 o30Var2 : n) {
                    if (o30Var2 != null) {
                        aa2.a aVar2 = aa2.m;
                        o30Var2.resumeWith(Unit.a);
                    }
                }
                Object s = fsVar.s();
                b50 b50Var = b50.m;
                if (s != b50Var) {
                    s = Unit.a;
                }
                return s == b50Var ? s : Unit.a;
            } catch (Throwable th5) {
                th = th5;
                sk2Var = this;
            }
        }
    }

    @Override // defpackage.k1
    public final l1 e() {
        tk2 tk2Var = new tk2();
        tk2Var.a = -1L;
        return tk2Var;
    }

    @Override // defpackage.k1
    public final l1[] f() {
        return new tk2[2];
    }

    public final Object i(tk2 tk2Var, rk2 rk2Var) {
        fs fsVar = new fs(1, q41.b(rk2Var));
        fsVar.u();
        synchronized (this) {
            try {
                if (s(tk2Var) < 0) {
                    tk2Var.b = fsVar;
                } else {
                    aa2.a aVar = aa2.m;
                    fsVar.resumeWith(Unit.a);
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        Object s = fsVar.s();
        return s == b50.m ? s : Unit.a;
    }

    public final void j() {
        if (this.r != 0 || this.x > 1) {
            Object[] objArr = this.t;
            objArr.getClass();
            while (this.x > 0) {
                long o = o();
                int i = this.w;
                int i2 = this.x;
                if (objArr[((int) ((o + (i + i2)) - 1)) & (objArr.length - 1)] != s93.m) {
                    return;
                }
                this.x = i2 - 1;
                s93.w(objArr, o() + this.w + this.x, null);
            }
        }
    }

    public final void l() {
        l1[] l1VarArr;
        Object[] objArr = this.t;
        objArr.getClass();
        s93.w(objArr, o(), null);
        this.w--;
        long o = o() + 1;
        if (this.u < o) {
            this.u = o;
        }
        if (this.v < o) {
            if (this.n != 0 && (l1VarArr = this.m) != null) {
                for (l1 l1Var : l1VarArr) {
                    if (l1Var != null) {
                        tk2 tk2Var = (tk2) l1Var;
                        long j = tk2Var.a;
                        if (j >= 0 && j < o) {
                            tk2Var.a = o;
                        }
                    }
                }
            }
            this.v = o;
        }
    }

    public final void m(Object obj) {
        int i = this.w + this.x;
        Object[] objArr = this.t;
        if (objArr == null) {
            objArr = p(null, 0, 2);
        } else if (i >= objArr.length) {
            objArr = p(objArr, i, objArr.length * 2);
        }
        s93.w(objArr, o() + i, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final o30[] n(o30[] o30VarArr) {
        l1[] l1VarArr;
        tk2 tk2Var;
        fs fsVar;
        int length = o30VarArr.length;
        if (this.n != 0 && (l1VarArr = this.m) != null) {
            int length2 = l1VarArr.length;
            int i = 0;
            o30VarArr = o30VarArr;
            while (i < length2) {
                l1 l1Var = l1VarArr[i];
                if (l1Var != null && (fsVar = (tk2Var = (tk2) l1Var).b) != null && s(tk2Var) >= 0) {
                    int length3 = o30VarArr.length;
                    o30VarArr = o30VarArr;
                    if (length >= length3) {
                        o30VarArr = Arrays.copyOf(o30VarArr, Math.max(2, o30VarArr.length * 2));
                    }
                    o30VarArr[length] = fsVar;
                    tk2Var.b = null;
                    length++;
                }
                i++;
                o30VarArr = o30VarArr;
            }
        }
        return o30VarArr;
    }

    public final long o() {
        return Math.min(this.v, this.u);
    }

    public final Object[] p(Object[] objArr, int i, int i2) {
        if (i2 <= 0) {
            lh.g("Buffer size overflow");
            return null;
        }
        Object[] objArr2 = new Object[i2];
        this.t = objArr2;
        if (objArr != null) {
            long o = o();
            for (int i3 = 0; i3 < i; i3++) {
                long j = i3 + o;
                s93.w(objArr2, j, objArr[((int) j) & (objArr.length - 1)]);
            }
        }
        return objArr2;
    }

    public final boolean q(Object obj) {
        int i;
        boolean z;
        o30[] o30VarArr = l41.a;
        synchronized (this) {
            if (r(obj)) {
                o30VarArr = n(o30VarArr);
                z = true;
            } else {
                z = false;
            }
        }
        for (o30 o30Var : o30VarArr) {
            if (o30Var != null) {
                aa2.a aVar = aa2.m;
                o30Var.resumeWith(Unit.a);
            }
        }
        return z;
    }

    public final boolean r(Object obj) {
        int i = this.n;
        int i2 = this.q;
        if (i != 0) {
            int i3 = this.w;
            int i4 = this.r;
            if (i3 >= i4 && this.v <= this.u) {
                int ordinal = this.s.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            a.b();
                        }
                    }
                }
                return false;
            }
            m(obj);
            int i5 = this.w + 1;
            this.w = i5;
            if (i5 > i4) {
                l();
            }
            long o = o() + this.w;
            long j = this.u;
            if (((int) (o - j)) > i2) {
                u(1 + j, this.v, o() + this.w, o() + this.w + this.x);
            }
        } else if (i2 != 0) {
            m(obj);
            int i6 = this.w + 1;
            this.w = i6;
            if (i6 > i2) {
                l();
            }
            this.v = o() + this.w;
            return true;
        }
        return true;
    }

    public final long s(tk2 tk2Var) {
        long j = tk2Var.a;
        if (j >= o() + this.w && (this.r > 0 || j > o() || this.x == 0)) {
            return -1L;
        }
        return j;
    }

    public final Object t(tk2 tk2Var) {
        Object obj;
        o30[] o30VarArr = l41.a;
        synchronized (this) {
            try {
                long s = s(tk2Var);
                if (s < 0) {
                    obj = s93.m;
                } else {
                    long j = tk2Var.a;
                    Object[] objArr = this.t;
                    objArr.getClass();
                    Object obj2 = objArr[((int) s) & (objArr.length - 1)];
                    if (obj2 instanceof qk2) {
                        obj2 = ((qk2) obj2).o;
                    }
                    tk2Var.a = s + 1;
                    Object obj3 = obj2;
                    o30VarArr = v(j);
                    obj = obj3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (o30 o30Var : o30VarArr) {
            if (o30Var != null) {
                aa2.a aVar = aa2.m;
                o30Var.resumeWith(Unit.a);
            }
        }
        return obj;
    }

    public final void u(long j, long j2, long j3, long j4) {
        long min = Math.min(j2, j);
        for (long o = o(); o < min; o++) {
            Object[] objArr = this.t;
            objArr.getClass();
            s93.w(objArr, o, null);
        }
        this.u = j;
        this.v = j2;
        this.w = (int) (j3 - min);
        this.x = (int) (j4 - j3);
    }

    public final o30[] v(long j) {
        long j2;
        long j3;
        long j4;
        o30[] o30VarArr;
        o30[] o30VarArr2;
        l1[] l1VarArr;
        ng0 ng0Var = s93.m;
        o30[] o30VarArr3 = l41.a;
        if (j <= this.v) {
            long o = o();
            long j5 = this.w + o;
            int i = this.r;
            if (i == 0 && this.x > 0) {
                j5++;
            }
            int i2 = 0;
            if (this.n != 0 && (l1VarArr = this.m) != null) {
                for (l1 l1Var : l1VarArr) {
                    if (l1Var != null) {
                        long j6 = ((tk2) l1Var).a;
                        if (j6 >= 0 && j6 < j5) {
                            j5 = j6;
                        }
                    }
                }
            }
            if (j5 > this.v) {
                long o2 = o() + this.w;
                int i3 = this.n;
                int i4 = this.x;
                if (i3 > 0) {
                    j2 = 1;
                    i4 = Math.min(i4, i - ((int) (o2 - j5)));
                } else {
                    j2 = 1;
                }
                long j7 = this.x + o2;
                if (i4 > 0) {
                    Object[] objArr = this.t;
                    objArr.getClass();
                    j3 = o;
                    o30[] o30VarArr4 = new o30[i4];
                    long j8 = o2;
                    while (true) {
                        if (o2 >= j7) {
                            o30VarArr2 = o30VarArr4;
                            j4 = j5;
                            break;
                        }
                        o30VarArr2 = o30VarArr4;
                        Object obj = objArr[((int) o2) & (objArr.length - 1)];
                        if (obj != ng0Var) {
                            obj.getClass();
                            qk2 qk2Var = (qk2) obj;
                            j4 = j5;
                            int i5 = i2 + 1;
                            o30VarArr2[i2] = qk2Var.p;
                            s93.w(objArr, o2, ng0Var);
                            s93.w(objArr, j8, qk2Var.o);
                            j8 += j2;
                            if (i5 >= i4) {
                                break;
                            }
                            i2 = i5;
                        } else {
                            j4 = j5;
                        }
                        o2 += j2;
                        o30VarArr4 = o30VarArr2;
                        j5 = j4;
                    }
                    o2 = j8;
                    o30VarArr = o30VarArr2;
                } else {
                    j3 = o;
                    j4 = j5;
                    o30VarArr = o30VarArr3;
                }
                int i6 = (int) (o2 - j3);
                long j9 = this.n == 0 ? o2 : j4;
                long max = Math.max(this.u, o2 - Math.min(this.q, i6));
                if (i == 0 && max < j7) {
                    Object[] objArr2 = this.t;
                    objArr2.getClass();
                    if (Intrinsics.b(objArr2[((int) max) & (objArr2.length - 1)], ng0Var)) {
                        o2 += j2;
                        max += j2;
                    }
                }
                u(max, j9, o2, j7);
                j();
                return o30VarArr.length == 0 ? o30VarArr : n(o30VarArr);
            }
        }
        return o30VarArr3;
    }
}
