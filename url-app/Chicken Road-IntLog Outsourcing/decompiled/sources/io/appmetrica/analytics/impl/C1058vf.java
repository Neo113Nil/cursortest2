package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.vf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1058vf implements Z7 {

    /* renamed from: a, reason: collision with root package name */
    public final String f9469a;

    /* renamed from: b, reason: collision with root package name */
    public final JSONObject f9470b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f9471c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f9472d;

    /* renamed from: e, reason: collision with root package name */
    public final Y7 f9473e;

    public C1058vf(String str, JSONObject jSONObject, boolean z, boolean z5, Y7 y7) {
        this.f9469a = str;
        this.f9470b = jSONObject;
        this.f9471c = z;
        this.f9472d = z5;
        this.f9473e = y7;
    }

    @Override // io.appmetrica.analytics.impl.Z7
    public final Y7 a() {
        return this.f9473e;
    }

    public final JSONObject b() {
        if (!this.f9471c) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("trackingId", this.f9469a);
            if (this.f9470b.length() <= 0) {
                return jSONObject;
            }
            jSONObject.put("additionalParams", this.f9470b);
            return jSONObject;
        } catch (Throwable unused) {
            return jSONObject;
        }
    }

    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("trackingId", this.f9469a);
            jSONObject.put("additionalParams", this.f9470b);
            jSONObject.put("wasSet", this.f9471c);
            jSONObject.put("autoTracking", this.f9472d);
            jSONObject.put(AdRevenueConstants.SOURCE_KEY, this.f9473e.f7734a);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public final String toString() {
        return "PreloadInfoState{trackingId='" + this.f9469a + "', additionalParameters=" + this.f9470b + ", wasSet=" + this.f9471c + ", autoTrackingEnabled=" + this.f9472d + ", source=" + this.f9473e + '}';
    }

    public static C1058vf a(JSONObject jSONObject) {
        Y7 y7;
        String optStringOrNull = JsonUtils.optStringOrNull(jSONObject, "trackingId");
        JSONObject optJsonObjectOrDefault = JsonUtils.optJsonObjectOrDefault(jSONObject, "additionalParams", new JSONObject());
        int i2 = 0;
        boolean optBooleanOrDefault = JsonUtils.optBooleanOrDefault(jSONObject, "wasSet", false);
        boolean optBooleanOrDefault2 = JsonUtils.optBooleanOrDefault(jSONObject, "autoTracking", false);
        String optStringOrNull2 = JsonUtils.optStringOrNull(jSONObject, AdRevenueConstants.SOURCE_KEY);
        Y7[] values = Y7.values();
        int length = values.length;
        while (true) {
            if (i2 >= length) {
                y7 = null;
                break;
            }
            y7 = values[i2];
            if (kotlin.jvm.internal.i.a(y7.f7734a, optStringOrNull2)) {
                break;
            }
            i2++;
        }
        return new C1058vf(optStringOrNull, optJsonObjectOrDefault, optBooleanOrDefault, optBooleanOrDefault2, y7 == null ? Y7.f7729b : y7);
    }
}
