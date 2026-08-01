package com.bytedance.sdk.openadsdk.icD.pvs;

import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* compiled from: GetAdEventMonitor.java */
/* loaded from: classes2.dex */
public class sUS {
    public static AtomicInteger pvs = new AtomicInteger(0);
    public static AtomicInteger icD = new AtomicInteger(0);
    public static AtomicInteger vG = new AtomicInteger(0);
    public static AtomicInteger Jd = new AtomicInteger(0);
    public static AtomicInteger NB = new AtomicInteger(0);
    public static AtomicInteger sUS = new AtomicInteger(0);
    public static AtomicInteger yiw = new AtomicInteger(0);
    public static AtomicInteger so = new AtomicInteger(0);
    public static AtomicInteger Mxy = new AtomicInteger(0);

    public static void pvs() {
        try {
            long pvs2 = com.bytedance.sdk.openadsdk.multipro.Jd.pvs.pvs("tt_sdk_event_get_ad", "get_ad_event_time_key", 0L);
            if (pvs2 > 0 && System.currentTimeMillis() - pvs2 >= 86400000) {
                icD();
                com.bytedance.sdk.openadsdk.multipro.Jd.pvs.pvs("tt_sdk_event_get_ad", "get_ad_event_time_key", Long.valueOf(System.currentTimeMillis()));
                return;
            }
            if (pvs2 <= 0 || pvs2 > System.currentTimeMillis()) {
                com.bytedance.sdk.openadsdk.multipro.Jd.pvs.pvs("tt_sdk_event_get_ad", "get_ad_event_time_key", Long.valueOf(System.currentTimeMillis()));
            }
            JSONObject jSONObject = new JSONObject(com.bytedance.sdk.openadsdk.multipro.Jd.pvs.icD("tt_sdk_event_get_ad", "get_ad_event_key", ""));
            int optInt = jSONObject.optInt("load_get_ad_version", 0);
            if (optInt >= 5702 && (optInt < 5800 || optInt >= 5802)) {
                pvs.addAndGet(jSONObject.optInt("load_times"));
                icD.addAndGet(jSONObject.optInt("load_success"));
                vG.addAndGet(jSONObject.optInt("load_fail"));
                Jd.addAndGet(jSONObject.optInt("load_success_and_parse_success"));
                NB.addAndGet(jSONObject.optInt("load_success_and_parse_fail"));
                sUS.addAndGet(jSONObject.optInt("load_success_and_no_ad"));
                yiw.addAndGet(jSONObject.optInt("load_fail_by_no_net"));
                so.addAndGet(jSONObject.optInt("load_fail_by_io"));
                Mxy.addAndGet(jSONObject.optInt("load_fail_in_background"));
                return;
            }
            com.bytedance.sdk.openadsdk.multipro.Jd.pvs.pvs("tt_sdk_event_get_ad");
        } catch (Throwable unused) {
        }
    }

    public static void icD() {
        try {
            com.bytedance.sdk.openadsdk.Wyp.vG.pvs().pvs("pangle_sdk_get_ad_track", com.bytedance.sdk.openadsdk.multipro.Jd.pvs.icD("tt_sdk_event_get_ad", "get_ad_event_key", ""));
            com.bytedance.sdk.openadsdk.multipro.Jd.pvs.pvs("tt_sdk_event_get_ad");
        } catch (Throwable unused) {
        }
    }

    public static void vG() {
        try {
            com.bytedance.sdk.openadsdk.multipro.Jd.pvs.pvs("tt_sdk_event_get_ad", "get_ad_event_key", Jd().toString());
        } catch (Throwable unused) {
        }
    }

    public static JSONObject Jd() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("load_times", pvs.get());
            jSONObject.put("load_success", icD.get());
            jSONObject.put("load_fail", vG.get());
            jSONObject.put("load_fail_in_background", Mxy.get());
            jSONObject.put("load_success_and_parse_success", Jd.get());
            jSONObject.put("load_success_and_parse_fail", NB.get());
            jSONObject.put("load_success_and_no_ad", sUS.get());
            jSONObject.put("load_fail_by_no_net", yiw.get());
            jSONObject.put("load_fail_by_io", so.get());
            jSONObject.put("load_get_ad_version", BuildConfig.VERSION_CODE);
            return jSONObject;
        } catch (Throwable unused) {
            return new JSONObject();
        }
    }

    public static void pvs(int i, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i);
            jSONObject.put(NotificationCompat.CATEGORY_MESSAGE, str);
            com.bytedance.sdk.openadsdk.Wyp.vG.pvs().pvs("pangle_sdk_client_load_error", jSONObject);
        } catch (Throwable unused) {
        }
    }

    public static void NB() {
        try {
            if (DeviceUtils.icD()) {
                return;
            }
            Mxy.incrementAndGet();
        } catch (Throwable unused) {
        }
    }
}
