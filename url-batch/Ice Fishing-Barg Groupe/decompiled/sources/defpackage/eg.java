package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public class eg implements ui {
    public static final /* synthetic */ AtomicReferenceFieldUpdater BRwzKIf41E4i;
    public static final /* synthetic */ long EcgxDIVH5in8;
    public static final /* synthetic */ AtomicReferenceFieldUpdater QrzZRwfaDlRX;
    public static final /* synthetic */ long RfyTYNmI9Srp;
    public static final /* synthetic */ long S9EYkSpbGuxq;
    public static final /* synthetic */ long VhhvGxCb8gfr;
    public static final /* synthetic */ long XL4ISE6Oc65B;
    public static final /* synthetic */ AtomicReferenceFieldUpdater gPXPFXrUH4XX;
    public static final /* synthetic */ AtomicReferenceFieldUpdater r3s1LDPKFs1S;
    private volatile /* synthetic */ Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    public final int rtx2ld2ELZv4;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;
    public static final /* synthetic */ AtomicLongFieldUpdater OPXfSBeufaJ8 = AtomicLongFieldUpdater.newUpdater(eg.class, "sendersAndCloseStatus$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater wdg6QnbFHrFF = AtomicLongFieldUpdater.newUpdater(eg.class, "receivers$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater dgRBjINgWbAK = AtomicLongFieldUpdater.newUpdater(eg.class, "bufferEnd$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater x50lh2ztY7Y5 = AtomicLongFieldUpdater.newUpdater(eg.class, "completedExpandBuffersAndPauseFlag$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater cpQdD2nAriOS = AtomicReferenceFieldUpdater.newUpdater(eg.class, Object.class, "sendSegment$volatile");

    static {
        Unsafe unsafe = ty1.PxuCJdSBwIXG;
        VhhvGxCb8gfr = unsafe.objectFieldOffset(eg.class.getDeclaredField("sendSegment$volatile"));
        r3s1LDPKFs1S = AtomicReferenceFieldUpdater.newUpdater(eg.class, Object.class, "receiveSegment$volatile");
        S9EYkSpbGuxq = unsafe.objectFieldOffset(eg.class.getDeclaredField("receiveSegment$volatile"));
        QrzZRwfaDlRX = AtomicReferenceFieldUpdater.newUpdater(eg.class, Object.class, "bufferEndSegment$volatile");
        RfyTYNmI9Srp = unsafe.objectFieldOffset(eg.class.getDeclaredField("bufferEndSegment$volatile"));
        gPXPFXrUH4XX = AtomicReferenceFieldUpdater.newUpdater(eg.class, Object.class, "_closeCause$volatile");
        XL4ISE6Oc65B = unsafe.objectFieldOffset(eg.class.getDeclaredField("_closeCause$volatile"));
        BRwzKIf41E4i = AtomicReferenceFieldUpdater.newUpdater(eg.class, Object.class, "closeHandler$volatile");
        EcgxDIVH5in8 = unsafe.objectFieldOffset(eg.class.getDeclaredField("closeHandler$volatile"));
    }

    public eg(int i) {
        this.rtx2ld2ELZv4 = i;
        if (i < 0) {
            u9.e9gEMXR7LXtO(o0.OPXfSBeufaJ8(i, "Invalid channel capacity: ", ", should be >=0"));
            throw null;
        }
        hj hjVar = gg.PxuCJdSBwIXG;
        this.bufferEnd$volatile = i != 0 ? i != Integer.MAX_VALUE ? i : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = dgRBjINgWbAK.get(this);
        hj hjVar2 = new hj(0L, null, this, 3);
        this.sendSegment$volatile = hjVar2;
        this.receiveSegment$volatile = hjVar2;
        if (aF05bpZJlKEP()) {
            hjVar2 = gg.PxuCJdSBwIXG;
            hjVar2.getClass();
        }
        this.bufferEndSegment$volatile = hjVar2;
        this._closeCause$volatile = gg.RfyTYNmI9Srp;
    }

    public static Object BjEWd04qc7Mw(eg egVar, jc2 jc2Var) {
        hj hjVar;
        Throwable th;
        hj hjVar2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = r3s1LDPKFs1S;
        atomicReferenceFieldUpdater.getClass();
        if (egVar == null) {
            u9.VhhvGxCb8gfr();
            return null;
        }
        hj hjVar3 = (hj) ty1.PxuCJdSBwIXG.getObjectVolatile(egVar, S9EYkSpbGuxq);
        while (!egVar.IAToe7bXGz4N()) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = wdg6QnbFHrFF;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(egVar);
            long j = gg.lS5Rgt96tfkO;
            long j2 = andIncrement / j;
            int i = (int) (andIncrement % j);
            if (hjVar3.e9gEMXR7LXtO != j2) {
                hj gPXPFXrUH4XX2 = egVar.gPXPFXrUH4XX(j2, hjVar3);
                if (gPXPFXrUH4XX2 == null) {
                    continue;
                } else {
                    hjVar = gPXPFXrUH4XX2;
                }
            } else {
                hjVar = hjVar3;
            }
            eg egVar2 = egVar;
            Object amuv7NJvPxHu = egVar2.amuv7NJvPxHu(hjVar, i, andIncrement, null);
            f50 f50Var = gg.cpQdD2nAriOS;
            if (amuv7NJvPxHu == f50Var) {
                u9.rtx2ld2ELZv4("unexpected");
                return null;
            }
            f50 f50Var2 = gg.QrzZRwfaDlRX;
            if (amuv7NJvPxHu == f50Var2) {
                if (andIncrement < egVar2.S9EYkSpbGuxq()) {
                    hjVar.lS5Rgt96tfkO();
                }
                egVar = egVar2;
                hjVar3 = hjVar;
            } else {
                if (amuv7NJvPxHu != gg.r3s1LDPKFs1S) {
                    hjVar.lS5Rgt96tfkO();
                    return amuv7NJvPxHu;
                }
                bi VhhvGxCb8gfr2 = f2.VhhvGxCb8gfr(ng0.IAToe7bXGz4N(jc2Var));
                try {
                    Object amuv7NJvPxHu2 = egVar2.amuv7NJvPxHu(hjVar, i, andIncrement, VhhvGxCb8gfr2);
                    if (amuv7NJvPxHu2 == f50Var) {
                        VhhvGxCb8gfr2.PxuCJdSBwIXG(hjVar, i);
                    } else {
                        if (amuv7NJvPxHu2 == f50Var2) {
                            if (andIncrement < egVar2.S9EYkSpbGuxq()) {
                                hjVar.lS5Rgt96tfkO();
                            }
                            hj hjVar4 = (hj) atomicReferenceFieldUpdater.get(egVar2);
                            while (true) {
                                if (egVar2.IAToe7bXGz4N()) {
                                    VhhvGxCb8gfr2.RAsUl2FVSrh6(new uv1(egVar2.RfyTYNmI9Srp()));
                                    break;
                                }
                                bi biVar = VhhvGxCb8gfr2;
                                try {
                                    long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(egVar2);
                                    long j3 = gg.lS5Rgt96tfkO;
                                    long j4 = andIncrement2 / j3;
                                    int i2 = (int) (andIncrement2 % j3);
                                    if (hjVar4.e9gEMXR7LXtO != j4) {
                                        try {
                                            hj gPXPFXrUH4XX3 = egVar2.gPXPFXrUH4XX(j4, hjVar4);
                                            if (gPXPFXrUH4XX3 == null) {
                                                VhhvGxCb8gfr2 = biVar;
                                            } else {
                                                hjVar2 = gPXPFXrUH4XX3;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            VhhvGxCb8gfr2 = biVar;
                                            VhhvGxCb8gfr2.rZjpSjn4zoMv();
                                            throw th;
                                        }
                                    } else {
                                        hjVar2 = hjVar4;
                                    }
                                    eg egVar3 = egVar2;
                                    amuv7NJvPxHu2 = egVar3.amuv7NJvPxHu(hjVar2, i2, andIncrement2, biVar);
                                    egVar2 = egVar3;
                                    hj hjVar5 = hjVar2;
                                    VhhvGxCb8gfr2 = biVar;
                                    if (amuv7NJvPxHu2 == gg.cpQdD2nAriOS) {
                                        VhhvGxCb8gfr2.PxuCJdSBwIXG(hjVar5, i2);
                                        break;
                                    }
                                    if (amuv7NJvPxHu2 == gg.QrzZRwfaDlRX) {
                                        if (andIncrement2 < egVar2.S9EYkSpbGuxq()) {
                                            hjVar5.lS5Rgt96tfkO();
                                        }
                                        hjVar4 = hjVar5;
                                    } else {
                                        if (amuv7NJvPxHu2 == gg.r3s1LDPKFs1S) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        hjVar5.lS5Rgt96tfkO();
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    VhhvGxCb8gfr2 = biVar;
                                    th = th;
                                    VhhvGxCb8gfr2.rZjpSjn4zoMv();
                                    throw th;
                                }
                            }
                        } else {
                            hjVar.lS5Rgt96tfkO();
                        }
                        VhhvGxCb8gfr2.wdg6QnbFHrFF(amuv7NJvPxHu2, null);
                    }
                    return VhhvGxCb8gfr2.VhhvGxCb8gfr();
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        }
        Throwable RfyTYNmI9Srp2 = egVar.RfyTYNmI9Srp();
        int i3 = y82.PxuCJdSBwIXG;
        throw RfyTYNmI9Srp2;
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0158 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object EpkonXwzFgDB(eg egVar, Object obj, bt btVar) {
        no2 no2Var;
        su suVar;
        Object VhhvGxCb8gfr2;
        su suVar2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = cpQdD2nAriOS;
        atomicReferenceFieldUpdater.getClass();
        hj hjVar = (hj) ty1.PxuCJdSBwIXG.getObjectVolatile(egVar, VhhvGxCb8gfr);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = OPXfSBeufaJ8;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(egVar);
            long j = andIncrement & 1152921504606846975L;
            boolean pnx5pC0XzaCw = egVar.pnx5pC0XzaCw(andIncrement, false);
            int i = gg.lS5Rgt96tfkO;
            long j2 = i;
            long j3 = j / j2;
            int i2 = (int) (j % j2);
            long j4 = hjVar.e9gEMXR7LXtO;
            su suVar3 = su.rtx2ld2ELZv4;
            no2Var = no2.PxuCJdSBwIXG;
            if (j4 != j3) {
                hj BRwzKIf41E4i2 = egVar.BRwzKIf41E4i(j3, hjVar);
                if (BRwzKIf41E4i2 != null) {
                    hjVar = BRwzKIf41E4i2;
                } else if (pnx5pC0XzaCw) {
                    Object rZjpSjn4zoMv = egVar.rZjpSjn4zoMv(btVar, obj);
                    if (rZjpSjn4zoMv == suVar3) {
                        return rZjpSjn4zoMv;
                    }
                }
            }
            int TSizfFm2Yiuu = TSizfFm2Yiuu(egVar, hjVar, i2, obj, j, null, pnx5pC0XzaCw);
            if (TSizfFm2Yiuu == 0) {
                hjVar.lS5Rgt96tfkO();
                return no2Var;
            }
            if (TSizfFm2Yiuu == 1) {
                break;
            }
            if (TSizfFm2Yiuu != 2) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = wdg6QnbFHrFF;
                if (TSizfFm2Yiuu == 3) {
                    bi VhhvGxCb8gfr3 = f2.VhhvGxCb8gfr(ng0.IAToe7bXGz4N(btVar));
                    try {
                        int TSizfFm2Yiuu2 = TSizfFm2Yiuu(egVar, hjVar, i2, obj, j, VhhvGxCb8gfr3, false);
                        if (TSizfFm2Yiuu2 != 0) {
                            if (TSizfFm2Yiuu2 == 1) {
                                suVar = suVar3;
                                VhhvGxCb8gfr3.RAsUl2FVSrh6(no2Var);
                            } else if (TSizfFm2Yiuu2 != 2) {
                                if (TSizfFm2Yiuu2 == 4) {
                                    suVar = suVar3;
                                    if (j < atomicLongFieldUpdater2.get(egVar)) {
                                        hjVar.lS5Rgt96tfkO();
                                    }
                                } else {
                                    if (TSizfFm2Yiuu2 != 5) {
                                        throw new IllegalStateException("unexpected");
                                    }
                                    hjVar.lS5Rgt96tfkO();
                                    hj hjVar2 = (hj) atomicReferenceFieldUpdater.get(egVar);
                                    while (true) {
                                        long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(egVar);
                                        long j5 = andIncrement2 & 1152921504606846975L;
                                        boolean pnx5pC0XzaCw2 = egVar.pnx5pC0XzaCw(andIncrement2, false);
                                        int i3 = gg.lS5Rgt96tfkO;
                                        long j6 = i3;
                                        AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater;
                                        long j7 = j5 / j6;
                                        int i4 = (int) (j5 % j6);
                                        suVar = suVar3;
                                        if (hjVar2.e9gEMXR7LXtO != j7) {
                                            hj BRwzKIf41E4i3 = egVar.BRwzKIf41E4i(j7, hjVar2);
                                            if (BRwzKIf41E4i3 != null) {
                                                hjVar2 = BRwzKIf41E4i3;
                                            } else {
                                                if (pnx5pC0XzaCw2) {
                                                    break;
                                                }
                                                atomicLongFieldUpdater = atomicLongFieldUpdater3;
                                                suVar3 = suVar;
                                            }
                                        }
                                        int TSizfFm2Yiuu3 = TSizfFm2Yiuu(egVar, hjVar2, i4, obj, j5, VhhvGxCb8gfr3, pnx5pC0XzaCw2);
                                        if (TSizfFm2Yiuu3 == 0) {
                                            hjVar2.lS5Rgt96tfkO();
                                            break;
                                        }
                                        if (TSizfFm2Yiuu3 == 1) {
                                            break;
                                        }
                                        if (TSizfFm2Yiuu3 != 2) {
                                            if (TSizfFm2Yiuu3 == 3) {
                                                throw new IllegalStateException("unexpected");
                                            }
                                            if (TSizfFm2Yiuu3 != 4) {
                                                if (TSizfFm2Yiuu3 == 5) {
                                                    hjVar2.lS5Rgt96tfkO();
                                                }
                                                atomicLongFieldUpdater = atomicLongFieldUpdater3;
                                                suVar3 = suVar;
                                            } else if (j5 < atomicLongFieldUpdater2.get(egVar)) {
                                                hjVar2.lS5Rgt96tfkO();
                                            }
                                        } else if (pnx5pC0XzaCw2) {
                                            hjVar2.r3s1LDPKFs1S();
                                        } else {
                                            VhhvGxCb8gfr3.PxuCJdSBwIXG(hjVar2, i4 + i3);
                                        }
                                    }
                                }
                                lS5Rgt96tfkO(egVar, obj, VhhvGxCb8gfr3);
                            } else {
                                suVar = suVar3;
                                VhhvGxCb8gfr3.PxuCJdSBwIXG(hjVar, i2 + i);
                            }
                            VhhvGxCb8gfr2 = VhhvGxCb8gfr3.VhhvGxCb8gfr();
                            suVar2 = suVar;
                            if (VhhvGxCb8gfr2 != suVar2) {
                                VhhvGxCb8gfr2 = no2Var;
                            }
                            if (VhhvGxCb8gfr2 != suVar2) {
                                return VhhvGxCb8gfr2;
                            }
                        } else {
                            suVar = suVar3;
                            hjVar.lS5Rgt96tfkO();
                        }
                        VhhvGxCb8gfr3.RAsUl2FVSrh6(no2Var);
                        VhhvGxCb8gfr2 = VhhvGxCb8gfr3.VhhvGxCb8gfr();
                        suVar2 = suVar;
                        if (VhhvGxCb8gfr2 != suVar2) {
                        }
                        if (VhhvGxCb8gfr2 != suVar2) {
                            break;
                        }
                    } catch (Throwable th) {
                        VhhvGxCb8gfr3.rZjpSjn4zoMv();
                        throw th;
                    }
                } else if (TSizfFm2Yiuu == 4) {
                    if (j < atomicLongFieldUpdater2.get(egVar)) {
                        hjVar.lS5Rgt96tfkO();
                    }
                    Object rZjpSjn4zoMv2 = egVar.rZjpSjn4zoMv(btVar, obj);
                    if (rZjpSjn4zoMv2 == suVar3) {
                        return rZjpSjn4zoMv2;
                    }
                } else if (TSizfFm2Yiuu == 5) {
                    hjVar.lS5Rgt96tfkO();
                }
            } else if (pnx5pC0XzaCw) {
                hjVar.r3s1LDPKFs1S();
                Object rZjpSjn4zoMv3 = egVar.rZjpSjn4zoMv(btVar, obj);
                if (rZjpSjn4zoMv3 == suVar3) {
                    return rZjpSjn4zoMv3;
                }
            }
        }
        return no2Var;
    }

    public static void S2OOm9zPNm0h(eg egVar) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = x50lh2ztY7Y5;
        if ((atomicLongFieldUpdater.addAndGet(egVar, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(egVar) & 4611686018427387904L) != 0) {
            }
        }
    }

    public static final int TSizfFm2Yiuu(eg egVar, hj hjVar, int i, Object obj, long j, Object obj2, boolean z) {
        hjVar.RfyTYNmI9Srp(i, obj);
        if (z) {
            return egVar.Pf0ThKz3j5YS(hjVar, i, obj, j, obj2, z);
        }
        Object BRwzKIf41E4i2 = hjVar.BRwzKIf41E4i(i);
        if (BRwzKIf41E4i2 == null) {
            if (egVar.e9gEMXR7LXtO(j)) {
                if (hjVar.gPXPFXrUH4XX(i, null, gg.Y1f8riQaR6yg)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (hjVar.gPXPFXrUH4XX(i, null, obj2)) {
                    return 2;
                }
            }
        } else if (BRwzKIf41E4i2 instanceof xr2) {
            hjVar.RfyTYNmI9Srp(i, null);
            if (egVar.xfACYKDMU6Dj(BRwzKIf41E4i2, obj)) {
                hjVar.EcgxDIVH5in8(i, gg.OPXfSBeufaJ8);
                return 0;
            }
            f50 f50Var = gg.dgRBjINgWbAK;
            if (hjVar.rtx2ld2ELZv4.getAndSet((i * 2) + 1, f50Var) == f50Var) {
                return 5;
            }
            hjVar.XL4ISE6Oc65B(i, true);
            return 5;
        }
        return egVar.Pf0ThKz3j5YS(hjVar, i, obj, j, obj2, z);
    }

    public static final void lS5Rgt96tfkO(eg egVar, Object obj, bi biVar) {
        biVar.RAsUl2FVSrh6(new uv1(egVar.EcgxDIVH5in8()));
    }

    public static boolean nLZGh9p8gVSu(Object obj) {
        if (obj instanceof zh) {
            return gg.PxuCJdSBwIXG((zh) obj, no2.PxuCJdSBwIXG, null);
        }
        u9.BRwzKIf41E4i(obj, "Unexpected waiter: ");
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object ozEBbv0hFTAB(eg egVar, ct ctVar) {
        cg cgVar;
        int i;
        hj hjVar;
        if (ctVar instanceof cg) {
            cgVar = (cg) ctVar;
            int i2 = cgVar.cpQdD2nAriOS;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cgVar.cpQdD2nAriOS = i2 - Integer.MIN_VALUE;
                cg cgVar2 = cgVar;
                Object obj = cgVar2.dgRBjINgWbAK;
                i = cgVar2.cpQdD2nAriOS;
                if (i == 0) {
                    if (i == 1) {
                        ng0.tmVwIGCQF4zR(obj);
                        return ((gj) obj).PxuCJdSBwIXG;
                    }
                    u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ng0.tmVwIGCQF4zR(obj);
                r3s1LDPKFs1S.getClass();
                hj hjVar2 = (hj) ty1.PxuCJdSBwIXG.getObjectVolatile(egVar, S9EYkSpbGuxq);
                while (!egVar.IAToe7bXGz4N()) {
                    long andIncrement = wdg6QnbFHrFF.getAndIncrement(egVar);
                    long j = gg.lS5Rgt96tfkO;
                    long j2 = andIncrement / j;
                    int i3 = (int) (andIncrement % j);
                    if (hjVar2.e9gEMXR7LXtO != j2) {
                        hj gPXPFXrUH4XX2 = egVar.gPXPFXrUH4XX(j2, hjVar2);
                        if (gPXPFXrUH4XX2 == null) {
                            continue;
                        } else {
                            hjVar = gPXPFXrUH4XX2;
                        }
                    } else {
                        hjVar = hjVar2;
                    }
                    eg egVar2 = egVar;
                    Object amuv7NJvPxHu = egVar2.amuv7NJvPxHu(hjVar, i3, andIncrement, null);
                    if (amuv7NJvPxHu == gg.cpQdD2nAriOS) {
                        u9.rtx2ld2ELZv4("unexpected");
                        return null;
                    }
                    if (amuv7NJvPxHu != gg.QrzZRwfaDlRX) {
                        if (amuv7NJvPxHu != gg.r3s1LDPKFs1S) {
                            hjVar.lS5Rgt96tfkO();
                            gj.Companion.getClass();
                            return amuv7NJvPxHu;
                        }
                        cgVar2.cpQdD2nAriOS = 1;
                        Object tmVwIGCQF4zR = egVar2.tmVwIGCQF4zR(hjVar, i3, andIncrement, cgVar2);
                        su suVar = su.rtx2ld2ELZv4;
                        return tmVwIGCQF4zR == suVar ? suVar : tmVwIGCQF4zR;
                    }
                    if (andIncrement < egVar2.S9EYkSpbGuxq()) {
                        hjVar.lS5Rgt96tfkO();
                    }
                    egVar = egVar2;
                    hjVar2 = hjVar;
                }
                ej ejVar = gj.Companion;
                Throwable XL4ISE6Oc65B2 = egVar.XL4ISE6Oc65B();
                ejVar.getClass();
                return new dj(XL4ISE6Oc65B2);
            }
        }
        cgVar = new cg(egVar, ctVar);
        cg cgVar22 = cgVar;
        Object obj2 = cgVar22.dgRBjINgWbAK;
        i = cgVar22.cpQdD2nAriOS;
        if (i == 0) {
        }
    }

    public final hj BRwzKIf41E4i(long j, hj hjVar) {
        Object POWyO8hTM6YC;
        long j2;
        long j3;
        Unsafe unsafe;
        hj hjVar2 = gg.PxuCJdSBwIXG;
        fg fgVar = fg.QrzZRwfaDlRX;
        loop0: while (true) {
            POWyO8hTM6YC = fx1.POWyO8hTM6YC(hjVar, j, fgVar);
            if (!vi0.tmVwIGCQF4zR(POWyO8hTM6YC)) {
                a22 jyegZNwi31qc = vi0.jyegZNwi31qc(POWyO8hTM6YC);
                while (true) {
                    cpQdD2nAriOS.getClass();
                    Unsafe unsafe2 = ty1.PxuCJdSBwIXG;
                    long j4 = VhhvGxCb8gfr;
                    a22 a22Var = (a22) unsafe2.getObjectVolatile(this, j4);
                    if (a22Var.e9gEMXR7LXtO >= jyegZNwi31qc.e9gEMXR7LXtO) {
                        break loop0;
                    }
                    if (!jyegZNwi31qc.QrzZRwfaDlRX()) {
                        break;
                    }
                    do {
                        unsafe = ty1.PxuCJdSBwIXG;
                        if (unsafe.compareAndSwapObject(this, VhhvGxCb8gfr, a22Var, jyegZNwi31qc)) {
                            if (a22Var.dgRBjINgWbAK()) {
                                a22Var.OPXfSBeufaJ8();
                            }
                        }
                    } while (unsafe.getObjectVolatile(this, j4) == a22Var);
                    if (jyegZNwi31qc.dgRBjINgWbAK()) {
                        jyegZNwi31qc.OPXfSBeufaJ8();
                    }
                }
            } else {
                break;
            }
        }
        boolean tmVwIGCQF4zR = vi0.tmVwIGCQF4zR(POWyO8hTM6YC);
        AtomicLongFieldUpdater atomicLongFieldUpdater = wdg6QnbFHrFF;
        if (tmVwIGCQF4zR) {
            e6tOsSdd2EFb();
            if (hjVar.e9gEMXR7LXtO * gg.lS5Rgt96tfkO < atomicLongFieldUpdater.get(this)) {
                hjVar.lS5Rgt96tfkO();
                return null;
            }
        } else {
            hj hjVar3 = (hj) vi0.jyegZNwi31qc(POWyO8hTM6YC);
            long j5 = hjVar3.e9gEMXR7LXtO;
            if (j5 <= j) {
                return hjVar3;
            }
            long j6 = j5 * gg.lS5Rgt96tfkO;
            do {
                j2 = OPXfSBeufaJ8.get(this);
                j3 = 1152921504606846975L & j2;
                if (j3 >= j6) {
                    break;
                }
            } while (!OPXfSBeufaJ8.compareAndSet(this, j2, j3 + (((int) (j2 >> 60)) << 60)));
            if (j5 * gg.lS5Rgt96tfkO < atomicLongFieldUpdater.get(this)) {
                hjVar3.lS5Rgt96tfkO();
            }
        }
        return null;
    }

    public final Throwable EcgxDIVH5in8() {
        Throwable XL4ISE6Oc65B2 = XL4ISE6Oc65B();
        return XL4ISE6Oc65B2 == null ? new vk("Channel was closed") : XL4ISE6Oc65B2;
    }

    public final boolean IAToe7bXGz4N() {
        return pnx5pC0XzaCw(OPXfSBeufaJ8.get(this), true);
    }

    public final void J54yh1s3n4Aq(xr2 xr2Var, boolean z) {
        if (xr2Var instanceof zh) {
            ((bt) xr2Var).RAsUl2FVSrh6(new uv1(z ? RfyTYNmI9Srp() : EcgxDIVH5in8()));
            return;
        }
        if (xr2Var instanceof ws1) {
            bi biVar = ((ws1) xr2Var).rtx2ld2ELZv4;
            ej ejVar = gj.Companion;
            Throwable XL4ISE6Oc65B2 = XL4ISE6Oc65B();
            ejVar.getClass();
            biVar.RAsUl2FVSrh6(new gj(new dj(XL4ISE6Oc65B2)));
            return;
        }
        if (!(xr2Var instanceof bg)) {
            u9.BRwzKIf41E4i(xr2Var, "Unexpected waiter: ");
            return;
        }
        bg bgVar = (bg) xr2Var;
        bi biVar2 = bgVar.OPXfSBeufaJ8;
        biVar2.getClass();
        bgVar.OPXfSBeufaJ8 = null;
        bgVar.rtx2ld2ELZv4 = gg.x50lh2ztY7Y5;
        Throwable XL4ISE6Oc65B3 = bgVar.wdg6QnbFHrFF.XL4ISE6Oc65B();
        if (XL4ISE6Oc65B3 == null) {
            biVar2.RAsUl2FVSrh6(Boolean.FALSE);
        } else {
            biVar2.RAsUl2FVSrh6(new uv1(XL4ISE6Oc65B3));
        }
    }

    public final boolean OPXfSBeufaJ8(Throwable th, boolean z) {
        eg egVar;
        boolean z2;
        long j;
        long j2;
        long j3;
        AtomicLongFieldUpdater atomicLongFieldUpdater = OPXfSBeufaJ8;
        if (z) {
            while (true) {
                long j4 = atomicLongFieldUpdater.get(this);
                if (((int) (j4 >> 60)) != 0) {
                    break;
                }
                hj hjVar = gg.PxuCJdSBwIXG;
                egVar = this;
                if (atomicLongFieldUpdater.compareAndSet(egVar, j4, (j4 & 1152921504606846975L) + 1152921504606846976L)) {
                    break;
                }
                this = egVar;
            }
        }
        egVar = this;
        f50 f50Var = gg.RfyTYNmI9Srp;
        while (true) {
            gPXPFXrUH4XX.getClass();
            eg egVar2 = egVar;
            Unsafe unsafe = ty1.PxuCJdSBwIXG;
            long j5 = XL4ISE6Oc65B;
            Throwable th2 = th;
            boolean compareAndSwapObject = unsafe.compareAndSwapObject(egVar2, j5, f50Var, th2);
            egVar = egVar2;
            if (compareAndSwapObject) {
                z2 = true;
                break;
            }
            if (unsafe.getObjectVolatile(egVar, j5) != f50Var) {
                z2 = false;
                break;
            }
            th = th2;
        }
        if (z) {
            do {
                j3 = atomicLongFieldUpdater.get(egVar);
            } while (!atomicLongFieldUpdater.compareAndSet(egVar, j3, 3458764513820540928L + (j3 & 1152921504606846975L)));
        } else {
            do {
                j = atomicLongFieldUpdater.get(egVar);
                int i = (int) (j >> 60);
                if (i == 0) {
                    j2 = (j & 1152921504606846975L) + 2305843009213693952L;
                } else {
                    if (i != 1) {
                        break;
                    }
                    j2 = (j & 1152921504606846975L) + 3458764513820540928L;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(egVar, j, j2));
        }
        egVar.e6tOsSdd2EFb();
        if (z2) {
            egVar.ZbWwgt3aGe7A();
        }
        return z2;
    }

    public final int Pf0ThKz3j5YS(hj hjVar, int i, Object obj, long j, Object obj2, boolean z) {
        while (true) {
            Object BRwzKIf41E4i2 = hjVar.BRwzKIf41E4i(i);
            if (BRwzKIf41E4i2 == null) {
                if (!e9gEMXR7LXtO(j) || z) {
                    if (z) {
                        if (hjVar.gPXPFXrUH4XX(i, null, gg.wdg6QnbFHrFF)) {
                            hjVar.r3s1LDPKFs1S();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (hjVar.gPXPFXrUH4XX(i, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (hjVar.gPXPFXrUH4XX(i, null, gg.Y1f8riQaR6yg)) {
                    break;
                }
            } else {
                if (BRwzKIf41E4i2 != gg.e9gEMXR7LXtO) {
                    f50 f50Var = gg.dgRBjINgWbAK;
                    if (BRwzKIf41E4i2 == f50Var) {
                        hjVar.RfyTYNmI9Srp(i, null);
                        return 5;
                    }
                    if (BRwzKIf41E4i2 == gg.rtx2ld2ELZv4) {
                        hjVar.RfyTYNmI9Srp(i, null);
                        return 5;
                    }
                    if (BRwzKIf41E4i2 == gg.x50lh2ztY7Y5) {
                        hjVar.RfyTYNmI9Srp(i, null);
                        e6tOsSdd2EFb();
                        return 4;
                    }
                    hjVar.RfyTYNmI9Srp(i, null);
                    if (BRwzKIf41E4i2 instanceof yr2) {
                        BRwzKIf41E4i2 = ((yr2) BRwzKIf41E4i2).PxuCJdSBwIXG;
                    }
                    if (xfACYKDMU6Dj(BRwzKIf41E4i2, obj)) {
                        hjVar.EcgxDIVH5in8(i, gg.OPXfSBeufaJ8);
                        return 0;
                    }
                    if (hjVar.rtx2ld2ELZv4.getAndSet((i * 2) + 1, f50Var) != f50Var) {
                        hjVar.XL4ISE6Oc65B(i, true);
                    }
                    return 5;
                }
                if (hjVar.gPXPFXrUH4XX(i, BRwzKIf41E4i2, gg.Y1f8riQaR6yg)) {
                    break;
                }
            }
        }
        return 1;
    }

    @Override // defpackage.v32
    public Object PxuCJdSBwIXG(bt btVar, Object obj) {
        return EpkonXwzFgDB(this, obj, btVar);
    }

    public final hj QrzZRwfaDlRX(long j, hj hjVar, long j2) {
        Object POWyO8hTM6YC;
        Unsafe unsafe;
        hj hjVar2 = gg.PxuCJdSBwIXG;
        fg fgVar = fg.QrzZRwfaDlRX;
        loop0: while (true) {
            POWyO8hTM6YC = fx1.POWyO8hTM6YC(hjVar, j, fgVar);
            if (!vi0.tmVwIGCQF4zR(POWyO8hTM6YC)) {
                a22 jyegZNwi31qc = vi0.jyegZNwi31qc(POWyO8hTM6YC);
                while (true) {
                    QrzZRwfaDlRX.getClass();
                    Unsafe unsafe2 = ty1.PxuCJdSBwIXG;
                    long j3 = RfyTYNmI9Srp;
                    a22 a22Var = (a22) unsafe2.getObjectVolatile(this, j3);
                    if (a22Var.e9gEMXR7LXtO >= jyegZNwi31qc.e9gEMXR7LXtO) {
                        break loop0;
                    }
                    if (!jyegZNwi31qc.QrzZRwfaDlRX()) {
                        break;
                    }
                    do {
                        unsafe = ty1.PxuCJdSBwIXG;
                        if (unsafe.compareAndSwapObject(this, RfyTYNmI9Srp, a22Var, jyegZNwi31qc)) {
                            if (a22Var.dgRBjINgWbAK()) {
                                a22Var.OPXfSBeufaJ8();
                            }
                        }
                    } while (unsafe.getObjectVolatile(this, j3) == a22Var);
                    if (jyegZNwi31qc.dgRBjINgWbAK()) {
                        jyegZNwi31qc.OPXfSBeufaJ8();
                    }
                }
            } else {
                break;
            }
        }
        if (vi0.tmVwIGCQF4zR(POWyO8hTM6YC)) {
            e6tOsSdd2EFb();
            kpCQ9veP6n3I(j, hjVar);
            S2OOm9zPNm0h(this);
            return null;
        }
        hj hjVar3 = (hj) vi0.jyegZNwi31qc(POWyO8hTM6YC);
        long j4 = hjVar3.e9gEMXR7LXtO;
        if (j4 <= j) {
            return hjVar3;
        }
        long j5 = j4 * gg.lS5Rgt96tfkO;
        if (!dgRBjINgWbAK.compareAndSet(this, j2 + 1, j5)) {
            S2OOm9zPNm0h(this);
            return null;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = x50lh2ztY7Y5;
        if ((atomicLongFieldUpdater.addAndGet(this, j5 - j2) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0) {
            }
        }
        return null;
    }

    public final hj RAsUl2FVSrh6() {
        QrzZRwfaDlRX.getClass();
        Unsafe unsafe = ty1.PxuCJdSBwIXG;
        Object objectVolatile = unsafe.getObjectVolatile(this, RfyTYNmI9Srp);
        cpQdD2nAriOS.getClass();
        hj hjVar = (hj) unsafe.getObjectVolatile(this, VhhvGxCb8gfr);
        if (hjVar.e9gEMXR7LXtO > ((hj) objectVolatile).e9gEMXR7LXtO) {
            objectVolatile = hjVar;
        }
        r3s1LDPKFs1S.getClass();
        hj hjVar2 = (hj) unsafe.getObjectVolatile(this, S9EYkSpbGuxq);
        if (hjVar2.e9gEMXR7LXtO > ((hj) objectVolatile).e9gEMXR7LXtO) {
            objectVolatile = hjVar2;
        }
        jq jqVar = (jq) objectVolatile;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = jq.PxuCJdSBwIXG;
            Object e9gEMXR7LXtO = jqVar.e9gEMXR7LXtO();
            if (e9gEMXR7LXtO == fx1.PxuCJdSBwIXG) {
                break;
            }
            jq jqVar2 = (jq) e9gEMXR7LXtO;
            if (jqVar2 != null) {
                jqVar = jqVar2;
            } else if (jqVar.rtx2ld2ELZv4()) {
                break;
            }
        }
        return (hj) jqVar;
    }

    public final Throwable RfyTYNmI9Srp() {
        Throwable XL4ISE6Oc65B2 = XL4ISE6Oc65B();
        return XL4ISE6Oc65B2 == null ? new uk("Channel was closed") : XL4ISE6Oc65B2;
    }

    public final long S9EYkSpbGuxq() {
        return OPXfSBeufaJ8.get(this) & 1152921504606846975L;
    }

    public final boolean VhhvGxCb8gfr() {
        while (true) {
            r3s1LDPKFs1S.getClass();
            Unsafe unsafe = ty1.PxuCJdSBwIXG;
            long j = S9EYkSpbGuxq;
            hj hjVar = (hj) unsafe.getObjectVolatile(this, j);
            AtomicLongFieldUpdater atomicLongFieldUpdater = wdg6QnbFHrFF;
            long j2 = atomicLongFieldUpdater.get(this);
            if (S9EYkSpbGuxq() <= j2) {
                return false;
            }
            long j3 = gg.lS5Rgt96tfkO;
            long j4 = j2 / j3;
            if (hjVar.e9gEMXR7LXtO == j4 || (hjVar = gPXPFXrUH4XX(j4, hjVar)) != null) {
                hjVar.lS5Rgt96tfkO();
                int i = (int) (j2 % j3);
                while (true) {
                    Object BRwzKIf41E4i2 = hjVar.BRwzKIf41E4i(i);
                    if (BRwzKIf41E4i2 == null || BRwzKIf41E4i2 == gg.e9gEMXR7LXtO) {
                        if (hjVar.gPXPFXrUH4XX(i, BRwzKIf41E4i2, gg.rtx2ld2ELZv4)) {
                            cpQdD2nAriOS();
                            break;
                        }
                    } else {
                        if (BRwzKIf41E4i2 == gg.Y1f8riQaR6yg) {
                            return true;
                        }
                        if (BRwzKIf41E4i2 != gg.wdg6QnbFHrFF && BRwzKIf41E4i2 != gg.x50lh2ztY7Y5 && BRwzKIf41E4i2 != gg.OPXfSBeufaJ8 && BRwzKIf41E4i2 != gg.rtx2ld2ELZv4) {
                            if (BRwzKIf41E4i2 == gg.RAsUl2FVSrh6) {
                                return true;
                            }
                            if (BRwzKIf41E4i2 != gg.a92UlCVFR9N8 && j2 == atomicLongFieldUpdater.get(this)) {
                                return true;
                            }
                        }
                    }
                }
                wdg6QnbFHrFF.compareAndSet(this, j2, j2 + 1);
            } else if (((hj) unsafe.getObjectVolatile(this, j)).e9gEMXR7LXtO < j4) {
                return false;
            }
        }
    }

    public final Throwable XL4ISE6Oc65B() {
        gPXPFXrUH4XX.getClass();
        return (Throwable) ty1.PxuCJdSBwIXG.getObjectVolatile(this, XL4ISE6Oc65B);
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00db, code lost:
    
        defpackage.gj.Companion.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00e0, code lost:
    
        return r3;
     */
    @Override // defpackage.v32
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object Y1f8riQaR6yg(Object obj) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = OPXfSBeufaJ8;
        boolean z = false;
        long j = 1152921504606846975L;
        boolean z2 = pnx5pC0XzaCw(atomicLongFieldUpdater.get(this), false) ? false : !e9gEMXR7LXtO(r1 & 1152921504606846975L);
        fj fjVar = gj.lS5Rgt96tfkO;
        if (!z2) {
            Object obj2 = gg.wdg6QnbFHrFF;
            cpQdD2nAriOS.getClass();
            hj hjVar = (hj) ty1.PxuCJdSBwIXG.getObjectVolatile(this, VhhvGxCb8gfr);
            while (true) {
                long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
                long j2 = andIncrement & j;
                boolean pnx5pC0XzaCw = pnx5pC0XzaCw(andIncrement, z);
                int i = gg.lS5Rgt96tfkO;
                long j3 = i;
                long j4 = j2 / j3;
                int i2 = (int) (j2 % j3);
                if (hjVar.e9gEMXR7LXtO != j4) {
                    hj BRwzKIf41E4i2 = BRwzKIf41E4i(j4, hjVar);
                    if (BRwzKIf41E4i2 != null) {
                        hjVar = BRwzKIf41E4i2;
                    } else {
                        if (pnx5pC0XzaCw) {
                            ej ejVar = gj.Companion;
                            Throwable EcgxDIVH5in82 = EcgxDIVH5in8();
                            ejVar.getClass();
                            return new dj(EcgxDIVH5in82);
                        }
                        z = false;
                        j = 1152921504606846975L;
                    }
                }
                int TSizfFm2Yiuu = TSizfFm2Yiuu(this, hjVar, i2, obj, j2, obj2, pnx5pC0XzaCw);
                no2 no2Var = no2.PxuCJdSBwIXG;
                if (TSizfFm2Yiuu == 0) {
                    hjVar.lS5Rgt96tfkO();
                    break;
                }
                if (TSizfFm2Yiuu == 1) {
                    break;
                }
                if (TSizfFm2Yiuu == 2) {
                    if (pnx5pC0XzaCw) {
                        hjVar.r3s1LDPKFs1S();
                        ej ejVar2 = gj.Companion;
                        Throwable EcgxDIVH5in83 = EcgxDIVH5in8();
                        ejVar2.getClass();
                        return new dj(EcgxDIVH5in83);
                    }
                    xr2 xr2Var = obj2 instanceof xr2 ? (xr2) obj2 : null;
                    if (xr2Var != null) {
                        xr2Var.PxuCJdSBwIXG(hjVar, i2 + i);
                    }
                    hjVar.r3s1LDPKFs1S();
                    gj.Companion.getClass();
                    return fjVar;
                }
                if (TSizfFm2Yiuu == 3) {
                    u9.rtx2ld2ELZv4("unexpected");
                    return null;
                }
                if (TSizfFm2Yiuu == 4) {
                    if (j2 < wdg6QnbFHrFF.get(this)) {
                        hjVar.lS5Rgt96tfkO();
                    }
                    ej ejVar3 = gj.Companion;
                    Throwable EcgxDIVH5in84 = EcgxDIVH5in8();
                    ejVar3.getClass();
                    return new dj(EcgxDIVH5in84);
                }
                if (TSizfFm2Yiuu == 5) {
                    hjVar.lS5Rgt96tfkO();
                }
                z = false;
                j = 1152921504606846975L;
            }
        } else {
            gj.Companion.getClass();
            return fjVar;
        }
    }

    public final void ZbWwgt3aGe7A() {
        Object objectVolatile;
        eg egVar;
        loop0: while (true) {
            BRwzKIf41E4i.getClass();
            Unsafe unsafe = ty1.PxuCJdSBwIXG;
            long j = EcgxDIVH5in8;
            objectVolatile = unsafe.getObjectVolatile(this, j);
            f50 f50Var = objectVolatile == null ? gg.BRwzKIf41E4i : gg.XL4ISE6Oc65B;
            while (true) {
                Unsafe unsafe2 = ty1.PxuCJdSBwIXG;
                egVar = this;
                if (unsafe2.compareAndSwapObject(egVar, EcgxDIVH5in8, objectVolatile, f50Var)) {
                    break loop0;
                } else if (unsafe2.getObjectVolatile(egVar, j) != objectVolatile) {
                    break;
                } else {
                    this = egVar;
                }
            }
            this = egVar;
        }
        if (objectVolatile == null) {
            return;
        }
        mm2.S9EYkSpbGuxq(1, objectVolatile);
        ((le0) objectVolatile).OPXfSBeufaJ8(egVar.XL4ISE6Oc65B());
    }

    @Override // defpackage.ui
    public final void a92UlCVFR9N8(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        OPXfSBeufaJ8(cancellationException, true);
    }

    public final boolean aF05bpZJlKEP() {
        long j = dgRBjINgWbAK.get(this);
        return j == 0 || j == Long.MAX_VALUE;
    }

    public final Object amuv7NJvPxHu(hj hjVar, int i, long j, Object obj) {
        Object BRwzKIf41E4i2 = hjVar.BRwzKIf41E4i(i);
        AtomicReferenceArray atomicReferenceArray = hjVar.rtx2ld2ELZv4;
        AtomicLongFieldUpdater atomicLongFieldUpdater = OPXfSBeufaJ8;
        if (BRwzKIf41E4i2 == null) {
            if (j >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return gg.r3s1LDPKFs1S;
                }
                if (hjVar.gPXPFXrUH4XX(i, BRwzKIf41E4i2, obj)) {
                    cpQdD2nAriOS();
                    return gg.cpQdD2nAriOS;
                }
            }
        } else if (BRwzKIf41E4i2 == gg.Y1f8riQaR6yg && hjVar.gPXPFXrUH4XX(i, BRwzKIf41E4i2, gg.OPXfSBeufaJ8)) {
            cpQdD2nAriOS();
            Object obj2 = atomicReferenceArray.get(i * 2);
            hjVar.RfyTYNmI9Srp(i, null);
            return obj2;
        }
        while (true) {
            Object BRwzKIf41E4i3 = hjVar.BRwzKIf41E4i(i);
            if (BRwzKIf41E4i3 == null || BRwzKIf41E4i3 == gg.e9gEMXR7LXtO) {
                if (j < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (hjVar.gPXPFXrUH4XX(i, BRwzKIf41E4i3, gg.rtx2ld2ELZv4)) {
                        cpQdD2nAriOS();
                        return gg.QrzZRwfaDlRX;
                    }
                } else {
                    if (obj == null) {
                        return gg.r3s1LDPKFs1S;
                    }
                    if (hjVar.gPXPFXrUH4XX(i, BRwzKIf41E4i3, obj)) {
                        cpQdD2nAriOS();
                        return gg.cpQdD2nAriOS;
                    }
                }
            } else if (BRwzKIf41E4i3 != gg.Y1f8riQaR6yg) {
                f50 f50Var = gg.wdg6QnbFHrFF;
                if (BRwzKIf41E4i3 == f50Var) {
                    return gg.QrzZRwfaDlRX;
                }
                if (BRwzKIf41E4i3 == gg.rtx2ld2ELZv4) {
                    return gg.QrzZRwfaDlRX;
                }
                if (BRwzKIf41E4i3 == gg.x50lh2ztY7Y5) {
                    cpQdD2nAriOS();
                    return gg.QrzZRwfaDlRX;
                }
                if (BRwzKIf41E4i3 != gg.RAsUl2FVSrh6 && hjVar.gPXPFXrUH4XX(i, BRwzKIf41E4i3, gg.a92UlCVFR9N8)) {
                    boolean z = BRwzKIf41E4i3 instanceof yr2;
                    if (z) {
                        BRwzKIf41E4i3 = ((yr2) BRwzKIf41E4i3).PxuCJdSBwIXG;
                    }
                    if (nLZGh9p8gVSu(BRwzKIf41E4i3)) {
                        hjVar.EcgxDIVH5in8(i, gg.OPXfSBeufaJ8);
                        cpQdD2nAriOS();
                        Object obj3 = atomicReferenceArray.get(i * 2);
                        hjVar.RfyTYNmI9Srp(i, null);
                        return obj3;
                    }
                    hjVar.EcgxDIVH5in8(i, f50Var);
                    hjVar.r3s1LDPKFs1S();
                    if (z) {
                        cpQdD2nAriOS();
                    }
                    return gg.QrzZRwfaDlRX;
                }
            } else if (hjVar.gPXPFXrUH4XX(i, BRwzKIf41E4i3, gg.OPXfSBeufaJ8)) {
                cpQdD2nAriOS();
                Object obj4 = atomicReferenceArray.get(i * 2);
                hjVar.RfyTYNmI9Srp(i, null);
                return obj4;
            }
        }
    }

    public final void cpQdD2nAriOS() {
        eg egVar;
        if (aF05bpZJlKEP()) {
            return;
        }
        QrzZRwfaDlRX.getClass();
        hj hjVar = (hj) ty1.PxuCJdSBwIXG.getObjectVolatile(this, RfyTYNmI9Srp);
        loop0: while (true) {
            long andIncrement = dgRBjINgWbAK.getAndIncrement(this);
            long j = gg.lS5Rgt96tfkO;
            long j2 = andIncrement / j;
            if (this.S9EYkSpbGuxq() <= andIncrement) {
                if (hjVar.e9gEMXR7LXtO < j2 && hjVar.Y1f8riQaR6yg() != null) {
                    this.kpCQ9veP6n3I(j2, hjVar);
                }
                S2OOm9zPNm0h(this);
                return;
            }
            egVar = this;
            if (hjVar.e9gEMXR7LXtO != j2) {
                hj QrzZRwfaDlRX2 = egVar.QrzZRwfaDlRX(j2, hjVar, andIncrement);
                if (QrzZRwfaDlRX2 == null) {
                    continue;
                    this = egVar;
                } else {
                    hjVar = QrzZRwfaDlRX2;
                }
            }
            int i = (int) (andIncrement % j);
            Object BRwzKIf41E4i2 = hjVar.BRwzKIf41E4i(i);
            boolean z = BRwzKIf41E4i2 instanceof xr2;
            AtomicLongFieldUpdater atomicLongFieldUpdater = wdg6QnbFHrFF;
            if (!z || andIncrement < atomicLongFieldUpdater.get(egVar) || !hjVar.gPXPFXrUH4XX(i, BRwzKIf41E4i2, gg.RAsUl2FVSrh6)) {
                while (true) {
                    Object BRwzKIf41E4i3 = hjVar.BRwzKIf41E4i(i);
                    if (!(BRwzKIf41E4i3 instanceof xr2)) {
                        if (BRwzKIf41E4i3 != gg.wdg6QnbFHrFF) {
                            if (BRwzKIf41E4i3 != null) {
                                if (BRwzKIf41E4i3 == gg.Y1f8riQaR6yg || BRwzKIf41E4i3 == gg.rtx2ld2ELZv4 || BRwzKIf41E4i3 == gg.OPXfSBeufaJ8 || BRwzKIf41E4i3 == gg.dgRBjINgWbAK || BRwzKIf41E4i3 == gg.x50lh2ztY7Y5) {
                                    break loop0;
                                } else if (BRwzKIf41E4i3 != gg.a92UlCVFR9N8) {
                                    u9.BRwzKIf41E4i(BRwzKIf41E4i3, "Unexpected cell state: ");
                                    return;
                                }
                            } else if (hjVar.gPXPFXrUH4XX(i, BRwzKIf41E4i3, gg.e9gEMXR7LXtO)) {
                                break loop0;
                            }
                        } else {
                            break;
                        }
                    } else if (andIncrement < atomicLongFieldUpdater.get(egVar)) {
                        if (hjVar.gPXPFXrUH4XX(i, BRwzKIf41E4i3, new yr2((xr2) BRwzKIf41E4i3))) {
                            break loop0;
                        }
                    } else if (hjVar.gPXPFXrUH4XX(i, BRwzKIf41E4i3, gg.RAsUl2FVSrh6)) {
                        if (nLZGh9p8gVSu(BRwzKIf41E4i3)) {
                            hjVar.EcgxDIVH5in8(i, gg.Y1f8riQaR6yg);
                            break;
                        } else {
                            hjVar.EcgxDIVH5in8(i, gg.wdg6QnbFHrFF);
                            hjVar.r3s1LDPKFs1S();
                        }
                    }
                }
                S2OOm9zPNm0h(egVar);
            } else if (nLZGh9p8gVSu(BRwzKIf41E4i2)) {
                hjVar.EcgxDIVH5in8(i, gg.Y1f8riQaR6yg);
                break;
            } else {
                hjVar.EcgxDIVH5in8(i, gg.wdg6QnbFHrFF);
                hjVar.r3s1LDPKFs1S();
                S2OOm9zPNm0h(egVar);
            }
            this = egVar;
        }
        S2OOm9zPNm0h(egVar);
    }

    public final void dgRBjINgWbAK(long j) {
        r3s1LDPKFs1S.getClass();
        hj hjVar = (hj) ty1.PxuCJdSBwIXG.getObjectVolatile(this, S9EYkSpbGuxq);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = wdg6QnbFHrFF;
            long j2 = atomicLongFieldUpdater.get(this);
            if (j < Math.max(this.rtx2ld2ELZv4 + j2, dgRBjINgWbAK.get(this))) {
                return;
            }
            eg egVar = this;
            if (atomicLongFieldUpdater.compareAndSet(egVar, j2, 1 + j2)) {
                long j3 = gg.lS5Rgt96tfkO;
                long j4 = j2 / j3;
                int i = (int) (j2 % j3);
                if (hjVar.e9gEMXR7LXtO != j4) {
                    hj gPXPFXrUH4XX2 = egVar.gPXPFXrUH4XX(j4, hjVar);
                    if (gPXPFXrUH4XX2 != null) {
                        hjVar = gPXPFXrUH4XX2;
                    }
                }
                hj hjVar2 = hjVar;
                if (egVar.amuv7NJvPxHu(hjVar2, i, j2, null) != gg.QrzZRwfaDlRX) {
                    hjVar2.lS5Rgt96tfkO();
                } else if (j2 < egVar.S9EYkSpbGuxq()) {
                    hjVar2.lS5Rgt96tfkO();
                }
                this = egVar;
                hjVar = hjVar2;
            }
            this = egVar;
        }
    }

    public final boolean e6tOsSdd2EFb() {
        return pnx5pC0XzaCw(OPXfSBeufaJ8.get(this), false);
    }

    public final boolean e9gEMXR7LXtO(long j) {
        return j < dgRBjINgWbAK.get(this) || j < wdg6QnbFHrFF.get(this) + ((long) this.rtx2ld2ELZv4);
    }

    public final void gGoUzNp9JO5I(long j) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        eg egVar = this;
        if (egVar.aF05bpZJlKEP()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = dgRBjINgWbAK;
            if (atomicLongFieldUpdater.get(egVar) > j) {
                break;
            } else {
                egVar = this;
            }
        }
        int i = gg.TSizfFm2Yiuu;
        int i2 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = x50lh2ztY7Y5;
            if (i2 < i) {
                long j2 = atomicLongFieldUpdater.get(egVar);
                if (j2 == (4611686018427387903L & atomicLongFieldUpdater2.get(egVar)) && j2 == atomicLongFieldUpdater.get(egVar)) {
                    return;
                } else {
                    i2++;
                }
            } else {
                while (true) {
                    long j3 = atomicLongFieldUpdater2.get(egVar);
                    if (atomicLongFieldUpdater2.compareAndSet(egVar, j3, (j3 & 4611686018427387903L) + 4611686018427387904L)) {
                        break;
                    } else {
                        egVar = this;
                    }
                }
                while (true) {
                    long j4 = atomicLongFieldUpdater.get(egVar);
                    long j5 = atomicLongFieldUpdater2.get(egVar);
                    long j6 = j5 & 4611686018427387903L;
                    boolean z = (j5 & 4611686018427387904L) != 0;
                    if (j4 == j6 && j4 == atomicLongFieldUpdater.get(egVar)) {
                        break;
                    }
                    if (z) {
                        egVar = this;
                    } else {
                        egVar = this;
                        atomicLongFieldUpdater2.compareAndSet(egVar, j5, 4611686018427387904L + j6);
                    }
                }
                while (true) {
                    long j7 = atomicLongFieldUpdater2.get(egVar);
                    if (atomicLongFieldUpdater2.compareAndSet(egVar, j7, j7 & 4611686018427387903L)) {
                        return;
                    } else {
                        egVar = this;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d0, code lost:
    
        if (r8.dgRBjINgWbAK() == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d2, code lost:
    
        r8.OPXfSBeufaJ8();
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0107 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final hj gPXPFXrUH4XX(long j, hj hjVar) {
        Object POWyO8hTM6YC;
        hj hjVar2;
        long j2;
        Unsafe unsafe;
        hj hjVar3 = gg.PxuCJdSBwIXG;
        fg fgVar = fg.QrzZRwfaDlRX;
        loop0: while (true) {
            POWyO8hTM6YC = fx1.POWyO8hTM6YC(hjVar, j, fgVar);
            if (!vi0.tmVwIGCQF4zR(POWyO8hTM6YC)) {
                a22 jyegZNwi31qc = vi0.jyegZNwi31qc(POWyO8hTM6YC);
                while (true) {
                    r3s1LDPKFs1S.getClass();
                    Unsafe unsafe2 = ty1.PxuCJdSBwIXG;
                    long j3 = S9EYkSpbGuxq;
                    a22 a22Var = (a22) unsafe2.getObjectVolatile(this, j3);
                    if (a22Var.e9gEMXR7LXtO >= jyegZNwi31qc.e9gEMXR7LXtO) {
                        break loop0;
                    }
                    if (!jyegZNwi31qc.QrzZRwfaDlRX()) {
                        break;
                    }
                    do {
                        unsafe = ty1.PxuCJdSBwIXG;
                        if (unsafe.compareAndSwapObject(this, S9EYkSpbGuxq, a22Var, jyegZNwi31qc)) {
                            if (a22Var.dgRBjINgWbAK()) {
                                a22Var.OPXfSBeufaJ8();
                            }
                        }
                    } while (unsafe.getObjectVolatile(this, j3) == a22Var);
                    if (jyegZNwi31qc.dgRBjINgWbAK()) {
                        jyegZNwi31qc.OPXfSBeufaJ8();
                    }
                }
            } else {
                break;
            }
        }
        if (vi0.tmVwIGCQF4zR(POWyO8hTM6YC)) {
            e6tOsSdd2EFb();
            if (hjVar.e9gEMXR7LXtO * gg.lS5Rgt96tfkO < S9EYkSpbGuxq()) {
                hjVar.lS5Rgt96tfkO();
                return null;
            }
        } else {
            hj hjVar4 = (hj) vi0.jyegZNwi31qc(POWyO8hTM6YC);
            long j4 = hjVar4.e9gEMXR7LXtO;
            if (!aF05bpZJlKEP() && j <= dgRBjINgWbAK.get(this) / gg.lS5Rgt96tfkO) {
                while (true) {
                    QrzZRwfaDlRX.getClass();
                    Unsafe unsafe3 = ty1.PxuCJdSBwIXG;
                    long j5 = RfyTYNmI9Srp;
                    a22 a22Var2 = (a22) unsafe3.getObjectVolatile(this, j5);
                    if (a22Var2.e9gEMXR7LXtO >= j4 || !hjVar4.QrzZRwfaDlRX()) {
                        break;
                    }
                    while (true) {
                        Unsafe unsafe4 = ty1.PxuCJdSBwIXG;
                        hjVar2 = hjVar4;
                        if (unsafe4.compareAndSwapObject(this, RfyTYNmI9Srp, a22Var2, hjVar4)) {
                            if (a22Var2.dgRBjINgWbAK()) {
                                a22Var2.OPXfSBeufaJ8();
                            }
                        } else {
                            if (unsafe4.getObjectVolatile(this, j5) != a22Var2) {
                                break;
                            }
                            hjVar4 = hjVar2;
                        }
                    }
                    hjVar4 = hjVar2;
                }
                if (j4 > j) {
                    return hjVar2;
                }
                long j6 = j4 * gg.lS5Rgt96tfkO;
                do {
                    j2 = wdg6QnbFHrFF.get(this);
                    if (j2 >= j6) {
                        break;
                    }
                } while (!wdg6QnbFHrFF.compareAndSet(this, j2, j6));
                if (j4 * gg.lS5Rgt96tfkO < S9EYkSpbGuxq()) {
                    hjVar2.lS5Rgt96tfkO();
                }
            }
            hjVar2 = hjVar4;
            if (j4 > j) {
            }
        }
        return null;
    }

    @Override // defpackage.ui
    public final bg iterator() {
        return new bg(this);
    }

    public boolean jyegZNwi31qc() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0063, code lost:
    
        if (r5.dgRBjINgWbAK() == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0065, code lost:
    
        r5.OPXfSBeufaJ8();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void kpCQ9veP6n3I(long j, hj hjVar) {
        eg egVar;
        hj hjVar2;
        hj hjVar3;
        while (hjVar.e9gEMXR7LXtO < j && (hjVar3 = (hj) hjVar.Y1f8riQaR6yg()) != null) {
            hjVar = hjVar3;
        }
        while (true) {
            hj hjVar4 = hjVar;
            while (hjVar4.RAsUl2FVSrh6() && (hjVar2 = (hj) hjVar4.Y1f8riQaR6yg()) != null) {
                hjVar4 = hjVar2;
            }
            while (true) {
                QrzZRwfaDlRX.getClass();
                Unsafe unsafe = ty1.PxuCJdSBwIXG;
                long j2 = RfyTYNmI9Srp;
                a22 a22Var = (a22) unsafe.getObjectVolatile(this, j2);
                if (a22Var.e9gEMXR7LXtO >= hjVar4.e9gEMXR7LXtO) {
                    return;
                }
                if (!hjVar4.QrzZRwfaDlRX()) {
                    break;
                }
                while (true) {
                    Unsafe unsafe2 = ty1.PxuCJdSBwIXG;
                    egVar = this;
                    if (unsafe2.compareAndSwapObject(egVar, RfyTYNmI9Srp, a22Var, hjVar4)) {
                        if (a22Var.dgRBjINgWbAK()) {
                            a22Var.OPXfSBeufaJ8();
                            return;
                        }
                        return;
                    } else if (unsafe2.getObjectVolatile(egVar, j2) != a22Var) {
                        break;
                    } else {
                        this = egVar;
                    }
                }
                this = egVar;
            }
            hjVar = hjVar4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x00a3, code lost:
    
        r10 = (defpackage.hj) r10.a92UlCVFR9N8();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean pnx5pC0XzaCw(long j, boolean z) {
        int i = (int) (j >> 60);
        if (i != 0 && i != 1) {
            if (i == 2) {
                wdg6QnbFHrFF(j & 1152921504606846975L);
                if (!z || !VhhvGxCb8gfr()) {
                }
            } else {
                if (i != 3) {
                    rc1.e9gEMXR7LXtO(o0.wdg6QnbFHrFF("unexpected close status: ", i));
                    return false;
                }
                hj wdg6QnbFHrFF2 = wdg6QnbFHrFF(j & 1152921504606846975L);
                Object obj = null;
                loop0: do {
                    int i2 = gg.lS5Rgt96tfkO - 1;
                    while (true) {
                        if (-1 >= i2) {
                            break;
                        }
                        long j2 = (wdg6QnbFHrFF2.e9gEMXR7LXtO * gg.lS5Rgt96tfkO) + i2;
                        while (true) {
                            Object BRwzKIf41E4i2 = wdg6QnbFHrFF2.BRwzKIf41E4i(i2);
                            if (BRwzKIf41E4i2 == gg.OPXfSBeufaJ8) {
                                break loop0;
                            }
                            f50 f50Var = gg.Y1f8riQaR6yg;
                            AtomicLongFieldUpdater atomicLongFieldUpdater = wdg6QnbFHrFF;
                            if (BRwzKIf41E4i2 == f50Var) {
                                if (j2 < atomicLongFieldUpdater.get(this)) {
                                    break loop0;
                                }
                                if (wdg6QnbFHrFF2.gPXPFXrUH4XX(i2, BRwzKIf41E4i2, gg.x50lh2ztY7Y5)) {
                                    wdg6QnbFHrFF2.RfyTYNmI9Srp(i2, null);
                                    wdg6QnbFHrFF2.r3s1LDPKFs1S();
                                    break;
                                }
                            } else if (BRwzKIf41E4i2 != gg.e9gEMXR7LXtO && BRwzKIf41E4i2 != null) {
                                if (!(BRwzKIf41E4i2 instanceof xr2) && !(BRwzKIf41E4i2 instanceof yr2)) {
                                    f50 f50Var2 = gg.RAsUl2FVSrh6;
                                    if (BRwzKIf41E4i2 == f50Var2 || BRwzKIf41E4i2 == gg.a92UlCVFR9N8) {
                                        break loop0;
                                    }
                                    if (BRwzKIf41E4i2 != f50Var2) {
                                        break;
                                    }
                                } else {
                                    if (j2 < atomicLongFieldUpdater.get(this)) {
                                        break loop0;
                                    }
                                    xr2 xr2Var = BRwzKIf41E4i2 instanceof yr2 ? ((yr2) BRwzKIf41E4i2).PxuCJdSBwIXG : (xr2) BRwzKIf41E4i2;
                                    if (wdg6QnbFHrFF2.gPXPFXrUH4XX(i2, BRwzKIf41E4i2, gg.x50lh2ztY7Y5)) {
                                        obj = th0.IAToe7bXGz4N(obj, xr2Var);
                                        wdg6QnbFHrFF2.RfyTYNmI9Srp(i2, null);
                                        wdg6QnbFHrFF2.r3s1LDPKFs1S();
                                        break;
                                    }
                                }
                            } else if (wdg6QnbFHrFF2.gPXPFXrUH4XX(i2, BRwzKIf41E4i2, gg.x50lh2ztY7Y5)) {
                                wdg6QnbFHrFF2.r3s1LDPKFs1S();
                                break;
                            }
                        }
                        i2--;
                    }
                } while (wdg6QnbFHrFF2 != null);
                if (obj != null) {
                    if (obj instanceof ArrayList) {
                        ArrayList arrayList = (ArrayList) obj;
                        for (int size = arrayList.size() - 1; -1 < size; size--) {
                            J54yh1s3n4Aq((xr2) arrayList.get(size), false);
                        }
                    } else {
                        J54yh1s3n4Aq((xr2) obj, false);
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.ui
    public final Object r3s1LDPKFs1S(im imVar) {
        return ozEBbv0hFTAB(this, imVar);
    }

    public final Object rZjpSjn4zoMv(bt btVar, Object obj) {
        bi biVar = new bi(1, ng0.IAToe7bXGz4N(btVar));
        biVar.ZbWwgt3aGe7A();
        biVar.RAsUl2FVSrh6(new uv1(EcgxDIVH5in8()));
        Object VhhvGxCb8gfr2 = biVar.VhhvGxCb8gfr();
        return VhhvGxCb8gfr2 == su.rtx2ld2ELZv4 ? VhhvGxCb8gfr2 : no2.PxuCJdSBwIXG;
    }

    @Override // defpackage.ui
    public final Object rtx2ld2ELZv4(jc2 jc2Var) {
        return BjEWd04qc7Mw(this, jc2Var);
    }

    public final Object ryVscX7ZL4Ux(Object obj) {
        hj hjVar;
        int i;
        eg egVar;
        Object obj2 = gg.Y1f8riQaR6yg;
        cpQdD2nAriOS.getClass();
        hj hjVar2 = (hj) ty1.PxuCJdSBwIXG.getObjectVolatile(this, VhhvGxCb8gfr);
        while (true) {
            long andIncrement = OPXfSBeufaJ8.getAndIncrement(this);
            long j = andIncrement & 1152921504606846975L;
            boolean pnx5pC0XzaCw = this.pnx5pC0XzaCw(andIncrement, false);
            int i2 = gg.lS5Rgt96tfkO;
            long j2 = i2;
            long j3 = j / j2;
            int i3 = (int) (j % j2);
            if (hjVar2.e9gEMXR7LXtO != j3) {
                hjVar = this.BRwzKIf41E4i(j3, hjVar2);
                if (hjVar != null) {
                    egVar = this;
                    i = i3;
                } else if (pnx5pC0XzaCw) {
                    ej ejVar = gj.Companion;
                    Throwable EcgxDIVH5in82 = this.EcgxDIVH5in8();
                    ejVar.getClass();
                    return new dj(EcgxDIVH5in82);
                }
            } else {
                hjVar = hjVar2;
                i = i3;
                egVar = this;
            }
            Object obj3 = obj;
            int TSizfFm2Yiuu = TSizfFm2Yiuu(egVar, hjVar, i, obj3, j, obj2, pnx5pC0XzaCw);
            eg egVar2 = egVar;
            hjVar2 = hjVar;
            no2 no2Var = no2.PxuCJdSBwIXG;
            if (TSizfFm2Yiuu == 0) {
                hjVar2.lS5Rgt96tfkO();
                gj.Companion.getClass();
                return no2Var;
            }
            if (TSizfFm2Yiuu == 1) {
                gj.Companion.getClass();
                return no2Var;
            }
            if (TSizfFm2Yiuu == 2) {
                if (pnx5pC0XzaCw) {
                    hjVar2.r3s1LDPKFs1S();
                    ej ejVar2 = gj.Companion;
                    Throwable EcgxDIVH5in83 = egVar2.EcgxDIVH5in8();
                    ejVar2.getClass();
                    return new dj(EcgxDIVH5in83);
                }
                xr2 xr2Var = obj2 instanceof xr2 ? (xr2) obj2 : null;
                if (xr2Var != null) {
                    xr2Var.PxuCJdSBwIXG(hjVar2, i + i2);
                }
                egVar2.dgRBjINgWbAK((hjVar2.e9gEMXR7LXtO * j2) + i);
                gj.Companion.getClass();
                return no2Var;
            }
            if (TSizfFm2Yiuu == 3) {
                u9.rtx2ld2ELZv4("unexpected");
                return null;
            }
            if (TSizfFm2Yiuu == 4) {
                if (j < wdg6QnbFHrFF.get(egVar2)) {
                    hjVar2.lS5Rgt96tfkO();
                }
                ej ejVar3 = gj.Companion;
                Throwable EcgxDIVH5in84 = egVar2.EcgxDIVH5in8();
                ejVar3.getClass();
                return new dj(EcgxDIVH5in84);
            }
            if (TSizfFm2Yiuu == 5) {
                hjVar2.lS5Rgt96tfkO();
            }
            this = egVar2;
            obj = obj3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object tmVwIGCQF4zR(hj hjVar, int i, long j, ct ctVar) {
        dg dgVar;
        int i2;
        gj gjVar;
        hj hjVar2;
        if (ctVar instanceof dg) {
            dgVar = (dg) ctVar;
            int i3 = dgVar.cpQdD2nAriOS;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                dgVar.cpQdD2nAriOS = i3 - Integer.MIN_VALUE;
                Object obj = dgVar.dgRBjINgWbAK;
                i2 = dgVar.cpQdD2nAriOS;
                if (i2 != 0) {
                    ng0.tmVwIGCQF4zR(obj);
                    dgVar.cpQdD2nAriOS = 1;
                    bi VhhvGxCb8gfr2 = f2.VhhvGxCb8gfr(ng0.IAToe7bXGz4N(dgVar));
                    try {
                        ws1 ws1Var = new ws1(VhhvGxCb8gfr2);
                        Object amuv7NJvPxHu = amuv7NJvPxHu(hjVar, i, j, ws1Var);
                        if (amuv7NJvPxHu == gg.cpQdD2nAriOS) {
                            ws1Var.PxuCJdSBwIXG(hjVar, i);
                        } else {
                            if (amuv7NJvPxHu == gg.QrzZRwfaDlRX) {
                                if (j < S9EYkSpbGuxq()) {
                                    hjVar.lS5Rgt96tfkO();
                                }
                                hj hjVar3 = (hj) r3s1LDPKFs1S.get(this);
                                while (true) {
                                    if (IAToe7bXGz4N()) {
                                        ej ejVar = gj.Companion;
                                        Throwable XL4ISE6Oc65B2 = XL4ISE6Oc65B();
                                        ejVar.getClass();
                                        VhhvGxCb8gfr2.RAsUl2FVSrh6(new gj(new dj(XL4ISE6Oc65B2)));
                                        break;
                                    }
                                    long andIncrement = wdg6QnbFHrFF.getAndIncrement(this);
                                    long j2 = gg.lS5Rgt96tfkO;
                                    long j3 = andIncrement / j2;
                                    int i4 = (int) (andIncrement % j2);
                                    if (hjVar3.e9gEMXR7LXtO != j3) {
                                        hj gPXPFXrUH4XX2 = gPXPFXrUH4XX(j3, hjVar3);
                                        if (gPXPFXrUH4XX2 != null) {
                                            hjVar2 = gPXPFXrUH4XX2;
                                        }
                                    } else {
                                        hjVar2 = hjVar3;
                                    }
                                    Object amuv7NJvPxHu2 = amuv7NJvPxHu(hjVar2, i4, andIncrement, ws1Var);
                                    hj hjVar4 = hjVar2;
                                    if (amuv7NJvPxHu2 == gg.cpQdD2nAriOS) {
                                        ws1Var.PxuCJdSBwIXG(hjVar4, i4);
                                        break;
                                    }
                                    if (amuv7NJvPxHu2 == gg.QrzZRwfaDlRX) {
                                        if (andIncrement < S9EYkSpbGuxq()) {
                                            hjVar4.lS5Rgt96tfkO();
                                        }
                                        hjVar3 = hjVar4;
                                    } else {
                                        if (amuv7NJvPxHu2 == gg.r3s1LDPKFs1S) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        hjVar4.lS5Rgt96tfkO();
                                        gj.Companion.getClass();
                                        gjVar = new gj(amuv7NJvPxHu2);
                                    }
                                }
                            } else {
                                hjVar.lS5Rgt96tfkO();
                                gj.Companion.getClass();
                                gjVar = new gj(amuv7NJvPxHu);
                            }
                            VhhvGxCb8gfr2.wdg6QnbFHrFF(gjVar, null);
                        }
                        obj = VhhvGxCb8gfr2.VhhvGxCb8gfr();
                        su suVar = su.rtx2ld2ELZv4;
                        if (obj == suVar) {
                            return suVar;
                        }
                    } catch (Throwable th) {
                        VhhvGxCb8gfr2.rZjpSjn4zoMv();
                        throw th;
                    }
                } else {
                    if (i2 != 1) {
                        u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ng0.tmVwIGCQF4zR(obj);
                }
                return ((gj) obj).PxuCJdSBwIXG;
            }
        }
        dgVar = new dg(this, ctVar);
        Object obj2 = dgVar.dgRBjINgWbAK;
        i2 = dgVar.cpQdD2nAriOS;
        if (i2 != 0) {
        }
        return ((gj) obj2).PxuCJdSBwIXG;
    }

    /* JADX WARN: Code restructure failed: missing block: B:96:0x01ae, code lost:
    
        r15 = r8;
        r16 = null;
        r3 = (defpackage.hj) r3.Y1f8riQaR6yg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01b8, code lost:
    
        if (r3 != null) goto L86;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        int i;
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        int i2 = (int) (OPXfSBeufaJ8.get(this) >> 60);
        if (i2 == 2) {
            sb.append("closed,");
        } else if (i2 == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.rtx2ld2ELZv4 + ',');
        sb.append("data=[");
        r3s1LDPKFs1S.getClass();
        Unsafe unsafe = ty1.PxuCJdSBwIXG;
        int i3 = 0;
        cpQdD2nAriOS.getClass();
        Object objectVolatile = unsafe.getObjectVolatile(this, VhhvGxCb8gfr);
        int i4 = 1;
        QrzZRwfaDlRX.getClass();
        List D0aTLcX6Uhyo = fx1.D0aTLcX6Uhyo(unsafe.getObjectVolatile(this, S9EYkSpbGuxq), objectVolatile, unsafe.getObjectVolatile(this, RfyTYNmI9Srp));
        ArrayList arrayList = new ArrayList();
        for (Object obj : D0aTLcX6Uhyo) {
            if (((hj) obj) != gg.PxuCJdSBwIXG) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            u9.RfyTYNmI9Srp();
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j = ((hj) next).e9gEMXR7LXtO;
            do {
                Object next2 = it.next();
                long j2 = ((hj) next2).e9gEMXR7LXtO;
                if (j > j2) {
                    next = next2;
                    j = j2;
                }
            } while (it.hasNext());
        }
        hj hjVar = (hj) next;
        long j3 = wdg6QnbFHrFF.get(this);
        long S9EYkSpbGuxq2 = S9EYkSpbGuxq();
        loop2: while (true) {
            int i5 = gg.lS5Rgt96tfkO;
            int i6 = i3;
            while (true) {
                if (i6 >= i5) {
                    break;
                }
                i = i4;
                long j4 = (hjVar.e9gEMXR7LXtO * gg.lS5Rgt96tfkO) + i6;
                if (j4 >= S9EYkSpbGuxq2 && j4 >= j3) {
                    str = null;
                    break loop2;
                }
                Object BRwzKIf41E4i2 = hjVar.BRwzKIf41E4i(i6);
                Object obj2 = hjVar.rtx2ld2ELZv4.get(i6 * 2);
                if (BRwzKIf41E4i2 instanceof zh) {
                    str2 = (j4 >= j3 || j4 < S9EYkSpbGuxq2) ? (j4 >= S9EYkSpbGuxq2 || j4 < j3) ? "cont" : "send" : "receive";
                } else if (BRwzKIf41E4i2 instanceof ws1) {
                    str2 = "receiveCatching";
                } else if (BRwzKIf41E4i2 instanceof yr2) {
                    str2 = "EB(" + BRwzKIf41E4i2 + ')';
                } else if (cs0.wdg6QnbFHrFF(BRwzKIf41E4i2, gg.a92UlCVFR9N8) || cs0.wdg6QnbFHrFF(BRwzKIf41E4i2, gg.RAsUl2FVSrh6)) {
                    str2 = "resuming_sender";
                } else {
                    if (BRwzKIf41E4i2 != null && !BRwzKIf41E4i2.equals(gg.e9gEMXR7LXtO) && !BRwzKIf41E4i2.equals(gg.OPXfSBeufaJ8) && !BRwzKIf41E4i2.equals(gg.rtx2ld2ELZv4) && !BRwzKIf41E4i2.equals(gg.dgRBjINgWbAK) && !BRwzKIf41E4i2.equals(gg.wdg6QnbFHrFF) && !BRwzKIf41E4i2.equals(gg.x50lh2ztY7Y5)) {
                        str2 = BRwzKIf41E4i2.toString();
                    }
                    i6++;
                    i4 = i;
                }
                if (obj2 != null) {
                    sb.append("(" + str2 + ',' + obj2 + "),");
                } else {
                    sb.append(str2 + ',');
                }
                i6++;
                i4 = i;
            }
            i4 = i;
            i3 = 0;
        }
        if (sb.length() == 0) {
            rc1.RAsUl2FVSrh6("Char sequence is empty.");
            return str;
        }
        if (sb.charAt(sb.length() - i) == ',') {
            sb.deleteCharAt(sb.length() - i).getClass();
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0046, code lost:
    
        r1 = (defpackage.hj) r1.a92UlCVFR9N8();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final hj wdg6QnbFHrFF(long j) {
        long j2;
        hj RAsUl2FVSrh6 = RAsUl2FVSrh6();
        if (jyegZNwi31qc()) {
            hj hjVar = RAsUl2FVSrh6;
            loop0: do {
                int i = gg.lS5Rgt96tfkO - 1;
                while (true) {
                    if (-1 >= i) {
                        break;
                    }
                    j2 = (hjVar.e9gEMXR7LXtO * gg.lS5Rgt96tfkO) + i;
                    if (j2 < wdg6QnbFHrFF.get(this)) {
                        break loop0;
                    }
                    while (true) {
                        Object BRwzKIf41E4i2 = hjVar.BRwzKIf41E4i(i);
                        if (BRwzKIf41E4i2 != null && BRwzKIf41E4i2 != gg.e9gEMXR7LXtO) {
                            if (BRwzKIf41E4i2 == gg.Y1f8riQaR6yg) {
                                break loop0;
                            }
                        } else {
                            if (hjVar.gPXPFXrUH4XX(i, BRwzKIf41E4i2, gg.x50lh2ztY7Y5)) {
                                hjVar.r3s1LDPKFs1S();
                                break;
                            }
                        }
                    }
                    i--;
                }
            } while (hjVar != null);
            j2 = -1;
            if (j2 != -1) {
                dgRBjINgWbAK(j2);
            }
        }
        Object obj = null;
        loop3: for (hj hjVar2 = RAsUl2FVSrh6; hjVar2 != null; hjVar2 = (hj) hjVar2.a92UlCVFR9N8()) {
            for (int i2 = gg.lS5Rgt96tfkO - 1; -1 < i2; i2--) {
                if ((hjVar2.e9gEMXR7LXtO * gg.lS5Rgt96tfkO) + i2 < j) {
                    break loop3;
                }
                while (true) {
                    Object BRwzKIf41E4i3 = hjVar2.BRwzKIf41E4i(i2);
                    if (BRwzKIf41E4i3 != null && BRwzKIf41E4i3 != gg.e9gEMXR7LXtO) {
                        if (!(BRwzKIf41E4i3 instanceof yr2)) {
                            if (!(BRwzKIf41E4i3 instanceof xr2)) {
                                break;
                            }
                            if (hjVar2.gPXPFXrUH4XX(i2, BRwzKIf41E4i3, gg.x50lh2ztY7Y5)) {
                                obj = th0.IAToe7bXGz4N(obj, BRwzKIf41E4i3);
                                hjVar2.XL4ISE6Oc65B(i2, true);
                                break;
                            }
                        } else {
                            if (hjVar2.gPXPFXrUH4XX(i2, BRwzKIf41E4i3, gg.x50lh2ztY7Y5)) {
                                obj = th0.IAToe7bXGz4N(obj, ((yr2) BRwzKIf41E4i3).PxuCJdSBwIXG);
                                hjVar2.XL4ISE6Oc65B(i2, true);
                                break;
                            }
                        }
                    } else {
                        if (hjVar2.gPXPFXrUH4XX(i2, BRwzKIf41E4i3, gg.x50lh2ztY7Y5)) {
                            hjVar2.r3s1LDPKFs1S();
                            break;
                        }
                    }
                }
            }
        }
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                J54yh1s3n4Aq((xr2) obj, true);
                return RAsUl2FVSrh6;
            }
            ArrayList arrayList = (ArrayList) obj;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                J54yh1s3n4Aq((xr2) arrayList.get(size), true);
            }
        }
        return RAsUl2FVSrh6;
    }

    @Override // defpackage.ui
    public final Object x50lh2ztY7Y5() {
        hj hjVar;
        AtomicLongFieldUpdater atomicLongFieldUpdater = wdg6QnbFHrFF;
        long j = atomicLongFieldUpdater.get(this);
        long j2 = OPXfSBeufaJ8.get(this);
        if (pnx5pC0XzaCw(j2, true)) {
            ej ejVar = gj.Companion;
            Throwable XL4ISE6Oc65B2 = XL4ISE6Oc65B();
            ejVar.getClass();
            return new dj(XL4ISE6Oc65B2);
        }
        long j3 = j2 & 1152921504606846975L;
        fj fjVar = gj.lS5Rgt96tfkO;
        if (j >= j3) {
            gj.Companion.getClass();
            return fjVar;
        }
        Object obj = gg.dgRBjINgWbAK;
        r3s1LDPKFs1S.getClass();
        hj hjVar2 = (hj) ty1.PxuCJdSBwIXG.getObjectVolatile(this, S9EYkSpbGuxq);
        while (!this.IAToe7bXGz4N()) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j4 = gg.lS5Rgt96tfkO;
            long j5 = andIncrement / j4;
            int i = (int) (andIncrement % j4);
            if (hjVar2.e9gEMXR7LXtO != j5) {
                hj gPXPFXrUH4XX2 = this.gPXPFXrUH4XX(j5, hjVar2);
                if (gPXPFXrUH4XX2 == null) {
                    continue;
                } else {
                    hjVar = gPXPFXrUH4XX2;
                }
            } else {
                hjVar = hjVar2;
            }
            eg egVar = this;
            Object amuv7NJvPxHu = egVar.amuv7NJvPxHu(hjVar, i, andIncrement, obj);
            hjVar2 = hjVar;
            if (amuv7NJvPxHu == gg.cpQdD2nAriOS) {
                xr2 xr2Var = obj instanceof xr2 ? (xr2) obj : null;
                if (xr2Var != null) {
                    xr2Var.PxuCJdSBwIXG(hjVar2, i);
                }
                egVar.gGoUzNp9JO5I(andIncrement);
                hjVar2.r3s1LDPKFs1S();
                gj.Companion.getClass();
                return fjVar;
            }
            if (amuv7NJvPxHu != gg.QrzZRwfaDlRX) {
                if (amuv7NJvPxHu == gg.r3s1LDPKFs1S) {
                    u9.rtx2ld2ELZv4("unexpected");
                    return null;
                }
                hjVar2.lS5Rgt96tfkO();
                gj.Companion.getClass();
                return amuv7NJvPxHu;
            }
            if (andIncrement < egVar.S9EYkSpbGuxq()) {
                hjVar2.lS5Rgt96tfkO();
            }
            this = egVar;
        }
        ej ejVar2 = gj.Companion;
        Throwable XL4ISE6Oc65B3 = this.XL4ISE6Oc65B();
        ejVar2.getClass();
        return new dj(XL4ISE6Oc65B3);
    }

    public final boolean xfACYKDMU6Dj(Object obj, Object obj2) {
        if (obj instanceof ws1) {
            bi biVar = ((ws1) obj).rtx2ld2ELZv4;
            gj.Companion.getClass();
            return gg.PxuCJdSBwIXG(biVar, new gj(obj2), null);
        }
        if (!(obj instanceof bg)) {
            if (obj instanceof zh) {
                return gg.PxuCJdSBwIXG((zh) obj, obj2, null);
            }
            u9.BRwzKIf41E4i(obj, "Unexpected receiver type: ");
            return false;
        }
        bg bgVar = (bg) obj;
        bi biVar2 = bgVar.OPXfSBeufaJ8;
        biVar2.getClass();
        bgVar.OPXfSBeufaJ8 = null;
        bgVar.rtx2ld2ELZv4 = obj2;
        Boolean bool = Boolean.TRUE;
        bgVar.wdg6QnbFHrFF.getClass();
        return gg.PxuCJdSBwIXG(biVar2, bool, null);
    }
}
