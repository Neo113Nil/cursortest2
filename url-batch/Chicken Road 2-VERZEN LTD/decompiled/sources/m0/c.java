package m0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k0.C0046e;
import k0.InterfaceC0045d;
import k0.d0;
import n.InterfaceC0079f;
import p0.AbstractC0090a;
import p0.v;

/* loaded from: classes.dex */
public class c implements g {

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f989d = AtomicLongFieldUpdater.newUpdater(c.class, "sendersAndCloseStatus");

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f990e = AtomicLongFieldUpdater.newUpdater(c.class, "receivers");

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f991f = AtomicLongFieldUpdater.newUpdater(c.class, "bufferEnd");

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f992g = AtomicLongFieldUpdater.newUpdater(c.class, "completedExpandBuffersAndPauseFlag");

    /* renamed from: h, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f993h = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "sendSegment");

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f994i = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "receiveSegment");

    /* renamed from: j, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f995j = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "bufferEndSegment");

    /* renamed from: k, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f996k = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_closeCause");

    /* renamed from: l, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f997l = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "closeHandler");
    private volatile Object _closeCause;

    /* renamed from: b, reason: collision with root package name */
    public final int f998b;
    private volatile long bufferEnd;
    private volatile Object bufferEndSegment;

    /* renamed from: c, reason: collision with root package name */
    public final d0.l f999c;
    private volatile Object closeHandler;
    private volatile long completedExpandBuffersAndPauseFlag;
    private volatile Object receiveSegment;
    private volatile long receivers;
    private volatile Object sendSegment;
    private volatile long sendersAndCloseStatus;

