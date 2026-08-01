package com.bytedance.sdk.openadsdk.component.reward.icD;

import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.component.reward.icD.icD;
import com.bytedance.sdk.openadsdk.component.reward.view.FullInteractionStyleView;
import com.bytedance.sdk.openadsdk.core.model.cR;

/* compiled from: RewardFullTypeInteraction.java */
/* loaded from: classes2.dex */
public class so extends icD {
    private FullInteractionStyleView bNS;

    public so(com.bytedance.sdk.openadsdk.component.reward.pvs.pvs pvsVar) {
        super(pvsVar);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.icD.icD
    public void pvs(FrameLayout frameLayout) {
        FullInteractionStyleView fullInteractionStyleView = new FullInteractionStyleView(this.pvs.od, this.qh);
        this.bNS = fullInteractionStyleView;
        fullInteractionStyleView.setDownloadListener(this.kj);
        this.bNS.pvs(this.icD, this.pvs.OyE, this.pvs.cnN, this.vG, this.Jd);
        frameLayout.addView(this.bNS.getInteractionStyleRootView());
    }

    public static boolean pvs(cR cRVar) {
        return (cRVar.FJ() || cRVar.UYh() == 100.0f) ? false : true;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.icD.icD
    public icD.pvs Jd() {
        return new icD.pvs() { // from class: com.bytedance.sdk.openadsdk.component.reward.icD.so.1
            @Override // com.bytedance.sdk.openadsdk.component.reward.icD.icD.pvs
            public void pvs(boolean z) {
                if (so.this.bNS != null) {
                    so.this.bNS.setIsMute(z);
                }
            }
        };
    }

    public FrameLayout gA() {
        FullInteractionStyleView fullInteractionStyleView = this.bNS;
        if (fullInteractionStyleView != null) {
            return fullInteractionStyleView.getVideoContainer();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.icD.icD
    public boolean NB() {
        return jlb();
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.icD.icD
    public boolean sUS() {
        return jlb();
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.icD.icD
    public void yiw() {
        this.sUS.Jd(8);
        this.sUS.vG(8);
        if (this.icD.OT() == 2) {
            this.so.pvs(false);
            this.so.vG(false);
            this.so.Jd(false);
            this.sUS.sUS(8);
            return;
        }
        this.so.pvs(this.icD.yhq());
        this.so.vG(jlb());
        this.so.Jd(jlb());
        if (jlb()) {
            this.sUS.sUS(8);
        } else {
            this.so.sUS();
            this.sUS.sUS(0);
        }
    }

    private boolean jlb() {
        return cR.NB(this.icD);
    }
}
