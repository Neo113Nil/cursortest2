package com.ironsource.sdk.g;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.aiming.mdt.utils.Constants;
import com.ironsource.sdk.data.e;
import com.ironsource.sdk.data.g;
import com.ironsource.sdk.data.h;
import com.tapjoy.TapjoyConstants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: IronSourceSharedPrefHelper.java */
/* loaded from: classes2.dex */
public class c {

    /* renamed from: b, reason: collision with root package name */
    private static c f7202b;

    /* renamed from: a, reason: collision with root package name */
    private SharedPreferences f7203a;

    private c(Context context) {
        this.f7203a = context.getSharedPreferences("supersonic_shared_preferen", 0);
    }

    public static synchronized c a(Context context) {
        c cVar;
        synchronized (c.class) {
            if (f7202b == null) {
                f7202b = new c(context);
            }
            cVar = f7202b;
        }
        return cVar;
    }

    public static synchronized c a() {
        c cVar;
        synchronized (c.class) {
            cVar = f7202b;
        }
        return cVar;
    }

    public String b() {
        return this.f7203a.getString("ssa_rv_parameter_connection_retries", Constants.ALL_LOAD);
    }

    public void a(com.ironsource.sdk.data.d dVar) {
        SharedPreferences.Editor edit = this.f7203a.edit();
        edit.putString("ssa_rv_parameter_connection_retries", dVar.a());
        edit.commit();
    }

    public void a(String str) {
        SharedPreferences.Editor edit = this.f7203a.edit();
        edit.putString("back_button_state", str);
        edit.commit();
    }

    public e.a c() {
        int parseInt = Integer.parseInt(this.f7203a.getString("back_button_state", "2"));
        if (parseInt == 0) {
            return e.a.None;
        }
        if (parseInt == 1) {
            return e.a.Device;
        }
        if (parseInt == 2) {
            return e.a.Controller;
        }
        return e.a.Controller;
    }

    public void b(String str) {
        SharedPreferences.Editor edit = this.f7203a.edit();
        edit.putString("search_keys", str);
        edit.commit();
    }

