package com.bytedance.sdk.openadsdk.so.pvs;

import com.bytedance.sdk.component.pvs.vA;
import com.bytedance.sdk.openadsdk.core.CvL;
import org.json.JSONObject;

/* compiled from: PlayableEndCardOverlayMethod.java */
/* loaded from: classes2.dex */
public class yiw extends com.bytedance.sdk.component.pvs.NB<JSONObject, JSONObject> {
    private final CvL pvs;

    public yiw(CvL cvL) {
        this.pvs = cvL;
    }

    public static void pvs(vA vAVar, CvL cvL) {
        vAVar.pvs("overlayRenderFinish", new yiw(cvL));
    }

    @Override // com.bytedance.sdk.component.pvs.NB
    public JSONObject pvs(JSONObject jSONObject, com.bytedance.sdk.component.pvs.sUS sus) throws Exception {
        this.pvs.kj();
        return null;
    }
}
