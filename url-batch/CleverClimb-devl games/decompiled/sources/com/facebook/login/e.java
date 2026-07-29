package com.facebook.login;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.aiming.mdt.utils.Constants;
import com.facebook.login.LoginClient;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: LoginLogger.java */
/* loaded from: classes.dex */
class e {

    /* renamed from: a, reason: collision with root package name */
    private final com.facebook.appevents.f f6264a;

    /* renamed from: b, reason: collision with root package name */
    private String f6265b;

    /* renamed from: c, reason: collision with root package name */
    private String f6266c;

    e(Context context, String str) {
        PackageInfo packageInfo;
        this.f6265b = str;
        this.f6264a = com.facebook.appevents.f.c(context, str);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (packageInfo = packageManager.getPackageInfo(Constants.PKG_FB, 0)) == null) {
                return;
            }
            this.f6266c = packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public String a() {
        return this.f6265b;
    }

    static Bundle a(String str) {
        Bundle bundle = new Bundle();
        bundle.putLong("1_timestamp_ms", System.currentTimeMillis());
        bundle.putString("0_auth_logger_id", str);
        bundle.putString("3_method", "");
        bundle.putString("2_result", "");
        bundle.putString("5_error_message", "");
        bundle.putString("4_error_code", "");
        bundle.putString("6_extras", "");
        return bundle;
    }

    public void a(LoginClient.Request request) {
        Bundle a2 = a(request.getAuthId());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("login_behavior", request.getLoginBehavior().toString());
            jSONObject.put("request_code", LoginClient.getLoginRequestCode());
            jSONObject.put("permissions", TextUtils.join(",", request.getPermissions()));
            jSONObject.put("default_audience", request.getDefaultAudience().toString());
            jSONObject.put("isReauthorize", request.isRerequest());
            if (this.f6266c != null) {
                jSONObject.put("facebookVersion", this.f6266c);
            }
            a2.putString("6_extras", jSONObject.toString());
        } catch (JSONException unused) {
        }
        this.f6264a.a("fb_mobile_login_start", (Double) null, a2);
    }

    public void a(String str, Map<String, String> map, LoginClient.Result.a aVar, Map<String, String> map2, Exception exc) {
        Bundle a2 = a(str);
        if (aVar != null) {
            a2.putString("2_result", aVar.a());
        }
        if (exc != null && exc.getMessage() != null) {
            a2.putString("5_error_message", exc.getMessage());
        }
        JSONObject jSONObject = !map.isEmpty() ? new JSONObject(map) : null;
        if (map2 != null) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            try {
                for (Map.Entry<String, String> entry : map2.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
            } catch (JSONException unused) {
            }
        }
        if (jSONObject != null) {
            a2.putString("6_extras", jSONObject.toString());
        }
        this.f6264a.a("fb_mobile_login_complete", (Double) null, a2);
    }

    public void a(String str, String str2) {
        Bundle a2 = a(str);
        a2.putString("3_method", str2);
        this.f6264a.a("fb_mobile_login_method_start", (Double) null, a2);
    }

    public void a(String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        Bundle a2 = a(str);
        if (str3 != null) {
            a2.putString("2_result", str3);
        }
        if (str4 != null) {
            a2.putString("5_error_message", str4);
        }
        if (str5 != null) {
            a2.putString("4_error_code", str5);
        }
        if (map != null && !map.isEmpty()) {
            a2.putString("6_extras", new JSONObject(map).toString());
        }
        a2.putString("3_method", str2);
        this.f6264a.a("fb_mobile_login_method_complete", (Double) null, a2);
    }

    public void b(String str, String str2) {
        a(str, str2, "");
    }

    public void a(String str, String str2, String str3) {
        Bundle a2 = a("");
        a2.putString("2_result", LoginClient.Result.a.ERROR.a());
        a2.putString("5_error_message", str2);
        a2.putString("3_method", str3);
        this.f6264a.a(str, (Double) null, a2);
    }
}
