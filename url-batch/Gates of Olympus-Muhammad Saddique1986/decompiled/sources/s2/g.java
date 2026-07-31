package s2;

import R1.y;
import e2.InterfaceC0424c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import n2.AbstractC0730j;
import q2.AbstractC0837y;
import q2.C0821h;
import q2.InterfaceC0819f;
import q2.w0;

/* loaded from: classes.dex */
public class g implements k {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f8376f = AtomicLongFieldUpdater.newUpdater(g.class, "sendersAndCloseStatus$volatile");

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f8377g = AtomicLongFieldUpdater.newUpdater(g.class, "receivers$volatile");

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f8378h = AtomicLongFieldUpdater.newUpdater(g.class, "bufferEnd$volatile");

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f8379i = AtomicLongFieldUpdater.newUpdater(g.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8380j = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "sendSegment$volatile");

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8381k = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "receiveSegment$volatile");

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8382l = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "bufferEndSegment$volatile");

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8383m = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "_closeCause$volatile");

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8384n = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "closeHandler$volatile");
    private volatile /* synthetic */ Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;

    /* renamed from: d, reason: collision with root package name */
    public final int f8385d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC0424c f8386e;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    public g(int i3, InterfaceC0424c interfaceC0424c) {
        this.f8385d = i3;
        this.f8386e = interfaceC0424c;
        if (i3 < 0) {
            throw new IllegalArgumentException(A.k.g(i3, "Invalid channel capacity: ", ", should be >=0").toString());
        }
        o oVar = i.f8388a;
        this.bufferEnd$volatile = i3 != 0 ? i3 != Integer.MAX_VALUE ? i3 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = f8378h.get(this);
        o oVar2 = new o(0L, null, this, 3);
        this.sendSegment$volatile = oVar2;
        this.receiveSegment$volatile = oVar2;
        if (A()) {
            oVar2 = i.f8388a;
            f2.j.d(oVar2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = oVar2;
        this._closeCause$volatile = i.f8406s;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object D(g gVar, X1.c cVar) {
        e eVar;
        int i3;
        Object E3;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i4 = eVar.f8372i;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                eVar.f8372i = i4 - Integer.MIN_VALUE;
                e eVar2 = eVar;
                Object obj = eVar2.f8370g;
                Object obj2 = W1.a.f4608d;
                i3 = eVar2.f8372i;
                if (i3 != 0) {
                    R1.a.e(obj);
                    o oVar = (o) f8381k.get(gVar);
                    while (!gVar.y()) {
                        long andIncrement = f8377g.getAndIncrement(gVar);
                        long j3 = i.f8389b;
                        long j4 = andIncrement / j3;
                        int i5 = (int) (andIncrement % j3);
                        if (oVar.f9826c != j4) {
                            o r3 = gVar.r(j4, oVar);
                            if (r3 == null) {
                                continue;
                            } else {
                                oVar = r3;
                            }
                        }
                        Object I3 = gVar.I(oVar, i5, andIncrement, null);
                        if (I3 == i.f8400m) {
                            throw new IllegalStateException("unexpected");
                        }
                        if (I3 == i.f8402o) {
                            if (andIncrement < gVar.v()) {
                                oVar.a();
                            }
                        } else {
                            if (I3 != i.f8401n) {
                                oVar.a();
                                return I3;
                            }
                            eVar2.f8372i = 1;
                            E3 = gVar.E(oVar, i5, andIncrement, eVar2);
                            if (E3 == obj2) {
                                return obj2;
                            }
                        }
                    }
                    return new l(gVar.s());
                }
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                R1.a.e(obj);
                E3 = ((n) obj).f8412a;
                return E3;
            }
        }
        eVar = new e(gVar, cVar);
        e eVar22 = eVar;
        Object obj3 = eVar22.f8370g;
        Object obj22 = W1.a.f4608d;
        i3 = eVar22.f8372i;
        if (i3 != 0) {
        }
        return E3;
    }

    public static boolean H(Object obj) {
        if (obj instanceof InterfaceC0819f) {
            f2.j.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return i.a((InterfaceC0819f) obj, y.f4171a, null);
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    public static final o b(g gVar, long j3, o oVar) {
        Object d3;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j4;
        long j5;
        gVar.getClass();
        o oVar2 = i.f8388a;
        h hVar = h.f8387l;
        loop0: while (true) {
            d3 = v2.a.d(oVar, j3, hVar);
            if (!v2.a.g(d3)) {
                v2.r e3 = v2.a.e(d3);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8380j;
                    v2.r rVar = (v2.r) atomicReferenceFieldUpdater.get(gVar);
                    if (rVar.f9826c >= e3.f9826c) {
                        break loop0;
                    }
                    if (!e3.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(gVar, rVar, e3)) {
                        if (atomicReferenceFieldUpdater.get(gVar) != rVar) {
                            if (e3.e()) {
                                e3.d();
                            }
                        }
                    }
                    if (rVar.e()) {
                        rVar.d();
                    }
                }
            } else {
                break;
            }
        }
        boolean g3 = v2.a.g(d3);
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f8377g;
        if (g3) {
            gVar.m();
            if (oVar.f9826c * i.f8389b >= atomicLongFieldUpdater2.get(gVar)) {
                return null;
            }
            oVar.a();
            return null;
        }
        o oVar3 = (o) v2.a.e(d3);
        long j6 = oVar3.f9826c;
        if (j6 <= j3) {
            return oVar3;
        }
        long j7 = i.f8389b * j6;
        do {
            atomicLongFieldUpdater = f8376f;
            j4 = atomicLongFieldUpdater.get(gVar);
            j5 = 1152921504606846975L & j4;
            if (j5 >= j7) {
                break;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(gVar, j4, j5 + (((int) (j4 >> 60)) << 60)));
        if (j6 * i.f8389b >= atomicLongFieldUpdater2.get(gVar)) {
            return null;
        }
        oVar3.a();
        return null;
    }

    public static final void d(g gVar, Object obj, C0821h c0821h) {
        InterfaceC0424c interfaceC0424c = gVar.f8386e;
        if (interfaceC0424c != null) {
            v2.a.a(interfaceC0424c, obj, c0821h.f7904h);
        }
        c0821h.u(R1.a.b(gVar.u()));
    }

    public static final int e(g gVar, o oVar, int i3, Object obj, long j3, Object obj2, boolean z3) {
        gVar.getClass();
        oVar.m(i3, obj);
        if (z3) {
            return gVar.J(oVar, i3, obj, j3, obj2, z3);
        }
        Object k3 = oVar.k(i3);
        if (k3 == null) {
            if (gVar.j(j3)) {
                if (oVar.j(null, i3, i.f8391d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (oVar.j(null, i3, obj2)) {
                    return 2;
                }
            }
        } else if (k3 instanceof w0) {
            oVar.m(i3, null);
            if (gVar.G(k3, obj)) {
                oVar.n(i3, i.f8396i);
                return 0;
            }
            m1.q qVar = i.f8398k;
            if (oVar.f8414f.getAndSet((i3 * 2) + 1, qVar) != qVar) {
                oVar.l(i3, true);
            }
            return 5;
        }
        return gVar.J(oVar, i3, obj, j3, obj2, z3);
    }

    public static void w(g gVar) {
        gVar.getClass();
        AtomicLongFieldUpdater atomicLongFieldUpdater = f8379i;
        if ((atomicLongFieldUpdater.addAndGet(gVar, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(gVar) & 4611686018427387904L) != 0) {
            }
        }
    }

    public final boolean A() {
        long j3 = f8378h.get(this);
        return j3 == 0 || j3 == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(long j3, o oVar) {
        o oVar2;
        o oVar3;
        while (oVar.f9826c < j3 && (oVar3 = (o) oVar.b()) != null) {
            oVar = oVar3;
        }
        while (true) {
            if (!oVar.c() || (oVar2 = (o) oVar.b()) == null) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8382l;
                    v2.r rVar = (v2.r) atomicReferenceFieldUpdater.get(this);
                    if (rVar.f9826c >= oVar.f9826c) {
                        return;
                    }
                    if (!oVar.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, rVar, oVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != rVar) {
                            if (oVar.e()) {
                                oVar.d();
                            }
                        }
                    }
                    if (rVar.e()) {
                        rVar.d();
                        return;
                    }
                    return;
                }
            }
            oVar = oVar2;
        }
    }

    public final Object C(V1.d dVar, Object obj) {
        C1.c b3;
        C0821h c0821h = new C0821h(1, l0.c.B(dVar));
        c0821h.r();
        InterfaceC0424c interfaceC0424c = this.f8386e;
        if (interfaceC0424c == null || (b3 = v2.a.b(interfaceC0424c, obj, null)) == null) {
            c0821h.u(R1.a.b(u()));
        } else {
            R1.a.a(b3, u());
            c0821h.u(R1.a.b(b3));
        }
        Object q3 = c0821h.q();
        return q3 == W1.a.f4608d ? q3 : y.f4171a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object E(o oVar, int i3, long j3, X1.c cVar) {
        f fVar;
        int i4;
        n nVar;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i5 = fVar.f8375i;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                fVar.f8375i = i5 - Integer.MIN_VALUE;
                Object obj = fVar.f8373g;
                W1.a aVar = W1.a.f4608d;
                i4 = fVar.f8375i;
                if (i4 != 0) {
                    R1.a.e(obj);
                    fVar.f8375i = 1;
                    C0821h l3 = AbstractC0837y.l(l0.c.B(fVar));
                    try {
                        u uVar = new u(l3);
                        Object I3 = I(oVar, i3, j3, uVar);
                        if (I3 == i.f8400m) {
                            uVar.a(oVar, i3);
                        } else {
                            Object obj2 = i.f8402o;
                            C0970d c0970d = null;
                            InterfaceC0424c interfaceC0424c = this.f8386e;
                            if (I3 == obj2) {
                                if (j3 < v()) {
                                    oVar.a();
                                }
                                o oVar2 = (o) f8381k.get(this);
                                while (true) {
                                    if (y()) {
                                        l3.u(new n(new l(s())));
                                        break;
                                    }
                                    long andIncrement = f8377g.getAndIncrement(this);
                                    long j4 = i.f8389b;
                                    long j5 = andIncrement / j4;
                                    int i6 = (int) (andIncrement % j4);
                                    if (oVar2.f9826c != j5) {
                                        o r3 = r(j5, oVar2);
                                        if (r3 != null) {
                                            oVar2 = r3;
                                        }
                                    }
                                    Object I4 = I(oVar2, i6, andIncrement, uVar);
                                    if (I4 == i.f8400m) {
                                        uVar.a(oVar2, i6);
                                        break;
                                    }
                                    if (I4 == i.f8402o) {
                                        if (andIncrement < v()) {
                                            oVar2.a();
                                        }
                                    } else {
                                        if (I4 == i.f8401n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        oVar2.a();
                                        nVar = new n(I4);
                                        if (interfaceC0424c != null) {
                                            c0970d = h();
                                        }
                                    }
                                }
                            } else {
                                oVar.a();
                                nVar = new n(I3);
                                if (interfaceC0424c != null) {
                                    c0970d = h();
                                }
                            }
                            l3.m(nVar, c0970d);
                        }
                        obj = l3.q();
                        if (obj == aVar) {
                            return aVar;
                        }
                    } catch (Throwable th) {
                        l3.A();
                        throw th;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    R1.a.e(obj);
                }
                return ((n) obj).f8412a;
            }
        }
        fVar = new f(this, cVar);
        Object obj3 = fVar.f8373g;
        W1.a aVar2 = W1.a.f4608d;
        i4 = fVar.f8375i;
        if (i4 != 0) {
        }
        return ((n) obj3).f8412a;
    }

    public final void F(w0 w0Var, boolean z3) {
        if (w0Var instanceof InterfaceC0819f) {
            ((V1.d) w0Var).u(R1.a.b(z3 ? t() : u()));
            return;
        }
        if (w0Var instanceof u) {
            ((u) w0Var).f8417d.u(new n(new l(s())));
            return;
        }
        if (!(w0Var instanceof C0969c)) {
            throw new IllegalStateException(("Unexpected waiter: " + w0Var).toString());
        }
        C0969c c0969c = (C0969c) w0Var;
        C0821h c0821h = c0969c.f8367e;
        f2.j.c(c0821h);
        c0969c.f8367e = null;
        c0969c.f8366d = i.f8399l;
        Throwable s3 = c0969c.f8368f.s();
        if (s3 == null) {
            c0821h.u(Boolean.FALSE);
        } else {
            c0821h.u(R1.a.b(s3));
        }
    }

    public final boolean G(Object obj, Object obj2) {
        boolean z3 = obj instanceof u;
        InterfaceC0424c interfaceC0424c = this.f8386e;
        if (z3) {
            f2.j.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
            return i.a(((u) obj).f8417d, new n(obj2), interfaceC0424c != null ? h() : null);
        }
        if (!(obj instanceof C0969c)) {
            if (obj instanceof InterfaceC0819f) {
                f2.j.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
                return i.a((InterfaceC0819f) obj, obj2, interfaceC0424c != null ? g() : null);
            }
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        }
        f2.j.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
        C0969c c0969c = (C0969c) obj;
        C0821h c0821h = c0969c.f8367e;
        f2.j.c(c0821h);
        c0969c.f8367e = null;
        c0969c.f8366d = obj2;
        Boolean bool = Boolean.TRUE;
        InterfaceC0424c interfaceC0424c2 = c0969c.f8368f.f8386e;
        return i.a(c0821h, bool, interfaceC0424c2 != null ? new C0968b(interfaceC0424c2, 0, obj2) : null);
    }

    public final Object I(o oVar, int i3, long j3, Object obj) {
        Object k3 = oVar.k(i3);
        AtomicReferenceArray atomicReferenceArray = oVar.f8414f;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f8376f;
        if (k3 == null) {
            if (j3 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return i.f8401n;
                }
                if (oVar.j(k3, i3, obj)) {
                    q();
                    return i.f8400m;
                }
            }
        } else if (k3 == i.f8391d && oVar.j(k3, i3, i.f8396i)) {
            q();
            Object obj2 = atomicReferenceArray.get(i3 * 2);
            oVar.m(i3, null);
            return obj2;
        }
        while (true) {
            Object k4 = oVar.k(i3);
            if (k4 == null || k4 == i.f8392e) {
                if (j3 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (oVar.j(k4, i3, i.f8395h)) {
                        q();
                        return i.f8402o;
                    }
                } else {
                    if (obj == null) {
                        return i.f8401n;
                    }
                    if (oVar.j(k4, i3, obj)) {
                        q();
                        return i.f8400m;
                    }
                }
            } else if (k4 != i.f8391d) {
                m1.q qVar = i.f8397j;
                if (k4 == qVar) {
                    return i.f8402o;
                }
                if (k4 == i.f8395h) {
                    return i.f8402o;
                }
                if (k4 == i.f8399l) {
                    q();
                    return i.f8402o;
                }
                if (k4 != i.f8394g && oVar.j(k4, i3, i.f8393f)) {
                    boolean z3 = k4 instanceof x;
                    if (z3) {
                        k4 = ((x) k4).f8418a;
                    }
                    if (H(k4)) {
                        oVar.n(i3, i.f8396i);
                        q();
                        Object obj3 = atomicReferenceArray.get(i3 * 2);
                        oVar.m(i3, null);
                        return obj3;
                    }
                    oVar.n(i3, qVar);
                    oVar.h();
                    if (z3) {
                        q();
                    }
                    return i.f8402o;
                }
            } else if (oVar.j(k4, i3, i.f8396i)) {
                q();
                Object obj4 = atomicReferenceArray.get(i3 * 2);
                oVar.m(i3, null);
                return obj4;
            }
        }
    }

    public final int J(o oVar, int i3, Object obj, long j3, Object obj2, boolean z3) {
        while (true) {
            Object k3 = oVar.k(i3);
            if (k3 == null) {
                if (!j(j3) || z3) {
                    if (z3) {
                        if (oVar.j(null, i3, i.f8397j)) {
                            oVar.h();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (oVar.j(null, i3, obj2)) {
                            return 2;
                        }
                    }
                } else if (oVar.j(null, i3, i.f8391d)) {
                    return 1;
                }
            } else {
                if (k3 != i.f8392e) {
                    m1.q qVar = i.f8398k;
                    if (k3 == qVar) {
                        oVar.m(i3, null);
                        return 5;
                    }
                    if (k3 == i.f8395h) {
                        oVar.m(i3, null);
                        return 5;
                    }
                    if (k3 == i.f8399l) {
                        oVar.m(i3, null);
                        m();
                        return 4;
                    }
                    oVar.m(i3, null);
                    if (k3 instanceof x) {
                        k3 = ((x) k3).f8418a;
                    }
                    if (G(k3, obj)) {
                        oVar.n(i3, i.f8396i);
                        return 0;
                    }
                    if (oVar.f8414f.getAndSet((i3 * 2) + 1, qVar) == qVar) {
                        return 5;
                    }
                    oVar.l(i3, true);
                    return 5;
                }
                if (oVar.j(k3, i3, i.f8391d)) {
                    return 1;
                }
            }
        }
    }

    public final void K(long j3) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j4;
        long j5;
        if (A()) {
            return;
        }
        do {
            atomicLongFieldUpdater = f8378h;
        } while (atomicLongFieldUpdater.get(this) <= j3);
        int i3 = i.f8390c;
        int i4 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f8379i;
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

    @Override // s2.v
    public final void a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        k(cancellationException, true);
    }

    @Override // s2.v
    public final Object c(u2.s sVar) {
        return D(this, sVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ee, code lost:
    
        r5 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00f2, code lost:
    
        d(r26, r28, r5);
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
    
        r2.A();
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
    
        r2 = r27;
        r1 = r28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [q2.h] */
    @Override // s2.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object f(V1.d dVar, Object obj) {
        o oVar;
        Object obj2;
        ?? r22;
        C0821h c0821h;
        y yVar;
        C0821h c0821h2;
        o oVar2;
        Object obj3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8380j;
        o oVar3 = (o) atomicReferenceFieldUpdater.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f8376f;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j3 = andIncrement & 1152921504606846975L;
            boolean x3 = x(andIncrement, false);
            int i3 = i.f8389b;
            long j4 = i3;
            long j5 = j3 / j4;
            int i4 = (int) (j3 % j4);
            long j6 = oVar3.f9826c;
            y yVar2 = y.f4171a;
            W1.a aVar = W1.a.f4608d;
            if (j6 != j5) {
                o b3 = b(this, j5, oVar3);
                if (b3 != null) {
                    oVar = b3;
                } else if (x3) {
                    obj2 = C(dVar, obj);
                    if (obj2 != aVar) {
                        return yVar2;
                    }
                }
            } else {
                oVar = oVar3;
            }
            int e3 = e(this, oVar, i4, obj, j3, null, x3);
            if (e3 == 0) {
                oVar.a();
                return yVar2;
            }
            if (e3 == 1) {
                break;
            }
            if (e3 != 2) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = f8377g;
                if (e3 == 3) {
                    C0821h l3 = AbstractC0837y.l(l0.c.B(dVar));
                    o oVar4 = oVar;
                    try {
                        int e4 = e(this, oVar4, i4, obj, j3, l3, false);
                        try {
                            if (e4 != 0) {
                                if (e4 != 1) {
                                    if (e4 == 2) {
                                        c0821h = l3;
                                        yVar = yVar2;
                                        c0821h.a(oVar, i4 + i3);
                                    } else if (e4 == 4) {
                                        c0821h = l3;
                                        yVar = yVar2;
                                        if (j3 < atomicLongFieldUpdater2.get(this)) {
                                            oVar.a();
                                        }
                                        d(this, obj, c0821h);
                                    } else {
                                        if (e4 != 5) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        oVar.a();
                                        o oVar5 = (o) atomicReferenceFieldUpdater.get(this);
                                        while (true) {
                                            long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(this);
                                            long j7 = andIncrement2 & 1152921504606846975L;
                                            boolean x4 = x(andIncrement2, false);
                                            int i5 = i.f8389b;
                                            long j8 = i5;
                                            long j9 = j7 / j8;
                                            int i6 = (int) (j7 % j8);
                                            if (oVar5.f9826c != j9) {
                                                try {
                                                    o b4 = b(this, j9, oVar5);
                                                    if (b4 != null) {
                                                        c0821h2 = l3;
                                                        oVar2 = b4;
                                                    } else if (x4) {
                                                        break;
                                                    }
                                                } catch (Throwable th) {
                                                    th = th;
                                                    C0821h c0821h3 = l3;
                                                }
                                            } else {
                                                c0821h2 = l3;
                                                oVar2 = oVar5;
                                            }
                                            l3 = c0821h2;
                                            o oVar6 = oVar2;
                                            int e5 = e(this, oVar2, i6, obj, j7, l3, x4);
                                            if (e5 == 0) {
                                                c0821h = l3;
                                                yVar = yVar2;
                                                oVar6.a();
                                                break;
                                            }
                                            if (e5 == 1) {
                                                break;
                                            }
                                            if (e5 == 2) {
                                                c0821h = l3;
                                                obj3 = obj;
                                                if (x4) {
                                                    oVar6.h();
                                                } else {
                                                    c0821h.a(oVar6, i6 + i5);
                                                }
                                            } else {
                                                if (e5 == 3) {
                                                    throw new IllegalStateException("unexpected");
                                                }
                                                if (e5 == 4) {
                                                    break;
                                                }
                                                if (e5 == 5) {
                                                    oVar6.a();
                                                }
                                                oVar5 = oVar6;
                                            }
                                        }
                                        d(this, obj3, c0821h);
                                        yVar = yVar2;
                                    }
                                    obj2 = c0821h.q();
                                    if (obj2 != aVar) {
                                        obj2 = yVar;
                                    }
                                    if (obj2 != aVar) {
                                        return yVar;
                                    }
                                }
                                c0821h = l3;
                                yVar = yVar2;
                                c0821h.u(yVar);
                                obj2 = c0821h.q();
                                if (obj2 != aVar) {
                                }
                                if (obj2 != aVar) {
                                }
                            } else {
                                c0821h = l3;
                                yVar = yVar2;
                                oVar.a();
                            }
                            c0821h.u(yVar);
                            obj2 = c0821h.q();
                            if (obj2 != aVar) {
                            }
                            if (obj2 != aVar) {
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            r22 = oVar4;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        r22 = l3;
                    }
                } else if (e3 != 4) {
                    if (e3 == 5) {
                        oVar.a();
                    }
                    oVar3 = oVar;
                } else {
                    if (j3 < atomicLongFieldUpdater2.get(this)) {
                        oVar.a();
                    }
                    Object C = C(dVar, obj);
                    if (C == aVar) {
                        return C;
                    }
                }
            } else {
                if (!x3) {
                    return yVar2;
                }
                oVar.h();
                obj2 = C(dVar, obj);
                if (obj2 != aVar) {
                    return yVar2;
                }
            }
        }
        return obj2;
    }

    public final C0970d g() {
        return new C0970d(3, this, g.class, "onCancellationImplDoNotCall", "onCancellationImplDoNotCall(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0, 0);
    }

    public final C0970d h() {
        return new C0970d(3, this, g.class, "onCancellationChannelResultImplDoNotCall", "onCancellationChannelResultImplDoNotCall-5_sEAP8(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [q2.h] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r16v0, types: [java.lang.Object, s2.g] */
    @Override // s2.v
    public final Object i(X1.i iVar) {
        o oVar;
        ?? r13;
        C0821h c0821h;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8381k;
        o oVar2 = (o) atomicReferenceFieldUpdater.get(this);
        while (!y()) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f8377g;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j3 = i.f8389b;
            long j4 = andIncrement / j3;
            int i3 = (int) (andIncrement % j3);
            if (oVar2.f9826c != j4) {
                o r3 = r(j4, oVar2);
                if (r3 == null) {
                    continue;
                } else {
                    oVar = r3;
                }
            } else {
                oVar = oVar2;
            }
            Object I3 = I(oVar, i3, andIncrement, null);
            m1.q qVar = i.f8400m;
            if (I3 == qVar) {
                throw new IllegalStateException("unexpected");
            }
            m1.q qVar2 = i.f8402o;
            if (I3 == qVar2) {
                if (andIncrement < v()) {
                    oVar.a();
                }
                oVar2 = oVar;
            } else {
                if (I3 != i.f8401n) {
                    oVar.a();
                    return I3;
                }
                C0821h l3 = AbstractC0837y.l(l0.c.B(iVar));
                try {
                    Object I4 = I(oVar, i3, andIncrement, l3);
                    try {
                        if (I4 == qVar) {
                            c0821h = l3;
                            c0821h.a(oVar, i3);
                        } else {
                            c0821h = l3;
                            C0970d c0970d = null;
                            InterfaceC0424c interfaceC0424c = this.f8386e;
                            if (I4 == qVar2) {
                                if (andIncrement < v()) {
                                    oVar.a();
                                }
                                o oVar3 = (o) atomicReferenceFieldUpdater.get(this);
                                while (true) {
                                    if (y()) {
                                        c0821h.u(R1.a.b(t()));
                                        break;
                                    }
                                    long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(this);
                                    long j5 = i.f8389b;
                                    long j6 = andIncrement2 / j5;
                                    int i4 = (int) (andIncrement2 % j5);
                                    if (oVar3.f9826c != j6) {
                                        o r4 = r(j6, oVar3);
                                        if (r4 != null) {
                                            oVar3 = r4;
                                        }
                                    }
                                    InterfaceC0424c interfaceC0424c2 = interfaceC0424c;
                                    I4 = I(oVar3, i4, andIncrement2, c0821h);
                                    if (I4 == i.f8400m) {
                                        c0821h.a(oVar3, i4);
                                        break;
                                    }
                                    if (I4 == i.f8402o) {
                                        if (andIncrement2 < v()) {
                                            oVar3.a();
                                        }
                                        interfaceC0424c = interfaceC0424c2;
                                    } else {
                                        if (I4 == i.f8401n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        oVar3.a();
                                        if (interfaceC0424c2 != null) {
                                            c0970d = g();
                                        }
                                    }
                                }
                            } else {
                                oVar.a();
                                if (interfaceC0424c != null) {
                                    c0970d = g();
                                }
                            }
                            c0821h.m(I4, c0970d);
                        }
                        return c0821h.q();
                    } catch (Throwable th) {
                        th = th;
                        r13 = qVar;
                        r13.A();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    r13 = l3;
                }
            }
        }
        Throwable t3 = t();
        int i5 = v2.s.f9827a;
        throw t3;
    }

    @Override // s2.v
    public final C0969c iterator() {
        return new C0969c(this);
    }

    public final boolean j(long j3) {
        return j3 < f8378h.get(this) || j3 < f8377g.get(this) + ((long) this.f8385d);
    }

    public final boolean k(Throwable th, boolean z3) {
        boolean z4;
        long j3;
        long j4;
        long j5;
        Object obj;
        long j6;
        long j7;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f8376f;
        if (z3) {
            do {
                j7 = atomicLongFieldUpdater.get(this);
                if (((int) (j7 >> 60)) != 0) {
                    break;
                }
                o oVar = i.f8388a;
            } while (!atomicLongFieldUpdater.compareAndSet(this, j7, (1 << 60) + (j7 & 1152921504606846975L)));
        }
        m1.q qVar = i.f8406s;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8383m;
            if (atomicReferenceFieldUpdater.compareAndSet(this, qVar, th)) {
                z4 = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != qVar) {
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
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f8384n;
                obj = atomicReferenceFieldUpdater2.get(this);
                m1.q qVar2 = obj == null ? i.f8404q : i.f8405r;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, qVar2)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj) {
                        break;
                    }
                }
            }
            if (obj != null) {
                f2.x.d(1, obj);
                ((InterfaceC0424c) obj).n(s());
            }
        }
        return z4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x008f, code lost:
    
        r1 = (s2.o) ((v2.b) v2.b.f9790b.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final o l(long j3) {
        Object obj;
        long j4;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj2 = f8382l.get(this);
        o oVar = (o) f8380j.get(this);
        if (oVar.f9826c > ((o) obj2).f9826c) {
            obj2 = oVar;
        }
        o oVar2 = (o) f8381k.get(this);
        if (oVar2.f9826c > ((o) obj2).f9826c) {
            obj2 = oVar2;
        }
        v2.b bVar = (v2.b) obj2;
        loop0: while (true) {
            bVar.getClass();
            Object obj3 = v2.b.f9789a.get(bVar);
            m1.q qVar = v2.a.f9782a;
            obj = null;
            if (obj3 == qVar) {
                break;
            }
            v2.b bVar2 = (v2.b) obj3;
            if (bVar2 == null) {
                do {
                    atomicReferenceFieldUpdater = v2.b.f9789a;
                    if (atomicReferenceFieldUpdater.compareAndSet(bVar, null, qVar)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(bVar) == null);
            } else {
                bVar = bVar2;
            }
        }
        o oVar3 = (o) bVar;
        if (z()) {
            o oVar4 = oVar3;
            loop2: do {
                int i3 = i.f8389b - 1;
                while (true) {
                    if (-1 >= i3) {
                        break;
                    }
                    j4 = (oVar4.f9826c * i.f8389b) + i3;
                    if (j4 < f8377g.get(this)) {
                        break loop2;
                    }
                    while (true) {
                        Object k3 = oVar4.k(i3);
                        if (k3 != null && k3 != i.f8392e) {
                            if (k3 == i.f8391d) {
                                break loop2;
                            }
                        } else {
                            if (oVar4.j(k3, i3, i.f8399l)) {
                                oVar4.h();
                                break;
                            }
                        }
                    }
                    i3--;
                }
            } while (oVar4 != null);
            j4 = -1;
            if (j4 != -1) {
                n(j4);
            }
        }
        loop5: for (o oVar5 = oVar3; oVar5 != null; oVar5 = (o) ((v2.b) v2.b.f9790b.get(oVar5))) {
            for (int i4 = i.f8389b - 1; -1 < i4; i4--) {
                if ((oVar5.f9826c * i.f8389b) + i4 < j3) {
                    break loop5;
                }
                while (true) {
                    Object k4 = oVar5.k(i4);
                    if (k4 != null && k4 != i.f8392e) {
                        if (!(k4 instanceof x)) {
                            if (!(k4 instanceof w0)) {
                                break;
                            }
                            if (oVar5.j(k4, i4, i.f8399l)) {
                                obj = v2.a.h(obj, k4);
                                oVar5.l(i4, true);
                                break;
                            }
                        } else {
                            if (oVar5.j(k4, i4, i.f8399l)) {
                                obj = v2.a.h(obj, ((x) k4).f8418a);
                                oVar5.l(i4, true);
                                break;
                            }
                        }
                    } else {
                        if (oVar5.j(k4, i4, i.f8399l)) {
                            oVar5.h();
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
                    F((w0) arrayList.get(size), true);
                }
            } else {
                F((w0) obj, true);
            }
        }
        return oVar3;
    }

    public final void m() {
        x(f8376f.get(this), false);
    }

    public final void n(long j3) {
        C1.c b3;
        o oVar = (o) f8381k.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f8377g;
            long j4 = atomicLongFieldUpdater.get(this);
            if (j3 < Math.max(this.f8385d + j4, f8378h.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j4, j4 + 1)) {
                long j5 = i.f8389b;
                long j6 = j4 / j5;
                int i3 = (int) (j4 % j5);
                if (oVar.f9826c != j6) {
                    o r3 = r(j6, oVar);
                    if (r3 == null) {
                        continue;
                    } else {
                        oVar = r3;
                    }
                }
                Object I3 = I(oVar, i3, j4, null);
                if (I3 != i.f8402o) {
                    oVar.a();
                    InterfaceC0424c interfaceC0424c = this.f8386e;
                    if (interfaceC0424c != null && (b3 = v2.a.b(interfaceC0424c, I3, null)) != null) {
                        throw b3;
                    }
                } else if (j4 < v()) {
                    oVar.a();
                }
            }
        }
    }

    @Override // s2.v
    public final Object o() {
        o oVar;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f8377g;
        long j3 = atomicLongFieldUpdater.get(this);
        long j4 = f8376f.get(this);
        if (x(j4, true)) {
            return new l(s());
        }
        long j5 = j4 & 1152921504606846975L;
        Object obj = n.f8411b;
        if (j3 >= j5) {
            return obj;
        }
        Object obj2 = i.f8398k;
        o oVar2 = (o) f8381k.get(this);
        while (!y()) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j6 = i.f8389b;
            long j7 = andIncrement / j6;
            int i3 = (int) (andIncrement % j6);
            if (oVar2.f9826c != j7) {
                o r3 = r(j7, oVar2);
                if (r3 == null) {
                    continue;
                } else {
                    oVar = r3;
                }
            } else {
                oVar = oVar2;
            }
            Object I3 = I(oVar, i3, andIncrement, obj2);
            if (I3 == i.f8400m) {
                w0 w0Var = obj2 instanceof w0 ? (w0) obj2 : null;
                if (w0Var != null) {
                    w0Var.a(oVar, i3);
                }
                K(andIncrement);
                oVar.h();
            } else if (I3 == i.f8402o) {
                if (andIncrement < v()) {
                    oVar.a();
                }
                oVar2 = oVar;
            } else {
                if (I3 == i.f8401n) {
                    throw new IllegalStateException("unexpected");
                }
                oVar.a();
                obj = I3;
            }
            return obj;
        }
        return new l(s());
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:?, code lost:
    
        return r1;
     */
    @Override // s2.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object p(Object obj) {
        o oVar;
        o oVar2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f8376f;
        boolean z3 = x(atomicLongFieldUpdater.get(this), false) ? false : !j(r0 & 1152921504606846975L);
        m mVar = n.f8411b;
        if (!z3) {
            z1.c cVar = i.f8397j;
            o oVar3 = (o) f8380j.get(this);
            while (true) {
                long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
                long j3 = andIncrement & 1152921504606846975L;
                boolean x3 = x(andIncrement, false);
                int i3 = i.f8389b;
                long j4 = i3;
                long j5 = j3 / j4;
                int i4 = (int) (j3 % j4);
                if (oVar3.f9826c != j5) {
                    o b3 = b(this, j5, oVar3);
                    if (b3 != null) {
                        oVar = b3;
                    } else if (x3) {
                        return new l(u());
                    }
                } else {
                    oVar = oVar3;
                }
                o oVar4 = oVar;
                int e3 = e(this, oVar, i4, obj, j3, cVar, x3);
                y yVar = y.f4171a;
                if (e3 == 0) {
                    oVar4.a();
                    break;
                }
                if (e3 == 1) {
                    break;
                }
                if (e3 == 2) {
                    if (x3) {
                        oVar4.h();
                        return new l(u());
                    }
                    w0 w0Var = cVar instanceof w0 ? (w0) cVar : null;
                    if (w0Var != null) {
                        oVar2 = oVar4;
                        w0Var.a(oVar2, i4 + i3);
                    } else {
                        oVar2 = oVar4;
                    }
                    oVar2.h();
                    return mVar;
                }
                if (e3 == 3) {
                    throw new IllegalStateException("unexpected");
                }
                if (e3 == 4) {
                    if (j3 < f8377g.get(this)) {
                        oVar4.a();
                    }
                    return new l(u());
                }
                if (e3 == 5) {
                    oVar4.a();
                }
                oVar3 = oVar4;
            }
        } else {
            return mVar;
        }
    }

    public final void q() {
        Object d3;
        if (A()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8382l;
        o oVar = (o) atomicReferenceFieldUpdater.get(this);
        loop0: while (true) {
            long andIncrement = f8378h.getAndIncrement(this);
            long j3 = andIncrement / i.f8389b;
            if (v() <= andIncrement) {
                if (oVar.f9826c < j3 && oVar.b() != null) {
                    B(j3, oVar);
                }
                w(this);
                return;
            }
            if (oVar.f9826c != j3) {
                h hVar = h.f8387l;
                while (true) {
                    d3 = v2.a.d(oVar, j3, hVar);
                    if (!v2.a.g(d3)) {
                        v2.r e3 = v2.a.e(d3);
                        while (true) {
                            v2.r rVar = (v2.r) atomicReferenceFieldUpdater.get(this);
                            if (rVar.f9826c >= e3.f9826c) {
                                break;
                            }
                            if (!e3.i()) {
                                break;
                            }
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, rVar, e3)) {
                                if (atomicReferenceFieldUpdater.get(this) != rVar) {
                                    if (e3.e()) {
                                        e3.d();
                                    }
                                }
                            }
                            if (rVar.e()) {
                                rVar.d();
                            }
                        }
                    } else {
                        break;
                    }
                }
                o oVar2 = null;
                if (v2.a.g(d3)) {
                    m();
                    B(j3, oVar);
                    w(this);
                } else {
                    o oVar3 = (o) v2.a.e(d3);
                    long j4 = oVar3.f9826c;
                    if (j4 > j3) {
                        long j5 = j4 * i.f8389b;
                        if (f8378h.compareAndSet(this, andIncrement + 1, j5)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = f8379i;
                            if ((atomicLongFieldUpdater.addAndGet(this, j5 - andIncrement) & 4611686018427387904L) != 0) {
                                while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0) {
                                }
                            }
                        } else {
                            w(this);
                        }
                    } else {
                        oVar2 = oVar3;
                    }
                }
                if (oVar2 == null) {
                    continue;
                } else {
                    oVar = oVar2;
                }
            }
            int i3 = (int) (andIncrement % i.f8389b);
            Object k3 = oVar.k(i3);
            boolean z3 = k3 instanceof w0;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f8377g;
            if (!z3 || andIncrement < atomicLongFieldUpdater2.get(this) || !oVar.j(k3, i3, i.f8394g)) {
                while (true) {
                    Object k4 = oVar.k(i3);
                    if (!(k4 instanceof w0)) {
                        if (k4 != i.f8397j) {
                            if (k4 != null) {
                                if (k4 == i.f8391d || k4 == i.f8395h || k4 == i.f8396i || k4 == i.f8398k || k4 == i.f8399l) {
                                    break loop0;
                                }
                                if (k4 != i.f8393f) {
                                    throw new IllegalStateException(("Unexpected cell state: " + k4).toString());
                                }
                            } else if (oVar.j(k4, i3, i.f8392e)) {
                                break loop0;
                            }
                        } else {
                            break;
                        }
                    } else if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                        if (oVar.j(k4, i3, new x((w0) k4))) {
                            break loop0;
                        }
                    } else if (oVar.j(k4, i3, i.f8394g)) {
                        if (H(k4)) {
                            oVar.n(i3, i.f8391d);
                            break;
                        } else {
                            oVar.n(i3, i.f8397j);
                            oVar.h();
                        }
                    }
                }
            } else if (H(k3)) {
                oVar.n(i3, i.f8391d);
                break;
            } else {
                oVar.n(i3, i.f8397j);
                oVar.h();
                w(this);
            }
        }
        w(this);
    }

    public final o r(long j3, o oVar) {
        Object d3;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j4;
        o oVar2 = i.f8388a;
        h hVar = h.f8387l;
        loop0: while (true) {
            d3 = v2.a.d(oVar, j3, hVar);
            if (!v2.a.g(d3)) {
                v2.r e3 = v2.a.e(d3);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8381k;
                    v2.r rVar = (v2.r) atomicReferenceFieldUpdater.get(this);
                    if (rVar.f9826c >= e3.f9826c) {
                        break loop0;
                    }
                    if (!e3.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, rVar, e3)) {
                        if (atomicReferenceFieldUpdater.get(this) != rVar) {
                            if (e3.e()) {
                                e3.d();
                            }
                        }
                    }
                    if (rVar.e()) {
                        rVar.d();
                    }
                }
            } else {
                break;
            }
        }
        if (v2.a.g(d3)) {
            m();
            if (oVar.f9826c * i.f8389b >= v()) {
                return null;
            }
            oVar.a();
            return null;
        }
        o oVar3 = (o) v2.a.e(d3);
        boolean A3 = A();
        long j5 = oVar3.f9826c;
        if (!A3 && j3 <= f8378h.get(this) / i.f8389b) {
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f8382l;
                v2.r rVar2 = (v2.r) atomicReferenceFieldUpdater2.get(this);
                if (rVar2.f9826c >= j5 || !oVar3.i()) {
                    break;
                }
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, rVar2, oVar3)) {
                    if (atomicReferenceFieldUpdater2.get(this) != rVar2) {
                        if (oVar3.e()) {
                            oVar3.d();
                        }
                    }
                }
                if (rVar2.e()) {
                    rVar2.d();
                }
            }
        }
        if (j5 <= j3) {
            return oVar3;
        }
        long j6 = i.f8389b * j5;
        do {
            atomicLongFieldUpdater = f8377g;
            j4 = atomicLongFieldUpdater.get(this);
            if (j4 >= j6) {
                break;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j4, j6));
        if (j5 * i.f8389b >= v()) {
            return null;
        }
        oVar3.a();
        return null;
    }

    public final Throwable s() {
        return (Throwable) f8383m.get(this);
    }

    public final Throwable t() {
        Throwable s3 = s();
        return s3 == null ? new p("Channel was closed") : s3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x0195, code lost:
    
        r3 = (s2.o) r3.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x019c, code lost:
    
        if (r3 != null) goto L80;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        int i3 = (int) (f8376f.get(this) >> 60);
        if (i3 == 2) {
            sb.append("closed,");
        } else if (i3 == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.f8385d + ',');
        sb.append("data=[");
        int i4 = 0;
        List A02 = S1.m.A0(f8381k.get(this), f8380j.get(this), f8382l.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj : A02) {
            if (((o) obj) != i.f8388a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j3 = ((o) next).f9826c;
            do {
                Object next2 = it.next();
                long j4 = ((o) next2).f9826c;
                if (j3 > j4) {
                    next = next2;
                    j3 = j4;
                }
            } while (it.hasNext());
        }
        o oVar = (o) next;
        long j5 = f8377g.get(this);
        long v3 = v();
        loop2: while (true) {
            int i5 = i.f8389b;
            int i6 = i4;
            while (true) {
                if (i6 >= i5) {
                    break;
                }
                long j6 = (oVar.f9826c * i.f8389b) + i6;
                if (j6 >= v3 && j6 >= j5) {
                    break loop2;
                }
                Object k3 = oVar.k(i6);
                Object obj2 = oVar.f8414f.get(i6 * 2);
                if (k3 instanceof InterfaceC0819f) {
                    str = (j6 >= j5 || j6 < v3) ? (j6 >= v3 || j6 < j5) ? "cont" : "send" : "receive";
                } else if (k3 instanceof u) {
                    str = "receiveCatching";
                } else if (k3 instanceof x) {
                    str = "EB(" + k3 + ')';
                } else if (f2.j.a(k3, i.f8393f) || f2.j.a(k3, i.f8394g)) {
                    str = "resuming_sender";
                } else {
                    if (k3 != null && !k3.equals(i.f8392e) && !k3.equals(i.f8396i) && !k3.equals(i.f8395h) && !k3.equals(i.f8398k) && !k3.equals(i.f8397j) && !k3.equals(i.f8399l)) {
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
        if (AbstractC0730j.L(sb) == ',') {
            f2.j.e(sb.deleteCharAt(sb.length() - 1), "deleteCharAt(...)");
        }
        sb.append("]");
        return sb.toString();
    }

    public final Throwable u() {
        Throwable s3 = s();
        return s3 == null ? new q("Channel was closed") : s3;
    }

    public final long v() {
        return f8376f.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x00c6, code lost:
    
        r0 = (s2.o) ((v2.b) v2.b.f9790b.get(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean x(long j3, boolean z3) {
        int i3 = (int) (j3 >> 60);
        if (i3 == 0 || i3 == 1) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f8377g;
        if (i3 == 2) {
            l(j3 & 1152921504606846975L);
            if (z3) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8381k;
                    o oVar = (o) atomicReferenceFieldUpdater.get(this);
                    long j4 = atomicLongFieldUpdater.get(this);
                    if (v() <= j4) {
                        break;
                    }
                    long j5 = i.f8389b;
                    long j6 = j4 / j5;
                    if (oVar.f9826c != j6 && (oVar = r(j6, oVar)) == null) {
                        if (((o) atomicReferenceFieldUpdater.get(this)).f9826c < j6) {
                            break;
                        }
                    } else {
                        oVar.a();
                        int i4 = (int) (j4 % j5);
                        while (true) {
                            Object k3 = oVar.k(i4);
                            if (k3 == null || k3 == i.f8392e) {
                                if (oVar.j(k3, i4, i.f8395h)) {
                                    q();
                                    break;
                                }
                            } else {
                                if (k3 == i.f8391d) {
                                    return false;
                                }
                                if (k3 != i.f8397j && k3 != i.f8399l && k3 != i.f8396i && k3 != i.f8395h) {
                                    if (k3 == i.f8394g) {
                                        return false;
                                    }
                                    if (k3 != i.f8393f && j4 == atomicLongFieldUpdater.get(this)) {
                                        return false;
                                    }
                                }
                            }
                        }
                        f8377g.compareAndSet(this, j4, j4 + 1);
                    }
                }
            }
        } else {
            if (i3 != 3) {
                throw new IllegalStateException(A.k.h("unexpected close status: ", i3).toString());
            }
            o l3 = l(j3 & 1152921504606846975L);
            C1.c cVar = null;
            Object obj = null;
            loop0: do {
                int i5 = i.f8389b - 1;
                while (true) {
                    if (-1 >= i5) {
                        break;
                    }
                    long j7 = (l3.f9826c * i.f8389b) + i5;
                    while (true) {
                        Object k4 = l3.k(i5);
                        if (k4 == i.f8396i) {
                            break loop0;
                        }
                        m1.q qVar = i.f8391d;
                        AtomicReferenceArray atomicReferenceArray = l3.f8414f;
                        InterfaceC0424c interfaceC0424c = this.f8386e;
                        if (k4 == qVar) {
                            if (j7 < atomicLongFieldUpdater.get(this)) {
                                break loop0;
                            }
                            if (l3.j(k4, i5, i.f8399l)) {
                                if (interfaceC0424c != null) {
                                    cVar = v2.a.b(interfaceC0424c, atomicReferenceArray.get(i5 * 2), cVar);
                                }
                                l3.m(i5, null);
                                l3.h();
                            }
                        } else if (k4 == i.f8392e || k4 == null) {
                            if (l3.j(k4, i5, i.f8399l)) {
                                l3.h();
                                break;
                            }
                        } else if (!(k4 instanceof w0) && !(k4 instanceof x)) {
                            m1.q qVar2 = i.f8394g;
                            if (k4 == qVar2 || k4 == i.f8393f) {
                                break loop0;
                            }
                            if (k4 != qVar2) {
                                break;
                            }
                        } else {
                            if (j7 < atomicLongFieldUpdater.get(this)) {
                                break loop0;
                            }
                            w0 w0Var = k4 instanceof x ? ((x) k4).f8418a : (w0) k4;
                            if (l3.j(k4, i5, i.f8399l)) {
                                if (interfaceC0424c != null) {
                                    cVar = v2.a.b(interfaceC0424c, atomicReferenceArray.get(i5 * 2), cVar);
                                }
                                obj = v2.a.h(obj, w0Var);
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
                        F((w0) arrayList.get(size), false);
                    }
                } else {
                    F((w0) obj, false);
                }
            }
            if (cVar != null) {
                throw cVar;
            }
        }
        return true;
    }

    public final boolean y() {
        return x(f8376f.get(this), true);
    }

    public boolean z() {
        return false;
    }
}
