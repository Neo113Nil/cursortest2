package P5;

import H5.C0147g;
import H5.InterfaceC0146f;
import J5.o;
import M5.t;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k5.v;

/* loaded from: classes.dex */
public class h {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1889b = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "head");

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f1890c = AtomicLongFieldUpdater.newUpdater(h.class, "deqIdx");

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1891d = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "tail");

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f1892e = AtomicLongFieldUpdater.newUpdater(h.class, "enqIdx");

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1893f = AtomicIntegerFieldUpdater.newUpdater(h.class, "_availablePermits");
    private volatile int _availablePermits;

    /* renamed from: a, reason: collision with root package name */
    public final o f1894a;
    private volatile long deqIdx;
    private volatile long enqIdx;
    private volatile Object head;
    private volatile Object tail;

    public h() {
        j jVar = new j(0L, null, 2);
        this.head = jVar;
        this.tail = jVar;
        this._availablePermits = 1;
        this.f1894a = new o(1, this);
    }

    public final void a(c cVar) {
        Object b7;
        j jVar;
        C0147g c0147g = cVar.f1883f;
        d dVar = cVar.f1884g;
        while (true) {
            int andDecrement = f1893f.getAndDecrement(this);
            if (andDecrement <= 1) {
                v vVar = v.f5219a;
                if (andDecrement > 0) {
                    d.f1885g.set(dVar, null);
                    c0147g.z(vVar, new b(dVar, cVar, 0));
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1891d;
                j jVar2 = (j) atomicReferenceFieldUpdater.get(this);
                long andIncrement = f1892e.getAndIncrement(this);
                f fVar = f.f1887f;
                long j4 = andIncrement / i.f1900f;
                while (true) {
                    b7 = M5.a.b(jVar2, j4, fVar);
                    if (!M5.a.e(b7)) {
                        t c7 = M5.a.c(b7);
                        while (true) {
                            t tVar = (t) atomicReferenceFieldUpdater.get(this);
                            jVar = jVar2;
                            if (tVar.f1622h >= c7.f1622h) {
                                break;
                            }
                            if (!c7.i()) {
                                break;
                            }
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, tVar, c7)) {
                                if (atomicReferenceFieldUpdater.get(this) != tVar) {
                                    if (c7.e()) {
                                        c7.d();
                                    }
                                    jVar2 = jVar;
                                }
                            }
                            if (tVar.e()) {
                                tVar.d();
                            }
                        }
                    } else {
                        break;
                    }
                    jVar2 = jVar;
                }
                j jVar3 = (j) M5.a.c(b7);
                AtomicReferenceArray atomicReferenceArray = jVar3.f1901j;
                int i7 = (int) (andIncrement % i.f1900f);
                while (!atomicReferenceArray.compareAndSet(i7, null, cVar)) {
                    if (atomicReferenceArray.get(i7) != null) {
                        M5.v vVar2 = i.f1896b;
                        M5.v vVar3 = i.f1897c;
                        while (!atomicReferenceArray.compareAndSet(i7, vVar2, vVar3)) {
                            if (atomicReferenceArray.get(i7) != vVar2) {
                                break;
                            }
                        }
                        d.f1885g.set(dVar, null);
                        c0147g.z(vVar, new b(dVar, cVar, 0));
                        return;
                    }
                }
                cVar.a(jVar3, i7);
                return;
            }
        }
    }

    public final void b() {
        boolean z5;
        int i7;
        Object b7;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1893f;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            z5 = true;
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
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1889b;
            j jVar = (j) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = f1890c.getAndIncrement(this);
            long j4 = andIncrement2 / i.f1900f;
            g gVar = g.f1888f;
            while (true) {
                b7 = M5.a.b(jVar, j4, gVar);
                if (!M5.a.e(b7)) {
                    t c7 = M5.a.c(b7);
                    while (true) {
                        t tVar = (t) atomicReferenceFieldUpdater.get(this);
                        if (tVar.f1622h >= c7.f1622h) {
                            break;
                        }
                        if (!c7.i()) {
                            break;
                        }
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, tVar, c7)) {
                            if (atomicReferenceFieldUpdater.get(this) != tVar) {
                                if (c7.e()) {
                                    c7.d();
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
            j jVar2 = (j) M5.a.c(b7);
            AtomicReferenceArray atomicReferenceArray = jVar2.f1901j;
            jVar2.a();
            boolean z6 = false;
            if (jVar2.f1622h <= j4) {
                int i8 = (int) (andIncrement2 % i.f1900f);
                Object andSet = atomicReferenceArray.getAndSet(i8, i.f1896b);
                if (andSet == null) {
                    int i9 = i.f1895a;
                    int i10 = 0;
                    while (true) {
                        if (i10 >= i9) {
                            M5.v vVar = i.f1896b;
                            M5.v vVar2 = i.f1898d;
                            while (true) {
                                if (atomicReferenceArray.compareAndSet(i8, vVar, vVar2)) {
                                    z6 = true;
                                    break;
                                } else if (atomicReferenceArray.get(i8) != vVar) {
                                    break;
                                }
                            }
                            z5 = true ^ z6;
                        } else if (atomicReferenceArray.get(i8) == i.f1897c) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                } else if (andSet != i.f1899e) {
                    if (!(andSet instanceof InterfaceC0146f)) {
                        throw new IllegalStateException(("unexpected: " + andSet).toString());
                    }
                    InterfaceC0146f interfaceC0146f = (InterfaceC0146f) andSet;
                    M5.v f7 = interfaceC0146f.f(v.f5219a, this.f1894a);
                    if (f7 != null) {
                        interfaceC0146f.i(f7);
                    }
                }
            }
            z5 = false;
        } while (!z5);
    }
}
