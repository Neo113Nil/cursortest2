package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class qa extends m61 implements kw0 {
    public float VhhvGxCb8gfr;

    @Override // defpackage.kw0
    public final int BRwzKIf41E4i(u31 u31Var, e51 e51Var, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i / this.VhhvGxCb8gfr) : e51Var.a92UlCVFR9N8(i);
    }

    @Override // defpackage.kw0
    public final int RAsUl2FVSrh6(u31 u31Var, e51 e51Var, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i * this.VhhvGxCb8gfr) : e51Var.IXK6ba3ucyzm(i);
    }

    public final long W7ceZOzvrRuI(long j, boolean z) {
        int round;
        int RAsUl2FVSrh6 = rr.RAsUl2FVSrh6(j);
        if (RAsUl2FVSrh6 != Integer.MAX_VALUE && (round = Math.round(RAsUl2FVSrh6 * this.VhhvGxCb8gfr)) > 0 && (!z || zv.J54yh1s3n4Aq(round, RAsUl2FVSrh6, j))) {
            return (round << 32) | (RAsUl2FVSrh6 & 4294967295L);
        }
        ir0.Companion.getClass();
        return 0L;
    }

    public final long X1HMmH2Ks65g(long j, boolean z) {
        int round;
        int rtx2ld2ELZv4 = rr.rtx2ld2ELZv4(j);
        if (rtx2ld2ELZv4 != Integer.MAX_VALUE && (round = Math.round(rtx2ld2ELZv4 / this.VhhvGxCb8gfr)) > 0 && (!z || zv.J54yh1s3n4Aq(rtx2ld2ELZv4, round, j))) {
            return (rtx2ld2ELZv4 << 32) | (round & 4294967295L);
        }
        ir0.Companion.getClass();
        return 0L;
    }

    public final long Yadk4uqlxLy8(long j, boolean z) {
        int wdg6QnbFHrFF = rr.wdg6QnbFHrFF(j);
        int round = Math.round(wdg6QnbFHrFF / this.VhhvGxCb8gfr);
        if (round > 0 && (!z || zv.J54yh1s3n4Aq(wdg6QnbFHrFF, round, j))) {
            return (wdg6QnbFHrFF << 32) | (round & 4294967295L);
        }
        ir0.Companion.getClass();
        return 0L;
    }

    @Override // defpackage.kw0
    public final k51 e9gEMXR7LXtO(l51 l51Var, e51 e51Var, long j) {
        long X1HMmH2Ks65g = X1HMmH2Ks65g(j, true);
        hr0 hr0Var = ir0.Companion;
        hr0Var.getClass();
        if (ir0.PxuCJdSBwIXG(X1HMmH2Ks65g, 0L)) {
            X1HMmH2Ks65g = W7ceZOzvrRuI(j, true);
            if (ir0.PxuCJdSBwIXG(X1HMmH2Ks65g, 0L)) {
                X1HMmH2Ks65g = Yadk4uqlxLy8(j, true);
                if (ir0.PxuCJdSBwIXG(X1HMmH2Ks65g, 0L)) {
                    X1HMmH2Ks65g = fkblLSN2bAgv(j, true);
                    if (ir0.PxuCJdSBwIXG(X1HMmH2Ks65g, 0L)) {
                        X1HMmH2Ks65g = X1HMmH2Ks65g(j, false);
                        if (ir0.PxuCJdSBwIXG(X1HMmH2Ks65g, 0L)) {
                            X1HMmH2Ks65g = W7ceZOzvrRuI(j, false);
                            if (ir0.PxuCJdSBwIXG(X1HMmH2Ks65g, 0L)) {
                                X1HMmH2Ks65g = Yadk4uqlxLy8(j, false);
                                if (ir0.PxuCJdSBwIXG(X1HMmH2Ks65g, 0L)) {
                                    X1HMmH2Ks65g = fkblLSN2bAgv(j, false);
                                    if (ir0.PxuCJdSBwIXG(X1HMmH2Ks65g, 0L)) {
                                        hr0Var.getClass();
                                        X1HMmH2Ks65g = 0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        hr0Var.getClass();
        if (!ir0.PxuCJdSBwIXG(X1HMmH2Ks65g, 0L)) {
            rr.Companion.getClass();
            j = qr.TSizfFm2Yiuu((int) (X1HMmH2Ks65g >> 32), (int) (X1HMmH2Ks65g & 4294967295L));
        }
        em1 e9gEMXR7LXtO = e51Var.e9gEMXR7LXtO(j);
        return l51Var.jJwa0q7P5wHq(e9gEMXR7LXtO.rtx2ld2ELZv4, e9gEMXR7LXtO.OPXfSBeufaJ8, q50.rtx2ld2ELZv4, new pa(e9gEMXR7LXtO, 0));
    }

    public final long fkblLSN2bAgv(long j, boolean z) {
        int OPXfSBeufaJ8 = rr.OPXfSBeufaJ8(j);
        int round = Math.round(OPXfSBeufaJ8 * this.VhhvGxCb8gfr);
        if (round > 0 && (!z || zv.J54yh1s3n4Aq(round, OPXfSBeufaJ8, j))) {
            return (round << 32) | (OPXfSBeufaJ8 & 4294967295L);
        }
        ir0.Companion.getClass();
        return 0L;
    }

    @Override // defpackage.kw0
    public final int i68hK7ahKtgp(u31 u31Var, e51 e51Var, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i * this.VhhvGxCb8gfr) : e51Var.i68hK7ahKtgp(i);
    }

    @Override // defpackage.kw0
    public final int kpCQ9veP6n3I(u31 u31Var, e51 e51Var, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i / this.VhhvGxCb8gfr) : e51Var.ngxnMNrpiKat(i);
    }
}
