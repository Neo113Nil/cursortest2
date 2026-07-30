package defpackage;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class si0 {
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;
    public final int a;
    public final boolean b;
    public final int c;
    public final /* synthetic */ AtomicReferenceArray d;
    public static final /* synthetic */ AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(si0.class, Object.class, "_next$volatile");
    public static final /* synthetic */ long h = n51.a.objectFieldOffset(si0.class.getDeclaredField("_next$volatile"));
    public static final /* synthetic */ AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(si0.class, "_state$volatile");
    public static final fv g = new fv("REMOVE_FROZEN", 1);

    public si0(int i, boolean z) {
        this.a = i;
        this.b = z;
        int i2 = i - 1;
        this.c = i2;
        this.d = new AtomicReferenceArray(i);
        if (i2 > 1073741823) {
            dd0.j("Check failed.");
            throw null;
        }
        if ((i & i2) == 0) {
            return;
        }
        dd0.j("Check failed.");
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
                si0 si0Var = this;
                if (f.compareAndSet(si0Var, j, ((-1152921503533105153L) & j) | (((i2 + 1) & 1073741823) << 30))) {
                    atomicReferenceArray.set(i2 & i3, obj);
                    si0 si0Var2 = si0Var;
                    while ((atomicLongFieldUpdater.get(si0Var2) & 1152921504606846976L) != 0) {
                        si0Var2 = si0Var2.d();
                        AtomicReferenceArray atomicReferenceArray2 = si0Var2.d;
                        int i4 = si0Var2.c & i2;
                        Object obj2 = atomicReferenceArray2.get(i4);
                        if ((obj2 instanceof ri0) && ((ri0) obj2).a == i2) {
                            atomicReferenceArray2.set(i4, obj);
                        } else {
                            si0Var2 = null;
                        }
                        if (si0Var2 == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
                this = si0Var;
            } else {
                int i5 = this.a;
                if (i5 < 1024 || ((i2 - i) & 1073741823) > (i5 >> 1)) {
                    return 1;
                }
            }
        }
    }

    public final si0 b(long j) {
        si0 si0Var;
        while (true) {
            e.getClass();
            Unsafe unsafe = n51.a;
            long j2 = h;
            si0 si0Var2 = (si0) unsafe.getObjectVolatile(this, j2);
            if (si0Var2 != null) {
                return si0Var2;
            }
            si0 si0Var3 = new si0(this.a * 2, this.b);
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
                    obj = new ri0(i);
                }
                si0Var3.d.set(si0Var3.c & i, obj);
                i++;
            }
            f.set(si0Var3, (-1152921504606846977L) & j);
            while (true) {
                Unsafe unsafe2 = n51.a;
                si0Var = this;
                if (!unsafe2.compareAndSwapObject(si0Var, h, (Object) null, si0Var3) && unsafe2.getObjectVolatile(si0Var, j2) == null) {
                    this = si0Var;
                }
            }
            this = si0Var;
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
            si0 si0Var = this;
            if (atomicLongFieldUpdater.compareAndSet(si0Var, j, 2305843009213693952L | j)) {
                return true;
            }
            this = si0Var;
        }
    }

    public final si0 d() {
        long j;
        si0 si0Var;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) != 0) {
                si0Var = this;
                break;
            }
            long j2 = 1152921504606846976L | j;
            si0Var = this;
            if (atomicLongFieldUpdater.compareAndSet(si0Var, j, j2)) {
                j = j2;
                break;
            }
            this = si0Var;
        }
        return si0Var.b(j);
    }

    public final Object e() {
        si0 si0Var = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long j = atomicLongFieldUpdater.get(si0Var);
            if ((j & 1152921504606846976L) != 0) {
                return g;
            }
            int i = (int) (j & 1073741823);
            int i2 = si0Var.c;
            int i3 = i & i2;
            if ((((int) ((1152921503533105152L & j) >> 30)) & i2) == i3) {
                break;
            }
            AtomicReferenceArray atomicReferenceArray = si0Var.d;
            Object obj = atomicReferenceArray.get(i3);
            boolean z = si0Var.b;
            if (obj == null) {
                if (z) {
                    break;
                }
            } else {
                if (obj instanceof ri0) {
                    break;
                }
                long j2 = (i + 1) & 1073741823;
                if (f.compareAndSet(si0Var, j, (j & (-1073741824)) | j2)) {
                    atomicReferenceArray.set(i3, null);
                    return obj;
                }
                si0Var = this;
                if (z) {
                    while (true) {
                        long j3 = atomicLongFieldUpdater.get(si0Var);
                        int i4 = (int) (j3 & 1073741823);
                        if ((j3 & 1152921504606846976L) != 0) {
                            si0Var = si0Var.d();
                        } else {
                            si0 si0Var2 = si0Var;
                            if (f.compareAndSet(si0Var2, j3, (j3 & (-1073741824)) | j2)) {
                                si0Var2.d.set(i4 & si0Var2.c, null);
                                si0Var = null;
                            } else {
                                si0Var = si0Var2;
                            }
                        }
                        if (si0Var == null) {
                            return obj;
                        }
                    }
                }
            }
        }
        return null;
    }
}
