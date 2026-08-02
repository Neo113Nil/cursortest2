package a1;

import Y0.AbstractC0127v;
import Y0.C0112f;
import Y0.InterfaceC0111e;
import Y0.l0;
import a.AbstractC0132a;
import d1.AbstractC0184a;
import d1.v;
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

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f1291g = AtomicLongFieldUpdater.newUpdater(b.class, "sendersAndCloseStatus");

    /* renamed from: h, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f1292h = AtomicLongFieldUpdater.newUpdater(b.class, "receivers");

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f1293i = AtomicLongFieldUpdater.newUpdater(b.class, "bufferEnd");

    /* renamed from: j, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f1294j = AtomicLongFieldUpdater.newUpdater(b.class, "completedExpandBuffersAndPauseFlag");

    /* renamed from: k, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1295k = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "sendSegment");

    /* renamed from: l, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1296l = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "receiveSegment");

    /* renamed from: m, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1297m = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "bufferEndSegment");

    /* renamed from: n, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1298n = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_closeCause");

    /* renamed from: o, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1299o = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "closeHandler");
    private volatile Object _closeCause;
    private volatile long bufferEnd;
    private volatile Object bufferEndSegment;
    private volatile Object closeHandler;
    private volatile long completedExpandBuffersAndPauseFlag;

    /* renamed from: e, reason: collision with root package name */
    public final int f1300e;

    /* renamed from: f, reason: collision with root package name */
    public final P0.l f1301f;
    private volatile Object receiveSegment;
    private volatile long receivers;
    private volatile Object sendSegment;
    private volatile long sendersAndCloseStatus;

    public b(int i2, P0.l lVar) {
        this.f1300e = i2;
        this.f1301f = lVar;
        if (i2 < 0) {
            throw new IllegalArgumentException(("Invalid channel capacity: " + i2 + ", should be >=0").toString());
        }
        j jVar = d.f1303a;
        this.bufferEnd = i2 != 0 ? i2 != Integer.MAX_VALUE ? i2 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag = f1293i.get(this);
        j jVar2 = new j(0L, null, this, 3);
        this.sendSegment = jVar2;
        this.receiveSegment = jVar2;
        if (u()) {
            jVar2 = d.f1303a;
            Q0.h.c(jVar2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment = jVar2;
        this._closeCause = d.f1321s;
    }

    public static final j b(b bVar, long j2, j jVar) {
        Object b2;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j3;
        long j4;
        bVar.getClass();
        j jVar2 = d.f1303a;
        c cVar = c.f1302m;
        loop0: while (true) {
            b2 = AbstractC0184a.b(jVar, j2, cVar);
            if (!AbstractC0184a.e(b2)) {
                v c2 = AbstractC0184a.c(b2);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1295k;
                    v vVar = (v) atomicReferenceFieldUpdater.get(bVar);
                    if (vVar.f2107g >= c2.f2107g) {
                        break loop0;
                    }
                    if (!c2.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(bVar, vVar, c2)) {
                        if (atomicReferenceFieldUpdater.get(bVar) != vVar) {
                            if (c2.e()) {
                                c2.d();
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
        boolean e2 = AbstractC0184a.e(b2);
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f1292h;
        if (e2) {
            bVar.s();
            if (jVar.f2107g * d.f1304b >= atomicLongFieldUpdater2.get(bVar)) {
                return null;
            }
            jVar.a();
            return null;
        }
        j jVar3 = (j) AbstractC0184a.c(b2);
        long j5 = jVar3.f2107g;
        if (j5 <= j2) {
            return jVar3;
        }
        long j6 = d.f1304b * j5;
        do {
            atomicLongFieldUpdater = f1291g;
            j3 = atomicLongFieldUpdater.get(bVar);
            j4 = 1152921504606846975L & j3;
            if (j4 >= j6) {
                break;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(bVar, j3, j4 + (((int) (j3 >> 60)) << 60)));
        if (j5 * d.f1304b >= atomicLongFieldUpdater2.get(bVar)) {
            return null;
        }
        jVar3.a();
        return null;
    }

    public static final void c(b bVar, Object obj, C0112f c0112f) {
        F0.b a2;
        P0.l lVar = bVar.f1301f;
        if (lVar != null && (a2 = AbstractC0184a.a(lVar, obj, null)) != null) {
            AbstractC0127v.d(c0112f.f1205i, a2);
        }
        c0112f.j(i1.a.b(bVar.o()));
    }

    public static final int d(b bVar, j jVar, int i2, Object obj, long j2, Object obj2, boolean z2) {
        bVar.getClass();
        jVar.m(i2, obj);
        if (z2) {
            return bVar.B(jVar, i2, obj, j2, obj2, z2);
        }
        Object k2 = jVar.k(i2);
        if (k2 == null) {
            if (bVar.e(j2)) {
                if (jVar.j(i2, null, d.f1306d)) {
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
                jVar.n(i2, d.f1311i);
                return 0;
            }
            B.m mVar = d.f1313k;
            if (jVar.f1328j.getAndSet((i2 * 2) + 1, mVar) != mVar) {
                jVar.l(i2, true);
            }
            return 5;
        }
        return bVar.B(jVar, i2, obj, j2, obj2, z2);
    }

    public static void q(b bVar) {
        bVar.getClass();
        AtomicLongFieldUpdater atomicLongFieldUpdater = f1294j;
        if ((atomicLongFieldUpdater.addAndGet(bVar, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(bVar) & 4611686018427387904L) != 0) {
            }
        }
    }

    public static boolean z(Object obj) {
        if (obj instanceof InterfaceC0111e) {
            Q0.h.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return d.a((InterfaceC0111e) obj, F0.h.f469a, null);
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    public final Object A(j jVar, int i2, long j2, Object obj) {
        Object k2 = jVar.k(i2);
        AtomicReferenceArray atomicReferenceArray = jVar.f1328j;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f1291g;
        if (k2 == null) {
            if (j2 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return d.f1316n;
                }
                if (jVar.j(i2, k2, obj)) {
                    j();
                    return d.f1315m;
                }
            }
        } else if (k2 == d.f1306d && jVar.j(i2, k2, d.f1311i)) {
            j();
            Object obj2 = atomicReferenceArray.get(i2 * 2);
            jVar.m(i2, null);
            return obj2;
        }
        while (true) {
            Object k3 = jVar.k(i2);
            if (k3 == null || k3 == d.f1307e) {
                if (j2 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (jVar.j(i2, k3, d.f1310h)) {
                        j();
                        return d.f1317o;
                    }
                } else {
                    if (obj == null) {
                        return d.f1316n;
                    }
                    if (jVar.j(i2, k3, obj)) {
                        j();
                        return d.f1315m;
                    }
                }
            } else if (k3 != d.f1306d) {
                B.m mVar = d.f1312j;
                if (k3 == mVar) {
                    return d.f1317o;
                }
                if (k3 == d.f1310h) {
                    return d.f1317o;
                }
                if (k3 == d.f1314l) {
                    j();
                    return d.f1317o;
                }
                if (k3 != d.f1309g && jVar.j(i2, k3, d.f1308f)) {
                    boolean z2 = k3 instanceof s;
                    if (z2) {
                        k3 = ((s) k3).f1334a;
                    }
                    if (z(k3)) {
                        jVar.n(i2, d.f1311i);
                        j();
                        Object obj3 = atomicReferenceArray.get(i2 * 2);
                        jVar.m(i2, null);
                        return obj3;
                    }
                    jVar.n(i2, mVar);
                    jVar.h();
                    if (z2) {
                        j();
                    }
                    return d.f1317o;
                }
            } else if (jVar.j(i2, k3, d.f1311i)) {
                j();
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
                        if (jVar.j(i2, null, d.f1312j)) {
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
                } else if (jVar.j(i2, null, d.f1306d)) {
                    return 1;
                }
            } else {
                if (k2 != d.f1307e) {
                    B.m mVar = d.f1313k;
                    if (k2 == mVar) {
                        jVar.m(i2, null);
                        return 5;
                    }
                    if (k2 == d.f1310h) {
                        jVar.m(i2, null);
                        return 5;
                    }
                    if (k2 == d.f1314l) {
                        jVar.m(i2, null);
                        s();
                        return 4;
                    }
                    jVar.m(i2, null);
                    if (k2 instanceof s) {
                        k2 = ((s) k2).f1334a;
                    }
                    if (y(k2, obj)) {
                        jVar.n(i2, d.f1311i);
                        return 0;
                    }
                    if (jVar.f1328j.getAndSet((i2 * 2) + 1, mVar) == mVar) {
                        return 5;
                    }
                    jVar.l(i2, true);
                    return 5;
                }
                if (jVar.j(i2, k2, d.f1306d)) {
                    return 1;
                }
            }
        }
    }

    public final void C(long j2) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j3;
        long j4;
        if (u()) {
            return;
        }
        do {
            atomicLongFieldUpdater = f1293i;
        } while (atomicLongFieldUpdater.get(this) <= j2);
        int i2 = d.f1305c;
        int i3 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f1294j;
            if (i3 >= i2) {
                do {
                    j3 = atomicLongFieldUpdater2.get(this);
                } while (!atomicLongFieldUpdater2.compareAndSet(this, j3, 4611686018427387904L + (j3 & 4611686018427387903L)));
                while (true) {
                    long j5 = atomicLongFieldUpdater.get(this);
                    long j6 = atomicLongFieldUpdater2.get(this);
                    long j7 = j6 & 4611686018427387903L;
                    boolean z2 = (j6 & 4611686018427387904L) != 0;
                    if (j5 == j7 && j5 == atomicLongFieldUpdater.get(this)) {
                        break;
                    } else if (!z2) {
                        atomicLongFieldUpdater2.compareAndSet(this, j6, j7 + 4611686018427387904L);
                    }
                }
                do {
                    j4 = atomicLongFieldUpdater2.get(this);
                } while (!atomicLongFieldUpdater2.compareAndSet(this, j4, j4 & 4611686018427387903L));
                return;
            }
            long j8 = atomicLongFieldUpdater.get(this);
            if (j8 == (atomicLongFieldUpdater2.get(this) & 4611686018427387903L) && j8 == atomicLongFieldUpdater.get(this)) {
                return;
            } else {
                i3++;
            }
        }
    }

    @Override // a1.q
    public final void a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        f(cancellationException, true);
    }

    public final boolean e(long j2) {
        return j2 < f1293i.get(this) || j2 < f1292h.get(this) + ((long) this.f1300e);
    }

    public final boolean f(Throwable th, boolean z2) {
        boolean z3;
        long j2;
        long j3;
        long j4;
        Object obj;
        long j5;
        long j6;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f1291g;
        if (z2) {
            do {
                j6 = atomicLongFieldUpdater.get(this);
                if (((int) (j6 >> 60)) != 0) {
                    break;
                }
                j jVar = d.f1303a;
            } while (!atomicLongFieldUpdater.compareAndSet(this, j6, (1 << 60) + (j6 & 1152921504606846975L)));
        }
        B.m mVar = d.f1321s;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1298n;
            if (atomicReferenceFieldUpdater.compareAndSet(this, mVar, th)) {
                z3 = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != mVar) {
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
        s();
        if (z3) {
            loop3: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f1299o;
                obj = atomicReferenceFieldUpdater2.get(this);
                B.m mVar2 = obj == null ? d.f1319q : d.f1320r;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, mVar2)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj) {
                        break;
                    }
                }
            }
            if (obj != null) {
                Q0.r.a(1, obj);
                ((P0.l) obj).i(m());
            }
        }
        return z3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:?, code lost:
    
        return r1;
     */
    @Override // a1.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object g(Object obj) {
        j jVar;
        j jVar2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f1291g;
        boolean z2 = r(atomicLongFieldUpdater.get(this), false) ? false : !e(r0 & 1152921504606846975L);
        h hVar = i.f1326a;
        if (!z2) {
            N.e eVar = d.f1312j;
            j jVar3 = (j) f1295k.get(this);
            while (true) {
                long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
                long j2 = andIncrement & 1152921504606846975L;
                boolean r2 = r(andIncrement, false);
                int i2 = d.f1304b;
                long j3 = i2;
                long j4 = j2 / j3;
                int i3 = (int) (j2 % j3);
                if (jVar3.f2107g != j4) {
                    j b2 = b(this, j4, jVar3);
                    if (b2 != null) {
                        jVar = b2;
                    } else if (r2) {
                        return new g(o());
                    }
                } else {
                    jVar = jVar3;
                }
                j jVar4 = jVar;
                int d2 = d(this, jVar, i3, obj, j2, eVar, r2);
                F0.h hVar2 = F0.h.f469a;
                if (d2 == 0) {
                    jVar4.a();
                    break;
                }
                if (d2 == 1) {
                    break;
                }
                if (d2 == 2) {
                    if (r2) {
                        jVar4.h();
                        return new g(o());
                    }
                    l0 l0Var = eVar instanceof l0 ? (l0) eVar : null;
                    if (l0Var != null) {
                        jVar2 = jVar4;
                        l0Var.a(jVar2, i3 + i2);
                    } else {
                        jVar2 = jVar4;
                    }
                    jVar2.h();
                    return hVar;
                }
                if (d2 == 3) {
                    throw new IllegalStateException("unexpected");
                }
                if (d2 == 4) {
                    if (j2 < f1292h.get(this)) {
                        jVar4.a();
                    }
                    return new g(o());
                }
                if (d2 == 5) {
                    jVar4.a();
                }
                jVar3 = jVar4;
            }
        } else {
            return hVar;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0090, code lost:
    
        r1 = (a1.j) ((d1.d) d1.d.f2071f.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final j h(long j2) {
        Object obj;
        long j3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj2 = f1297m.get(this);
        j jVar = (j) f1295k.get(this);
        if (jVar.f2107g > ((j) obj2).f2107g) {
            obj2 = jVar;
        }
        j jVar2 = (j) f1296l.get(this);
        if (jVar2.f2107g > ((j) obj2).f2107g) {
            obj2 = jVar2;
        }
        d1.d dVar = (d1.d) obj2;
        loop0: while (true) {
            dVar.getClass();
            Object obj3 = d1.d.f2070e.get(dVar);
            B.m mVar = AbstractC0184a.f2063b;
            obj = null;
            if (obj3 == mVar) {
                break;
            }
            d1.d dVar2 = (d1.d) obj3;
            if (dVar2 == null) {
                do {
                    atomicReferenceFieldUpdater = d1.d.f2070e;
                    if (atomicReferenceFieldUpdater.compareAndSet(dVar, null, mVar)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(dVar) == null);
            } else {
                dVar = dVar2;
            }
        }
        j jVar3 = (j) dVar;
        if (t()) {
            j jVar4 = jVar3;
            loop2: do {
                int i2 = d.f1304b - 1;
                while (true) {
                    if (-1 >= i2) {
                        break;
                    }
                    j3 = (jVar4.f2107g * d.f1304b) + i2;
                    if (j3 < f1292h.get(this)) {
                        break loop2;
                    }
                    while (true) {
                        Object k2 = jVar4.k(i2);
                        if (k2 != null && k2 != d.f1307e) {
                            if (k2 == d.f1306d) {
                                break loop2;
                            }
                        } else {
                            if (jVar4.j(i2, k2, d.f1314l)) {
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
                i(j3);
            }
        }
        loop5: for (j jVar5 = jVar3; jVar5 != null; jVar5 = (j) ((d1.d) d1.d.f2071f.get(jVar5))) {
            for (int i3 = d.f1304b - 1; -1 < i3; i3--) {
                if ((jVar5.f2107g * d.f1304b) + i3 < j2) {
                    break loop5;
                }
                while (true) {
                    Object k3 = jVar5.k(i3);
                    if (k3 != null && k3 != d.f1307e) {
                        if (!(k3 instanceof s)) {
                            if (!(k3 instanceof l0)) {
                                break;
                            }
                            if (jVar5.j(i3, k3, d.f1314l)) {
                                obj = AbstractC0184a.f(obj, k3);
                                jVar5.l(i3, true);
                                break;
                            }
                        } else {
                            if (jVar5.j(i3, k3, d.f1314l)) {
                                obj = AbstractC0184a.f(obj, ((s) k3).f1334a);
                                jVar5.l(i3, true);
                                break;
                            }
                        }
                    } else {
                        if (jVar5.j(i3, k3, d.f1314l)) {
                            jVar5.h();
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
                    x((l0) arrayList.get(size), true);
                }
            } else {
                x((l0) obj, true);
            }
        }
        return jVar3;
    }

    public final void i(long j2) {
        F0.b a2;
        j jVar = (j) f1296l.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f1292h;
            long j3 = atomicLongFieldUpdater.get(this);
            if (j2 < Math.max(this.f1300e + j3, f1293i.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j3, j3 + 1)) {
                long j4 = d.f1304b;
                long j5 = j3 / j4;
                int i2 = (int) (j3 % j4);
                if (jVar.f2107g != j5) {
                    j k2 = k(j5, jVar);
                    if (k2 == null) {
                        continue;
                    } else {
                        jVar = k2;
                    }
                }
                Object A2 = A(jVar, i2, j3, null);
                if (A2 != d.f1317o) {
                    jVar.a();
                    P0.l lVar = this.f1301f;
                    if (lVar != null && (a2 = AbstractC0184a.a(lVar, A2, null)) != null) {
                        throw a2;
                    }
                } else if (j3 < p()) {
                    jVar.a();
                }
            }
        }
    }

    public final void j() {
        Object b2;
        if (u()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1297m;
        j jVar = (j) atomicReferenceFieldUpdater.get(this);
        loop0: while (true) {
            long andIncrement = f1293i.getAndIncrement(this);
            long j2 = andIncrement / d.f1304b;
            if (p() <= andIncrement) {
                if (jVar.f2107g < j2 && jVar.b() != null) {
                    v(j2, jVar);
                }
                q(this);
                return;
            }
            if (jVar.f2107g != j2) {
                c cVar = c.f1302m;
                while (true) {
                    b2 = AbstractC0184a.b(jVar, j2, cVar);
                    if (!AbstractC0184a.e(b2)) {
                        v c2 = AbstractC0184a.c(b2);
                        while (true) {
                            v vVar = (v) atomicReferenceFieldUpdater.get(this);
                            if (vVar.f2107g >= c2.f2107g) {
                                break;
                            }
                            if (!c2.i()) {
                                break;
                            }
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, vVar, c2)) {
                                if (atomicReferenceFieldUpdater.get(this) != vVar) {
                                    if (c2.e()) {
                                        c2.d();
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
                if (AbstractC0184a.e(b2)) {
                    s();
                    v(j2, jVar);
                    q(this);
                } else {
                    j jVar3 = (j) AbstractC0184a.c(b2);
                    long j3 = jVar3.f2107g;
                    if (j3 > j2) {
                        long j4 = j3 * d.f1304b;
                        if (f1293i.compareAndSet(this, andIncrement + 1, j4)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = f1294j;
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
            int i2 = (int) (andIncrement % d.f1304b);
            Object k2 = jVar.k(i2);
            boolean z2 = k2 instanceof l0;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f1292h;
            if (!z2 || andIncrement < atomicLongFieldUpdater2.get(this) || !jVar.j(i2, k2, d.f1309g)) {
                while (true) {
                    Object k3 = jVar.k(i2);
                    if (!(k3 instanceof l0)) {
                        if (k3 != d.f1312j) {
                            if (k3 != null) {
                                if (k3 == d.f1306d || k3 == d.f1310h || k3 == d.f1311i || k3 == d.f1313k || k3 == d.f1314l) {
                                    break loop0;
                                }
                                if (k3 != d.f1308f) {
                                    throw new IllegalStateException(("Unexpected cell state: " + k3).toString());
                                }
                            } else if (jVar.j(i2, k3, d.f1307e)) {
                                break loop0;
                            }
                        } else {
                            break;
                        }
                    } else if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                        if (jVar.j(i2, k3, new s((l0) k3))) {
                            break loop0;
                        }
                    } else if (jVar.j(i2, k3, d.f1309g)) {
                        if (z(k3)) {
                            jVar.n(i2, d.f1306d);
                            break;
                        } else {
                            jVar.n(i2, d.f1312j);
                            jVar.h();
                        }
                    }
                }
            } else if (z(k2)) {
                jVar.n(i2, d.f1306d);
                break;
            } else {
                jVar.n(i2, d.f1312j);
                jVar.h();
                q(this);
            }
        }
        q(this);
    }

    public final j k(long j2, j jVar) {
        Object b2;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j3;
        j jVar2 = d.f1303a;
        c cVar = c.f1302m;
        loop0: while (true) {
            b2 = AbstractC0184a.b(jVar, j2, cVar);
            if (!AbstractC0184a.e(b2)) {
                v c2 = AbstractC0184a.c(b2);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1296l;
                    v vVar = (v) atomicReferenceFieldUpdater.get(this);
                    if (vVar.f2107g >= c2.f2107g) {
                        break loop0;
                    }
                    if (!c2.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, vVar, c2)) {
                        if (atomicReferenceFieldUpdater.get(this) != vVar) {
                            if (c2.e()) {
                                c2.d();
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
        if (AbstractC0184a.e(b2)) {
            s();
            if (jVar.f2107g * d.f1304b >= p()) {
                return null;
            }
            jVar.a();
            return null;
        }
        j jVar3 = (j) AbstractC0184a.c(b2);
        boolean u2 = u();
        long j4 = jVar3.f2107g;
        if (!u2 && j2 <= f1293i.get(this) / d.f1304b) {
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f1297m;
                v vVar2 = (v) atomicReferenceFieldUpdater2.get(this);
                if (vVar2.f2107g >= j4 || !jVar3.i()) {
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
        long j5 = d.f1304b * j4;
        do {
            atomicLongFieldUpdater = f1292h;
            j3 = atomicLongFieldUpdater.get(this);
            if (j3 >= j5) {
                break;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j3, j5));
        if (j4 * d.f1304b >= p()) {
            return null;
        }
        jVar3.a();
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x01d0, code lost:
    
        if (r0 == r13) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008a, code lost:
    
        if (r0 == r13) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008d, code lost:
    
        r3 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x01dc, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f1, code lost:
    
        r5 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00f3, code lost:
    
        c(r26, r28, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00f6, code lost:
    
        r2 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01bb, code lost:
    
        if (r0 == r13) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00fb, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00fc, code lost:
    
        r2 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01bf, code lost:
    
        r2.B();
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01c2, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0145, code lost:
    
        if (r20 >= r5.get(r26)) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0147, code lost:
    
        r22.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x014a, code lost:
    
        r2 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x014c, code lost:
    
        c(r26, r28, r2);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01ba  */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [Y0.f] */
    @Override // a1.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object l(H0.d dVar, Object obj) {
        j jVar;
        Object obj2;
        F0.h hVar;
        ?? r2;
        C0112f c0112f;
        C0112f c0112f2;
        j jVar2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1295k;
        j jVar3 = (j) atomicReferenceFieldUpdater.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f1291g;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j2 = andIncrement & 1152921504606846975L;
            boolean r3 = r(andIncrement, false);
            int i2 = d.f1304b;
            long j3 = i2;
            long j4 = j2 / j3;
            int i3 = (int) (j2 % j3);
            long j5 = jVar3.f2107g;
            F0.h hVar2 = F0.h.f469a;
            I0.a aVar = I0.a.f733e;
            if (j5 != j4) {
                j b2 = b(this, j4, jVar3);
                if (b2 != null) {
                    jVar = b2;
                } else if (r3) {
                    obj2 = w(dVar, obj);
                    if (obj2 != aVar) {
                        hVar = hVar2;
                    }
                }
            } else {
                jVar = jVar3;
            }
            j jVar4 = jVar;
            int d2 = d(this, jVar, i3, obj, j2, null, r3);
            if (d2 == 0) {
                hVar = hVar2;
                jVar4.a();
                break;
            }
            if (d2 == 1) {
                break;
            }
            if (d2 != 2) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = f1292h;
                if (d2 == 3) {
                    C0112f c2 = AbstractC0127v.c(i1.a.t(dVar));
                    j jVar5 = jVar4;
                    try {
                        int d3 = d(this, jVar5, i3, obj, j2, c2, false);
                        try {
                            if (d3 != 0) {
                                if (d3 != 1) {
                                    if (d3 == 2) {
                                        c0112f = c2;
                                        hVar = hVar2;
                                        c0112f.a(jVar4, i3 + i2);
                                    } else if (d3 == 4) {
                                        c0112f = c2;
                                        hVar = hVar2;
                                        if (j2 < atomicLongFieldUpdater2.get(this)) {
                                            jVar4.a();
                                        }
                                        c(this, obj, c0112f);
                                    } else {
                                        if (d3 != 5) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        jVar4.a();
                                        j jVar6 = (j) atomicReferenceFieldUpdater.get(this);
                                        while (true) {
                                            long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(this);
                                            long j6 = andIncrement2 & 1152921504606846975L;
                                            boolean r4 = r(andIncrement2, false);
                                            int i4 = d.f1304b;
                                            long j7 = i4;
                                            long j8 = j6 / j7;
                                            int i5 = (int) (j6 % j7);
                                            if (jVar6.f2107g != j8) {
                                                try {
                                                    j b3 = b(this, j8, jVar6);
                                                    if (b3 != null) {
                                                        c0112f2 = c2;
                                                        jVar2 = b3;
                                                    } else if (r4) {
                                                        break;
                                                    }
                                                } catch (Throwable th) {
                                                    th = th;
                                                    C0112f c0112f3 = c2;
                                                }
                                            } else {
                                                c0112f2 = c2;
                                                jVar2 = jVar6;
                                            }
                                            c2 = c0112f2;
                                            j jVar7 = jVar2;
                                            int d4 = d(this, jVar2, i5, obj, j6, c2, r4);
                                            if (d4 == 0) {
                                                c0112f = c2;
                                                hVar = hVar2;
                                                jVar7.a();
                                                break;
                                            }
                                            if (d4 == 1) {
                                                break;
                                            }
                                            if (d4 == 2) {
                                                c0112f = c2;
                                                if (r4) {
                                                    jVar7.h();
                                                } else {
                                                    c0112f.a(jVar7, i5 + i4);
                                                }
                                            } else {
                                                if (d4 == 3) {
                                                    throw new IllegalStateException("unexpected");
                                                }
                                                if (d4 == 4) {
                                                    break;
                                                }
                                                if (d4 == 5) {
                                                    jVar7.a();
                                                }
                                                jVar6 = jVar7;
                                            }
                                        }
                                        hVar = hVar2;
                                    }
                                    obj2 = c0112f.u();
                                    if (obj2 != aVar) {
                                        obj2 = hVar;
                                    }
                                }
                                c0112f = c2;
                                hVar = hVar2;
                                c0112f.j(hVar);
                                obj2 = c0112f.u();
                                if (obj2 != aVar) {
                                }
                            } else {
                                c0112f = c2;
                                hVar = hVar2;
                                jVar4.a();
                            }
                            c0112f.j(hVar);
                            obj2 = c0112f.u();
                            if (obj2 != aVar) {
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            r2 = jVar5;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        r2 = c2;
                    }
                } else if (d2 != 4) {
                    if (d2 == 5) {
                        jVar4.a();
                    }
                    jVar3 = jVar4;
                } else {
                    if (j2 < atomicLongFieldUpdater2.get(this)) {
                        jVar4.a();
                    }
                    obj2 = w(dVar, obj);
                }
            } else {
                hVar = hVar2;
                if (r3) {
                    jVar4.h();
                    obj2 = w(dVar, obj);
                }
            }
        }
        return obj2;
    }

    public final Throwable m() {
        return (Throwable) f1298n.get(this);
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
        return f1291g.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x00c7, code lost:
    
        r0 = (a1.j) ((d1.d) d1.d.f2071f.get(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean r(long j2, boolean z2) {
        int i2 = (int) (j2 >> 60);
        if (i2 == 0 || i2 == 1) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f1292h;
        if (i2 == 2) {
            h(j2 & 1152921504606846975L);
            if (z2) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1296l;
                    j jVar = (j) atomicReferenceFieldUpdater.get(this);
                    long j3 = atomicLongFieldUpdater.get(this);
                    if (p() <= j3) {
                        break;
                    }
                    long j4 = d.f1304b;
                    long j5 = j3 / j4;
                    if (jVar.f2107g != j5 && (jVar = k(j5, jVar)) == null) {
                        if (((j) atomicReferenceFieldUpdater.get(this)).f2107g < j5) {
                            break;
                        }
                    } else {
                        jVar.a();
                        int i3 = (int) (j3 % j4);
                        while (true) {
                            Object k2 = jVar.k(i3);
                            if (k2 == null || k2 == d.f1307e) {
                                if (jVar.j(i3, k2, d.f1310h)) {
                                    j();
                                    break;
                                }
                            } else {
                                if (k2 == d.f1306d) {
                                    return false;
                                }
                                if (k2 != d.f1312j && k2 != d.f1314l && k2 != d.f1311i && k2 != d.f1310h) {
                                    if (k2 == d.f1309g) {
                                        return false;
                                    }
                                    if (k2 != d.f1308f && j3 == atomicLongFieldUpdater.get(this)) {
                                        return false;
                                    }
                                }
                            }
                        }
                        f1292h.compareAndSet(this, j3, j3 + 1);
                    }
                }
            }
        } else {
            if (i2 != 3) {
                throw new IllegalStateException(("unexpected close status: " + i2).toString());
            }
            j h2 = h(j2 & 1152921504606846975L);
            F0.b bVar = null;
            Object obj = null;
            loop0: do {
                int i4 = d.f1304b - 1;
                while (true) {
                    if (-1 >= i4) {
                        break;
                    }
                    long j6 = (h2.f2107g * d.f1304b) + i4;
                    while (true) {
                        Object k3 = h2.k(i4);
                        if (k3 == d.f1311i) {
                            break loop0;
                        }
                        B.m mVar = d.f1306d;
                        AtomicReferenceArray atomicReferenceArray = h2.f1328j;
                        P0.l lVar = this.f1301f;
                        if (k3 == mVar) {
                            if (j6 < atomicLongFieldUpdater.get(this)) {
                                break loop0;
                            }
                            if (h2.j(i4, k3, d.f1314l)) {
                                if (lVar != null) {
                                    bVar = AbstractC0184a.a(lVar, atomicReferenceArray.get(i4 * 2), bVar);
                                }
                                h2.m(i4, null);
                                h2.h();
                            }
                        } else if (k3 == d.f1307e || k3 == null) {
                            if (h2.j(i4, k3, d.f1314l)) {
                                h2.h();
                                break;
                            }
                        } else if (!(k3 instanceof l0) && !(k3 instanceof s)) {
                            B.m mVar2 = d.f1309g;
                            if (k3 == mVar2 || k3 == d.f1308f) {
                                break loop0;
                            }
                            if (k3 != mVar2) {
                                break;
                            }
                        } else {
                            if (j6 < atomicLongFieldUpdater.get(this)) {
                                break loop0;
                            }
                            l0 l0Var = k3 instanceof s ? ((s) k3).f1334a : (l0) k3;
                            if (h2.j(i4, k3, d.f1314l)) {
                                if (lVar != null) {
                                    bVar = AbstractC0184a.a(lVar, atomicReferenceArray.get(i4 * 2), bVar);
                                }
                                obj = AbstractC0184a.f(obj, l0Var);
                                h2.m(i4, null);
                                h2.h();
                            }
                        }
                    }
                    i4--;
                }
            } while (h2 != null);
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
            if (bVar != null) {
                throw bVar;
            }
        }
        return true;
    }

    public final boolean s() {
        return r(f1291g.get(this), false);
    }

    public boolean t() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x019b, code lost:
    
        r3 = (a1.j) r3.b();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        String obj;
        StringBuilder sb = new StringBuilder();
        int i2 = (int) (f1291g.get(this) >> 60);
        if (i2 == 2) {
            sb.append("closed,");
        } else if (i2 == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.f1300e + ',');
        sb.append("data=[");
        List O2 = G0.e.O(f1296l.get(this), f1295k.get(this), f1297m.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : O2) {
            if (((j) obj2) != d.f1303a) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j2 = ((j) next).f2107g;
            do {
                Object next2 = it.next();
                long j3 = ((j) next2).f2107g;
                if (j2 > j3) {
                    next = next2;
                    j2 = j3;
                }
            } while (it.hasNext());
        }
        j jVar = (j) next;
        long j4 = f1292h.get(this);
        long p2 = p();
        loop2: do {
            int i3 = d.f1304b;
            int i4 = 0;
            while (true) {
                if (i4 >= i3) {
                    break;
                }
                long j5 = (jVar.f2107g * d.f1304b) + i4;
                if (j5 >= p2 && j5 >= j4) {
                    break loop2;
                }
                Object k2 = jVar.k(i4);
                Object obj3 = jVar.f1328j.get(i4 * 2);
                if (k2 instanceof InterfaceC0111e) {
                    obj = (j5 >= j4 || j5 < p2) ? (j5 >= p2 || j5 < j4) ? "cont" : "send" : "receive";
                } else if (k2 instanceof s) {
                    obj = "EB(" + k2 + ')';
                } else if (Q0.h.a(k2, d.f1308f) ? true : Q0.h.a(k2, d.f1309g)) {
                    obj = "resuming_sender";
                } else if (k2 == null ? true : k2.equals(d.f1307e) ? true : Q0.h.a(k2, d.f1311i) ? true : Q0.h.a(k2, d.f1310h) ? true : Q0.h.a(k2, d.f1313k) ? true : Q0.h.a(k2, d.f1312j) ? true : Q0.h.a(k2, d.f1314l)) {
                    i4++;
                } else {
                    obj = k2.toString();
                }
                if (obj3 != null) {
                    sb.append("(" + obj + ',' + obj3 + "),");
                } else {
                    sb.append(obj + ',');
                }
                i4++;
            }
        } while (jVar != null);
        if (sb.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        if (sb.charAt(X0.j.P(sb)) == ',') {
            Q0.h.d(sb.deleteCharAt(sb.length() - 1), "this.deleteCharAt(index)");
        }
        sb.append("]");
        return sb.toString();
    }

    public final boolean u() {
        long j2 = f1293i.get(this);
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
        while (jVar.f2107g < j2 && (jVar3 = (j) jVar.b()) != null) {
            jVar = jVar3;
        }
        while (true) {
            if (!jVar.c() || (jVar2 = (j) jVar.b()) == null) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1297m;
                    v vVar = (v) atomicReferenceFieldUpdater.get(this);
                    if (vVar.f2107g >= jVar.f2107g) {
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

    public final Object w(H0.d dVar, Object obj) {
        F0.b a2;
        C0112f c0112f = new C0112f(1, i1.a.t(dVar));
        c0112f.v();
        P0.l lVar = this.f1301f;
        if (lVar == null || (a2 = AbstractC0184a.a(lVar, obj, null)) == null) {
            c0112f.j(i1.a.b(o()));
        } else {
            AbstractC0132a.c(a2, o());
            c0112f.j(i1.a.b(a2));
        }
        Object u2 = c0112f.u();
        return u2 == I0.a.f733e ? u2 : F0.h.f469a;
    }

    public final void x(l0 l0Var, boolean z2) {
        if (l0Var instanceof InterfaceC0111e) {
            ((H0.d) l0Var).j(i1.a.b(z2 ? n() : o()));
            return;
        }
        if (!(l0Var instanceof a)) {
            throw new IllegalStateException(("Unexpected waiter: " + l0Var).toString());
        }
        a aVar = (a) l0Var;
        C0112f c0112f = aVar.f1289f;
        Q0.h.b(c0112f);
        aVar.f1289f = null;
        aVar.f1288e = d.f1314l;
        Throwable m2 = aVar.f1290g.m();
        if (m2 == null) {
            c0112f.j(Boolean.FALSE);
        } else {
            c0112f.j(i1.a.b(m2));
        }
    }

    public final boolean y(Object obj, Object obj2) {
        if (!(obj instanceof a)) {
            if (!(obj instanceof InterfaceC0111e)) {
                throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
            }
            Q0.h.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            InterfaceC0111e interfaceC0111e = (InterfaceC0111e) obj;
            P0.l lVar = this.f1301f;
            return d.a(interfaceC0111e, obj2, lVar != null ? new d1.q(lVar, obj2, interfaceC0111e.f()) : null);
        }
        Q0.h.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
        a aVar = (a) obj;
        C0112f c0112f = aVar.f1289f;
        Q0.h.b(c0112f);
        aVar.f1289f = null;
        aVar.f1288e = obj2;
        Boolean bool = Boolean.TRUE;
        P0.l lVar2 = aVar.f1290g.f1301f;
        return d.a(c0112f, bool, lVar2 != null ? new d1.q(lVar2, obj2, c0112f.f1205i) : null);
    }
}
