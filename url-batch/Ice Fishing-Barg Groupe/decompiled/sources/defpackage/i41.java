package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class i41 implements dp1 {
    public ir0 OPXfSBeufaJ8;
    public ir0 dgRBjINgWbAK;
    public final i2 rtx2ld2ELZv4;
    public cw0 wdg6QnbFHrFF;
    public wq0 x50lh2ztY7Y5;

    public i41(i2 i2Var) {
        this.rtx2ld2ELZv4 = i2Var;
    }

    @Override // defpackage.dp1
    public final long PxuCJdSBwIXG(dr0 dr0Var, long j, cw0 cw0Var, long j2) {
        wq0 wq0Var = this.x50lh2ztY7Y5;
        if (wq0Var != null) {
            ir0 ir0Var = this.OPXfSBeufaJ8;
            if ((ir0Var == null ? false : ir0.PxuCJdSBwIXG(ir0Var.PxuCJdSBwIXG, j)) && this.wdg6QnbFHrFF == cw0Var) {
                ir0 ir0Var2 = this.dgRBjINgWbAK;
                if (ir0Var2 != null ? ir0.PxuCJdSBwIXG(ir0Var2.PxuCJdSBwIXG, j2) : false) {
                    return wq0Var.PxuCJdSBwIXG;
                }
            }
        }
        long PxuCJdSBwIXG = this.rtx2ld2ELZv4.PxuCJdSBwIXG(dr0Var, j, cw0Var, j2);
        this.OPXfSBeufaJ8 = new ir0(j);
        this.wdg6QnbFHrFF = cw0Var;
        this.dgRBjINgWbAK = new ir0(j2);
        this.x50lh2ztY7Y5 = new wq0(PxuCJdSBwIXG);
        return PxuCJdSBwIXG;
    }
}
