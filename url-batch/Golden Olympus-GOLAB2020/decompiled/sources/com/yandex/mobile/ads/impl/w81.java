package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final /* synthetic */ class w81 {
    public static String a(JSONObject jSONObject, String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(jSONObject, str);
        Intrinsics.checkNotNullParameter(str2, str3);
        return jSONObject.optString(str4);
    }
}
