package B2;

import b2.C0195i;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import n0.C1148j;
import t2.C1196f;
import t2.InterfaceC1195e;
import y2.t;

/* loaded from: classes.dex */
public class i {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f177b = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "head$volatile");

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f178c = AtomicLongFieldUpdater.newUpdater(i.class, "deqIdx$volatile");

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f179d = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "tail$volatile");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f180e = AtomicLongFieldUpdater.newUpdater(i.class, "enqIdx$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater f = AtomicIntegerFieldUpdater.newUpdater(i.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final g f181a;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    public i() {
        k kVar = new k(0L, null, 2);
        this.head$volatile = kVar;
        this.tail$volatile = kVar;
        this._availablePermits$volatile = 1;
        this.f181a = new g(0, this);
    }

    public final void a(c cVar) {
        Object a3;
        C1196f c1196f;
        while (true) {
            int andDecrement = f.getAndDecrement(this);
            if (andDecrement <= 1) {
                C0195i c0195i = C0195i.f2555a;
                C1196f c1196f2 = cVar.f170a;
                d dVar = cVar.f171b;
                if (andDecrement > 0) {
                    d.f172g.set(dVar, null);
                    c1196f2.A(c0195i, new b(dVar, 0, cVar));
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f179d;
                k kVar = (k) atomicReferenceFieldUpdater.get(this);
                long andIncrement = f180e.getAndIncrement(this);
                f fVar = f.f174a;
                long j3 = andIncrement / j.f;
                while (true) {
                    a3 = y2.a.a(kVar, j3, fVar);
                    if (!y2.a.d(a3)) {
                        t b3 = y2.a.b(a3);
                        while (true) {
                            t tVar = (t) atomicReferenceFieldUpdater.get(this);
                            c1196f = c1196f2;
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
                                    c1196f2 = c1196f;
                                }
                            }
                            if (tVar.e()) {
                                tVar.d();
                            }
                        }
                    } else {
                        c1196f = c1196f2;
                        break;
                    }
                    c1196f2 = c1196f;
                }
                k kVar2 = (k) y2.a.b(a3);
                int i3 = (int) (andIncrement % j.f);
                AtomicReferenceArray atomicReferenceArray = kVar2.f187e;
                while (!atomicReferenceArray.compareAndSet(i3, null, cVar)) {
                    if (atomicReferenceArray.get(i3) != null) {
                        C1148j c1148j = j.f183b;
                        C1148j c1148j2 = j.f184c;
                        while (!atomicReferenceArray.compareAndSet(i3, c1148j, c1148j2)) {
                            C1196f c1196f3 = c1196f;
                            if (atomicReferenceArray.get(i3) != c1148j) {
                                break;
                            } else {
                                c1196f = c1196f3;
                            }
                        }
                        d.f172g.set(dVar, null);
                        c1196f.A(c0195i, new b(dVar, 0, cVar));
                        return;
                    }
                }
                cVar.a(kVar2, i3);
                return;
            }
        }
    }

    public final void b() {
        boolean z;
        int i3;
        Object a3;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            z = true;
            if (andIncrement >= 1) {
                do {
                    i3 = atomicIntegerFieldUpdater.get(this);
                    if (i3 <= 1) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, 1));
                throw new IllegalStateException("The number of released permits cannot be greater than 1".toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f177b;
            k kVar = (k) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = f178c.getAndIncrement(this);
            long j3 = andIncrement2 / j.f;
            h hVar = h.f176a;
            while (true) {
                a3 = y2.a.a(kVar, j3, hVar);
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
            k kVar2 = (k) y2.a.b(a3);
            kVar2.a();
            boolean z2 = false;
            if (kVar2.f10866c <= j3) {
                int i4 = (int) (andIncrement2 % j.f);
                C1148j c1148j = j.f183b;
                AtomicReferenceArray atomicReferenceArray = kVar2.f187e;
                Object andSet = atomicReferenceArray.getAndSet(i4, c1148j);
                if (andSet == null) {
                    int i5 = j.f182a;
                    int i6 = 0;
                    while (true) {
                        if (i6 >= i5) {
                            C1148j c1148j2 = j.f183b;
                            C1148j c1148j3 = j.f185d;
                            while (true) {
                                if (atomicReferenceArray.compareAndSet(i4, c1148j2, c1148j3)) {
                                    z2 = true;
                                    break;
                                } else if (atomicReferenceArray.get(i4) != c1148j2) {
                                    break;
                                }
                            }
                            z = true ^ z2;
                        } else if (atomicReferenceArray.get(i4) == j.f184c) {
                            break;
                        } else {
                            i6++;
                        }
                    }
                } else if (andSet != j.f186e) {
                    if (!(andSet instanceof InterfaceC1195e)) {
                        throw new IllegalStateException(("unexpected: " + andSet).toString());
                    }
                    InterfaceC1195e interfaceC1195e = (InterfaceC1195e) andSet;
                    C1148j d3 = interfaceC1195e.d(C0195i.f2555a, this.f181a);
                    if (d3 != null) {
                        interfaceC1195e.m(d3);
                    }
                }
            }
            z = false;
        } while (!z);
    }
}
