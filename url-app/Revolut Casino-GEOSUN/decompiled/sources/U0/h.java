package U0;

import D.M;
import E0.l;
import M0.InterfaceC0047e;
import R0.AbstractC0068a;
import R0.v;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import u0.C0247g;

/* loaded from: classes.dex */
public class h {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1035b = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "head");

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f1036c = AtomicLongFieldUpdater.newUpdater(h.class, "deqIdx");

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1037d = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "tail");

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f1038e = AtomicLongFieldUpdater.newUpdater(h.class, "enqIdx");

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1039f = AtomicIntegerFieldUpdater.newUpdater(h.class, "_availablePermits");
    private volatile int _availablePermits;

    /* renamed from: a, reason: collision with root package name */
    public final M f1040a;
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
        this.f1040a = new M(2, this);
    }

    public final void a(c cVar) {
        Object c2;
        f fVar;
        long j2;
        while (true) {
            int andDecrement = f1039f.getAndDecrement(this);
            if (andDecrement <= 1) {
                Object obj = C0247g.f3005a;
                l lVar = this.f1040a;
                if (andDecrement > 0) {
                    cVar.c(obj, lVar);
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1037d;
                j jVar = (j) atomicReferenceFieldUpdater.get(this);
                long andIncrement = f1038e.getAndIncrement(this);
                f fVar2 = f.f1033m;
                long j3 = andIncrement / i.f1046f;
                while (true) {
                    c2 = AbstractC0068a.c(jVar, j3, fVar2);
                    if (!AbstractC0068a.f(c2)) {
                        v d2 = AbstractC0068a.d(c2);
                        while (true) {
                            v vVar = (v) atomicReferenceFieldUpdater.get(this);
                            fVar = fVar2;
                            j2 = j3;
                            if (vVar.f938g >= d2.f938g) {
                                break;
                            }
                            if (!d2.i()) {
                                break;
                            }
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, vVar, d2)) {
                                if (atomicReferenceFieldUpdater.get(this) != vVar) {
                                    if (d2.e()) {
                                        d2.d();
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
                j jVar2 = (j) AbstractC0068a.d(c2);
                int i2 = (int) (andIncrement % i.f1046f);
                AtomicReferenceArray atomicReferenceArray = jVar2.f1047i;
                while (!atomicReferenceArray.compareAndSet(i2, null, cVar)) {
                    if (atomicReferenceArray.get(i2) != null) {
                        A.j jVar3 = i.f1042b;
                        A.j jVar4 = i.f1043c;
                        while (!atomicReferenceArray.compareAndSet(i2, jVar3, jVar4)) {
                            if (atomicReferenceArray.get(i2) != jVar3) {
                                break;
                            }
                        }
                        cVar.c(obj, lVar);
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
        Object c2;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1039f;
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
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1035b;
            j jVar = (j) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = f1036c.getAndIncrement(this);
            long j2 = andIncrement2 / i.f1046f;
            g gVar = g.f1034m;
            while (true) {
                c2 = AbstractC0068a.c(jVar, j2, gVar);
                if (!AbstractC0068a.f(c2)) {
                    v d2 = AbstractC0068a.d(c2);
                    while (true) {
                        v vVar = (v) atomicReferenceFieldUpdater.get(this);
                        if (vVar.f938g >= d2.f938g) {
                            break;
                        }
                        if (!d2.i()) {
                            break;
                        }
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, vVar, d2)) {
                            if (atomicReferenceFieldUpdater.get(this) != vVar) {
                                if (d2.e()) {
                                    d2.d();
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
            j jVar2 = (j) AbstractC0068a.d(c2);
            jVar2.a();
            boolean z3 = false;
            if (jVar2.f938g <= j2) {
                int i3 = (int) (andIncrement2 % i.f1046f);
                A.j jVar3 = i.f1042b;
                AtomicReferenceArray atomicReferenceArray = jVar2.f1047i;
                Object andSet = atomicReferenceArray.getAndSet(i3, jVar3);
                if (andSet == null) {
                    int i4 = i.f1041a;
                    int i5 = 0;
                    while (true) {
                        if (i5 >= i4) {
                            A.j jVar4 = i.f1042b;
                            A.j jVar5 = i.f1044d;
                            while (true) {
                                if (atomicReferenceArray.compareAndSet(i3, jVar4, jVar5)) {
                                    z3 = true;
                                    break;
                                } else if (atomicReferenceArray.get(i3) != jVar4) {
                                    break;
                                }
                            }
                            z2 = true ^ z3;
                        } else if (atomicReferenceArray.get(i3) == i.f1043c) {
                            break;
                        } else {
                            i5++;
                        }
                    }
                } else if (andSet != i.f1045e) {
                    if (!(andSet instanceof InterfaceC0047e)) {
                        throw new IllegalStateException(("unexpected: " + andSet).toString());
                    }
                    InterfaceC0047e interfaceC0047e = (InterfaceC0047e) andSet;
                    A.j e2 = interfaceC0047e.e(C0247g.f3005a, this.f1040a);
                    if (e2 != null) {
                        interfaceC0047e.j(e2);
                    }
                }
            }
            z2 = false;
        } while (!z2);
    }
}
