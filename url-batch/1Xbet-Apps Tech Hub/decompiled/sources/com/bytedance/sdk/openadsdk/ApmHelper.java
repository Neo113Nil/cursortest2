package com.bytedance.sdk.openadsdk;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.apm.insight.AttachUserData;
import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.MonitorCrash;
import com.bytedance.sdk.component.so.so;
import com.bytedance.sdk.component.utils.Ju;
import com.bytedance.sdk.openadsdk.core.mnm;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.core.qh;
import com.bytedance.sdk.openadsdk.core.settings.sUS;
import com.bytedance.sdk.openadsdk.icD.vG;
import com.bytedance.sdk.openadsdk.utils.ae;
import com.bytedance.sdk.openadsdk.utils.jlb;
import io.ktor.http.LinkHeader;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class ApmHelper {
    private static boolean Jd = false;
    private static volatile boolean pvs = false;
    private static icD sUS;
    private static String vG;
    private static pvs yiw;
    private static final AtomicBoolean icD = new AtomicBoolean(false);
    private static boolean NB = false;

    private interface icD {
        void pvs(String str, String str2, Throwable th);
    }

    public static void initApm(final Context context, final InitConfig initConfig) {
        if (icD.compareAndSet(false, true) && !pvs) {
            ae.pvs(new so("init-apm") { // from class: com.bytedance.sdk.openadsdk.ApmHelper.1
                @Override // java.lang.Runnable
                public void run() {
                    if (!ApmHelper.pvs) {
                        sUS Jd2 = mnm.Jd();
                        boolean unused = ApmHelper.Jd = Jd2.ea();
                        if (ApmHelper.Jd && !TextUtils.isEmpty(Jd2.sP())) {
                            String unused2 = ApmHelper.vG = initConfig.getAppId();
                            String[] strArr = {"com.bytedance.sdk.component", "com.bytedance.sdk.mediation", BuildConfig.LIBRARY_PACKAGE_NAME, "com.com.bytedance.overseas.sdk", "com.pgl.ssdk", "com.bykv.vk", "com.iab.omid.library.bytedance2", "com.bytedance.adsdk"};
                            String pvs2 = qh.pvs(context);
                            String sP = Jd2.sP();
                            try {
                                final MonitorCrash initSDK = MonitorCrash.initSDK(context, "10000001", 6109L, BuildConfig.VERSION_NAME, strArr);
                                initSDK.setCustomDataCallback(new AttachUserData() { // from class: com.bytedance.sdk.openadsdk.ApmHelper.1.1
                                    @Override // com.apm.insight.AttachUserData
                                    public Map<? extends String, ? extends String> getUserData(CrashType crashType) {
                                        Map<? extends String, ? extends String> Wyp = ApmHelper.Wyp();
                                        if (Wyp.containsKey("render_type")) {
                                            initSDK.addTags("render_type", Wyp.get("render_type"));
                                        } else {
                                            initSDK.addTags("render_type", "-2");
                                        }
                                        return Wyp;
                                    }
                                });
                                if (Jd2.Ayu()) {
                                    initSDK.config().setSoList(new String[]{"libnms.so", "libtobEmbedPagEncrypt.so"});
                                }
                                initSDK.config().setDeviceId(pvs2);
                                initSDK.setReportUrl(sP);
                                initSDK.addTags("host_appid", ApmHelper.vG);
                                initSDK.addTags("sdk_version", BuildConfig.VERSION_NAME);
                                initSDK.config().setChannel(ApmHelper.qh());
                                icD unused3 = ApmHelper.sUS = new icD() { // from class: com.bytedance.sdk.openadsdk.ApmHelper.1.2
                                    @Override // com.bytedance.sdk.openadsdk.ApmHelper.icD
                                    public void pvs(String str, String str2, Throwable th) {
                                        initSDK.reportCustomErr(str, str2, th);
                                    }
                                };
                                boolean unused4 = ApmHelper.pvs = true;
                                ApmHelper.vG(pvs2, sP);
                                initSDK.registerCrashCallback(new ICrashCallback() { // from class: com.bytedance.sdk.openadsdk.ApmHelper.1.3
                                    @Override // com.apm.insight.ICrashCallback
                                    public void onCrash(CrashType crashType, String str, Thread thread) {
                                        if (!ApmHelper.NB) {
                                            ApmHelper.Jd(crashType.getName());
                                        }
                                        boolean unused5 = ApmHelper.NB = true;
                                    }
                                }, CrashType.ALL);
                                pvs pvsVar = ApmHelper.yiw;
                                pvs unused5 = ApmHelper.yiw = null;
                                if (pvsVar != null) {
                                    ApmHelper.sUS.pvs(pvsVar.pvs, pvsVar.icD, pvsVar.vG);
                                }
                            } catch (Throwable unused6) {
                                boolean unused7 = ApmHelper.pvs = false;
                            }
                        }
                    }
                    ApmHelper.icD.set(false);
                }
            });
        }
    }

    public static void reportCustomError(String str, String str2, Throwable th) {
        icD icd = sUS;
        if (icd != null) {
            icd.pvs(str, str2, th);
        } else {
            yiw = new pvs(str, str2, th);
        }
    }

    private static class pvs {
        public final String icD;
        public final String pvs;
        public final Throwable vG;

        public pvs(String str, String str2, Throwable th) {
            this.pvs = str;
            this.icD = str2;
            this.vG = th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map<String, String> Wyp() {
        HashMap hashMap = new HashMap();
        cR pvs2 = com.bytedance.sdk.openadsdk.utils.icD.pvs();
        if (pvs2 != null) {
            hashMap.put("adType", String.valueOf(pvs2.LDD()));
            hashMap.put("aid", String.valueOf(pvs2.cUm()));
            hashMap.put("cid", pvs2.neB());
            hashMap.put("reqId", pvs2.Yjw());
            hashMap.put("rit", pvs2.dyT("-1"));
            int dyT = pvs2.dyT();
            if (pvs2.OT() != 2) {
                dyT = -1;
            }
            hashMap.put("render_type", String.valueOf(dyT));
        }
        return hashMap;
    }

    private static void icD(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        mnm.vG().pvs(vG(str), "https://" + str2 + "/monitor/collect/c/session?version_code=6109&device_platform=android&aid=10000001");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void vG(String str, String str2) {
        icD(str, str2);
    }

    public static void reportPvFromBackGround() {
        if (Jd) {
            icD(qh.pvs(mnm.pvs()), mnm.Jd().sP());
        }
    }

    private static JSONObject vG(String str) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put("sdk_version", BuildConfig.VERSION_NAME);
            jSONObject3.put("host_app_id", vG);
            jSONObject2.putOpt("custom", jSONObject3);
            jSONObject2.put("os", "Android");
            jSONObject2.put("os_version", Build.VERSION.RELEASE);
            jSONObject2.put("device_model", Build.MODEL);
            jSONObject2.put("device_brand", Build.BRAND);
            jSONObject2.put("sdk_version_name", "0.0.5");
            jSONObject2.put("channel", qh());
            jSONObject2.put("aid", "10000001");
            jSONObject2.put("update_version_code", BuildConfig.VERSION_CODE);
            jSONObject2.put("bd_did", str);
            jSONObject.putOpt("header", jSONObject2);
            jSONObject.putOpt("local_time", Long.valueOf(System.currentTimeMillis()));
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(new JSONObject().put("local_time_ms", System.currentTimeMillis()));
            jSONObject.putOpt("launch", jSONArray);
        } catch (JSONException e) {
            Ju.pvs("ApmHelper", e.getMessage());
        }
        return jSONObject;
    }

    public static boolean isIsInit() {
        return pvs;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void Jd(final String str) {
        final cR pvs2 = com.bytedance.sdk.openadsdk.utils.icD.pvs();
        if (pvs2 != null) {
            String pvs3 = jlb.pvs(pvs2);
            if (TextUtils.isEmpty(pvs3)) {
                return;
            }
            vG.pvs(System.currentTimeMillis(), pvs2, pvs3, "sdk_crash_info", new com.bytedance.sdk.openadsdk.Wyp.vG.pvs() { // from class: com.bytedance.sdk.openadsdk.ApmHelper.2
                @Override // com.bytedance.sdk.openadsdk.Wyp.vG.pvs
                public JSONObject pvs() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put(LinkHeader.Parameters.Type, str);
                        jSONObject2.put("material", com.bytedance.sdk.component.utils.pvs.pvs(pvs2.wjr()).toString());
                        jSONObject.put("ad_extra_data", jSONObject2.toString());
                    } catch (JSONException unused) {
                    }
                    return jSONObject;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String qh() {
        sUS Jd2 = mnm.Jd();
        return Jd2 != null ? Jd2.Ju() ? "support_mem_dynamic_1" : "support_mem_dynamic_0" : "release";
    }
}
