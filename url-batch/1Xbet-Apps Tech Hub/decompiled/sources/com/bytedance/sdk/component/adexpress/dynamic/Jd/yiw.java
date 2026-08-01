package com.bytedance.sdk.component.adexpress.dynamic.Jd;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.component.adexpress.icD.Ju;
import org.json.JSONObject;

/* compiled from: DynamicNativeParser.java */
/* loaded from: classes.dex */
public class yiw implements so {
    private com.bytedance.sdk.component.adexpress.dynamic.NB.icD pvs;

    @Override // com.bytedance.sdk.component.adexpress.dynamic.Jd.so
    public void pvs(com.bytedance.sdk.component.adexpress.dynamic.NB.icD icd) {
        this.pvs = icd;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.Jd.so
    public void pvs(final Ju ju) {
        if (ju.kj() == 1) {
            icD(ju);
        } else {
            com.bytedance.sdk.component.adexpress.Jd.vG.pvs(new com.bytedance.sdk.component.so.so("dynamicparse") { // from class: com.bytedance.sdk.component.adexpress.dynamic.Jd.yiw.1
                @Override // java.lang.Runnable
                public void run() {
                    yiw.this.icD(ju);
                }
            }, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void icD(Ju ju) {
        try {
            JSONObject vG = ju.vG();
            JSONObject jSONObject = new JSONObject(vG.optString("template_Plugin"));
            JSONObject optJSONObject = vG.optJSONObject("creative");
            com.bytedance.sdk.component.adexpress.dynamic.vG.so pvs = new sUS(jSONObject, optJSONObject, vG.optJSONObject("AdSize"), new JSONObject(vG.optString("diff_template_Plugin"))).pvs(ju.icD(), ju.Wyp(), optJSONObject.optDouble("score_exact_i18n"), optJSONObject.optString("comment_num_i18n"), ju);
            try {
                JSONObject jSONObject2 = new JSONObject(optJSONObject.optString("dynamic_creative"));
                pvs.pvs(jSONObject2.optString(TypedValues.Custom.S_COLOR));
                pvs.pvs(jSONObject2.optJSONArray("material_center"));
            } catch (Throwable unused) {
            }
            this.pvs.pvs(pvs);
        } catch (Exception unused2) {
        }
    }
}
