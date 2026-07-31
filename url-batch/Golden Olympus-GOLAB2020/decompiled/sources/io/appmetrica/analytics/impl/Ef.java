package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class Ef implements InterfaceC2801m8 {

    /* renamed from: a, reason: collision with root package name */
    public final String f37445a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final JSONObject f37446b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f37447c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f37448d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final EnumC2775l8 f37449e;

    public Ef(String str, @NonNull JSONObject jSONObject, boolean z4, boolean z5, @NonNull EnumC2775l8 enumC2775l8) {
        this.f37445a = str;
        this.f37446b = jSONObject;
        this.f37447c = z4;
        this.f37448d = z5;
        this.f37449e = enumC2775l8;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2801m8
    @NonNull
    public final EnumC2775l8 a() {
        return this.f37449e;
    }

    public final JSONObject b() {
        if (!this.f37447c) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("trackingId", this.f37445a);
            if (this.f37446b.length() > 0) {
                jSONObject.put("additionalParams", this.f37446b);
            }
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    @NonNull
    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("trackingId", this.f37445a);
            jSONObject.put("additionalParams", this.f37446b);
            jSONObject.put("wasSet", this.f37447c);
            jSONObject.put("autoTracking", this.f37448d);
            jSONObject.put("source", this.f37449e.f39397a);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public final String toString() {
        return "PreloadInfoState{trackingId='" + this.f37445a + "', additionalParameters=" + this.f37446b + ", wasSet=" + this.f37447c + ", autoTrackingEnabled=" + this.f37448d + ", source=" + this.f37449e + '}';
    }

    @NonNull
    public static Ef a(JSONObject jSONObject) {
        EnumC2775l8 enumC2775l8;
        String optStringOrNull = JsonUtils.optStringOrNull(jSONObject, "trackingId");
        JSONObject optJsonObjectOrDefault = JsonUtils.optJsonObjectOrDefault(jSONObject, "additionalParams", new JSONObject());
        int i4 = 0;
        boolean optBooleanOrDefault = JsonUtils.optBooleanOrDefault(jSONObject, "wasSet", false);
        boolean optBooleanOrDefault2 = JsonUtils.optBooleanOrDefault(jSONObject, "autoTracking", false);
        String optStringOrNull2 = JsonUtils.optStringOrNull(jSONObject, "source");
        EnumC2775l8[] values = EnumC2775l8.values();
        int length = values.length;
        while (true) {
            if (i4 >= length) {
                enumC2775l8 = null;
                break;
            }
            enumC2775l8 = values[i4];
            if (Intrinsics.areEqual(enumC2775l8.f39397a, optStringOrNull2)) {
                break;
            }
            i4++;
        }
        if (enumC2775l8 == null) {
            enumC2775l8 = EnumC2775l8.f39392b;
        }
        return new Ef(optStringOrNull, optJsonObjectOrDefault, optBooleanOrDefault, optBooleanOrDefault2, enumC2775l8);
    }
}