    public c(int i2, d0.l lVar) {
        this.f998b = i2;
        this.f999c = lVar;
        if (i2 < 0) {
            throw new IllegalArgumentException(("Invalid channel capacity: " + i2 + ", should be >=0").toString());
        }
        k kVar = e.f1001a;
        this.bufferEnd = i2 != 0 ? i2 != Integer.MAX_VALUE ? i2 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag = f991f.get(this);
        k kVar2 = new k(0L, null, this, 3);
        this.sendSegment = kVar2;
        this.receiveSegment = kVar2;
        if (r()) {
            kVar2 = e.f1001a;
            e0.h.c(kVar2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment = kVar2;
        this._closeCause = e.f1019s;
    }

    public static final k b(c cVar, long j2, k kVar) {
        Object c2;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j3;
        long j4;
        cVar.getClass();
        k kVar2 = e.f1001a;
        d dVar = d.f1000j;
        loop0: while (true) {
            c2 = AbstractC0090a.c(j2, kVar);
            if (!AbstractC0090a.f(c2)) {
                v d2 = AbstractC0090a.d(c2);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f993h;
                    v vVar = (v) atomicReferenceFieldUpdater.get(cVar);
                    if (vVar.f1171c >= d2.f1171c) {
                        break loop0;
                    }
                    if (!d2.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(cVar, vVar, d2)) {
                        if (atomicReferenceFieldUpdater.get(cVar) != vVar) {
                            if (d2.e()) {
                                d2.d();
                            }
                        }
                    }
                    if (vVar.e()) {
                        vVar.d();
                    }
                }
            } else {
                break;
            }
        }
        boolean f2 = AbstractC0090a.f(c2);
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f990e;
        if (f2) {
            cVar.p();
            if (kVar.f1171c * e.f1002b >= atomicLongFieldUpdater2.get(cVar)) {
                return null;
            }
            kVar.a();
            return null;
        }
        k kVar3 = (k) AbstractC0090a.d(c2);
        long j5 = kVar3.f1171c;
        if (j5 <= j2) {
            return kVar3;
        }
        long j6 = e.f1002b * j5;
        do {
            atomicLongFieldUpdater = f989d;
            j3 = atomicLongFieldUpdater.get(cVar);
            j4 = 1152921504606846975L & j3;
            if (j4 >= j6) {
                break;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(cVar, j3, j4 + (((int) (j3 >> 60)) << 60)));
        if (j5 * e.f1002b >= atomicLongFieldUpdater2.get(cVar)) {
            return null;
        }
        kVar3.a();
        return null;
    }

    public static final int c(c cVar, k kVar, int i2, Object obj, long j2, Object obj2, boolean z2) {
        cVar.getClass();
        kVar.m(i2, obj);
        if (z2) {
            return cVar.x(kVar, i2, obj, j2, obj2, z2);
        }
        Object k2 = kVar.k(i2);
        if (k2 == null) {
            if (cVar.d(j2)) {
                if (kVar.j(i2, null, e.f1004d)) {
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
        } else if (k2 instanceof d0) {
            kVar.m(i2, null);
            if (cVar.u(k2, obj)) {
                kVar.n(i2, e.f1009i);
                return 0;
            }
            io.flutter.plugin.platform.c cVar2 = e.f1011k;
            if (kVar.f1026f.getAndSet((i2 * 2) + 1, cVar2) != cVar2) {
                kVar.l(i2, true);
            }
            return 5;
        }
        return cVar.x(kVar, i2, obj, j2, obj2, z2);
    }

    public static void n(c cVar) {
        cVar.getClass();
        AtomicLongFieldUpdater atomicLongFieldUpdater = f992g;
        if ((atomicLongFieldUpdater.addAndGet(cVar, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(cVar) & 4611686018427387904L) != 0) {
            }
        }
    }

    public static boolean v(Object obj) {
        if (obj instanceof InterfaceC0045d) {
            e0.h.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return e.a((InterfaceC0045d) obj, U.g.f378a, null);
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    @Override // m0.s
    public final void a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        e(cancellationException, true);
    }

    public final boolean d(long j2) {
        return j2 < f991f.get(this) || j2 < f990e.get(this) + ((long) this.f998b);
    }

    public final boolean e(Throwable th, boolean z2) {
        boolean z3;
        long j2;
        long j3;
        long j4;
        Object obj;
        long j5;
        long j6;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f989d;
        if (z2) {
            do {
                j6 = atomicLongFieldUpdater.get(this);
                if (((int) (j6 >> 60)) != 0) {
                    break;
                }
                k kVar = e.f1001a;
            } while (!atomicLongFieldUpdater.compareAndSet(this, j6, (1 << 60) + (j6 & 1152921504606846975L)));
        }
        io.flutter.plugin.platform.c cVar = e.f1019s;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f996k;
            if (atomicReferenceFieldUpdater.compareAndSet(this, cVar, th)) {
                z3 = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != cVar) {
                z3 = false;
                break;
            }
        }
        if (z2) {
            do {
                j5 = atomicLongFieldUpdater.get(this);
            } while (!atomicLongFieldUpdater.compareAndSet(this, j5, (3 << 60) + (j5 & 1152921504606846975L)));
        } else {
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
            } while (!atomicLongFieldUpdater.compareAndSet(this, j2, (j4 << 60) + j3));
        }
        p();
        if (z3) {
            loop3: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f997l;
                obj = atomicReferenceFieldUpdater2.get(this);
                io.flutter.plugin.platform.c cVar2 = obj == null ? e.f1017q : e.f1018r;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, cVar2)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj) {
                        break;
                    }
                }
            }
            if (obj != null) {
                e0.n.a(1, obj);
                ((d0.l) obj).h(k());
            }
        }
        return z3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x008f, code lost:
    
