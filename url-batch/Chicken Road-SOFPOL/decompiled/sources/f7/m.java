package f7;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2788e = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_next$volatile");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f2789f = AtomicLongFieldUpdater.newUpdater(m.class, "_state$volatile");

    /* renamed from: g, reason: collision with root package name */
    public static final d4.t f2790g = new d4.t("REMOVE_FROZEN", 1);
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final int f2791a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2792b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2793c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f2794d;

    public m(int i, boolean z3) {
        this.f2791a = i;
        this.f2792b = z3;
        int i8 = i - 1;
        this.f2793c = i8;
        this.f2794d = new AtomicReferenceArray(i);
        if (i8 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i & i8) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final int a(Object obj) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f2789f;
            long j7 = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j7) != 0) {
                return (2305843009213693952L & j7) != 0 ? 2 : 1;
            }
            int i = (int) (1073741823 & j7);
            int i8 = (int) ((1152921503533105152L & j7) >> 30);
            int i9 = this.f2793c;
            if (((i8 + 2) & i9) == (i & i9)) {
                return 1;
            }
            boolean z3 = this.f2792b;
            AtomicReferenceArray atomicReferenceArray = this.f2794d;
            if (z3 || atomicReferenceArray.get(i8 & i9) == null) {
                if (f2789f.compareAndSet(this, j7, ((-1152921503533105153L) & j7) | (((i8 + 1) & 1073741823) << 30))) {
                    atomicReferenceArray.set(i8 & i9, obj);
                    m mVar = this;
                    while ((atomicLongFieldUpdater.get(mVar) & 1152921504606846976L) != 0) {
                        mVar = mVar.c();
                        AtomicReferenceArray atomicReferenceArray2 = mVar.f2794d;
                        int i10 = mVar.f2793c & i8;
                        Object obj2 = atomicReferenceArray2.get(i10);
                        if ((obj2 instanceof l) && ((l) obj2).f2787a == i8) {
                            atomicReferenceArray2.set(i10, obj);
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
                int i11 = this.f2791a;
                if (i11 < 1024 || ((i8 - i) & 1073741823) > (i11 >> 1)) {
                    return 1;
                }
            }
        }
    }

    public final boolean b() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j7;
        do {
            atomicLongFieldUpdater = f2789f;
            j7 = atomicLongFieldUpdater.get(this);
            if ((j7 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j7) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j7, 2305843009213693952L | j7));
        return true;
    }

    public final m c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j7;
        m mVar;
        while (true) {
            atomicLongFieldUpdater = f2789f;
            j7 = atomicLongFieldUpdater.get(this);
            if ((j7 & 1152921504606846976L) != 0) {
                mVar = this;
                break;
            }
            long j8 = 1152921504606846976L | j7;
            mVar = this;
            if (atomicLongFieldUpdater.compareAndSet(mVar, j7, j8)) {
                j7 = j8;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2788e;
            m mVar2 = (m) atomicReferenceFieldUpdater.get(this);
            if (mVar2 != null) {
                return mVar2;
            }
            m mVar3 = new m(mVar.f2791a * 2, mVar.f2792b);
            int i = (int) (1073741823 & j7);
            int i8 = (int) ((1152921503533105152L & j7) >> 30);
            while (true) {
                int i9 = mVar.f2793c;
                int i10 = i & i9;
                if (i10 == (i9 & i8)) {
                    break;
                }
                Object obj = mVar.f2794d.get(i10);
                if (obj == null) {
                    obj = new l(i);
                }
                mVar3.f2794d.set(mVar3.f2793c & i, obj);
                i++;
            }
            atomicLongFieldUpdater.set(mVar3, (-1152921504606846977L) & j7);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, mVar3) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    public final Object d() {
        m mVar = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f2789f;
            long j7 = atomicLongFieldUpdater.get(mVar);
            if ((j7 & 1152921504606846976L) != 0) {
                return f2790g;
            }
            int i = (int) (j7 & 1073741823);
            int i8 = mVar.f2793c;
            int i9 = i & i8;
            if ((((int) ((1152921503533105152L & j7) >> 30)) & i8) == i9) {
                break;
            }
            AtomicReferenceArray atomicReferenceArray = mVar.f2794d;
            Object obj = atomicReferenceArray.get(i9);
            boolean z3 = mVar.f2792b;
            if (obj == null) {
                if (z3) {
                    break;
                }
            } else {
                if (obj instanceof l) {
                    break;
                }
                long j8 = (i + 1) & 1073741823;
                if (f2789f.compareAndSet(mVar, j7, (j7 & (-1073741824)) | j8)) {
                    atomicReferenceArray.set(i9, null);
                    return obj;
                }
                mVar = this;
                if (z3) {
                    while (true) {
                        long j9 = atomicLongFieldUpdater.get(mVar);
                        int i10 = (int) (j9 & 1073741823);
                        if ((j9 & 1152921504606846976L) != 0) {
                            mVar = mVar.c();
                        } else {
                            m mVar2 = mVar;
                            if (f2789f.compareAndSet(mVar2, j9, (j9 & (-1073741824)) | j8)) {
                                mVar2.f2794d.set(i10 & mVar2.f2793c, null);
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