    public List<String> d() {
        String string = this.f7203a.getString("search_keys", null);
        ArrayList arrayList = new ArrayList();
        if (string != null) {
            g gVar = new g(string);
            if (gVar.f("searchKeys")) {
                try {
                    arrayList.addAll(gVar.a((JSONArray) gVar.h("searchKeys")));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
        return arrayList;
    }

    public JSONArray e() {
        String string = this.f7203a.getString(com.umeng.analytics.pro.b.n, null);
        if (string == null) {
            return new JSONArray();
        }
        try {
            return new JSONArray(string);
        } catch (JSONException unused) {
            return new JSONArray();
        }
    }

    public void f() {
        SharedPreferences.Editor edit = this.f7203a.edit();
        edit.putString(com.umeng.analytics.pro.b.n, null);
        edit.commit();
    }

    public void a(h hVar) {
        if (h()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("sessionStartTime", hVar.b());
                jSONObject.put("sessionEndTime", hVar.c());
                jSONObject.put("sessionType", hVar.d());
                jSONObject.put("connectivity", hVar.e());
            } catch (JSONException unused) {
            }
            JSONArray e = e();
            if (e == null) {
                e = new JSONArray();
            }
            e.put(jSONObject);
            SharedPreferences.Editor edit = this.f7203a.edit();
            edit.putString(com.umeng.analytics.pro.b.n, e.toString());
            edit.commit();
        }
    }

    private boolean h() {
        return this.f7203a.getBoolean("register_sessions", true);
    }

    public void a(boolean z) {
        SharedPreferences.Editor edit = this.f7203a.edit();
        edit.putBoolean("register_sessions", z);
        edit.commit();
    }

    public boolean a(String str, String str2) {
        SharedPreferences.Editor edit = this.f7203a.edit();
        edit.putString(str, str2);
        return edit.commit();
    }

    public String c(String str) {
        String string = this.f7203a.getString(str, null);
        return string != null ? string : "{}";
    }

    public String a(e.d dVar) {
        switch (dVar) {
            case RewardedVideo:
                return this.f7203a.getString("application_key_rv", null);
            case OfferWall:
                return this.f7203a.getString("application_key_ow", null);
            case Interstitial:
                return this.f7203a.getString("application_key_is", null);
            default:
                return "EMPTY_APPLICATION_KEY";
        }
    }

    public void a(String str, e.d dVar) {
        SharedPreferences.Editor edit = this.f7203a.edit();
        switch (dVar) {
            case RewardedVideo:
                edit.putString("application_key_rv", str);
                break;
            case OfferWall:
                edit.putString("application_key_ow", str);
                break;
            case Interstitial:
                edit.putString("application_key_is", str);
                break;
        }
        edit.commit();
    }

    public String d(String str) {
        if (str.equalsIgnoreCase(e.d.RewardedVideo.toString())) {
            return this.f7203a.getString("unique_id_rv", null);
        }
        if (str.equalsIgnoreCase(e.d.OfferWall.toString())) {
            return this.f7203a.getString("unique_id_ow", null);
        }
        return str.equalsIgnoreCase(e.d.Interstitial.toString()) ? this.f7203a.getString("unique_id_is", null) : "EMPTY_UNIQUE_ID";
    }

    public boolean b(String str, String str2) {
        SharedPreferences.Editor edit = this.f7203a.edit();
        if (str2.equalsIgnoreCase(e.d.RewardedVideo.toString())) {
            edit.putString("unique_id_rv", str);
        } else if (str2.equalsIgnoreCase(e.d.OfferWall.toString())) {
            edit.putString("unique_id_ow", str);
        } else if (str2.equalsIgnoreCase(e.d.Interstitial.toString())) {
            edit.putString("unique_id_is", str);
        }
        return edit.commit();
    }

    public String g() {
        return this.f7203a.getString("version", "UN_VERSIONED");
    }

    public void e(String str) {
        SharedPreferences.Editor edit = this.f7203a.edit();
        edit.putString("version", str);
        edit.commit();
    }

    public String f(String str) {
        return this.f7203a.getString(str, null);
    }

    public void c(String str, String str2) {
        SharedPreferences.Editor edit = this.f7203a.edit();
        edit.putString(str, str2);
        edit.commit();
    }

    public void b(String str, e.d dVar) {
        SharedPreferences.Editor edit = this.f7203a.edit();
        switch (dVar) {
            case RewardedVideo:
                edit.putString("user_id_rv", str);
                break;
            case OfferWall:
                edit.putString("user_id_ow", str);
                break;
            case Interstitial:
                edit.putString("user_id_is", str);
                break;
        }
        edit.commit();
    }

    public String b(e.d dVar) {
        switch (dVar) {
            case RewardedVideo:
                return this.f7203a.getString("unique_id_rv", null);
            case OfferWall:
                return this.f7203a.getString("unique_id_ow", null);
            case Interstitial:
                return this.f7203a.getString("unique_id_is", null);
            default:
                return "EMPTY_UNIQUE_ID";
        }
    }

    public boolean a(String str, String str2, String str3) {
        String string = this.f7203a.getString("ssaUserData", null);
        if (!TextUtils.isEmpty(string)) {
            try {
                JSONObject jSONObject = new JSONObject(string);
                if (!jSONObject.isNull(str2)) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject(str2);
                    if (!jSONObject2.isNull(str3)) {
                        jSONObject2.getJSONObject(str3).put(TapjoyConstants.TJC_TIMESTAMP, str);
                        SharedPreferences.Editor edit = this.f7203a.edit();
                        edit.putString("ssaUserData", jSONObject.toString());
                        return edit.commit();
                    }
                }
            } catch (JSONException e) {
                new b().execute("https://www.supersonicads.com/mobile/sdk5/log?method=" + e.getStackTrace()[0].getMethodName());
            }
        }
        return false;
    }
}
