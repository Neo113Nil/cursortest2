package com.bytedance.sdk.openadsdk.core.settings;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.component.utils.ny;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.dyT;
import com.bytedance.sdk.openadsdk.multipro.aidl.BinderPoolService;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.ZhG;
import com.bytedance.sdk.openadsdk.utils.jlb;
import com.google.common.net.HttpHeaders;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: SettingsFetchTask.java */
/* loaded from: classes2.dex */
public class IP extends com.bytedance.sdk.component.so.so {
    private final Ju icD;
    private final pvs pvs;
    private final Set<NB> vG;

    /* compiled from: SettingsFetchTask.java */
    public interface pvs {
        void pvs(boolean z);
    }

    public IP(pvs pvsVar, Ju ju, NB... nbArr) {
        super("SetF");
        HashSet hashSet = new HashSet();
        this.vG = hashSet;
        this.pvs = pvsVar;
        this.icD = ju;
        hashSet.addAll(Arrays.asList(nbArr));
    }

    @Override // java.lang.Runnable
    public void run() {
        Log.d("TTAD.SdkSettingsFetch", "Start Try");
        int pvs2 = ny.pvs(com.bytedance.sdk.openadsdk.core.mnm.pvs(), 0L);
        if (pvs2 == 0) {
            Log.d("TTAD.SdkSettingsFetch", "No net");
            this.pvs.pvs(false);
            return;
        }
        final com.bytedance.sdk.openadsdk.Wyp.pvs.NB nb = new com.bytedance.sdk.openadsdk.Wyp.pvs.NB(1);
        JSONObject pvs3 = pvs(pvs2);
        com.bytedance.sdk.component.yiw.icD.Jd icD = com.bytedance.sdk.openadsdk.qh.vG.pvs().icD().icD();
        try {
            String pvs4 = com.bytedance.sdk.openadsdk.NB.Jd.pvs(icD, jlb.Jd("/api/ad/union/sdk/settings/"));
            icD.icD(pvs4);
            icD.icD(HttpHeaders.USER_AGENT, jlb.vG());
            nb.pvs(pvs4);
        } catch (Exception unused) {
        }
        String jSONObject = icD(pvs3).toString();
        if (com.bytedance.sdk.openadsdk.core.mnm.Jd().BSi() && dyT.pvs().yiw() == 1) {
            jlb.pvs("Pangle_Debug_Mode", jSONObject, com.bytedance.sdk.openadsdk.core.mnm.pvs());
        }
        icD.pvs(jSONObject, com.bytedance.sdk.openadsdk.core.mnm.Jd().cR());
        nb.pvs(icD.vG()).pvs();
        icD.pvs(6);
        icD.pvs("setting");
        icD.pvs(new com.bytedance.sdk.component.yiw.pvs.pvs() { // from class: com.bytedance.sdk.openadsdk.core.settings.IP.1
            @Override // com.bytedance.sdk.component.yiw.pvs.pvs
            public void pvs(com.bytedance.sdk.component.yiw.icD.vG vGVar, com.bytedance.sdk.component.yiw.icD icd) {
                JSONObject jSONObject2;
                int optInt;
                int pvs5 = icd.pvs();
                String Jd = icd.Jd();
                if (com.bytedance.sdk.openadsdk.core.mnm.Jd().BSi() && dyT.pvs().yiw() == 1) {
                    jlb.pvs("Pangle_Debug_Mode", Jd, com.bytedance.sdk.openadsdk.core.mnm.pvs());
                }
                if (icd.sUS() && !TextUtils.isEmpty(Jd)) {
                    nb.vG(Jd).pvs(pvs5).pvs(true).vG();
                    String str = null;
                    try {
                        jSONObject2 = new JSONObject(Jd);
                    } catch (JSONException unused2) {
                        jSONObject2 = null;
                    }
                    if (jSONObject2 != null && (optInt = jSONObject2.optInt("cypher", -1)) != -1) {
                        if (optInt == 3) {
                            str = com.bytedance.sdk.component.utils.pvs.vG(jSONObject2.optString(PglCryptUtils.KEY_MESSAGE));
                            if (!TextUtils.isEmpty(str)) {
                                try {
                                    jSONObject2 = new JSONObject(str);
                                } catch (Throwable unused3) {
                                }
                            }
                        }
                        try {
                            IP.this.pvs(str, icd.vG());
                        } catch (Throwable unused4) {
                        }
                        try {
                            IP.this.pvs(jSONObject2);
                            com.bytedance.sdk.openadsdk.core.mnm.Jd().pvs(System.currentTimeMillis());
                        } catch (Throwable unused5) {
                        }
                        IP.this.pvs.pvs(true);
                        com.bytedance.sdk.openadsdk.core.sUS.pvs.pvs();
                        return;
                    }
                }
                nb.vG(Jd).pvs(pvs5).Jd(icd.icD()).pvs(icd.sUS()).vG();
                IP.this.pvs.pvs(false);
            }

            @Override // com.bytedance.sdk.component.yiw.pvs.pvs
            public void pvs(com.bytedance.sdk.component.yiw.icD.vG vGVar, IOException iOException) {
                nb.Jd(iOException != null ? iOException.getMessage() : null).pvs(false).vG();
                IP.this.pvs.pvs(false);
                com.bytedance.sdk.openadsdk.core.sUS.pvs.pvs();
            }
        });
        DeviceUtils.qh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pvs(String str, Map<String, String> map) {
        int i = 1;
        try {
            if (!TextUtils.isEmpty(str) && map != null) {
                HashMap hashMap = new HashMap();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    String key = entry.getKey();
                    if (key != null) {
                        hashMap.put(key.toLowerCase(Locale.US), entry.getValue());
                    }
                }
                int parseInt = Integer.parseInt((String) hashMap.get("active-control"));
                long parseLong = Long.parseLong((String) hashMap.get("ts"));
                String str2 = (String) hashMap.get("pst");
                String pvs2 = com.bykv.vk.openvk.component.video.api.sUS.icD.pvs(str + parseInt + parseLong);
                if (pvs2 != null) {
                    if (pvs2.equalsIgnoreCase(str2)) {
                        i = parseInt;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        kj.pvs(i);
    }

    public static JSONObject pvs(int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            sUS Jd = com.bytedance.sdk.openadsdk.core.mnm.Jd();
            jSONObject.put("model", Build.MODEL);
            jSONObject.put("device_city", jlb.bNS());
            if (Jd.ae("gaid")) {
                jSONObject.put("gaid", com.com.bytedance.overseas.sdk.icD.pvs.pvs().icD());
            }
            jSONObject.put("gdpr", com.bytedance.sdk.openadsdk.core.so.icD().so());
            jSONObject.put("coppa", com.bytedance.sdk.openadsdk.core.so.icD().yiw());
            jSONObject.put("ccpa", com.bytedance.sdk.openadsdk.core.so.icD().uc());
            if (Jd.ae("mcc")) {
                jSONObject.put("mcc", ZhG.icD());
            }
            Context pvs2 = com.bytedance.sdk.openadsdk.core.mnm.pvs();
            jSONObject.put("conn_type", jlb.yiw(i));
            int i2 = 1;
            jSONObject.put("os", 1);
            jSONObject.put("oversea_version_type", 1);
            jSONObject.put("os_version", Build.VERSION.RELEASE);
            jSONObject.put("aos_api_level", Build.VERSION.SDK_INT);
            jSONObject.put("sdk_version", BuildConfig.VERSION_NAME);
            jSONObject.put("language", com.bytedance.sdk.openadsdk.core.qh.pvs());
            jSONObject.put("time_zone", jlb.cR());
            jSONObject.put("package_name", jlb.NB());
            if (!jlb.pvs()) {
                i2 = 2;
            }
            jSONObject.put("position", i2);
            jSONObject.put("app_version", jlb.yiw());
            jSONObject.put("vendor", Build.MANUFACTURER);
            jSONObject.put("uuid", com.bytedance.sdk.openadsdk.core.qh.vG(pvs2));
            String Jd2 = com.bytedance.sdk.openadsdk.core.so.icD().Jd();
            if (Jd2 != null) {
                jSONObject.put("app_id", Jd2);
            }
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            jSONObject.put("ts", currentTimeMillis);
            jSONObject.put("req_sign", com.bytedance.sdk.component.utils.NB.pvs(Jd2 != null ? Jd2.concat(String.valueOf(currentTimeMillis)).concat(BuildConfig.VERSION_NAME) : ""));
            jSONObject.put("tcstring", mnm.vG(pvs2));
            jSONObject.put("tcf_gdpr", mnm.icD(pvs2));
            jSONObject.put("lmt", DeviceUtils.vG());
            jSONObject.put("locale_language", DeviceUtils.Jd());
            jSONObject.put("channel", "main");
            JSONObject NB = Jd.NB();
            if (NB != null) {
                jSONObject.put("digest", NB);
            }
            jSONObject.put("data_time", Jd.sUS());
            jSONObject.put("app_set_id_scope", Jd.icD());
            jSONObject.put("app_set_id", Jd.vG());
            jSONObject.put("installed_source", Jd.Jd());
            if (Jd.ae("gaid")) {
                jSONObject.put("did", com.bytedance.sdk.openadsdk.core.qh.pvs(com.bytedance.sdk.openadsdk.core.mnm.pvs()));
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    private JSONObject icD(JSONObject jSONObject) {
        return com.bytedance.sdk.component.utils.pvs.pvs(jSONObject);
    }

    public boolean pvs(JSONObject jSONObject) {
        this.icD.pvs(jSONObject);
        for (NB nb : this.vG) {
            if (nb != null) {
                nb.pvs(jSONObject);
            }
        }
        return this.icD.vG;
    }

    public static boolean pvs() {
        return BinderPoolService.pvs;
    }
}
