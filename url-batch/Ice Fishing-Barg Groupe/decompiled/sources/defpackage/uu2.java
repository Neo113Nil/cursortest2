package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class uu2 {
    public final AtomicReferenceArray PxuCJdSBwIXG = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;
    public static final /* synthetic */ AtomicReferenceFieldUpdater lS5Rgt96tfkO = AtomicReferenceFieldUpdater.newUpdater(uu2.class, Object.class, "lastScheduledTask$volatile");
    public static final /* synthetic */ long a92UlCVFR9N8 = ty1.PxuCJdSBwIXG.objectFieldOffset(uu2.class.getDeclaredField("lastScheduledTask$volatile"));
    public static final /* synthetic */ AtomicIntegerFieldUpdater TSizfFm2Yiuu = AtomicIntegerFieldUpdater.newUpdater(uu2.class, "producerIndex$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater Y1f8riQaR6yg = AtomicIntegerFieldUpdater.newUpdater(uu2.class, "consumerIndex$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater e9gEMXR7LXtO = AtomicIntegerFieldUpdater.newUpdater(uu2.class, "blockingTasksInBuffer$volatile");

    public final long OPXfSBeufaJ8(int i, zt1 zt1Var) {
        uu2 uu2Var;
        while (true) {
            lS5Rgt96tfkO.getClass();
            Unsafe unsafe = ty1.PxuCJdSBwIXG;
            long j = a92UlCVFR9N8;
            ud2 ud2Var = (ud2) unsafe.getObjectVolatile(this, j);
            if (ud2Var == null) {
                return -2L;
            }
            if (((ud2Var.OPXfSBeufaJ8 ? 1 : 2) & i) == 0) {
                return -2L;
            }
            de2.a92UlCVFR9N8.getClass();
            long nanoTime = System.nanoTime() - ud2Var.rtx2ld2ELZv4;
            long j2 = de2.lS5Rgt96tfkO;
            if (nanoTime < j2) {
                return j2 - nanoTime;
            }
            while (true) {
                Unsafe unsafe2 = ty1.PxuCJdSBwIXG;
                uu2Var = this;
                if (unsafe2.compareAndSwapObject(uu2Var, a92UlCVFR9N8, ud2Var, (Object) null)) {
                    zt1Var.rtx2ld2ELZv4 = ud2Var;
                    return -1L;
                }
                if (unsafe2.getObjectVolatile(uu2Var, j) != ud2Var) {
                    break;
                }
                this = uu2Var;
            }
            this = uu2Var;
        }
    }

    public final ud2 PxuCJdSBwIXG(ud2 ud2Var, boolean z) {
        if (z) {
            return lS5Rgt96tfkO(ud2Var);
        }
        lS5Rgt96tfkO.getClass();
        ud2 ud2Var2 = (ud2) ty1.PxuCJdSBwIXG.getAndSetObject(this, a92UlCVFR9N8, ud2Var);
        if (ud2Var2 == null) {
            return null;
        }
        return lS5Rgt96tfkO(ud2Var2);
    }

    public final ud2 RAsUl2FVSrh6() {
        uu2 uu2Var;
        while (true) {
            lS5Rgt96tfkO.getClass();
            Unsafe unsafe = ty1.PxuCJdSBwIXG;
            long j = a92UlCVFR9N8;
            ud2 ud2Var = (ud2) unsafe.getObjectVolatile(this, j);
            if (ud2Var != null && ud2Var.OPXfSBeufaJ8) {
                while (true) {
                    Unsafe unsafe2 = ty1.PxuCJdSBwIXG;
                    uu2Var = this;
                    if (unsafe2.compareAndSwapObject(uu2Var, a92UlCVFR9N8, ud2Var, (Object) null)) {
                        return ud2Var;
                    }
                    if (unsafe2.getObjectVolatile(uu2Var, j) != ud2Var) {
                        break;
                    }
                    this = uu2Var;
                }
            }
            this = uu2Var;
        }
        uu2 uu2Var2 = this;
        int i = Y1f8riQaR6yg.get(uu2Var2);
        int i2 = TSizfFm2Yiuu.get(uu2Var2);
        while (i != i2 && e9gEMXR7LXtO.get(uu2Var2) != 0) {
            i2--;
            ud2 rtx2ld2ELZv4 = uu2Var2.rtx2ld2ELZv4(i2, true);
            if (rtx2ld2ELZv4 != null) {
                return rtx2ld2ELZv4;
            }
        }
        return null;
    }

    public final int TSizfFm2Yiuu() {
        lS5Rgt96tfkO.getClass();
        Object objectVolatile = ty1.PxuCJdSBwIXG.getObjectVolatile(this, a92UlCVFR9N8);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = Y1f8riQaR6yg;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = TSizfFm2Yiuu;
        return objectVolatile != null ? (atomicIntegerFieldUpdater2.get(this) - atomicIntegerFieldUpdater.get(this)) + 1 : atomicIntegerFieldUpdater2.get(this) - atomicIntegerFieldUpdater.get(this);
    }

    public final void Y1f8riQaR6yg(tg0 tg0Var) {
        lS5Rgt96tfkO.getClass();
        ud2 ud2Var = (ud2) ty1.PxuCJdSBwIXG.getAndSetObject(this, a92UlCVFR9N8, (Object) null);
        if (ud2Var != null) {
            tg0Var.PxuCJdSBwIXG(ud2Var);
        }
        while (true) {
            ud2 a92UlCVFR9N82 = a92UlCVFR9N8();
            if (a92UlCVFR9N82 == null) {
                return;
            } else {
                tg0Var.PxuCJdSBwIXG(a92UlCVFR9N82);
            }
        }
    }

    public final ud2 a92UlCVFR9N8() {
        ud2 ud2Var;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = Y1f8riQaR6yg;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i - TSizfFm2Yiuu.get(this) == 0) {
                return null;
            }
            int i2 = i & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1) && (ud2Var = (ud2) this.PxuCJdSBwIXG.getAndSet(i2, null)) != null) {
                if (ud2Var.OPXfSBeufaJ8) {
                    e9gEMXR7LXtO.decrementAndGet(this);
                }
                return ud2Var;
            }
        }
    }

    public final ud2 e9gEMXR7LXtO() {
        lS5Rgt96tfkO.getClass();
        ud2 ud2Var = (ud2) ty1.PxuCJdSBwIXG.getAndSetObject(this, a92UlCVFR9N8, (Object) null);
        return ud2Var == null ? a92UlCVFR9N8() : ud2Var;
    }

    public final ud2 lS5Rgt96tfkO(ud2 ud2Var) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = TSizfFm2Yiuu;
        if (atomicIntegerFieldUpdater.get(this) - Y1f8riQaR6yg.get(this) == 127) {
            return ud2Var;
        }
        if (ud2Var.OPXfSBeufaJ8) {
            e9gEMXR7LXtO.incrementAndGet(this);
        }
        int i = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.PxuCJdSBwIXG;
            if (atomicReferenceArray.get(i) == null) {
                atomicReferenceArray.lazySet(i, ud2Var);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }

    public final ud2 rtx2ld2ELZv4(int i, boolean z) {
        int i2 = i & 127;
        AtomicReferenceArray atomicReferenceArray = this.PxuCJdSBwIXG;
        ud2 ud2Var = (ud2) atomicReferenceArray.get(i2);
        if (ud2Var != null && ud2Var.OPXfSBeufaJ8 == z) {
            while (!atomicReferenceArray.compareAndSet(i2, ud2Var, null)) {
                if (atomicReferenceArray.get(i2) != ud2Var) {
                }
            }
            if (z) {
                e9gEMXR7LXtO.decrementAndGet(this);
            }
            return ud2Var;
        }
        return null;
    }
}
