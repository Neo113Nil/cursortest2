package defpackage;

import android.graphics.Insets;
import android.view.WindowInsets;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public class jt2 extends it2 {
    public wp0 EcgxDIVH5in8;
    public wp0 RfyTYNmI9Srp;
    public wp0 S9EYkSpbGuxq;

    public jt2(rt2 rt2Var, WindowInsets windowInsets) {
        super(rt2Var, windowInsets);
        this.RfyTYNmI9Srp = null;
        this.EcgxDIVH5in8 = null;
        this.S9EYkSpbGuxq = null;
    }

    @Override // defpackage.gt2, defpackage.ot2
    public rt2 BRwzKIf41E4i(int i, int i2, int i3, int i4) {
        WindowInsets inset;
        inset = this.TSizfFm2Yiuu.inset(i, i2, i3, i4);
        return rt2.TSizfFm2Yiuu(inset, null);
    }

    @Override // defpackage.ot2
    public wp0 r3s1LDPKFs1S() {
        Insets tappableElementInsets;
        if (this.S9EYkSpbGuxq == null) {
            tappableElementInsets = this.TSizfFm2Yiuu.getTappableElementInsets();
            this.S9EYkSpbGuxq = wp0.Y1f8riQaR6yg(tappableElementInsets);
        }
        return this.S9EYkSpbGuxq;
    }

    @Override // defpackage.ot2
    public wp0 wdg6QnbFHrFF() {
        Insets mandatorySystemGestureInsets;
        if (this.EcgxDIVH5in8 == null) {
            mandatorySystemGestureInsets = this.TSizfFm2Yiuu.getMandatorySystemGestureInsets();
            this.EcgxDIVH5in8 = wp0.Y1f8riQaR6yg(mandatorySystemGestureInsets);
        }
        return this.EcgxDIVH5in8;
    }

    @Override // defpackage.ot2
    public wp0 x50lh2ztY7Y5() {
        Insets systemGestureInsets;
        if (this.RfyTYNmI9Srp == null) {
            systemGestureInsets = this.TSizfFm2Yiuu.getSystemGestureInsets();
            this.RfyTYNmI9Srp = wp0.Y1f8riQaR6yg(systemGestureInsets);
        }
        return this.RfyTYNmI9Srp;
    }

    @Override // defpackage.ht2, defpackage.ot2
    public void ZbWwgt3aGe7A(wp0 wp0Var) {
    }
}
