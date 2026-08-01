package com.bytedance.sdk.openadsdk.core.settings;

import com.bytedance.sdk.openadsdk.core.settings.NB;
import org.json.JSONObject;

/* compiled from: MediationInitSettings.java */
/* loaded from: classes2.dex */
public class Wyp extends bNS {
    public Wyp() {
        super("tt_set_mediation.prop", null);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.NB
    public void pvs(JSONObject jSONObject) {
        if (jSONObject.has("mediation_init_conf")) {
            NB.pvs pvs = pvs();
            pvs.pvs("mediation_init_conf", jSONObject.optString("mediation_init_conf"));
            pvs.pvs();
            Jd();
        }
    }
}
