package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class jc1 {
    public jh0 PxuCJdSBwIXG;
    public hc1 TSizfFm2Yiuu;
    public boolean lS5Rgt96tfkO;

    public abstract void PxuCJdSBwIXG();

    public abstract void TSizfFm2Yiuu(fc1 fc1Var);

    public abstract void Y1f8riQaR6yg(fc1 fc1Var);

    public final void a92UlCVFR9N8(boolean z) {
        mc1 mc1Var;
        if (this.lS5Rgt96tfkO == z) {
            return;
        }
        this.lS5Rgt96tfkO = z;
        hc1 hc1Var = this.TSizfFm2Yiuu;
        if (hc1Var == null || (mc1Var = hc1Var.lS5Rgt96tfkO) == null) {
            return;
        }
        mc1Var.lS5Rgt96tfkO();
    }

    public final void e9gEMXR7LXtO() {
        hc1 hc1Var = this.TSizfFm2Yiuu;
        if (hc1Var == null || !hc1Var.TSizfFm2Yiuu.remove(this)) {
            return;
        }
        mc1 mc1Var = hc1Var.lS5Rgt96tfkO;
        mc1Var.getClass();
        if (equals(mc1Var.a92UlCVFR9N8)) {
            if (mc1Var.RAsUl2FVSrh6 == -1) {
                PxuCJdSBwIXG();
            }
            mc1Var.a92UlCVFR9N8 = null;
            mc1Var.RAsUl2FVSrh6 = 0;
            mc1Var.rtx2ld2ELZv4 = null;
        }
        mc1Var.Y1f8riQaR6yg.remove(this);
        mc1Var.e9gEMXR7LXtO.remove(this);
        this.TSizfFm2Yiuu = null;
        mc1Var.lS5Rgt96tfkO();
    }

    public abstract void lS5Rgt96tfkO();
}
