package com.bytedance.sdk.openadsdk.core.settings;

import com.bytedance.sdk.openadsdk.core.settings.NB;
import com.bytedance.sdk.openadsdk.core.settings.bNS;
import org.json.JSONObject;

/* compiled from: APMSettings.java */
/* loaded from: classes2.dex */
public class pvs extends bNS {
    public pvs() {
        super("tt_set_apm.prop", new bNS.pvs() { // from class: com.bytedance.sdk.openadsdk.core.settings.pvs.1
            @Override // com.bytedance.sdk.openadsdk.core.settings.bNS.pvs
            public void icD() {
            }

            @Override // com.bytedance.sdk.openadsdk.core.settings.bNS.pvs
            public void pvs() {
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.NB
    public void pvs(JSONObject jSONObject) {
        NB.pvs pvs = pvs();
        if (jSONObject.has("apm_url")) {
            pvs.pvs("apm_url", jSONObject.optString("apm_url"));
        }
        if (jSONObject.has("perf_con")) {
            try {
                JSONObject optJSONObject = jSONObject.optJSONObject("perf_con");
                if (optJSONObject != null && optJSONObject.has("perf_con_apm")) {
                    pvs.pvs("perf_con_apm", optJSONObject.optInt("perf_con_apm"));
                }
            } catch (Exception unused) {
            }
        }
        pvs.pvs();
        Jd();
    }
}
