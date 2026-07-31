package com.bytedance.sdk.openadsdk.component.fb;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.iqz;
import com.bytedance.sdk.openadsdk.core.cn;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.model.so;
import com.bytedance.sdk.openadsdk.cyb.fb;
import com.bytedance.sdk.openadsdk.cyb.zmn.zn;
import com.bytedance.sdk.openadsdk.utils.nu;
import com.bytedance.sdk.openadsdk.utils.ww;
import com.ironsource.C4834q2;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class fs {
    public static void zmn(final int i, final int i2, final so soVar) {
        fb.zmn("openad_load_ad_timeout", false, new com.bytedance.sdk.openadsdk.cyb.fs() { // from class: com.bytedance.sdk.openadsdk.component.fb.fs.1
            @Override // com.bytedance.sdk.openadsdk.cyb.fs
            public zn zmn() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("timeout_type", i);
                jSONObject.put("user_timeout_time", i2);
                so soVar2 = soVar;
                if (soVar2 != null) {
                    jSONObject.put("start_type", soVar2.iv() == 1);
                    jSONObject.put("load_index", soVar.iv());
                }
                jSONObject.put("start_type_backup", com.bytedance.sdk.openadsdk.component.nps.zmn.fb());
                jSONObject.put("app_running_time", com.bytedance.sdk.openadsdk.component.nps.zmn.fs());
                return com.bytedance.sdk.openadsdk.cyb.zmn.fb.fs().zmn("openad_load_ad_timeout").fs(jSONObject.toString());
            }
        });
    }

    public static void zmn(nqi nqiVar, int i, int i2, float f) {
        JSONObject jSONObject = new JSONObject();
        try {
            zmn(jSONObject, nqiVar);
            jSONObject.put("openad_creative_type", nqi.btk(nqiVar) ? "video_normal_ad" : "image_normal_ad");
            jSONObject.put("total_time", f);
            com.bytedance.sdk.openadsdk.fb.zn.zmn(jSONObject, i2, i);
        } catch (JSONException e) {
            iqz.zmn("TTAppOpenAdReport", "reportSkip json error", e);
        }
        com.bytedance.sdk.openadsdk.fb.zn.zmn(nqiVar, "skip", i, jSONObject, (JSONObject) null);
    }

    public static void zmn(nqi nqiVar, long j, float f, boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            zmn(jSONObject, nqiVar);
            jSONObject.put("openad_creative_type", nqi.btk(nqiVar) ? "video_normal_ad" : "image_normal_ad");
            if (z) {
                double d = f;
                jSONObject.put("video_duration", d);
                jSONObject.put("video_percent", (int) (((j * 1.0d) / 10.0d) / d));
            } else {
                jSONObject.put("image_duration", f);
            }
        } catch (JSONException e) {
            iqz.zmn("TTAppOpenAdReport", "reportDestroy json error", e);
        }
        com.bytedance.sdk.openadsdk.fb.zn.zn(nqiVar, "destroy", jSONObject);
    }

    public static void zmn(nqi nqiVar) {
        com.bytedance.sdk.openadsdk.fb.zn.zn(nqiVar, "cache_expire", (JSONObject) null);
    }

    public static void zmn(final String str, final int i, final int i2, final boolean z) {
        nu.fs(new com.bytedance.sdk.component.zg.fs.zn("opencache") { // from class: com.bytedance.sdk.openadsdk.component.fb.fs.2
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.core.model.zmn fs;
                try {
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    JSONObject jsonObjectInit = PangleNetworkBridge.jsonObjectInit(str);
                    if (jsonObjectInit.has("cypher")) {
                        jsonObjectInit = kgc.zn().zmn(jsonObjectInit);
                    }
                    if (jsonObjectInit == null || !jsonObjectInit.has("creatives") || (fs = com.bytedance.sdk.openadsdk.core.model.zmn.fs(jsonObjectInit)) == null || !fs.hhw()) {
                        return;
                    }
                    fs.zmn(fs.nps(), i, i2, z);
                } catch (Throwable unused) {
                }
            }
        });
    }

    public static void zmn(nqi nqiVar, int i, int i2, boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cache_lib", i);
            jSONObject.put("cache_replace", z ? 1 : 0);
            jSONObject.put("cache_refresh_scene", i2);
            if (i2 == 0) {
                jSONObject.put("cache_preload", 0);
            } else {
                jSONObject.put("cache_preload", 1);
            }
            jSONObject.put("aoa_cache_count", com.bytedance.sdk.openadsdk.component.nps.zmn.zg());
            com.bytedance.sdk.openadsdk.fb.zn.zmn(nqiVar, "cache_refresh", -1L, (JSONObject) null, jSONObject);
        } catch (JSONException e) {
            iqz.zmn("TTAppOpenAdReport", "reportCacheRefresh json error", e);
        }
    }

    public static void zmn(String str, nqi nqiVar, JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.fb.zn.zmn(nqiVar, str, -1L, (JSONObject) null, jSONObject);
    }

    public static void zmn(String str, String str2, nqi nqiVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("scene", str2);
        } catch (JSONException e) {
            iqz.zn("TTAppOpenAdReport", e);
        }
        zmn(str, nqiVar, jSONObject);
    }

    public static void fs(nqi nqiVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("openad_creative_type", nqi.btk(nqiVar) ? "video_normal_ad" : "image_normal_ad");
        } catch (JSONException e) {
            iqz.zmn("TTAppOpenAdReport", "reportCacheLoss json error", e);
        }
        com.bytedance.sdk.openadsdk.fb.zn.zn(nqiVar, "cache_loss", jSONObject);
    }

    public static void zmn(nqi nqiVar, long j, boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C4834q2.u, z ? 1 : 2);
        } catch (JSONException unused) {
        }
        com.bytedance.sdk.openadsdk.fb.zn.zmn(nqiVar, "download_image_duration", j, jSONObject, (JSONObject) null);
    }

    public static void fs(nqi nqiVar, long j, boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("size", nqiVar.mrt().btk());
            jSONObject.put("video_duration", nqiVar.mrt().hhw());
            jSONObject.put(C4834q2.u, z ? 1 : 2);
        } catch (JSONException unused) {
        }
        com.bytedance.sdk.openadsdk.fb.zn.zmn(nqiVar, "download_video_duration", j, jSONObject, (JSONObject) null);
    }

    public static void zmn(nqi nqiVar, int i, so soVar) {
        JSONObject jSONObject = new JSONObject();
        long j = 0;
        try {
            jSONObject.put("openad_creative_type", nqi.btk(nqiVar) ? "video_normal_ad" : "image_normal_ad");
            jSONObject.put("open_ad_cache_type", i);
            if (soVar != null) {
                soVar.fs(ww.fs());
                zmn(jSONObject, nqiVar);
                jSONObject.put("client_start_time", soVar.fs());
                jSONObject.put("sever_time", soVar.fb());
                jSONObject.put("network_time", soVar.zn());
                jSONObject.put("client_end_time", soVar.btk());
                jSONObject.put("download_resource_duration", soVar.nps());
                jSONObject.put("resource_source", soVar.zg());
                jSONObject.put("is_bidding", soVar.zmn ? 1 : 0);
                if (soVar.zmn) {
                    jSONObject.put("load_wait_time", soVar.fs);
                }
                j = soVar.hhw();
            }
        } catch (JSONException e) {
            iqz.zmn("TTAppOpenAdReport", "reportLoadNetDuration json error", e);
        }
        com.bytedance.sdk.openadsdk.fb.zn.zmn(nqiVar, "load_net_duration", j, jSONObject, (JSONObject) null);
    }

    public static void zmn(nqi nqiVar, long j) {
        JSONObject jSONObject = new JSONObject();
        try {
            zmn(jSONObject, nqiVar);
            jSONObject.put("openad_creative_type", nqi.btk(nqiVar) ? "video_normal_ad" : "image_normal_ad");
        } catch (JSONException unused) {
            iqz.zn("TTAppOpenAdReport", "reportLoadCacheDuration json error");
        }
        com.bytedance.sdk.openadsdk.fb.zn.zmn(nqiVar, "load_cache_duration", j, jSONObject, (JSONObject) null);
    }

    public static void zmn(final so soVar, final int i, final int i2) {
        if (soVar != null) {
            fb.zmn("app_running_time", false, new com.bytedance.sdk.openadsdk.cyb.fs() { // from class: com.bytedance.sdk.openadsdk.component.fb.fs.3
                @Override // com.bytedance.sdk.openadsdk.cyb.fs
                public zn zmn() throws Exception {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("app_running_time", so.this.bvs());
                    jSONObject.put("loaded_app_running_time", com.bytedance.sdk.openadsdk.component.nps.zmn.fs());
                    jSONObject.put("load_time", so.this.zmn().fb());
                    jSONObject.put("load_from", i);
                    jSONObject.put("load_result", i2);
                    int iv = so.this.iv();
                    jSONObject.put("load_index", iv);
                    if (iv == 1) {
                        jSONObject.put("init_to_ad_load_time", SystemClock.elapsedRealtime() - cn.zn);
                    }
                    return com.bytedance.sdk.openadsdk.cyb.zmn.fb.fs().zmn("app_running_time").fs(jSONObject.toString());
                }
            });
        }
    }

    private static void zmn(JSONObject jSONObject, nqi nqiVar) {
        int i;
        if (nqiVar != null) {
            try {
                if (nqiVar.yj()) {
                    i = 1;
                    jSONObject.put("is_icon_only", i);
                }
            } catch (JSONException e) {
                iqz.zn("TTAppOpenAdReport", e.getMessage());
                return;
            }
        }
        i = 0;
        jSONObject.put("is_icon_only", i);
    }
}
