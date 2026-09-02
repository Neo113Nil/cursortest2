package z3;

import C3.t;
import C3.v;
import E.AbstractC0005f;
import T.C0098p;
import c3.C0297i;
import com.google.android.gms.internal.play_billing.AbstractC0347t0;
import f3.InterfaceC0425c;
import g3.EnumC0441a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import o3.InterfaceC1339l;
import w3.AbstractC1510g;
import x3.AbstractC1562w;
import x3.C1546f;
import x3.InterfaceC1545e;
import x3.p0;

/* loaded from: classes.dex */
public class c implements g {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f16297b = AtomicLongFieldUpdater.newUpdater(c.class, "sendersAndCloseStatus$volatile");

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f16298c = AtomicLongFieldUpdater.newUpdater(c.class, "receivers$volatile");

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f16299d = AtomicLongFieldUpdater.newUpdater(c.class, "bufferEnd$volatile");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f16300e = AtomicLongFieldUpdater.newUpdater(c.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f16301f = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "sendSegment$volatile");

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f16302g = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "receiveSegment$volatile");

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f16303h = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "bufferEndSegment$volatile");

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f16304i = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_closeCause$volatile");

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f16305j = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "closeHandler$volatile");
    private volatile /* synthetic */ Object _closeCause$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final int f16306a;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    public c(int i4) {
        this.f16306a = i4;
        if (i4 < 0) {
            throw new IllegalArgumentException(AbstractC0005f.k(i4, "Invalid channel capacity: ", ", should be >=0").toString());
        }
        k kVar = e.f16308a;
        this.bufferEnd$volatile = i4 != 0 ? i4 != Integer.MAX_VALUE ? i4 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = f16299d.get(this);
        k kVar2 = new k(0L, null, this, 3);
        this.sendSegment$volatile = kVar2;
        this.receiveSegment$volatile = kVar2;
        if (u()) {
            kVar2 = e.f16308a;
            kotlin.jvm.internal.i.c(kVar2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = kVar2;
        this._closeCause$volatile = e.f16324s;
    }

    public static final k a(c cVar, long j4, k kVar) {
        Object a3;
        c cVar2;
        k kVar2 = e.f16308a;
        d dVar = d.f16307a;
        loop0: while (true) {
            a3 = C3.a.a(kVar, j4, dVar);
            if (!C3.a.d(a3)) {
                t b4 = C3.a.b(a3);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16301f;
                    t tVar = (t) atomicReferenceFieldUpdater.get(cVar);
                    if (tVar.f318c >= b4.f318c) {
                        break loop0;
                    }
                    if (!b4.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(cVar, tVar, b4)) {
                        if (atomicReferenceFieldUpdater.get(cVar) != tVar) {
                            if (b4.e()) {
                                b4.d();
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
        boolean d4 = C3.a.d(a3);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f16298c;
        if (d4) {
            cVar.s();
            if (kVar.f318c * e.f16309b < atomicLongFieldUpdater.get(cVar)) {
                kVar.a();
                return null;
            }
        } else {
            k kVar3 = (k) C3.a.b(a3);
            long j5 = kVar3.f318c;
            if (j5 <= j4) {
                return kVar3;
            }
            long j6 = e.f16309b * j5;
            while (true) {
                long j7 = f16297b.get(cVar);
                long j8 = 1152921504606846975L & j7;
                if (j8 >= j6) {
                    cVar2 = cVar;
                    break;
                }
                cVar2 = cVar;
                if (f16297b.compareAndSet(cVar2, j7, (((int) (j7 >> 60)) << 60) + j8)) {
                    break;
                }
                cVar = cVar2;
            }
            if (j5 * e.f16309b < atomicLongFieldUpdater.get(cVar2)) {
                kVar3.a();
            }
        }
        return null;
    }

    public static final void c(c cVar, Object obj, C1546f c1546f) {
        c1546f.resumeWith(O3.l.h(cVar.o()));
    }

    public static final int e(c cVar, k kVar, int i4, Object obj, long j4, Object obj2, boolean z) {
        kVar.m(i4, obj);
        if (z) {
            return cVar.B(kVar, i4, obj, j4, obj2, z);
        }
        Object k4 = kVar.k(i4);
        if (k4 == null) {
            if (cVar.f(j4)) {
                if (kVar.j(null, i4, e.f16311d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (kVar.j(null, i4, obj2)) {
                    return 2;
                }
            }
        } else if (k4 instanceof p0) {
            kVar.m(i4, null);
            if (cVar.y(k4, obj)) {
                kVar.n(i4, e.f16316i);
                return 0;
            }
            v vVar = e.f16318k;
            if (kVar.f16331f.getAndSet((i4 * 2) + 1, vVar) == vVar) {
                return 5;
            }
            kVar.l(i4, true);
            return 5;
        }
        return cVar.B(kVar, i4, obj, j4, obj2, z);
    }

    public static void q(c cVar) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f16300e;
        if ((atomicLongFieldUpdater.addAndGet(cVar, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(cVar) & 4611686018427387904L) != 0) {
            }
        }
    }

    public static boolean z(Object obj) {
        if (!(obj instanceof InterfaceC1545e)) {
            throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
        }
        kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
        InterfaceC1545e interfaceC1545e = (InterfaceC1545e) obj;
        k kVar = e.f16308a;
        v c4 = interfaceC1545e.c(C0297i.f5732a, null);
        if (c4 == null) {
            return false;
        }
        interfaceC1545e.i(c4);
        return true;
    }

    public final Object A(k kVar, int i4, long j4, Object obj) {
        AtomicReferenceArray atomicReferenceArray = kVar.f16331f;
        Object k4 = kVar.k(i4);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f16297b;
        if (k4 == null) {
            if (j4 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return e.n;
                }
                if (kVar.j(k4, i4, obj)) {
                    k();
                    return e.f16320m;
                }
            }
        } else if (k4 == e.f16311d && kVar.j(k4, i4, e.f16316i)) {
            k();
            Object obj2 = atomicReferenceArray.get(i4 * 2);
            kVar.m(i4, null);
            return obj2;
        }
        while (true) {
            Object k5 = kVar.k(i4);
            if (k5 == null || k5 == e.f16312e) {
                if (j4 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (kVar.j(k5, i4, e.f16315h)) {
                        k();
                        return e.o;
                    }
                } else {
                    if (obj == null) {
                        return e.n;
                    }
                    if (kVar.j(k5, i4, obj)) {
                        k();
                        return e.f16320m;
                    }
                }
            } else if (k5 != e.f16311d) {
                v vVar = e.f16317j;
                if (k5 == vVar) {
                    return e.o;
                }
                if (k5 == e.f16315h) {
                    return e.o;
                }
                if (k5 == e.f16319l) {
                    k();
                    return e.o;
                }
                if (k5 != e.f16314g && kVar.j(k5, i4, e.f16313f)) {
                    boolean z = k5 instanceof s;
                    if (z) {
                        k5 = ((s) k5).f16337a;
                    }
                    if (z(k5)) {
                        kVar.n(i4, e.f16316i);
                        k();
                        Object obj3 = atomicReferenceArray.get(i4 * 2);
                        kVar.m(i4, null);
                        return obj3;
                    }
                    kVar.n(i4, vVar);
                    kVar.h();
                    if (z) {
                        k();
                    }
                    return e.o;
                }
            } else if (kVar.j(k5, i4, e.f16316i)) {
                k();
                Object obj4 = atomicReferenceArray.get(i4 * 2);
                kVar.m(i4, null);
                return obj4;
            }
        }
    }

    public final int B(k kVar, int i4, Object obj, long j4, Object obj2, boolean z) {
        while (true) {
            Object k4 = kVar.k(i4);
            if (k4 == null) {
                if (!f(j4) || z) {
                    if (z) {
                        if (kVar.j(null, i4, e.f16317j)) {
                            kVar.h();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (kVar.j(null, i4, obj2)) {
                            return 2;
                        }
                    }
                } else if (kVar.j(null, i4, e.f16311d)) {
                    break;
                }
            } else {
                if (k4 != e.f16312e) {
                    v vVar = e.f16318k;
                    if (k4 == vVar) {
                        kVar.m(i4, null);
                        return 5;
                    }
                    if (k4 == e.f16315h) {
                        kVar.m(i4, null);
                        return 5;
                    }
                    if (k4 == e.f16319l) {
                        kVar.m(i4, null);
                        s();
                        return 4;
                    }
                    kVar.m(i4, null);
                    if (k4 instanceof s) {
                        k4 = ((s) k4).f16337a;
                    }
                    if (y(k4, obj)) {
                        kVar.n(i4, e.f16316i);
                        return 0;
                    }
                    if (kVar.f16331f.getAndSet((i4 * 2) + 1, vVar) != vVar) {
                        kVar.l(i4, true);
                    }
                    return 5;
                }
                if (kVar.j(k4, i4, e.f16311d)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final void C(long j4) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        c cVar = this;
        if (cVar.u()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = f16299d;
            if (atomicLongFieldUpdater.get(cVar) > j4) {
                break;
            } else {
                cVar = this;
            }
        }
        int i4 = e.f16310c;
        int i5 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f16300e;
            if (i5 < i4) {
                long j5 = atomicLongFieldUpdater.get(cVar);
                if (j5 == (4611686018427387903L & atomicLongFieldUpdater2.get(cVar)) && j5 == atomicLongFieldUpdater.get(cVar)) {
                    return;
                } else {
                    i5++;
                }
            } else {
                while (true) {
                    long j6 = atomicLongFieldUpdater2.get(cVar);
                    if (atomicLongFieldUpdater2.compareAndSet(cVar, j6, (j6 & 4611686018427387903L) + 4611686018427387904L)) {
                        break;
                    } else {
                        cVar = this;
                    }
                }
                while (true) {
                    long j7 = atomicLongFieldUpdater.get(cVar);
                    long j8 = atomicLongFieldUpdater2.get(cVar);
                    long j9 = j8 & 4611686018427387903L;
                    boolean z = (j8 & 4611686018427387904L) != 0;
                    if (j7 == j9 && j7 == atomicLongFieldUpdater.get(cVar)) {
                        break;
                    }
                    if (z) {
                        cVar = this;
                    } else {
                        cVar = this;
                        atomicLongFieldUpdater2.compareAndSet(cVar, j8, 4611686018427387904L + j9);
                    }
                }
                while (true) {
                    long j10 = atomicLongFieldUpdater2.get(cVar);
                    if (atomicLongFieldUpdater2.compareAndSet(cVar, j10, j10 & 4611686018427387903L)) {
                        return;
                    } else {
                        cVar = this;
                    }
                }
            }
        }
    }

    @Override // z3.q
    public final void b(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        g(cancellationException, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0189, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x00c6, code lost:
    
        c(r1, r4, r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0173 A[RETURN] */
    @Override // z3.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object d(h3.c cVar, Object obj) {
        Object q4;
        EnumC0441a enumC0441a;
        Object obj2;
        c cVar2;
        k kVar;
        int i4;
        int i5;
        boolean z;
        c cVar3 = this;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16301f;
        k kVar2 = (k) atomicReferenceFieldUpdater.get(cVar3);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f16297b;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(cVar3);
            long j4 = andIncrement & 1152921504606846975L;
            boolean r4 = cVar3.r(andIncrement, false);
            int i6 = e.f16309b;
            long j5 = i6;
            long j6 = j4 / j5;
            int i7 = (int) (j4 % j5);
            long j7 = kVar2.f318c;
            C0297i c0297i = C0297i.f5732a;
            if (j7 != j6) {
                k a3 = a(cVar3, j6, kVar2);
                if (a3 != null) {
                    kVar2 = a3;
                } else if (r4) {
                    Object w4 = w(cVar, obj);
                    if (w4 == EnumC0441a.f9038a) {
                        return w4;
                    }
                }
            }
            int e4 = e(cVar3, kVar2, i7, obj, j4, null, r4);
            if (e4 == 0) {
                kVar2.a();
                return c0297i;
            }
            if (e4 == 1) {
                break;
            }
            if (e4 != 2) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = f16298c;
                if (e4 == 3) {
                    C1546f d4 = AbstractC1562w.d(AbstractC0347t0.m(cVar));
                    Object obj3 = obj;
                    try {
                        int e5 = e(cVar3, kVar2, i7, obj3, j4, d4, false);
                        try {
                            if (e5 != 0) {
                                if (e5 == 1) {
                                    d4.resumeWith(c0297i);
                                } else if (e5 != 2) {
                                    if (e5 != 4) {
                                        String str = "unexpected";
                                        if (e5 != 5) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        kVar2.a();
                                        k kVar3 = (k) atomicReferenceFieldUpdater.get(cVar3);
                                        while (true) {
                                            long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(cVar3);
                                            long j8 = andIncrement2 & 1152921504606846975L;
                                            boolean r5 = cVar3.r(andIncrement2, false);
                                            int i8 = e.f16309b;
                                            AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater;
                                            long j9 = i8;
                                            String str2 = str;
                                            long j10 = j8 / j9;
                                            int i9 = (int) (j8 % j9);
                                            AtomicLongFieldUpdater atomicLongFieldUpdater4 = atomicLongFieldUpdater2;
                                            if (kVar3.f318c != j10) {
                                                k a4 = a(cVar3, j10, kVar3);
                                                if (a4 != null) {
                                                    i4 = i8;
                                                    i5 = i9;
                                                    z = r5;
                                                    kVar = a4;
                                                } else {
                                                    if (r5) {
                                                        break;
                                                    }
                                                    atomicLongFieldUpdater = atomicLongFieldUpdater3;
                                                    str = str2;
                                                    atomicLongFieldUpdater2 = atomicLongFieldUpdater4;
                                                }
                                            } else {
                                                kVar = kVar3;
                                                i4 = i8;
                                                i5 = i9;
                                                z = r5;
                                            }
                                            int e6 = e(cVar3, kVar, i5, obj3, j8, d4, z);
                                            Object obj4 = obj3;
                                            cVar2 = cVar3;
                                            k kVar4 = kVar;
                                            int i10 = i5;
                                            obj2 = obj4;
                                            if (e6 == 0) {
                                                kVar4.a();
                                                break;
                                            }
                                            if (e6 == 1) {
                                                break;
                                            }
                                            if (e6 != 2) {
                                                if (e6 == 3) {
                                                    throw new IllegalStateException(str2);
                                                }
                                                if (e6 != 4) {
                                                    if (e6 == 5) {
                                                        kVar4.a();
                                                    }
                                                    kVar3 = kVar4;
                                                    cVar3 = cVar2;
                                                    atomicLongFieldUpdater = atomicLongFieldUpdater3;
                                                    str = str2;
                                                    atomicLongFieldUpdater2 = atomicLongFieldUpdater4;
                                                    obj3 = obj2;
                                                } else if (j8 < atomicLongFieldUpdater4.get(cVar2)) {
                                                    kVar4.a();
                                                }
                                            } else if (z) {
                                                kVar4.h();
                                            } else {
                                                d4.a(kVar4, i10 + i4);
                                            }
                                        }
                                    } else {
                                        obj2 = obj3;
                                        cVar2 = cVar3;
                                        if (j4 < atomicLongFieldUpdater2.get(cVar2)) {
                                            kVar2.a();
                                        }
                                    }
                                    c(cVar2, obj2, d4);
                                } else {
                                    d4.a(kVar2, i7 + i6);
                                }
                                q4 = d4.q();
                                enumC0441a = EnumC0441a.f9038a;
                                if (q4 != enumC0441a) {
                                    q4 = c0297i;
                                }
                                if (q4 != enumC0441a) {
                                    return q4;
                                }
                            } else {
                                kVar2.a();
                            }
                            d4.resumeWith(c0297i);
                            q4 = d4.q();
                            enumC0441a = EnumC0441a.f9038a;
                            if (q4 != enumC0441a) {
                            }
                            if (q4 != enumC0441a) {
                            }
                        } catch (Throwable th) {
                            th = th;
                            d4.x();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else if (e4 == 4) {
                    if (j4 < atomicLongFieldUpdater2.get(cVar3)) {
                        kVar2.a();
                    }
                    Object w5 = w(cVar, obj);
                    if (w5 == EnumC0441a.f9038a) {
                        return w5;
                    }
                } else if (e4 == 5) {
                    kVar2.a();
                }
            } else if (r4) {
                kVar2.h();
                Object w6 = w(cVar, obj);
                if (w6 == EnumC0441a.f9038a) {
                    return w6;
                }
            }
        }
    }

    public final boolean f(long j4) {
        return j4 < f16299d.get(this) || j4 < f16298c.get(this) + ((long) this.f16306a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003c A[LOOP:2: B:17:0x003c->B:39:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e A[LOOP:3: B:22:0x006e->B:30:?, LOOP_LABEL: LOOP:3: B:22:0x006e->B:30:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004c A[LOOP:5: B:40:0x004c->B:48:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x002f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g(Throwable th, boolean z) {
        c cVar;
        v vVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        boolean z4;
        long j4;
        long j5;
        long j6;
        Object obj;
        long j7;
        long j8;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f16297b;
        if (z) {
            do {
                j8 = atomicLongFieldUpdater.get(this);
                if (((int) (j8 >> 60)) == 0) {
                    k kVar = e.f16308a;
                    cVar = this;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(cVar, j8, (j8 & 1152921504606846975L) + (1 << 60)));
            vVar = e.f16324s;
            while (true) {
                atomicReferenceFieldUpdater = f16304i;
                if (!atomicReferenceFieldUpdater.compareAndSet(this, vVar, th)) {
                    z4 = true;
                    break;
                }
                if (atomicReferenceFieldUpdater.get(this) != vVar) {
                    z4 = false;
                    break;
                }
            }
            if (z) {
                do {
                    j4 = atomicLongFieldUpdater.get(this);
                    int i4 = (int) (j4 >> 60);
                    if (i4 == 0) {
                        j5 = j4 & 1152921504606846975L;
                        j6 = 2;
                    } else {
                        if (i4 != 1) {
                            break;
                        }
                        j5 = j4 & 1152921504606846975L;
                        j6 = 3;
                    }
                } while (!atomicLongFieldUpdater.compareAndSet(cVar, j4, (j6 << 60) + j5));
            } else {
                do {
                    j7 = atomicLongFieldUpdater.get(this);
                } while (!atomicLongFieldUpdater.compareAndSet(cVar, j7, (3 << 60) + (j7 & 1152921504606846975L)));
            }
            s();
            if (z4) {
                loop3: while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f16305j;
                    obj = atomicReferenceFieldUpdater2.get(this);
                    v vVar2 = obj == null ? e.f16322q : e.f16323r;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, vVar2)) {
                        if (atomicReferenceFieldUpdater2.get(this) != obj) {
                            break;
                        }
                    }
                }
                if (obj != null) {
                    kotlin.jvm.internal.s.a(1, obj);
                    ((InterfaceC1339l) obj).invoke(m());
                    return z4;
                }
            }
            return z4;
        }
        cVar = this;
        vVar = e.f16324s;
        while (true) {
            atomicReferenceFieldUpdater = f16304i;
            if (!atomicReferenceFieldUpdater.compareAndSet(this, vVar, th)) {
            }
        }
        if (z) {
        }
        s();
        if (z4) {
        }
        return z4;
    }

    @Override // z3.r
    public Object h(Object obj) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f16297b;
        boolean z = false;
        long j4 = 1152921504606846975L;
        boolean z4 = r(atomicLongFieldUpdater.get(this), false) ? false : !f(r1 & 1152921504606846975L);
        i iVar = j.f16329a;
        if (z4) {
            return iVar;
        }
        Object obj2 = e.f16317j;
        k kVar = (k) f16301f.get(this);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j5 = andIncrement & j4;
            boolean r4 = r(andIncrement, z);
            int i4 = e.f16309b;
            long j6 = i4;
            long j7 = j5 / j6;
            int i5 = (int) (j5 % j6);
            if (kVar.f318c != j7) {
                k a3 = a(this, j7, kVar);
                if (a3 != null) {
                    kVar = a3;
                } else {
                    if (r4) {
                        return new h(o());
                    }
                    z = false;
                    j4 = 1152921504606846975L;
                }
            }
            int e4 = e(this, kVar, i5, obj, j5, obj2, r4);
            C0297i c0297i = C0297i.f5732a;
            if (e4 == 0) {
                kVar.a();
                return c0297i;
            }
            if (e4 == 1) {
                return c0297i;
            }
            if (e4 == 2) {
                if (r4) {
                    kVar.h();
                    return new h(o());
                }
                p0 p0Var = obj2 instanceof p0 ? (p0) obj2 : null;
                if (p0Var != null) {
                    p0Var.a(kVar, i5 + i4);
                }
                kVar.h();
                return iVar;
            }
            if (e4 == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (e4 == 4) {
                if (j5 < f16298c.get(this)) {
                    kVar.a();
                }
                return new h(o());
            }
            if (e4 == 5) {
                kVar.a();
            }
            z = false;
            j4 = 1152921504606846975L;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x008d, code lost:
    
        r1 = (z3.k) ((C3.d) C3.d.f288b.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final k i(long j4) {
        Object obj;
        long j5;
        Object obj2 = f16303h.get(this);
        k kVar = (k) f16301f.get(this);
        if (kVar.f318c > ((k) obj2).f318c) {
            obj2 = kVar;
        }
        k kVar2 = (k) f16302g.get(this);
        if (kVar2.f318c > ((k) obj2).f318c) {
            obj2 = kVar2;
        }
        C3.d dVar = (C3.d) obj2;
        loop0: while (true) {
            dVar.getClass();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C3.d.f287a;
            Object obj3 = atomicReferenceFieldUpdater.get(dVar);
            v vVar = C3.a.f280b;
            obj = null;
            if (obj3 == vVar) {
                break;
            }
            C3.d dVar2 = (C3.d) obj3;
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
        k kVar3 = (k) dVar;
        if (t()) {
            k kVar4 = kVar3;
            loop2: do {
                int i4 = e.f16309b - 1;
                while (true) {
                    if (-1 >= i4) {
                        break;
                    }
                    j5 = (kVar4.f318c * e.f16309b) + i4;
                    if (j5 < f16298c.get(this)) {
                        break loop2;
                    }
                    while (true) {
                        Object k4 = kVar4.k(i4);
                        if (k4 != null && k4 != e.f16312e) {
                            if (k4 == e.f16311d) {
                                break loop2;
                            }
                        } else {
                            if (kVar4.j(k4, i4, e.f16319l)) {
                                kVar4.h();
                                break;
                            }
                        }
                    }
                    i4--;
                }
            } while (kVar4 != null);
            j5 = -1;
            if (j5 != -1) {
                j(j5);
            }
        }
        loop5: for (k kVar5 = kVar3; kVar5 != null; kVar5 = (k) ((C3.d) C3.d.f288b.get(kVar5))) {
            for (int i5 = e.f16309b - 1; -1 < i5; i5--) {
                if ((kVar5.f318c * e.f16309b) + i5 < j4) {
                    break loop5;
                }
                while (true) {
                    Object k5 = kVar5.k(i5);
                    if (k5 != null && k5 != e.f16312e) {
                        if (!(k5 instanceof s)) {
                            if (!(k5 instanceof p0)) {
                                break;
                            }
                            if (kVar5.j(k5, i5, e.f16319l)) {
                                obj = C3.a.e(obj, k5);
                                kVar5.l(i5, true);
                                break;
                            }
                        } else {
                            if (kVar5.j(k5, i5, e.f16319l)) {
                                obj = C3.a.e(obj, ((s) k5).f16337a);
                                kVar5.l(i5, true);
                                break;
                            }
                        }
                    } else {
                        if (kVar5.j(k5, i5, e.f16319l)) {
                            kVar5.h();
                            break;
                        }
                    }
                }
            }
        }
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                x((p0) obj, true);
                return kVar3;
            }
            ArrayList arrayList = (ArrayList) obj;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                x((p0) arrayList.get(size), true);
            }
        }
        return kVar3;
    }

    public final void j(long j4) {
        k kVar = (k) f16302g.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f16298c;
            long j5 = atomicLongFieldUpdater.get(this);
            if (j4 < Math.max(this.f16306a + j5, f16299d.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j5, 1 + j5)) {
                long j6 = e.f16309b;
                long j7 = j5 / j6;
                int i4 = (int) (j5 % j6);
                if (kVar.f318c != j7) {
                    k l4 = l(j7, kVar);
                    if (l4 != null) {
                        kVar = l4;
                    }
                }
                k kVar2 = kVar;
                if (A(kVar2, i4, j5, null) != e.o) {
                    kVar2.a();
                } else if (j5 < p()) {
                    kVar2.a();
                }
                kVar = kVar2;
            }
        }
    }

    public final void k() {
        Object a3;
        if (u()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16303h;
        k kVar = (k) atomicReferenceFieldUpdater.get(this);
        loop0: while (true) {
            long andIncrement = f16299d.getAndIncrement(this);
            long j4 = andIncrement / e.f16309b;
            if (p() <= andIncrement) {
                if (kVar.f318c < j4 && kVar.b() != null) {
                    v(j4, kVar);
                }
                q(this);
                return;
            }
            if (kVar.f318c != j4) {
                d dVar = d.f16307a;
                while (true) {
                    a3 = C3.a.a(kVar, j4, dVar);
                    if (!C3.a.d(a3)) {
                        t b4 = C3.a.b(a3);
                        while (true) {
                            t tVar = (t) atomicReferenceFieldUpdater.get(this);
                            if (tVar.f318c >= b4.f318c) {
                                break;
                            }
                            if (!b4.i()) {
                                break;
                            }
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, tVar, b4)) {
                                if (atomicReferenceFieldUpdater.get(this) != tVar) {
                                    if (b4.e()) {
                                        b4.d();
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
                k kVar2 = null;
                if (C3.a.d(a3)) {
                    s();
                    v(j4, kVar);
                    q(this);
                } else {
                    k kVar3 = (k) C3.a.b(a3);
                    long j5 = kVar3.f318c;
                    if (j5 > j4) {
                        long j6 = j5 * e.f16309b;
                        if (f16299d.compareAndSet(this, 1 + andIncrement, j6)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = f16300e;
                            if ((atomicLongFieldUpdater.addAndGet(this, j6 - andIncrement) & 4611686018427387904L) != 0) {
                                while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0) {
                                }
                            }
                        } else {
                            q(this);
                        }
                    } else {
                        kVar2 = kVar3;
                    }
                }
                if (kVar2 == null) {
                    continue;
                } else {
                    kVar = kVar2;
                }
            }
            int i4 = (int) (andIncrement % e.f16309b);
            Object k4 = kVar.k(i4);
            boolean z = k4 instanceof p0;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f16298c;
            if (!z || andIncrement < atomicLongFieldUpdater2.get(this) || !kVar.j(k4, i4, e.f16314g)) {
                while (true) {
                    Object k5 = kVar.k(i4);
                    if (!(k5 instanceof p0)) {
                        if (k5 != e.f16317j) {
                            if (k5 != null) {
                                if (k5 == e.f16311d || k5 == e.f16315h || k5 == e.f16316i || k5 == e.f16318k || k5 == e.f16319l) {
                                    break loop0;
                                }
                                if (k5 != e.f16313f) {
                                    throw new IllegalStateException(("Unexpected cell state: " + k5).toString());
                                }
                            } else if (kVar.j(k5, i4, e.f16312e)) {
                                break loop0;
                            }
                        } else {
                            break;
                        }
                    } else if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                        if (kVar.j(k5, i4, new s((p0) k5))) {
                            break loop0;
                        }
                    } else if (kVar.j(k5, i4, e.f16314g)) {
                        if (z(k5)) {
                            kVar.n(i4, e.f16311d);
                            break;
                        } else {
                            kVar.n(i4, e.f16317j);
                            kVar.h();
                        }
                    }
                }
            } else if (z(k4)) {
                kVar.n(i4, e.f16311d);
                break;
            } else {
                kVar.n(i4, e.f16317j);
                kVar.h();
                q(this);
            }
        }
        q(this);
    }

    public final k l(long j4, k kVar) {
        Object a3;
        long j5;
        k kVar2 = e.f16308a;
        d dVar = d.f16307a;
        loop0: while (true) {
            a3 = C3.a.a(kVar, j4, dVar);
            if (!C3.a.d(a3)) {
                t b4 = C3.a.b(a3);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16302g;
                    t tVar = (t) atomicReferenceFieldUpdater.get(this);
                    if (tVar.f318c >= b4.f318c) {
                        break loop0;
                    }
                    if (!b4.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, tVar, b4)) {
                        if (atomicReferenceFieldUpdater.get(this) != tVar) {
                            if (b4.e()) {
                                b4.d();
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
        if (C3.a.d(a3)) {
            s();
            if (kVar.f318c * e.f16309b < p()) {
                kVar.a();
                return null;
            }
        } else {
            k kVar3 = (k) C3.a.b(a3);
            long j6 = kVar3.f318c;
            if (!u() && j4 <= f16299d.get(this) / e.f16309b) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f16303h;
                    t tVar2 = (t) atomicReferenceFieldUpdater2.get(this);
                    if (tVar2.f318c >= j6 || !kVar3.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, tVar2, kVar3)) {
                        if (atomicReferenceFieldUpdater2.get(this) != tVar2) {
                            if (kVar3.e()) {
                                kVar3.d();
                            }
                        }
                    }
                    if (tVar2.e()) {
                        tVar2.d();
                    }
                }
            }
            if (j6 <= j4) {
                return kVar3;
            }
            long j7 = j6 * e.f16309b;
            do {
                j5 = f16298c.get(this);
                if (j5 >= j7) {
                    break;
                }
            } while (!f16298c.compareAndSet(this, j5, j7));
            if (j6 * e.f16309b < p()) {
                kVar3.a();
            }
        }
        return null;
    }

    public final Throwable m() {
        return (Throwable) f16304i.get(this);
    }

    public final Throwable n() {
        Throwable m4 = m();
        return m4 == null ? new l("Channel was closed") : m4;
    }

    public final Throwable o() {
        Throwable m4 = m();
        return m4 == null ? new C0098p("Channel was closed") : m4;
    }

    public final long p() {
        return f16297b.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x00a2, code lost:
    
        r0 = (z3.k) ((C3.d) C3.d.f288b.get(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean r(long j4, boolean z) {
        int i4 = (int) (j4 >> 60);
        if (i4 != 0 && i4 != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f16298c;
            if (i4 == 2) {
                i(1152921504606846975L & j4);
                if (z) {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16302g;
                        k kVar = (k) atomicReferenceFieldUpdater.get(this);
                        long j5 = atomicLongFieldUpdater.get(this);
                        if (p() <= j5) {
                            break;
                        }
                        long j6 = e.f16309b;
                        long j7 = j5 / j6;
                        if (kVar.f318c != j7 && (kVar = l(j7, kVar)) == null) {
                            if (((k) atomicReferenceFieldUpdater.get(this)).f318c < j7) {
                                break;
                            }
                        } else {
                            kVar.a();
                            int i5 = (int) (j5 % j6);
                            while (true) {
                                Object k4 = kVar.k(i5);
                                if (k4 == null || k4 == e.f16312e) {
                                    if (kVar.j(k4, i5, e.f16315h)) {
                                        k();
                                        break;
                                    }
                                } else {
                                    if (k4 == e.f16311d) {
                                        break;
                                    }
                                    if (k4 != e.f16317j) {
                                        if (k4 != e.f16319l) {
                                            if (k4 != e.f16316i) {
                                                if (k4 != e.f16315h) {
                                                    if (k4 == e.f16314g) {
                                                        break;
                                                    }
                                                    if (k4 != e.f16313f && j5 == atomicLongFieldUpdater.get(this)) {
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            f16298c.compareAndSet(this, j5, j5 + 1);
                        }
                    }
                }
            } else {
                if (i4 != 3) {
                    throw new IllegalStateException(AbstractC0005f.j(i4, "unexpected close status: ").toString());
                }
                k i6 = i(1152921504606846975L & j4);
                Object obj = null;
                loop0: do {
                    int i7 = e.f16309b - 1;
                    while (true) {
                        if (-1 >= i7) {
                            break;
                        }
                        long j8 = (i6.f318c * e.f16309b) + i7;
                        while (true) {
                            Object k5 = i6.k(i7);
                            if (k5 == e.f16316i) {
                                break loop0;
                            }
                            if (k5 == e.f16311d) {
                                if (j8 < atomicLongFieldUpdater.get(this)) {
                                    break loop0;
                                }
                                if (i6.j(k5, i7, e.f16319l)) {
                                    i6.m(i7, null);
                                    i6.h();
                                    break;
                                }
                            } else if (k5 != e.f16312e && k5 != null) {
                                if (!(k5 instanceof p0) && !(k5 instanceof s)) {
                                    v vVar = e.f16314g;
                                    if (k5 == vVar || k5 == e.f16313f) {
                                        break loop0;
                                    }
                                    if (k5 != vVar) {
                                        break;
                                    }
                                } else {
                                    if (j8 < atomicLongFieldUpdater.get(this)) {
                                        break loop0;
                                    }
                                    p0 p0Var = k5 instanceof s ? ((s) k5).f16337a : (p0) k5;
                                    if (i6.j(k5, i7, e.f16319l)) {
                                        obj = C3.a.e(obj, p0Var);
                                        i6.m(i7, null);
                                        i6.h();
                                        break;
                                    }
                                }
                            } else if (i6.j(k5, i7, e.f16319l)) {
                                i6.h();
                                break;
                            }
                        }
                        i7--;
                    }
                } while (i6 != null);
                if (obj != null) {
                    if (obj instanceof ArrayList) {
                        ArrayList arrayList = (ArrayList) obj;
                        for (int size = arrayList.size() - 1; -1 < size; size--) {
                            x((p0) arrayList.get(size), false);
                        }
                    } else {
                        x((p0) obj, false);
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean s() {
        return r(f16297b.get(this), false);
    }

    public boolean t() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:94:0x01aa, code lost:
    
        r16 = r7;
        r3 = (z3.k) r3.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01b3, code lost:
    
        if (r3 != null) goto L88;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        boolean z;
        String obj;
        StringBuilder sb = new StringBuilder();
        int i4 = (int) (f16297b.get(this) >> 60);
        if (i4 == 2) {
            sb.append("closed,");
        } else if (i4 == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.f16306a + ',');
        sb.append("data=[");
        int i5 = 0;
        boolean z4 = true;
        List W4 = d3.j.W(f16302g.get(this), f16301f.get(this), f16303h.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : W4) {
            if (((k) obj2) != e.f16308a) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j4 = ((k) next).f318c;
            do {
                Object next2 = it.next();
                long j5 = ((k) next2).f318c;
                if (j4 > j5) {
                    next = next2;
                    j4 = j5;
                }
            } while (it.hasNext());
        }
        k kVar = (k) next;
        long j6 = f16298c.get(this);
        long p2 = p();
        loop2: while (true) {
            int i6 = e.f16309b;
            int i7 = i5;
            while (true) {
                if (i7 >= i6) {
                    break;
                }
                long j7 = (kVar.f318c * e.f16309b) + i7;
                if (j7 >= p2 && j7 >= j6) {
                    break loop2;
                }
                Object k4 = kVar.k(i7);
                boolean z5 = z4;
                Object obj3 = kVar.f16331f.get(i7 * 2);
                if (k4 instanceof InterfaceC1545e) {
                    obj = (j7 >= j6 || j7 < p2) ? (j7 >= p2 || j7 < j6) ? "cont" : "send" : "receive";
                } else if (k4 instanceof s) {
                    obj = "EB(" + k4 + ')';
                } else if (kotlin.jvm.internal.i.a(k4, e.f16313f) ? z5 : kotlin.jvm.internal.i.a(k4, e.f16314g)) {
                    obj = "resuming_sender";
                } else if (k4 == null ? z5 : k4.equals(e.f16312e) ? z5 : kotlin.jvm.internal.i.a(k4, e.f16316i) ? z5 : kotlin.jvm.internal.i.a(k4, e.f16315h) ? z5 : kotlin.jvm.internal.i.a(k4, e.f16318k) ? z5 : kotlin.jvm.internal.i.a(k4, e.f16317j) ? z5 : kotlin.jvm.internal.i.a(k4, e.f16319l)) {
                    i7++;
                    z4 = z5;
                } else {
                    obj = k4.toString();
                }
                if (obj3 != null) {
                    sb.append("(" + obj + ',' + obj3 + "),");
                } else {
                    sb.append(obj + ',');
                }
                i7++;
                z4 = z5;
            }
            z4 = z;
            i5 = 0;
        }
        if (sb.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        if (sb.charAt(AbstractC1510g.e0(sb)) == ',') {
            kotlin.jvm.internal.i.d(sb.deleteCharAt(sb.length() - 1), "deleteCharAt(...)");
        }
        sb.append("]");
        return sb.toString();
    }

    public final boolean u() {
        long j4 = f16299d.get(this);
        return j4 == 0 || j4 == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(long j4, k kVar) {
        k kVar2;
        k kVar3;
        while (kVar.f318c < j4 && (kVar3 = (k) kVar.b()) != null) {
            kVar = kVar3;
        }
        while (true) {
            if (!kVar.c() || (kVar2 = (k) kVar.b()) == null) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16303h;
                    t tVar = (t) atomicReferenceFieldUpdater.get(this);
                    if (tVar.f318c >= kVar.f318c) {
                        return;
                    }
                    if (!kVar.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, tVar, kVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != tVar) {
                            if (kVar.e()) {
                                kVar.d();
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
            kVar = kVar2;
        }
    }

    public final Object w(h3.c cVar, Object obj) {
        C1546f c1546f = new C1546f(1, AbstractC0347t0.m(cVar));
        c1546f.r();
        c1546f.resumeWith(O3.l.h(o()));
        Object q4 = c1546f.q();
        return q4 == EnumC0441a.f9038a ? q4 : C0297i.f5732a;
    }

    public final void x(p0 p0Var, boolean z) {
        if (p0Var instanceof InterfaceC1545e) {
            ((InterfaceC0425c) p0Var).resumeWith(O3.l.h(z ? n() : o()));
            return;
        }
        if (!(p0Var instanceof b)) {
            throw new IllegalStateException(("Unexpected waiter: " + p0Var).toString());
        }
        b bVar = (b) p0Var;
        C1546f c1546f = bVar.f16295b;
        kotlin.jvm.internal.i.b(c1546f);
        bVar.f16295b = null;
        bVar.f16294a = e.f16319l;
        Throwable m4 = bVar.f16296c.m();
        if (m4 == null) {
            c1546f.resumeWith(Boolean.FALSE);
        } else {
            c1546f.resumeWith(O3.l.h(m4));
        }
    }

    public final boolean y(Object obj, Object obj2) {
        if (!(obj instanceof b)) {
            if (!(obj instanceof InterfaceC1545e)) {
                throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
            }
            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            InterfaceC1545e interfaceC1545e = (InterfaceC1545e) obj;
            k kVar = e.f16308a;
            v c4 = interfaceC1545e.c(obj2, null);
            if (c4 == null) {
                return false;
            }
            interfaceC1545e.i(c4);
            return true;
        }
        kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
        b bVar = (b) obj;
        C1546f c1546f = bVar.f16295b;
        kotlin.jvm.internal.i.b(c1546f);
        bVar.f16295b = null;
        bVar.f16294a = obj2;
        Boolean bool = Boolean.TRUE;
        k kVar2 = e.f16308a;
        v c5 = c1546f.c(bool, null);
        if (c5 == null) {
            return false;
        }
        c1546f.i(c5);
        return true;
    }
}
