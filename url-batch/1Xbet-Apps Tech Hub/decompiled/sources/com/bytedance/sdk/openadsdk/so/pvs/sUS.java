package com.bytedance.sdk.openadsdk.so.pvs;

import com.bytedance.sdk.component.pvs.vA;
import com.bytedance.sdk.openadsdk.core.CvL;
import org.json.JSONObject;

/* compiled from: OneSlotMultipleAdJSMethod.java */
/* loaded from: classes2.dex */
public class sUS extends com.bytedance.sdk.component.pvs.NB<JSONObject, JSONObject> {
    private final String icD;
    private final CvL pvs;

    public sUS(CvL cvL, String str) {
        this.pvs = cvL;
        this.icD = str;
    }

    public static void pvs(vA vAVar, CvL cvL) {
        vAVar.pvs("endcardDynamicCreatives", new sUS(cvL, "endcardDynamicCreatives"));
        vAVar.pvs("multiOpenCovert", new sUS(cvL, "multiOpenCovert"));
    }

    @Override // com.bytedance.sdk.component.pvs.NB
    public JSONObject pvs(JSONObject jSONObject, com.bytedance.sdk.component.pvs.sUS sus) throws Exception {
        if ("endcardDynamicCreatives".equals(this.icD)) {
            return this.pvs.NB(jSONObject);
        }
        if (!"multiOpenCovert".equals(this.icD)) {
            return null;
        }
        this.pvs.sUS(jSONObject);
        return null;
    }
}
