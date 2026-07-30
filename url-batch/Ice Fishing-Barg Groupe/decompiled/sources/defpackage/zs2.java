package defpackage;

import android.view.WindowInsets;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public class zs2 extends ft2 {
    public final WindowInsets.Builder e9gEMXR7LXtO;

    public zs2(rt2 rt2Var) {
        super(rt2Var);
        WindowInsets lS5Rgt96tfkO = rt2Var.lS5Rgt96tfkO();
        this.e9gEMXR7LXtO = lS5Rgt96tfkO != null ? om2.e9gEMXR7LXtO(lS5Rgt96tfkO) : om2.Y1f8riQaR6yg();
    }

    @Override // defpackage.ft2
    public void OPXfSBeufaJ8(wp0 wp0Var) {
        this.e9gEMXR7LXtO.setTappableElementInsets(wp0Var.e9gEMXR7LXtO());
    }

    @Override // defpackage.ft2
    public void RAsUl2FVSrh6(wp0 wp0Var) {
        this.e9gEMXR7LXtO.setSystemGestureInsets(wp0Var.e9gEMXR7LXtO());
    }

    @Override // defpackage.ft2
    public void a92UlCVFR9N8(wp0 wp0Var) {
        this.e9gEMXR7LXtO.setStableInsets(wp0Var.e9gEMXR7LXtO());
    }

    @Override // defpackage.ft2
    public void e9gEMXR7LXtO(wp0 wp0Var) {
        this.e9gEMXR7LXtO.setMandatorySystemGestureInsets(wp0Var.e9gEMXR7LXtO());
    }

    @Override // defpackage.ft2
    public rt2 lS5Rgt96tfkO() {
        WindowInsets build;
        PxuCJdSBwIXG();
        build = this.e9gEMXR7LXtO.build();
        rt2 TSizfFm2Yiuu = rt2.TSizfFm2Yiuu(build, null);
        wp0[] wp0VarArr = this.lS5Rgt96tfkO;
        ot2 ot2Var = TSizfFm2Yiuu.PxuCJdSBwIXG;
        ot2Var.VhhvGxCb8gfr(wp0VarArr);
        ot2Var.S9EYkSpbGuxq(null);
        ot2Var.IAToe7bXGz4N(this.TSizfFm2Yiuu);
        ot2Var.e6tOsSdd2EFb(this.Y1f8riQaR6yg);
        return TSizfFm2Yiuu;
    }

    @Override // defpackage.ft2
    public void rtx2ld2ELZv4(wp0 wp0Var) {
        this.e9gEMXR7LXtO.setSystemWindowInsets(wp0Var.e9gEMXR7LXtO());
    }

    public zs2() {
        this.e9gEMXR7LXtO = om2.Y1f8riQaR6yg();
    }
}
