package defpackage;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ag1 {
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;
    public final int a;
    public final boolean b;
    public final int c;
    public final /* synthetic */ AtomicReferenceArray d;
    public static final /* synthetic */ AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(ag1.class, Object.class, "_next$volatile");
    public static final /* synthetic */ long h = hd2.a.objectFieldOffset(ag1.class.getDeclaredField("_next$volatile"));
    public static final /* synthetic */ AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(ag1.class, "_state$volatile");
    public static final ng0 g = new ng0("REMOVE_FROZEN", 1);

    public ag1(int i, boolean z) {
        this.a = i;
        this.b = z;
        int i2 = i - 1;
        this.c = i2;
        this.d = new AtomicReferenceArray(i);
        if (i2 > 1073741823) {
            lh.g("Check failed.");
            throw null;
        }
        if ((i & i2) == 0) {
            return;
        }
        lh.g("Check failed.");
        throw null;
    }

    public final int a(Object obj) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long j = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j) != 0) {
                return (2305843009213693952L & j) != 0 ? 2 : 1;
            }
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.c;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            boolean z = this.b;
            AtomicReferenceArray atomicReferenceArray = this.d;
            if (z || atomicReferenceArray.get(i2 & i3) == null) {
                ag1 ag1Var = this;
                if (f.compareAndSet(ag1Var, j, ((-1152921503533105153L) & j) | (((i2 + 1) & 1073741823) << 30))) {
                    atomicReferenceArray.set(i2 & i3, obj);
                    ag1 ag1Var2 = ag1Var;
                    while ((atomicLongFieldUpdater.get(ag1Var2) & 1152921504606846976L) != 0) {
                        ag1Var2 = ag1Var2.d();
                        AtomicReferenceArray atomicReferenceArray2 = ag1Var2.d;
                        int i4 = ag1Var2.c & i2;
                        Object obj2 = atomicReferenceArray2.get(i4);
                        if ((obj2 instanceof zf1) && ((zf1) obj2).a == i2) {
                            atomicReferenceArray2.set(i4, obj);
                        } else {
                            ag1Var2 = null;
                        }
                        if (ag1Var2 == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
                this = ag1Var;
            } else {
                int i5 = this.a;
                if (i5 < 1024 || ((i2 - i) & 1073741823) > (i5 >> 1)) {
                    return 1;
                }
            }
        }
    }

    public final ag1 b(long j) {
        ag1 ag1Var;
        while (true) {
            e.getClass();
            Unsafe unsafe = hd2.a;
            long j2 = h;
            ag1 ag1Var2 = (ag1) unsafe.getObjectVolatile(this, j2);
            if (ag1Var2 != null) {
                return ag1Var2;
            }
            ag1 ag1Var3 = new ag1(this.a * 2, this.b);
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = this.c;
                int i4 = i & i3;
                if (i4 == (i3 & i2)) {
                    break;
                }
                Object obj = this.d.get(i4);
                if (obj == null) {
                    obj = new zf1(i);
                }
                ag1Var3.d.set(ag1Var3.c & i, obj);
                i++;
            }
            f.set(ag1Var3, (-1152921504606846977L) & j);
            while (true) {
                Unsafe unsafe2 = hd2.a;
                ag1Var = this;
                if (!unsafe2.compareAndSwapObject(ag1Var, h, (Object) null, ag1Var3) && unsafe2.getObjectVolatile(ag1Var, j2) == null) {
                    this = ag1Var;
                }
            }
            this = ag1Var;
        }
    }

    public final boolean c() {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long j = atomicLongFieldUpdater.get(this);
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
            ag1 ag1Var = this;
            if (atomicLongFieldUpdater.compareAndSet(ag1Var, j, 2305843009213693952L | j)) {
                return true;
            }
            this = ag1Var;
        }
    }

    public final ag1 d() {
        long j;
        ag1 ag1Var;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) != 0) {
                ag1Var = this;
                break;
            }
            long j2 = 1152921504606846976L | j;
            ag1Var = this;
            if (atomicLongFieldUpdater.compareAndSet(ag1Var, j, j2)) {
                j = j2;
                break;
            }
            this = ag1Var;
        }
        return ag1Var.b(j);
    }

    public final Object e() {
        ag1 ag1Var = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long j = atomicLongFieldUpdater.get(ag1Var);
            if ((j & 1152921504606846976L) != 0) {
                return g;
            }
            int i = (int) (j & 1073741823);
            int i2 = ag1Var.c;
            int i3 = i & i2;
            if ((((int) ((1152921503533105152L & j) >> 30)) & i2) == i3) {
                break;
            }
            AtomicReferenceArray atomicReferenceArray = ag1Var.d;
            Object obj = atomicReferenceArray.get(i3);
            boolean z = ag1Var.b;
            if (obj == null) {
                if (z) {
                    break;
                }
            } else {
                if (obj instanceof zf1) {
                    break;
                }
                long j2 = (i + 1) & 1073741823;
                if (f.compareAndSet(ag1Var, j, (j & (-1073741824)) | j2)) {
                    atomicReferenceArray.set(i3, null);
                    return obj;
                }
                ag1Var = this;
                if (z) {
                    while (true) {
                        long j3 = atomicLongFieldUpdater.get(ag1Var);
                        int i4 = (int) (j3 & 1073741823);
                        if ((j3 & 1152921504606846976L) != 0) {
                            ag1Var = ag1Var.d();
                        } else {
                            ag1 ag1Var2 = ag1Var;
                            if (f.compareAndSet(ag1Var2, j3, (j3 & (-1073741824)) | j2)) {
                                ag1Var2.d.set(i4 & ag1Var2.c, null);
                                ag1Var = null;
                            } else {
                                ag1Var = ag1Var2;
                            }
                        }
                        if (ag1Var == null) {
                            return obj;
                        }
                    }
                }
            }
        }
        return null;
    }
}
