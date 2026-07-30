package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class aw implements e8 {
    public final e0 PxuCJdSBwIXG;
    public final Object RAsUl2FVSrh6;
    public final Object TSizfFm2Yiuu;
    public final o8 Y1f8riQaR6yg;
    public final o8 a92UlCVFR9N8;
    public final o8 e9gEMXR7LXtO;
    public final lm2 lS5Rgt96tfkO;
    public final long rtx2ld2ELZv4;

    public aw(bw bwVar, lm2 lm2Var, Object obj, o8 o8Var) {
        e0 e0Var = new e0(10, bwVar.PxuCJdSBwIXG);
        this.PxuCJdSBwIXG = e0Var;
        this.lS5Rgt96tfkO = lm2Var;
        this.TSizfFm2Yiuu = obj;
        o8 o8Var2 = (o8) lm2Var.PxuCJdSBwIXG.OPXfSBeufaJ8(obj);
        this.Y1f8riQaR6yg = o8Var2;
        this.e9gEMXR7LXtO = mm2.aF05bpZJlKEP(o8Var);
        le0 le0Var = lm2Var.lS5Rgt96tfkO;
        if (((o8) e0Var.x50lh2ztY7Y5) == null) {
            e0Var.x50lh2ztY7Y5 = o8Var2.TSizfFm2Yiuu();
        }
        o8 o8Var3 = (o8) e0Var.x50lh2ztY7Y5;
        if (o8Var3 == null) {
            cs0.tmVwIGCQF4zR("targetVector");
            throw null;
        }
        int lS5Rgt96tfkO = o8Var3.lS5Rgt96tfkO();
        int i = 0;
        while (true) {
            o8 o8Var4 = (o8) e0Var.x50lh2ztY7Y5;
            if (i >= lS5Rgt96tfkO) {
                if (o8Var4 == null) {
                    cs0.tmVwIGCQF4zR("targetVector");
                    throw null;
                }
                this.RAsUl2FVSrh6 = le0Var.OPXfSBeufaJ8(o8Var4);
                e0 e0Var2 = this.PxuCJdSBwIXG;
                o8 o8Var5 = this.Y1f8riQaR6yg;
                if (((o8) e0Var2.dgRBjINgWbAK) == null) {
                    e0Var2.dgRBjINgWbAK = o8Var5.TSizfFm2Yiuu();
                }
                o8 o8Var6 = (o8) e0Var2.dgRBjINgWbAK;
                if (o8Var6 == null) {
                    cs0.tmVwIGCQF4zR("velocityVector");
                    throw null;
                }
                int lS5Rgt96tfkO2 = o8Var6.lS5Rgt96tfkO();
                long j = 0;
                for (int i2 = 0; i2 < lS5Rgt96tfkO2; i2++) {
                    b42 b42Var = (b42) e0Var2.OPXfSBeufaJ8;
                    o8Var5.getClass();
                    j = Math.max(j, ((long) (Math.exp(((i80) b42Var.OPXfSBeufaJ8).lS5Rgt96tfkO(o8Var.PxuCJdSBwIXG(i2)) / (j80.PxuCJdSBwIXG - 1.0d)) * 1000.0d)) * 1000000);
                }
                this.rtx2ld2ELZv4 = j;
                o8 aF05bpZJlKEP = mm2.aF05bpZJlKEP(this.PxuCJdSBwIXG.OPXfSBeufaJ8(j, this.Y1f8riQaR6yg, o8Var));
                this.a92UlCVFR9N8 = aF05bpZJlKEP;
                int lS5Rgt96tfkO3 = aF05bpZJlKEP.lS5Rgt96tfkO();
                for (int i3 = 0; i3 < lS5Rgt96tfkO3; i3++) {
                    o8 o8Var7 = this.a92UlCVFR9N8;
                    float PxuCJdSBwIXG = o8Var7.PxuCJdSBwIXG(i3);
                    this.PxuCJdSBwIXG.getClass();
                    this.PxuCJdSBwIXG.getClass();
                    o8Var7.e9gEMXR7LXtO(ng0.OPXfSBeufaJ8(PxuCJdSBwIXG, -0.0f, 0.0f), i3);
                }
                return;
            }
            if (o8Var4 == null) {
                cs0.tmVwIGCQF4zR("targetVector");
                throw null;
            }
            b42 b42Var2 = (b42) e0Var.OPXfSBeufaJ8;
            float PxuCJdSBwIXG2 = o8Var2.PxuCJdSBwIXG(i);
            float PxuCJdSBwIXG3 = o8Var.PxuCJdSBwIXG(i);
            double lS5Rgt96tfkO4 = ((i80) b42Var2.OPXfSBeufaJ8).lS5Rgt96tfkO(PxuCJdSBwIXG3);
            double d = j80.PxuCJdSBwIXG;
            int i4 = i;
            o8Var4.e9gEMXR7LXtO((Math.signum(PxuCJdSBwIXG3) * ((float) (Math.exp((d / (d - 1.0d)) * lS5Rgt96tfkO4) * r13.PxuCJdSBwIXG * r13.lS5Rgt96tfkO))) + PxuCJdSBwIXG2, i4);
            i = i4 + 1;
        }
    }

    @Override // defpackage.e8
    public final boolean PxuCJdSBwIXG() {
        return false;
    }

    @Override // defpackage.e8
    public final long TSizfFm2Yiuu() {
        return this.rtx2ld2ELZv4;
    }

    @Override // defpackage.e8
    public final lm2 Y1f8riQaR6yg() {
        return this.lS5Rgt96tfkO;
    }

    @Override // defpackage.e8
    public final o8 a92UlCVFR9N8(long j) {
        if (RAsUl2FVSrh6(j)) {
            return this.a92UlCVFR9N8;
        }
        return this.PxuCJdSBwIXG.OPXfSBeufaJ8(j, this.Y1f8riQaR6yg, this.e9gEMXR7LXtO);
    }

    @Override // defpackage.e8
    public final Object e9gEMXR7LXtO() {
        return this.RAsUl2FVSrh6;
    }

    @Override // defpackage.e8
    public final Object lS5Rgt96tfkO(long j) {
        if (RAsUl2FVSrh6(j)) {
            return this.RAsUl2FVSrh6;
        }
        le0 le0Var = this.lS5Rgt96tfkO.lS5Rgt96tfkO;
        e0 e0Var = this.PxuCJdSBwIXG;
        o8 o8Var = (o8) e0Var.wdg6QnbFHrFF;
        o8 o8Var2 = this.Y1f8riQaR6yg;
        if (o8Var == null) {
            e0Var.wdg6QnbFHrFF = o8Var2.TSizfFm2Yiuu();
        }
        o8 o8Var3 = (o8) e0Var.wdg6QnbFHrFF;
        if (o8Var3 == null) {
            cs0.tmVwIGCQF4zR("valueVector");
            throw null;
        }
        int lS5Rgt96tfkO = o8Var3.lS5Rgt96tfkO();
        int i = 0;
        while (true) {
            o8 o8Var4 = (o8) e0Var.wdg6QnbFHrFF;
            if (i >= lS5Rgt96tfkO) {
                if (o8Var4 != null) {
                    return le0Var.OPXfSBeufaJ8(o8Var4);
                }
                cs0.tmVwIGCQF4zR("valueVector");
                throw null;
            }
            if (o8Var4 == null) {
                cs0.tmVwIGCQF4zR("valueVector");
                throw null;
            }
            b42 b42Var = (b42) e0Var.OPXfSBeufaJ8;
            float PxuCJdSBwIXG = o8Var2.PxuCJdSBwIXG(i);
            long j2 = j / 1000000;
            h80 PxuCJdSBwIXG2 = ((i80) b42Var.OPXfSBeufaJ8).PxuCJdSBwIXG(this.e9gEMXR7LXtO.PxuCJdSBwIXG(i));
            long j3 = PxuCJdSBwIXG2.TSizfFm2Yiuu;
            o8Var4.e9gEMXR7LXtO((Math.signum(PxuCJdSBwIXG2.PxuCJdSBwIXG) * PxuCJdSBwIXG2.lS5Rgt96tfkO * p3.PxuCJdSBwIXG(j3 > 0 ? j2 / j3 : 1.0f).PxuCJdSBwIXG) + PxuCJdSBwIXG, i);
            i++;
        }
    }
}
