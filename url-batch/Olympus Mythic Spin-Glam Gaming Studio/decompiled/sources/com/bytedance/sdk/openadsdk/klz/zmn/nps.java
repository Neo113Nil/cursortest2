package com.bytedance.sdk.openadsdk.klz.zmn;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.openadsdk.core.fkt;
import com.ironsource.X3;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class nps extends com.bytedance.sdk.component.zmn.fb<JSONObject, JSONObject> {
    private final String fs;
    private final fkt zmn;

    public nps(String str, fkt fktVar) {
        this.zmn = fktVar;
        this.fs = str;
    }

    public static void zmn(com.bytedance.sdk.component.zmn.cn cnVar, fkt fktVar) {
        cnVar.zmn("appInfo", new nps("appInfo", fktVar));
        cnVar.zmn("adInfo", new nps("adInfo", fktVar));
        cnVar.zmn("sendLog", new nps("sendLog", fktVar));
        cnVar.zmn("playable_style", new nps("playable_style", fktVar));
        cnVar.zmn("getTemplateInfo", new nps("getTemplateInfo", fktVar));
        cnVar.zmn("getTeMaiAds", new nps("getTeMaiAds", fktVar));
        cnVar.zmn(X3.i.o, new nps(X3.i.o, fktVar));
        cnVar.zmn("getScreenSize", new nps("getScreenSize", fktVar));
        cnVar.zmn("getCloseButtonInfo", new nps("getCloseButtonInfo", fktVar));
        cnVar.zmn("getVolume", new nps("getVolume", fktVar));
        cnVar.zmn("removeLoading", new nps("removeLoading", fktVar));
        cnVar.zmn("sendReward", new nps("sendReward", fktVar));
        cnVar.zmn("subscribe_app_ad", new nps("subscribe_app_ad", fktVar));
        cnVar.zmn("download_app_ad", new nps("download_app_ad", fktVar));
        cnVar.zmn("cancel_download_app_ad", new nps("cancel_download_app_ad", fktVar));
        cnVar.zmn("unsubscribe_app_ad", new nps("unsubscribe_app_ad", fktVar));
        cnVar.zmn("landscape_click", new nps("landscape_click", fktVar));
        cnVar.zmn("clickEvent", new nps("clickEvent", fktVar));
        cnVar.zmn("renderDidFinish", new nps("renderDidFinish", fktVar));
        cnVar.zmn("dynamicTrack", new nps("dynamicTrack", fktVar));
        cnVar.zmn("skipVideo", new nps("skipVideo", fktVar));
        cnVar.zmn("muteVideo", new nps("muteVideo", fktVar));
        cnVar.zmn("changeVideoState", new nps("changeVideoState", fktVar));
        cnVar.zmn("getCurrentVideoState", new nps("getCurrentVideoState", fktVar));
        cnVar.zmn("send_temai_product_ids", new nps("send_temai_product_ids", fktVar));
        cnVar.zmn("getMaterialMeta", new nps("getMaterialMeta", fktVar));
        cnVar.zmn("endcard_load", new nps("endcard_load", fktVar));
        cnVar.zmn("pauseWebView", new nps("pauseWebView", fktVar));
        cnVar.zmn("pauseWebViewTimers", new nps("pauseWebViewTimers", fktVar));
        cnVar.zmn("webview_time_track", new nps("webview_time_track", fktVar));
        cnVar.zmn("openPrivacy", new nps("openPrivacy", fktVar));
        cnVar.zmn("openAdLandPageLinks", new nps("openAdLandPageLinks", fktVar));
        cnVar.zmn("getNativeSiteCustomData", new nps("getNativeSiteCustomData", fktVar));
        cnVar.zmn("close", new nps("close", fktVar));
    }

    @Override // com.bytedance.sdk.component.zmn.fb
    @Nullable
    public JSONObject zmn(String str, @NonNull JSONObject jSONObject, @NonNull com.bytedance.sdk.component.zmn.btk btkVar) throws Exception {
        fkt.fs fsVar = new fkt.fs();
        fsVar.zmn = NotificationCompat.CATEGORY_CALL;
        fsVar.zn = this.fs;
        fsVar.fb = jSONObject;
        return this.zmn.zmn(fsVar, 3);
    }
}
