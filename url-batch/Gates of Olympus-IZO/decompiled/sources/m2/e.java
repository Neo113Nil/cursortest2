package m2;

import H2.AbstractC0080b;
import L1.z;
import M1.B;
import Z1.w;
import h2.AbstractC0447i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k2.AbstractC0552y;
import k2.C0536h;
import k2.InterfaceC0534f;
import k2.w0;

/* loaded from: classes.dex */
public class e implements i {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f5939f = AtomicLongFieldUpdater.newUpdater(e.class, "sendersAndCloseStatus$volatile");

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f5940g = AtomicLongFieldUpdater.newUpdater(e.class, "receivers$volatile");

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f5941h = AtomicLongFieldUpdater.newUpdater(e.class, "bufferEnd$volatile");

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f5942i = AtomicLongFieldUpdater.newUpdater(e.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5943j = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "sendSegment$volatile");

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5944k = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "receiveSegment$volatile");

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5945l = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "bufferEndSegment$volatile");

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5946m = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "_closeCause$volatile");

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5947n = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "closeHandler$volatile");
    private volatile /* synthetic */ Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;

    /* renamed from: d, reason: collision with root package name */
    public final int f5948d;

    /* renamed from: e, reason: collision with root package name */
    public final Y1.c f5949e;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    public e(int i3, Y1.c cVar) {
        this.f5948d = i3;
        this.f5949e = cVar;
        if (i3 < 0) {
            throw new IllegalArgumentException(AbstractC0080b.i("Invalid channel capacity: ", i3, ", should be >=0").toString());
        }
        m mVar = g.f5951a;
        this.bufferEnd$volatile = i3 != 0 ? i3 != Integer.MAX_VALUE ? i3 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = f5941h.get(this);
        m mVar2 = new m(0L, null, this, 3);
        this.sendSegment$volatile = mVar2;
        this.receiveSegment$volatile = mVar2;
        if (x()) {
            mVar2 = g.f5951a;
            Z1.i.d(mVar2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = mVar2;
        this._closeCause$volatile = g.f5968s;
    }

    public static boolean C(Object obj) {
        if (obj instanceof InterfaceC0534f) {
            Z1.i.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return g.a((InterfaceC0534f) obj, z.f2729a, null);
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    public static final m b(e eVar, long j3, m mVar) {
        Object d3;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j4;
        long j5;
        eVar.getClass();
        m mVar2 = g.f5951a;
        f fVar = f.f5950l;
        loop0: while (true) {
            d3 = p2.a.d(mVar, j3, fVar);
            if (!p2.a.g(d3)) {
                p2.s e3 = p2.a.e(d3);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5943j;
                    p2.s sVar = (p2.s) atomicReferenceFieldUpdater.get(eVar);
                    if (sVar.f6806c >= e3.f6806c) {
                        break loop0;
                    }
                    if (!e3.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(eVar, sVar, e3)) {
                        if (atomicReferenceFieldUpdater.get(eVar) != sVar) {
                            if (e3.e()) {
                                e3.d();
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
        boolean g3 = p2.a.g(d3);
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f5940g;
        if (g3) {
            eVar.m();
            if (mVar.f6806c * g.f5952b >= atomicLongFieldUpdater2.get(eVar)) {
                return null;
            }
            mVar.a();
            return null;
        }
        m mVar3 = (m) p2.a.e(d3);
        long j6 = mVar3.f6806c;
        if (j6 <= j3) {
            return mVar3;
        }
        long j7 = g.f5952b * j6;
        do {
            atomicLongFieldUpdater = f5939f;
            j4 = atomicLongFieldUpdater.get(eVar);
            j5 = 1152921504606846975L & j4;
            if (j5 >= j7) {
                break;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(eVar, j4, j5 + (((int) (j4 >> 60)) << 60)));
        if (j6 * g.f5952b >= atomicLongFieldUpdater2.get(eVar)) {
            return null;
        }
        mVar3.a();
        return null;
    }

    public static final void e(e eVar, Object obj, C0536h c0536h) {
        Y1.c cVar = eVar.f5949e;
        if (cVar != null) {
            p2.a.a(cVar, obj, c0536h.f5365h);
        }
        c0536h.resumeWith(I2.l.t(eVar.s()));
    }

    public static final int h(e eVar, m mVar, int i3, Object obj, long j3, Object obj2, boolean z3) {
        eVar.getClass();
        mVar.m(i3, obj);
        if (z3) {
            return eVar.E(mVar, i3, obj, j3, obj2, z3);
        }
        Object k3 = mVar.k(i3);
        if (k3 == null) {
            if (eVar.j(j3)) {
                if (mVar.j(null, i3, g.f5954d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (mVar.j(null, i3, obj2)) {
                    return 2;
                }
            }
        } else if (k3 instanceof w0) {
            mVar.m(i3, null);
            if (eVar.B(k3, obj)) {
                mVar.n(i3, g.f5959i);
                return 0;
            }
            j1.p pVar = g.f5961k;
            if (mVar.f5975f.getAndSet((i3 * 2) + 1, pVar) != pVar) {
                mVar.l(i3, true);
            }
            return 5;
        }
        return eVar.E(mVar, i3, obj, j3, obj2, z3);
    }

    public static void u(e eVar) {
        eVar.getClass();
        AtomicLongFieldUpdater atomicLongFieldUpdater = f5942i;
        if ((atomicLongFieldUpdater.addAndGet(eVar, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(eVar) & 4611686018427387904L) != 0) {
            }
        }
    }

    public final void A(w0 w0Var, boolean z3) {
        if (w0Var instanceof InterfaceC0534f) {
            ((P1.d) w0Var).resumeWith(I2.l.t(z3 ? r() : s()));
            return;
        }
        if (!(w0Var instanceof C0628c)) {
            throw new IllegalStateException(("Unexpected waiter: " + w0Var).toString());
        }
        C0628c c0628c = (C0628c) w0Var;
        C0536h c0536h = c0628c.f5937e;
        Z1.i.c(c0536h);
        c0628c.f5937e = null;
        c0628c.f5936d = g.f5962l;
        Throwable q2 = c0628c.f5938f.q();
        if (q2 == null) {
            c0536h.resumeWith(Boolean.FALSE);
        } else {
            c0536h.resumeWith(I2.l.t(q2));
        }
    }

    public final boolean B(Object obj, Object obj2) {
        if (!(obj instanceof C0628c)) {
            if (obj instanceof InterfaceC0534f) {
                Z1.i.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
                return g.a((InterfaceC0534f) obj, obj2, this.f5949e != null ? i() : null);
            }
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        }
        Z1.i.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
        C0628c c0628c = (C0628c) obj;
        C0536h c0536h = c0628c.f5937e;
        Z1.i.c(c0536h);
        c0628c.f5937e = null;
        c0628c.f5936d = obj2;
        Boolean bool = Boolean.TRUE;
        Y1.c cVar = c0628c.f5938f.f5949e;
        return g.a(c0536h, bool, cVar != null ? new C0627b(cVar, 0, obj2) : null);
    }

    public final Object D(m mVar, int i3, long j3, Object obj) {
        Object k3 = mVar.k(i3);
        AtomicReferenceArray atomicReferenceArray = mVar.f5975f;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f5939f;
        if (k3 == null) {
            if (j3 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return g.f5964n;
                }
                if (mVar.j(k3, i3, obj)) {
                    o();
                    return g.f5963m;
                }
            }
        } else if (k3 == g.f5954d && mVar.j(k3, i3, g.f5959i)) {
            o();
            Object obj2 = atomicReferenceArray.get(i3 * 2);
            mVar.m(i3, null);
            return obj2;
        }
        while (true) {
            Object k4 = mVar.k(i3);
            if (k4 == null || k4 == g.f5955e) {
                if (j3 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (mVar.j(k4, i3, g.f5958h)) {
                        o();
                        return g.f5965o;
                    }
                } else {
                    if (obj == null) {
                        return g.f5964n;
                    }
                    if (mVar.j(k4, i3, obj)) {
                        o();
                        return g.f5963m;
                    }
                }
            } else if (k4 != g.f5954d) {
                j1.p pVar = g.f5960j;
                if (k4 == pVar) {
                    return g.f5965o;
                }
                if (k4 == g.f5958h) {
                    return g.f5965o;
                }
                if (k4 == g.f5962l) {
                    o();
                    return g.f5965o;
                }
                if (k4 != g.f5957g && mVar.j(k4, i3, g.f5956f)) {
                    boolean z3 = k4 instanceof u;
                    if (z3) {
                        k4 = ((u) k4).f5978a;
                    }
                    if (C(k4)) {
                        mVar.n(i3, g.f5959i);
                        o();
                        Object obj3 = atomicReferenceArray.get(i3 * 2);
                        mVar.m(i3, null);
                        return obj3;
                    }
                    mVar.n(i3, pVar);
                    mVar.h();
                    if (z3) {
                        o();
                    }
                    return g.f5965o;
                }
            } else if (mVar.j(k4, i3, g.f5959i)) {
                o();
                Object obj4 = atomicReferenceArray.get(i3 * 2);
                mVar.m(i3, null);
                return obj4;
            }
        }
    }

    public final int E(m mVar, int i3, Object obj, long j3, Object obj2, boolean z3) {
        while (true) {
            Object k3 = mVar.k(i3);
            if (k3 == null) {
                if (!j(j3) || z3) {
                    if (z3) {
                        if (mVar.j(null, i3, g.f5960j)) {
                            mVar.h();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (mVar.j(null, i3, obj2)) {
                            return 2;
                        }
                    }
                } else if (mVar.j(null, i3, g.f5954d)) {
                    return 1;
                }
            } else {
                if (k3 != g.f5955e) {
                    j1.p pVar = g.f5961k;
                    if (k3 == pVar) {
                        mVar.m(i3, null);
                        return 5;
                    }
                    if (k3 == g.f5958h) {
                        mVar.m(i3, null);
                        return 5;
                    }
                    if (k3 == g.f5962l) {
                        mVar.m(i3, null);
                        m();
                        return 4;
                    }
                    mVar.m(i3, null);
                    if (k3 instanceof u) {
                        k3 = ((u) k3).f5978a;
                    }
                    if (B(k3, obj)) {
                        mVar.n(i3, g.f5959i);
                        return 0;
                    }
                    if (mVar.f5975f.getAndSet((i3 * 2) + 1, pVar) == pVar) {
                        return 5;
                    }
                    mVar.l(i3, true);
                    return 5;
                }
                if (mVar.j(k3, i3, g.f5954d)) {
                    return 1;
                }
            }
        }
    }

    public final void F(long j3) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j4;
        long j5;
        if (x()) {
            return;
        }
        do {
            atomicLongFieldUpdater = f5941h;
        } while (atomicLongFieldUpdater.get(this) <= j3);
        int i3 = g.f5953c;
        int i4 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f5942i;
            if (i4 >= i3) {
                do {
                    j4 = atomicLongFieldUpdater2.get(this);
                } while (!atomicLongFieldUpdater2.compareAndSet(this, j4, 4611686018427387904L + (j4 & 4611686018427387903L)));
                while (true) {
                    long j6 = atomicLongFieldUpdater.get(this);
                    long j7 = atomicLongFieldUpdater2.get(this);
                    long j8 = j7 & 4611686018427387903L;
                    boolean z3 = (j7 & 4611686018427387904L) != 0;
                    if (j6 == j8 && j6 == atomicLongFieldUpdater.get(this)) {
                        break;
                    } else if (!z3) {
                        atomicLongFieldUpdater2.compareAndSet(this, j7, j8 + 4611686018427387904L);
                    }
                }
                do {
                    j5 = atomicLongFieldUpdater2.get(this);
                } while (!atomicLongFieldUpdater2.compareAndSet(this, j5, j5 & 4611686018427387903L));
                return;
            }
            long j9 = atomicLongFieldUpdater.get(this);
            if (j9 == (atomicLongFieldUpdater2.get(this) & 4611686018427387903L) && j9 == atomicLongFieldUpdater.get(this)) {
                return;
            } else {
                i4++;
            }
        }
    }

    @Override // m2.s
    public final void a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        k(cancellationException, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [k2.h] */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r18v0, types: [java.lang.Object, m2.e] */
    @Override // m2.s
    public final Object c(R1.i iVar) {
        m mVar;
        ?? r15;
        Object D;
        C0536h c0536h;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5944k;
        m mVar2 = (m) atomicReferenceFieldUpdater.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f5939f;
            if (v(atomicLongFieldUpdater.get(this), true)) {
                Throwable r3 = r();
                int i3 = p2.t.f6807a;
                throw r3;
            }
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f5940g;
            long andIncrement = atomicLongFieldUpdater2.getAndIncrement(this);
            long j3 = g.f5952b;
            long j4 = andIncrement / j3;
            int i4 = (int) (andIncrement % j3);
            if (mVar2.f6806c != j4) {
                m p = p(j4, mVar2);
                if (p == null) {
                    continue;
                } else {
                    mVar = p;
                }
            } else {
                mVar = mVar2;
            }
            Object D3 = D(mVar, i4, andIncrement, null);
            j1.p pVar = g.f5963m;
            if (D3 == pVar) {
                throw new IllegalStateException("unexpected");
            }
            j1.p pVar2 = g.f5965o;
            if (D3 != pVar2) {
                if (D3 != g.f5964n) {
                    mVar.a();
                    return D3;
                }
                C0536h k3 = AbstractC0552y.k(B.G(iVar));
                try {
                    D = D(mVar, i4, andIncrement, k3);
                } catch (Throwable th) {
                    th = th;
                    r15 = k3;
                }
                try {
                    if (D == pVar) {
                        c0536h = k3;
                        c0536h.a(mVar, i4);
                    } else {
                        c0536h = k3;
                        C0629d c0629d = null;
                        Y1.c cVar = this.f5949e;
                        if (D == pVar2) {
                            if (andIncrement < t()) {
                                mVar.a();
                            }
                            m mVar3 = (m) atomicReferenceFieldUpdater.get(this);
                            while (true) {
                                if (v(atomicLongFieldUpdater.get(this), true)) {
                                    c0536h.resumeWith(I2.l.t(r()));
                                    break;
                                }
                                long andIncrement2 = atomicLongFieldUpdater2.getAndIncrement(this);
                                long j5 = g.f5952b;
                                long j6 = andIncrement2 / j5;
                                int i5 = (int) (andIncrement2 % j5);
                                if (mVar3.f6806c != j6) {
                                    m p3 = p(j6, mVar3);
                                    if (p3 != null) {
                                        mVar3 = p3;
                                    }
                                }
                                Y1.c cVar2 = cVar;
                                D = D(mVar3, i5, andIncrement2, c0536h);
                                if (D == g.f5963m) {
                                    c0536h.a(mVar3, i5);
                                    break;
                                }
                                if (D == g.f5965o) {
                                    if (andIncrement2 < t()) {
                                        mVar3.a();
                                    }
                                    cVar = cVar2;
                                } else {
                                    if (D == g.f5964n) {
                                        throw new IllegalStateException("unexpected");
                                    }
                                    mVar3.a();
                                    if (cVar2 != null) {
                                        c0629d = i();
                                    }
                                }
                            }
                        } else {
                            mVar.a();
                            if (cVar != null) {
                                c0629d = i();
                            }
                        }
                        c0536h.n(D, c0629d);
                    }
                    Object p4 = c0536h.p();
                    Q1.a aVar = Q1.a.f3113d;
                    return p4;
                } catch (Throwable th2) {
                    th = th2;
                    r15 = pVar;
                    r15.z();
                    throw th;
                }
            }
            if (andIncrement < t()) {
                mVar.a();
            }
            mVar2 = mVar;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f0, code lost:
    
        r5 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f2, code lost:
    
        e(r26, r28, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00f5, code lost:
    
        r1 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00fa, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00fb, code lost:
    
        r1 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01bc, code lost:
    
        r1.z();
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01bf, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0142, code lost:
    
        if (r23 >= r5.get(r26)) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0144, code lost:
    
        r21.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0147, code lost:
    
        r1 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0149, code lost:
    
        e(r26, r28, r1);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    @Override // m2.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object d(P1.d dVar, Object obj) {
        m mVar;
        Object obj2;
        C0536h c0536h;
        C0536h c0536h2;
        z zVar;
        Q1.a aVar;
        C0536h c0536h3;
        m mVar2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5943j;
        m mVar3 = (m) atomicReferenceFieldUpdater.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f5939f;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j3 = andIncrement & 1152921504606846975L;
            boolean v3 = v(andIncrement, false);
            int i3 = g.f5952b;
            long j4 = i3;
            long j5 = j3 / j4;
            int i4 = (int) (j3 % j4);
            long j6 = mVar3.f6806c;
            z zVar2 = z.f2729a;
            if (j6 != j5) {
                m b2 = b(this, j5, mVar3);
                if (b2 != null) {
                    mVar = b2;
                } else if (v3) {
                    obj2 = z(dVar, obj);
                    if (obj2 != Q1.a.f3113d) {
                        return zVar2;
                    }
                }
            } else {
                mVar = mVar3;
            }
            m mVar4 = mVar;
            int h3 = h(this, mVar, i4, obj, j3, null, v3);
            if (h3 == 0) {
                mVar4.a();
                return zVar2;
            }
            if (h3 == 1) {
                break;
            }
            if (h3 != 2) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = f5940g;
                if (h3 == 3) {
                    C0536h k3 = AbstractC0552y.k(B.G(dVar));
                    try {
                        int h4 = h(this, mVar4, i4, obj, j3, k3, false);
                        try {
                            if (h4 != 0) {
                                if (h4 != 1) {
                                    if (h4 == 2) {
                                        c0536h2 = k3;
                                        zVar = zVar2;
                                        c0536h2.a(mVar4, i4 + i3);
                                    } else if (h4 == 4) {
                                        c0536h2 = k3;
                                        zVar = zVar2;
                                        if (j3 < atomicLongFieldUpdater2.get(this)) {
                                            mVar4.a();
                                        }
                                        e(this, obj, c0536h2);
                                    } else {
                                        if (h4 != 5) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        mVar4.a();
                                        m mVar5 = (m) atomicReferenceFieldUpdater.get(this);
                                        while (true) {
                                            long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(this);
                                            long j7 = andIncrement2 & 1152921504606846975L;
                                            boolean v4 = v(andIncrement2, false);
                                            int i5 = g.f5952b;
                                            long j8 = i5;
                                            long j9 = j7 / j8;
                                            int i6 = (int) (j7 % j8);
                                            if (mVar5.f6806c != j9) {
                                                try {
                                                    m b3 = b(this, j9, mVar5);
                                                    if (b3 != null) {
                                                        c0536h3 = k3;
                                                        mVar2 = b3;
                                                    } else if (v4) {
                                                        break;
                                                    }
                                                } catch (Throwable th) {
                                                    th = th;
                                                    C0536h c0536h4 = k3;
                                                }
                                            } else {
                                                c0536h3 = k3;
                                                mVar2 = mVar5;
                                            }
                                            k3 = c0536h3;
                                            m mVar6 = mVar2;
                                            int h5 = h(this, mVar2, i6, obj, j7, k3, v4);
                                            if (h5 == 0) {
                                                c0536h2 = k3;
                                                zVar = zVar2;
                                                mVar6.a();
                                                break;
                                            }
                                            if (h5 == 1) {
                                                break;
                                            }
                                            if (h5 == 2) {
                                                c0536h2 = k3;
                                                if (v4) {
                                                    mVar6.h();
                                                } else {
                                                    c0536h2.a(mVar6, i6 + i5);
                                                }
                                            } else {
                                                if (h5 == 3) {
                                                    throw new IllegalStateException("unexpected");
                                                }
                                                if (h5 == 4) {
                                                    break;
                                                }
                                                if (h5 == 5) {
                                                    mVar6.a();
                                                }
                                                mVar5 = mVar6;
                                            }
                                        }
                                        zVar = zVar2;
                                    }
                                    obj2 = c0536h2.p();
                                    aVar = Q1.a.f3113d;
                                    if (obj2 != aVar) {
                                        obj2 = zVar;
                                    }
                                    if (obj2 != aVar) {
                                        return zVar;
                                    }
                                }
                                c0536h2 = k3;
                                zVar = zVar2;
                                c0536h2.resumeWith(zVar);
                                obj2 = c0536h2.p();
                                aVar = Q1.a.f3113d;
                                if (obj2 != aVar) {
                                }
                                if (obj2 != aVar) {
                                }
                            } else {
                                c0536h2 = k3;
                                zVar = zVar2;
                                mVar4.a();
                            }
                            c0536h2.resumeWith(zVar);
                            obj2 = c0536h2.p();
                            aVar = Q1.a.f3113d;
                            if (obj2 != aVar) {
                            }
                            if (obj2 != aVar) {
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            c0536h = h4;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        c0536h = k3;
                    }
                } else if (h3 != 4) {
                    if (h3 == 5) {
                        mVar4.a();
                    }
                    mVar3 = mVar4;
                } else {
                    if (j3 < atomicLongFieldUpdater2.get(this)) {
                        mVar4.a();
                    }
                    Object z3 = z(dVar, obj);
                    if (z3 == Q1.a.f3113d) {
                        return z3;
                    }
                }
            } else {
                if (!v3) {
                    return zVar2;
                }
                mVar4.h();
                obj2 = z(dVar, obj);
                if (obj2 != Q1.a.f3113d) {
                    return zVar2;
                }
            }
        }
        return obj2;
    }

    @Override // m2.s
    public final Object f() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f5940g;
        long j3 = atomicLongFieldUpdater.get(this);
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f5939f;
        long j4 = atomicLongFieldUpdater2.get(this);
        if (v(j4, true)) {
            return new j(q());
        }
        long j5 = j4 & 1152921504606846975L;
        Object obj = l.f5973a;
        if (j3 >= j5) {
            return obj;
        }
        Object obj2 = g.f5961k;
        m mVar = (m) f5944k.get(this);
        while (!v(atomicLongFieldUpdater2.get(this), true)) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j6 = g.f5952b;
            long j7 = andIncrement / j6;
            int i3 = (int) (andIncrement % j6);
            if (mVar.f6806c != j7) {
                m p = p(j7, mVar);
                if (p == null) {
                    continue;
                } else {
                    mVar = p;
                }
            }
            Object D = D(mVar, i3, andIncrement, obj2);
            if (D == g.f5963m) {
                w0 w0Var = obj2 instanceof w0 ? (w0) obj2 : null;
                if (w0Var != null) {
                    w0Var.a(mVar, i3);
                }
                F(andIncrement);
                mVar.h();
            } else if (D == g.f5965o) {
                if (andIncrement < t()) {
                    mVar.a();
                }
            } else {
                if (D == g.f5964n) {
                    throw new IllegalStateException("unexpected");
                }
                mVar.a();
                obj = D;
            }
            return obj;
        }
        return new j(q());
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:?, code lost:
    
        return r1;
     */
    @Override // m2.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object g(Object obj) {
        m mVar;
        m mVar2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f5939f;
        boolean z3 = v(atomicLongFieldUpdater.get(this), false) ? false : !j(r0 & 1152921504606846975L);
        k kVar = l.f5973a;
        if (!z3) {
            j1.o oVar = g.f5960j;
            m mVar3 = (m) f5943j.get(this);
            while (true) {
                long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
                long j3 = andIncrement & 1152921504606846975L;
                boolean v3 = v(andIncrement, false);
                int i3 = g.f5952b;
                long j4 = i3;
                long j5 = j3 / j4;
                int i4 = (int) (j3 % j4);
                if (mVar3.f6806c != j5) {
                    m b2 = b(this, j5, mVar3);
                    if (b2 != null) {
                        mVar = b2;
                    } else if (v3) {
                        return new j(s());
                    }
                } else {
                    mVar = mVar3;
                }
                m mVar4 = mVar;
                int h3 = h(this, mVar, i4, obj, j3, oVar, v3);
                z zVar = z.f2729a;
                if (h3 == 0) {
                    mVar4.a();
                    break;
                }
                if (h3 == 1) {
                    break;
                }
                if (h3 == 2) {
                    if (v3) {
                        mVar4.h();
                        return new j(s());
                    }
                    w0 w0Var = oVar instanceof w0 ? (w0) oVar : null;
                    if (w0Var != null) {
                        mVar2 = mVar4;
                        w0Var.a(mVar2, i4 + i3);
                    } else {
                        mVar2 = mVar4;
                    }
                    mVar2.h();
                    return kVar;
                }
                if (h3 == 3) {
                    throw new IllegalStateException("unexpected");
                }
                if (h3 == 4) {
                    if (j3 < f5940g.get(this)) {
                        mVar4.a();
                    }
                    return new j(s());
                }
                if (h3 == 5) {
                    mVar4.a();
                }
                mVar3 = mVar4;
            }
        } else {
            return kVar;
        }
    }

    public final C0629d i() {
        return new C0629d(3, 0, e.class, this, "onCancellationImplDoNotCall", "onCancellationImplDoNotCall(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V");
    }

    @Override // m2.s
    public final C0628c iterator() {
        return new C0628c(this);
    }

    public final boolean j(long j3) {
        return j3 < f5941h.get(this) || j3 < f5940g.get(this) + ((long) this.f5948d);
    }

    public final boolean k(Throwable th, boolean z3) {
        boolean z4;
        long j3;
        long j4;
        long j5;
        Object obj;
        long j6;
        long j7;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f5939f;
        if (z3) {
            do {
                j7 = atomicLongFieldUpdater.get(this);
                if (((int) (j7 >> 60)) != 0) {
                    break;
                }
                m mVar = g.f5951a;
            } while (!atomicLongFieldUpdater.compareAndSet(this, j7, (1 << 60) + (j7 & 1152921504606846975L)));
        }
        j1.p pVar = g.f5968s;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5946m;
            if (atomicReferenceFieldUpdater.compareAndSet(this, pVar, th)) {
                z4 = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != pVar) {
                z4 = false;
                break;
            }
        }
        if (z3) {
            do {
                j6 = atomicLongFieldUpdater.get(this);
            } while (!atomicLongFieldUpdater.compareAndSet(this, j6, (3 << 60) + (j6 & 1152921504606846975L)));
        } else {
            do {
                j3 = atomicLongFieldUpdater.get(this);
                int i3 = (int) (j3 >> 60);
                if (i3 == 0) {
                    j4 = j3 & 1152921504606846975L;
                    j5 = 2;
                } else {
                    if (i3 != 1) {
                        break;
                    }
                    j4 = j3 & 1152921504606846975L;
                    j5 = 3;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(this, j3, (j5 << 60) + j4));
        }
        m();
        if (z4) {
            loop3: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f5947n;
                obj = atomicReferenceFieldUpdater2.get(this);
                j1.p pVar2 = obj == null ? g.f5966q : g.f5967r;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, pVar2)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj) {
                        break;
                    }
                }
            }
            if (obj != null) {
                w.d(1, obj);
                ((Y1.c) obj).j(q());
            }
        }
        return z4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x008f, code lost:
    
        r1 = (m2.m) ((p2.b) p2.b.f6769b.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final m l(long j3) {
        Object obj;
        long j4;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj2 = f5945l.get(this);
        m mVar = (m) f5943j.get(this);
        if (mVar.f6806c > ((m) obj2).f6806c) {
            obj2 = mVar;
        }
        m mVar2 = (m) f5944k.get(this);
        if (mVar2.f6806c > ((m) obj2).f6806c) {
            obj2 = mVar2;
        }
        p2.b bVar = (p2.b) obj2;
        loop0: while (true) {
            bVar.getClass();
            Object obj3 = p2.b.f6768a.get(bVar);
            j1.p pVar = p2.a.f6761a;
            obj = null;
            if (obj3 == pVar) {
                break;
            }
            p2.b bVar2 = (p2.b) obj3;
            if (bVar2 == null) {
                do {
                    atomicReferenceFieldUpdater = p2.b.f6768a;
                    if (atomicReferenceFieldUpdater.compareAndSet(bVar, null, pVar)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(bVar) == null);
            } else {
                bVar = bVar2;
            }
        }
        m mVar3 = (m) bVar;
        if (w()) {
            m mVar4 = mVar3;
            loop2: do {
                int i3 = g.f5952b - 1;
                while (true) {
                    if (-1 >= i3) {
                        break;
                    }
                    j4 = (mVar4.f6806c * g.f5952b) + i3;
                    if (j4 < f5940g.get(this)) {
                        break loop2;
                    }
                    while (true) {
                        Object k3 = mVar4.k(i3);
                        if (k3 != null && k3 != g.f5955e) {
                            if (k3 == g.f5954d) {
                                break loop2;
                            }
                        } else {
                            if (mVar4.j(k3, i3, g.f5962l)) {
                                mVar4.h();
                                break;
                            }
                        }
                    }
                    i3--;
                }
            } while (mVar4 != null);
            j4 = -1;
            if (j4 != -1) {
                n(j4);
            }
        }
        loop5: for (m mVar5 = mVar3; mVar5 != null; mVar5 = (m) ((p2.b) p2.b.f6769b.get(mVar5))) {
            for (int i4 = g.f5952b - 1; -1 < i4; i4--) {
                if ((mVar5.f6806c * g.f5952b) + i4 < j3) {
                    break loop5;
                }
                while (true) {
                    Object k4 = mVar5.k(i4);
                    if (k4 != null && k4 != g.f5955e) {
                        if (!(k4 instanceof u)) {
                            if (!(k4 instanceof w0)) {
                                break;
                            }
                            if (mVar5.j(k4, i4, g.f5962l)) {
                                obj = p2.a.h(obj, k4);
                                mVar5.l(i4, true);
                                break;
                            }
                        } else {
                            if (mVar5.j(k4, i4, g.f5962l)) {
                                obj = p2.a.h(obj, ((u) k4).f5978a);
                                mVar5.l(i4, true);
                                break;
                            }
                        }
                    } else {
                        if (mVar5.j(k4, i4, g.f5962l)) {
                            mVar5.h();
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
                    A((w0) arrayList.get(size), true);
                }
            } else {
                A((w0) obj, true);
            }
        }
        return mVar3;
    }

    public final void m() {
        v(f5939f.get(this), false);
    }

    public final void n(long j3) {
        L1.f b2;
        m mVar = (m) f5944k.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f5940g;
            long j4 = atomicLongFieldUpdater.get(this);
            if (j3 < Math.max(this.f5948d + j4, f5941h.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j4, j4 + 1)) {
                long j5 = g.f5952b;
                long j6 = j4 / j5;
                int i3 = (int) (j4 % j5);
                if (mVar.f6806c != j6) {
                    m p = p(j6, mVar);
                    if (p == null) {
                        continue;
                    } else {
                        mVar = p;
                    }
                }
                Object D = D(mVar, i3, j4, null);
                if (D != g.f5965o) {
                    mVar.a();
                    Y1.c cVar = this.f5949e;
                    if (cVar != null && (b2 = p2.a.b(cVar, D, null)) != null) {
                        throw b2;
                    }
                } else if (j4 < t()) {
                    mVar.a();
                }
            }
        }
    }

    public final void o() {
        Object d3;
        if (x()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5945l;
        m mVar = (m) atomicReferenceFieldUpdater.get(this);
        loop0: while (true) {
            long andIncrement = f5941h.getAndIncrement(this);
            long j3 = andIncrement / g.f5952b;
            if (t() <= andIncrement) {
                if (mVar.f6806c < j3 && mVar.b() != null) {
                    y(j3, mVar);
                }
                u(this);
                return;
            }
            if (mVar.f6806c != j3) {
                f fVar = f.f5950l;
                while (true) {
                    d3 = p2.a.d(mVar, j3, fVar);
                    if (!p2.a.g(d3)) {
                        p2.s e3 = p2.a.e(d3);
                        while (true) {
                            p2.s sVar = (p2.s) atomicReferenceFieldUpdater.get(this);
                            if (sVar.f6806c >= e3.f6806c) {
                                break;
                            }
                            if (!e3.i()) {
                                break;
                            }
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, sVar, e3)) {
                                if (atomicReferenceFieldUpdater.get(this) != sVar) {
                                    if (e3.e()) {
                                        e3.d();
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
                m mVar2 = null;
                if (p2.a.g(d3)) {
                    m();
                    y(j3, mVar);
                    u(this);
                } else {
                    m mVar3 = (m) p2.a.e(d3);
                    long j4 = mVar3.f6806c;
                    if (j4 > j3) {
                        long j5 = j4 * g.f5952b;
                        if (f5941h.compareAndSet(this, andIncrement + 1, j5)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = f5942i;
                            if ((atomicLongFieldUpdater.addAndGet(this, j5 - andIncrement) & 4611686018427387904L) != 0) {
                                while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0) {
                                }
                            }
                        } else {
                            u(this);
                        }
                    } else {
                        mVar2 = mVar3;
                    }
                }
                if (mVar2 == null) {
                    continue;
                } else {
                    mVar = mVar2;
                }
            }
            int i3 = (int) (andIncrement % g.f5952b);
            Object k3 = mVar.k(i3);
            boolean z3 = k3 instanceof w0;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f5940g;
            if (!z3 || andIncrement < atomicLongFieldUpdater2.get(this) || !mVar.j(k3, i3, g.f5957g)) {
                while (true) {
                    Object k4 = mVar.k(i3);
                    if (!(k4 instanceof w0)) {
                        if (k4 != g.f5960j) {
                            if (k4 != null) {
                                if (k4 == g.f5954d || k4 == g.f5958h || k4 == g.f5959i || k4 == g.f5961k || k4 == g.f5962l) {
                                    break loop0;
                                }
                                if (k4 != g.f5956f) {
                                    throw new IllegalStateException(("Unexpected cell state: " + k4).toString());
                                }
                            } else if (mVar.j(k4, i3, g.f5955e)) {
                                break loop0;
                            }
                        } else {
                            break;
                        }
                    } else if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                        if (mVar.j(k4, i3, new u((w0) k4))) {
                            break loop0;
                        }
                    } else if (mVar.j(k4, i3, g.f5957g)) {
                        if (C(k4)) {
                            mVar.n(i3, g.f5954d);
                            break;
                        } else {
                            mVar.n(i3, g.f5960j);
                            mVar.h();
                        }
                    }
                }
            } else if (C(k3)) {
                mVar.n(i3, g.f5954d);
                break;
            } else {
                mVar.n(i3, g.f5960j);
                mVar.h();
                u(this);
            }
        }
        u(this);
    }

    public final m p(long j3, m mVar) {
        Object d3;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j4;
        m mVar2 = g.f5951a;
        f fVar = f.f5950l;
        loop0: while (true) {
            d3 = p2.a.d(mVar, j3, fVar);
            if (!p2.a.g(d3)) {
                p2.s e3 = p2.a.e(d3);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5944k;
                    p2.s sVar = (p2.s) atomicReferenceFieldUpdater.get(this);
                    if (sVar.f6806c >= e3.f6806c) {
                        break loop0;
                    }
                    if (!e3.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, sVar, e3)) {
                        if (atomicReferenceFieldUpdater.get(this) != sVar) {
                            if (e3.e()) {
                                e3.d();
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
        if (p2.a.g(d3)) {
            m();
            if (mVar.f6806c * g.f5952b >= t()) {
                return null;
            }
            mVar.a();
            return null;
        }
        m mVar3 = (m) p2.a.e(d3);
        boolean x3 = x();
        long j5 = mVar3.f6806c;
        if (!x3 && j3 <= f5941h.get(this) / g.f5952b) {
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f5945l;
                p2.s sVar2 = (p2.s) atomicReferenceFieldUpdater2.get(this);
                if (sVar2.f6806c >= j5 || !mVar3.i()) {
                    break;
                }
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, sVar2, mVar3)) {
                    if (atomicReferenceFieldUpdater2.get(this) != sVar2) {
                        if (mVar3.e()) {
                            mVar3.d();
                        }
                    }
                }
                if (sVar2.e()) {
                    sVar2.d();
                }
            }
        }
        if (j5 <= j3) {
            return mVar3;
        }
        long j6 = g.f5952b * j5;
        do {
            atomicLongFieldUpdater = f5940g;
            j4 = atomicLongFieldUpdater.get(this);
            if (j4 >= j6) {
                break;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j4, j6));
        if (j5 * g.f5952b >= t()) {
            return null;
        }
        mVar3.a();
        return null;
    }

    public final Throwable q() {
        return (Throwable) f5946m.get(this);
    }

    public final Throwable r() {
        Throwable q2 = q();
        return q2 == null ? new n("Channel was closed") : q2;
    }

    public final Throwable s() {
        Throwable q2 = q();
        return q2 == null ? new o("Channel was closed") : q2;
    }

    public final long t() {
        return f5939f.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x018c, code lost:
    
        r3 = (m2.m) r3.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0193, code lost:
    
        if (r3 != null) goto L77;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        int i3 = (int) (f5939f.get(this) >> 60);
        if (i3 == 2) {
            sb.append("closed,");
        } else if (i3 == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.f5948d + ',');
        sb.append("data=[");
        int i4 = 0;
        List c02 = M1.m.c0(f5944k.get(this), f5943j.get(this), f5945l.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj : c02) {
            if (((m) obj) != g.f5951a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j3 = ((m) next).f6806c;
            do {
                Object next2 = it.next();
                long j4 = ((m) next2).f6806c;
                if (j3 > j4) {
                    next = next2;
                    j3 = j4;
                }
            } while (it.hasNext());
        }
        m mVar = (m) next;
        long j5 = f5940g.get(this);
        long t3 = t();
        loop2: while (true) {
            int i5 = g.f5952b;
            int i6 = i4;
            while (true) {
                if (i6 >= i5) {
                    break;
                }
                long j6 = (mVar.f6806c * g.f5952b) + i6;
                if (j6 >= t3 && j6 >= j5) {
                    break loop2;
                }
                Object k3 = mVar.k(i6);
                Object obj2 = mVar.f5975f.get(i6 * 2);
                if (k3 instanceof InterfaceC0534f) {
                    str = (j6 >= j5 || j6 < t3) ? (j6 >= t3 || j6 < j5) ? "cont" : "send" : "receive";
                } else if (k3 instanceof u) {
                    str = "EB(" + k3 + ')';
                } else if (Z1.i.a(k3, g.f5956f) || Z1.i.a(k3, g.f5957g)) {
                    str = "resuming_sender";
                } else {
                    if (k3 != null && !k3.equals(g.f5955e) && !k3.equals(g.f5959i) && !k3.equals(g.f5958h) && !k3.equals(g.f5961k) && !k3.equals(g.f5960j) && !k3.equals(g.f5962l)) {
                        str = k3.toString();
                    }
                    i6++;
                }
                if (obj2 != null) {
                    sb.append("(" + str + ',' + obj2 + "),");
                } else {
                    sb.append(str + ',');
                }
                i6++;
            }
            i4 = 0;
        }
        if (AbstractC0447i.u0(sb) == ',') {
            Z1.i.e(sb.deleteCharAt(sb.length() - 1), "deleteCharAt(...)");
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x00c6, code lost:
    
        r0 = (m2.m) ((p2.b) p2.b.f6769b.get(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean v(long j3, boolean z3) {
        int i3 = (int) (j3 >> 60);
        if (i3 == 0 || i3 == 1) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f5940g;
        if (i3 == 2) {
            l(j3 & 1152921504606846975L);
            if (z3) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5944k;
                    m mVar = (m) atomicReferenceFieldUpdater.get(this);
                    long j4 = atomicLongFieldUpdater.get(this);
                    if (t() <= j4) {
                        break;
                    }
                    long j5 = g.f5952b;
                    long j6 = j4 / j5;
                    if (mVar.f6806c != j6 && (mVar = p(j6, mVar)) == null) {
                        if (((m) atomicReferenceFieldUpdater.get(this)).f6806c < j6) {
                            break;
                        }
                    } else {
                        mVar.a();
                        int i4 = (int) (j4 % j5);
                        while (true) {
                            Object k3 = mVar.k(i4);
                            if (k3 == null || k3 == g.f5955e) {
                                if (mVar.j(k3, i4, g.f5958h)) {
                                    o();
                                    break;
                                }
                            } else {
                                if (k3 == g.f5954d) {
                                    return false;
                                }
                                if (k3 != g.f5960j && k3 != g.f5962l && k3 != g.f5959i && k3 != g.f5958h) {
                                    if (k3 == g.f5957g) {
                                        return false;
                                    }
                                    if (k3 != g.f5956f && j4 == atomicLongFieldUpdater.get(this)) {
                                        return false;
                                    }
                                }
                            }
                        }
                        f5940g.compareAndSet(this, j4, j4 + 1);
                    }
                }
            }
        } else {
            if (i3 != 3) {
                throw new IllegalStateException(AbstractC0080b.h("unexpected close status: ", i3).toString());
            }
            m l3 = l(j3 & 1152921504606846975L);
            L1.f fVar = null;
            Object obj = null;
            loop0: do {
                int i5 = g.f5952b - 1;
                while (true) {
                    if (-1 >= i5) {
                        break;
                    }
                    long j7 = (l3.f6806c * g.f5952b) + i5;
                    while (true) {
                        Object k4 = l3.k(i5);
                        if (k4 == g.f5959i) {
                            break loop0;
                        }
                        j1.p pVar = g.f5954d;
                        AtomicReferenceArray atomicReferenceArray = l3.f5975f;
                        Y1.c cVar = this.f5949e;
                        if (k4 == pVar) {
                            if (j7 < atomicLongFieldUpdater.get(this)) {
                                break loop0;
                            }
                            if (l3.j(k4, i5, g.f5962l)) {
                                if (cVar != null) {
                                    fVar = p2.a.b(cVar, atomicReferenceArray.get(i5 * 2), fVar);
                                }
                                l3.m(i5, null);
                                l3.h();
                            }
                        } else if (k4 == g.f5955e || k4 == null) {
                            if (l3.j(k4, i5, g.f5962l)) {
                                l3.h();
                                break;
                            }
                        } else if (!(k4 instanceof w0) && !(k4 instanceof u)) {
                            j1.p pVar2 = g.f5957g;
                            if (k4 == pVar2 || k4 == g.f5956f) {
                                break loop0;
                            }
                            if (k4 != pVar2) {
                                break;
                            }
                        } else {
                            if (j7 < atomicLongFieldUpdater.get(this)) {
                                break loop0;
                            }
                            w0 w0Var = k4 instanceof u ? ((u) k4).f5978a : (w0) k4;
                            if (l3.j(k4, i5, g.f5962l)) {
                                if (cVar != null) {
                                    fVar = p2.a.b(cVar, atomicReferenceArray.get(i5 * 2), fVar);
                                }
                                obj = p2.a.h(obj, w0Var);
                                l3.m(i5, null);
                                l3.h();
                            }
                        }
                    }
                    i5--;
                }
            } while (l3 != null);
            if (obj != null) {
                if (obj instanceof ArrayList) {
                    ArrayList arrayList = (ArrayList) obj;
                    for (int size = arrayList.size() - 1; -1 < size; size--) {
                        A((w0) arrayList.get(size), false);
                    }
                } else {
                    A((w0) obj, false);
                }
            }
            if (fVar != null) {
                throw fVar;
            }
        }
        return true;
    }

    public boolean w() {
        return false;
    }

    public final boolean x() {
        long j3 = f5941h.get(this);
        return j3 == 0 || j3 == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(long j3, m mVar) {
        m mVar2;
        m mVar3;
        while (mVar.f6806c < j3 && (mVar3 = (m) mVar.b()) != null) {
            mVar = mVar3;
        }
        while (true) {
            if (!mVar.c() || (mVar2 = (m) mVar.b()) == null) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5945l;
                    p2.s sVar = (p2.s) atomicReferenceFieldUpdater.get(this);
                    if (sVar.f6806c >= mVar.f6806c) {
                        return;
                    }
                    if (!mVar.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, sVar, mVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != sVar) {
                            if (mVar.e()) {
                                mVar.d();
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
            mVar = mVar2;
        }
    }

    public final Object z(P1.d dVar, Object obj) {
        L1.f b2;
        C0536h c0536h = new C0536h(1, B.G(dVar));
        c0536h.q();
        Y1.c cVar = this.f5949e;
        if (cVar == null || (b2 = p2.a.b(cVar, obj, null)) == null) {
            c0536h.resumeWith(I2.l.t(s()));
        } else {
            B.o(b2, s());
            c0536h.resumeWith(I2.l.t(b2));
        }
        Object p = c0536h.p();
        return p == Q1.a.f3113d ? p : z.f2729a;
    }
}
