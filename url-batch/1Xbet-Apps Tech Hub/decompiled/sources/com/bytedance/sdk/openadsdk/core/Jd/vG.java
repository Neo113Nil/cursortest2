package com.bytedance.sdk.openadsdk.core.Jd;

import com.bytedance.sdk.component.yiw.icD.Jd;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.utils.jlb;
import io.ktor.http.LinkHeader;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: FrequentCallEventHelper.java */
/* loaded from: classes2.dex */
public class vG {
    public static void pvs(String str, long j) {
        JSONObject icD = icD(str, j);
        Jd icD2 = com.bytedance.sdk.openadsdk.qh.vG.pvs().icD().icD();
        icD2.icD(jlb.Jd("/api/ad/union/sdk/stats/"));
        icD2.Jd(icD.toString());
        icD2.pvs(6);
        icD2.pvs("uploadFrequentEvent");
        icD2.pvs(new com.bytedance.sdk.component.yiw.pvs.pvs() { // from class: com.bytedance.sdk.openadsdk.core.Jd.vG.1
            @Override // com.bytedance.sdk.component.yiw.pvs.pvs
            public void pvs(com.bytedance.sdk.component.yiw.icD.vG vGVar, com.bytedance.sdk.component.yiw.icD icd) {
            }

            @Override // com.bytedance.sdk.component.yiw.pvs.pvs
            public void pvs(com.bytedance.sdk.component.yiw.icD.vG vGVar, IOException iOException) {
                iOException.getMessage();
            }
        });
    }

    private static JSONObject icD(String str, long j) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(LinkHeader.Parameters.Type, "over_freq");
            jSONObject.put("rit", str);
            jSONObject.put("ad_sdk_version", BuildConfig.VERSION_NAME);
            jSONObject.put("timestamp", j);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
