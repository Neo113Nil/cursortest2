package oe;

import a2.r;
import ge.b2;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import le.s;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class g {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7570i = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "head$volatile");

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f7571r = AtomicLongFieldUpdater.newUpdater(g.class, "deqIdx$volatile");

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7572s = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "tail$volatile");

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f7573t = AtomicLongFieldUpdater.newUpdater(g.class, "enqIdx$volatile");

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7574u = AtomicIntegerFieldUpdater.newUpdater(g.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* renamed from: d, reason: collision with root package name */
    public final int f7575d;
    private volatile /* synthetic */ long deqIdx$volatile;

    /* renamed from: e, reason: collision with root package name */
    public final ge.g f7576e;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    public g(int i3) {
        this.f7575d = i3;
        if (i3 <= 0) {
            r.h(v4.a.j(i3, "Semaphore should have at least 1 permit, but had "));
            throw null;
        }
        if (i3 < 0) {
            r.h(v4.a.j(i3, "The number of acquired permits should be in 0.."));
            throw null;
        }
        j jVar = new j(0L, null, 2);
        this.head$volatile = jVar;
        this.tail$volatile = jVar;
        this._availablePermits$volatile = i3;
        this.f7576e = new ge.g(2, this);
    }

    public final boolean b(b2 b2Var) {
        Object b10;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7572s;
        j jVar = (j) atomicReferenceFieldUpdater.get(this);
        long andIncrement = f7573t.getAndIncrement(this);
        e eVar = e.f7568v;
        long j = andIncrement / i.f7582f;
        loop0: while (true) {
            b10 = le.b.b(jVar, j, eVar);
            if (!le.b.e(b10)) {
                s c10 = le.b.c(b10);
                while (true) {
                    s sVar = (s) atomicReferenceFieldUpdater.get(this);
                    if (sVar.f5999c >= c10.f5999c) {
                        break loop0;
                    }
                    if (!c10.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, sVar, c10)) {
                        if (atomicReferenceFieldUpdater.get(this) != sVar) {
                            if (c10.e()) {
                                c10.d();
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
        j jVar2 = (j) le.b.c(b10);
        AtomicReferenceArray atomicReferenceArray = jVar2.f7583e;
        int i3 = (int) (andIncrement % i.f7582f);
        while (!atomicReferenceArray.compareAndSet(i3, null, b2Var)) {
            if (atomicReferenceArray.get(i3) != null) {
                a8.f fVar = i.f7578b;
                a8.f fVar2 = i.f7579c;
                while (!atomicReferenceArray.compareAndSet(i3, fVar, fVar2)) {
                    if (atomicReferenceArray.get(i3) != fVar) {
                        return false;
                    }
                }
                ((ge.f) b2Var).e(Unit.f5554a, this.f7576e);
                return true;
            }
        }
        b2Var.a(jVar2, i3);
        return true;
    }

    public final void c() {
        int i3;
        Object b10;
        boolean z10;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f7574u;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i10 = this.f7575d;
            if (andIncrement >= i10) {
                do {
                    i3 = atomicIntegerFieldUpdater.get(this);
                    if (i3 <= i10) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, i10));
                throw new IllegalStateException(("The number of released permits cannot be greater than " + i10).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7570i;
            j jVar = (j) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = f7571r.getAndIncrement(this);
            long j = andIncrement2 / i.f7582f;
            f fVar = f.f7569v;
            while (true) {
                b10 = le.b.b(jVar, j, fVar);
                if (le.b.e(b10)) {
                    break;
                }
                s c10 = le.b.c(b10);
                while (true) {
                    s sVar = (s) atomicReferenceFieldUpdater.get(this);
                    if (sVar.f5999c >= c10.f5999c) {
                        break;
                    }
                    if (!c10.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, sVar, c10)) {
                        if (atomicReferenceFieldUpdater.get(this) != sVar) {
                            if (c10.e()) {
                                c10.d();
                            }
                        }
                    }
                    if (sVar.e()) {
                        sVar.d();
                    }
                }
            }
            j jVar2 = (j) le.b.c(b10);
            AtomicReferenceArray atomicReferenceArray = jVar2.f7583e;
            jVar2.a();
            z10 = false;
            if (jVar2.f5999c <= j) {
                int i11 = (int) (andIncrement2 % i.f7582f);
                Object andSet = atomicReferenceArray.getAndSet(i11, i.f7578b);
                if (andSet == null) {
                    int i12 = i.f7577a;
                    for (int i13 = 0; i13 < i12; i13++) {
                        if (atomicReferenceArray.get(i11) == i.f7579c) {
                            z10 = true;
                            break;
                        }
                    }
                    a8.f fVar2 = i.f7578b;
                    a8.f fVar3 = i.f7580d;
                    while (true) {
                        if (!atomicReferenceArray.compareAndSet(i11, fVar2, fVar3)) {
                            if (atomicReferenceArray.get(i11) != fVar2) {
                                break;
                            }
                        } else {
                            z10 = true;
                            break;
                        }
                    }
                    z10 = !z10;
                } else if (andSet != i.f7581e) {
                    if (!(andSet instanceof ge.f)) {
                        r.n(andSet, "unexpected: ");
                        return;
                    }
                    ge.f fVar4 = (ge.f) andSet;
                    a8.f f3 = fVar4.f(Unit.f5554a, this.f7576e);
                    if (f3 != null) {
                        fVar4.g(f3);
                        z10 = true;
                        break;
                        break;
                    }
                }
            }
        } while (!z10);
    }
}
