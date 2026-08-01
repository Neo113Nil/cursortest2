package com.bytedance.sdk.openadsdk.component.reward.icD;

import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.icD.IP;
import com.bytedance.sdk.openadsdk.component.reward.pvs.NB;
import com.bytedance.sdk.openadsdk.component.reward.view.FullRewardExpressView;
import com.bytedance.sdk.openadsdk.component.reward.view.RewardFullBaseLayout;
import com.bytedance.sdk.openadsdk.core.CvL;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.core.model.zM;
import com.bytedance.sdk.openadsdk.utils.ae;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: RewardFullTypeDoubleAds.java */
/* loaded from: classes2.dex */
public class NB extends icD implements com.bytedance.sdk.openadsdk.Mxy.sUS {
    private final zM bNS;
    private boolean mnm;

    @Override // com.bytedance.sdk.openadsdk.component.reward.icD.icD
    public boolean NB() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.icD.icD
    protected boolean ae() {
        return false;
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

    public NB(com.bytedance.sdk.openadsdk.component.reward.pvs.pvs pvsVar) {
        super(pvsVar);
        this.bNS = (zM) pvsVar.icD;
    }

    public static void pvs(cR cRVar, boolean z, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("is_backup", Boolean.valueOf(z));
        com.bytedance.sdk.openadsdk.icD.vG.pvs("choose_ad_start_show", cRVar, str, hashMap);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("req_id", cRVar.Yjw());
            jSONObject.put("is_backup", z);
        } catch (JSONException unused) {
        }
        com.bytedance.sdk.openadsdk.Wyp.vG.pvs().pvs("choose_ad_start_show", jSONObject);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.icD.icD
    public void pvs(RewardFullBaseLayout rewardFullBaseLayout) {
        if (vG.pvs(this.bNS)) {
            vG.pvs(this.bNS, rewardFullBaseLayout, this.pvs);
        } else {
            super.pvs(rewardFullBaseLayout);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.icD.pvs
    public boolean icD() {
        return this.mnm;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.icD.icD
    public void CvL() {
        CvL jsObject;
        if (this.pvs.od.isFinishing()) {
            return;
        }
        if (this.pvs.dX.so() || this.mnm) {
            super.CvL();
            if (this.pvs.dX.so()) {
                Gp();
                this.pvs.sP.icD();
                return;
            }
            return;
        }
        FullRewardExpressView pvs = this.pvs.dX.pvs();
        if (pvs == null || (jsObject = pvs.getJsObject()) == null) {
            return;
        }
        jsObject.pvs(this);
    }

    @Override // com.bytedance.sdk.openadsdk.Mxy.sUS
    public void pvs(int i, long j) {
        this.mnm = true;
        int i2 = i - 1;
        this.bNS.sq(i2);
        com.bytedance.sdk.openadsdk.icD.vG.pvs(this.bNS, this.pvs.NB, i, j);
        com.bytedance.sdk.openadsdk.component.reward.pvs.pvs(this.bNS.wgm(), i2);
        ae.pvs(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.icD.NB.1
            @Override // java.lang.Runnable
            public void run() {
                NB.this.CvL();
                if (NB.this.pvs.yWX) {
                    NB.this.Gp();
                    NB.this.pvs.sP.icD();
                } else {
                    NB.pvs sUS = NB.this.pvs.sP.sUS();
                    if (sUS != null) {
                        sUS.mnm();
                    }
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.Mxy.sUS
    public void pvs(IP ip) {
        this.pvs.dX.pvs().icD(ip);
    }

    public void icD(boolean z) {
        if (this.mnm) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("has_focus", Boolean.valueOf(z));
        com.bytedance.sdk.openadsdk.icD.vG.pvs("choose_ad_focus_changed", this.bNS, this.pvs.NB, hashMap);
    }
}
