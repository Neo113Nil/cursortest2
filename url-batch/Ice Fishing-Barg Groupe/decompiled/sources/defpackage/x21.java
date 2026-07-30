package defpackage;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class x21 {
    public final int PxuCJdSBwIXG;
    public final int TSizfFm2Yiuu;
    public final /* synthetic */ AtomicReferenceArray Y1f8riQaR6yg;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;
    public final boolean lS5Rgt96tfkO;
    public static final v21 Companion = new v21();
    public static final /* synthetic */ AtomicReferenceFieldUpdater e9gEMXR7LXtO = AtomicReferenceFieldUpdater.newUpdater(x21.class, Object.class, "_next$volatile");
    public static final /* synthetic */ long rtx2ld2ELZv4 = ty1.PxuCJdSBwIXG.objectFieldOffset(x21.class.getDeclaredField("_next$volatile"));
    public static final /* synthetic */ AtomicLongFieldUpdater a92UlCVFR9N8 = AtomicLongFieldUpdater.newUpdater(x21.class, "_state$volatile");
    public static final f50 RAsUl2FVSrh6 = new f50("REMOVE_FROZEN", 1);

    public x21(int i, boolean z) {
        this.PxuCJdSBwIXG = i;
        this.lS5Rgt96tfkO = z;
        int i2 = i - 1;
        this.TSizfFm2Yiuu = i2;
        this.Y1f8riQaR6yg = new AtomicReferenceArray(i);
        if (i2 > 1073741823) {
            u9.rtx2ld2ELZv4("Check failed.");
            throw null;
        }
        if ((i & i2) == 0) {
            return;
        }
        u9.rtx2ld2ELZv4("Check failed.");
        throw null;
    }

    public final int PxuCJdSBwIXG(Object obj) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = a92UlCVFR9N8;
            long j = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j) != 0) {
                Companion.getClass();
                return (2305843009213693952L & j) != 0 ? 2 : 1;
            }
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.TSizfFm2Yiuu;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            boolean z = this.lS5Rgt96tfkO;
            AtomicReferenceArray atomicReferenceArray = this.Y1f8riQaR6yg;
            if (z || atomicReferenceArray.get(i2 & i3) == null) {
                Companion.getClass();
                x21 x21Var = this;
                if (a92UlCVFR9N8.compareAndSet(x21Var, j, ((-1152921503533105153L) & j) | (((i2 + 1) & 1073741823) << 30))) {
                    atomicReferenceArray.set(i2 & i3, obj);
                    x21 x21Var2 = x21Var;
                    while ((atomicLongFieldUpdater.get(x21Var2) & 1152921504606846976L) != 0) {
                        x21Var2 = x21Var2.Y1f8riQaR6yg();
                        AtomicReferenceArray atomicReferenceArray2 = x21Var2.Y1f8riQaR6yg;
                        int i4 = x21Var2.TSizfFm2Yiuu & i2;
                        Object obj2 = atomicReferenceArray2.get(i4);
                        if ((obj2 instanceof w21) && ((w21) obj2).PxuCJdSBwIXG == i2) {
                            atomicReferenceArray2.set(i4, obj);
                        } else {
                            x21Var2 = null;
                        }
                        if (x21Var2 == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
                this = x21Var;
            } else {
                int i5 = this.PxuCJdSBwIXG;
                if (i5 < 1024 || ((i2 - i) & 1073741823) > (i5 >> 1)) {
                    return 1;
                }
            }
        }
    }

    public final boolean TSizfFm2Yiuu() {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = a92UlCVFR9N8;
            long j = atomicLongFieldUpdater.get(this);
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
            x21 x21Var = this;
            if (atomicLongFieldUpdater.compareAndSet(x21Var, j, 2305843009213693952L | j)) {
                return true;
            }
            this = x21Var;
        }
    }

    public final x21 Y1f8riQaR6yg() {
        long j;
        x21 x21Var;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = a92UlCVFR9N8;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) != 0) {
                x21Var = this;
                break;
            }
            long j2 = 1152921504606846976L | j;
            x21Var = this;
            if (atomicLongFieldUpdater.compareAndSet(x21Var, j, j2)) {
                j = j2;
                break;
            }
            this = x21Var;
        }
        return x21Var.lS5Rgt96tfkO(j);
    }

    public final Object e9gEMXR7LXtO() {
        x21 x21Var = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = a92UlCVFR9N8;
            long j = atomicLongFieldUpdater.get(x21Var);
            if ((j & 1152921504606846976L) != 0) {
                return RAsUl2FVSrh6;
            }
            int i = (int) (j & 1073741823);
            int i2 = x21Var.TSizfFm2Yiuu;
            int i3 = i & i2;
            if ((((int) ((1152921503533105152L & j) >> 30)) & i2) == i3) {
                break;
            }
            AtomicReferenceArray atomicReferenceArray = x21Var.Y1f8riQaR6yg;
            Object obj = atomicReferenceArray.get(i3);
            boolean z = x21Var.lS5Rgt96tfkO;
            if (obj == null) {
                if (z) {
                    break;
                }
            } else {
                if (obj instanceof w21) {
                    break;
                }
                Companion.getClass();
                long j2 = (i + 1) & 1073741823;
                if (a92UlCVFR9N8.compareAndSet(x21Var, j, (j & (-1073741824)) | j2)) {
                    atomicReferenceArray.set(i3, null);
                    return obj;
                }
                x21Var = this;
                if (z) {
                    while (true) {
                        long j3 = atomicLongFieldUpdater.get(x21Var);
                        int i4 = (int) (j3 & 1073741823);
                        if ((j3 & 1152921504606846976L) != 0) {
                            x21Var = x21Var.Y1f8riQaR6yg();
                        } else {
                            Companion.getClass();
                            x21 x21Var2 = x21Var;
                            if (a92UlCVFR9N8.compareAndSet(x21Var2, j3, (j3 & (-1073741824)) | j2)) {
                                x21Var2.Y1f8riQaR6yg.set(i4 & x21Var2.TSizfFm2Yiuu, null);
                                x21Var = null;
                            } else {
                                x21Var = x21Var2;
                            }
                        }
                        if (x21Var == null) {
                            return obj;
                        }
                    }
                }
            }
        }
        return null;
    }

    public final x21 lS5Rgt96tfkO(long j) {
        x21 x21Var;
        while (true) {
            e9gEMXR7LXtO.getClass();
            Unsafe unsafe = ty1.PxuCJdSBwIXG;
            long j2 = rtx2ld2ELZv4;
            x21 x21Var2 = (x21) unsafe.getObjectVolatile(this, j2);
            if (x21Var2 != null) {
                return x21Var2;
            }
            x21 x21Var3 = new x21(this.PxuCJdSBwIXG * 2, this.lS5Rgt96tfkO);
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = this.TSizfFm2Yiuu;
                int i4 = i & i3;
                if (i4 == (i3 & i2)) {
                    break;
                }
                Object obj = this.Y1f8riQaR6yg.get(i4);
                if (obj == null) {
                    obj = new w21(i);
                }
                x21Var3.Y1f8riQaR6yg.set(x21Var3.TSizfFm2Yiuu & i, obj);
                i++;
            }
            Companion.getClass();
            a92UlCVFR9N8.set(x21Var3, (-1152921504606846977L) & j);
            while (true) {
                Unsafe unsafe2 = ty1.PxuCJdSBwIXG;
                x21Var = this;
                if (!unsafe2.compareAndSwapObject(x21Var, rtx2ld2ELZv4, (Object) null, x21Var3) && unsafe2.getObjectVolatile(x21Var, j2) == null) {
                    this = x21Var;
                }
            }
            this = x21Var;
        }
    }
}
