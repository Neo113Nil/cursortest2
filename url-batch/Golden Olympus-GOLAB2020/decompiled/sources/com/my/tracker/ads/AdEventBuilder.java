package com.my.tracker.ads;

import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public final class AdEventBuilder {

    /* renamed from: a, reason: collision with root package name */
    final int f20861a;

    /* renamed from: b, reason: collision with root package name */
    final int f20862b;

    /* renamed from: c, reason: collision with root package name */
    final double f20863c;

    /* renamed from: d, reason: collision with root package name */
    final String f20864d;

    /* renamed from: e, reason: collision with root package name */
    String f20865e;

    /* renamed from: f, reason: collision with root package name */
    String f20866f;

    /* renamed from: g, reason: collision with root package name */
    String f20867g;

    /* renamed from: h, reason: collision with root package name */
    String f20868h;

    private AdEventBuilder(int i4, int i5, double d4, String str) {
        this.f20861a = i4;
        this.f20862b = i5;
        this.f20863c = d4;
        this.f20864d = str;
    }

    @NonNull
    public static AdEventBuilder newClickBuilder(int i4) {
        return new AdEventBuilder(18, i4, Double.NaN, null);
    }

    @NonNull
    public static AdEventBuilder newImpressionBuilder(int i4) {
        return new AdEventBuilder(17, i4, Double.NaN, null);
    }

    @NonNull
    public static AdEventBuilder newRevenueBuilder(int i4, double d4, @NonNull String str) {
        return new AdEventBuilder(19, i4, d4, str);
    }

    @NonNull
    public AdEvent build() {
        return new AdEvent(this.f20861a, this.f20862b, this.f20863c, this.f20864d, this.f20865e, this.f20866f, this.f20867g, this.f20868h);
    }

    @NonNull
    public AdEventBuilder withAdFormat(String str) {
        this.f20868h = str;
        return this;
    }

    @NonNull
    public AdEventBuilder withAdId(String str) {
        this.f20867g = str;
        return this;
    }

    @NonNull
    public AdEventBuilder withPlacementId(String str) {
        this.f20866f = str;
        return this;
    }

    @NonNull
    public AdEventBuilder withSource(String str) {
        this.f20865e = str;
        return this;
    }
}
