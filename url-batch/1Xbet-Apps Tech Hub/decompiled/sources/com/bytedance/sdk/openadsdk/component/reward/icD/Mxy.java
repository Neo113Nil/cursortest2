package com.bytedance.sdk.openadsdk.component.reward.icD;

import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.core.model.rCZ;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;

/* compiled from: RewardFullTypePlayable.java */
/* loaded from: classes2.dex */
public class Mxy extends icD {
    @Override // com.bytedance.sdk.openadsdk.component.reward.icD.icD
    public boolean NB() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.icD.icD
    public void pvs(FrameLayout frameLayout) {
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.icD.icD
    public boolean sUS() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.icD.icD
    public void yiw() {
    }

    public Mxy(com.bytedance.sdk.openadsdk.component.reward.pvs.pvs pvsVar) {
        super(pvsVar);
    }

    public static boolean pvs(cR cRVar) {
        return rCZ.icD(cRVar) || rCZ.qh(cRVar);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.icD.icD
    public void cR() {
        if (rCZ.vG(this.icD) && this.pvs.dx.cRf() && !this.pvs.dx.qD()) {
            zM();
        }
        if (rCZ.icD(this.pvs.icD)) {
            if (DeviceUtils.yiw() == 0) {
                this.pvs.ea = true;
            }
            if (this.pvs.ea) {
                this.pvs.cRf.icD(true);
                this.pvs.jlb.pvs(true);
            }
        }
        this.pvs.Ye.pvs();
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.icD.icD
    public void uc() {
        if (this.pvs.dyT.Wyp() && rCZ.qh(this.pvs.icD)) {
            this.pvs.dyT.pvs("return_foreground");
            if ((this.Ju == null || !this.Ju.isShowing()) && this.pvs.dyT.kj() >= 0) {
                this.pvs.dyT.pvs(0L);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.icD.icD
    public void rCZ() {
        super.rCZ();
        if (rCZ.qh(this.pvs.icD)) {
            this.Wyp.removeMessages(600);
            this.pvs.dyT.pvs("go_background");
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.icD.icD
    public void OT() {
        super.OT();
        if (rCZ.qh(this.pvs.icD)) {
            this.Wyp.removeMessages(600);
            this.pvs.dyT.pvs("go_background");
        }
    }
}
