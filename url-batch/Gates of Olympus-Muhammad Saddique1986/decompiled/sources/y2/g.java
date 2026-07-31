package y2;

import R1.y;
import e2.InterfaceC0427f;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m1.q;
import q2.C0820g;
import q2.InterfaceC0819f;
import v2.r;

/* loaded from: classes.dex */
public class g {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f10403b = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "head$volatile");

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f10404c = AtomicLongFieldUpdater.newUpdater(g.class, "deqIdx$volatile");

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f10405d = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "tail$volatile");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f10406e = AtomicLongFieldUpdater.newUpdater(g.class, "enqIdx$volatile");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f10407f = AtomicIntegerFieldUpdater.newUpdater(g.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final C0820g f10408a;
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
        this.f10408a = new C0820g(1, this);
    }

    public final void a(b bVar) {
        Object d3;
        e eVar;
        long j3;
        while (true) {
            int andDecrement = f10407f.getAndDecrement(this);
            if (andDecrement <= 1) {
                Object obj = y.f4171a;
                InterfaceC0427f interfaceC0427f = this.f10408a;
                if (andDecrement > 0) {
                    bVar.m(obj, interfaceC0427f);
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10405d;
                i iVar = (i) atomicReferenceFieldUpdater.get(this);
                long andIncrement = f10406e.getAndIncrement(this);
                e eVar2 = e.f10401l;
                long j4 = andIncrement / h.f10414f;
                while (true) {
                    d3 = v2.a.d(iVar, j4, eVar2);
                    if (!v2.a.g(d3)) {
                        r e3 = v2.a.e(d3);
                        while (true) {
                            r rVar = (r) atomicReferenceFieldUpdater.get(this);
                            eVar = eVar2;
                            j3 = j4;
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
                                    eVar2 = eVar;
                                    j4 = j3;
                                }
                            }
                            if (rVar.e()) {
                                rVar.d();
                            }
                        }
                    } else {
                        break;
                    }
                    eVar2 = eVar;
                    j4 = j3;
                }
                i iVar2 = (i) v2.a.e(d3);
                int i3 = (int) (andIncrement % h.f10414f);
                AtomicReferenceArray atomicReferenceArray = iVar2.f10415e;
                while (!atomicReferenceArray.compareAndSet(i3, null, bVar)) {
                    if (atomicReferenceArray.get(i3) != null) {
                        q qVar = h.f10410b;
                        q qVar2 = h.f10411c;
                        while (!atomicReferenceArray.compareAndSet(i3, qVar, qVar2)) {
                            if (atomicReferenceArray.get(i3) != qVar) {
                                break;
                            }
                        }
                        bVar.m(obj, interfaceC0427f);
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
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f10407f;
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
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10403b;
            i iVar = (i) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = f10404c.getAndIncrement(this);
            long j3 = andIncrement2 / h.f10414f;
            f fVar = f.f10402l;
            while (true) {
                d3 = v2.a.d(iVar, j3, fVar);
                if (!v2.a.g(d3)) {
                    r e3 = v2.a.e(d3);
                    while (true) {
                        r rVar = (r) atomicReferenceFieldUpdater.get(this);
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
            i iVar2 = (i) v2.a.e(d3);
            iVar2.a();
            boolean z4 = false;
            if (iVar2.f9826c <= j3) {
                int i4 = (int) (andIncrement2 % h.f10414f);
                q qVar = h.f10410b;
                AtomicReferenceArray atomicReferenceArray = iVar2.f10415e;
                Object andSet = atomicReferenceArray.getAndSet(i4, qVar);
                if (andSet == null) {
                    int i5 = h.f10409a;
                    int i6 = 0;
                    while (true) {
                        if (i6 >= i5) {
                            q qVar2 = h.f10410b;
                            q qVar3 = h.f10412d;
                            while (true) {
                                if (atomicReferenceArray.compareAndSet(i4, qVar2, qVar3)) {
                                    z4 = true;
                                    break;
                                } else if (atomicReferenceArray.get(i4) != qVar2) {
                                    break;
                                }
                            }
                            z3 = true ^ z4;
                        } else if (atomicReferenceArray.get(i4) == h.f10411c) {
                            break;
                        } else {
                            i6++;
                        }
                    }
                } else if (andSet != h.f10413e) {
                    if (!(andSet instanceof InterfaceC0819f)) {
                        throw new IllegalStateException(("unexpected: " + andSet).toString());
                    }
                    InterfaceC0819f interfaceC0819f = (InterfaceC0819f) andSet;
                    q j4 = interfaceC0819f.j(y.f4171a, this.f10408a);
                    if (j4 != null) {
                        interfaceC0819f.B(j4);
                    }
                }
            }
            z3 = false;
        } while (!z3);
    }
}
