package je;

import ge.c1;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class a0 extends ke.b implements e, f, ke.n {

    /* renamed from: s, reason: collision with root package name */
    public final int f5130s;

    /* renamed from: t, reason: collision with root package name */
    public final int f5131t;

    /* renamed from: u, reason: collision with root package name */
    public final ie.a f5132u;

    /* renamed from: v, reason: collision with root package name */
    public Object[] f5133v;

    /* renamed from: w, reason: collision with root package name */
    public long f5134w;

    /* renamed from: x, reason: collision with root package name */
    public long f5135x;

    /* renamed from: y, reason: collision with root package name */
    public int f5136y;

    /* renamed from: z, reason: collision with root package name */
    public int f5137z;

    public a0(int i3, int i10, ie.a aVar) {
        this.f5130s = i3;
        this.f5131t = i10;
        this.f5132u = aVar;
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
    /* JADX WARN: Type inference failed for: r5v1, types: [ke.b] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [je.a0] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r9v0, types: [je.f] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v2, types: [ke.d] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [je.c0] */
    /* JADX WARN: Type inference failed for: r9v8, types: [je.c0] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00ac -> B:15:0x0034). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void k(a0 a0Var, f fVar, ld.a aVar) {
        z zVar;
        md.a aVar2;
        int i3;
        ?? r52;
        f fVar2;
        c1 c1Var;
        c1 c1Var2;
        f fVar3;
        Object t6;
        c0 c0Var;
        try {
            if (aVar instanceof z) {
                zVar = (z) aVar;
                int i10 = zVar.f5252u;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    zVar.f5252u = i10 - Integer.MIN_VALUE;
                    Object obj = zVar.f5250s;
                    aVar2 = md.a.f6622d;
                    i3 = zVar.f5252u;
                    if (i3 != 0) {
                        cf.c.M(obj);
                        fVar2 = fVar;
                        fVar = (c0) a0Var.d();
                    } else {
                        if (i3 != 1) {
                            if (i3 == 2) {
                                c1Var2 = zVar.f5249r;
                                c0 c0Var2 = zVar.f5248i;
                                fVar3 = zVar.f5247e;
                                a0 a0Var2 = zVar.f5246d;
                                cf.c.M(obj);
                                r52 = a0Var2;
                                fVar = c0Var2;
                                do {
                                    t6 = r52.t(fVar);
                                    if (t6 == b0.f5141a) {
                                    }
                                } while (r52.i(fVar, zVar) != aVar2);
                                return;
                            }
                            if (i3 != 3) {
                                kotlin.collections.i0.l("call to 'resume' before 'invoke' with coroutine");
                                return;
                            }
                            c1Var2 = zVar.f5249r;
                            c0 c0Var3 = zVar.f5248i;
                            fVar3 = zVar.f5247e;
                            a0 a0Var3 = zVar.f5246d;
                            cf.c.M(obj);
                            a0 a0Var4 = a0Var3;
                            c0 c0Var4 = c0Var3;
                            fVar2 = fVar3;
                            c1Var = c1Var2;
                            a0Var = a0Var4;
                            c0Var = c0Var4;
                            r52 = a0Var;
                            c1Var2 = c1Var;
                            fVar3 = fVar2;
                            fVar = c0Var;
                            do {
                                t6 = r52.t(fVar);
                                if (t6 == b0.f5141a) {
                                    if (c1Var2 != null && !c1Var2.d()) {
                                        throw c1Var2.x();
                                    }
                                    zVar.f5246d = r52;
                                    zVar.f5247e = fVar3;
                                    zVar.f5248i = fVar;
                                    zVar.f5249r = c1Var2;
                                    zVar.f5252u = 3;
                                    a0Var4 = r52;
                                    c0Var4 = fVar;
                                    if (fVar3.b(t6, zVar) == aVar2) {
                                        return;
                                    }
                                    fVar2 = fVar3;
                                    c1Var = c1Var2;
                                    a0Var = a0Var4;
                                    c0Var = c0Var4;
                                    r52 = a0Var;
                                    c1Var2 = c1Var;
                                    fVar3 = fVar2;
                                    fVar = c0Var;
                                    t6 = r52.t(fVar);
                                    if (t6 == b0.f5141a) {
                                        zVar.f5246d = r52;
                                        zVar.f5247e = fVar3;
                                        zVar.f5248i = fVar;
                                        zVar.f5249r = c1Var2;
                                        zVar.f5252u = 2;
                                    }
                                }
                            } while (r52.i(fVar, zVar) != aVar2);
                            return;
                        }
                        fVar = zVar.f5248i;
                        f fVar4 = zVar.f5247e;
                        a0 a0Var5 = zVar.f5246d;
                        try {
                            cf.c.M(obj);
                            fVar2 = fVar4;
                            a0Var = a0Var5;
                            fVar = fVar;
                        } catch (Throwable th) {
                            th = th;
                            r52 = a0Var5;
                            r52.g(fVar);
                            throw th;
                        }
                    }
                    c1Var = (c1) zVar.getContext().m(ge.u.f4403e);
                    c0Var = fVar;
                    r52 = a0Var;
                    c1Var2 = c1Var;
                    fVar3 = fVar2;
                    fVar = c0Var;
                    do {
                        t6 = r52.t(fVar);
                        if (t6 == b0.f5141a) {
                        }
                    } while (r52.i(fVar, zVar) != aVar2);
                    return;
                }
            }
            c1Var = (c1) zVar.getContext().m(ge.u.f4403e);
            c0Var = fVar;
            r52 = a0Var;
            c1Var2 = c1Var;
            fVar3 = fVar2;
            fVar = c0Var;
            do {
                t6 = r52.t(fVar);
                if (t6 == b0.f5141a) {
                }
            } while (r52.i(fVar, zVar) != aVar2);
            return;
        } catch (Throwable th2) {
            r52 = a0Var;
            th = th2;
            r52.g(fVar);
            throw th;
        }
        zVar = new z(a0Var, aVar);
        Object obj2 = zVar.f5250s;
        aVar2 = md.a.f6622d;
        i3 = zVar.f5252u;
        if (i3 != 0) {
        }
    }

    @Override // ke.n
    public final e a(CoroutineContext coroutineContext, int i3, ie.a aVar) {
        return ((i3 == 0 || i3 == -3) && aVar == ie.a.f4712d) ? this : new ke.h(this, coroutineContext, i3, aVar);
    }

    @Override // je.f
    public final Object b(Object obj, ld.a aVar) {
        Throwable th;
        ld.a[] n10;
        y yVar;
        if (q(obj)) {
            return Unit.f5554a;
        }
        ge.h hVar = new ge.h(1, md.f.b(aVar));
        hVar.s();
        ld.a[] aVarArr = ke.c.f5510a;
        synchronized (this) {
            try {
                if (r(obj)) {
                    try {
                        hd.l lVar = hd.n.f4511e;
                        hVar.resumeWith(Unit.f5554a);
                        n10 = n(aVarArr);
                        yVar = null;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } else {
                    try {
                        y yVar2 = new y(this, o() + this.f5136y + this.f5137z, obj, hVar);
                        m(yVar2);
                        this.f5137z++;
                        if (this.f5131t == 0) {
                            aVarArr = n(aVarArr);
                        }
                        n10 = aVarArr;
                        yVar = yVar2;
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        throw th;
                    }
                }
                if (yVar != null) {
                    hVar.v(new ge.e(2, yVar));
                }
                for (ld.a aVar2 : n10) {
                    if (aVar2 != null) {
                        hd.l lVar2 = hd.n.f4511e;
                        aVar2.resumeWith(Unit.f5554a);
                    }
                }
                Object r9 = hVar.r();
                md.a aVar3 = md.a.f6622d;
                if (r9 != aVar3) {
                    r9 = Unit.f5554a;
                }
                return r9 == aVar3 ? r9 : Unit.f5554a;
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    @Override // je.e
    public final Object c(f fVar, ld.a aVar) {
        k(this, fVar, aVar);
        return md.a.f6622d;
    }

    @Override // ke.b
    public final ke.d e() {
        c0 c0Var = new c0();
        c0Var.f5147a = -1L;
        return c0Var;
    }

    @Override // ke.b
    public final ke.d[] f() {
        return new c0[2];
    }

    public final Object i(c0 c0Var, z zVar) {
        ge.h hVar = new ge.h(1, md.f.b(zVar));
        hVar.s();
        synchronized (this) {
            try {
                if (s(c0Var) < 0) {
                    c0Var.f5148b = hVar;
                } else {
                    hd.l lVar = hd.n.f4511e;
                    hVar.resumeWith(Unit.f5554a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Object r9 = hVar.r();
        return r9 == md.a.f6622d ? r9 : Unit.f5554a;
    }

    public final void j() {
        if (this.f5131t != 0 || this.f5137z > 1) {
            Object[] objArr = this.f5133v;
            objArr.getClass();
            while (this.f5137z > 0) {
                long o6 = o();
                int i3 = this.f5136y;
                int i10 = this.f5137z;
                if (objArr[((int) ((o6 + (i3 + i10)) - 1)) & (objArr.length - 1)] != b0.f5141a) {
                    return;
                }
                this.f5137z = i10 - 1;
                b0.d(objArr, o() + this.f5136y + this.f5137z, null);
            }
        }
    }

    public final void l() {
        ke.d[] dVarArr;
        Object[] objArr = this.f5133v;
        objArr.getClass();
        b0.d(objArr, o(), null);
        this.f5136y--;
        long o6 = o() + 1;
        if (this.f5134w < o6) {
            this.f5134w = o6;
        }
        if (this.f5135x < o6) {
            if (this.f5507e != 0 && (dVarArr = this.f5506d) != null) {
                for (ke.d dVar : dVarArr) {
                    if (dVar != null) {
                        c0 c0Var = (c0) dVar;
                        long j = c0Var.f5147a;
                        if (0 <= j && j < o6) {
                            c0Var.f5147a = o6;
                        }
                    }
                }
            }
            this.f5135x = o6;
        }
    }

    public final void m(Object obj) {
        int i3 = this.f5136y + this.f5137z;
        Object[] objArr = this.f5133v;
        if (objArr == null) {
            objArr = p(null, 0, 2);
        } else if (i3 >= objArr.length) {
            objArr = p(objArr, i3, objArr.length * 2);
        }
        b0.d(objArr, o() + i3, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ld.a[] n(ld.a[] aVarArr) {
        ke.d[] dVarArr;
        c0 c0Var;
        ge.h hVar;
        int length = aVarArr.length;
        if (this.f5507e != 0 && (dVarArr = this.f5506d) != null) {
            int length2 = dVarArr.length;
            int i3 = 0;
            aVarArr = aVarArr;
            while (i3 < length2) {
                ke.d dVar = dVarArr[i3];
                if (dVar != null && (hVar = (c0Var = (c0) dVar).f5148b) != null && s(c0Var) >= 0) {
                    int length3 = aVarArr.length;
                    aVarArr = aVarArr;
                    if (length >= length3) {
                        aVarArr = Arrays.copyOf(aVarArr, Math.max(2, aVarArr.length * 2));
                    }
                    aVarArr[length] = hVar;
                    c0Var.f5148b = null;
                    length++;
                }
                i3++;
                aVarArr = aVarArr;
            }
        }
        return aVarArr;
    }

    public final long o() {
        return Math.min(this.f5135x, this.f5134w);
    }

    public final Object[] p(Object[] objArr, int i3, int i10) {
        if (i10 <= 0) {
            kotlin.collections.i0.l("Buffer size overflow");
            return null;
        }
        Object[] objArr2 = new Object[i10];
        this.f5133v = objArr2;
        if (objArr != null) {
            long o6 = o();
            for (int i11 = 0; i11 < i3; i11++) {
                long j = i11 + o6;
                b0.d(objArr2, j, objArr[((int) j) & (objArr.length - 1)]);
            }
        }
        return objArr2;
    }

    public final boolean q(Object obj) {
        int i3;
        boolean z10;
        ld.a[] aVarArr = ke.c.f5510a;
        synchronized (this) {
            if (r(obj)) {
                aVarArr = n(aVarArr);
                z10 = true;
            } else {
                z10 = false;
            }
        }
        for (ld.a aVar : aVarArr) {
            if (aVar != null) {
                hd.l lVar = hd.n.f4511e;
                aVar.resumeWith(Unit.f5554a);
            }
        }
        return z10;
    }

    public final boolean r(Object obj) {
        int i3 = this.f5507e;
        int i10 = this.f5130s;
        if (i3 != 0) {
            int i11 = this.f5136y;
            int i12 = this.f5131t;
            if (i11 >= i12 && this.f5135x <= this.f5134w) {
                int ordinal = this.f5132u.ordinal();
                if (ordinal == 0) {
                    return false;
                }
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        a2.r.p();
                        return false;
                    }
                }
            }
            m(obj);
            int i13 = this.f5136y + 1;
            this.f5136y = i13;
            if (i13 > i12) {
                l();
            }
            long o6 = o() + this.f5136y;
            long j = this.f5134w;
            if (((int) (o6 - j)) > i10) {
                u(1 + j, this.f5135x, o() + this.f5136y, o() + this.f5136y + this.f5137z);
            }
        } else if (i10 != 0) {
            m(obj);
            int i14 = this.f5136y + 1;
            this.f5136y = i14;
            if (i14 > i10) {
                l();
            }
            this.f5135x = o() + this.f5136y;
            return true;
        }
        return true;
    }

    public final long s(c0 c0Var) {
        long j = c0Var.f5147a;
        if (j < o() + this.f5136y) {
            return j;
        }
        if (this.f5131t <= 0 && j <= o() && this.f5137z != 0) {
            return j;
        }
        return -1L;
    }

    public final Object t(c0 c0Var) {
        Object obj;
        ld.a[] aVarArr = ke.c.f5510a;
        synchronized (this) {
            try {
                long s3 = s(c0Var);
                if (s3 < 0) {
                    obj = b0.f5141a;
                } else {
                    long j = c0Var.f5147a;
                    Object[] objArr = this.f5133v;
                    objArr.getClass();
                    Object obj2 = objArr[((int) s3) & (objArr.length - 1)];
                    if (obj2 instanceof y) {
                        obj2 = ((y) obj2).f5244i;
                    }
                    c0Var.f5147a = s3 + 1;
                    Object obj3 = obj2;
                    aVarArr = v(j);
                    obj = obj3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (ld.a aVar : aVarArr) {
            if (aVar != null) {
                hd.l lVar = hd.n.f4511e;
                aVar.resumeWith(Unit.f5554a);
            }
        }
        return obj;
    }

    public final void u(long j, long j3, long j10, long j11) {
        long min = Math.min(j3, j);
        for (long o6 = o(); o6 < min; o6++) {
            Object[] objArr = this.f5133v;
            objArr.getClass();
            b0.d(objArr, o6, null);
        }
        this.f5134w = j;
        this.f5135x = j3;
        this.f5136y = (int) (j10 - min);
        this.f5137z = (int) (j11 - j10);
    }

    public final ld.a[] v(long j) {
        long j3;
        long j10;
        int i3;
        long j11;
        ld.a[] aVarArr;
        ld.a[] aVarArr2;
        ke.d[] dVarArr;
        a8.f fVar = b0.f5141a;
        ld.a[] aVarArr3 = ke.c.f5510a;
        if (j <= this.f5135x) {
            long o6 = o();
            long j12 = this.f5136y + o6;
            int i10 = this.f5131t;
            if (i10 == 0 && this.f5137z > 0) {
                j12++;
            }
            int i11 = 0;
            if (this.f5507e != 0 && (dVarArr = this.f5506d) != null) {
                for (ke.d dVar : dVarArr) {
                    if (dVar != null) {
                        long j13 = ((c0) dVar).f5147a;
                        if (0 <= j13 && j13 < j12) {
                            j12 = j13;
                        }
                    }
                }
            }
            if (j12 > this.f5135x) {
                long o10 = o() + this.f5136y;
                int i12 = this.f5507e;
                int i13 = this.f5137z;
                if (i12 > 0) {
                    j3 = 1;
                    i13 = Math.min(i13, i10 - ((int) (o10 - j12)));
                } else {
                    j3 = 1;
                }
                long j14 = this.f5137z + o10;
                if (i13 > 0) {
                    ld.a[] aVarArr4 = new ld.a[i13];
                    Object[] objArr = this.f5133v;
                    objArr.getClass();
                    j10 = j12;
                    long j15 = o10;
                    while (true) {
                        if (o10 >= j14) {
                            aVarArr2 = aVarArr4;
                            i3 = i10;
                            j11 = j14;
                            break;
                        }
                        aVarArr2 = aVarArr4;
                        Object obj = objArr[((int) o10) & (objArr.length - 1)];
                        if (obj != fVar) {
                            obj.getClass();
                            y yVar = (y) obj;
                            i3 = i10;
                            int i14 = i11 + 1;
                            j11 = j14;
                            aVarArr2[i11] = yVar.f5245r;
                            b0.d(objArr, o10, fVar);
                            b0.d(objArr, j15, yVar.f5244i);
                            j15 += j3;
                            if (i14 >= i13) {
                                break;
                            }
                            i11 = i14;
                        } else {
                            i3 = i10;
                            j11 = j14;
                        }
                        o10 += j3;
                        aVarArr4 = aVarArr2;
                        i10 = i3;
                        j14 = j11;
                    }
                    o10 = j15;
                    aVarArr = aVarArr2;
                } else {
                    j10 = j12;
                    i3 = i10;
                    j11 = j14;
                    aVarArr = aVarArr3;
                }
                long max = Math.max(this.f5134w, Math.max(o6, o10 - this.f5130s));
                if (i3 == 0 && max < j11) {
                    Object[] objArr2 = this.f5133v;
                    objArr2.getClass();
                    if (Intrinsics.a(objArr2[((int) max) & (objArr2.length - 1)], fVar)) {
                        o10 += j3;
                        max += j3;
                    }
                }
                long j16 = o10;
                u(max, this.f5507e == 0 ? j16 : j10, j16, j11);
                j();
                return aVarArr.length == 0 ? aVarArr : n(aVarArr);
            }
        }
        return aVarArr3;
    }
}
