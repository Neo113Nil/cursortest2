package com.bytedance.sdk.openadsdk.phc.zmn.zmn;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.iqz;
import com.bytedance.sdk.openadsdk.core.btk;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.nu;
import com.bytedance.sdk.openadsdk.fb.rt;
import com.bytedance.sdk.openadsdk.utils.oub;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.mobilefuse.sdk.telemetry.TelemetryCategory;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class zmn {
    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, h.u);
        p0.startActivity(p1);
    }

    public static boolean zmn(Context context, String str, nqi nqiVar, int i, Map<String, Object> map, boolean z) {
        String zmn = oub.zmn(nqiVar);
        btk.zmn(nqiVar, zmn, 1, null);
        Intent zmn2 = zmn(context, str, nqiVar);
        if (TextUtils.isEmpty(str) || zmn2 == null) {
            btk.zmn(nqiVar, zmn, -2, nqiVar.my().fb());
            return false;
        }
        boolean fb = oub.fb(context);
        if (map == null) {
            map = new HashMap<>();
        }
        if (nqiVar != null && nqiVar.qj() == 0) {
            map.put("auto_click", Boolean.valueOf(!nqiVar.kw()));
        }
        map.put("can_query_install", Integer.valueOf(fb ? 1 : 0));
        map.put("url", str);
        if (fb) {
            oub.fs zmn3 = oub.zmn(context, zmn2);
            if (zmn3.fs > 0) {
                try {
                    zmn(context, nqiVar, map);
                    map.put("matched_count", Integer.valueOf(zmn3.fs));
                    ComponentName componentName = zmn3.zmn;
                    if (componentName != null) {
                        zmn2.setComponent(componentName);
                    }
                } catch (Throwable th) {
                    iqz.zn("DeepLinkUtils", th.getMessage());
                }
            } else {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(SDKConstants.PARAM_INTENT, zmn2.toString());
                    jSONObject.put("can_query_install", 1);
                } catch (Exception unused) {
                }
                btk.zmn(nqiVar, zmn, -3, jSONObject);
                return false;
            }
        }
        try {
            com.bytedance.sdk.openadsdk.fb.zn.zmn(nqiVar, zmn, "open_url_app", map);
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, zmn2);
            rt.zmn().zmn(map).zmn(nqiVar, zmn);
            com.bytedance.sdk.openadsdk.fb.zn.zmn("dp_start_act_success", nqiVar, zmn, map);
            return true;
        } catch (Throwable th2) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put(TelemetryCategory.EXCEPTION, th2.getMessage());
                jSONObject2.put(SDKConstants.PARAM_INTENT, zmn2.toString());
                jSONObject2.put("can_query_install", fb ? 1 : 0);
            } catch (Exception unused2) {
            }
            btk.zmn(nqiVar, zmn, -4, jSONObject2);
            if (fb) {
                nu.zmn(context, nqiVar.pl(), nqiVar, i, zmn, z);
            }
            return false;
        }
    }

    private static Intent zmn(Context context, String str, nqi nqiVar) {
        try {
            Uri parse = Uri.parse(str);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(parse);
            if (nqiVar != null && nqiVar.rvx() != null && !TextUtils.isEmpty(nqiVar.rvx().fb())) {
                intent.setPackage(nqiVar.rvx().fb());
            }
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            return intent;
        } catch (Throwable th) {
            iqz.zn("DeepLinkUtils", th.getMessage());
            return null;
        }
    }

    private static void zmn(Context context, nqi nqiVar, Map<String, Object> map) {
        if (nqiVar != null && nqiVar.qj() == 0) {
            map.put("auto_click", Boolean.valueOf(!nqiVar.kw()));
        }
        map.put("can_query_install", Integer.valueOf(oub.fb(context) ? 1 : 0));
    }
}
