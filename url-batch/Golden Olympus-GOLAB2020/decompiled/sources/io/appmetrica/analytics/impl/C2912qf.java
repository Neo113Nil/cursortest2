package io.appmetrica.analytics.impl;

import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.qf, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2912qf {

    /* renamed from: a, reason: collision with root package name */
    public final String f39659a;

    /* renamed from: b, reason: collision with root package name */
    public final JSONObject f39660b;

    /* renamed from: c, reason: collision with root package name */
    public final EnumC2775l8 f39661c;

    public C2912qf(String str, JSONObject jSONObject, EnumC2775l8 enumC2775l8) {
        this.f39659a = str;
        this.f39660b = jSONObject;
        this.f39661c = enumC2775l8;
    }

    public final String toString() {
        return "Candidate{trackingId='" + this.f39659a + "', additionalParams=" + this.f39660b + ", source=" + this.f39661c + '}';
    }
}
