package Z2;

import W2.C0283e;
import W2.C0286h;
import W2.C0299v;
import W2.InterfaceC0280c0;
import a3.AbstractC0424b;
import a3.AbstractC0425c;
import a3.AbstractC0426d;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import y2.AbstractC1341p;
import y2.AbstractC1343r;
import y2.C1338m;

/* loaded from: classes.dex */
public class G extends AbstractC0424b implements y, InterfaceC0330f, a3.q {

    /* renamed from: k, reason: collision with root package name */
    public final int f4624k;

    /* renamed from: l, reason: collision with root package name */
    public final int f4625l;

    /* renamed from: m, reason: collision with root package name */
    public final Y2.a f4626m;

    /* renamed from: n, reason: collision with root package name */
    public Object[] f4627n;

    /* renamed from: o, reason: collision with root package name */
    public long f4628o;

    /* renamed from: p, reason: collision with root package name */
    public long f4629p;

    /* renamed from: q, reason: collision with root package name */
    public int f4630q;

    /* renamed from: r, reason: collision with root package name */
    public int f4631r;

    public G(int i2, int i4, Y2.a aVar) {
        this.f4624k = i2;
        this.f4625l = i4;
        this.f4626m = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0082 A[Catch: all -> 0x0038, TryCatch #1 {all -> 0x0038, blocks: (B:14:0x0031, B:18:0x007a, B:20:0x0082, B:28:0x0095, B:31:0x009c, B:32:0x00a0, B:34:0x00a1, B:40:0x004b), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0093 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r5v1, types: [a3.b] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [Z2.G] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r9v0, types: [Z2.g] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v2, types: [a3.d] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [Z2.I] */
    /* JADX WARN: Type inference failed for: r9v8, types: [Z2.I] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00af -> B:15:0x0034). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m(G g4, InterfaceC0331g interfaceC0331g, C2.a aVar) {
        F f4;
        D2.a aVar2;
        int i2;
        ?? r5;
        InterfaceC0331g interfaceC0331g2;
        InterfaceC0280c0 interfaceC0280c0;
        InterfaceC0280c0 interfaceC0280c02;
        InterfaceC0331g interfaceC0331g3;
        Object u4;
        I i4;
        try {
            try {
                if (aVar instanceof F) {
                    f4 = (F) aVar;
                    int i5 = f4.f4623p;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        f4.f4623p = i5 - Integer.MIN_VALUE;
                        Object obj = f4.f4621n;
                        aVar2 = D2.a.f2163d;
                        i2 = f4.f4623p;
                        if (i2 != 0) {
                            AbstractC1343r.b(obj);
                            interfaceC0331g2 = interfaceC0331g;
                            interfaceC0331g = (I) g4.f();
                        } else {
                            if (i2 != 1) {
                                if (i2 == 2) {
                                    interfaceC0280c02 = f4.f4620m;
                                    I i6 = f4.f4619l;
                                    interfaceC0331g3 = f4.f4618k;
                                    G g5 = f4.f4617j;
                                    AbstractC1343r.b(obj);
                                    r5 = g5;
                                    interfaceC0331g = i6;
                                    do {
                                        u4 = r5.u(interfaceC0331g);
                                        if (u4 == H.f4632a) {
                                        }
                                    } while (r5.k(interfaceC0331g, f4) != aVar2);
                                    return;
                                }
                                if (i2 != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                interfaceC0280c02 = f4.f4620m;
                                I i7 = f4.f4619l;
                                interfaceC0331g3 = f4.f4618k;
                                G g6 = f4.f4617j;
                                AbstractC1343r.b(obj);
                                G g7 = g6;
                                I i8 = i7;
                                interfaceC0331g2 = interfaceC0331g3;
                                interfaceC0280c0 = interfaceC0280c02;
                                g4 = g7;
                                i4 = i8;
                                r5 = g4;
                                interfaceC0280c02 = interfaceC0280c0;
                                interfaceC0331g3 = interfaceC0331g2;
                                interfaceC0331g = i4;
                                do {
                                    u4 = r5.u(interfaceC0331g);
                                    if (u4 == H.f4632a) {
                                        if (interfaceC0280c02 != null && !interfaceC0280c02.b()) {
                                            throw interfaceC0280c02.g();
                                        }
                                        f4.f4617j = r5;
                                        f4.f4618k = interfaceC0331g3;
                                        f4.f4619l = interfaceC0331g;
                                        f4.f4620m = interfaceC0280c02;
                                        f4.f4623p = 3;
                                        g7 = r5;
                                        i8 = interfaceC0331g;
                                        if (interfaceC0331g3.d(u4, f4) == aVar2) {
                                            return;
                                        }
                                        interfaceC0331g2 = interfaceC0331g3;
                                        interfaceC0280c0 = interfaceC0280c02;
                                        g4 = g7;
                                        i4 = i8;
                                        r5 = g4;
                                        interfaceC0280c02 = interfaceC0280c0;
                                        interfaceC0331g3 = interfaceC0331g2;
                                        interfaceC0331g = i4;
                                        u4 = r5.u(interfaceC0331g);
                                        if (u4 == H.f4632a) {
                                            f4.f4617j = r5;
                                            f4.f4618k = interfaceC0331g3;
                                            f4.f4619l = interfaceC0331g;
                                            f4.f4620m = interfaceC0280c02;
                                            f4.f4623p = 2;
                                        }
                                    }
                                } while (r5.k(interfaceC0331g, f4) != aVar2);
                                return;
                            }
                            interfaceC0331g = f4.f4619l;
                            InterfaceC0331g interfaceC0331g4 = f4.f4618k;
                            G g8 = f4.f4617j;
                            try {
                                AbstractC1343r.b(obj);
                                interfaceC0331g2 = interfaceC0331g4;
                                g4 = g8;
                                interfaceC0331g = interfaceC0331g;
                            } catch (Throwable th) {
                                th = th;
                                r5 = g8;
                                r5.i(interfaceC0331g);
                                throw th;
                            }
                        }
                        CoroutineContext coroutineContext = f4.f2311e;
                        Intrinsics.c(coroutineContext);
                        interfaceC0280c0 = (InterfaceC0280c0) coroutineContext.k(C0299v.f4296e);
                        i4 = interfaceC0331g;
                        r5 = g4;
                        interfaceC0280c02 = interfaceC0280c0;
                        interfaceC0331g3 = interfaceC0331g2;
                        interfaceC0331g = i4;
                        do {
                            u4 = r5.u(interfaceC0331g);
                            if (u4 == H.f4632a) {
                            }
                        } while (r5.k(interfaceC0331g, f4) != aVar2);
                        return;
                    }
                }
                CoroutineContext coroutineContext2 = f4.f2311e;
                Intrinsics.c(coroutineContext2);
                interfaceC0280c0 = (InterfaceC0280c0) coroutineContext2.k(C0299v.f4296e);
                i4 = interfaceC0331g;
                r5 = g4;
                interfaceC0280c02 = interfaceC0280c0;
                interfaceC0331g3 = interfaceC0331g2;
                interfaceC0331g = i4;
                do {
                    u4 = r5.u(interfaceC0331g);
                    if (u4 == H.f4632a) {
                    }
                } while (r5.k(interfaceC0331g, f4) != aVar2);
                return;
            } catch (Throwable th2) {
                r5 = g4;
                th = th2;
                r5.i(interfaceC0331g);
                throw th;
            }
            if (i2 != 0) {
            }
        } catch (Throwable th3) {
            th = th3;
        }
        f4 = new F(g4, aVar);
        Object obj2 = f4.f4621n;
        aVar2 = D2.a.f2163d;
        i2 = f4.f4623p;
    }

    @Override // Z2.y
    public final void a() {
        synchronized (this) {
            v(q() + this.f4630q, this.f4629p, q() + this.f4630q, q() + this.f4630q + this.f4631r);
            Unit unit = Unit.f7487a;
        }
    }

    @Override // Z2.y
    public final boolean b(Object obj) {
        int i2;
        boolean z4;
        C2.a[] aVarArr = AbstractC0425c.f4946a;
        synchronized (this) {
            if (s(obj)) {
                aVarArr = p(aVarArr);
                z4 = true;
            } else {
                z4 = false;
            }
        }
        for (C2.a aVar : aVarArr) {
            if (aVar != null) {
                AbstractC1341p.a aVar2 = AbstractC1341p.f11673d;
                aVar.u(Unit.f7487a);
            }
        }
        return z4;
    }

    @Override // a3.q
    public final InterfaceC0330f c(CoroutineContext coroutineContext, int i2, Y2.a aVar) {
        return H.l(this, coroutineContext, i2, aVar);
    }

    @Override // Z2.InterfaceC0331g
    public final Object d(Object obj, C2.a frame) {
        C2.a[] aVarArr;
        E e4;
        if (b(obj)) {
            return Unit.f7487a;
        }
        C0286h c0286h = new C0286h(1, D2.f.b(frame));
        c0286h.s();
        C2.a[] aVarArr2 = AbstractC0425c.f4946a;
        synchronized (this) {
            try {
                if (s(obj)) {
                    AbstractC1341p.a aVar = AbstractC1341p.f11673d;
                    c0286h.u(Unit.f7487a);
                    aVarArr = p(aVarArr2);
                    e4 = null;
                } else {
                    E e5 = new E(this, this.f4630q + this.f4631r + q(), obj, c0286h);
                    o(e5);
                    this.f4631r++;
                    if (this.f4625l == 0) {
                        aVarArr2 = p(aVarArr2);
                    }
                    aVarArr = aVarArr2;
                    e4 = e5;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (e4 != null) {
            c0286h.w(new C0283e(2, e4));
        }
        for (C2.a aVar2 : aVarArr) {
            if (aVar2 != null) {
                AbstractC1341p.a aVar3 = AbstractC1341p.f11673d;
                aVar2.u(Unit.f7487a);
            }
        }
        Object r2 = c0286h.r();
        D2.a aVar4 = D2.a.f2163d;
        if (r2 == aVar4) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        if (r2 != aVar4) {
            r2 = Unit.f7487a;
        }
        return r2 == aVar4 ? r2 : Unit.f7487a;
    }

    @Override // Z2.InterfaceC0330f
    public final Object e(InterfaceC0331g interfaceC0331g, C2.a aVar) {
        m(this, interfaceC0331g, aVar);
        return D2.a.f2163d;
    }

    @Override // a3.AbstractC0424b
    public final AbstractC0426d g() {
        I i2 = new I();
        i2.f4635a = -1L;
        return i2;
    }

    @Override // a3.AbstractC0424b
    public final AbstractC0426d[] h() {
        return new I[2];
    }

    public final Object k(I i2, F frame) {
        C0286h c0286h = new C0286h(1, D2.f.b(frame));
        c0286h.s();
        synchronized (this) {
            if (t(i2) < 0) {
                i2.f4636b = c0286h;
            } else {
                AbstractC1341p.a aVar = AbstractC1341p.f11673d;
                c0286h.u(Unit.f7487a);
            }
            Unit unit = Unit.f7487a;
        }
        Object r2 = c0286h.r();
        D2.a aVar2 = D2.a.f2163d;
        if (r2 == aVar2) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return r2 == aVar2 ? r2 : Unit.f7487a;
    }

    public final void l() {
        if (this.f4625l != 0 || this.f4631r > 1) {
            Object[] objArr = this.f4627n;
            Intrinsics.c(objArr);
            while (this.f4631r > 0) {
                long q2 = q();
                int i2 = this.f4630q;
                int i4 = this.f4631r;
                if (objArr[((int) ((q2 + (i2 + i4)) - 1)) & (objArr.length - 1)] != H.f4632a) {
                    return;
                }
                this.f4631r = i4 - 1;
                H.e(objArr, q() + this.f4630q + this.f4631r, null);
            }
        }
    }

    public final void n() {
        AbstractC0426d[] abstractC0426dArr;
        Object[] objArr = this.f4627n;
        Intrinsics.c(objArr);
        H.e(objArr, q(), null);
        this.f4630q--;
        long q2 = q() + 1;
        if (this.f4628o < q2) {
            this.f4628o = q2;
        }
        if (this.f4629p < q2) {
            if (this.f4943e != 0 && (abstractC0426dArr = this.f4942d) != null) {
                for (AbstractC0426d abstractC0426d : abstractC0426dArr) {
                    if (abstractC0426d != null) {
                        I i2 = (I) abstractC0426d;
                        long j4 = i2.f4635a;
                        if (j4 >= 0 && j4 < q2) {
                            i2.f4635a = q2;
                        }
                    }
                }
            }
            this.f4629p = q2;
        }
    }

    public final void o(Object obj) {
        int i2 = this.f4630q + this.f4631r;
        Object[] objArr = this.f4627n;
        if (objArr == null) {
            objArr = r(null, 0, 2);
        } else if (i2 >= objArr.length) {
            objArr = r(objArr, i2, objArr.length * 2);
        }
        H.e(objArr, q() + i2, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object, java.lang.Object[]] */
    public final C2.a[] p(C2.a[] aVarArr) {
        AbstractC0426d[] abstractC0426dArr;
        I i2;
        C0286h c0286h;
        int length = aVarArr.length;
        if (this.f4943e != 0 && (abstractC0426dArr = this.f4942d) != null) {
            int length2 = abstractC0426dArr.length;
            int i4 = 0;
            aVarArr = aVarArr;
            while (i4 < length2) {
                AbstractC0426d abstractC0426d = abstractC0426dArr[i4];
                if (abstractC0426d != null && (c0286h = (i2 = (I) abstractC0426d).f4636b) != null && t(i2) >= 0) {
                    int length3 = aVarArr.length;
                    aVarArr = aVarArr;
                    if (length >= length3) {
                        ?? copyOf = Arrays.copyOf(aVarArr, Math.max(2, aVarArr.length * 2));
                        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
                        aVarArr = copyOf;
                    }
                    aVarArr[length] = c0286h;
                    i2.f4636b = null;
                    length++;
                }
                i4++;
                aVarArr = aVarArr;
            }
        }
        return aVarArr;
    }

    public final long q() {
        return Math.min(this.f4629p, this.f4628o);
    }

    public final Object[] r(Object[] objArr, int i2, int i4) {
        if (i4 <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] objArr2 = new Object[i4];
        this.f4627n = objArr2;
        if (objArr == null) {
            return objArr2;
        }
        long q2 = q();
        for (int i5 = 0; i5 < i2; i5++) {
            long j4 = i5 + q2;
            H.e(objArr2, j4, objArr[((int) j4) & (objArr.length - 1)]);
        }
        return objArr2;
    }

    public final boolean s(Object obj) {
        int i2 = this.f4943e;
        int i4 = this.f4624k;
        if (i2 == 0) {
            if (i4 != 0) {
                o(obj);
                int i5 = this.f4630q + 1;
                this.f4630q = i5;
                if (i5 > i4) {
                    n();
                }
                this.f4629p = q() + this.f4630q;
            }
            return true;
        }
        int i6 = this.f4630q;
        int i7 = this.f4625l;
        if (i6 >= i7 && this.f4629p <= this.f4628o) {
            int ordinal = this.f4626m.ordinal();
            if (ordinal == 0) {
                return false;
            }
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return true;
                }
                throw new C1338m();
            }
        }
        o(obj);
        int i8 = this.f4630q + 1;
        this.f4630q = i8;
        if (i8 > i7) {
            n();
        }
        long q2 = q() + this.f4630q;
        long j4 = this.f4628o;
        if (((int) (q2 - j4)) > i4) {
            v(j4 + 1, this.f4629p, q() + this.f4630q, q() + this.f4630q + this.f4631r);
        }
        return true;
    }

