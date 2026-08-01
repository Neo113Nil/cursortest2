package com.bytedance.sdk.openadsdk.yiw;

import android.content.Context;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.component.utils.Ju;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.utils.jlb;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.HashMap;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: JsAppAdDownloadManager.java */
/* loaded from: classes2.dex */
public class pvs implements vG {
    private final icD icD;
    private final cR pvs;
    private final Map<String, com.com.bytedance.overseas.sdk.pvs.vG> vG = new HashMap();

    private pvs(icD icd, cR cRVar) {
        this.icD = icd;
        this.pvs = cRVar;
    }

    public static pvs pvs(icD icd, cR cRVar) {
        return new pvs(icd, cRVar);
    }

    @Override // com.bytedance.sdk.openadsdk.yiw.vG
    public void pvs() {
        this.vG.clear();
    }

    private cR pvs(JSONObject jSONObject, String str) {
        String pvs;
        if (jSONObject == null) {
            return null;
        }
        cR vG = cR.vG();
        vG.vG(jSONObject);
        if (!TextUtils.isEmpty(str)) {
            vG.uc(str);
        }
        if (this.pvs == null) {
            return vG;
        }
        String pvs2 = vG.Ca() != null ? vG.Ca().pvs() : null;
        if (TextUtils.isEmpty(pvs2)) {
            return this.pvs;
        }
        com.bytedance.sdk.openadsdk.core.model.vG Ca = this.pvs.Ca();
        if (Ca != null && pvs2.equals(Ca.pvs())) {
            return this.pvs;
        }
        JSONObject jSONObject2 = new JSONObject();
        if (Ca != null) {
            try {
                pvs = Ca.pvs();
            } catch (JSONException unused) {
            }
        } else {
            pvs = AbstractJsonLexerKt.NULL;
        }
        jSONObject2.put("lu", pvs);
        jSONObject2.put("ju", pvs2);
        cR cRVar = this.pvs;
        com.bytedance.sdk.openadsdk.core.Jd.pvs(cRVar, jlb.pvs(cRVar), -5, jSONObject2);
        if (Ca != null && pvs2.contains("play.google.com/store") && !pvs2.contains("referrer")) {
            vG.Ca().pvs(Ca.pvs());
        }
        return vG;
    }

    @Override // com.bytedance.sdk.openadsdk.yiw.vG
    public void pvs(Context context, JSONObject jSONObject, String str, int i, boolean z) {
        JSONObject optJSONObject;
        if (context == null || jSONObject == null || (optJSONObject = jSONObject.optJSONObject("data")) == null) {
            return;
        }
        pvs(context, pvs(optJSONObject, str), optJSONObject, i, z);
    }

    private void pvs(Context context, cR cRVar, JSONObject jSONObject, int i, boolean z) {
        if (context == null || cRVar == null || cRVar.Ca() == null || jSONObject == null || this.icD == null || this.vG.get(cRVar.Ca().pvs()) != null) {
            return;
        }
        String icD = jlb.icD(i);
        if (TextUtils.isEmpty(icD)) {
            return;
        }
        this.vG.put(cRVar.Ca().pvs(), pvs(context, cRVar, jSONObject, icD, z));
    }

    @Override // com.bytedance.sdk.openadsdk.yiw.vG
    public void pvs(Context context, JSONObject jSONObject, String str) {
        cR cRVar;
        if (context == null || (cRVar = this.pvs) == null) {
            return;
        }
        com.com.bytedance.overseas.sdk.pvs.Jd.pvs(context, cRVar, str).Jd();
    }

    @Override // com.bytedance.sdk.openadsdk.yiw.vG
    public void pvs(JSONObject jSONObject) {
        JSONObject optJSONObject;
        if (jSONObject == null || (optJSONObject = jSONObject.optJSONObject("data")) == null) {
            return;
        }
        pvs(pvs(optJSONObject, (String) null), optJSONObject);
    }

    private void pvs(cR cRVar, JSONObject jSONObject) {
        if (this.icD == null || cRVar == null || cRVar.Ca() == null) {
            return;
        }
        String pvs = cRVar.Ca().pvs();
        if (this.vG.containsKey(pvs)) {
            this.vG.remove(pvs);
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(PglCryptUtils.KEY_MESSAGE, FirebaseAnalytics.Param.SUCCESS);
                jSONObject2.put(NotificationCompat.CATEGORY_STATUS, "unsubscribed");
                jSONObject2.put("appad", jSONObject);
                this.icD.pvs("app_ad_event", jSONObject2);
            } catch (JSONException e) {
                Ju.pvs("JsAppAdDownloadManager", e.getMessage());
            }
        }
    }

    private com.com.bytedance.overseas.sdk.pvs.vG pvs(Context context, cR cRVar, JSONObject jSONObject, String str, boolean z) {
        com.com.bytedance.overseas.sdk.pvs.vG pvs = com.com.bytedance.overseas.sdk.pvs.Jd.pvs(context, cRVar, str);
        pvs.pvs(true);
        return pvs;
    }
}
