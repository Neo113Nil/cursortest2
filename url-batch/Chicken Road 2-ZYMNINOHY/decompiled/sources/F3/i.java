package F3;

import C3.t;
import C3.v;
import c3.C0297i;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import x3.C1546f;
import x3.InterfaceC1545e;

/* loaded from: classes.dex */
public class i {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f801b = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "head$volatile");

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f802c = AtomicLongFieldUpdater.newUpdater(i.class, "deqIdx$volatile");

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f803d = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "tail$volatile");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f804e = AtomicLongFieldUpdater.newUpdater(i.class, "enqIdx$volatile");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f805f = AtomicIntegerFieldUpdater.newUpdater(i.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final g f806a;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    public i() {
        k kVar = new k(0L, null, 2);
        this.head$volatile = kVar;
        this.tail$volatile = kVar;
        this._availablePermits$volatile = 1;
        this.f806a = new g(0, this);
    }

    public final void a(c cVar) {
        Object a3;
        k kVar;
        C1546f c1546f = cVar.f793a;
        d dVar = cVar.f794b;
        while (true) {
            int andDecrement = f805f.getAndDecrement(this);
            if (andDecrement <= 1) {
                C0297i c0297i = C0297i.f5732a;
                if (andDecrement > 0) {
                    d.f795g.set(dVar, null);
                    c1546f.y(c0297i, new b(dVar, cVar, 0));
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f803d;
                k kVar2 = (k) atomicReferenceFieldUpdater.get(this);
                long andIncrement = f804e.getAndIncrement(this);
                f fVar = f.f797a;
                long j4 = andIncrement / j.f812f;
                while (true) {
                    a3 = C3.a.a(kVar2, j4, fVar);
                    if (!C3.a.d(a3)) {
                        t b4 = C3.a.b(a3);
                        while (true) {
                            t tVar = (t) atomicReferenceFieldUpdater.get(this);
                            kVar = kVar2;
                            if (tVar.f318c >= b4.f318c) {
                                break;
                            }
                            if (!b4.i()) {
                                break;
                            }
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, tVar, b4)) {
                                if (atomicReferenceFieldUpdater.get(this) != tVar) {
                                    if (b4.e()) {
                                        b4.d();
                                    }
                                    kVar2 = kVar;
                                }
                            }
                            if (tVar.e()) {
                                tVar.d();
                            }
                        }
                    } else {
                        break;
                    }
                    kVar2 = kVar;
                }
                k kVar3 = (k) C3.a.b(a3);
                AtomicReferenceArray atomicReferenceArray = kVar3.f813e;
                int i4 = (int) (andIncrement % j.f812f);
                while (!atomicReferenceArray.compareAndSet(i4, null, cVar)) {
                    if (atomicReferenceArray.get(i4) != null) {
                        v vVar = j.f808b;
                        v vVar2 = j.f809c;
                        while (!atomicReferenceArray.compareAndSet(i4, vVar, vVar2)) {
                            if (atomicReferenceArray.get(i4) != vVar) {
                                break;
                            }
                        }
                        d.f795g.set(dVar, null);
                        c1546f.y(c0297i, new b(dVar, cVar, 0));
                        return;
                    }
                }
                cVar.a(kVar3, i4);
                return;
            }
        }
    }

    public final void b() {
        boolean z;
        int i4;
        Object a3;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f805f;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            z = true;
            if (andIncrement >= 1) {
                do {
                    i4 = atomicIntegerFieldUpdater.get(this);
                    if (i4 <= 1) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i4, 1));
                throw new IllegalStateException("The number of released permits cannot be greater than 1".toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f801b;
            k kVar = (k) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = f802c.getAndIncrement(this);
            long j4 = andIncrement2 / j.f812f;
            h hVar = h.f800a;
            while (true) {
                a3 = C3.a.a(kVar, j4, hVar);
                if (!C3.a.d(a3)) {
                    t b4 = C3.a.b(a3);
                    while (true) {
                        t tVar = (t) atomicReferenceFieldUpdater.get(this);
                        if (tVar.f318c >= b4.f318c) {
                            break;
                        }
                        if (!b4.i()) {
                            break;
                        }
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, tVar, b4)) {
                            if (atomicReferenceFieldUpdater.get(this) != tVar) {
                                if (b4.e()) {
                                    b4.d();
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
            k kVar2 = (k) C3.a.b(a3);
            AtomicReferenceArray atomicReferenceArray = kVar2.f813e;
            kVar2.a();
            boolean z4 = false;
            if (kVar2.f318c <= j4) {
                int i5 = (int) (andIncrement2 % j.f812f);
                Object andSet = atomicReferenceArray.getAndSet(i5, j.f808b);
                if (andSet == null) {
                    int i6 = j.f807a;
                    int i7 = 0;
                    while (true) {
                        if (i7 >= i6) {
                            v vVar = j.f808b;
                            v vVar2 = j.f810d;
                            while (true) {
                                if (atomicReferenceArray.compareAndSet(i5, vVar, vVar2)) {
                                    z4 = true;
                                    break;
                                } else if (atomicReferenceArray.get(i5) != vVar) {
                                    break;
                                }
                            }
                            z = true ^ z4;
                        } else if (atomicReferenceArray.get(i5) == j.f809c) {
                            break;
                        } else {
                            i7++;
                        }
                    }
                } else if (andSet != j.f811e) {
                    if (!(andSet instanceof InterfaceC1545e)) {
                        throw new IllegalStateException(("unexpected: " + andSet).toString());
                    }
                    InterfaceC1545e interfaceC1545e = (InterfaceC1545e) andSet;
                    v c4 = interfaceC1545e.c(C0297i.f5732a, this.f806a);
                    if (c4 != null) {
                        interfaceC1545e.i(c4);
                    }
                }
            }
            z = false;
        } while (!z);
    }
}
