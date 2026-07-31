package com.ironsource;

import com.ironsource.b9;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class st {

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f19645a;

    public st(JSONObject jSONObject) {
        this.f19645a = jSONObject == null ? new JSONObject() : jSONObject;
    }

    public boolean a() {
        return this.f19645a.optBoolean("uxt", false);
    }

    public boolean b() {
        return this.f19645a.optBoolean(b9.a.f15301o, false);
    }

    public boolean c() {
        return this.f19645a.optBoolean(b9.a.f15302p, false);
    }

    public boolean d() {
        return this.f19645a.optBoolean(b9.a.f15298l, false);
    }

    public boolean e() {
        return this.f19645a.optBoolean(b9.a.f15300n, false);
    }
}
