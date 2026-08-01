package w1;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class m {
    public static final AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_next");

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f4487f = AtomicLongFieldUpdater.newUpdater(m.class, "_state");

    /* renamed from: g, reason: collision with root package name */
    public static final V.q f4488g = new V.q("REMOVE_FROZEN", 1);
    private volatile Object _next;
    private volatile long _state;

    /* renamed from: a, reason: collision with root package name */
    public final int f4489a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4490b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4491c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReferenceArray f4492d;

    public m(int i, boolean z2) {
        this.f4489a = i;
        this.f4490b = z2;
        int i2 = i - 1;
        this.f4491c = i2;
        this.f4492d = new AtomicReferenceArray(i);
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
            AtomicLongFieldUpdater atomicLongFieldUpdater = f4487f;
            long j = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j) != 0) {
                return (j & 2305843009213693952L) != 0 ? 2 : 1;
            }
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.f4491c;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            AtomicReferenceArray atomicReferenceArray = this.f4492d;
            if (!this.f4490b && atomicReferenceArray.get(i2 & i3) != null) {
                int i4 = this.f4489a;
                if (i4 < 1024 || ((i2 - i) & 1073741823) > (i4 >> 1)) {
                    break;
                }
            } else if (atomicLongFieldUpdater.compareAndSet(this, j, ((-1152921503533105153L) & j) | (((i2 + 1) & 1073741823) << 30))) {
                atomicReferenceArray.set(i2 & i3, runnable);
                m mVar = this;
                while ((atomicLongFieldUpdater.get(mVar) & 1152921504606846976L) != 0) {
                    mVar = mVar.c();
                    AtomicReferenceArray atomicReferenceArray2 = mVar.f4492d;
                    int i5 = mVar.f4491c & i2;
                    Object obj = atomicReferenceArray2.get(i5);
                    if ((obj instanceof l) && ((l) obj).f4486a == i2) {
                        atomicReferenceArray2.set(i5, runnable);
                    } else {
                        mVar = null;
                    }
                    if (mVar == null) {
                        return 0;
                    }
                }
                return 0;
            }
        }
    }

    public final boolean b() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        do {
            atomicLongFieldUpdater = f4487f;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, 2305843009213693952L | j));
        return true;
    }

    public final m c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        while (true) {
            atomicLongFieldUpdater = f4487f;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) != 0) {
                break;
            }
            long j2 = j | 1152921504606846976L;
            if (atomicLongFieldUpdater.compareAndSet(this, j, j2)) {
                j = j2;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
            m mVar = (m) atomicReferenceFieldUpdater.get(this);
            if (mVar != null) {
                return mVar;
            }
            m mVar2 = new m(this.f4489a * 2, this.f4490b);
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = this.f4491c;
                int i4 = i & i3;
                if (i4 == (i3 & i2)) {
                    break;
                }
                Object obj = this.f4492d.get(i4);
                if (obj == null) {
                    obj = new l(i);
                }
                mVar2.f4492d.set(mVar2.f4491c & i, obj);
                i++;
            }
            atomicLongFieldUpdater.set(mVar2, (-1152921504606846977L) & j);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, mVar2) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    public final Object d() {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f4487f;
            long j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) != 0) {
                return f4488g;
            }
            int i = (int) (j & 1073741823);
            int i2 = this.f4491c;
            int i3 = i & i2;
            if ((((int) ((1152921503533105152L & j) >> 30)) & i2) == i3) {
                return null;
            }
            AtomicReferenceArray atomicReferenceArray = this.f4492d;
            Object obj = atomicReferenceArray.get(i3);
            boolean z2 = this.f4490b;
            if (obj == null) {
                if (z2) {
                    return null;
                }
            } else {
                if (obj instanceof l) {
                    return null;
                }
                long j2 = (i + 1) & 1073741823;
                if (atomicLongFieldUpdater.compareAndSet(this, j, (j & (-1073741824)) | j2)) {
                    atomicReferenceArray.set(i3, null);
                    return obj;
                }
                if (z2) {
                    m mVar = this;
                    while (true) {
                        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f4487f;
                        long j3 = atomicLongFieldUpdater2.get(mVar);
                        int i4 = (int) (j3 & 1073741823);
                        if ((j3 & 1152921504606846976L) != 0) {
                            mVar = mVar.c();
                        } else {
                            if (atomicLongFieldUpdater2.compareAndSet(mVar, j3, (j3 & (-1073741824)) | j2)) {
                                mVar.f4492d.set(mVar.f4491c & i4, null);
                                mVar = null;
                            } else {
                                continue;
                            }
                        }
                        if (mVar == null) {
                            return obj;
                        }
                    }
                }
            }
        }
    }
}
