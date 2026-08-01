package com.bytedance.sdk.openadsdk.component.reward.pvs;

import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.icD.vG;
import com.bytedance.sdk.openadsdk.core.model.cR;
import org.json.JSONObject;

/* compiled from: RewardFullDownloadManager.java */
/* loaded from: classes2.dex */
public class Jd {
    private boolean Jd;
    private final com.bytedance.sdk.openadsdk.component.reward.pvs.pvs NB;
    private final cR icD;
    com.com.bytedance.overseas.sdk.pvs.vG pvs;
    private final String vG;

    /* compiled from: RewardFullDownloadManager.java */
    public interface pvs {
        void pvs(View view, float f, float f2, float f3, float f4, SparseArray<vG.pvs> sparseArray, int i, int i2, int i3);

        void pvs(String str, JSONObject jSONObject);
    }

    public Jd(com.bytedance.sdk.openadsdk.component.reward.pvs.pvs pvsVar) {
        this.NB = pvsVar;
        this.icD = pvsVar.icD;
        this.vG = pvsVar.NB;
    }

    public void pvs() {
        if (this.Jd) {
            return;
        }
        this.Jd = true;
        Jd();
    }

    private void Jd() {
        if (!com.bytedance.sdk.openadsdk.multipro.icD.vG() && this.icD.jhZ() == 4) {
            this.pvs = com.com.bytedance.overseas.sdk.pvs.Jd.pvs(this.NB.jhZ, this.icD, this.vG);
        }
        if (this.pvs == null) {
            this.pvs = com.com.bytedance.overseas.sdk.pvs.Jd.pvs(this.NB.od, this.icD, this.vG);
        }
    }

    public void icD() {
        com.com.bytedance.overseas.sdk.pvs.vG vGVar = this.pvs;
        if (vGVar != null) {
            vGVar.Jd();
        }
    }

    public com.com.bytedance.overseas.sdk.pvs.vG vG() {
        return this.pvs;
    }

    public void pvs(View view, float f, float f2, float f3, float f4, SparseArray<vG.pvs> sparseArray, int i, int i2, int i3, pvs pvsVar) {
        if (this.pvs != null) {
            int id = view.getId();
            if (id == com.bytedance.sdk.openadsdk.utils.kj.NB) {
                pvsVar.pvs("click_play_star_level", null);
                return;
            }
            if (id == com.bytedance.sdk.openadsdk.utils.kj.Jd) {
                pvsVar.pvs("click_play_star_nums", null);
                return;
            } else if (id == com.bytedance.sdk.openadsdk.utils.kj.vG) {
                pvsVar.pvs("click_play_source", null);
                return;
            } else {
                if (id == com.bytedance.sdk.openadsdk.utils.kj.icD) {
                    pvsVar.pvs("click_play_logo", null);
                    return;
                }
                return;
            }
        }
        pvsVar.pvs(view, f, f2, f3, f4, sparseArray, i, i2, i3);
    }
}
