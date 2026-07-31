package J5;

import H5.AbstractC0165z;
import H5.C0147g;
import H5.InterfaceC0146f;
import H5.x0;
import M5.u;
import M5.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import l5.AbstractC0507k;
import o5.InterfaceC0564d;
import p5.EnumC0580a;
import q5.AbstractC0607c;
import u0.AbstractC0676f;
import x5.InterfaceC0743l;

/* loaded from: classes.dex */
public class b implements f {

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f1294g = AtomicLongFieldUpdater.newUpdater(b.class, "sendersAndCloseStatus");

    /* renamed from: h, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f1295h = AtomicLongFieldUpdater.newUpdater(b.class, "receivers");

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f1296i = AtomicLongFieldUpdater.newUpdater(b.class, "bufferEnd");

    /* renamed from: j, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f1297j = AtomicLongFieldUpdater.newUpdater(b.class, "completedExpandBuffersAndPauseFlag");

    /* renamed from: k, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1298k = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "sendSegment");

    /* renamed from: l, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1299l = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "receiveSegment");

    /* renamed from: m, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1300m = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "bufferEndSegment");

    /* renamed from: n, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1301n = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_closeCause");

    /* renamed from: o, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1302o = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "closeHandler");
    private volatile Object _closeCause;
    private volatile long bufferEnd;
    private volatile Object bufferEndSegment;
    private volatile Object closeHandler;
    private volatile long completedExpandBuffersAndPauseFlag;

    /* renamed from: f, reason: collision with root package name */
    public final int f1303f;
    private volatile Object receiveSegment;
    private volatile long receivers;
    private volatile Object sendSegment;
    private volatile long sendersAndCloseStatus;

