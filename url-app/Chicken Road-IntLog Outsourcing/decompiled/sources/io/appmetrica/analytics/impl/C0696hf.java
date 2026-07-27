package io.appmetrica.analytics.impl;

import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.hf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0696hf {

    /* renamed from: a, reason: collision with root package name */
    public final String f8320a;

    /* renamed from: b, reason: collision with root package name */
    public final JSONObject f8321b;

    /* renamed from: c, reason: collision with root package name */
    public final Y7 f8322c;

    public C0696hf(String str, JSONObject jSONObject, Y7 y7) {
        this.f8320a = str;
        this.f8321b = jSONObject;
        this.f8322c = y7;
    }

    public final String toString() {
        return "Candidate{trackingId='" + this.f8320a + "', additionalParams=" + this.f8321b + ", source=" + this.f8322c + '}';
    }
}
