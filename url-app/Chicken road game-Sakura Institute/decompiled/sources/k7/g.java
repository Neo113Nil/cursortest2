package k7;

import d6.z;
import h7.q;
import h7.s;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public class g {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5383b = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "head$volatile");

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f5384c = AtomicLongFieldUpdater.newUpdater(g.class, "deqIdx$volatile");

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5385d = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "tail$volatile");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f5386e = AtomicLongFieldUpdater.newUpdater(g.class, "enqIdx$volatile");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f5387f = AtomicIntegerFieldUpdater.newUpdater(g.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final c7.g f5388a;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    public g() {
        i iVar = new i(0L, null, 2);
        this.head$volatile = iVar;
        this.tail$volatile = iVar;
        this._availablePermits$volatile = 1;
        this.f5388a = new c7.g(2, this);
    }

    public final void a(b bVar) {
        Object b9;
        i iVar;
        c7.h hVar = bVar.f5377f;
        c cVar = bVar.f5378g;
        while (true) {
            int andDecrement = f5387f.getAndDecrement(this);
            if (andDecrement <= 1) {
                z zVar = z.f2639a;
                if (andDecrement > 0) {
                    c.f5379g.set(cVar, null);
                    hVar.B(zVar, hVar.f1691h, new c7.g(0, new g4.b(cVar, bVar)));
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5385d;
                i iVar2 = (i) atomicReferenceFieldUpdater.get(this);
                long andIncrement = f5386e.getAndIncrement(this);
                e eVar = e.f5381n;
                long j8 = andIncrement / h.f5394f;
                while (true) {
                    b9 = h7.a.b(iVar2, j8, eVar);
                    if (!h7.a.e(b9)) {
                        q c4 = h7.a.c(b9);
                        while (true) {
                            q qVar = (q) atomicReferenceFieldUpdater.get(this);
                            iVar = iVar2;
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
                                    iVar2 = iVar;
                                }
                            }
                            if (qVar.e()) {
                                qVar.d();
                            }
                        }
                    } else {
                        break;
                    }
                    iVar2 = iVar;
                }
                i iVar3 = (i) h7.a.c(b9);
                AtomicReferenceArray atomicReferenceArray = iVar3.f5395e;
                int i7 = (int) (andIncrement % h.f5394f);
                while (!atomicReferenceArray.compareAndSet(i7, null, bVar)) {
                    if (atomicReferenceArray.get(i7) != null) {
                        s sVar = h.f5390b;
                        s sVar2 = h.f5391c;
                        while (!atomicReferenceArray.compareAndSet(i7, sVar, sVar2)) {
                            if (atomicReferenceArray.get(i7) != sVar) {
                                break;
                            }
                        }
                        c.f5379g.set(cVar, null);
                        hVar.B(zVar, hVar.f1691h, new c7.g(0, new g4.b(cVar, bVar)));
                        return;
                    }
                }
                bVar.a(iVar3, i7);
                return;
            }
        }
    }

    public final void b() {
        boolean z8;
        int i7;
        Object b9;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f5387f;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            z8 = true;
            if (andIncrement >= 1) {
                do {
                    i7 = atomicIntegerFieldUpdater.get(this);
                    if (i7 <= 1) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i7, 1));
                throw new IllegalStateException("The number of released permits cannot be greater than 1".toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5383b;
            i iVar = (i) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = f5384c.getAndIncrement(this);
            long j8 = andIncrement2 / h.f5394f;
            f fVar = f.f5382n;
            while (true) {
                b9 = h7.a.b(iVar, j8, fVar);
                if (!h7.a.e(b9)) {
                    q c4 = h7.a.c(b9);
                    while (true) {
                        q qVar = (q) atomicReferenceFieldUpdater.get(this);
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
            i iVar2 = (i) h7.a.c(b9);
            AtomicReferenceArray atomicReferenceArray = iVar2.f5395e;
            iVar2.a();
            boolean z9 = false;
            if (iVar2.f4704c <= j8) {
                int i8 = (int) (andIncrement2 % h.f5394f);
                Object andSet = atomicReferenceArray.getAndSet(i8, h.f5390b);
                if (andSet == null) {
                    int i9 = h.f5389a;
                    int i10 = 0;
                    while (true) {
                        if (i10 >= i9) {
                            s sVar = h.f5390b;
                            s sVar2 = h.f5392d;
                            while (true) {
                                if (atomicReferenceArray.compareAndSet(i8, sVar, sVar2)) {
                                    z9 = true;
                                    break;
                                } else if (atomicReferenceArray.get(i8) != sVar) {
                                    break;
                                }
                            }
                            z8 = true ^ z9;
                        } else if (atomicReferenceArray.get(i8) == h.f5391c) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                } else if (andSet != h.f5393e) {
                    if (!(andSet instanceof c7.f)) {
                        throw new IllegalStateException(("unexpected: " + andSet).toString());
                    }
                    c7.f fVar2 = (c7.f) andSet;
                    s o2 = fVar2.o(z.f2639a, this.f5388a);
                    if (o2 != null) {
                        fVar2.l(o2);
                    }
                }
            }
            z8 = false;
        } while (!z8);
    }
}
