package com.bytedance.sdk.openadsdk.fb.zmn;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.doe;
import com.bytedance.sdk.component.utils.iqz;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.mw;
import com.bytedance.sdk.openadsdk.core.settings.rc;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.bytedance.sdk.openadsdk.utils.oub;
import com.bytedance.sdk.openadsdk.utils.rp;
import com.bytedance.sdk.openadsdk.utils.yj;
import com.bytedance.sdk.openadsdk.utils.zak;
import com.ironsource.C4913ua;
import com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayData;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.bidmachine.iab.vast.tags.VastAttributes;
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

/* loaded from: classes6.dex */
public class zmn {
    private static volatile zmn hhw;
    private final String btk;
    private final boolean fb = zn();
    private int fs;
    private long zmn;
    private Context zn;

    public static zmn zmn() {
        if (hhw == null) {
            synchronized (zmn.class) {
                try {
                    if (hhw == null) {
                        hhw = new zmn();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return hhw;
    }

    private zmn() {
        Context zmn = kgc.zmn();
        if (zmn != null) {
            this.zn = zmn.getApplicationContext();
        }
        this.btk = btk();
    }

    public String zmn(List<com.bytedance.sdk.openadsdk.fb.zmn> list) {
        String str;
        if (list.size() > 0 && list.get(0) != null && list.get(0).fb() != null) {
            str = list.get(0).fb().optString("app_log_url");
        } else {
            str = "";
        }
        return oub.btk(str);
    }

    public List<String> fs(List<com.bytedance.sdk.openadsdk.fb.zmn> list) {
        JSONArray optJSONArray = (list.isEmpty() || list.get(0) == null || list.get(0).fb() == null) ? null : list.get(0).fb().optJSONArray("app_log_url_back");
        ArrayList arrayList = new ArrayList();
        if (optJSONArray != null && optJSONArray.length() > 0) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                String hhw2 = oub.hhw(optJSONArray.optString(i));
                if (!TextUtils.isEmpty(hhw2)) {
                    arrayList.add(hhw2);
                }
            }
        }
        return arrayList;
    }

    private void zmn(com.bytedance.sdk.openadsdk.fb.zmn zmnVar) {
        if (zmnVar == null) {
            return;
        }
        try {
            String optString = zmnVar.fb().optJSONObject("params").optString("log_extra", "");
            long zmn = nqi.zmn(optString);
            int fb = nqi.fb(optString);
            if (zmn == 0) {
                zmn = this.zmn;
            }
            this.zmn = zmn;
            if (fb == 0) {
                fb = this.fs;
            }
            this.fs = fb;
        } catch (Exception e) {
            iqz.zn("AdLogParamsGenerate", "getInfoFromLogExtra exception", e.getMessage());
        }
    }

    public JSONObject zmn(List<com.bytedance.sdk.openadsdk.fb.zmn> list, long j, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            zmn(list.get(0));
            jSONObject2.put(POBCTAOverlayData.KEY_CTA_HEADER, jSONObject);
            JSONArray jSONArray = new JSONArray();
            Iterator<com.bytedance.sdk.openadsdk.fb.zmn> it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().btk());
            }
            jSONObject2.put("event_v3", jSONArray);
            jSONObject2.put("magic_tag", "ss_app_log");
            jSONObject2.put("_gen_time", j);
            jSONObject2.put("local_time", j / 1000);
        } catch (JSONException unused) {
        }
        return jSONObject2;
    }

    public List<com.bytedance.sdk.openadsdk.fb.zmn> zmn(List<com.bytedance.sdk.openadsdk.fb.zmn> list, int i) {
        ArrayList arrayList = new ArrayList();
        for (com.bytedance.sdk.openadsdk.fb.zmn zmnVar : list) {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject fb = zmnVar.fb();
                jSONObject.putOpt("event", fb.optString("label"));
                long optLong = fb.optLong("event_ts", System.currentTimeMillis());
                jSONObject.putOpt("local_time_ms", Long.valueOf(optLong));
                jSONObject.putOpt("datetime", com.bytedance.sdk.openadsdk.fb.hhw.zn.format(new Date(optLong)));
                JSONObject jSONObject2 = new JSONObject();
                Iterator<String> keys = fb.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (!TextUtils.equals(next, "label")) {
                        jSONObject2.putOpt(next, fb.opt(next));
                    }
                }
                if (i > 0 && zmnVar.zn() == 3) {
                    jSONObject2.put("_ad_staging_flag", i);
                }
                jSONObject.putOpt("params", jSONObject2);
                arrayList.add(new com.bytedance.sdk.openadsdk.fb.hhw(zmnVar.zmn, jSONObject));
            } catch (Exception e) {
                iqz.zn("AdLogParamsGenerate", e.getMessage());
            }
        }
        return arrayList;
    }

    @SuppressLint({"HardwareIds"})
    public JSONObject fs() {
        Context zmn;
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.zn == null && (zmn = kgc.zmn()) != null) {
                this.zn = zmn.getApplicationContext();
            }
            jSONObject.put("ua", oub.fb());
            jSONObject.put("ad_sdk_version", BuildConfig.VERSION_NAME);
            jSONObject.put("app_version", oub.zg());
            jSONObject.put("sim_op", zmn(this.zn));
            jSONObject.put("root", this.fb ? 1 : 0);
            jSONObject.put("timezone", fb());
            jSONObject.put("access", rp.zmn(this.zn));
            jSONObject.put("os", "Android");
            jSONObject.put(CommonUrlParts.OS_VERSION, Build.VERSION.RELEASE);
            jSONObject.put("os_api", Build.VERSION.SDK_INT);
            jSONObject.put(CommonUrlParts.DEVICE_TYPE, this.btk);
            jSONObject.put("device_model", Build.MODEL);
            jSONObject.put("device_brand", Build.BRAND);
            jSONObject.put("device_manufacturer", Build.MANUFACTURER);
            jSONObject.put(POBConstants.KEY_LANGUAGE, Locale.getDefault().getLanguage());
            jSONObject.put("resolution", jy.btk(this.zn) + VastAttributes.HORIZONTAL_POSITION + jy.zn(this.zn));
            jSONObject.put("display_density", zmn(jy.iv(this.zn)));
            jSONObject.put("density_dpi", jy.iv(this.zn));
            jSONObject.put(C4913ua.b, "1371");
            jSONObject.put("device_id", mw.zmn(this.zn));
            jSONObject.put("rom", hhw());
            jSONObject.put("cpu_abi", Build.CPU_ABI);
            jSONObject.put("ut", this.fs);
            jSONObject.put("uid", this.zmn);
            jSONObject.put("google_aid", com.bytedance.sdk.openadsdk.phc.zmn.fs.zmn.zmn().fs());
            jSONObject.put("locale_language", DeviceUtils.fb());
            jSONObject.put("screen_bright", Math.ceil(DeviceUtils.btk() * 10.0f) / 10.0d);
            jSONObject.put("is_screen_off", !DeviceUtils.fs() ? 1 : 0);
            rc fb = kgc.fb();
            Context context = this.zn;
            if (context != null) {
                jSONObject.put("force_language", doe.zmn(context, "tt_choose_language"));
            }
            if (fb.zak("mnc")) {
                jSONObject.put("mnc", yj.zn());
            }
            if (fb.zak("mcc")) {
                jSONObject.put("mcc", yj.fs());
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    private String zmn(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager == null) {
                return "";
            }
            return telephonyManager.getSimOperator();
        } catch (Throwable unused) {
            return "";
        }
    }

    private boolean zn() {
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

    private int fb() {
        int rawOffset = TimeZone.getDefault().getRawOffset() / 3600000;
        if (rawOffset < -12) {
            rawOffset = -12;
        }
        if (rawOffset > 12) {
            return 12;
        }
        return rawOffset;
    }

    private String btk() {
        if (DeviceUtils.zn(this.zn)) {
            return "tv";
        }
        if (DeviceUtils.fs(this.zn)) {
            return "android_pad";
        }
        return "android";
    }

    private String zmn(int i) {
        if (i == 120) {
            return "ldpi";
        }
        if (i == 160) {
            return "mdpi";
        }
        if (i == 240) {
            return "hdpi";
        }
        if (i == 320) {
            return "xhdpi";
        }
        if (i == 480) {
            return "xxhdpi";
        }
        if (i != 640) {
            return "mdpi";
        }
        return "xxxhdpi";
    }

    private String hhw() {
        StringBuilder sb = new StringBuilder();
        try {
            if (zak.hhw()) {
                sb.append("MIUI-");
            } else if (zak.zn()) {
                sb.append("FLYME-");
            } else {
                String cn = zak.cn();
                if (zak.zmn(cn)) {
                    sb.append("EMUI-");
                }
                if (!TextUtils.isEmpty(cn)) {
                    sb.append(cn);
                    sb.append("-");
                }
            }
            sb.append(Build.VERSION.INCREMENTAL);
        } catch (Throwable unused) {
        }
        return sb.toString();
    }
}
