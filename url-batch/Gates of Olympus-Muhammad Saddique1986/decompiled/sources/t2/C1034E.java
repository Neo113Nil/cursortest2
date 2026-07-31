package t2;

import java.util.Arrays;
import q2.C0818e;
import q2.C0821h;
import q2.C0832t;
import q2.X;
import s2.EnumC0967a;
import u2.AbstractC1150b;
import u2.AbstractC1151c;
import u2.AbstractC1152d;

/* renamed from: t2.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1034E extends AbstractC1150b implements InterfaceC1071x, InterfaceC1053f, u2.v {

    /* renamed from: h, reason: collision with root package name */
    public final int f8968h;

    /* renamed from: i, reason: collision with root package name */
    public final int f8969i;

    /* renamed from: j, reason: collision with root package name */
    public final EnumC0967a f8970j;

    /* renamed from: k, reason: collision with root package name */
    public Object[] f8971k;

    /* renamed from: l, reason: collision with root package name */
    public long f8972l;

    /* renamed from: m, reason: collision with root package name */
    public long f8973m;

    /* renamed from: n, reason: collision with root package name */
    public int f8974n;

    /* renamed from: o, reason: collision with root package name */
    public int f8975o;

    public C1034E(int i3, int i4, EnumC0967a enumC0967a) {
        this.f8968h = i3;
        this.f8969i = i4;
        this.f8970j = enumC0967a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0082 A[Catch: all -> 0x0038, TryCatch #1 {all -> 0x0038, blocks: (B:14:0x0031, B:18:0x007a, B:20:0x0082, B:28:0x0095, B:31:0x009c, B:32:0x00a0, B:34:0x00a1, B:40:0x004b), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0093 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r5v1, types: [u2.b] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [t2.E] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r9v0, types: [t2.g] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v2, types: [u2.d] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [t2.G] */
    /* JADX WARN: Type inference failed for: r9v8, types: [t2.G] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00af -> B:15:0x0034). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m(C1034E c1034e, InterfaceC1054g interfaceC1054g, V1.d dVar) {
        C1033D c1033d;
        W1.a aVar;
        int i3;
        ?? r5;
        InterfaceC1054g interfaceC1054g2;
        X x3;
        X x4;
        InterfaceC1054g interfaceC1054g3;
        Object u3;
        C1036G c1036g;
        try {
            try {
                if (dVar instanceof C1033D) {
                    c1033d = (C1033D) dVar;
                    int i4 = c1033d.f8967m;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        c1033d.f8967m = i4 - Integer.MIN_VALUE;
                        Object obj = c1033d.f8965k;
                        aVar = W1.a.f4608d;
                        i3 = c1033d.f8967m;
                        if (i3 != 0) {
                            R1.a.e(obj);
                            interfaceC1054g2 = interfaceC1054g;
                            interfaceC1054g = (C1036G) c1034e.f();
                        } else {
                            if (i3 != 1) {
                                if (i3 == 2) {
                                    x4 = c1033d.f8964j;
                                    C1036G c1036g2 = c1033d.f8963i;
                                    interfaceC1054g3 = c1033d.f8962h;
                                    C1034E c1034e2 = c1033d.f8961g;
                                    R1.a.e(obj);
                                    r5 = c1034e2;
                                    interfaceC1054g = c1036g2;
                                    do {
                                        u3 = r5.u(interfaceC1054g);
                                        if (u3 == AbstractC1035F.f8976a) {
                                        }
                                    } while (r5.k(interfaceC1054g, c1033d) != aVar);
                                    return;
                                }
                                if (i3 != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                x4 = c1033d.f8964j;
                                C1036G c1036g3 = c1033d.f8963i;
                                interfaceC1054g3 = c1033d.f8962h;
                                C1034E c1034e3 = c1033d.f8961g;
                                R1.a.e(obj);
                                C1034E c1034e4 = c1034e3;
                                C1036G c1036g4 = c1036g3;
                                interfaceC1054g2 = interfaceC1054g3;
                                x3 = x4;
                                c1034e = c1034e4;
                                c1036g = c1036g4;
                                r5 = c1034e;
                                x4 = x3;
                                interfaceC1054g3 = interfaceC1054g2;
                                interfaceC1054g = c1036g;
                                do {
                                    u3 = r5.u(interfaceC1054g);
                                    if (u3 == AbstractC1035F.f8976a) {
                                        if (x4 != null && !x4.b()) {
                                            throw x4.g();
                                        }
                                        c1033d.f8961g = r5;
                                        c1033d.f8962h = interfaceC1054g3;
                                        c1033d.f8963i = interfaceC1054g;
                                        c1033d.f8964j = x4;
                                        c1033d.f8967m = 3;
                                        c1034e4 = r5;
                                        c1036g4 = interfaceC1054g;
                                        if (interfaceC1054g3.e(u3, c1033d) == aVar) {
                                            return;
                                        }
                                        interfaceC1054g2 = interfaceC1054g3;
                                        x3 = x4;
                                        c1034e = c1034e4;
                                        c1036g = c1036g4;
                                        r5 = c1034e;
                                        x4 = x3;
                                        interfaceC1054g3 = interfaceC1054g2;
                                        interfaceC1054g = c1036g;
                                        u3 = r5.u(interfaceC1054g);
                                        if (u3 == AbstractC1035F.f8976a) {
                                            c1033d.f8961g = r5;
                                            c1033d.f8962h = interfaceC1054g3;
                                            c1033d.f8963i = interfaceC1054g;
                                            c1033d.f8964j = x4;
                                            c1033d.f8967m = 2;
                                        }
                                    }
                                } while (r5.k(interfaceC1054g, c1033d) != aVar);
                                return;
                            }
                            interfaceC1054g = c1033d.f8963i;
                            InterfaceC1054g interfaceC1054g4 = c1033d.f8962h;
                            C1034E c1034e5 = c1033d.f8961g;
                            try {
                                R1.a.e(obj);
                                interfaceC1054g2 = interfaceC1054g4;
                                c1034e = c1034e5;
                                interfaceC1054g = interfaceC1054g;
                            } catch (Throwable th) {
                                th = th;
                                r5 = c1034e5;
                                r5.i(interfaceC1054g);
                                throw th;
                            }
                        }
                        V1.i iVar = c1033d.f4642e;
                        f2.j.c(iVar);
                        x3 = (X) iVar.v(C0832t.f7929e);
                        c1036g = interfaceC1054g;
                        r5 = c1034e;
                        x4 = x3;
                        interfaceC1054g3 = interfaceC1054g2;
                        interfaceC1054g = c1036g;
                        do {
                            u3 = r5.u(interfaceC1054g);
                            if (u3 == AbstractC1035F.f8976a) {
                            }
                        } while (r5.k(interfaceC1054g, c1033d) != aVar);
                        return;
                    }
                }
                V1.i iVar2 = c1033d.f4642e;
                f2.j.c(iVar2);
                x3 = (X) iVar2.v(C0832t.f7929e);
                c1036g = interfaceC1054g;
                r5 = c1034e;
                x4 = x3;
                interfaceC1054g3 = interfaceC1054g2;
                interfaceC1054g = c1036g;
                do {
                    u3 = r5.u(interfaceC1054g);
                    if (u3 == AbstractC1035F.f8976a) {
                    }
                } while (r5.k(interfaceC1054g, c1033d) != aVar);
                return;
            } catch (Throwable th2) {
                r5 = c1034e;
                th = th2;
                r5.i(interfaceC1054g);
                throw th;
            }
            if (i3 != 0) {
            }
        } catch (Throwable th3) {
            th = th3;
        }
        c1033d = new C1033D(c1034e, dVar);
        Object obj2 = c1033d.f8965k;
        aVar = W1.a.f4608d;
        i3 = c1033d.f8967m;
    }

    @Override // t2.InterfaceC1071x
    public final void a() {
        synchronized (this) {
            v(q() + this.f8974n, this.f8973m, q() + this.f8974n, q() + this.f8974n + this.f8975o);
        }
    }

    @Override // u2.v
    public final InterfaceC1053f b(V1.i iVar, int i3, EnumC0967a enumC0967a) {
        return AbstractC1035F.l(this, iVar, i3, enumC0967a);
    }

    @Override // t2.InterfaceC1071x
    public final boolean c(Object obj) {
        int i3;
        boolean z3;
        V1.d[] dVarArr = AbstractC1151c.f9681a;
        synchronized (this) {
            if (s(obj)) {
                dVarArr = p(dVarArr);
                z3 = true;
            } else {
                z3 = false;
            }
        }
        for (V1.d dVar : dVarArr) {
            if (dVar != null) {
                dVar.u(R1.y.f4171a);
            }
        }
        return z3;
    }

    @Override // t2.InterfaceC1053f
    public final Object d(InterfaceC1054g interfaceC1054g, V1.d dVar) {
        m(this, interfaceC1054g, dVar);
        return W1.a.f4608d;
    }

    @Override // t2.InterfaceC1054g
    public final Object e(Object obj, V1.d dVar) {
        V1.d[] dVarArr;
        C1032C c1032c;
        if (c(obj)) {
            return R1.y.f4171a;
        }
        C0821h c0821h = new C0821h(1, l0.c.B(dVar));
        c0821h.r();
        V1.d[] dVarArr2 = AbstractC1151c.f9681a;
        synchronized (this) {
            try {
                if (s(obj)) {
                    c0821h.u(R1.y.f4171a);
                    dVarArr = p(dVarArr2);
                    c1032c = null;
                } else {
                    C1032C c1032c2 = new C1032C(this, this.f8974n + this.f8975o + q(), obj, c0821h);
                    o(c1032c2);
                    this.f8975o++;
                    if (this.f8969i == 0) {
                        dVarArr2 = p(dVarArr2);
                    }
                    dVarArr = dVarArr2;
                    c1032c = c1032c2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c1032c != null) {
            c0821h.w(new C0818e(2, c1032c));
        }
        for (V1.d dVar2 : dVarArr) {
            if (dVar2 != null) {
                dVar2.u(R1.y.f4171a);
            }
        }
        Object q3 = c0821h.q();
        W1.a aVar = W1.a.f4608d;
        if (q3 != aVar) {
            q3 = R1.y.f4171a;
        }
        return q3 == aVar ? q3 : R1.y.f4171a;
    }

    @Override // u2.AbstractC1150b
    public final AbstractC1152d g() {
        C1036G c1036g = new C1036G();
        c1036g.f8979a = -1L;
        return c1036g;
    }

    @Override // u2.AbstractC1150b
    public final AbstractC1152d[] h() {
        return new C1036G[2];
    }

    public final Object k(C1036G c1036g, C1033D c1033d) {
        C0821h c0821h = new C0821h(1, l0.c.B(c1033d));
        c0821h.r();
        synchronized (this) {
            if (t(c1036g) < 0) {
                c1036g.f8980b = c0821h;
            } else {
                c0821h.u(R1.y.f4171a);
            }
        }
        Object q3 = c0821h.q();
        return q3 == W1.a.f4608d ? q3 : R1.y.f4171a;
    }

    public final void l() {
        if (this.f8969i != 0 || this.f8975o > 1) {
            Object[] objArr = this.f8971k;
            f2.j.c(objArr);
            while (this.f8975o > 0) {
                long q3 = q();
                int i3 = this.f8974n;
                int i4 = this.f8975o;
                if (objArr[((int) ((q3 + (i3 + i4)) - 1)) & (objArr.length - 1)] != AbstractC1035F.f8976a) {
                    return;
                }
                this.f8975o = i4 - 1;
                AbstractC1035F.e(objArr, q() + this.f8974n + this.f8975o, null);
            }
        }
    }

    public final void n() {
        AbstractC1152d[] abstractC1152dArr;
        Object[] objArr = this.f8971k;
        f2.j.c(objArr);
        AbstractC1035F.e(objArr, q(), null);
        this.f8974n--;
        long q3 = q() + 1;
        if (this.f8972l < q3) {
            this.f8972l = q3;
        }
        if (this.f8973m < q3) {
            if (this.f9678e != 0 && (abstractC1152dArr = this.f9677d) != null) {
                for (AbstractC1152d abstractC1152d : abstractC1152dArr) {
                    if (abstractC1152d != null) {
                        C1036G c1036g = (C1036G) abstractC1152d;
                        long j3 = c1036g.f8979a;
                        if (j3 >= 0 && j3 < q3) {
                            c1036g.f8979a = q3;
                        }
                    }
                }
            }
            this.f8973m = q3;
        }
    }

    public final void o(Object obj) {
        int i3 = this.f8974n + this.f8975o;
        Object[] objArr = this.f8971k;
        if (objArr == null) {
            objArr = r(null, 0, 2);
        } else if (i3 >= objArr.length) {
            objArr = r(objArr, i3, objArr.length * 2);
        }
        AbstractC1035F.e(objArr, q() + i3, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object, java.lang.Object[]] */
    public final V1.d[] p(V1.d[] dVarArr) {
        AbstractC1152d[] abstractC1152dArr;
        C1036G c1036g;
        C0821h c0821h;
        int length = dVarArr.length;
        if (this.f9678e != 0 && (abstractC1152dArr = this.f9677d) != null) {
            int length2 = abstractC1152dArr.length;
            int i3 = 0;
            dVarArr = dVarArr;
            while (i3 < length2) {
                AbstractC1152d abstractC1152d = abstractC1152dArr[i3];
                if (abstractC1152d != null && (c0821h = (c1036g = (C1036G) abstractC1152d).f8980b) != null && t(c1036g) >= 0) {
                    int length3 = dVarArr.length;
                    dVarArr = dVarArr;
                    if (length >= length3) {
                        ?? copyOf = Arrays.copyOf(dVarArr, Math.max(2, dVarArr.length * 2));
                        f2.j.e(copyOf, "copyOf(...)");
                        dVarArr = copyOf;
                    }
                    dVarArr[length] = c0821h;
                    c1036g.f8980b = null;
                    length++;
                }
                i3++;
                dVarArr = dVarArr;
            }
        }
        return dVarArr;
    }

    public final long q() {
        return Math.min(this.f8973m, this.f8972l);
    }

    public final Object[] r(Object[] objArr, int i3, int i4) {
        if (i4 <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] objArr2 = new Object[i4];
        this.f8971k = objArr2;
        if (objArr == null) {
            return objArr2;
        }
        long q3 = q();
        for (int i5 = 0; i5 < i3; i5++) {
            long j3 = i5 + q3;
            AbstractC1035F.e(objArr2, j3, objArr[((int) j3) & (objArr.length - 1)]);
        }
        return objArr2;
    }

    public final boolean s(Object obj) {
        int i3 = this.f9678e;
        int i4 = this.f8968h;
        if (i3 == 0) {
            if (i4 != 0) {
                o(obj);
                int i5 = this.f8974n + 1;
                this.f8974n = i5;
                if (i5 > i4) {
                    n();
                }
                this.f8973m = q() + this.f8974n;
            }
            return true;
        }
        int i6 = this.f8974n;
        int i7 = this.f8969i;
        if (i6 >= i7 && this.f8973m <= this.f8972l) {
            int ordinal = this.f8970j.ordinal();
            if (ordinal == 0) {
                return false;
            }
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return true;
                }
                throw new C1.c();
            }
        }
        o(obj);
        int i8 = this.f8974n + 1;
        this.f8974n = i8;
        if (i8 > i7) {
            n();
        }
        long q3 = q() + this.f8974n;
        long j3 = this.f8972l;
        if (((int) (q3 - j3)) > i4) {
            v(j3 + 1, this.f8973m, q() + this.f8974n, q() + this.f8974n + this.f8975o);
        }
        return true;
    }

    public final long t(C1036G c1036g) {
        long j3 = c1036g.f8979a;
        if (j3 < q() + this.f8974n) {
            return j3;
        }
        if (this.f8969i <= 0 && j3 <= q() && this.f8975o != 0) {
            return j3;
        }
        return -1L;
    }

    public final Object u(C1036G c1036g) {
        Object obj;
        V1.d[] dVarArr = AbstractC1151c.f9681a;
        synchronized (this) {
            try {
                long t3 = t(c1036g);
                if (t3 < 0) {
                    obj = AbstractC1035F.f8976a;
                } else {
                    long j3 = c1036g.f8979a;
                    Object[] objArr = this.f8971k;
                    f2.j.c(objArr);
                    Object obj2 = objArr[((int) t3) & (objArr.length - 1)];
                    if (obj2 instanceof C1032C) {
                        obj2 = ((C1032C) obj2).f8959f;
                    }
                    c1036g.f8979a = t3 + 1;
                    Object obj3 = obj2;
                    dVarArr = w(j3);
                    obj = obj3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (V1.d dVar : dVarArr) {
            if (dVar != null) {
                dVar.u(R1.y.f4171a);
            }
        }
        return obj;
    }

    public final void v(long j3, long j4, long j5, long j6) {
        long min = Math.min(j4, j3);
        for (long q3 = q(); q3 < min; q3++) {
            Object[] objArr = this.f8971k;
            f2.j.c(objArr);
            AbstractC1035F.e(objArr, q3, null);
        }
        this.f8972l = j3;
        this.f8973m = j4;
        this.f8974n = (int) (j5 - min);
        this.f8975o = (int) (j6 - j5);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final V1.d[] w(long j3) {
        long j4;
        long j5;
        V1.d[] dVarArr;
        long max;
        Object[] objArr;
        long j6;
        AbstractC1152d[] abstractC1152dArr;
        long j7 = this.f8973m;
        V1.d[] dVarArr2 = AbstractC1151c.f9681a;
        if (j3 > j7) {
            return dVarArr2;
        }
        long q3 = q();
        long j8 = this.f8974n + q3;
        int i3 = this.f8969i;
        if (i3 == 0 && this.f8975o > 0) {
            j8++;
        }
        if (this.f9678e != 0 && (abstractC1152dArr = this.f9677d) != null) {
            for (AbstractC1152d abstractC1152d : abstractC1152dArr) {
                if (abstractC1152d != null) {
                    long j9 = ((C1036G) abstractC1152d).f8979a;
                    if (j9 >= 0 && j9 < j8) {
                        j8 = j9;
                    }
                }
            }
        }
        if (j8 <= this.f8973m) {
            return dVarArr2;
        }
        long q4 = q() + this.f8974n;
        int min = this.f9678e > 0 ? Math.min(this.f8975o, i3 - ((int) (q4 - j8))) : this.f8975o;
        long j10 = this.f8975o + q4;
        m1.q qVar = AbstractC1035F.f8976a;
        if (min > 0) {
            dVarArr2 = new V1.d[min];
            Object[] objArr2 = this.f8971k;
            f2.j.c(objArr2);
            j4 = j8;
            long j11 = q4;
            long j12 = j11;
            int i4 = 0;
            while (j12 < j10) {
                j5 = j10;
                Object obj = objArr2[((int) j12) & (objArr2.length - 1)];
                if (obj != qVar) {
                    f2.j.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                    C1032C c1032c = (C1032C) obj;
                    int i5 = i4 + 1;
                    dVarArr2[i4] = c1032c.f8960g;
                    AbstractC1035F.e(objArr2, j12, qVar);
                    AbstractC1035F.e(objArr2, j11, c1032c.f8959f);
                    j6 = 1;
                    q4 = j11 + 1;
                    if (i5 < min) {
                        j11 = q4;
                        i4 = i5;
                    }
                } else {
                    j6 = 1;
                }
                j12 += j6;
                j10 = j5;
            }
            j5 = j10;
            dVarArr = dVarArr2;
            q4 = j11;
            int i6 = (int) (q4 - q3);
            long j13 = this.f9678e != 0 ? q4 : j4;
            max = Math.max(this.f8972l, q4 - Math.min(this.f8968h, i6));
            if (i3 == 0 && max < j5) {
                objArr = this.f8971k;
                f2.j.c(objArr);
                if (f2.j.a(objArr[((int) max) & (objArr.length - 1)], qVar)) {
                    q4++;
                    max++;
                }
            }
            v(max, j13, q4, j5);
            l();
            return dVarArr.length != 0 ? dVarArr : p(dVarArr);
        }
        j4 = j8;
        j5 = j10;
        dVarArr = dVarArr2;
        int i62 = (int) (q4 - q3);
        if (this.f9678e != 0) {
        }
        max = Math.max(this.f8972l, q4 - Math.min(this.f8968h, i62));
        if (i3 == 0) {
            objArr = this.f8971k;
            f2.j.c(objArr);
            if (f2.j.a(objArr[((int) max) & (objArr.length - 1)], qVar)) {
            }
        }
        v(max, j13, q4, j5);
        l();
        if (dVarArr.length != 0) {
        }
    }
}
