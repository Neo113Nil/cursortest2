package com.ironsource.sdk.controller;

import android.webkit.JavascriptInterface;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.o9;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
final class g {

    /* renamed from: c, reason: collision with root package name */
    private static final String f19247c = "com.ironsource.sdk.controller.g";

    /* renamed from: d, reason: collision with root package name */
    private static final String f19248d = "functionName";

    /* renamed from: e, reason: collision with root package name */
    private static final String f19249e = "params";

    /* renamed from: f, reason: collision with root package name */
    private static final String f19250f = "hash";

    /* renamed from: a, reason: collision with root package name */
    private final C1558b f19251a;

    /* renamed from: b, reason: collision with root package name */
    private final s f19252b;

    g(C1558b c1558b, s sVar) {
        this.f19251a = c1558b;
        this.f19252b = sVar;
    }

    private String a(String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("functionName", SDKUtils.encodeString(str));
            jSONObject.put("params", SDKUtils.encodeString(str2));
            jSONObject.put(f19250f, SDKUtils.encodeString(str3));
        } catch (JSONException e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
        }
        return jSONObject.toString();
    }

    private void b(String str, String str2, String str3) {
        this.f19251a.a(a(str, str2, str3));
    }

    @JavascriptInterface
    public void messageHandler(String str, String str2, String str3) {
        try {
            Logger.i(f19247c, "messageHandler(" + str + " " + str3 + ")");
            if (this.f19252b.a(str, str2, str3)) {
                a(str, str2);
            } else {
                b(str, str2, str3);
            }
        } catch (Exception e4) {
            a(e4);
        }
    }

    private void a(Exception exc) {
        if (!(exc instanceof NoSuchMethodException)) {
            a(exc.getLocalizedMessage());
            return;
        }
        IronLog.INTERNAL.error(exc.toString());
        Logger.i(f19247c, "messageHandler failed with exception " + exc.getMessage());
    }

    private void a(String str) {
        this.f19251a.b(str);
    }

    private void a(String str, String str2) {
        this.f19251a.a(str, str2);
    }
}
