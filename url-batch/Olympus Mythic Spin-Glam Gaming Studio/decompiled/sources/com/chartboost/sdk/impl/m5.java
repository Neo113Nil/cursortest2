package com.chartboost.sdk.impl;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class m5 implements bi {
    @Override // com.chartboost.sdk.impl.bi
    public JSONObject a() {
        String b = h4.b.b();
        String b2 = k7.a.b();
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("app_id", b);
        jSONObject.put("app_version", b2);
        jSONObject.put("load-id", uuid);
        jSONObject.put("load_id", uuid);
        jSONObject.put("sdk", "Chartboost-Android-SDK");
        jSONObject.put("sdk_version", "9.12.1");
        return jSONObject;
    }
}
