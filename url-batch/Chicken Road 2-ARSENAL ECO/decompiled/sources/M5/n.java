package M5;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1611e = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "_next");

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f1612f = AtomicLongFieldUpdater.newUpdater(n.class, "_state");

    /* renamed from: g, reason: collision with root package name */
    public static final v f1613g = new v("REMOVE_FROZEN", 0);
    private volatile Object _next;
    private volatile long _state;

    /* renamed from: a, reason: collision with root package name */
    public final int f1614a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1615b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1616c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReferenceArray f1617d;

    public n(int i7, boolean z5) {
        this.f1614a = i7;
        this.f1615b = z5;
        int i8 = i7 - 1;
        this.f1616c = i8;
        this.f1617d = new AtomicReferenceArray(i7);
        if (i8 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i7 & i8) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final int a(Object obj) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f1612f;
            long j4 = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j4) != 0) {
                return (2305843009213693952L & j4) != 0 ? 2 : 1;
            }
            int i7 = (int) (1073741823 & j4);
            int i8 = (int) ((1152921503533105152L & j4) >> 30);
            int i9 = this.f1616c;
            if (((i8 + 2) & i9) == (i7 & i9)) {
                return 1;
            }
            boolean z5 = this.f1615b;
            AtomicReferenceArray atomicReferenceArray = this.f1617d;
            if (z5 || atomicReferenceArray.get(i8 & i9) == null) {
                if (f1612f.compareAndSet(this, j4, ((-1152921503533105153L) & j4) | (((i8 + 1) & 1073741823) << 30))) {
                    atomicReferenceArray.set(i8 & i9, obj);
                    n nVar = this;
                    while ((atomicLongFieldUpdater.get(nVar) & 1152921504606846976L) != 0) {
                        nVar = nVar.c();
                        AtomicReferenceArray atomicReferenceArray2 = nVar.f1617d;
                        int i10 = nVar.f1616c & i8;
                        Object obj2 = atomicReferenceArray2.get(i10);
                        if ((obj2 instanceof m) && ((m) obj2).f1610a == i8) {
                            atomicReferenceArray2.set(i10, obj);
                        } else {
                            nVar = null;
                        }
                        if (nVar == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
            } else {
                int i11 = this.f1614a;
                if (i11 < 1024 || ((i8 - i7) & 1073741823) > (i11 >> 1)) {
                    return 1;
                }
            }
        }
    }

    public final boolean b() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j4;
        do {
            atomicLongFieldUpdater = f1612f;
            j4 = atomicLongFieldUpdater.get(this);
            if ((j4 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j4) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j4, 2305843009213693952L | j4));
        return true;
    }

    public final n c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j4;
        n nVar;
        while (true) {
            atomicLongFieldUpdater = f1612f;
            j4 = atomicLongFieldUpdater.get(this);
            if ((j4 & 1152921504606846976L) != 0) {
                nVar = this;
                break;
            }
            long j7 = 1152921504606846976L | j4;
            nVar = this;
            if (atomicLongFieldUpdater.compareAndSet(nVar, j4, j7)) {
                j4 = j7;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1611e;
            n nVar2 = (n) atomicReferenceFieldUpdater.get(this);
            if (nVar2 != null) {
                return nVar2;
            }
            n nVar3 = new n(nVar.f1614a * 2, nVar.f1615b);
            int i7 = (int) (1073741823 & j4);
            int i8 = (int) ((1152921503533105152L & j4) >> 30);
            while (true) {
                int i9 = nVar.f1616c;
                int i10 = i7 & i9;
                if (i10 == (i9 & i8)) {
                    break;
                }
                Object obj = nVar.f1617d.get(i10);
                if (obj == null) {
                    obj = new m(i7);
                }
                nVar3.f1617d.set(nVar3.f1616c & i7, obj);
                i7++;
            }
            atomicLongFieldUpdater.set(nVar3, (-1152921504606846977L) & j4);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, nVar3) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    public final Object d() {
        n nVar = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f1612f;
            long j4 = atomicLongFieldUpdater.get(nVar);
            if ((j4 & 1152921504606846976L) != 0) {
                return f1613g;
            }
            int i7 = (int) (j4 & 1073741823);
            int i8 = nVar.f1616c;
            int i9 = i7 & i8;
            if ((((int) ((1152921503533105152L & j4) >> 30)) & i8) == i9) {
                break;
            }
            AtomicReferenceArray atomicReferenceArray = nVar.f1617d;
            Object obj = atomicReferenceArray.get(i9);
            boolean z5 = nVar.f1615b;
            if (obj == null) {
                if (z5) {
                    break;
                }
            } else {
                if (obj instanceof m) {
                    break;
                }
                long j7 = (i7 + 1) & 1073741823;
                if (f1612f.compareAndSet(nVar, j4, (j4 & (-1073741824)) | j7)) {
                    atomicReferenceArray.set(i9, null);
                    return obj;
                }
                nVar = this;
                if (z5) {
                    while (true) {
                        long j8 = atomicLongFieldUpdater.get(nVar);
                        int i10 = (int) (j8 & 1073741823);
                        if ((j8 & 1152921504606846976L) != 0) {
                            nVar = nVar.c();
                        } else {
                            n nVar2 = nVar;
                            if (f1612f.compareAndSet(nVar2, j8, (j8 & (-1073741824)) | j7)) {
                                nVar2.f1617d.set(i10 & nVar2.f1616c, null);
                                nVar = null;
                            } else {
                                nVar = nVar2;
                            }
                        }
                        if (nVar == null) {
                            return obj;
                        }
                    }
                }
            }
        }
        return null;
    }
}
