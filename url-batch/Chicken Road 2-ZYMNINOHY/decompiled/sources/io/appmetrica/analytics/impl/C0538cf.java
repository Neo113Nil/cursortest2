package io.appmetrica.analytics.impl;

import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.cf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0538cf {

    /* renamed from: a, reason: collision with root package name */
    public final String f11612a;

    /* renamed from: b, reason: collision with root package name */
    public final JSONObject f11613b;

    /* renamed from: c, reason: collision with root package name */
    public final S7 f11614c;

    public C0538cf(String str, JSONObject jSONObject, S7 s7) {
        this.f11612a = str;
        this.f11613b = jSONObject;
        this.f11614c = s7;
    }

    public final String toString() {
        return "Candidate{trackingId='" + this.f11612a + "', additionalParams=" + this.f11613b + ", source=" + this.f11614c + '}';
    }
}
