package com.bytedance.sdk.component.adexpress.dynamic.fb;

import com.safedk.android.internal.partials.PangleNetworkBridge;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class fb {
    public String fb;
    public String fs;
    public List<zmn> zmn;
    public String zn;

    public static class zmn {
        public JSONObject fs;
        public int zmn;
    }

    public static fb zmn(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        fb fbVar = new fb();
        String optString = jSONObject.optString("custom_components");
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(optString);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    zmn zmnVar = new zmn();
                    zmnVar.zmn = optJSONObject.optInt("id");
                    zmnVar.fs = PangleNetworkBridge.jsonObjectInit(optJSONObject.optString("componentLayout"));
                    arrayList.add(zmnVar);
                }
            }
        } catch (JSONException unused) {
        }
        fbVar.zmn = arrayList;
        fbVar.fs = jSONObject.optString("diff_data");
        fbVar.zn = jSONObject.optString("style_diff");
        fbVar.fb = jSONObject.optString("tag_diff");
        return fbVar;
    }
}
