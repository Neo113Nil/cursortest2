package com.facebook.ads.internal.f;

import java.util.Map;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private double f5115a;

    /* renamed from: b, reason: collision with root package name */
    private double f5116b;

    /* renamed from: c, reason: collision with root package name */
    private String f5117c;

    /* renamed from: d, reason: collision with root package name */
    private Map<String, String> f5118d;

    public d(double d2, String str, Map<String, String> map) {
        this.f5115a = d2;
        this.f5117c = str;
        this.f5118d = map;
        double currentTimeMillis = System.currentTimeMillis();
        Double.isNaN(currentTimeMillis);
        this.f5116b = currentTimeMillis / 1000.0d;
    }

    public String a() {
        return "debug_crash_report";
    }

    public double b() {
        return this.f5116b;
    }

    public double c() {
        return this.f5115a;
    }

    public String d() {
        return this.f5117c;
    }

    public Map<String, String> e() {
        return this.f5118d;
    }
}
