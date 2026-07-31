package e1;

import B0.E;
import F.L;
import W0.C0066f;
import W0.InterfaceC0065e;
import b1.AbstractC0115a;
import b1.v;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class h {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1875b = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "head");

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f1876c = AtomicLongFieldUpdater.newUpdater(h.class, "deqIdx");

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1877d = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "tail");

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f1878e = AtomicLongFieldUpdater.newUpdater(h.class, "enqIdx");

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1879f = AtomicIntegerFieldUpdater.newUpdater(h.class, "_availablePermits");
    private volatile int _availablePermits;

    /* renamed from: a, reason: collision with root package name */
    public final L f1880a;
    private volatile long deqIdx;
    private volatile long enqIdx;
    private volatile Object head;
    private volatile Object tail;

    public h() {
        j jVar = new j(0L, null, 2);
        this.head = jVar;
        this.tail = jVar;
        this._availablePermits = 1;
        this.f1880a = new L(3, this);
    }

    public final void a(c cVar) {
        Object a2;
        j jVar;
        C0066f c0066f = cVar.f1869e;
        d dVar = cVar.f1870f;
        while (true) {
            int andDecrement = f1879f.getAndDecrement(this);
            if (andDecrement <= 1) {
                D0.h hVar = D0.h.f206a;
                if (andDecrement > 0) {
                    d.f1871g.set(dVar, null);
                    c0066f.B(hVar, new b(dVar, cVar, 0));
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1877d;
                j jVar2 = (j) atomicReferenceFieldUpdater.get(this);
                long andIncrement = f1878e.getAndIncrement(this);
                f fVar = f.f1873m;
                long j2 = andIncrement / i.f1886f;
                while (true) {
                    a2 = AbstractC0115a.a(jVar2, j2, fVar);
                    if (!AbstractC0115a.d(a2)) {
                        v b2 = AbstractC0115a.b(a2);
                        while (true) {
                            v vVar = (v) atomicReferenceFieldUpdater.get(this);
                            jVar = jVar2;
                            if (vVar.f1777g >= b2.f1777g) {
                                break;
                            }
                            if (!b2.i()) {
                                break;
                            }
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, vVar, b2)) {
                                if (atomicReferenceFieldUpdater.get(this) != vVar) {
                                    if (b2.e()) {
                                        b2.d();
                                    }
                                    jVar2 = jVar;
                                }
                            }
                            if (vVar.e()) {
                                vVar.d();
                            }
                        }
                    } else {
                        break;
                    }
                    jVar2 = jVar;
                }
                j jVar3 = (j) AbstractC0115a.b(a2);
                AtomicReferenceArray atomicReferenceArray = jVar3.f1887i;
                int i2 = (int) (andIncrement % i.f1886f);
                while (!atomicReferenceArray.compareAndSet(i2, null, cVar)) {
                    if (atomicReferenceArray.get(i2) != null) {
                        E e2 = i.f1882b;
                        E e3 = i.f1883c;
                        while (!atomicReferenceArray.compareAndSet(i2, e2, e3)) {
                            if (atomicReferenceArray.get(i2) != e2) {
                                break;
                            }
                        }
                        d.f1871g.set(dVar, null);
                        c0066f.B(hVar, new b(dVar, cVar, 0));
                        return;
                    }
                }
                cVar.a(jVar3, i2);
                return;
            }
        }
    }

    public final void b() {
        boolean z2;
        int i2;
        Object a2;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1879f;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            z2 = true;
            if (andIncrement >= 1) {
                do {
                    i2 = atomicIntegerFieldUpdater.get(this);
                    if (i2 <= 1) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 1));
                throw new IllegalStateException("The number of released permits cannot be greater than 1".toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1875b;
            j jVar = (j) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = f1876c.getAndIncrement(this);
            long j2 = andIncrement2 / i.f1886f;
            g gVar = g.f1874m;
            while (true) {
                a2 = AbstractC0115a.a(jVar, j2, gVar);
                if (!AbstractC0115a.d(a2)) {
                    v b2 = AbstractC0115a.b(a2);
                    while (true) {
                        v vVar = (v) atomicReferenceFieldUpdater.get(this);
                        if (vVar.f1777g >= b2.f1777g) {
                            break;
                        }
                        if (!b2.i()) {
                            break;
                        }
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, vVar, b2)) {
                            if (atomicReferenceFieldUpdater.get(this) != vVar) {
                                if (b2.e()) {
                                    b2.d();
                                }
                            }
                        }
                        if (vVar.e()) {
                            vVar.d();
                        }
                    }
                } else {
                    break;
                }
            }
            j jVar2 = (j) AbstractC0115a.b(a2);
            AtomicReferenceArray atomicReferenceArray = jVar2.f1887i;
            jVar2.a();
            boolean z3 = false;
            if (jVar2.f1777g <= j2) {
                int i3 = (int) (andIncrement2 % i.f1886f);
                Object andSet = atomicReferenceArray.getAndSet(i3, i.f1882b);
                if (andSet == null) {
                    int i4 = i.f1881a;
                    int i5 = 0;
                    while (true) {
                        if (i5 >= i4) {
                            E e2 = i.f1882b;
                            E e3 = i.f1884d;
                            while (true) {
                                if (atomicReferenceArray.compareAndSet(i3, e2, e3)) {
                                    z3 = true;
                                    break;
                                } else if (atomicReferenceArray.get(i3) != e2) {
                                    break;
                                }
                            }
                            z2 = true ^ z3;
                        } else if (atomicReferenceArray.get(i3) == i.f1883c) {
                            break;
                        } else {
                            i5++;
                        }
                    }
                } else if (andSet != i.f1885e) {
                    if (!(andSet instanceof InterfaceC0065e)) {
                        throw new IllegalStateException(("unexpected: " + andSet).toString());
                    }
                    InterfaceC0065e interfaceC0065e = (InterfaceC0065e) andSet;
                    E f2 = interfaceC0065e.f(D0.h.f206a, this.f1880a);
                    if (f2 != null) {
                        interfaceC0065e.n(f2);
                    }
                }
            }
            z2 = false;
        } while (!z2);
    }
}
