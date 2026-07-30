package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class r91 extends r32 implements p91 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater BRwzKIf41E4i = AtomicReferenceFieldUpdater.newUpdater(r91.class, Object.class, "owner$volatile");
    public static final /* synthetic */ long XL4ISE6Oc65B = ty1.PxuCJdSBwIXG.objectFieldOffset(r91.class.getDeclaredField("owner$volatile"));
    private volatile /* synthetic */ Object owner$volatile;

    public r91() {
        super(1);
        this.owner$volatile = b51.wdg6QnbFHrFF;
    }

    public final boolean RAsUl2FVSrh6() {
        int rtx2ld2ELZv4 = rtx2ld2ELZv4();
        if (rtx2ld2ELZv4 == 0) {
            return true;
        }
        if (rtx2ld2ELZv4 == 1) {
            return false;
        }
        if (rtx2ld2ELZv4 != 2) {
            u9.rtx2ld2ELZv4("unexpected");
            return false;
        }
        rc1.e9gEMXR7LXtO("This mutex is already locked by the specified owner: null");
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0022, code lost:
    
        r5 = defpackage.r91.BRwzKIf41E4i;
        r2 = r0.OPXfSBeufaJ8;
        r5.set(r2, null);
        r5 = r0.rtx2ld2ELZv4;
        r5.ozEBbv0hFTAB(r1, r5.wdg6QnbFHrFF, new defpackage.ai(0, new defpackage.r3s1LDPKFs1S(20, r2, r0)));
     */
    @Override // defpackage.p91
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a92UlCVFR9N8(ct ctVar) {
        boolean RAsUl2FVSrh6 = RAsUl2FVSrh6();
        no2 no2Var = no2.PxuCJdSBwIXG;
        if (!RAsUl2FVSrh6) {
            bi VhhvGxCb8gfr = f2.VhhvGxCb8gfr(ng0.IAToe7bXGz4N(ctVar));
            try {
                q91 q91Var = new q91(this, VhhvGxCb8gfr);
                while (true) {
                    int andDecrement = r32.r3s1LDPKFs1S.getAndDecrement(this);
                    if (andDecrement <= this.rtx2ld2ELZv4) {
                        if (andDecrement > 0) {
                            break;
                        }
                        if (PxuCJdSBwIXG(q91Var)) {
                            break;
                        }
                    }
                }
                Object VhhvGxCb8gfr2 = VhhvGxCb8gfr.VhhvGxCb8gfr();
                su suVar = su.rtx2ld2ELZv4;
                if (VhhvGxCb8gfr2 != suVar) {
                    VhhvGxCb8gfr2 = no2Var;
                }
                if (VhhvGxCb8gfr2 == suVar) {
                    return VhhvGxCb8gfr2;
                }
            } catch (Throwable th) {
                VhhvGxCb8gfr.rZjpSjn4zoMv();
                throw th;
            }
        }
        return no2Var;
    }

    public final boolean e9gEMXR7LXtO() {
        return Math.max(r32.r3s1LDPKFs1S.get(this), 0) == 0;
    }

    @Override // defpackage.p91
    public final void lS5Rgt96tfkO(Object obj) {
        while (this.e9gEMXR7LXtO()) {
            BRwzKIf41E4i.getClass();
            Unsafe unsafe = ty1.PxuCJdSBwIXG;
            long j = XL4ISE6Oc65B;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            f50 f50Var = b51.wdg6QnbFHrFF;
            if (objectVolatile != f50Var) {
                if (objectVolatile != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + objectVolatile + ", but " + obj + " is expected").toString());
                }
                while (true) {
                    Unsafe unsafe2 = ty1.PxuCJdSBwIXG;
                    r91 r91Var = this;
                    if (unsafe2.compareAndSwapObject(r91Var, XL4ISE6Oc65B, objectVolatile, f50Var)) {
                        r91Var.TSizfFm2Yiuu();
                        return;
                    } else {
                        if (unsafe2.getObjectVolatile(r91Var, j) != objectVolatile) {
                            this = r91Var;
                            break;
                        }
                        this = r91Var;
                    }
                }
            }
        }
        u9.rtx2ld2ELZv4("This mutex is not locked");
    }

    public final int rtx2ld2ELZv4() {
        int i;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = r32.r3s1LDPKFs1S;
            int i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = this.rtx2ld2ELZv4;
            if (i2 > i3) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i > i3) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i3));
            } else {
                if (i2 <= 0) {
                    return 1;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i2, i2 - 1)) {
                    BRwzKIf41E4i.getClass();
                    ty1.PxuCJdSBwIXG.putObjectVolatile(this, XL4ISE6Oc65B, (Object) null);
                    return 0;
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Mutex@");
        sb.append(zv.VhhvGxCb8gfr(this));
        sb.append("[isLocked=");
        sb.append(e9gEMXR7LXtO());
        sb.append(",owner=");
        BRwzKIf41E4i.getClass();
        sb.append(ty1.PxuCJdSBwIXG.getObjectVolatile(this, XL4ISE6Oc65B));
        sb.append(']');
        return sb.toString();
    }
}
