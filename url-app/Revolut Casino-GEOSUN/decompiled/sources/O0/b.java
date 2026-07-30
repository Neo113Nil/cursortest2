package O0;

import M0.AbstractC0063v;
import M0.C0048f;
import M0.InterfaceC0047e;
import M0.l0;
import R0.AbstractC0068a;
import R0.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import u0.C0247g;

/* loaded from: classes.dex */
public class b implements f {

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f708g = AtomicLongFieldUpdater.newUpdater(b.class, "sendersAndCloseStatus");

    /* renamed from: h, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f709h = AtomicLongFieldUpdater.newUpdater(b.class, "receivers");

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f710i = AtomicLongFieldUpdater.newUpdater(b.class, "bufferEnd");

    /* renamed from: j, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f711j = AtomicLongFieldUpdater.newUpdater(b.class, "completedExpandBuffersAndPauseFlag");

    /* renamed from: k, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f712k = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "sendSegment");

    /* renamed from: l, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f713l = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "receiveSegment");

    /* renamed from: m, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f714m = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "bufferEndSegment");

    /* renamed from: n, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f715n = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_closeCause");

    /* renamed from: o, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f716o = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "closeHandler");
    private volatile Object _closeCause;
    private volatile long bufferEnd;
    private volatile Object bufferEndSegment;
    private volatile Object closeHandler;
    private volatile long completedExpandBuffersAndPauseFlag;

    /* renamed from: e, reason: collision with root package name */
    public final int f717e;

    /* renamed from: f, reason: collision with root package name */
    public final E0.l f718f;
    private volatile Object receiveSegment;
    private volatile long receivers;
    private volatile Object sendSegment;
    private volatile long sendersAndCloseStatus;

