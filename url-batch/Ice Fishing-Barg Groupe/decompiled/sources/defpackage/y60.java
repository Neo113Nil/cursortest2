package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class y60 extends t60 implements rx {
    public static final /* synthetic */ long BRwzKIf41E4i;
    public static final /* synthetic */ AtomicReferenceFieldUpdater QrzZRwfaDlRX;
    public static final /* synthetic */ long XL4ISE6Oc65B;
    public static final /* synthetic */ AtomicIntegerFieldUpdater gPXPFXrUH4XX;
    public static final /* synthetic */ AtomicReferenceFieldUpdater r3s1LDPKFs1S = AtomicReferenceFieldUpdater.newUpdater(y60.class, Object.class, "_queue$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    static {
        Unsafe unsafe = ty1.PxuCJdSBwIXG;
        XL4ISE6Oc65B = unsafe.objectFieldOffset(y60.class.getDeclaredField("_queue$volatile"));
        QrzZRwfaDlRX = AtomicReferenceFieldUpdater.newUpdater(y60.class, Object.class, "_delayed$volatile");
        BRwzKIf41E4i = unsafe.objectFieldOffset(y60.class.getDeclaredField("_delayed$volatile"));
        gPXPFXrUH4XX = AtomicIntegerFieldUpdater.newUpdater(y60.class, "_isCompleted$volatile");
    }

    public final boolean D0aTLcX6Uhyo() {
        da daVar = this.x50lh2ztY7Y5;
        if (daVar != null ? daVar.isEmpty() : true) {
            QrzZRwfaDlRX.getClass();
            Unsafe unsafe = ty1.PxuCJdSBwIXG;
            x60 x60Var = (x60) unsafe.getObjectVolatile(this, BRwzKIf41E4i);
            if (x60Var != null && qj2.lS5Rgt96tfkO.get(x60Var) != 0) {
                return false;
            }
            r3s1LDPKFs1S.getClass();
            Object objectVolatile = unsafe.getObjectVolatile(this, XL4ISE6Oc65B);
            if (objectVolatile != null) {
                if (objectVolatile instanceof x21) {
                    long j = x21.a92UlCVFR9N8.get((x21) objectVolatile);
                    return ((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30));
                }
                if (objectVolatile == f2.wdg6QnbFHrFF) {
                }
            }
            return true;
        }
        return false;
    }

    public final void JHNfcAUfKc4G() {
        y60 y60Var;
        Unsafe unsafe;
        f50 f50Var = f2.wdg6QnbFHrFF;
        while (true) {
            r3s1LDPKFs1S.getClass();
            Unsafe unsafe2 = ty1.PxuCJdSBwIXG;
            long j = XL4ISE6Oc65B;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            if (objectVolatile == null) {
                while (true) {
                    Unsafe unsafe3 = ty1.PxuCJdSBwIXG;
                    y60Var = this;
                    if (unsafe3.compareAndSwapObject(y60Var, XL4ISE6Oc65B, (Object) null, f50Var)) {
                        return;
                    }
                    if (unsafe3.getObjectVolatile(y60Var, j) != null) {
                        break;
                    } else {
                        this = y60Var;
                    }
                }
            } else {
                y60Var = this;
                if (objectVolatile instanceof x21) {
                    ((x21) objectVolatile).TSizfFm2Yiuu();
                    return;
                }
                if (objectVolatile == f50Var) {
                    return;
                }
                x21 x21Var = new x21(8, true);
                x21Var.PxuCJdSBwIXG((Runnable) objectVolatile);
                do {
                    unsafe = ty1.PxuCJdSBwIXG;
                    if (unsafe.compareAndSwapObject(y60Var, XL4ISE6Oc65B, objectVolatile, x21Var)) {
                        return;
                    }
                } while (unsafe.getObjectVolatile(y60Var, j) == objectVolatile);
            }
            this = y60Var;
        }
    }

    public final void JTxCbbCwomzt() {
        w60 lS5Rgt96tfkO;
        long nanoTime = System.nanoTime();
        while (true) {
            QrzZRwfaDlRX.getClass();
            x60 x60Var = (x60) ty1.PxuCJdSBwIXG.getObjectVolatile(this, BRwzKIf41E4i);
            if (x60Var == null) {
                return;
            }
            synchronized (x60Var) {
                lS5Rgt96tfkO = qj2.lS5Rgt96tfkO.get(x60Var) > 0 ? x60Var.lS5Rgt96tfkO(0) : null;
            }
            if (lS5Rgt96tfkO == null) {
                return;
            } else {
                PsecLrZVVK61(nanoTime, lS5Rgt96tfkO);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0062, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean KUoIVIumpKat(Runnable runnable) {
        y60 y60Var;
        Runnable runnable2;
        Unsafe unsafe;
        Unsafe unsafe2;
        loop0: while (true) {
            r3s1LDPKFs1S.getClass();
            Unsafe unsafe3 = ty1.PxuCJdSBwIXG;
            long j = XL4ISE6Oc65B;
            Object objectVolatile = unsafe3.getObjectVolatile(this, j);
            if (gPXPFXrUH4XX.get(this) != 0) {
                return false;
            }
            if (objectVolatile == null) {
                while (true) {
                    Unsafe unsafe4 = ty1.PxuCJdSBwIXG;
                    y60 y60Var2 = this;
                    runnable2 = runnable;
                    y60Var = y60Var2;
                    if (unsafe4.compareAndSwapObject(y60Var2, XL4ISE6Oc65B, (Object) null, runnable2)) {
                        break loop0;
                    }
                    if (unsafe4.getObjectVolatile(y60Var, j) != null) {
                        break;
                    }
                    this = y60Var;
                    runnable = runnable2;
                }
                this = y60Var;
                runnable = runnable2;
            } else {
                y60Var = this;
                runnable2 = runnable;
                if (objectVolatile instanceof x21) {
                    x21 x21Var = (x21) objectVolatile;
                    int PxuCJdSBwIXG = x21Var.PxuCJdSBwIXG(runnable2);
                    if (PxuCJdSBwIXG == 0) {
                        break;
                    }
                    if (PxuCJdSBwIXG == 1) {
                        x21 Y1f8riQaR6yg = x21Var.Y1f8riQaR6yg();
                        do {
                            unsafe2 = ty1.PxuCJdSBwIXG;
                            if (unsafe2.compareAndSwapObject(y60Var, XL4ISE6Oc65B, objectVolatile, Y1f8riQaR6yg)) {
                                break;
                            }
                        } while (unsafe2.getObjectVolatile(y60Var, j) == objectVolatile);
                    } else if (PxuCJdSBwIXG == 2) {
                        break;
                    }
                    this = y60Var;
                    runnable = runnable2;
                } else {
                    if (objectVolatile == f2.wdg6QnbFHrFF) {
                        break;
                    }
                    x21 x21Var2 = new x21(8, true);
                    x21Var2.PxuCJdSBwIXG((Runnable) objectVolatile);
                    x21Var2.PxuCJdSBwIXG(runnable2);
                    do {
                        unsafe = ty1.PxuCJdSBwIXG;
                        if (unsafe.compareAndSwapObject(y60Var, XL4ISE6Oc65B, objectVolatile, x21Var2)) {
                            break loop0;
                        }
                    } while (unsafe.getObjectVolatile(y60Var, j) == objectVolatile);
                    this = y60Var;
                    runnable = runnable2;
                }
            }
        }
        return true;
    }

    @Override // defpackage.ju
    public final void Pf0ThKz3j5YS(hu huVar, Runnable runnable) {
        ngxnMNrpiKat(runnable);
    }

    public void PsecLrZVVK61(long j, w60 w60Var) {
        iw.RfyTYNmI9Srp.rxipThha848g(j, w60Var);
    }

    public final void VzNxmvWisHL1() {
        r3s1LDPKFs1S.getClass();
        Unsafe unsafe = ty1.PxuCJdSBwIXG;
        unsafe.putObjectVolatile(this, XL4ISE6Oc65B, (Object) null);
        QrzZRwfaDlRX.getClass();
        unsafe.putObjectVolatile(this, BRwzKIf41E4i, (Object) null);
    }

    public final Runnable bEKsvqmvPh2y() {
        y60 y60Var;
        Unsafe unsafe;
        while (true) {
            r3s1LDPKFs1S.getClass();
            Unsafe unsafe2 = ty1.PxuCJdSBwIXG;
            long j = XL4ISE6Oc65B;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            if (objectVolatile == null) {
                return null;
            }
            if (objectVolatile instanceof x21) {
                x21 x21Var = (x21) objectVolatile;
                Object e9gEMXR7LXtO = x21Var.e9gEMXR7LXtO();
                if (e9gEMXR7LXtO != x21.RAsUl2FVSrh6) {
                    return (Runnable) e9gEMXR7LXtO;
                }
                x21 Y1f8riQaR6yg = x21Var.Y1f8riQaR6yg();
                while (true) {
                    Unsafe unsafe3 = ty1.PxuCJdSBwIXG;
                    y60Var = this;
                    if (!unsafe3.compareAndSwapObject(y60Var, XL4ISE6Oc65B, objectVolatile, Y1f8riQaR6yg) && unsafe3.getObjectVolatile(y60Var, j) == objectVolatile) {
                        this = y60Var;
                    }
                }
            } else {
                y60Var = this;
                if (objectVolatile == f2.wdg6QnbFHrFF) {
                    return null;
                }
                do {
                    unsafe = ty1.PxuCJdSBwIXG;
                    if (unsafe.compareAndSwapObject(y60Var, XL4ISE6Oc65B, objectVolatile, (Object) null)) {
                        return (Runnable) objectVolatile;
                    }
                } while (unsafe.getObjectVolatile(y60Var, j) == objectVolatile);
            }
            this = y60Var;
        }
    }

    public s00 cpQdD2nAriOS(long j, ak2 ak2Var, hu huVar) {
        return jw.PxuCJdSBwIXG.cpQdD2nAriOS(j, ak2Var, huVar);
    }

    @Override // defpackage.rx
    public final void gPXPFXrUH4XX(long j, bi biVar) {
        long j2 = j > 0 ? j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j : 0L;
        if (j2 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            u60 u60Var = new u60(this, j2 + nanoTime, biVar);
            rxipThha848g(nanoTime, u60Var);
            biVar.e6tOsSdd2EFb(new vh(2, u60Var));
        }
    }

    public final int hVNtCUZb4tYH(long j, w60 w60Var) {
        y60 y60Var;
        Unsafe unsafe;
        if (gPXPFXrUH4XX.get(this) != 0) {
            return 1;
        }
        QrzZRwfaDlRX.getClass();
        Unsafe unsafe2 = ty1.PxuCJdSBwIXG;
        long j2 = BRwzKIf41E4i;
        x60 x60Var = (x60) unsafe2.getObjectVolatile(this, j2);
        if (x60Var == null) {
            x60 x60Var2 = new x60();
            x60Var2.TSizfFm2Yiuu = j;
            while (true) {
                unsafe = ty1.PxuCJdSBwIXG;
                y60Var = this;
                if (!unsafe.compareAndSwapObject(y60Var, BRwzKIf41E4i, (Object) null, x60Var2) && unsafe.getObjectVolatile(y60Var, j2) == null) {
                    this = y60Var;
                }
            }
            Object objectVolatile = unsafe.getObjectVolatile(y60Var, j2);
            objectVolatile.getClass();
            x60Var = (x60) objectVolatile;
        } else {
            y60Var = this;
        }
        return w60Var.lS5Rgt96tfkO(j, x60Var, y60Var);
    }

    public abstract Thread jJwa0q7P5wHq();

    public void ngxnMNrpiKat(Runnable runnable) {
        yQRudnv4La6p();
        if (!KUoIVIumpKat(runnable)) {
            iw.RfyTYNmI9Srp.ngxnMNrpiKat(runnable);
            return;
        }
        Thread jJwa0q7P5wHq = jJwa0q7P5wHq();
        if (Thread.currentThread() != jJwa0q7P5wHq) {
            LockSupport.unpark(jJwa0q7P5wHq);
        }
    }

    @Override // defpackage.t60
    public final long nxJAScVArhE9() {
        if (IXK6ba3ucyzm()) {
            return 0L;
        }
        yQRudnv4La6p();
        Runnable bEKsvqmvPh2y = bEKsvqmvPh2y();
        if (bEKsvqmvPh2y == null) {
            return qudtW7lwm99e();
        }
        bEKsvqmvPh2y.run();
        return 0L;
    }

    public final long qudtW7lwm99e() {
        w60 w60Var;
        da daVar = this.x50lh2ztY7Y5;
        if (((daVar == null || daVar.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
            r3s1LDPKFs1S.getClass();
            Unsafe unsafe = ty1.PxuCJdSBwIXG;
            Object objectVolatile = unsafe.getObjectVolatile(this, XL4ISE6Oc65B);
            if (objectVolatile != null) {
                if (objectVolatile instanceof x21) {
                    long j = x21.a92UlCVFR9N8.get((x21) objectVolatile);
                    if (((int) (1073741823 & j)) != ((int) ((j & 1152921503533105152L) >> 30))) {
                        return 0L;
                    }
                } else if (objectVolatile == f2.wdg6QnbFHrFF) {
                    return Long.MAX_VALUE;
                }
            }
            QrzZRwfaDlRX.getClass();
            x60 x60Var = (x60) unsafe.getObjectVolatile(this, BRwzKIf41E4i);
            if (x60Var != null) {
                synchronized (x60Var) {
                    w60[] w60VarArr = x60Var.PxuCJdSBwIXG;
                    w60Var = w60VarArr != null ? w60VarArr[0] : null;
                }
                if (w60Var != null) {
                    long nanoTime = w60Var.rtx2ld2ELZv4 - System.nanoTime();
                    if (nanoTime >= 0) {
                        return nanoTime;
                    }
                }
            }
            return Long.MAX_VALUE;
        }
        return 0L;
    }

    public final void rxipThha848g(long j, w60 w60Var) {
        Thread jJwa0q7P5wHq;
        int hVNtCUZb4tYH = hVNtCUZb4tYH(j, w60Var);
        if (hVNtCUZb4tYH == 0) {
            if (!uVlwi32qvXeJ(w60Var) || Thread.currentThread() == (jJwa0q7P5wHq = jJwa0q7P5wHq())) {
                return;
            }
            LockSupport.unpark(jJwa0q7P5wHq);
            return;
        }
        if (hVNtCUZb4tYH == 1) {
            PsecLrZVVK61(j, w60Var);
        } else {
            if (hVNtCUZb4tYH == 2) {
                return;
            }
            u9.rtx2ld2ELZv4("unexpected result");
        }
    }

    @Override // defpackage.t60
    public void shutdown() {
        nj2.PxuCJdSBwIXG.set(null);
        gPXPFXrUH4XX.set(this, 1);
        JHNfcAUfKc4G();
        while (nxJAScVArhE9() <= 0) {
        }
        JTxCbbCwomzt();
    }

    public final boolean uVlwi32qvXeJ(w60 w60Var) {
        QrzZRwfaDlRX.getClass();
        x60 x60Var = (x60) ty1.PxuCJdSBwIXG.getObjectVolatile(this, BRwzKIf41E4i);
        if (x60Var != null) {
            synchronized (x60Var) {
                w60[] w60VarArr = x60Var.PxuCJdSBwIXG;
                r0 = w60VarArr != null ? w60VarArr[0] : null;
            }
        }
        return r0 == w60Var;
    }

    public final void yQRudnv4La6p() {
        w60 w60Var;
        QrzZRwfaDlRX.getClass();
        x60 x60Var = (x60) ty1.PxuCJdSBwIXG.getObjectVolatile(this, BRwzKIf41E4i);
        if (x60Var == null || qj2.lS5Rgt96tfkO.get(x60Var) == 0) {
            return;
        }
        long nanoTime = System.nanoTime();
        do {
            synchronized (x60Var) {
                try {
                    w60[] w60VarArr = x60Var.PxuCJdSBwIXG;
                    w60 w60Var2 = w60VarArr != null ? w60VarArr[0] : null;
                    if (w60Var2 != null) {
                        w60Var = ((nanoTime - w60Var2.rtx2ld2ELZv4) > 0L ? 1 : ((nanoTime - w60Var2.rtx2ld2ELZv4) == 0L ? 0 : -1)) >= 0 ? KUoIVIumpKat(w60Var2) : false ? x60Var.lS5Rgt96tfkO(0) : null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (w60Var != null);
    }
}
