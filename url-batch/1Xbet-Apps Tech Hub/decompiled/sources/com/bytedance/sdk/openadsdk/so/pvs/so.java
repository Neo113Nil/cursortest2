package com.bytedance.sdk.openadsdk.so.pvs;

import com.bytedance.sdk.component.pvs.vA;
import com.bytedance.sdk.component.widget.SSWebView;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* compiled from: PreventTouchEventMethod.java */
/* loaded from: classes2.dex */
public class so extends com.bytedance.sdk.component.pvs.NB<JSONObject, JSONObject> {
    private WeakReference<SSWebView> pvs;

    public static void pvs(vA vAVar, SSWebView sSWebView) {
        vAVar.pvs("preventTouchEvent", new so(sSWebView));
    }

    public so(SSWebView sSWebView) {
        this.pvs = new WeakReference<>(sSWebView);
    }

    @Override // com.bytedance.sdk.component.pvs.NB
    public JSONObject pvs(JSONObject jSONObject, com.bytedance.sdk.component.pvs.sUS sus) throws Exception {
        JSONObject jSONObject2 = new JSONObject();
        try {
            boolean optBoolean = jSONObject.optBoolean("isPrevent", false);
            SSWebView sSWebView = this.pvs.get();
            if (sSWebView != null) {
                sSWebView.setIsPreventTouchEvent(optBoolean);
                jSONObject2.put(FirebaseAnalytics.Param.SUCCESS, true);
            } else {
                jSONObject2.put(FirebaseAnalytics.Param.SUCCESS, false);
            }
        } catch (Throwable unused) {
            jSONObject2.put(FirebaseAnalytics.Param.SUCCESS, false);
        }
        return jSONObject2;
    }
}
