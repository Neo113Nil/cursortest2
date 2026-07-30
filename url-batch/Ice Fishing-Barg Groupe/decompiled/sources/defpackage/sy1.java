package defpackage;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class sy1 implements nx0, Serializable {
    public volatile Object OPXfSBeufaJ8;
    public volatile ae0 rtx2ld2ELZv4;
    public static final ry1 Companion = new ry1();
    public static final AtomicReferenceFieldUpdater wdg6QnbFHrFF = AtomicReferenceFieldUpdater.newUpdater(sy1.class, Object.class, "OPXfSBeufaJ8");
    public static final /* synthetic */ long dgRBjINgWbAK = ty1.PxuCJdSBwIXG.objectFieldOffset(sy1.class.getDeclaredField("OPXfSBeufaJ8"));

    @Override // defpackage.nx0
    public final Object getValue() {
        sy1 sy1Var;
        Object obj = this.OPXfSBeufaJ8;
        jx1 jx1Var = jx1.pnx5pC0XzaCw;
        if (obj != jx1Var) {
            return obj;
        }
        ae0 ae0Var = this.rtx2ld2ELZv4;
        if (ae0Var != null) {
            Object PxuCJdSBwIXG = ae0Var.PxuCJdSBwIXG();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = wdg6QnbFHrFF;
            while (true) {
                atomicReferenceFieldUpdater.getClass();
                Unsafe unsafe = ty1.PxuCJdSBwIXG;
                long j = dgRBjINgWbAK;
                sy1Var = this;
                if (unsafe.compareAndSwapObject(sy1Var, j, jx1Var, PxuCJdSBwIXG)) {
                    sy1Var.rtx2ld2ELZv4 = null;
                    return PxuCJdSBwIXG;
                }
                if (unsafe.getObjectVolatile(sy1Var, j) != jx1Var) {
                    break;
                }
                this = sy1Var;
            }
        } else {
            sy1Var = this;
        }
        return sy1Var.OPXfSBeufaJ8;
    }

    public final String toString() {
        return this.OPXfSBeufaJ8 != jx1.pnx5pC0XzaCw ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
