package s6;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import l0.C0654a;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7843e = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_next$volatile");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f7844f = AtomicLongFieldUpdater.newUpdater(m.class, "_state$volatile");

    /* renamed from: g, reason: collision with root package name */
    public static final C0654a f7845g = new C0654a("REMOVE_FROZEN", 1);
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final int f7846a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f7847b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7848c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f7849d;

    public m(int i2, boolean z7) {
        this.f7846a = i2;
        this.f7847b = z7;
        int i5 = i2 - 1;
        this.f7848c = i5;
        this.f7849d = new AtomicReferenceArray(i2);
        if (i5 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i2 & i5) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final int a(Object obj) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f7844f;
            long j = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j) != 0) {
                return (2305843009213693952L & j) != 0 ? 2 : 1;
            }
            int i2 = (int) (1073741823 & j);
            int i5 = (int) ((1152921503533105152L & j) >> 30);
            int i7 = this.f7848c;
            if (((i5 + 2) & i7) == (i2 & i7)) {
                return 1;
            }
            boolean z7 = this.f7847b;
            AtomicReferenceArray atomicReferenceArray = this.f7849d;
            if (z7 || atomicReferenceArray.get(i5 & i7) == null) {
                if (f7844f.compareAndSet(this, j, ((-1152921503533105153L) & j) | (((i5 + 1) & 1073741823) << 30))) {
                    atomicReferenceArray.set(i5 & i7, obj);
                    m mVar = this;
                    while ((atomicLongFieldUpdater.get(mVar) & 1152921504606846976L) != 0) {
                        mVar = mVar.c();
                        AtomicReferenceArray atomicReferenceArray2 = mVar.f7849d;
                        int i8 = mVar.f7848c & i5;
                        Object obj2 = atomicReferenceArray2.get(i8);
                        if ((obj2 instanceof l) && ((l) obj2).f7842a == i5) {
                            atomicReferenceArray2.set(i8, obj);
                        } else {
                            mVar = null;
                        }
                        if (mVar == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
            } else {
                int i9 = this.f7846a;
                if (i9 < 1024 || ((i5 - i2) & 1073741823) > (i9 >> 1)) {
                    return 1;
                }
            }
        }
    }

    public final boolean b() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        do {
            atomicLongFieldUpdater = f7844f;
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
        m mVar;
        while (true) {
            atomicLongFieldUpdater = f7844f;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) != 0) {
                mVar = this;
                break;
            }
            long j7 = 1152921504606846976L | j;
            mVar = this;
            if (atomicLongFieldUpdater.compareAndSet(mVar, j, j7)) {
                j = j7;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7843e;
            m mVar2 = (m) atomicReferenceFieldUpdater.get(this);
            if (mVar2 != null) {
                return mVar2;
            }
            m mVar3 = new m(mVar.f7846a * 2, mVar.f7847b);
            int i2 = (int) (1073741823 & j);
            int i5 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i7 = mVar.f7848c;
                int i8 = i2 & i7;
                if (i8 == (i7 & i5)) {
                    break;
                }
                Object obj = mVar.f7849d.get(i8);
                if (obj == null) {
                    obj = new l(i2);
                }
                mVar3.f7849d.set(mVar3.f7848c & i2, obj);
                i2++;
            }
            atomicLongFieldUpdater.set(mVar3, (-1152921504606846977L) & j);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, mVar3) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    public final Object d() {
        m mVar = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f7844f;
            long j = atomicLongFieldUpdater.get(mVar);
            if ((j & 1152921504606846976L) != 0) {
                return f7845g;
            }
            int i2 = (int) (j & 1073741823);
            int i5 = mVar.f7848c;
            int i7 = i2 & i5;
            if ((((int) ((1152921503533105152L & j) >> 30)) & i5) == i7) {
                break;
            }
            AtomicReferenceArray atomicReferenceArray = mVar.f7849d;
            Object obj = atomicReferenceArray.get(i7);
            boolean z7 = mVar.f7847b;
            if (obj == null) {
                if (z7) {
                    break;
                }
            } else {
                if (obj instanceof l) {
                    break;
                }
                long j7 = (i2 + 1) & 1073741823;
                if (f7844f.compareAndSet(mVar, j, (j & (-1073741824)) | j7)) {
                    atomicReferenceArray.set(i7, null);
                    return obj;
                }
                mVar = this;
                if (z7) {
                    while (true) {
                        long j8 = atomicLongFieldUpdater.get(mVar);
                        int i8 = (int) (j8 & 1073741823);
                        if ((j8 & 1152921504606846976L) != 0) {
                            mVar = mVar.c();
                        } else {
                            m mVar2 = mVar;
                            if (f7844f.compareAndSet(mVar2, j8, (j8 & (-1073741824)) | j7)) {
                                mVar2.f7849d.set(i8 & mVar2.f7848c, null);
                                mVar = null;
                            } else {
                                mVar = mVar2;
                            }
                        }
                        if (mVar == null) {
                            return obj;
                        }
                    }
                }
            }
        }
        return null;
    }
}
