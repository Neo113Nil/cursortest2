package defpackage;

import com.appsflyer.internal.l;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public class ca1 extends w0 implements c00, d00, d40 {
    public final int i;
    public final int j;
    public final ue k;
    public Object[] l;
    public long m;
    public long n;
    public int o;
    public int p;

    public ca1(int i, int i2, ue ueVar) {
        this.i = i;
        this.j = i2;
        this.k = ueVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0080 A[Catch: all -> 0x0038, TryCatch #1 {all -> 0x0038, blocks: (B:14:0x0031, B:18:0x0078, B:20:0x0080, B:29:0x0093, B:32:0x009a, B:33:0x009e, B:35:0x009f, B:41:0x0049), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r5v1, types: [w0] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [ca1] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r9v0, types: [d00] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v2, types: [x0] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [da1] */
    /* JADX WARN: Type inference failed for: r9v8, types: [da1] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00ad -> B:15:0x0034). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void k(ca1 ca1Var, d00 d00Var, dn dnVar) {
        ba1 ba1Var;
        tn tnVar;
        int i;
        ?? r5;
        d00 d00Var2;
        jb0 jb0Var;
        jb0 jb0Var2;
        d00 d00Var3;
        Object t;
        da1 da1Var;
        try {
            try {
                if (dnVar instanceof ba1) {
                    ba1Var = (ba1) dnVar;
                    int i2 = ba1Var.n;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        ba1Var.n = i2 - Integer.MIN_VALUE;
                        Object obj = ba1Var.l;
                        tnVar = tn.d;
                        i = ba1Var.n;
                        if (i != 0) {
                            ca0.v(obj);
                            d00Var2 = d00Var;
                            d00Var = (da1) ca1Var.a();
                        } else {
                            if (i != 1) {
                                if (i == 2) {
                                    jb0Var2 = ba1Var.k;
                                    da1 da1Var2 = ba1Var.j;
                                    d00Var3 = ba1Var.i;
                                    ca1 ca1Var2 = ba1Var.h;
                                    ca0.v(obj);
                                    r5 = ca1Var2;
                                    d00Var = da1Var2;
                                    do {
                                        t = r5.t(d00Var);
                                        if (t == la0.t) {
                                        }
                                    } while (r5.h(d00Var, ba1Var) != tnVar);
                                    return;
                                }
                                if (i != 3) {
                                    dd0.j("call to 'resume' before 'invoke' with coroutine");
                                    return;
                                }
                                jb0Var2 = ba1Var.k;
                                da1 da1Var3 = ba1Var.j;
                                d00Var3 = ba1Var.i;
                                ca1 ca1Var3 = ba1Var.h;
                                ca0.v(obj);
                                ca1 ca1Var4 = ca1Var3;
                                da1 da1Var4 = da1Var3;
                                d00Var2 = d00Var3;
                                jb0Var = jb0Var2;
                                ca1Var = ca1Var4;
                                da1Var = da1Var4;
                                r5 = ca1Var;
                                jb0Var2 = jb0Var;
                                d00Var3 = d00Var2;
                                d00Var = da1Var;
                                do {
                                    t = r5.t(d00Var);
                                    if (t == la0.t) {
                                        if (jb0Var2 != null && !jb0Var2.b()) {
                                            throw jb0Var2.o();
                                        }
                                        ba1Var.h = r5;
                                        ba1Var.i = d00Var3;
                                        ba1Var.j = d00Var;
                                        ba1Var.k = jb0Var2;
                                        ba1Var.n = 3;
                                        ca1Var4 = r5;
                                        da1Var4 = d00Var;
                                        if (d00Var3.e(t, ba1Var) == tnVar) {
                                            return;
                                        }
                                        d00Var2 = d00Var3;
                                        jb0Var = jb0Var2;
                                        ca1Var = ca1Var4;
                                        da1Var = da1Var4;
                                        r5 = ca1Var;
                                        jb0Var2 = jb0Var;
                                        d00Var3 = d00Var2;
                                        d00Var = da1Var;
                                        t = r5.t(d00Var);
                                        if (t == la0.t) {
                                            ba1Var.h = r5;
                                            ba1Var.i = d00Var3;
                                            ba1Var.j = d00Var;
                                            ba1Var.k = jb0Var2;
                                            ba1Var.n = 2;
                                        }
                                    }
                                } while (r5.h(d00Var, ba1Var) != tnVar);
                                return;
                            }
                            d00Var = ba1Var.j;
                            d00 d00Var4 = ba1Var.i;
                            ca1 ca1Var5 = ba1Var.h;
                            try {
                                ca0.v(obj);
                                d00Var2 = d00Var4;
                                ca1Var = ca1Var5;
                                d00Var = d00Var;
                            } catch (Throwable th) {
                                th = th;
                                r5 = ca1Var5;
                                r5.d(d00Var);
                                throw th;
                            }
                        }
                        CoroutineContext coroutineContext = ba1Var.e;
                        coroutineContext.getClass();
                        jb0Var = (jb0) coroutineContext.d(j41.m);
                        da1Var = d00Var;
                        r5 = ca1Var;
                        jb0Var2 = jb0Var;
                        d00Var3 = d00Var2;
                        d00Var = da1Var;
                        do {
                            t = r5.t(d00Var);
                            if (t == la0.t) {
                            }
                        } while (r5.h(d00Var, ba1Var) != tnVar);
                        return;
                    }
                }
                CoroutineContext coroutineContext2 = ba1Var.e;
                coroutineContext2.getClass();
                jb0Var = (jb0) coroutineContext2.d(j41.m);
                da1Var = d00Var;
                r5 = ca1Var;
                jb0Var2 = jb0Var;
                d00Var3 = d00Var2;
                d00Var = da1Var;
                do {
                    t = r5.t(d00Var);
                    if (t == la0.t) {
                    }
                } while (r5.h(d00Var, ba1Var) != tnVar);
                return;
            } catch (Throwable th2) {
                r5 = ca1Var;
                th = th2;
                r5.d(d00Var);
                throw th;
            }
            if (i != 0) {
            }
        } catch (Throwable th3) {
            th = th3;
        }
        ba1Var = new ba1(ca1Var, dnVar);
        Object obj2 = ba1Var.l;
        tnVar = tn.d;
        i = ba1Var.n;
    }

    @Override // defpackage.w0
    public final x0 b() {
        da1 da1Var = new da1();
        da1Var.a = -1L;
        return da1Var;
    }

    @Override // defpackage.w0
    public final x0[] c() {
        return new da1[2];
    }

    @Override // defpackage.d00
    public final Object e(Object obj, dn dnVar) {
        ca1 ca1Var;
        Throwable th;
        dn[] n;
        aa1 aa1Var;
        if (q(obj)) {
            return Unit.a;
        }
        tf tfVar = new tf(1, qa0.b(dnVar));
        tfVar.w();
        dn[] dnVarArr = p4.a;
        synchronized (this) {
            try {
                if (r(obj)) {
                    try {
                        i31 i31Var = k31.d;
                        tfVar.l(Unit.a);
                        n = n(dnVarArr);
                        aa1Var = null;
                        ca1Var = this;
                    } catch (Throwable th2) {
                        th = th2;
                        ca1Var = this;
                        throw th;
                    }
                } else {
                    try {
                        ca1Var = this;
                        try {
                            aa1 aa1Var2 = new aa1(ca1Var, o() + this.o + this.p, obj, tfVar);
                            ca1Var.m(aa1Var2);
                            ca1Var.p++;
                            if (ca1Var.j == 0) {
                                dnVarArr = ca1Var.n(dnVarArr);
                            }
                            n = dnVarArr;
                            aa1Var = aa1Var2;
                        } catch (Throwable th3) {
                            th = th3;
                            th = th;
                            throw th;
                        }
                    } catch (Throwable th4) {
                        ca1Var = this;
                        th = th4;
                        throw th;
                    }
                }
                if (aa1Var != null) {
                    tfVar.z(new pf(2, aa1Var));
                }
                for (dn dnVar2 : n) {
                    if (dnVar2 != null) {
                        i31 i31Var2 = k31.d;
                        dnVar2.l(Unit.a);
                    }
                }
                Object u = tfVar.u();
                tn tnVar = tn.d;
                if (u != tnVar) {
                    u = Unit.a;
                }
                return u == tnVar ? u : Unit.a;
            } catch (Throwable th5) {
                th = th5;
                ca1Var = this;
            }
        }
    }

    @Override // defpackage.c00
    public final Object f(d00 d00Var, dn dnVar) {
        k(this, d00Var, dnVar);
        return tn.d;
    }

    public final Object h(da1 da1Var, ba1 ba1Var) {
        tf tfVar = new tf(1, qa0.b(ba1Var));
        tfVar.w();
        synchronized (this) {
            try {
                if (s(da1Var) < 0) {
                    da1Var.b = tfVar;
                } else {
                    i31 i31Var = k31.d;
                    tfVar.l(Unit.a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Object u = tfVar.u();
        return u == tn.d ? u : Unit.a;
    }

    @Override // defpackage.d40
    public final c00 i(CoroutineContext coroutineContext, int i, ue ueVar) {
        return ((i == 0 || i == -3) && ueVar == ue.d) ? this : new ig(this, coroutineContext, i, ueVar);
    }

    public final void j() {
        if (this.j != 0 || this.p > 1) {
            Object[] objArr = this.l;
            objArr.getClass();
            while (this.p > 0) {
                long o = o();
                int i = this.o;
                int i2 = this.p;
                if (objArr[((int) ((o + (i + i2)) - 1)) & (objArr.length - 1)] != la0.t) {
                    return;
                }
                this.p = i2 - 1;
                la0.u(objArr, o() + this.o + this.p, null);
            }
        }
    }

    public final void l() {
        x0[] x0VarArr;
        Object[] objArr = this.l;
        objArr.getClass();
        la0.u(objArr, o(), null);
        this.o--;
        long o = o() + 1;
        if (this.m < o) {
            this.m = o;
        }
        if (this.n < o) {
            if (this.e != 0 && (x0VarArr = this.d) != null) {
                for (x0 x0Var : x0VarArr) {
                    if (x0Var != null) {
                        da1 da1Var = (da1) x0Var;
                        long j = da1Var.a;
                        if (j >= 0 && j < o) {
                            da1Var.a = o;
                        }
                    }
                }
            }
            this.n = o;
        }
    }

    public final void m(Object obj) {
        int i = this.o + this.p;
        Object[] objArr = this.l;
        if (objArr == null) {
            objArr = p(null, 0, 2);
        } else if (i >= objArr.length) {
            objArr = p(objArr, i, objArr.length * 2);
        }
        la0.u(objArr, o() + i, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final dn[] n(dn[] dnVarArr) {
        x0[] x0VarArr;
        da1 da1Var;
        tf tfVar;
        int length = dnVarArr.length;
        if (this.e != 0 && (x0VarArr = this.d) != null) {
            int length2 = x0VarArr.length;
            int i = 0;
            dnVarArr = dnVarArr;
            while (i < length2) {
                x0 x0Var = x0VarArr[i];
                if (x0Var != null && (tfVar = (da1Var = (da1) x0Var).b) != null && s(da1Var) >= 0) {
                    int length3 = dnVarArr.length;
                    dnVarArr = dnVarArr;
                    if (length >= length3) {
                        dnVarArr = Arrays.copyOf(dnVarArr, Math.max(2, dnVarArr.length * 2));
                    }
                    dnVarArr[length] = tfVar;
                    da1Var.b = null;
                    length++;
                }
                i++;
                dnVarArr = dnVarArr;
            }
        }
        return dnVarArr;
    }

    public final long o() {
        return Math.min(this.n, this.m);
    }

    public final Object[] p(Object[] objArr, int i, int i2) {
        if (i2 <= 0) {
            dd0.j("Buffer size overflow");
            return null;
        }
        Object[] objArr2 = new Object[i2];
        this.l = objArr2;
        if (objArr != null) {
            long o = o();
            for (int i3 = 0; i3 < i; i3++) {
                long j = i3 + o;
                la0.u(objArr2, j, objArr[((int) j) & (objArr.length - 1)]);
            }
        }
        return objArr2;
    }

    public final boolean q(Object obj) {
        int i;
        boolean z;
        dn[] dnVarArr = p4.a;
        synchronized (this) {
            if (r(obj)) {
                dnVarArr = n(dnVarArr);
                z = true;
            } else {
                z = false;
            }
        }
        for (dn dnVar : dnVarArr) {
            if (dnVar != null) {
                i31 i31Var = k31.d;
                dnVar.l(Unit.a);
            }
        }
        return z;
    }

    public final boolean r(Object obj) {
        int i = this.e;
        int i2 = this.i;
        if (i != 0) {
            int i3 = this.o;
            int i4 = this.j;
            if (i3 >= i4 && this.n <= this.m) {
                int ordinal = this.k.ordinal();
                if (ordinal == 0) {
                    return false;
                }
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        l.a();
                        return false;
                    }
                }
            }
            m(obj);
            int i5 = this.o + 1;
            this.o = i5;
            if (i5 > i4) {
                l();
            }
            long o = o() + this.o;
            long j = this.m;
            if (((int) (o - j)) > i2) {
                u(1 + j, this.n, o() + this.o, o() + this.o + this.p);
            }
        } else if (i2 != 0) {
            m(obj);
            int i6 = this.o + 1;
            this.o = i6;
            if (i6 > i2) {
                l();
            }
            this.n = o() + this.o;
            return true;
        }
        return true;
    }

    public final long s(da1 da1Var) {
        long j = da1Var.a;
        if (j >= o() + this.o && (this.j > 0 || j > o() || this.p == 0)) {
            return -1L;
        }
        return j;
    }

    public final Object t(da1 da1Var) {
        Object obj;
        dn[] dnVarArr = p4.a;
        synchronized (this) {
            try {
                long s = s(da1Var);
                if (s < 0) {
                    obj = la0.t;
                } else {
                    long j = da1Var.a;
                    Object[] objArr = this.l;
                    objArr.getClass();
                    Object obj2 = objArr[((int) s) & (objArr.length - 1)];
                    if (obj2 instanceof aa1) {
                        obj2 = ((aa1) obj2).g;
                    }
                    da1Var.a = s + 1;
                    Object obj3 = obj2;
                    dnVarArr = v(j);
                    obj = obj3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (dn dnVar : dnVarArr) {
            if (dnVar != null) {
                i31 i31Var = k31.d;
                dnVar.l(Unit.a);
            }
        }
        return obj;
    }

    public final void u(long j, long j2, long j3, long j4) {
        long min = Math.min(j2, j);
        for (long o = o(); o < min; o++) {
            Object[] objArr = this.l;
            objArr.getClass();
            la0.u(objArr, o, null);
        }
        this.m = j;
        this.n = j2;
        this.o = (int) (j3 - min);
        this.p = (int) (j4 - j3);
    }

    public final dn[] v(long j) {
        long j2;
        long j3;
        long j4;
        dn[] dnVarArr;
        dn[] dnVarArr2;
        x0[] x0VarArr;
        fv fvVar = la0.t;
        dn[] dnVarArr3 = p4.a;
        if (j <= this.n) {
            long o = o();
            long j5 = this.o + o;
            int i = this.j;
            if (i == 0 && this.p > 0) {
                j5++;
            }
            int i2 = 0;
            if (this.e != 0 && (x0VarArr = this.d) != null) {
                for (x0 x0Var : x0VarArr) {
                    if (x0Var != null) {
                        long j6 = ((da1) x0Var).a;
                        if (j6 >= 0 && j6 < j5) {
                            j5 = j6;
                        }
                    }
                }
            }
            if (j5 > this.n) {
                long o2 = o() + this.o;
                int i3 = this.e;
                int i4 = this.p;
                if (i3 > 0) {
                    j2 = 1;
                    i4 = Math.min(i4, i - ((int) (o2 - j5)));
                } else {
                    j2 = 1;
                }
                long j7 = this.p + o2;
                if (i4 > 0) {
                    Object[] objArr = this.l;
                    objArr.getClass();
                    j3 = o;
                    dn[] dnVarArr4 = new dn[i4];
                    long j8 = o2;
                    while (true) {
                        if (o2 >= j7) {
                            dnVarArr2 = dnVarArr4;
                            j4 = j5;
                            break;
                        }
                        dnVarArr2 = dnVarArr4;
                        Object obj = objArr[((int) o2) & (objArr.length - 1)];
                        if (obj != fvVar) {
                            obj.getClass();
                            aa1 aa1Var = (aa1) obj;
                            j4 = j5;
                            int i5 = i2 + 1;
                            dnVarArr2[i2] = aa1Var.h;
                            la0.u(objArr, o2, fvVar);
                            la0.u(objArr, j8, aa1Var.g);
                            j8 += j2;
                            if (i5 >= i4) {
                                break;
                            }
                            i2 = i5;
                        } else {
                            j4 = j5;
                        }
                        o2 += j2;
                        dnVarArr4 = dnVarArr2;
                        j5 = j4;
                    }
                    o2 = j8;
                    dnVarArr = dnVarArr2;
                } else {
                    j3 = o;
                    j4 = j5;
                    dnVarArr = dnVarArr3;
                }
                int i6 = (int) (o2 - j3);
                long j9 = this.e == 0 ? o2 : j4;
                long max = Math.max(this.m, o2 - Math.min(this.i, i6));
                if (i == 0 && max < j7) {
                    Object[] objArr2 = this.l;
                    objArr2.getClass();
                    if (Intrinsics.a(objArr2[((int) max) & (objArr2.length - 1)], fvVar)) {
                        o2 += j2;
                        max += j2;
                    }
                }
                u(max, j9, o2, j7);
                j();
                return dnVarArr.length == 0 ? dnVarArr : n(dnVarArr);
            }
        }
        return dnVarArr3;
    }
}
