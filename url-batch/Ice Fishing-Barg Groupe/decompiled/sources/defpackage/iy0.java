package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class iy0 {
    public final Object PxuCJdSBwIXG;
    public int Y1f8riQaR6yg;
    public boolean a92UlCVFR9N8;
    public iy0 e9gEMXR7LXtO;
    public final ky0 lS5Rgt96tfkO;
    public int TSizfFm2Yiuu = -1;
    public final mj1 RAsUl2FVSrh6 = sj0.tmVwIGCQF4zR(null);

    public iy0(Object obj, ky0 ky0Var) {
        this.PxuCJdSBwIXG = obj;
        this.lS5Rgt96tfkO = ky0Var;
    }

    public final iy0 PxuCJdSBwIXG() {
        if (this.a92UlCVFR9N8) {
            hp0.TSizfFm2Yiuu("Pin should not be called on an already disposed item ");
        }
        if (this.Y1f8riQaR6yg == 0) {
            this.lS5Rgt96tfkO.rtx2ld2ELZv4.add(this);
            iy0 iy0Var = (iy0) this.RAsUl2FVSrh6.getValue();
            if (iy0Var != null) {
                iy0Var.PxuCJdSBwIXG();
            } else {
                iy0Var = null;
            }
            this.e9gEMXR7LXtO = iy0Var;
        }
        this.Y1f8riQaR6yg++;
        return this;
    }

    public final void lS5Rgt96tfkO() {
        if (this.a92UlCVFR9N8) {
            return;
        }
        if (this.Y1f8riQaR6yg <= 0) {
            hp0.TSizfFm2Yiuu("Release should only be called once");
        }
        int i = this.Y1f8riQaR6yg - 1;
        this.Y1f8riQaR6yg = i;
        if (i == 0) {
            this.lS5Rgt96tfkO.rtx2ld2ELZv4.remove(this);
            iy0 iy0Var = this.e9gEMXR7LXtO;
            if (iy0Var != null) {
                iy0Var.lS5Rgt96tfkO();
            }
            this.e9gEMXR7LXtO = null;
        }
    }
}
