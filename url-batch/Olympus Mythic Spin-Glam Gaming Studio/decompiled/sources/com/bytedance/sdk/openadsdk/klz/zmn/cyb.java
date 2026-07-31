package com.bytedance.sdk.openadsdk.klz.zmn;

import com.bytedance.sdk.openadsdk.core.fkt;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class cyb extends com.bytedance.sdk.component.zmn.fb<JSONObject, JSONObject> {
    private final fkt zmn;

    public cyb(fkt fktVar) {
        this.zmn = fktVar;
    }

    public static void zmn(com.bytedance.sdk.component.zmn.cn cnVar, fkt fktVar) {
        cnVar.zmn("commonConvert", new cyb(fktVar));
    }

    @Override // com.bytedance.sdk.component.zmn.fb
    public JSONObject zmn(String str, JSONObject jSONObject, com.bytedance.sdk.component.zmn.btk btkVar) throws Exception {
        this.zmn.hhw(jSONObject);
        return null;
    }
}
