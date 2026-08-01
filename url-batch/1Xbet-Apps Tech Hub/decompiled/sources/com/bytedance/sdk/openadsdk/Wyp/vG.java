package com.bytedance.sdk.openadsdk.Wyp;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.component.so.so;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.Wyp.pvs.Jd;
import com.bytedance.sdk.openadsdk.core.Ju;
import com.bytedance.sdk.openadsdk.core.mnm;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.core.qh;
import com.bytedance.sdk.openadsdk.utils.ae;
import com.bytedance.sdk.openadsdk.utils.jlb;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.File;
import org.json.JSONObject;

/* compiled from: StatsLogManager.java */
/* loaded from: classes2.dex */
public class vG {
    private static volatile vG pvs;

    private boolean vG(Jd jd) {
        return jd == null;
    }

    private vG() {
    }

    public static vG pvs() {
        if (pvs == null) {
            synchronized (vG.class) {
                if (pvs == null) {
                    pvs = new vG();
                }
            }
        }
        return pvs;
    }

    public static void pvs(final cR cRVar) {
        if (cRVar == null) {
            return;
        }
        final long currentTimeMillis = System.currentTimeMillis();
        pvs("bidding_receive", false, new icD() { // from class: com.bytedance.sdk.openadsdk.Wyp.vG.1
            @Override // com.bytedance.sdk.openadsdk.Wyp.icD
            public com.bytedance.sdk.openadsdk.Wyp.pvs.vG getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("reveice_ts", currentTimeMillis);
                if (cRVar.LDD() == 3) {
                    jSONObject.put("is_icon_only", cRVar.OUT() ? 1 : 0);
                }
                return Jd.icD().pvs("bidding_receive").icD(jSONObject.toString());
            }
        });
    }

    public static void pvs(cR cRVar, final long j) {
        if (cRVar == null) {
            return;
        }
        pvs("bidding_load", false, new icD() { // from class: com.bytedance.sdk.openadsdk.Wyp.vG.12
            @Override // com.bytedance.sdk.openadsdk.Wyp.icD
            public com.bytedance.sdk.openadsdk.Wyp.pvs.vG getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(TypedValues.TransitionType.S_DURATION, j);
                return Jd.icD().pvs("bidding_load").icD(jSONObject.toString());
            }
        });
    }

    public static void pvs(final String str, final com.bytedance.sdk.openadsdk.icD.Jd.icD.pvs pvsVar) {
        if (pvsVar == null) {
            return;
        }
        pvs(str, false, new icD() { // from class: com.bytedance.sdk.openadsdk.Wyp.vG.17
            @Override // com.bytedance.sdk.openadsdk.Wyp.icD
            public com.bytedance.sdk.openadsdk.Wyp.pvs.vG getLogStats() throws Exception {
                JSONObject vG = com.bytedance.sdk.openadsdk.icD.Jd.icD.pvs.this.vG();
                if (vG == null) {
                    vG = new JSONObject();
                }
                com.bytedance.sdk.openadsdk.icD.Jd.icD.vG Jd = com.bytedance.sdk.openadsdk.icD.Jd.icD.pvs.this.Jd();
                if (Jd != null) {
                    Jd.pvs(vG);
                }
                return Jd.icD().pvs(str).pvs(com.bytedance.sdk.openadsdk.icD.Jd.icD.pvs.this.pvs().LDD()).icD(vG.toString());
            }
        });
    }

    public static void icD(final cR cRVar) {
        if (jlb.pvs(cRVar) == null || TextUtils.isEmpty(cRVar.tQ())) {
            return;
        }
        pvs("download_gecko_start", false, new icD() { // from class: com.bytedance.sdk.openadsdk.Wyp.vG.18
            @Override // com.bytedance.sdk.openadsdk.Wyp.icD
            public com.bytedance.sdk.openadsdk.Wyp.pvs.vG getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(ImagesContract.URL, cR.this.CjQ());
                jSONObject.put("channel_name", cR.this.tQ());
                return Jd.icD().pvs("download_gecko_start").pvs(cR.this.LDD()).icD(jSONObject.toString());
            }
        });
    }

    public static void pvs(final cR cRVar, final JSONObject jSONObject) {
        if (jlb.pvs(cRVar) == null || TextUtils.isEmpty(cRVar.tQ())) {
            return;
        }
        pvs("download_gecko_end", false, new icD() { // from class: com.bytedance.sdk.openadsdk.Wyp.vG.19
            @Override // com.bytedance.sdk.openadsdk.Wyp.icD
            public com.bytedance.sdk.openadsdk.Wyp.pvs.vG getLogStats() throws Exception {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(ImagesContract.URL, cR.this.CjQ());
                jSONObject2.put("channel_name", cR.this.tQ());
                jSONObject2.put("data", jSONObject);
                return Jd.icD().pvs("download_gecko_end").pvs(cR.this.LDD()).icD(jSONObject2.toString());
            }
        });
    }

    public void pvs(final Jd jd) {
        if (vG(jd)) {
            return;
        }
        jd.pvs("express_ad_render");
        mnm.NB().pvs(new icD() { // from class: com.bytedance.sdk.openadsdk.Wyp.vG.20
            @Override // com.bytedance.sdk.openadsdk.Wyp.icD
            public com.bytedance.sdk.openadsdk.Wyp.pvs.vG getLogStats() throws Exception {
                return jd;
            }
        });
    }

    public void icD(final Jd jd) {
        if (vG(jd)) {
            return;
        }
        jd.pvs("show_backup_endcard");
        mnm.NB().pvs(new icD() { // from class: com.bytedance.sdk.openadsdk.Wyp.vG.21
            @Override // com.bytedance.sdk.openadsdk.Wyp.icD
            public com.bytedance.sdk.openadsdk.Wyp.pvs.vG getLogStats() throws Exception {
                return jd;
            }
        });
    }

    public void pvs(final String str) {
        pvs("click_playable_test_tool", false, new icD() { // from class: com.bytedance.sdk.openadsdk.Wyp.vG.2
            @Override // com.bytedance.sdk.openadsdk.Wyp.icD
            public com.bytedance.sdk.openadsdk.Wyp.pvs.vG getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("playable_url", str);
                } catch (Throwable unused) {
                }
                return Jd.icD().pvs("click_playable_test_tool").icD(jSONObject.toString());
            }
        });
    }

    public void icD(final String str) {
        pvs("close_playable_test_tool", false, new icD() { // from class: com.bytedance.sdk.openadsdk.Wyp.vG.3
            @Override // com.bytedance.sdk.openadsdk.Wyp.icD
            public com.bytedance.sdk.openadsdk.Wyp.pvs.vG getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("playable_url", str);
                } catch (Throwable unused) {
                }
                return Jd.icD().pvs("close_playable_test_tool").icD(jSONObject.toString());
            }
        });
    }

    public void pvs(final String str, final int i, final String str2) {
        pvs("use_playable_test_tool_error", false, new icD() { // from class: com.bytedance.sdk.openadsdk.Wyp.vG.4
            @Override // com.bytedance.sdk.openadsdk.Wyp.icD
            public com.bytedance.sdk.openadsdk.Wyp.pvs.vG getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("playable_url", str);
                    jSONObject.put("error_code", i);
                    jSONObject.put("error_message", str2);
                } catch (Throwable unused) {
                }
                return Jd.icD().pvs("use_playable_test_tool_error").icD(jSONObject.toString());
            }
        });
    }

    public void pvs(final long j, final long j2) {
        final long j3 = j2 - j;
        pvs("general_label", false, new icD() { // from class: com.bytedance.sdk.openadsdk.Wyp.vG.5
            @Override // com.bytedance.sdk.openadsdk.Wyp.icD
            public com.bytedance.sdk.openadsdk.Wyp.pvs.vG getLogStats() throws Exception {
                int i = !Ju.icD.get() ? 1 : 0;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("starttime", j);
                    jSONObject.put("endtime", j2);
                    jSONObject.put("start_type", i);
                } catch (Throwable unused) {
                }
                return Jd.icD().pvs("general_label").so(String.valueOf(j3)).icD(jSONObject.toString());
            }
        });
    }

    public static void icD() {
        ae.vG(new so("showFailLog") { // from class: com.bytedance.sdk.openadsdk.Wyp.vG.6
            @Override // java.lang.Runnable
            public void run() {
                try {
                    vG.pvs().pvs("show_fail_log", new JSONObject());
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.Ju.pvs("StatsLogManager", th.getMessage());
                }
            }
        });
    }

    public void pvs(final String str, final JSONObject jSONObject) {
        if (str == null || jSONObject == null) {
            return;
        }
        pvs(str, false, new icD() { // from class: com.bytedance.sdk.openadsdk.Wyp.vG.7
            @Override // com.bytedance.sdk.openadsdk.Wyp.icD
            public com.bytedance.sdk.openadsdk.Wyp.pvs.vG getLogStats() throws Exception {
                return Jd.icD().pvs(str).icD(jSONObject.toString());
            }
        });
    }

    public void pvs(final String str, final String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        pvs(str, false, new icD() { // from class: com.bytedance.sdk.openadsdk.Wyp.vG.8
            @Override // com.bytedance.sdk.openadsdk.Wyp.icD
            public com.bytedance.sdk.openadsdk.Wyp.pvs.vG getLogStats() throws Exception {
                return Jd.icD().pvs(str).icD(str2);
            }
        });
    }

    public void vG() {
        pvs("blind_mode_status", true, new icD() { // from class: com.bytedance.sdk.openadsdk.Wyp.vG.9
            @Override // com.bytedance.sdk.openadsdk.Wyp.icD
            public com.bytedance.sdk.openadsdk.Wyp.pvs.vG getLogStats() throws Exception {
                return Jd.icD().pvs("blind_mode_status");
            }
        });
    }

    public void pvs(final JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        Object opt = jSONObject.opt("device_ad_mediation_platform");
        if (!(opt instanceof String) || TextUtils.isEmpty((String) opt)) {
            return;
        }
        pvs("ad_revenue", true, new icD() { // from class: com.bytedance.sdk.openadsdk.Wyp.vG.10
            @Override // com.bytedance.sdk.openadsdk.Wyp.icD
            public com.bytedance.sdk.openadsdk.Wyp.pvs.vG getLogStats() throws Exception {
                try {
                    jSONObject.put(NotificationCompat.CATEGORY_EVENT, 272);
                    jSONObject.put("uuid", qh.vG(mnm.pvs()));
                    String str = "";
                    try {
                        if (qh.pvs(mnm.pvs()) != null) {
                            str = qh.pvs(mnm.pvs());
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
                return Jd.icD().pvs("ad_revenue").icD(jSONObject.toString());
            }
        });
    }

    public static void Jd() {
        pvs("disk_log", false, new icD() { // from class: com.bytedance.sdk.openadsdk.Wyp.vG.11
            @Override // com.bytedance.sdk.openadsdk.Wyp.icD
            public com.bytedance.sdk.openadsdk.Wyp.pvs.vG getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                File file = new File(CacheDirFactory.getRootDir());
                long j = 0;
                if (file.exists() && file.isDirectory()) {
                    for (File file2 : file.listFiles()) {
                        long pvs2 = vG.pvs(file2);
                        j += pvs2;
                        jSONObject.put(file2.getName(), pvs2);
                    }
                }
                if (j < 524288000) {
                    return null;
                }
                return Jd.icD().pvs("disk_log").icD(jSONObject.toString());
            }
        });
    }

    public static long pvs(File file) {
        if (file.isFile()) {
            return file.length();
        }
        long j = 0;
        for (File file2 : file.listFiles()) {
            j += pvs(file2);
        }
        return j;
    }

    public static void icD(String str, String str2) {
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                final Jd icD = Jd.icD().pvs(str).icD(str2);
                mnm.NB().pvs(new icD() { // from class: com.bytedance.sdk.openadsdk.Wyp.vG.13
                    @Override // com.bytedance.sdk.openadsdk.Wyp.icD
                    public com.bytedance.sdk.openadsdk.Wyp.pvs.vG getLogStats() throws Exception {
                        return Jd.this;
                    }
                }, false);
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.Ju.pvs("StatsLogManager", th.getMessage());
        }
    }

    public static void pvs(String str, boolean z, icD icd) {
        int icD = com.bytedance.sdk.openadsdk.core.settings.mnm.Lxj().icD(str);
        Object[] objArr = new Object[4];
        Integer.valueOf(icD);
        if (TextUtils.isEmpty(str) || icD == 0 || icd == null) {
            return;
        }
        boolean z2 = icD == 100;
        if (!z2) {
            z2 = ((int) ((Math.random() * 100.0d) + 1.0d)) <= icD;
        }
        if (z2) {
            mnm.NB().pvs(icd, z);
        }
    }

    public static void pvs(long j, long j2, final String str, final int i) {
        if (j == 0) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        final long j3 = elapsedRealtime - j;
        final long j4 = elapsedRealtime - j2;
        final long j5 = j2 - j;
        pvs("ad_show_cost_time", false, new icD() { // from class: com.bytedance.sdk.openadsdk.Wyp.vG.14
            @Override // com.bytedance.sdk.openadsdk.Wyp.icD
            public com.bytedance.sdk.openadsdk.Wyp.pvs.vG getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(TypedValues.TransitionType.S_DURATION, j3);
                jSONObject.put("renderDuration", j4);
                jSONObject.put("showToRenderDuration", j5);
                jSONObject.put("tag", str);
                jSONObject.put("renderType", i);
                return Jd.icD().pvs("ad_show_cost_time").icD(jSONObject.toString());
            }
        });
    }

    public static void vG(final String str) {
        pvs("request_monitor_daily", false, new icD() { // from class: com.bytedance.sdk.openadsdk.Wyp.vG.15
            @Override // com.bytedance.sdk.openadsdk.Wyp.icD
            public com.bytedance.sdk.openadsdk.Wyp.pvs.vG getLogStats() throws Exception {
                return Jd.icD().pvs("request_monitor_daily").icD(str);
            }
        });
    }

    public static void pvs(int i, String str) {
        pvs(i, str, 0, (String) null);
    }

    public static void pvs(final int i, final String str, final int i2, final String str2) {
        pvs("ipv6_req", false, (icD) new icD<com.bytedance.sdk.openadsdk.Wyp.pvs.vG>() { // from class: com.bytedance.sdk.openadsdk.Wyp.vG.16
            @Override // com.bytedance.sdk.openadsdk.Wyp.icD
            public com.bytedance.sdk.openadsdk.Wyp.pvs.vG getLogStats() throws Exception {
                String str3;
                JSONObject jSONObject = new JSONObject();
                int i3 = i;
                if (i3 == 1) {
                    str3 = FirebaseAnalytics.Param.SUCCESS;
                } else if (i3 == -1) {
                    jSONObject.put("error_code", i2);
                    jSONObject.put("error_msg", str2);
                    str3 = "fail";
                } else {
                    str3 = "start";
                }
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put(ImagesContract.URL, str);
                }
                jSONObject.put(NotificationCompat.CATEGORY_STATUS, str3);
                return Jd.icD().pvs("ipv6_req").icD(jSONObject.toString());
            }
        });
    }
}
