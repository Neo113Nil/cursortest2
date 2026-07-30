package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class si1 extends m61 implements kw0, i30 {
    public float IAToe7bXGz4N;
    public boolean S2OOm9zPNm0h;
    public qi1 VhhvGxCb8gfr;
    public pd ZbWwgt3aGe7A;
    public jl e6tOsSdd2EFb;
    public ih0 pnx5pC0XzaCw;

    public static boolean X1HMmH2Ks65g(long j) {
        a62.Companion.getClass();
        return !a62.PxuCJdSBwIXG(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L))) & Integer.MAX_VALUE) < 2139095040;
    }

    public static boolean fkblLSN2bAgv(long j) {
        a62.Companion.getClass();
        return !a62.PxuCJdSBwIXG(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32))) & Integer.MAX_VALUE) < 2139095040;
    }

    @Override // defpackage.kw0
    public final int BRwzKIf41E4i(u31 u31Var, e51 e51Var, int i) {
        if (!W7ceZOzvrRuI()) {
            return e51Var.a92UlCVFR9N8(i);
        }
        long Yadk4uqlxLy8 = Yadk4uqlxLy8(sr.lS5Rgt96tfkO(0, i, 0, 0, 13));
        return Math.max(rr.OPXfSBeufaJ8(Yadk4uqlxLy8), e51Var.a92UlCVFR9N8(i));
    }

    @Override // defpackage.i30
    public final void Pf0ThKz3j5YS(xw0 xw0Var) {
        long j;
        ji jiVar = xw0Var.rtx2ld2ELZv4;
        long Y1f8riQaR6yg = this.VhhvGxCb8gfr.Y1f8riQaR6yg();
        long floatToRawIntBits = (Float.floatToRawIntBits(fkblLSN2bAgv(Y1f8riQaR6yg) ? Float.intBitsToFloat((int) (Y1f8riQaR6yg >> 32)) : Float.intBitsToFloat((int) (jiVar.Y1f8riQaR6yg() >> 32))) << 32) | (Float.floatToRawIntBits(X1HMmH2Ks65g(Y1f8riQaR6yg) ? Float.intBitsToFloat((int) (Y1f8riQaR6yg & 4294967295L)) : Float.intBitsToFloat((int) (jiVar.Y1f8riQaR6yg() & 4294967295L))) & 4294967295L);
        if (Float.intBitsToFloat((int) (jiVar.Y1f8riQaR6yg() >> 32)) == 0.0f || Float.intBitsToFloat((int) (jiVar.Y1f8riQaR6yg() & 4294967295L)) == 0.0f) {
            a62.Companion.getClass();
            j = 0;
        } else {
            j = ng0.J54yh1s3n4Aq(floatToRawIntBits, this.pnx5pC0XzaCw.x50lh2ztY7Y5(floatToRawIntBits, jiVar.Y1f8riQaR6yg()));
        }
        long PxuCJdSBwIXG = this.ZbWwgt3aGe7A.PxuCJdSBwIXG((Math.round(Float.intBitsToFloat((int) (j >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (j & 4294967295L))) & 4294967295L), (Math.round(Float.intBitsToFloat((int) (jiVar.Y1f8riQaR6yg() >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (jiVar.Y1f8riQaR6yg() & 4294967295L))) & 4294967295L), xw0Var.getLayoutDirection());
        float f = (int) (PxuCJdSBwIXG >> 32);
        float f2 = (int) (PxuCJdSBwIXG & 4294967295L);
        ((i2) jiVar.OPXfSBeufaJ8.OPXfSBeufaJ8).BRwzKIf41E4i(f, f2);
        try {
            this.VhhvGxCb8gfr.TSizfFm2Yiuu(xw0Var, j, this.IAToe7bXGz4N, this.e6tOsSdd2EFb);
            ((i2) jiVar.OPXfSBeufaJ8.OPXfSBeufaJ8).BRwzKIf41E4i(-f, -f2);
            xw0Var.PxuCJdSBwIXG();
        } catch (Throwable th) {
            ((i2) jiVar.OPXfSBeufaJ8.OPXfSBeufaJ8).BRwzKIf41E4i(-f, -f2);
            throw th;
        }
    }

    @Override // defpackage.kw0
    public final int RAsUl2FVSrh6(u31 u31Var, e51 e51Var, int i) {
        if (!W7ceZOzvrRuI()) {
            return e51Var.IXK6ba3ucyzm(i);
        }
        long Yadk4uqlxLy8 = Yadk4uqlxLy8(sr.lS5Rgt96tfkO(0, 0, 0, i, 7));
        return Math.max(rr.wdg6QnbFHrFF(Yadk4uqlxLy8), e51Var.IXK6ba3ucyzm(i));
    }

    public final boolean W7ceZOzvrRuI() {
        return this.S2OOm9zPNm0h && this.VhhvGxCb8gfr.Y1f8riQaR6yg() != 9205357640488583168L;
    }

    public final long Yadk4uqlxLy8(long j) {
        boolean z = false;
        boolean z2 = rr.Y1f8riQaR6yg(j) && rr.TSizfFm2Yiuu(j);
        if (rr.a92UlCVFR9N8(j) && rr.e9gEMXR7LXtO(j)) {
            z = true;
        }
        if ((!W7ceZOzvrRuI() && z2) || z) {
            return rr.PxuCJdSBwIXG(j, rr.rtx2ld2ELZv4(j), 0, rr.RAsUl2FVSrh6(j), 0, 10);
        }
        long Y1f8riQaR6yg = this.VhhvGxCb8gfr.Y1f8riQaR6yg();
        int round = fkblLSN2bAgv(Y1f8riQaR6yg) ? Math.round(Float.intBitsToFloat((int) (Y1f8riQaR6yg >> 32))) : rr.wdg6QnbFHrFF(j);
        int round2 = X1HMmH2Ks65g(Y1f8riQaR6yg) ? Math.round(Float.intBitsToFloat((int) (Y1f8riQaR6yg & 4294967295L))) : rr.OPXfSBeufaJ8(j);
        int RAsUl2FVSrh6 = sr.RAsUl2FVSrh6(round, j);
        long floatToRawIntBits = (Float.floatToRawIntBits(sr.a92UlCVFR9N8(round2, j)) & 4294967295L) | (Float.floatToRawIntBits(RAsUl2FVSrh6) << 32);
        if (W7ceZOzvrRuI()) {
            long floatToRawIntBits2 = (Float.floatToRawIntBits(!fkblLSN2bAgv(this.VhhvGxCb8gfr.Y1f8riQaR6yg()) ? Float.intBitsToFloat((int) (floatToRawIntBits >> 32)) : Float.intBitsToFloat((int) (this.VhhvGxCb8gfr.Y1f8riQaR6yg() >> 32))) << 32) | (Float.floatToRawIntBits(!X1HMmH2Ks65g(this.VhhvGxCb8gfr.Y1f8riQaR6yg()) ? Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)) : Float.intBitsToFloat((int) (this.VhhvGxCb8gfr.Y1f8riQaR6yg() & 4294967295L))) & 4294967295L);
            if (Float.intBitsToFloat((int) (floatToRawIntBits >> 32)) == 0.0f || Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)) == 0.0f) {
                a62.Companion.getClass();
                floatToRawIntBits = 0;
            } else {
                floatToRawIntBits = ng0.J54yh1s3n4Aq(floatToRawIntBits2, this.pnx5pC0XzaCw.x50lh2ztY7Y5(floatToRawIntBits2, floatToRawIntBits));
            }
        }
        return rr.PxuCJdSBwIXG(j, sr.RAsUl2FVSrh6(Math.round(Float.intBitsToFloat((int) (floatToRawIntBits >> 32))), j), 0, sr.a92UlCVFR9N8(Math.round(Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L))), j), 0, 10);
    }

    @Override // defpackage.kw0
    public final k51 e9gEMXR7LXtO(l51 l51Var, e51 e51Var, long j) {
        em1 e9gEMXR7LXtO = e51Var.e9gEMXR7LXtO(Yadk4uqlxLy8(j));
        return l51Var.jJwa0q7P5wHq(e9gEMXR7LXtO.rtx2ld2ELZv4, e9gEMXR7LXtO.OPXfSBeufaJ8, q50.rtx2ld2ELZv4, new d1(e9gEMXR7LXtO, 4));
    }

    @Override // defpackage.kw0
    public final int i68hK7ahKtgp(u31 u31Var, e51 e51Var, int i) {
        if (!W7ceZOzvrRuI()) {
            return e51Var.i68hK7ahKtgp(i);
        }
        long Yadk4uqlxLy8 = Yadk4uqlxLy8(sr.lS5Rgt96tfkO(0, 0, 0, i, 7));
        return Math.max(rr.wdg6QnbFHrFF(Yadk4uqlxLy8), e51Var.i68hK7ahKtgp(i));
    }

    @Override // defpackage.kw0
    public final int kpCQ9veP6n3I(u31 u31Var, e51 e51Var, int i) {
        if (!W7ceZOzvrRuI()) {
            return e51Var.ngxnMNrpiKat(i);
        }
        long Yadk4uqlxLy8 = Yadk4uqlxLy8(sr.lS5Rgt96tfkO(0, i, 0, 0, 13));
        return Math.max(rr.OPXfSBeufaJ8(Yadk4uqlxLy8), e51Var.ngxnMNrpiKat(i));
    }

    @Override // defpackage.m61
    public final boolean mFd1aGiJX24N() {
        return false;
    }

    public final String toString() {
        return "PainterModifier(painter=" + this.VhhvGxCb8gfr + ", sizeToIntrinsics=" + this.S2OOm9zPNm0h + ", alignment=" + this.ZbWwgt3aGe7A + ", alpha=" + this.IAToe7bXGz4N + ", colorFilter=" + this.e6tOsSdd2EFb + ')';
    }
}