        r1 = (m0.k) ((p0.d) p0.d.f1135b.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final k f(long j2) {
        Object obj;
        long j3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj2 = f995j.get(this);
        k kVar = (k) f993h.get(this);
        if (kVar.f1171c > ((k) obj2).f1171c) {
            obj2 = kVar;
        }
        k kVar2 = (k) f994i.get(this);
        if (kVar2.f1171c > ((k) obj2).f1171c) {
            obj2 = kVar2;
        }
        p0.d dVar = (p0.d) obj2;
        loop0: while (true) {
            dVar.getClass();
            Object obj3 = p0.d.f1134a.get(dVar);
            io.flutter.plugin.platform.c cVar = AbstractC0090a.f1127b;
            obj = null;
            if (obj3 == cVar) {
                break;
            }
            p0.d dVar2 = (p0.d) obj3;
            if (dVar2 == null) {
                do {
                    atomicReferenceFieldUpdater = p0.d.f1134a;
                    if (atomicReferenceFieldUpdater.compareAndSet(dVar, null, cVar)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(dVar) == null);
            } else {
                dVar = dVar2;
            }
        }
        k kVar3 = (k) dVar;
        if (q()) {
            k kVar4 = kVar3;
            loop2: do {
                int i2 = e.f1002b - 1;
                while (true) {
                    if (-1 >= i2) {
                        break;
                    }
                    j3 = (kVar4.f1171c * e.f1002b) + i2;
                    if (j3 < f990e.get(this)) {
                        break loop2;
                    }
                    while (true) {
                        Object k2 = kVar4.k(i2);
                        if (k2 != null && k2 != e.f1005e) {
                            if (k2 == e.f1004d) {
                                break loop2;
                            }
                        } else {
                            if (kVar4.j(i2, k2, e.f1012l)) {
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
                g(j3);
            }
        }
        loop5: for (k kVar5 = kVar3; kVar5 != null; kVar5 = (k) ((p0.d) p0.d.f1135b.get(kVar5))) {
            for (int i3 = e.f1002b - 1; -1 < i3; i3--) {
                if ((kVar5.f1171c * e.f1002b) + i3 < j2) {
                    break loop5;
                }
                while (true) {
                    Object k3 = kVar5.k(i3);
                    if (k3 != null && k3 != e.f1005e) {
                        if (!(k3 instanceof u)) {
                            if (!(k3 instanceof d0)) {
                                break;
                            }
                            if (kVar5.j(i3, k3, e.f1012l)) {
                                obj = AbstractC0090a.g(obj, k3);
                                kVar5.l(i3, true);
                                break;
                            }
                        } else {
                            if (kVar5.j(i3, k3, e.f1012l)) {
                                obj = AbstractC0090a.g(obj, ((u) k3).f1033a);
                                kVar5.l(i3, true);
                                break;
                            }
                        }
                    } else {
                        if (kVar5.j(i3, k3, e.f1012l)) {
                            kVar5.h();
                            break;
                        }
                    }
                }
            }
        }
        if (obj != null) {
            if (obj instanceof ArrayList) {
                ArrayList arrayList = (ArrayList) obj;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    t((d0) arrayList.get(size), true);
                }
            } else {
                t((d0) obj, true);
            }
        }
        return kVar3;
    }

    public final void g(long j2) {
        B.c b2;
        k kVar = (k) f994i.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f990e;
            long j3 = atomicLongFieldUpdater.get(this);
            if (j2 < Math.max(this.f998b + j3, f991f.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j3, j3 + 1)) {
                long j4 = e.f1002b;
                long j5 = j3 / j4;
                int i2 = (int) (j3 % j4);
                if (kVar.f1171c != j5) {
                    k j6 = j(j5, kVar);
                    if (j6 == null) {
                        continue;
                    } else {
                        kVar = j6;
                    }
                }
                Object w2 = w(kVar, i2, j3, null);
                if (w2 != e.f1015o) {
                    kVar.a();
                    d0.l lVar = this.f999c;
                    if (lVar != null && (b2 = AbstractC0090a.b(lVar, w2, null)) != null) {
                        throw b2;
                    }
                } else if (j3 < m()) {
                    kVar.a();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:?, code lost:
    
        return r1;
     */
    @Override // m0.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object h(Object obj) {
        k kVar;
        k kVar2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f989d;
        boolean z2 = o(atomicLongFieldUpdater.get(this), false) ? false : !d(r0 & 1152921504606846975L);
        i iVar = j.f1024a;
        if (!z2) {
            InterfaceC0079f interfaceC0079f = e.f1010j;
            k kVar3 = (k) f993h.get(this);
            while (true) {
                long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
                long j2 = andIncrement & 1152921504606846975L;
                boolean o2 = o(andIncrement, false);
                int i2 = e.f1002b;
                long j3 = i2;
                long j4 = j2 / j3;
                int i3 = (int) (j2 % j3);
                if (kVar3.f1171c != j4) {
                    k b2 = b(this, j4, kVar3);
                    if (b2 != null) {
                        kVar = b2;
                    } else if (o2) {
                        return new h(l());
                    }
                } else {
                    kVar = kVar3;
                }
                k kVar4 = kVar;
                int c2 = c(this, kVar, i3, obj, j2, interfaceC0079f, o2);
                U.g gVar = U.g.f378a;
                if (c2 == 0) {
                    kVar4.a();
                    break;
                }
                if (c2 == 1) {
                    break;
                }
                if (c2 == 2) {
                    if (o2) {
                        kVar4.h();
                        return new h(l());
                    }
                    d0 d0Var = interfaceC0079f instanceof d0 ? (d0) interfaceC0079f : null;
                    if (d0Var != null) {
                        kVar2 = kVar4;
                        d0Var.a(kVar2, i3 + i2);
                    } else {
                        kVar2 = kVar4;
                    }
                    kVar2.h();
                    return iVar;
                }
                if (c2 == 3) {
                    throw new IllegalStateException("unexpected");
                }
                if (c2 == 4) {
                    if (j2 < f990e.get(this)) {
                        kVar4.a();
                    }
                    return new h(l());
                }
                if (c2 == 5) {
                    kVar4.a();
                }
                kVar3 = kVar4;
            }
        } else {
            return iVar;
        }
    }

    public final void i() {
        Object c2;
        if (r()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f995j;
        k kVar = (k) atomicReferenceFieldUpdater.get(this);
        loop0: while (true) {
            long andIncrement = f991f.getAndIncrement(this);
            long j2 = andIncrement / e.f1002b;
            if (m() <= andIncrement) {
                if (kVar.f1171c < j2 && kVar.b() != null) {
                    s(j2, kVar);
                }
                n(this);
                return;
            }
            if (kVar.f1171c != j2) {
                d dVar = d.f1000j;
                while (true) {
                    c2 = AbstractC0090a.c(j2, kVar);
                    if (!AbstractC0090a.f(c2)) {
                        v d2 = AbstractC0090a.d(c2);
                        while (true) {
                            v vVar = (v) atomicReferenceFieldUpdater.get(this);
                            if (vVar.f1171c >= d2.f1171c) {
                                break;
                            }
                            if (!d2.i()) {
                                break;
                            }
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, vVar, d2)) {
                                if (atomicReferenceFieldUpdater.get(this) != vVar) {
                                    if (d2.e()) {
                                        d2.d();
                                    }
                                }
                            }
                            if (vVar.e()) {
                                vVar.d();
                            }
                        }
                    } else {
                        break;
                    }
                }
                k kVar2 = null;
                if (AbstractC0090a.f(c2)) {
                    p();
                    s(j2, kVar);
                    n(this);
                } else {
                    k kVar3 = (k) AbstractC0090a.d(c2);
                    long j3 = kVar3.f1171c;
                    if (j3 > j2) {
                        long j4 = j3 * e.f1002b;
                        if (f991f.compareAndSet(this, andIncrement + 1, j4)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = f992g;
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
            int i2 = (int) (andIncrement % e.f1002b);
            Object k2 = kVar.k(i2);
            boolean z2 = k2 instanceof d0;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f990e;
            if (!z2 || andIncrement < atomicLongFieldUpdater2.get(this) || !kVar.j(i2, k2, e.f1007g)) {
                while (true) {
                    Object k3 = kVar.k(i2);
                    if (!(k3 instanceof d0)) {
                        if (k3 != e.f1010j) {
                            if (k3 != null) {
                                if (k3 == e.f1004d || k3 == e.f1008h || k3 == e.f1009i || k3 == e.f1011k || k3 == e.f1012l) {
                                    break loop0;
                                }
                                if (k3 != e.f1006f) {
                                    throw new IllegalStateException(("Unexpected cell state: " + k3).toString());
                                }
                            } else if (kVar.j(i2, k3, e.f1005e)) {
                                break loop0;
                            }
                        } else {
                            break;
                        }
                    } else if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                        if (kVar.j(i2, k3, new u((d0) k3))) {
                            break loop0;
                        }
                    } else if (kVar.j(i2, k3, e.f1007g)) {
                        if (v(k3)) {
                            kVar.n(i2, e.f1004d);
                            break;
                        } else {
                            kVar.n(i2, e.f1010j);
                            kVar.h();
                        }
                    }
                }
            } else if (v(k2)) {
                kVar.n(i2, e.f1004d);
                break;
            } else {
                kVar.n(i2, e.f1010j);
                kVar.h();
                n(this);
            }
        }
        n(this);
    }

    public final k j(long j2, k kVar) {
        Object c2;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j3;
        k kVar2 = e.f1001a;
        d dVar = d.f1000j;
        loop0: while (true) {
            c2 = AbstractC0090a.c(j2, kVar);
            if (!AbstractC0090a.f(c2)) {
                v d2 = AbstractC0090a.d(c2);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f994i;
                    v vVar = (v) atomicReferenceFieldUpdater.get(this);
                    if (vVar.f1171c >= d2.f1171c) {
                        break loop0;
                    }
                    if (!d2.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, vVar, d2)) {
                        if (atomicReferenceFieldUpdater.get(this) != vVar) {
                            if (d2.e()) {
                                d2.d();
                            }
                        }
                    }
                    if (vVar.e()) {
                        vVar.d();
                    }
                }
            } else {
                break;
            }
        }
        if (AbstractC0090a.f(c2)) {
            p();
            if (kVar.f1171c * e.f1002b >= m()) {
                return null;
            }
            kVar.a();
            return null;
        }
        k kVar3 = (k) AbstractC0090a.d(c2);
        boolean r2 = r();
        long j4 = kVar3.f1171c;
        if (!r2 && j2 <= f991f.get(this) / e.f1002b) {
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f995j;
                v vVar2 = (v) atomicReferenceFieldUpdater2.get(this);
                if (vVar2.f1171c >= j4 || !kVar3.i()) {
                    break;
                }
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, vVar2, kVar3)) {
                    if (atomicReferenceFieldUpdater2.get(this) != vVar2) {
                        if (kVar3.e()) {
                            kVar3.d();
                        }
                    }
                }
                if (vVar2.e()) {
                    vVar2.d();
                }
            }
        }
        if (j4 <= j2) {
            return kVar3;
        }
        long j5 = e.f1002b * j4;
        do {
            atomicLongFieldUpdater = f990e;
            j3 = atomicLongFieldUpdater.get(this);
            if (j3 >= j5) {
                break;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j3, j5));
        if (j4 * e.f1002b >= m()) {
            return null;
        }
        kVar3.a();
        return null;
    }

    public final Throwable k() {
        return (Throwable) f996k.get(this);
    }

    public final Throwable l() {
        Throwable k2 = k();
        return k2 == null ? new m("Channel was closed") : k2;
    }

    public final long m() {
        return f989d.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x00c6, code lost:
    
        r0 = (m0.k) ((p0.d) p0.d.f1135b.get(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean o(long j2, boolean z2) {
        int i2 = (int) (j2 >> 60);
        if (i2 == 0 || i2 == 1) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f990e;
        if (i2 == 2) {
            f(j2 & 1152921504606846975L);
            if (z2) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f994i;
                    k kVar = (k) atomicReferenceFieldUpdater.get(this);
                    long j3 = atomicLongFieldUpdater.get(this);
                    if (m() <= j3) {
                        break;
                    }
                    long j4 = e.f1002b;
                    long j5 = j3 / j4;
                    if (kVar.f1171c != j5 && (kVar = j(j5, kVar)) == null) {
                        if (((k) atomicReferenceFieldUpdater.get(this)).f1171c < j5) {
                            break;
                        }
                    } else {
                        kVar.a();
                        int i3 = (int) (j3 % j4);
                        while (true) {
                            Object k2 = kVar.k(i3);
                            if (k2 == null || k2 == e.f1005e) {
                                if (kVar.j(i3, k2, e.f1008h)) {
                                    i();
                                    break;
                                }
                            } else {
                                if (k2 == e.f1004d) {
                                    return false;
                                }
                                if (k2 != e.f1010j && k2 != e.f1012l && k2 != e.f1009i && k2 != e.f1008h) {
                                    if (k2 == e.f1007g) {
                                        return false;
                                    }
                                    if (k2 != e.f1006f && j3 == atomicLongFieldUpdater.get(this)) {
                                        return false;
                                    }
                                }
                            }
                        }
                        f990e.compareAndSet(this, j3, j3 + 1);
                    }
                }
            }
        } else {
            if (i2 != 3) {
                throw new IllegalStateException(("unexpected close status: " + i2).toString());
            }
            k f2 = f(j2 & 1152921504606846975L);
            B.c cVar = null;
            Object obj = null;
            loop0: do {
                int i4 = e.f1002b - 1;
                while (true) {
                    if (-1 >= i4) {
                        break;
                    }
                    long j6 = (f2.f1171c * e.f1002b) + i4;
                    while (true) {
                        Object k3 = f2.k(i4);
                        if (k3 == e.f1009i) {
                            break loop0;
                        }
                        io.flutter.plugin.platform.c cVar2 = e.f1004d;
                        AtomicReferenceArray atomicReferenceArray = f2.f1026f;
                        d0.l lVar = this.f999c;
                        if (k3 == cVar2) {
                            if (j6 < atomicLongFieldUpdater.get(this)) {
                                break loop0;
                            }
                            if (f2.j(i4, k3, e.f1012l)) {
                                if (lVar != null) {
                                    cVar = AbstractC0090a.b(lVar, atomicReferenceArray.get(i4 * 2), cVar);
                                }
                                f2.m(i4, null);
                                f2.h();
                            }
                        } else if (k3 == e.f1005e || k3 == null) {
                            if (f2.j(i4, k3, e.f1012l)) {
                                f2.h();
                                break;
                            }
                        } else if (!(k3 instanceof d0) && !(k3 instanceof u)) {
                            io.flutter.plugin.platform.c cVar3 = e.f1007g;
                            if (k3 == cVar3 || k3 == e.f1006f) {
                                break loop0;
                            }
                            if (k3 != cVar3) {
                                break;
                            }
                        } else {
                            if (j6 < atomicLongFieldUpdater.get(this)) {
                                break loop0;
                            }
                            d0 d0Var = k3 instanceof u ? ((u) k3).f1033a : (d0) k3;
                            if (f2.j(i4, k3, e.f1012l)) {
                                if (lVar != null) {
                                    cVar = AbstractC0090a.b(lVar, atomicReferenceArray.get(i4 * 2), cVar);
                                }
                                obj = AbstractC0090a.g(obj, d0Var);
                                f2.m(i4, null);
                                f2.h();
                            }
                        }
                    }
                    i4--;
                }
            } while (f2 != null);
            if (obj != null) {
                if (obj instanceof ArrayList) {
                    ArrayList arrayList = (ArrayList) obj;
                    for (int size = arrayList.size() - 1; -1 < size; size--) {
                        t((d0) arrayList.get(size), false);
                    }
                } else {
                    t((d0) obj, false);
                }
            }
            if (cVar != null) {
                throw cVar;
            }
        }
        return true;
    }

    public final boolean p() {
        return o(f989d.get(this), false);
    }

    public boolean q() {
        return false;
    }

    public final boolean r() {
        long j2 = f991f.get(this);
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
        while (kVar.f1171c < j2 && (kVar3 = (k) kVar.b()) != null) {
            kVar = kVar3;
        }
        while (true) {
            if (!kVar.c() || (kVar2 = (k) kVar.b()) == null) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f995j;
                    v vVar = (v) atomicReferenceFieldUpdater.get(this);
                    if (vVar.f1171c >= kVar.f1171c) {
                        return;
                    }
                    if (!kVar.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, vVar, kVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != vVar) {
                            if (kVar.e()) {
                                kVar.d();
                            }
                        }
                    }
                    if (vVar.e()) {
                        vVar.d();
                        return;
                    }
                    return;
                }
            }
            kVar = kVar2;
        }
    }

    public final void t(d0 d0Var, boolean z2) {
        Throwable l2;
        if (d0Var instanceof InterfaceC0045d) {
            W.d dVar = (W.d) d0Var;
            if (z2) {
                l2 = k();
                if (l2 == null) {
                    l2 = new l("Channel was closed");
                }
            } else {
                l2 = l();
            }
            dVar.d(a.a.h(l2));
            return;
        }
        if (!(d0Var instanceof a)) {
            throw new IllegalStateException(("Unexpected waiter: " + d0Var).toString());
        }
        a aVar = (a) d0Var;
        C0046e c0046e = aVar.f987c;
        e0.h.b(c0046e);
        aVar.f987c = null;
        aVar.f986b = e.f1012l;
        Throwable k2 = aVar.f988d.k();
        if (k2 == null) {
            c0046e.d(Boolean.FALSE);
        } else {
            c0046e.d(a.a.h(k2));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x019f, code lost:
    
        r3 = (m0.k) r3.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01a6, code lost:
    
        if (r3 != null) goto L86;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        String obj;
        StringBuilder sb = new StringBuilder();
        int i2 = (int) (f989d.get(this) >> 60);
        if (i2 == 2) {
            sb.append("closed,");
        } else if (i2 == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.f998b + ',');
        sb.append("data=[");
        int i3 = 0;
        List asList = Arrays.asList(f994i.get(this), f993h.get(this), f995j.get(this));
        e0.h.d(asList, "asList(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : asList) {
            if (((k) obj2) != e.f1001a) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j2 = ((k) next).f1171c;
            do {
                Object next2 = it.next();
                long j3 = ((k) next2).f1171c;
                if (j2 > j3) {
                    next = next2;
                    j2 = j3;
                }
            } while (it.hasNext());
        }
        k kVar = (k) next;
        long j4 = f990e.get(this);
        long m2 = m();
        loop2: while (true) {
            int i4 = e.f1002b;
            int i5 = i3;
            while (true) {
                if (i5 >= i4) {
                    break;
                }
                long j5 = (kVar.f1171c * e.f1002b) + i5;
                if (j5 >= m2 && j5 >= j4) {
                    break loop2;
                }
                Object k2 = kVar.k(i5);
                Object obj3 = kVar.f1026f.get(i5 * 2);
                if (k2 instanceof InterfaceC0045d) {
                    obj = (j5 >= j4 || j5 < m2) ? (j5 >= m2 || j5 < j4) ? "cont" : "send" : "receive";
                } else if (k2 instanceof u) {
                    obj = "EB(" + k2 + ')';
                } else if (e0.h.a(k2, e.f1006f) ? true : e0.h.a(k2, e.f1007g)) {
                    obj = "resuming_sender";
                } else if (k2 == null ? true : k2.equals(e.f1005e) ? true : e0.h.a(k2, e.f1009i) ? true : e0.h.a(k2, e.f1008h) ? true : e0.h.a(k2, e.f1011k) ? true : e0.h.a(k2, e.f1010j) ? true : e0.h.a(k2, e.f1012l)) {
                    i5++;
                } else {
                    obj = k2.toString();
                }
                if (obj3 != null) {
                    sb.append("(" + obj + ',' + obj3 + "),");
                } else {
                    sb.append(obj + ',');
                }
                i5++;
            }
            i3 = 0;
        }
        if (sb.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        if (sb.charAt(j0.g.G(sb)) == ',') {
            e0.h.d(sb.deleteCharAt(sb.length() - 1), "this.deleteCharAt(index)");
        }
        sb.append("]");
        return sb.toString();
    }

    public final boolean u(Object obj, Object obj2) {
        if (!(obj instanceof a)) {
            if (!(obj instanceof InterfaceC0045d)) {
                throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
            }
            e0.h.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            InterfaceC0045d interfaceC0045d = (InterfaceC0045d) obj;
            d0.l lVar = this.f999c;
            return e.a(interfaceC0045d, obj2, lVar != null ? new p0.q(lVar, obj2, ((C0046e) interfaceC0045d).f863f) : null);
        }
        e0.h.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
        a aVar = (a) obj;
        C0046e c0046e = aVar.f987c;
        e0.h.b(c0046e);
        aVar.f987c = null;
        aVar.f986b = obj2;
        Boolean bool = Boolean.TRUE;
        d0.l lVar2 = aVar.f988d.f999c;
        return e.a(c0046e, bool, lVar2 != null ? new p0.q(lVar2, obj2, c0046e.f863f) : null);
    }

    public final Object w(k kVar, int i2, long j2, a aVar) {
        Object k2 = kVar.k(i2);
        AtomicReferenceArray atomicReferenceArray = kVar.f1026f;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f989d;
        if (k2 == null) {
            if (j2 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (aVar == null) {
                    return e.f1014n;
                }
                if (kVar.j(i2, k2, aVar)) {
                    i();
                    return e.f1013m;
                }
            }
        } else if (k2 == e.f1004d && kVar.j(i2, k2, e.f1009i)) {
            i();
            Object obj = atomicReferenceArray.get(i2 * 2);
            kVar.m(i2, null);
            return obj;
        }
        while (true) {
            Object k3 = kVar.k(i2);
            if (k3 == null || k3 == e.f1005e) {
                if (j2 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (kVar.j(i2, k3, e.f1008h)) {
                        i();
                        return e.f1015o;
                    }
                } else {
                    if (aVar == null) {
                        return e.f1014n;
                    }
                    if (kVar.j(i2, k3, aVar)) {
                        i();
                        return e.f1013m;
                    }
                }
            } else if (k3 != e.f1004d) {
                io.flutter.plugin.platform.c cVar = e.f1010j;
                if (k3 == cVar) {
                    return e.f1015o;
                }
                if (k3 == e.f1008h) {
                    return e.f1015o;
                }
                if (k3 == e.f1012l) {
                    i();
                    return e.f1015o;
                }
                if (k3 != e.f1007g && kVar.j(i2, k3, e.f1006f)) {
                    boolean z2 = k3 instanceof u;
                    if (z2) {
                        k3 = ((u) k3).f1033a;
                    }
                    if (v(k3)) {
                        kVar.n(i2, e.f1009i);
                        i();
                        Object obj2 = atomicReferenceArray.get(i2 * 2);
                        kVar.m(i2, null);
                        return obj2;
                    }
                    kVar.n(i2, cVar);
                    kVar.h();
                    if (z2) {
                        i();
                    }
                    return e.f1015o;
                }
            } else if (kVar.j(i2, k3, e.f1009i)) {
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
                        if (kVar.j(i2, null, e.f1010j)) {
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
                } else if (kVar.j(i2, null, e.f1004d)) {
                    return 1;
                }
            } else {
                if (k2 != e.f1005e) {
                    io.flutter.plugin.platform.c cVar = e.f1011k;
                    if (k2 == cVar) {
                        kVar.m(i2, null);
                        return 5;
                    }
                    if (k2 == e.f1008h) {
                        kVar.m(i2, null);
                        return 5;
                    }
                    if (k2 == e.f1012l) {
                        kVar.m(i2, null);
                        p();
                        return 4;
                    }
                    kVar.m(i2, null);
                    if (k2 instanceof u) {
                        k2 = ((u) k2).f1033a;
                    }
                    if (u(k2, obj)) {
                        kVar.n(i2, e.f1009i);
                        return 0;
                    }
                    if (kVar.f1026f.getAndSet((i2 * 2) + 1, cVar) == cVar) {
                        return 5;
                    }
                    kVar.l(i2, true);
                    return 5;
                }
                if (kVar.j(i2, k2, e.f1004d)) {
                    return 1;
                }
            }
        }
    }
}
