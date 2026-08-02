package C3;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f307e = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "_next$volatile");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f308f = AtomicLongFieldUpdater.newUpdater(n.class, "_state$volatile");

    /* renamed from: g, reason: collision with root package name */
    public static final v f309g = new v("REMOVE_FROZEN", 0);
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final int f310a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f311b;

    /* renamed from: c, reason: collision with root package name */
    public final int f312c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f313d;

    public n(int i4, boolean z) {
        this.f310a = i4;
        this.f311b = z;
        int i5 = i4 - 1;
        this.f312c = i5;
        this.f313d = new AtomicReferenceArray(i4);
        if (i5 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i4 & i5) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final int a(Object obj) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f308f;
            long j4 = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j4) != 0) {
                return (2305843009213693952L & j4) != 0 ? 2 : 1;
            }
            int i4 = (int) (1073741823 & j4);
            int i5 = (int) ((1152921503533105152L & j4) >> 30);
            int i6 = this.f312c;
            if (((i5 + 2) & i6) == (i4 & i6)) {
                return 1;
            }
            boolean z = this.f311b;
            AtomicReferenceArray atomicReferenceArray = this.f313d;
            if (z || atomicReferenceArray.get(i5 & i6) == null) {
                if (f308f.compareAndSet(this, j4, ((-1152921503533105153L) & j4) | (((i5 + 1) & 1073741823) << 30))) {
                    atomicReferenceArray.set(i5 & i6, obj);
                    n nVar = this;
                    while ((atomicLongFieldUpdater.get(nVar) & 1152921504606846976L) != 0) {
                        nVar = nVar.c();
                        AtomicReferenceArray atomicReferenceArray2 = nVar.f313d;
                        int i7 = nVar.f312c & i5;
                        Object obj2 = atomicReferenceArray2.get(i7);
                        if ((obj2 instanceof m) && ((m) obj2).f306a == i5) {
                            atomicReferenceArray2.set(i7, obj);
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
                int i8 = this.f310a;
                if (i8 < 1024 || ((i5 - i4) & 1073741823) > (i8 >> 1)) {
                    return 1;
                }
            }
        }
    }

    public final boolean b() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j4;
        do {
            atomicLongFieldUpdater = f308f;
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
            atomicLongFieldUpdater = f308f;
            j4 = atomicLongFieldUpdater.get(this);
            if ((j4 & 1152921504606846976L) != 0) {
                nVar = this;
                break;
            }
            long j5 = 1152921504606846976L | j4;
            nVar = this;
            if (atomicLongFieldUpdater.compareAndSet(nVar, j4, j5)) {
                j4 = j5;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f307e;
            n nVar2 = (n) atomicReferenceFieldUpdater.get(this);
            if (nVar2 != null) {
                return nVar2;
            }
            n nVar3 = new n(nVar.f310a * 2, nVar.f311b);
            int i4 = (int) (1073741823 & j4);
            int i5 = (int) ((1152921503533105152L & j4) >> 30);
            while (true) {
                int i6 = nVar.f312c;
                int i7 = i4 & i6;
                if (i7 == (i6 & i5)) {
                    break;
                }
                Object obj = nVar.f313d.get(i7);
                if (obj == null) {
                    obj = new m(i4);
                }
                nVar3.f313d.set(nVar3.f312c & i4, obj);
                i4++;
            }
            atomicLongFieldUpdater.set(nVar3, (-1152921504606846977L) & j4);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, nVar3) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    public final Object d() {
        n nVar = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f308f;
            long j4 = atomicLongFieldUpdater.get(nVar);
            if ((j4 & 1152921504606846976L) != 0) {
                return f309g;
            }
            int i4 = (int) (j4 & 1073741823);
            int i5 = nVar.f312c;
            int i6 = i4 & i5;
            if ((((int) ((1152921503533105152L & j4) >> 30)) & i5) == i6) {
                break;
            }
            AtomicReferenceArray atomicReferenceArray = nVar.f313d;
            Object obj = atomicReferenceArray.get(i6);
            boolean z = nVar.f311b;
            if (obj == null) {
                if (z) {
                    break;
                }
            } else {
                if (obj instanceof m) {
                    break;
                }
                long j5 = (i4 + 1) & 1073741823;
                if (f308f.compareAndSet(nVar, j4, (j4 & (-1073741824)) | j5)) {
                    atomicReferenceArray.set(i6, null);
                    return obj;
                }
                nVar = this;
                if (z) {
                    while (true) {
                        long j6 = atomicLongFieldUpdater.get(nVar);
                        int i7 = (int) (j6 & 1073741823);
                        if ((j6 & 1152921504606846976L) != 0) {
                            nVar = nVar.c();
                        } else {
                            n nVar2 = nVar;
                            if (f308f.compareAndSet(nVar2, j6, (j6 & (-1073741824)) | j5)) {
                                nVar2.f313d.set(i7 & nVar2.f312c, null);
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
