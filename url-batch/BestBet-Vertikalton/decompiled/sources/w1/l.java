package w1;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f4509e = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_next");

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f4510f = AtomicLongFieldUpdater.newUpdater(l.class, "_state");

    /* renamed from: g, reason: collision with root package name */
    public static final U.q f4511g = new U.q("REMOVE_FROZEN", 2);
    private volatile Object _next;
    private volatile long _state;

    /* renamed from: a, reason: collision with root package name */
    public final int f4512a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4513b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4514c;
    public final AtomicReferenceArray d;

    public l(int i, boolean z2) {
        this.f4512a = i;
        this.f4513b = z2;
        int i2 = i - 1;
        this.f4514c = i2;
        this.d = new AtomicReferenceArray(i);
        if (i2 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i & i2) != 0) {
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
            AtomicLongFieldUpdater atomicLongFieldUpdater = f4510f;
            long j2 = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j2) != 0) {
                return (j2 & 2305843009213693952L) != 0 ? 2 : 1;
            }
            int i = (int) (1073741823 & j2);
            int i2 = (int) ((1152921503533105152L & j2) >> 30);
            int i3 = this.f4514c;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            AtomicReferenceArray atomicReferenceArray = this.d;
            if (!this.f4513b && atomicReferenceArray.get(i2 & i3) != null) {
                int i4 = this.f4512a;
                if (i4 < 1024 || ((i2 - i) & 1073741823) > (i4 >> 1)) {
                    break;
                }
            } else if (atomicLongFieldUpdater.compareAndSet(this, j2, ((-1152921503533105153L) & j2) | (((i2 + 1) & 1073741823) << 30))) {
                atomicReferenceArray.set(i2 & i3, runnable);
                l lVar = this;
                while ((atomicLongFieldUpdater.get(lVar) & 1152921504606846976L) != 0) {
                    lVar = lVar.c();
                    AtomicReferenceArray atomicReferenceArray2 = lVar.d;
                    int i5 = lVar.f4514c & i2;
                    Object obj = atomicReferenceArray2.get(i5);
                    if ((obj instanceof k) && ((k) obj).f4508a == i2) {
                        atomicReferenceArray2.set(i5, runnable);
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
        long j2;
        do {
            atomicLongFieldUpdater = f4510f;
            j2 = atomicLongFieldUpdater.get(this);
            if ((j2 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j2) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j2, 2305843009213693952L | j2));
        return true;
    }

    public final l c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j2;
        while (true) {
            atomicLongFieldUpdater = f4510f;
            j2 = atomicLongFieldUpdater.get(this);
            if ((j2 & 1152921504606846976L) != 0) {
                break;
            }
            long j3 = j2 | 1152921504606846976L;
            if (atomicLongFieldUpdater.compareAndSet(this, j2, j3)) {
                j2 = j3;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4509e;
            l lVar = (l) atomicReferenceFieldUpdater.get(this);
            if (lVar != null) {
                return lVar;
            }
            l lVar2 = new l(this.f4512a * 2, this.f4513b);
            int i = (int) (1073741823 & j2);
            int i2 = (int) ((1152921503533105152L & j2) >> 30);
            while (true) {
                int i3 = this.f4514c;
                int i4 = i & i3;
                if (i4 == (i3 & i2)) {
                    break;
                }
                Object obj = this.d.get(i4);
                if (obj == null) {
                    obj = new k(i);
                }
                lVar2.d.set(lVar2.f4514c & i, obj);
                i++;
            }
            atomicLongFieldUpdater.set(lVar2, (-1152921504606846977L) & j2);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, lVar2) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    public final Object d() {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f4510f;
            long j2 = atomicLongFieldUpdater.get(this);
            if ((j2 & 1152921504606846976L) != 0) {
                return f4511g;
            }
            int i = (int) (j2 & 1073741823);
            int i2 = this.f4514c;
            int i3 = i & i2;
            if ((((int) ((1152921503533105152L & j2) >> 30)) & i2) == i3) {
                return null;
            }
            AtomicReferenceArray atomicReferenceArray = this.d;
            Object obj = atomicReferenceArray.get(i3);
            boolean z2 = this.f4513b;
            if (obj == null) {
                if (z2) {
                    return null;
                }
            } else {
                if (obj instanceof k) {
                    return null;
                }
                long j3 = (i + 1) & 1073741823;
                if (atomicLongFieldUpdater.compareAndSet(this, j2, (j2 & (-1073741824)) | j3)) {
                    atomicReferenceArray.set(i3, null);
                    return obj;
                }
                if (z2) {
                    l lVar = this;
                    while (true) {
                        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f4510f;
                        long j4 = atomicLongFieldUpdater2.get(lVar);
                        int i4 = (int) (j4 & 1073741823);
                        if ((j4 & 1152921504606846976L) != 0) {
                            lVar = lVar.c();
                        } else {
                            if (atomicLongFieldUpdater2.compareAndSet(lVar, j4, (j4 & (-1073741824)) | j3)) {
                                lVar.d.set(lVar.f4514c & i4, null);
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
