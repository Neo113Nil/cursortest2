package b3;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5672e = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_next$volatile");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f5673f = AtomicLongFieldUpdater.newUpdater(l.class, "_state$volatile");

    /* renamed from: g, reason: collision with root package name */
    public static final t f5674g = new t("REMOVE_FROZEN", 0);
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final int f5675a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5676b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5677c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f5678d;

    public l(int i2, boolean z4) {
        this.f5675a = i2;
        this.f5676b = z4;
        int i4 = i2 - 1;
        this.f5677c = i4;
        this.f5678d = new AtomicReferenceArray(i2);
        if (i4 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i2 & i4) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0050, code lost:
    
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(Runnable runnable) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f5673f;
            long j4 = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j4) != 0) {
                return (j4 & 2305843009213693952L) != 0 ? 2 : 1;
            }
            int i2 = (int) (1073741823 & j4);
            int i4 = (int) ((1152921503533105152L & j4) >> 30);
            int i5 = this.f5677c;
            if (((i4 + 2) & i5) == (i2 & i5)) {
                return 1;
            }
            AtomicReferenceArray atomicReferenceArray = this.f5678d;
            if (!this.f5676b && atomicReferenceArray.get(i4 & i5) != null) {
                int i6 = this.f5675a;
                if (i6 < 1024 || ((i4 - i2) & 1073741823) > (i6 >> 1)) {
                    break;
                }
            } else if (atomicLongFieldUpdater.compareAndSet(this, j4, ((-1152921503533105153L) & j4) | (((i4 + 1) & 1073741823) << 30))) {
                atomicReferenceArray.set(i4 & i5, runnable);
                l lVar = this;
                while ((atomicLongFieldUpdater.get(lVar) & 1152921504606846976L) != 0) {
                    lVar = lVar.c();
                    AtomicReferenceArray atomicReferenceArray2 = lVar.f5678d;
                    int i7 = lVar.f5677c & i4;
                    Object obj = atomicReferenceArray2.get(i7);
                    if ((obj instanceof k) && ((k) obj).f5671a == i4) {
                        atomicReferenceArray2.set(i7, runnable);
                    } else {
                        lVar = null;
                    }
                    if (lVar == null) {
                        return 0;
                    }
                }
                return 0;
            }
        }
    }

    public final boolean b() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j4;
        do {
            atomicLongFieldUpdater = f5673f;
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

    public final l c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j4;
        while (true) {
            atomicLongFieldUpdater = f5673f;
            j4 = atomicLongFieldUpdater.get(this);
            if ((j4 & 1152921504606846976L) != 0) {
                break;
            }
            long j5 = j4 | 1152921504606846976L;
            if (atomicLongFieldUpdater.compareAndSet(this, j4, j5)) {
                j4 = j5;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5672e;
            l lVar = (l) atomicReferenceFieldUpdater.get(this);
            if (lVar != null) {
                return lVar;
            }
            l lVar2 = new l(this.f5675a * 2, this.f5676b);
            int i2 = (int) (1073741823 & j4);
            int i4 = (int) ((1152921503533105152L & j4) >> 30);
            while (true) {
                int i5 = this.f5677c;
                int i6 = i2 & i5;
                if (i6 == (i5 & i4)) {
                    break;
                }
                Object obj = this.f5678d.get(i6);
                if (obj == null) {
                    obj = new k(i2);
                }
                lVar2.f5678d.set(lVar2.f5677c & i2, obj);
                i2++;
            }
            atomicLongFieldUpdater.set(lVar2, (-1152921504606846977L) & j4);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, lVar2) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    public final Object d() {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f5673f;
            long j4 = atomicLongFieldUpdater.get(this);
            if ((j4 & 1152921504606846976L) != 0) {
                return f5674g;
            }
            int i2 = (int) (j4 & 1073741823);
            int i4 = this.f5677c;
            int i5 = i2 & i4;
            if ((((int) ((1152921503533105152L & j4) >> 30)) & i4) == i5) {
                return null;
            }
            AtomicReferenceArray atomicReferenceArray = this.f5678d;
            Object obj = atomicReferenceArray.get(i5);
            boolean z4 = this.f5676b;
            if (obj == null) {
                if (z4) {
                    return null;
                }
            } else {
                if (obj instanceof k) {
                    return null;
                }
                long j5 = (i2 + 1) & 1073741823;
                if (atomicLongFieldUpdater.compareAndSet(this, j4, (j4 & (-1073741824)) | j5)) {
                    atomicReferenceArray.set(i5, null);
                    return obj;
                }
                if (z4) {
                    l lVar = this;
                    while (true) {
                        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f5673f;
                        long j6 = atomicLongFieldUpdater2.get(lVar);
                        int i6 = (int) (j6 & 1073741823);
                        if ((j6 & 1152921504606846976L) != 0) {
                            lVar = lVar.c();
                        } else {
                            if (atomicLongFieldUpdater2.compareAndSet(lVar, j6, (j6 & (-1073741824)) | j5)) {
                                lVar.f5678d.set(lVar.f5677c & i6, null);
                                lVar = null;
                            } else {
                                continue;
                            }
                        }
                        if (lVar == null) {
                            return obj;
                        }
                    }
                }
            }
        }
    }
}
