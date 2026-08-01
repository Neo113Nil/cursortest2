package com.bytedance.sdk.openadsdk.component.Jd;

import com.bytedance.sdk.component.utils.Ju;
import com.bytedance.sdk.openadsdk.Wyp.icD;
import com.bytedance.sdk.openadsdk.Wyp.pvs.Jd;
import com.bytedance.sdk.openadsdk.Wyp.vG;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.core.model.ny;
import com.bytedance.sdk.openadsdk.utils.gA;
import io.ktor.http.ContentDisposition;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: TTAppOpenAdReport.java */
/* loaded from: classes2.dex */
public class pvs {
    public static void pvs(final int i, final int i2) {
        vG.pvs("openad_load_ad_timeout", false, new icD() { // from class: com.bytedance.sdk.openadsdk.component.Jd.pvs.1
            @Override // com.bytedance.sdk.openadsdk.Wyp.icD
            public com.bytedance.sdk.openadsdk.Wyp.pvs.vG getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("timeout_type", i);
                jSONObject.put("user_timeout_time", i2);
                return Jd.icD().pvs("openad_load_ad_timeout").icD(jSONObject.toString());
            }
        });
    }

    public static void pvs(cR cRVar, int i, int i2, float f) {
        JSONObject jSONObject = new JSONObject();
        try {
            pvs(jSONObject, cRVar);
            jSONObject.put("openad_creative_type", cR.NB(cRVar) ? "video_normal_ad" : "image_normal_ad");
            jSONObject.put("skip_time", i);
            jSONObject.put("skip_show_time", i2);
            jSONObject.put("total_time", f);
        } catch (JSONException e) {
            Ju.pvs("TTAppOpenAdReport", "reportSkip json error", e);
        }
        com.bytedance.sdk.openadsdk.icD.vG.pvs(cRVar, "skip", i, jSONObject);
    }

    public static void pvs(cR cRVar, long j, float f, boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            pvs(jSONObject, cRVar);
            jSONObject.put("openad_creative_type", cR.NB(cRVar) ? "video_normal_ad" : "image_normal_ad");
            if (z) {
                double d = f;
                jSONObject.put("video_duration", d);
                jSONObject.put("video_percent", (int) (((j * 1.0d) / 10.0d) / d));
            } else {
                jSONObject.put("image_duration", f);
            }
        } catch (JSONException e) {
            Ju.pvs("TTAppOpenAdReport", "reportDestroy json error", e);
        }
        com.bytedance.sdk.openadsdk.icD.vG.icD(cRVar, "destroy", jSONObject);
    }

    public static void pvs(cR cRVar) {
        com.bytedance.sdk.openadsdk.icD.vG.icD(cRVar, "cache_expire", (JSONObject) null);
    }

    public static void icD(cR cRVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("openad_creative_type", cR.NB(cRVar) ? "video_normal_ad" : "image_normal_ad");
        } catch (JSONException e) {
            Ju.pvs("TTAppOpenAdReport", "reportCacheLoss json error", e);
        }
        com.bytedance.sdk.openadsdk.icD.vG.icD(cRVar, "cache_loss", jSONObject);
    }

    public static void pvs(cR cRVar, long j, boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("order", z ? 1 : 2);
        } catch (JSONException unused) {
        }
        com.bytedance.sdk.openadsdk.icD.vG.pvs(cRVar, "download_image_duration", j, jSONObject);
    }

    public static void icD(cR cRVar, long j, boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ContentDisposition.Parameters.Size, cRVar.od().NB());
            jSONObject.put("video_duration", cRVar.od().sUS());
            jSONObject.put("order", z ? 1 : 2);
        } catch (JSONException unused) {
        }
        com.bytedance.sdk.openadsdk.icD.vG.pvs(cRVar, "download_video_duration", j, jSONObject);
    }

    public static void pvs(cR cRVar, int i, ny nyVar) {
        JSONObject jSONObject = new JSONObject();
        long j = 0;
        try {
            jSONObject.put("openad_creative_type", cR.NB(cRVar) ? "video_normal_ad" : "image_normal_ad");
            jSONObject.put("open_ad_cache_type", i);
            if (nyVar != null) {
                nyVar.icD(gA.pvs());
                pvs(jSONObject, cRVar);
                jSONObject.put("client_start_time", nyVar.icD());
                jSONObject.put("sever_time", nyVar.Jd());
                jSONObject.put("network_time", nyVar.vG());
                jSONObject.put("client_end_time", nyVar.NB());
                jSONObject.put("download_resource_duration", nyVar.yiw());
                jSONObject.put("resource_source", nyVar.so());
                jSONObject.put("is_bidding", nyVar.pvs ? 1 : 0);
                if (nyVar.pvs) {
                    jSONObject.put("load_wait_time", nyVar.icD);
                }
                j = nyVar.sUS();
            }
        } catch (JSONException e) {
            Ju.pvs("TTAppOpenAdReport", "reportLoadNetDuration json error", e);
        }
        com.bytedance.sdk.openadsdk.icD.vG.pvs(cRVar, "load_net_duration", j, jSONObject);
    }

    public static void pvs(cR cRVar, long j) {
        JSONObject jSONObject = new JSONObject();
        try {
            pvs(jSONObject, cRVar);
            jSONObject.put("openad_creative_type", cR.NB(cRVar) ? "video_normal_ad" : "image_normal_ad");
        } catch (JSONException unused) {
            Ju.pvs("TTAppOpenAdReport", "reportLoadCacheDuration json error");
        }
        com.bytedance.sdk.openadsdk.icD.vG.pvs(cRVar, "load_cache_duration", j, jSONObject);
    }

    private static void pvs(JSONObject jSONObject, cR cRVar) {
        int i;
        if (cRVar != null) {
            try {
                if (cRVar.OUT()) {
                    i = 1;
                    jSONObject.put("is_icon_only", i);
                }
            } catch (JSONException e) {
                Ju.pvs("TTAppOpenAdReport", e.getMessage());
                return;
            }
        }
        i = 0;
        jSONObject.put("is_icon_only", i);
    }
}
