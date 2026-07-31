package com.bytedance.sdk.openadsdk.component.nps;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.iqz;
import com.bytedance.sdk.component.utils.nps;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.component.hhw;
import com.bytedance.sdk.openadsdk.core.cn;
import com.bytedance.sdk.openadsdk.core.iv;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.uqh.btk;
import com.facebook.internal.NativeProtocol;
import java.io.File;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class zmn {
    private static Boolean fs;
    private static AtomicInteger zmn = new AtomicInteger(0);
    private static Integer zn = null;

    public static File zmn(String str) {
        return new File(CacheDirFactory.getICacheDir(0).fs() + File.separator + str);
    }

    public static File fs(String str) {
        File fs2 = hhw.zmn(kgc.zmn()).fs();
        if (TextUtils.isEmpty(str) || str.contains("..") || str.contains("../") || str.contains("/")) {
            return null;
        }
        return new File(fs2, str);
    }

    public static void zmn(File file) {
        if (file == null) {
            return;
        }
        try {
            nps.fs(file);
        } catch (Throwable unused) {
        }
    }

    public static void zmn(Context context) {
        try {
            hhw.zmn(context).zmn();
            if (btk()) {
                com.bytedance.sdk.openadsdk.common.kgc.zmn().fs();
            }
        } catch (Throwable unused) {
        }
    }

    public static String zmn() {
        return hhw.zmn(kgc.zmn()).fs().getAbsolutePath();
    }

    public static void zmn(JSONObject jSONObject, int i, boolean z) {
        try {
            String zg = iv.fs().zg();
            int bvs = iv.fs().bvs();
            JSONObject jSONObject2 = jSONObject.getJSONObject("creative");
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(NativeProtocol.BRIDGE_ARG_APP_NAME_STRING, zg);
            if (!z) {
                jSONObject3.put("app_icon_id", "@".concat(String.valueOf(bvs)));
            } else if (iv.fs().bvs() != 0) {
                jSONObject3.put("app_icon_id", "local://pag_open_icon_id");
            }
            jSONObject2.put("open_app_info", jSONObject3);
            if (jSONObject2.optJSONObject("video") == null) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("video_duration", kgc.fb().uqh(String.valueOf(i)));
                jSONObject2.put("video", jSONObject4);
            }
        } catch (Exception e) {
            iqz.zn("TTAppOpenUtils", e.getMessage());
        }
    }

    public static int zmn(nqi nqiVar, int i) {
        return i - nqiVar.au();
    }

    public static long fs() {
        return SystemClock.elapsedRealtime() - Process.getStartElapsedRealtime();
    }

    public static int zn() {
        return zmn.incrementAndGet();
    }

    public static int fb() {
        return cn.fs.get() ? 1 : 2;
    }

    public static boolean btk() {
        return btk.zmn("aoa_cache_opt_enable", 0) == 1;
    }

    public static boolean hhw() {
        return kgc.fb().iv() == 1;
    }

    public static int nps() {
        return zmn.get() == 0 ? btk.zmn("aoa_cold_load_timeout", 3500) : btk.zmn("aoa_hot_load_timeout", 3500);
    }

    public static int zg() {
        if (btk()) {
            return btk.zmn("aoa_cache_count", 3);
        }
        return 1;
    }

    public static int bvs() {
        int zmn2 = btk.zmn("aoa_cache_refresh_time", 72000000);
        if (zmn2 < 60000) {
            return 72000000;
        }
        return zmn2;
    }

    public static int iv() {
        int zmn2 = btk.zmn("aoa_cache_poll_interval", 3600000);
        if (zmn2 < 60000) {
            return 3600000;
        }
        return zmn2;
    }

    public static void zmn(int i) {
        Map<String, AdSlot> zn2;
        if (!btk() || (zn2 = com.bytedance.sdk.openadsdk.common.kgc.zmn().zn()) == null || zn2.size() == 0) {
            return;
        }
        zn2.size();
        for (AdSlot adSlot : zn2.values()) {
            if (adSlot != null && TextUtils.isEmpty(adSlot.getBidAdm())) {
                try {
                    adSlot.setCacheScene(i);
                    hhw.zmn(kgc.zmn()).zmn(adSlot);
                } catch (Throwable unused) {
                    adSlot.toString();
                }
            }
        }
    }

    public static boolean zmn(AdSlot adSlot) {
        Map<String, Object> requestExtraMap;
        return (adSlot == null || (requestExtraMap = adSlot.getRequestExtraMap()) == null || requestExtraMap.get("is_from_m") != Boolean.TRUE) ? false : true;
    }

    public static boolean rc() {
        if (fs == null) {
            boolean z = false;
            boolean z2 = btk.zmn("open_ad_ugen_backup_enable", 0) == 1;
            boolean z3 = btk.zmn("express_backup_type", 0) == 1;
            if (z2 && z3) {
                z = true;
            }
            fs = Boolean.valueOf(z);
        }
        return fs.booleanValue();
    }

    public static int klz() {
        if (zn == null) {
            int zmn2 = btk.zmn("aoa_preload_size", 10);
            zn = Integer.valueOf(zmn2);
            if (zmn2 < 0) {
                zn = 10;
            }
        }
        return zn.intValue();
    }
}
