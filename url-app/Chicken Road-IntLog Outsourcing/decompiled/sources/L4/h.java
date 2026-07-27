package L4;

import D4.InterfaceC0006f;
import F4.o;
import G0.C0051a;
import I4.u;
import f4.v;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import t4.InterfaceC1441l;

/* loaded from: classes.dex */
public class h {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1533b = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "head");

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f1534c = AtomicLongFieldUpdater.newUpdater(h.class, "deqIdx");

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1535d = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "tail");

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f1536e = AtomicLongFieldUpdater.newUpdater(h.class, "enqIdx");

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1537f = AtomicIntegerFieldUpdater.newUpdater(h.class, "_availablePermits");
    private volatile int _availablePermits;

    /* renamed from: a, reason: collision with root package name */
    public final o f1538a;
    private volatile long deqIdx;
    private volatile long enqIdx;
    private volatile Object head;
    private volatile Object tail;

    public h(int i2) {
        if (i2 < 0 || i2 > 1) {
            throw new IllegalArgumentException("The number of acquired permits should be in 0..1".toString());
        }
        j jVar = new j(0L, null, 2);
        this.head = jVar;
        this.tail = jVar;
        this._availablePermits = 1 - i2;
        this.f1538a = new o(2, this);
    }

    public final void a(c cVar) {
        Object c2;
        f fVar;
        long j2;
        while (true) {
            int andDecrement = f1537f.getAndDecrement(this);
            if (andDecrement <= 1) {
                Object obj = v.f5689a;
                InterfaceC1441l interfaceC1441l = this.f1538a;
                if (andDecrement > 0) {
                    cVar.f(obj, interfaceC1441l);
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1535d;
                j jVar = (j) atomicReferenceFieldUpdater.get(this);
                long andIncrement = f1536e.getAndIncrement(this);
                f fVar2 = f.f1531a;
                long j6 = andIncrement / i.f1544f;
                while (true) {
                    c2 = I4.a.c(jVar, j6, fVar2);
                    if (!I4.a.f(c2)) {
                        u d6 = I4.a.d(c2);
                        while (true) {
                            u uVar = (u) atomicReferenceFieldUpdater.get(this);
                            fVar = fVar2;
                            j2 = j6;
                            if (uVar.f1323c >= d6.f1323c) {
                                break;
                            }
                            if (!d6.i()) {
                                break;
                            }
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, uVar, d6)) {
                                if (atomicReferenceFieldUpdater.get(this) != uVar) {
                                    if (d6.e()) {
                                        d6.d();
                                    }
                                    fVar2 = fVar;
                                    j6 = j2;
                                }
                            }
                            if (uVar.e()) {
                                uVar.d();
                            }
                        }
                    } else {
                        break;
                    }
                    fVar2 = fVar;
                    j6 = j2;
                }
                j jVar2 = (j) I4.a.d(c2);
                int i2 = (int) (andIncrement % i.f1544f);
                AtomicReferenceArray atomicReferenceArray = jVar2.f1545e;
                while (!atomicReferenceArray.compareAndSet(i2, null, cVar)) {
                    if (atomicReferenceArray.get(i2) != null) {
                        C0051a c0051a = i.f1540b;
                        C0051a c0051a2 = i.f1541c;
                        while (!atomicReferenceArray.compareAndSet(i2, c0051a, c0051a2)) {
                            if (atomicReferenceArray.get(i2) != c0051a) {
                                break;
                            }
                        }
                        cVar.f(obj, interfaceC1441l);
                        return;
                    }
                }
                cVar.a(jVar2, i2);
                return;
            }
        }
    }

    public final void b() {
        boolean z;
        int i2;
        Object c2;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1537f;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            z = true;
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
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1533b;
            j jVar = (j) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = f1534c.getAndIncrement(this);
            long j2 = andIncrement2 / i.f1544f;
            g gVar = g.f1532a;
            while (true) {
                c2 = I4.a.c(jVar, j2, gVar);
                if (!I4.a.f(c2)) {
                    u d6 = I4.a.d(c2);
                    while (true) {
                        u uVar = (u) atomicReferenceFieldUpdater.get(this);
                        if (uVar.f1323c >= d6.f1323c) {
                            break;
                        }
                        if (!d6.i()) {
                            break;
                        }
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, uVar, d6)) {
                            if (atomicReferenceFieldUpdater.get(this) != uVar) {
                                if (d6.e()) {
                                    d6.d();
                                }
                            }
                        }
                        if (uVar.e()) {
                            uVar.d();
                        }
                    }
                } else {
                    break;
                }
            }
            j jVar2 = (j) I4.a.d(c2);
            jVar2.a();
            boolean z5 = false;
            if (jVar2.f1323c <= j2) {
                int i3 = (int) (andIncrement2 % i.f1544f);
                C0051a c0051a = i.f1540b;
                AtomicReferenceArray atomicReferenceArray = jVar2.f1545e;
                Object andSet = atomicReferenceArray.getAndSet(i3, c0051a);
                if (andSet == null) {
                    int i6 = i.f1539a;
                    int i7 = 0;
                    while (true) {
                        if (i7 >= i6) {
                            C0051a c0051a2 = i.f1540b;
                            C0051a c0051a3 = i.f1542d;
                            while (true) {
                                if (atomicReferenceArray.compareAndSet(i3, c0051a2, c0051a3)) {
                                    z5 = true;
                                    break;
                                } else if (atomicReferenceArray.get(i3) != c0051a2) {
                                    break;
                                }
                            }
                            z = true ^ z5;
                        } else if (atomicReferenceArray.get(i3) == i.f1541c) {
                            break;
                        } else {
                            i7++;
                        }
                    }
                } else if (andSet != i.f1543e) {
                    if (!(andSet instanceof InterfaceC0006f)) {
                        throw new IllegalStateException(("unexpected: " + andSet).toString());
                    }
                    InterfaceC0006f interfaceC0006f = (InterfaceC0006f) andSet;
                    C0051a d7 = interfaceC0006f.d(v.f5689a, this.f1538a);
                    if (d7 != null) {
                        interfaceC0006f.j(d7);
                    }
                }
            }
            z = false;
        } while (!z);
    }
}
