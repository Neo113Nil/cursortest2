package com.bytedance.sdk.openadsdk.klz.zmn;

import com.bytedance.sdk.openadsdk.core.fkt;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class fb extends com.bytedance.sdk.component.zmn.fb<JSONObject, JSONObject> {
    private final fkt zmn;

    public fb(fkt fktVar) {
        this.zmn = fktVar;
    }

    public static void zmn(com.bytedance.sdk.component.zmn.cn cnVar, fkt fktVar) {
        cnVar.zmn("expressAdViewStartZoom", new fb(fktVar));
    }

    @Override // com.bytedance.sdk.component.zmn.fb
    public JSONObject zmn(String str, JSONObject jSONObject, com.bytedance.sdk.component.zmn.btk btkVar) throws Exception {
        this.zmn.fb(jSONObject);
        return null;
    }
}
