package ie;

import a2.r;
import com.google.android.gms.internal.measurement.lf;
import ge.a0;
import ge.b2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.collections.i0;
import kotlin.collections.y;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import le.s;
import le.t;
import wd.g0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class c implements g {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f4719e = AtomicLongFieldUpdater.newUpdater(c.class, "sendersAndCloseStatus$volatile");

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f4720i = AtomicLongFieldUpdater.newUpdater(c.class, "receivers$volatile");

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f4721r = AtomicLongFieldUpdater.newUpdater(c.class, "bufferEnd$volatile");

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f4722s = AtomicLongFieldUpdater.newUpdater(c.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4723t = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "sendSegment$volatile");

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4724u = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "receiveSegment$volatile");

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4725v = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "bufferEndSegment$volatile");

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4726w = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_closeCause$volatile");

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4727x = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "closeHandler$volatile");
    private volatile /* synthetic */ Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;

    /* renamed from: d, reason: collision with root package name */
    public final int f4728d;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    public c(int i3) {
        this.f4728d = i3;
        if (i3 < 0) {
            r.h(n0.l.f(i3, "Invalid channel capacity: ", ", should be >=0"));
            throw null;
        }
        k kVar = e.f4730a;
        this.bufferEnd$volatile = i3 != 0 ? i3 != Integer.MAX_VALUE ? i3 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = f4721r.get(this);
        k kVar2 = new k(0L, null, this, 3);
        this.sendSegment$volatile = kVar2;
        this.receiveSegment$volatile = kVar2;
        if (v()) {
            kVar2 = e.f4730a;
            kVar2.getClass();
        }
        this.bufferEndSegment$volatile = kVar2;
        this._closeCause$volatile = e.f4746s;
    }

    public static boolean A(Object obj) {
        if (!(obj instanceof ge.f)) {
            r.n(obj, "Unexpected waiter: ");
            return false;
        }
        ge.f fVar = (ge.f) obj;
        Unit unit = Unit.f5554a;
        k kVar = e.f4730a;
        a8.f f3 = fVar.f(unit, null);
        if (f3 == null) {
            return false;
        }
        fVar.g(f3);
        return true;
    }

    public static final k d(c cVar, long j, k kVar) {
        Object b10;
        c cVar2;
        k kVar2 = e.f4730a;
        d dVar = d.f4729v;
        loop0: while (true) {
            b10 = le.b.b(kVar, j, dVar);
            if (!le.b.e(b10)) {
                s c10 = le.b.c(b10);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4723t;
                    s sVar = (s) atomicReferenceFieldUpdater.get(cVar);
                    if (sVar.f5999c >= c10.f5999c) {
                        break loop0;
                    }
                    if (!c10.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(cVar, sVar, c10)) {
                        if (atomicReferenceFieldUpdater.get(cVar) != sVar) {
                            if (c10.e()) {
                                c10.d();
                            }
                        }
                    }
                    if (sVar.e()) {
                        sVar.d();
                    }
                }
            } else {
                break;
            }
        }
        boolean e2 = le.b.e(b10);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f4720i;
        if (e2) {
            cVar.t();
            if (kVar.f5999c * e.f4731b < atomicLongFieldUpdater.get(cVar)) {
                kVar.a();
                return null;
            }
        } else {
            k kVar3 = (k) le.b.c(b10);
            long j3 = kVar3.f5999c;
            if (j3 <= j) {
                return kVar3;
            }
            long j10 = e.f4731b * j3;
            while (true) {
                long j11 = f4719e.get(cVar);
                long j12 = 1152921504606846975L & j11;
                if (j12 >= j10) {
                    cVar2 = cVar;
                    break;
                }
                cVar2 = cVar;
                if (f4719e.compareAndSet(cVar2, j11, (((int) (j11 >> 60)) << 60) + j12)) {
                    break;
                }
                cVar = cVar2;
            }
            if (j3 * e.f4731b < atomicLongFieldUpdater.get(cVar2)) {
                kVar3.a();
            }
        }
        return null;
    }

    public static final void e(c cVar, Object obj, ge.h hVar) {
        Throwable p4 = cVar.p();
        hd.l lVar = hd.n.f4511e;
        hVar.resumeWith(new hd.m(p4));
    }

    public static final int f(c cVar, k kVar, int i3, Object obj, long j, Object obj2, boolean z10) {
        kVar.m(i3, obj);
        if (z10) {
            return cVar.C(kVar, i3, obj, j, obj2, z10);
        }
        Object k10 = kVar.k(i3);
        if (k10 == null) {
            if (cVar.g(j)) {
                if (kVar.j(i3, null, e.f4733d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (kVar.j(i3, null, obj2)) {
                    return 2;
                }
            }
        } else if (k10 instanceof b2) {
            kVar.m(i3, null);
            if (cVar.z(k10, obj)) {
                kVar.n(i3, e.f4737i);
                return 0;
            }
            a8.f fVar = e.f4738k;
            if (kVar.f4753f.getAndSet((i3 * 2) + 1, fVar) == fVar) {
                return 5;
            }
            kVar.l(i3, true);
            return 5;
        }
        return cVar.C(kVar, i3, obj, j, obj2, z10);
    }

    public static void r(c cVar) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f4722s;
        if ((atomicLongFieldUpdater.addAndGet(cVar, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(cVar) & 4611686018427387904L) != 0) {
            }
        }
    }

    public final Object B(k kVar, int i3, long j, Object obj) {
        AtomicReferenceArray atomicReferenceArray = kVar.f4753f;
        Object k10 = kVar.k(i3);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f4719e;
        if (k10 == null) {
            if (j >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return e.f4741n;
                }
                if (kVar.j(i3, k10, obj)) {
                    l();
                    return e.f4740m;
                }
            }
        } else if (k10 == e.f4733d && kVar.j(i3, k10, e.f4737i)) {
            l();
            Object obj2 = atomicReferenceArray.get(i3 * 2);
            kVar.m(i3, null);
            return obj2;
        }
        while (true) {
            Object k11 = kVar.k(i3);
            if (k11 == null || k11 == e.f4734e) {
                if (j < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (kVar.j(i3, k11, e.f4736h)) {
                        l();
                        return e.f4742o;
                    }
                } else {
                    if (obj == null) {
                        return e.f4741n;
                    }
                    if (kVar.j(i3, k11, obj)) {
                        l();
                        return e.f4740m;
                    }
                }
            } else if (k11 != e.f4733d) {
                a8.f fVar = e.j;
                if (k11 == fVar) {
                    return e.f4742o;
                }
                if (k11 == e.f4736h) {
                    return e.f4742o;
                }
                if (k11 == e.f4739l) {
                    l();
                    return e.f4742o;
                }
                if (k11 != e.g && kVar.j(i3, k11, e.f4735f)) {
                    boolean z10 = k11 instanceof p;
                    if (z10) {
                        k11 = ((p) k11).f4756a;
                    }
                    if (A(k11)) {
                        kVar.n(i3, e.f4737i);
                        l();
                        Object obj3 = atomicReferenceArray.get(i3 * 2);
                        kVar.m(i3, null);
                        return obj3;
                    }
                    kVar.n(i3, fVar);
                    kVar.h();
                    if (z10) {
                        l();
                    }
                    return e.f4742o;
                }
            } else if (kVar.j(i3, k11, e.f4737i)) {
                l();
                Object obj4 = atomicReferenceArray.get(i3 * 2);
                kVar.m(i3, null);
                return obj4;
            }
        }
    }

    public final int C(k kVar, int i3, Object obj, long j, Object obj2, boolean z10) {
        while (true) {
            Object k10 = kVar.k(i3);
            if (k10 == null) {
                if (!g(j) || z10) {
                    if (z10) {
                        if (kVar.j(i3, null, e.j)) {
                            kVar.h();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (kVar.j(i3, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (kVar.j(i3, null, e.f4733d)) {
                    break;
                }
            } else {
                if (k10 != e.f4734e) {
                    a8.f fVar = e.f4738k;
                    if (k10 == fVar) {
                        kVar.m(i3, null);
                        return 5;
                    }
                    if (k10 == e.f4736h) {
                        kVar.m(i3, null);
                        return 5;
                    }
                    if (k10 == e.f4739l) {
                        kVar.m(i3, null);
                        t();
                        return 4;
                    }
                    kVar.m(i3, null);
                    if (k10 instanceof p) {
                        k10 = ((p) k10).f4756a;
                    }
                    if (z(k10, obj)) {
                        kVar.n(i3, e.f4737i);
                        return 0;
                    }
                    if (kVar.f4753f.getAndSet((i3 * 2) + 1, fVar) != fVar) {
                        kVar.l(i3, true);
                    }
                    return 5;
                }
                if (kVar.j(i3, k10, e.f4733d)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final void D(long j) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        c cVar = this;
        if (cVar.v()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = f4721r;
            if (atomicLongFieldUpdater.get(cVar) > j) {
                break;
            } else {
                cVar = this;
            }
        }
        int i3 = e.f4732c;
        int i10 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f4722s;
            if (i10 < i3) {
                long j3 = atomicLongFieldUpdater.get(cVar);
                if (j3 == (4611686018427387903L & atomicLongFieldUpdater2.get(cVar)) && j3 == atomicLongFieldUpdater.get(cVar)) {
                    return;
                } else {
                    i10++;
                }
            } else {
                while (true) {
                    long j10 = atomicLongFieldUpdater2.get(cVar);
                    if (atomicLongFieldUpdater2.compareAndSet(cVar, j10, (j10 & 4611686018427387903L) + 4611686018427387904L)) {
                        break;
                    } else {
                        cVar = this;
                    }
                }
                while (true) {
                    long j11 = atomicLongFieldUpdater.get(cVar);
                    long j12 = atomicLongFieldUpdater2.get(cVar);
                    long j13 = j12 & 4611686018427387903L;
                    boolean z10 = (j12 & 4611686018427387904L) != 0;
                    if (j11 == j13 && j11 == atomicLongFieldUpdater.get(cVar)) {
                        break;
                    }
                    if (z10) {
                        cVar = this;
                    } else {
                        cVar = this;
                        atomicLongFieldUpdater2.compareAndSet(cVar, j12, 4611686018427387904L + j13);
                    }
                }
                while (true) {
                    long j14 = atomicLongFieldUpdater2.get(cVar);
                    if (atomicLongFieldUpdater2.compareAndSet(cVar, j14, j14 & 4611686018427387903L)) {
                        return;
                    } else {
                        cVar = this;
                    }
                }
            }
        }
    }

    @Override // ie.g
    public final void a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        h(cancellationException, true);
    }

    @Override // ie.o
    public Object b(Object obj) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f4719e;
        boolean z10 = false;
        long j = 1152921504606846975L;
        boolean z11 = s(false, atomicLongFieldUpdater.get(this)) ? false : !g(r1 & 1152921504606846975L);
        i iVar = j.f4751a;
        if (z11) {
            return iVar;
        }
        j5.f fVar = e.j;
        k kVar = (k) f4723t.get(this);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j3 = andIncrement & j;
            boolean s3 = s(z10, andIncrement);
            int i3 = e.f4731b;
            long j10 = i3;
            long j11 = j3 / j10;
            int i10 = (int) (j3 % j10);
            if (kVar.f5999c != j11) {
                k d10 = d(this, j11, kVar);
                if (d10 != null) {
                    kVar = d10;
                } else {
                    if (s3) {
                        return new h(p());
                    }
                    z10 = false;
                    j = 1152921504606846975L;
                }
            }
            int f3 = f(this, kVar, i10, obj, j3, fVar, s3);
            if (f3 == 0) {
                kVar.a();
                return Unit.f5554a;
            }
            if (f3 == 1) {
                return Unit.f5554a;
            }
            if (f3 == 2) {
                if (s3) {
                    kVar.h();
                    return new h(p());
                }
                b2 b2Var = fVar instanceof b2 ? (b2) fVar : null;
                if (b2Var != null) {
                    b2Var.a(kVar, i10 + i3);
                }
                kVar.h();
                return iVar;
            }
            if (f3 == 3) {
                i0.l("unexpected");
                return null;
            }
            if (f3 == 4) {
                if (j3 < f4720i.get(this)) {
                    kVar.a();
                }
                return new h(p());
            }
            if (f3 == 5) {
                kVar.a();
            }
            z10 = false;
            j = 1152921504606846975L;
        }
    }

    @Override // ie.g
    public final Object c(ld.a aVar) {
        k kVar;
        c cVar = this;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4724u;
        k kVar2 = (k) atomicReferenceFieldUpdater.get(cVar);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f4719e;
            boolean z10 = true;
            if (cVar.s(true, atomicLongFieldUpdater.get(cVar))) {
                Throwable o6 = o();
                int i3 = t.f6000a;
                throw o6;
            }
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f4720i;
            long andIncrement = atomicLongFieldUpdater2.getAndIncrement(cVar);
            long j = e.f4731b;
            long j3 = andIncrement / j;
            int i10 = (int) (andIncrement % j);
            if (kVar2.f5999c != j3) {
                k m10 = cVar.m(j3, kVar2);
                if (m10 == null) {
                    continue;
                } else {
                    kVar2 = m10;
                }
            }
            Object B = cVar.B(kVar2, i10, andIncrement, null);
            a8.f fVar = e.f4740m;
            if (B == fVar) {
                i0.l("unexpected");
                return null;
            }
            a8.f fVar2 = e.f4742o;
            if (B != fVar2) {
                if (B != e.f4741n) {
                    kVar2.a();
                    return B;
                }
                ge.h n10 = a0.n(md.f.b(aVar));
                c cVar2 = this;
                try {
                    Object B2 = cVar2.B(kVar2, i10, andIncrement, n10);
                    if (B2 == fVar) {
                        n10.a(kVar2, i10);
                    } else if (B2 == fVar2) {
                        if (andIncrement < cVar2.q()) {
                            kVar2.a();
                        }
                        k kVar3 = (k) atomicReferenceFieldUpdater.get(cVar2);
                        while (true) {
                            if (cVar2.s(z10, atomicLongFieldUpdater.get(cVar2))) {
                                hd.l lVar = hd.n.f4511e;
                                n10.resumeWith(new hd.m(cVar2.o()));
                                break;
                            }
                            long andIncrement2 = atomicLongFieldUpdater2.getAndIncrement(cVar2);
                            long j10 = e.f4731b;
                            long j11 = andIncrement2 / j10;
                            int i11 = (int) (andIncrement2 % j10);
                            AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater2;
                            if (kVar3.f5999c != j11) {
                                kVar = cVar2.m(j11, kVar3);
                                if (kVar == null) {
                                    atomicLongFieldUpdater2 = atomicLongFieldUpdater3;
                                    z10 = true;
                                }
                            } else {
                                kVar = kVar3;
                            }
                            Object B3 = cVar2.B(kVar, i11, andIncrement2, n10);
                            if (B3 == e.f4740m) {
                                n10.a(kVar, i11);
                                break;
                            }
                            if (B3 == e.f4742o) {
                                if (andIncrement2 < q()) {
                                    kVar.a();
                                }
                                z10 = true;
                                cVar2 = this;
                                kVar3 = kVar;
                                atomicLongFieldUpdater2 = atomicLongFieldUpdater3;
                            } else {
                                if (B3 == e.f4741n) {
                                    throw new IllegalStateException("unexpected");
                                }
                                kVar.a();
                                n10.e(B3, null);
                            }
                        }
                    } else {
                        kVar2.a();
                        n10.e(B2, null);
                    }
                    Object r9 = n10.r();
                    md.a aVar2 = md.a.f6622d;
                    return r9;
                } catch (Throwable th) {
                    n10.z();
                    throw th;
                }
            }
            if (andIncrement < q()) {
                kVar2.a();
            }
            cVar = this;
        }
    }

    public final boolean g(long j) {
        return j < f4721r.get(this) || j < f4720i.get(this) + ((long) this.f4728d);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003c A[LOOP:2: B:17:0x003c->B:39:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e A[LOOP:3: B:22:0x006e->B:30:?, LOOP_LABEL: LOOP:3: B:22:0x006e->B:30:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004c A[LOOP:5: B:40:0x004c->B:48:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x002f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(Throwable th, boolean z10) {
        c cVar;
        a8.f fVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        boolean z11;
        long j;
        long j3;
        long j10;
        Object obj;
        long j11;
        long j12;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f4719e;
        if (z10) {
            do {
                j12 = atomicLongFieldUpdater.get(this);
                if (((int) (j12 >> 60)) == 0) {
                    k kVar = e.f4730a;
                    cVar = this;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(cVar, j12, (j12 & 1152921504606846975L) + (1 << 60)));
            fVar = e.f4746s;
            while (true) {
                atomicReferenceFieldUpdater = f4726w;
                if (!atomicReferenceFieldUpdater.compareAndSet(this, fVar, th)) {
                    z11 = true;
                    break;
                }
                if (atomicReferenceFieldUpdater.get(this) != fVar) {
                    z11 = false;
                    break;
                }
            }
            if (z10) {
                do {
                    j = atomicLongFieldUpdater.get(this);
                    int i3 = (int) (j >> 60);
                    if (i3 == 0) {
                        j3 = j & 1152921504606846975L;
                        j10 = 2;
                    } else {
                        if (i3 != 1) {
                            break;
                        }
                        j3 = j & 1152921504606846975L;
                        j10 = 3;
                    }
                } while (!atomicLongFieldUpdater.compareAndSet(cVar, j, (j10 << 60) + j3));
            } else {
                do {
                    j11 = atomicLongFieldUpdater.get(this);
                } while (!atomicLongFieldUpdater.compareAndSet(cVar, j11, (3 << 60) + (j11 & 1152921504606846975L)));
            }
            t();
            if (z11) {
                loop3: while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f4727x;
                    obj = atomicReferenceFieldUpdater2.get(this);
                    a8.f fVar2 = obj == null ? e.f4744q : e.f4745r;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, fVar2)) {
                        if (atomicReferenceFieldUpdater2.get(this) != obj) {
                            break;
                        }
                    }
                }
                if (obj != null) {
                    g0.c(1, obj);
                    ((Function1) obj).invoke(n());
                    return z11;
                }
            }
            return z11;
        }
        cVar = this;
        fVar = e.f4746s;
        while (true) {
            atomicReferenceFieldUpdater = f4726w;
            if (!atomicReferenceFieldUpdater.compareAndSet(this, fVar, th)) {
            }
        }
        if (z10) {
        }
        t();
        if (z11) {
        }
        return z11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x018f, code lost:
    
        return kotlin.Unit.f5554a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x00c0, code lost:
    
        e(r1, r4, r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:76:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0173 A[RETURN] */
    @Override // ie.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object i(Object obj, ld.a aVar) {
        int f3;
        Object r9;
        md.a aVar2;
        Object obj2;
        c cVar;
        k kVar;
        int i3;
        int i10;
        boolean z10;
        c cVar2 = this;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4723t;
        k kVar2 = (k) atomicReferenceFieldUpdater.get(cVar2);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f4719e;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(cVar2);
            long j = andIncrement & 1152921504606846975L;
            boolean s3 = cVar2.s(false, andIncrement);
            int i11 = e.f4731b;
            long j3 = i11;
            long j10 = j / j3;
            int i12 = (int) (j % j3);
            if (kVar2.f5999c != j10) {
                k d10 = d(cVar2, j10, kVar2);
                if (d10 != null) {
                    kVar2 = d10;
                } else if (s3) {
                    Object x10 = x(obj, aVar);
                    if (x10 == md.a.f6622d) {
                        return x10;
                    }
                }
            }
            int f10 = f(cVar2, kVar2, i12, obj, j, null, s3);
            if (f10 == 0) {
                kVar2.a();
                break;
            }
            if (f10 == 1) {
                break;
            }
            if (f10 != 2) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = f4720i;
                if (f10 == 3) {
                    ge.h n10 = a0.n(md.f.b(aVar));
                    Object obj3 = obj;
                    try {
                        f3 = f(cVar2, kVar2, i12, obj3, j, n10, false);
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        if (f3 == 0) {
                            kVar2.a();
                            hd.l lVar = hd.n.f4511e;
                        } else if (f3 != 1) {
                            if (f3 != 2) {
                                if (f3 != 4) {
                                    String str = "unexpected";
                                    if (f3 != 5) {
                                        throw new IllegalStateException("unexpected");
                                    }
                                    kVar2.a();
                                    k kVar3 = (k) atomicReferenceFieldUpdater.get(cVar2);
                                    while (true) {
                                        long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(cVar2);
                                        long j11 = andIncrement2 & 1152921504606846975L;
                                        boolean s10 = cVar2.s(false, andIncrement2);
                                        int i13 = e.f4731b;
                                        AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater;
                                        long j12 = i13;
                                        String str2 = str;
                                        long j13 = j11 / j12;
                                        int i14 = (int) (j11 % j12);
                                        if (kVar3.f5999c != j13) {
                                            k d11 = d(cVar2, j13, kVar3);
                                            if (d11 != null) {
                                                i3 = i13;
                                                i10 = i14;
                                                z10 = s10;
                                                kVar = d11;
                                            } else {
                                                if (s10) {
                                                    break;
                                                }
                                                atomicLongFieldUpdater = atomicLongFieldUpdater3;
                                                str = str2;
                                            }
                                        } else {
                                            kVar = kVar3;
                                            i3 = i13;
                                            i10 = i14;
                                            z10 = s10;
                                        }
                                        int f11 = f(cVar2, kVar, i10, obj3, j11, n10, z10);
                                        Object obj4 = obj3;
                                        cVar = cVar2;
                                        k kVar4 = kVar;
                                        int i15 = i10;
                                        obj2 = obj4;
                                        if (f11 == 0) {
                                            kVar4.a();
                                            hd.l lVar2 = hd.n.f4511e;
                                            break;
                                        }
                                        if (f11 == 1) {
                                            hd.l lVar3 = hd.n.f4511e;
                                            break;
                                        }
                                        if (f11 != 2) {
                                            if (f11 == 3) {
                                                throw new IllegalStateException(str2);
                                            }
                                            if (f11 != 4) {
                                                if (f11 == 5) {
                                                    kVar4.a();
                                                }
                                                kVar3 = kVar4;
                                                cVar2 = cVar;
                                                atomicLongFieldUpdater = atomicLongFieldUpdater3;
                                                str = str2;
                                                obj3 = obj2;
                                            } else if (j11 < atomicLongFieldUpdater2.get(cVar)) {
                                                kVar4.a();
                                            }
                                        } else if (z10) {
                                            kVar4.h();
                                        } else {
                                            n10.a(kVar4, i15 + i3);
                                        }
                                    }
                                } else {
                                    obj2 = obj3;
                                    cVar = cVar2;
                                    if (j < atomicLongFieldUpdater2.get(cVar)) {
                                        kVar2.a();
                                    }
                                }
                                e(cVar, obj2, n10);
                            } else {
                                n10.a(kVar2, i12 + i11);
                            }
                            r9 = n10.r();
                            aVar2 = md.a.f6622d;
                            if (r9 != aVar2) {
                                r9 = Unit.f5554a;
                            }
                            if (r9 == aVar2) {
                                return r9;
                            }
                        } else {
                            hd.l lVar4 = hd.n.f4511e;
                        }
                        n10.resumeWith(Unit.f5554a);
                        r9 = n10.r();
                        aVar2 = md.a.f6622d;
                        if (r9 != aVar2) {
                        }
                        if (r9 == aVar2) {
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        n10.z();
                        throw th;
                    }
                } else if (f10 == 4) {
                    if (j < atomicLongFieldUpdater2.get(cVar2)) {
                        kVar2.a();
                    }
                    Object x11 = x(obj, aVar);
                    if (x11 == md.a.f6622d) {
                        return x11;
                    }
                } else if (f10 == 5) {
                    kVar2.a();
                }
            } else if (s3) {
                kVar2.h();
                Object x12 = x(obj, aVar);
                if (x12 == md.a.f6622d) {
                    return x12;
                }
            }
        }
    }

    @Override // ie.g
    public final b iterator() {
        return new b(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x008d, code lost:
    
        r1 = (ie.k) ((le.c) le.c.f5968b.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final k j(long j) {
        Object obj;
        long j3;
        Object obj2 = f4725v.get(this);
        k kVar = (k) f4723t.get(this);
        if (kVar.f5999c > ((k) obj2).f5999c) {
            obj2 = kVar;
        }
        k kVar2 = (k) f4724u.get(this);
        if (kVar2.f5999c > ((k) obj2).f5999c) {
            obj2 = kVar2;
        }
        le.c cVar = (le.c) obj2;
        loop0: while (true) {
            cVar.getClass();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = le.c.f5967a;
            Object obj3 = atomicReferenceFieldUpdater.get(cVar);
            a8.f fVar = le.b.f5964a;
            obj = null;
            if (obj3 == fVar) {
                break;
            }
            le.c cVar2 = (le.c) obj3;
            if (cVar2 == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(cVar, null, fVar)) {
                    if (atomicReferenceFieldUpdater.get(cVar) != null) {
                        break;
                    }
                }
                break loop0;
            }
            cVar = cVar2;
        }
        k kVar3 = (k) cVar;
        if (u()) {
            k kVar4 = kVar3;
            loop2: do {
                int i3 = e.f4731b - 1;
                while (true) {
                    if (-1 >= i3) {
                        break;
                    }
                    j3 = (kVar4.f5999c * e.f4731b) + i3;
                    if (j3 < f4720i.get(this)) {
                        break loop2;
                    }
                    while (true) {
                        Object k10 = kVar4.k(i3);
                        if (k10 != null && k10 != e.f4734e) {
                            if (k10 == e.f4733d) {
                                break loop2;
                            }
                        } else {
                            if (kVar4.j(i3, k10, e.f4739l)) {
                                kVar4.h();
                                break;
                            }
                        }
                    }
                    i3--;
                }
            } while (kVar4 != null);
            j3 = -1;
            if (j3 != -1) {
                k(j3);
            }
        }
        loop5: for (k kVar5 = kVar3; kVar5 != null; kVar5 = (k) ((le.c) le.c.f5968b.get(kVar5))) {
            for (int i10 = e.f4731b - 1; -1 < i10; i10--) {
                if ((kVar5.f5999c * e.f4731b) + i10 < j) {
                    break loop5;
                }
                while (true) {
                    Object k11 = kVar5.k(i10);
                    if (k11 != null && k11 != e.f4734e) {
                        if (!(k11 instanceof p)) {
                            if (!(k11 instanceof b2)) {
                                break;
                            }
                            if (kVar5.j(i10, k11, e.f4739l)) {
                                obj = le.b.f(obj, k11);
                                kVar5.l(i10, true);
                                break;
                            }
                        } else {
                            if (kVar5.j(i10, k11, e.f4739l)) {
                                obj = le.b.f(obj, ((p) k11).f4756a);
                                kVar5.l(i10, true);
                                break;
                            }
                        }
                    } else {
                        if (kVar5.j(i10, k11, e.f4739l)) {
                            kVar5.h();
                            break;
                        }
                    }
                }
            }
        }
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                y((b2) obj, true);
                return kVar3;
            }
            ArrayList arrayList = (ArrayList) obj;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                y((b2) arrayList.get(size), true);
            }
        }
        return kVar3;
    }

    public final void k(long j) {
        k kVar = (k) f4724u.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f4720i;
            long j3 = atomicLongFieldUpdater.get(this);
            if (j < Math.max(this.f4728d + j3, f4721r.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j3, 1 + j3)) {
                long j10 = e.f4731b;
                long j11 = j3 / j10;
                int i3 = (int) (j3 % j10);
                if (kVar.f5999c != j11) {
                    k m10 = m(j11, kVar);
                    if (m10 != null) {
                        kVar = m10;
                    }
                }
                k kVar2 = kVar;
                if (B(kVar2, i3, j3, null) != e.f4742o) {
                    kVar2.a();
                } else if (j3 < q()) {
                    kVar2.a();
                }
                kVar = kVar2;
            }
        }
    }

    public final void l() {
        Object b10;
        if (v()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4725v;
        k kVar = (k) atomicReferenceFieldUpdater.get(this);
        loop0: while (true) {
            long andIncrement = f4721r.getAndIncrement(this);
            long j = andIncrement / e.f4731b;
            if (q() <= andIncrement) {
                if (kVar.f5999c < j && kVar.b() != null) {
                    w(j, kVar);
                }
                r(this);
                return;
            }
            if (kVar.f5999c != j) {
                d dVar = d.f4729v;
                while (true) {
                    b10 = le.b.b(kVar, j, dVar);
                    if (!le.b.e(b10)) {
                        s c10 = le.b.c(b10);
                        while (true) {
                            s sVar = (s) atomicReferenceFieldUpdater.get(this);
                            if (sVar.f5999c >= c10.f5999c) {
                                break;
                            }
                            if (!c10.i()) {
                                break;
                            }
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, sVar, c10)) {
                                if (atomicReferenceFieldUpdater.get(this) != sVar) {
                                    if (c10.e()) {
                                        c10.d();
                                    }
                                }
                            }
                            if (sVar.e()) {
                                sVar.d();
                            }
                        }
                    } else {
                        break;
                    }
                }
                k kVar2 = null;
                if (le.b.e(b10)) {
                    t();
                    w(j, kVar);
                    r(this);
                } else {
                    k kVar3 = (k) le.b.c(b10);
                    long j3 = kVar3.f5999c;
                    if (j3 > j) {
                        long j10 = j3 * e.f4731b;
                        if (f4721r.compareAndSet(this, 1 + andIncrement, j10)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = f4722s;
                            if ((atomicLongFieldUpdater.addAndGet(this, j10 - andIncrement) & 4611686018427387904L) != 0) {
                                while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0) {
                                }
                            }
                        } else {
                            r(this);
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
            int i3 = (int) (andIncrement % e.f4731b);
            Object k10 = kVar.k(i3);
            boolean z10 = k10 instanceof b2;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f4720i;
            if (!z10 || andIncrement < atomicLongFieldUpdater2.get(this) || !kVar.j(i3, k10, e.g)) {
                while (true) {
                    Object k11 = kVar.k(i3);
                    if (!(k11 instanceof b2)) {
                        if (k11 != e.j) {
                            if (k11 != null) {
                                if (k11 == e.f4733d || k11 == e.f4736h || k11 == e.f4737i || k11 == e.f4738k || k11 == e.f4739l) {
                                    break loop0;
                                } else if (k11 != e.f4735f) {
                                    r.n(k11, "Unexpected cell state: ");
                                    return;
                                }
                            } else if (kVar.j(i3, k11, e.f4734e)) {
                                break loop0;
                            }
                        } else {
                            break;
                        }
                    } else if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                        if (kVar.j(i3, k11, new p((b2) k11))) {
                            break loop0;
                        }
                    } else if (kVar.j(i3, k11, e.g)) {
                        if (A(k11)) {
                            kVar.n(i3, e.f4733d);
                            break;
                        } else {
                            kVar.n(i3, e.j);
                            kVar.h();
                        }
                    }
                }
            } else if (A(k10)) {
                kVar.n(i3, e.f4733d);
                break;
            } else {
                kVar.n(i3, e.j);
                kVar.h();
                r(this);
            }
        }
        r(this);
    }

    public final k m(long j, k kVar) {
        Object b10;
        long j3;
        k kVar2 = e.f4730a;
        d dVar = d.f4729v;
        loop0: while (true) {
            b10 = le.b.b(kVar, j, dVar);
            if (!le.b.e(b10)) {
                s c10 = le.b.c(b10);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4724u;
                    s sVar = (s) atomicReferenceFieldUpdater.get(this);
                    if (sVar.f5999c >= c10.f5999c) {
                        break loop0;
                    }
                    if (!c10.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, sVar, c10)) {
                        if (atomicReferenceFieldUpdater.get(this) != sVar) {
                            if (c10.e()) {
                                c10.d();
                            }
                        }
                    }
                    if (sVar.e()) {
                        sVar.d();
                    }
                }
            } else {
                break;
            }
        }
        if (le.b.e(b10)) {
            t();
            if (kVar.f5999c * e.f4731b < q()) {
                kVar.a();
                return null;
            }
        } else {
            k kVar3 = (k) le.b.c(b10);
            long j10 = kVar3.f5999c;
            if (!v() && j <= f4721r.get(this) / e.f4731b) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f4725v;
                    s sVar2 = (s) atomicReferenceFieldUpdater2.get(this);
                    if (sVar2.f5999c >= j10 || !kVar3.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, sVar2, kVar3)) {
                        if (atomicReferenceFieldUpdater2.get(this) != sVar2) {
                            if (kVar3.e()) {
                                kVar3.d();
                            }
                        }
                    }
                    if (sVar2.e()) {
                        sVar2.d();
                    }
                }
            }
            if (j10 <= j) {
                return kVar3;
            }
            long j11 = j10 * e.f4731b;
            do {
                j3 = f4720i.get(this);
                if (j3 >= j11) {
                    break;
                }
            } while (!f4720i.compareAndSet(this, j3, j11));
            if (j10 * e.f4731b < q()) {
                kVar3.a();
            }
        }
        return null;
    }

    public final Throwable n() {
        return (Throwable) f4726w.get(this);
    }

    public final Throwable o() {
        Throwable n10 = n();
        return n10 == null ? new l("Channel was closed") : n10;
    }

    public final Throwable p() {
        Throwable n10 = n();
        return n10 == null ? new lf("Channel was closed") : n10;
    }

    public final long q() {
        return f4719e.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x00a2, code lost:
    
        r0 = (ie.k) ((le.c) le.c.f5968b.get(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean s(boolean z10, long j) {
        int i3 = (int) (j >> 60);
        if (i3 != 0 && i3 != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f4720i;
            if (i3 == 2) {
                j(1152921504606846975L & j);
                if (z10) {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4724u;
                        k kVar = (k) atomicReferenceFieldUpdater.get(this);
                        long j3 = atomicLongFieldUpdater.get(this);
                        if (q() <= j3) {
                            break;
                        }
                        long j10 = e.f4731b;
                        long j11 = j3 / j10;
                        if (kVar.f5999c != j11 && (kVar = m(j11, kVar)) == null) {
                            if (((k) atomicReferenceFieldUpdater.get(this)).f5999c < j11) {
                                break;
                            }
                        } else {
                            kVar.a();
                            int i10 = (int) (j3 % j10);
                            while (true) {
                                Object k10 = kVar.k(i10);
                                if (k10 == null || k10 == e.f4734e) {
                                    if (kVar.j(i10, k10, e.f4736h)) {
                                        l();
                                        break;
                                    }
                                } else {
                                    if (k10 == e.f4733d) {
                                        break;
                                    }
                                    if (k10 != e.j) {
                                        if (k10 != e.f4739l) {
                                            if (k10 != e.f4737i) {
                                                if (k10 != e.f4736h) {
                                                    if (k10 == e.g) {
                                                        break;
                                                    }
                                                    if (k10 != e.f4735f && j3 == atomicLongFieldUpdater.get(this)) {
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            f4720i.compareAndSet(this, j3, j3 + 1);
                        }
                    }
                }
            } else {
                if (i3 != 3) {
                    throw new IllegalStateException(v4.a.j(i3, "unexpected close status: ").toString());
                }
                k j12 = j(1152921504606846975L & j);
                Object obj = null;
                loop0: do {
                    int i11 = e.f4731b - 1;
                    while (true) {
                        if (-1 >= i11) {
                            break;
                        }
                        long j13 = (j12.f5999c * e.f4731b) + i11;
                        while (true) {
                            Object k11 = j12.k(i11);
                            if (k11 == e.f4737i) {
                                break loop0;
                            }
                            if (k11 == e.f4733d) {
                                if (j13 < atomicLongFieldUpdater.get(this)) {
                                    break loop0;
                                }
                                if (j12.j(i11, k11, e.f4739l)) {
                                    j12.m(i11, null);
                                    j12.h();
                                    break;
                                }
                            } else if (k11 != e.f4734e && k11 != null) {
                                if (!(k11 instanceof b2) && !(k11 instanceof p)) {
                                    a8.f fVar = e.g;
                                    if (k11 == fVar || k11 == e.f4735f) {
                                        break loop0;
                                    }
                                    if (k11 != fVar) {
                                        break;
                                    }
                                } else {
                                    if (j13 < atomicLongFieldUpdater.get(this)) {
                                        break loop0;
                                    }
                                    b2 b2Var = k11 instanceof p ? ((p) k11).f4756a : (b2) k11;
                                    if (j12.j(i11, k11, e.f4739l)) {
                                        obj = le.b.f(obj, b2Var);
                                        j12.m(i11, null);
                                        j12.h();
                                        break;
                                    }
                                }
                            } else if (j12.j(i11, k11, e.f4739l)) {
                                j12.h();
                                break;
                            }
                        }
                        i11--;
                    }
                } while (j12 != null);
                if (obj != null) {
                    if (obj instanceof ArrayList) {
                        ArrayList arrayList = (ArrayList) obj;
                        for (int size = arrayList.size() - 1; -1 < size; size--) {
                            y((b2) arrayList.get(size), false);
                        }
                    } else {
                        y((b2) obj, false);
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean t() {
        return s(false, f4719e.get(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x0198, code lost:
    
        r16 = r7;
        r3 = (ie.k) r3.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01a1, code lost:
    
        if (r3 != null) goto L85;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        boolean z10;
        String str;
        StringBuilder sb2 = new StringBuilder();
        int i3 = (int) (f4719e.get(this) >> 60);
        if (i3 == 2) {
            sb2.append("closed,");
        } else if (i3 == 3) {
            sb2.append("cancelled,");
        }
        sb2.append("capacity=" + this.f4728d + ',');
        sb2.append("data=[");
        int i10 = 0;
        boolean z11 = true;
        List f3 = y.f(f4724u.get(this), f4723t.get(this), f4725v.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj : f3) {
            if (((k) obj) != e.f4730a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            i0.c();
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j = ((k) next).f5999c;
            do {
                Object next2 = it.next();
                long j3 = ((k) next2).f5999c;
                if (j > j3) {
                    next = next2;
                    j = j3;
                }
            } while (it.hasNext());
        }
        k kVar = (k) next;
        long j10 = f4720i.get(this);
        long q3 = q();
        loop2: while (true) {
            int i11 = e.f4731b;
            int i12 = i10;
            while (true) {
                if (i12 >= i11) {
                    break;
                }
                long j11 = (kVar.f5999c * e.f4731b) + i12;
                if (j11 >= q3 && j11 >= j10) {
                    break loop2;
                }
                Object k10 = kVar.k(i12);
                boolean z12 = z11;
                Object obj2 = kVar.f4753f.get(i12 * 2);
                if (k10 instanceof ge.f) {
                    str = (q3 > j11 || j11 >= j10) ? (j10 > j11 || j11 >= q3) ? "cont" : "send" : "receive";
                } else if (k10 instanceof p) {
                    str = "EB(" + k10 + ')';
                } else if (Intrinsics.a(k10, e.f4735f) || Intrinsics.a(k10, e.g)) {
                    str = "resuming_sender";
                } else {
                    if (k10 != null && !k10.equals(e.f4734e) && !k10.equals(e.f4737i) && !k10.equals(e.f4736h) && !k10.equals(e.f4738k) && !k10.equals(e.j) && !k10.equals(e.f4739l)) {
                        str = k10.toString();
                    }
                    i12++;
                    z11 = z12;
                }
                if (obj2 != null) {
                    sb2.append("(" + str + ',' + obj2 + "),");
                } else {
                    sb2.append(str + ',');
                }
                i12++;
                z11 = z12;
            }
            z11 = z10;
            i10 = 0;
        }
        if (sb2.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        if (sb2.charAt(sb2.length() - 1) == ',') {
            sb2.deleteCharAt(sb2.length() - 1).getClass();
        }
        sb2.append("]");
        return sb2.toString();
    }

    public boolean u() {
        return false;
    }

    public final boolean v() {
        long j = f4721r.get(this);
        return j == 0 || j == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w(long j, k kVar) {
        k kVar2;
        k kVar3;
        while (kVar.f5999c < j && (kVar3 = (k) kVar.b()) != null) {
            kVar = kVar3;
        }
        while (true) {
            if (!kVar.c() || (kVar2 = (k) kVar.b()) == null) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4725v;
                    s sVar = (s) atomicReferenceFieldUpdater.get(this);
                    if (sVar.f5999c >= kVar.f5999c) {
                        return;
                    }
                    if (!kVar.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, sVar, kVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != sVar) {
                            if (kVar.e()) {
                                kVar.d();
                            }
                        }
                    }
                    if (sVar.e()) {
                        sVar.d();
                        return;
                    }
                    return;
                }
            }
            kVar = kVar2;
        }
    }

    public final Object x(Object obj, ld.a aVar) {
        ge.h hVar = new ge.h(1, md.f.b(aVar));
        hVar.s();
        Throwable p4 = p();
        hd.l lVar = hd.n.f4511e;
        hVar.resumeWith(new hd.m(p4));
        Object r9 = hVar.r();
        return r9 == md.a.f6622d ? r9 : Unit.f5554a;
    }

    public final void y(b2 b2Var, boolean z10) {
        if (b2Var instanceof ge.f) {
            ld.a aVar = (ld.a) b2Var;
            hd.l lVar = hd.n.f4511e;
            aVar.resumeWith(new hd.m(z10 ? o() : p()));
            return;
        }
        if (!(b2Var instanceof b)) {
            r.n(b2Var, "Unexpected waiter: ");
            return;
        }
        b bVar = (b) b2Var;
        ge.h hVar = bVar.f4717e;
        hVar.getClass();
        bVar.f4717e = null;
        bVar.f4716d = e.f4739l;
        Throwable n10 = bVar.f4718i.n();
        if (n10 == null) {
            hd.l lVar2 = hd.n.f4511e;
            hVar.resumeWith(Boolean.FALSE);
        } else {
            hd.l lVar3 = hd.n.f4511e;
            hVar.resumeWith(new hd.m(n10));
        }
    }

    public final boolean z(Object obj, Object obj2) {
        if (!(obj instanceof b)) {
            if (!(obj instanceof ge.f)) {
                r.n(obj, "Unexpected receiver type: ");
                return false;
            }
            ge.f fVar = (ge.f) obj;
            k kVar = e.f4730a;
            a8.f f3 = fVar.f(obj2, null);
            if (f3 == null) {
                return false;
            }
            fVar.g(f3);
            return true;
        }
        b bVar = (b) obj;
        ge.h hVar = bVar.f4717e;
        hVar.getClass();
        bVar.f4717e = null;
        bVar.f4716d = obj2;
        Boolean bool = Boolean.TRUE;
        bVar.f4718i.getClass();
        k kVar2 = e.f4730a;
        a8.f f10 = hVar.f(bool, null);
        if (f10 == null) {
            return false;
        }
        hVar.g(f10);
        return true;
    }
}
