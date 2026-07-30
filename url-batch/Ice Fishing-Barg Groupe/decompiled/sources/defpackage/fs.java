package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class fs extends m61 implements aq, m51 {
    public final l12 S2OOm9zPNm0h;
    public th1 VhhvGxCb8gfr;
    public boolean ZbWwgt3aGe7A;
    public boolean aF05bpZJlKEP;
    public boolean e6tOsSdd2EFb;
    public final z02 pnx5pC0XzaCw;
    public final ef IAToe7bXGz4N = new ef(0);
    public long jyegZNwi31qc = -1;

    public fs(th1 th1Var, l12 l12Var, boolean z, z02 z02Var) {
        this.VhhvGxCb8gfr = th1Var;
        this.S2OOm9zPNm0h = l12Var;
        this.ZbWwgt3aGe7A = z;
        this.pnx5pC0XzaCw = z02Var;
    }

    public static final float W7ceZOzvrRuI(fs fsVar, pf pfVar, long j) {
        float f;
        qt1 qt1Var;
        int compare;
        long j2 = fsVar.jyegZNwi31qc;
        f91 f91Var = fsVar.IAToe7bXGz4N.PxuCJdSBwIXG;
        int i = f91Var.wdg6QnbFHrFF - 1;
        Object[] objArr = f91Var.rtx2ld2ELZv4;
        if (i < objArr.length) {
            qt1Var = null;
            while (true) {
                if (i < 0) {
                    f = 0.0f;
                    break;
                }
                qt1 qt1Var2 = (qt1) ((cs) objArr[i]).PxuCJdSBwIXG.PxuCJdSBwIXG();
                if (qt1Var2 != null) {
                    long TSizfFm2Yiuu = qt1Var2.TSizfFm2Yiuu();
                    long gGoUzNp9JO5I = kj0.gGoUzNp9JO5I(fsVar.X1HMmH2Ks65g());
                    f = 0.0f;
                    int ordinal = fsVar.VhhvGxCb8gfr.ordinal();
                    if (ordinal == 0) {
                        compare = Float.compare(Float.intBitsToFloat((int) (TSizfFm2Yiuu & 4294967295L)), Float.intBitsToFloat((int) (gGoUzNp9JO5I & 4294967295L)));
                    } else {
                        if (ordinal != 1) {
                            u9.gPXPFXrUH4XX();
                            return 0.0f;
                        }
                        compare = Float.compare(Float.intBitsToFloat((int) (TSizfFm2Yiuu >> 32)), Float.intBitsToFloat((int) (gGoUzNp9JO5I >> 32)));
                    }
                    if (compare <= 0) {
                        qt1Var = qt1Var2;
                    } else if (qt1Var == null) {
                        qt1Var = qt1Var2;
                    }
                }
                i--;
            }
        } else {
            f = 0.0f;
            qt1Var = null;
        }
        if (qt1Var == null) {
            qt1 qt1Var3 = fsVar.e6tOsSdd2EFb ? (qt1) fsVar.pnx5pC0XzaCw.PxuCJdSBwIXG() : null;
            if (qt1Var3 == null) {
                return f;
            }
            qt1Var = qt1Var3;
        }
        long gGoUzNp9JO5I2 = kj0.gGoUzNp9JO5I(j2);
        int ordinal2 = fsVar.VhhvGxCb8gfr.ordinal();
        if (ordinal2 == 0) {
            float f2 = qt1Var.lS5Rgt96tfkO;
            return pfVar.PxuCJdSBwIXG(f2 - ((int) (j & 4294967295L)), qt1Var.Y1f8riQaR6yg - f2, Float.intBitsToFloat((int) (gGoUzNp9JO5I2 & 4294967295L)));
        }
        if (ordinal2 == 1) {
            float f3 = qt1Var.PxuCJdSBwIXG;
            return pfVar.PxuCJdSBwIXG(f3 - ((int) (j >> 32)), qt1Var.TSizfFm2Yiuu - f3, Float.intBitsToFloat((int) (gGoUzNp9JO5I2 >> 32)));
        }
        u9.gPXPFXrUH4XX();
        return f;
    }

    public static boolean fkblLSN2bAgv(fs fsVar, qt1 qt1Var, long j, long j2, int i) {
        if ((i & 1) != 0) {
            j = fsVar.X1HMmH2Ks65g();
        }
        long j3 = j;
        if ((i & 2) != 0) {
            wq0.Companion.getClass();
            j2 = 0;
        }
        long MDTGUQSX7PXD = fsVar.MDTGUQSX7PXD(qt1Var, j3, j2);
        return Math.abs(Float.intBitsToFloat((int) (MDTGUQSX7PXD >> 32))) <= 0.5f && Math.abs(Float.intBitsToFloat((int) (MDTGUQSX7PXD & 4294967295L))) <= 0.5f;
    }

    public final long MDTGUQSX7PXD(qt1 qt1Var, long j, long j2) {
        long gGoUzNp9JO5I = kj0.gGoUzNp9JO5I(j);
        int ordinal = this.VhhvGxCb8gfr.ordinal();
        if (ordinal == 0) {
            pf pfVar = (pf) f2.QrzZRwfaDlRX(this, rf.PxuCJdSBwIXG);
            float f = qt1Var.lS5Rgt96tfkO;
            float PxuCJdSBwIXG = pfVar.PxuCJdSBwIXG(f - ((int) (j2 & 4294967295L)), qt1Var.Y1f8riQaR6yg - f, Float.intBitsToFloat((int) (gGoUzNp9JO5I & 4294967295L)));
            return (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(PxuCJdSBwIXG) & 4294967295L);
        }
        if (ordinal != 1) {
            u9.gPXPFXrUH4XX();
            return 0L;
        }
        pf pfVar2 = (pf) f2.QrzZRwfaDlRX(this, rf.PxuCJdSBwIXG);
        float f2 = qt1Var.PxuCJdSBwIXG;
        return (Float.floatToRawIntBits(pfVar2.PxuCJdSBwIXG(f2 - ((int) (j2 >> 32)), qt1Var.TSizfFm2Yiuu - f2, Float.intBitsToFloat((int) (gGoUzNp9JO5I >> 32)))) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L);
    }

    @Override // defpackage.m51
    public final void TSizfFm2Yiuu(long j) {
        int gPXPFXrUH4XX;
        long j2;
        long X1HMmH2Ks65g = X1HMmH2Ks65g();
        this.jyegZNwi31qc = j;
        int ordinal = this.VhhvGxCb8gfr.ordinal();
        if (ordinal == 0) {
            gPXPFXrUH4XX = cs0.gPXPFXrUH4XX((int) (j & 4294967295L), (int) (X1HMmH2Ks65g & 4294967295L));
        } else {
            if (ordinal != 1) {
                u9.gPXPFXrUH4XX();
                return;
            }
            gPXPFXrUH4XX = cs0.gPXPFXrUH4XX((int) (j >> 32), (int) (X1HMmH2Ks65g >> 32));
        }
        if (gPXPFXrUH4XX >= 0) {
            return;
        }
        if (this.ZbWwgt3aGe7A) {
            wq0.Companion.getClass();
            j2 = 0;
        } else {
            j2 = this.VhhvGxCb8gfr == th1.rtx2ld2ELZv4 ? (((int) (X1HMmH2Ks65g & 4294967295L)) - ((int) (j & 4294967295L))) & 4294967295L : (((int) (X1HMmH2Ks65g >> 32)) - ((int) (j >> 32))) << 32;
        }
        long j3 = j2;
        qt1 qt1Var = (qt1) this.pnx5pC0XzaCw.PxuCJdSBwIXG();
        if (qt1Var == null || this.aF05bpZJlKEP || this.e6tOsSdd2EFb || !fkblLSN2bAgv(this, qt1Var, X1HMmH2Ks65g, 0L, 2) || fkblLSN2bAgv(this, qt1Var, 0L, j3, 1)) {
            return;
        }
        this.e6tOsSdd2EFb = true;
        Yadk4uqlxLy8(j3);
    }

    public final long X1HMmH2Ks65g() {
        long j = this.jyegZNwi31qc;
        if (!ir0.PxuCJdSBwIXG(j, -1L)) {
            return j;
        }
        ir0.Companion.getClass();
        return 0L;
    }

    public final void Yadk4uqlxLy8(long j) {
        fq fqVar = rf.PxuCJdSBwIXG;
        pf pfVar = (pf) f2.QrzZRwfaDlRX(this, fqVar);
        if (this.aF05bpZJlKEP) {
            hp0.TSizfFm2Yiuu("launchAnimation called when previous animation was running");
        }
        ((pf) f2.QrzZRwfaDlRX(this, fqVar)).getClass();
        pf.Companion.getClass();
        fx1.KUoIVIumpKat(GlTbNTgfSMqy(), null, new es(this, new bp2(of.lS5Rgt96tfkO), pfVar, j, null), 1);
    }

    @Override // defpackage.m61
    public final boolean mFd1aGiJX24N() {
        return false;
    }
}
