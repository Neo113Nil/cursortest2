package com.bytedance.sdk.openadsdk.so.pvs;

import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.component.pvs.vA;
import com.bytedance.sdk.openadsdk.core.CvL;
import org.json.JSONObject;

/* compiled from: OldBridgeSyncMethod.java */
/* loaded from: classes2.dex */
public class NB extends com.bytedance.sdk.component.pvs.NB<JSONObject, JSONObject> {
    private final CvL icD;
    private final String pvs;

    public NB(String str, CvL cvL) {
        this.icD = cvL;
        this.pvs = str;
    }

    public static void pvs(vA vAVar, CvL cvL) {
        vAVar.pvs("appInfo", new NB("appInfo", cvL));
        vAVar.pvs("adInfo", new NB("adInfo", cvL));
        vAVar.pvs("sendLog", new NB("sendLog", cvL));
        vAVar.pvs("playable_style", new NB("playable_style", cvL));
        vAVar.pvs("getTemplateInfo", new NB("getTemplateInfo", cvL));
        vAVar.pvs("getTeMaiAds", new NB("getTeMaiAds", cvL));
        vAVar.pvs("isViewable", new NB("isViewable", cvL));
        vAVar.pvs("getScreenSize", new NB("getScreenSize", cvL));
        vAVar.pvs("getCloseButtonInfo", new NB("getCloseButtonInfo", cvL));
        vAVar.pvs("getVolume", new NB("getVolume", cvL));
        vAVar.pvs("removeLoading", new NB("removeLoading", cvL));
        vAVar.pvs("sendReward", new NB("sendReward", cvL));
        vAVar.pvs("subscribe_app_ad", new NB("subscribe_app_ad", cvL));
        vAVar.pvs("download_app_ad", new NB("download_app_ad", cvL));
        vAVar.pvs("cancel_download_app_ad", new NB("cancel_download_app_ad", cvL));
        vAVar.pvs("unsubscribe_app_ad", new NB("unsubscribe_app_ad", cvL));
        vAVar.pvs("landscape_click", new NB("landscape_click", cvL));
        vAVar.pvs("clickEvent", new NB("clickEvent", cvL));
        vAVar.pvs("renderDidFinish", new NB("renderDidFinish", cvL));
        vAVar.pvs("dynamicTrack", new NB("dynamicTrack", cvL));
        vAVar.pvs("skipVideo", new NB("skipVideo", cvL));
        vAVar.pvs("muteVideo", new NB("muteVideo", cvL));
        vAVar.pvs("changeVideoState", new NB("changeVideoState", cvL));
        vAVar.pvs("getCurrentVideoState", new NB("getCurrentVideoState", cvL));
        vAVar.pvs("send_temai_product_ids", new NB("send_temai_product_ids", cvL));
        vAVar.pvs("getMaterialMeta", new NB("getMaterialMeta", cvL));
        vAVar.pvs("endcard_load", new NB("endcard_load", cvL));
        vAVar.pvs("pauseWebView", new NB("pauseWebView", cvL));
        vAVar.pvs("pauseWebViewTimers", new NB("pauseWebViewTimers", cvL));
        vAVar.pvs("webview_time_track", new NB("webview_time_track", cvL));
        vAVar.pvs("openPrivacy", new NB("openPrivacy", cvL));
        vAVar.pvs("openAdLandPageLinks", new NB("openAdLandPageLinks", cvL));
        vAVar.pvs("getNativeSiteCustomData", new NB("getNativeSiteCustomData", cvL));
        vAVar.pvs("close", new NB("close", cvL));
    }

    @Override // com.bytedance.sdk.component.pvs.NB
    public JSONObject pvs(JSONObject jSONObject, com.bytedance.sdk.component.pvs.sUS sus) throws Exception {
        CvL.icD icd = new CvL.icD();
        icd.pvs = NotificationCompat.CATEGORY_CALL;
        icd.vG = this.pvs;
        icd.Jd = jSONObject;
        return this.icD.pvs(icd, 3);
    }
}
