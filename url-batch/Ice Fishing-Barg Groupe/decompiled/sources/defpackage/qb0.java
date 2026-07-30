package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class qb0 implements ob0 {
    public final q3 PxuCJdSBwIXG;
    public final cr1 TSizfFm2Yiuu;
    public final wb0 Y1f8riQaR6yg;
    public final r3s1LDPKFs1S a92UlCVFR9N8;
    public final i2 e9gEMXR7LXtO;
    public final r3 lS5Rgt96tfkO;

    public qb0(q3 q3Var, r3 r3Var) {
        cr1 cr1Var = rb0.PxuCJdSBwIXG;
        wb0 wb0Var = new wb0(rb0.lS5Rgt96tfkO);
        i2 i2Var = new i2(22, (byte) 0);
        this.PxuCJdSBwIXG = q3Var;
        this.lS5Rgt96tfkO = r3Var;
        this.TSizfFm2Yiuu = cr1Var;
        this.Y1f8riQaR6yg = wb0Var;
        this.e9gEMXR7LXtO = i2Var;
        this.a92UlCVFR9N8 = new r3s1LDPKFs1S(11, this);
    }

    public final cn2 PxuCJdSBwIXG(zm2 zm2Var) {
        cr1 cr1Var = this.TSizfFm2Yiuu;
        e9gEMXR7LXtO e9gemxr7lxto = new e9gEMXR7LXtO(11, this, zm2Var);
        synchronized (((ib0) cr1Var.OPXfSBeufaJ8)) {
            cn2 cn2Var = (cn2) ((b41) cr1Var.wdg6QnbFHrFF).TSizfFm2Yiuu(zm2Var);
            if (cn2Var != null) {
                if (cn2Var.TSizfFm2Yiuu()) {
                    return cn2Var;
                }
            }
            try {
                cn2 cn2Var2 = (cn2) e9gemxr7lxto.OPXfSBeufaJ8(new xf2(9, cr1Var, zm2Var));
                synchronized (((ib0) cr1Var.OPXfSBeufaJ8)) {
                    if (((b41) cr1Var.wdg6QnbFHrFF).TSizfFm2Yiuu(zm2Var) == null && cn2Var2.TSizfFm2Yiuu()) {
                        ((b41) cr1Var.wdg6QnbFHrFF).Y1f8riQaR6yg(zm2Var, cn2Var2);
                    }
                }
                return cn2Var2;
            } catch (Exception e) {
                throw new IllegalStateException("Could not load font", e);
            }
        }
    }

    public final cn2 lS5Rgt96tfkO(pb0 pb0Var, xc0 xc0Var, int i, int i2) {
        r3 r3Var = this.lS5Rgt96tfkO;
        r3Var.getClass();
        int i3 = r3Var.rtx2ld2ELZv4;
        xc0 xc0Var2 = (i3 == 0 || i3 == Integer.MAX_VALUE) ? xc0Var : new xc0(ng0.wdg6QnbFHrFF(xc0Var.rtx2ld2ELZv4 + i3, 1, 1000));
        this.PxuCJdSBwIXG.getClass();
        return PxuCJdSBwIXG(new zm2(pb0Var, xc0Var2, i, i2, null));
    }
}
