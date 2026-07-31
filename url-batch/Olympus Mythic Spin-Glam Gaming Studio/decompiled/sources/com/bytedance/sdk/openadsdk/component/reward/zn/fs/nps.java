package com.bytedance.sdk.openadsdk.component.reward.zn.fs;

import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.component.reward.zn.bvs;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class nps implements bvs {
    private com.bytedance.sdk.openadsdk.core.rt.hhw fs;
    private nqi zmn;

    public nps(nqi nqiVar) {
        this.zmn = nqiVar;
    }

    public void zmn(ViewGroup viewGroup) {
        if (!this.zmn.zt() || viewGroup == null) {
            return;
        }
        if (this.fs == null) {
            this.fs = com.bytedance.sdk.openadsdk.core.rt.hhw.zmn();
        }
        this.fs.zmn(viewGroup, this.zmn);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.zn.bvs
    public void zmn(int i, JSONObject jSONObject) {
        nqi nqiVar;
        boolean z;
        long j;
        long j2;
        int ab;
        JSONObject optJSONObject;
        if (this.fs == null || (nqiVar = this.zmn) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.model.fb exj = nqiVar.exj();
        com.bytedance.sdk.openadsdk.core.rt.fb zmn = exj != null ? exj.zmn() : null;
        if (jSONObject == null || (optJSONObject = jSONObject.optJSONObject("params")) == null) {
            z = false;
            j = 0;
            j2 = 0;
        } else {
            long optLong = optJSONObject.optLong("video_duration", 0L);
            z = optJSONObject.optBoolean("is_mute", false);
            j2 = optLong;
            j = optJSONObject.optLong("current_position", 0L);
        }
        if (i != 3) {
            switch (i) {
                case 15:
                    if (this.zmn.sft() == 7) {
                        ab = this.zmn.nkw();
                    } else {
                        ab = this.zmn.ab();
                    }
                    com.bytedance.sdk.openadsdk.core.rt.hhw hhwVar = this.fs;
                    if (hhwVar != null) {
                        hhwVar.zmn(ab > 0, ab / 1000);
                        break;
                    }
                    break;
                case 16:
                    com.bytedance.sdk.openadsdk.core.rt.hhw hhwVar2 = this.fs;
                    if (hhwVar2 != null) {
                        hhwVar2.zmn(j2, z);
                        break;
                    }
                    break;
                case 17:
                    com.bytedance.sdk.openadsdk.core.rt.hhw hhwVar3 = this.fs;
                    if (hhwVar3 != null) {
                        hhwVar3.fb();
                        break;
                    }
                    break;
                default:
                    com.bytedance.sdk.openadsdk.core.rt.hhw hhwVar4 = this.fs;
                    if (hhwVar4 != null) {
                        hhwVar4.zmn(i);
                        break;
                    }
                    break;
            }
        } else {
            com.bytedance.sdk.openadsdk.core.rt.hhw hhwVar5 = this.fs;
            if (hhwVar5 != null) {
                hhwVar5.zn();
            }
        }
        zmn(i, zmn, j, j2, z);
    }

    private void zmn(int i, com.bytedance.sdk.openadsdk.core.rt.fb fbVar, long j, long j2, boolean z) {
        if (fbVar == null) {
        }
        switch (i) {
            case 0:
                fbVar.fs(j);
                break;
            case 1:
                fbVar.zn(j);
                break;
            case 2:
                fbVar.hhw(j);
                fbVar.btk(j);
                break;
            case 3:
                fbVar.zmn(j);
                break;
            case 6:
            case 7:
            case 8:
            case 15:
                fbVar.zmn(i, j, j2);
                break;
            case 9:
                fbVar.fb(j);
                break;
            case 12:
                if (z) {
                    fbVar.zg(j);
                    break;
                } else {
                    fbVar.bvs(j);
                    break;
                }
            case 13:
                fbVar.nps(j);
                break;
            case 14:
                fbVar.zmn(com.bytedance.sdk.openadsdk.core.rt.zmn.zmn.GENERAL_LINEAR_AD_ERROR);
                break;
        }
    }
}
