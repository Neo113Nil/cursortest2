package com.bytedance.sdk.openadsdk.icD.pvs;

import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.bytedance.JProtect;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.mnm;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.Pj;
import com.bytedance.sdk.openadsdk.utils.ZhG;
import com.bytedance.sdk.openadsdk.utils.jlb;
import com.bytedance.sdk.openadsdk.utils.ny;
import com.bytedance.sdk.openadsdk.utils.uc;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AdLogParamsGenerate.java */
/* loaded from: classes2.dex */
public class vG {
    private final boolean Jd;
    private final String NB;
    private int icD;
    private long pvs;
    private final Context vG;

    private String pvs(int i) {
        return i != 120 ? i != 160 ? i != 240 ? i != 320 ? i != 480 ? i != 640 ? "mdpi" : "xxxhdpi" : "xxhdpi" : "xhdpi" : "hdpi" : "mdpi" : "ldpi";
    }

    /* compiled from: AdLogParamsGenerate.java */
    private static class pvs {
        private static final vG pvs = new vG();
    }

    public static vG pvs() {
        return pvs.pvs;
    }

    private vG() {
        this.Jd = vG();
        this.vG = mnm.pvs().getApplicationContext();
        this.NB = NB();
    }

    public String pvs(List<com.bytedance.sdk.openadsdk.icD.pvs> list) {
        return jlb.NB((list.size() <= 0 || list.get(0) == null || list.get(0).vG() == null) ? "" : list.get(0).vG().optString("app_log_url"));
    }

    private void pvs(com.bytedance.sdk.openadsdk.icD.pvs pvsVar, boolean z) {
        String optString;
        if (pvsVar == null) {
            return;
        }
        try {
            if (z) {
                optString = pvsVar.vG().optJSONObject("params").optString("log_extra", "");
            } else {
                optString = pvsVar.vG().optString("log_extra", "");
            }
            long pvs2 = cR.pvs(optString);
            int Jd = cR.Jd(optString);
            if (pvs2 == 0) {
                pvs2 = this.pvs;
            }
            this.pvs = pvs2;
            if (Jd == 0) {
                Jd = this.icD;
            }
            this.icD = Jd;
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.Ju.pvs("AdLogParamsGenerate", "getInfoFromLogExtra exception", e.getMessage());
        }
    }

