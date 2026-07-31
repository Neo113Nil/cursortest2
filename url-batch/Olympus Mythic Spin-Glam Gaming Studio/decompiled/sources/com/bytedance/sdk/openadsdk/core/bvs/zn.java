package com.bytedance.sdk.openadsdk.core.bvs;

import com.bytedance.sdk.component.nps.fs.fb;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.utils.nqi;
import com.bytedance.sdk.openadsdk.utils.oub;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class zn {
    public static void zmn(String str, long j) {
        JSONObject fs = fs(str, j);
        fb fs2 = com.bytedance.sdk.openadsdk.iqz.fs.fs().zn().fs();
        fs2.zn(oub.fb("/api/ad/union/sdk/stats/"));
        fs2.btk(fs.toString());
        fs2.zmn(6);
        fs2.fs("uploadFrequentEvent");
        fs2.fs(new com.bytedance.sdk.component.nps.zmn.zmn() { // from class: com.bytedance.sdk.openadsdk.core.bvs.zn.1
            @Override // com.bytedance.sdk.component.nps.zmn.zmn
            public void zmn(com.bytedance.sdk.component.nps.fs.zn znVar, com.bytedance.sdk.component.nps.fs fsVar) {
            }

            @Override // com.bytedance.sdk.component.nps.zmn.zmn
            public void zmn(com.bytedance.sdk.component.nps.fs.zn znVar, IOException iOException) {
                iOException.getMessage();
                if (znVar != null) {
                    nqi.zmn(znVar.hhw());
                }
            }
        });
    }

    private static JSONObject fs(String str, long j) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", "over_freq");
            jSONObject.put("rit", str);
            jSONObject.put("ad_sdk_version", BuildConfig.VERSION_NAME);
            jSONObject.put("timestamp", j);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
