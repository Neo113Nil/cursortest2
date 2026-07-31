package com.bytedance.sdk.openadsdk.core.mw.hhw;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.iqz;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class zg {
    public void zmn(String str, nqi nqiVar, String str2, Map<String, Object> map) {
        Object obj;
        Object value;
        Object value2;
        if (map != null) {
            try {
                if (map.isEmpty() || (obj = map.get("label")) == null) {
                    return;
                }
                String valueOf = String.valueOf(obj);
                if (TextUtils.isEmpty(valueOf)) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                String ze = nqiVar.ze();
                if ("sendLogExtra".equals(str) && !TextUtils.isEmpty(ze)) {
                    JSONObject jsonObjectInit = PangleNetworkBridge.jsonObjectInit(ze);
                    for (Map.Entry<String, Object> entry : map.entrySet()) {
                        if (!"label".equals(entry.getKey()) && (value2 = entry.getValue()) != null) {
                            jsonObjectInit.put(entry.getKey(), String.valueOf(value2));
                        }
                    }
                    jSONObject.put("log_extra", jsonObjectInit.toString());
                } else {
                    jSONObject.put("log_extra", ze);
                }
                JSONObject jSONObject2 = new JSONObject();
                if ("sendAdExtra".equals(str)) {
                    for (Map.Entry<String, Object> entry2 : map.entrySet()) {
                        if (!"label".equals(entry2.getKey()) && (value = entry2.getValue()) != null) {
                            jSONObject2.put(entry2.getKey(), String.valueOf(value));
                        }
                    }
                }
                jSONObject.put("ad_extra_data", jSONObject2.toString());
                jSONObject.putOpt("ua_policy", Integer.valueOf(nqiVar.mig()));
                com.bytedance.sdk.openadsdk.fb.zn.zmn(nqiVar, "app_union", str2, valueOf, Long.parseLong(nqiVar.ji()), 0L, jSONObject, iqz.zg(nqiVar));
            } catch (Throwable unused) {
            }
        }
    }
}
