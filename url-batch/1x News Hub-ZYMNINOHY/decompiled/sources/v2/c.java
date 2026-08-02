package v2;

import E1.AbstractC0033i;
import b2.C0195i;
import d1.C0297a;
import d2.InterfaceC0300c;
import e2.EnumC0317a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import n0.C1148j;
import t2.AbstractC1212w;
import t2.C1196f;
import t2.InterfaceC1195e;
import t2.p0;
import y2.t;

/* loaded from: classes.dex */
public class c implements g {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f10578b = AtomicLongFieldUpdater.newUpdater(c.class, "sendersAndCloseStatus$volatile");

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f10579c = AtomicLongFieldUpdater.newUpdater(c.class, "receivers$volatile");

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f10580d = AtomicLongFieldUpdater.newUpdater(c.class, "bufferEnd$volatile");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f10581e = AtomicLongFieldUpdater.newUpdater(c.class, "completedExpandBuffersAndPauseFlag$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater f = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "sendSegment$volatile");

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f10582g = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "receiveSegment$volatile");

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f10583h = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "bufferEndSegment$volatile");

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f10584i = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_closeCause$volatile");

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f10585j = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "closeHandler$volatile");
    private volatile /* synthetic */ Object _closeCause$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final int f10586a;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    public c(int i3) {
        this.f10586a = i3;
        if (i3 < 0) {
            throw new IllegalArgumentException(AbstractC0033i.i(i3, "Invalid channel capacity: ", ", should be >=0").toString());
        }
        k kVar = e.f10588a;
        this.bufferEnd$volatile = i3 != 0 ? i3 != Integer.MAX_VALUE ? i3 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = f10580d.get(this);
        k kVar2 = new k(0L, null, this, 3);
        this.sendSegment$volatile = kVar2;
        this.receiveSegment$volatile = kVar2;
        if (u()) {
            kVar2 = e.f10588a;
            kotlin.jvm.internal.j.c(kVar2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = kVar2;
        this._closeCause$volatile = e.f10604s;
    }

    public static final k a(c cVar, long j3, k kVar) {
        Object a3;
        c cVar2;
        cVar.getClass();
        k kVar2 = e.f10588a;
        d dVar = d.f10587a;
        loop0: while (true) {
            a3 = y2.a.a(kVar, j3, dVar);
            if (!y2.a.d(a3)) {
                t b3 = y2.a.b(a3);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
                    t tVar = (t) atomicReferenceFieldUpdater.get(cVar);
                    if (tVar.f10866c >= b3.f10866c) {
                        break loop0;
                    }
                    if (!b3.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(cVar, tVar, b3)) {
                        if (atomicReferenceFieldUpdater.get(cVar) != tVar) {
                            if (b3.e()) {
                                b3.d();
                            }
                        }
                    }
                    if (tVar.e()) {
                        tVar.d();
                    }
                }
            } else {
                break;
            }
        }
        boolean d3 = y2.a.d(a3);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f10579c;
        if (d3) {
            cVar.s();
            if (kVar.f10866c * e.f10589b < atomicLongFieldUpdater.get(cVar)) {
                kVar.a();
                return null;
            }
        } else {
            k kVar3 = (k) y2.a.b(a3);
            long j4 = kVar3.f10866c;
            if (j4 <= j3) {
                return kVar3;
            }
            long j5 = e.f10589b * j4;
            while (true) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = f10578b;
                long j6 = atomicLongFieldUpdater2.get(cVar);
                long j7 = 1152921504606846975L & j6;
                if (j7 >= j5) {
                    cVar2 = cVar;
                    break;
                }
                cVar2 = cVar;
                if (atomicLongFieldUpdater2.compareAndSet(cVar2, j6, j7 + (((int) (j6 >> 60)) << 60))) {
                    break;
                }
                cVar = cVar2;
            }
            if (j4 * e.f10589b < atomicLongFieldUpdater.get(cVar2)) {
                kVar3.a();
            }
        }
        return null;
    }

    public static final void c(c cVar, Object obj, C1196f c1196f) {
        cVar.getClass();
        c1196f.f(android.support.v4.media.session.a.k(cVar.o()));
    }

    public static final int d(c cVar, k kVar, int i3, Object obj, long j3, Object obj2, boolean z) {
        cVar.getClass();
        kVar.m(i3, obj);
        if (z) {
            return cVar.B(kVar, i3, obj, j3, obj2, z);
        }
        Object k3 = kVar.k(i3);
        if (k3 == null) {
            if (cVar.e(j3)) {
                if (kVar.j(null, i3, e.f10591d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (kVar.j(null, i3, obj2)) {
                    return 2;
                }
            }
        } else if (k3 instanceof p0) {
            kVar.m(i3, null);
            if (cVar.y(k3, obj)) {
                kVar.n(i3, e.f10595i);
                return 0;
            }
            C1148j c1148j = e.f10597k;
            if (kVar.f.getAndSet((i3 * 2) + 1, c1148j) == c1148j) {
                return 5;
            }
            kVar.l(i3, true);
            return 5;
        }
        return cVar.B(kVar, i3, obj, j3, obj2, z);
    }

    public static void q(c cVar) {
        cVar.getClass();
        AtomicLongFieldUpdater atomicLongFieldUpdater = f10581e;
        if ((atomicLongFieldUpdater.addAndGet(cVar, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(cVar) & 4611686018427387904L) != 0) {
            }
        }
    }

    public static boolean z(Object obj) {
        if (!(obj instanceof InterfaceC1195e)) {
            throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
        }
        kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
        InterfaceC1195e interfaceC1195e = (InterfaceC1195e) obj;
        k kVar = e.f10588a;
        C1148j d3 = interfaceC1195e.d(C0195i.f2555a, null);
        if (d3 == null) {
            return false;
        }
        interfaceC1195e.m(d3);
        return true;
    }

    public final Object A(k kVar, int i3, long j3, Object obj) {
        Object k3 = kVar.k(i3);
        AtomicReferenceArray atomicReferenceArray = kVar.f;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f10578b;
        if (k3 == null) {
            if (j3 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return e.f10600n;
                }
                if (kVar.j(k3, i3, obj)) {
                    k();
                    return e.f10599m;
                }
            }
        } else if (k3 == e.f10591d && kVar.j(k3, i3, e.f10595i)) {
            k();
            Object obj2 = atomicReferenceArray.get(i3 * 2);
            kVar.m(i3, null);
            return obj2;
        }
        while (true) {
            Object k4 = kVar.k(i3);
            if (k4 == null || k4 == e.f10592e) {
                if (j3 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (kVar.j(k4, i3, e.f10594h)) {
                        k();
                        return e.o;
                    }
                } else {
                    if (obj == null) {
                        return e.f10600n;
                    }
                    if (kVar.j(k4, i3, obj)) {
                        k();
                        return e.f10599m;
                    }
                }
            } else if (k4 != e.f10591d) {
                C1148j c1148j = e.f10596j;
                if (k4 == c1148j) {
                    return e.o;
                }
                if (k4 == e.f10594h) {
                    return e.o;
                }
                if (k4 == e.f10598l) {
                    k();
                    return e.o;
                }
                if (k4 != e.f10593g && kVar.j(k4, i3, e.f)) {
                    boolean z = k4 instanceof s;
                    if (z) {
                        k4 = ((s) k4).f10615a;
                    }
                    if (z(k4)) {
                        kVar.n(i3, e.f10595i);
                        k();
                        Object obj3 = atomicReferenceArray.get(i3 * 2);
                        kVar.m(i3, null);
                        return obj3;
                    }
                    kVar.n(i3, c1148j);
                    kVar.h();
                    if (z) {
                        k();
                    }
                    return e.o;
                }
            } else if (kVar.j(k4, i3, e.f10595i)) {
                k();
                Object obj4 = atomicReferenceArray.get(i3 * 2);
                kVar.m(i3, null);
                return obj4;
            }
        }
    }

    public final int B(k kVar, int i3, Object obj, long j3, Object obj2, boolean z) {
        while (true) {
            Object k3 = kVar.k(i3);
            if (k3 == null) {
                if (!e(j3) || z) {
                    if (z) {
                        if (kVar.j(null, i3, e.f10596j)) {
                            kVar.h();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (kVar.j(null, i3, obj2)) {
                            return 2;
                        }
                    }
                } else if (kVar.j(null, i3, e.f10591d)) {
                    break;
                }
            } else {
                if (k3 != e.f10592e) {
                    C1148j c1148j = e.f10597k;
                    if (k3 == c1148j) {
                        kVar.m(i3, null);
                        return 5;
                    }
                    if (k3 == e.f10594h) {
                        kVar.m(i3, null);
                        return 5;
                    }
                    if (k3 == e.f10598l) {
                        kVar.m(i3, null);
                        s();
                        return 4;
                    }
                    kVar.m(i3, null);
                    if (k3 instanceof s) {
                        k3 = ((s) k3).f10615a;
                    }
                    if (y(k3, obj)) {
                        kVar.n(i3, e.f10595i);
                        return 0;
                    }
                    if (kVar.f.getAndSet((i3 * 2) + 1, c1148j) != c1148j) {
                        kVar.l(i3, true);
                    }
                    return 5;
                }
                if (kVar.j(k3, i3, e.f10591d)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final void C(long j3) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        c cVar = this;
        if (cVar.u()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = f10580d;
            if (atomicLongFieldUpdater.get(cVar) > j3) {
                break;
            } else {
                cVar = this;
            }
        }
        int i3 = e.f10590c;
        int i4 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f10581e;
            if (i4 < i3) {
                long j4 = atomicLongFieldUpdater.get(cVar);
                if (j4 == (4611686018427387903L & atomicLongFieldUpdater2.get(cVar)) && j4 == atomicLongFieldUpdater.get(cVar)) {
                    return;
                } else {
                    i4++;
                }
            } else {
                while (true) {
                    long j5 = atomicLongFieldUpdater2.get(cVar);
                    if (atomicLongFieldUpdater2.compareAndSet(cVar, j5, (j5 & 4611686018427387903L) + 4611686018427387904L)) {
                        break;
                    } else {
                        cVar = this;
                    }
                }
                while (true) {
                    long j6 = atomicLongFieldUpdater.get(cVar);
                    long j7 = atomicLongFieldUpdater2.get(cVar);
                    long j8 = j7 & 4611686018427387903L;
                    boolean z = (j7 & 4611686018427387904L) != 0;
                    if (j6 == j8 && j6 == atomicLongFieldUpdater.get(cVar)) {
                        break;
                    }
                    if (!z) {
                        atomicLongFieldUpdater2.compareAndSet(this, j7, 4611686018427387904L + j8);
                    }
                    cVar = this;
                }
                while (true) {
                    long j9 = atomicLongFieldUpdater2.get(cVar);
                    if (atomicLongFieldUpdater2.compareAndSet(cVar, j9, j9 & 4611686018427387903L)) {
                        return;
                    } else {
                        cVar = this;
                    }
                }
            }
        }
    }

    @Override // v2.q
    public final void b(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        f(cancellationException, true);
    }

    public final boolean e(long j3) {
        return j3 < f10580d.get(this) || j3 < f10579c.get(this) + ((long) this.f10586a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003c A[LOOP:2: B:17:0x003c->B:39:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e A[LOOP:3: B:22:0x006e->B:30:?, LOOP_LABEL: LOOP:3: B:22:0x006e->B:30:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004c A[LOOP:5: B:40:0x004c->B:48:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x002f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f(Throwable th, boolean z) {
        c cVar;
        C1148j c1148j;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        boolean z2;
        long j3;
        long j4;
        long j5;
        Object obj;
        long j6;
        long j7;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f10578b;
        if (z) {
            do {
                j7 = atomicLongFieldUpdater.get(this);
                if (((int) (j7 >> 60)) == 0) {
                    k kVar = e.f10588a;
                    cVar = this;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(cVar, j7, (j7 & 1152921504606846975L) + (1 << 60)));
            c1148j = e.f10604s;
            while (true) {
                atomicReferenceFieldUpdater = f10584i;
                if (!atomicReferenceFieldUpdater.compareAndSet(this, c1148j, th)) {
                    z2 = true;
                    break;
                }
                if (atomicReferenceFieldUpdater.get(this) != c1148j) {
                    z2 = false;
                    break;
                }
            }
            if (z) {
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
                } while (!atomicLongFieldUpdater.compareAndSet(cVar, j3, (j5 << 60) + j4));
            } else {
                do {
                    j6 = atomicLongFieldUpdater.get(this);
                } while (!atomicLongFieldUpdater.compareAndSet(cVar, j6, (3 << 60) + (j6 & 1152921504606846975L)));
            }
            s();
            if (z2) {
                loop3: while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f10585j;
                    obj = atomicReferenceFieldUpdater2.get(this);
                    C1148j c1148j2 = obj == null ? e.f10602q : e.f10603r;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, c1148j2)) {
                        if (atomicReferenceFieldUpdater2.get(this) != obj) {
                            break;
                        }
                    }
                }
                if (obj != null) {
                    kotlin.jvm.internal.t.b(1, obj);
                    ((l2.l) obj).invoke(m());
                    return z2;
                }
            }
            return z2;
        }
        cVar = this;
        c1148j = e.f10604s;
        while (true) {
            atomicReferenceFieldUpdater = f10584i;
            if (!atomicReferenceFieldUpdater.compareAndSet(this, c1148j, th)) {
            }
        }
        if (z) {
        }
        s();
        if (z2) {
        }
        return z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0178, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x00c2, code lost:
    
        c(r1, r4, r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0164 A[RETURN] */
    @Override // v2.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object g(InterfaceC0300c interfaceC0300c, Object obj) {
        Object s3;
        Object obj2;
        c cVar;
        k kVar;
        int i3;
        c cVar2 = this;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
        k kVar2 = (k) atomicReferenceFieldUpdater.get(cVar2);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f10578b;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(cVar2);
            long j3 = andIncrement & 1152921504606846975L;
            boolean r3 = cVar2.r(andIncrement, false);
            int i4 = e.f10589b;
            long j4 = i4;
            long j5 = j3 / j4;
            int i5 = (int) (j3 % j4);
            long j6 = kVar2.f10866c;
            C0195i c0195i = C0195i.f2555a;
            EnumC0317a enumC0317a = EnumC0317a.f4969a;
            if (j6 != j5) {
                k a3 = a(cVar2, j5, kVar2);
                if (a3 != null) {
                    kVar2 = a3;
                } else if (r3) {
                    Object w3 = w(interfaceC0300c, obj);
                    if (w3 == enumC0317a) {
                        return w3;
                    }
                }
            }
            int d3 = d(cVar2, kVar2, i5, obj, j3, null, r3);
            if (d3 == 0) {
                kVar2.a();
                return c0195i;
            }
            if (d3 == 1) {
                break;
            }
            if (d3 != 2) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = f10579c;
                if (d3 == 3) {
                    C1196f d4 = AbstractC1212w.d(C2.b.x(interfaceC0300c));
                    Object obj3 = obj;
                    try {
                        int d5 = d(cVar2, kVar2, i5, obj3, j3, d4, false);
                        try {
                            if (d5 != 0) {
                                if (d5 == 1) {
                                    d4.f(c0195i);
                                } else if (d5 != 2) {
                                    if (d5 != 4) {
                                        String str = "unexpected";
                                        if (d5 != 5) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        kVar2.a();
                                        k kVar3 = (k) atomicReferenceFieldUpdater.get(cVar2);
                                        while (true) {
                                            long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(cVar2);
                                            long j7 = andIncrement2 & 1152921504606846975L;
                                            boolean r4 = cVar2.r(andIncrement2, false);
                                            int i6 = e.f10589b;
                                            long j8 = i6;
                                            String str2 = str;
                                            long j9 = j7 / j8;
                                            int i7 = (int) (j7 % j8);
                                            if (kVar3.f10866c != j9) {
                                                k a4 = a(cVar2, j9, kVar3);
                                                if (a4 != null) {
                                                    i3 = i6;
                                                    kVar = a4;
                                                } else {
                                                    if (r4) {
                                                        break;
                                                    }
                                                    str = str2;
                                                }
                                            } else {
                                                kVar = kVar3;
                                                i3 = i6;
                                            }
                                            int d6 = d(cVar2, kVar, i7, obj3, j7, d4, r4);
                                            Object obj4 = obj3;
                                            cVar = cVar2;
                                            k kVar4 = kVar;
                                            obj2 = obj4;
                                            if (d6 == 0) {
                                                kVar4.a();
                                                break;
                                            }
                                            if (d6 == 1) {
                                                break;
                                            }
                                            if (d6 != 2) {
                                                if (d6 == 3) {
                                                    throw new IllegalStateException(str2);
                                                }
                                                if (d6 != 4) {
                                                    if (d6 == 5) {
                                                        kVar4.a();
                                                    }
                                                    kVar3 = kVar4;
                                                    cVar2 = cVar;
                                                    str = str2;
                                                    obj3 = obj2;
                                                } else if (j7 < atomicLongFieldUpdater2.get(cVar)) {
                                                    kVar4.a();
                                                }
                                            } else if (r4) {
                                                kVar4.h();
                                            } else {
                                                d4.a(kVar4, i7 + i3);
                                            }
                                        }
                                    } else {
                                        obj2 = obj3;
                                        cVar = cVar2;
                                        if (j3 < atomicLongFieldUpdater2.get(cVar)) {
                                            kVar2.a();
                                        }
                                    }
                                    c(cVar, obj2, d4);
                                } else {
                                    d4.a(kVar2, i5 + i4);
                                }
                                s3 = d4.s();
                                if (s3 != enumC0317a) {
                                    s3 = c0195i;
                                }
                                if (s3 != enumC0317a) {
                                    return s3;
                                }
                            } else {
                                kVar2.a();
                            }
                            d4.f(c0195i);
                            s3 = d4.s();
                            if (s3 != enumC0317a) {
                            }
                            if (s3 != enumC0317a) {
                            }
                        } catch (Throwable th) {
                            th = th;
                            d4.z();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else if (d3 == 4) {
                    if (j3 < atomicLongFieldUpdater2.get(cVar2)) {
                        kVar2.a();
                    }
                    Object w4 = w(interfaceC0300c, obj);
                    if (w4 == enumC0317a) {
                        return w4;
                    }
                } else if (d3 == 5) {
                    kVar2.a();
                }
            } else if (r3) {
                kVar2.h();
                Object w5 = w(interfaceC0300c, obj);
                if (w5 == enumC0317a) {
                    return w5;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x008f, code lost:
    
        r1 = (v2.k) ((y2.d) y2.d.f10839b.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final k h(long j3) {
        Object obj;
        long j4;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj2 = f10583h.get(this);
        k kVar = (k) f.get(this);
        if (kVar.f10866c > ((k) obj2).f10866c) {
            obj2 = kVar;
        }
        k kVar2 = (k) f10582g.get(this);
        if (kVar2.f10866c > ((k) obj2).f10866c) {
            obj2 = kVar2;
        }
        y2.d dVar = (y2.d) obj2;
        loop0: while (true) {
            dVar.getClass();
            Object obj3 = y2.d.f10838a.get(dVar);
            C1148j c1148j = y2.a.f10832b;
            obj = null;
            if (obj3 == c1148j) {
                break;
            }
            y2.d dVar2 = (y2.d) obj3;
            if (dVar2 == null) {
                do {
                    atomicReferenceFieldUpdater = y2.d.f10838a;
                    if (atomicReferenceFieldUpdater.compareAndSet(dVar, null, c1148j)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(dVar) == null);
            } else {
                dVar = dVar2;
            }
        }
        k kVar3 = (k) dVar;
        if (t()) {
            k kVar4 = kVar3;
            loop2: do {
                int i3 = e.f10589b - 1;
                while (true) {
                    if (-1 >= i3) {
                        break;
                    }
                    j4 = (kVar4.f10866c * e.f10589b) + i3;
                    if (j4 < f10579c.get(this)) {
                        break loop2;
                    }
                    while (true) {
                        Object k3 = kVar4.k(i3);
                        if (k3 != null && k3 != e.f10592e) {
                            if (k3 == e.f10591d) {
                                break loop2;
                            }
                        } else {
                            if (kVar4.j(k3, i3, e.f10598l)) {
                                kVar4.h();
                                break;
                            }
                        }
                    }
                    i3--;
                }
            } while (kVar4 != null);
            j4 = -1;
            if (j4 != -1) {
                i(j4);
            }
        }
        loop5: for (k kVar5 = kVar3; kVar5 != null; kVar5 = (k) ((y2.d) y2.d.f10839b.get(kVar5))) {
            for (int i4 = e.f10589b - 1; -1 < i4; i4--) {
                if ((kVar5.f10866c * e.f10589b) + i4 < j3) {
                    break loop5;
                }
                while (true) {
                    Object k4 = kVar5.k(i4);
                    if (k4 != null && k4 != e.f10592e) {
                        if (!(k4 instanceof s)) {
                            if (!(k4 instanceof p0)) {
                                break;
                            }
                            if (kVar5.j(k4, i4, e.f10598l)) {
                                obj = y2.a.e(obj, k4);
                                kVar5.l(i4, true);
                                break;
                            }
                        } else {
                            if (kVar5.j(k4, i4, e.f10598l)) {
                                obj = y2.a.e(obj, ((s) k4).f10615a);
                                kVar5.l(i4, true);
                                break;
                            }
                        }
                    } else {
                        if (kVar5.j(k4, i4, e.f10598l)) {
                            kVar5.h();
                            break;
                        }
                    }
                }
            }
        }
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                x((p0) obj, true);
                return kVar3;
            }
            ArrayList arrayList = (ArrayList) obj;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                x((p0) arrayList.get(size), true);
            }
        }
        return kVar3;
    }

    public final void i(long j3) {
        k kVar = (k) f10582g.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f10579c;
            long j4 = atomicLongFieldUpdater.get(this);
            if (j3 < Math.max(this.f10586a + j4, f10580d.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j4, 1 + j4)) {
                long j5 = e.f10589b;
                long j6 = j4 / j5;
                int i3 = (int) (j4 % j5);
                if (kVar.f10866c != j6) {
                    k l3 = l(j6, kVar);
                    if (l3 != null) {
                        kVar = l3;
                    }
                }
                k kVar2 = kVar;
                if (A(kVar2, i3, j4, null) != e.o) {
                    kVar2.a();
                } else if (j4 < p()) {
                    kVar2.a();
                }
                kVar = kVar2;
            }
        }
    }

    @Override // v2.r
    public Object j(Object obj) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f10578b;
        boolean z = false;
        long j3 = 1152921504606846975L;
        boolean z2 = r(atomicLongFieldUpdater.get(this), false) ? false : !e(r1 & 1152921504606846975L);
        i iVar = j.f10609a;
        if (z2) {
            return iVar;
        }
        Object obj2 = e.f10596j;
        k kVar = (k) f.get(this);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j4 = andIncrement & j3;
            boolean r3 = r(andIncrement, z);
            int i3 = e.f10589b;
            long j5 = i3;
            long j6 = j4 / j5;
            int i4 = (int) (j4 % j5);
            if (kVar.f10866c != j6) {
                k a3 = a(this, j6, kVar);
                if (a3 != null) {
                    kVar = a3;
                } else {
                    if (r3) {
                        return new h(o());
                    }
                    z = false;
                    j3 = 1152921504606846975L;
                }
            }
            int d3 = d(this, kVar, i4, obj, j4, obj2, r3);
            C0195i c0195i = C0195i.f2555a;
            if (d3 == 0) {
                kVar.a();
                return c0195i;
            }
            if (d3 == 1) {
                return c0195i;
            }
            if (d3 == 2) {
                if (r3) {
                    kVar.h();
                    return new h(o());
                }
                p0 p0Var = obj2 instanceof p0 ? (p0) obj2 : null;
                if (p0Var != null) {
                    p0Var.a(kVar, i4 + i3);
                }
                kVar.h();
                return iVar;
            }
            if (d3 == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (d3 == 4) {
                if (j4 < f10579c.get(this)) {
                    kVar.a();
                }
                return new h(o());
            }
            if (d3 == 5) {
                kVar.a();
            }
            z = false;
            j3 = 1152921504606846975L;
        }
    }

    public final void k() {
        Object a3;
        if (u()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10583h;
        k kVar = (k) atomicReferenceFieldUpdater.get(this);
        loop0: while (true) {
            long andIncrement = f10580d.getAndIncrement(this);
            long j3 = andIncrement / e.f10589b;
            if (p() <= andIncrement) {
                if (kVar.f10866c < j3 && kVar.b() != null) {
                    v(j3, kVar);
                }
                q(this);
                return;
            }
            if (kVar.f10866c != j3) {
                d dVar = d.f10587a;
                while (true) {
                    a3 = y2.a.a(kVar, j3, dVar);
                    if (!y2.a.d(a3)) {
                        t b3 = y2.a.b(a3);
                        while (true) {
                            t tVar = (t) atomicReferenceFieldUpdater.get(this);
                            if (tVar.f10866c >= b3.f10866c) {
                                break;
                            }
                            if (!b3.i()) {
                                break;
                            }
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, tVar, b3)) {
                                if (atomicReferenceFieldUpdater.get(this) != tVar) {
                                    if (b3.e()) {
                                        b3.d();
                                    }
                                }
                            }
                            if (tVar.e()) {
                                tVar.d();
                            }
                        }
                    } else {
                        break;
                    }
                }
                k kVar2 = null;
                if (y2.a.d(a3)) {
                    s();
                    v(j3, kVar);
                    q(this);
                } else {
                    k kVar3 = (k) y2.a.b(a3);
                    long j4 = kVar3.f10866c;
                    if (j4 > j3) {
                        long j5 = j4 * e.f10589b;
                        if (f10580d.compareAndSet(this, 1 + andIncrement, j5)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = f10581e;
                            if ((atomicLongFieldUpdater.addAndGet(this, j5 - andIncrement) & 4611686018427387904L) != 0) {
                                while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0) {
                                }
                            }
                        } else {
                            q(this);
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
            int i3 = (int) (andIncrement % e.f10589b);
            Object k3 = kVar.k(i3);
            boolean z = k3 instanceof p0;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f10579c;
            if (!z || andIncrement < atomicLongFieldUpdater2.get(this) || !kVar.j(k3, i3, e.f10593g)) {
                while (true) {
                    Object k4 = kVar.k(i3);
                    if (!(k4 instanceof p0)) {
                        if (k4 != e.f10596j) {
                            if (k4 != null) {
                                if (k4 == e.f10591d || k4 == e.f10594h || k4 == e.f10595i || k4 == e.f10597k || k4 == e.f10598l) {
                                    break loop0;
                                }
                                if (k4 != e.f) {
                                    throw new IllegalStateException(("Unexpected cell state: " + k4).toString());
                                }
                            } else if (kVar.j(k4, i3, e.f10592e)) {
                                break loop0;
                            }
                        } else {
                            break;
                        }
                    } else if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                        if (kVar.j(k4, i3, new s((p0) k4))) {
                            break loop0;
                        }
                    } else if (kVar.j(k4, i3, e.f10593g)) {
                        if (z(k4)) {
                            kVar.n(i3, e.f10591d);
                            break;
                        } else {
                            kVar.n(i3, e.f10596j);
                            kVar.h();
                        }
                    }
                }
            } else if (z(k3)) {
                kVar.n(i3, e.f10591d);
                break;
            } else {
                kVar.n(i3, e.f10596j);
                kVar.h();
                q(this);
            }
        }
        q(this);
    }

    public final k l(long j3, k kVar) {
        Object a3;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j4;
        k kVar2 = e.f10588a;
        d dVar = d.f10587a;
        loop0: while (true) {
            a3 = y2.a.a(kVar, j3, dVar);
            if (!y2.a.d(a3)) {
                t b3 = y2.a.b(a3);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10582g;
                    t tVar = (t) atomicReferenceFieldUpdater.get(this);
                    if (tVar.f10866c >= b3.f10866c) {
                        break loop0;
                    }
                    if (!b3.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, tVar, b3)) {
                        if (atomicReferenceFieldUpdater.get(this) != tVar) {
                            if (b3.e()) {
                                b3.d();
                            }
                        }
                    }
                    if (tVar.e()) {
                        tVar.d();
                    }
                }
            } else {
                break;
            }
        }
        if (y2.a.d(a3)) {
            s();
            if (kVar.f10866c * e.f10589b < p()) {
                kVar.a();
                return null;
            }
        } else {
            k kVar3 = (k) y2.a.b(a3);
            boolean u3 = u();
            long j5 = kVar3.f10866c;
            if (!u3 && j3 <= f10580d.get(this) / e.f10589b) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f10583h;
                    t tVar2 = (t) atomicReferenceFieldUpdater2.get(this);
                    if (tVar2.f10866c >= j5 || !kVar3.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, tVar2, kVar3)) {
                        if (atomicReferenceFieldUpdater2.get(this) != tVar2) {
                            if (kVar3.e()) {
                                kVar3.d();
                            }
                        }
                    }
                    if (tVar2.e()) {
                        tVar2.d();
                    }
                }
            }
            if (j5 <= j3) {
                return kVar3;
            }
            long j6 = j5 * e.f10589b;
            do {
                atomicLongFieldUpdater = f10579c;
                j4 = atomicLongFieldUpdater.get(this);
                if (j4 >= j6) {
                    break;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(this, j4, j6));
            if (j5 * e.f10589b < p()) {
                kVar3.a();
            }
        }
        return null;
    }

    public final Throwable m() {
        return (Throwable) f10584i.get(this);
    }

    public final Throwable n() {
        Throwable m3 = m();
        return m3 == null ? new l("Channel was closed") : m3;
    }

    public final Throwable o() {
        Throwable m3 = m();
        return m3 == null ? new C0297a("Channel was closed") : m3;
    }

    public final long p() {
        return f10578b.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x00a2, code lost:
    
        r0 = (v2.k) ((y2.d) y2.d.f10839b.get(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean r(long j3, boolean z) {
        int i3 = (int) (j3 >> 60);
        if (i3 != 0 && i3 != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f10579c;
            if (i3 == 2) {
                h(1152921504606846975L & j3);
                if (z) {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10582g;
                        k kVar = (k) atomicReferenceFieldUpdater.get(this);
                        long j4 = atomicLongFieldUpdater.get(this);
                        if (p() <= j4) {
                            break;
                        }
                        long j5 = e.f10589b;
                        long j6 = j4 / j5;
                        if (kVar.f10866c != j6 && (kVar = l(j6, kVar)) == null) {
                            if (((k) atomicReferenceFieldUpdater.get(this)).f10866c < j6) {
                                break;
                            }
                        } else {
                            kVar.a();
                            int i4 = (int) (j4 % j5);
                            while (true) {
                                Object k3 = kVar.k(i4);
                                if (k3 == null || k3 == e.f10592e) {
                                    if (kVar.j(k3, i4, e.f10594h)) {
                                        k();
                                        break;
                                    }
                                } else {
                                    if (k3 == e.f10591d) {
                                        break;
                                    }
                                    if (k3 != e.f10596j) {
                                        if (k3 != e.f10598l) {
                                            if (k3 != e.f10595i) {
                                                if (k3 != e.f10594h) {
                                                    if (k3 == e.f10593g) {
                                                        break;
                                                    }
                                                    if (k3 != e.f && j4 == atomicLongFieldUpdater.get(this)) {
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            f10579c.compareAndSet(this, j4, j4 + 1);
                        }
                    }
                }
            } else {
                if (i3 != 3) {
                    throw new IllegalStateException(AbstractC0033i.h(i3, "unexpected close status: ").toString());
                }
                k h3 = h(1152921504606846975L & j3);
                Object obj = null;
                loop0: do {
                    int i5 = e.f10589b - 1;
                    while (true) {
                        if (-1 >= i5) {
                            break;
                        }
                        long j7 = (h3.f10866c * e.f10589b) + i5;
                        while (true) {
                            Object k4 = h3.k(i5);
                            if (k4 == e.f10595i) {
                                break loop0;
                            }
                            if (k4 == e.f10591d) {
                                if (j7 < atomicLongFieldUpdater.get(this)) {
                                    break loop0;
                                }
                                if (h3.j(k4, i5, e.f10598l)) {
                                    h3.m(i5, null);
                                    h3.h();
                                    break;
                                }
                            } else if (k4 != e.f10592e && k4 != null) {
                                if (!(k4 instanceof p0) && !(k4 instanceof s)) {
                                    C1148j c1148j = e.f10593g;
                                    if (k4 == c1148j || k4 == e.f) {
                                        break loop0;
                                    }
                                    if (k4 != c1148j) {
                                        break;
                                    }
                                } else {
                                    if (j7 < atomicLongFieldUpdater.get(this)) {
                                        break loop0;
                                    }
                                    p0 p0Var = k4 instanceof s ? ((s) k4).f10615a : (p0) k4;
                                    if (h3.j(k4, i5, e.f10598l)) {
                                        obj = y2.a.e(obj, p0Var);
                                        h3.m(i5, null);
                                        h3.h();
                                        break;
                                    }
                                }
                            } else if (h3.j(k4, i5, e.f10598l)) {
                                h3.h();
                                break;
                            }
                        }
                        i5--;
                    }
                } while (h3 != null);
                if (obj != null) {
                    if (obj instanceof ArrayList) {
                        ArrayList arrayList = (ArrayList) obj;
                        for (int size = arrayList.size() - 1; -1 < size; size--) {
                            x((p0) arrayList.get(size), false);
                        }
                    } else {
                        x((p0) obj, false);
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean s() {
        return r(f10578b.get(this), false);
    }

    public boolean t() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:94:0x01aa, code lost:
    
        r16 = r7;
        r3 = (v2.k) r3.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01b3, code lost:
    
        if (r3 != null) goto L88;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        boolean z;
        String obj;
        StringBuilder sb = new StringBuilder();
        int i3 = (int) (f10578b.get(this) >> 60);
        if (i3 == 2) {
            sb.append("closed,");
        } else if (i3 == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.f10586a + ',');
        sb.append("data=[");
        int i4 = 0;
        boolean z2 = true;
        List L = c2.f.L(f10582g.get(this), f.get(this), f10583h.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : L) {
            if (((k) obj2) != e.f10588a) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j3 = ((k) next).f10866c;
            do {
                Object next2 = it.next();
                long j4 = ((k) next2).f10866c;
                if (j3 > j4) {
                    next = next2;
                    j3 = j4;
                }
            } while (it.hasNext());
        }
        k kVar = (k) next;
        long j5 = f10579c.get(this);
        long p3 = p();
        loop2: while (true) {
            int i5 = e.f10589b;
            int i6 = i4;
            while (true) {
                if (i6 >= i5) {
                    break;
                }
                long j6 = (kVar.f10866c * e.f10589b) + i6;
                if (j6 >= p3 && j6 >= j5) {
                    break loop2;
                }
                Object k3 = kVar.k(i6);
                boolean z3 = z2;
                Object obj3 = kVar.f.get(i6 * 2);
                if (k3 instanceof InterfaceC1195e) {
                    obj = (j6 >= j5 || j6 < p3) ? (j6 >= p3 || j6 < j5) ? "cont" : "send" : "receive";
                } else if (k3 instanceof s) {
                    obj = "EB(" + k3 + ')';
                } else if (kotlin.jvm.internal.j.a(k3, e.f) ? z3 : kotlin.jvm.internal.j.a(k3, e.f10593g)) {
                    obj = "resuming_sender";
                } else if (k3 == null ? z3 : k3.equals(e.f10592e) ? z3 : kotlin.jvm.internal.j.a(k3, e.f10595i) ? z3 : kotlin.jvm.internal.j.a(k3, e.f10594h) ? z3 : kotlin.jvm.internal.j.a(k3, e.f10597k) ? z3 : kotlin.jvm.internal.j.a(k3, e.f10596j) ? z3 : kotlin.jvm.internal.j.a(k3, e.f10598l)) {
                    i6++;
                    z2 = z3;
                } else {
                    obj = k3.toString();
                }
                if (obj3 != null) {
                    sb.append("(" + obj + ',' + obj3 + "),");
                } else {
                    sb.append(obj + ',');
                }
                i6++;
                z2 = z3;
            }
            z2 = z;
            i4 = 0;
        }
        if (sb.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        if (sb.charAt(s2.n.S(sb)) == ',') {
            kotlin.jvm.internal.j.d(sb.deleteCharAt(sb.length() - 1), "deleteCharAt(...)");
        }
        sb.append("]");
        return sb.toString();
    }

    public final boolean u() {
        long j3 = f10580d.get(this);
        return j3 == 0 || j3 == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(long j3, k kVar) {
        k kVar2;
        k kVar3;
        while (kVar.f10866c < j3 && (kVar3 = (k) kVar.b()) != null) {
            kVar = kVar3;
        }
        while (true) {
            if (!kVar.c() || (kVar2 = (k) kVar.b()) == null) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10583h;
                    t tVar = (t) atomicReferenceFieldUpdater.get(this);
                    if (tVar.f10866c >= kVar.f10866c) {
                        return;
                    }
                    if (!kVar.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, tVar, kVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != tVar) {
                            if (kVar.e()) {
                                kVar.d();
                            }
                        }
                    }
                    if (tVar.e()) {
                        tVar.d();
                        return;
                    }
                    return;
                }
            }
            kVar = kVar2;
        }
    }

    public final Object w(InterfaceC0300c interfaceC0300c, Object obj) {
        C1196f c1196f = new C1196f(1, C2.b.x(interfaceC0300c));
        c1196f.t();
        c1196f.f(android.support.v4.media.session.a.k(o()));
        Object s3 = c1196f.s();
        return s3 == EnumC0317a.f4969a ? s3 : C0195i.f2555a;
    }

    public final void x(p0 p0Var, boolean z) {
        if (p0Var instanceof InterfaceC1195e) {
            ((InterfaceC0300c) p0Var).f(android.support.v4.media.session.a.k(z ? n() : o()));
            return;
        }
        if (!(p0Var instanceof b)) {
            throw new IllegalStateException(("Unexpected waiter: " + p0Var).toString());
        }
        b bVar = (b) p0Var;
        C1196f c1196f = bVar.f10576b;
        kotlin.jvm.internal.j.b(c1196f);
        bVar.f10576b = null;
        bVar.f10575a = e.f10598l;
        Throwable m3 = bVar.f10577c.m();
        if (m3 == null) {
            c1196f.f(Boolean.FALSE);
        } else {
            c1196f.f(android.support.v4.media.session.a.k(m3));
        }
    }

    public final boolean y(Object obj, Object obj2) {
        if (!(obj instanceof b)) {
            if (!(obj instanceof InterfaceC1195e)) {
                throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
            }
            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            InterfaceC1195e interfaceC1195e = (InterfaceC1195e) obj;
            k kVar = e.f10588a;
            C1148j d3 = interfaceC1195e.d(obj2, null);
            if (d3 == null) {
                return false;
            }
            interfaceC1195e.m(d3);
            return true;
        }
        kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
        b bVar = (b) obj;
        C1196f c1196f = bVar.f10576b;
        kotlin.jvm.internal.j.b(c1196f);
        bVar.f10576b = null;
        bVar.f10575a = obj2;
        Boolean bool = Boolean.TRUE;
        bVar.f10577c.getClass();
        k kVar2 = e.f10588a;
        C1148j d4 = c1196f.d(bool, null);
        if (d4 == null) {
            return false;
        }
        c1196f.m(d4);
        return true;
    }
}
