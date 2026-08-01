package m0;

import a.AbstractC0016a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k0.C0044e;
import k0.InterfaceC0043d;
import k0.d0;
import m.InterfaceC0070f;
import p0.AbstractC0084a;
import p0.v;

/* loaded from: classes.dex */
public class c implements g {

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f1032d = AtomicLongFieldUpdater.newUpdater(c.class, "sendersAndCloseStatus");

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f1033e = AtomicLongFieldUpdater.newUpdater(c.class, "receivers");

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f1034f = AtomicLongFieldUpdater.newUpdater(c.class, "bufferEnd");

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f1035g = AtomicLongFieldUpdater.newUpdater(c.class, "completedExpandBuffersAndPauseFlag");

    /* renamed from: h, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1036h = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "sendSegment");

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1037i = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "receiveSegment");

    /* renamed from: j, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1038j = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "bufferEndSegment");

    /* renamed from: k, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1039k = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_closeCause");

    /* renamed from: l, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1040l = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "closeHandler");
    private volatile Object _closeCause;

    /* renamed from: b, reason: collision with root package name */
    public final int f1041b;
    private volatile long bufferEnd;
    private volatile Object bufferEndSegment;

    /* renamed from: c, reason: collision with root package name */
    public final d0.l f1042c;
    private volatile Object closeHandler;
    private volatile long completedExpandBuffersAndPauseFlag;
    private volatile Object receiveSegment;
    private volatile long receivers;
    private volatile Object sendSegment;
    private volatile long sendersAndCloseStatus;

