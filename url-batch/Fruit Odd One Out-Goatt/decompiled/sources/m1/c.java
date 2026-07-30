package m1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k1.y0;
import p1.u;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public class c implements g {

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f843c = AtomicLongFieldUpdater.newUpdater(c.class, "sendersAndCloseStatus");

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f844d = AtomicLongFieldUpdater.newUpdater(c.class, "receivers");

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f845e = AtomicLongFieldUpdater.newUpdater(c.class, "bufferEnd");

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f846f = AtomicLongFieldUpdater.newUpdater(c.class, "completedExpandBuffersAndPauseFlag");

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f847g = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "sendSegment");

    /* renamed from: h, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f848h = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "receiveSegment");

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f849i = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "bufferEndSegment");

    /* renamed from: j, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f850j = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_closeCause");

    /* renamed from: k, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f851k = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "closeHandler");
    private volatile Object _closeCause;

    /* renamed from: b, reason: collision with root package name */
    public final int f852b;
    private volatile long bufferEnd;
    private volatile Object bufferEndSegment;
    private volatile Object closeHandler;
    private volatile long completedExpandBuffersAndPauseFlag;
    private volatile Object receiveSegment;
    private volatile long receivers;
    private volatile Object sendSegment;
    private volatile long sendersAndCloseStatus;

    public c(int i2) {
        this.f852b = i2;
        if (i2 < 0) {
            f0.l.d("Invalid channel capacity: ", i2, ", should be >=0");
            throw null;
        }
        k kVar = e.f854a;
        this.bufferEnd = i2 != 0 ? i2 != Integer.MAX_VALUE ? i2 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag = f845e.get(this);
        k kVar2 = new k(0L, null, this, 3);
        this.sendSegment = kVar2;
        this.receiveSegment = kVar2;
        if (r()) {
            kVar2 = e.f854a;
            kVar2.getClass();
        }
        this.bufferEndSegment = kVar2;
        this._closeCause = e.f871s;
    }

    public static final k a(c cVar, long j2, k kVar) {
        Object a2;
        c cVar2;
        k kVar2 = e.f854a;
        d dVar = d.f853j;
        loop0: while (true) {
            a2 = p1.a.a(j2, kVar);
            if (!p1.a.d(a2)) {
                u b2 = p1.a.b(a2);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f847g;
                    u uVar = (u) atomicReferenceFieldUpdater.get(cVar);
                    if (uVar.f1075c >= b2.f1075c) {
                        break loop0;
                    }
                    if (!b2.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(cVar, uVar, b2)) {
                        if (atomicReferenceFieldUpdater.get(cVar) != uVar) {
                            if (b2.e()) {
                                b2.d();
                            }
                        }
                    }
                    if (uVar.e()) {
                        uVar.d();
                    }
                }
            } else {
                break;
            }
        }
        boolean d2 = p1.a.d(a2);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f844d;
        if (d2) {
            cVar.p();
            if (kVar.f1075c * e.f855b < atomicLongFieldUpdater.get(cVar)) {
                kVar.a();
                return null;
            }
        } else {
            k kVar3 = (k) p1.a.b(a2);
            long j3 = kVar3.f1075c;
            if (j3 <= j2) {
                return kVar3;
            }
            long j4 = e.f855b * j3;
            while (true) {
                long j5 = f843c.get(cVar);
                long j6 = 1152921504606846975L & j5;
                if (j6 >= j4) {
                    cVar2 = cVar;
                    break;
                }
                cVar2 = cVar;
                if (f843c.compareAndSet(cVar2, j5, (((int) (j5 >> 60)) << 60) + j6)) {
                    break;
                }
                cVar = cVar2;
            }
            if (j3 * e.f855b < atomicLongFieldUpdater.get(cVar2)) {
                kVar3.a();
            }
        }
        return null;
    }

    public static final int b(c cVar, k kVar, int i2, Object obj, long j2, Object obj2, boolean z2) {
        kVar.m(i2, obj);
        if (z2) {
            return cVar.x(kVar, i2, obj, j2, obj2, z2);
        }
        Object k2 = kVar.k(i2);
        if (k2 == null) {
            if (cVar.d(j2)) {
                if (kVar.j(i2, null, e.f857d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (kVar.j(i2, null, obj2)) {
                    return 2;
                }
            }
        } else if (k2 instanceof y0) {
            kVar.m(i2, null);
            if (cVar.u(k2, obj)) {
                kVar.n(i2, e.f862i);
                return 0;
            }
            o0.a aVar = e.f864k;
            if (kVar.f878f.getAndSet((i2 * 2) + 1, aVar) == aVar) {
                return 5;
            }
            kVar.l(i2, true);
            return 5;
        }
        return cVar.x(kVar, i2, obj, j2, obj2, z2);
    }

    public static void n(c cVar) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f846f;
        if ((atomicLongFieldUpdater.addAndGet(cVar, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(cVar) & 4611686018427387904L) != 0) {
            }
        }
    }

    public static boolean v(Object obj) {
        if (obj instanceof k1.d) {
            return e.a((k1.d) obj, t0.g.f1178a, null);
        }
        f0.l.f("Unexpected waiter: ", obj);
        return false;
    }

    @Override // m1.r
    public Object c(Object obj) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f843c;
        boolean z2 = false;
        long j2 = 1152921504606846975L;
        boolean z3 = o(atomicLongFieldUpdater.get(this), false) ? false : !d(r1 & 1152921504606846975L);
        i iVar = j.f876a;
        if (z3) {
            return iVar;
        }
        Object obj2 = e.f863j;
        k kVar = (k) f847g.get(this);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j3 = andIncrement & j2;
            boolean o2 = o(andIncrement, z2);
            int i2 = e.f855b;
            long j4 = i2;
            long j5 = j3 / j4;
            int i3 = (int) (j3 % j4);
            if (kVar.f1075c != j5) {
                k a2 = a(this, j5, kVar);
                if (a2 != null) {
                    kVar = a2;
                } else {
                    if (o2) {
                        return new h(l());
                    }
                    z2 = false;
                    j2 = 1152921504606846975L;
                }
            }
            int b2 = b(this, kVar, i3, obj, j3, obj2, o2);
            t0.g gVar = t0.g.f1178a;
            if (b2 == 0) {
                kVar.a();
                return gVar;
            }
            if (b2 == 1) {
                return gVar;
            }
            if (b2 == 2) {
                if (o2) {
                    kVar.h();
                    return new h(l());
                }
                y0 y0Var = obj2 instanceof y0 ? (y0) obj2 : null;
                if (y0Var != null) {
                    y0Var.a(kVar, i3 + i2);
                }
                kVar.h();
                return iVar;
            }
            if (b2 == 3) {
                f0.l.b("unexpected");
                return null;
            }
            if (b2 == 4) {
                if (j3 < f844d.get(this)) {
                    kVar.a();
                }
                return new h(l());
            }
            if (b2 == 5) {
                kVar.a();
            }
            z2 = false;
            j2 = 1152921504606846975L;
        }
    }

    public final boolean d(long j2) {
        return j2 < f845e.get(this) || j2 < f844d.get(this) + ((long) this.f852b);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003c A[LOOP:2: B:17:0x003c->B:39:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e A[LOOP:3: B:22:0x006e->B:30:?, LOOP_LABEL: LOOP:3: B:22:0x006e->B:30:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004c A[LOOP:5: B:40:0x004c->B:48:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x002f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e(Throwable th, boolean z2) {
        c cVar;
        o0.a aVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        boolean z3;
        long j2;
        long j3;
        long j4;
        Object obj;
        long j5;
        long j6;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f843c;
        if (z2) {
            do {
                j6 = atomicLongFieldUpdater.get(this);
                if (((int) (j6 >> 60)) == 0) {
                    k kVar = e.f854a;
                    cVar = this;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(cVar, j6, (j6 & 1152921504606846975L) + (1 << 60)));
            aVar = e.f871s;
            while (true) {
                atomicReferenceFieldUpdater = f850j;
                if (!atomicReferenceFieldUpdater.compareAndSet(this, aVar, th)) {
                    z3 = true;
                    break;
                }
                if (atomicReferenceFieldUpdater.get(this) != aVar) {
                    z3 = false;
                    break;
                }
            }
            if (z2) {
                do {
                    j2 = atomicLongFieldUpdater.get(this);
                    int i2 = (int) (j2 >> 60);
                    if (i2 == 0) {
                        j3 = j2 & 1152921504606846975L;
                        j4 = 2;
                    } else {
                        if (i2 != 1) {
                            break;
                        }
                        j3 = j2 & 1152921504606846975L;
                        j4 = 3;
                    }
                } while (!atomicLongFieldUpdater.compareAndSet(cVar, j2, (j4 << 60) + j3));
            } else {
                do {
                    j5 = atomicLongFieldUpdater.get(this);
                } while (!atomicLongFieldUpdater.compareAndSet(cVar, j5, (3 << 60) + (j5 & 1152921504606846975L)));
            }
            p();
            if (z3) {
                loop3: while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f851k;
                    obj = atomicReferenceFieldUpdater2.get(this);
                    o0.a aVar2 = obj == null ? e.f869q : e.f870r;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, aVar2)) {
                        if (atomicReferenceFieldUpdater2.get(this) != obj) {
                            break;
                        }
                    }
                }
                if (obj != null) {
                    d1.n.a(1, obj);
                    ((c1.l) obj).h(k());
                    return z3;
                }
            }
            return z3;
        }
        cVar = this;
        aVar = e.f871s;
        while (true) {
            atomicReferenceFieldUpdater = f850j;
            if (!atomicReferenceFieldUpdater.compareAndSet(this, aVar, th)) {
            }
        }
        if (z2) {
        }
        p();
        if (z3) {
        }
        return z3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x008d, code lost:
    
        r1 = (m1.k) ((p1.d) p1.d.f1042b.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final k f(long j2) {
        Object obj;
        long j3;
        Object obj2 = f849i.get(this);
        k kVar = (k) f847g.get(this);
        if (kVar.f1075c > ((k) obj2).f1075c) {
            obj2 = kVar;
        }
        k kVar2 = (k) f848h.get(this);
        if (kVar2.f1075c > ((k) obj2).f1075c) {
            obj2 = kVar2;
        }
        p1.d dVar = (p1.d) obj2;
        loop0: while (true) {
            dVar.getClass();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = p1.d.f1041a;
            Object obj3 = atomicReferenceFieldUpdater.get(dVar);
            o0.a aVar = p1.a.f1034b;
            obj = null;
            if (obj3 == aVar) {
                break;
            }
            p1.d dVar2 = (p1.d) obj3;
            if (dVar2 == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(dVar, null, aVar)) {
                    if (atomicReferenceFieldUpdater.get(dVar) != null) {
                        break;
                    }
                }
                break loop0;
            }
            dVar = dVar2;
        }
        k kVar3 = (k) dVar;
        if (q()) {
            k kVar4 = kVar3;
            loop2: do {
                int i2 = e.f855b - 1;
                while (true) {
                    if (-1 >= i2) {
                        break;
                    }
                    j3 = (kVar4.f1075c * e.f855b) + i2;
                    if (j3 < f844d.get(this)) {
                        break loop2;
                    }
                    while (true) {
                        Object k2 = kVar4.k(i2);
                        if (k2 != null && k2 != e.f858e) {
                            if (k2 == e.f857d) {
                                break loop2;
                            }
                        } else {
                            if (kVar4.j(i2, k2, e.f865l)) {
                                kVar4.h();
                                break;
                            }
                        }
                    }
                    i2--;
                }
            } while (kVar4 != null);
            j3 = -1;
            if (j3 != -1) {
                h(j3);
            }
        }
        loop5: for (k kVar5 = kVar3; kVar5 != null; kVar5 = (k) ((p1.d) p1.d.f1042b.get(kVar5))) {
            for (int i3 = e.f855b - 1; -1 < i3; i3--) {
                if ((kVar5.f1075c * e.f855b) + i3 < j2) {
                    break loop5;
                }
                while (true) {
                    Object k3 = kVar5.k(i3);
                    if (k3 != null && k3 != e.f858e) {
                        if (!(k3 instanceof s)) {
                            if (!(k3 instanceof y0)) {
                                break;
                            }
                            if (kVar5.j(i3, k3, e.f865l)) {
                                obj = p1.a.e(obj, k3);
                                kVar5.l(i3, true);
                                break;
                            }
                        } else {
                            if (kVar5.j(i3, k3, e.f865l)) {
                                obj = p1.a.e(obj, ((s) k3).f885a);
                                kVar5.l(i3, true);
                                break;
                            }
                        }
                    } else {
                        if (kVar5.j(i3, k3, e.f865l)) {
                            kVar5.h();
                            break;
                        }
                    }
                }
            }
        }
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                t((y0) obj, true);
                return kVar3;
            }
            ArrayList arrayList = (ArrayList) obj;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                t((y0) arrayList.get(size), true);
            }
        }
        return kVar3;
    }

    @Override // m1.g
    public final void g(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        e(cancellationException, true);
    }

    public final void h(long j2) {
        k kVar = (k) f848h.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f844d;
            long j3 = atomicLongFieldUpdater.get(this);
            if (j2 < Math.max(this.f852b + j3, f845e.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j3, 1 + j3)) {
                long j4 = e.f855b;
                long j5 = j3 / j4;
                int i2 = (int) (j3 % j4);
                if (kVar.f1075c != j5) {
                    k j6 = j(j5, kVar);
                    if (j6 != null) {
                        kVar = j6;
                    }
                }
                k kVar2 = kVar;
                if (w(kVar2, i2, j3, null) != e.f867o) {
                    kVar2.a();
                } else if (j3 < m()) {
                    kVar2.a();
                }
                kVar = kVar2;
            }
        }
    }

    public final void i() {
        Object a2;
        if (r()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f849i;
        k kVar = (k) atomicReferenceFieldUpdater.get(this);
        loop0: while (true) {
            long andIncrement = f845e.getAndIncrement(this);
            long j2 = andIncrement / e.f855b;
            if (m() <= andIncrement) {
                if (kVar.f1075c < j2 && kVar.b() != null) {
                    s(j2, kVar);
                }
                n(this);
                return;
            }
            if (kVar.f1075c != j2) {
                d dVar = d.f853j;
                while (true) {
                    a2 = p1.a.a(j2, kVar);
                    if (!p1.a.d(a2)) {
                        u b2 = p1.a.b(a2);
                        while (true) {
                            u uVar = (u) atomicReferenceFieldUpdater.get(this);
                            if (uVar.f1075c >= b2.f1075c) {
                                break;
                            }
                            if (!b2.i()) {
                                break;
                            }
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, uVar, b2)) {
                                if (atomicReferenceFieldUpdater.get(this) != uVar) {
                                    if (b2.e()) {
                                        b2.d();
                                    }
                                }
                            }
                            if (uVar.e()) {
                                uVar.d();
                            }
                        }
                    } else {
                        break;
                    }
                }
                k kVar2 = null;
                if (p1.a.d(a2)) {
                    p();
                    s(j2, kVar);
                    n(this);
                } else {
                    k kVar3 = (k) p1.a.b(a2);
                    long j3 = kVar3.f1075c;
                    if (j3 > j2) {
                        long j4 = j3 * e.f855b;
                        if (f845e.compareAndSet(this, 1 + andIncrement, j4)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = f846f;
                            if ((atomicLongFieldUpdater.addAndGet(this, j4 - andIncrement) & 4611686018427387904L) != 0) {
                                while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0) {
                                }
                            }
                        } else {
                            n(this);
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
            int i2 = (int) (andIncrement % e.f855b);
            Object k2 = kVar.k(i2);
            boolean z2 = k2 instanceof y0;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f844d;
            if (!z2 || andIncrement < atomicLongFieldUpdater2.get(this) || !kVar.j(i2, k2, e.f860g)) {
                while (true) {
                    Object k3 = kVar.k(i2);
                    if (!(k3 instanceof y0)) {
                        if (k3 != e.f863j) {
                            if (k3 != null) {
                                if (k3 == e.f857d || k3 == e.f861h || k3 == e.f862i || k3 == e.f864k || k3 == e.f865l) {
                                    break loop0;
                                } else if (k3 != e.f859f) {
                                    f0.l.f("Unexpected cell state: ", k3);
                                    return;
                                }
                            } else if (kVar.j(i2, k3, e.f858e)) {
                                break loop0;
                            }
                        } else {
                            break;
                        }
                    } else if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                        if (kVar.j(i2, k3, new s((y0) k3))) {
                            break loop0;
                        }
                    } else if (kVar.j(i2, k3, e.f860g)) {
                        if (v(k3)) {
                            kVar.n(i2, e.f857d);
                            break;
                        } else {
                            kVar.n(i2, e.f863j);
                            kVar.h();
                        }
                    }
                }
            } else if (v(k2)) {
                kVar.n(i2, e.f857d);
                break;
            } else {
                kVar.n(i2, e.f863j);
                kVar.h();
                n(this);
            }
        }
        n(this);
    }

    public final k j(long j2, k kVar) {
        Object a2;
        long j3;
        k kVar2 = e.f854a;
        d dVar = d.f853j;
        loop0: while (true) {
            a2 = p1.a.a(j2, kVar);
            if (!p1.a.d(a2)) {
                u b2 = p1.a.b(a2);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f848h;
                    u uVar = (u) atomicReferenceFieldUpdater.get(this);
                    if (uVar.f1075c >= b2.f1075c) {
                        break loop0;
                    }
                    if (!b2.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, uVar, b2)) {
                        if (atomicReferenceFieldUpdater.get(this) != uVar) {
                            if (b2.e()) {
                                b2.d();
                            }
                        }
                    }
                    if (uVar.e()) {
                        uVar.d();
                    }
                }
            } else {
                break;
            }
        }
        if (p1.a.d(a2)) {
            p();
            if (kVar.f1075c * e.f855b < m()) {
                kVar.a();
                return null;
            }
        } else {
            k kVar3 = (k) p1.a.b(a2);
            long j4 = kVar3.f1075c;
            if (!r() && j2 <= f845e.get(this) / e.f855b) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f849i;
                    u uVar2 = (u) atomicReferenceFieldUpdater2.get(this);
                    if (uVar2.f1075c >= j4 || !kVar3.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, uVar2, kVar3)) {
                        if (atomicReferenceFieldUpdater2.get(this) != uVar2) {
                            if (kVar3.e()) {
                                kVar3.d();
                            }
                        }
                    }
                    if (uVar2.e()) {
                        uVar2.d();
                    }
                }
            }
            if (j4 <= j2) {
                return kVar3;
            }
            long j5 = j4 * e.f855b;
            do {
                j3 = f844d.get(this);
                if (j3 >= j5) {
                    break;
                }
            } while (!f844d.compareAndSet(this, j3, j5));
            if (j4 * e.f855b < m()) {
                kVar3.a();
            }
        }
        return null;
    }

    public final Throwable k() {
        return (Throwable) f850j.get(this);
    }

    public final Throwable l() {
        Throwable k2 = k();
        return k2 == null ? new m("Channel was closed") : k2;
    }

    public final long m() {
        return f843c.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x00a2, code lost:
    
        r0 = (m1.k) ((p1.d) p1.d.f1042b.get(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean o(long j2, boolean z2) {
        int i2 = (int) (j2 >> 60);
        if (i2 != 0 && i2 != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f844d;
            if (i2 == 2) {
                f(1152921504606846975L & j2);
                if (z2) {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f848h;
                        k kVar = (k) atomicReferenceFieldUpdater.get(this);
                        long j3 = atomicLongFieldUpdater.get(this);
                        if (m() <= j3) {
                            break;
                        }
                        long j4 = e.f855b;
                        long j5 = j3 / j4;
                        if (kVar.f1075c != j5 && (kVar = j(j5, kVar)) == null) {
                            if (((k) atomicReferenceFieldUpdater.get(this)).f1075c < j5) {
                                break;
                            }
                        } else {
                            kVar.a();
                            int i3 = (int) (j3 % j4);
                            while (true) {
                                Object k2 = kVar.k(i3);
                                if (k2 == null || k2 == e.f858e) {
                                    if (kVar.j(i3, k2, e.f861h)) {
                                        i();
                                        break;
                                    }
                                } else {
                                    if (k2 == e.f857d) {
                                        break;
                                    }
                                    if (k2 != e.f863j) {
                                        if (k2 != e.f865l) {
                                            if (k2 != e.f862i) {
                                                if (k2 != e.f861h) {
                                                    if (k2 == e.f860g) {
                                                        break;
                                                    }
                                                    if (k2 != e.f859f && j3 == atomicLongFieldUpdater.get(this)) {
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            f844d.compareAndSet(this, j3, j3 + 1);
                        }
                    }
                }
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException(("unexpected close status: " + i2).toString());
                }
                k f2 = f(1152921504606846975L & j2);
                Object obj = null;
                loop0: do {
                    int i4 = e.f855b - 1;
                    while (true) {
                        if (-1 >= i4) {
                            break;
                        }
                        long j6 = (f2.f1075c * e.f855b) + i4;
                        while (true) {
                            Object k3 = f2.k(i4);
                            if (k3 == e.f862i) {
                                break loop0;
                            }
                            if (k3 == e.f857d) {
                                if (j6 < atomicLongFieldUpdater.get(this)) {
                                    break loop0;
                                }
                                if (f2.j(i4, k3, e.f865l)) {
                                    f2.m(i4, null);
                                    f2.h();
                                    break;
                                }
                            } else if (k3 != e.f858e && k3 != null) {
                                if (!(k3 instanceof y0) && !(k3 instanceof s)) {
                                    o0.a aVar = e.f860g;
                                    if (k3 == aVar || k3 == e.f859f) {
                                        break loop0;
                                    }
                                    if (k3 != aVar) {
                                        break;
                                    }
                                } else {
                                    if (j6 < atomicLongFieldUpdater.get(this)) {
                                        break loop0;
                                    }
                                    y0 y0Var = k3 instanceof s ? ((s) k3).f885a : (y0) k3;
                                    if (f2.j(i4, k3, e.f865l)) {
                                        obj = p1.a.e(obj, y0Var);
                                        f2.m(i4, null);
                                        f2.h();
                                        break;
                                    }
                                }
                            } else if (f2.j(i4, k3, e.f865l)) {
                                f2.h();
                                break;
                            }
                        }
                        i4--;
                    }
                } while (f2 != null);
                if (obj != null) {
                    if (obj instanceof ArrayList) {
                        ArrayList arrayList = (ArrayList) obj;
                        for (int size = arrayList.size() - 1; -1 < size; size--) {
                            t((y0) arrayList.get(size), false);
                        }
                    } else {
                        t((y0) obj, false);
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean p() {
        return o(f843c.get(this), false);
    }

    public boolean q() {
        return false;
    }

    public final boolean r() {
        long j2 = f845e.get(this);
        return j2 == 0 || j2 == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s(long j2, k kVar) {
        k kVar2;
        k kVar3;
        while (kVar.f1075c < j2 && (kVar3 = (k) kVar.b()) != null) {
            kVar = kVar3;
        }
        while (true) {
            if (!kVar.c() || (kVar2 = (k) kVar.b()) == null) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f849i;
                    u uVar = (u) atomicReferenceFieldUpdater.get(this);
                    if (uVar.f1075c >= kVar.f1075c) {
                        return;
                    }
                    if (!kVar.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, uVar, kVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != uVar) {
                            if (kVar.e()) {
                                kVar.d();
                            }
                        }
                    }
                    if (uVar.e()) {
                        uVar.d();
                        return;
                    }
                    return;
                }
            }
            kVar = kVar2;
        }
    }

    public final void t(y0 y0Var, boolean z2) {
        Throwable l2;
        if (y0Var instanceof k1.d) {
            v0.d dVar = (v0.d) y0Var;
            if (z2) {
                l2 = k();
                if (l2 == null) {
                    l2 = new l("Channel was closed");
                }
            } else {
                l2 = l();
            }
            dVar.f(new t0.c(l2));
            return;
        }
        if (!(y0Var instanceof a)) {
            f0.l.f("Unexpected waiter: ", y0Var);
            return;
        }
        a aVar = (a) y0Var;
        k1.d dVar2 = aVar.f841c;
        dVar2.getClass();
        aVar.f841c = null;
        aVar.f840b = e.f865l;
        Throwable k2 = aVar.f842d.k();
        if (k2 == null) {
            dVar2.f(Boolean.FALSE);
        } else {
            dVar2.f(new t0.c(k2));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:94:0x01ad, code lost:
    
        r16 = r7;
        r3 = (m1.k) r3.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01b6, code lost:
    
        if (r3 != null) goto L88;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        boolean z2;
        String obj;
        StringBuilder sb = new StringBuilder();
        int i2 = (int) (f843c.get(this) >> 60);
        if (i2 == 2) {
            sb.append("closed,");
        } else if (i2 == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.f852b + ',');
        sb.append("data=[");
        int i3 = 0;
        boolean z3 = true;
        List asList = Arrays.asList(f848h.get(this), f847g.get(this), f849i.get(this));
        asList.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : asList) {
            if (((k) obj2) != e.f854a) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j2 = ((k) next).f1075c;
            do {
                Object next2 = it.next();
                long j3 = ((k) next2).f1075c;
                if (j2 > j3) {
                    next = next2;
                    j2 = j3;
                }
            } while (it.hasNext());
        }
        k kVar = (k) next;
        long j4 = f844d.get(this);
        long m = m();
        loop2: while (true) {
            int i4 = e.f855b;
            int i5 = i3;
            while (true) {
                if (i5 >= i4) {
                    break;
                }
                long j5 = (kVar.f1075c * e.f855b) + i5;
                if (j5 >= m && j5 >= j4) {
                    break loop2;
                }
                Object k2 = kVar.k(i5);
                boolean z4 = z3;
                Object obj3 = kVar.f878f.get(i5 * 2);
                if (k2 instanceof k1.d) {
                    obj = (j5 >= j4 || j5 < m) ? (j5 >= m || j5 < j4) ? "cont" : "send" : "receive";
                } else if (k2 instanceof s) {
                    obj = "EB(" + k2 + ')';
                } else if (d1.h.a(k2, e.f859f) ? z4 : d1.h.a(k2, e.f860g)) {
                    obj = "resuming_sender";
                } else if (k2 == null ? z4 : k2.equals(e.f858e) ? z4 : d1.h.a(k2, e.f862i) ? z4 : d1.h.a(k2, e.f861h) ? z4 : d1.h.a(k2, e.f864k) ? z4 : d1.h.a(k2, e.f863j) ? z4 : d1.h.a(k2, e.f865l)) {
                    i5++;
                    z3 = z4;
                } else {
                    obj = k2.toString();
                }
                if (obj3 != null) {
                    sb.append("(" + obj + ',' + obj3 + "),");
                } else {
                    sb.append(obj + ',');
                }
                i5++;
                z3 = z4;
            }
            z3 = z2;
            i3 = 0;
        }
        if (sb.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        if (sb.charAt(sb.length() - 1) == ',') {
            sb.deleteCharAt(sb.length() - 1).getClass();
        }
        sb.append("]");
        return sb.toString();
    }

    public final boolean u(Object obj, Object obj2) {
        if (!(obj instanceof a)) {
            if (obj instanceof k1.d) {
                return e.a((k1.d) obj, obj2, null);
            }
            f0.l.f("Unexpected receiver type: ", obj);
            return false;
        }
        a aVar = (a) obj;
        k1.d dVar = aVar.f841c;
        dVar.getClass();
        aVar.f841c = null;
        aVar.f840b = obj2;
        return e.a(dVar, Boolean.TRUE, null);
    }

    public final Object w(k kVar, int i2, long j2, a aVar) {
        AtomicReferenceArray atomicReferenceArray = kVar.f878f;
        Object k2 = kVar.k(i2);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f843c;
        if (k2 == null) {
            if (j2 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (aVar == null) {
                    return e.f866n;
                }
                if (kVar.j(i2, k2, aVar)) {
                    i();
                    return e.m;
                }
            }
        } else if (k2 == e.f857d && kVar.j(i2, k2, e.f862i)) {
            i();
            Object obj = atomicReferenceArray.get(i2 * 2);
            kVar.m(i2, null);
            return obj;
        }
        while (true) {
            Object k3 = kVar.k(i2);
            if (k3 == null || k3 == e.f858e) {
                if (j2 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (kVar.j(i2, k3, e.f861h)) {
                        i();
                        return e.f867o;
                    }
                } else {
                    if (aVar == null) {
                        return e.f866n;
                    }
                    if (kVar.j(i2, k3, aVar)) {
                        i();
                        return e.m;
                    }
                }
            } else if (k3 != e.f857d) {
                o0.a aVar2 = e.f863j;
                if (k3 == aVar2) {
                    return e.f867o;
                }
                if (k3 == e.f861h) {
                    return e.f867o;
                }
                if (k3 == e.f865l) {
                    i();
                    return e.f867o;
                }
                if (k3 != e.f860g && kVar.j(i2, k3, e.f859f)) {
                    boolean z2 = k3 instanceof s;
                    if (z2) {
                        k3 = ((s) k3).f885a;
                    }
                    if (v(k3)) {
                        kVar.n(i2, e.f862i);
                        i();
                        Object obj2 = atomicReferenceArray.get(i2 * 2);
                        kVar.m(i2, null);
                        return obj2;
                    }
                    kVar.n(i2, aVar2);
                    kVar.h();
                    if (z2) {
                        i();
                    }
                    return e.f867o;
                }
            } else if (kVar.j(i2, k3, e.f862i)) {
                i();
                Object obj3 = atomicReferenceArray.get(i2 * 2);
                kVar.m(i2, null);
                return obj3;
            }
        }
    }

    public final int x(k kVar, int i2, Object obj, long j2, Object obj2, boolean z2) {
        while (true) {
            Object k2 = kVar.k(i2);
            if (k2 == null) {
                if (!d(j2) || z2) {
                    if (z2) {
                        if (kVar.j(i2, null, e.f863j)) {
                            kVar.h();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (kVar.j(i2, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (kVar.j(i2, null, e.f857d)) {
                    break;
                }
            } else {
                if (k2 != e.f858e) {
                    o0.a aVar = e.f864k;
                    if (k2 == aVar) {
                        kVar.m(i2, null);
                        return 5;
                    }
                    if (k2 == e.f861h) {
                        kVar.m(i2, null);
                        return 5;
                    }
                    if (k2 == e.f865l) {
                        kVar.m(i2, null);
                        p();
                        return 4;
                    }
                    kVar.m(i2, null);
                    if (k2 instanceof s) {
                        k2 = ((s) k2).f885a;
                    }
                    if (u(k2, obj)) {
                        kVar.n(i2, e.f862i);
                        return 0;
                    }
                    if (kVar.f878f.getAndSet((i2 * 2) + 1, aVar) != aVar) {
                        kVar.l(i2, true);
                    }
                    return 5;
                }
                if (kVar.j(i2, k2, e.f857d)) {
                    break;
                }
            }
        }
        return 1;
    }
}
