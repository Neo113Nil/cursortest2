package com.bytedance.sdk.openadsdk.klz.zmn;

import com.bytedance.sdk.openadsdk.core.fkt;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class hhw extends com.bytedance.sdk.component.zmn.fb<JSONObject, JSONObject> {
    private final WeakReference<fkt> zmn;

    public static void zmn(com.bytedance.sdk.component.zmn.cn cnVar, fkt fktVar) {
        cnVar.zmn("interactiveFinish", new hhw(fktVar));
    }

    @Override // com.bytedance.sdk.component.zmn.fb
    public JSONObject zmn(String str, JSONObject jSONObject, com.bytedance.sdk.component.zmn.btk btkVar) throws Exception {
        JSONObject jSONObject2 = new JSONObject();
        WeakReference<fkt> weakReference = this.zmn;
        if (weakReference != null && weakReference.get() != null) {
            fkt fktVar = this.zmn.get();
            nqi fb = fktVar.fb();
            try {
                boolean z = true;
                int i = 0;
                if (jSONObject.optInt("finish", 1) != 1) {
                    z = false;
                }
                int optInt = jSONObject.optInt("reduce_duration", -1);
                int js = fb != null ? fb.js() : 0;
                if (optInt >= 0 && js >= 0) {
                    optInt = Math.min(optInt, js);
                } else if (optInt < 0) {
                    optInt = js >= 0 ? js : 0;
                }
                if (z) {
                    fktVar.zn(optInt);
                } else {
                    i = -1;
                }
                jSONObject2.put("code", i);
                jSONObject2.put("reduce_duration", optInt);
            } catch (JSONException e) {
                com.bytedance.sdk.component.utils.iqz.zn("InteractiveFinishMethod", e.getMessage());
            }
        }
        return jSONObject2;
    }

    public hhw(fkt fktVar) {
        this.zmn = new WeakReference<>(fktVar);
    }
}
