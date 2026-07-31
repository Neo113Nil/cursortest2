package com.bytedance.sdk.openadsdk.klz.zmn;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.openadsdk.core.fkt;
import com.ironsource.X3;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class zg extends com.bytedance.sdk.component.zmn.kgc<JSONObject, JSONObject> {
    public static final HashSet<String> zmn = new HashSet<>(Arrays.asList("appInfo", "adInfo", "sendLog", "playable_style", "getTemplateInfo", "getTeMaiAds", X3.i.o, "getScreenSize", "getCloseButtonInfo", "getVolume", "removeLoading", "sendReward", "subscribe_app_ad", "download_app_ad", "cancel_download_app_ad", "unsubscribe_app_ad", "landscape_click", "clickEvent", "renderDidFinish", "dynamicTrack", "skipVideo", "muteVideo", "changeVideoState", "getCurrentVideoState", "send_temai_product_ids", "getMaterialMeta", "endcard_load", "pauseWebView", "pauseWebViewTimers", "webview_time_track", "getDownloadStatus", "openPrivacy", "openAdLandPageLinks", "getNativeSiteCustomData", "close"));
    private final fkt fs;

    public zg(fkt fktVar) {
        this.fs = fktVar;
    }

    public static void zmn(com.bytedance.sdk.component.zmn.cn cnVar, fkt fktVar) {
        cnVar.zmn(zmn, new zg(fktVar));
    }

    @Override // com.bytedance.sdk.component.zmn.fb
    @Nullable
    public JSONObject zmn(String str, @NonNull JSONObject jSONObject, @NonNull com.bytedance.sdk.component.zmn.btk btkVar) throws Exception {
        fkt.fs fsVar = new fkt.fs();
        fsVar.zmn = NotificationCompat.CATEGORY_CALL;
        fsVar.zn = str;
        fsVar.fb = jSONObject;
        return this.fs.zmn(fsVar, 3);
    }
}
