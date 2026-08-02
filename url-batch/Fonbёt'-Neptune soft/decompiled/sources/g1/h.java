package g1;

import B.m;
import D0.P;
import P0.l;
import Y0.InterfaceC0111e;
import d1.AbstractC0184a;
import d1.v;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class h {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f2233b = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "head");

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f2234c = AtomicLongFieldUpdater.newUpdater(h.class, "deqIdx");

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f2235d = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "tail");

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f2236e = AtomicLongFieldUpdater.newUpdater(h.class, "enqIdx");

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f2237f = AtomicIntegerFieldUpdater.newUpdater(h.class, "_availablePermits");
    private volatile int _availablePermits;

    /* renamed from: a, reason: collision with root package name */
    public final P f2238a;
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
        this.f2238a = new P(4, this);
    }

    public final void a(c cVar) {
        Object b2;
        f fVar;
        long j2;
        while (true) {
            int andDecrement = f2237f.getAndDecrement(this);
            if (andDecrement <= 1) {
                Object obj = F0.h.f469a;
                l lVar = this.f2238a;
                if (andDecrement > 0) {
                    cVar.o(obj, lVar);
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2235d;
                j jVar = (j) atomicReferenceFieldUpdater.get(this);
                long andIncrement = f2236e.getAndIncrement(this);
                f fVar2 = f.f2231m;
                long j3 = andIncrement / i.f2244f;
                while (true) {
                    b2 = AbstractC0184a.b(jVar, j3, fVar2);
                    if (!AbstractC0184a.e(b2)) {
                        v c2 = AbstractC0184a.c(b2);
                        while (true) {
                            v vVar = (v) atomicReferenceFieldUpdater.get(this);
                            fVar = fVar2;
                            j2 = j3;
                            if (vVar.f2107g >= c2.f2107g) {
                                break;
                            }
                            if (!c2.i()) {
                                break;
                            }
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, vVar, c2)) {
                                if (atomicReferenceFieldUpdater.get(this) != vVar) {
                                    if (c2.e()) {
                                        c2.d();
                                    }
                                    fVar2 = fVar;
                                    j3 = j2;
                                }
                            }
                            if (vVar.e()) {
                                vVar.d();
                            }
                        }
                    } else {
                        break;
                    }
                    fVar2 = fVar;
                    j3 = j2;
                }
                j jVar2 = (j) AbstractC0184a.c(b2);
                int i2 = (int) (andIncrement % i.f2244f);
                AtomicReferenceArray atomicReferenceArray = jVar2.f2245i;
                while (!atomicReferenceArray.compareAndSet(i2, null, cVar)) {
                    if (atomicReferenceArray.get(i2) != null) {
                        m mVar = i.f2240b;
                        m mVar2 = i.f2241c;
                        while (!atomicReferenceArray.compareAndSet(i2, mVar, mVar2)) {
                            if (atomicReferenceArray.get(i2) != mVar) {
                                break;
                            }
                        }
                        cVar.o(obj, lVar);
                        return;
                    }
                }
                cVar.a(jVar2, i2);
                return;
            }
        }
    }

    public final void b() {
        boolean z2;
        int i2;
        Object b2;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f2237f;
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
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2233b;
            j jVar = (j) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = f2234c.getAndIncrement(this);
            long j2 = andIncrement2 / i.f2244f;
            g gVar = g.f2232m;
            while (true) {
                b2 = AbstractC0184a.b(jVar, j2, gVar);
                if (!AbstractC0184a.e(b2)) {
                    v c2 = AbstractC0184a.c(b2);
                    while (true) {
                        v vVar = (v) atomicReferenceFieldUpdater.get(this);
                        if (vVar.f2107g >= c2.f2107g) {
                            break;
                        }
                        if (!c2.i()) {
                            break;
                        }
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, vVar, c2)) {
                            if (atomicReferenceFieldUpdater.get(this) != vVar) {
                                if (c2.e()) {
                                    c2.d();
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
            j jVar2 = (j) AbstractC0184a.c(b2);
            jVar2.a();
            boolean z3 = false;
            if (jVar2.f2107g <= j2) {
                int i3 = (int) (andIncrement2 % i.f2244f);
                m mVar = i.f2240b;
                AtomicReferenceArray atomicReferenceArray = jVar2.f2245i;
                Object andSet = atomicReferenceArray.getAndSet(i3, mVar);
                if (andSet == null) {
                    int i4 = i.f2239a;
                    int i5 = 0;
                    while (true) {
                        if (i5 >= i4) {
                            m mVar2 = i.f2240b;
                            m mVar3 = i.f2242d;
                            while (true) {
                                if (atomicReferenceArray.compareAndSet(i3, mVar2, mVar3)) {
                                    z3 = true;
                                    break;
                                } else if (atomicReferenceArray.get(i3) != mVar2) {
                                    break;
                                }
                            }
                            z2 = true ^ z3;
                        } else if (atomicReferenceArray.get(i3) == i.f2241c) {
                            break;
                        } else {
                            i5++;
                        }
                    }
                } else if (andSet != i.f2243e) {
                    if (!(andSet instanceof InterfaceC0111e)) {
                        throw new IllegalStateException(("unexpected: " + andSet).toString());
                    }
                    InterfaceC0111e interfaceC0111e = (InterfaceC0111e) andSet;
                    m c3 = interfaceC0111e.c(F0.h.f469a, this.f2238a);
                    if (c3 != null) {
                        interfaceC0111e.n(c3);
                    }
                }
            }
            z2 = false;
        } while (!z2);
    }
}
