package d1;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f2093e = AtomicReferenceFieldUpdater.newUpdater(o.class, Object.class, "_next");

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f2094f = AtomicLongFieldUpdater.newUpdater(o.class, "_state");

    /* renamed from: g, reason: collision with root package name */
    public static final B.m f2095g = new B.m(19, "REMOVE_FROZEN");
    private volatile Object _next;
    private volatile long _state;

    /* renamed from: a, reason: collision with root package name */
    public final int f2096a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2097b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2098c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReferenceArray f2099d;

    public o(int i2, boolean z2) {
        this.f2096a = i2;
        this.f2097b = z2;
        int i3 = i2 - 1;
        this.f2098c = i3;
        this.f2099d = new AtomicReferenceArray(i2);
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
            AtomicLongFieldUpdater atomicLongFieldUpdater = f2094f;
            long j2 = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j2) != 0) {
                return (2305843009213693952L & j2) != 0 ? 2 : 1;
            }
            int i2 = (int) (1073741823 & j2);
            int i3 = (int) ((1152921503533105152L & j2) >> 30);
            int i4 = this.f2098c;
            if (((i3 + 2) & i4) == (i2 & i4)) {
                return 1;
            }
            AtomicReferenceArray atomicReferenceArray = this.f2099d;
            if (!this.f2097b && atomicReferenceArray.get(i3 & i4) != null) {
                int i5 = this.f2096a;
                if (i5 < 1024 || ((i3 - i2) & 1073741823) > (i5 >> 1)) {
                    break;
                }
            } else if (atomicLongFieldUpdater.compareAndSet(this, j2, ((-1152921503533105153L) & j2) | (((i3 + 1) & 1073741823) << 30))) {
                atomicReferenceArray.set(i3 & i4, runnable);
                o oVar = this;
                while ((atomicLongFieldUpdater.get(oVar) & 1152921504606846976L) != 0) {
                    oVar = oVar.c();
                    AtomicReferenceArray atomicReferenceArray2 = oVar.f2099d;
                    int i6 = oVar.f2098c & i3;
                    Object obj = atomicReferenceArray2.get(i6);
                    if ((obj instanceof n) && ((n) obj).f2092a == i3) {
                        atomicReferenceArray2.set(i6, runnable);
                    } else {
                        oVar = null;
                    }
                    if (oVar == null) {
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
            atomicLongFieldUpdater = f2094f;
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

    public final o c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j2;
        while (true) {
            atomicLongFieldUpdater = f2094f;
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
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2093e;
            o oVar = (o) atomicReferenceFieldUpdater.get(this);
            if (oVar != null) {
                return oVar;
            }
            o oVar2 = new o(this.f2096a * 2, this.f2097b);
            int i2 = (int) (1073741823 & j2);
            int i3 = (int) ((1152921503533105152L & j2) >> 30);
            while (true) {
                int i4 = this.f2098c;
                int i5 = i2 & i4;
                if (i5 == (i4 & i3)) {
                    break;
                }
                Object obj = this.f2099d.get(i5);
                if (obj == null) {
                    obj = new n(i2);
                }
                oVar2.f2099d.set(oVar2.f2098c & i2, obj);
                i2++;
            }
            atomicLongFieldUpdater.set(oVar2, (-1152921504606846977L) & j2);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, oVar2) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    public final Object d() {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f2094f;
            long j2 = atomicLongFieldUpdater.get(this);
            if ((j2 & 1152921504606846976L) != 0) {
                return f2095g;
            }
            int i2 = (int) (j2 & 1073741823);
            int i3 = (int) ((1152921503533105152L & j2) >> 30);
            int i4 = this.f2098c;
            int i5 = i2 & i4;
            if ((i3 & i4) == i5) {
                return null;
            }
            AtomicReferenceArray atomicReferenceArray = this.f2099d;
            Object obj = atomicReferenceArray.get(i5);
            boolean z2 = this.f2097b;
            if (obj == null) {
                if (z2) {
                    return null;
                }
            } else {
                if (obj instanceof n) {
                    return null;
                }
                long j3 = (i2 + 1) & 1073741823;
                if (atomicLongFieldUpdater.compareAndSet(this, j2, (j2 & (-1073741824)) | j3)) {
                    atomicReferenceArray.set(i5, null);
                    return obj;
                }
                if (z2) {
                    o oVar = this;
                    while (true) {
                        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f2094f;
                        long j4 = atomicLongFieldUpdater2.get(oVar);
                        int i6 = (int) (j4 & 1073741823);
                        if ((j4 & 1152921504606846976L) != 0) {
                            oVar = oVar.c();
                        } else {
                            if (atomicLongFieldUpdater2.compareAndSet(oVar, j4, (j4 & (-1073741824)) | j3)) {
                                oVar.f2099d.set(oVar.f2098c & i6, null);
                                oVar = null;
                            } else {
                                continue;
                            }
                        }
                        if (oVar == null) {
                            return obj;
                        }
                    }
                }
            }
        }
    }
}
