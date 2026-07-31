package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c5 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final Float f;
    public final Float g;

    public c5(String location, String adId, String cgn, int i, String rewardCurrency, Float f, Float f2) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(cgn, "cgn");
        Intrinsics.checkNotNullParameter(rewardCurrency, "rewardCurrency");
        this.a = location;
        this.b = adId;
        this.c = cgn;
        this.d = i;
        this.e = rewardCurrency;
        this.f = f;
        this.g = f2;
    }

    public final String c() {
        return this.a;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.c;
    }

    public final int d() {
        return this.d;
    }

    public final String e() {
        return this.e;
    }

    public final Float g() {
        return this.f;
    }

    public final Float f() {
        return this.g;
    }
}
