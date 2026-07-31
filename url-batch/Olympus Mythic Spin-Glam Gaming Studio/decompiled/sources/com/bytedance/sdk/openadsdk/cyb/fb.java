package com.bytedance.sdk.openadsdk.cyb;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.iqz;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.cn;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.mw;
import com.bytedance.sdk.openadsdk.utils.nu;
import com.bytedance.sdk.openadsdk.utils.oub;
import com.ironsource.X3;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.File;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class fb {
    private static volatile fb zmn;

    private boolean zn(com.bytedance.sdk.openadsdk.cyb.zmn.fb fbVar) {
        return fbVar == null;
    }

    private fb() {
    }

    public static fb zmn() {
        if (zmn == null) {
            synchronized (fb.class) {
                try {
                    if (zmn == null) {
                        zmn = new fb();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return zmn;
    }

    public static void zmn(final nqi nqiVar) {
        if (nqiVar == null) {
            return;
        }
        final long currentTimeMillis = System.currentTimeMillis();
        zmn("bidding_receive", false, new fs() { // from class: com.bytedance.sdk.openadsdk.cyb.fb.1
            @Override // com.bytedance.sdk.openadsdk.cyb.fs
            @Nullable
            public com.bytedance.sdk.openadsdk.cyb.zmn.zn zmn() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("reveice_ts", currentTimeMillis);
                if (nqiVar.sft() == 3) {
                    jSONObject.put("is_icon_only", nqiVar.yj() ? 1 : 0);
                }
                return com.bytedance.sdk.openadsdk.cyb.zmn.fb.fs().zmn("bidding_receive").fs(jSONObject.toString());
            }
        });
    }

    public static void zmn(nqi nqiVar, final long j) {
        if (nqiVar == null) {
            return;
        }
        zmn("bidding_load", false, new fs() { // from class: com.bytedance.sdk.openadsdk.cyb.fb.8
            @Override // com.bytedance.sdk.openadsdk.cyb.fs
            @Nullable
            public com.bytedance.sdk.openadsdk.cyb.zmn.zn zmn() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(IronSourceConstants.EVENTS_DURATION, j);
                return com.bytedance.sdk.openadsdk.cyb.zmn.fb.fs().zmn("bidding_load").fs(jSONObject.toString());
            }
        });
    }

    public static void zmn(final String str, final com.bytedance.sdk.openadsdk.fb.btk.fs.zmn zmnVar) {
        if (zmnVar == null) {
            return;
        }
        zmn(str, false, new fs() { // from class: com.bytedance.sdk.openadsdk.cyb.fb.13
            @Override // com.bytedance.sdk.openadsdk.cyb.fs
            @Nullable
            public com.bytedance.sdk.openadsdk.cyb.zmn.zn zmn() throws Exception {
                JSONObject zn = com.bytedance.sdk.openadsdk.fb.btk.fs.zmn.this.zn();
                if (zn == null) {
                    zn = new JSONObject();
                }
                nqi zmn2 = com.bytedance.sdk.openadsdk.fb.btk.fs.zmn.this.zmn();
                zn.put("req_id", zmn2.wbj());
                com.bytedance.sdk.openadsdk.fb.btk.fs.zn btk = com.bytedance.sdk.openadsdk.fb.btk.fs.zmn.this.btk();
                if (btk != null) {
                    btk.zmn(zn);
                }
                return com.bytedance.sdk.openadsdk.cyb.zmn.fb.fs().zmn(str).zmn(zmn2.sft()).fs(zn.toString());
            }
        });
    }

    public static void fs(final nqi nqiVar) {
        if (oub.zmn(nqiVar) == null || TextUtils.isEmpty(nqiVar.ltf())) {
            return;
        }
        zmn("download_gecko_start", false, new fs() { // from class: com.bytedance.sdk.openadsdk.cyb.fb.14
            @Override // com.bytedance.sdk.openadsdk.cyb.fs
            @Nullable
            public com.bytedance.sdk.openadsdk.cyb.zmn.zn zmn() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("url", nqi.this.pl());
                jSONObject.put("channel_name", nqi.this.ltf());
                return com.bytedance.sdk.openadsdk.cyb.zmn.fb.fs().zmn("download_gecko_start").zmn(nqi.this.sft()).fs(jSONObject.toString());
            }
        });
    }

    public static void zmn(final nqi nqiVar, final JSONObject jSONObject) {
        if (oub.zmn(nqiVar) == null || TextUtils.isEmpty(nqiVar.ltf())) {
            return;
        }
        zmn("download_gecko_end", false, new fs() { // from class: com.bytedance.sdk.openadsdk.cyb.fb.15
            @Override // com.bytedance.sdk.openadsdk.cyb.fs
            @Nullable
            public com.bytedance.sdk.openadsdk.cyb.zmn.zn zmn() throws Exception {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("url", nqi.this.pl());
                jSONObject2.put("channel_name", nqi.this.ltf());
                jSONObject2.put("data", jSONObject);
                return com.bytedance.sdk.openadsdk.cyb.zmn.fb.fs().zmn("download_gecko_end").zmn(nqi.this.sft()).fs(jSONObject2.toString());
            }
        });
    }

    public void zmn(final com.bytedance.sdk.openadsdk.cyb.zmn.fb fbVar) {
        if (zn(fbVar)) {
            return;
        }
        fbVar.zmn("express_ad_render");
        kgc.btk().zmn(new fs() { // from class: com.bytedance.sdk.openadsdk.cyb.fb.16
            @Override // com.bytedance.sdk.openadsdk.cyb.fs
            public com.bytedance.sdk.openadsdk.cyb.zmn.zn zmn() throws Exception {
                return fbVar;
            }
        });
    }

    public void fs(final com.bytedance.sdk.openadsdk.cyb.zmn.fb fbVar) {
        if (zn(fbVar)) {
            return;
        }
        fbVar.zmn("show_backup_endcard");
        kgc.btk().zmn(new fs() { // from class: com.bytedance.sdk.openadsdk.cyb.fb.17
            @Override // com.bytedance.sdk.openadsdk.cyb.fs
            public com.bytedance.sdk.openadsdk.cyb.zmn.zn zmn() throws Exception {
                return fbVar;
            }
        });
    }

    public void zmn(final long j, final long j2) {
        final long j3 = j2 - j;
        zmn("general_label", false, new fs() { // from class: com.bytedance.sdk.openadsdk.cyb.fb.2
            @Override // com.bytedance.sdk.openadsdk.cyb.fs
            public com.bytedance.sdk.openadsdk.cyb.zmn.zn zmn() throws Exception {
                int i = !cn.fs.get() ? 1 : 0;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("starttime", j);
                    jSONObject.put("endtime", j2);
                    jSONObject.put("start_type", i);
                } catch (Throwable unused) {
                }
                return com.bytedance.sdk.openadsdk.cyb.zmn.fb.fs().zmn("general_label").zg(String.valueOf(j3)).fs(jSONObject.toString());
            }
        });
    }

    public static void fs() {
        nu.fs(new com.bytedance.sdk.component.zg.fs.zn("showFailLog") { // from class: com.bytedance.sdk.openadsdk.cyb.fb.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    fb.zmn().zmn("show_fail_log", new JSONObject());
                } catch (Throwable th) {
                    iqz.zn("StatsLogManager", th.getMessage());
                }
            }
        });
    }

    public void zmn(final String str, final JSONObject jSONObject) {
        if (str == null || jSONObject == null) {
            return;
        }
        zmn(str, false, new fs() { // from class: com.bytedance.sdk.openadsdk.cyb.fb.4
            @Override // com.bytedance.sdk.openadsdk.cyb.fs
            public com.bytedance.sdk.openadsdk.cyb.zmn.zn zmn() throws Exception {
                return com.bytedance.sdk.openadsdk.cyb.zmn.fb.fs().zmn(str).fs(jSONObject.toString());
            }
        });
    }

    public void zn() {
        zmn("blind_mode_status", true, new fs() { // from class: com.bytedance.sdk.openadsdk.cyb.fb.5
            @Override // com.bytedance.sdk.openadsdk.cyb.fs
            public com.bytedance.sdk.openadsdk.cyb.zmn.zn zmn() throws Exception {
                return com.bytedance.sdk.openadsdk.cyb.zmn.fb.fs().zmn("blind_mode_status");
            }
        });
    }

    public void zmn(final JSONObject jSONObject) {
        if (jSONObject == null) {
            iqz.zmn("adRevenuePangle", "You must pass adRevenue json to pangle");
            return;
        }
        Object opt = jSONObject.opt("device_ad_mediation_platform");
        if (!(opt instanceof String) || TextUtils.isEmpty((String) opt)) {
            iqz.zmn("adRevenuePangle", "You must pass device_ad_mediation_platform to pangle");
        } else {
            iqz.zmn("adRevenuePangle", "pangle", "You successfully passed the parameters to pangle. The parameters are:", jSONObject);
            zmn("ad_revenue", true, new fs() { // from class: com.bytedance.sdk.openadsdk.cyb.fb.6
                @Override // com.bytedance.sdk.openadsdk.cyb.fs
                public com.bytedance.sdk.openadsdk.cyb.zmn.zn zmn() throws Exception {
                    try {
                        jSONObject.put("event", 272);
                        jSONObject.put(CommonUrlParts.UUID, mw.zn(kgc.zmn()));
                        String str = "";
                        try {
                            if (mw.zmn(kgc.zmn()) != null) {
                                str = mw.zmn(kgc.zmn());
                            }
                        } catch (Throwable th) {
                            th.getMessage();
                        }
                        jSONObject.put("device_id", str);
                        jSONObject.put("platform", "android");
                        jSONObject.put("partner", "PangleSDK");
                    } catch (Throwable th2) {
                        th2.getMessage();
                    }
                    return com.bytedance.sdk.openadsdk.cyb.zmn.fb.fs().zmn("ad_revenue").fs(jSONObject.toString());
                }
            });
        }
    }

    public static void fb() {
        zmn("disk_log", false, new fs() { // from class: com.bytedance.sdk.openadsdk.cyb.fb.7
            @Override // com.bytedance.sdk.openadsdk.cyb.fs
            public com.bytedance.sdk.openadsdk.cyb.zmn.zn zmn() throws Exception {
                JSONObject jSONObject = new JSONObject();
                File file = new File(CacheDirFactory.getRootDir());
                long j = 0;
                if (file.exists() && file.isDirectory()) {
                    for (File file2 : file.listFiles()) {
                        long zmn2 = fb.zmn(file2);
                        j += zmn2;
                        jSONObject.put(file2.getName(), zmn2);
                    }
                }
                if (j < 524288000) {
                    return null;
                }
                return com.bytedance.sdk.openadsdk.cyb.zmn.fb.fs().zmn("disk_log").fs(jSONObject.toString());
            }
        });
    }

    public static long zmn(File file) {
        if (file.isFile()) {
            return file.length();
        }
        long j = 0;
        for (File file2 : file.listFiles()) {
            j += zmn(file2);
        }
        return j;
    }

    public static void zmn(String str, boolean z, fs fsVar) {
        zmn(str, z, -1, fsVar);
    }

    public static void zmn(String str, boolean z, int i, fs fsVar) {
        if (!TextUtils.isEmpty(str) && zn.zmn(str, i)) {
            kgc.btk().zmn(fsVar, z);
        }
    }

    public static void zmn(long j, long j2, final String str, final int i) {
        if (j == 0) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        final long j3 = elapsedRealtime - j;
        final long j4 = elapsedRealtime - j2;
        final long j5 = j2 - j;
        zmn("ad_show_cost_time", false, new fs() { // from class: com.bytedance.sdk.openadsdk.cyb.fb.9
            @Override // com.bytedance.sdk.openadsdk.cyb.fs
            public com.bytedance.sdk.openadsdk.cyb.zmn.zn zmn() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(IronSourceConstants.EVENTS_DURATION, j3);
                jSONObject.put("renderDuration", j4);
                jSONObject.put("showToRenderDuration", j5);
                jSONObject.put("tag", str);
                jSONObject.put("renderType", i);
                return com.bytedance.sdk.openadsdk.cyb.zmn.fb.fs().zmn("ad_show_cost_time").fs(jSONObject.toString());
            }
        });
    }

    public static void zmn(int i, String str) {
        zmn(i, str, 0, (String) null);
    }

    public static void zmn(final int i, final String str, final int i2, final String str2) {
        zmn("ipv6_req", false, new fs<com.bytedance.sdk.openadsdk.cyb.zmn.zn>() { // from class: com.bytedance.sdk.openadsdk.cyb.fb.10
            @Override // com.bytedance.sdk.openadsdk.cyb.fs
            @Nullable
            public com.bytedance.sdk.openadsdk.cyb.zmn.zn zmn() throws Exception {
                String str3;
                JSONObject jSONObject = new JSONObject();
                int i3 = i;
                if (i3 == 1) {
                    str3 = "success";
                } else if (i3 != -1) {
                    str3 = "start";
                } else {
                    jSONObject.put("error_code", i2);
                    jSONObject.put("error_msg", str2);
                    str3 = X3.g.e;
                }
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put("url", str);
                }
                jSONObject.put("status", str3);
                return com.bytedance.sdk.openadsdk.cyb.zmn.fb.fs().zmn("ipv6_req").fs(jSONObject.toString());
            }
        });
    }

    public static void zmn(final String str, final boolean z) {
        zmn("img_error_param", false, new fs() { // from class: com.bytedance.sdk.openadsdk.cyb.fb.11
            @Override // com.bytedance.sdk.openadsdk.cyb.fs
            @Nullable
            public com.bytedance.sdk.openadsdk.cyb.zmn.zn zmn() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("is_new", z ? 1 : 0);
                    jSONObject.put("msg", str);
                } catch (Throwable unused) {
                }
                return com.bytedance.sdk.openadsdk.cyb.zmn.fb.fs().zmn("img_error_param").fs(jSONObject.toString());
            }
        });
    }

    public static void zmn(final boolean z) {
        zmn("web_container_reuse", false, new fs() { // from class: com.bytedance.sdk.openadsdk.cyb.fb.12
            @Override // com.bytedance.sdk.openadsdk.cyb.fs
            @Nullable
            public com.bytedance.sdk.openadsdk.cyb.zmn.zn zmn() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("is_hit", z ? 1 : 0);
                return com.bytedance.sdk.openadsdk.cyb.zmn.fb.fs().zmn("web_container_reuse").fs(jSONObject.toString());
            }
        });
    }
}
