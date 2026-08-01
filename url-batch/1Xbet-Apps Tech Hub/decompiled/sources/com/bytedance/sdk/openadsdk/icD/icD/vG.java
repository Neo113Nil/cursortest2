package com.bytedance.sdk.openadsdk.icD.icD;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: EventStartListenerWrapper.java */
/* loaded from: classes2.dex */
public class vG implements icD {
    icD pvs;

    @Override // com.bytedance.sdk.openadsdk.icD.icD.icD
    public void pvs(JSONObject jSONObject, long j) throws JSONException {
        icD icd = this.pvs;
        if (icd != null) {
            icd.pvs(jSONObject, j);
        }
        if (j <= 0) {
            j = System.currentTimeMillis();
        }
        jSONObject.put("event_ts", j);
    }
}
