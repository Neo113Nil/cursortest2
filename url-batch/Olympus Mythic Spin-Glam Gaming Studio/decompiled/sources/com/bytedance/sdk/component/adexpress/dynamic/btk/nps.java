package com.bytedance.sdk.component.adexpress.dynamic.btk;

import com.bytedance.sdk.component.adexpress.fs.mw;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class nps implements zg {
    private com.bytedance.sdk.component.adexpress.dynamic.hhw.fs zmn;

    @Override // com.bytedance.sdk.component.adexpress.dynamic.btk.zg
    public void zmn(com.bytedance.sdk.component.adexpress.dynamic.hhw.fs fsVar) {
        this.zmn = fsVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.btk.zg
    public void zmn(final mw mwVar) {
        if (mwVar.klz() == 1) {
            fs(mwVar);
        } else {
            com.bytedance.sdk.component.adexpress.fb.fb.zmn(new com.bytedance.sdk.component.zg.fs.zn("dynamicparse") { // from class: com.bytedance.sdk.component.adexpress.dynamic.btk.nps.1
                @Override // java.lang.Runnable
                public void run() {
                    nps.this.fs(mwVar);
                }
            }, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fs(mw mwVar) {
        try {
            JSONObject zn = mwVar.zn();
            JSONObject jsonObjectInit = PangleNetworkBridge.jsonObjectInit(zn.optString("template_Plugin"));
            JSONObject optJSONObject = zn.optJSONObject("creative");
            com.bytedance.sdk.component.adexpress.dynamic.fb.zg zmn = new hhw(jsonObjectInit, optJSONObject, zn.optJSONObject("AdSize"), PangleNetworkBridge.jsonObjectInit(zn.optString("diff_template_Plugin"))).zmn(mwVar.fs(), mwVar.iv(), optJSONObject.optDouble("score_exact_i18n"), optJSONObject.optString("comment_num_i18n"), mwVar);
            try {
                JSONObject jsonObjectInit2 = PangleNetworkBridge.jsonObjectInit(optJSONObject.optString("dynamic_creative"));
                zmn.zmn(jsonObjectInit2.optString("color"));
                zmn.zmn(jsonObjectInit2.optJSONArray("material_center"));
            } catch (Throwable unused) {
            }
            this.zmn.zmn(zmn);
        } catch (Exception unused2) {
        }
    }
}
