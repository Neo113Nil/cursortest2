package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public class rc0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(rc0.class, Object.class, "head$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater i = AtomicLongFieldUpdater.newUpdater(rc0.class, "deqIdx$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater j = AtomicReferenceFieldUpdater.newUpdater(rc0.class, Object.class, "tail$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater k = AtomicLongFieldUpdater.newUpdater(rc0.class, "enqIdx$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater l = AtomicIntegerFieldUpdater.newUpdater(rc0.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    public final int f;
    public final ja g;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    public rc0(int i2) {
        this.f = i2;
        if (i2 <= 0) {
            s9.e(r7.b("Semaphore should have at least 1 permit, but had ", i2));
            throw null;
        }
        if (i2 < 0) {
            s9.e(r7.b("The number of acquired permits should be in 0..", i2));
            throw null;
        }
        uc0 uc0Var = new uc0(0L, null, 2);
        this.head$volatile = uc0Var;
        this.tail$volatile = uc0Var;
        this._availablePermits$volatile = i2;
        this.g = new ja(2, this);
    }

    public final boolean a(qn0 qn0Var) {
        Object p;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
        uc0 uc0Var = (uc0) atomicReferenceFieldUpdater.get(this);
        long andIncrement = k.getAndIncrement(this);
        pc0 pc0Var = pc0.n;
        long j2 = andIncrement / tc0.f;
        loop0: while (true) {
            p = d50.p(uc0Var, j2, pc0Var);
            if (p != d50.b) {
                lc0 f = mc0.f(p);
                while (true) {
                    lc0 lc0Var = (lc0) atomicReferenceFieldUpdater.get(this);
                    if (lc0Var.c >= f.c) {
                        break loop0;
                    }
                    if (!f.f()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, lc0Var, f)) {
                        if (atomicReferenceFieldUpdater.get(this) != lc0Var) {
                            if (f.c()) {
                                f.b();
                            }
                        }
                    }
                    if (lc0Var.c()) {
                        lc0Var.b();
                    }
                }
            } else {
                break;
            }
        }
        uc0 uc0Var2 = (uc0) mc0.f(p);
        AtomicReferenceArray atomicReferenceArray = uc0Var2.e;
        int i2 = (int) (andIncrement % tc0.f);
        while (!atomicReferenceArray.compareAndSet(i2, null, qn0Var)) {
            if (atomicReferenceArray.get(i2) != null) {
                lm lmVar = tc0.b;
                lm lmVar2 = tc0.c;
                while (!atomicReferenceArray.compareAndSet(i2, lmVar, lmVar2)) {
                    if (atomicReferenceArray.get(i2) != lmVar) {
                        return false;
                    }
                }
                ((ia) qn0Var).j(this.g);
                return true;
            }
        }
        qn0Var.a(uc0Var2, i2);
        return true;
    }

    public final void b() {
        int i2;
        Object p;
        boolean z;
        uc0 uc0Var;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = l;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i3 = this.f;
            if (andIncrement >= i3) {
                do {
                    i2 = atomicIntegerFieldUpdater.get(this);
                    if (i2 <= i3) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, i3));
                throw new IllegalStateException(("The number of released permits cannot be greater than " + i3).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
            uc0 uc0Var2 = (uc0) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = i.getAndIncrement(this);
            long j2 = andIncrement2 / tc0.f;
            qc0 qc0Var = qc0.n;
            while (true) {
                p = d50.p(uc0Var2, j2, qc0Var);
                if (p == d50.b) {
                    break;
                }
                lc0 f = mc0.f(p);
                while (true) {
                    lc0 lc0Var = (lc0) atomicReferenceFieldUpdater.get(this);
                    uc0Var = uc0Var2;
                    if (lc0Var.c >= f.c) {
                        break;
                    }
                    if (!f.f()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, lc0Var, f)) {
                        if (atomicReferenceFieldUpdater.get(this) != lc0Var) {
                            if (f.c()) {
                                f.b();
                            }
                            uc0Var2 = uc0Var;
                        }
                    }
                    if (lc0Var.c()) {
                        lc0Var.b();
                    }
                }
                uc0Var2 = uc0Var;
            }
            uc0 uc0Var3 = (uc0) mc0.f(p);
            AtomicReferenceArray atomicReferenceArray = uc0Var3.e;
            de.b.set(uc0Var3, null);
            z = false;
            if (uc0Var3.c <= j2) {
                int i4 = (int) (andIncrement2 % tc0.f);
                Object andSet = atomicReferenceArray.getAndSet(i4, tc0.b);
                if (andSet == null) {
                    int i5 = tc0.a;
                    for (int i6 = 0; i6 < i5; i6++) {
                        if (atomicReferenceArray.get(i4) == tc0.c) {
                            z = true;
                            break;
                        }
                    }
                    lm lmVar = tc0.b;
                    lm lmVar2 = tc0.d;
                    while (true) {
                        if (!atomicReferenceArray.compareAndSet(i4, lmVar, lmVar2)) {
                            if (atomicReferenceArray.get(i4) != lmVar) {
                                break;
                            }
                        } else {
                            z = true;
                            break;
                        }
                    }
                    z = !z;
                } else if (andSet != tc0.e) {
                    if (!(andSet instanceof ia)) {
                        s9.x(andSet, "unexpected: ");
                        return;
                    }
                    ia iaVar = (ia) andSet;
                    lm f2 = iaVar.f(this.g);
                    if (f2 != null) {
                        iaVar.k(f2);
                        z = true;
                        break;
                        break;
                    }
                }
            }
        } while (!z);
    }
}
