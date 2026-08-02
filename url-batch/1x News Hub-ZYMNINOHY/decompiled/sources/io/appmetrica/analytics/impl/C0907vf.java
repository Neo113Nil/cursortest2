package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.vf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0907vf implements Z7 {

    /* renamed from: a, reason: collision with root package name */
    public final String f8517a;

    /* renamed from: b, reason: collision with root package name */
    public final JSONObject f8518b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f8519c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f8520d;

    /* renamed from: e, reason: collision with root package name */
    public final Y7 f8521e;

    public C0907vf(String str, JSONObject jSONObject, boolean z, boolean z2, Y7 y7) {
        this.f8517a = str;
        this.f8518b = jSONObject;
        this.f8519c = z;
        this.f8520d = z2;
        this.f8521e = y7;
    }

    @Override // io.appmetrica.analytics.impl.Z7
    public final Y7 a() {
        return this.f8521e;
    }

    public final JSONObject b() {
        if (!this.f8519c) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("trackingId", this.f8517a);
            if (this.f8518b.length() > 0) {
                jSONObject.put("additionalParams", this.f8518b);
            }
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("trackingId", this.f8517a);
            jSONObject.put("additionalParams", this.f8518b);
            jSONObject.put("wasSet", this.f8519c);
            jSONObject.put("autoTracking", this.f8520d);
            jSONObject.put(AdRevenueConstants.SOURCE_KEY, this.f8521e.f6895a);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public final String toString() {
        return "PreloadInfoState{trackingId='" + this.f8517a + "', additionalParameters=" + this.f8518b + ", wasSet=" + this.f8519c + ", autoTrackingEnabled=" + this.f8520d + ", source=" + this.f8521e + '}';
    }

    public static C0907vf a(JSONObject jSONObject) {
        Y7 y7;
        String optStringOrNull = JsonUtils.optStringOrNull(jSONObject, "trackingId");
        JSONObject optJsonObjectOrDefault = JsonUtils.optJsonObjectOrDefault(jSONObject, "additionalParams", new JSONObject());
        int i3 = 0;
        boolean optBooleanOrDefault = JsonUtils.optBooleanOrDefault(jSONObject, "wasSet", false);
        boolean optBooleanOrDefault2 = JsonUtils.optBooleanOrDefault(jSONObject, "autoTracking", false);
        String optStringOrNull2 = JsonUtils.optStringOrNull(jSONObject, AdRevenueConstants.SOURCE_KEY);
        Y7[] values = Y7.values();
        int length = values.length;
        while (true) {
            if (i3 >= length) {
                y7 = null;
                break;
            }
            y7 = values[i3];
            if (kotlin.jvm.internal.j.a(y7.f6895a, optStringOrNull2)) {
                break;
            }
            i3++;
        }
        if (y7 == null) {
            y7 = Y7.f6891b;
        }
        return new C0907vf(optStringOrNull, optJsonObjectOrDefault, optBooleanOrDefault, optBooleanOrDefault2, y7);
    }
}
