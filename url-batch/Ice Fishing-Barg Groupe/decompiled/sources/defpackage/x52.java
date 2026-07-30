package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class x52 extends to {
    public final xw1 RAsUl2FVSrh6;
    public Object TSizfFm2Yiuu;
    public w81 Y1f8riQaR6yg;
    public v32 a92UlCVFR9N8;
    public w81 e9gEMXR7LXtO;
    public Object lS5Rgt96tfkO;
    public final rf1 rtx2ld2ELZv4;

    public x52() {
        super(1);
        this.RAsUl2FVSrh6 = new xw1(6, this);
        i72 i72Var = j72.Companion;
        l4 l4Var = new l4(16, this);
        i72Var.getClass();
        this.rtx2ld2ELZv4 = i72.Y1f8riQaR6yg(l4Var);
    }

    @Override // defpackage.to
    public final void OPXfSBeufaJ8(ui uiVar) {
        this.a92UlCVFR9N8 = null;
        this.TSizfFm2Yiuu = null;
        this.e9gEMXR7LXtO = null;
        Y1f8riQaR6yg();
    }

    @Override // defpackage.to
    public final void TSizfFm2Yiuu(v32 v32Var) {
        this.TSizfFm2Yiuu = null;
        this.e9gEMXR7LXtO = null;
    }

    @Override // defpackage.to
    public final void Y1f8riQaR6yg() {
        synchronized (this.PxuCJdSBwIXG) {
            try {
                this.lS5Rgt96tfkO = this.TSizfFm2Yiuu;
                if (this.e9gEMXR7LXtO == null) {
                    this.Y1f8riQaR6yg = null;
                } else {
                    if (this.Y1f8riQaR6yg == null) {
                        w81 w81Var = d02.PxuCJdSBwIXG;
                        this.Y1f8riQaR6yg = new w81();
                    }
                    w81 w81Var2 = this.Y1f8riQaR6yg;
                    this.Y1f8riQaR6yg = this.e9gEMXR7LXtO;
                    this.e9gEMXR7LXtO = w81Var2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.to
    public final void e9gEMXR7LXtO() {
        this.rtx2ld2ELZv4.lS5Rgt96tfkO();
        this.TSizfFm2Yiuu = null;
        this.e9gEMXR7LXtO = null;
        synchronized (this.PxuCJdSBwIXG) {
            this.a92UlCVFR9N8 = null;
            this.lS5Rgt96tfkO = null;
            this.Y1f8riQaR6yg = null;
        }
    }

    @Override // defpackage.to
    public final le0 rtx2ld2ELZv4(v32 v32Var) {
        v32 v32Var2 = this.a92UlCVFR9N8;
        if (v32Var2 != null && !v32Var2.equals(v32Var)) {
            gp1.lS5Rgt96tfkO("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
        }
        this.a92UlCVFR9N8 = v32Var;
        return this.RAsUl2FVSrh6;
    }
}
