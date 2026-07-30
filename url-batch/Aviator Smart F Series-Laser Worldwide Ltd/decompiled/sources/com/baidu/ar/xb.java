package com.baidu.ar;

import com.google.firebase.analytics.FirebaseAnalytics;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class xb {

    /* renamed from: a, reason: collision with root package name */
    public String f3704a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3705b;

    /* renamed from: c, reason: collision with root package name */
    public String f3706c;

    public static xb a(JSONObject jSONObject) {
        xb xbVar = null;
        if (jSONObject == null) {
            return null;
        }
        try {
            xb xbVar2 = new xb();
            try {
                if (jSONObject.has(FirebaseAnalytics.Param.CONTENT)) {
                    xbVar2.a(jSONObject.getString(FirebaseAnalytics.Param.CONTENT));
                }
                if (jSONObject.has("completed")) {
                    xbVar2.a(jSONObject.getBoolean("completed"));
                }
                if (jSONObject.has("type")) {
                    xbVar2.b(jSONObject.getString("type"));
                }
                return xbVar2;
            } catch (Exception e8) {
                e = e8;
                xbVar = xbVar2;
                e.printStackTrace();
                return xbVar;
            }
        } catch (Exception e9) {
            e = e9;
        }
    }

    public String b() {
        return this.f3706c;
    }

    public boolean c() {
        return this.f3705b;
    }

    public String a() {
        return this.f3704a;
    }

    public void b(String str) {
        this.f3706c = str;
    }

    public void a(String str) {
        this.f3704a = str;
    }

    public void a(boolean z7) {
        this.f3705b = z7;
    }
}
