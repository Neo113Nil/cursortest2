package v2;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f9812e = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_next$volatile");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f9813f = AtomicLongFieldUpdater.newUpdater(l.class, "_state$volatile");

    /* renamed from: g, reason: collision with root package name */
    public static final m1.q f9814g = new m1.q("REMOVE_FROZEN", 1);
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final int f9815a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f9816b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9817c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f9818d;

    public l(int i3, boolean z3) {
        this.f9815a = i3;
        this.f9816b = z3;
        int i4 = i3 - 1;
        this.f9817c = i4;
        this.f9818d = new AtomicReferenceArray(i3);
        if (i4 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i3 & i4) != 0) {
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
            AtomicLongFieldUpdater atomicLongFieldUpdater = f9813f;
            long j3 = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j3) != 0) {
                return (j3 & 2305843009213693952L) != 0 ? 2 : 1;
            }
            int i3 = (int) (1073741823 & j3);
            int i4 = (int) ((1152921503533105152L & j3) >> 30);
            int i5 = this.f9817c;
            if (((i4 + 2) & i5) == (i3 & i5)) {
                return 1;
            }
            AtomicReferenceArray atomicReferenceArray = this.f9818d;
            if (!this.f9816b && atomicReferenceArray.get(i4 & i5) != null) {
                int i6 = this.f9815a;
                if (i6 < 1024 || ((i4 - i3) & 1073741823) > (i6 >> 1)) {
                    break;
                }
            } else if (atomicLongFieldUpdater.compareAndSet(this, j3, ((-1152921503533105153L) & j3) | (((i4 + 1) & 1073741823) << 30))) {
                atomicReferenceArray.set(i4 & i5, runnable);
                l lVar = this;
                while ((atomicLongFieldUpdater.get(lVar) & 1152921504606846976L) != 0) {
                    lVar = lVar.c();
                    AtomicReferenceArray atomicReferenceArray2 = lVar.f9818d;
                    int i7 = lVar.f9817c & i4;
                    Object obj = atomicReferenceArray2.get(i7);
                    if ((obj instanceof k) && ((k) obj).f9811a == i4) {
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
        long j3;
        do {
            atomicLongFieldUpdater = f9813f;
            j3 = atomicLongFieldUpdater.get(this);
            if ((j3 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j3) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j3, 2305843009213693952L | j3));
        return true;
    }

    public final l c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j3;
        while (true) {
            atomicLongFieldUpdater = f9813f;
            j3 = atomicLongFieldUpdater.get(this);
            if ((j3 & 1152921504606846976L) != 0) {
                break;
            }
            long j4 = j3 | 1152921504606846976L;
            if (atomicLongFieldUpdater.compareAndSet(this, j3, j4)) {
                j3 = j4;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9812e;
            l lVar = (l) atomicReferenceFieldUpdater.get(this);
            if (lVar != null) {
                return lVar;
            }
            l lVar2 = new l(this.f9815a * 2, this.f9816b);
            int i3 = (int) (1073741823 & j3);
            int i4 = (int) ((1152921503533105152L & j3) >> 30);
            while (true) {
                int i5 = this.f9817c;
                int i6 = i3 & i5;
                if (i6 == (i5 & i4)) {
                    break;
                }
                Object obj = this.f9818d.get(i6);
                if (obj == null) {
                    obj = new k(i3);
                }
                lVar2.f9818d.set(lVar2.f9817c & i3, obj);
                i3++;
            }
            atomicLongFieldUpdater.set(lVar2, (-1152921504606846977L) & j3);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, lVar2) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    public final Object d() {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f9813f;
            long j3 = atomicLongFieldUpdater.get(this);
            if ((j3 & 1152921504606846976L) != 0) {
                return f9814g;
            }
            int i3 = (int) (j3 & 1073741823);
            int i4 = this.f9817c;
            int i5 = i3 & i4;
            if ((((int) ((1152921503533105152L & j3) >> 30)) & i4) == i5) {
                return null;
            }
            AtomicReferenceArray atomicReferenceArray = this.f9818d;
            Object obj = atomicReferenceArray.get(i5);
            boolean z3 = this.f9816b;
            if (obj == null) {
                if (z3) {
                    return null;
                }
            } else {
                if (obj instanceof k) {
                    return null;
                }
                long j4 = (i3 + 1) & 1073741823;
                if (atomicLongFieldUpdater.compareAndSet(this, j3, (j3 & (-1073741824)) | j4)) {
                    atomicReferenceArray.set(i5, null);
                    return obj;
                }
                if (z3) {
                    l lVar = this;
                    while (true) {
                        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f9813f;
                        long j5 = atomicLongFieldUpdater2.get(lVar);
                        int i6 = (int) (j5 & 1073741823);
                        if ((j5 & 1152921504606846976L) != 0) {
                            lVar = lVar.c();
                        } else {
                            if (atomicLongFieldUpdater2.compareAndSet(lVar, j5, (j5 & (-1073741824)) | j4)) {
                                lVar.f9818d.set(lVar.f9817c & i6, null);
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
