package com.bytedance.sdk.openadsdk.core.settings;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.utils.rp;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.ev;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.bytedance.sdk.openadsdk.core.klz;
import com.bytedance.sdk.openadsdk.core.mw;
import com.bytedance.sdk.openadsdk.core.uqh;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.nqi;
import com.bytedance.sdk.openadsdk.utils.oub;
import com.bytedance.sdk.openadsdk.utils.yj;
import com.ironsource.O6;
import com.ironsource.X3;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class bvs extends com.bytedance.sdk.component.zg.fs.zn {
    private final zg fs;
    private final zmn zmn;
    private final Set<btk> zn;

    public interface zmn {
        void zmn(boolean z);
    }

    public bvs(zmn zmnVar, zg zgVar, btk... btkVarArr) {
        super("SetF");
        HashSet hashSet = new HashSet();
        this.zn = hashSet;
        this.zmn = zmnVar;
        this.fs = zgVar;
        hashSet.addAll(Arrays.asList(btkVarArr));
    }

    @Override // java.lang.Runnable
    public void run() {
        Log.d("TTAD.SdkSettingsFetch", "Start Try");
        int zmn2 = rp.zmn(kgc.zmn(), 0L);
        if (zmn2 == 0) {
            Log.d("TTAD.SdkSettingsFetch", "No net");
            this.zmn.zmn(false);
            return;
        }
        JSONObject zmn3 = zmn(zmn2);
        com.bytedance.sdk.component.nps.fs.fb fs = com.bytedance.sdk.openadsdk.iqz.fs.fs().zn().fs();
        try {
            fs.zn(com.bytedance.sdk.openadsdk.bvs.fb.zmn(fs, oub.zmn("/api/ad/union/sdk/settings/", false, true)));
            fs.fs("User-Agent", oub.fb());
        } catch (Exception unused) {
        }
        String jSONObject = fs(zmn3).toString();
        if (kgc.fb().tet() && ev.zmn().fb() == 1) {
            oub.zmn("Pangle_Debug_Mode", jSONObject, kgc.zmn());
        }
        fs.zmn(jSONObject, kgc.fb().cyb());
        fs.zmn(6);
        fs.fs("setting");
        if (com.bytedance.sdk.openadsdk.utils.fs.zmn()) {
            fs.zmn(new com.bytedance.sdk.openadsdk.kgc.fb() { // from class: com.bytedance.sdk.openadsdk.core.settings.bvs.1
                @Override // com.bytedance.sdk.openadsdk.kgc.fb
                public com.bytedance.sdk.openadsdk.kgc.fs.zmn zmn() {
                    com.bytedance.sdk.openadsdk.kgc.fs.zmn zmnVar = new com.bytedance.sdk.openadsdk.kgc.fs.zmn();
                    zmnVar.fs("settings_fetch");
                    return zmnVar;
                }
            });
        } else {
            com.bytedance.sdk.openadsdk.kgc.zn.zmn(new com.bytedance.sdk.openadsdk.kgc.fb() { // from class: com.bytedance.sdk.openadsdk.core.settings.bvs.2
                @Override // com.bytedance.sdk.openadsdk.kgc.fb
                public com.bytedance.sdk.openadsdk.kgc.fs.zmn zmn() {
                    com.bytedance.sdk.openadsdk.kgc.fs.zmn zmnVar = new com.bytedance.sdk.openadsdk.kgc.fs.zmn();
                    zmnVar.fs("settings_fetch");
                    return zmnVar;
                }
            });
        }
        fs.fs(new com.bytedance.sdk.component.nps.zmn.zmn() { // from class: com.bytedance.sdk.openadsdk.core.settings.bvs.3
            @Override // com.bytedance.sdk.component.nps.zmn.zmn
            public void zmn(com.bytedance.sdk.component.nps.fs.zn znVar, com.bytedance.sdk.component.nps.fs fsVar) {
                JSONObject jSONObject2;
                int zmn4 = fsVar.zmn();
                String fb = fsVar.fb();
                if (kgc.fb().tet() && ev.zmn().fb() == 1) {
                    oub.zmn("Pangle_Debug_Mode", fb, kgc.zmn());
                }
                if (fsVar.hhw() && !TextUtils.isEmpty(fb)) {
                    try {
                        jSONObject2 = PangleNetworkBridge.jsonObjectInit(fb);
                    } catch (JSONException unused2) {
                        jSONObject2 = null;
                    }
                    if (jSONObject2 != null) {
                        String zmn5 = uqh.zmn(jSONObject2.optInt("cypher", -1), jSONObject2.optString("message"));
                        if (!TextUtils.isEmpty(zmn5)) {
                            try {
                                jSONObject2 = PangleNetworkBridge.jsonObjectInit(zmn5);
                            } catch (JSONException unused3) {
                            }
                        }
                        try {
                            bvs.this.zmn(zmn5, fsVar.zn());
                        } catch (Throwable unused4) {
                        }
                        try {
                            bvs.this.zmn(jSONObject2);
                            kgc.fb().zmn(System.currentTimeMillis());
                            if (!com.bytedance.sdk.openadsdk.utils.fs.zmn()) {
                                com.bytedance.sdk.openadsdk.kgc.zn.fs(new com.bytedance.sdk.openadsdk.kgc.fb() { // from class: com.bytedance.sdk.openadsdk.core.settings.bvs.3.1
                                    @Override // com.bytedance.sdk.openadsdk.kgc.fb
                                    public com.bytedance.sdk.openadsdk.kgc.fs.zmn zmn() {
                                        com.bytedance.sdk.openadsdk.kgc.fs.zmn zmnVar = new com.bytedance.sdk.openadsdk.kgc.fs.zmn();
                                        zmnVar.fs("settings_fetch");
                                        return zmnVar;
                                    }
                                });
                            }
                            nqi.fs();
                        } catch (Throwable unused5) {
                        }
                        bvs.this.zmn.zmn(true);
                        return;
                    }
                } else if (znVar != null) {
                    nqi.zmn(znVar.hhw());
                }
                if (!com.bytedance.sdk.openadsdk.utils.fs.zmn()) {
                    com.bytedance.sdk.openadsdk.kgc.zn.zn(new com.bytedance.sdk.openadsdk.kgc.fb() { // from class: com.bytedance.sdk.openadsdk.core.settings.bvs.3.2
                        @Override // com.bytedance.sdk.openadsdk.kgc.fb
                        public com.bytedance.sdk.openadsdk.kgc.fs.zmn zmn() {
                            com.bytedance.sdk.openadsdk.kgc.fs.zmn zmnVar = new com.bytedance.sdk.openadsdk.kgc.fs.zmn();
                            zmnVar.fs("settings_fetch");
                            return zmnVar;
                        }
                    });
                }
                if (!fsVar.hhw()) {
                    com.bytedance.sdk.openadsdk.cyb.zmn.btk.zmn("settings_fetch", znVar.hhw(), zmn4, fsVar.fs(), null, null);
                }
                bvs.this.zmn.zmn(false);
            }

            @Override // com.bytedance.sdk.component.nps.zmn.zmn
            public void zmn(com.bytedance.sdk.component.nps.fs.zn znVar, IOException iOException) {
                bvs.this.zmn.zmn(false);
                if (!com.bytedance.sdk.openadsdk.utils.fs.zmn()) {
                    com.bytedance.sdk.openadsdk.kgc.zn.zn(new com.bytedance.sdk.openadsdk.kgc.fb() { // from class: com.bytedance.sdk.openadsdk.core.settings.bvs.3.3
                        @Override // com.bytedance.sdk.openadsdk.kgc.fb
                        public com.bytedance.sdk.openadsdk.kgc.fs.zmn zmn() {
                            com.bytedance.sdk.openadsdk.kgc.fs.zmn zmnVar = new com.bytedance.sdk.openadsdk.kgc.fs.zmn();
                            zmnVar.fs("settings_fetch");
                            return zmnVar;
                        }
                    });
                }
                if (znVar != null) {
                    nqi.zmn(znVar.hhw());
                    com.bytedance.sdk.openadsdk.cyb.zmn.btk.zmn("settings_fetch", znVar.hhw(), -1, iOException != null ? iOException.getMessage() : null, null, null);
                }
            }
        });
        klz.fs(mw.zmn(kgc.zmn()));
        DeviceUtils.klz();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zmn(String str, Map<String, String> map) {
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
                String str2 = (String) hashMap.get("active-control");
                if (str2 != null) {
                    int parseInt = Integer.parseInt(str2);
                    String str3 = (String) hashMap.get("ts");
                    if (str3 != null) {
                        long parseLong = Long.parseLong(str3);
                        String str4 = (String) hashMap.get("pst");
                        String zmn2 = com.bykv.vk.openvk.zmn.zmn.zmn.nps.fs.zmn(str + parseInt + parseLong);
                        if (zmn2 != null) {
                            if (zmn2.equalsIgnoreCase(str4)) {
                                i = parseInt;
                            }
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        nps.zmn(i);
    }

    public static JSONObject zmn(int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            rc fb = kgc.fb();
            jSONObject.put("model", Build.MODEL);
            jSONObject.put("device_city", oub.uqh());
            com.bytedance.sdk.openadsdk.phc.zmn.fs.zmn.zmn().zmn(jSONObject);
            if (com.bytedance.sdk.openadsdk.core.rc.fs.zmn().rc()) {
                jSONObject.put("pa_consent", com.bytedance.sdk.openadsdk.core.iv.fs().iv());
            }
            if (fb.zak("mcc")) {
                jSONObject.put("mcc", yj.fs());
            }
            Context zmn2 = kgc.zmn();
            jSONObject.put("conn_type", oub.nps(i));
            jSONObject.put("os", 1);
            jSONObject.put("oversea_version_type", 1);
            jSONObject.put(CommonUrlParts.OS_VERSION, Build.VERSION.RELEASE);
            jSONObject.put("aos_api_level", Build.VERSION.SDK_INT);
            jSONObject.put("sdk_version", BuildConfig.VERSION_NAME);
            jSONObject.put(POBConstants.KEY_LANGUAGE, mw.fs());
            jSONObject.put("time_zone", oub.kjb());
            jSONObject.put("package_name", oub.hhw());
            jSONObject.put(X3.i.L, oub.zmn() ? 1 : 2);
            jSONObject.put("app_version", oub.zg());
            jSONObject.put(VastAttributes.VENDOR, Build.MANUFACTURER);
            jSONObject.put(CommonUrlParts.UUID, mw.zn(zmn2));
            String fb2 = com.bytedance.sdk.openadsdk.core.iv.fs().fb();
            if (fb2 != null) {
                jSONObject.put("app_id", fb2);
            }
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            jSONObject.put("ts", currentTimeMillis);
            String str = "";
            if (fb2 != null) {
                str = fb2.concat(String.valueOf(currentTimeMillis)).concat(BuildConfig.VERSION_NAME);
            }
            jSONObject.put("req_sign", com.bytedance.sdk.component.utils.btk.zmn(str));
            jSONObject.put("tcstring", rc.fs(zmn2));
            jSONObject.put("tcf_gdpr", rc.zmn(zmn2));
            jSONObject.put("lmt", DeviceUtils.zn());
            jSONObject.put("locale_language", DeviceUtils.fb());
            jSONObject.put("channel", X3.i.Z);
            JSONObject hhw = fb.hhw();
            if (hhw != null) {
                jSONObject.put("digest", hhw);
            }
            jSONObject.put("data_time", fb.nps());
            jSONObject.put(CommonUrlParts.APP_SET_ID_SCOPE, fb.fs());
            jSONObject.put(CommonUrlParts.APP_SET_ID, fb.zn());
            jSONObject.put("installed_source", fb.fb());
            jSONObject.put("did", mw.zmn(kgc.zmn()));
            jSONObject.put(O6.X0, com.bytedance.sdk.openadsdk.phc.zmn.fs.zmn.zmn().fs());
            String nps = com.bytedance.sdk.openadsdk.core.iv.fs().nps();
            if (!TextUtils.isEmpty(nps)) {
                jSONObject.put("mediation", nps);
            }
            jSONObject.put("device", DeviceUtils.zmn(zmn2, true));
            jSONObject.put("adx_id", com.bytedance.sdk.openadsdk.core.iv.fs().doe());
            jSONObject.put("user_compliance_status", com.bytedance.sdk.openadsdk.core.rc.fs.zmn().zg());
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    private JSONObject fs(JSONObject jSONObject) {
        return uqh.zmn(PangleEncryptConstant.CryptDataScene.SETTINGS, jSONObject);
    }

    public boolean zmn(@NonNull JSONObject jSONObject) {
        this.fs.zmn(jSONObject);
        for (btk btkVar : this.zn) {
            if (btkVar != null) {
                btkVar.zmn(jSONObject);
            }
        }
        return this.fs.zn;
    }
}
