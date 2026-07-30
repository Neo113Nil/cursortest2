package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class mo extends yQRudnv4La6p {
    public boolean RAsUl2FVSrh6;
    public final ru TSizfFm2Yiuu;
    public pe0 Y1f8riQaR6yg;
    public z82 a92UlCVFR9N8;
    public eg e9gEMXR7LXtO;

    public mo(ru ruVar, jp1 jp1Var) {
        super(jp1Var);
        this.TSizfFm2Yiuu = ruVar;
        this.Y1f8riQaR6yg = new r6(2, null, 1);
    }

    @Override // defpackage.yQRudnv4La6p
    public final void RAsUl2FVSrh6(zb zbVar) {
        eg egVar = this.e9gEMXR7LXtO;
        if (egVar != null) {
            egVar.Y1f8riQaR6yg(zbVar);
        }
    }

    @Override // defpackage.yQRudnv4La6p
    public final void a92UlCVFR9N8() {
        if (this.e9gEMXR7LXtO != null && !this.RAsUl2FVSrh6) {
            e9gEMXR7LXtO();
        }
        if (this.e9gEMXR7LXtO == null) {
            this.RAsUl2FVSrh6 = false;
            this.e9gEMXR7LXtO = mm2.PxuCJdSBwIXG(-2, 4, ag.rtx2ld2ELZv4);
            this.a92UlCVFR9N8 = fx1.KUoIVIumpKat(this.TSizfFm2Yiuu, null, new a92UlCVFR9N8(this, null, 11), 3);
        }
        eg egVar = this.e9gEMXR7LXtO;
        if (egVar != null) {
            vi0.wdg6QnbFHrFF(egVar);
        }
        this.RAsUl2FVSrh6 = false;
    }

    @Override // defpackage.yQRudnv4La6p
    public final void e9gEMXR7LXtO() {
        eg egVar = this.e9gEMXR7LXtO;
        if (egVar != null) {
            egVar.OPXfSBeufaJ8(new CancellationException("onBack cancelled"), true);
        }
        z82 z82Var = this.a92UlCVFR9N8;
        if (z82Var != null) {
            z82Var.a92UlCVFR9N8(null);
        }
        this.e9gEMXR7LXtO = null;
        this.a92UlCVFR9N8 = null;
        this.RAsUl2FVSrh6 = false;
    }

    @Override // defpackage.yQRudnv4La6p
    public final void rtx2ld2ELZv4() {
        e9gEMXR7LXtO();
        if (super.Y1f8riQaR6yg()) {
            this.RAsUl2FVSrh6 = true;
            this.e9gEMXR7LXtO = mm2.PxuCJdSBwIXG(-2, 4, ag.rtx2ld2ELZv4);
            this.a92UlCVFR9N8 = fx1.KUoIVIumpKat(this.TSizfFm2Yiuu, null, new a92UlCVFR9N8(this, null, 11), 3);
        }
    }

    public final void wdg6QnbFHrFF(boolean z) {
        z82 z82Var;
        if (!z && super.Y1f8riQaR6yg() && (z82Var = this.a92UlCVFR9N8) != null && !z82Var.lS5Rgt96tfkO()) {
            e9gEMXR7LXtO();
        }
        ((bc) this.PxuCJdSBwIXG).Y1f8riQaR6yg(z);
        ((ac) this.lS5Rgt96tfkO).a92UlCVFR9N8(z);
    }
}
