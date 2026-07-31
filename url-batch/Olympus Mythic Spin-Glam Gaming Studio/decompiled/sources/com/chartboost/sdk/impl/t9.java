package com.chartboost.sdk.impl;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class t9 implements bi {
    public final y2 a;

    public t9(y2 identity) {
        Intrinsics.checkNotNullParameter(identity, "identity");
        this.a = identity;
    }

    @Override // com.chartboost.sdk.impl.bi
    public JSONObject a() {
        s9 h = this.a.h();
        JSONObject jSONObject = new JSONObject();
        String d = h.d();
        if (d != null) {
            jSONObject.put("appSetId", d);
        }
        String d2 = h.d();
        if (d2 != null) {
            jSONObject.put(CommonUrlParts.APP_SET_ID, d2);
        }
        Integer e = h.e();
        if (e != null) {
            jSONObject.put("appSetIdScope", e.intValue());
        }
        Integer e2 = h.e();
        if (e2 != null) {
            jSONObject.put(CommonUrlParts.APP_SET_ID_SCOPE, e2.intValue());
        }
        String a = h.a();
        if (a != null) {
            jSONObject.put("ifa", a);
        }
        String c = h.c();
        if (c != null) {
            jSONObject.put("instance_id", c);
        }
        return jSONObject;
    }
}
