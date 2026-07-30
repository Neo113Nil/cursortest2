package h7;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4693e = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_next$volatile");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f4694f = AtomicLongFieldUpdater.newUpdater(l.class, "_state$volatile");

    /* renamed from: g, reason: collision with root package name */
    public static final s f4695g = new s("REMOVE_FROZEN", 0);
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final int f4696a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4697b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4698c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f4699d;

    public l(int i7, boolean z8) {
        this.f4696a = i7;
        this.f4697b = z8;
        int i8 = i7 - 1;
        this.f4698c = i8;
        this.f4699d = new AtomicReferenceArray(i7);
        if (i8 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i7 & i8) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final int a(Object obj) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f4694f;
            long j8 = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j8) != 0) {
                return (2305843009213693952L & j8) != 0 ? 2 : 1;
            }
            int i7 = (int) (1073741823 & j8);
            int i8 = (int) ((1152921503533105152L & j8) >> 30);
            int i9 = this.f4698c;
            if (((i8 + 2) & i9) == (i7 & i9)) {
                return 1;
            }
            boolean z8 = this.f4697b;
            AtomicReferenceArray atomicReferenceArray = this.f4699d;
            if (z8 || atomicReferenceArray.get(i8 & i9) == null) {
                if (f4694f.compareAndSet(this, j8, ((-1152921503533105153L) & j8) | (((i8 + 1) & 1073741823) << 30))) {
                    atomicReferenceArray.set(i8 & i9, obj);
                    l lVar = this;
                    while ((atomicLongFieldUpdater.get(lVar) & 1152921504606846976L) != 0) {
                        lVar = lVar.c();
                        AtomicReferenceArray atomicReferenceArray2 = lVar.f4699d;
                        int i10 = lVar.f4698c & i8;
                        Object obj2 = atomicReferenceArray2.get(i10);
                        if ((obj2 instanceof k) && ((k) obj2).f4692a == i8) {
                            atomicReferenceArray2.set(i10, obj);
                        } else {
                            lVar = null;
                        }
                        if (lVar == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
            } else {
                int i11 = this.f4696a;
                if (i11 < 1024 || ((i8 - i7) & 1073741823) > (i11 >> 1)) {
                    return 1;
                }
            }
        }
    }

    public final boolean b() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j8;
        do {
            atomicLongFieldUpdater = f4694f;
            j8 = atomicLongFieldUpdater.get(this);
            if ((j8 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j8) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j8, 2305843009213693952L | j8));
        return true;
    }

    public final l c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j8;
        l lVar;
        while (true) {
            atomicLongFieldUpdater = f4694f;
            j8 = atomicLongFieldUpdater.get(this);
            if ((j8 & 1152921504606846976L) != 0) {
                lVar = this;
                break;
            }
            long j9 = 1152921504606846976L | j8;
            lVar = this;
            if (atomicLongFieldUpdater.compareAndSet(lVar, j8, j9)) {
                j8 = j9;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4693e;
            l lVar2 = (l) atomicReferenceFieldUpdater.get(this);
            if (lVar2 != null) {
                return lVar2;
            }
            l lVar3 = new l(lVar.f4696a * 2, lVar.f4697b);
            int i7 = (int) (1073741823 & j8);
            int i8 = (int) ((1152921503533105152L & j8) >> 30);
            while (true) {
                int i9 = lVar.f4698c;
                int i10 = i7 & i9;
                if (i10 == (i9 & i8)) {
                    break;
                }
                Object obj = lVar.f4699d.get(i10);
                if (obj == null) {
                    obj = new k(i7);
                }
                lVar3.f4699d.set(lVar3.f4698c & i7, obj);
                i7++;
            }
            atomicLongFieldUpdater.set(lVar3, (-1152921504606846977L) & j8);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, lVar3) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    public final Object d() {
        l lVar = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f4694f;
            long j8 = atomicLongFieldUpdater.get(lVar);
            if ((j8 & 1152921504606846976L) != 0) {
                return f4695g;
            }
            int i7 = (int) (j8 & 1073741823);
            int i8 = lVar.f4698c;
            int i9 = i7 & i8;
            if ((((int) ((1152921503533105152L & j8) >> 30)) & i8) == i9) {
                break;
            }
            AtomicReferenceArray atomicReferenceArray = lVar.f4699d;
            Object obj = atomicReferenceArray.get(i9);
            boolean z8 = lVar.f4697b;
            if (obj == null) {
                if (z8) {
                    break;
                }
            } else {
                if (obj instanceof k) {
                    break;
                }
                long j9 = (i7 + 1) & 1073741823;
                if (f4694f.compareAndSet(lVar, j8, (j8 & (-1073741824)) | j9)) {
                    atomicReferenceArray.set(i9, null);
                    return obj;
                }
                lVar = this;
                if (z8) {
                    while (true) {
                        long j10 = atomicLongFieldUpdater.get(lVar);
                        int i10 = (int) (j10 & 1073741823);
                        if ((j10 & 1152921504606846976L) != 0) {
                            lVar = lVar.c();
                        } else {
                            l lVar2 = lVar;
                            if (f4694f.compareAndSet(lVar2, j10, (j10 & (-1073741824)) | j9)) {
                                lVar2.f4699d.set(i10 & lVar2.f4698c, null);
                                lVar = null;
                            } else {
                                lVar = lVar2;
                            }
                        }
                        if (lVar == null) {
                            return obj;
                        }
                    }
                }
            }
        }
        return null;
    }
}
