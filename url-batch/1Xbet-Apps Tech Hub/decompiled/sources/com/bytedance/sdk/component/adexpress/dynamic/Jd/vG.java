package com.bytedance.sdk.component.adexpress.dynamic.Jd;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.dynamic.vG.Jd;
import io.ktor.http.LinkHeader;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: CustomComponentManager.java */
/* loaded from: classes.dex */
public class vG {
    public JSONObject pvs(List<Jd.pvs> list, int i, JSONObject jSONObject) {
        Jd.pvs pvsVar;
        JSONObject jSONObject2;
        if (list == null || list.size() <= 0) {
            return null;
        }
        Iterator<Jd.pvs> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                pvsVar = null;
                break;
            }
            pvsVar = it.next();
            if (pvsVar != null && pvsVar.pvs == i) {
                break;
            }
        }
        if (pvsVar == null || (jSONObject2 = pvsVar.icD) == null) {
            return null;
        }
        return pvs(jSONObject2, jSONObject);
    }

    private static JSONObject pvs(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3 = new JSONObject();
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("customComponentDefaultValues");
            JSONObject optJSONObject2 = jSONObject.optJSONObject("values");
            Iterator<String> keys = optJSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                optJSONObject.put(next, optJSONObject2.opt(next));
            }
            Iterator<String> keys2 = jSONObject.keys();
            while (keys2.hasNext()) {
                String next2 = keys2.next();
                if (!TextUtils.equals(next2, "customComponentDefaultValues")) {
                    if (TextUtils.equals(next2, "values")) {
                        jSONObject3.put(next2, optJSONObject);
                    } else {
                        jSONObject3.put(next2, jSONObject.opt(next2));
                    }
                }
            }
            jSONObject3.put(LinkHeader.Parameters.Type, "vessel");
            JSONObject optJSONObject3 = jSONObject2.optJSONObject("values");
            JSONObject optJSONObject4 = jSONObject3.optJSONObject("values");
            if (optJSONObject3 != null && optJSONObject4 != null) {
                Iterator<String> keys3 = optJSONObject3.keys();
                while (keys3.hasNext()) {
                    String next3 = keys3.next();
                    if (!"clickArea".equals(next3)) {
                        optJSONObject4.put(next3, optJSONObject3.opt(next3));
                    }
                }
            }
        } catch (JSONException unused) {
        }
        return jSONObject3;
    }
}
