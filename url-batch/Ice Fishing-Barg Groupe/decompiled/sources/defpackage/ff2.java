package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
final class ff2 extends r61 {
    public final cr1 PxuCJdSBwIXG;
    public final xg2 TSizfFm2Yiuu;
    public final rt Y1f8riQaR6yg;
    public final wg2 lS5Rgt96tfkO;

    public ff2(cr1 cr1Var, wg2 wg2Var, xg2 xg2Var, rt rtVar) {
        this.PxuCJdSBwIXG = cr1Var;
        this.lS5Rgt96tfkO = wg2Var;
        this.TSizfFm2Yiuu = xg2Var;
        this.Y1f8riQaR6yg = rtVar;
    }

    @Override // defpackage.r61
    public final m61 Y1f8riQaR6yg() {
        return new gf2(this.PxuCJdSBwIXG, this.lS5Rgt96tfkO, this.TSizfFm2Yiuu, this.Y1f8riQaR6yg);
    }

    @Override // defpackage.r61
    public final void a92UlCVFR9N8(m61 m61Var) {
        gf2 gf2Var = (gf2) m61Var;
        gf2Var.ZbWwgt3aGe7A.OPXfSBeufaJ8 = null;
        cr1 cr1Var = this.PxuCJdSBwIXG;
        gf2Var.ZbWwgt3aGe7A = cr1Var;
        cr1Var.OPXfSBeufaJ8 = gf2Var;
        cr1Var.wdg6QnbFHrFF = gf2Var.S9EYkSpbGuxq ? fk2.wdg6QnbFHrFF : fk2.OPXfSBeufaJ8;
        gf2Var.pnx5pC0XzaCw = this.lS5Rgt96tfkO;
        gf2Var.IAToe7bXGz4N = this.TSizfFm2Yiuu;
        gf2Var.e6tOsSdd2EFb = this.Y1f8riQaR6yg;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ff2)) {
            return false;
        }
        ff2 ff2Var = (ff2) obj;
        return this.PxuCJdSBwIXG == ff2Var.PxuCJdSBwIXG && this.lS5Rgt96tfkO == ff2Var.lS5Rgt96tfkO && this.TSizfFm2Yiuu == ff2Var.TSizfFm2Yiuu && this.Y1f8riQaR6yg == ff2Var.Y1f8riQaR6yg;
    }

    public final int hashCode() {
        return this.Y1f8riQaR6yg.hashCode() + ((this.TSizfFm2Yiuu.hashCode() + ((this.lS5Rgt96tfkO.hashCode() + (this.PxuCJdSBwIXG.hashCode() * 31)) * 31)) * 31);
    }
}
