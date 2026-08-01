package com.bytedance.sdk.openadsdk.core.model;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.openadsdk.AdSlot;
import java.util.ArrayList;
import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: AdLogInfoModel.java */
/* loaded from: classes2.dex */
public class icD {
    public ArrayList<Integer> Jd;
    public AdSlot NB;
    public int icD;
    public String pvs;
    public int vG = 1;

    public String pvs() {
        return this.pvs;
    }

    public void pvs(String str) {
        this.pvs = str;
    }

    public int icD() {
        return this.icD;
    }

    public void pvs(int i) {
        this.icD = i;
    }

    public int vG() {
        return this.vG;
    }

    public void icD(int i) {
        this.vG = i;
    }

    public AdSlot Jd() {
        return this.NB;
    }

    public void pvs(AdSlot adSlot) {
        this.NB = adSlot;
    }

    public ArrayList<Integer> NB() {
        return this.Jd;
    }

    public void pvs(ArrayList<Integer> arrayList) {
        this.Jd = arrayList;
    }

    public static void pvs(icD icd) {
        int icD;
        if (icd == null || icd.Jd() == null || (icD = icd.icD()) >= 0 || icD == -8) {
            return;
        }
        com.bytedance.sdk.openadsdk.Wyp.vG.pvs();
        com.bytedance.sdk.openadsdk.Wyp.vG.pvs("rd_client_custom_error", false, new com.bytedance.sdk.openadsdk.Wyp.icD() { // from class: com.bytedance.sdk.openadsdk.core.model.icD.1
            @Override // com.bytedance.sdk.openadsdk.Wyp.icD
            public com.bytedance.sdk.openadsdk.Wyp.pvs.vG getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(TypedValues.TransitionType.S_FROM, icD.this.vG());
                jSONObject.put("err_code", icD.this.icD());
                jSONObject.put("server_res_str", icD.this.pvs());
                if (icD.this.NB() != null && icD.this.NB().size() > 0) {
                    jSONObject.put("mate_unavailable_code_list", new JSONArray((Collection) icD.this.NB()).toString());
                }
                Object[] objArr = new Object[2];
                return com.bytedance.sdk.openadsdk.Wyp.pvs.Jd.icD().pvs("rd_client_custom_error").pvs(icD.this.Jd().getDurationSlotType()).icD(jSONObject.toString());
            }
        });
    }
}
