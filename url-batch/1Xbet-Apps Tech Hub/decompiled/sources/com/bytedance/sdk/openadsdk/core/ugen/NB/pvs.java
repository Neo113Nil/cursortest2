package com.bytedance.sdk.openadsdk.core.ugen.NB;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.common.internal.ImagesContract;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: UGenTemplateModel.java */
/* loaded from: classes2.dex */
public class pvs {
    private String Jd;
    private String NB;
    private String icD;
    private String pvs;
    private String vG;

    public String pvs() {
        return this.pvs;
    }

    public pvs pvs(String str) {
        this.pvs = str;
        return this;
    }

    public String icD() {
        return this.icD;
    }

    public pvs icD(String str) {
        this.icD = str;
        return this;
    }

    public String vG() {
        return this.vG;
    }

    public pvs vG(String str) {
        this.vG = str;
        return this;
    }

    public String Jd() {
        return this.Jd;
    }

    public pvs Jd(String str) {
        this.Jd = str;
        return this;
    }

    public String NB() {
        return this.NB;
    }

    public pvs NB(String str) {
        this.NB = str;
        return this;
    }

    public JSONObject pvs(pvs pvsVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(FacebookMediationAdapter.KEY_ID, this.pvs);
            jSONObject.put("md5", this.icD);
            jSONObject.put(ImagesContract.URL, this.vG);
            if (pvsVar != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(FacebookMediationAdapter.KEY_ID, pvsVar.pvs());
                jSONObject2.put("md5", pvsVar.icD());
                jSONObject2.put(ImagesContract.URL, pvsVar.vG());
                jSONObject.put("overlay", jSONObject2);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
