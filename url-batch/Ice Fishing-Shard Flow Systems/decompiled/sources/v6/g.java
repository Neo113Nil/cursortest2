package v6;

import e6.n;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import l0.C0654a;
import n6.C0774g;
import n6.InterfaceC0773f;
import s6.AbstractC0898a;
import s6.r;

/* loaded from: classes.dex */
public class g {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8242b = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "head$volatile");

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f8243c = AtomicLongFieldUpdater.newUpdater(g.class, "deqIdx$volatile");

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8244d = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "tail$volatile");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f8245e = AtomicLongFieldUpdater.newUpdater(g.class, "enqIdx$volatile");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f8246f = AtomicIntegerFieldUpdater.newUpdater(g.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final C0774g f8247a;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    public g() {
        i iVar = new i(0L, null, 2);
        this.head$volatile = iVar;
        this.tail$volatile = iVar;
        this._availablePermits$volatile = 1;
        this.f8247a = new C0774g(2, this);
    }

    public final void a(C0980b c0980b) {
        Object b7;
        long j;
        i iVar;
        while (true) {
            int andDecrement = f8246f.getAndDecrement(this);
            if (andDecrement <= 1) {
                n nVar = this.f8247a;
                if (andDecrement > 0) {
                    c0980b.e(Unit.f6114a, nVar);
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8244d;
                i iVar2 = (i) atomicReferenceFieldUpdater.get(this);
                long andIncrement = f8245e.getAndIncrement(this);
                e eVar = e.f8240e;
                long j7 = andIncrement / h.f8253f;
                while (true) {
                    b7 = AbstractC0898a.b(iVar2, j7, eVar);
                    if (!AbstractC0898a.e(b7)) {
                        r c7 = AbstractC0898a.c(b7);
                        while (true) {
                            r rVar = (r) atomicReferenceFieldUpdater.get(this);
                            iVar = iVar2;
                            j = andIncrement;
                            if (rVar.f7854c >= c7.f7854c) {
                                break;
                            }
                            if (!c7.i()) {
                                break;
                            }
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, rVar, c7)) {
                                if (atomicReferenceFieldUpdater.get(this) != rVar) {
                                    if (c7.e()) {
                                        c7.d();
                                    }
                                    iVar2 = iVar;
                                    andIncrement = j;
                                }
                            }
                            if (rVar.e()) {
                                rVar.d();
                            }
                        }
                    } else {
                        j = andIncrement;
                        break;
                    }
                    iVar2 = iVar;
                    andIncrement = j;
                }
                i iVar3 = (i) AbstractC0898a.c(b7);
                AtomicReferenceArray atomicReferenceArray = iVar3.f8254e;
                int i2 = (int) (j % h.f8253f);
                while (!atomicReferenceArray.compareAndSet(i2, null, c0980b)) {
                    if (atomicReferenceArray.get(i2) != null) {
                        C0654a c0654a = h.f8249b;
                        C0654a c0654a2 = h.f8250c;
                        while (!atomicReferenceArray.compareAndSet(i2, c0654a, c0654a2)) {
                            if (atomicReferenceArray.get(i2) != c0654a) {
                                break;
                            }
                        }
                        c0980b.e(Unit.f6114a, nVar);
                        return;
                    }
                }
                c0980b.a(iVar3, i2);
                return;
            }
        }
    }

    public final void b() {
        boolean z7;
        int i2;
        Object b7;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f8246f;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            z7 = true;
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
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8242b;
            i iVar = (i) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = f8243c.getAndIncrement(this);
            long j = andIncrement2 / h.f8253f;
            f fVar = f.f8241e;
            while (true) {
                b7 = AbstractC0898a.b(iVar, j, fVar);
                if (!AbstractC0898a.e(b7)) {
                    r c7 = AbstractC0898a.c(b7);
                    while (true) {
                        r rVar = (r) atomicReferenceFieldUpdater.get(this);
                        if (rVar.f7854c >= c7.f7854c) {
                            break;
                        }
                        if (!c7.i()) {
                            break;
                        }
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, rVar, c7)) {
                            if (atomicReferenceFieldUpdater.get(this) != rVar) {
                                if (c7.e()) {
                                    c7.d();
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
            i iVar2 = (i) AbstractC0898a.c(b7);
            AtomicReferenceArray atomicReferenceArray = iVar2.f8254e;
            iVar2.a();
            boolean z8 = false;
            if (iVar2.f7854c <= j) {
                int i5 = (int) (andIncrement2 % h.f8253f);
                Object andSet = atomicReferenceArray.getAndSet(i5, h.f8249b);
                if (andSet == null) {
                    int i7 = h.f8248a;
                    int i8 = 0;
                    while (true) {
                        if (i8 >= i7) {
                            C0654a c0654a = h.f8249b;
                            C0654a c0654a2 = h.f8251d;
                            while (true) {
                                if (atomicReferenceArray.compareAndSet(i5, c0654a, c0654a2)) {
                                    z8 = true;
                                    break;
                                } else if (atomicReferenceArray.get(i5) != c0654a) {
                                    break;
                                }
                            }
                            z7 = true ^ z8;
                        } else if (atomicReferenceArray.get(i5) == h.f8250c) {
                            break;
                        } else {
                            i8++;
                        }
                    }
                } else if (andSet != h.f8252e) {
                    if (!(andSet instanceof InterfaceC0773f)) {
                        throw new IllegalStateException(("unexpected: " + andSet).toString());
                    }
                    InterfaceC0773f interfaceC0773f = (InterfaceC0773f) andSet;
                    C0654a c8 = interfaceC0773f.c(Unit.f6114a, this.f8247a);
                    if (c8 != null) {
                        interfaceC0773f.k(c8);
                    }
                }
            }
            z7 = false;
        } while (!z7);
    }
}
