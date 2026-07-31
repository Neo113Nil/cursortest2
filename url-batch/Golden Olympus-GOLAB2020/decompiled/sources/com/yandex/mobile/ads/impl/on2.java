package com.yandex.mobile.ads.impl;

import android.os.Build;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class on2 {
    public static JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        yn2.a(jSONObject, "deviceType", Build.MANUFACTURER + "; " + Build.MODEL);
        yn2.a(jSONObject, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        yn2.a(jSONObject, com.ironsource.ge.f16395E, com.ironsource.b9.f15266d);
        return jSONObject;
    }
}
