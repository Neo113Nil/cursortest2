package com.bytedance.sdk.openadsdk.core.settings;

import com.bytedance.sdk.component.utils.phc;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.bytedance.sdk.openadsdk.core.settings.btk;
import com.bytedance.sdk.openadsdk.core.settings.iv;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class zmn extends iv {
    public zmn() {
        super(new iv.zmn() { // from class: com.bytedance.sdk.openadsdk.core.settings.zmn.1
            @Override // com.bytedance.sdk.openadsdk.core.settings.iv.zmn
            public void fs() {
            }

            @Override // com.bytedance.sdk.openadsdk.core.settings.iv.zmn
            public void zmn() {
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.iv
    protected String zmn() {
        try {
            String str = "tt_set_apm.prop";
            if (kgc.zmn() == null || phc.zmn(kgc.zmn())) {
                return str;
            }
            return "tt_set_apm_" + phc.zn(kgc.zmn()) + ".prop";
        } catch (Throwable unused) {
            return "tt_set_apm";
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.btk
    public void zmn(JSONObject jSONObject) {
        btk.zmn fs = fs();
        if (jSONObject.has("apm_url")) {
            fs.zmn("apm_url", jSONObject.optString("apm_url"));
        }
        if (jSONObject.has("perf_con")) {
            try {
                JSONObject optJSONObject = jSONObject.optJSONObject("perf_con");
                if (optJSONObject != null && optJSONObject.has("perf_con_apm")) {
                    fs.zmn("perf_con_apm", optJSONObject.optInt("perf_con_apm"));
                }
            } catch (Exception unused) {
            }
        }
        fs.zmn();
        btk();
    }
}
