package com.bytedance.sdk.openadsdk.klz.zmn;

import org.json.JSONObject;

/* loaded from: classes4.dex */
public class btk extends com.bytedance.sdk.component.zmn.fb<JSONObject, JSONObject> {
    private JSONObject zmn;

    public btk(JSONObject jSONObject) {
        this.zmn = jSONObject;
    }

    public static void zmn(com.bytedance.sdk.component.zmn.cn cnVar, JSONObject jSONObject) {
        cnVar.zmn("getData", new btk(jSONObject));
    }

    @Override // com.bytedance.sdk.component.zmn.fb
    public JSONObject zmn(String str, JSONObject jSONObject, com.bytedance.sdk.component.zmn.btk btkVar) throws Exception {
        return com.bytedance.sdk.openadsdk.core.iv.fs.zn.zmn(this.zmn, jSONObject);
    }
}
