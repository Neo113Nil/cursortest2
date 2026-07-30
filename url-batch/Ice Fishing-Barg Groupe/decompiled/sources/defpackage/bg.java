package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class bg implements xr2 {
    public bi OPXfSBeufaJ8;
    public Object rtx2ld2ELZv4 = gg.gPXPFXrUH4XX;
    public final /* synthetic */ eg wdg6QnbFHrFF;

    public bg(eg egVar) {
        this.wdg6QnbFHrFF = egVar;
    }

    @Override // defpackage.xr2
    public final void PxuCJdSBwIXG(a22 a22Var, int i) {
        bi biVar = this.OPXfSBeufaJ8;
        if (biVar != null) {
            biVar.PxuCJdSBwIXG(a22Var, i);
        }
    }

    public final Object TSizfFm2Yiuu() {
        Object obj = this.rtx2ld2ELZv4;
        f50 f50Var = gg.gPXPFXrUH4XX;
        if (obj == f50Var) {
            u9.rtx2ld2ELZv4("`hasNext()` has not been invoked");
            return null;
        }
        this.rtx2ld2ELZv4 = f50Var;
        if (obj != gg.x50lh2ztY7Y5) {
            return obj;
        }
        Throwable RfyTYNmI9Srp = this.wdg6QnbFHrFF.RfyTYNmI9Srp();
        int i = y82.PxuCJdSBwIXG;
        throw RfyTYNmI9Srp;
    }

    public final Object lS5Rgt96tfkO(ct ctVar) {
        hj hjVar;
        Object obj = this.rtx2ld2ELZv4;
        boolean z = true;
        if (obj == gg.gPXPFXrUH4XX || obj == gg.x50lh2ztY7Y5) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = eg.r3s1LDPKFs1S;
            eg egVar = this.wdg6QnbFHrFF;
            hj hjVar2 = (hj) atomicReferenceFieldUpdater.get(egVar);
            while (true) {
                if (egVar.IAToe7bXGz4N()) {
                    this.rtx2ld2ELZv4 = gg.x50lh2ztY7Y5;
                    Throwable XL4ISE6Oc65B = egVar.XL4ISE6Oc65B();
                    if (XL4ISE6Oc65B != null) {
                        int i = y82.PxuCJdSBwIXG;
                        throw XL4ISE6Oc65B;
                    }
                    z = false;
                } else {
                    long andIncrement = eg.wdg6QnbFHrFF.getAndIncrement(egVar);
                    long j = gg.lS5Rgt96tfkO;
                    long j2 = andIncrement / j;
                    int i2 = (int) (andIncrement % j);
                    if (hjVar2.e9gEMXR7LXtO != j2) {
                        hjVar = egVar.gPXPFXrUH4XX(j2, hjVar2);
                        if (hjVar == null) {
                            continue;
                        }
                    } else {
                        hjVar = hjVar2;
                    }
                    Object amuv7NJvPxHu = egVar.amuv7NJvPxHu(hjVar, i2, andIncrement, null);
                    f50 f50Var = gg.cpQdD2nAriOS;
                    if (amuv7NJvPxHu == f50Var) {
                        u9.rtx2ld2ELZv4("unreachable");
                        return null;
                    }
                    f50 f50Var2 = gg.QrzZRwfaDlRX;
                    if (amuv7NJvPxHu == f50Var2) {
                        if (andIncrement < egVar.S9EYkSpbGuxq()) {
                            hjVar.lS5Rgt96tfkO();
                        }
                        hjVar2 = hjVar;
                    } else {
                        if (amuv7NJvPxHu == gg.r3s1LDPKFs1S) {
                            eg egVar2 = this.wdg6QnbFHrFF;
                            bi VhhvGxCb8gfr = f2.VhhvGxCb8gfr(ng0.IAToe7bXGz4N(ctVar));
                            try {
                                this.OPXfSBeufaJ8 = VhhvGxCb8gfr;
                                Object amuv7NJvPxHu2 = egVar2.amuv7NJvPxHu(hjVar, i2, andIncrement, this);
                                if (amuv7NJvPxHu2 == f50Var) {
                                    PxuCJdSBwIXG(hjVar, i2);
                                } else {
                                    if (amuv7NJvPxHu2 == f50Var2) {
                                        if (andIncrement < egVar2.S9EYkSpbGuxq()) {
                                            hjVar.lS5Rgt96tfkO();
                                        }
                                        hj hjVar3 = (hj) eg.r3s1LDPKFs1S.get(egVar2);
                                        while (true) {
                                            if (egVar2.IAToe7bXGz4N()) {
                                                bi biVar = this.OPXfSBeufaJ8;
                                                biVar.getClass();
                                                this.OPXfSBeufaJ8 = null;
                                                this.rtx2ld2ELZv4 = gg.x50lh2ztY7Y5;
                                                Throwable XL4ISE6Oc65B2 = egVar.XL4ISE6Oc65B();
                                                if (XL4ISE6Oc65B2 == null) {
                                                    biVar.RAsUl2FVSrh6(Boolean.FALSE);
                                                } else {
                                                    biVar.RAsUl2FVSrh6(new uv1(XL4ISE6Oc65B2));
                                                }
                                            } else {
                                                long andIncrement2 = eg.wdg6QnbFHrFF.getAndIncrement(egVar2);
                                                long j3 = gg.lS5Rgt96tfkO;
                                                long j4 = andIncrement2 / j3;
                                                int i3 = (int) (andIncrement2 % j3);
                                                if (hjVar3.e9gEMXR7LXtO != j4) {
                                                    hj gPXPFXrUH4XX = egVar2.gPXPFXrUH4XX(j4, hjVar3);
                                                    if (gPXPFXrUH4XX != null) {
                                                        hjVar3 = gPXPFXrUH4XX;
                                                    }
                                                }
                                                Object amuv7NJvPxHu3 = egVar2.amuv7NJvPxHu(hjVar3, i3, andIncrement2, this);
                                                if (amuv7NJvPxHu3 == gg.cpQdD2nAriOS) {
                                                    PxuCJdSBwIXG(hjVar3, i3);
                                                    break;
                                                }
                                                if (amuv7NJvPxHu3 == gg.QrzZRwfaDlRX) {
                                                    if (andIncrement2 < egVar2.S9EYkSpbGuxq()) {
                                                        hjVar3.lS5Rgt96tfkO();
                                                    }
                                                } else {
                                                    if (amuv7NJvPxHu3 == gg.r3s1LDPKFs1S) {
                                                        throw new IllegalStateException("unexpected");
                                                    }
                                                    hjVar3.lS5Rgt96tfkO();
                                                    this.rtx2ld2ELZv4 = amuv7NJvPxHu3;
                                                    this.OPXfSBeufaJ8 = null;
                                                }
                                            }
                                        }
                                    } else {
                                        hjVar.lS5Rgt96tfkO();
                                        this.rtx2ld2ELZv4 = amuv7NJvPxHu2;
                                        this.OPXfSBeufaJ8 = null;
                                    }
                                    VhhvGxCb8gfr.wdg6QnbFHrFF(Boolean.TRUE, null);
                                }
                                return VhhvGxCb8gfr.VhhvGxCb8gfr();
                            } catch (Throwable th) {
                                VhhvGxCb8gfr.rZjpSjn4zoMv();
                                throw th;
                            }
                        }
                        hjVar.lS5Rgt96tfkO();
                        this.rtx2ld2ELZv4 = amuv7NJvPxHu;
                    }
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
