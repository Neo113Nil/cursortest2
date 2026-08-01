package com.bytedance.sdk.openadsdk.api.init;

import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;
import androidx.work.WorkRequest;
import com.bytedance.sdk.component.adexpress.pvs.icD.icD;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.api.init.PAGConfig;
import com.bytedance.sdk.openadsdk.api.init.PAGSdk;
import com.bytedance.sdk.openadsdk.core.Ju;
import com.bytedance.sdk.openadsdk.core.NB.vG;
import com.bytedance.sdk.openadsdk.core.act.pvs;
import com.bytedance.sdk.openadsdk.core.mnm;
import com.bytedance.sdk.openadsdk.core.qh;
import com.bytedance.sdk.openadsdk.core.so;
import com.bytedance.sdk.openadsdk.icD.pvs.Jd;
import com.bytedance.sdk.openadsdk.utils.Pj;
import com.bytedance.sdk.openadsdk.utils.dX;
import com.bytedance.sdk.openadsdk.utils.rCZ;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class PAGInitHelper {
    public static final List<PAGSdk.PAGInitCallback> CALLBACK_LIST = new ArrayList();
    public static float animationScale = 1.0f;

    public static void maybeAsyncInitTask(final Context context) {
        pvs.pvs(context);
        dX.pvs();
        Pj.pvs(context);
        pvs(context);
        mnm.NB();
        String pvs = qh.pvs(context);
        vG.icD(pvs);
        Jd.pvs(pvs, true);
        icD.pvs();
        com.bytedance.sdk.openadsdk.core.video.icD.pvs.pvs().icD();
        initAnimationScale(context);
        Ju.icD().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGInitHelper.1
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.Wyp.vG.pvs();
                com.bytedance.sdk.openadsdk.Wyp.vG.pvs("android_act", false, new com.bytedance.sdk.openadsdk.Wyp.icD() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGInitHelper.1.1
                    @Override // com.bytedance.sdk.openadsdk.Wyp.icD
                    public com.bytedance.sdk.openadsdk.Wyp.pvs.vG getLogStats() throws Exception {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("act", pvs.icD(context));
                            jSONObject.put("api_available", pvs.icD());
                            jSONObject.put("act_signals_callback_available", pvs.vG());
                            jSONObject.put("act_event", pvs.pvs());
                        } catch (Throwable th) {
                            com.bytedance.sdk.component.utils.Ju.pvs("AsyncInitTask", "run: ", th);
                        }
                        return com.bytedance.sdk.openadsdk.Wyp.pvs.Jd.icD().pvs("android_act").icD(jSONObject.toString());
                    }
                });
            }
        }, WorkRequest.MIN_BACKOFF_MILLIS);
    }

    public static void initAnimationScale(Context context) {
        try {
            float f = Settings.System.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
            animationScale = f;
            if (f <= 0.0f) {
                animationScale = 1.0f;
            }
        } catch (Throwable unused) {
            animationScale = 1.0f;
        }
    }

    private static void pvs(Context context) {
        com.bytedance.sdk.openadsdk.core.vG.pvs(context).pvs("uuid", rCZ.pvs());
    }

    public static void initMemoryData() {
        mnm.Jd();
        com.bytedance.sdk.openadsdk.multipro.Jd.Jd.pvs("ttopenadsdk", "a", 0);
        com.bytedance.sdk.openadsdk.multipro.Jd.Jd.pvs("sp_global_file", "a", 0);
        com.bytedance.sdk.openadsdk.multipro.Jd.Jd.pvs("sp_global_privacy", "a", 0);
        com.bytedance.sdk.openadsdk.multipro.Jd.Jd.pvs("sp_global_app_id", "a", 0);
        com.bytedance.sdk.openadsdk.multipro.Jd.Jd.pvs("sp_global_icon_id", "a", 0);
        com.bytedance.sdk.openadsdk.multipro.Jd.Jd.pvs(com.bytedance.sdk.openadsdk.qh.icD.pvs, "a", 0);
        com.bytedance.sdk.openadsdk.multipro.Jd.Jd.pvs("tpl_fetch_model", "a", 0);
        com.bytedance.sdk.openadsdk.multipro.Jd.Jd.pvs("tt_sp", "a", 0);
        com.bytedance.sdk.openadsdk.multipro.Jd.Jd.pvs("tt_sdk_event_net_ad", "a", 0);
        com.bytedance.sdk.openadsdk.multipro.Jd.Jd.pvs("tt_sdk_event_net_state", "a", 0);
        com.bytedance.sdk.openadsdk.multipro.Jd.Jd.pvs("tt_sdk_event_net_trail", "a", 0);
        com.bytedance.sdk.openadsdk.multipro.Jd.Jd.pvs("tt_sdk_event_db_ad", "a", 0);
        com.bytedance.sdk.openadsdk.multipro.Jd.Jd.pvs("tt_sdk_event_db_state", "a", 0);
        com.bytedance.sdk.openadsdk.multipro.Jd.Jd.pvs("tt_sdk_event_db_trail", "a", 0);
    }

    public static void initAPM() {
        if (com.bytedance.sdk.openadsdk.common.vG.pvs()) {
            return;
        }
        try {
            String Jd = so.icD().Jd();
            if (TextUtils.isEmpty(Jd)) {
                return;
            }
            ApmHelper.initApm(mnm.pvs(), new PAGConfig.Builder().appId(Jd).build());
        } catch (Exception unused) {
        }
    }
}
