package i7;

import a0.t;
import c6.m;
import f7.r;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public class g {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3472b = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "head$volatile");

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f3473c = AtomicLongFieldUpdater.newUpdater(g.class, "deqIdx$volatile");

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3474d = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "tail$volatile");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f3475e = AtomicLongFieldUpdater.newUpdater(g.class, "enqIdx$volatile");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3476f = AtomicIntegerFieldUpdater.newUpdater(g.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final a7.g f3477a;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    public g() {
        i iVar = new i(0L, null, 2);
        this.head$volatile = iVar;
        this.tail$volatile = iVar;
        this._availablePermits$volatile = 1;
        this.f3477a = new a7.g(7, this);
    }

    public final void a(b bVar) {
        Object b8;
        i iVar;
        a7.h hVar = bVar.f3466d;
        c cVar = bVar.f3467e;
        while (true) {
            int andDecrement = f3476f.getAndDecrement(this);
            if (andDecrement <= 1) {
                m mVar = m.f1757a;
                if (andDecrement > 0) {
                    c.f3468g.set(cVar, null);
                    hVar.D(mVar, hVar.f247f, new a7.g(0, new t(8, cVar, bVar)));
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3474d;
                i iVar2 = (i) atomicReferenceFieldUpdater.get(this);
                long andIncrement = f3475e.getAndIncrement(this);
                e eVar = e.f3470l;
                long j7 = andIncrement / h.f3483f;
                while (true) {
                    b8 = f7.a.b(iVar2, j7, eVar);
                    if (!f7.a.e(b8)) {
                        r c8 = f7.a.c(b8);
                        while (true) {
                            r rVar = (r) atomicReferenceFieldUpdater.get(this);
                            iVar = iVar2;
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
                                    iVar2 = iVar;
                                }
                            }
                            if (rVar.e()) {
                                rVar.d();
                            }
                        }
                    } else {
                        break;
                    }
                    iVar2 = iVar;
                }
                i iVar3 = (i) f7.a.c(b8);
                AtomicReferenceArray atomicReferenceArray = iVar3.f3484e;
                int i = (int) (andIncrement % h.f3483f);
                while (!atomicReferenceArray.compareAndSet(i, null, bVar)) {
                    if (atomicReferenceArray.get(i) != null) {
                        d4.t tVar = h.f3479b;
                        d4.t tVar2 = h.f3480c;
                        while (!atomicReferenceArray.compareAndSet(i, tVar, tVar2)) {
                            if (atomicReferenceArray.get(i) != tVar) {
                                break;
                            }
                        }
                        c.f3468g.set(cVar, null);
                        hVar.D(mVar, hVar.f247f, new a7.g(0, new t(8, cVar, bVar)));
                        return;
                    }
                }
                bVar.a(iVar3, i);
                return;
            }
        }
    }

    public final void b() {
        boolean z3;
        int i;
        Object b8;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f3476f;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            z3 = true;
            if (andIncrement >= 1) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i <= 1) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 1));
                throw new IllegalStateException("The number of released permits cannot be greater than 1".toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3472b;
            i iVar = (i) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = f3473c.getAndIncrement(this);
            long j7 = andIncrement2 / h.f3483f;
            f fVar = f.f3471l;
            while (true) {
                b8 = f7.a.b(iVar, j7, fVar);
                if (!f7.a.e(b8)) {
                    r c8 = f7.a.c(b8);
                    while (true) {
                        r rVar = (r) atomicReferenceFieldUpdater.get(this);
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
            i iVar2 = (i) f7.a.c(b8);
            AtomicReferenceArray atomicReferenceArray = iVar2.f3484e;
            iVar2.a();
            boolean z7 = false;
            if (iVar2.f2799c <= j7) {
                int i8 = (int) (andIncrement2 % h.f3483f);
                Object andSet = atomicReferenceArray.getAndSet(i8, h.f3479b);
                if (andSet == null) {
                    int i9 = h.f3478a;
                    int i10 = 0;
                    while (true) {
                        if (i10 >= i9) {
                            d4.t tVar = h.f3479b;
                            d4.t tVar2 = h.f3481d;
                            while (true) {
                                if (atomicReferenceArray.compareAndSet(i8, tVar, tVar2)) {
                                    z7 = true;
                                    break;
                                } else if (atomicReferenceArray.get(i8) != tVar) {
                                    break;
                                }
                            }
                            z3 = true ^ z7;
                        } else if (atomicReferenceArray.get(i8) == h.f3480c) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                } else if (andSet != h.f3482e) {
                    if (!(andSet instanceof a7.f)) {
                        throw new IllegalStateException(("unexpected: " + andSet).toString());
                    }
                    a7.f fVar2 = (a7.f) andSet;
                    d4.t o2 = fVar2.o(m.f1757a, this.f3477a);
                    if (o2 != null) {
                        fVar2.A(o2);
                    }
                }
            }
            z3 = false;
        } while (!z3);
    }
}
