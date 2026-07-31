package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.sdk.openadsdk.fb.fs;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class kw {
    public static void zmn(Context context, boolean z, JSONObject jSONObject, com.bytedance.sdk.openadsdk.core.model.nqi nqiVar, String str, int i, WebView webView, com.bytedance.sdk.openadsdk.core.widget.btk btkVar) {
        int optInt = jSONObject.optInt("landingStyle");
        String optString = jSONObject.optString("url");
        String optString2 = jSONObject.optString("fallback_url");
        String optString3 = jSONObject.optString("title", "");
        boolean z2 = false;
        boolean z3 = jSONObject.optInt("only_loading", 0) == 1;
        try {
            jSONObject.put("is_activity", z);
        } catch (JSONException unused) {
        }
        com.bytedance.sdk.openadsdk.fb.zn.zmn(nqiVar, str, 1, jSONObject);
        if (TextUtils.isEmpty(optString)) {
            return;
        }
        if (optInt == 0) {
            if (webView != null) {
                PangleNetworkBridge.webviewLoadUrl(webView, optString);
                com.bytedance.sdk.openadsdk.fb.zn.zmn(nqiVar, str, 2, (JSONObject) null);
            } else {
                com.bytedance.sdk.openadsdk.fb.zn.zmn(nqiVar, str, -1, (JSONObject) null);
            }
        } else if (optInt == 1 || optInt == 8) {
            com.bytedance.sdk.openadsdk.cyb.zmn.fs fsVar = new com.bytedance.sdk.openadsdk.cyb.zmn.fs();
            fsVar.zmn(fs.zmn.fs);
            fsVar.zmn(nqiVar);
            fsVar.fs(str);
            fsVar.zmn(-1);
            fsVar.zmn(false);
            fsVar.fs(nqiVar.va());
            com.bytedance.sdk.openadsdk.fb.zn.zmn(fsVar);
            com.bytedance.sdk.openadsdk.utils.uqh.zmn(context, optString, nqiVar, fs.zmn.fs, true);
        } else {
            if (optInt != 2) {
                if (optInt == 3) {
                    iqz iqzVar = new iqz(nqiVar);
                    iqzVar.zmn(optString3);
                    iqzVar.zmn(z3);
                    nu.zmn(context, optString, nqiVar, i, str, false, iqzVar);
                }
                if (btkVar == null && z2) {
                    btkVar.zmn();
                    return;
                }
            }
            if (!com.bytedance.sdk.openadsdk.utils.uqh.zmn(context, optString, nqiVar, str)) {
                com.bytedance.sdk.openadsdk.cyb.zmn.fs fsVar2 = new com.bytedance.sdk.openadsdk.cyb.zmn.fs();
                fsVar2.zmn(fs.zmn.fs);
                fsVar2.zmn(nqiVar);
                fsVar2.fs(str);
                fsVar2.zmn(-1);
                fsVar2.zmn(false);
                fsVar2.fs(nqiVar.va());
                com.bytedance.sdk.openadsdk.fb.zn.zmn(fsVar2);
                HashMap hashMap = new HashMap();
                hashMap.put("deeplink_url", optString);
                hashMap.put("fallback_url", optString2);
                hashMap.put("jsb_deeplink", 1);
                com.bytedance.sdk.openadsdk.fb.zn.zmn(nqiVar, str, "open_fallback_url", hashMap);
                com.bytedance.sdk.openadsdk.utils.uqh.zmn(context, optString2, nqiVar, fs.zmn.fs, true);
            }
        }
        z2 = true;
        if (btkVar == null) {
        }
    }
}
