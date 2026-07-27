package Y2;

import A.AbstractC0017m;
import M2.J;
import W2.B;
import W2.C0;
import W2.C0286h;
import W2.InterfaceC0284f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.A;
import y2.AbstractC1341p;
import y2.AbstractC1343r;
import y2.C1331f;
import z2.C1441y;

/* loaded from: classes.dex */
public class e implements i {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f4408i = AtomicLongFieldUpdater.newUpdater(e.class, "sendersAndCloseStatus$volatile");

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f4409j = AtomicLongFieldUpdater.newUpdater(e.class, "receivers$volatile");

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f4410k = AtomicLongFieldUpdater.newUpdater(e.class, "bufferEnd$volatile");

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f4411l = AtomicLongFieldUpdater.newUpdater(e.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4412m = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "sendSegment$volatile");

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4413n = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "receiveSegment$volatile");

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4414o = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "bufferEndSegment$volatile");

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4415p = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "_closeCause$volatile");

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4416q = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "closeHandler$volatile");
    private volatile /* synthetic */ Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;

    /* renamed from: d, reason: collision with root package name */
    public final int f4417d;

    /* renamed from: e, reason: collision with root package name */
    public final Function1 f4418e;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    public e(int i2, Function1 function1) {
        this.f4417d = i2;
        this.f4418e = function1;
        if (i2 < 0) {
            throw new IllegalArgumentException(AbstractC0017m.h(i2, "Invalid channel capacity: ", ", should be >=0").toString());
        }
        m mVar = g.f4420a;
        this.bufferEnd$volatile = i2 != 0 ? i2 != Integer.MAX_VALUE ? i2 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = f4410k.get(this);
        m mVar2 = new m(0L, null, this, 3);
        this.sendSegment$volatile = mVar2;
        this.receiveSegment$volatile = mVar2;
        if (x()) {
            mVar2 = g.f4420a;
            Intrinsics.d(mVar2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = mVar2;
        this._closeCause$volatile = g.f4438s;
    }

    public static boolean C(Object obj) {
        if (obj instanceof InterfaceC0284f) {
            Intrinsics.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return g.a((InterfaceC0284f) obj, Unit.f7487a, null);
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    public static final m b(e eVar, long j4, m mVar) {
        Object d4;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j5;
        long j6;
        eVar.getClass();
        m mVar2 = g.f4420a;
        f fVar = f.f4419o;
        loop0: while (true) {
            d4 = b3.a.d(mVar, j4, fVar);
            if (!b3.a.g(d4)) {
                b3.r e4 = b3.a.e(d4);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4412m;
                    b3.r rVar = (b3.r) atomicReferenceFieldUpdater.get(eVar);
                    if (rVar.f5686c >= e4.f5686c) {
                        break loop0;
                    }
                    if (!e4.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(eVar, rVar, e4)) {
                        if (atomicReferenceFieldUpdater.get(eVar) != rVar) {
                            if (e4.e()) {
                                e4.d();
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
        boolean g4 = b3.a.g(d4);
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f4409j;
        if (g4) {
            eVar.i();
            if (mVar.f5686c * g.f4421b >= atomicLongFieldUpdater2.get(eVar)) {
                return null;
            }
            mVar.a();
            return null;
        }
        m mVar3 = (m) b3.a.e(d4);
        long j7 = mVar3.f5686c;
        if (j7 <= j4) {
            return mVar3;
        }
        long j8 = g.f4421b * j7;
        do {
            atomicLongFieldUpdater = f4408i;
            j5 = atomicLongFieldUpdater.get(eVar);
            j6 = 1152921504606846975L & j5;
            if (j6 >= j8) {
                break;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(eVar, j5, j6 + (((int) (j5 >> 60)) << 60)));
        if (j7 * g.f4421b >= atomicLongFieldUpdater2.get(eVar)) {
            return null;
        }
        mVar3.a();
        return null;
    }

    public static final void c(e eVar, Object obj, C0286h c0286h) {
        Function1 function1 = eVar.f4418e;
        if (function1 != null) {
            b3.a.a(function1, obj, c0286h.f4266k);
        }
        Throwable r2 = eVar.r();
        AbstractC1341p.a aVar = AbstractC1341p.f11673d;
        c0286h.u(AbstractC1343r.a(r2));
    }

    public static final int d(e eVar, m mVar, int i2, Object obj, long j4, Object obj2, boolean z4) {
        eVar.getClass();
        mVar.m(i2, obj);
        if (z4) {
            return eVar.E(mVar, i2, obj, j4, obj2, z4);
        }
        Object k4 = mVar.k(i2);
        if (k4 == null) {
            if (eVar.f(j4)) {
                if (mVar.j(null, i2, g.f4423d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (mVar.j(null, i2, obj2)) {
                    return 2;
                }
            }
        } else if (k4 instanceof C0) {
            mVar.m(i2, null);
            if (eVar.B(k4, obj)) {
                mVar.n(i2, g.f4428i);
                return 0;
            }
            b3.t tVar = g.f4430k;
            if (mVar.f4445f.getAndSet((i2 * 2) + 1, tVar) != tVar) {
                mVar.l(i2, true);
            }
            return 5;
        }
        return eVar.E(mVar, i2, obj, j4, obj2, z4);
    }

    public static void u(e eVar) {
        eVar.getClass();
        AtomicLongFieldUpdater atomicLongFieldUpdater = f4411l;
        if ((atomicLongFieldUpdater.addAndGet(eVar, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(eVar) & 4611686018427387904L) != 0) {
            }
        }
    }

    public final void A(C0 c02, boolean z4) {
        if (c02 instanceof InterfaceC0284f) {
            C2.a aVar = (C2.a) c02;
            AbstractC1341p.a aVar2 = AbstractC1341p.f11673d;
            aVar.u(AbstractC1343r.a(z4 ? q() : r()));
            return;
        }
        if (!(c02 instanceof c)) {
            throw new IllegalStateException(("Unexpected waiter: " + c02).toString());
        }
        c cVar = (c) c02;
        C0286h c0286h = cVar.f4406e;
        Intrinsics.c(c0286h);
        cVar.f4406e = null;
        cVar.f4405d = g.f4431l;
        Throwable p4 = cVar.f4407i.p();
        if (p4 == null) {
            AbstractC1341p.a aVar3 = AbstractC1341p.f11673d;
            c0286h.u(Boolean.FALSE);
        } else {
            AbstractC1341p.a aVar4 = AbstractC1341p.f11673d;
            c0286h.u(AbstractC1343r.a(p4));
        }
    }

    public final boolean B(Object obj, Object obj2) {
        if (!(obj instanceof c)) {
            if (obj instanceof InterfaceC0284f) {
                Intrinsics.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
                return g.a((InterfaceC0284f) obj, obj2, this.f4418e != null ? e() : null);
            }
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        }
        Intrinsics.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
        c cVar = (c) obj;
        C0286h c0286h = cVar.f4406e;
        Intrinsics.c(c0286h);
        cVar.f4406e = null;
        cVar.f4405d = obj2;
        Boolean bool = Boolean.TRUE;
        Function1 function1 = cVar.f4407i.f4418e;
        return g.a(c0286h, bool, function1 != null ? new b(function1, 0, obj2) : null);
    }

    public final Object D(m mVar, int i2, long j4, Object obj) {
        Object k4 = mVar.k(i2);
        AtomicReferenceArray atomicReferenceArray = mVar.f4445f;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f4408i;
        if (k4 == null) {
            if (j4 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return g.f4433n;
                }
                if (mVar.j(k4, i2, obj)) {
                    k();
                    return g.f4432m;
                }
            }
        } else if (k4 == g.f4423d && mVar.j(k4, i2, g.f4428i)) {
            k();
            Object obj2 = atomicReferenceArray.get(i2 * 2);
            mVar.m(i2, null);
            return obj2;
        }
        while (true) {
            Object k5 = mVar.k(i2);
            if (k5 == null || k5 == g.f4424e) {
                if (j4 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (mVar.j(k5, i2, g.f4427h)) {
                        k();
                        return g.f4434o;
                    }
                } else {
                    if (obj == null) {
                        return g.f4433n;
                    }
                    if (mVar.j(k5, i2, obj)) {
                        k();
                        return g.f4432m;
                    }
                }
            } else {
                if (k5 != g.f4423d) {
                    b3.t tVar = g.f4429j;
                    if (k5 != tVar && k5 != g.f4427h) {
                        if (k5 == g.f4431l) {
                            k();
                            return g.f4434o;
                        }
                        if (k5 != g.f4426g && mVar.j(k5, i2, g.f4425f)) {
                            boolean z4 = k5 instanceof t;
                            if (z4) {
                                k5 = ((t) k5).f4448a;
                            }
                            if (C(k5)) {
                                mVar.n(i2, g.f4428i);
                                k();
                                Object obj3 = atomicReferenceArray.get(i2 * 2);
                                mVar.m(i2, null);
                                return obj3;
                            }
                            mVar.n(i2, tVar);
                            mVar.h();
                            if (z4) {
                                k();
                            }
                            return g.f4434o;
                        }
                    }
                    return g.f4434o;
                }
                if (mVar.j(k5, i2, g.f4428i)) {
                    k();
                    Object obj4 = atomicReferenceArray.get(i2 * 2);
                    mVar.m(i2, null);
                    return obj4;
                }
            }
        }
    }

    public final int E(m mVar, int i2, Object obj, long j4, Object obj2, boolean z4) {
        while (true) {
            Object k4 = mVar.k(i2);
            if (k4 == null) {
                if (!f(j4) || z4) {
                    if (z4) {
                        if (mVar.j(null, i2, g.f4429j)) {
                            mVar.h();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (mVar.j(null, i2, obj2)) {
                            return 2;
                        }
                    }
                } else if (mVar.j(null, i2, g.f4423d)) {
                    return 1;
                }
            } else {
                if (k4 != g.f4424e) {
                    b3.t tVar = g.f4430k;
                    if (k4 == tVar) {
                        mVar.m(i2, null);
                        return 5;
                    }
                    if (k4 == g.f4427h) {
                        mVar.m(i2, null);
                        return 5;
                    }
                    if (k4 == g.f4431l) {
                        mVar.m(i2, null);
                        i();
                        return 4;
                    }
                    mVar.m(i2, null);
                    if (k4 instanceof t) {
                        k4 = ((t) k4).f4448a;
                    }
                    if (B(k4, obj)) {
                        mVar.n(i2, g.f4428i);
                        return 0;
                    }
                    if (mVar.f4445f.getAndSet((i2 * 2) + 1, tVar) == tVar) {
                        return 5;
                    }
                    mVar.l(i2, true);
                    return 5;
                }
                if (mVar.j(k4, i2, g.f4423d)) {
                    return 1;
                }
            }
        }
    }

    public final void F(long j4) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j5;
        long j6;
        if (x()) {
            return;
        }
        do {
            atomicLongFieldUpdater = f4410k;
        } while (atomicLongFieldUpdater.get(this) <= j4);
        int i2 = g.f4422c;
        int i4 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f4411l;
            if (i4 >= i2) {
                do {
                    j5 = atomicLongFieldUpdater2.get(this);
                } while (!atomicLongFieldUpdater2.compareAndSet(this, j5, 4611686018427387904L + (j5 & 4611686018427387903L)));
                while (true) {
                    long j7 = atomicLongFieldUpdater.get(this);
                    long j8 = atomicLongFieldUpdater2.get(this);
                    long j9 = j8 & 4611686018427387903L;
                    boolean z4 = (j8 & 4611686018427387904L) != 0;
                    if (j7 == j9 && j7 == atomicLongFieldUpdater.get(this)) {
                        break;
                    } else if (!z4) {
                        atomicLongFieldUpdater2.compareAndSet(this, j8, j9 + 4611686018427387904L);
                    }
                }
                do {
                    j6 = atomicLongFieldUpdater2.get(this);
                } while (!atomicLongFieldUpdater2.compareAndSet(this, j6, j6 & 4611686018427387903L));
                return;
            }
            long j10 = atomicLongFieldUpdater.get(this);
            if (j10 == (atomicLongFieldUpdater2.get(this) & 4611686018427387903L) && j10 == atomicLongFieldUpdater.get(this)) {
                return;
            } else {
                i4++;
            }
        }
    }

    @Override // Y2.r
    public final void a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        g(cancellationException, true);
    }

    public final d e() {
        return new d(3, 0, e.class, this, "onCancellationImplDoNotCall", "onCancellationImplDoNotCall(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V");
    }

    public final boolean f(long j4) {
        return j4 < f4410k.get(this) || j4 < f4409j.get(this) + ((long) this.f4417d);
    }

    public final boolean g(Throwable th, boolean z4) {
        boolean z5;
        long j4;
        long j5;
        long j6;
        Object obj;
        long j7;
        long j8;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f4408i;
        if (z4) {
            do {
                j8 = atomicLongFieldUpdater.get(this);
                if (((int) (j8 >> 60)) != 0) {
                    break;
                }
                m mVar = g.f4420a;
            } while (!atomicLongFieldUpdater.compareAndSet(this, j8, (1 << 60) + (j8 & 1152921504606846975L)));
        }
        b3.t tVar = g.f4438s;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4415p;
            if (atomicReferenceFieldUpdater.compareAndSet(this, tVar, th)) {
                z5 = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != tVar) {
                z5 = false;
                break;
            }
        }
        if (z4) {
            do {
                j7 = atomicLongFieldUpdater.get(this);
            } while (!atomicLongFieldUpdater.compareAndSet(this, j7, (3 << 60) + (j7 & 1152921504606846975L)));
        } else {
            do {
                j4 = atomicLongFieldUpdater.get(this);
                int i2 = (int) (j4 >> 60);
                if (i2 == 0) {
                    j5 = j4 & 1152921504606846975L;
                    j6 = 2;
                } else {
                    if (i2 != 1) {
                        break;
                    }
                    j5 = j4 & 1152921504606846975L;
                    j6 = 3;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(this, j4, (j6 << 60) + j5));
        }
        i();
        if (z5) {
            loop3: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f4416q;
                obj = atomicReferenceFieldUpdater2.get(this);
                b3.t tVar2 = obj == null ? g.f4436q : g.f4437r;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, tVar2)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj) {
                        break;
                    }
                }
            }
            if (obj != null) {
                J.d(1, obj);
                ((Function1) obj).invoke(p());
            }
        }
        return z5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x008f, code lost:
    
        r1 = (Y2.m) ((b3.b) b3.b.f5650b.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final m h(long j4) {
        Object obj;
        long j5;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj2 = f4414o.get(this);
        m mVar = (m) f4412m.get(this);
        if (mVar.f5686c > ((m) obj2).f5686c) {
            obj2 = mVar;
        }
        m mVar2 = (m) f4413n.get(this);
        if (mVar2.f5686c > ((m) obj2).f5686c) {
            obj2 = mVar2;
        }
        b3.b bVar = (b3.b) obj2;
        loop0: while (true) {
            bVar.getClass();
            Object obj3 = b3.b.f5649a.get(bVar);
            b3.t tVar = b3.a.f5646a;
            obj = null;
            if (obj3 == tVar) {
                break;
            }
            b3.b bVar2 = (b3.b) obj3;
            if (bVar2 == null) {
                do {
                    atomicReferenceFieldUpdater = b3.b.f5649a;
                    if (atomicReferenceFieldUpdater.compareAndSet(bVar, null, tVar)) {
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
                int i2 = g.f4421b - 1;
                while (true) {
                    if (-1 >= i2) {
                        break;
                    }
                    j5 = (mVar4.f5686c * g.f4421b) + i2;
                    if (j5 < f4409j.get(this)) {
                        break loop2;
                    }
                    while (true) {
                        Object k4 = mVar4.k(i2);
                        if (k4 != null && k4 != g.f4424e) {
                            if (k4 == g.f4423d) {
                                break loop2;
                            }
                        } else {
                            if (mVar4.j(k4, i2, g.f4431l)) {
                                mVar4.h();
                                break;
                            }
                        }
                    }
                    i2--;
                }
            } while (mVar4 != null);
            j5 = -1;
            if (j5 != -1) {
                j(j5);
            }
        }
        loop5: for (m mVar5 = mVar3; mVar5 != null; mVar5 = (m) ((b3.b) b3.b.f5650b.get(mVar5))) {
            for (int i4 = g.f4421b - 1; -1 < i4; i4--) {
                if ((mVar5.f5686c * g.f4421b) + i4 < j4) {
                    break loop5;
                }
                while (true) {
                    Object k5 = mVar5.k(i4);
                    if (k5 != null && k5 != g.f4424e) {
                        if (!(k5 instanceof t)) {
                            if (!(k5 instanceof C0)) {
                                break;
                            }
                            if (mVar5.j(k5, i4, g.f4431l)) {
                                obj = b3.a.h(obj, k5);
                                mVar5.l(i4, true);
                                break;
                            }
                        } else {
                            if (mVar5.j(k5, i4, g.f4431l)) {
                                obj = b3.a.h(obj, ((t) k5).f4448a);
                                mVar5.l(i4, true);
                                break;
                            }
                        }
                    } else {
                        if (mVar5.j(k5, i4, g.f4431l)) {
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
                    A((C0) arrayList.get(size), true);
                }
            } else {
                A((C0) obj, true);
            }
        }
        return mVar3;
    }

    public final void i() {
        v(f4408i.get(this), false);
    }

    @Override // Y2.r
    public final c iterator() {
        return new c(this);
    }

    public final void j(long j4) {
        I1.b b4;
        m mVar = (m) f4413n.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f4409j;
            long j5 = atomicLongFieldUpdater.get(this);
            if (j4 < Math.max(this.f4417d + j5, f4410k.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j5, j5 + 1)) {
                long j6 = g.f4421b;
                long j7 = j5 / j6;
                int i2 = (int) (j5 % j6);
                if (mVar.f5686c != j7) {
                    m n2 = n(j7, mVar);
                    if (n2 == null) {
                        continue;
                    } else {
                        mVar = n2;
                    }
                }
                Object D3 = D(mVar, i2, j5, null);
                if (D3 != g.f4434o) {
                    mVar.a();
                    Function1 function1 = this.f4418e;
                    if (function1 != null && (b4 = b3.a.b(function1, D3, null)) != null) {
                        throw b4;
                    }
                } else if (j5 < s()) {
                    mVar.a();
                }
            }
        }
    }

    public final void k() {
        Object d4;
        if (x()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4414o;
        m mVar = (m) atomicReferenceFieldUpdater.get(this);
        loop0: while (true) {
            long andIncrement = f4410k.getAndIncrement(this);
            long j4 = andIncrement / g.f4421b;
            if (s() <= andIncrement) {
                if (mVar.f5686c < j4 && mVar.b() != null) {
                    y(j4, mVar);
                }
                u(this);
                return;
            }
            if (mVar.f5686c != j4) {
                f fVar = f.f4419o;
                while (true) {
                    d4 = b3.a.d(mVar, j4, fVar);
                    if (!b3.a.g(d4)) {
                        b3.r e4 = b3.a.e(d4);
                        while (true) {
                            b3.r rVar = (b3.r) atomicReferenceFieldUpdater.get(this);
                            if (rVar.f5686c >= e4.f5686c) {
                                break;
                            }
                            if (!e4.i()) {
                                break;
                            }
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, rVar, e4)) {
                                if (atomicReferenceFieldUpdater.get(this) != rVar) {
                                    if (e4.e()) {
                                        e4.d();
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
                m mVar2 = null;
                if (b3.a.g(d4)) {
                    i();
                    y(j4, mVar);
                    u(this);
                } else {
                    m mVar3 = (m) b3.a.e(d4);
                    long j5 = mVar3.f5686c;
                    if (j5 > j4) {
                        long j6 = j5 * g.f4421b;
                        if (f4410k.compareAndSet(this, andIncrement + 1, j6)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = f4411l;
                            if ((atomicLongFieldUpdater.addAndGet(this, j6 - andIncrement) & 4611686018427387904L) != 0) {
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
            int i2 = (int) (andIncrement % g.f4421b);
            Object k4 = mVar.k(i2);
            boolean z4 = k4 instanceof C0;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f4409j;
            if (!z4 || andIncrement < atomicLongFieldUpdater2.get(this) || !mVar.j(k4, i2, g.f4426g)) {
                while (true) {
                    Object k5 = mVar.k(i2);
                    if (!(k5 instanceof C0)) {
                        if (k5 != g.f4429j) {
                            if (k5 != null) {
                                if (k5 == g.f4423d || k5 == g.f4427h || k5 == g.f4428i || k5 == g.f4430k || k5 == g.f4431l) {
                                    break loop0;
                                }
                                if (k5 != g.f4425f) {
                                    throw new IllegalStateException(("Unexpected cell state: " + k5).toString());
                                }
                            } else if (mVar.j(k5, i2, g.f4424e)) {
                                break loop0;
                            }
                        } else {
                            break;
                        }
                    } else if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                        if (mVar.j(k5, i2, new t((C0) k5))) {
                            break loop0;
                        }
                    } else if (mVar.j(k5, i2, g.f4426g)) {
                        if (C(k5)) {
                            mVar.n(i2, g.f4423d);
                            break;
                        } else {
                            mVar.n(i2, g.f4429j);
                            mVar.h();
                        }
                    }
                }
            } else if (C(k4)) {
                mVar.n(i2, g.f4423d);
                break;
            } else {
                mVar.n(i2, g.f4429j);
                mVar.h();
                u(this);
            }
        }
        u(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [W2.h] */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r19v0, types: [Y2.e, java.lang.Object] */
    @Override // Y2.r
    public final Object l(E2.j frame) {
        m mVar;
        ?? r15;
        Object D3;
        C0286h c0286h;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4413n;
        m mVar2 = (m) atomicReferenceFieldUpdater.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f4408i;
            if (v(atomicLongFieldUpdater.get(this), true)) {
                Throwable q2 = q();
                int i2 = b3.s.f5687a;
                throw q2;
            }
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f4409j;
            long andIncrement = atomicLongFieldUpdater2.getAndIncrement(this);
            long j4 = g.f4421b;
            long j5 = andIncrement / j4;
            int i4 = (int) (andIncrement % j4);
            if (mVar2.f5686c != j5) {
                m n2 = n(j5, mVar2);
                if (n2 == null) {
                    continue;
                } else {
                    mVar = n2;
                }
            } else {
                mVar = mVar2;
            }
            Object D4 = D(mVar, i4, andIncrement, null);
            b3.t tVar = g.f4432m;
            if (D4 == tVar) {
                throw new IllegalStateException("unexpected");
            }
            b3.t tVar2 = g.f4434o;
            if (D4 != tVar2) {
                if (D4 == g.f4433n) {
                    C0286h h4 = B.h(D2.f.b(frame));
                    try {
                        D3 = D(mVar, i4, andIncrement, h4);
                    } catch (Throwable th) {
                        th = th;
                        r15 = h4;
                    }
                    try {
                        if (D3 == tVar) {
                            c0286h = h4;
                            c0286h.a(mVar, i4);
                        } else {
                            c0286h = h4;
                            d dVar = null;
                            Function1 function1 = this.f4418e;
                            if (D3 == tVar2) {
                                if (andIncrement < s()) {
                                    mVar.a();
                                }
                                m mVar3 = (m) atomicReferenceFieldUpdater.get(this);
                                while (true) {
                                    if (v(atomicLongFieldUpdater.get(this), true)) {
                                        AbstractC1341p.a aVar = AbstractC1341p.f11673d;
                                        c0286h.u(AbstractC1343r.a(q()));
                                        break;
                                    }
                                    long andIncrement2 = atomicLongFieldUpdater2.getAndIncrement(this);
                                    long j6 = g.f4421b;
                                    long j7 = andIncrement2 / j6;
                                    int i5 = (int) (andIncrement2 % j6);
                                    if (mVar3.f5686c != j7) {
                                        m n4 = n(j7, mVar3);
                                        if (n4 != null) {
                                            mVar3 = n4;
                                        }
                                    }
                                    Function1 function12 = function1;
                                    D3 = D(mVar3, i5, andIncrement2, c0286h);
                                    if (D3 == g.f4432m) {
                                        c0286h.a(mVar3, i5);
                                        break;
                                    }
                                    if (D3 == g.f4434o) {
                                        if (andIncrement2 < s()) {
                                            mVar3.a();
                                        }
                                        function1 = function12;
                                    } else {
                                        if (D3 == g.f4433n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        mVar3.a();
                                        if (function12 != null) {
                                            dVar = e();
                                        }
                                    }
                                }
                            } else {
                                mVar.a();
                                if (function1 != null) {
                                    dVar = e();
                                }
                            }
                            c0286h.n(D3, dVar);
                        }
                        D4 = c0286h.r();
                        if (D4 == D2.a.f2163d) {
                            Intrinsics.checkNotNullParameter(frame, "frame");
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        r15 = tVar;
                        r15.C();
                        throw th;
                    }
                } else {
                    mVar.a();
                }
                return D4;
            }
            if (andIncrement < s()) {
                mVar.a();
            }
            mVar2 = mVar;
        }
    }

    @Override // Y2.r
    public final Object m() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f4409j;
        long j4 = atomicLongFieldUpdater.get(this);
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f4408i;
        long j5 = atomicLongFieldUpdater2.get(this);
        if (v(j5, true)) {
            return new j(p());
        }
        long j6 = j5 & 1152921504606846975L;
        Object obj = l.f4443a;
        if (j4 >= j6) {
            return obj;
        }
        Object obj2 = g.f4430k;
        m mVar = (m) f4413n.get(this);
        while (!v(atomicLongFieldUpdater2.get(this), true)) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j7 = g.f4421b;
            long j8 = andIncrement / j7;
            int i2 = (int) (andIncrement % j7);
            if (mVar.f5686c != j8) {
                m n2 = n(j8, mVar);
                if (n2 == null) {
                    continue;
                } else {
                    mVar = n2;
                }
            }
            Object D3 = D(mVar, i2, andIncrement, obj2);
            if (D3 == g.f4432m) {
                C0 c02 = obj2 instanceof C0 ? (C0) obj2 : null;
                if (c02 != null) {
                    c02.a(mVar, i2);
                }
                F(andIncrement);
                mVar.h();
            } else if (D3 == g.f4434o) {
                if (andIncrement < s()) {
                    mVar.a();
                }
            } else {
                if (D3 == g.f4433n) {
                    throw new IllegalStateException("unexpected");
                }
                mVar.a();
                obj = D3;
            }
            return obj;
        }
        return new j(p());
    }

    public final m n(long j4, m mVar) {
        Object d4;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j5;
        m mVar2 = g.f4420a;
        f fVar = f.f4419o;
        loop0: while (true) {
            d4 = b3.a.d(mVar, j4, fVar);
            if (!b3.a.g(d4)) {
                b3.r e4 = b3.a.e(d4);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4413n;
                    b3.r rVar = (b3.r) atomicReferenceFieldUpdater.get(this);
                    if (rVar.f5686c >= e4.f5686c) {
                        break loop0;
                    }
                    if (!e4.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, rVar, e4)) {
                        if (atomicReferenceFieldUpdater.get(this) != rVar) {
                            if (e4.e()) {
                                e4.d();
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
        if (b3.a.g(d4)) {
            i();
            if (mVar.f5686c * g.f4421b >= s()) {
                return null;
            }
            mVar.a();
            return null;
        }
        m mVar3 = (m) b3.a.e(d4);
        boolean x2 = x();
        long j6 = mVar3.f5686c;
        if (!x2 && j4 <= f4410k.get(this) / g.f4421b) {
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f4414o;
                b3.r rVar2 = (b3.r) atomicReferenceFieldUpdater2.get(this);
                if (rVar2.f5686c >= j6 || !mVar3.i()) {
                    break;
                }
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, rVar2, mVar3)) {
                    if (atomicReferenceFieldUpdater2.get(this) != rVar2) {
                        if (mVar3.e()) {
                            mVar3.d();
                        }
                    }
                }
                if (rVar2.e()) {
                    rVar2.d();
                }
            }
        }
        if (j6 <= j4) {
            return mVar3;
        }
        long j7 = g.f4421b * j6;
        do {
            atomicLongFieldUpdater = f4409j;
            j5 = atomicLongFieldUpdater.get(this);
            if (j5 >= j7) {
                break;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j5, j7));
        if (j6 * g.f4421b >= s()) {
            return null;
        }
        mVar3.a();
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:?, code lost:
    
        return kotlin.Unit.f7487a;
     */
    @Override // Y2.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object o(Object obj) {
        m mVar;
        m mVar2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f4408i;
        boolean z4 = v(atomicLongFieldUpdater.get(this), false) ? false : !f(r0 & 1152921504606846975L);
        k kVar = l.f4443a;
        if (!z4) {
            k1.l lVar = g.f4429j;
            m mVar3 = (m) f4412m.get(this);
            while (true) {
                long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
                long j4 = andIncrement & 1152921504606846975L;
                boolean v4 = v(andIncrement, false);
                int i2 = g.f4421b;
                long j5 = i2;
                long j6 = j4 / j5;
                int i4 = (int) (j4 % j5);
                if (mVar3.f5686c != j6) {
                    m b4 = b(this, j6, mVar3);
                    if (b4 != null) {
                        mVar = b4;
                    } else if (v4) {
                        return new j(r());
                    }
                } else {
                    mVar = mVar3;
                }
                m mVar4 = mVar;
                int d4 = d(this, mVar, i4, obj, j4, lVar, v4);
                if (d4 == 0) {
                    mVar4.a();
                    break;
                }
                if (d4 == 1) {
                    break;
                }
                if (d4 == 2) {
                    if (v4) {
                        mVar4.h();
                        return new j(r());
                    }
                    C0 c02 = lVar instanceof C0 ? (C0) lVar : null;
                    if (c02 != null) {
                        mVar2 = mVar4;
                        c02.a(mVar2, i4 + i2);
                    } else {
                        mVar2 = mVar4;
                    }
                    mVar2.h();
                    return kVar;
                }
                if (d4 == 3) {
                    throw new IllegalStateException("unexpected");
                }
                if (d4 == 4) {
                    if (j4 < f4409j.get(this)) {
                        mVar4.a();
                    }
                    return new j(r());
                }
                if (d4 == 5) {
                    mVar4.a();
                }
                mVar3 = mVar4;
            }
        } else {
            return kVar;
        }
    }

    public final Throwable p() {
        return (Throwable) f4415p.get(this);
    }

    public final Throwable q() {
        Throwable p4 = p();
        return p4 == null ? new n("Channel was closed") : p4;
    }

    public final Throwable r() {
        Throwable p4 = p();
        return p4 == null ? new U1.a("Channel was closed") : p4;
    }

    public final long s() {
        return f4408i.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x01da, code lost:
    
        return kotlin.Unit.f7487a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e6, code lost:
    
        r5 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00e8, code lost:
    
        c(r25, r27, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00eb, code lost:
    
        r1 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00ee, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00ef, code lost:
    
        r1 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01bd, code lost:
    
        r1.C();
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01c0, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0136, code lost:
    
        if (r22 >= r5.get(r25)) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0138, code lost:
    
        r20.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x013b, code lost:
    
        r1 = r17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    @Override // Y2.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object t(C2.a frame, Object obj) {
        m mVar;
        C0286h c0286h;
        C0286h c0286h2;
        Unit unit;
        Object r2;
        D2.a aVar;
        C0286h c0286h3;
        m mVar2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4412m;
        m mVar3 = (m) atomicReferenceFieldUpdater.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f4408i;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j4 = andIncrement & 1152921504606846975L;
            boolean v4 = v(andIncrement, false);
            int i2 = g.f4421b;
            long j5 = i2;
            long j6 = j4 / j5;
            int i4 = (int) (j4 % j5);
            if (mVar3.f5686c != j6) {
                m b4 = b(this, j6, mVar3);
                if (b4 != null) {
                    mVar = b4;
                } else if (v4) {
                    Object z4 = z(frame, obj);
                    if (z4 == D2.a.f2163d) {
                        return z4;
                    }
                }
            } else {
                mVar = mVar3;
            }
            m mVar4 = mVar;
            int d4 = d(this, mVar, i4, obj, j4, null, v4);
            if (d4 == 0) {
                mVar4.a();
                break;
            }
            if (d4 == 1) {
                break;
            }
            if (d4 != 2) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = f4409j;
                if (d4 == 3) {
                    C0286h h4 = B.h(D2.f.b(frame));
                    try {
                        int d5 = d(this, mVar4, i4, obj, j4, h4, false);
                        try {
                            if (d5 == 0) {
                                c0286h2 = h4;
                                mVar4.a();
                                AbstractC1341p.a aVar2 = AbstractC1341p.f11673d;
                                unit = Unit.f7487a;
                            } else if (d5 != 1) {
                                if (d5 != 2) {
                                    if (d5 == 4) {
                                        c0286h2 = h4;
                                        if (j4 < atomicLongFieldUpdater2.get(this)) {
                                            mVar4.a();
                                        }
                                    } else {
                                        if (d5 != 5) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        mVar4.a();
                                        m mVar5 = (m) atomicReferenceFieldUpdater.get(this);
                                        while (true) {
                                            long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(this);
                                            long j7 = andIncrement2 & 1152921504606846975L;
                                            boolean v5 = v(andIncrement2, false);
                                            int i5 = g.f4421b;
                                            long j8 = i5;
                                            long j9 = j7 / j8;
                                            int i6 = (int) (j7 % j8);
                                            if (mVar5.f5686c != j9) {
                                                try {
                                                    m b5 = b(this, j9, mVar5);
                                                    if (b5 != null) {
                                                        c0286h3 = h4;
                                                        mVar2 = b5;
                                                    } else if (v5) {
                                                        break;
                                                    }
                                                } catch (Throwable th) {
                                                    th = th;
                                                    C0286h c0286h4 = h4;
                                                }
                                            } else {
                                                c0286h3 = h4;
                                                mVar2 = mVar5;
                                            }
                                            h4 = c0286h3;
                                            m mVar6 = mVar2;
                                            int d6 = d(this, mVar2, i6, obj, j7, h4, v5);
                                            if (d6 == 0) {
                                                c0286h2 = h4;
                                                mVar6.a();
                                                AbstractC1341p.a aVar3 = AbstractC1341p.f11673d;
                                                unit = Unit.f7487a;
                                                break;
                                            }
                                            if (d6 == 1) {
                                                c0286h2 = h4;
                                                AbstractC1341p.a aVar4 = AbstractC1341p.f11673d;
                                                unit = Unit.f7487a;
                                                break;
                                            }
                                            if (d6 == 2) {
                                                c0286h2 = h4;
                                                if (v5) {
                                                    mVar6.h();
                                                } else {
                                                    c0286h2.a(mVar6, i6 + i5);
                                                }
                                            } else {
                                                if (d6 == 3) {
                                                    throw new IllegalStateException("unexpected");
                                                }
                                                if (d6 == 4) {
                                                    break;
                                                }
                                                if (d6 == 5) {
                                                    mVar6.a();
                                                }
                                                mVar5 = mVar6;
                                            }
                                        }
                                    }
                                    c(this, obj, c0286h2);
                                } else {
                                    c0286h2 = h4;
                                    c0286h2.a(mVar4, i4 + i2);
                                }
                                r2 = c0286h2.r();
                                aVar = D2.a.f2163d;
                                if (r2 == aVar) {
                                    Intrinsics.checkNotNullParameter(frame, "frame");
                                }
                                if (r2 != aVar) {
                                    r2 = Unit.f7487a;
                                }
                                if (r2 == aVar) {
                                    return r2;
                                }
                            } else {
                                c0286h2 = h4;
                                AbstractC1341p.a aVar5 = AbstractC1341p.f11673d;
                                unit = Unit.f7487a;
                            }
                            c0286h2.u(unit);
                            r2 = c0286h2.r();
                            aVar = D2.a.f2163d;
                            if (r2 == aVar) {
                            }
                            if (r2 != aVar) {
                            }
                            if (r2 == aVar) {
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            c0286h = d5;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        c0286h = h4;
                    }
                } else if (d4 != 4) {
                    if (d4 == 5) {
                        mVar4.a();
                    }
                    mVar3 = mVar4;
                } else {
                    if (j4 < atomicLongFieldUpdater2.get(this)) {
                        mVar4.a();
                    }
                    Object z5 = z(frame, obj);
                    if (z5 == D2.a.f2163d) {
                        return z5;
                    }
                }
            } else if (v4) {
                mVar4.h();
                Object z6 = z(frame, obj);
                if (z6 == D2.a.f2163d) {
                    return z6;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x018c, code lost:
    
        r3 = (Y2.m) r3.b();
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
        int i2 = (int) (f4408i.get(this) >> 60);
        if (i2 == 2) {
            sb.append("closed,");
        } else if (i2 == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.f4417d + ',');
        sb.append("data=[");
        int i4 = 0;
        List e4 = C1441y.e(f4413n.get(this), f4412m.get(this), f4414o.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj : e4) {
            if (((m) obj) != g.f4420a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j4 = ((m) next).f5686c;
            do {
                Object next2 = it.next();
                long j5 = ((m) next2).f5686c;
                if (j4 > j5) {
                    next = next2;
                    j4 = j5;
                }
            } while (it.hasNext());
        }
        m mVar = (m) next;
        long j6 = f4409j.get(this);
        long s4 = s();
        loop2: while (true) {
            int i5 = g.f4421b;
            int i6 = i4;
            while (true) {
                if (i6 >= i5) {
                    break;
                }
                long j7 = (mVar.f5686c * g.f4421b) + i6;
                if (j7 >= s4 && j7 >= j6) {
                    break loop2;
                }
                Object k4 = mVar.k(i6);
                Object obj2 = mVar.f4445f.get(i6 * 2);
                if (k4 instanceof InterfaceC0284f) {
                    str = (j7 >= j6 || j7 < s4) ? (j7 >= s4 || j7 < j6) ? "cont" : "send" : "receive";
                } else if (k4 instanceof t) {
                    str = "EB(" + k4 + ')';
                } else if (Intrinsics.a(k4, g.f4425f) || Intrinsics.a(k4, g.f4426g)) {
                    str = "resuming_sender";
                } else {
                    if (k4 != null && !k4.equals(g.f4424e) && !k4.equals(g.f4428i) && !k4.equals(g.f4427h) && !k4.equals(g.f4430k) && !k4.equals(g.f4429j) && !k4.equals(g.f4431l)) {
                        str = k4.toString();
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
        if (A.O(sb) == ',') {
            Intrinsics.checkNotNullExpressionValue(sb.deleteCharAt(sb.length() - 1), "deleteCharAt(...)");
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x00c6, code lost:
    
        r0 = (Y2.m) ((b3.b) b3.b.f5650b.get(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean v(long j4, boolean z4) {
        int i2 = (int) (j4 >> 60);
        if (i2 == 0 || i2 == 1) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f4409j;
        if (i2 == 2) {
            h(j4 & 1152921504606846975L);
            if (z4) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4413n;
                    m mVar = (m) atomicReferenceFieldUpdater.get(this);
                    long j5 = atomicLongFieldUpdater.get(this);
                    if (s() <= j5) {
                        break;
                    }
                    long j6 = g.f4421b;
                    long j7 = j5 / j6;
                    if (mVar.f5686c != j7 && (mVar = n(j7, mVar)) == null) {
                        if (((m) atomicReferenceFieldUpdater.get(this)).f5686c < j7) {
                            break;
                        }
                    } else {
                        mVar.a();
                        int i4 = (int) (j5 % j6);
                        while (true) {
                            Object k4 = mVar.k(i4);
                            if (k4 == null || k4 == g.f4424e) {
                                if (mVar.j(k4, i4, g.f4427h)) {
                                    k();
                                    break;
                                }
                            } else {
                                if (k4 == g.f4423d) {
                                    return false;
                                }
                                if (k4 != g.f4429j && k4 != g.f4431l && k4 != g.f4428i && k4 != g.f4427h) {
                                    if (k4 == g.f4426g) {
                                        return false;
                                    }
                                    if (k4 != g.f4425f && j5 == atomicLongFieldUpdater.get(this)) {
                                        return false;
                                    }
                                }
                            }
                        }
                        f4409j.compareAndSet(this, j5, j5 + 1);
                    }
                }
            }
        } else {
            if (i2 != 3) {
                throw new IllegalStateException(AbstractC0017m.g(i2, "unexpected close status: ").toString());
            }
            m h4 = h(j4 & 1152921504606846975L);
            I1.b bVar = null;
            Object obj = null;
            loop0: do {
                int i5 = g.f4421b - 1;
                while (true) {
                    if (-1 >= i5) {
                        break;
                    }
                    long j8 = (h4.f5686c * g.f4421b) + i5;
                    while (true) {
                        Object k5 = h4.k(i5);
                        if (k5 == g.f4428i) {
                            break loop0;
                        }
                        b3.t tVar = g.f4423d;
                        AtomicReferenceArray atomicReferenceArray = h4.f4445f;
                        Function1 function1 = this.f4418e;
                        if (k5 == tVar) {
                            if (j8 < atomicLongFieldUpdater.get(this)) {
                                break loop0;
                            }
                            if (h4.j(k5, i5, g.f4431l)) {
                                if (function1 != null) {
                                    bVar = b3.a.b(function1, atomicReferenceArray.get(i5 * 2), bVar);
                                }
                                h4.m(i5, null);
                                h4.h();
                            }
                        } else if (k5 == g.f4424e || k5 == null) {
                            if (h4.j(k5, i5, g.f4431l)) {
                                h4.h();
                                break;
                            }
                        } else if (!(k5 instanceof C0) && !(k5 instanceof t)) {
                            b3.t tVar2 = g.f4426g;
                            if (k5 == tVar2 || k5 == g.f4425f) {
                                break loop0;
                            }
                            if (k5 != tVar2) {
                                break;
                            }
                        } else {
                            if (j8 < atomicLongFieldUpdater.get(this)) {
                                break loop0;
                            }
                            C0 c02 = k5 instanceof t ? ((t) k5).f4448a : (C0) k5;
                            if (h4.j(k5, i5, g.f4431l)) {
                                if (function1 != null) {
                                    bVar = b3.a.b(function1, atomicReferenceArray.get(i5 * 2), bVar);
                                }
                                obj = b3.a.h(obj, c02);
                                h4.m(i5, null);
                                h4.h();
                            }
                        }
                    }
                    i5--;
                }
            } while (h4 != null);
            if (obj != null) {
                if (obj instanceof ArrayList) {
                    ArrayList arrayList = (ArrayList) obj;
                    for (int size = arrayList.size() - 1; -1 < size; size--) {
                        A((C0) arrayList.get(size), false);
                    }
                } else {
                    A((C0) obj, false);
                }
            }
            if (bVar != null) {
                throw bVar;
            }
        }
        return true;
    }

    public boolean w() {
        return false;
    }

    public final boolean x() {
        long j4 = f4410k.get(this);
        return j4 == 0 || j4 == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(long j4, m mVar) {
        m mVar2;
        m mVar3;
        while (mVar.f5686c < j4 && (mVar3 = (m) mVar.b()) != null) {
            mVar = mVar3;
        }
        while (true) {
            if (!mVar.c() || (mVar2 = (m) mVar.b()) == null) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4414o;
                    b3.r rVar = (b3.r) atomicReferenceFieldUpdater.get(this);
                    if (rVar.f5686c >= mVar.f5686c) {
                        return;
                    }
                    if (!mVar.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, rVar, mVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != rVar) {
                            if (mVar.e()) {
                                mVar.d();
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
            mVar = mVar2;
        }
    }

    public final Object z(C2.a frame, Object obj) {
        I1.b b4;
        C0286h c0286h = new C0286h(1, D2.f.b(frame));
        c0286h.s();
        Function1 function1 = this.f4418e;
        if (function1 == null || (b4 = b3.a.b(function1, obj, null)) == null) {
            Throwable r2 = r();
            AbstractC1341p.a aVar = AbstractC1341p.f11673d;
            c0286h.u(AbstractC1343r.a(r2));
        } else {
            C1331f.a(b4, r());
            AbstractC1341p.a aVar2 = AbstractC1341p.f11673d;
            c0286h.u(AbstractC1343r.a(b4));
        }
        Object r4 = c0286h.r();
        D2.a aVar3 = D2.a.f2163d;
        if (r4 == aVar3) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return r4 == aVar3 ? r4 : Unit.f7487a;
    }
}
