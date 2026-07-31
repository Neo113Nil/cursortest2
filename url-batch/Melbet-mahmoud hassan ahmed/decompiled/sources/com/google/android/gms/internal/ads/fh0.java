package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class fh0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f5108a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5109b;

    public fh0(boolean z6, String str) {
        this.f5108a = z6;
        this.f5109b = str;
    }

    public static fh0 a(JSONObject jSONObject) {
        return new fh0(jSONObject.optBoolean("enable_prewarming", false), jSONObject.optString("prefetch_url", ""));
    }
}
