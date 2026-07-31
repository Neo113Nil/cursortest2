package c7;

import a7.s1;
import a7.x;
import d4.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import q6.v;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public class c implements g {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f1767e = AtomicLongFieldUpdater.newUpdater(c.class, "sendersAndCloseStatus$volatile");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f1768f = AtomicLongFieldUpdater.newUpdater(c.class, "receivers$volatile");

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f1769g = AtomicLongFieldUpdater.newUpdater(c.class, "bufferEnd$volatile");

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f1770h = AtomicLongFieldUpdater.newUpdater(c.class, "completedExpandBuffersAndPauseFlag$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater i = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "sendSegment$volatile");

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1771j = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "receiveSegment$volatile");

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1772k = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "bufferEndSegment$volatile");

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1773l = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_closeCause$volatile");

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1774m = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "closeHandler$volatile");
    private volatile /* synthetic */ Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;

    /* renamed from: d, reason: collision with root package name */
    public final int f1775d;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    public c(int i8) {
        this.f1775d = i8;
        if (i8 < 0) {
            throw new IllegalArgumentException(("Invalid channel capacity: " + i8 + ", should be >=0").toString());
        }
        k kVar = e.f1777a;
        this.bufferEnd$volatile = i8 != 0 ? i8 != Integer.MAX_VALUE ? i8 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = f1769g.get(this);
        k kVar2 = new k(0L, null, this, 3);
        this.sendSegment$volatile = kVar2;
        this.receiveSegment$volatile = kVar2;
        if (v()) {
            kVar2 = e.f1777a;
            q6.i.c(kVar2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = kVar2;
        this._closeCause$volatile = e.f1794s;
    }

    public static boolean B(Object obj) {
        if (!(obj instanceof a7.f)) {
            throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
        }
        a7.f fVar = (a7.f) obj;
        k kVar = e.f1777a;
        t o2 = fVar.o(c6.m.f1757a, null);
        if (o2 == null) {
            return false;
        }
        fVar.A(o2);
        return true;
    }

    public static final k b(c cVar, long j7, k kVar) {
        Object b8;
        c cVar2;
        k kVar2 = e.f1777a;
        d dVar = d.f1776l;
        loop0: while (true) {
            b8 = f7.a.b(kVar, j7, dVar);
            if (!f7.a.e(b8)) {
                f7.r c8 = f7.a.c(b8);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i;
                    f7.r rVar = (f7.r) atomicReferenceFieldUpdater.get(cVar);
                    if (rVar.f2799c >= c8.f2799c) {
                        break loop0;
                    }
                    if (!c8.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(cVar, rVar, c8)) {
                        if (atomicReferenceFieldUpdater.get(cVar) != rVar) {
                            if (c8.e()) {
                                c8.d();
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
        boolean e8 = f7.a.e(b8);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f1768f;
        if (e8) {
            cVar.h();
            if (kVar.f2799c * e.f1778b < atomicLongFieldUpdater.get(cVar)) {
                kVar.a();
                return null;
            }
        } else {
            k kVar3 = (k) f7.a.c(b8);
            long j8 = kVar3.f2799c;
            if (j8 <= j7) {
                return kVar3;
            }
            long j9 = e.f1778b * j8;
            while (true) {
                long j10 = f1767e.get(cVar);
                long j11 = 1152921504606846975L & j10;
                if (j11 >= j9) {
                    cVar2 = cVar;
                    break;
                }
                cVar2 = cVar;
                if (f1767e.compareAndSet(cVar2, j10, (((int) (j10 >> 60)) << 60) + j11)) {
                    break;
                }
                cVar = cVar2;
            }
            if (j8 * e.f1778b < atomicLongFieldUpdater.get(cVar2)) {
                kVar3.a();
            }
        }
        return null;
    }

    public static final void c(c cVar, Object obj, a7.h hVar) {
        hVar.k(s6.a.l(cVar.o()));
    }

    public static final int d(c cVar, k kVar, int i8, Object obj, long j7, Object obj2, boolean z3) {
        kVar.m(i8, obj);
        if (z3) {
            return cVar.D(kVar, i8, obj, j7, obj2, z3);
        }
        Object k3 = kVar.k(i8);
        if (k3 == null) {
            if (cVar.e(j7)) {
                if (kVar.j(i8, null, e.f1780d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (kVar.j(i8, null, obj2)) {
                    return 2;
                }
            }
        } else if (k3 instanceof s1) {
            kVar.m(i8, null);
            if (cVar.A(k3, obj)) {
                kVar.n(i8, e.i);
                return 0;
            }
            t tVar = e.f1786k;
            if (kVar.f1801f.getAndSet((i8 * 2) + 1, tVar) == tVar) {
                return 5;
            }
            kVar.l(i8, true);
            return 5;
        }
        return cVar.D(kVar, i8, obj, j7, obj2, z3);
    }

    public static void q(c cVar) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f1770h;
        if ((atomicLongFieldUpdater.addAndGet(cVar, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(cVar) & 4611686018427387904L) != 0) {
            }
        }
    }

    public final boolean A(Object obj, Object obj2) {
        if (!(obj instanceof b)) {
            if (!(obj instanceof a7.f)) {
                throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
            }
            a7.f fVar = (a7.f) obj;
            k kVar = e.f1777a;
            t o2 = fVar.o(obj2, null);
            if (o2 == null) {
                return false;
            }
            fVar.A(o2);
            return true;
        }
        b bVar = (b) obj;
        a7.h hVar = bVar.f1765e;
        q6.i.b(hVar);
        bVar.f1765e = null;
        bVar.f1764d = obj2;
        Boolean bool = Boolean.TRUE;
        bVar.f1766f.getClass();
        k kVar2 = e.f1777a;
        t o5 = hVar.o(bool, null);
        if (o5 == null) {
            return false;
        }
        hVar.A(o5);
        return true;
    }

    public final Object C(k kVar, int i8, long j7, Object obj) {
        AtomicReferenceArray atomicReferenceArray = kVar.f1801f;
        Object k3 = kVar.k(i8);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f1767e;
        if (k3 == null) {
            if (j7 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return e.f1789n;
                }
                if (kVar.j(i8, k3, obj)) {
                    k();
                    return e.f1788m;
                }
            }
        } else if (k3 == e.f1780d && kVar.j(i8, k3, e.i)) {
            k();
            Object obj2 = atomicReferenceArray.get(i8 * 2);
            kVar.m(i8, null);
            return obj2;
        }
        while (true) {
            Object k7 = kVar.k(i8);
            if (k7 == null || k7 == e.f1781e) {
                if (j7 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (kVar.j(i8, k7, e.f1784h)) {
                        k();
                        return e.f1790o;
                    }
                } else {
                    if (obj == null) {
                        return e.f1789n;
                    }
                    if (kVar.j(i8, k7, obj)) {
                        k();
                        return e.f1788m;
                    }
                }
            } else if (k7 != e.f1780d) {
                t tVar = e.f1785j;
                if (k7 == tVar) {
                    return e.f1790o;
                }
                if (k7 == e.f1784h) {
                    return e.f1790o;
                }
                if (k7 == e.f1787l) {
                    k();
                    return e.f1790o;
                }
                if (k7 != e.f1783g && kVar.j(i8, k7, e.f1782f)) {
                    boolean z3 = k7 instanceof s;
                    if (z3) {
                        k7 = ((s) k7).f1804a;
                    }
                    if (B(k7)) {
                        kVar.n(i8, e.i);
                        k();
                        Object obj3 = atomicReferenceArray.get(i8 * 2);
                        kVar.m(i8, null);
                        return obj3;
                    }
                    kVar.n(i8, tVar);
                    kVar.h();
                    if (z3) {
                        k();
                    }
                    return e.f1790o;
                }
            } else if (kVar.j(i8, k7, e.i)) {
                k();
                Object obj4 = atomicReferenceArray.get(i8 * 2);
                kVar.m(i8, null);
                return obj4;
            }
        }
    }

    public final int D(k kVar, int i8, Object obj, long j7, Object obj2, boolean z3) {
        while (true) {
            Object k3 = kVar.k(i8);
            if (k3 == null) {
                if (!e(j7) || z3) {
                    if (z3) {
                        if (kVar.j(i8, null, e.f1785j)) {
                            kVar.h();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (kVar.j(i8, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (kVar.j(i8, null, e.f1780d)) {
                    break;
                }
            } else {
                if (k3 != e.f1781e) {
                    t tVar = e.f1786k;
                    if (k3 == tVar) {
                        kVar.m(i8, null);
                        return 5;
                    }
                    if (k3 == e.f1784h) {
                        kVar.m(i8, null);
                        return 5;
                    }
                    if (k3 == e.f1787l) {
                        kVar.m(i8, null);
                        h();
                        return 4;
                    }
                    kVar.m(i8, null);
                    if (k3 instanceof s) {
                        k3 = ((s) k3).f1804a;
                    }
                    if (A(k3, obj)) {
                        kVar.n(i8, e.i);
                        return 0;
                    }
                    if (kVar.f1801f.getAndSet((i8 * 2) + 1, tVar) != tVar) {
                        kVar.l(i8, true);
                    }
                    return 5;
                }
                if (kVar.j(i8, k3, e.f1780d)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final void E(long j7) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        c cVar = this;
        if (cVar.v()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = f1769g;
            if (atomicLongFieldUpdater.get(cVar) > j7) {
                break;
            } else {
                cVar = this;
            }
        }
        int i8 = e.f1779c;
        int i9 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f1770h;
            if (i9 < i8) {
                long j8 = atomicLongFieldUpdater.get(cVar);
                if (j8 == (4611686018427387903L & atomicLongFieldUpdater2.get(cVar)) && j8 == atomicLongFieldUpdater.get(cVar)) {
                    return;
                } else {
                    i9++;
                }
            } else {
                while (true) {
                    long j9 = atomicLongFieldUpdater2.get(cVar);
                    if (atomicLongFieldUpdater2.compareAndSet(cVar, j9, (j9 & 4611686018427387903L) + 4611686018427387904L)) {
                        break;
                    } else {
                        cVar = this;
                    }
                }
                while (true) {
                    long j10 = atomicLongFieldUpdater.get(cVar);
                    long j11 = atomicLongFieldUpdater2.get(cVar);
                    long j12 = j11 & 4611686018427387903L;
                    boolean z3 = (j11 & 4611686018427387904L) != 0;
                    if (j10 == j12 && j10 == atomicLongFieldUpdater.get(cVar)) {
                        break;
                    }
                    if (z3) {
                        cVar = this;
                    } else {
                        cVar = this;
                        atomicLongFieldUpdater2.compareAndSet(cVar, j11, 4611686018427387904L + j12);
                    }
                }
                while (true) {
                    long j13 = atomicLongFieldUpdater2.get(cVar);
                    if (atomicLongFieldUpdater2.compareAndSet(cVar, j13, j13 & 4611686018427387903L)) {
                        return;
                    } else {
                        cVar = this;
                    }
                }
            }
        }
    }

    @Override // c7.q
    public final void a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        f(cancellationException, true);
    }

    public final boolean e(long j7) {
        return j7 < f1769g.get(this) || j7 < f1768f.get(this) + ((long) this.f1775d);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003c A[LOOP:2: B:17:0x003c->B:39:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e A[LOOP:3: B:22:0x006e->B:30:?, LOOP_LABEL: LOOP:3: B:22:0x006e->B:30:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004c A[LOOP:5: B:40:0x004c->B:48:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x002f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f(Throwable th, boolean z3) {
        c cVar;
        t tVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        boolean z7;
        long j7;
        long j8;
        long j9;
        Object obj;
        long j10;
        long j11;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f1767e;
        if (z3) {
            do {
                j11 = atomicLongFieldUpdater.get(this);
                if (((int) (j11 >> 60)) == 0) {
                    k kVar = e.f1777a;
                    cVar = this;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(cVar, j11, (j11 & 1152921504606846975L) + (1 << 60)));
            tVar = e.f1794s;
            while (true) {
                atomicReferenceFieldUpdater = f1773l;
                if (!atomicReferenceFieldUpdater.compareAndSet(this, tVar, th)) {
                    z7 = true;
                    break;
                }
                if (atomicReferenceFieldUpdater.get(this) != tVar) {
                    z7 = false;
                    break;
                }
            }
            if (z3) {
                do {
                    j7 = atomicLongFieldUpdater.get(this);
                    int i8 = (int) (j7 >> 60);
                    if (i8 == 0) {
                        j8 = j7 & 1152921504606846975L;
                        j9 = 2;
                    } else {
                        if (i8 != 1) {
                            break;
                        }
                        j8 = j7 & 1152921504606846975L;
                        j9 = 3;
                    }
                } while (!atomicLongFieldUpdater.compareAndSet(cVar, j7, (j9 << 60) + j8));
            } else {
                do {
                    j10 = atomicLongFieldUpdater.get(this);
                } while (!atomicLongFieldUpdater.compareAndSet(cVar, j10, (3 << 60) + (j10 & 1152921504606846975L)));
            }
            h();
            if (z7) {
                loop3: while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f1774m;
                    obj = atomicReferenceFieldUpdater2.get(this);
                    t tVar2 = obj == null ? e.f1792q : e.f1793r;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, tVar2)) {
                        if (atomicReferenceFieldUpdater2.get(this) != obj) {
                            break;
                        }
                    }
                }
                if (obj != null) {
                    v.c(1, obj);
                    ((p6.c) obj).i(m());
                    return z7;
                }
            }
            return z7;
        }
        cVar = this;
        tVar = e.f1794s;
        while (true) {
            atomicReferenceFieldUpdater = f1773l;
            if (!atomicReferenceFieldUpdater.compareAndSet(this, tVar, th)) {
            }
        }
        if (z3) {
        }
        h();
        if (z7) {
        }
        return z7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x008d, code lost:
    
        r1 = (c7.k) ((f7.b) f7.b.f2768b.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final k g(long j7) {
        Object obj;
        long j8;
        Object obj2 = f1772k.get(this);
        k kVar = (k) i.get(this);
        if (kVar.f2799c > ((k) obj2).f2799c) {
            obj2 = kVar;
        }
        k kVar2 = (k) f1771j.get(this);
        if (kVar2.f2799c > ((k) obj2).f2799c) {
            obj2 = kVar2;
        }
        f7.b bVar = (f7.b) obj2;
        loop0: while (true) {
            bVar.getClass();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7.b.f2767a;
            Object obj3 = atomicReferenceFieldUpdater.get(bVar);
            t tVar = f7.a.f2760a;
            obj = null;
            if (obj3 == tVar) {
                break;
            }
            f7.b bVar2 = (f7.b) obj3;
            if (bVar2 == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(bVar, null, tVar)) {
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
                int i8 = e.f1778b - 1;
                while (true) {
                    if (-1 >= i8) {
                        break;
                    }
                    j8 = (kVar4.f2799c * e.f1778b) + i8;
                    if (j8 < f1768f.get(this)) {
                        break loop2;
                    }
                    while (true) {
                        Object k3 = kVar4.k(i8);
                        if (k3 != null && k3 != e.f1781e) {
                            if (k3 == e.f1780d) {
                                break loop2;
                            }
                        } else {
                            if (kVar4.j(i8, k3, e.f1787l)) {
                                kVar4.h();
                                break;
                            }
                        }
                    }
                    i8--;
                }
            } while (kVar4 != null);
            j8 = -1;
            if (j8 != -1) {
                j(j8);
            }
        }
        loop5: for (k kVar5 = kVar3; kVar5 != null; kVar5 = (k) ((f7.b) f7.b.f2768b.get(kVar5))) {
            for (int i9 = e.f1778b - 1; -1 < i9; i9--) {
                if ((kVar5.f2799c * e.f1778b) + i9 < j7) {
                    break loop5;
                }
                while (true) {
                    Object k7 = kVar5.k(i9);
                    if (k7 != null && k7 != e.f1781e) {
                        if (!(k7 instanceof s)) {
                            if (!(k7 instanceof s1)) {
                                break;
                            }
                            if (kVar5.j(i9, k7, e.f1787l)) {
                                obj = f7.a.f(obj, k7);
                                kVar5.l(i9, true);
                                break;
                            }
                        } else {
                            if (kVar5.j(i9, k7, e.f1787l)) {
                                obj = f7.a.f(obj, ((s) k7).f1804a);
                                kVar5.l(i9, true);
                                break;
                            }
                        }
                    } else {
                        if (kVar5.j(i9, k7, e.f1787l)) {
                            kVar5.h();
                            break;
                        }
                    }
                }
            }
        }
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                z((s1) obj, true);
                return kVar3;
            }
            ArrayList arrayList = (ArrayList) obj;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                z((s1) arrayList.get(size), true);
            }
        }
        return kVar3;
    }

    public final void h() {
        r(f1767e.get(this), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0177, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x00c2, code lost:
    
        c(r1, r4, r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0163 A[RETURN] */
    @Override // c7.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object i(g6.c cVar, Object obj) {
        Object s5;
        Object obj2;
        c cVar2;
        k kVar;
        int i8;
        c cVar3 = this;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i;
        k kVar2 = (k) atomicReferenceFieldUpdater.get(cVar3);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f1767e;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(cVar3);
            long j7 = andIncrement & 1152921504606846975L;
            boolean r7 = cVar3.r(andIncrement, false);
            int i9 = e.f1778b;
            long j8 = i9;
            long j9 = j7 / j8;
            int i10 = (int) (j7 % j8);
            long j10 = kVar2.f2799c;
            h6.a aVar = h6.a.f3204d;
            c6.m mVar = c6.m.f1757a;
            if (j10 != j9) {
                k b8 = b(cVar3, j9, kVar2);
                if (b8 != null) {
                    kVar2 = b8;
                } else if (r7) {
                    Object y7 = y(cVar, obj);
                    if (y7 == aVar) {
                        return y7;
                    }
                }
            }
            int d8 = d(cVar3, kVar2, i10, obj, j7, null, r7);
            if (d8 == 0) {
                kVar2.a();
                return mVar;
            }
            if (d8 == 1) {
                break;
            }
            if (d8 != 2) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = f1768f;
                if (d8 == 3) {
                    a7.h i11 = x.i(m.a.G(cVar));
                    Object obj3 = obj;
                    try {
                        int d9 = d(cVar3, kVar2, i10, obj3, j7, i11, false);
                        try {
                            if (d9 != 0) {
                                if (d9 == 1) {
                                    i11.k(mVar);
                                } else if (d9 != 2) {
                                    if (d9 != 4) {
                                        String str = "unexpected";
                                        if (d9 != 5) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        kVar2.a();
                                        k kVar3 = (k) atomicReferenceFieldUpdater.get(cVar3);
                                        while (true) {
                                            long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(cVar3);
                                            long j11 = andIncrement2 & 1152921504606846975L;
                                            boolean r8 = cVar3.r(andIncrement2, false);
                                            int i12 = e.f1778b;
                                            long j12 = i12;
                                            String str2 = str;
                                            long j13 = j11 / j12;
                                            int i13 = (int) (j11 % j12);
                                            if (kVar3.f2799c != j13) {
                                                k b9 = b(cVar3, j13, kVar3);
                                                if (b9 != null) {
                                                    i8 = i12;
                                                    kVar = b9;
                                                } else {
                                                    if (r8) {
                                                        break;
                                                    }
                                                    str = str2;
                                                }
                                            } else {
                                                kVar = kVar3;
                                                i8 = i12;
                                            }
                                            int d10 = d(cVar3, kVar, i13, obj3, j11, i11, r8);
                                            Object obj4 = obj3;
                                            cVar2 = cVar3;
                                            k kVar4 = kVar;
                                            obj2 = obj4;
                                            if (d10 == 0) {
                                                kVar4.a();
                                                break;
                                            }
                                            if (d10 == 1) {
                                                break;
                                            }
                                            if (d10 != 2) {
                                                if (d10 == 3) {
                                                    throw new IllegalStateException(str2);
                                                }
                                                if (d10 != 4) {
                                                    if (d10 == 5) {
                                                        kVar4.a();
                                                    }
                                                    kVar3 = kVar4;
                                                    cVar3 = cVar2;
                                                    str = str2;
                                                    obj3 = obj2;
                                                } else if (j11 < atomicLongFieldUpdater2.get(cVar2)) {
                                                    kVar4.a();
                                                }
                                            } else if (r8) {
                                                kVar4.h();
                                            } else {
                                                i11.a(kVar4, i13 + i8);
                                            }
                                        }
                                    } else {
                                        obj2 = obj3;
                                        cVar2 = cVar3;
                                        if (j7 < atomicLongFieldUpdater2.get(cVar2)) {
                                            kVar2.a();
                                        }
                                    }
                                    c(cVar2, obj2, i11);
                                } else {
                                    i11.a(kVar2, i10 + i9);
                                }
                                s5 = i11.s();
                                if (s5 != aVar) {
                                    s5 = mVar;
                                }
                                if (s5 != aVar) {
                                    return s5;
                                }
                            } else {
                                kVar2.a();
                            }
                            i11.k(mVar);
                            s5 = i11.s();
                            if (s5 != aVar) {
                            }
                            if (s5 != aVar) {
                            }
                        } catch (Throwable th) {
                            th = th;
                            i11.B();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else if (d8 == 4) {
                    if (j7 < atomicLongFieldUpdater2.get(cVar3)) {
                        kVar2.a();
                    }
                    Object y8 = y(cVar, obj);
                    if (y8 == aVar) {
                        return y8;
                    }
                } else if (d8 == 5) {
                    kVar2.a();
                }
            } else if (r7) {
                kVar2.h();
                Object y9 = y(cVar, obj);
                if (y9 == aVar) {
                    return y9;
                }
            }
        }
    }

    @Override // c7.q
    public final b iterator() {
        return new b(this);
    }

    public final void j(long j7) {
        k kVar = (k) f1771j.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f1768f;
            long j8 = atomicLongFieldUpdater.get(this);
            if (j7 < Math.max(this.f1775d + j8, f1769g.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j8, 1 + j8)) {
                long j9 = e.f1778b;
                long j10 = j8 / j9;
                int i8 = (int) (j8 % j9);
                if (kVar.f2799c != j10) {
                    k l3 = l(j10, kVar);
                    if (l3 != null) {
                        kVar = l3;
                    }
                }
                k kVar2 = kVar;
                if (C(kVar2, i8, j8, null) != e.f1790o) {
                    kVar2.a();
                } else if (j8 < p()) {
                    kVar2.a();
                }
                kVar = kVar2;
            }
        }
    }

    public final void k() {
        Object b8;
        if (v()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1772k;
        k kVar = (k) atomicReferenceFieldUpdater.get(this);
        loop0: while (true) {
            long andIncrement = f1769g.getAndIncrement(this);
            long j7 = andIncrement / e.f1778b;
            if (p() <= andIncrement) {
                if (kVar.f2799c < j7 && kVar.b() != null) {
                    w(j7, kVar);
                }
                q(this);
                return;
            }
            if (kVar.f2799c != j7) {
                d dVar = d.f1776l;
                while (true) {
                    b8 = f7.a.b(kVar, j7, dVar);
                    if (!f7.a.e(b8)) {
                        f7.r c8 = f7.a.c(b8);
                        while (true) {
                            f7.r rVar = (f7.r) atomicReferenceFieldUpdater.get(this);
                            if (rVar.f2799c >= c8.f2799c) {
                                break;
                            }
                            if (!c8.i()) {
                                break;
                            }
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, rVar, c8)) {
                                if (atomicReferenceFieldUpdater.get(this) != rVar) {
                                    if (c8.e()) {
                                        c8.d();
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
                if (f7.a.e(b8)) {
                    h();
                    w(j7, kVar);
                    q(this);
                } else {
                    k kVar3 = (k) f7.a.c(b8);
                    long j8 = kVar3.f2799c;
                    if (j8 > j7) {
                        long j9 = j8 * e.f1778b;
                        if (f1769g.compareAndSet(this, 1 + andIncrement, j9)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = f1770h;
                            if ((atomicLongFieldUpdater.addAndGet(this, j9 - andIncrement) & 4611686018427387904L) != 0) {
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
            int i8 = (int) (andIncrement % e.f1778b);
            Object k3 = kVar.k(i8);
            boolean z3 = k3 instanceof s1;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f1768f;
            if (!z3 || andIncrement < atomicLongFieldUpdater2.get(this) || !kVar.j(i8, k3, e.f1783g)) {
                while (true) {
                    Object k7 = kVar.k(i8);
                    if (!(k7 instanceof s1)) {
                        if (k7 != e.f1785j) {
                            if (k7 != null) {
                                if (k7 == e.f1780d || k7 == e.f1784h || k7 == e.i || k7 == e.f1786k || k7 == e.f1787l) {
                                    break loop0;
                                }
                                if (k7 != e.f1782f) {
                                    throw new IllegalStateException(("Unexpected cell state: " + k7).toString());
                                }
                            } else if (kVar.j(i8, k7, e.f1781e)) {
                                break loop0;
                            }
                        } else {
                            break;
                        }
                    } else if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                        if (kVar.j(i8, k7, new s((s1) k7))) {
                            break loop0;
                        }
                    } else if (kVar.j(i8, k7, e.f1783g)) {
                        if (B(k7)) {
                            kVar.n(i8, e.f1780d);
                            break;
                        } else {
                            kVar.n(i8, e.f1785j);
                            kVar.h();
                        }
                    }
                }
            } else if (B(k3)) {
                kVar.n(i8, e.f1780d);
                break;
            } else {
                kVar.n(i8, e.f1785j);
                kVar.h();
                q(this);
            }
        }
        q(this);
    }

    public final k l(long j7, k kVar) {
        Object b8;
        long j8;
        k kVar2 = e.f1777a;
        d dVar = d.f1776l;
        loop0: while (true) {
            b8 = f7.a.b(kVar, j7, dVar);
            if (!f7.a.e(b8)) {
                f7.r c8 = f7.a.c(b8);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1771j;
                    f7.r rVar = (f7.r) atomicReferenceFieldUpdater.get(this);
                    if (rVar.f2799c >= c8.f2799c) {
                        break loop0;
                    }
                    if (!c8.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, rVar, c8)) {
                        if (atomicReferenceFieldUpdater.get(this) != rVar) {
                            if (c8.e()) {
                                c8.d();
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
        if (f7.a.e(b8)) {
            h();
            if (kVar.f2799c * e.f1778b < p()) {
                kVar.a();
                return null;
            }
        } else {
            k kVar3 = (k) f7.a.c(b8);
            long j9 = kVar3.f2799c;
            if (!v() && j7 <= f1769g.get(this) / e.f1778b) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f1772k;
                    f7.r rVar2 = (f7.r) atomicReferenceFieldUpdater2.get(this);
                    if (rVar2.f2799c >= j9 || !kVar3.i()) {
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
            if (j9 <= j7) {
                return kVar3;
            }
            long j10 = j9 * e.f1778b;
            do {
                j8 = f1768f.get(this);
                if (j8 >= j10) {
                    break;
                }
            } while (!f1768f.compareAndSet(this, j8, j10));
            if (j9 * e.f1778b < p()) {
                kVar3.a();
            }
        }
        return null;
    }

    public final Throwable m() {
        return (Throwable) f1773l.get(this);
    }

    public final Throwable n() {
        Throwable m7 = m();
        return m7 == null ? new l("Channel was closed") : m7;
    }

    public final Throwable o() {
        Throwable m7 = m();
        return m7 == null ? new m("Channel was closed") : m7;
    }

    public final long p() {
        return f1767e.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x00a2, code lost:
    
        r0 = (c7.k) ((f7.b) f7.b.f2768b.get(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean r(long j7, boolean z3) {
        int i8 = (int) (j7 >> 60);
        if (i8 != 0 && i8 != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f1768f;
            if (i8 == 2) {
                g(1152921504606846975L & j7);
                if (z3) {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1771j;
                        k kVar = (k) atomicReferenceFieldUpdater.get(this);
                        long j8 = atomicLongFieldUpdater.get(this);
                        if (p() <= j8) {
                            break;
                        }
                        long j9 = e.f1778b;
                        long j10 = j8 / j9;
                        if (kVar.f2799c != j10 && (kVar = l(j10, kVar)) == null) {
                            if (((k) atomicReferenceFieldUpdater.get(this)).f2799c < j10) {
                                break;
                            }
                        } else {
                            kVar.a();
                            int i9 = (int) (j8 % j9);
                            while (true) {
                                Object k3 = kVar.k(i9);
                                if (k3 == null || k3 == e.f1781e) {
                                    if (kVar.j(i9, k3, e.f1784h)) {
                                        k();
                                        break;
                                    }
                                } else {
                                    if (k3 == e.f1780d) {
                                        break;
                                    }
                                    if (k3 != e.f1785j) {
                                        if (k3 != e.f1787l) {
                                            if (k3 != e.i) {
                                                if (k3 != e.f1784h) {
                                                    if (k3 == e.f1783g) {
                                                        break;
                                                    }
                                                    if (k3 != e.f1782f && j8 == atomicLongFieldUpdater.get(this)) {
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            f1768f.compareAndSet(this, j8, j8 + 1);
                        }
                    }
                }
            } else {
                if (i8 != 3) {
                    throw new IllegalStateException(a0.q.h("unexpected close status: ", i8).toString());
                }
                k g3 = g(1152921504606846975L & j7);
                Object obj = null;
                loop0: do {
                    int i10 = e.f1778b - 1;
                    while (true) {
                        if (-1 >= i10) {
                            break;
                        }
                        long j11 = (g3.f2799c * e.f1778b) + i10;
                        while (true) {
                            Object k7 = g3.k(i10);
                            if (k7 == e.i) {
                                break loop0;
                            }
                            if (k7 == e.f1780d) {
                                if (j11 < atomicLongFieldUpdater.get(this)) {
                                    break loop0;
                                }
                                if (g3.j(i10, k7, e.f1787l)) {
                                    g3.m(i10, null);
                                    g3.h();
                                    break;
                                }
                            } else if (k7 != e.f1781e && k7 != null) {
                                if (!(k7 instanceof s1) && !(k7 instanceof s)) {
                                    t tVar = e.f1783g;
                                    if (k7 == tVar || k7 == e.f1782f) {
                                        break loop0;
                                    }
                                    if (k7 != tVar) {
                                        break;
                                    }
                                } else {
                                    if (j11 < atomicLongFieldUpdater.get(this)) {
                                        break loop0;
                                    }
                                    s1 s1Var = k7 instanceof s ? ((s) k7).f1804a : (s1) k7;
                                    if (g3.j(i10, k7, e.f1787l)) {
                                        obj = f7.a.f(obj, s1Var);
                                        g3.m(i10, null);
                                        g3.h();
                                        break;
                                    }
                                }
                            } else if (g3.j(i10, k7, e.f1787l)) {
                                g3.h();
                                break;
                            }
                        }
                        i10--;
                    }
                } while (g3 != null);
                if (obj != null) {
                    if (obj instanceof ArrayList) {
                        ArrayList arrayList = (ArrayList) obj;
                        for (int size = arrayList.size() - 1; -1 < size; size--) {
                            z((s1) arrayList.get(size), false);
                        }
                    } else {
                        z((s1) obj, false);
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // c7.q
    public final Object s() {
        k kVar;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f1768f;
        long j7 = atomicLongFieldUpdater.get(this);
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f1767e;
        long j8 = atomicLongFieldUpdater2.get(this);
        if (r(j8, true)) {
            return new h(m());
        }
        long j9 = j8 & 1152921504606846975L;
        i iVar = j.f1799a;
        if (j7 >= j9) {
            return iVar;
        }
        Object obj = e.f1786k;
        k kVar2 = (k) f1771j.get(this);
        while (!r(atomicLongFieldUpdater2.get(this), true)) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j10 = e.f1778b;
            long j11 = andIncrement / j10;
            int i8 = (int) (andIncrement % j10);
            if (kVar2.f2799c != j11) {
                k l3 = l(j11, kVar2);
                if (l3 == null) {
                    continue;
                } else {
                    kVar = l3;
                }
            } else {
                kVar = kVar2;
            }
            Object C = C(kVar, i8, andIncrement, obj);
            k kVar3 = kVar;
            if (C == e.f1788m) {
                s1 s1Var = obj instanceof s1 ? (s1) obj : null;
                if (s1Var != null) {
                    s1Var.a(kVar3, i8);
                }
                E(andIncrement);
                kVar3.h();
                return iVar;
            }
            if (C != e.f1790o) {
                if (C == e.f1789n) {
                    throw new IllegalStateException("unexpected");
                }
                kVar3.a();
                return C;
            }
            if (andIncrement < p()) {
                kVar3.a();
            }
            kVar2 = kVar3;
        }
        return new h(m());
    }

    @Override // c7.r
    public Object t(Object obj) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f1767e;
        boolean z3 = false;
        long j7 = 1152921504606846975L;
        boolean z7 = r(atomicLongFieldUpdater.get(this), false) ? false : !e(r1 & 1152921504606846975L);
        i iVar = j.f1799a;
        if (z7) {
            return iVar;
        }
        Object obj2 = e.f1785j;
        k kVar = (k) i.get(this);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j8 = andIncrement & j7;
            boolean r7 = r(andIncrement, z3);
            int i8 = e.f1778b;
            long j9 = i8;
            long j10 = j8 / j9;
            int i9 = (int) (j8 % j9);
            if (kVar.f2799c != j10) {
                k b8 = b(this, j10, kVar);
                if (b8 != null) {
                    kVar = b8;
                } else {
                    if (r7) {
                        return new h(o());
                    }
                    z3 = false;
                    j7 = 1152921504606846975L;
                }
            }
            int d8 = d(this, kVar, i9, obj, j8, obj2, r7);
            c6.m mVar = c6.m.f1757a;
            if (d8 == 0) {
                kVar.a();
                return mVar;
            }
            if (d8 == 1) {
                return mVar;
            }
            if (d8 == 2) {
                if (r7) {
                    kVar.h();
                    return new h(o());
                }
                s1 s1Var = obj2 instanceof s1 ? (s1) obj2 : null;
                if (s1Var != null) {
                    s1Var.a(kVar, i9 + i8);
                }
                kVar.h();
                return iVar;
            }
            if (d8 == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (d8 == 4) {
                if (j8 < f1768f.get(this)) {
                    kVar.a();
                }
                return new h(o());
            }
            if (d8 == 5) {
                kVar.a();
            }
            z3 = false;
            j7 = 1152921504606846975L;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x0194, code lost:
    
        r16 = r7;
        r3 = (c7.k) r3.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x019d, code lost:
    
        if (r3 != null) goto L83;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        boolean z3;
        String str;
        StringBuilder sb = new StringBuilder();
        int i8 = (int) (f1767e.get(this) >> 60);
        if (i8 == 2) {
            sb.append("closed,");
        } else if (i8 == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.f1775d + ',');
        sb.append("data=[");
        int i9 = 0;
        boolean z7 = true;
        List y7 = s6.a.y(f1771j.get(this), i.get(this), f1772k.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj : y7) {
            if (((k) obj) != e.f1777a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j7 = ((k) next).f2799c;
            do {
                Object next2 = it.next();
                long j8 = ((k) next2).f2799c;
                if (j7 > j8) {
                    next = next2;
                    j7 = j8;
                }
            } while (it.hasNext());
        }
        k kVar = (k) next;
        long j9 = f1768f.get(this);
        long p7 = p();
        loop2: while (true) {
            int i10 = e.f1778b;
            int i11 = i9;
            while (true) {
                if (i11 >= i10) {
                    break;
                }
                long j10 = (kVar.f2799c * e.f1778b) + i11;
                if (j10 >= p7 && j10 >= j9) {
                    break loop2;
                }
                Object k3 = kVar.k(i11);
                boolean z8 = z7;
                Object obj2 = kVar.f1801f.get(i11 * 2);
                if (k3 instanceof a7.f) {
                    str = (j10 >= j9 || j10 < p7) ? (j10 >= p7 || j10 < j9) ? "cont" : "send" : "receive";
                } else if (k3 instanceof s) {
                    str = "EB(" + k3 + ')';
                } else if (q6.i.a(k3, e.f1782f) || q6.i.a(k3, e.f1783g)) {
                    str = "resuming_sender";
                } else {
                    if (k3 != null && !k3.equals(e.f1781e) && !k3.equals(e.i) && !k3.equals(e.f1784h) && !k3.equals(e.f1786k) && !k3.equals(e.f1785j) && !k3.equals(e.f1787l)) {
                        str = k3.toString();
                    }
                    i11++;
                    z7 = z8;
                }
                if (obj2 != null) {
                    sb.append("(" + str + ',' + obj2 + "),");
                } else {
                    sb.append(str + ',');
                }
                i11++;
                z7 = z8;
            }
            z7 = z3;
            i9 = 0;
        }
        if (sb.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        if (sb.charAt(y6.j.b0(sb)) == ',') {
            q6.i.d(sb.deleteCharAt(sb.length() - 1), "deleteCharAt(...)");
        }
        sb.append("]");
        return sb.toString();
    }

    public boolean u() {
        return false;
    }

    public final boolean v() {
        long j7 = f1769g.get(this);
        return j7 == 0 || j7 == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w(long j7, k kVar) {
        k kVar2;
        k kVar3;
        while (kVar.f2799c < j7 && (kVar3 = (k) kVar.b()) != null) {
            kVar = kVar3;
        }
        while (true) {
            if (!kVar.c() || (kVar2 = (k) kVar.b()) == null) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1772k;
                    f7.r rVar = (f7.r) atomicReferenceFieldUpdater.get(this);
                    if (rVar.f2799c >= kVar.f2799c) {
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

    @Override // c7.q
    public final Object x(i6.i iVar) {
        k kVar;
        c cVar = this;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1771j;
        k kVar2 = (k) atomicReferenceFieldUpdater.get(cVar);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f1767e;
            if (cVar.r(atomicLongFieldUpdater.get(cVar), true)) {
                Throwable n6 = n();
                int i8 = f7.s.f2800a;
                throw n6;
            }
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f1768f;
            long andIncrement = atomicLongFieldUpdater2.getAndIncrement(cVar);
            long j7 = e.f1778b;
            long j8 = andIncrement / j7;
            int i9 = (int) (andIncrement % j7);
            if (kVar2.f2799c != j8) {
                k l3 = cVar.l(j8, kVar2);
                if (l3 == null) {
                    continue;
                } else {
                    kVar2 = l3;
                }
            }
            Object C = cVar.C(kVar2, i9, andIncrement, null);
            t tVar = e.f1788m;
            if (C == tVar) {
                throw new IllegalStateException("unexpected");
            }
            t tVar2 = e.f1790o;
            if (C != tVar2) {
                if (C != e.f1789n) {
                    kVar2.a();
                    return C;
                }
                a7.h i10 = x.i(m.a.G(iVar));
                c cVar2 = this;
                try {
                    Object C2 = cVar2.C(kVar2, i9, andIncrement, i10);
                    if (C2 == tVar) {
                        i10.a(kVar2, i9);
                    } else if (C2 == tVar2) {
                        if (andIncrement < cVar2.p()) {
                            kVar2.a();
                        }
                        k kVar3 = (k) atomicReferenceFieldUpdater.get(cVar2);
                        while (true) {
                            if (cVar2.r(atomicLongFieldUpdater.get(cVar2), true)) {
                                i10.k(s6.a.l(cVar2.n()));
                                break;
                            }
                            long andIncrement2 = atomicLongFieldUpdater2.getAndIncrement(cVar2);
                            long j9 = e.f1778b;
                            long j10 = andIncrement2 / j9;
                            int i11 = (int) (andIncrement2 % j9);
                            if (kVar3.f2799c != j10) {
                                kVar = cVar2.l(j10, kVar3);
                                if (kVar == null) {
                                }
                            } else {
                                kVar = kVar3;
                            }
                            Object C3 = cVar2.C(kVar, i11, andIncrement2, i10);
                            if (C3 == e.f1788m) {
                                i10.a(kVar, i11);
                                break;
                            }
                            if (C3 == e.f1790o) {
                                if (andIncrement2 < p()) {
                                    kVar.a();
                                }
                                cVar2 = this;
                                kVar3 = kVar;
                            } else {
                                if (C3 == e.f1789n) {
                                    throw new IllegalStateException("unexpected");
                                }
                                kVar.a();
                                i10.C(C3, null);
                            }
                        }
                    } else {
                        kVar2.a();
                        i10.C(C2, null);
                    }
                    return i10.s();
                } catch (Throwable th) {
                    i10.B();
                    throw th;
                }
            }
            if (andIncrement < p()) {
                kVar2.a();
            }
            cVar = this;
        }
    }

    public final Object y(g6.c cVar, Object obj) {
        a7.h hVar = new a7.h(1, m.a.G(cVar));
        hVar.t();
        hVar.k(s6.a.l(o()));
        Object s5 = hVar.s();
        return s5 == h6.a.f3204d ? s5 : c6.m.f1757a;
    }

    public final void z(s1 s1Var, boolean z3) {
        if (s1Var instanceof a7.f) {
            ((g6.c) s1Var).k(s6.a.l(z3 ? n() : o()));
            return;
        }
        if (!(s1Var instanceof b)) {
            throw new IllegalStateException(("Unexpected waiter: " + s1Var).toString());
        }
        b bVar = (b) s1Var;
        a7.h hVar = bVar.f1765e;
        q6.i.b(hVar);
        bVar.f1765e = null;
        bVar.f1764d = e.f1787l;
        Throwable m7 = bVar.f1766f.m();
        if (m7 == null) {
            hVar.k(Boolean.FALSE);
        } else {
            hVar.k(s6.a.l(m7));
        }
    }
}
