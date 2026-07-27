package Q;

import A.C0016l;
import B1.C0097d;
import G.C0194e;
import G.b1;
import i.C0661B;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import z2.C1405I;
import z2.C1436t;

/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final C0097d f3877a = new C0097d(1);

    /* renamed from: b, reason: collision with root package name */
    public static final Object f3878b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static o f3879c;

    /* renamed from: d, reason: collision with root package name */
    public static int f3880d;

    /* renamed from: e, reason: collision with root package name */
    public static final m f3881e;

    /* renamed from: f, reason: collision with root package name */
    public static final C0016l f3882f;

    /* renamed from: g, reason: collision with root package name */
    public static Object f3883g;

    /* renamed from: h, reason: collision with root package name */
    public static Object f3884h;

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicReference f3885i;

    /* renamed from: j, reason: collision with root package name */
    public static final AbstractC0274j f3886j;

    /* renamed from: k, reason: collision with root package name */
    public static final C0194e f3887k;

    static {
        o oVar = o.f3869k;
        f3879c = oVar;
        f3880d = 2;
        m mVar = new m();
        mVar.f3860c = new int[16];
        mVar.f3861d = new int[16];
        int[] iArr = new int[16];
        int i2 = 0;
        while (i2 < 16) {
            int i4 = i2 + 1;
            iArr[i2] = i4;
            i2 = i4;
        }
        mVar.f3862e = iArr;
        f3881e = mVar;
        C0016l c0016l = new C0016l(1);
        c0016l.f164c = new int[16];
        c0016l.f165d = new b1[16];
        f3882f = c0016l;
        C1405I c1405i = C1405I.f11931d;
        f3883g = c1405i;
        f3884h = c1405i;
        int i5 = f3880d;
        f3880d = i5 + 1;
        C0268d c0268d = new C0268d(i5, oVar);
        f3879c = f3879c.B(c0268d.f3854b);
        AtomicReference atomicReference = new AtomicReference(c0268d);
        f3885i = atomicReference;
        f3886j = (AbstractC0274j) atomicReference.get();
        f3887k = new C0194e(0);
    }

    public static final void a() {
        f(p.f3874e);
    }

    public static final Function1 b(Function1 function1, Function1 function12) {
        return (function1 == null || function12 == null || function1 == function12) ? function1 == null ? function12 : function1 : new C0266b(function1, function12, 2);
    }

    public static final HashMap c(C0269e c0269e, C0269e c0269e2, o oVar) {
        long[] jArr;
        int i2;
        o oVar2;
        long[] jArr2;
        int i4;
        o oVar3;
        C0661B w4 = c0269e2.w();
        int d4 = c0269e.d();
        if (w4 != null) {
            o w5 = c0269e2.e().B(c0269e2.d()).w(c0269e2.f3841j);
            Object[] objArr = w4.f6885b;
            long[] jArr3 = w4.f6884a;
            int length = jArr3.length - 2;
            if (length < 0) {
                return null;
            }
            int i5 = 0;
            HashMap hashMap = null;
            loop0: while (true) {
                long j4 = jArr3[i5];
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8;
                    int i7 = 8 - ((~(i5 - length)) >>> 31);
                    int i8 = 0;
                    while (i8 < i7) {
                        if ((255 & j4) < 128) {
                            D d5 = (D) objArr[(i5 << 3) + i8];
                            F h4 = d5.h();
                            F s4 = s(h4, d4, oVar);
                            if (s4 == null) {
                                jArr2 = jArr3;
                            } else {
                                jArr2 = jArr3;
                                F s5 = s(h4, d4, w5);
                                if (s5 != null && !s4.equals(s5)) {
                                    i4 = d4;
                                    oVar3 = w5;
                                    F s6 = s(h4, c0269e2.d(), c0269e2.e());
                                    if (s6 == null) {
                                        r();
                                        throw null;
                                    }
                                    F s7 = d5.s(s5, s4, s6);
                                    if (s7 == null) {
                                        break loop0;
                                    }
                                    if (hashMap == null) {
                                        hashMap = new HashMap();
                                    }
                                    hashMap.put(s4, s7);
                                    hashMap = hashMap;
                                }
                            }
                            i4 = d4;
                            oVar3 = w5;
                        } else {
                            jArr2 = jArr3;
                            i4 = d4;
                            oVar3 = w5;
                        }
                        j4 >>= 8;
                        i8++;
                        i6 = 8;
                        jArr3 = jArr2;
                        d4 = i4;
                        w5 = oVar3;
                    }
                    jArr = jArr3;
                    i2 = d4;
                    oVar2 = w5;
                    if (i7 != i6) {
                        break;
                    }
                } else {
                    jArr = jArr3;
                    i2 = d4;
                    oVar2 = w5;
                }
                if (i5 == length) {
                    break;
                }
                i5++;
                jArr3 = jArr;
                d4 = i2;
                w5 = oVar2;
            }
            return hashMap;
        }
        return null;
    }

    public static final void d(AbstractC0274j abstractC0274j) {
        int i2;
        if (f3879c.s(abstractC0274j.d())) {
            return;
        }
        StringBuilder sb = new StringBuilder("Snapshot is not open: id=");
        sb.append(abstractC0274j.d());
        sb.append(", disposed=");
        sb.append(abstractC0274j.f3855c);
        sb.append(", applied=");
        C0269e c0269e = abstractC0274j instanceof C0269e ? (C0269e) abstractC0274j : null;
        sb.append(c0269e != null ? Boolean.valueOf(c0269e.f3844m) : "read-only");
        sb.append(", lowestPin=");
        synchronized (f3878b) {
            m mVar = f3881e;
            i2 = mVar.f3858a > 0 ? ((int[]) mVar.f3860c)[0] : -1;
        }
        sb.append(i2);
        throw new IllegalStateException(sb.toString().toString());
    }

    public static final o e(o oVar, int i2, int i4) {
        while (i2 < i4) {
            oVar = oVar.B(i2);
            i2++;
        }
        return oVar;
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, java.util.List] */
    public static final Object f(Function1 function1) {
        Object obj;
        C0661B c0661b;
        Object v4;
        AbstractC0274j abstractC0274j = f3886j;
        Intrinsics.d(abstractC0274j, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.GlobalSnapshot");
        synchronized (f3878b) {
            try {
                obj = f3885i.get();
                c0661b = ((C0268d) obj).f3839h;
                if (c0661b != null) {
                    f3887k.addAndGet(1);
                }
                v4 = v((AbstractC0274j) obj, function1);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c0661b != null) {
            try {
                ?? r6 = f3883g;
                int size = r6.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((Function2) r6.get(i2)).h(new I.f(c0661b), obj);
                }
            } finally {
                f3887k.addAndGet(-1);
            }
        }
        synchronized (f3878b) {
            try {
                g();
                if (c0661b != null) {
                    Object[] objArr = c0661b.f6885b;
                    long[] jArr = c0661b.f6884a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i4 = 0;
                        while (true) {
                            long j4 = jArr[i4];
                            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i5 = 8 - ((~(i4 - length)) >>> 31);
                                for (int i6 = 0; i6 < i5; i6++) {
                                    if ((255 & j4) < 128) {
                                        q((D) objArr[(i4 << 3) + i6]);
                                    }
                                    j4 >>= 8;
                                }
                                if (i5 != 8) {
                                    break;
                                }
                            }
                            if (i4 == length) {
                                break;
                            }
                            i4++;
                        }
                    }
                    Unit unit = Unit.f7487a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return v4;
    }

    public static final void g() {
        C0016l c0016l = f3882f;
        int i2 = c0016l.f163b;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i4 >= i2) {
                break;
            }
            b1 b1Var = ((b1[]) c0016l.f165d)[i4];
            Object obj = b1Var != null ? b1Var.get() : null;
            if (obj != null && p((D) obj)) {
                if (i5 != i4) {
                    ((b1[]) c0016l.f165d)[i5] = b1Var;
                    int[] iArr = (int[]) c0016l.f164c;
                    iArr[i5] = iArr[i4];
                }
                i5++;
            }
            i4++;
        }
        for (int i6 = i5; i6 < i2; i6++) {
            ((b1[]) c0016l.f165d)[i6] = null;
            ((int[]) c0016l.f164c)[i6] = 0;
        }
        if (i5 != i2) {
            c0016l.f163b = i5;
        }
    }

    public static final AbstractC0274j h(AbstractC0274j abstractC0274j, Function1 function1, boolean z4) {
        boolean z5 = abstractC0274j instanceof C0269e;
        if (z5 || abstractC0274j == null) {
            return new I(z5 ? (C0269e) abstractC0274j : null, function1, null, false, z4);
        }
        return new J(abstractC0274j, function1, z4);
    }

    public static final F i(F f4) {
        F s4;
        AbstractC0274j k4 = k();
        F s5 = s(f4, k4.d(), k4.e());
        if (s5 != null) {
            return s5;
        }
        synchronized (f3878b) {
            AbstractC0274j k5 = k();
            s4 = s(f4, k5.d(), k5.e());
        }
        if (s4 != null) {
            return s4;
        }
        r();
        throw null;
    }

    public static final F j(F f4, AbstractC0274j abstractC0274j) {
        F s4 = s(f4, abstractC0274j.d(), abstractC0274j.e());
        if (s4 != null) {
            return s4;
        }
        r();
        throw null;
    }

    public static final AbstractC0274j k() {
        AbstractC0274j abstractC0274j = (AbstractC0274j) f3877a.j();
        return abstractC0274j == null ? (AbstractC0274j) f3885i.get() : abstractC0274j;
    }

    public static final Function1 l(Function1 function1, Function1 function12, boolean z4) {
        if (!z4) {
            function12 = null;
        }
        return (function1 == null || function12 == null || function1 == function12) ? function1 == null ? function12 : function1 : new C0266b(function1, function12, 1);
    }

    public static final F m(F f4, D d4) {
        F h4 = d4.h();
        int i2 = f3880d;
        m mVar = f3881e;
        if (mVar.f3858a > 0) {
            i2 = ((int[]) mVar.f3860c)[0];
        }
        int i4 = i2 - 1;
        o oVar = o.f3869k;
        F f5 = null;
        F f6 = null;
        while (true) {
            if (h4 != null) {
                int i5 = h4.f3809a;
                if (i5 == 0) {
                    break;
                }
                if (i5 != 0 && i5 <= i4 && !oVar.s(i5)) {
                    if (f6 == null) {
                        f6 = h4;
                    } else if (h4.f3809a >= f6.f3809a) {
                        f5 = f6;
                    }
                }
                h4 = h4.f3810b;
            } else {
                break;
            }
        }
        f5 = h4;
        if (f5 != null) {
            f5.f3809a = Integer.MAX_VALUE;
            return f5;
        }
        F b4 = f4.b();
        b4.f3809a = Integer.MAX_VALUE;
        b4.f3810b = d4.h();
        d4.e(b4);
        return b4;
    }

    public static final void n(AbstractC0274j abstractC0274j, D d4) {
        abstractC0274j.s(abstractC0274j.h() + 1);
        Function1 i2 = abstractC0274j.i();
        if (i2 != null) {
            i2.invoke(d4);
        }
    }

    public static final F o(F f4, E e4, AbstractC0274j abstractC0274j, F f5) {
        F m4;
        if (abstractC0274j.g()) {
            abstractC0274j.n(e4);
        }
        int d4 = abstractC0274j.d();
        if (f5.f3809a == d4) {
            return f5;
        }
        synchronized (f3878b) {
            m4 = m(f4, e4);
        }
        m4.f3809a = d4;
        if (f5.f3809a != 1) {
            abstractC0274j.n(e4);
        }
        return m4;
    }

    public static final boolean p(D d4) {
        F f4;
        int i2 = f3880d;
        m mVar = f3881e;
        if (mVar.f3858a > 0) {
            i2 = ((int[]) mVar.f3860c)[0];
        }
        F f5 = null;
        F f6 = null;
        int i4 = 0;
        for (F h4 = d4.h(); h4 != null; h4 = h4.f3810b) {
            int i5 = h4.f3809a;
            if (i5 != 0) {
                if (i5 >= i2) {
                    i4++;
                } else if (f5 == null) {
                    i4++;
                    f5 = h4;
                } else {
                    if (i5 < f5.f3809a) {
                        f4 = f5;
                        f5 = h4;
                    } else {
                        f4 = h4;
                    }
                    if (f6 == null) {
                        f6 = d4.h();
                        F f7 = f6;
                        while (true) {
                            if (f6 == null) {
                                f6 = f7;
                                break;
                            }
                            int i6 = f6.f3809a;
                            if (i6 >= i2) {
                                break;
                            }
                            if (f7.f3809a < i6) {
                                f7 = f6;
                            }
                            f6 = f6.f3810b;
                        }
                    }
                    f5.f3809a = 0;
                    f5.a(f6);
                    f5 = f4;
                }
            }
        }
        return i4 > 1;
    }

    public static final void q(D d4) {
        if (p(d4)) {
            C0016l c0016l = f3882f;
            int i2 = c0016l.f163b;
            int identityHashCode = System.identityHashCode(d4);
            int i4 = -1;
            if (i2 > 0) {
                int i5 = c0016l.f163b - 1;
                int i6 = 0;
                while (true) {
                    if (i6 > i5) {
                        i4 = -(i6 + 1);
                        break;
                    }
                    int i7 = (i6 + i5) >>> 1;
                    int i8 = ((int[]) c0016l.f164c)[i7];
                    if (i8 < identityHashCode) {
                        i6 = i7 + 1;
                    } else if (i8 > identityHashCode) {
                        i5 = i7 - 1;
                    } else {
                        b1 b1Var = ((b1[]) c0016l.f165d)[i7];
                        if (d4 == (b1Var != null ? b1Var.get() : null)) {
                            i4 = i7;
                        } else {
                            int i9 = i7 - 1;
                            while (-1 < i9 && ((int[]) c0016l.f164c)[i9] == identityHashCode) {
                                b1 b1Var2 = ((b1[]) c0016l.f165d)[i9];
                                if ((b1Var2 != null ? b1Var2.get() : null) == d4) {
                                    break;
                                } else {
                                    i9--;
                                }
                            }
                            int i10 = c0016l.f163b;
                            i9 = i7 + 1;
                            while (true) {
                                if (i9 >= i10) {
                                    i9 = -(c0016l.f163b + 1);
                                    break;
                                } else {
                                    if (((int[]) c0016l.f164c)[i9] != identityHashCode) {
                                        i9 = -(i9 + 1);
                                        break;
                                    }
                                    b1 b1Var3 = ((b1[]) c0016l.f165d)[i9];
                                    if ((b1Var3 != null ? b1Var3.get() : null) == d4) {
                                        break;
                                    } else {
                                        i9++;
                                    }
                                }
                            }
                            i4 = i9;
                        }
                    }
                }
                if (i4 >= 0) {
                    return;
                }
            }
            int i11 = -(i4 + 1);
            b1[] b1VarArr = (b1[]) c0016l.f165d;
            int length = b1VarArr.length;
            if (i2 == length) {
                int i12 = length * 2;
                b1[] b1VarArr2 = new b1[i12];
                int[] iArr = new int[i12];
                int i13 = i11 + 1;
                C1436t.f(b1VarArr, b1VarArr2, i13, i11, i2);
                C1436t.h((b1[]) c0016l.f165d, b1VarArr2, 0, i11, 6);
                C1436t.e((int[]) c0016l.f164c, iArr, i13, i11, i2);
                C1436t.g((int[]) c0016l.f164c, iArr, 0, i11, 6);
                c0016l.f165d = b1VarArr2;
                c0016l.f164c = iArr;
            } else {
                int i14 = i11 + 1;
                C1436t.f(b1VarArr, b1VarArr, i14, i11, i2);
                int[] iArr2 = (int[]) c0016l.f164c;
                C1436t.e(iArr2, iArr2, i14, i11, i2);
            }
            ((b1[]) c0016l.f165d)[i11] = new b1(d4);
            ((int[]) c0016l.f164c)[i11] = identityHashCode;
            c0016l.f163b++;
        }
    }

    public static final void r() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final F s(F f4, int i2, o oVar) {
        F f5 = null;
        while (f4 != null) {
            int i4 = f4.f3809a;
            if (i4 != 0 && i4 <= i2 && !oVar.s(i4) && (f5 == null || f5.f3809a < f4.f3809a)) {
                f5 = f4;
            }
            f4 = f4.f3810b;
        }
        if (f5 != null) {
            return f5;
        }
        return null;
    }

    public static final F t(F f4, D d4) {
        F s4;
        AbstractC0274j k4 = k();
        Function1 f5 = k4.f();
        if (f5 != null) {
            f5.invoke(d4);
        }
        F s5 = s(f4, k4.d(), k4.e());
        if (s5 != null) {
            return s5;
        }
        synchronized (f3878b) {
            AbstractC0274j k5 = k();
            F h4 = d4.h();
            Intrinsics.d(h4, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable$lambda$9");
            s4 = s(h4, k5.d(), k5.e());
            if (s4 == null) {
                r();
                throw null;
            }
        }
        return s4;
    }

    public static final void u(int i2) {
        int i4;
        m mVar = f3881e;
        int i5 = ((int[]) mVar.f3862e)[i2];
        mVar.b(i5, mVar.f3858a - 1);
        mVar.f3858a--;
        int[] iArr = (int[]) mVar.f3860c;
        int i6 = iArr[i5];
        int i7 = i5;
        while (i7 > 0) {
            int i8 = ((i7 + 1) >> 1) - 1;
            if (iArr[i8] <= i6) {
                break;
            }
            mVar.b(i8, i7);
            i7 = i8;
        }
        int[] iArr2 = (int[]) mVar.f3860c;
        int i9 = mVar.f3858a >> 1;
        while (i5 < i9) {
            int i10 = (i5 + 1) << 1;
            int i11 = i10 - 1;
            if (i10 < mVar.f3858a && (i4 = iArr2[i10]) < iArr2[i11]) {
                if (i4 >= iArr2[i5]) {
                    break;
                }
                mVar.b(i10, i5);
                i5 = i10;
            } else {
                if (iArr2[i11] >= iArr2[i5]) {
                    break;
                }
                mVar.b(i11, i5);
                i5 = i11;
            }
        }
        ((int[]) mVar.f3862e)[i2] = mVar.f3859b;
        mVar.f3859b = i2;
    }

    public static final Object v(AbstractC0274j abstractC0274j, Function1 function1) {
        Object invoke = function1.invoke(f3879c.h(abstractC0274j.d()));
        synchronized (f3878b) {
            int i2 = f3880d;
            f3880d = i2 + 1;
            o h4 = f3879c.h(abstractC0274j.d());
            f3879c = h4;
            f3885i.set(new C0268d(i2, h4));
            abstractC0274j.c();
            f3879c = f3879c.B(i2);
            Unit unit = Unit.f7487a;
        }
        return invoke;
    }

    public static final F w(F f4, D d4, AbstractC0274j abstractC0274j) {
        F s4;
        if (abstractC0274j.g()) {
            abstractC0274j.n(d4);
        }
        int d5 = abstractC0274j.d();
        F s5 = s(f4, d5, abstractC0274j.e());
        if (s5 == null) {
            r();
            throw null;
        }
        if (s5.f3809a == abstractC0274j.d()) {
            return s5;
        }
        synchronized (f3878b) {
            s4 = s(d4.h(), d5, abstractC0274j.e());
            if (s4 == null) {
                r();
                throw null;
            }
            if (s4.f3809a != d5) {
                F m4 = m(s4, d4);
                m4.a(s4);
                m4.f3809a = abstractC0274j.d();
                s4 = m4;
            }
        }
        if (s5.f3809a != 1) {
            abstractC0274j.n(d4);
        }
        return s4;
    }
}
