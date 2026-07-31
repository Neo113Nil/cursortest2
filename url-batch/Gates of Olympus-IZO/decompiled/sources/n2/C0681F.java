package n2;

import java.util.Arrays;
import k2.C0533e;
import k2.C0536h;
import k2.C0547t;
import k2.X;
import m2.EnumC0626a;
import o2.AbstractC0753b;
import o2.AbstractC0754c;
import o2.AbstractC0755d;

/* renamed from: n2.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0681F extends AbstractC0753b implements InterfaceC0718x, InterfaceC0700f, o2.p {

    /* renamed from: h, reason: collision with root package name */
    public final int f6285h;

    /* renamed from: i, reason: collision with root package name */
    public final int f6286i;

    /* renamed from: j, reason: collision with root package name */
    public final EnumC0626a f6287j;

    /* renamed from: k, reason: collision with root package name */
    public Object[] f6288k;

    /* renamed from: l, reason: collision with root package name */
    public long f6289l;

    /* renamed from: m, reason: collision with root package name */
    public long f6290m;

    /* renamed from: n, reason: collision with root package name */
    public int f6291n;

    /* renamed from: o, reason: collision with root package name */
    public int f6292o;

    public C0681F(int i3, int i4, EnumC0626a enumC0626a) {
        this.f6285h = i3;
        this.f6286i = i4;
        this.f6287j = enumC0626a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0081 A[Catch: all -> 0x0038, TryCatch #1 {all -> 0x0038, blocks: (B:14:0x0031, B:18:0x0079, B:20:0x0081, B:28:0x0094, B:31:0x009b, B:32:0x009f, B:34:0x00a0, B:40:0x004b), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r5v1, types: [o2.b] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [n2.F] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r9v0, types: [n2.g] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v2, types: [o2.d] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [n2.H] */
    /* JADX WARN: Type inference failed for: r9v8, types: [n2.H] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00ae -> B:15:0x0034). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void k(C0681F c0681f, InterfaceC0701g interfaceC0701g, P1.d dVar) {
        C0680E c0680e;
        Q1.a aVar;
        int i3;
        ?? r5;
        InterfaceC0701g interfaceC0701g2;
        X x3;
        X x4;
        InterfaceC0701g interfaceC0701g3;
        Object s3;
        C0683H c0683h;
        try {
            try {
                if (dVar instanceof C0680E) {
                    c0680e = (C0680E) dVar;
                    int i4 = c0680e.f6284j;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        c0680e.f6284j = i4 - Integer.MIN_VALUE;
                        Object obj = c0680e.f6282h;
                        aVar = Q1.a.f3113d;
                        i3 = c0680e.f6284j;
                        if (i3 != 0) {
                            I2.l.Q(obj);
                            interfaceC0701g2 = interfaceC0701g;
                            interfaceC0701g = (C0683H) c0681f.d();
                        } else {
                            if (i3 != 1) {
                                if (i3 == 2) {
                                    x4 = c0680e.f6281g;
                                    C0683H c0683h2 = c0680e.f6280f;
                                    interfaceC0701g3 = c0680e.f6279e;
                                    C0681F c0681f2 = c0680e.f6278d;
                                    I2.l.Q(obj);
                                    r5 = c0681f2;
                                    interfaceC0701g = c0683h2;
                                    do {
                                        s3 = r5.s(interfaceC0701g);
                                        if (s3 == AbstractC0682G.f6293a) {
                                        }
                                    } while (r5.i(interfaceC0701g, c0680e) != aVar);
                                    return;
                                }
                                if (i3 != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                x4 = c0680e.f6281g;
                                C0683H c0683h3 = c0680e.f6280f;
                                interfaceC0701g3 = c0680e.f6279e;
                                C0681F c0681f3 = c0680e.f6278d;
                                I2.l.Q(obj);
                                C0681F c0681f4 = c0681f3;
                                C0683H c0683h4 = c0683h3;
                                interfaceC0701g2 = interfaceC0701g3;
                                x3 = x4;
                                c0681f = c0681f4;
                                c0683h = c0683h4;
                                r5 = c0681f;
                                x4 = x3;
                                interfaceC0701g3 = interfaceC0701g2;
                                interfaceC0701g = c0683h;
                                do {
                                    s3 = r5.s(interfaceC0701g);
                                    if (s3 == AbstractC0682G.f6293a) {
                                        if (x4 != null && !x4.b()) {
                                            throw x4.m();
                                        }
                                        c0680e.f6278d = r5;
                                        c0680e.f6279e = interfaceC0701g3;
                                        c0680e.f6280f = interfaceC0701g;
                                        c0680e.f6281g = x4;
                                        c0680e.f6284j = 3;
                                        c0681f4 = r5;
                                        c0683h4 = interfaceC0701g;
                                        if (interfaceC0701g3.emit(s3, c0680e) == aVar) {
                                            return;
                                        }
                                        interfaceC0701g2 = interfaceC0701g3;
                                        x3 = x4;
                                        c0681f = c0681f4;
                                        c0683h = c0683h4;
                                        r5 = c0681f;
                                        x4 = x3;
                                        interfaceC0701g3 = interfaceC0701g2;
                                        interfaceC0701g = c0683h;
                                        s3 = r5.s(interfaceC0701g);
                                        if (s3 == AbstractC0682G.f6293a) {
                                            c0680e.f6278d = r5;
                                            c0680e.f6279e = interfaceC0701g3;
                                            c0680e.f6280f = interfaceC0701g;
                                            c0680e.f6281g = x4;
                                            c0680e.f6284j = 2;
                                        }
                                    }
                                } while (r5.i(interfaceC0701g, c0680e) != aVar);
                                return;
                            }
                            interfaceC0701g = c0680e.f6280f;
                            InterfaceC0701g interfaceC0701g4 = c0680e.f6279e;
                            C0681F c0681f5 = c0680e.f6278d;
                            try {
                                I2.l.Q(obj);
                                interfaceC0701g2 = interfaceC0701g4;
                                c0681f = c0681f5;
                                interfaceC0701g = interfaceC0701g;
                            } catch (Throwable th) {
                                th = th;
                                r5 = c0681f5;
                                r5.g(interfaceC0701g);
                                throw th;
                            }
                        }
                        x3 = (X) c0680e.getContext().k(C0547t.f5390e);
                        c0683h = interfaceC0701g;
                        r5 = c0681f;
                        x4 = x3;
                        interfaceC0701g3 = interfaceC0701g2;
                        interfaceC0701g = c0683h;
                        do {
                            s3 = r5.s(interfaceC0701g);
                            if (s3 == AbstractC0682G.f6293a) {
                            }
                        } while (r5.i(interfaceC0701g, c0680e) != aVar);
                        return;
                    }
                }
                x3 = (X) c0680e.getContext().k(C0547t.f5390e);
                c0683h = interfaceC0701g;
                r5 = c0681f;
                x4 = x3;
                interfaceC0701g3 = interfaceC0701g2;
                interfaceC0701g = c0683h;
                do {
                    s3 = r5.s(interfaceC0701g);
                    if (s3 == AbstractC0682G.f6293a) {
                    }
                } while (r5.i(interfaceC0701g, c0680e) != aVar);
                return;
            } catch (Throwable th2) {
                r5 = c0681f;
                th = th2;
                r5.g(interfaceC0701g);
                throw th;
            }
            if (i3 != 0) {
            }
        } catch (Throwable th3) {
            th = th3;
        }
        c0680e = new C0680E(c0681f, dVar);
        Object obj2 = c0680e.f6282h;
        aVar = Q1.a.f3113d;
        i3 = c0680e.f6284j;
    }

    @Override // n2.InterfaceC0718x
    public final void a() {
        synchronized (this) {
            t(o() + this.f6291n, this.f6290m, o() + this.f6291n, o() + this.f6291n + this.f6292o);
        }
    }

    @Override // o2.p
    public final InterfaceC0700f b(P1.i iVar, int i3, EnumC0626a enumC0626a) {
        return AbstractC0682G.k(this, iVar, i3, enumC0626a);
    }

    @Override // n2.InterfaceC0718x
    public final boolean c(Object obj) {
        int i3;
        boolean z3;
        P1.d[] dVarArr = AbstractC0754c.f6698a;
        synchronized (this) {
            if (q(obj)) {
                dVarArr = n(dVarArr);
                z3 = true;
            } else {
                z3 = false;
            }
        }
        for (P1.d dVar : dVarArr) {
            if (dVar != null) {
                dVar.resumeWith(L1.z.f2729a);
            }
        }
        return z3;
    }

    @Override // n2.InterfaceC0700f
    public final Object collect(InterfaceC0701g interfaceC0701g, P1.d dVar) {
        k(this, interfaceC0701g, dVar);
        return Q1.a.f3113d;
    }

    @Override // o2.AbstractC0753b
    public final AbstractC0755d e() {
        C0683H c0683h = new C0683H();
        c0683h.f6296a = -1L;
        return c0683h;
    }

    @Override // n2.InterfaceC0701g
    public final Object emit(Object obj, P1.d dVar) {
        P1.d[] dVarArr;
        C0679D c0679d;
        if (c(obj)) {
            return L1.z.f2729a;
        }
        C0536h c0536h = new C0536h(1, M1.B.G(dVar));
        c0536h.q();
        P1.d[] dVarArr2 = AbstractC0754c.f6698a;
        synchronized (this) {
            try {
                if (q(obj)) {
                    c0536h.resumeWith(L1.z.f2729a);
                    dVarArr = n(dVarArr2);
                    c0679d = null;
                } else {
                    C0679D c0679d2 = new C0679D(this, this.f6291n + this.f6292o + o(), obj, c0536h);
                    m(c0679d2);
                    this.f6292o++;
                    if (this.f6286i == 0) {
                        dVarArr2 = n(dVarArr2);
                    }
                    dVarArr = dVarArr2;
                    c0679d = c0679d2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c0679d != null) {
            c0536h.u(new C0533e(2, c0679d));
        }
        for (P1.d dVar2 : dVarArr) {
            if (dVar2 != null) {
                dVar2.resumeWith(L1.z.f2729a);
            }
        }
        Object p = c0536h.p();
        Q1.a aVar = Q1.a.f3113d;
        if (p != aVar) {
            p = L1.z.f2729a;
        }
        return p == aVar ? p : L1.z.f2729a;
    }

    @Override // o2.AbstractC0753b
    public final AbstractC0755d[] f() {
        return new C0683H[2];
    }

    public final Object i(C0683H c0683h, C0680E c0680e) {
        C0536h c0536h = new C0536h(1, M1.B.G(c0680e));
        c0536h.q();
        synchronized (this) {
            if (r(c0683h) < 0) {
                c0683h.f6297b = c0536h;
            } else {
                c0536h.resumeWith(L1.z.f2729a);
            }
        }
        Object p = c0536h.p();
        return p == Q1.a.f3113d ? p : L1.z.f2729a;
    }

    public final void j() {
        if (this.f6286i != 0 || this.f6292o > 1) {
            Object[] objArr = this.f6288k;
            Z1.i.c(objArr);
            while (this.f6292o > 0) {
                long o3 = o();
                int i3 = this.f6291n;
                int i4 = this.f6292o;
                if (objArr[((int) ((o3 + (i3 + i4)) - 1)) & (objArr.length - 1)] != AbstractC0682G.f6293a) {
                    return;
                }
                this.f6292o = i4 - 1;
                AbstractC0682G.d(objArr, o() + this.f6291n + this.f6292o, null);
            }
        }
    }

    public final void l() {
        AbstractC0755d[] abstractC0755dArr;
        Object[] objArr = this.f6288k;
        Z1.i.c(objArr);
        AbstractC0682G.d(objArr, o(), null);
        this.f6291n--;
        long o3 = o() + 1;
        if (this.f6289l < o3) {
            this.f6289l = o3;
        }
        if (this.f6290m < o3) {
            if (this.f6695e != 0 && (abstractC0755dArr = this.f6694d) != null) {
                for (AbstractC0755d abstractC0755d : abstractC0755dArr) {
                    if (abstractC0755d != null) {
                        C0683H c0683h = (C0683H) abstractC0755d;
                        long j3 = c0683h.f6296a;
                        if (j3 >= 0 && j3 < o3) {
                            c0683h.f6296a = o3;
                        }
                    }
                }
            }
            this.f6290m = o3;
        }
    }

    public final void m(Object obj) {
        int i3 = this.f6291n + this.f6292o;
        Object[] objArr = this.f6288k;
        if (objArr == null) {
            objArr = p(null, 0, 2);
        } else if (i3 >= objArr.length) {
            objArr = p(objArr, i3, objArr.length * 2);
        }
        AbstractC0682G.d(objArr, o() + i3, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object, java.lang.Object[]] */
    public final P1.d[] n(P1.d[] dVarArr) {
        AbstractC0755d[] abstractC0755dArr;
        C0683H c0683h;
        C0536h c0536h;
        int length = dVarArr.length;
        if (this.f6695e != 0 && (abstractC0755dArr = this.f6694d) != null) {
            int length2 = abstractC0755dArr.length;
            int i3 = 0;
            dVarArr = dVarArr;
            while (i3 < length2) {
                AbstractC0755d abstractC0755d = abstractC0755dArr[i3];
                if (abstractC0755d != null && (c0536h = (c0683h = (C0683H) abstractC0755d).f6297b) != null && r(c0683h) >= 0) {
                    int length3 = dVarArr.length;
                    dVarArr = dVarArr;
                    if (length >= length3) {
                        ?? copyOf = Arrays.copyOf(dVarArr, Math.max(2, dVarArr.length * 2));
                        Z1.i.e(copyOf, "copyOf(...)");
                        dVarArr = copyOf;
                    }
                    dVarArr[length] = c0536h;
                    c0683h.f6297b = null;
                    length++;
                }
                i3++;
                dVarArr = dVarArr;
            }
        }
        return dVarArr;
    }

    public final long o() {
        return Math.min(this.f6290m, this.f6289l);
    }

    public final Object[] p(Object[] objArr, int i3, int i4) {
        if (i4 <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] objArr2 = new Object[i4];
        this.f6288k = objArr2;
        if (objArr == null) {
            return objArr2;
        }
        long o3 = o();
        for (int i5 = 0; i5 < i3; i5++) {
            long j3 = i5 + o3;
            AbstractC0682G.d(objArr2, j3, objArr[((int) j3) & (objArr.length - 1)]);
        }
        return objArr2;
    }

    public final boolean q(Object obj) {
        int i3 = this.f6695e;
        int i4 = this.f6285h;
        if (i3 == 0) {
            if (i4 != 0) {
                m(obj);
                int i5 = this.f6291n + 1;
                this.f6291n = i5;
                if (i5 > i4) {
                    l();
                }
                this.f6290m = o() + this.f6291n;
            }
            return true;
        }
        int i6 = this.f6291n;
        int i7 = this.f6286i;
        if (i6 >= i7 && this.f6290m <= this.f6289l) {
            int ordinal = this.f6287j.ordinal();
            if (ordinal == 0) {
                return false;
            }
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return true;
                }
                throw new L1.f();
            }
        }
        m(obj);
        int i8 = this.f6291n + 1;
        this.f6291n = i8;
        if (i8 > i7) {
            l();
        }
        long o3 = o() + this.f6291n;
        long j3 = this.f6289l;
        if (((int) (o3 - j3)) > i4) {
            t(j3 + 1, this.f6290m, o() + this.f6291n, o() + this.f6291n + this.f6292o);
        }
        return true;
    }

    public final long r(C0683H c0683h) {
        long j3 = c0683h.f6296a;
        if (j3 < o() + this.f6291n) {
            return j3;
        }
        if (this.f6286i <= 0 && j3 <= o() && this.f6292o != 0) {
            return j3;
        }
        return -1L;
    }

    public final Object s(C0683H c0683h) {
        Object obj;
        P1.d[] dVarArr = AbstractC0754c.f6698a;
        synchronized (this) {
            try {
                long r3 = r(c0683h);
                if (r3 < 0) {
                    obj = AbstractC0682G.f6293a;
                } else {
                    long j3 = c0683h.f6296a;
                    Object[] objArr = this.f6288k;
                    Z1.i.c(objArr);
                    Object obj2 = objArr[((int) r3) & (objArr.length - 1)];
                    if (obj2 instanceof C0679D) {
                        obj2 = ((C0679D) obj2).f6276f;
                    }
                    c0683h.f6296a = r3 + 1;
                    Object obj3 = obj2;
                    dVarArr = u(j3);
                    obj = obj3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (P1.d dVar : dVarArr) {
            if (dVar != null) {
                dVar.resumeWith(L1.z.f2729a);
            }
        }
        return obj;
    }

    public final void t(long j3, long j4, long j5, long j6) {
        long min = Math.min(j4, j3);
        for (long o3 = o(); o3 < min; o3++) {
            Object[] objArr = this.f6288k;
            Z1.i.c(objArr);
            AbstractC0682G.d(objArr, o3, null);
        }
        this.f6289l = j3;
        this.f6290m = j4;
        this.f6291n = (int) (j5 - min);
        this.f6292o = (int) (j6 - j5);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final P1.d[] u(long j3) {
        long j4;
        long j5;
        P1.d[] dVarArr;
        long max;
        Object[] objArr;
        long j6;
        AbstractC0755d[] abstractC0755dArr;
        long j7 = this.f6290m;
        P1.d[] dVarArr2 = AbstractC0754c.f6698a;
        if (j3 > j7) {
            return dVarArr2;
        }
        long o3 = o();
        long j8 = this.f6291n + o3;
        int i3 = this.f6286i;
        if (i3 == 0 && this.f6292o > 0) {
            j8++;
        }
        if (this.f6695e != 0 && (abstractC0755dArr = this.f6694d) != null) {
            for (AbstractC0755d abstractC0755d : abstractC0755dArr) {
                if (abstractC0755d != null) {
                    long j9 = ((C0683H) abstractC0755d).f6296a;
                    if (j9 >= 0 && j9 < j8) {
                        j8 = j9;
                    }
                }
            }
        }
        if (j8 <= this.f6290m) {
            return dVarArr2;
        }
        long o4 = o() + this.f6291n;
        int min = this.f6695e > 0 ? Math.min(this.f6292o, i3 - ((int) (o4 - j8))) : this.f6292o;
        long j10 = this.f6292o + o4;
        j1.p pVar = AbstractC0682G.f6293a;
        if (min > 0) {
            dVarArr2 = new P1.d[min];
            Object[] objArr2 = this.f6288k;
            Z1.i.c(objArr2);
            j4 = j8;
            long j11 = o4;
            long j12 = j11;
            int i4 = 0;
            while (j12 < j10) {
                j5 = j10;
                Object obj = objArr2[((int) j12) & (objArr2.length - 1)];
                if (obj != pVar) {
                    Z1.i.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                    C0679D c0679d = (C0679D) obj;
                    int i5 = i4 + 1;
                    dVarArr2[i4] = c0679d.f6277g;
                    AbstractC0682G.d(objArr2, j12, pVar);
                    AbstractC0682G.d(objArr2, j11, c0679d.f6276f);
                    j6 = 1;
                    o4 = j11 + 1;
                    if (i5 < min) {
                        j11 = o4;
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
            o4 = j11;
            int i6 = (int) (o4 - o3);
            long j13 = this.f6695e != 0 ? o4 : j4;
            max = Math.max(this.f6289l, o4 - Math.min(this.f6285h, i6));
            if (i3 == 0 && max < j5) {
                objArr = this.f6288k;
                Z1.i.c(objArr);
                if (Z1.i.a(objArr[((int) max) & (objArr.length - 1)], pVar)) {
                    o4++;
                    max++;
                }
            }
            t(max, j13, o4, j5);
            j();
            return dVarArr.length != 0 ? dVarArr : n(dVarArr);
        }
        j4 = j8;
        j5 = j10;
        dVarArr = dVarArr2;
        int i62 = (int) (o4 - o3);
        if (this.f6695e != 0) {
        }
        max = Math.max(this.f6289l, o4 - Math.min(this.f6285h, i62));
        if (i3 == 0) {
            objArr = this.f6288k;
            Z1.i.c(objArr);
            if (Z1.i.a(objArr[((int) max) & (objArr.length - 1)], pVar)) {
            }
        }
        t(max, j13, o4, j5);
        j();
        if (dVarArr.length != 0) {
        }
    }
}
