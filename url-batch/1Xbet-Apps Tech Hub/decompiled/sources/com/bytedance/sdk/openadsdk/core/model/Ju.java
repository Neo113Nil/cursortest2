package com.bytedance.sdk.openadsdk.core.model;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DspStyle.java */
/* loaded from: classes2.dex */
public class Ju {
    private final int Jd;
    private final int icD;
    private final int pvs;
    private final int vG;

    public Ju(JSONObject jSONObject) {
        this.pvs = jSONObject.optInt("auto_click", 0);
        this.icD = jSONObject.optInt("close_jump_probability", 0);
        this.vG = jSONObject.optInt("skip_jump_probability", 0);
        this.Jd = jSONObject.optInt("hidden_bar", 0);
    }

    public int pvs() {
        return this.pvs;
    }

    public int icD() {
        int i = this.icD;
        if (i < 0 || i > 100) {
            return 0;
        }
        return i;
    }

    public int vG() {
        int i = this.vG;
        if (i < 0 || i > 100) {
            return 0;
        }
        return i;
    }

    public boolean Jd() {
        return this.Jd == 1;
    }

    public JSONObject NB() {
        try {
            JSONObject jSONObject = new JSONObject();
            int i = this.pvs;
            if (i == 1) {
                jSONObject.put("auto_click", i);
            }
            int i2 = this.icD;
            if (i2 > 0 && i2 <= 100) {
                jSONObject.put("close_jump_probability", i2);
            }
            int i3 = this.vG;
            if (i3 > 0 && i3 <= 100) {
                jSONObject.put("skip_jump_probability", i3);
            }
            if (this.Jd == 1) {
                jSONObject.put("hidden_bar", 1);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public static boolean pvs(cR cRVar) {
        if (cRVar == null || !cRVar.SJ() || cRVar.qVe() == null) {
            return false;
        }
        return cRVar.qVe().Jd();
    }
}
