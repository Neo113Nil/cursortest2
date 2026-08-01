package com.bytedance.sdk.openadsdk.component.reward.view;

import android.view.View;
import com.bytedance.sdk.openadsdk.component.reward.pvs.IP;
import com.bytedance.sdk.openadsdk.component.reward.pvs.mnm;
import com.bytedance.sdk.openadsdk.utils.Pj;
import com.bytedance.sdk.openadsdk.utils.kj;

/* compiled from: RewardFullBackUpEndCard.java */
/* loaded from: classes2.dex */
public class icD {
    private mnm Jd;
    private RFEndCardBackUpLayout icD;
    private final com.bytedance.sdk.openadsdk.component.reward.pvs.pvs pvs;
    private boolean vG;

    public icD(com.bytedance.sdk.openadsdk.component.reward.pvs.pvs pvsVar) {
        this.pvs = pvsVar;
    }

    public void pvs() {
        if (this.vG) {
            return;
        }
        this.vG = true;
        RFEndCardBackUpLayout rFEndCardBackUpLayout = (RFEndCardBackUpLayout) this.pvs.qD.findViewById(kj.yhq);
        this.icD = rFEndCardBackUpLayout;
        if (rFEndCardBackUpLayout != null) {
            rFEndCardBackUpLayout.pvs(this.pvs);
        }
        if (this.pvs.icD.SJ()) {
            this.Jd = new mnm(this.pvs);
        }
    }

    public void pvs(com.bytedance.sdk.openadsdk.core.icD.NB nb) {
        RFEndCardBackUpLayout rFEndCardBackUpLayout = this.icD;
        if (rFEndCardBackUpLayout == null) {
            return;
        }
        Pj.pvs(rFEndCardBackUpLayout, new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.icD.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        }, "TTBaseVideoActivity#mFLEndCardBackupContainer");
        mnm mnmVar = this.Jd;
        if (mnmVar != null) {
            mnmVar.pvs(nb);
        }
    }

    public void icD() {
        Pj.pvs((View) this.icD, 0);
    }

    public boolean pvs(IP ip) {
        mnm mnmVar = this.Jd;
        if (mnmVar == null || !mnmVar.pvs(ip)) {
            return false;
        }
        Pj.pvs((View) this.icD, 0);
        return true;
    }

    public void vG() {
        mnm mnmVar = this.Jd;
        if (mnmVar != null) {
            mnmVar.pvs();
        }
    }

    public void Jd() {
        mnm mnmVar = this.Jd;
        if (mnmVar != null) {
            mnmVar.icD();
        }
    }

    public boolean NB() {
        mnm mnmVar = this.Jd;
        if (mnmVar != null) {
            return mnmVar.vG();
        }
        return false;
    }

    public void pvs(int i) {
        RFEndCardBackUpLayout rFEndCardBackUpLayout = this.icD;
        if (rFEndCardBackUpLayout == null) {
            return;
        }
        rFEndCardBackUpLayout.setShownAdCount(i);
    }
}
