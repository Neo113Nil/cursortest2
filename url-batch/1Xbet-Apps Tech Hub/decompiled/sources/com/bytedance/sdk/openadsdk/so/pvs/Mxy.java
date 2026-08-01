package com.bytedance.sdk.openadsdk.so.pvs;

import com.bytedance.sdk.component.pvs.vA;
import com.bytedance.sdk.openadsdk.core.CvL;
import org.json.JSONObject;

/* compiled from: SendCommerceLandingPageMeta.java */
/* loaded from: classes2.dex */
public class Mxy extends com.bytedance.sdk.component.pvs.NB<JSONObject, JSONObject> {
    private final CvL pvs;

    public Mxy(CvL cvL) {
        this.pvs = cvL;
    }

    public static void pvs(vA vAVar, CvL cvL) {
        vAVar.pvs("commonConvert", new Mxy(cvL));
    }

    @Override // com.bytedance.sdk.component.pvs.NB
    public JSONObject pvs(JSONObject jSONObject, com.bytedance.sdk.component.pvs.sUS sus) throws Exception {
        this.pvs.Jd(jSONObject);
        return null;
    }
}
