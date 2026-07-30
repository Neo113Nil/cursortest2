package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class sd2 implements e8 {
    public o8 OPXfSBeufaJ8;
    public final sp2 PxuCJdSBwIXG;
    public final o8 RAsUl2FVSrh6;
    public Object TSizfFm2Yiuu;
    public Object Y1f8riQaR6yg;
    public o8 a92UlCVFR9N8;
    public o8 e9gEMXR7LXtO;
    public final lm2 lS5Rgt96tfkO;
    public long rtx2ld2ELZv4;

    public sd2(i8 i8Var, lm2 lm2Var, Object obj, Object obj2, o8 o8Var) {
        this.PxuCJdSBwIXG = i8Var.PxuCJdSBwIXG(lm2Var);
        this.lS5Rgt96tfkO = lm2Var;
        this.TSizfFm2Yiuu = obj2;
        this.Y1f8riQaR6yg = obj;
        this.e9gEMXR7LXtO = (o8) lm2Var.PxuCJdSBwIXG.OPXfSBeufaJ8(obj);
        le0 le0Var = lm2Var.PxuCJdSBwIXG;
        this.a92UlCVFR9N8 = (o8) le0Var.OPXfSBeufaJ8(obj2);
        this.RAsUl2FVSrh6 = o8Var != null ? mm2.aF05bpZJlKEP(o8Var) : ((o8) le0Var.OPXfSBeufaJ8(obj)).TSizfFm2Yiuu();
        this.rtx2ld2ELZv4 = -1L;
    }

    public final void OPXfSBeufaJ8(Object obj) {
        if (cs0.wdg6QnbFHrFF(this.TSizfFm2Yiuu, obj)) {
            return;
        }
        this.TSizfFm2Yiuu = obj;
        this.a92UlCVFR9N8 = (o8) this.lS5Rgt96tfkO.PxuCJdSBwIXG.OPXfSBeufaJ8(obj);
        this.OPXfSBeufaJ8 = null;
        this.rtx2ld2ELZv4 = -1L;
    }

    @Override // defpackage.e8
    public final boolean PxuCJdSBwIXG() {
        return this.PxuCJdSBwIXG.PxuCJdSBwIXG();
    }

    @Override // defpackage.e8
    public final long TSizfFm2Yiuu() {
        if (this.rtx2ld2ELZv4 < 0) {
            this.rtx2ld2ELZv4 = this.PxuCJdSBwIXG.lS5Rgt96tfkO(this.e9gEMXR7LXtO, this.a92UlCVFR9N8, this.RAsUl2FVSrh6);
        }
        return this.rtx2ld2ELZv4;
    }

    @Override // defpackage.e8
    public final lm2 Y1f8riQaR6yg() {
        return this.lS5Rgt96tfkO;
    }

    @Override // defpackage.e8
    public final o8 a92UlCVFR9N8(long j) {
        if (!RAsUl2FVSrh6(j)) {
            return this.PxuCJdSBwIXG.x50lh2ztY7Y5(j, this.e9gEMXR7LXtO, this.a92UlCVFR9N8, this.RAsUl2FVSrh6);
        }
        o8 o8Var = this.OPXfSBeufaJ8;
        if (o8Var != null) {
            return o8Var;
        }
        o8 gPXPFXrUH4XX = this.PxuCJdSBwIXG.gPXPFXrUH4XX(this.e9gEMXR7LXtO, this.a92UlCVFR9N8, this.RAsUl2FVSrh6);
        this.OPXfSBeufaJ8 = gPXPFXrUH4XX;
        return gPXPFXrUH4XX;
    }

    @Override // defpackage.e8
    public final Object e9gEMXR7LXtO() {
        return this.TSizfFm2Yiuu;
    }

    @Override // defpackage.e8
    public final Object lS5Rgt96tfkO(long j) {
        if (RAsUl2FVSrh6(j)) {
            return this.TSizfFm2Yiuu;
        }
        o8 QrzZRwfaDlRX = this.PxuCJdSBwIXG.QrzZRwfaDlRX(j, this.e9gEMXR7LXtO, this.a92UlCVFR9N8, this.RAsUl2FVSrh6);
        int lS5Rgt96tfkO = QrzZRwfaDlRX.lS5Rgt96tfkO();
        for (int i = 0; i < lS5Rgt96tfkO; i++) {
            if (Float.isNaN(QrzZRwfaDlRX.PxuCJdSBwIXG(i))) {
                ip1.lS5Rgt96tfkO("AnimationVector cannot contain a NaN. " + QrzZRwfaDlRX + ". Animation: " + this + ", playTimeNanos: " + j);
            }
        }
        return this.lS5Rgt96tfkO.lS5Rgt96tfkO.OPXfSBeufaJ8(QrzZRwfaDlRX);
    }

    public final void rtx2ld2ELZv4(Object obj) {
        if (cs0.wdg6QnbFHrFF(obj, this.Y1f8riQaR6yg)) {
            return;
        }
        this.Y1f8riQaR6yg = obj;
        this.e9gEMXR7LXtO = (o8) this.lS5Rgt96tfkO.PxuCJdSBwIXG.OPXfSBeufaJ8(obj);
        this.OPXfSBeufaJ8 = null;
        this.rtx2ld2ELZv4 = -1L;
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.Y1f8riQaR6yg + " -> " + this.TSizfFm2Yiuu + ",initial velocity: " + this.RAsUl2FVSrh6 + ", duration: " + (TSizfFm2Yiuu() / 1000000) + " ms,animationSpec: " + this.PxuCJdSBwIXG;
    }
}
