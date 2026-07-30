package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public class r32 {
    public static final /* synthetic */ long QrzZRwfaDlRX;
    public static final /* synthetic */ AtomicLongFieldUpdater cpQdD2nAriOS;
    public static final /* synthetic */ AtomicLongFieldUpdater dgRBjINgWbAK;
    public static final /* synthetic */ long gPXPFXrUH4XX;
    public static final /* synthetic */ AtomicIntegerFieldUpdater r3s1LDPKFs1S;
    public static final /* synthetic */ AtomicReferenceFieldUpdater wdg6QnbFHrFF = AtomicReferenceFieldUpdater.newUpdater(r32.class, Object.class, "head$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater x50lh2ztY7Y5;
    public final ai OPXfSBeufaJ8;
    private volatile /* synthetic */ int _availablePermits$volatile;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    public final int rtx2ld2ELZv4;
    private volatile /* synthetic */ Object tail$volatile;

    static {
        Unsafe unsafe = ty1.PxuCJdSBwIXG;
        QrzZRwfaDlRX = unsafe.objectFieldOffset(r32.class.getDeclaredField("head$volatile"));
        dgRBjINgWbAK = AtomicLongFieldUpdater.newUpdater(r32.class, "deqIdx$volatile");
        x50lh2ztY7Y5 = AtomicReferenceFieldUpdater.newUpdater(r32.class, Object.class, "tail$volatile");
        gPXPFXrUH4XX = unsafe.objectFieldOffset(r32.class.getDeclaredField("tail$volatile"));
        cpQdD2nAriOS = AtomicLongFieldUpdater.newUpdater(r32.class, "enqIdx$volatile");
        r3s1LDPKFs1S = AtomicIntegerFieldUpdater.newUpdater(r32.class, "_availablePermits$volatile");
    }

    public r32(int i) {
        this.rtx2ld2ELZv4 = i;
        if (i <= 0) {
            u9.e9gEMXR7LXtO(o0.wdg6QnbFHrFF("Semaphore should have at least 1 permit, but had ", i));
            throw null;
        }
        if (i < 0) {
            u9.e9gEMXR7LXtO(o0.wdg6QnbFHrFF("The number of acquired permits should be in 0..", i));
            throw null;
        }
        u32 u32Var = new u32(0L, null, 2);
        this.head$volatile = u32Var;
        this.tail$volatile = u32Var;
        this._availablePermits$volatile = i;
        this.OPXfSBeufaJ8 = new ai(9, this);
    }

    public final boolean PxuCJdSBwIXG(xr2 xr2Var) {
        Object POWyO8hTM6YC;
        Unsafe unsafe;
        r32 r32Var = this;
        x50lh2ztY7Y5.getClass();
        Unsafe unsafe2 = ty1.PxuCJdSBwIXG;
        long j = gPXPFXrUH4XX;
        u32 u32Var = (u32) unsafe2.getObjectVolatile(r32Var, j);
        long andIncrement = cpQdD2nAriOS.getAndIncrement(r32Var);
        p32 p32Var = p32.QrzZRwfaDlRX;
        long j2 = andIncrement / t32.a92UlCVFR9N8;
        loop0: while (true) {
            POWyO8hTM6YC = fx1.POWyO8hTM6YC(u32Var, j2, p32Var);
            if (vi0.tmVwIGCQF4zR(POWyO8hTM6YC)) {
                break;
            }
            a22 jyegZNwi31qc = vi0.jyegZNwi31qc(POWyO8hTM6YC);
            while (true) {
                a22 a22Var = (a22) ty1.PxuCJdSBwIXG.getObjectVolatile(r32Var, j);
                if (a22Var.e9gEMXR7LXtO >= jyegZNwi31qc.e9gEMXR7LXtO) {
                    r32Var = this;
                    break loop0;
                }
                if (!jyegZNwi31qc.QrzZRwfaDlRX()) {
                    break;
                }
                do {
                    unsafe = ty1.PxuCJdSBwIXG;
                    r32Var = this;
                    if (unsafe.compareAndSwapObject(r32Var, gPXPFXrUH4XX, a22Var, jyegZNwi31qc)) {
                        if (a22Var.dgRBjINgWbAK()) {
                            a22Var.OPXfSBeufaJ8();
                        }
                    }
                } while (unsafe.getObjectVolatile(r32Var, j) == a22Var);
                if (jyegZNwi31qc.dgRBjINgWbAK()) {
                    jyegZNwi31qc.OPXfSBeufaJ8();
                }
            }
            r32Var = this;
        }
        u32 u32Var2 = (u32) vi0.jyegZNwi31qc(POWyO8hTM6YC);
        AtomicReferenceArray atomicReferenceArray = u32Var2.RAsUl2FVSrh6;
        int i = (int) (andIncrement % t32.a92UlCVFR9N8);
        while (!atomicReferenceArray.compareAndSet(i, null, xr2Var)) {
            if (atomicReferenceArray.get(i) != null) {
                f50 f50Var = t32.lS5Rgt96tfkO;
                f50 f50Var2 = t32.TSizfFm2Yiuu;
                while (!atomicReferenceArray.compareAndSet(i, f50Var, f50Var2)) {
                    if (atomicReferenceArray.get(i) != f50Var) {
                        return false;
                    }
                }
                ((zh) xr2Var).wdg6QnbFHrFF(no2.PxuCJdSBwIXG, r32Var.OPXfSBeufaJ8);
                return true;
            }
        }
        xr2Var.PxuCJdSBwIXG(u32Var2, i);
        return true;
    }

    public final void TSizfFm2Yiuu() {
        int i;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = r3s1LDPKFs1S;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i2 = this.rtx2ld2ELZv4;
            if (andIncrement >= i2) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i <= i2) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i2));
                throw new IllegalStateException(("The number of released permits cannot be greater than " + i2).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
        } while (!Y1f8riQaR6yg());
    }

    public final boolean Y1f8riQaR6yg() {
        Object POWyO8hTM6YC;
        Unsafe unsafe;
        wdg6QnbFHrFF.getClass();
        Unsafe unsafe2 = ty1.PxuCJdSBwIXG;
        long j = QrzZRwfaDlRX;
        u32 u32Var = (u32) unsafe2.getObjectVolatile(this, j);
        long andIncrement = dgRBjINgWbAK.getAndIncrement(this);
        long j2 = andIncrement / t32.a92UlCVFR9N8;
        q32 q32Var = q32.QrzZRwfaDlRX;
        loop0: while (true) {
            POWyO8hTM6YC = fx1.POWyO8hTM6YC(u32Var, j2, q32Var);
            if (vi0.tmVwIGCQF4zR(POWyO8hTM6YC)) {
                break;
            }
            a22 jyegZNwi31qc = vi0.jyegZNwi31qc(POWyO8hTM6YC);
            while (true) {
                a22 a22Var = (a22) ty1.PxuCJdSBwIXG.getObjectVolatile(this, j);
                if (a22Var.e9gEMXR7LXtO >= jyegZNwi31qc.e9gEMXR7LXtO) {
                    break loop0;
                }
                if (!jyegZNwi31qc.QrzZRwfaDlRX()) {
                    break;
                }
                do {
                    unsafe = ty1.PxuCJdSBwIXG;
                    if (unsafe.compareAndSwapObject(this, QrzZRwfaDlRX, a22Var, jyegZNwi31qc)) {
                        if (a22Var.dgRBjINgWbAK()) {
                            a22Var.OPXfSBeufaJ8();
                        }
                    }
                } while (unsafe.getObjectVolatile(this, j) == a22Var);
                if (jyegZNwi31qc.dgRBjINgWbAK()) {
                    jyegZNwi31qc.OPXfSBeufaJ8();
                }
            }
        }
        u32 u32Var2 = (u32) vi0.jyegZNwi31qc(POWyO8hTM6YC);
        AtomicReferenceArray atomicReferenceArray = u32Var2.RAsUl2FVSrh6;
        u32Var2.lS5Rgt96tfkO();
        boolean z = false;
        if (u32Var2.e9gEMXR7LXtO <= j2) {
            int i = (int) (andIncrement % t32.a92UlCVFR9N8);
            Object andSet = atomicReferenceArray.getAndSet(i, t32.lS5Rgt96tfkO);
            if (andSet == null) {
                int i2 = t32.PxuCJdSBwIXG;
                for (int i3 = 0; i3 < i2; i3++) {
                    if (atomicReferenceArray.get(i) == t32.TSizfFm2Yiuu) {
                        return true;
                    }
                }
                f50 f50Var = t32.lS5Rgt96tfkO;
                f50 f50Var2 = t32.Y1f8riQaR6yg;
                while (true) {
                    if (atomicReferenceArray.compareAndSet(i, f50Var, f50Var2)) {
                        z = true;
                        break;
                    }
                    if (atomicReferenceArray.get(i) != f50Var) {
                        break;
                    }
                }
                return !z;
            }
            if (andSet != t32.e9gEMXR7LXtO) {
                if (!(andSet instanceof zh)) {
                    u9.BRwzKIf41E4i(andSet, "unexpected: ");
                    return false;
                }
                zh zhVar = (zh) andSet;
                f50 dgRBjINgWbAK2 = zhVar.dgRBjINgWbAK(no2.PxuCJdSBwIXG, this.OPXfSBeufaJ8);
                if (dgRBjINgWbAK2 != null) {
                    zhVar.BRwzKIf41E4i(dgRBjINgWbAK2);
                    return true;
                }
            }
        }
        return false;
    }
}
