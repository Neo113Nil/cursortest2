package com.bytedance.sdk.openadsdk.mnm.pvs;

import org.json.JSONObject;

/* compiled from: PAGAdViewInfo.java */
/* loaded from: classes2.dex */
public class pvs {
    private final int icD;
    private final int pvs;
    private final float vG;

    public pvs(int i, int i2, float f) {
        this.pvs = i;
        this.icD = i2;
        this.vG = f;
    }

    public static JSONObject pvs(pvs pvsVar) throws Throwable {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", pvsVar.pvs);
        jSONObject.put("height", pvsVar.icD);
        jSONObject.put("alpha", pvsVar.vG);
        return jSONObject;
    }
}