    public final long t(I i2) {
        long j4 = i2.f4635a;
        if (j4 < q() + this.f4630q) {
            return j4;
        }
        if (this.f4625l <= 0 && j4 <= q() && this.f4631r != 0) {
            return j4;
        }
        return -1L;
    }

    public final Object u(I i2) {
        Object obj;
        C2.a[] aVarArr = AbstractC0425c.f4946a;
        synchronized (this) {
            try {
                long t4 = t(i2);
                if (t4 < 0) {
                    obj = H.f4632a;
                } else {
                    long j4 = i2.f4635a;
                    Object[] objArr = this.f4627n;
                    Intrinsics.c(objArr);
                    Object obj2 = objArr[((int) t4) & (objArr.length - 1)];
                    if (obj2 instanceof E) {
                        obj2 = ((E) obj2).f4615i;
                    }
                    i2.f4635a = t4 + 1;
                    Object obj3 = obj2;
                    aVarArr = w(j4);
                    obj = obj3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (C2.a aVar : aVarArr) {
            if (aVar != null) {
                AbstractC1341p.a aVar2 = AbstractC1341p.f11673d;
                aVar.u(Unit.f7487a);
            }
        }
        return obj;
    }

    public final void v(long j4, long j5, long j6, long j7) {
        long min = Math.min(j5, j4);
        for (long q2 = q(); q2 < min; q2++) {
            Object[] objArr = this.f4627n;
            Intrinsics.c(objArr);
            H.e(objArr, q2, null);
        }
        this.f4628o = j4;
        this.f4629p = j5;
        this.f4630q = (int) (j6 - min);
        this.f4631r = (int) (j7 - j6);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C2.a[] w(long j4) {
        long j5;
        long j6;
        C2.a[] aVarArr;
        long max;
        Object[] objArr;
        long j7;
        AbstractC0426d[] abstractC0426dArr;
        long j8 = this.f4629p;
        C2.a[] aVarArr2 = AbstractC0425c.f4946a;
        if (j4 > j8) {
            return aVarArr2;
        }
        long q2 = q();
        long j9 = this.f4630q + q2;
        int i2 = this.f4625l;
        if (i2 == 0 && this.f4631r > 0) {
            j9++;
        }
        if (this.f4943e != 0 && (abstractC0426dArr = this.f4942d) != null) {
            for (AbstractC0426d abstractC0426d : abstractC0426dArr) {
                if (abstractC0426d != null) {
                    long j10 = ((I) abstractC0426d).f4635a;
                    if (j10 >= 0 && j10 < j9) {
                        j9 = j10;
                    }
                }
            }
        }
        if (j9 <= this.f4629p) {
            return aVarArr2;
        }
        long q4 = q() + this.f4630q;
        int min = this.f4943e > 0 ? Math.min(this.f4631r, i2 - ((int) (q4 - j9))) : this.f4631r;
        long j11 = this.f4631r + q4;
        b3.t tVar = H.f4632a;
        if (min > 0) {
            aVarArr2 = new C2.a[min];
            Object[] objArr2 = this.f4627n;
            Intrinsics.c(objArr2);
            j5 = j9;
            long j12 = q4;
            long j13 = j12;
            int i4 = 0;
            while (j13 < j11) {
                j6 = j11;
                Object obj = objArr2[((int) j13) & (objArr2.length - 1)];
                if (obj != tVar) {
                    Intrinsics.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                    E e4 = (E) obj;
                    int i5 = i4 + 1;
                    aVarArr2[i4] = e4.f4616j;
                    H.e(objArr2, j13, tVar);
                    H.e(objArr2, j12, e4.f4615i);
                    j7 = 1;
                    q4 = j12 + 1;
                    if (i5 < min) {
                        j12 = q4;
                        i4 = i5;
                    }
                } else {
                    j7 = 1;
                }
                j13 += j7;
                j11 = j6;
            }
            j6 = j11;
            aVarArr = aVarArr2;
            q4 = j12;
            int i6 = (int) (q4 - q2);
            long j14 = this.f4943e != 0 ? q4 : j5;
            max = Math.max(this.f4628o, q4 - Math.min(this.f4624k, i6));
            if (i2 == 0 && max < j6) {
                objArr = this.f4627n;
                Intrinsics.c(objArr);
                if (Intrinsics.a(objArr[((int) max) & (objArr.length - 1)], tVar)) {
                    q4++;
                    max++;
                }
            }
            v(max, j14, q4, j6);
            l();
            return aVarArr.length != 0 ? aVarArr : p(aVarArr);
        }
        j5 = j9;
        j6 = j11;
        aVarArr = aVarArr2;
        int i62 = (int) (q4 - q2);
        if (this.f4943e != 0) {
        }
        max = Math.max(this.f4628o, q4 - Math.min(this.f4624k, i62));
        if (i2 == 0) {
            objArr = this.f4627n;
            Intrinsics.c(objArr);
            if (Intrinsics.a(objArr[((int) max) & (objArr.length - 1)], tVar)) {
            }
        }
        v(max, j14, q4, j6);
        l();
        if (aVarArr.length != 0) {
        }
    }
}
