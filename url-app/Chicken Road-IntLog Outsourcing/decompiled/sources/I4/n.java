package I4;

import G0.C0051a;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1309e = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "_next");

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f1310f = AtomicLongFieldUpdater.newUpdater(n.class, "_state");

    /* renamed from: g, reason: collision with root package name */
    public static final C0051a f1311g = new C0051a("REMOVE_FROZEN", 2);
    private volatile Object _next;
    private volatile long _state;

    /* renamed from: a, reason: collision with root package name */
    public final int f1312a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1313b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1314c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReferenceArray f1315d;

    public n(int i2, boolean z) {
        this.f1312a = i2;
        this.f1313b = z;
        int i3 = i2 - 1;
        this.f1314c = i3;
        this.f1315d = new AtomicReferenceArray(i2);
        if (i3 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i2 & i3) != 0) {
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
            AtomicLongFieldUpdater atomicLongFieldUpdater = f1310f;
            long j2 = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j2) != 0) {
                return (j2 & 2305843009213693952L) != 0 ? 2 : 1;
            }
            int i2 = (int) (1073741823 & j2);
            int i3 = (int) ((1152921503533105152L & j2) >> 30);
            int i6 = this.f1314c;
            if (((i3 + 2) & i6) == (i2 & i6)) {
                return 1;
            }
            AtomicReferenceArray atomicReferenceArray = this.f1315d;
            if (!this.f1313b && atomicReferenceArray.get(i3 & i6) != null) {
                int i7 = this.f1312a;
                if (i7 < 1024 || ((i3 - i2) & 1073741823) > (i7 >> 1)) {
                    break;
                }
            } else if (atomicLongFieldUpdater.compareAndSet(this, j2, ((-1152921503533105153L) & j2) | (((i3 + 1) & 1073741823) << 30))) {
                atomicReferenceArray.set(i3 & i6, runnable);
                n nVar = this;
                while ((atomicLongFieldUpdater.get(nVar) & 1152921504606846976L) != 0) {
                    nVar = nVar.c();
                    AtomicReferenceArray atomicReferenceArray2 = nVar.f1315d;
                    int i8 = nVar.f1314c & i3;
                    Object obj = atomicReferenceArray2.get(i8);
                    if ((obj instanceof m) && ((m) obj).f1308a == i3) {
                        atomicReferenceArray2.set(i8, runnable);
                    } else {
                        nVar = null;
                    }
                    if (nVar == null) {
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
            atomicLongFieldUpdater = f1310f;
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

    public final n c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j2;
        while (true) {
            atomicLongFieldUpdater = f1310f;
            j2 = atomicLongFieldUpdater.get(this);
            if ((j2 & 1152921504606846976L) != 0) {
                break;
            }
            long j6 = j2 | 1152921504606846976L;
            if (atomicLongFieldUpdater.compareAndSet(this, j2, j6)) {
                j2 = j6;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1309e;
            n nVar = (n) atomicReferenceFieldUpdater.get(this);
            if (nVar != null) {
                return nVar;
            }
            n nVar2 = new n(this.f1312a * 2, this.f1313b);
            int i2 = (int) (1073741823 & j2);
            int i3 = (int) ((1152921503533105152L & j2) >> 30);
            while (true) {
                int i6 = this.f1314c;
                int i7 = i2 & i6;
                if (i7 == (i6 & i3)) {
                    break;
                }
                Object obj = this.f1315d.get(i7);
                if (obj == null) {
                    obj = new m(i2);
                }
                nVar2.f1315d.set(nVar2.f1314c & i2, obj);
                i2++;
            }
            atomicLongFieldUpdater.set(nVar2, (-1152921504606846977L) & j2);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, nVar2) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    public final Object d() {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f1310f;
            long j2 = atomicLongFieldUpdater.get(this);
            if ((j2 & 1152921504606846976L) != 0) {
                return f1311g;
            }
            int i2 = (int) (j2 & 1073741823);
            int i3 = this.f1314c;
            int i6 = i2 & i3;
            if ((((int) ((1152921503533105152L & j2) >> 30)) & i3) == i6) {
                return null;
            }
            AtomicReferenceArray atomicReferenceArray = this.f1315d;
            Object obj = atomicReferenceArray.get(i6);
            boolean z = this.f1313b;
            if (obj == null) {
                if (z) {
                    return null;
                }
            } else {
                if (obj instanceof m) {
                    return null;
                }
                long j6 = (i2 + 1) & 1073741823;
                if (atomicLongFieldUpdater.compareAndSet(this, j2, (j2 & (-1073741824)) | j6)) {
                    atomicReferenceArray.set(i6, null);
                    return obj;
                }
                if (z) {
                    n nVar = this;
                    while (true) {
                        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f1310f;
                        long j7 = atomicLongFieldUpdater2.get(nVar);
                        int i7 = (int) (j7 & 1073741823);
                        if ((j7 & 1152921504606846976L) != 0) {
                            nVar = nVar.c();
                        } else {
                            if (atomicLongFieldUpdater2.compareAndSet(nVar, j7, (j7 & (-1073741824)) | j6)) {
                                nVar.f1315d.set(nVar.f1314c & i7, null);
                                nVar = null;
                            } else {
                                continue;
                            }
                        }
                        if (nVar == null) {
                            return obj;
                        }
                    }
                }
            }
        }
    }
}