    public b(int i2, E0.l lVar) {
        this.f717e = i2;
        this.f718f = lVar;
        if (i2 < 0) {
            throw new IllegalArgumentException(("Invalid channel capacity: " + i2 + ", should be >=0").toString());
        }
        j jVar = d.f720a;
        this.bufferEnd = i2 != 0 ? i2 != Integer.MAX_VALUE ? i2 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag = f710i.get(this);
        j jVar2 = new j(0L, null, this, 3);
        this.sendSegment = jVar2;
        this.receiveSegment = jVar2;
        if (u()) {
            jVar2 = d.f720a;
            F0.i.c(jVar2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment = jVar2;
        this._closeCause = d.f737s;
    }

    public static final j b(b bVar, long j2, j jVar) {
        Object c2;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j3;
        long j4;
        bVar.getClass();
        j jVar2 = d.f720a;
        c cVar = c.f719m;
        loop0: while (true) {
            c2 = AbstractC0068a.c(jVar, j2, cVar);
            if (!AbstractC0068a.f(c2)) {
                v d2 = AbstractC0068a.d(c2);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f712k;
                    v vVar = (v) atomicReferenceFieldUpdater.get(bVar);
                    if (vVar.f938g >= d2.f938g) {
                        break loop0;
                    }
                    if (!d2.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(bVar, vVar, d2)) {
                        if (atomicReferenceFieldUpdater.get(bVar) != vVar) {
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
        boolean f2 = AbstractC0068a.f(c2);
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f709h;
        if (f2) {
            bVar.s();
            if (jVar.f938g * d.f721b >= atomicLongFieldUpdater2.get(bVar)) {
                return null;
            }
            jVar.a();
            return null;
        }
        j jVar3 = (j) AbstractC0068a.d(c2);
        long j5 = jVar3.f938g;
        if (j5 <= j2) {
            return jVar3;
        }
        long j6 = d.f721b * j5;
        do {
            atomicLongFieldUpdater = f708g;
            j3 = atomicLongFieldUpdater.get(bVar);
            j4 = 1152921504606846975L & j3;
            if (j4 >= j6) {
                break;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(bVar, j3, j4 + (((int) (j3 >> 60)) << 60)));
        if (j5 * d.f721b >= atomicLongFieldUpdater2.get(bVar)) {
            return null;
        }
        jVar3.a();
        return null;
    }

    public static final void c(b bVar, Object obj, C0048f c0048f) {
        E0.l lVar = bVar.f718f;
        if (lVar != null) {
            AbstractC0068a.a(lVar, obj, c0048f.f662i);
        }
        c0048f.resumeWith(o.g.f(bVar.o()));
    }

    public static final int e(b bVar, j jVar, int i2, Object obj, long j2, Object obj2, boolean z2) {
        bVar.getClass();
        jVar.m(i2, obj);
        if (z2) {
            return bVar.B(jVar, i2, obj, j2, obj2, z2);
        }
        Object k2 = jVar.k(i2);
        if (k2 == null) {
            if (bVar.f(j2)) {
                if (jVar.j(i2, null, d.f723d)) {
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
                jVar.n(i2, d.f728i);
                return 0;
            }
            A.j jVar2 = d.f730k;
            if (jVar.f744j.getAndSet((i2 * 2) + 1, jVar2) != jVar2) {
                jVar.l(i2, true);
            }
            return 5;
        }
        return bVar.B(jVar, i2, obj, j2, obj2, z2);
    }

    public static void q(b bVar) {
        bVar.getClass();
        AtomicLongFieldUpdater atomicLongFieldUpdater = f711j;
        if ((atomicLongFieldUpdater.addAndGet(bVar, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(bVar) & 4611686018427387904L) != 0) {
            }
        }
    }

    public static boolean z(Object obj) {
        if (obj instanceof InterfaceC0047e) {
            F0.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return d.a((InterfaceC0047e) obj, C0247g.f3005a, null);
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    public final Object A(j jVar, int i2, long j2, Object obj) {
        Object k2 = jVar.k(i2);
        AtomicReferenceArray atomicReferenceArray = jVar.f744j;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f708g;
        if (k2 == null) {
            if (j2 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return d.f733n;
                }
                if (jVar.j(i2, k2, obj)) {
                    j();
                    return d.f732m;
                }
            }
        } else if (k2 == d.f723d && jVar.j(i2, k2, d.f728i)) {
            j();
            Object obj2 = atomicReferenceArray.get(i2 * 2);
            jVar.m(i2, null);
            return obj2;
        }
        while (true) {
            Object k3 = jVar.k(i2);
            if (k3 == null || k3 == d.f724e) {
                if (j2 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (jVar.j(i2, k3, d.f727h)) {
                        j();
                        return d.f734o;
                    }
                } else {
                    if (obj == null) {
                        return d.f733n;
                    }
                    if (jVar.j(i2, k3, obj)) {
                        j();
                        return d.f732m;
                    }
                }
            } else if (k3 != d.f723d) {
                A.j jVar2 = d.f729j;
                if (k3 == jVar2) {
                    return d.f734o;
                }
                if (k3 == d.f727h) {
                    return d.f734o;
                }
                if (k3 == d.f731l) {
                    j();
                    return d.f734o;
                }
                if (k3 != d.f726g && jVar.j(i2, k3, d.f725f)) {
                    boolean z2 = k3 instanceof s;
                    if (z2) {
                        k3 = ((s) k3).f750a;
                    }
                    if (z(k3)) {
                        jVar.n(i2, d.f728i);
                        j();
                        Object obj3 = atomicReferenceArray.get(i2 * 2);
                        jVar.m(i2, null);
                        return obj3;
                    }
                    jVar.n(i2, jVar2);
                    jVar.h();
                    if (z2) {
                        j();
                    }
                    return d.f734o;
                }
            } else if (jVar.j(i2, k3, d.f728i)) {
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
                if (!f(j2) || z2) {
                    if (z2) {
                        if (jVar.j(i2, null, d.f729j)) {
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
                } else if (jVar.j(i2, null, d.f723d)) {
                    return 1;
                }
            } else {
                if (k2 != d.f724e) {
                    A.j jVar2 = d.f730k;
                    if (k2 == jVar2) {
                        jVar.m(i2, null);
                        return 5;
                    }
                    if (k2 == d.f727h) {
                        jVar.m(i2, null);
                        return 5;
                    }
                    if (k2 == d.f731l) {
                        jVar.m(i2, null);
                        s();
                        return 4;
                    }
                    jVar.m(i2, null);
                    if (k2 instanceof s) {
                        k2 = ((s) k2).f750a;
                    }
                    if (y(k2, obj)) {
                        jVar.n(i2, d.f728i);
                        return 0;
                    }
                    if (jVar.f744j.getAndSet((i2 * 2) + 1, jVar2) == jVar2) {
                        return 5;
                    }
                    jVar.l(i2, true);
                    return 5;
                }
                if (jVar.j(i2, k2, d.f723d)) {
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
            atomicLongFieldUpdater = f710i;
        } while (atomicLongFieldUpdater.get(this) <= j2);
        int i2 = d.f722c;
        int i3 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f711j;
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

    @Override // O0.q
    public final void a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        g(cancellationException, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ee, code lost:
    
        r5 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00f2, code lost:
    
        c(r26, r27, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00f5, code lost:
    
        r2 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00fa, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00fb, code lost:
    
        r2 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01c8, code lost:
    
        r2.z();
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01cb, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x014c, code lost:
    
        if (r24 >= r5.get(r26)) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x014e, code lost:
    
        r19.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0151, code lost:
    
        r1 = r27;
        r2 = r28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [M0.f] */
    @Override // O0.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object d(Object obj, w0.d dVar) {
        j jVar;
        Object obj2;
        ?? r2;
        C0048f c0048f;
        C0247g c0247g;
        C0048f c0048f2;
        j jVar2;
        Object obj3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f712k;
        j jVar3 = (j) atomicReferenceFieldUpdater.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f708g;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j2 = andIncrement & 1152921504606846975L;
            boolean r = r(andIncrement, false);
            int i2 = d.f721b;
            long j3 = i2;
            long j4 = j2 / j3;
            int i3 = (int) (j2 % j3);
            long j5 = jVar3.f938g;
            C0247g c0247g2 = C0247g.f3005a;
            x0.a aVar = x0.a.f3094e;
            if (j5 != j4) {
                j b2 = b(this, j4, jVar3);
                if (b2 != null) {
                    jVar = b2;
                } else if (r) {
                    obj2 = w(obj, dVar);
                    if (obj2 != aVar) {
                        return c0247g2;
                    }
                }
            } else {
                jVar = jVar3;
            }
            int e2 = e(this, jVar, i3, obj, j2, null, r);
            if (e2 == 0) {
                jVar.a();
                return c0247g2;
            }
            if (e2 == 1) {
                break;
            }
            if (e2 != 2) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = f709h;
                if (e2 == 3) {
                    C0048f c2 = AbstractC0063v.c(o.g.r(dVar));
                    j jVar4 = jVar;
                    try {
                        int e3 = e(this, jVar4, i3, obj, j2, c2, false);
                        try {
                            if (e3 != 0) {
                                if (e3 != 1) {
                                    if (e3 == 2) {
                                        c0048f = c2;
                                        c0247g = c0247g2;
                                        c0048f.a(jVar, i3 + i2);
                                    } else if (e3 == 4) {
                                        c0048f = c2;
                                        c0247g = c0247g2;
                                        if (j2 < atomicLongFieldUpdater2.get(this)) {
                                            jVar.a();
                                        }
                                        c(this, obj, c0048f);
                                    } else {
                                        if (e3 != 5) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        jVar.a();
                                        j jVar5 = (j) atomicReferenceFieldUpdater.get(this);
                                        while (true) {
                                            long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(this);
                                            long j6 = andIncrement2 & 1152921504606846975L;
                                            boolean r3 = r(andIncrement2, false);
                                            int i4 = d.f721b;
                                            long j7 = i4;
                                            long j8 = j6 / j7;
                                            int i5 = (int) (j6 % j7);
                                            if (jVar5.f938g != j8) {
                                                try {
                                                    j b3 = b(this, j8, jVar5);
                                                    if (b3 != null) {
                                                        c0048f2 = c2;
                                                        jVar2 = b3;
                                                    } else if (r3) {
                                                        break;
                                                    }
                                                } catch (Throwable th) {
                                                    th = th;
                                                    C0048f c0048f3 = c2;
                                                }
                                            } else {
                                                c0048f2 = c2;
                                                jVar2 = jVar5;
                                            }
                                            c2 = c0048f2;
                                            j jVar6 = jVar2;
                                            int e4 = e(this, jVar2, i5, obj, j6, c2, r3);
                                            if (e4 == 0) {
                                                c0048f = c2;
                                                c0247g = c0247g2;
                                                jVar6.a();
                                                break;
                                            }
                                            if (e4 == 1) {
                                                break;
                                            }
                                            if (e4 == 2) {
                                                obj3 = obj;
                                                c0048f = c2;
                                                if (r3) {
                                                    jVar6.h();
                                                } else {
                                                    c0048f.a(jVar6, i5 + i4);
                                                }
                                            } else {
                                                if (e4 == 3) {
                                                    throw new IllegalStateException("unexpected");
                                                }
                                                if (e4 == 4) {
                                                    break;
                                                }
                                                if (e4 == 5) {
                                                    jVar6.a();
                                                }
                                                jVar5 = jVar6;
                                            }
                                        }
                                        c(this, obj3, c0048f);
                                        c0247g = c0247g2;
                                    }
                                    obj2 = c0048f.s();
                                    if (obj2 != aVar) {
                                        obj2 = c0247g;
                                    }
                                    if (obj2 != aVar) {
                                        return c0247g;
                                    }
                                }
                                c0048f = c2;
                                c0247g = c0247g2;
                                c0048f.resumeWith(c0247g);
                                obj2 = c0048f.s();
                                if (obj2 != aVar) {
                                }
                                if (obj2 != aVar) {
                                }
                            } else {
                                c0048f = c2;
                                c0247g = c0247g2;
                                jVar.a();
                            }
                            c0048f.resumeWith(c0247g);
                            obj2 = c0048f.s();
                            if (obj2 != aVar) {
                            }
                            if (obj2 != aVar) {
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            r2 = jVar4;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        r2 = c2;
                    }
                } else if (e2 != 4) {
                    if (e2 == 5) {
                        jVar.a();
                    }
                    jVar3 = jVar;
                } else {
                    if (j2 < atomicLongFieldUpdater2.get(this)) {
                        jVar.a();
                    }
                    Object w2 = w(obj, dVar);
                    if (w2 == aVar) {
                        return w2;
                    }
                }
            } else {
                if (!r) {
                    return c0247g2;
                }
                jVar.h();
                obj2 = w(obj, dVar);
                if (obj2 != aVar) {
                    return c0247g2;
                }
            }
        }
        return obj2;
    }

    public final boolean f(long j2) {
        return j2 < f710i.get(this) || j2 < f709h.get(this) + ((long) this.f717e);
    }

    public final boolean g(Throwable th, boolean z2) {
        boolean z3;
        long j2;
        long j3;
        long j4;
        Object obj;
        long j5;
        long j6;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f708g;
        if (z2) {
            do {
                j6 = atomicLongFieldUpdater.get(this);
                if (((int) (j6 >> 60)) != 0) {
                    break;
                }
                j jVar = d.f720a;
            } while (!atomicLongFieldUpdater.compareAndSet(this, j6, (1 << 60) + (j6 & 1152921504606846975L)));
        }
        A.j jVar2 = d.f737s;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f715n;
            if (atomicReferenceFieldUpdater.compareAndSet(this, jVar2, th)) {
                z3 = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != jVar2) {
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
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f716o;
                obj = atomicReferenceFieldUpdater2.get(this);
                A.j jVar3 = obj == null ? d.f736q : d.r;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, jVar3)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj) {
                        break;
                    }
                }
            }
            if (obj != null) {
                F0.s.a(1, obj);
                ((E0.l) obj).i(m());
            }
        }
        return z3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x008f, code lost:
    
        r1 = (O0.j) ((R0.d) R0.d.f902f.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final j h(long j2) {
        Object obj;
        long j3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj2 = f714m.get(this);
        j jVar = (j) f712k.get(this);
        if (jVar.f938g > ((j) obj2).f938g) {
            obj2 = jVar;
        }
        j jVar2 = (j) f713l.get(this);
        if (jVar2.f938g > ((j) obj2).f938g) {
            obj2 = jVar2;
        }
        R0.d dVar = (R0.d) obj2;
        loop0: while (true) {
            dVar.getClass();
            Object obj3 = R0.d.f901e.get(dVar);
            A.j jVar3 = AbstractC0068a.f894b;
            obj = null;
            if (obj3 == jVar3) {
                break;
            }
            R0.d dVar2 = (R0.d) obj3;
            if (dVar2 == null) {
                do {
                    atomicReferenceFieldUpdater = R0.d.f901e;
                    if (atomicReferenceFieldUpdater.compareAndSet(dVar, null, jVar3)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(dVar) == null);
            } else {
                dVar = dVar2;
            }
        }
        j jVar4 = (j) dVar;
        if (t()) {
            j jVar5 = jVar4;
            loop2: do {
                int i2 = d.f721b - 1;
                while (true) {
                    if (-1 >= i2) {
                        break;
                    }
                    j3 = (jVar5.f938g * d.f721b) + i2;
                    if (j3 < f709h.get(this)) {
                        break loop2;
                    }
                    while (true) {
                        Object k2 = jVar5.k(i2);
                        if (k2 != null && k2 != d.f724e) {
                            if (k2 == d.f723d) {
                                break loop2;
                            }
                        } else {
                            if (jVar5.j(i2, k2, d.f731l)) {
                                jVar5.h();
                                break;
                            }
                        }
                    }
                    i2--;
                }
            } while (jVar5 != null);
            j3 = -1;
            if (j3 != -1) {
                i(j3);
            }
        }
        loop5: for (j jVar6 = jVar4; jVar6 != null; jVar6 = (j) ((R0.d) R0.d.f902f.get(jVar6))) {
            for (int i3 = d.f721b - 1; -1 < i3; i3--) {
                if ((jVar6.f938g * d.f721b) + i3 < j2) {
                    break loop5;
                }
                while (true) {
                    Object k3 = jVar6.k(i3);
                    if (k3 != null && k3 != d.f724e) {
                        if (!(k3 instanceof s)) {
                            if (!(k3 instanceof l0)) {
                                break;
                            }
                            if (jVar6.j(i3, k3, d.f731l)) {
                                obj = AbstractC0068a.g(obj, k3);
                                jVar6.l(i3, true);
                                break;
                            }
                        } else {
                            if (jVar6.j(i3, k3, d.f731l)) {
                                obj = AbstractC0068a.g(obj, ((s) k3).f750a);
                                jVar6.l(i3, true);
                                break;
                            }
                        }
                    } else {
                        if (jVar6.j(i3, k3, d.f731l)) {
                            jVar6.h();
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
        return jVar4;
    }

    public final void i(long j2) {
        M.c b2;
        j jVar = (j) f713l.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f709h;
            long j3 = atomicLongFieldUpdater.get(this);
            if (j2 < Math.max(this.f717e + j3, f710i.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j3, j3 + 1)) {
                long j4 = d.f721b;
                long j5 = j3 / j4;
                int i2 = (int) (j3 % j4);
                if (jVar.f938g != j5) {
                    j k2 = k(j5, jVar);
                    if (k2 == null) {
                        continue;
                    } else {
                        jVar = k2;
                    }
                }
                Object A2 = A(jVar, i2, j3, null);
                if (A2 != d.f734o) {
                    jVar.a();
                    E0.l lVar = this.f718f;
                    if (lVar != null && (b2 = AbstractC0068a.b(lVar, A2, null)) != null) {
                        throw b2;
                    }
                } else if (j3 < p()) {
                    jVar.a();
                }
            }
        }
    }

    public final void j() {
        Object c2;
        if (u()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f714m;
        j jVar = (j) atomicReferenceFieldUpdater.get(this);
        loop0: while (true) {
            long andIncrement = f710i.getAndIncrement(this);
            long j2 = andIncrement / d.f721b;
            if (p() <= andIncrement) {
                if (jVar.f938g < j2 && jVar.b() != null) {
                    v(j2, jVar);
                }
                q(this);
                return;
            }
            if (jVar.f938g != j2) {
                c cVar = c.f719m;
                while (true) {
                    c2 = AbstractC0068a.c(jVar, j2, cVar);
                    if (!AbstractC0068a.f(c2)) {
                        v d2 = AbstractC0068a.d(c2);
                        while (true) {
                            v vVar = (v) atomicReferenceFieldUpdater.get(this);
                            if (vVar.f938g >= d2.f938g) {
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
                j jVar2 = null;
                if (AbstractC0068a.f(c2)) {
                    s();
                    v(j2, jVar);
                    q(this);
                } else {
                    j jVar3 = (j) AbstractC0068a.d(c2);
                    long j3 = jVar3.f938g;
                    if (j3 > j2) {
                        long j4 = j3 * d.f721b;
                        if (f710i.compareAndSet(this, andIncrement + 1, j4)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = f711j;
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
            int i2 = (int) (andIncrement % d.f721b);
            Object k2 = jVar.k(i2);
            boolean z2 = k2 instanceof l0;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f709h;
            if (!z2 || andIncrement < atomicLongFieldUpdater2.get(this) || !jVar.j(i2, k2, d.f726g)) {
                while (true) {
                    Object k3 = jVar.k(i2);
                    if (!(k3 instanceof l0)) {
                        if (k3 != d.f729j) {
                            if (k3 != null) {
                                if (k3 == d.f723d || k3 == d.f727h || k3 == d.f728i || k3 == d.f730k || k3 == d.f731l) {
                                    break loop0;
                                }
                                if (k3 != d.f725f) {
                                    throw new IllegalStateException(("Unexpected cell state: " + k3).toString());
                                }
                            } else if (jVar.j(i2, k3, d.f724e)) {
                                break loop0;
                            }
                        } else {
                            break;
                        }
                    } else if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                        if (jVar.j(i2, k3, new s((l0) k3))) {
                            break loop0;
                        }
                    } else if (jVar.j(i2, k3, d.f726g)) {
                        if (z(k3)) {
                            jVar.n(i2, d.f723d);
                            break;
                        } else {
                            jVar.n(i2, d.f729j);
                            jVar.h();
                        }
                    }
                }
            } else if (z(k2)) {
                jVar.n(i2, d.f723d);
                break;
            } else {
                jVar.n(i2, d.f729j);
                jVar.h();
                q(this);
            }
        }
        q(this);
    }

    public final j k(long j2, j jVar) {
        Object c2;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j3;
        j jVar2 = d.f720a;
        c cVar = c.f719m;
        loop0: while (true) {
            c2 = AbstractC0068a.c(jVar, j2, cVar);
            if (!AbstractC0068a.f(c2)) {
                v d2 = AbstractC0068a.d(c2);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f713l;
                    v vVar = (v) atomicReferenceFieldUpdater.get(this);
                    if (vVar.f938g >= d2.f938g) {
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
        if (AbstractC0068a.f(c2)) {
            s();
            if (jVar.f938g * d.f721b >= p()) {
                return null;
            }
            jVar.a();
            return null;
        }
        j jVar3 = (j) AbstractC0068a.d(c2);
        boolean u2 = u();
        long j4 = jVar3.f938g;
        if (!u2 && j2 <= f710i.get(this) / d.f721b) {
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f714m;
                v vVar2 = (v) atomicReferenceFieldUpdater2.get(this);
                if (vVar2.f938g >= j4 || !jVar3.i()) {
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
        long j5 = d.f721b * j4;
        do {
            atomicLongFieldUpdater = f709h;
            j3 = atomicLongFieldUpdater.get(this);
            if (j3 >= j5) {
                break;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j3, j5));
        if (j4 * d.f721b >= p()) {
            return null;
        }
        jVar3.a();
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:?, code lost:
    
        return r1;
     */
    @Override // O0.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object l(Object obj) {
        j jVar;
        j jVar2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f708g;
        boolean z2 = r(atomicLongFieldUpdater.get(this), false) ? false : !f(r0 & 1152921504606846975L);
        h hVar = i.f742a;
        if (!z2) {
            J.e eVar = d.f729j;
            j jVar3 = (j) f712k.get(this);
            while (true) {
                long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
                long j2 = andIncrement & 1152921504606846975L;
                boolean r = r(andIncrement, false);
                int i2 = d.f721b;
                long j3 = i2;
                long j4 = j2 / j3;
                int i3 = (int) (j2 % j3);
                if (jVar3.f938g != j4) {
                    j b2 = b(this, j4, jVar3);
                    if (b2 != null) {
                        jVar = b2;
                    } else if (r) {
                        return new g(o());
                    }
                } else {
                    jVar = jVar3;
                }
                j jVar4 = jVar;
                int e2 = e(this, jVar, i3, obj, j2, eVar, r);
                C0247g c0247g = C0247g.f3005a;
                if (e2 == 0) {
                    jVar4.a();
                    break;
                }
                if (e2 == 1) {
                    break;
                }
                if (e2 == 2) {
                    if (r) {
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
                if (e2 == 3) {
                    throw new IllegalStateException("unexpected");
                }
                if (e2 == 4) {
                    if (j2 < f709h.get(this)) {
                        jVar4.a();
                    }
                    return new g(o());
                }
                if (e2 == 5) {
                    jVar4.a();
                }
                jVar3 = jVar4;
            }
        } else {
            return hVar;
        }
    }

    public final Throwable m() {
        return (Throwable) f715n.get(this);
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
        return f708g.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x00c6, code lost:
    
        r0 = (O0.j) ((R0.d) R0.d.f902f.get(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean r(long j2, boolean z2) {
        int i2 = (int) (j2 >> 60);
        if (i2 == 0 || i2 == 1) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f709h;
        if (i2 == 2) {
            h(j2 & 1152921504606846975L);
            if (z2) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f713l;
                    j jVar = (j) atomicReferenceFieldUpdater.get(this);
                    long j3 = atomicLongFieldUpdater.get(this);
                    if (p() <= j3) {
                        break;
                    }
                    long j4 = d.f721b;
                    long j5 = j3 / j4;
                    if (jVar.f938g != j5 && (jVar = k(j5, jVar)) == null) {
                        if (((j) atomicReferenceFieldUpdater.get(this)).f938g < j5) {
                            break;
                        }
                    } else {
                        jVar.a();
                        int i3 = (int) (j3 % j4);
                        while (true) {
                            Object k2 = jVar.k(i3);
                            if (k2 == null || k2 == d.f724e) {
                                if (jVar.j(i3, k2, d.f727h)) {
                                    j();
                                    break;
                                }
                            } else {
                                if (k2 == d.f723d) {
                                    return false;
                                }
                                if (k2 != d.f729j && k2 != d.f731l && k2 != d.f728i && k2 != d.f727h) {
                                    if (k2 == d.f726g) {
                                        return false;
                                    }
                                    if (k2 != d.f725f && j3 == atomicLongFieldUpdater.get(this)) {
                                        return false;
                                    }
                                }
                            }
                        }
                        f709h.compareAndSet(this, j3, j3 + 1);
                    }
                }
            }
        } else {
            if (i2 != 3) {
                throw new IllegalStateException(F0.h.e("unexpected close status: ", i2).toString());
            }
            j h2 = h(j2 & 1152921504606846975L);
            M.c cVar = null;
            Object obj = null;
            loop0: do {
                int i4 = d.f721b - 1;
                while (true) {
                    if (-1 >= i4) {
                        break;
                    }
                    long j6 = (h2.f938g * d.f721b) + i4;
                    while (true) {
                        Object k3 = h2.k(i4);
                        if (k3 == d.f728i) {
                            break loop0;
                        }
                        A.j jVar2 = d.f723d;
                        AtomicReferenceArray atomicReferenceArray = h2.f744j;
                        E0.l lVar = this.f718f;
                        if (k3 == jVar2) {
                            if (j6 < atomicLongFieldUpdater.get(this)) {
                                break loop0;
                            }
                            if (h2.j(i4, k3, d.f731l)) {
                                if (lVar != null) {
                                    cVar = AbstractC0068a.b(lVar, atomicReferenceArray.get(i4 * 2), cVar);
                                }
                                h2.m(i4, null);
                                h2.h();
                            }
                        } else if (k3 == d.f724e || k3 == null) {
                            if (h2.j(i4, k3, d.f731l)) {
                                h2.h();
                                break;
                            }
                        } else if (!(k3 instanceof l0) && !(k3 instanceof s)) {
                            A.j jVar3 = d.f726g;
                            if (k3 == jVar3 || k3 == d.f725f) {
                                break loop0;
                            }
                            if (k3 != jVar3) {
                                break;
                            }
                        } else {
                            if (j6 < atomicLongFieldUpdater.get(this)) {
                                break loop0;
                            }
                            l0 l0Var = k3 instanceof s ? ((s) k3).f750a : (l0) k3;
                            if (h2.j(i4, k3, d.f731l)) {
                                if (lVar != null) {
                                    cVar = AbstractC0068a.b(lVar, atomicReferenceArray.get(i4 * 2), cVar);
                                }
                                obj = AbstractC0068a.g(obj, l0Var);
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
            if (cVar != null) {
                throw cVar;
            }
        }
        return true;
    }

    public final boolean s() {
        return r(f708g.get(this), false);
    }

    public boolean t() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x019a, code lost:
    
        r3 = (O0.j) r3.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01a1, code lost:
    
        if (r3 != null) goto L86;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        String obj;
        StringBuilder sb = new StringBuilder();
        int i2 = (int) (f708g.get(this) >> 60);
        if (i2 == 2) {
            sb.append("closed,");
        } else if (i2 == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.f717e + ',');
        sb.append("data=[");
        int i3 = 0;
        List B2 = v0.e.B(f713l.get(this), f712k.get(this), f714m.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : B2) {
            if (((j) obj2) != d.f720a) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j2 = ((j) next).f938g;
            do {
                Object next2 = it.next();
                long j3 = ((j) next2).f938g;
                if (j2 > j3) {
                    next = next2;
                    j2 = j3;
                }
            } while (it.hasNext());
        }
        j jVar = (j) next;
        long j4 = f709h.get(this);
        long p2 = p();
        loop2: while (true) {
            int i4 = d.f721b;
            int i5 = i3;
            while (true) {
                if (i5 >= i4) {
                    break;
                }
                long j5 = (jVar.f938g * d.f721b) + i5;
                if (j5 >= p2 && j5 >= j4) {
                    break loop2;
                }
                Object k2 = jVar.k(i5);
                Object obj3 = jVar.f744j.get(i5 * 2);
                if (k2 instanceof InterfaceC0047e) {
                    obj = (j5 >= j4 || j5 < p2) ? (j5 >= p2 || j5 < j4) ? "cont" : "send" : "receive";
                } else if (k2 instanceof s) {
                    obj = "EB(" + k2 + ')';
                } else if (F0.i.a(k2, d.f725f) ? true : F0.i.a(k2, d.f726g)) {
                    obj = "resuming_sender";
                } else if (k2 == null ? true : k2.equals(d.f724e) ? true : F0.i.a(k2, d.f728i) ? true : F0.i.a(k2, d.f727h) ? true : F0.i.a(k2, d.f730k) ? true : F0.i.a(k2, d.f729j) ? true : F0.i.a(k2, d.f731l)) {
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
        if (sb.charAt(L0.h.P(sb)) == ',') {
            F0.i.d(sb.deleteCharAt(sb.length() - 1), "this.deleteCharAt(index)");
        }
        sb.append("]");
        return sb.toString();
    }

    public final boolean u() {
        long j2 = f710i.get(this);
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
        while (jVar.f938g < j2 && (jVar3 = (j) jVar.b()) != null) {
            jVar = jVar3;
        }
        while (true) {
            if (!jVar.c() || (jVar2 = (j) jVar.b()) == null) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f714m;
                    v vVar = (v) atomicReferenceFieldUpdater.get(this);
                    if (vVar.f938g >= jVar.f938g) {
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

    public final Object w(Object obj, w0.d dVar) {
        M.c b2;
        C0048f c0048f = new C0048f(1, o.g.r(dVar));
        c0048f.t();
        E0.l lVar = this.f718f;
        if (lVar == null || (b2 = AbstractC0068a.b(lVar, obj, null)) == null) {
            c0048f.resumeWith(o.g.f(o()));
        } else {
            o.g.a(b2, o());
            c0048f.resumeWith(o.g.f(b2));
        }
        Object s2 = c0048f.s();
        return s2 == x0.a.f3094e ? s2 : C0247g.f3005a;
    }

    public final void x(l0 l0Var, boolean z2) {
        if (l0Var instanceof InterfaceC0047e) {
            ((w0.d) l0Var).resumeWith(o.g.f(z2 ? n() : o()));
            return;
        }
        if (!(l0Var instanceof a)) {
            throw new IllegalStateException(("Unexpected waiter: " + l0Var).toString());
        }
        a aVar = (a) l0Var;
        C0048f c0048f = aVar.f706f;
        F0.i.b(c0048f);
        aVar.f706f = null;
        aVar.f705e = d.f731l;
        Throwable m2 = aVar.f707g.m();
        if (m2 == null) {
            c0048f.resumeWith(Boolean.FALSE);
        } else {
            c0048f.resumeWith(o.g.f(m2));
        }
    }

    public final boolean y(Object obj, Object obj2) {
        if (!(obj instanceof a)) {
            if (!(obj instanceof InterfaceC0047e)) {
                throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
            }
            F0.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            InterfaceC0047e interfaceC0047e = (InterfaceC0047e) obj;
            E0.l lVar = this.f718f;
            return d.a(interfaceC0047e, obj2, lVar != null ? new R0.q(lVar, obj2, interfaceC0047e.getContext()) : null);
        }
        F0.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
        a aVar = (a) obj;
        C0048f c0048f = aVar.f706f;
        F0.i.b(c0048f);
        aVar.f706f = null;
        aVar.f705e = obj2;
        Boolean bool = Boolean.TRUE;
        E0.l lVar2 = aVar.f707g.f718f;
        return d.a(c0048f, bool, lVar2 != null ? new R0.q(lVar2, obj2, c0048f.f662i) : null);
    }
}
