package io.appmetrica.analytics.impl;

import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.hf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0545hf {

    /* renamed from: a, reason: collision with root package name */
    public final String f7443a;

    /* renamed from: b, reason: collision with root package name */
    public final JSONObject f7444b;

    /* renamed from: c, reason: collision with root package name */
    public final Y7 f7445c;

    public C0545hf(String str, JSONObject jSONObject, Y7 y7) {
        this.f7443a = str;
        this.f7444b = jSONObject;
        this.f7445c = y7;
    }

    public final String toString() {
        return "Candidate{trackingId='" + this.f7443a + "', additionalParams=" + this.f7444b + ", source=" + this.f7445c + '}';
    }
}
