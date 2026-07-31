package Y0;

import B0.E;
import F.InterfaceC0027i;
import W0.AbstractC0081v;
import W0.C0066f;
import W0.InterfaceC0065e;
import W0.l0;
import a.AbstractC0086a;
import b1.AbstractC0115a;
import b1.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class b implements f {

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f1008f = AtomicLongFieldUpdater.newUpdater(b.class, "sendersAndCloseStatus");

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f1009g = AtomicLongFieldUpdater.newUpdater(b.class, "receivers");

    /* renamed from: h, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f1010h = AtomicLongFieldUpdater.newUpdater(b.class, "bufferEnd");

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f1011i = AtomicLongFieldUpdater.newUpdater(b.class, "completedExpandBuffersAndPauseFlag");

    /* renamed from: j, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1012j = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "sendSegment");

    /* renamed from: k, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1013k = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "receiveSegment");

    /* renamed from: l, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1014l = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "bufferEndSegment");

    /* renamed from: m, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1015m = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_closeCause");

    /* renamed from: n, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1016n = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "closeHandler");
    private volatile Object _closeCause;
    private volatile long bufferEnd;
    private volatile Object bufferEndSegment;
    private volatile Object closeHandler;
    private volatile long completedExpandBuffersAndPauseFlag;

    /* renamed from: e, reason: collision with root package name */
    public final int f1017e;
    private volatile Object receiveSegment;
    private volatile long receivers;
    private volatile Object sendSegment;
    private volatile long sendersAndCloseStatus;

    public b(int i2) {
        this.f1017e = i2;
        if (i2 < 0) {
            throw new IllegalArgumentException(("Invalid channel capacity: " + i2 + ", should be >=0").toString());
        }
        j jVar = d.f1019a;
        this.bufferEnd = i2 != 0 ? i2 != Integer.MAX_VALUE ? i2 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag = f1010h.get(this);
        j jVar2 = new j(0L, null, this, 3);
        this.sendSegment = jVar2;
        this.receiveSegment = jVar2;
        if (u()) {
            jVar2 = d.f1019a;
            P0.h.c(jVar2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment = jVar2;
        this._closeCause = d.f1037s;
    }

    public static final j a(b bVar, long j2, j jVar) {
        Object a2;
        b bVar2;
        j jVar2 = d.f1019a;
        c cVar = c.f1018m;
        loop0: while (true) {
            a2 = AbstractC0115a.a(jVar, j2, cVar);
            if (!AbstractC0115a.d(a2)) {
                v b2 = AbstractC0115a.b(a2);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1012j;
                    v vVar = (v) atomicReferenceFieldUpdater.get(bVar);
                    if (vVar.f1777g >= b2.f1777g) {
                        break loop0;
                    }
                    if (!b2.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(bVar, vVar, b2)) {
                        if (atomicReferenceFieldUpdater.get(bVar) != vVar) {
                            if (b2.e()) {
                                b2.d();
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
        boolean d2 = AbstractC0115a.d(a2);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f1009g;
        if (d2) {
            bVar.s();
            if (jVar.f1777g * d.f1020b < atomicLongFieldUpdater.get(bVar)) {
                jVar.a();
                return null;
            }
        } else {
            j jVar3 = (j) AbstractC0115a.b(a2);
            long j3 = jVar3.f1777g;
            if (j3 <= j2) {
                return jVar3;
            }
            long j4 = d.f1020b * j3;
            while (true) {
                long j5 = f1008f.get(bVar);
                long j6 = 1152921504606846975L & j5;
                if (j6 >= j4) {
                    bVar2 = bVar;
                    break;
                }
                bVar2 = bVar;
                if (f1008f.compareAndSet(bVar2, j5, (((int) (j5 >> 60)) << 60) + j6)) {
                    break;
                }
                bVar = bVar2;
            }
            if (j3 * d.f1020b < atomicLongFieldUpdater.get(bVar2)) {
                jVar3.a();
            }
        }
        return null;
    }

    public static final void c(b bVar, Object obj, C0066f c0066f) {
        c0066f.g(AbstractC0086a.l(bVar.o()));
    }

    public static final int d(b bVar, j jVar, int i2, Object obj, long j2, Object obj2, boolean z2) {
        jVar.m(i2, obj);
        if (z2) {
            return bVar.B(jVar, i2, obj, j2, obj2, z2);
        }
        Object k2 = jVar.k(i2);
        if (k2 == null) {
            if (bVar.e(j2)) {
                if (jVar.j(i2, null, d.f1022d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (jVar.j(i2, null, obj2)) {
                    return 2;
                }
            }
        } else if (k2 instanceof l0) {
            jVar.m(i2, null);
            if (bVar.y(k2, obj)) {
                jVar.n(i2, d.f1027i);
                return 0;
            }
            E e2 = d.f1029k;
            if (jVar.f1044j.getAndSet((i2 * 2) + 1, e2) == e2) {
                return 5;
            }
            jVar.l(i2, true);
            return 5;
        }
        return bVar.B(jVar, i2, obj, j2, obj2, z2);
    }

    public static void q(b bVar) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f1011i;
        if ((atomicLongFieldUpdater.addAndGet(bVar, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(bVar) & 4611686018427387904L) != 0) {
            }
        }
    }

    public static boolean z(Object obj) {
        if (!(obj instanceof InterfaceC0065e)) {
            throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
        }
        P0.h.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
        InterfaceC0065e interfaceC0065e = (InterfaceC0065e) obj;
        j jVar = d.f1019a;
        E f2 = interfaceC0065e.f(D0.h.f206a, null);
        if (f2 == null) {
            return false;
        }
        interfaceC0065e.n(f2);
        return true;
    }

    public final Object A(j jVar, int i2, long j2, Object obj) {
        AtomicReferenceArray atomicReferenceArray = jVar.f1044j;
        Object k2 = jVar.k(i2);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f1008f;
        if (k2 == null) {
            if (j2 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return d.f1032n;
                }
                if (jVar.j(i2, k2, obj)) {
                    i();
                    return d.f1031m;
                }
            }
        } else if (k2 == d.f1022d && jVar.j(i2, k2, d.f1027i)) {
            i();
            Object obj2 = atomicReferenceArray.get(i2 * 2);
            jVar.m(i2, null);
            return obj2;
        }
        while (true) {
            Object k3 = jVar.k(i2);
            if (k3 == null || k3 == d.f1023e) {
                if (j2 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (jVar.j(i2, k3, d.f1026h)) {
                        i();
                        return d.f1033o;
                    }
                } else {
                    if (obj == null) {
                        return d.f1032n;
                    }
                    if (jVar.j(i2, k3, obj)) {
                        i();
                        return d.f1031m;
                    }
                }
            } else if (k3 != d.f1022d) {
                E e2 = d.f1028j;
                if (k3 == e2) {
                    return d.f1033o;
                }
                if (k3 == d.f1026h) {
                    return d.f1033o;
                }
                if (k3 == d.f1030l) {
                    i();
                    return d.f1033o;
                }
                if (k3 != d.f1025g && jVar.j(i2, k3, d.f1024f)) {
                    boolean z2 = k3 instanceof s;
                    if (z2) {
                        k3 = ((s) k3).f1050a;
                    }
                    if (z(k3)) {
                        jVar.n(i2, d.f1027i);
                        i();
                        Object obj3 = atomicReferenceArray.get(i2 * 2);
                        jVar.m(i2, null);
                        return obj3;
                    }
                    jVar.n(i2, e2);
                    jVar.h();
                    if (z2) {
                        i();
                    }
                    return d.f1033o;
                }
            } else if (jVar.j(i2, k3, d.f1027i)) {
                i();
                Object obj4 = atomicReferenceArray.get(i2 * 2);
                jVar.m(i2, null);
                return obj4;
            }
        }
    }

    public final int B(j jVar, int i2, Object obj, long j2, Object obj2, boolean z2) {
        while (true) {
            Object k2 = jVar.k(i2);
            if (k2 == null) {
                if (!e(j2) || z2) {
                    if (z2) {
                        if (jVar.j(i2, null, d.f1028j)) {
                            jVar.h();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (jVar.j(i2, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (jVar.j(i2, null, d.f1022d)) {
                    break;
                }
            } else {
                if (k2 != d.f1023e) {
                    E e2 = d.f1029k;
                    if (k2 == e2) {
                        jVar.m(i2, null);
                        return 5;
                    }
                    if (k2 == d.f1026h) {
                        jVar.m(i2, null);
                        return 5;
                    }
                    if (k2 == d.f1030l) {
                        jVar.m(i2, null);
                        s();
                        return 4;
                    }
                    jVar.m(i2, null);
                    if (k2 instanceof s) {
                        k2 = ((s) k2).f1050a;
                    }
                    if (y(k2, obj)) {
                        jVar.n(i2, d.f1027i);
                        return 0;
                    }
                    if (jVar.f1044j.getAndSet((i2 * 2) + 1, e2) != e2) {
                        jVar.l(i2, true);
                    }
                    return 5;
                }
                if (jVar.j(i2, k2, d.f1022d)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final void C(long j2) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        b bVar = this;
        if (bVar.u()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = f1010h;
            if (atomicLongFieldUpdater.get(bVar) > j2) {
                break;
            } else {
                bVar = this;
            }
        }
        int i2 = d.f1021c;
        int i3 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f1011i;
            if (i3 < i2) {
                long j3 = atomicLongFieldUpdater.get(bVar);
                if (j3 == (4611686018427387903L & atomicLongFieldUpdater2.get(bVar)) && j3 == atomicLongFieldUpdater.get(bVar)) {
                    return;
                } else {
                    i3++;
                }
            } else {
                while (true) {
                    long j4 = atomicLongFieldUpdater2.get(bVar);
                    if (atomicLongFieldUpdater2.compareAndSet(bVar, j4, (j4 & 4611686018427387903L) + 4611686018427387904L)) {
                        break;
                    } else {
                        bVar = this;
                    }
                }
                while (true) {
                    long j5 = atomicLongFieldUpdater.get(bVar);
                    long j6 = atomicLongFieldUpdater2.get(bVar);
                    long j7 = j6 & 4611686018427387903L;
                    boolean z2 = (j6 & 4611686018427387904L) != 0;
                    if (j5 == j7 && j5 == atomicLongFieldUpdater.get(bVar)) {
                        break;
                    }
                    if (z2) {
                        bVar = this;
                    } else {
                        bVar = this;
                        atomicLongFieldUpdater2.compareAndSet(bVar, j6, 4611686018427387904L + j7);
                    }
                }
                while (true) {
                    long j8 = atomicLongFieldUpdater2.get(bVar);
                    if (atomicLongFieldUpdater2.compareAndSet(bVar, j8, j8 & 4611686018427387903L)) {
                        return;
                    } else {
                        bVar = this;
                    }
                }
            }
        }
    }

    @Override // Y0.q
    public final void b(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        f(cancellationException, true);
    }

    public final boolean e(long j2) {
        return j2 < f1010h.get(this) || j2 < f1009g.get(this) + ((long) this.f1017e);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003c A[LOOP:2: B:17:0x003c->B:39:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e A[LOOP:3: B:22:0x006e->B:30:?, LOOP_LABEL: LOOP:3: B:22:0x006e->B:30:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004c A[LOOP:5: B:40:0x004c->B:48:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x002f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f(Throwable th, boolean z2) {
        b bVar;
        E e2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        boolean z3;
        long j2;
        long j3;
        long j4;
        Object obj;
        long j5;
        long j6;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f1008f;
        if (z2) {
            do {
                j6 = atomicLongFieldUpdater.get(this);
                if (((int) (j6 >> 60)) == 0) {
                    j jVar = d.f1019a;
                    bVar = this;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(bVar, j6, (j6 & 1152921504606846975L) + (1 << 60)));
            e2 = d.f1037s;
            while (true) {
                atomicReferenceFieldUpdater = f1015m;
                if (!atomicReferenceFieldUpdater.compareAndSet(this, e2, th)) {
                    z3 = true;
                    break;
                }
                if (atomicReferenceFieldUpdater.get(this) != e2) {
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
                } while (!atomicLongFieldUpdater.compareAndSet(bVar, j2, (j4 << 60) + j3));
            } else {
                do {
                    j5 = atomicLongFieldUpdater.get(this);
                } while (!atomicLongFieldUpdater.compareAndSet(bVar, j5, (3 << 60) + (j5 & 1152921504606846975L)));
            }
            s();
            if (z3) {
                loop3: while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f1016n;
                    obj = atomicReferenceFieldUpdater2.get(this);
                    E e3 = obj == null ? d.f1035q : d.f1036r;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, e3)) {
                        if (atomicReferenceFieldUpdater2.get(this) != obj) {
                            break;
                        }
                    }
                }
                if (obj != null) {
                    P0.r.a(1, obj);
                    ((O0.l) obj).j(m());
                    return z3;
                }
            }
            return z3;
        }
        bVar = this;
        e2 = d.f1037s;
        while (true) {
            atomicReferenceFieldUpdater = f1015m;
            if (!atomicReferenceFieldUpdater.compareAndSet(this, e2, th)) {
            }
        }
        if (z2) {
        }
        s();
        if (z3) {
        }
        return z3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x008d, code lost:
    
        r1 = (Y0.j) ((b1.d) b1.d.f1744f.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final j g(long j2) {
        Object obj;
        long j3;
        Object obj2 = f1014l.get(this);
        j jVar = (j) f1012j.get(this);
        if (jVar.f1777g > ((j) obj2).f1777g) {
            obj2 = jVar;
        }
        j jVar2 = (j) f1013k.get(this);
        if (jVar2.f1777g > ((j) obj2).f1777g) {
            obj2 = jVar2;
        }
        b1.d dVar = (b1.d) obj2;
        loop0: while (true) {
            dVar.getClass();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b1.d.f1743e;
            Object obj3 = atomicReferenceFieldUpdater.get(dVar);
            E e2 = AbstractC0115a.f1736b;
            obj = null;
            if (obj3 == e2) {
                break;
            }
            b1.d dVar2 = (b1.d) obj3;
            if (dVar2 == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(dVar, null, e2)) {
                    if (atomicReferenceFieldUpdater.get(dVar) != null) {
                        break;
                    }
                }
                break loop0;
            }
            dVar = dVar2;
        }
        j jVar3 = (j) dVar;
        if (t()) {
            j jVar4 = jVar3;
            loop2: do {
                int i2 = d.f1020b - 1;
                while (true) {
                    if (-1 >= i2) {
                        break;
                    }
                    j3 = (jVar4.f1777g * d.f1020b) + i2;
                    if (j3 < f1009g.get(this)) {
                        break loop2;
                    }
                    while (true) {
                        Object k2 = jVar4.k(i2);
                        if (k2 != null && k2 != d.f1023e) {
                            if (k2 == d.f1022d) {
                                break loop2;
                            }
                        } else {
                            if (jVar4.j(i2, k2, d.f1030l)) {
                                jVar4.h();
                                break;
                            }
                        }
                    }
                    i2--;
                }
            } while (jVar4 != null);
            j3 = -1;
            if (j3 != -1) {
                h(j3);
            }
        }
        loop5: for (j jVar5 = jVar3; jVar5 != null; jVar5 = (j) ((b1.d) b1.d.f1744f.get(jVar5))) {
            for (int i3 = d.f1020b - 1; -1 < i3; i3--) {
                if ((jVar5.f1777g * d.f1020b) + i3 < j2) {
                    break loop5;
                }
                while (true) {
                    Object k3 = jVar5.k(i3);
                    if (k3 != null && k3 != d.f1023e) {
                        if (!(k3 instanceof s)) {
                            if (!(k3 instanceof l0)) {
                                break;
                            }
                            if (jVar5.j(i3, k3, d.f1030l)) {
                                obj = AbstractC0115a.e(obj, k3);
                                jVar5.l(i3, true);
                                break;
                            }
                        } else {
                            if (jVar5.j(i3, k3, d.f1030l)) {
                                obj = AbstractC0115a.e(obj, ((s) k3).f1050a);
                                jVar5.l(i3, true);
                                break;
                            }
                        }
                    } else {
                        if (jVar5.j(i3, k3, d.f1030l)) {
                            jVar5.h();
                            break;
                        }
                    }
                }
            }
        }
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                x((l0) obj, true);
                return jVar3;
            }
            ArrayList arrayList = (ArrayList) obj;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                x((l0) arrayList.get(size), true);
            }
        }
        return jVar3;
    }

    public final void h(long j2) {
        j jVar = (j) f1013k.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f1009g;
            long j3 = atomicLongFieldUpdater.get(this);
            if (j2 < Math.max(this.f1017e + j3, f1010h.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j3, 1 + j3)) {
                long j4 = d.f1020b;
                long j5 = j3 / j4;
                int i2 = (int) (j3 % j4);
                if (jVar.f1777g != j5) {
                    j j6 = j(j5, jVar);
                    if (j6 != null) {
                        jVar = j6;
                    }
                }
                j jVar2 = jVar;
                if (A(jVar2, i2, j3, null) != d.f1033o) {
                    jVar2.a();
                } else if (j3 < p()) {
                    jVar2.a();
                }
                jVar = jVar2;
            }
        }
    }

    public final void i() {
        Object a2;
        if (u()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1014l;
        j jVar = (j) atomicReferenceFieldUpdater.get(this);
        loop0: while (true) {
            long andIncrement = f1010h.getAndIncrement(this);
            long j2 = andIncrement / d.f1020b;
            if (p() <= andIncrement) {
                if (jVar.f1777g < j2 && jVar.b() != null) {
                    v(j2, jVar);
                }
                q(this);
                return;
            }
            if (jVar.f1777g != j2) {
                c cVar = c.f1018m;
                while (true) {
                    a2 = AbstractC0115a.a(jVar, j2, cVar);
                    if (!AbstractC0115a.d(a2)) {
                        v b2 = AbstractC0115a.b(a2);
                        while (true) {
                            v vVar = (v) atomicReferenceFieldUpdater.get(this);
                            if (vVar.f1777g >= b2.f1777g) {
                                break;
                            }
                            if (!b2.i()) {
                                break;
                            }
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, vVar, b2)) {
                                if (atomicReferenceFieldUpdater.get(this) != vVar) {
                                    if (b2.e()) {
                                        b2.d();
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
                j jVar2 = null;
                if (AbstractC0115a.d(a2)) {
                    s();
                    v(j2, jVar);
                    q(this);
                } else {
                    j jVar3 = (j) AbstractC0115a.b(a2);
                    long j3 = jVar3.f1777g;
                    if (j3 > j2) {
                        long j4 = j3 * d.f1020b;
                        if (f1010h.compareAndSet(this, 1 + andIncrement, j4)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = f1011i;
                            if ((atomicLongFieldUpdater.addAndGet(this, j4 - andIncrement) & 4611686018427387904L) != 0) {
                                while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0) {
                                }
                            }
                        } else {
                            q(this);
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
            int i2 = (int) (andIncrement % d.f1020b);
            Object k2 = jVar.k(i2);
            boolean z2 = k2 instanceof l0;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f1009g;
            if (!z2 || andIncrement < atomicLongFieldUpdater2.get(this) || !jVar.j(i2, k2, d.f1025g)) {
                while (true) {
                    Object k3 = jVar.k(i2);
                    if (!(k3 instanceof l0)) {
                        if (k3 != d.f1028j) {
                            if (k3 != null) {
                                if (k3 == d.f1022d || k3 == d.f1026h || k3 == d.f1027i || k3 == d.f1029k || k3 == d.f1030l) {
                                    break loop0;
                                }
                                if (k3 != d.f1024f) {
                                    throw new IllegalStateException(("Unexpected cell state: " + k3).toString());
                                }
                            } else if (jVar.j(i2, k3, d.f1023e)) {
                                break loop0;
                            }
                        } else {
                            break;
                        }
                    } else if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                        if (jVar.j(i2, k3, new s((l0) k3))) {
                            break loop0;
                        }
                    } else if (jVar.j(i2, k3, d.f1025g)) {
                        if (z(k3)) {
                            jVar.n(i2, d.f1022d);
                            break;
                        } else {
                            jVar.n(i2, d.f1028j);
                            jVar.h();
                        }
                    }
                }
            } else if (z(k2)) {
                jVar.n(i2, d.f1022d);
                break;
            } else {
                jVar.n(i2, d.f1028j);
                jVar.h();
                q(this);
            }
        }
        q(this);
    }

    public final j j(long j2, j jVar) {
        Object a2;
        long j3;
        j jVar2 = d.f1019a;
        c cVar = c.f1018m;
        loop0: while (true) {
            a2 = AbstractC0115a.a(jVar, j2, cVar);
            if (!AbstractC0115a.d(a2)) {
                v b2 = AbstractC0115a.b(a2);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1013k;
                    v vVar = (v) atomicReferenceFieldUpdater.get(this);
                    if (vVar.f1777g >= b2.f1777g) {
                        break loop0;
                    }
                    if (!b2.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, vVar, b2)) {
                        if (atomicReferenceFieldUpdater.get(this) != vVar) {
                            if (b2.e()) {
                                b2.d();
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
        if (AbstractC0115a.d(a2)) {
            s();
            if (jVar.f1777g * d.f1020b < p()) {
                jVar.a();
                return null;
            }
        } else {
            j jVar3 = (j) AbstractC0115a.b(a2);
            long j4 = jVar3.f1777g;
            if (!u() && j2 <= f1010h.get(this) / d.f1020b) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f1014l;
                    v vVar2 = (v) atomicReferenceFieldUpdater2.get(this);
                    if (vVar2.f1777g >= j4 || !jVar3.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, vVar2, jVar3)) {
                        if (atomicReferenceFieldUpdater2.get(this) != vVar2) {
                            if (jVar3.e()) {
                                jVar3.d();
                            }
                        }
                    }
                    if (vVar2.e()) {
                        vVar2.d();
                    }
                }
            }
            if (j4 <= j2) {
                return jVar3;
            }
            long j5 = j4 * d.f1020b;
            do {
                j3 = f1009g.get(this);
                if (j3 >= j5) {
                    break;
                }
            } while (!f1009g.compareAndSet(this, j3, j5));
            if (j4 * d.f1020b < p()) {
                jVar3.a();
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0177, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x00c2, code lost:
    
        c(r1, r4, r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0163 A[RETURN] */
    @Override // Y0.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object k(I0.b bVar, Object obj) {
        Object t;
        Object obj2;
        b bVar2;
        j jVar;
        int i2;
        b bVar3 = this;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1012j;
        j jVar2 = (j) atomicReferenceFieldUpdater.get(bVar3);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f1008f;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(bVar3);
            long j2 = andIncrement & 1152921504606846975L;
            boolean r2 = bVar3.r(andIncrement, false);
            int i3 = d.f1020b;
            long j3 = i3;
            long j4 = j2 / j3;
            int i4 = (int) (j2 % j3);
            long j5 = jVar2.f1777g;
            H0.a aVar = H0.a.f511e;
            D0.h hVar = D0.h.f206a;
            if (j5 != j4) {
                j a2 = a(bVar3, j4, jVar2);
                if (a2 != null) {
                    jVar2 = a2;
                } else if (r2) {
                    Object w2 = w(bVar, obj);
                    if (w2 == aVar) {
                        return w2;
                    }
                }
            }
            int d2 = d(bVar3, jVar2, i4, obj, j2, null, r2);
            if (d2 == 0) {
                jVar2.a();
                return hVar;
            }
            if (d2 == 1) {
                break;
            }
            if (d2 != 2) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = f1009g;
                if (d2 == 3) {
                    C0066f c2 = AbstractC0081v.c(AbstractC0086a.v(bVar));
                    Object obj3 = obj;
                    try {
                        int d3 = d(bVar3, jVar2, i4, obj3, j2, c2, false);
                        try {
                            if (d3 != 0) {
                                if (d3 == 1) {
                                    c2.g(hVar);
                                } else if (d3 != 2) {
                                    if (d3 != 4) {
                                        String str = "unexpected";
                                        if (d3 != 5) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        jVar2.a();
                                        j jVar3 = (j) atomicReferenceFieldUpdater.get(bVar3);
                                        while (true) {
                                            long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(bVar3);
                                            long j6 = andIncrement2 & 1152921504606846975L;
                                            boolean r3 = bVar3.r(andIncrement2, false);
                                            int i5 = d.f1020b;
                                            long j7 = i5;
                                            String str2 = str;
                                            long j8 = j6 / j7;
                                            int i6 = (int) (j6 % j7);
                                            if (jVar3.f1777g != j8) {
                                                j a3 = a(bVar3, j8, jVar3);
                                                if (a3 != null) {
                                                    i2 = i5;
                                                    jVar = a3;
                                                } else {
                                                    if (r3) {
                                                        break;
                                                    }
                                                    str = str2;
                                                }
                                            } else {
                                                jVar = jVar3;
                                                i2 = i5;
                                            }
                                            int d4 = d(bVar3, jVar, i6, obj3, j6, c2, r3);
                                            Object obj4 = obj3;
                                            bVar2 = bVar3;
                                            j jVar4 = jVar;
                                            obj2 = obj4;
                                            if (d4 == 0) {
                                                jVar4.a();
                                                break;
                                            }
                                            if (d4 == 1) {
                                                break;
                                            }
                                            if (d4 != 2) {
                                                if (d4 == 3) {
                                                    throw new IllegalStateException(str2);
                                                }
                                                if (d4 != 4) {
                                                    if (d4 == 5) {
                                                        jVar4.a();
                                                    }
                                                    jVar3 = jVar4;
                                                    bVar3 = bVar2;
                                                    str = str2;
                                                    obj3 = obj2;
                                                } else if (j6 < atomicLongFieldUpdater2.get(bVar2)) {
                                                    jVar4.a();
                                                }
                                            } else if (r3) {
                                                jVar4.h();
                                            } else {
                                                c2.a(jVar4, i6 + i2);
                                            }
                                        }
                                    } else {
                                        obj2 = obj3;
                                        bVar2 = bVar3;
                                        if (j2 < atomicLongFieldUpdater2.get(bVar2)) {
                                            jVar2.a();
                                        }
                                    }
                                    c(bVar2, obj2, c2);
                                } else {
                                    c2.a(jVar2, i4 + i3);
                                }
                                t = c2.t();
                                if (t != aVar) {
                                    t = hVar;
                                }
                                if (t != aVar) {
                                    return t;
                                }
                            } else {
                                jVar2.a();
                            }
                            c2.g(hVar);
                            t = c2.t();
                            if (t != aVar) {
                            }
                            if (t != aVar) {
                            }
                        } catch (Throwable th) {
                            th = th;
                            c2.A();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else if (d2 == 4) {
                    if (j2 < atomicLongFieldUpdater2.get(bVar3)) {
                        jVar2.a();
                    }
                    Object w3 = w(bVar, obj);
                    if (w3 == aVar) {
                        return w3;
                    }
                } else if (d2 == 5) {
                    jVar2.a();
                }
            } else if (r2) {
                jVar2.h();
                Object w4 = w(bVar, obj);
                if (w4 == aVar) {
                    return w4;
                }
            }
        }
    }

    @Override // Y0.r
    public Object l(Object obj) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f1008f;
        boolean z2 = false;
        long j2 = 1152921504606846975L;
        boolean z3 = r(atomicLongFieldUpdater.get(this), false) ? false : !e(r1 & 1152921504606846975L);
        h hVar = i.f1042a;
        if (z3) {
            return hVar;
        }
        InterfaceC0027i interfaceC0027i = d.f1028j;
        j jVar = (j) f1012j.get(this);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j3 = andIncrement & j2;
            boolean r2 = r(andIncrement, z2);
            int i2 = d.f1020b;
            long j4 = i2;
            long j5 = j3 / j4;
            int i3 = (int) (j3 % j4);
            if (jVar.f1777g != j5) {
                j a2 = a(this, j5, jVar);
                if (a2 != null) {
                    jVar = a2;
                } else {
                    if (r2) {
                        return new g(o());
                    }
                    z2 = false;
                    j2 = 1152921504606846975L;
                }
            }
            int d2 = d(this, jVar, i3, obj, j3, interfaceC0027i, r2);
            D0.h hVar2 = D0.h.f206a;
            if (d2 == 0) {
                jVar.a();
                return hVar2;
            }
            if (d2 == 1) {
                return hVar2;
            }
            if (d2 == 2) {
                if (r2) {
                    jVar.h();
                    return new g(o());
                }
                l0 l0Var = interfaceC0027i instanceof l0 ? (l0) interfaceC0027i : null;
                if (l0Var != null) {
                    l0Var.a(jVar, i3 + i2);
                }
                jVar.h();
                return hVar;
            }
            if (d2 == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (d2 == 4) {
                if (j3 < f1009g.get(this)) {
                    jVar.a();
                }
                return new g(o());
            }
            if (d2 == 5) {
                jVar.a();
            }
            z2 = false;
            j2 = 1152921504606846975L;
        }
    }

    public final Throwable m() {
        return (Throwable) f1015m.get(this);
    }

    public final Throwable n() {
        Throwable m2 = m();
        return m2 == null ? new k("Channel was closed") : m2;
    }

    public final Throwable o() {
        Throwable m2 = m();
        return m2 == null ? new l("Channel was closed") : m2;
    }

    public final long p() {
        return f1008f.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x00a2, code lost:
    
        r0 = (Y0.j) ((b1.d) b1.d.f1744f.get(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean r(long j2, boolean z2) {
        int i2 = (int) (j2 >> 60);
        if (i2 != 0 && i2 != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f1009g;
            if (i2 == 2) {
                g(1152921504606846975L & j2);
                if (z2) {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1013k;
                        j jVar = (j) atomicReferenceFieldUpdater.get(this);
                        long j3 = atomicLongFieldUpdater.get(this);
                        if (p() <= j3) {
                            break;
                        }
                        long j4 = d.f1020b;
                        long j5 = j3 / j4;
                        if (jVar.f1777g != j5 && (jVar = j(j5, jVar)) == null) {
                            if (((j) atomicReferenceFieldUpdater.get(this)).f1777g < j5) {
                                break;
                            }
                        } else {
                            jVar.a();
                            int i3 = (int) (j3 % j4);
                            while (true) {
                                Object k2 = jVar.k(i3);
                                if (k2 == null || k2 == d.f1023e) {
                                    if (jVar.j(i3, k2, d.f1026h)) {
                                        i();
                                        break;
                                    }
                                } else {
                                    if (k2 == d.f1022d) {
                                        break;
                                    }
                                    if (k2 != d.f1028j) {
                                        if (k2 != d.f1030l) {
                                            if (k2 != d.f1027i) {
                                                if (k2 != d.f1026h) {
                                                    if (k2 == d.f1025g) {
                                                        break;
                                                    }
                                                    if (k2 != d.f1024f && j3 == atomicLongFieldUpdater.get(this)) {
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            f1009g.compareAndSet(this, j3, j3 + 1);
                        }
                    }
                }
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException(L.d.e("unexpected close status: ", i2).toString());
                }
                j g2 = g(1152921504606846975L & j2);
                Object obj = null;
                loop0: do {
                    int i4 = d.f1020b - 1;
                    while (true) {
                        if (-1 >= i4) {
                            break;
                        }
                        long j6 = (g2.f1777g * d.f1020b) + i4;
                        while (true) {
                            Object k3 = g2.k(i4);
                            if (k3 == d.f1027i) {
                                break loop0;
                            }
                            if (k3 == d.f1022d) {
                                if (j6 < atomicLongFieldUpdater.get(this)) {
                                    break loop0;
                                }
                                if (g2.j(i4, k3, d.f1030l)) {
                                    g2.m(i4, null);
                                    g2.h();
                                    break;
                                }
                            } else if (k3 != d.f1023e && k3 != null) {
                                if (!(k3 instanceof l0) && !(k3 instanceof s)) {
                                    E e2 = d.f1025g;
                                    if (k3 == e2 || k3 == d.f1024f) {
                                        break loop0;
                                    }
                                    if (k3 != e2) {
                                        break;
                                    }
                                } else {
                                    if (j6 < atomicLongFieldUpdater.get(this)) {
                                        break loop0;
                                    }
                                    l0 l0Var = k3 instanceof s ? ((s) k3).f1050a : (l0) k3;
                                    if (g2.j(i4, k3, d.f1030l)) {
                                        obj = AbstractC0115a.e(obj, l0Var);
                                        g2.m(i4, null);
                                        g2.h();
                                        break;
                                    }
                                }
                            } else if (g2.j(i4, k3, d.f1030l)) {
                                g2.h();
                                break;
                            }
                        }
                        i4--;
                    }
                } while (g2 != null);
                if (obj != null) {
                    if (obj instanceof ArrayList) {
                        ArrayList arrayList = (ArrayList) obj;
                        for (int size = arrayList.size() - 1; -1 < size; size--) {
                            x((l0) arrayList.get(size), false);
                        }
                    } else {
                        x((l0) obj, false);
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean s() {
        return r(f1008f.get(this), false);
    }

    public boolean t() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:94:0x01aa, code lost:
    
        r16 = r7;
        r3 = (Y0.j) r3.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01b3, code lost:
    
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
        int i2 = (int) (f1008f.get(this) >> 60);
        if (i2 == 2) {
            sb.append("closed,");
        } else if (i2 == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.f1017e + ',');
        sb.append("data=[");
        int i3 = 0;
        boolean z3 = true;
        List O2 = E0.g.O(f1013k.get(this), f1012j.get(this), f1014l.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : O2) {
            if (((j) obj2) != d.f1019a) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j2 = ((j) next).f1777g;
            do {
                Object next2 = it.next();
                long j3 = ((j) next2).f1777g;
                if (j2 > j3) {
                    next = next2;
                    j2 = j3;
                }
            } while (it.hasNext());
        }
        j jVar = (j) next;
        long j4 = f1009g.get(this);
        long p2 = p();
        loop2: while (true) {
            int i4 = d.f1020b;
            int i5 = i3;
            while (true) {
                if (i5 >= i4) {
                    break;
                }
                long j5 = (jVar.f1777g * d.f1020b) + i5;
                if (j5 >= p2 && j5 >= j4) {
                    break loop2;
                }
                Object k2 = jVar.k(i5);
                boolean z4 = z3;
                Object obj3 = jVar.f1044j.get(i5 * 2);
                if (k2 instanceof InterfaceC0065e) {
                    obj = (j5 >= j4 || j5 < p2) ? (j5 >= p2 || j5 < j4) ? "cont" : "send" : "receive";
                } else if (k2 instanceof s) {
                    obj = "EB(" + k2 + ')';
                } else if (P0.h.a(k2, d.f1024f) ? z4 : P0.h.a(k2, d.f1025g)) {
                    obj = "resuming_sender";
                } else if (k2 == null ? z4 : k2.equals(d.f1023e) ? z4 : P0.h.a(k2, d.f1027i) ? z4 : P0.h.a(k2, d.f1026h) ? z4 : P0.h.a(k2, d.f1029k) ? z4 : P0.h.a(k2, d.f1028j) ? z4 : P0.h.a(k2, d.f1030l)) {
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
        if (sb.charAt(V0.i.O(sb)) == ',') {
            P0.h.d(sb.deleteCharAt(sb.length() - 1), "this.deleteCharAt(index)");
        }
        sb.append("]");
        return sb.toString();
    }

    public final boolean u() {
        long j2 = f1010h.get(this);
        return j2 == 0 || j2 == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(long j2, j jVar) {
        j jVar2;
        j jVar3;
        while (jVar.f1777g < j2 && (jVar3 = (j) jVar.b()) != null) {
            jVar = jVar3;
        }
        while (true) {
            if (!jVar.c() || (jVar2 = (j) jVar.b()) == null) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1014l;
                    v vVar = (v) atomicReferenceFieldUpdater.get(this);
                    if (vVar.f1777g >= jVar.f1777g) {
                        return;
                    }
                    if (!jVar.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, vVar, jVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != vVar) {
                            if (jVar.e()) {
                                jVar.d();
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
            jVar = jVar2;
        }
    }

    public final Object w(I0.b bVar, Object obj) {
        C0066f c0066f = new C0066f(1, AbstractC0086a.v(bVar));
        c0066f.u();
        c0066f.g(AbstractC0086a.l(o()));
        Object t = c0066f.t();
        return t == H0.a.f511e ? t : D0.h.f206a;
    }

    public final void x(l0 l0Var, boolean z2) {
        if (l0Var instanceof InterfaceC0065e) {
            ((G0.d) l0Var).g(AbstractC0086a.l(z2 ? n() : o()));
            return;
        }
        if (!(l0Var instanceof a)) {
            throw new IllegalStateException(("Unexpected waiter: " + l0Var).toString());
        }
        a aVar = (a) l0Var;
        C0066f c0066f = aVar.f1006f;
        P0.h.b(c0066f);
        aVar.f1006f = null;
        aVar.f1005e = d.f1030l;
        Throwable m2 = aVar.f1007g.m();
        if (m2 == null) {
            c0066f.g(Boolean.FALSE);
        } else {
            c0066f.g(AbstractC0086a.l(m2));
        }
    }

    public final boolean y(Object obj, Object obj2) {
        if (!(obj instanceof a)) {
            if (obj instanceof InterfaceC0065e) {
                P0.h.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
                return d.a((InterfaceC0065e) obj, obj2, null);
            }
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        }
        P0.h.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
        a aVar = (a) obj;
        C0066f c0066f = aVar.f1006f;
        P0.h.b(c0066f);
        aVar.f1006f = null;
        aVar.f1005e = obj2;
        return d.a(c0066f, Boolean.TRUE, null);
    }
}
