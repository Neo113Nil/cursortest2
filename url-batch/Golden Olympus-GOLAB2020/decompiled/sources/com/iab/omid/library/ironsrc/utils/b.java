package com.iab.omid.library.ironsrc.utils;

import android.os.Build;
import com.ironsource.b9;
import com.ironsource.ge;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class b {
    public static String a() {
        return Build.MANUFACTURER + "; " + Build.MODEL;
    }

    public static String b() {
        return b9.f15266d;
    }

    public static String c() {
        return Integer.toString(Build.VERSION.SDK_INT);
    }

    public static JSONObject d() {
        JSONObject jSONObject = new JSONObject();
        c.a(jSONObject, "deviceType", a());
        c.a(jSONObject, "osVersion", c());
        c.a(jSONObject, ge.f16395E, b());
        return jSONObject;
    }
}
