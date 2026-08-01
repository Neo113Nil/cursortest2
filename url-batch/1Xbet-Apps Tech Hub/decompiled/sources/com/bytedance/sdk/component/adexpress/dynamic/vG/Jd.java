package com.bytedance.sdk.component.adexpress.dynamic.vG;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DynamicDiffPlugin.java */
/* loaded from: classes.dex */
public class Jd {
    public String Jd;
    public String icD;
    public List<pvs> pvs;
    public String vG;

    /* compiled from: DynamicDiffPlugin.java */
    public static class pvs {
        public JSONObject icD;
        public int pvs;
    }

    public static Jd pvs(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Jd jd = new Jd();
        String optString = jSONObject.optString("custom_components");
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(optString);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    pvs pvsVar = new pvs();
                    pvsVar.pvs = optJSONObject.optInt(FacebookMediationAdapter.KEY_ID);
                    pvsVar.icD = new JSONObject(optJSONObject.optString("componentLayout"));
                    arrayList.add(pvsVar);
                }
            }
        } catch (JSONException unused) {
        }
        jd.pvs = arrayList;
        jd.icD = jSONObject.optString("diff_data");
        jd.vG = jSONObject.optString("style_diff");
        jd.Jd = jSONObject.optString("tag_diff");
        return jd;
    }
}
