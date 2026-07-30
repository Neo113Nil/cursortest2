package com.onevcat.uniwebview.internal.obfuscated;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onevcat.uniwebview.internal.obfuscated.l0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0078l0 {
    public final String a;
    public final JSONObject b;

    public C0078l0(String resultStr) {
        JSONObject jSONObject;
        Intrinsics.checkNotNullParameter(resultStr, "resultStr");
        this.a = resultStr;
        try {
            jSONObject = new JSONObject(resultStr);
        } catch (JSONException unused) {
            jSONObject = new JSONObject("{}");
        }
        this.b = jSONObject;
    }
}
