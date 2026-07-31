package s2;

import L1.z;
import j1.p;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k2.C0535g;
import k2.InterfaceC0534f;
import p2.s;

/* loaded from: classes.dex */
public class g {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7557b = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "head$volatile");

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f7558c = AtomicLongFieldUpdater.newUpdater(g.class, "deqIdx$volatile");

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7559d = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "tail$volatile");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f7560e = AtomicLongFieldUpdater.newUpdater(g.class, "enqIdx$volatile");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7561f = AtomicIntegerFieldUpdater.newUpdater(g.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final C0535g f7562a;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    public g(int i3) {
        if (i3 < 0 || i3 > 1) {
            throw new IllegalArgumentException("The number of acquired permits should be in 0..1".toString());
        }
        i iVar = new i(0L, null, 2);
        this.head$volatile = iVar;
        this.tail$volatile = iVar;
        this._availablePermits$volatile = 1 - i3;
        this.f7562a = new C0535g(1, this);
    }

    public final void a(b bVar) {
        Object d3;
        e eVar;
        long j3;
        while (true) {
            int andDecrement = f7561f.getAndDecrement(this);
            if (andDecrement <= 1) {
                Object obj = z.f2729a;
                Y1.f fVar = this.f7562a;
                if (andDecrement > 0) {
                    bVar.n(obj, fVar);
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7559d;
                i iVar = (i) atomicReferenceFieldUpdater.get(this);
                long andIncrement = f7560e.getAndIncrement(this);
                e eVar2 = e.f7555l;
                long j4 = andIncrement / h.f7568f;
                while (true) {
                    d3 = p2.a.d(iVar, j4, eVar2);
                    if (!p2.a.g(d3)) {
                        s e3 = p2.a.e(d3);
                        while (true) {
                            s sVar = (s) atomicReferenceFieldUpdater.get(this);
                            eVar = eVar2;
                            j3 = j4;
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
                                    eVar2 = eVar;
                                    j4 = j3;
                                }
                            }
                            if (sVar.e()) {
                                sVar.d();
                            }
                        }
                    } else {
                        break;
                    }
                    eVar2 = eVar;
                    j4 = j3;
                }
                i iVar2 = (i) p2.a.e(d3);
                int i3 = (int) (andIncrement % h.f7568f);
                AtomicReferenceArray atomicReferenceArray = iVar2.f7569e;
                while (!atomicReferenceArray.compareAndSet(i3, null, bVar)) {
                    if (atomicReferenceArray.get(i3) != null) {
                        p pVar = h.f7564b;
                        p pVar2 = h.f7565c;
                        while (!atomicReferenceArray.compareAndSet(i3, pVar, pVar2)) {
                            if (atomicReferenceArray.get(i3) != pVar) {
                                break;
                            }
                        }
                        bVar.n(obj, fVar);
                        return;
                    }
                }
                bVar.a(iVar2, i3);
                return;
            }
        }
    }

    public final void b() {
        boolean z3;
        int i3;
        Object d3;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f7561f;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            z3 = true;
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
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7557b;
            i iVar = (i) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = f7558c.getAndIncrement(this);
            long j3 = andIncrement2 / h.f7568f;
            f fVar = f.f7556l;
            while (true) {
                d3 = p2.a.d(iVar, j3, fVar);
                if (!p2.a.g(d3)) {
                    s e3 = p2.a.e(d3);
                    while (true) {
                        s sVar = (s) atomicReferenceFieldUpdater.get(this);
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
            i iVar2 = (i) p2.a.e(d3);
            iVar2.a();
            boolean z4 = false;
            if (iVar2.f6806c <= j3) {
                int i4 = (int) (andIncrement2 % h.f7568f);
                p pVar = h.f7564b;
                AtomicReferenceArray atomicReferenceArray = iVar2.f7569e;
                Object andSet = atomicReferenceArray.getAndSet(i4, pVar);
                if (andSet == null) {
                    int i5 = h.f7563a;
                    int i6 = 0;
                    while (true) {
                        if (i6 >= i5) {
                            p pVar2 = h.f7564b;
                            p pVar3 = h.f7566d;
                            while (true) {
                                if (atomicReferenceArray.compareAndSet(i4, pVar2, pVar3)) {
                                    z4 = true;
                                    break;
                                } else if (atomicReferenceArray.get(i4) != pVar2) {
                                    break;
                                }
                            }
                            z3 = true ^ z4;
                        } else if (atomicReferenceArray.get(i4) == h.f7565c) {
                            break;
                        } else {
                            i6++;
                        }
                    }
                } else if (andSet != h.f7567e) {
                    if (!(andSet instanceof InterfaceC0534f)) {
                        throw new IllegalStateException(("unexpected: " + andSet).toString());
                    }
                    InterfaceC0534f interfaceC0534f = (InterfaceC0534f) andSet;
                    p i7 = interfaceC0534f.i(z.f2729a, this.f7562a);
                    if (i7 != null) {
                        interfaceC0534f.t(i7);
                    }
                }
            }
            z3 = false;
        } while (!z3);
    }
}
