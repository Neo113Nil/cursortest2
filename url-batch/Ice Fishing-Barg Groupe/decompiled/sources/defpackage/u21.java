package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public class u21 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater PxuCJdSBwIXG = AtomicReferenceFieldUpdater.newUpdater(u21.class, Object.class, "_cur$volatile");
    public static final /* synthetic */ long lS5Rgt96tfkO = ty1.PxuCJdSBwIXG.objectFieldOffset(u21.class.getDeclaredField("_cur$volatile"));
    private volatile /* synthetic */ Object _cur$volatile = new x21(8, false);

    public final boolean PxuCJdSBwIXG(Runnable runnable) {
        u21 u21Var;
        while (true) {
            PxuCJdSBwIXG.getClass();
            Unsafe unsafe = ty1.PxuCJdSBwIXG;
            long j = lS5Rgt96tfkO;
            x21 x21Var = (x21) unsafe.getObjectVolatile(this, j);
            int PxuCJdSBwIXG2 = x21Var.PxuCJdSBwIXG(runnable);
            if (PxuCJdSBwIXG2 == 0) {
                return true;
            }
            if (PxuCJdSBwIXG2 == 1) {
                x21 Y1f8riQaR6yg = x21Var.Y1f8riQaR6yg();
                while (true) {
                    Unsafe unsafe2 = ty1.PxuCJdSBwIXG;
                    u21Var = this;
                    if (!unsafe2.compareAndSwapObject(u21Var, lS5Rgt96tfkO, x21Var, Y1f8riQaR6yg) && unsafe2.getObjectVolatile(u21Var, j) == x21Var) {
                        this = u21Var;
                    }
                }
            } else {
                if (PxuCJdSBwIXG2 == 2) {
                    return false;
                }
                u21Var = this;
            }
            this = u21Var;
        }
    }

    public final int TSizfFm2Yiuu() {
        PxuCJdSBwIXG.getClass();
        x21 x21Var = (x21) ty1.PxuCJdSBwIXG.getObjectVolatile(this, lS5Rgt96tfkO);
        x21Var.getClass();
        long j = x21.a92UlCVFR9N8.get(x21Var);
        return 1073741823 & (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j)));
    }

    public final Object Y1f8riQaR6yg() {
        u21 u21Var;
        while (true) {
            PxuCJdSBwIXG.getClass();
            Unsafe unsafe = ty1.PxuCJdSBwIXG;
            long j = lS5Rgt96tfkO;
            x21 x21Var = (x21) unsafe.getObjectVolatile(this, j);
            Object e9gEMXR7LXtO = x21Var.e9gEMXR7LXtO();
            if (e9gEMXR7LXtO != x21.RAsUl2FVSrh6) {
                return e9gEMXR7LXtO;
            }
            x21 Y1f8riQaR6yg = x21Var.Y1f8riQaR6yg();
            while (true) {
                Unsafe unsafe2 = ty1.PxuCJdSBwIXG;
                u21Var = this;
                if (!unsafe2.compareAndSwapObject(u21Var, lS5Rgt96tfkO, x21Var, Y1f8riQaR6yg) && unsafe2.getObjectVolatile(u21Var, j) == x21Var) {
                    this = u21Var;
                }
            }
            this = u21Var;
        }
    }

    public final void lS5Rgt96tfkO() {
        u21 u21Var;
        while (true) {
            PxuCJdSBwIXG.getClass();
            Unsafe unsafe = ty1.PxuCJdSBwIXG;
            long j = lS5Rgt96tfkO;
            x21 x21Var = (x21) unsafe.getObjectVolatile(this, j);
            if (x21Var.TSizfFm2Yiuu()) {
                return;
            }
            x21 Y1f8riQaR6yg = x21Var.Y1f8riQaR6yg();
            while (true) {
                Unsafe unsafe2 = ty1.PxuCJdSBwIXG;
                u21Var = this;
                if (!unsafe2.compareAndSwapObject(u21Var, lS5Rgt96tfkO, x21Var, Y1f8riQaR6yg) && unsafe2.getObjectVolatile(u21Var, j) == x21Var) {
                    this = u21Var;
                }
            }
            this = u21Var;
        }
    }
}