    public c(int i2, d0.l lVar) {
        this.f1041b = i2;
        this.f1042c = lVar;
        if (i2 < 0) {
            throw new IllegalArgumentException(("Invalid channel capacity: " + i2 + ", should be >=0").toString());
        }
        k kVar = e.f1044a;
        this.bufferEnd = i2 != 0 ? i2 != Integer.MAX_VALUE ? i2 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag = f1034f.get(this);
        k kVar2 = new k(0L, null, this, 3);
        this.sendSegment = kVar2;
        this.receiveSegment = kVar2;
        if (r()) {
            kVar2 = e.f1044a;
            e0.h.c(kVar2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment = kVar2;
        this._closeCause = e.f1062s;
    }

    public static final k b(c cVar, long j2, k kVar) {
        Object c2;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j3;
        long j4;
        cVar.getClass();
        k kVar2 = e.f1044a;
        d dVar = d.f1043j;
        loop0: while (true) {
            c2 = AbstractC0084a.c(j2, kVar);
            if (!AbstractC0084a.f(c2)) {
                v d2 = AbstractC0084a.d(c2);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1036h;
                    v vVar = (v) atomicReferenceFieldUpdater.get(cVar);
                    if (vVar.f1179c >= d2.f1179c) {
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
        boolean f2 = AbstractC0084a.f(c2);
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f1033e;
        if (f2) {
            cVar.p();
            if (kVar.f1179c * e.f1045b >= atomicLongFieldUpdater2.get(cVar)) {
                return null;
            }
            kVar.a();
            return null;
        }
        k kVar3 = (k) AbstractC0084a.d(c2);
        long j5 = kVar3.f1179c;
        if (j5 <= j2) {
            return kVar3;
        }
        long j6 = e.f1045b * j5;
        do {
            atomicLongFieldUpdater = f1032d;
            j3 = atomicLongFieldUpdater.get(cVar);
            j4 = 1152921504606846975L & j3;
            if (j4 >= j6) {
                break;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(cVar, j3, j4 + (((int) (j3 >> 60)) << 60)));
        if (j5 * e.f1045b >= atomicLongFieldUpdater2.get(cVar)) {
            return null;
        }
        kVar3.a();
        return null;
    }

    public static final int c(c cVar, k kVar, int i2, Object obj, long j2, Object obj2, boolean z) {
        cVar.getClass();
        kVar.m(i2, obj);
        if (z) {
            return cVar.x(kVar, i2, obj, j2, obj2, z);
        }
        Object k2 = kVar.k(i2);
        if (k2 == null) {
            if (cVar.d(j2)) {
                if (kVar.j(i2, null, e.f1047d)) {
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
                kVar.n(i2, e.f1052i);
                return 0;
            }
            io.flutter.plugin.editing.a aVar = e.f1054k;
            if (kVar.f1069f.getAndSet((i2 * 2) + 1, aVar) != aVar) {
                kVar.l(i2, true);
            }
            return 5;
        }
        return cVar.x(kVar, i2, obj, j2, obj2, z);
    }

    public static void n(c cVar) {
        cVar.getClass();
        AtomicLongFieldUpdater atomicLongFieldUpdater = f1035g;
        if ((atomicLongFieldUpdater.addAndGet(cVar, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(cVar) & 4611686018427387904L) != 0) {
            }
        }
    }

    public static boolean v(Object obj) {
        if (obj instanceof InterfaceC0043d) {
            e0.h.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return e.a((InterfaceC0043d) obj, U.g.f433a, null);
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
        return j2 < f1034f.get(this) || j2 < f1033e.get(this) + ((long) this.f1041b);
    }

    public final boolean e(Throwable th, boolean z) {
        boolean z2;
        long j2;
        long j3;
        long j4;
        Object obj;
        long j5;
        long j6;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f1032d;
        if (z) {
            do {
                j6 = atomicLongFieldUpdater.get(this);
                if (((int) (j6 >> 60)) != 0) {
                    break;
                }
                k kVar = e.f1044a;
            } while (!atomicLongFieldUpdater.compareAndSet(this, j6, (1 << 60) + (j6 & 1152921504606846975L)));
        }
        io.flutter.plugin.editing.a aVar = e.f1062s;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1039k;
            if (atomicReferenceFieldUpdater.compareAndSet(this, aVar, th)) {
                z2 = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != aVar) {
                z2 = false;
                break;
            }
        }
        if (z) {
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
        if (z2) {
            loop3: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f1040l;
                obj = atomicReferenceFieldUpdater2.get(this);
                io.flutter.plugin.editing.a aVar2 = obj == null ? e.f1060q : e.f1061r;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, aVar2)) {
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
        return z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x008f, code lost:
    
        r1 = (m0.k) ((p0.d) p0.d.f1143b.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final k f(long j2) {
        Object obj;
        long j3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj2 = f1038j.get(this);
        k kVar = (k) f1036h.get(this);
        if (kVar.f1179c > ((k) obj2).f1179c) {
            obj2 = kVar;
        }
        k kVar2 = (k) f1037i.get(this);
        if (kVar2.f1179c > ((k) obj2).f1179c) {
            obj2 = kVar2;
        }
        p0.d dVar = (p0.d) obj2;
        loop0: while (true) {
            dVar.getClass();
            Object obj3 = p0.d.f1142a.get(dVar);
            io.flutter.plugin.editing.a aVar = AbstractC0084a.f1135b;
            obj = null;
            if (obj3 == aVar) {
                break;
            }
            p0.d dVar2 = (p0.d) obj3;
            if (dVar2 == null) {
                do {
                    atomicReferenceFieldUpdater = p0.d.f1142a;
                    if (atomicReferenceFieldUpdater.compareAndSet(dVar, null, aVar)) {
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
                int i2 = e.f1045b - 1;
                while (true) {
                    if (-1 >= i2) {
                        break;
                    }
                    j3 = (kVar4.f1179c * e.f1045b) + i2;
                    if (j3 < f1033e.get(this)) {
                        break loop2;
                    }
                    while (true) {
                        Object k2 = kVar4.k(i2);
                        if (k2 != null && k2 != e.f1048e) {
                            if (k2 == e.f1047d) {
                                break loop2;
                            }
                        } else {
                            if (kVar4.j(i2, k2, e.f1055l)) {
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
        loop5: for (k kVar5 = kVar3; kVar5 != null; kVar5 = (k) ((p0.d) p0.d.f1143b.get(kVar5))) {
            for (int i3 = e.f1045b - 1; -1 < i3; i3--) {
                if ((kVar5.f1179c * e.f1045b) + i3 < j2) {
                    break loop5;
                }
                while (true) {
                    Object k3 = kVar5.k(i3);
                    if (k3 != null && k3 != e.f1048e) {
                        if (!(k3 instanceof u)) {
                            if (!(k3 instanceof d0)) {
                                break;
                            }
                            if (kVar5.j(i3, k3, e.f1055l)) {
                                obj = AbstractC0084a.g(obj, k3);
                                kVar5.l(i3, true);
                                break;
                            }
                        } else {
                            if (kVar5.j(i3, k3, e.f1055l)) {
                                obj = AbstractC0084a.g(obj, ((u) k3).f1076a);
                                kVar5.l(i3, true);
                                break;
                            }
                        }
                    } else {
                        if (kVar5.j(i3, k3, e.f1055l)) {
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
        A.c b2;
        k kVar = (k) f1037i.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f1033e;
            long j3 = atomicLongFieldUpdater.get(this);
            if (j2 < Math.max(this.f1041b + j3, f1034f.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j3, j3 + 1)) {
                long j4 = e.f1045b;
                long j5 = j3 / j4;
                int i2 = (int) (j3 % j4);
                if (kVar.f1179c != j5) {
                    k j6 = j(j5, kVar);
                    if (j6 == null) {
                        continue;
                    } else {
                        kVar = j6;
                    }
                }
                Object w2 = w(kVar, i2, j3, null);
                if (w2 != e.f1058o) {
                    kVar.a();
                    d0.l lVar = this.f1042c;
                    if (lVar != null && (b2 = AbstractC0084a.b(lVar, w2, null)) != null) {
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
        AtomicLongFieldUpdater atomicLongFieldUpdater = f1032d;
        boolean z = o(atomicLongFieldUpdater.get(this), false) ? false : !d(r0 & 1152921504606846975L);
        i iVar = j.f1067a;
        if (!z) {
            InterfaceC0070f interfaceC0070f = e.f1053j;
            k kVar3 = (k) f1036h.get(this);
            while (true) {
                long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
                long j2 = andIncrement & 1152921504606846975L;
                boolean o2 = o(andIncrement, false);
                int i2 = e.f1045b;
                long j3 = i2;
                long j4 = j2 / j3;
                int i3 = (int) (j2 % j3);
                if (kVar3.f1179c != j4) {
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
                int c2 = c(this, kVar, i3, obj, j2, interfaceC0070f, o2);
                U.g gVar = U.g.f433a;
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
                    d0 d0Var = interfaceC0070f instanceof d0 ? (d0) interfaceC0070f : null;
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
                    if (j2 < f1033e.get(this)) {
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
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1038j;
        k kVar = (k) atomicReferenceFieldUpdater.get(this);
        loop0: while (true) {
            long andIncrement = f1034f.getAndIncrement(this);
            long j2 = andIncrement / e.f1045b;
            if (m() <= andIncrement) {
                if (kVar.f1179c < j2 && kVar.b() != null) {
                    s(j2, kVar);
                }
                n(this);
                return;
            }
            if (kVar.f1179c != j2) {
                d dVar = d.f1043j;
                while (true) {
                    c2 = AbstractC0084a.c(j2, kVar);
                    if (!AbstractC0084a.f(c2)) {
                        v d2 = AbstractC0084a.d(c2);
                        while (true) {
                            v vVar = (v) atomicReferenceFieldUpdater.get(this);
                            if (vVar.f1179c >= d2.f1179c) {
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
                if (AbstractC0084a.f(c2)) {
                    p();
                    s(j2, kVar);
                    n(this);
                } else {
                    k kVar3 = (k) AbstractC0084a.d(c2);
                    long j3 = kVar3.f1179c;
                    if (j3 > j2) {
                        long j4 = j3 * e.f1045b;
                        if (f1034f.compareAndSet(this, andIncrement + 1, j4)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = f1035g;
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
            int i2 = (int) (andIncrement % e.f1045b);
            Object k2 = kVar.k(i2);
            boolean z = k2 instanceof d0;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f1033e;
            if (!z || andIncrement < atomicLongFieldUpdater2.get(this) || !kVar.j(i2, k2, e.f1050g)) {
                while (true) {
                    Object k3 = kVar.k(i2);
                    if (!(k3 instanceof d0)) {
                        if (k3 != e.f1053j) {
                            if (k3 != null) {
                                if (k3 == e.f1047d || k3 == e.f1051h || k3 == e.f1052i || k3 == e.f1054k || k3 == e.f1055l) {
                                    break loop0;
                                }
                                if (k3 != e.f1049f) {
                                    throw new IllegalStateException(("Unexpected cell state: " + k3).toString());
                                }
                            } else if (kVar.j(i2, k3, e.f1048e)) {
                                break loop0;
                            }
                        } else {
                            break;
                        }
                    } else if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                        if (kVar.j(i2, k3, new u((d0) k3))) {
                            break loop0;
                        }
                    } else if (kVar.j(i2, k3, e.f1050g)) {
                        if (v(k3)) {
                            kVar.n(i2, e.f1047d);
                            break;
                        } else {
                            kVar.n(i2, e.f1053j);
                            kVar.h();
                        }
                    }
                }
            } else if (v(k2)) {
                kVar.n(i2, e.f1047d);
                break;
            } else {
                kVar.n(i2, e.f1053j);
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
        k kVar2 = e.f1044a;
        d dVar = d.f1043j;
        loop0: while (true) {
            c2 = AbstractC0084a.c(j2, kVar);
            if (!AbstractC0084a.f(c2)) {
                v d2 = AbstractC0084a.d(c2);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1037i;
                    v vVar = (v) atomicReferenceFieldUpdater.get(this);
                    if (vVar.f1179c >= d2.f1179c) {
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
        if (AbstractC0084a.f(c2)) {
            p();
            if (kVar.f1179c * e.f1045b >= m()) {
                return null;
            }
            kVar.a();
            return null;
        }
        k kVar3 = (k) AbstractC0084a.d(c2);
        boolean r2 = r();
        long j4 = kVar3.f1179c;
        if (!r2 && j2 <= f1034f.get(this) / e.f1045b) {
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f1038j;
                v vVar2 = (v) atomicReferenceFieldUpdater2.get(this);
                if (vVar2.f1179c >= j4 || !kVar3.i()) {
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
        long j5 = e.f1045b * j4;
        do {
            atomicLongFieldUpdater = f1033e;
            j3 = atomicLongFieldUpdater.get(this);
            if (j3 >= j5) {
                break;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j3, j5));
        if (j4 * e.f1045b >= m()) {
            return null;
        }
        kVar3.a();
        return null;
    }

    public final Throwable k() {
        return (Throwable) f1039k.get(this);
    }

    public final Throwable l() {
        Throwable k2 = k();
        return k2 == null ? new m("Channel was closed") : k2;
    }

    public final long m() {
        return f1032d.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x00c6, code lost:
    
        r0 = (m0.k) ((p0.d) p0.d.f1143b.get(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean o(long j2, boolean z) {
        int i2 = (int) (j2 >> 60);
        if (i2 == 0 || i2 == 1) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f1033e;
        if (i2 == 2) {
            f(j2 & 1152921504606846975L);
            if (z) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1037i;
                    k kVar = (k) atomicReferenceFieldUpdater.get(this);
                    long j3 = atomicLongFieldUpdater.get(this);
                    if (m() <= j3) {
                        break;
                    }
                    long j4 = e.f1045b;
                    long j5 = j3 / j4;
                    if (kVar.f1179c != j5 && (kVar = j(j5, kVar)) == null) {
                        if (((k) atomicReferenceFieldUpdater.get(this)).f1179c < j5) {
                            break;
                        }
                    } else {
                        kVar.a();
                        int i3 = (int) (j3 % j4);
                        while (true) {
                            Object k2 = kVar.k(i3);
                            if (k2 == null || k2 == e.f1048e) {
                                if (kVar.j(i3, k2, e.f1051h)) {
                                    i();
                                    break;
                                }
                            } else {
                                if (k2 == e.f1047d) {
                                    return false;
                                }
                                if (k2 != e.f1053j && k2 != e.f1055l && k2 != e.f1052i && k2 != e.f1051h) {
                                    if (k2 == e.f1050g) {
                                        return false;
                                    }
                                    if (k2 != e.f1049f && j3 == atomicLongFieldUpdater.get(this)) {
                                        return false;
                                    }
                                }
                            }
                        }
                        f1033e.compareAndSet(this, j3, j3 + 1);
                    }
                }
            }
        } else {
            if (i2 != 3) {
                throw new IllegalStateException(("unexpected close status: " + i2).toString());
            }
            k f2 = f(j2 & 1152921504606846975L);
            A.c cVar = null;
            Object obj = null;
            loop0: do {
                int i4 = e.f1045b - 1;
                while (true) {
                    if (-1 >= i4) {
                        break;
                    }
                    long j6 = (f2.f1179c * e.f1045b) + i4;
                    while (true) {
                        Object k3 = f2.k(i4);
                        if (k3 == e.f1052i) {
                            break loop0;
                        }
                        io.flutter.plugin.editing.a aVar = e.f1047d;
                        AtomicReferenceArray atomicReferenceArray = f2.f1069f;
                        d0.l lVar = this.f1042c;
                        if (k3 == aVar) {
                            if (j6 < atomicLongFieldUpdater.get(this)) {
                                break loop0;
                            }
                            if (f2.j(i4, k3, e.f1055l)) {
                                if (lVar != null) {
                                    cVar = AbstractC0084a.b(lVar, atomicReferenceArray.get(i4 * 2), cVar);
                                }
                                f2.m(i4, null);
                                f2.h();
                            }
                        } else if (k3 == e.f1048e || k3 == null) {
                            if (f2.j(i4, k3, e.f1055l)) {
                                f2.h();
                                break;
                            }
                        } else if (!(k3 instanceof d0) && !(k3 instanceof u)) {
                            io.flutter.plugin.editing.a aVar2 = e.f1050g;
                            if (k3 == aVar2 || k3 == e.f1049f) {
                                break loop0;
                            }
                            if (k3 != aVar2) {
                                break;
                            }
                        } else {
                            if (j6 < atomicLongFieldUpdater.get(this)) {
                                break loop0;
                            }
                            d0 d0Var = k3 instanceof u ? ((u) k3).f1076a : (d0) k3;
                            if (f2.j(i4, k3, e.f1055l)) {
                                if (lVar != null) {
                                    cVar = AbstractC0084a.b(lVar, atomicReferenceArray.get(i4 * 2), cVar);
                                }
                                obj = AbstractC0084a.g(obj, d0Var);
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
        return o(f1032d.get(this), false);
    }

    public boolean q() {
        return false;
    }

    public final boolean r() {
        long j2 = f1034f.get(this);
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
        while (kVar.f1179c < j2 && (kVar3 = (k) kVar.b()) != null) {
            kVar = kVar3;
        }
        while (true) {
            if (!kVar.c() || (kVar2 = (k) kVar.b()) == null) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1038j;
                    v vVar = (v) atomicReferenceFieldUpdater.get(this);
                    if (vVar.f1179c >= kVar.f1179c) {
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

    public final void t(d0 d0Var, boolean z) {
        Throwable l2;
        if (d0Var instanceof InterfaceC0043d) {
            W.d dVar = (W.d) d0Var;
            if (z) {
                l2 = k();
                if (l2 == null) {
                    l2 = new l("Channel was closed");
                }
            } else {
                l2 = l();
            }
            dVar.d(AbstractC0016a.h(l2));
            return;
        }
        if (!(d0Var instanceof a)) {
            throw new IllegalStateException(("Unexpected waiter: " + d0Var).toString());
        }
        a aVar = (a) d0Var;
        C0044e c0044e = aVar.f1030c;
        e0.h.b(c0044e);
        aVar.f1030c = null;
        aVar.f1029b = e.f1055l;
        Throwable k2 = aVar.f1031d.k();
        if (k2 == null) {
            c0044e.d(Boolean.FALSE);
        } else {
            c0044e.d(AbstractC0016a.h(k2));
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
        int i2 = (int) (f1032d.get(this) >> 60);
        if (i2 == 2) {
            sb.append("closed,");
        } else if (i2 == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.f1041b + ',');
        sb.append("data=[");
        int i3 = 0;
        List asList = Arrays.asList(f1037i.get(this), f1036h.get(this), f1038j.get(this));
        e0.h.d(asList, "asList(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : asList) {
            if (((k) obj2) != e.f1044a) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j2 = ((k) next).f1179c;
            do {
                Object next2 = it.next();
                long j3 = ((k) next2).f1179c;
                if (j2 > j3) {
                    next = next2;
                    j2 = j3;
                }
            } while (it.hasNext());
        }
        k kVar = (k) next;
        long j4 = f1033e.get(this);
        long m2 = m();
        loop2: while (true) {
            int i4 = e.f1045b;
            int i5 = i3;
            while (true) {
                if (i5 >= i4) {
                    break;
                }
                long j5 = (kVar.f1179c * e.f1045b) + i5;
                if (j5 >= m2 && j5 >= j4) {
                    break loop2;
                }
                Object k2 = kVar.k(i5);
                Object obj3 = kVar.f1069f.get(i5 * 2);
                if (k2 instanceof InterfaceC0043d) {
                    obj = (j5 >= j4 || j5 < m2) ? (j5 >= m2 || j5 < j4) ? "cont" : "send" : "receive";
                } else if (k2 instanceof u) {
                    obj = "EB(" + k2 + ')';
                } else if (e0.h.a(k2, e.f1049f) ? true : e0.h.a(k2, e.f1050g)) {
                    obj = "resuming_sender";
                } else if (k2 == null ? true : k2.equals(e.f1048e) ? true : e0.h.a(k2, e.f1052i) ? true : e0.h.a(k2, e.f1051h) ? true : e0.h.a(k2, e.f1054k) ? true : e0.h.a(k2, e.f1053j) ? true : e0.h.a(k2, e.f1055l)) {
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
        if (sb.charAt(j0.g.I(sb)) == ',') {
            e0.h.d(sb.deleteCharAt(sb.length() - 1), "this.deleteCharAt(index)");
        }
        sb.append("]");
        return sb.toString();
    }

    public final boolean u(Object obj, Object obj2) {
        if (!(obj instanceof a)) {
            if (!(obj instanceof InterfaceC0043d)) {
                throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
            }
            e0.h.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            InterfaceC0043d interfaceC0043d = (InterfaceC0043d) obj;
            d0.l lVar = this.f1042c;
            return e.a(interfaceC0043d, obj2, lVar != null ? new p0.q(lVar, obj2, ((C0044e) interfaceC0043d).f916f) : null);
        }
        e0.h.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
        a aVar = (a) obj;
        C0044e c0044e = aVar.f1030c;
        e0.h.b(c0044e);
        aVar.f1030c = null;
        aVar.f1029b = obj2;
        Boolean bool = Boolean.TRUE;
        d0.l lVar2 = aVar.f1031d.f1042c;
        return e.a(c0044e, bool, lVar2 != null ? new p0.q(lVar2, obj2, c0044e.f916f) : null);
    }

    public final Object w(k kVar, int i2, long j2, a aVar) {
        Object k2 = kVar.k(i2);
        AtomicReferenceArray atomicReferenceArray = kVar.f1069f;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f1032d;
        if (k2 == null) {
            if (j2 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (aVar == null) {
                    return e.f1057n;
                }
                if (kVar.j(i2, k2, aVar)) {
                    i();
                    return e.f1056m;
                }
            }
        } else if (k2 == e.f1047d && kVar.j(i2, k2, e.f1052i)) {
            i();
            Object obj = atomicReferenceArray.get(i2 * 2);
            kVar.m(i2, null);
            return obj;
        }
        while (true) {
            Object k3 = kVar.k(i2);
            if (k3 == null || k3 == e.f1048e) {
                if (j2 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (kVar.j(i2, k3, e.f1051h)) {
                        i();
                        return e.f1058o;
                    }
                } else {
                    if (aVar == null) {
                        return e.f1057n;
                    }
                    if (kVar.j(i2, k3, aVar)) {
                        i();
                        return e.f1056m;
                    }
                }
            } else if (k3 != e.f1047d) {
                io.flutter.plugin.editing.a aVar2 = e.f1053j;
                if (k3 == aVar2) {
                    return e.f1058o;
                }
                if (k3 == e.f1051h) {
                    return e.f1058o;
                }
                if (k3 == e.f1055l) {
                    i();
                    return e.f1058o;
                }
                if (k3 != e.f1050g && kVar.j(i2, k3, e.f1049f)) {
                    boolean z = k3 instanceof u;
                    if (z) {
                        k3 = ((u) k3).f1076a;
                    }
                    if (v(k3)) {
                        kVar.n(i2, e.f1052i);
                        i();
                        Object obj2 = atomicReferenceArray.get(i2 * 2);
                        kVar.m(i2, null);
                        return obj2;
                    }
                    kVar.n(i2, aVar2);
                    kVar.h();
                    if (z) {
                        i();
                    }
                    return e.f1058o;
                }
            } else if (kVar.j(i2, k3, e.f1052i)) {
                i();
                Object obj3 = atomicReferenceArray.get(i2 * 2);
                kVar.m(i2, null);
                return obj3;
            }
        }
    }

    public final int x(k kVar, int i2, Object obj, long j2, Object obj2, boolean z) {
        while (true) {
            Object k2 = kVar.k(i2);
            if (k2 == null) {
                if (!d(j2) || z) {
                    if (z) {
                        if (kVar.j(i2, null, e.f1053j)) {
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
                } else if (kVar.j(i2, null, e.f1047d)) {
                    return 1;
                }
            } else {
                if (k2 != e.f1048e) {
                    io.flutter.plugin.editing.a aVar = e.f1054k;
                    if (k2 == aVar) {
                        kVar.m(i2, null);
                        return 5;
                    }
                    if (k2 == e.f1051h) {
                        kVar.m(i2, null);
                        return 5;
                    }
                    if (k2 == e.f1055l) {
                        kVar.m(i2, null);
                        p();
                        return 4;
                    }
                    kVar.m(i2, null);
                    if (k2 instanceof u) {
                        k2 = ((u) k2).f1076a;
                    }
                    if (u(k2, obj)) {
                        kVar.n(i2, e.f1052i);
                        return 0;
                    }
                    if (kVar.f1069f.getAndSet((i2 * 2) + 1, aVar) == aVar) {
                        return 5;
                    }
                    kVar.l(i2, true);
                    return 5;
                }
                if (kVar.j(i2, k2, e.f1047d)) {
                    return 1;
                }
            }
        }
    }
}
