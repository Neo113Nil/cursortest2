package com.facebook.ads.internal.n;

import org.json.JSONObject;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private final String f5242a;

    /* renamed from: b, reason: collision with root package name */
    private final int f5243b;

    /* renamed from: c, reason: collision with root package name */
    private final int f5244c;

    public f(String str, int i, int i2) {
        this.f5242a = str;
        this.f5243b = i;
        this.f5244c = i2;
    }

    public static f a(JSONObject jSONObject) {
        String optString;
        if (jSONObject == null || (optString = jSONObject.optString("url")) == null) {
            return null;
        }
        return new f(optString, jSONObject.optInt("width", 0), jSONObject.optInt("height", 0));
    }

    public String a() {
        return this.f5242a;
    }

    public int b() {
        return this.f5243b;
    }

    public int c() {
        return this.f5244c;
    }
}
