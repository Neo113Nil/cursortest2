package e7;

import c7.a0;
import c7.w1;
import d6.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import r6.y;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public class e implements i {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f2846g = AtomicLongFieldUpdater.newUpdater(e.class, "sendersAndCloseStatus$volatile");

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f2847h = AtomicLongFieldUpdater.newUpdater(e.class, "receivers$volatile");

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f2848i = AtomicLongFieldUpdater.newUpdater(e.class, "bufferEnd$volatile");

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f2849j = AtomicLongFieldUpdater.newUpdater(e.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2850k = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "sendSegment$volatile");

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2851l = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "receiveSegment$volatile");

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2852m = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "bufferEndSegment$volatile");

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2853n = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "_closeCause$volatile");

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2854o = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "closeHandler$volatile");
    private volatile /* synthetic */ Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;

    /* renamed from: f, reason: collision with root package name */
    public final int f2855f;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    public e(int i7) {
        this.f2855f = i7;
        if (i7 < 0) {
            throw new IllegalArgumentException(a0.m.g(i7, "Invalid channel capacity: ", ", should be >=0").toString());
        }
        m mVar = g.f2857a;
        this.bufferEnd$volatile = i7 != 0 ? i7 != Integer.MAX_VALUE ? i7 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = f2848i.get(this);
        m mVar2 = new m(0L, null, this, 3);
        this.sendSegment$volatile = mVar2;
        this.receiveSegment$volatile = mVar2;
        if (y()) {
            mVar2 = g.f2857a;
            r6.k.d(mVar2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = mVar2;
        this._closeCause$volatile = g.f2875s;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object B(e eVar, j6.c cVar) {
        c cVar2;
        int i7;
        m mVar;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i8 = cVar2.f2842h;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                cVar2.f2842h = i8 - Integer.MIN_VALUE;
                c cVar3 = cVar2;
                Object obj = cVar3.f2840f;
                i7 = cVar3.f2842h;
                if (i7 == 0) {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d6.a.e(obj);
                    return ((l) obj).f2881a;
                }
                d6.a.e(obj);
                m mVar2 = (m) f2851l.get(eVar);
                while (!eVar.w()) {
                    long andIncrement = f2847h.getAndIncrement(eVar);
                    long j8 = g.f2858b;
                    long j9 = andIncrement / j8;
                    int i9 = (int) (andIncrement % j8);
                    if (mVar2.f4704c != j9) {
                        m p6 = eVar.p(j9, mVar2);
                        if (p6 == null) {
                            continue;
                        } else {
                            mVar = p6;
                        }
                    } else {
                        mVar = mVar2;
                    }
                    e eVar2 = eVar;
                    Object G = eVar2.G(mVar, i9, andIncrement, null);
                    if (G == g.f2869m) {
                        throw new IllegalStateException("unexpected");
                    }
                    if (G != g.f2871o) {
                        if (G != g.f2870n) {
                            mVar.a();
                            return G;
                        }
                        cVar3.f2842h = 1;
                        Object C = eVar2.C(mVar, i9, andIncrement, cVar3);
                        i6.a aVar = i6.a.f4956f;
                        return C == aVar ? aVar : C;
                    }
                    if (andIncrement < eVar2.t()) {
                        mVar.a();
                    }
                    mVar2 = mVar;
                    eVar = eVar2;
                }
                return new j(eVar.q());
            }
        }
        cVar2 = new c(eVar, cVar);
        c cVar32 = cVar2;
        Object obj2 = cVar32.f2840f;
        i7 = cVar32.f2842h;
        if (i7 == 0) {
        }
    }

    public static boolean F(Object obj) {
        if (obj instanceof c7.f) {
            return g.a((c7.f) obj, z.f2639a, null);
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    public static final m b(e eVar, long j8, m mVar) {
        Object b9;
        e eVar2;
        m mVar2 = g.f2857a;
        f fVar = f.f2856n;
        loop0: while (true) {
            b9 = h7.a.b(mVar, j8, fVar);
            if (!h7.a.e(b9)) {
                h7.q c4 = h7.a.c(b9);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2850k;
                    h7.q qVar = (h7.q) atomicReferenceFieldUpdater.get(eVar);
                    if (qVar.f4704c >= c4.f4704c) {
                        break loop0;
                    }
                    if (!c4.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(eVar, qVar, c4)) {
                        if (atomicReferenceFieldUpdater.get(eVar) != qVar) {
                            if (c4.e()) {
                                c4.d();
                            }
                        }
                    }
                    if (qVar.e()) {
                        qVar.d();
                    }
                }
            } else {
                break;
            }
        }
        boolean e9 = h7.a.e(b9);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f2847h;
        if (e9) {
            eVar.m();
            if (mVar.f4704c * g.f2858b < atomicLongFieldUpdater.get(eVar)) {
                mVar.a();
                return null;
            }
        } else {
            m mVar3 = (m) h7.a.c(b9);
            long j9 = mVar3.f4704c;
            if (j9 <= j8) {
                return mVar3;
            }
            long j10 = g.f2858b * j9;
            while (true) {
                long j11 = f2846g.get(eVar);
                long j12 = 1152921504606846975L & j11;
                if (j12 >= j10) {
                    eVar2 = eVar;
                    break;
                }
                eVar2 = eVar;
                if (f2846g.compareAndSet(eVar2, j11, (((int) (j11 >> 60)) << 60) + j12)) {
                    break;
                }
                eVar = eVar2;
            }
            if (j9 * g.f2858b < atomicLongFieldUpdater.get(eVar2)) {
                mVar3.a();
            }
        }
        return null;
    }

    public static final void g(e eVar, Object obj, c7.h hVar) {
        hVar.resumeWith(d6.a.b(eVar.s()));
    }

    public static final int i(e eVar, m mVar, int i7, Object obj, long j8, Object obj2, boolean z8) {
        mVar.m(i7, obj);
        if (z8) {
            return eVar.H(mVar, i7, obj, j8, obj2, z8);
        }
        Object k8 = mVar.k(i7);
        if (k8 == null) {
            if (eVar.j(j8)) {
                if (mVar.j(null, i7, g.f2860d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (mVar.j(null, i7, obj2)) {
                    return 2;
                }
            }
        } else if (k8 instanceof w1) {
            mVar.m(i7, null);
            if (eVar.E(k8, obj)) {
                mVar.n(i7, g.f2865i);
                return 0;
            }
            h7.s sVar = g.f2867k;
            if (mVar.f2883f.getAndSet((i7 * 2) + 1, sVar) == sVar) {
                return 5;
            }
            mVar.l(i7, true);
            return 5;
        }
        return eVar.H(mVar, i7, obj, j8, obj2, z8);
    }

    public static void u(e eVar) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f2849j;
        if ((atomicLongFieldUpdater.addAndGet(eVar, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(eVar) & 4611686018427387904L) != 0) {
            }
        }
    }

    public final Object A(h6.d dVar, Object obj) {
        c7.h hVar = new c7.h(1, a8.m.A(dVar));
        hVar.r();
        hVar.resumeWith(d6.a.b(s()));
        Object q8 = hVar.q();
        return q8 == i6.a.f4956f ? q8 : z.f2639a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object C(m mVar, int i7, long j8, j6.c cVar) {
        d dVar;
        int i8;
        m mVar2;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i9 = dVar.f2845h;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                dVar.f2845h = i9 - Integer.MIN_VALUE;
                Object obj = dVar.f2843f;
                i8 = dVar.f2845h;
                if (i8 != 0) {
                    d6.a.e(obj);
                    dVar.f2845h = 1;
                    c7.h k8 = a0.k(a8.m.A(dVar));
                    try {
                        s sVar = new s(k8);
                        Object G = G(mVar, i7, j8, sVar);
                        if (G == g.f2869m) {
                            sVar.a(mVar, i7);
                        } else if (G == g.f2871o) {
                            if (j8 < t()) {
                                mVar.a();
                            }
                            m mVar3 = (m) f2851l.get(this);
                            while (true) {
                                if (w()) {
                                    k8.resumeWith(new l(new j(q())));
                                    break;
                                }
                                long andIncrement = f2847h.getAndIncrement(this);
                                long j9 = g.f2858b;
                                long j10 = andIncrement / j9;
                                int i10 = (int) (andIncrement % j9);
                                if (mVar3.f4704c != j10) {
                                    m p6 = p(j10, mVar3);
                                    if (p6 != null) {
                                        mVar2 = p6;
                                    }
                                } else {
                                    mVar2 = mVar3;
                                }
                                Object G2 = G(mVar2, i10, andIncrement, sVar);
                                m mVar4 = mVar2;
                                if (G2 == g.f2869m) {
                                    sVar.a(mVar4, i10);
                                    break;
                                }
                                if (G2 == g.f2871o) {
                                    if (andIncrement < t()) {
                                        mVar4.a();
                                    }
                                    mVar3 = mVar4;
                                } else {
                                    if (G2 == g.f2870n) {
                                        throw new IllegalStateException("unexpected");
                                    }
                                    mVar4.a();
                                    k8.A(new l(G2), null);
                                }
                            }
                        } else {
                            mVar.a();
                            k8.A(new l(G), null);
                        }
                        obj = k8.q();
                        i6.a aVar = i6.a.f4956f;
                        if (obj == aVar) {
                            return aVar;
                        }
                    } catch (Throwable th) {
                        k8.z();
                        throw th;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d6.a.e(obj);
                }
                return ((l) obj).f2881a;
            }
        }
        dVar = new d(this, cVar);
        Object obj2 = dVar.f2843f;
        i8 = dVar.f2845h;
        if (i8 != 0) {
        }
        return ((l) obj2).f2881a;
    }

    public final void D(w1 w1Var, boolean z8) {
        if (w1Var instanceof c7.f) {
            ((h6.d) w1Var).resumeWith(d6.a.b(z8 ? r() : s()));
            return;
        }
        if (w1Var instanceof s) {
            ((s) w1Var).f2887f.resumeWith(new l(new j(q())));
            return;
        }
        if (!(w1Var instanceof b)) {
            throw new IllegalStateException(("Unexpected waiter: " + w1Var).toString());
        }
        b bVar = (b) w1Var;
        c7.h hVar = bVar.f2838g;
        r6.k.c(hVar);
        bVar.f2838g = null;
        bVar.f2837f = g.f2868l;
        Throwable q8 = bVar.f2839h.q();
        if (q8 == null) {
            hVar.resumeWith(Boolean.FALSE);
        } else {
            hVar.resumeWith(d6.a.b(q8));
        }
    }

    public final boolean E(Object obj, Object obj2) {
        if (obj instanceof s) {
            return g.a(((s) obj).f2887f, new l(obj2), null);
        }
        if (!(obj instanceof b)) {
            if (obj instanceof c7.f) {
                return g.a((c7.f) obj, obj2, null);
            }
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        }
        b bVar = (b) obj;
        c7.h hVar = bVar.f2838g;
        r6.k.c(hVar);
        bVar.f2838g = null;
        bVar.f2837f = obj2;
        Boolean bool = Boolean.TRUE;
        bVar.f2839h.getClass();
        return g.a(hVar, bool, null);
    }

    public final Object G(m mVar, int i7, long j8, Object obj) {
        Object k8 = mVar.k(i7);
        AtomicReferenceArray atomicReferenceArray = mVar.f2883f;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f2846g;
        if (k8 == null) {
            if (j8 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return g.f2870n;
                }
                if (mVar.j(k8, i7, obj)) {
                    o();
                    return g.f2869m;
                }
            }
        } else if (k8 == g.f2860d && mVar.j(k8, i7, g.f2865i)) {
            o();
            Object obj2 = atomicReferenceArray.get(i7 * 2);
            mVar.m(i7, null);
            return obj2;
        }
        while (true) {
            Object k9 = mVar.k(i7);
            if (k9 == null || k9 == g.f2861e) {
                if (j8 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (mVar.j(k9, i7, g.f2864h)) {
                        o();
                        return g.f2871o;
                    }
                } else {
                    if (obj == null) {
                        return g.f2870n;
                    }
                    if (mVar.j(k9, i7, obj)) {
                        o();
                        return g.f2869m;
                    }
                }
            } else if (k9 != g.f2860d) {
                h7.s sVar = g.f2866j;
                if (k9 == sVar) {
                    return g.f2871o;
                }
                if (k9 == g.f2864h) {
                    return g.f2871o;
                }
                if (k9 == g.f2868l) {
                    o();
                    return g.f2871o;
                }
                if (k9 != g.f2863g && mVar.j(k9, i7, g.f2862f)) {
                    boolean z8 = k9 instanceof v;
                    if (z8) {
                        k9 = ((v) k9).f2888a;
                    }
                    if (F(k9)) {
                        mVar.n(i7, g.f2865i);
                        o();
                        Object obj3 = atomicReferenceArray.get(i7 * 2);
                        mVar.m(i7, null);
                        return obj3;
                    }
                    mVar.n(i7, sVar);
                    mVar.h();
                    if (z8) {
                        o();
                    }
                    return g.f2871o;
                }
            } else if (mVar.j(k9, i7, g.f2865i)) {
                o();
                Object obj4 = atomicReferenceArray.get(i7 * 2);
                mVar.m(i7, null);
                return obj4;
            }
        }
    }

    public final int H(m mVar, int i7, Object obj, long j8, Object obj2, boolean z8) {
        while (true) {
            Object k8 = mVar.k(i7);
            if (k8 == null) {
                if (!j(j8) || z8) {
                    if (z8) {
                        if (mVar.j(null, i7, g.f2866j)) {
                            mVar.h();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (mVar.j(null, i7, obj2)) {
                            return 2;
                        }
                    }
                } else if (mVar.j(null, i7, g.f2860d)) {
                    break;
                }
            } else {
                if (k8 != g.f2861e) {
                    h7.s sVar = g.f2867k;
                    if (k8 == sVar) {
                        mVar.m(i7, null);
                        return 5;
                    }
                    if (k8 == g.f2864h) {
                        mVar.m(i7, null);
                        return 5;
                    }
                    if (k8 == g.f2868l) {
                        mVar.m(i7, null);
                        m();
                        return 4;
                    }
                    mVar.m(i7, null);
                    if (k8 instanceof v) {
                        k8 = ((v) k8).f2888a;
                    }
                    if (E(k8, obj)) {
                        mVar.n(i7, g.f2865i);
                        return 0;
                    }
                    if (mVar.f2883f.getAndSet((i7 * 2) + 1, sVar) != sVar) {
                        mVar.l(i7, true);
                    }
                    return 5;
                }
                if (mVar.j(k8, i7, g.f2860d)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final void I(long j8) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        e eVar = this;
        if (eVar.y()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = f2848i;
            if (atomicLongFieldUpdater.get(eVar) > j8) {
                break;
            } else {
                eVar = this;
            }
        }
        int i7 = g.f2859c;
        int i8 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f2849j;
            if (i8 < i7) {
                long j9 = atomicLongFieldUpdater.get(eVar);
                if (j9 == (4611686018427387903L & atomicLongFieldUpdater2.get(eVar)) && j9 == atomicLongFieldUpdater.get(eVar)) {
                    return;
                } else {
                    i8++;
                }
            } else {
                while (true) {
                    long j10 = atomicLongFieldUpdater2.get(eVar);
                    if (atomicLongFieldUpdater2.compareAndSet(eVar, j10, (j10 & 4611686018427387903L) + 4611686018427387904L)) {
                        break;
                    } else {
                        eVar = this;
                    }
                }
                while (true) {
                    long j11 = atomicLongFieldUpdater.get(eVar);
                    long j12 = atomicLongFieldUpdater2.get(eVar);
                    long j13 = j12 & 4611686018427387903L;
                    boolean z8 = (j12 & 4611686018427387904L) != 0;
                    if (j11 == j13 && j11 == atomicLongFieldUpdater.get(eVar)) {
                        break;
                    }
                    if (z8) {
                        eVar = this;
                    } else {
                        eVar = this;
                        atomicLongFieldUpdater2.compareAndSet(eVar, j12, 4611686018427387904L + j13);
                    }
                }
                while (true) {
                    long j14 = atomicLongFieldUpdater2.get(eVar);
                    if (atomicLongFieldUpdater2.compareAndSet(eVar, j14, j14 & 4611686018427387903L)) {
                        return;
                    } else {
                        eVar = this;
                    }
                }
            }
        }
    }

    @Override // e7.t
    public final Object a(j6.i iVar) {
        m mVar;
        Throwable th;
        m mVar2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2851l;
        m mVar3 = (m) atomicReferenceFieldUpdater.get(this);
        while (!w()) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f2847h;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j8 = g.f2858b;
            long j9 = andIncrement / j8;
            int i7 = (int) (andIncrement % j8);
            if (mVar3.f4704c != j9) {
                m p6 = p(j9, mVar3);
                if (p6 == null) {
                    continue;
                } else {
                    mVar = p6;
                }
            } else {
                mVar = mVar3;
            }
            Object G = G(mVar, i7, andIncrement, null);
            h7.s sVar = g.f2869m;
            if (G == sVar) {
                throw new IllegalStateException("unexpected");
            }
            h7.s sVar2 = g.f2871o;
            if (G == sVar2) {
                if (andIncrement < t()) {
                    mVar.a();
                }
                mVar3 = mVar;
            } else {
                if (G != g.f2870n) {
                    mVar.a();
                    return G;
                }
                c7.h k8 = a0.k(a8.m.A(iVar));
                e eVar = this;
                try {
                    Object G2 = eVar.G(mVar, i7, andIncrement, k8);
                    if (G2 == sVar) {
                        k8.a(mVar, i7);
                    } else {
                        if (G2 == sVar2) {
                            if (andIncrement < t()) {
                                mVar.a();
                            }
                            m mVar4 = (m) atomicReferenceFieldUpdater.get(this);
                            while (true) {
                                if (w()) {
                                    k8.resumeWith(d6.a.b(r()));
                                    break;
                                }
                                c7.h hVar = k8;
                                try {
                                    long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(this);
                                    long j10 = g.f2858b;
                                    long j11 = andIncrement2 / j10;
                                    int i8 = (int) (andIncrement2 % j10);
                                    if (mVar4.f4704c != j11) {
                                        try {
                                            m p8 = p(j11, mVar4);
                                            if (p8 == null) {
                                                k8 = hVar;
                                            } else {
                                                mVar2 = p8;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            k8 = hVar;
                                            k8.z();
                                            throw th;
                                        }
                                    } else {
                                        mVar2 = mVar4;
                                    }
                                    G2 = eVar.G(mVar2, i8, andIncrement2, hVar);
                                    m mVar5 = mVar2;
                                    k8 = hVar;
                                    if (G2 == g.f2869m) {
                                        k8.a(mVar5, i8);
                                        break;
                                    }
                                    if (G2 == g.f2871o) {
                                        if (andIncrement2 < t()) {
                                            mVar5.a();
                                        }
                                        eVar = this;
                                        mVar4 = mVar5;
                                    } else {
                                        if (G2 == g.f2870n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        mVar5.a();
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    k8 = hVar;
                                    th = th;
                                    k8.z();
                                    throw th;
                                }
                            }
                        } else {
                            mVar.a();
                        }
                        k8.A(G2, null);
                    }
                    return k8.q();
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        }
        Throwable r8 = r();
        int i9 = h7.r.f4705a;
        throw r8;
    }

    @Override // e7.t
    public final void c(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        k(cancellationException, true);
    }

    @Override // e7.t
    public final Object d() {
        m mVar;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f2847h;
        long j8 = atomicLongFieldUpdater.get(this);
        long j9 = f2846g.get(this);
        if (v(j9, true)) {
            return new j(q());
        }
        long j10 = j9 & 1152921504606846975L;
        k kVar = l.f2880b;
        if (j8 >= j10) {
            return kVar;
        }
        Object obj = g.f2867k;
        m mVar2 = (m) f2851l.get(this);
        while (!w()) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j11 = g.f2858b;
            long j12 = andIncrement / j11;
            int i7 = (int) (andIncrement % j11);
            if (mVar2.f4704c != j12) {
                m p6 = p(j12, mVar2);
                if (p6 == null) {
                    continue;
                } else {
                    mVar = p6;
                }
            } else {
                mVar = mVar2;
            }
            Object G = G(mVar, i7, andIncrement, obj);
            m mVar3 = mVar;
            if (G == g.f2869m) {
                w1 w1Var = obj instanceof w1 ? (w1) obj : null;
                if (w1Var != null) {
                    w1Var.a(mVar3, i7);
                }
                I(andIncrement);
                mVar3.h();
                return kVar;
            }
            if (G != g.f2871o) {
                if (G == g.f2870n) {
                    throw new IllegalStateException("unexpected");
                }
                mVar3.a();
                return G;
            }
            if (andIncrement < t()) {
                mVar3.a();
            }
            mVar2 = mVar3;
        }
        return new j(q());
    }

    @Override // e7.u
    public Object e(Object obj) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f2846g;
        boolean z8 = false;
        long j8 = 1152921504606846975L;
        boolean z9 = v(atomicLongFieldUpdater.get(this), false) ? false : !j(r1 & 1152921504606846975L);
        k kVar = l.f2880b;
        if (z9) {
            return kVar;
        }
        Object obj2 = g.f2866j;
        m mVar = (m) f2850k.get(this);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j9 = andIncrement & j8;
            boolean v5 = v(andIncrement, z8);
            int i7 = g.f2858b;
            long j10 = i7;
            long j11 = j9 / j10;
            int i8 = (int) (j9 % j10);
            if (mVar.f4704c != j11) {
                m b9 = b(this, j11, mVar);
                if (b9 != null) {
                    mVar = b9;
                } else {
                    if (v5) {
                        return new j(s());
                    }
                    z8 = false;
                    j8 = 1152921504606846975L;
                }
            }
            int i9 = i(this, mVar, i8, obj, j9, obj2, v5);
            z zVar = z.f2639a;
            if (i9 == 0) {
                mVar.a();
                return zVar;
            }
            if (i9 == 1) {
                return zVar;
            }
            if (i9 == 2) {
                if (v5) {
                    mVar.h();
                    return new j(s());
                }
                w1 w1Var = obj2 instanceof w1 ? (w1) obj2 : null;
                if (w1Var != null) {
                    w1Var.a(mVar, i8 + i7);
                }
                mVar.h();
                return kVar;
            }
            if (i9 == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (i9 == 4) {
                if (j9 < f2847h.get(this)) {
                    mVar.a();
                }
                return new j(s());
            }
            if (i9 == 5) {
                mVar.a();
            }
            z8 = false;
            j8 = 1152921504606846975L;
        }
    }

    @Override // e7.t
    public final Object f(g7.p pVar) {
        return B(this, pVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0177, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x00c2, code lost:
    
        g(r1, r4, r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0163 A[RETURN] */
    @Override // e7.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object h(h6.d dVar, Object obj) {
        Object q8;
        Object obj2;
        e eVar;
        m mVar;
        int i7;
        e eVar2 = this;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2850k;
        m mVar2 = (m) atomicReferenceFieldUpdater.get(eVar2);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f2846g;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(eVar2);
            long j8 = andIncrement & 1152921504606846975L;
            boolean v5 = eVar2.v(andIncrement, false);
            int i8 = g.f2858b;
            long j9 = i8;
            long j10 = j8 / j9;
            int i9 = (int) (j8 % j9);
            long j11 = mVar2.f4704c;
            i6.a aVar = i6.a.f4956f;
            z zVar = z.f2639a;
            if (j11 != j10) {
                m b9 = b(eVar2, j10, mVar2);
                if (b9 != null) {
                    mVar2 = b9;
                } else if (v5) {
                    Object A = A(dVar, obj);
                    if (A == aVar) {
                        return A;
                    }
                }
            }
            int i10 = i(eVar2, mVar2, i9, obj, j8, null, v5);
            if (i10 == 0) {
                mVar2.a();
                return zVar;
            }
            if (i10 == 1) {
                break;
            }
            if (i10 != 2) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = f2847h;
                if (i10 == 3) {
                    c7.h k8 = a0.k(a8.m.A(dVar));
                    Object obj3 = obj;
                    try {
                        int i11 = i(eVar2, mVar2, i9, obj3, j8, k8, false);
                        try {
                            if (i11 != 0) {
                                if (i11 == 1) {
                                    k8.resumeWith(zVar);
                                } else if (i11 != 2) {
                                    if (i11 != 4) {
                                        String str = "unexpected";
                                        if (i11 != 5) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        mVar2.a();
                                        m mVar3 = (m) atomicReferenceFieldUpdater.get(eVar2);
                                        while (true) {
                                            long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(eVar2);
                                            long j12 = andIncrement2 & 1152921504606846975L;
                                            boolean v8 = eVar2.v(andIncrement2, false);
                                            int i12 = g.f2858b;
                                            long j13 = i12;
                                            String str2 = str;
                                            long j14 = j12 / j13;
                                            int i13 = (int) (j12 % j13);
                                            if (mVar3.f4704c != j14) {
                                                m b10 = b(eVar2, j14, mVar3);
                                                if (b10 != null) {
                                                    i7 = i12;
                                                    mVar = b10;
                                                } else {
                                                    if (v8) {
                                                        break;
                                                    }
                                                    str = str2;
                                                }
                                            } else {
                                                mVar = mVar3;
                                                i7 = i12;
                                            }
                                            int i14 = i(eVar2, mVar, i13, obj3, j12, k8, v8);
                                            Object obj4 = obj3;
                                            eVar = eVar2;
                                            m mVar4 = mVar;
                                            obj2 = obj4;
                                            if (i14 == 0) {
                                                mVar4.a();
                                                break;
                                            }
                                            if (i14 == 1) {
                                                break;
                                            }
                                            if (i14 != 2) {
                                                if (i14 == 3) {
                                                    throw new IllegalStateException(str2);
                                                }
                                                if (i14 != 4) {
                                                    if (i14 == 5) {
                                                        mVar4.a();
                                                    }
                                                    mVar3 = mVar4;
                                                    eVar2 = eVar;
                                                    str = str2;
                                                    obj3 = obj2;
                                                } else if (j12 < atomicLongFieldUpdater2.get(eVar)) {
                                                    mVar4.a();
                                                }
                                            } else if (v8) {
                                                mVar4.h();
                                            } else {
                                                k8.a(mVar4, i13 + i7);
                                            }
                                        }
                                    } else {
                                        obj2 = obj3;
                                        eVar = eVar2;
                                        if (j8 < atomicLongFieldUpdater2.get(eVar)) {
                                            mVar2.a();
                                        }
                                    }
                                    g(eVar, obj2, k8);
                                } else {
                                    k8.a(mVar2, i9 + i8);
                                }
                                q8 = k8.q();
                                if (q8 != aVar) {
                                    q8 = zVar;
                                }
                                if (q8 != aVar) {
                                    return q8;
                                }
                            } else {
                                mVar2.a();
                            }
                            k8.resumeWith(zVar);
                            q8 = k8.q();
                            if (q8 != aVar) {
                            }
                            if (q8 != aVar) {
                            }
                        } catch (Throwable th) {
                            th = th;
                            k8.z();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else if (i10 == 4) {
                    if (j8 < atomicLongFieldUpdater2.get(eVar2)) {
                        mVar2.a();
                    }
                    Object A2 = A(dVar, obj);
                    if (A2 == aVar) {
                        return A2;
                    }
                } else if (i10 == 5) {
                    mVar2.a();
                }
            } else if (v5) {
                mVar2.h();
                Object A3 = A(dVar, obj);
                if (A3 == aVar) {
                    return A3;
                }
            }
        }
    }

    @Override // e7.t
    public final b iterator() {
        return new b(this);
    }

    public final boolean j(long j8) {
        return j8 < f2848i.get(this) || j8 < f2847h.get(this) + ((long) this.f2855f);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003c A[LOOP:2: B:17:0x003c->B:39:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e A[LOOP:3: B:22:0x006e->B:30:?, LOOP_LABEL: LOOP:3: B:22:0x006e->B:30:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004c A[LOOP:5: B:40:0x004c->B:48:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x002f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean k(Throwable th, boolean z8) {
        e eVar;
        h7.s sVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        boolean z9;
        long j8;
        long j9;
        long j10;
        Object obj;
        long j11;
        long j12;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f2846g;
        if (z8) {
            do {
                j12 = atomicLongFieldUpdater.get(this);
                if (((int) (j12 >> 60)) == 0) {
                    m mVar = g.f2857a;
                    eVar = this;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(eVar, j12, (j12 & 1152921504606846975L) + (1 << 60)));
            sVar = g.f2875s;
            while (true) {
                atomicReferenceFieldUpdater = f2853n;
                if (!atomicReferenceFieldUpdater.compareAndSet(this, sVar, th)) {
                    z9 = true;
                    break;
                }
                if (atomicReferenceFieldUpdater.get(this) != sVar) {
                    z9 = false;
                    break;
                }
            }
            if (z8) {
                do {
                    j8 = atomicLongFieldUpdater.get(this);
                    int i7 = (int) (j8 >> 60);
                    if (i7 == 0) {
                        j9 = j8 & 1152921504606846975L;
                        j10 = 2;
                    } else {
                        if (i7 != 1) {
                            break;
                        }
                        j9 = j8 & 1152921504606846975L;
                        j10 = 3;
                    }
                } while (!atomicLongFieldUpdater.compareAndSet(eVar, j8, (j10 << 60) + j9));
            } else {
                do {
                    j11 = atomicLongFieldUpdater.get(this);
                } while (!atomicLongFieldUpdater.compareAndSet(eVar, j11, (3 << 60) + (j11 & 1152921504606846975L)));
            }
            m();
            if (z9) {
                loop3: while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f2854o;
                    obj = atomicReferenceFieldUpdater2.get(this);
                    h7.s sVar2 = obj == null ? g.f2873q : g.f2874r;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, sVar2)) {
                        if (atomicReferenceFieldUpdater2.get(this) != obj) {
                            break;
                        }
                    }
                }
                if (obj != null) {
                    y.d(1, obj);
                    ((q6.c) obj).f(q());
                    return z9;
                }
            }
            return z9;
        }
        eVar = this;
        sVar = g.f2875s;
        while (true) {
            atomicReferenceFieldUpdater = f2853n;
            if (!atomicReferenceFieldUpdater.compareAndSet(this, sVar, th)) {
            }
        }
        if (z8) {
        }
        m();
        if (z9) {
        }
        return z9;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x008d, code lost:
    
        r1 = (e7.m) ((h7.b) h7.b.f4672b.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final m l(long j8) {
        Object obj;
        long j9;
        Object obj2 = f2852m.get(this);
        m mVar = (m) f2850k.get(this);
        if (mVar.f4704c > ((m) obj2).f4704c) {
            obj2 = mVar;
        }
        m mVar2 = (m) f2851l.get(this);
        if (mVar2.f4704c > ((m) obj2).f4704c) {
            obj2 = mVar2;
        }
        h7.b bVar = (h7.b) obj2;
        loop0: while (true) {
            bVar.getClass();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h7.b.f4671a;
            Object obj3 = atomicReferenceFieldUpdater.get(bVar);
            h7.s sVar = h7.a.f4664a;
            obj = null;
            if (obj3 == sVar) {
                break;
            }
            h7.b bVar2 = (h7.b) obj3;
            if (bVar2 == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(bVar, null, sVar)) {
                    if (atomicReferenceFieldUpdater.get(bVar) != null) {
                        break;
                    }
                }
                break loop0;
            }
            bVar = bVar2;
        }
        m mVar3 = (m) bVar;
        if (x()) {
            m mVar4 = mVar3;
            loop2: do {
                int i7 = g.f2858b - 1;
                while (true) {
                    if (-1 >= i7) {
                        break;
                    }
                    j9 = (mVar4.f4704c * g.f2858b) + i7;
                    if (j9 < f2847h.get(this)) {
                        break loop2;
                    }
                    while (true) {
                        Object k8 = mVar4.k(i7);
                        if (k8 != null && k8 != g.f2861e) {
                            if (k8 == g.f2860d) {
                                break loop2;
                            }
                        } else {
                            if (mVar4.j(k8, i7, g.f2868l)) {
                                mVar4.h();
                                break;
                            }
                        }
                    }
                    i7--;
                }
            } while (mVar4 != null);
            j9 = -1;
            if (j9 != -1) {
                n(j9);
            }
        }
        loop5: for (m mVar5 = mVar3; mVar5 != null; mVar5 = (m) ((h7.b) h7.b.f4672b.get(mVar5))) {
            for (int i8 = g.f2858b - 1; -1 < i8; i8--) {
                if ((mVar5.f4704c * g.f2858b) + i8 < j8) {
                    break loop5;
                }
                while (true) {
                    Object k9 = mVar5.k(i8);
                    if (k9 != null && k9 != g.f2861e) {
                        if (!(k9 instanceof v)) {
                            if (!(k9 instanceof w1)) {
                                break;
                            }
                            if (mVar5.j(k9, i8, g.f2868l)) {
                                obj = h7.a.f(obj, k9);
                                mVar5.l(i8, true);
                                break;
                            }
                        } else {
                            if (mVar5.j(k9, i8, g.f2868l)) {
                                obj = h7.a.f(obj, ((v) k9).f2888a);
                                mVar5.l(i8, true);
                                break;
                            }
                        }
                    } else {
                        if (mVar5.j(k9, i8, g.f2868l)) {
                            mVar5.h();
                            break;
                        }
                    }
                }
            }
        }
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                D((w1) obj, true);
                return mVar3;
            }
            ArrayList arrayList = (ArrayList) obj;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                D((w1) arrayList.get(size), true);
            }
        }
        return mVar3;
    }

    public final void m() {
        v(f2846g.get(this), false);
    }

    public final void n(long j8) {
        m mVar = (m) f2851l.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f2847h;
            long j9 = atomicLongFieldUpdater.get(this);
            if (j8 < Math.max(this.f2855f + j9, f2848i.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j9, 1 + j9)) {
                long j10 = g.f2858b;
                long j11 = j9 / j10;
                int i7 = (int) (j9 % j10);
                if (mVar.f4704c != j11) {
                    m p6 = p(j11, mVar);
                    if (p6 != null) {
                        mVar = p6;
                    }
                }
                m mVar2 = mVar;
                if (G(mVar2, i7, j9, null) != g.f2871o) {
                    mVar2.a();
                } else if (j9 < t()) {
                    mVar2.a();
                }
                mVar = mVar2;
            }
        }
    }

    public final void o() {
        Object b9;
        if (y()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2852m;
        m mVar = (m) atomicReferenceFieldUpdater.get(this);
        loop0: while (true) {
            long andIncrement = f2848i.getAndIncrement(this);
            long j8 = andIncrement / g.f2858b;
            if (t() <= andIncrement) {
                if (mVar.f4704c < j8 && mVar.b() != null) {
                    z(j8, mVar);
                }
                u(this);
                return;
            }
            if (mVar.f4704c != j8) {
                f fVar = f.f2856n;
                while (true) {
                    b9 = h7.a.b(mVar, j8, fVar);
                    if (!h7.a.e(b9)) {
                        h7.q c4 = h7.a.c(b9);
                        while (true) {
                            h7.q qVar = (h7.q) atomicReferenceFieldUpdater.get(this);
                            if (qVar.f4704c >= c4.f4704c) {
                                break;
                            }
                            if (!c4.i()) {
                                break;
                            }
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, qVar, c4)) {
                                if (atomicReferenceFieldUpdater.get(this) != qVar) {
                                    if (c4.e()) {
                                        c4.d();
                                    }
                                }
                            }
                            if (qVar.e()) {
                                qVar.d();
                            }
                        }
                    } else {
                        break;
                    }
                }
                m mVar2 = null;
                if (h7.a.e(b9)) {
                    m();
                    z(j8, mVar);
                    u(this);
                } else {
                    m mVar3 = (m) h7.a.c(b9);
                    long j9 = mVar3.f4704c;
                    if (j9 > j8) {
                        long j10 = j9 * g.f2858b;
                        if (f2848i.compareAndSet(this, 1 + andIncrement, j10)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = f2849j;
                            if ((atomicLongFieldUpdater.addAndGet(this, j10 - andIncrement) & 4611686018427387904L) != 0) {
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
            int i7 = (int) (andIncrement % g.f2858b);
            Object k8 = mVar.k(i7);
            boolean z8 = k8 instanceof w1;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f2847h;
            if (!z8 || andIncrement < atomicLongFieldUpdater2.get(this) || !mVar.j(k8, i7, g.f2863g)) {
                while (true) {
                    Object k9 = mVar.k(i7);
                    if (!(k9 instanceof w1)) {
                        if (k9 != g.f2866j) {
                            if (k9 != null) {
                                if (k9 == g.f2860d || k9 == g.f2864h || k9 == g.f2865i || k9 == g.f2867k || k9 == g.f2868l) {
                                    break loop0;
                                }
                                if (k9 != g.f2862f) {
                                    throw new IllegalStateException(("Unexpected cell state: " + k9).toString());
                                }
                            } else if (mVar.j(k9, i7, g.f2861e)) {
                                break loop0;
                            }
                        } else {
                            break;
                        }
                    } else if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                        if (mVar.j(k9, i7, new v((w1) k9))) {
                            break loop0;
                        }
                    } else if (mVar.j(k9, i7, g.f2863g)) {
                        if (F(k9)) {
                            mVar.n(i7, g.f2860d);
                            break;
                        } else {
                            mVar.n(i7, g.f2866j);
                            mVar.h();
                        }
                    }
                }
            } else if (F(k8)) {
                mVar.n(i7, g.f2860d);
                break;
            } else {
                mVar.n(i7, g.f2866j);
                mVar.h();
                u(this);
            }
        }
        u(this);
    }

    public final m p(long j8, m mVar) {
        Object b9;
        long j9;
        m mVar2 = g.f2857a;
        f fVar = f.f2856n;
        loop0: while (true) {
            b9 = h7.a.b(mVar, j8, fVar);
            if (!h7.a.e(b9)) {
                h7.q c4 = h7.a.c(b9);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2851l;
                    h7.q qVar = (h7.q) atomicReferenceFieldUpdater.get(this);
                    if (qVar.f4704c >= c4.f4704c) {
                        break loop0;
                    }
                    if (!c4.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, qVar, c4)) {
                        if (atomicReferenceFieldUpdater.get(this) != qVar) {
                            if (c4.e()) {
                                c4.d();
                            }
                        }
                    }
                    if (qVar.e()) {
                        qVar.d();
                    }
                }
            } else {
                break;
            }
        }
        if (h7.a.e(b9)) {
            m();
            if (mVar.f4704c * g.f2858b < t()) {
                mVar.a();
                return null;
            }
        } else {
            m mVar3 = (m) h7.a.c(b9);
            long j10 = mVar3.f4704c;
            if (!y() && j8 <= f2848i.get(this) / g.f2858b) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f2852m;
                    h7.q qVar2 = (h7.q) atomicReferenceFieldUpdater2.get(this);
                    if (qVar2.f4704c >= j10 || !mVar3.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, qVar2, mVar3)) {
                        if (atomicReferenceFieldUpdater2.get(this) != qVar2) {
                            if (mVar3.e()) {
                                mVar3.d();
                            }
                        }
                    }
                    if (qVar2.e()) {
                        qVar2.d();
                    }
                }
            }
            if (j10 <= j8) {
                return mVar3;
            }
            long j11 = j10 * g.f2858b;
            do {
                j9 = f2847h.get(this);
                if (j9 >= j11) {
                    break;
                }
            } while (!f2847h.compareAndSet(this, j9, j11));
            if (j10 * g.f2858b < t()) {
                mVar3.a();
            }
        }
        return null;
    }

    public final Throwable q() {
        return (Throwable) f2853n.get(this);
    }

    public final Throwable r() {
        Throwable q8 = q();
        return q8 == null ? new n("Channel was closed") : q8;
    }

    public final Throwable s() {
        Throwable q8 = q();
        return q8 == null ? new o("Channel was closed") : q8;
    }

    public final long t() {
        return f2846g.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:92:0x019d, code lost:
    
        r16 = r7;
        r3 = (e7.m) r3.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01a6, code lost:
    
        if (r3 != null) goto L82;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        boolean z8;
        String str;
        StringBuilder sb = new StringBuilder();
        int i7 = (int) (f2846g.get(this) >> 60);
        if (i7 == 2) {
            sb.append("closed,");
        } else if (i7 == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.f2855f + ',');
        sb.append("data=[");
        int i8 = 0;
        boolean z9 = true;
        List X = e6.m.X(f2851l.get(this), f2850k.get(this), f2852m.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj : X) {
            if (((m) obj) != g.f2857a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j8 = ((m) next).f4704c;
            do {
                Object next2 = it.next();
                long j9 = ((m) next2).f4704c;
                if (j8 > j9) {
                    next = next2;
                    j8 = j9;
                }
            } while (it.hasNext());
        }
        m mVar = (m) next;
        long j10 = f2847h.get(this);
        long t2 = t();
        loop2: while (true) {
            int i9 = g.f2858b;
            int i10 = i8;
            while (true) {
                if (i10 >= i9) {
                    break;
                }
                long j11 = (mVar.f4704c * g.f2858b) + i10;
                if (j11 >= t2 && j11 >= j10) {
                    break loop2;
                }
                Object k8 = mVar.k(i10);
                boolean z10 = z9;
                Object obj2 = mVar.f2883f.get(i10 * 2);
                if (k8 instanceof c7.f) {
                    str = (j11 >= j10 || j11 < t2) ? (j11 >= t2 || j11 < j10) ? "cont" : "send" : "receive";
                } else if (k8 instanceof s) {
                    str = "receiveCatching";
                } else if (k8 instanceof v) {
                    str = "EB(" + k8 + ')';
                } else if (r6.k.a(k8, g.f2862f) || r6.k.a(k8, g.f2863g)) {
                    str = "resuming_sender";
                } else {
                    if (k8 != null && !k8.equals(g.f2861e) && !k8.equals(g.f2865i) && !k8.equals(g.f2864h) && !k8.equals(g.f2867k) && !k8.equals(g.f2866j) && !k8.equals(g.f2868l)) {
                        str = k8.toString();
                    }
                    i10++;
                    z9 = z10;
                }
                if (obj2 != null) {
                    sb.append("(" + str + ',' + obj2 + "),");
                } else {
                    sb.append(str + ',');
                }
                i10++;
                z9 = z10;
            }
            z9 = z8;
            i8 = 0;
        }
        if (z6.h.H(sb) == ',') {
            r6.k.e(sb.deleteCharAt(sb.length() - 1), "deleteCharAt(...)");
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x00a2, code lost:
    
        r0 = (e7.m) ((h7.b) h7.b.f4672b.get(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean v(long j8, boolean z8) {
        int i7 = (int) (j8 >> 60);
        if (i7 != 0 && i7 != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f2847h;
            if (i7 == 2) {
                l(1152921504606846975L & j8);
                if (z8) {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2851l;
                        m mVar = (m) atomicReferenceFieldUpdater.get(this);
                        long j9 = atomicLongFieldUpdater.get(this);
                        if (t() <= j9) {
                            break;
                        }
                        long j10 = g.f2858b;
                        long j11 = j9 / j10;
                        if (mVar.f4704c != j11 && (mVar = p(j11, mVar)) == null) {
                            if (((m) atomicReferenceFieldUpdater.get(this)).f4704c < j11) {
                                break;
                            }
                        } else {
                            mVar.a();
                            int i8 = (int) (j9 % j10);
                            while (true) {
                                Object k8 = mVar.k(i8);
                                if (k8 == null || k8 == g.f2861e) {
                                    if (mVar.j(k8, i8, g.f2864h)) {
                                        o();
                                        break;
                                    }
                                } else {
                                    if (k8 == g.f2860d) {
                                        break;
                                    }
                                    if (k8 != g.f2866j) {
                                        if (k8 != g.f2868l) {
                                            if (k8 != g.f2865i) {
                                                if (k8 != g.f2864h) {
                                                    if (k8 == g.f2863g) {
                                                        break;
                                                    }
                                                    if (k8 != g.f2862f && j9 == atomicLongFieldUpdater.get(this)) {
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            f2847h.compareAndSet(this, j9, j9 + 1);
                        }
                    }
                }
            } else {
                if (i7 != 3) {
                    throw new IllegalStateException(a0.m.i("unexpected close status: ", i7).toString());
                }
                m l8 = l(1152921504606846975L & j8);
                Object obj = null;
                loop0: do {
                    int i9 = g.f2858b - 1;
                    while (true) {
                        if (-1 >= i9) {
                            break;
                        }
                        long j12 = (l8.f4704c * g.f2858b) + i9;
                        while (true) {
                            Object k9 = l8.k(i9);
                            if (k9 == g.f2865i) {
                                break loop0;
                            }
                            if (k9 == g.f2860d) {
                                if (j12 < atomicLongFieldUpdater.get(this)) {
                                    break loop0;
                                }
                                if (l8.j(k9, i9, g.f2868l)) {
                                    l8.m(i9, null);
                                    l8.h();
                                    break;
                                }
                            } else if (k9 != g.f2861e && k9 != null) {
                                if (!(k9 instanceof w1) && !(k9 instanceof v)) {
                                    h7.s sVar = g.f2863g;
                                    if (k9 == sVar || k9 == g.f2862f) {
                                        break loop0;
                                    }
                                    if (k9 != sVar) {
                                        break;
                                    }
                                } else {
                                    if (j12 < atomicLongFieldUpdater.get(this)) {
                                        break loop0;
                                    }
                                    w1 w1Var = k9 instanceof v ? ((v) k9).f2888a : (w1) k9;
                                    if (l8.j(k9, i9, g.f2868l)) {
                                        obj = h7.a.f(obj, w1Var);
                                        l8.m(i9, null);
                                        l8.h();
                                        break;
                                    }
                                }
                            } else if (l8.j(k9, i9, g.f2868l)) {
                                l8.h();
                                break;
                            }
                        }
                        i9--;
                    }
                } while (l8 != null);
                if (obj != null) {
                    if (obj instanceof ArrayList) {
                        ArrayList arrayList = (ArrayList) obj;
                        for (int size = arrayList.size() - 1; -1 < size; size--) {
                            D((w1) arrayList.get(size), false);
                        }
                    } else {
                        D((w1) obj, false);
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean w() {
        return v(f2846g.get(this), true);
    }

    public boolean x() {
        return false;
    }

    public final boolean y() {
        long j8 = f2848i.get(this);
        return j8 == 0 || j8 == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z(long j8, m mVar) {
        m mVar2;
        m mVar3;
        while (mVar.f4704c < j8 && (mVar3 = (m) mVar.b()) != null) {
            mVar = mVar3;
        }
        while (true) {
            if (!mVar.c() || (mVar2 = (m) mVar.b()) == null) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2852m;
                    h7.q qVar = (h7.q) atomicReferenceFieldUpdater.get(this);
                    if (qVar.f4704c >= mVar.f4704c) {
                        return;
                    }
                    if (!mVar.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, qVar, mVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != qVar) {
                            if (mVar.e()) {
                                mVar.d();
                            }
                        }
                    }
                    if (qVar.e()) {
                        qVar.d();
                        return;
                    }
                    return;
                }
            }
            mVar = mVar2;
        }
    }
}
