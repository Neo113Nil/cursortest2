package com.bytedance.sdk.openadsdk;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.apm.insight.AttachUserData;
import com.apm.insight.CrashType;
import com.apm.insight.CustomRequestHeader;
import com.apm.insight.MonitorCrash;
import com.apm.insight.Npth;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.embedapplog.PangleEncryptManager;
import com.bytedance.sdk.component.utils.iqz;
import com.bytedance.sdk.component.zg.fs.zn;
import com.bytedance.sdk.openadsdk.common.hhw;
import com.bytedance.sdk.openadsdk.core.bjh;
import com.bytedance.sdk.openadsdk.core.iv;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.mw;
import com.bytedance.sdk.openadsdk.core.settings.rc;
import com.bytedance.sdk.openadsdk.uqh.btk;
import com.bytedance.sdk.openadsdk.utils.nu;
import com.bytedance.sdk.openadsdk.utils.oub;
import com.ironsource.C4538a2;
import com.ironsource.C4913ua;
import com.ironsource.O6;
import com.pgl.ssdk.ces.out.PglSSConfig;
import com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayData;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.d;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class ApmHelper {
    private static fs btk;
    private static boolean fb;
    private static final AtomicBoolean fs = new AtomicBoolean(false);
    private static zmn hhw;
    private static volatile boolean zmn;
    private static String zn;

    private interface fs {
        void zmn(String str, String str2, Throwable th);
    }

    public static void initAPM() {
        if (hhw.zmn()) {
            return;
        }
        try {
            String fb2 = iv.fs().fb();
            if (TextUtils.isEmpty(fb2)) {
                return;
            }
            initApm(kgc.zmn(), fb2);
        } catch (Exception unused) {
        }
    }

    public static void initApm(final Context context, final String str) {
        if (com.bytedance.sdk.openadsdk.core.rc.fs.zmn().btk() || !fs.compareAndSet(false, true) || zmn) {
            return;
        }
        nu.zmn(new zn("init-apm") { // from class: com.bytedance.sdk.openadsdk.ApmHelper.1
            @Override // java.lang.Runnable
            public void run() {
                if (!ApmHelper.zmn) {
                    rc fb2 = kgc.fb();
                    boolean unused = ApmHelper.fb = fb2.mpi();
                    String kgc = oub.kgc();
                    if (ApmHelper.fb && !TextUtils.isEmpty(kgc)) {
                        String unused2 = ApmHelper.zn = str;
                        String[] strArr = {"com.bytedance.sdk.component", "com.bytedance.sdk.mediation", BuildConfig.LIBRARY_PACKAGE_NAME, "com.com.bytedance.overseas.sdk", "com.pgl.ssdk", "com.bykv.vk", "com.iab.omid.library.bytedance2", "com.bytedance.adsdk"};
                        String zmn2 = mw.zmn(context);
                        try {
                            Npth.setCrashWaitTime(btk.zmn("apm_crash_wait_time", 10000));
                            Npth.enableLoopMonitor(false);
                            Npth.enableAnrInfo(false);
                            Npth.enableNativeDump(false);
                            Npth.enableActivityDump(false);
                            Npth.enableMessageDump(false);
                            MonitorCrash.setCustomRequestHeaderCallback(new CustomRequestHeader() { // from class: com.bytedance.sdk.openadsdk.ApmHelper.1.1
                                @Override // com.apm.insight.CustomRequestHeader
                                public void addRequestHeader(HttpURLConnection httpURLConnection) {
                                    Pair<String, String> generateRequestHeader = ApmHelper.generateRequestHeader();
                                    httpURLConnection.setRequestProperty("cypher", (String) generateRequestHeader.first);
                                    httpURLConnection.setRequestProperty("transfer-param", (String) generateRequestHeader.second);
                                    httpURLConnection.setRequestProperty("x-pangle-target-idc", kgc.fb().eug());
                                }
                            });
                            final MonitorCrash initSDK = MonitorCrash.initSDK(context, "10000001", 8104L, BuildConfig.VERSION_NAME, strArr);
                            initSDK.setCustomDataCallback(new AttachUserData() { // from class: com.bytedance.sdk.openadsdk.ApmHelper.1.2
                                @Override // com.apm.insight.AttachUserData
                                @Nullable
                                public Map<? extends String, ? extends String> getUserData(CrashType crashType) {
                                    Map<? extends String, ? extends String> nps = ApmHelper.nps();
                                    if (nps.containsKey("render_type")) {
                                        initSDK.addTags("render_type", nps.get("render_type"));
                                    } else {
                                        initSDK.addTags("render_type", "-2");
                                    }
                                    return nps;
                                }
                            });
                            if (fb2.mhu()) {
                                initSDK.config().setSoList(new String[]{"libnms.so", "libtobEmbedPagEncrypt.so", "tt_ugen_layout.so"});
                            }
                            initSDK.config().setDeviceId(zmn2);
                            initSDK.setReportUrl(kgc);
                            initSDK.addTags("host_appid", str);
                            initSDK.addTags("sdk_version", BuildConfig.VERSION_NAME);
                            fs unused3 = ApmHelper.btk = new fs() { // from class: com.bytedance.sdk.openadsdk.ApmHelper.1.3
                                @Override // com.bytedance.sdk.openadsdk.ApmHelper.fs
                                public void zmn(String str2, String str3, Throwable th) {
                                    initSDK.reportCustomErr(str2, str3, th);
                                }
                            };
                            boolean unused4 = ApmHelper.zmn = true;
                            ApmHelper.zn(zmn2, kgc);
                            zmn zmnVar = ApmHelper.hhw;
                            zmn unused5 = ApmHelper.hhw = null;
                            if (zmnVar != null) {
                                ApmHelper.btk.zmn(zmnVar.zmn, zmnVar.fs, zmnVar.zn);
                            }
                        } catch (Throwable unused6) {
                            boolean unused7 = ApmHelper.zmn = false;
                        }
                    }
                }
                ApmHelper.fs.set(false);
            }
        });
    }

    public static void reportCustomError(String str, String str2, Throwable th) {
        fs fsVar = btk;
        if (fsVar != null) {
            fsVar.zmn(str, str2, th);
        } else {
            hhw = new zmn(str, str2, th);
        }
    }

    private static class zmn {
        public final String fs;
        public final String zmn;
        public final Throwable zn;

        public zmn(String str, String str2, Throwable th) {
            this.zmn = str;
            this.fs = str2;
            this.zn = th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map<String, String> nps() {
        HashMap hashMap = new HashMap();
        nqi hhw2 = com.bytedance.sdk.openadsdk.utils.fs.hhw();
        if (hhw2 != null) {
            hashMap.put("adType", String.valueOf(hhw2.sft()));
            hashMap.put(C4913ua.b, String.valueOf(hhw2.htj()));
            hashMap.put("cid", hhw2.ji());
            hashMap.put("reqId", hhw2.wbj());
            hashMap.put("rit", hhw2.so(C4538a2.f));
            int skn = hhw2.skn();
            if (hhw2.nkt() != 2) {
                skn = -1;
            }
            hashMap.put("render_type", String.valueOf(skn));
        }
        return hashMap;
    }

    private static void fs(String str, String str2) {
        if (com.bytedance.sdk.openadsdk.core.rc.fs.zmn().btk() || TextUtils.isEmpty(str2)) {
            return;
        }
        kgc.zn().zmn(fs(str), d.u + str2 + "/monitor/collect/c/session?version_code=8104&device_platform=android&aid=10000001");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zn(String str, String str2) {
        fs(str, str2);
    }

    public static void reportPvFromBackGround() {
        if (fb) {
            fs(mw.zmn(kgc.zmn()), oub.kgc());
        }
    }

    private static JSONObject fs(String str) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put("sdk_version", BuildConfig.VERSION_NAME);
            jSONObject3.put("host_app_id", zn);
            jSONObject2.putOpt("custom", jSONObject3);
            jSONObject2.put("os", "Android");
            jSONObject2.put(CommonUrlParts.OS_VERSION, Build.VERSION.RELEASE);
            jSONObject2.put("device_model", Build.MODEL);
            jSONObject2.put("device_brand", Build.BRAND);
            jSONObject2.put("sdk_version_name", "0.0.5");
            jSONObject2.put(C4913ua.b, "10000001");
            jSONObject2.put("update_version_code", BuildConfig.VERSION_CODE);
            jSONObject2.put("bd_did", str);
            jSONObject.putOpt("apm_id", "20000001");
            jSONObject.putOpt(POBCTAOverlayData.KEY_CTA_HEADER, jSONObject2);
            jSONObject.putOpt("local_time", Long.valueOf(System.currentTimeMillis()));
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(new JSONObject().put("local_time_ms", System.currentTimeMillis()));
            jSONObject.putOpt("launch", jSONArray);
        } catch (JSONException e) {
            iqz.zn("ApmHelper", e.getMessage());
        }
        return jSONObject;
    }

    public static boolean isIsInit() {
        return zmn;
    }

    @NonNull
    public static Pair<String, String> generateRequestHeader() {
        String str = "";
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(O6.X0, com.bytedance.sdk.openadsdk.phc.zmn.fs.zmn.zmn().fs());
            jSONObject.put("ipv6", com.bytedance.sdk.openadsdk.kw.fb.zmn.fs("ttopenadsdk", PglSSConfig.CUSTOMINFO_KEY_IPV6, ""));
            jSONObject.put("region", kgc.fb().cud());
        } catch (JSONException unused) {
        }
        JSONObject encryptType4WithNoWrapBase64 = PangleEncryptManager.encryptType4WithNoWrapBase64(jSONObject, new bjh(PangleEncryptConstant.CryptDataScene.UNKNOWN));
        String str2 = "0";
        if (encryptType4WithNoWrapBase64 != null) {
            int optInt = encryptType4WithNoWrapBase64.optInt("cypher");
            if (optInt == 4) {
                str = encryptType4WithNoWrapBase64.optString("message");
                str2 = "4";
            } else if (optInt == 3) {
                str = encryptType4WithNoWrapBase64.optString("message");
                str2 = "3";
            } else {
                str = jSONObject.toString();
            }
        }
        return new Pair<>(str2, str);
    }
}
