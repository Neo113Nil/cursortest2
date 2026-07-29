package com.facebook.ads.internal.n;

import org.json.JSONObject;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private final double f5245a;

    /* renamed from: b, reason: collision with root package name */
    private final double f5246b;

    public g(double d2, double d3) {
        this.f5245a = d2;
        this.f5246b = d3;
    }

    public static g a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        double optDouble = jSONObject.optDouble("value", 0.0d);
        double optDouble2 = jSONObject.optDouble("scale", 0.0d);
        if (optDouble == 0.0d || optDouble2 == 0.0d) {
            return null;
        }
        return new g(optDouble, optDouble2);
    }

    public double a() {
        return this.f5245a;
    }

    public double b() {
        return this.f5246b;
    }
}
