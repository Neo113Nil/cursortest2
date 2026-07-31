package com.bytedance.sdk.openadsdk.klz.zmn;

import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class mw extends com.bytedance.sdk.component.zmn.fb<JSONObject, JSONObject> {
    private WeakReference<com.bytedance.sdk.component.bvs.nps> zmn;

    public static void zmn(com.bytedance.sdk.component.zmn.cn cnVar, com.bytedance.sdk.component.bvs.nps npsVar) {
        cnVar.zmn("preventTouchEvent", new mw(npsVar));
    }

    public mw(com.bytedance.sdk.component.bvs.nps npsVar) {
        this.zmn = new WeakReference<>(npsVar);
    }

    @Override // com.bytedance.sdk.component.zmn.fb
    public JSONObject zmn(String str, JSONObject jSONObject, com.bytedance.sdk.component.zmn.btk btkVar) throws Exception {
        JSONObject jSONObject2 = new JSONObject();
        try {
            boolean optBoolean = jSONObject.optBoolean("isPrevent", false);
            com.bytedance.sdk.component.bvs.nps npsVar = this.zmn.get();
            if (npsVar != null) {
                npsVar.setIsPreventTouchEvent(optBoolean);
                jSONObject2.put("success", true);
            } else {
                jSONObject2.put("success", false);
            }
        } catch (Throwable unused) {
            jSONObject2.put("success", false);
        }
        return jSONObject2;
    }
}
