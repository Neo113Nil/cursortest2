package e3;

import W2.C0285g;
import W2.InterfaceC0284f;
import b3.r;
import b3.t;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;

/* loaded from: classes.dex */
public class g {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f6263b = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "head$volatile");

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f6264c = AtomicLongFieldUpdater.newUpdater(g.class, "deqIdx$volatile");

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f6265d = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "tail$volatile");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f6266e = AtomicLongFieldUpdater.newUpdater(g.class, "enqIdx$volatile");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f6267f = AtomicIntegerFieldUpdater.newUpdater(g.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final C0285g f6268a;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    public g(int i2) {
        if (i2 < 0 || i2 > 1) {
            throw new IllegalArgumentException("The number of acquired permits should be in 0..1".toString());
        }
        i iVar = new i(0L, null, 2);
        this.head$volatile = iVar;
        this.tail$volatile = iVar;
        this._availablePermits$volatile = 1 - i2;
        this.f6268a = new C0285g(1, this);
    }

    public final void a(b bVar) {
        Object d4;
        e eVar;
        long j4;
        while (true) {
            int andDecrement = f6267f.getAndDecrement(this);
            if (andDecrement <= 1) {
                L2.c cVar = this.f6268a;
                if (andDecrement > 0) {
                    bVar.n(Unit.f7487a, cVar);
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6265d;
                i iVar = (i) atomicReferenceFieldUpdater.get(this);
                long andIncrement = f6266e.getAndIncrement(this);
                e eVar2 = e.f6261o;
                long j5 = andIncrement / h.f6274f;
                while (true) {
                    d4 = b3.a.d(iVar, j5, eVar2);
                    if (!b3.a.g(d4)) {
                        r e4 = b3.a.e(d4);
                        while (true) {
                            r rVar = (r) atomicReferenceFieldUpdater.get(this);
                            eVar = eVar2;
                            j4 = j5;
                            if (rVar.f5686c >= e4.f5686c) {
                                break;
                            }
                            if (!e4.i()) {
                                break;
                            }
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, rVar, e4)) {
                                if (atomicReferenceFieldUpdater.get(this) != rVar) {
                                    if (e4.e()) {
                                        e4.d();
                                    }
                                    eVar2 = eVar;
                                    j5 = j4;
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
                    j5 = j4;
                }
                i iVar2 = (i) b3.a.e(d4);
                int i2 = (int) (andIncrement % h.f6274f);
                AtomicReferenceArray atomicReferenceArray = iVar2.f6275e;
                while (!atomicReferenceArray.compareAndSet(i2, null, bVar)) {
                    if (atomicReferenceArray.get(i2) != null) {
                        t tVar = h.f6270b;
                        t tVar2 = h.f6271c;
                        while (!atomicReferenceArray.compareAndSet(i2, tVar, tVar2)) {
                            if (atomicReferenceArray.get(i2) != tVar) {
                                break;
                            }
                        }
                        bVar.n(Unit.f7487a, cVar);
                        return;
                    }
                }
                bVar.a(iVar2, i2);
                return;
            }
        }
    }

    public final void b() {
        boolean z4;
        int i2;
        Object d4;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f6267f;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            z4 = true;
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
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6263b;
            i iVar = (i) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = f6264c.getAndIncrement(this);
            long j4 = andIncrement2 / h.f6274f;
            f fVar = f.f6262o;
            while (true) {
                d4 = b3.a.d(iVar, j4, fVar);
                if (!b3.a.g(d4)) {
                    r e4 = b3.a.e(d4);
                    while (true) {
                        r rVar = (r) atomicReferenceFieldUpdater.get(this);
                        if (rVar.f5686c >= e4.f5686c) {
                            break;
                        }
                        if (!e4.i()) {
                            break;
                        }
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, rVar, e4)) {
                            if (atomicReferenceFieldUpdater.get(this) != rVar) {
                                if (e4.e()) {
                                    e4.d();
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
            i iVar2 = (i) b3.a.e(d4);
            iVar2.a();
            boolean z5 = false;
            if (iVar2.f5686c <= j4) {
                int i4 = (int) (andIncrement2 % h.f6274f);
                t tVar = h.f6270b;
                AtomicReferenceArray atomicReferenceArray = iVar2.f6275e;
                Object andSet = atomicReferenceArray.getAndSet(i4, tVar);
                if (andSet == null) {
                    int i5 = h.f6269a;
                    int i6 = 0;
                    while (true) {
                        if (i6 >= i5) {
                            t tVar2 = h.f6270b;
                            t tVar3 = h.f6272d;
                            while (true) {
                                if (atomicReferenceArray.compareAndSet(i4, tVar2, tVar3)) {
                                    z5 = true;
                                    break;
                                } else if (atomicReferenceArray.get(i4) != tVar2) {
                                    break;
                                }
                            }
                            z4 = true ^ z5;
                        } else if (atomicReferenceArray.get(i4) == h.f6271c) {
                            break;
                        } else {
                            i6++;
                        }
                    }
                } else if (andSet != h.f6273e) {
                    if (!(andSet instanceof InterfaceC0284f)) {
                        throw new IllegalStateException(("unexpected: " + andSet).toString());
                    }
                    InterfaceC0284f interfaceC0284f = (InterfaceC0284f) andSet;
                    t c4 = interfaceC0284f.c(Unit.f7487a, this.f6268a);
                    if (c4 != null) {
                        interfaceC0284f.z(c4);
                    }
                }
            }
            z4 = false;
        } while (!z4);
    }
}