    public b(int i7) {
        this.f1303f = i7;
        if (i7 < 0) {
            throw new IllegalArgumentException(C1.c.g("Invalid channel capacity: ", i7, ", should be >=0").toString());
        }
        j jVar = d.f1305a;
        this.bufferEnd = i7 != 0 ? i7 != Integer.MAX_VALUE ? i7 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag = f1296i.get(this);
        j jVar2 = new j(0L, null, this, 3);
        this.sendSegment = jVar2;
        this.receiveSegment = jVar2;
        if (v()) {
            jVar2 = d.f1305a;
            kotlin.jvm.internal.i.c(jVar2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment = jVar2;
        this._closeCause = d.f1323s;
    }

    public static boolean A(Object obj) {
        if (!(obj instanceof InterfaceC0146f)) {
            throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
        }
        kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
        InterfaceC0146f interfaceC0146f = (InterfaceC0146f) obj;
        j jVar = d.f1305a;
        v f7 = interfaceC0146f.f(k5.v.f5219a, null);
        if (f7 == null) {
            return false;
        }
        interfaceC0146f.i(f7);
        return true;
    }

    public static final j a(b bVar, long j4, j jVar) {
        Object b7;
        b bVar2;
        j jVar2 = d.f1305a;
        c cVar = c.f1304f;
        loop0: while (true) {
            b7 = M5.a.b(jVar, j4, cVar);
            if (!M5.a.e(b7)) {
                M5.t c7 = M5.a.c(b7);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1298k;
                    M5.t tVar = (M5.t) atomicReferenceFieldUpdater.get(bVar);
                    if (tVar.f1622h >= c7.f1622h) {
                        break loop0;
                    }
                    if (!c7.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(bVar, tVar, c7)) {
                        if (atomicReferenceFieldUpdater.get(bVar) != tVar) {
                            if (c7.e()) {
                                c7.d();
                            }
                        }
                    }
                    if (tVar.e()) {
                        tVar.d();
                    }
                }
            } else {
                break;
            }
        }
        boolean e4 = M5.a.e(b7);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f1295h;
        if (e4) {
            bVar.t();
            if (jVar.f1622h * d.f1306b < atomicLongFieldUpdater.get(bVar)) {
                jVar.a();
                return null;
            }
        } else {
            j jVar3 = (j) M5.a.c(b7);
            long j7 = jVar3.f1622h;
            if (j7 <= j4) {
                return jVar3;
            }
            long j8 = d.f1306b * j7;
            while (true) {
                long j9 = f1294g.get(bVar);
                long j10 = 1152921504606846975L & j9;
                if (j10 >= j8) {
                    bVar2 = bVar;
                    break;
                }
                bVar2 = bVar;
                if (f1294g.compareAndSet(bVar2, j9, (((int) (j9 >> 60)) << 60) + j10)) {
                    break;
                }
                bVar = bVar2;
            }
            if (j7 * d.f1306b < atomicLongFieldUpdater.get(bVar2)) {
                jVar3.a();
            }
        }
        return null;
    }

    public static final void e(b bVar, Object obj, C0147g c0147g) {
        c0147g.resumeWith(AbstractC0676f.f(bVar.p()));
    }

    public static final int f(b bVar, j jVar, int i7, Object obj, long j4, Object obj2, boolean z5) {
        jVar.m(i7, obj);
        if (z5) {
            return bVar.C(jVar, i7, obj, j4, obj2, z5);
        }
        Object k4 = jVar.k(i7);
        if (k4 == null) {
            if (bVar.h(j4)) {
                if (jVar.j(null, i7, d.f1308d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (jVar.j(null, i7, obj2)) {
                    return 2;
                }
            }
        } else if (k4 instanceof x0) {
            jVar.m(i7, null);
            if (bVar.z(k4, obj)) {
                jVar.n(i7, d.f1313i);
                return 0;
            }
            v vVar = d.f1315k;
            if (jVar.f1330k.getAndSet((i7 * 2) + 1, vVar) == vVar) {
                return 5;
            }
            jVar.l(i7, true);
            return 5;
        }
        return bVar.C(jVar, i7, obj, j4, obj2, z5);
    }

    public static void r(b bVar) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f1297j;
        if ((atomicLongFieldUpdater.addAndGet(bVar, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(bVar) & 4611686018427387904L) != 0) {
            }
        }
    }

    public final Object B(j jVar, int i7, long j4, x0 x0Var) {
        AtomicReferenceArray atomicReferenceArray = jVar.f1330k;
        Object k4 = jVar.k(i7);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f1294g;
        if (k4 == null) {
            if (j4 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (x0Var == null) {
                    return d.f1318n;
                }
                if (jVar.j(k4, i7, x0Var)) {
                    l();
                    return d.f1317m;
                }
            }
        } else if (k4 == d.f1308d && jVar.j(k4, i7, d.f1313i)) {
            l();
            Object obj = atomicReferenceArray.get(i7 * 2);
            jVar.m(i7, null);
            return obj;
        }
        while (true) {
            Object k7 = jVar.k(i7);
            if (k7 == null || k7 == d.f1309e) {
                if (j4 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (jVar.j(k7, i7, d.f1312h)) {
                        l();
                        return d.f1319o;
                    }
                } else {
                    if (x0Var == null) {
                        return d.f1318n;
                    }
                    if (jVar.j(k7, i7, x0Var)) {
                        l();
                        return d.f1317m;
                    }
                }
            } else if (k7 != d.f1308d) {
                v vVar = d.f1314j;
                if (k7 == vVar) {
                    return d.f1319o;
                }
                if (k7 == d.f1312h) {
                    return d.f1319o;
                }
                if (k7 == d.f1316l) {
                    l();
                    return d.f1319o;
                }
                if (k7 != d.f1311g && jVar.j(k7, i7, d.f1310f)) {
                    boolean z5 = k7 instanceof t;
                    if (z5) {
                        k7 = ((t) k7).f1339a;
                    }
                    if (A(k7)) {
                        jVar.n(i7, d.f1313i);
                        l();
                        Object obj2 = atomicReferenceArray.get(i7 * 2);
                        jVar.m(i7, null);
                        return obj2;
                    }
                    jVar.n(i7, vVar);
                    jVar.h();
                    if (z5) {
                        l();
                    }
                    return d.f1319o;
                }
            } else if (jVar.j(k7, i7, d.f1313i)) {
                l();
                Object obj3 = atomicReferenceArray.get(i7 * 2);
                jVar.m(i7, null);
                return obj3;
            }
        }
    }

    public final int C(j jVar, int i7, Object obj, long j4, Object obj2, boolean z5) {
        while (true) {
            Object k4 = jVar.k(i7);
            if (k4 == null) {
                if (!h(j4) || z5) {
                    if (z5) {
                        if (jVar.j(null, i7, d.f1314j)) {
                            jVar.h();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (jVar.j(null, i7, obj2)) {
                            return 2;
                        }
                    }
                } else if (jVar.j(null, i7, d.f1308d)) {
                    break;
                }
            } else {
                if (k4 != d.f1309e) {
                    v vVar = d.f1315k;
                    if (k4 == vVar) {
                        jVar.m(i7, null);
                        return 5;
                    }
                    if (k4 == d.f1312h) {
                        jVar.m(i7, null);
                        return 5;
                    }
                    if (k4 == d.f1316l) {
                        jVar.m(i7, null);
                        t();
                        return 4;
                    }
                    jVar.m(i7, null);
                    if (k4 instanceof t) {
                        k4 = ((t) k4).f1339a;
                    }
                    if (z(k4, obj)) {
                        jVar.n(i7, d.f1313i);
                        return 0;
                    }
                    if (jVar.f1330k.getAndSet((i7 * 2) + 1, vVar) != vVar) {
                        jVar.l(i7, true);
                    }
                    return 5;
                }
                if (jVar.j(k4, i7, d.f1308d)) {
                    break;
                }
            }
        }
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0189, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x00c6, code lost:
    
        e(r1, r4, r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0173 A[RETURN] */
    @Override // J5.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(Object obj, AbstractC0607c abstractC0607c) {
        Object q6;
        EnumC0580a enumC0580a;
        Object obj2;
        b bVar;
        j jVar;
        int i7;
        int i8;
        boolean z5;
        b bVar2 = this;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1298k;
        j jVar2 = (j) atomicReferenceFieldUpdater.get(bVar2);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f1294g;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(bVar2);
            long j4 = andIncrement & 1152921504606846975L;
            boolean s6 = bVar2.s(andIncrement, false);
            int i9 = d.f1306b;
            long j7 = i9;
            long j8 = j4 / j7;
            int i10 = (int) (j4 % j7);
            long j9 = jVar2.f1622h;
            k5.v vVar = k5.v.f5219a;
            if (j9 != j8) {
                j a7 = a(bVar2, j8, jVar2);
                if (a7 != null) {
                    jVar2 = a7;
                } else if (s6) {
                    Object x6 = x(obj, abstractC0607c);
                    if (x6 == EnumC0580a.f5697f) {
                        return x6;
                    }
                }
            }
            int f7 = f(bVar2, jVar2, i10, obj, j4, null, s6);
            if (f7 == 0) {
                jVar2.a();
                return vVar;
            }
            if (f7 == 1) {
                break;
            }
            if (f7 != 2) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = f1295h;
                if (f7 == 3) {
                    C0147g h7 = AbstractC0165z.h(AbstractC0676f.m(abstractC0607c));
                    Object obj3 = obj;
                    try {
                        int f8 = f(bVar2, jVar2, i10, obj3, j4, h7, false);
                        try {
                            if (f8 != 0) {
                                if (f8 == 1) {
                                    h7.resumeWith(vVar);
                                } else if (f8 != 2) {
                                    if (f8 != 4) {
                                        String str = "unexpected";
                                        if (f8 != 5) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        jVar2.a();
                                        j jVar3 = (j) atomicReferenceFieldUpdater.get(bVar2);
                                        while (true) {
                                            long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(bVar2);
                                            long j10 = andIncrement2 & 1152921504606846975L;
                                            boolean s7 = bVar2.s(andIncrement2, false);
                                            int i11 = d.f1306b;
                                            AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater;
                                            long j11 = i11;
                                            String str2 = str;
                                            long j12 = j10 / j11;
                                            int i12 = (int) (j10 % j11);
                                            AtomicLongFieldUpdater atomicLongFieldUpdater4 = atomicLongFieldUpdater2;
                                            if (jVar3.f1622h != j12) {
                                                j a8 = a(bVar2, j12, jVar3);
                                                if (a8 != null) {
                                                    i7 = i11;
                                                    i8 = i12;
                                                    z5 = s7;
                                                    jVar = a8;
                                                } else {
                                                    if (s7) {
                                                        break;
                                                    }
                                                    atomicLongFieldUpdater = atomicLongFieldUpdater3;
                                                    str = str2;
                                                    atomicLongFieldUpdater2 = atomicLongFieldUpdater4;
                                                }
                                            } else {
                                                jVar = jVar3;
                                                i7 = i11;
                                                i8 = i12;
                                                z5 = s7;
                                            }
                                            int f9 = f(bVar2, jVar, i8, obj3, j10, h7, z5);
                                            Object obj4 = obj3;
                                            bVar = bVar2;
                                            j jVar4 = jVar;
                                            int i13 = i8;
                                            obj2 = obj4;
                                            if (f9 == 0) {
                                                jVar4.a();
                                                break;
                                            }
                                            if (f9 == 1) {
                                                break;
                                            }
                                            if (f9 != 2) {
                                                if (f9 == 3) {
                                                    throw new IllegalStateException(str2);
                                                }
                                                if (f9 != 4) {
                                                    if (f9 == 5) {
                                                        jVar4.a();
                                                    }
                                                    jVar3 = jVar4;
                                                    bVar2 = bVar;
                                                    atomicLongFieldUpdater = atomicLongFieldUpdater3;
                                                    str = str2;
                                                    atomicLongFieldUpdater2 = atomicLongFieldUpdater4;
                                                    obj3 = obj2;
                                                } else if (j10 < atomicLongFieldUpdater4.get(bVar)) {
                                                    jVar4.a();
                                                }
                                            } else if (z5) {
                                                jVar4.h();
                                            } else {
                                                h7.a(jVar4, i13 + i7);
                                            }
                                        }
                                    } else {
                                        obj2 = obj3;
                                        bVar = bVar2;
                                        if (j4 < atomicLongFieldUpdater2.get(bVar)) {
                                            jVar2.a();
                                        }
                                    }
                                    e(bVar, obj2, h7);
                                } else {
                                    h7.a(jVar2, i10 + i9);
                                }
                                q6 = h7.q();
                                enumC0580a = EnumC0580a.f5697f;
                                if (q6 != enumC0580a) {
                                    q6 = vVar;
                                }
                                if (q6 != enumC0580a) {
                                    return q6;
                                }
                            } else {
                                jVar2.a();
                            }
                            h7.resumeWith(vVar);
                            q6 = h7.q();
                            enumC0580a = EnumC0580a.f5697f;
                            if (q6 != enumC0580a) {
                            }
                            if (q6 != enumC0580a) {
                            }
                        } catch (Throwable th) {
                            th = th;
                            h7.y();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else if (f7 == 4) {
                    if (j4 < atomicLongFieldUpdater2.get(bVar2)) {
                        jVar2.a();
                    }
                    Object x7 = x(obj, abstractC0607c);
                    if (x7 == EnumC0580a.f5697f) {
                        return x7;
                    }
                } else if (f7 == 5) {
                    jVar2.a();
                }
            } else if (s6) {
                jVar2.h();
                Object x8 = x(obj, abstractC0607c);
                if (x8 == EnumC0580a.f5697f) {
                    return x8;
                }
            }
        }
    }

    @Override // J5.r
    public final Object c(InterfaceC0564d interfaceC0564d) {
        j jVar;
        b bVar = this;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1299l;
        j jVar2 = (j) atomicReferenceFieldUpdater.get(bVar);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f1294g;
            if (bVar.s(atomicLongFieldUpdater.get(bVar), true)) {
                Throwable o7 = o();
                int i7 = u.f1623a;
                throw o7;
            }
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f1295h;
            long andIncrement = atomicLongFieldUpdater2.getAndIncrement(bVar);
            long j4 = d.f1306b;
            long j7 = andIncrement / j4;
            int i8 = (int) (andIncrement % j4);
            if (jVar2.f1622h != j7) {
                j m4 = bVar.m(j7, jVar2);
                if (m4 == null) {
                    continue;
                } else {
                    jVar2 = m4;
                }
            }
            Object B3 = bVar.B(jVar2, i8, andIncrement, null);
            v vVar = d.f1317m;
            if (B3 == vVar) {
                throw new IllegalStateException("unexpected");
            }
            v vVar2 = d.f1319o;
            if (B3 != vVar2) {
                if (B3 != d.f1318n) {
                    jVar2.a();
                    return B3;
                }
                C0147g h7 = AbstractC0165z.h(AbstractC0676f.m(interfaceC0564d));
                b bVar2 = this;
                try {
                    Object B4 = bVar2.B(jVar2, i8, andIncrement, h7);
                    if (B4 == vVar) {
                        h7.a(jVar2, i8);
                    } else if (B4 == vVar2) {
                        if (andIncrement < bVar2.q()) {
                            jVar2.a();
                        }
                        j jVar3 = (j) atomicReferenceFieldUpdater.get(bVar2);
                        while (true) {
                            if (bVar2.s(atomicLongFieldUpdater.get(bVar2), true)) {
                                h7.resumeWith(AbstractC0676f.f(bVar2.o()));
                                break;
                            }
                            long andIncrement2 = atomicLongFieldUpdater2.getAndIncrement(bVar2);
                            long j8 = d.f1306b;
                            long j9 = andIncrement2 / j8;
                            int i9 = (int) (andIncrement2 % j8);
                            if (jVar3.f1622h != j9) {
                                jVar = bVar2.m(j9, jVar3);
                                if (jVar == null) {
                                }
                            } else {
                                jVar = jVar3;
                            }
                            Object B6 = bVar2.B(jVar, i9, andIncrement2, h7);
                            if (B6 == d.f1317m) {
                                h7.a(jVar, i9);
                                break;
                            }
                            if (B6 == d.f1319o) {
                                if (andIncrement2 < q()) {
                                    jVar.a();
                                }
                                bVar2 = this;
                                jVar3 = jVar;
                            } else {
                                if (B6 == d.f1318n) {
                                    throw new IllegalStateException("unexpected");
                                }
                                jVar.a();
                                h7.z(B6, null);
                            }
                        }
                    } else {
                        jVar2.a();
                        h7.z(B4, null);
                    }
                    Object q6 = h7.q();
                    EnumC0580a enumC0580a = EnumC0580a.f5697f;
                    return q6;
                } catch (Throwable th) {
                    h7.y();
                    throw th;
                }
            }
            if (andIncrement < q()) {
                jVar2.a();
            }
            bVar = this;
        }
    }

    @Override // J5.r
    public final void d(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        i(cancellationException, true);
    }

    @Override // J5.s
    public Object g(Object obj) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f1294g;
        boolean z5 = false;
        long j4 = 1152921504606846975L;
        boolean z6 = s(atomicLongFieldUpdater.get(this), false) ? false : !h(r1 & 1152921504606846975L);
        h hVar = i.f1328a;
        if (z6) {
            return hVar;
        }
        Object obj2 = d.f1314j;
        j jVar = (j) f1298k.get(this);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j7 = andIncrement & j4;
            boolean s6 = s(andIncrement, z5);
            int i7 = d.f1306b;
            long j8 = i7;
            long j9 = j7 / j8;
            int i8 = (int) (j7 % j8);
            if (jVar.f1622h != j9) {
                j a7 = a(this, j9, jVar);
                if (a7 != null) {
                    jVar = a7;
                } else {
                    if (s6) {
                        return new g(p());
                    }
                    z5 = false;
                    j4 = 1152921504606846975L;
                }
            }
            int f7 = f(this, jVar, i8, obj, j7, obj2, s6);
            k5.v vVar = k5.v.f5219a;
            if (f7 == 0) {
                jVar.a();
                return vVar;
            }
            if (f7 == 1) {
                return vVar;
            }
            if (f7 == 2) {
                if (s6) {
                    jVar.h();
                    return new g(p());
                }
                x0 x0Var = obj2 instanceof x0 ? (x0) obj2 : null;
                if (x0Var != null) {
                    x0Var.a(jVar, i8 + i7);
                }
                jVar.h();
                return hVar;
            }
            if (f7 == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (f7 == 4) {
                if (j7 < f1295h.get(this)) {
                    jVar.a();
                }
                return new g(p());
            }
            if (f7 == 5) {
                jVar.a();
            }
            z5 = false;
            j4 = 1152921504606846975L;
        }
    }

    public final boolean h(long j4) {
        return j4 < f1296i.get(this) || j4 < f1295h.get(this) + ((long) this.f1303f);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003c A[LOOP:2: B:17:0x003c->B:39:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e A[LOOP:3: B:22:0x006e->B:30:?, LOOP_LABEL: LOOP:3: B:22:0x006e->B:30:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004c A[LOOP:5: B:40:0x004c->B:48:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x002f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i(Throwable th, boolean z5) {
        b bVar;
        v vVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        boolean z6;
        long j4;
        long j7;
        long j8;
        Object obj;
        long j9;
        long j10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f1294g;
        if (z5) {
            do {
                j10 = atomicLongFieldUpdater.get(this);
                if (((int) (j10 >> 60)) == 0) {
                    j jVar = d.f1305a;
                    bVar = this;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(bVar, j10, (j10 & 1152921504606846975L) + (1 << 60)));
            vVar = d.f1323s;
            while (true) {
                atomicReferenceFieldUpdater = f1301n;
                if (!atomicReferenceFieldUpdater.compareAndSet(this, vVar, th)) {
                    z6 = true;
                    break;
                }
                if (atomicReferenceFieldUpdater.get(this) != vVar) {
                    z6 = false;
                    break;
                }
            }
            if (z5) {
                do {
                    j4 = atomicLongFieldUpdater.get(this);
                    int i7 = (int) (j4 >> 60);
                    if (i7 == 0) {
                        j7 = j4 & 1152921504606846975L;
                        j8 = 2;
                    } else {
                        if (i7 != 1) {
                            break;
                        }
                        j7 = j4 & 1152921504606846975L;
                        j8 = 3;
                    }
                } while (!atomicLongFieldUpdater.compareAndSet(bVar, j4, (j8 << 60) + j7));
            } else {
                do {
                    j9 = atomicLongFieldUpdater.get(this);
                } while (!atomicLongFieldUpdater.compareAndSet(bVar, j9, (3 << 60) + (j9 & 1152921504606846975L)));
            }
            t();
            if (z6) {
                loop3: while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f1302o;
                    obj = atomicReferenceFieldUpdater2.get(this);
                    v vVar2 = obj == null ? d.f1321q : d.f1322r;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, vVar2)) {
                        if (atomicReferenceFieldUpdater2.get(this) != obj) {
                            break;
                        }
                    }
                }
                if (obj != null) {
                    kotlin.jvm.internal.v.b(1, obj);
                    ((InterfaceC0743l) obj).invoke(n());
                    return z6;
                }
            }
            return z6;
        }
        bVar = this;
        vVar = d.f1323s;
        while (true) {
            atomicReferenceFieldUpdater = f1301n;
            if (!atomicReferenceFieldUpdater.compareAndSet(this, vVar, th)) {
            }
        }
        if (z5) {
        }
        t();
        if (z6) {
        }
        return z6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x008d, code lost:
    
        r1 = (J5.j) ((M5.d) M5.d.f1591g.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final j j(long j4) {
        Object obj;
        long j7;
        Object obj2 = f1300m.get(this);
        j jVar = (j) f1298k.get(this);
        if (jVar.f1622h > ((j) obj2).f1622h) {
            obj2 = jVar;
        }
        j jVar2 = (j) f1299l.get(this);
        if (jVar2.f1622h > ((j) obj2).f1622h) {
            obj2 = jVar2;
        }
        M5.d dVar = (M5.d) obj2;
        loop0: while (true) {
            dVar.getClass();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = M5.d.f1590f;
            Object obj3 = atomicReferenceFieldUpdater.get(dVar);
            v vVar = M5.a.f1583b;
            obj = null;
            if (obj3 == vVar) {
                break;
            }
            M5.d dVar2 = (M5.d) obj3;
            if (dVar2 == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(dVar, null, vVar)) {
                    if (atomicReferenceFieldUpdater.get(dVar) != null) {
                        break;
                    }
                }
                break loop0;
            }
            dVar = dVar2;
        }
        j jVar3 = (j) dVar;
        if (u()) {
            j jVar4 = jVar3;
            loop2: do {
                int i7 = d.f1306b - 1;
                while (true) {
                    if (-1 >= i7) {
                        break;
                    }
                    j7 = (jVar4.f1622h * d.f1306b) + i7;
                    if (j7 < f1295h.get(this)) {
                        break loop2;
                    }
                    while (true) {
                        Object k4 = jVar4.k(i7);
                        if (k4 != null && k4 != d.f1309e) {
                            if (k4 == d.f1308d) {
                                break loop2;
                            }
                        } else {
                            if (jVar4.j(k4, i7, d.f1316l)) {
                                jVar4.h();
                                break;
                            }
                        }
                    }
                    i7--;
                }
            } while (jVar4 != null);
            j7 = -1;
            if (j7 != -1) {
                k(j7);
            }
        }
        loop5: for (j jVar5 = jVar3; jVar5 != null; jVar5 = (j) ((M5.d) M5.d.f1591g.get(jVar5))) {
            for (int i8 = d.f1306b - 1; -1 < i8; i8--) {
                if ((jVar5.f1622h * d.f1306b) + i8 < j4) {
                    break loop5;
                }
                while (true) {
                    Object k7 = jVar5.k(i8);
                    if (k7 != null && k7 != d.f1309e) {
                        if (!(k7 instanceof t)) {
                            if (!(k7 instanceof x0)) {
                                break;
                            }
                            if (jVar5.j(k7, i8, d.f1316l)) {
                                obj = M5.a.f(obj, k7);
                                jVar5.l(i8, true);
                                break;
                            }
                        } else {
                            if (jVar5.j(k7, i8, d.f1316l)) {
                                obj = M5.a.f(obj, ((t) k7).f1339a);
                                jVar5.l(i8, true);
                                break;
                            }
                        }
                    } else {
                        if (jVar5.j(k7, i8, d.f1316l)) {
                            jVar5.h();
                            break;
                        }
                    }
                }
            }
        }
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                y((x0) obj, true);
                return jVar3;
            }
            ArrayList arrayList = (ArrayList) obj;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                y((x0) arrayList.get(size), true);
            }
        }
        return jVar3;
    }

    public final void k(long j4) {
        j jVar = (j) f1299l.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f1295h;
            long j7 = atomicLongFieldUpdater.get(this);
            if (j4 < Math.max(this.f1303f + j7, f1296i.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j7, 1 + j7)) {
                long j8 = d.f1306b;
                long j9 = j7 / j8;
                int i7 = (int) (j7 % j8);
                if (jVar.f1622h != j9) {
                    j m4 = m(j9, jVar);
                    if (m4 != null) {
                        jVar = m4;
                    }
                }
                j jVar2 = jVar;
                if (B(jVar2, i7, j7, null) != d.f1319o) {
                    jVar2.a();
                } else if (j7 < q()) {
                    jVar2.a();
                }
                jVar = jVar2;
            }
        }
    }

    public final void l() {
        Object b7;
        if (v()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1300m;
        j jVar = (j) atomicReferenceFieldUpdater.get(this);
        loop0: while (true) {
            long andIncrement = f1296i.getAndIncrement(this);
            long j4 = andIncrement / d.f1306b;
            if (q() <= andIncrement) {
                if (jVar.f1622h < j4 && jVar.b() != null) {
                    w(j4, jVar);
                }
                r(this);
                return;
            }
            if (jVar.f1622h != j4) {
                c cVar = c.f1304f;
                while (true) {
                    b7 = M5.a.b(jVar, j4, cVar);
                    if (!M5.a.e(b7)) {
                        M5.t c7 = M5.a.c(b7);
                        while (true) {
                            M5.t tVar = (M5.t) atomicReferenceFieldUpdater.get(this);
                            if (tVar.f1622h >= c7.f1622h) {
                                break;
                            }
                            if (!c7.i()) {
                                break;
                            }
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, tVar, c7)) {
                                if (atomicReferenceFieldUpdater.get(this) != tVar) {
                                    if (c7.e()) {
                                        c7.d();
                                    }
                                }
                            }
                            if (tVar.e()) {
                                tVar.d();
                            }
                        }
                    } else {
                        break;
                    }
                }
                j jVar2 = null;
                if (M5.a.e(b7)) {
                    t();
                    w(j4, jVar);
                    r(this);
                } else {
                    j jVar3 = (j) M5.a.c(b7);
                    long j7 = jVar3.f1622h;
                    if (j7 > j4) {
                        long j8 = j7 * d.f1306b;
                        if (f1296i.compareAndSet(this, 1 + andIncrement, j8)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = f1297j;
                            if ((atomicLongFieldUpdater.addAndGet(this, j8 - andIncrement) & 4611686018427387904L) != 0) {
                                while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0) {
                                }
                            }
                        } else {
                            r(this);
                        }
                    } else {
                        jVar2 = jVar3;
                    }
                }
                if (jVar2 == null) {
                    continue;
                } else {
                    jVar = jVar2;
                }
            }
            int i7 = (int) (andIncrement % d.f1306b);
            Object k4 = jVar.k(i7);
            boolean z5 = k4 instanceof x0;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f1295h;
            if (!z5 || andIncrement < atomicLongFieldUpdater2.get(this) || !jVar.j(k4, i7, d.f1311g)) {
                while (true) {
                    Object k7 = jVar.k(i7);
                    if (!(k7 instanceof x0)) {
                        if (k7 != d.f1314j) {
                            if (k7 != null) {
                                if (k7 == d.f1308d || k7 == d.f1312h || k7 == d.f1313i || k7 == d.f1315k || k7 == d.f1316l) {
                                    break loop0;
                                }
                                if (k7 != d.f1310f) {
                                    throw new IllegalStateException(("Unexpected cell state: " + k7).toString());
                                }
                            } else if (jVar.j(k7, i7, d.f1309e)) {
                                break loop0;
                            }
                        } else {
                            break;
                        }
                    } else if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                        if (jVar.j(k7, i7, new t((x0) k7))) {
                            break loop0;
                        }
                    } else if (jVar.j(k7, i7, d.f1311g)) {
                        if (A(k7)) {
                            jVar.n(i7, d.f1308d);
                            break;
                        } else {
                            jVar.n(i7, d.f1314j);
                            jVar.h();
                        }
                    }
                }
            } else if (A(k4)) {
                jVar.n(i7, d.f1308d);
                break;
            } else {
                jVar.n(i7, d.f1314j);
                jVar.h();
                r(this);
            }
        }
        r(this);
    }

    public final j m(long j4, j jVar) {
        Object b7;
        long j7;
        j jVar2 = d.f1305a;
        c cVar = c.f1304f;
        loop0: while (true) {
            b7 = M5.a.b(jVar, j4, cVar);
            if (!M5.a.e(b7)) {
                M5.t c7 = M5.a.c(b7);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1299l;
                    M5.t tVar = (M5.t) atomicReferenceFieldUpdater.get(this);
                    if (tVar.f1622h >= c7.f1622h) {
                        break loop0;
                    }
                    if (!c7.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, tVar, c7)) {
                        if (atomicReferenceFieldUpdater.get(this) != tVar) {
                            if (c7.e()) {
                                c7.d();
                            }
                        }
                    }
                    if (tVar.e()) {
                        tVar.d();
                    }
                }
            } else {
                break;
            }
        }
        if (M5.a.e(b7)) {
            t();
            if (jVar.f1622h * d.f1306b < q()) {
                jVar.a();
                return null;
            }
        } else {
            j jVar3 = (j) M5.a.c(b7);
            long j8 = jVar3.f1622h;
            if (!v() && j4 <= f1296i.get(this) / d.f1306b) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f1300m;
                    M5.t tVar2 = (M5.t) atomicReferenceFieldUpdater2.get(this);
                    if (tVar2.f1622h >= j8 || !jVar3.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, tVar2, jVar3)) {
                        if (atomicReferenceFieldUpdater2.get(this) != tVar2) {
                            if (jVar3.e()) {
                                jVar3.d();
                            }
                        }
                    }
                    if (tVar2.e()) {
                        tVar2.d();
                    }
                }
            }
            if (j8 <= j4) {
                return jVar3;
            }
            long j9 = j8 * d.f1306b;
            do {
                j7 = f1295h.get(this);
                if (j7 >= j9) {
                    break;
                }
            } while (!f1295h.compareAndSet(this, j7, j9));
            if (j8 * d.f1306b < q()) {
                jVar3.a();
            }
        }
        return null;
    }

    public final Throwable n() {
        return (Throwable) f1301n.get(this);
    }

    public final Throwable o() {
        Throwable n7 = n();
        return n7 == null ? new k("Channel was closed") : n7;
    }

    public final Throwable p() {
        Throwable n7 = n();
        return n7 == null ? new l("Channel was closed") : n7;
    }

    public final long q() {
        return f1294g.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x00a2, code lost:
    
        r0 = (J5.j) ((M5.d) M5.d.f1591g.get(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean s(long j4, boolean z5) {
        int i7 = (int) (j4 >> 60);
        if (i7 != 0 && i7 != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f1295h;
            if (i7 == 2) {
                j(1152921504606846975L & j4);
                if (z5) {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1299l;
                        j jVar = (j) atomicReferenceFieldUpdater.get(this);
                        long j7 = atomicLongFieldUpdater.get(this);
                        if (q() <= j7) {
                            break;
                        }
                        long j8 = d.f1306b;
                        long j9 = j7 / j8;
                        if (jVar.f1622h != j9 && (jVar = m(j9, jVar)) == null) {
                            if (((j) atomicReferenceFieldUpdater.get(this)).f1622h < j9) {
                                break;
                            }
                        } else {
                            jVar.a();
                            int i8 = (int) (j7 % j8);
                            while (true) {
                                Object k4 = jVar.k(i8);
                                if (k4 == null || k4 == d.f1309e) {
                                    if (jVar.j(k4, i8, d.f1312h)) {
                                        l();
                                        break;
                                    }
                                } else {
                                    if (k4 == d.f1308d) {
                                        break;
                                    }
                                    if (k4 != d.f1314j) {
                                        if (k4 != d.f1316l) {
                                            if (k4 != d.f1313i) {
                                                if (k4 != d.f1312h) {
                                                    if (k4 == d.f1311g) {
                                                        break;
                                                    }
                                                    if (k4 != d.f1310f && j7 == atomicLongFieldUpdater.get(this)) {
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            f1295h.compareAndSet(this, j7, j7 + 1);
                        }
                    }
                }
            } else {
                if (i7 != 3) {
                    throw new IllegalStateException(W4.o.c("unexpected close status: ", i7).toString());
                }
                j j10 = j(1152921504606846975L & j4);
                Object obj = null;
                loop0: do {
                    int i9 = d.f1306b - 1;
                    while (true) {
                        if (-1 >= i9) {
                            break;
                        }
                        long j11 = (j10.f1622h * d.f1306b) + i9;
                        while (true) {
                            Object k7 = j10.k(i9);
                            if (k7 == d.f1313i) {
                                break loop0;
                            }
                            if (k7 == d.f1308d) {
                                if (j11 < atomicLongFieldUpdater.get(this)) {
                                    break loop0;
                                }
                                if (j10.j(k7, i9, d.f1316l)) {
                                    j10.m(i9, null);
                                    j10.h();
                                    break;
                                }
                            } else if (k7 != d.f1309e && k7 != null) {
                                if (!(k7 instanceof x0) && !(k7 instanceof t)) {
                                    v vVar = d.f1311g;
                                    if (k7 == vVar || k7 == d.f1310f) {
                                        break loop0;
                                    }
                                    if (k7 != vVar) {
                                        break;
                                    }
                                } else {
                                    if (j11 < atomicLongFieldUpdater.get(this)) {
                                        break loop0;
                                    }
                                    x0 x0Var = k7 instanceof t ? ((t) k7).f1339a : (x0) k7;
                                    if (j10.j(k7, i9, d.f1316l)) {
                                        obj = M5.a.f(obj, x0Var);
                                        j10.m(i9, null);
                                        j10.h();
                                        break;
                                    }
                                }
                            } else if (j10.j(k7, i9, d.f1316l)) {
                                j10.h();
                                break;
                            }
                        }
                        i9--;
                    }
                } while (j10 != null);
                if (obj != null) {
                    if (obj instanceof ArrayList) {
                        ArrayList arrayList = (ArrayList) obj;
                        for (int size = arrayList.size() - 1; -1 < size; size--) {
                            y((x0) arrayList.get(size), false);
                        }
                    } else {
                        y((x0) obj, false);
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean t() {
        return s(f1294g.get(this), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:94:0x01aa, code lost:
    
        r16 = r7;
        r3 = (J5.j) r3.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01b3, code lost:
    
        if (r3 != null) goto L88;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        boolean z5;
        String obj;
        StringBuilder sb = new StringBuilder();
        int i7 = (int) (f1294g.get(this) >> 60);
        if (i7 == 2) {
            sb.append("closed,");
        } else if (i7 == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.f1303f + ',');
        sb.append("data=[");
        int i8 = 0;
        boolean z6 = true;
        List z7 = AbstractC0507k.z(f1299l.get(this), f1298k.get(this), f1300m.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : z7) {
            if (((j) obj2) != d.f1305a) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j4 = ((j) next).f1622h;
            do {
                Object next2 = it.next();
                long j7 = ((j) next2).f1622h;
                if (j4 > j7) {
                    next = next2;
                    j4 = j7;
                }
            } while (it.hasNext());
        }
        j jVar = (j) next;
        long j8 = f1295h.get(this);
        long q6 = q();
        loop2: while (true) {
            int i9 = d.f1306b;
            int i10 = i8;
            while (true) {
                if (i10 >= i9) {
                    break;
                }
                long j9 = (jVar.f1622h * d.f1306b) + i10;
                if (j9 >= q6 && j9 >= j8) {
                    break loop2;
                }
                Object k4 = jVar.k(i10);
                boolean z8 = z6;
                Object obj3 = jVar.f1330k.get(i10 * 2);
                if (k4 instanceof InterfaceC0146f) {
                    obj = (j9 >= j8 || j9 < q6) ? (j9 >= q6 || j9 < j8) ? "cont" : "send" : "receive";
                } else if (k4 instanceof t) {
                    obj = "EB(" + k4 + ')';
                } else if (kotlin.jvm.internal.i.a(k4, d.f1310f) ? z8 : kotlin.jvm.internal.i.a(k4, d.f1311g)) {
                    obj = "resuming_sender";
                } else if (k4 == null ? z8 : k4.equals(d.f1309e) ? z8 : kotlin.jvm.internal.i.a(k4, d.f1313i) ? z8 : kotlin.jvm.internal.i.a(k4, d.f1312h) ? z8 : kotlin.jvm.internal.i.a(k4, d.f1315k) ? z8 : kotlin.jvm.internal.i.a(k4, d.f1314j) ? z8 : kotlin.jvm.internal.i.a(k4, d.f1316l)) {
                    i10++;
                    z6 = z8;
                } else {
                    obj = k4.toString();
                }
                if (obj3 != null) {
                    sb.append("(" + obj + ',' + obj3 + "),");
                } else {
                    sb.append(obj + ',');
                }
                i10++;
                z6 = z8;
            }
            z6 = z5;
            i8 = 0;
        }
        if (sb.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        if (sb.charAt(F5.j.O(sb)) == ',') {
            kotlin.jvm.internal.i.d(sb.deleteCharAt(sb.length() - 1), "this.deleteCharAt(index)");
        }
        sb.append("]");
        return sb.toString();
    }

    public boolean u() {
        return false;
    }

    public final boolean v() {
        long j4 = f1296i.get(this);
        return j4 == 0 || j4 == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w(long j4, j jVar) {
        j jVar2;
        j jVar3;
        while (jVar.f1622h < j4 && (jVar3 = (j) jVar.b()) != null) {
            jVar = jVar3;
        }
        while (true) {
            if (!jVar.c() || (jVar2 = (j) jVar.b()) == null) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1300m;
                    M5.t tVar = (M5.t) atomicReferenceFieldUpdater.get(this);
                    if (tVar.f1622h >= jVar.f1622h) {
                        return;
                    }
                    if (!jVar.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, tVar, jVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != tVar) {
                            if (jVar.e()) {
                                jVar.d();
                            }
                        }
                    }
                    if (tVar.e()) {
                        tVar.d();
                        return;
                    }
                    return;
                }
            }
            jVar = jVar2;
        }
    }

    public final Object x(Object obj, AbstractC0607c abstractC0607c) {
        C0147g c0147g = new C0147g(1, AbstractC0676f.m(abstractC0607c));
        c0147g.r();
        c0147g.resumeWith(AbstractC0676f.f(p()));
        Object q6 = c0147g.q();
        return q6 == EnumC0580a.f5697f ? q6 : k5.v.f5219a;
    }

    public final void y(x0 x0Var, boolean z5) {
        if (x0Var instanceof InterfaceC0146f) {
            ((InterfaceC0564d) x0Var).resumeWith(AbstractC0676f.f(z5 ? o() : p()));
            return;
        }
        if (!(x0Var instanceof a)) {
            throw new IllegalStateException(("Unexpected waiter: " + x0Var).toString());
        }
        a aVar = (a) x0Var;
        C0147g c0147g = aVar.f1292g;
        kotlin.jvm.internal.i.b(c0147g);
        aVar.f1292g = null;
        aVar.f1291f = d.f1316l;
        Throwable n7 = aVar.f1293h.n();
        if (n7 == null) {
            c0147g.resumeWith(Boolean.FALSE);
        } else {
            c0147g.resumeWith(AbstractC0676f.f(n7));
        }
    }

    public final boolean z(Object obj, Object obj2) {
        if (!(obj instanceof a)) {
            if (!(obj instanceof InterfaceC0146f)) {
                throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
            }
            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            InterfaceC0146f interfaceC0146f = (InterfaceC0146f) obj;
            j jVar = d.f1305a;
            v f7 = interfaceC0146f.f(obj2, null);
            if (f7 == null) {
                return false;
            }
            interfaceC0146f.i(f7);
            return true;
        }
        kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
        a aVar = (a) obj;
        C0147g c0147g = aVar.f1292g;
        kotlin.jvm.internal.i.b(c0147g);
        aVar.f1292g = null;
        aVar.f1291f = obj2;
        Boolean bool = Boolean.TRUE;
        j jVar2 = d.f1305a;
        v f8 = c0147g.f(bool, null);
        if (f8 == null) {
            return false;
        }
        c0147g.i(f8);
        return true;
    }
}
