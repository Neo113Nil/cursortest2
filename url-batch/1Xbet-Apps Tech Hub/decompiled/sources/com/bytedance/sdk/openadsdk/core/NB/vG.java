package com.bytedance.sdk.openadsdk.core.NB;

import android.text.TextUtils;
import android.view.MotionEvent;
import com.bytedance.sdk.component.utils.Ju;
import com.bytedance.sdk.component.utils.NB;
import com.bytedance.sdk.openadsdk.core.mnm;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: SecSdkHelperUtil.java */
/* loaded from: classes2.dex */
public class vG {
    private static boolean pvs = false;

    public static void pvs() {
        if (!pvs && mnm.Jd().ZsW()) {
            icD.icD();
            pvs = icD.icD().vG();
        }
    }

    public static void pvs(String str) {
        if (TextUtils.isEmpty(str) && mnm.Jd().ZsW()) {
            icD.icD().pvs(str);
        }
    }

    public static void icD(String str) {
        if (TextUtils.isEmpty(str) || !mnm.Jd().ZsW()) {
            return;
        }
        icD.icD().icD(str);
    }

    public static void icD() {
        if (mnm.Jd().ZsW()) {
            icD.icD().pvs();
        }
    }

    public static void vG() {
        if (mnm.Jd().ZsW()) {
            icD.icD().vG("AdShow");
        }
    }

    public static Map<String, String> pvs(String str, String str2) {
        if (mnm.Jd().ZsW()) {
            return icD.icD().pvs(str, str2 != null ? str2.getBytes() : new byte[0]);
        }
        return new HashMap();
    }

    public static String Jd() {
        return mnm.Jd().ZsW() ? icD.icD().NB() : "";
    }

    public static int NB() {
        if (mnm.Jd().ZsW()) {
            return icD.icD().sUS();
        }
        return 6;
    }

    public static void pvs(MotionEvent motionEvent) {
        if (mnm.Jd().ZsW()) {
            icD.icD().pvs(motionEvent);
        }
    }

    public static void pvs(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            if (mnm.Jd().ZsW()) {
                pvs();
                if (NB() == 0) {
                    jSONObject.put("sec_did", icD.icD().Jd());
                    String pvs2 = NB.pvs(jSONObject.toString());
                    Map<String, String> pvs3 = icD.icD().pvs("https://api16-access-sg.pangle.io/api/ad/union/sdk/get_ads/?aid=1371&device_platform=android&version_code=4250", pvs2 != null ? pvs2.getBytes() : new byte[0]);
                    if (pvs3 != null && pvs3.size() > 0) {
                        for (String str : pvs3.keySet()) {
                            jSONObject.put(str, pvs3.get(str));
                        }
                        jSONObject.put(ImagesContract.URL, "https://api16-access-sg.pangle.io/api/ad/union/sdk/get_ads/?aid=1371&device_platform=android&version_code=4250");
                        jSONObject.put("pangle_m", pvs2);
                        return;
                    }
                    jSONObject.put("pglx", "8");
                    return;
                }
                jSONObject.put("pglx", String.valueOf(NB()));
                return;
            }
            jSONObject.put("pglx", "6");
        } catch (Throwable th) {
            Ju.pvs("SecSdkHelperUtil", th.getMessage());
            try {
                jSONObject.put("pglx", "7");
            } catch (JSONException unused) {
            }
        }
    }

    public static String sUS() {
        if (mnm.Jd().ZsW()) {
            return icD.icD().Jd();
        }
        return null;
    }
}
