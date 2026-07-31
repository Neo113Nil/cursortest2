package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* loaded from: classes.dex */
final class oy1 {

    /* renamed from: a, reason: collision with root package name */
    private final String f9881a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9882b;

    /* renamed from: c, reason: collision with root package name */
    private final int f9883c;

    /* renamed from: d, reason: collision with root package name */
    private final String f9884d;

    /* renamed from: e, reason: collision with root package name */
    private final int f9885e;

    public oy1(String str, String str2, int i7, String str3, int i8) {
        this.f9881a = str;
        this.f9882b = str2;
        this.f9883c = i7;
        this.f9884d = str3;
        this.f9885e = i8;
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("adapterClassName", this.f9881a);
        jSONObject.put("version", this.f9882b);
        jSONObject.put("status", this.f9883c);
        jSONObject.put("description", this.f9884d);
        jSONObject.put("initializationLatencyMillis", this.f9885e);
        return jSONObject;
    }
}
