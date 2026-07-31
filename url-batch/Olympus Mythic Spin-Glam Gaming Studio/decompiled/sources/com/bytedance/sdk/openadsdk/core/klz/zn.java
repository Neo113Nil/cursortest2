package com.bytedance.sdk.openadsdk.core.klz;

import android.text.TextUtils;
import android.view.MotionEvent;
import com.bytedance.sdk.component.utils.btk;
import com.bytedance.sdk.component.utils.iqz;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.ironsource.C4538a2;
import com.pgl.ssdk.ces.out.PglSSManager;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class zn {
    private static boolean zmn;

    public static void zmn() {
        if (!zmn && kgc.fb().bxw()) {
            fs.fs();
            zmn = fs.fs().zn();
        }
    }

    public static void zmn(String str) {
        if (kgc.fb().bxw()) {
            fs.fs().zmn(str);
        }
    }

    public static void fs(String str) {
        if (TextUtils.isEmpty(str) || !kgc.fb().bxw()) {
            return;
        }
        fs.fs().fs(str);
    }

    public static void fs() {
        if (kgc.fb().bxw()) {
            fs.fs().zmn();
        }
    }

    public static void zmn(Map<String, Object> map) {
        if (kgc.fb().bxw()) {
            fs.fs().zmn(map);
        }
    }

    public static void zmn(nqi nqiVar, String str) {
        long j;
        long j2;
        long j3;
        Object obj;
        if (kgc.fb().bxw()) {
            HashMap hashMap = new HashMap();
            hashMap.put("ad_sdk_version", BuildConfig.VERSION_NAME);
            hashMap.put("au_show", str);
            if (nqiVar != null) {
                String wbj = nqiVar.wbj();
                boolean isEmpty = TextUtils.isEmpty(wbj);
                String str2 = C4538a2.f;
                if (!isEmpty) {
                    hashMap.put("request_id", wbj);
                } else {
                    hashMap.put("request_id", C4538a2.f);
                }
                try {
                    long j4 = -1;
                    if (nqiVar.wu() != null) {
                        j = nqiVar.wu().optLong(CreativeInfo.c, -1L);
                        j2 = nqiVar.wu().optLong("rit", -1L);
                        j3 = nqiVar.wu().optLong("ad_slot_type", -1L);
                        str2 = nqiVar.wu().optString("ad_type", C4538a2.f);
                    } else {
                        j = -1;
                        j2 = -1;
                        j3 = -1;
                    }
                    hashMap.put(CreativeInfo.c, Long.valueOf(j));
                    hashMap.put("rit", Long.valueOf(j2));
                    hashMap.put("ad_slot_type", Long.valueOf(j3));
                    hashMap.put("ad_type", str2);
                    Map<String, Object> hr = nqiVar.hr();
                    if (hr != null && (obj = hr.get(TTAdConstant.SDK_BIDDING_TYPE)) != null) {
                        j4 = Long.parseLong(obj.toString());
                    }
                    hashMap.put(TTAdConstant.SDK_BIDDING_TYPE, Long.valueOf(j4));
                    fs.fs().zmn(PglSSManager.REPORT_SCENE_ADSHOW, hashMap);
                } catch (Throwable unused) {
                }
            }
        }
    }

    public static Map<String, String> zmn(String str, String str2) {
        if (kgc.fb().bxw()) {
            return fs.fs().zmn(str, str2 != null ? str2.getBytes() : new byte[0]);
        }
        return new HashMap();
    }

    public static String zn() {
        if (kgc.fb().bxw()) {
            return fs.fs().btk();
        }
        return "";
    }

    public static long fb() {
        if (kgc.fb().bxw()) {
            return fs.fs().hhw();
        }
        return 0L;
    }

    public static int btk() {
        if (kgc.fb().bxw()) {
            return fs.fs().nps();
        }
        return 6;
    }

    public static void zmn(MotionEvent motionEvent) {
        if (kgc.fb().bxw()) {
            fs.fs().zmn(motionEvent);
        }
    }

    public static void zmn(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            if (kgc.fb().bxw()) {
                zmn();
                if (btk() == 0) {
                    jSONObject.put("sec_did", fs.fs().fb());
                    String zmn2 = btk.zmn(jSONObject.toString());
                    Map<String, String> zmn3 = fs.fs().zmn("https://api16-access-sg.pangle.io/api/ad/union/sdk/get_ads/?aid=1371&device_platform=android&version_code=4250", zmn2 != null ? zmn2.getBytes() : new byte[0]);
                    if (zmn3 != null && zmn3.size() > 0) {
                        for (String str : zmn3.keySet()) {
                            jSONObject.put(str, zmn3.get(str));
                        }
                        jSONObject.put("url", "https://api16-access-sg.pangle.io/api/ad/union/sdk/get_ads/?aid=1371&device_platform=android&version_code=4250");
                        jSONObject.put("pangle_m", zmn2);
                    } else {
                        jSONObject.put("pglx", "8");
                    }
                    jSONObject.put("ec", fs.fs().hhw());
                    return;
                }
                jSONObject.put("pglx", String.valueOf(btk()));
                return;
            }
            jSONObject.put("pglx", "6");
        } catch (Throwable th) {
            iqz.zn("SecSdkHelperUtil", th.getMessage());
            try {
                jSONObject.put("pglx", "7");
            } catch (JSONException unused) {
            }
        }
    }

    public static String hhw() {
        if (kgc.fb().bxw()) {
            return fs.fs().fb();
        }
        return null;
    }
}
