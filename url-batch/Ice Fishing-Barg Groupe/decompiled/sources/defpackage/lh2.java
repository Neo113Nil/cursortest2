package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class lh2 extends m61 implements aq, kw0 {
    public cn2 S2OOm9zPNm0h;
    public final dj2 VhhvGxCb8gfr;
    public jh2 ZbWwgt3aGe7A;

    public lh2(dj2 dj2Var) {
        this.VhhvGxCb8gfr = dj2Var;
    }

    @Override // defpackage.m61
    public final void IxJ9cAW40yOk() {
        this.S2OOm9zPNm0h = null;
        this.ZbWwgt3aGe7A = null;
    }

    @Override // defpackage.m61
    public final void OYiFbU3x63rc() {
        dj2 ozEBbv0hFTAB = th0.ozEBbv0hFTAB(this.VhhvGxCb8gfr, zv.zf8DYfih6EZu(this).BjEWd04qc7Mw);
        ob0 ob0Var = (ob0) f2.QrzZRwfaDlRX(this, eq.dgRBjINgWbAK);
        W7ceZOzvrRuI(ozEBbv0hFTAB, ob0Var);
        cw0 cw0Var = zv.zf8DYfih6EZu(this).BjEWd04qc7Mw;
        hy hyVar = zv.zf8DYfih6EZu(this).rZjpSjn4zoMv;
        cn2 cn2Var = this.S2OOm9zPNm0h;
        if (cn2Var != null) {
            this.ZbWwgt3aGe7A = new jh2(cw0Var, hyVar, ob0Var, ozEBbv0hFTAB, cn2Var.getValue());
        } else {
            hp0.lS5Rgt96tfkO("Font resolution state is not set.");
            u9.Y1f8riQaR6yg();
        }
    }

    @Override // defpackage.tx, defpackage.do1
    public final void PxuCJdSBwIXG() {
        jh2 jh2Var = this.ZbWwgt3aGe7A;
        if (jh2Var != null) {
            jh2.PxuCJdSBwIXG(jh2Var, null, zv.zf8DYfih6EZu(this).rZjpSjn4zoMv, null, 29);
        }
        ng0.e6tOsSdd2EFb(this);
    }

    public final void W7ceZOzvrRuI(dj2 dj2Var, ob0 ob0Var) {
        int i;
        int i2;
        q82 q82Var = dj2Var.PxuCJdSBwIXG;
        pb0 pb0Var = q82Var.a92UlCVFR9N8;
        xc0 xc0Var = q82Var.TSizfFm2Yiuu;
        if (xc0Var == null) {
            xc0.Companion.getClass();
            xc0Var = xc0.x50lh2ztY7Y5;
        }
        rc0 rc0Var = q82Var.Y1f8riQaR6yg;
        if (rc0Var != null) {
            i = rc0Var.PxuCJdSBwIXG;
        } else {
            rc0.Companion.getClass();
            i = 0;
        }
        tc0 tc0Var = q82Var.e9gEMXR7LXtO;
        if (tc0Var != null) {
            i2 = tc0Var.PxuCJdSBwIXG;
        } else {
            tc0.Companion.getClass();
            i2 = 65535;
        }
        this.S2OOm9zPNm0h = ((qb0) ob0Var).lS5Rgt96tfkO(pb0Var, xc0Var, i, i2);
        ng0.e6tOsSdd2EFb(this);
    }

    @Override // defpackage.kw0
    public final k51 e9gEMXR7LXtO(l51 l51Var, e51 e51Var, long j) {
        long PxuCJdSBwIXG;
        jh2 jh2Var = this.ZbWwgt3aGe7A;
        if (jh2Var == null) {
            hp0.lS5Rgt96tfkO("Min size state is not set.");
            u9.Y1f8riQaR6yg();
            return null;
        }
        mj1 mj1Var = jh2Var.a92UlCVFR9N8;
        cn2 cn2Var = this.S2OOm9zPNm0h;
        if (cn2Var == null) {
            hp0.lS5Rgt96tfkO("Font resolution state is not set.");
            u9.Y1f8riQaR6yg();
            return null;
        }
        Object value = cn2Var.getValue();
        if (!cs0.wdg6QnbFHrFF(value, jh2Var.e9gEMXR7LXtO)) {
            jh2Var.e9gEMXR7LXtO = value;
            mj1Var.setValue(Boolean.TRUE);
        }
        if (((Boolean) mj1Var.getValue()).booleanValue()) {
            PxuCJdSBwIXG = vf2.PxuCJdSBwIXG(jh2Var.Y1f8riQaR6yg, jh2Var.lS5Rgt96tfkO, jh2Var.TSizfFm2Yiuu, vf2.PxuCJdSBwIXG, 1);
            jh2Var.RAsUl2FVSrh6 = PxuCJdSBwIXG;
            mj1Var.setValue(Boolean.FALSE);
        }
        long j2 = jh2Var.RAsUl2FVSrh6;
        em1 e9gEMXR7LXtO = e51Var.e9gEMXR7LXtO(sr.e9gEMXR7LXtO(j, sr.lS5Rgt96tfkO((int) (j2 >> 32), 0, (int) (j2 & 4294967295L), 0, 10)));
        return l51Var.jJwa0q7P5wHq(e9gEMXR7LXtO.rtx2ld2ELZv4, e9gEMXR7LXtO.OPXfSBeufaJ8, q50.rtx2ld2ELZv4, new pa(e9gEMXR7LXtO, 8));
    }

    @Override // defpackage.tx
    public final void iSxsmagYqzHM() {
        jh2 jh2Var = this.ZbWwgt3aGe7A;
        if (jh2Var != null) {
            jh2.PxuCJdSBwIXG(jh2Var, zv.zf8DYfih6EZu(this).BjEWd04qc7Mw, null, null, 30);
        }
        ng0.e6tOsSdd2EFb(this);
    }

    @Override // defpackage.m61
    public final boolean mFd1aGiJX24N() {
        return false;
    }
}
