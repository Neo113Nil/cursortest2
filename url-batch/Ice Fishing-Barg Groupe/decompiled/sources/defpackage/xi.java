package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class xi extends wi {
    public final v80 dgRBjINgWbAK;

    public xi(v80 v80Var, hu huVar, int i, ag agVar) {
        super(huVar, i, agVar);
        this.dgRBjINgWbAK = v80Var;
    }

    @Override // defpackage.wi, defpackage.v80
    public final Object PxuCJdSBwIXG(w80 w80Var, bt btVar) {
        int i = this.OPXfSBeufaJ8;
        su suVar = su.rtx2ld2ELZv4;
        if (i == -3) {
            hu e9gEMXR7LXtO = btVar.e9gEMXR7LXtO();
            Boolean bool = Boolean.FALSE;
            jm jmVar = new jm(6, (byte) 0);
            hu huVar = this.rtx2ld2ELZv4;
            hu RfyTYNmI9Srp = !((Boolean) huVar.IAToe7bXGz4N(jmVar, bool)).booleanValue() ? e9gEMXR7LXtO.RfyTYNmI9Srp(huVar) : zv.RfyTYNmI9Srp(e9gEMXR7LXtO, huVar, false);
            if (cs0.wdg6QnbFHrFF(RfyTYNmI9Srp, e9gEMXR7LXtO)) {
                Object rtx2ld2ELZv4 = rtx2ld2ELZv4(w80Var, btVar);
                if (rtx2ld2ELZv4 == suVar) {
                    return rtx2ld2ELZv4;
                }
            } else {
                ih0 ih0Var = ih0.x50lh2ztY7Y5;
                if (cs0.wdg6QnbFHrFF(RfyTYNmI9Srp.S2OOm9zPNm0h(ih0Var), e9gEMXR7LXtO.S2OOm9zPNm0h(ih0Var))) {
                    hu e9gEMXR7LXtO2 = btVar.e9gEMXR7LXtO();
                    if (!(w80Var instanceof w32) && !(w80Var instanceof ae1)) {
                        w80Var = new b8(w80Var, e9gEMXR7LXtO2);
                    }
                    Object IxJ9cAW40yOk = fx1.IxJ9cAW40yOk(RfyTYNmI9Srp, w80Var, hq0.xbgXKYA2cIfu(RfyTYNmI9Srp), new a92UlCVFR9N8(this, null, 10), btVar);
                    if (IxJ9cAW40yOk == suVar) {
                        return IxJ9cAW40yOk;
                    }
                }
            }
            return no2.PxuCJdSBwIXG;
        }
        Object PxuCJdSBwIXG = super.PxuCJdSBwIXG(w80Var, btVar);
        if (PxuCJdSBwIXG == suVar) {
            return PxuCJdSBwIXG;
        }
        return no2.PxuCJdSBwIXG;
    }

    @Override // defpackage.wi
    public final Object Y1f8riQaR6yg(qq1 qq1Var, bt btVar) {
        Object rtx2ld2ELZv4 = rtx2ld2ELZv4(new w32(qq1Var), btVar);
        return rtx2ld2ELZv4 == su.rtx2ld2ELZv4 ? rtx2ld2ELZv4 : no2.PxuCJdSBwIXG;
    }

    public abstract Object rtx2ld2ELZv4(w80 w80Var, bt btVar);

    @Override // defpackage.wi
    public final String toString() {
        return this.dgRBjINgWbAK + " -> " + super.toString();
    }
}
