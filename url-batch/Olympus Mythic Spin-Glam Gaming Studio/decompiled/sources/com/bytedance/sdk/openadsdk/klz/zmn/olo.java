package com.bytedance.sdk.openadsdk.klz.zmn;

import com.bytedance.sdk.openadsdk.core.fkt;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class olo extends com.bytedance.sdk.component.zmn.fb<JSONObject, JSONObject> {
    private fkt zmn;

    public olo(fkt fktVar) {
        this.zmn = fktVar;
    }

    public static void zmn(com.bytedance.sdk.component.zmn.cn cnVar, fkt fktVar) {
        cnVar.zmn("sendLogV3", new olo(fktVar));
    }

    @Override // com.bytedance.sdk.component.zmn.fb
    public JSONObject zmn(String str, JSONObject jSONObject, com.bytedance.sdk.component.zmn.btk btkVar) throws Exception {
        this.zmn.klz(jSONObject);
        return null;
    }
}
