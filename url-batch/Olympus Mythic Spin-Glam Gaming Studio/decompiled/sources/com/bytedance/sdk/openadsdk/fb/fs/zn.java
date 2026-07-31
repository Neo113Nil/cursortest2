package com.bytedance.sdk.openadsdk.fb.fs;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class zn implements fs {
    fs zmn;

    @Override // com.bytedance.sdk.openadsdk.fb.fs.fs
    public void zmn(JSONObject jSONObject, long j) throws JSONException {
        fs fsVar = this.zmn;
        if (fsVar != null) {
            fsVar.zmn(jSONObject, j);
        }
        if (j <= 0) {
            j = System.currentTimeMillis();
        }
        jSONObject.put("event_ts", j);
    }
}
