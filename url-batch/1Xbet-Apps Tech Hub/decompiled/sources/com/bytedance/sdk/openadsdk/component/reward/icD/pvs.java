package com.bytedance.sdk.openadsdk.component.reward.icD;

import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.dyT;
import com.bytedance.sdk.openadsdk.component.reward.pvs.IP;
import com.bytedance.sdk.openadsdk.component.reward.pvs.bNS;
import com.bytedance.sdk.openadsdk.component.reward.pvs.qh;
import com.bytedance.sdk.openadsdk.component.reward.view.FullRewardExpressView;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.core.model.mnm;
import com.bytedance.sdk.openadsdk.core.model.rCZ;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;

/* compiled from: BaseRewardFullAdType.java */
/* loaded from: classes2.dex */
public class pvs {
    protected int Jd;
    protected com.bytedance.sdk.openadsdk.core.video.vG.icD Mxy;
    protected final IP NB;
    protected dyT Wyp;
    protected cR icD;
    protected com.bytedance.sdk.openadsdk.component.reward.pvs.pvs pvs;
    protected final com.bytedance.sdk.openadsdk.component.reward.view.NB sUS;
    protected final qh so;
    protected int vG;
    protected final bNS yiw;

    public pvs(com.bytedance.sdk.openadsdk.component.reward.pvs.pvs pvsVar) {
        this.pvs = pvsVar;
        this.icD = pvsVar.icD;
        this.vG = pvsVar.joF;
        this.Jd = pvsVar.thO;
        this.NB = pvsVar.ny;
        this.sUS = pvsVar.gSd;
        this.yiw = pvsVar.dx;
        this.so = pvsVar.cRf;
    }

    public void pvs(com.bytedance.sdk.openadsdk.core.video.vG.icD icd, dyT dyt) {
        this.Mxy = icd;
        this.Wyp = dyt;
    }

    public boolean pvs() {
        return this.pvs.icD.SJ() || this.pvs.icD.Ye() == 15 || this.pvs.icD.Ye() == 5 || this.pvs.icD.Ye() == 50;
    }

    public void pvs(boolean z) {
        if (this.pvs.Wyp.get()) {
            return;
        }
        cR cRVar = this.icD;
        if (cRVar != null && cRVar.OBt()) {
            this.so.vG(false);
            this.so.pvs(true);
            this.pvs.gSd.vG(8);
            this.pvs.gSd.Jd(8);
            return;
        }
        if (!z) {
            this.so.vG(false);
            this.so.pvs(false);
            this.so.Jd(false);
            this.pvs.gSd.sUS(8);
        } else {
            this.so.pvs(this.pvs.icD.yhq());
            if (rCZ.qh(this.pvs.icD) || pvs()) {
                this.so.vG(true);
            }
            if (pvs() || ((this instanceof yiw) && this.pvs.icD.pvs())) {
                this.so.Jd(true);
            } else {
                this.so.sUS();
                this.pvs.gSd.sUS(0);
            }
        }
        if (!z) {
            this.pvs.gSd.vG(4);
            this.pvs.gSd.Jd(8);
        } else if (this.pvs.OyE != FullRewardExpressView.pvs || !pvs()) {
            this.pvs.gSd.vG(8);
            this.pvs.gSd.Jd(8);
        } else {
            this.pvs.gSd.vG(0);
            this.pvs.gSd.Jd(0);
        }
    }

    public boolean icD() {
        if (!mnm.icD(this.pvs.icD) || !this.pvs.zM.get()) {
            return (this.pvs.Wyp.get() || this.pvs.qh.get() || rCZ.qh(this.pvs.icD)) ? false : true;
        }
        FrameLayout sUS = this.pvs.gSd.sUS();
        sUS.setVisibility(4);
        sUS.setVisibility(0);
        return false;
    }

    protected void vG() {
        if (rCZ.icD(this.pvs.icD) && DeviceUtils.yiw() == 0) {
            this.pvs.ea = true;
        }
        this.pvs.cRf.icD(this.pvs.ea);
    }
}
