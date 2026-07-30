package p6;

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
import kotlin.jvm.internal.I;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import l0.C0654a;
import n6.AbstractC0792z;
import n6.C0775h;
import n6.InterfaceC0773f;
import n6.w0;
import s6.AbstractC0898a;

/* loaded from: classes.dex */
public class c implements g {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f7222e = AtomicLongFieldUpdater.newUpdater(c.class, "sendersAndCloseStatus$volatile");

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f7223i = AtomicLongFieldUpdater.newUpdater(c.class, "receivers$volatile");

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f7224l = AtomicLongFieldUpdater.newUpdater(c.class, "bufferEnd$volatile");

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f7225m = AtomicLongFieldUpdater.newUpdater(c.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7226n = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "sendSegment$volatile");

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7227o = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "receiveSegment$volatile");

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7228p = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "bufferEndSegment$volatile");

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7229q = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_closeCause$volatile");

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7230r = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "closeHandler$volatile");
    private volatile /* synthetic */ Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;

    /* renamed from: d, reason: collision with root package name */
    public final int f7231d;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    public c(int i2) {
        this.f7231d = i2;
        if (i2 < 0) {
            throw new IllegalArgumentException(C4.p.h(i2, "Invalid channel capacity: ", ", should be >=0").toString());
        }
        k kVar = e.f7233a;
        this.bufferEnd$volatile = i2 != 0 ? i2 != Integer.MAX_VALUE ? i2 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = f7224l.get(this);
        k kVar2 = new k(0L, null, this, 3);
        this.sendSegment$volatile = kVar2;
        this.receiveSegment$volatile = kVar2;
        if (v()) {
            kVar2 = e.f7233a;
            Intrinsics.c(kVar2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = kVar2;
        this._closeCause$volatile = e.f7250s;
    }

    public static boolean A(Object obj) {
        if (!(obj instanceof InterfaceC0773f)) {
            throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
        }
        Intrinsics.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
        InterfaceC0773f interfaceC0773f = (InterfaceC0773f) obj;
        Unit unit = Unit.f6114a;
        k kVar = e.f7233a;
        C0654a c7 = interfaceC0773f.c(unit, null);
        if (c7 == null) {
            return false;
        }
        interfaceC0773f.k(c7);
        return true;
    }

    public static final k a(c cVar, long j, k kVar) {
        Object b7;
        c cVar2;
        k kVar2 = e.f7233a;
        d dVar = d.f7232e;
        loop0: while (true) {
            b7 = AbstractC0898a.b(kVar, j, dVar);
            if (!AbstractC0898a.e(b7)) {
                s6.r c7 = AbstractC0898a.c(b7);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7226n;
                    s6.r rVar = (s6.r) atomicReferenceFieldUpdater.get(cVar);
                    if (rVar.f7854c >= c7.f7854c) {
                        break loop0;
                    }
                    if (!c7.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(cVar, rVar, c7)) {
                        if (atomicReferenceFieldUpdater.get(cVar) != rVar) {
                            if (c7.e()) {
                                c7.d();
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
        boolean e7 = AbstractC0898a.e(b7);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f7223i;
        if (e7) {
            cVar.t();
            if (kVar.f7854c * e.f7234b < atomicLongFieldUpdater.get(cVar)) {
                kVar.a();
                return null;
            }
        } else {
            k kVar3 = (k) AbstractC0898a.c(b7);
            long j7 = kVar3.f7854c;
            if (j7 <= j) {
                return kVar3;
            }
            long j8 = e.f7234b * j7;
            while (true) {
                long j9 = f7222e.get(cVar);
                long j10 = 1152921504606846975L & j9;
                if (j10 >= j8) {
                    cVar2 = cVar;
                    break;
                }
                cVar2 = cVar;
                if (f7222e.compareAndSet(cVar2, j9, (((int) (j9 >> 60)) << 60) + j10)) {
                    break;
                }
                cVar = cVar2;
            }
            if (j7 * e.f7234b < atomicLongFieldUpdater.get(cVar2)) {
                kVar3.a();
            }
        }
        return null;
    }

    public static final void c(c cVar, Object obj, C0775h c0775h) {
        Throwable p7 = cVar.p();
        R5.l lVar = R5.n.f2421d;
        c0775h.resumeWith(V6.b.n(p7));
    }

    public static final int e(c cVar, k kVar, int i2, Object obj, long j, Object obj2, boolean z7) {
        kVar.m(i2, obj);
        if (z7) {
            return cVar.C(kVar, i2, obj, j, obj2, z7);
        }
        Object k7 = kVar.k(i2);
        if (k7 == null) {
            if (cVar.g(j)) {
                if (kVar.j(null, i2, e.f7236d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (kVar.j(null, i2, obj2)) {
                    return 2;
                }
            }
        } else if (k7 instanceof w0) {
            kVar.m(i2, null);
            if (cVar.z(k7, obj)) {
                kVar.n(i2, e.f7241i);
                return 0;
            }
            C0654a c0654a = e.f7242k;
            if (kVar.f7257f.getAndSet((i2 * 2) + 1, c0654a) == c0654a) {
                return 5;
            }
            kVar.l(i2, true);
            return 5;
        }
        return cVar.C(kVar, i2, obj, j, obj2, z7);
    }

    public static void r(c cVar) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f7225m;
        if ((atomicLongFieldUpdater.addAndGet(cVar, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(cVar) & 4611686018427387904L) != 0) {
            }
        }
    }

    public final Object B(k kVar, int i2, long j, Object obj) {
        AtomicReferenceArray atomicReferenceArray = kVar.f7257f;
        Object k7 = kVar.k(i2);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f7222e;
        if (k7 == null) {
            if (j >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return e.f7245n;
                }
                if (kVar.j(k7, i2, obj)) {
                    l();
                    return e.f7244m;
                }
            }
        } else if (k7 == e.f7236d && kVar.j(k7, i2, e.f7241i)) {
            l();
            Object obj2 = atomicReferenceArray.get(i2 * 2);
            kVar.m(i2, null);
            return obj2;
        }
        while (true) {
            Object k8 = kVar.k(i2);
            if (k8 == null || k8 == e.f7237e) {
                if (j < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (kVar.j(k8, i2, e.f7240h)) {
                        l();
                        return e.f7246o;
                    }
                } else {
                    if (obj == null) {
                        return e.f7245n;
                    }
                    if (kVar.j(k8, i2, obj)) {
                        l();
                        return e.f7244m;
                    }
                }
            } else if (k8 != e.f7236d) {
                C0654a c0654a = e.j;
                if (k8 == c0654a) {
                    return e.f7246o;
                }
                if (k8 == e.f7240h) {
                    return e.f7246o;
                }
                if (k8 == e.f7243l) {
                    l();
                    return e.f7246o;
                }
                if (k8 != e.f7239g && kVar.j(k8, i2, e.f7238f)) {
                    boolean z7 = k8 instanceof t;
                    if (z7) {
                        k8 = ((t) k8).f7264a;
                    }
                    if (A(k8)) {
                        kVar.n(i2, e.f7241i);
                        l();
                        Object obj3 = atomicReferenceArray.get(i2 * 2);
                        kVar.m(i2, null);
                        return obj3;
                    }
                    kVar.n(i2, c0654a);
                    kVar.h();
                    if (z7) {
                        l();
                    }
                    return e.f7246o;
                }
            } else if (kVar.j(k8, i2, e.f7241i)) {
                l();
                Object obj4 = atomicReferenceArray.get(i2 * 2);
                kVar.m(i2, null);
                return obj4;
            }
        }
    }

    public final int C(k kVar, int i2, Object obj, long j, Object obj2, boolean z7) {
        while (true) {
            Object k7 = kVar.k(i2);
            if (k7 == null) {
                if (!g(j) || z7) {
                    if (z7) {
                        if (kVar.j(null, i2, e.j)) {
                            kVar.h();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (kVar.j(null, i2, obj2)) {
                            return 2;
                        }
                    }
                } else if (kVar.j(null, i2, e.f7236d)) {
                    break;
                }
            } else {
                if (k7 != e.f7237e) {
                    C0654a c0654a = e.f7242k;
                    if (k7 == c0654a) {
                        kVar.m(i2, null);
                        return 5;
                    }
                    if (k7 == e.f7240h) {
                        kVar.m(i2, null);
                        return 5;
                    }
                    if (k7 == e.f7243l) {
                        kVar.m(i2, null);
                        t();
                        return 4;
                    }
                    kVar.m(i2, null);
                    if (k7 instanceof t) {
                        k7 = ((t) k7).f7264a;
                    }
                    if (z(k7, obj)) {
                        kVar.n(i2, e.f7241i);
                        return 0;
                    }
                    if (kVar.f7257f.getAndSet((i2 * 2) + 1, c0654a) != c0654a) {
                        kVar.l(i2, true);
                    }
                    return 5;
                }
                if (kVar.j(k7, i2, e.f7236d)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final void D(long j) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        c cVar = this;
        if (cVar.v()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = f7224l;
            if (atomicLongFieldUpdater.get(cVar) > j) {
                break;
            } else {
                cVar = this;
            }
        }
        int i2 = e.f7235c;
        int i5 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f7225m;
            if (i5 < i2) {
                long j7 = atomicLongFieldUpdater.get(cVar);
                if (j7 == (4611686018427387903L & atomicLongFieldUpdater2.get(cVar)) && j7 == atomicLongFieldUpdater.get(cVar)) {
                    return;
                } else {
                    i5++;
                }
            } else {
                while (true) {
                    long j8 = atomicLongFieldUpdater2.get(cVar);
                    if (atomicLongFieldUpdater2.compareAndSet(cVar, j8, (j8 & 4611686018427387903L) + 4611686018427387904L)) {
                        break;
                    } else {
                        cVar = this;
                    }
                }
                while (true) {
                    long j9 = atomicLongFieldUpdater.get(cVar);
                    long j10 = atomicLongFieldUpdater2.get(cVar);
                    long j11 = j10 & 4611686018427387903L;
                    boolean z7 = (j10 & 4611686018427387904L) != 0;
                    if (j9 == j11 && j9 == atomicLongFieldUpdater.get(cVar)) {
                        break;
                    }
                    if (z7) {
                        cVar = this;
                    } else {
                        cVar = this;
                        atomicLongFieldUpdater2.compareAndSet(cVar, j10, 4611686018427387904L + j11);
                    }
                }
                while (true) {
                    long j12 = atomicLongFieldUpdater2.get(cVar);
                    if (atomicLongFieldUpdater2.compareAndSet(cVar, j12, j12 & 4611686018427387903L)) {
                        return;
                    } else {
                        cVar = this;
                    }
                }
            }
        }
    }

    @Override // p6.r
    public final Object b(V5.b frame) {
        k kVar;
        c cVar = this;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7227o;
        k kVar2 = (k) atomicReferenceFieldUpdater.get(cVar);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f7222e;
            if (cVar.s(atomicLongFieldUpdater.get(cVar), true)) {
                Throwable o7 = o();
                int i2 = s6.s.f7855a;
                throw o7;
            }
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f7223i;
            long andIncrement = atomicLongFieldUpdater2.getAndIncrement(cVar);
            long j = e.f7234b;
            long j7 = andIncrement / j;
            int i5 = (int) (andIncrement % j);
            if (kVar2.f7854c != j7) {
                k m2 = cVar.m(j7, kVar2);
                if (m2 == null) {
                    continue;
                } else {
                    kVar2 = m2;
                }
            }
            Object B7 = cVar.B(kVar2, i5, andIncrement, null);
            C0654a c0654a = e.f7244m;
            if (B7 == c0654a) {
                throw new IllegalStateException("unexpected");
            }
            C0654a c0654a2 = e.f7246o;
            if (B7 != c0654a2) {
                if (B7 != e.f7245n) {
                    kVar2.a();
                    return B7;
                }
                C0775h h7 = AbstractC0792z.h(W5.d.b(frame));
                c cVar2 = this;
                try {
                    Object B8 = cVar2.B(kVar2, i5, andIncrement, h7);
                    if (B8 == c0654a) {
                        h7.a(kVar2, i5);
                    } else if (B8 == c0654a2) {
                        if (andIncrement < cVar2.q()) {
                            kVar2.a();
                        }
                        k kVar3 = (k) atomicReferenceFieldUpdater.get(cVar2);
                        while (true) {
                            if (cVar2.s(atomicLongFieldUpdater.get(cVar2), true)) {
                                R5.l lVar = R5.n.f2421d;
                                h7.resumeWith(V6.b.n(cVar2.o()));
                                break;
                            }
                            long andIncrement2 = atomicLongFieldUpdater2.getAndIncrement(cVar2);
                            long j8 = e.f7234b;
                            long j9 = andIncrement2 / j8;
                            int i7 = (int) (andIncrement2 % j8);
                            if (kVar3.f7854c != j9) {
                                kVar = cVar2.m(j9, kVar3);
                                if (kVar == null) {
                                }
                            } else {
                                kVar = kVar3;
                            }
                            Object B9 = cVar2.B(kVar, i7, andIncrement2, h7);
                            if (B9 == e.f7244m) {
                                h7.a(kVar, i7);
                                break;
                            }
                            if (B9 == e.f7246o) {
                                if (andIncrement2 < q()) {
                                    kVar.a();
                                }
                                cVar2 = this;
                                kVar3 = kVar;
                            } else {
                                if (B9 == e.f7245n) {
                                    throw new IllegalStateException("unexpected");
                                }
                                kVar.a();
                                h7.e(B9, null);
                            }
                        }
                    } else {
                        kVar2.a();
                        h7.e(B8, null);
                    }
                    Object r7 = h7.r();
                    if (r7 == W5.a.f2787d) {
                        Intrinsics.checkNotNullParameter(frame, "frame");
                    }
                    return r7;
                } catch (Throwable th) {
                    h7.z();
                    throw th;
                }
            }
            if (andIncrement < q()) {
                kVar2.a();
            }
            cVar = this;
        }
    }

    @Override // p6.r
    public final void d(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        h(cancellationException, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x019f, code lost:
    
        return kotlin.Unit.f6114a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x00c0, code lost:
    
        c(r1, r4, r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0181 A[RETURN] */
    @Override // p6.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object f(V5.b frame, Object obj) {
        int e7;
        Unit unit;
        Object r7;
        W5.a aVar;
        Object obj2;
        c cVar;
        k kVar;
        int i2;
        int i5;
        boolean z7;
        c cVar2 = this;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7226n;
        k kVar2 = (k) atomicReferenceFieldUpdater.get(cVar2);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f7222e;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(cVar2);
            long j = andIncrement & 1152921504606846975L;
            boolean s7 = cVar2.s(andIncrement, false);
            int i7 = e.f7234b;
            long j7 = i7;
            long j8 = j / j7;
            int i8 = (int) (j % j7);
            if (kVar2.f7854c != j8) {
                k a7 = a(cVar2, j8, kVar2);
                if (a7 != null) {
                    kVar2 = a7;
                } else if (s7) {
                    Object x7 = x(frame, obj);
                    if (x7 == W5.a.f2787d) {
                        return x7;
                    }
                }
            }
            int e8 = e(cVar2, kVar2, i8, obj, j, null, s7);
            if (e8 == 0) {
                kVar2.a();
                break;
            }
            if (e8 == 1) {
                break;
            }
            if (e8 != 2) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = f7223i;
                if (e8 == 3) {
                    C0775h h7 = AbstractC0792z.h(W5.d.b(frame));
                    Object obj3 = obj;
                    try {
                        e7 = e(cVar2, kVar2, i8, obj3, j, h7, false);
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        if (e7 == 0) {
                            kVar2.a();
                            R5.l lVar = R5.n.f2421d;
                            unit = Unit.f6114a;
                        } else if (e7 != 1) {
                            if (e7 != 2) {
                                if (e7 != 4) {
                                    String str = "unexpected";
                                    if (e7 != 5) {
                                        throw new IllegalStateException("unexpected");
                                    }
                                    kVar2.a();
                                    k kVar3 = (k) atomicReferenceFieldUpdater.get(cVar2);
                                    while (true) {
                                        long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(cVar2);
                                        long j9 = andIncrement2 & 1152921504606846975L;
                                        boolean s8 = cVar2.s(andIncrement2, false);
                                        int i9 = e.f7234b;
                                        AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater;
                                        long j10 = i9;
                                        String str2 = str;
                                        long j11 = j9 / j10;
                                        int i10 = (int) (j9 % j10);
                                        if (kVar3.f7854c != j11) {
                                            k a8 = a(cVar2, j11, kVar3);
                                            if (a8 != null) {
                                                i2 = i9;
                                                i5 = i10;
                                                z7 = s8;
                                                kVar = a8;
                                            } else {
                                                if (s8) {
                                                    break;
                                                }
                                                atomicLongFieldUpdater = atomicLongFieldUpdater3;
                                                str = str2;
                                            }
                                        } else {
                                            kVar = kVar3;
                                            i2 = i9;
                                            i5 = i10;
                                            z7 = s8;
                                        }
                                        int e9 = e(cVar2, kVar, i5, obj3, j9, h7, z7);
                                        Object obj4 = obj3;
                                        cVar = cVar2;
                                        k kVar4 = kVar;
                                        int i11 = i5;
                                        obj2 = obj4;
                                        if (e9 == 0) {
                                            kVar4.a();
                                            R5.l lVar2 = R5.n.f2421d;
                                            unit = Unit.f6114a;
                                            break;
                                        }
                                        if (e9 == 1) {
                                            R5.l lVar3 = R5.n.f2421d;
                                            unit = Unit.f6114a;
                                            break;
                                        }
                                        if (e9 != 2) {
                                            if (e9 == 3) {
                                                throw new IllegalStateException(str2);
                                            }
                                            if (e9 != 4) {
                                                if (e9 == 5) {
                                                    kVar4.a();
                                                }
                                                kVar3 = kVar4;
                                                cVar2 = cVar;
                                                atomicLongFieldUpdater = atomicLongFieldUpdater3;
                                                str = str2;
                                                obj3 = obj2;
                                            } else if (j9 < atomicLongFieldUpdater2.get(cVar)) {
                                                kVar4.a();
                                            }
                                        } else if (z7) {
                                            kVar4.h();
                                        } else {
                                            h7.a(kVar4, i11 + i2);
                                        }
                                    }
                                } else {
                                    obj2 = obj3;
                                    cVar = cVar2;
                                    if (j < atomicLongFieldUpdater2.get(cVar)) {
                                        kVar2.a();
                                    }
                                }
                                c(cVar, obj2, h7);
                            } else {
                                h7.a(kVar2, i8 + i7);
                            }
                            r7 = h7.r();
                            aVar = W5.a.f2787d;
                            if (r7 == aVar) {
                                Intrinsics.checkNotNullParameter(frame, "frame");
                            }
                            if (r7 != aVar) {
                                r7 = Unit.f6114a;
                            }
                            if (r7 == aVar) {
                                return r7;
                            }
                        } else {
                            R5.l lVar4 = R5.n.f2421d;
                            unit = Unit.f6114a;
                        }
                        h7.resumeWith(unit);
                        r7 = h7.r();
                        aVar = W5.a.f2787d;
                        if (r7 == aVar) {
                        }
                        if (r7 != aVar) {
                        }
                        if (r7 == aVar) {
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        h7.z();
                        throw th;
                    }
                } else if (e8 == 4) {
                    if (j < atomicLongFieldUpdater2.get(cVar2)) {
                        kVar2.a();
                    }
                    Object x8 = x(frame, obj);
                    if (x8 == W5.a.f2787d) {
                        return x8;
                    }
                } else if (e8 == 5) {
                    kVar2.a();
                }
            } else if (s7) {
                kVar2.h();
                Object x9 = x(frame, obj);
                if (x9 == W5.a.f2787d) {
                    return x9;
                }
            }
        }
    }

    public final boolean g(long j) {
        return j < f7224l.get(this) || j < f7223i.get(this) + ((long) this.f7231d);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003c A[LOOP:2: B:17:0x003c->B:39:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e A[LOOP:3: B:22:0x006e->B:30:?, LOOP_LABEL: LOOP:3: B:22:0x006e->B:30:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004c A[LOOP:5: B:40:0x004c->B:48:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x002f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(Throwable th, boolean z7) {
        c cVar;
        C0654a c0654a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        boolean z8;
        long j;
        long j7;
        long j8;
        Object obj;
        long j9;
        long j10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f7222e;
        if (z7) {
            do {
                j10 = atomicLongFieldUpdater.get(this);
                if (((int) (j10 >> 60)) == 0) {
                    k kVar = e.f7233a;
                    cVar = this;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(cVar, j10, (j10 & 1152921504606846975L) + (1 << 60)));
            c0654a = e.f7250s;
            while (true) {
                atomicReferenceFieldUpdater = f7229q;
                if (!atomicReferenceFieldUpdater.compareAndSet(this, c0654a, th)) {
                    z8 = true;
                    break;
                }
                if (atomicReferenceFieldUpdater.get(this) != c0654a) {
                    z8 = false;
                    break;
                }
            }
            if (z7) {
                do {
                    j = atomicLongFieldUpdater.get(this);
                    int i2 = (int) (j >> 60);
                    if (i2 == 0) {
                        j7 = j & 1152921504606846975L;
                        j8 = 2;
                    } else {
                        if (i2 != 1) {
                            break;
                        }
                        j7 = j & 1152921504606846975L;
                        j8 = 3;
                    }
                } while (!atomicLongFieldUpdater.compareAndSet(cVar, j, (j8 << 60) + j7));
            } else {
                do {
                    j9 = atomicLongFieldUpdater.get(this);
                } while (!atomicLongFieldUpdater.compareAndSet(cVar, j9, (3 << 60) + (j9 & 1152921504606846975L)));
            }
            t();
            if (z8) {
                loop3: while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f7230r;
                    obj = atomicReferenceFieldUpdater2.get(this);
                    C0654a c0654a2 = obj == null ? e.f7248q : e.f7249r;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, c0654a2)) {
                        if (atomicReferenceFieldUpdater2.get(this) != obj) {
                            break;
                        }
                    }
                }
                if (obj != null) {
                    I.b(1, obj);
                    ((Function1) obj).invoke(n());
                    return z8;
                }
            }
            return z8;
        }
        cVar = this;
        c0654a = e.f7250s;
        while (true) {
            atomicReferenceFieldUpdater = f7229q;
            if (!atomicReferenceFieldUpdater.compareAndSet(this, c0654a, th)) {
            }
        }
        if (z7) {
        }
        t();
        if (z8) {
        }
        return z8;
    }

    @Override // p6.s
    public Object i(Object obj) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f7222e;
        boolean z7 = false;
        long j = 1152921504606846975L;
        boolean z8 = s(atomicLongFieldUpdater.get(this), false) ? false : !g(r1 & 1152921504606846975L);
        i iVar = j.f7255a;
        if (z8) {
            return iVar;
        }
        l0.e eVar = e.j;
        k kVar = (k) f7226n.get(this);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j7 = andIncrement & j;
            boolean s7 = s(andIncrement, z7);
            int i2 = e.f7234b;
            long j8 = i2;
            long j9 = j7 / j8;
            int i5 = (int) (j7 % j8);
            if (kVar.f7854c != j9) {
                k a7 = a(this, j9, kVar);
                if (a7 != null) {
                    kVar = a7;
                } else {
                    if (s7) {
                        return new h(p());
                    }
                    z7 = false;
                    j = 1152921504606846975L;
                }
            }
            int e7 = e(this, kVar, i5, obj, j7, eVar, s7);
            if (e7 == 0) {
                kVar.a();
                return Unit.f6114a;
            }
            if (e7 == 1) {
                return Unit.f6114a;
            }
            if (e7 == 2) {
                if (s7) {
                    kVar.h();
                    return new h(p());
                }
                w0 w0Var = eVar instanceof w0 ? (w0) eVar : null;
                if (w0Var != null) {
                    w0Var.a(kVar, i5 + i2);
                }
                kVar.h();
                return iVar;
            }
            if (e7 == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (e7 == 4) {
                if (j7 < f7223i.get(this)) {
                    kVar.a();
                }
                return new h(p());
            }
            if (e7 == 5) {
                kVar.a();
            }
            z7 = false;
            j = 1152921504606846975L;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x008d, code lost:
    
        r1 = (p6.k) ((s6.b) s6.b.f7822b.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final k j(long j) {
        Object obj;
        long j7;
        Object obj2 = f7228p.get(this);
        k kVar = (k) f7226n.get(this);
        if (kVar.f7854c > ((k) obj2).f7854c) {
            obj2 = kVar;
        }
        k kVar2 = (k) f7227o.get(this);
        if (kVar2.f7854c > ((k) obj2).f7854c) {
            obj2 = kVar2;
        }
        s6.b bVar = (s6.b) obj2;
        loop0: while (true) {
            bVar.getClass();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = s6.b.f7821a;
            Object obj3 = atomicReferenceFieldUpdater.get(bVar);
            C0654a c0654a = AbstractC0898a.f7818a;
            obj = null;
            if (obj3 == c0654a) {
                break;
            }
            s6.b bVar2 = (s6.b) obj3;
            if (bVar2 == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(bVar, null, c0654a)) {
                    if (atomicReferenceFieldUpdater.get(bVar) != null) {
                        break;
                    }
                }
                break loop0;
            }
            bVar = bVar2;
        }
        k kVar3 = (k) bVar;
        if (u()) {
            k kVar4 = kVar3;
            loop2: do {
                int i2 = e.f7234b - 1;
                while (true) {
                    if (-1 >= i2) {
                        break;
                    }
                    j7 = (kVar4.f7854c * e.f7234b) + i2;
                    if (j7 < f7223i.get(this)) {
                        break loop2;
                    }
                    while (true) {
                        Object k7 = kVar4.k(i2);
                        if (k7 != null && k7 != e.f7237e) {
                            if (k7 == e.f7236d) {
                                break loop2;
                            }
                        } else {
                            if (kVar4.j(k7, i2, e.f7243l)) {
                                kVar4.h();
                                break;
                            }
                        }
                    }
                    i2--;
                }
            } while (kVar4 != null);
            j7 = -1;
            if (j7 != -1) {
                k(j7);
            }
        }
        loop5: for (k kVar5 = kVar3; kVar5 != null; kVar5 = (k) ((s6.b) s6.b.f7822b.get(kVar5))) {
            for (int i5 = e.f7234b - 1; -1 < i5; i5--) {
                if ((kVar5.f7854c * e.f7234b) + i5 < j) {
                    break loop5;
                }
                while (true) {
                    Object k8 = kVar5.k(i5);
                    if (k8 != null && k8 != e.f7237e) {
                        if (!(k8 instanceof t)) {
                            if (!(k8 instanceof w0)) {
                                break;
                            }
                            if (kVar5.j(k8, i5, e.f7243l)) {
                                obj = AbstractC0898a.f(obj, k8);
                                kVar5.l(i5, true);
                                break;
                            }
                        } else {
                            if (kVar5.j(k8, i5, e.f7243l)) {
                                obj = AbstractC0898a.f(obj, ((t) k8).f7264a);
                                kVar5.l(i5, true);
                                break;
                            }
                        }
                    } else {
                        if (kVar5.j(k8, i5, e.f7243l)) {
                            kVar5.h();
                            break;
                        }
                    }
                }
            }
        }
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                y((w0) obj, true);
                return kVar3;
            }
            ArrayList arrayList = (ArrayList) obj;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                y((w0) arrayList.get(size), true);
            }
        }
        return kVar3;
    }

    public final void k(long j) {
        k kVar = (k) f7227o.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f7223i;
            long j7 = atomicLongFieldUpdater.get(this);
            if (j < Math.max(this.f7231d + j7, f7224l.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j7, 1 + j7)) {
                long j8 = e.f7234b;
                long j9 = j7 / j8;
                int i2 = (int) (j7 % j8);
                if (kVar.f7854c != j9) {
                    k m2 = m(j9, kVar);
                    if (m2 != null) {
                        kVar = m2;
                    }
                }
                k kVar2 = kVar;
                if (B(kVar2, i2, j7, null) != e.f7246o) {
                    kVar2.a();
                } else if (j7 < q()) {
                    kVar2.a();
                }
                kVar = kVar2;
            }
        }
    }

    public final void l() {
        Object b7;
        if (v()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7228p;
        k kVar = (k) atomicReferenceFieldUpdater.get(this);
        loop0: while (true) {
            long andIncrement = f7224l.getAndIncrement(this);
            long j = andIncrement / e.f7234b;
            if (q() <= andIncrement) {
                if (kVar.f7854c < j && kVar.b() != null) {
                    w(j, kVar);
                }
                r(this);
                return;
            }
            if (kVar.f7854c != j) {
                d dVar = d.f7232e;
                while (true) {
                    b7 = AbstractC0898a.b(kVar, j, dVar);
                    if (!AbstractC0898a.e(b7)) {
                        s6.r c7 = AbstractC0898a.c(b7);
                        while (true) {
                            s6.r rVar = (s6.r) atomicReferenceFieldUpdater.get(this);
                            if (rVar.f7854c >= c7.f7854c) {
                                break;
                            }
                            if (!c7.i()) {
                                break;
                            }
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, rVar, c7)) {
                                if (atomicReferenceFieldUpdater.get(this) != rVar) {
                                    if (c7.e()) {
                                        c7.d();
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
                k kVar2 = null;
                if (AbstractC0898a.e(b7)) {
                    t();
                    w(j, kVar);
                    r(this);
                } else {
                    k kVar3 = (k) AbstractC0898a.c(b7);
                    long j7 = kVar3.f7854c;
                    if (j7 > j) {
                        long j8 = j7 * e.f7234b;
                        if (f7224l.compareAndSet(this, 1 + andIncrement, j8)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = f7225m;
                            if ((atomicLongFieldUpdater.addAndGet(this, j8 - andIncrement) & 4611686018427387904L) != 0) {
                                while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0) {
                                }
                            }
                        } else {
                            r(this);
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
            int i2 = (int) (andIncrement % e.f7234b);
            Object k7 = kVar.k(i2);
            boolean z7 = k7 instanceof w0;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f7223i;
            if (!z7 || andIncrement < atomicLongFieldUpdater2.get(this) || !kVar.j(k7, i2, e.f7239g)) {
                while (true) {
                    Object k8 = kVar.k(i2);
                    if (!(k8 instanceof w0)) {
                        if (k8 != e.j) {
                            if (k8 != null) {
                                if (k8 == e.f7236d || k8 == e.f7240h || k8 == e.f7241i || k8 == e.f7242k || k8 == e.f7243l) {
                                    break loop0;
                                }
                                if (k8 != e.f7238f) {
                                    throw new IllegalStateException(("Unexpected cell state: " + k8).toString());
                                }
                            } else if (kVar.j(k8, i2, e.f7237e)) {
                                break loop0;
                            }
                        } else {
                            break;
                        }
                    } else if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                        if (kVar.j(k8, i2, new t((w0) k8))) {
                            break loop0;
                        }
                    } else if (kVar.j(k8, i2, e.f7239g)) {
                        if (A(k8)) {
                            kVar.n(i2, e.f7236d);
                            break;
                        } else {
                            kVar.n(i2, e.j);
                            kVar.h();
                        }
                    }
                }
            } else if (A(k7)) {
                kVar.n(i2, e.f7236d);
                break;
            } else {
                kVar.n(i2, e.j);
                kVar.h();
                r(this);
            }
        }
        r(this);
    }

    public final k m(long j, k kVar) {
        Object b7;
        long j7;
        k kVar2 = e.f7233a;
        d dVar = d.f7232e;
        loop0: while (true) {
            b7 = AbstractC0898a.b(kVar, j, dVar);
            if (!AbstractC0898a.e(b7)) {
                s6.r c7 = AbstractC0898a.c(b7);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7227o;
                    s6.r rVar = (s6.r) atomicReferenceFieldUpdater.get(this);
                    if (rVar.f7854c >= c7.f7854c) {
                        break loop0;
                    }
                    if (!c7.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, rVar, c7)) {
                        if (atomicReferenceFieldUpdater.get(this) != rVar) {
                            if (c7.e()) {
                                c7.d();
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
        if (AbstractC0898a.e(b7)) {
            t();
            if (kVar.f7854c * e.f7234b < q()) {
                kVar.a();
                return null;
            }
        } else {
            k kVar3 = (k) AbstractC0898a.c(b7);
            long j8 = kVar3.f7854c;
            if (!v() && j <= f7224l.get(this) / e.f7234b) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f7228p;
                    s6.r rVar2 = (s6.r) atomicReferenceFieldUpdater2.get(this);
                    if (rVar2.f7854c >= j8 || !kVar3.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, rVar2, kVar3)) {
                        if (atomicReferenceFieldUpdater2.get(this) != rVar2) {
                            if (kVar3.e()) {
                                kVar3.d();
                            }
                        }
                    }
                    if (rVar2.e()) {
                        rVar2.d();
                    }
                }
            }
            if (j8 <= j) {
                return kVar3;
            }
            long j9 = j8 * e.f7234b;
            do {
                j7 = f7223i.get(this);
                if (j7 >= j9) {
                    break;
                }
            } while (!f7223i.compareAndSet(this, j7, j9));
            if (j8 * e.f7234b < q()) {
                kVar3.a();
            }
        }
        return null;
    }

    public final Throwable n() {
        return (Throwable) f7229q.get(this);
    }

    public final Throwable o() {
        Throwable n7 = n();
        return n7 == null ? new l("Channel was closed") : n7;
    }

    public final Throwable p() {
        Throwable n7 = n();
        return n7 == null ? new K1.b("Channel was closed") : n7;
    }

    public final long q() {
        return f7222e.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x00a2, code lost:
    
        r0 = (p6.k) ((s6.b) s6.b.f7822b.get(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean s(long j, boolean z7) {
        int i2 = (int) (j >> 60);
        if (i2 != 0 && i2 != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f7223i;
            if (i2 == 2) {
                j(1152921504606846975L & j);
                if (z7) {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7227o;
                        k kVar = (k) atomicReferenceFieldUpdater.get(this);
                        long j7 = atomicLongFieldUpdater.get(this);
                        if (q() <= j7) {
                            break;
                        }
                        long j8 = e.f7234b;
                        long j9 = j7 / j8;
                        if (kVar.f7854c != j9 && (kVar = m(j9, kVar)) == null) {
                            if (((k) atomicReferenceFieldUpdater.get(this)).f7854c < j9) {
                                break;
                            }
                        } else {
                            kVar.a();
                            int i5 = (int) (j7 % j8);
                            while (true) {
                                Object k7 = kVar.k(i5);
                                if (k7 == null || k7 == e.f7237e) {
                                    if (kVar.j(k7, i5, e.f7240h)) {
                                        l();
                                        break;
                                    }
                                } else {
                                    if (k7 == e.f7236d) {
                                        break;
                                    }
                                    if (k7 != e.j) {
                                        if (k7 != e.f7243l) {
                                            if (k7 != e.f7241i) {
                                                if (k7 != e.f7240h) {
                                                    if (k7 == e.f7239g) {
                                                        break;
                                                    }
                                                    if (k7 != e.f7238f && j7 == atomicLongFieldUpdater.get(this)) {
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            f7223i.compareAndSet(this, j7, j7 + 1);
                        }
                    }
                }
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException(C4.p.g(i2, "unexpected close status: ").toString());
                }
                k j10 = j(1152921504606846975L & j);
                Object obj = null;
                loop0: do {
                    int i7 = e.f7234b - 1;
                    while (true) {
                        if (-1 >= i7) {
                            break;
                        }
                        long j11 = (j10.f7854c * e.f7234b) + i7;
                        while (true) {
                            Object k8 = j10.k(i7);
                            if (k8 == e.f7241i) {
                                break loop0;
                            }
                            if (k8 == e.f7236d) {
                                if (j11 < atomicLongFieldUpdater.get(this)) {
                                    break loop0;
                                }
                                if (j10.j(k8, i7, e.f7243l)) {
                                    j10.m(i7, null);
                                    j10.h();
                                    break;
                                }
                            } else if (k8 != e.f7237e && k8 != null) {
                                if (!(k8 instanceof w0) && !(k8 instanceof t)) {
                                    C0654a c0654a = e.f7239g;
                                    if (k8 == c0654a || k8 == e.f7238f) {
                                        break loop0;
                                    }
                                    if (k8 != c0654a) {
                                        break;
                                    }
                                } else {
                                    if (j11 < atomicLongFieldUpdater.get(this)) {
                                        break loop0;
                                    }
                                    w0 w0Var = k8 instanceof t ? ((t) k8).f7264a : (w0) k8;
                                    if (j10.j(k8, i7, e.f7243l)) {
                                        obj = AbstractC0898a.f(obj, w0Var);
                                        j10.m(i7, null);
                                        j10.h();
                                        break;
                                    }
                                }
                            } else if (j10.j(k8, i7, e.f7243l)) {
                                j10.h();
                                break;
                            }
                        }
                        i7--;
                    }
                } while (j10 != null);
                if (obj != null) {
                    if (obj instanceof ArrayList) {
                        ArrayList arrayList = (ArrayList) obj;
                        for (int size = arrayList.size() - 1; -1 < size; size--) {
                            y((w0) arrayList.get(size), false);
                        }
                    } else {
                        y((w0) obj, false);
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean t() {
        return s(f7222e.get(this), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x0194, code lost:
    
        r16 = r7;
        r3 = (p6.k) r3.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x019d, code lost:
    
        if (r3 != null) goto L83;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        boolean z7;
        String str;
        StringBuilder sb = new StringBuilder();
        int i2 = (int) (f7222e.get(this) >> 60);
        if (i2 == 2) {
            sb.append("closed,");
        } else if (i2 == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.f7231d + ',');
        sb.append("data=[");
        int i5 = 0;
        boolean z8 = true;
        List d7 = kotlin.collections.r.d(f7227o.get(this), f7226n.get(this), f7228p.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj : d7) {
            if (((k) obj) != e.f7233a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j = ((k) next).f7854c;
            do {
                Object next2 = it.next();
                long j7 = ((k) next2).f7854c;
                if (j > j7) {
                    next = next2;
                    j = j7;
                }
            } while (it.hasNext());
        }
        k kVar = (k) next;
        long j8 = f7223i.get(this);
        long q4 = q();
        loop2: while (true) {
            int i7 = e.f7234b;
            int i8 = i5;
            while (true) {
                if (i8 >= i7) {
                    break;
                }
                long j9 = (kVar.f7854c * e.f7234b) + i8;
                if (j9 >= q4 && j9 >= j8) {
                    break loop2;
                }
                Object k7 = kVar.k(i8);
                boolean z9 = z8;
                Object obj2 = kVar.f7257f.get(i8 * 2);
                if (k7 instanceof InterfaceC0773f) {
                    str = (j9 >= j8 || j9 < q4) ? (j9 >= q4 || j9 < j8) ? "cont" : "send" : "receive";
                } else if (k7 instanceof t) {
                    str = "EB(" + k7 + ')';
                } else if (Intrinsics.a(k7, e.f7238f) || Intrinsics.a(k7, e.f7239g)) {
                    str = "resuming_sender";
                } else {
                    if (k7 != null && !k7.equals(e.f7237e) && !k7.equals(e.f7241i) && !k7.equals(e.f7240h) && !k7.equals(e.f7242k) && !k7.equals(e.j) && !k7.equals(e.f7243l)) {
                        str = k7.toString();
                    }
                    i8++;
                    z8 = z9;
                }
                if (obj2 != null) {
                    sb.append("(" + str + ',' + obj2 + "),");
                } else {
                    sb.append(str + ',');
                }
                i8++;
                z8 = z9;
            }
            z8 = z7;
            i5 = 0;
        }
        Intrinsics.checkNotNullParameter(sb, "<this>");
        if (sb.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        if (sb.charAt(StringsKt.w(sb)) == ',') {
            Intrinsics.checkNotNullExpressionValue(sb.deleteCharAt(sb.length() - 1), "deleteCharAt(...)");
        }
        sb.append("]");
        return sb.toString();
    }

    public boolean u() {
        return false;
    }

    public final boolean v() {
        long j = f7224l.get(this);
        return j == 0 || j == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w(long j, k kVar) {
        k kVar2;
        k kVar3;
        while (kVar.f7854c < j && (kVar3 = (k) kVar.b()) != null) {
            kVar = kVar3;
        }
        while (true) {
            if (!kVar.c() || (kVar2 = (k) kVar.b()) == null) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7228p;
                    s6.r rVar = (s6.r) atomicReferenceFieldUpdater.get(this);
                    if (rVar.f7854c >= kVar.f7854c) {
                        return;
                    }
                    if (!kVar.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, rVar, kVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != rVar) {
                            if (kVar.e()) {
                                kVar.d();
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
            kVar = kVar2;
        }
    }

    public final Object x(V5.b frame, Object obj) {
        C0775h c0775h = new C0775h(1, W5.d.b(frame));
        c0775h.s();
        Throwable p7 = p();
        R5.l lVar = R5.n.f2421d;
        c0775h.resumeWith(V6.b.n(p7));
        Object r7 = c0775h.r();
        W5.a aVar = W5.a.f2787d;
        if (r7 == aVar) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return r7 == aVar ? r7 : Unit.f6114a;
    }

    public final void y(w0 w0Var, boolean z7) {
        if (w0Var instanceof InterfaceC0773f) {
            V5.b bVar = (V5.b) w0Var;
            R5.l lVar = R5.n.f2421d;
            bVar.resumeWith(V6.b.n(z7 ? o() : p()));
            return;
        }
        if (!(w0Var instanceof b)) {
            throw new IllegalStateException(("Unexpected waiter: " + w0Var).toString());
        }
        b bVar2 = (b) w0Var;
        C0775h c0775h = bVar2.f7220e;
        Intrinsics.b(c0775h);
        bVar2.f7220e = null;
        bVar2.f7219d = e.f7243l;
        Throwable n7 = bVar2.f7221i.n();
        if (n7 == null) {
            R5.l lVar2 = R5.n.f2421d;
            c0775h.resumeWith(Boolean.FALSE);
        } else {
            R5.l lVar3 = R5.n.f2421d;
            c0775h.resumeWith(V6.b.n(n7));
        }
    }

    public final boolean z(Object obj, Object obj2) {
        if (!(obj instanceof b)) {
            if (!(obj instanceof InterfaceC0773f)) {
                throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
            }
            Intrinsics.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            InterfaceC0773f interfaceC0773f = (InterfaceC0773f) obj;
            k kVar = e.f7233a;
            C0654a c7 = interfaceC0773f.c(obj2, null);
            if (c7 == null) {
                return false;
            }
            interfaceC0773f.k(c7);
            return true;
        }
        Intrinsics.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
        b bVar = (b) obj;
        C0775h c0775h = bVar.f7220e;
        Intrinsics.b(c0775h);
        bVar.f7220e = null;
        bVar.f7219d = obj2;
        Boolean bool = Boolean.TRUE;
        k kVar2 = e.f7233a;
        C0654a c8 = c0775h.c(bool, null);
        if (c8 == null) {
            return false;
        }
        c0775h.k(c8);
        return true;
    }
}
