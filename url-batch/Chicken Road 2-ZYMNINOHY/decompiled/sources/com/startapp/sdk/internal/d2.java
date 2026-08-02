package com.startapp.sdk.internal;

import android.util.Base64;
import org.json.JSONObject;
import w3.AbstractC1504a;

/* loaded from: classes.dex */
public abstract class d2 {
    public static String a(boolean z) {
        JSONObject jSONObject = new JSONObject();
        if (z) {
            jSONObject.put("isTestAd", z);
        }
        String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.i.d(jSONObject2, "toString(...)");
        byte[] bytes = jSONObject2.getBytes(AbstractC1504a.f15936a);
        kotlin.jvm.internal.i.d(bytes, "getBytes(...)");
        String encodeToString = Base64.encodeToString(bytes, 0);
        kotlin.jvm.internal.i.b(encodeToString);
        return encodeToString;
    }
}
