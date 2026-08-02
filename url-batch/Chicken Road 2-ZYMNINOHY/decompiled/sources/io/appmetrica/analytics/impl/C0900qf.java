package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.qf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0900qf implements T7 {

    /* renamed from: a, reason: collision with root package name */
    public final String f12616a;

    /* renamed from: b, reason: collision with root package name */
    public final JSONObject f12617b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f12618c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f12619d;

    /* renamed from: e, reason: collision with root package name */
    public final S7 f12620e;

    public C0900qf(String str, JSONObject jSONObject, boolean z, boolean z4, S7 s7) {
        this.f12616a = str;
        this.f12617b = jSONObject;
        this.f12618c = z;
        this.f12619d = z4;
        this.f12620e = s7;
    }

    @Override // io.appmetrica.analytics.impl.T7
    public final S7 a() {
        return this.f12620e;
    }

    public final JSONObject b() {
        if (!this.f12618c) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("trackingId", this.f12616a);
            if (this.f12617b.length() > 0) {
                jSONObject.put("additionalParams", this.f12617b);
            }
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("trackingId", this.f12616a);
            jSONObject.put("additionalParams", this.f12617b);
            jSONObject.put("wasSet", this.f12618c);
            jSONObject.put("autoTracking", this.f12619d);
            jSONObject.put(AdRevenueConstants.SOURCE_KEY, this.f12620e.f10937a);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public final String toString() {
        return "PreloadInfoState{trackingId='" + this.f12616a + "', additionalParameters=" + this.f12617b + ", wasSet=" + this.f12618c + ", autoTrackingEnabled=" + this.f12619d + ", source=" + this.f12620e + '}';
    }

    public static C0900qf a(JSONObject jSONObject) {
        S7 s7;
        String optStringOrNull = JsonUtils.optStringOrNull(jSONObject, "trackingId");
        JSONObject optJsonObjectOrDefault = JsonUtils.optJsonObjectOrDefault(jSONObject, "additionalParams", new JSONObject());
        int i4 = 0;
        boolean optBooleanOrDefault = JsonUtils.optBooleanOrDefault(jSONObject, "wasSet", false);
        boolean optBooleanOrDefault2 = JsonUtils.optBooleanOrDefault(jSONObject, "autoTracking", false);
        String optStringOrNull2 = JsonUtils.optStringOrNull(jSONObject, AdRevenueConstants.SOURCE_KEY);
        S7[] values = S7.values();
        int length = values.length;
        while (true) {
            if (i4 >= length) {
                s7 = null;
                break;
            }
            s7 = values[i4];
            if (kotlin.jvm.internal.i.a(s7.f10937a, optStringOrNull2)) {
                break;
            }
            i4++;
        }
        if (s7 == null) {
            s7 = S7.f10932b;
        }
        return new C0900qf(optStringOrNull, optJsonObjectOrDefault, optBooleanOrDefault, optBooleanOrDefault2, s7);
    }
}
