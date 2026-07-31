package com.startapp.sdk.internal;

import android.util.Base64;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public abstract class x1 {
    public static String a(boolean z) {
        JSONObject jSONObject = new JSONObject();
        if (z) {
            jSONObject.put("isTestAd", z);
        }
        String jSONObject2 = jSONObject.toString();
        jSONObject2.getClass();
        String encodeToString = Base64.encodeToString(StringsKt.encodeToByteArray(jSONObject2), 0);
        encodeToString.getClass();
        return encodeToString;
    }
}