    public JSONObject pvs(List<com.bytedance.sdk.openadsdk.icD.pvs> list, long j, JSONObject jSONObject, boolean z) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            pvs(list.get(0), z);
            jSONObject2.put("header", jSONObject);
            JSONArray jSONArray = new JSONArray();
            Iterator<com.bytedance.sdk.openadsdk.icD.pvs> it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().pvs(z));
            }
            if (z) {
                jSONObject2.put("event_v3", jSONArray);
                jSONObject2.put("magic_tag", "ss_app_log");
            } else {
                jSONObject2.put(NotificationCompat.CATEGORY_EVENT, jSONArray);
            }
            jSONObject2.put("_gen_time", j);
            jSONObject2.put("local_time", j / 1000);
        } catch (JSONException unused) {
        }
        return jSONObject2;
    }

    public List<com.bytedance.sdk.openadsdk.icD.pvs> pvs(List<com.bytedance.sdk.openadsdk.icD.pvs> list, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (com.bytedance.sdk.openadsdk.icD.pvs pvsVar : list) {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject vG = pvsVar.vG();
                jSONObject.putOpt(NotificationCompat.CATEGORY_EVENT, vG.optString("label"));
                long optLong = vG.optLong("event_ts", System.currentTimeMillis());
                jSONObject.putOpt("local_time_ms", Long.valueOf(optLong));
                jSONObject.putOpt("datetime", com.bytedance.sdk.openadsdk.icD.sUS.vG.format(new Date(optLong)));
                JSONObject jSONObject2 = new JSONObject();
                Iterator<String> keys = vG.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (!TextUtils.equals(next, "label")) {
                        jSONObject2.putOpt(next, vG.opt(next));
                    }
                }
                if (z) {
                    jSONObject2.putOpt("_ad_staging_flag", 3);
                }
                jSONObject.putOpt("params", jSONObject2);
                arrayList.add(new com.bytedance.sdk.openadsdk.icD.sUS(pvsVar.pvs, jSONObject));
            } catch (Exception e) {
                com.bytedance.sdk.component.utils.Ju.pvs("AdLogParamsGenerate", e.getMessage());
            }
        }
        return arrayList;
    }

    public List<com.bytedance.sdk.openadsdk.icD.pvs> icD(List<com.bytedance.sdk.openadsdk.icD.pvs> list) {
        ArrayList arrayList = new ArrayList();
        for (com.bytedance.sdk.openadsdk.icD.pvs pvsVar : list) {
            try {
                JSONObject vG = pvsVar.vG();
                vG.putOpt("_ad_staging_flag", 1);
                arrayList.add(new com.bytedance.sdk.openadsdk.icD.pvs(pvsVar.pvs, vG));
            } catch (Exception e) {
                com.bytedance.sdk.component.utils.Ju.pvs("AdLogParamsGenerate", e.getMessage());
            }
        }
        return arrayList;
    }

    @JProtect
    public JSONObject icD() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ua", jlb.vG());
            jSONObject.put("ad_sdk_version", BuildConfig.VERSION_NAME);
            jSONObject.put("app_version", jlb.yiw());
            jSONObject.put("sim_op", pvs(this.vG));
            jSONObject.put("root", this.Jd ? 1 : 0);
            jSONObject.put("timezone", Jd());
            jSONObject.put("access", uc.pvs(this.vG));
            jSONObject.put("os", "Android");
            jSONObject.put("os_version", Build.VERSION.RELEASE);
            jSONObject.put("os_api", Build.VERSION.SDK_INT);
            jSONObject.put("device_type", this.NB);
            jSONObject.put("device_model", Build.MODEL);
            jSONObject.put("device_brand", Build.BRAND);
            jSONObject.put("device_manufacturer", Build.MANUFACTURER);
            jSONObject.put("language", Locale.getDefault().getLanguage());
            jSONObject.put("resolution", Pj.Jd(this.vG) + "x" + Pj.vG(this.vG));
            jSONObject.put("display_density", pvs(Pj.yiw(this.vG)));
            jSONObject.put("density_dpi", Pj.yiw(this.vG));
            jSONObject.put("aid", "1371");
            jSONObject.put("device_id", com.bytedance.sdk.openadsdk.core.qh.pvs(this.vG));
            jSONObject.put("rom", sUS());
            jSONObject.put("cpu_abi", Build.CPU_ABI);
            jSONObject.put("ut", this.icD);
            jSONObject.put("uid", this.pvs);
            jSONObject.put("google_aid", com.com.bytedance.overseas.sdk.icD.pvs.pvs().icD());
            jSONObject.put("locale_language", DeviceUtils.Jd());
            jSONObject.put("screen_bright", Math.ceil(DeviceUtils.NB() * 10.0f) / 10.0d);
            jSONObject.put("is_screen_off", DeviceUtils.icD() ? 0 : 1);
            com.bytedance.sdk.openadsdk.core.settings.sUS Jd = mnm.Jd();
            jSONObject.put("force_language", com.bytedance.sdk.component.utils.uc.pvs(this.vG, "tt_choose_language"));
            if (Jd.ae("mnc")) {
                jSONObject.put("mnc", ZhG.vG());
            }
            if (Jd.ae("mcc")) {
                jSONObject.put("mcc", ZhG.icD());
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    private String pvs(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            return telephonyManager == null ? "" : telephonyManager.getSimOperator();
        } catch (Throwable unused) {
            return "";
        }
    }

    private boolean vG() {
        try {
            if (!new File("/system/bin/su").exists()) {
                if (!new File("/system/xbin/su").exists()) {
                    return false;
                }
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private int Jd() {
        int rawOffset = TimeZone.getDefault().getRawOffset() / 3600000;
        if (rawOffset < -12) {
            rawOffset = -12;
        }
        if (rawOffset > 12) {
            return 12;
        }
        return rawOffset;
    }

    private String NB() {
        return DeviceUtils.vG(this.vG) ? "tv" : DeviceUtils.icD(this.vG) ? "android_pad" : "android";
    }

    @JProtect
    private String sUS() {
        StringBuilder sb = new StringBuilder();
        try {
            if (ny.NB()) {
                sb.append("MIUI-");
            } else if (ny.icD()) {
                sb.append("FLYME-");
            } else {
                String IP = ny.IP();
                if (ny.pvs(IP)) {
                    sb.append("EMUI-");
                }
                if (!TextUtils.isEmpty(IP)) {
                    sb.append(IP).append("-");
                }
            }
            sb.append(Build.VERSION.INCREMENTAL);
        } catch (Throwable unused) {
        }
        return sb.toString();
    }
}
