package com.bytedance.sdk.openadsdk.so.pvs;

import com.bytedance.sdk.component.pvs.vA;
import com.bytedance.sdk.component.utils.Ju;
import com.bytedance.sdk.openadsdk.core.CvL;
import com.bytedance.sdk.openadsdk.core.model.cR;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: InteractiveFinishMethod.java */
/* loaded from: classes2.dex */
public class Jd extends com.bytedance.sdk.component.pvs.NB<JSONObject, JSONObject> {
    private final WeakReference<CvL> pvs;

    public static void pvs(vA vAVar, CvL cvL) {
        vAVar.pvs("interactiveFinish", new Jd(cvL));
    }

    @Override // com.bytedance.sdk.component.pvs.NB
    public JSONObject pvs(JSONObject jSONObject, com.bytedance.sdk.component.pvs.sUS sus) throws Exception {
        JSONObject jSONObject2 = new JSONObject();
        WeakReference<CvL> weakReference = this.pvs;
        if (weakReference != null && weakReference.get() != null) {
            CvL cvL = this.pvs.get();
            cR vG = cvL.vG();
            try {
                boolean z = true;
                int i = 0;
                if (jSONObject.optInt("finish", 1) != 1) {
                    z = false;
                }
                int optInt = jSONObject.optInt("reduce_duration", -1);
                int ABo = vG != null ? vG.ABo() : 0;
                if (optInt >= 0 && ABo >= 0) {
                    optInt = Math.min(optInt, ABo);
                } else if (optInt < 0) {
                    optInt = ABo >= 0 ? ABo : 0;
                }
                if (z) {
                    cvL.vG(optInt);
                } else {
                    i = -1;
                }
                jSONObject2.put("code", i);
                jSONObject2.put("reduce_duration", optInt);
            } catch (JSONException e) {
                Ju.pvs("InteractiveFinishMethod", e.getMessage());
            }
        }
        return jSONObject2;
    }

    public Jd(CvL cvL) {
        this.pvs = new WeakReference<>(cvL);
    }
}
