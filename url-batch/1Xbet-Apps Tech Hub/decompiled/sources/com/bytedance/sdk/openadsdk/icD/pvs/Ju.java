package com.bytedance.sdk.openadsdk.icD.pvs;

import android.text.TextUtils;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.analytics.FirebaseAnalytics;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: TrackLinkResultSendListener.java */
/* loaded from: classes2.dex */
public class Ju implements com.bytedance.sdk.openadsdk.Wyp.icD {
    private final boolean icD;
    private final com.bytedance.sdk.component.sUS.pvs.sUS.Jd pvs;

    public Ju(boolean z, com.bytedance.sdk.component.sUS.pvs.sUS.Jd jd) {
        this.pvs = jd;
        this.icD = z;
    }

    @Override // com.bytedance.sdk.openadsdk.Wyp.icD
    public com.bytedance.sdk.openadsdk.Wyp.pvs.vG getLogStats() throws Exception {
        int i;
        if (this.pvs == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(FirebaseAnalytics.Param.SUCCESS, this.icD);
        jSONObject.put(ImagesContract.URL, this.pvs.icD());
        int Jd = this.pvs.Jd();
        if (Jd <= 0) {
            Jd = 0;
        }
        jSONObject.put("retry_times", Jd);
        jSONObject.put("ad_id", this.pvs.sUS());
        jSONObject.put("track_type", this.pvs.NB());
        if (!this.icD) {
            i = 4;
        } else if (this.pvs.Wyp()) {
            i = 3;
        } else {
            i = this.pvs.Jd() <= 0 ? 1 : 2;
        }
        jSONObject.put("upload_scene", i);
        String yiw = this.pvs.yiw();
        if (!TextUtils.isEmpty(yiw)) {
            JSONArray jSONArray = new JSONArray();
            for (String str : yiw.split(",")) {
                jSONArray.put(str);
            }
            jSONObject.put("error_code", jSONArray);
        }
        String Mxy = this.pvs.Mxy();
        if (!TextUtils.isEmpty(Mxy)) {
            JSONArray jSONArray2 = new JSONArray();
            for (String str2 : Mxy.split(",")) {
                jSONArray2.put(str2);
            }
            jSONObject.put("error_msg", jSONArray2);
        }
        return com.bytedance.sdk.openadsdk.Wyp.pvs.Jd.icD().pvs("track_link_result").icD(jSONObject.toString());
    }
}
