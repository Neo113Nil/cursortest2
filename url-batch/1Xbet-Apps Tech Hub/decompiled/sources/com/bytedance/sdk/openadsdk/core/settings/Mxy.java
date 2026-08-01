package com.bytedance.sdk.openadsdk.core.settings;

import android.text.TextUtils;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MediationInitConfigs.java */
/* loaded from: classes2.dex */
public class Mxy {
    public static final Mxy pvs = new Mxy("");
    private final HashMap<String, pvs> icD = new HashMap<>();

    public Mxy(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    pvs pvsVar = new pvs(optJSONObject);
                    this.icD.put(pvsVar.pvs, pvsVar);
                }
            }
        } catch (JSONException e) {
            com.bytedance.sdk.component.utils.Ju.pvs("MediationInitConfigs", e.getMessage());
        }
    }

    /* compiled from: MediationInitConfigs.java */
    public static class pvs {
        public int Jd;
        public String NB;
        public String icD;
        public final String pvs;
        public int vG;

        public pvs(JSONObject jSONObject) {
            this.pvs = jSONObject.optString("name");
            this.icD = jSONObject.optString("app_id");
            this.vG = jSONObject.optInt("init_thread", 2);
            this.Jd = jSONObject.optInt("request_after_init", 2);
            this.NB = jSONObject.optString("class_name");
        }
    }
}
