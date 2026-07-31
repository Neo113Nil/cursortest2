package com.chartboost.sdk.impl;

import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class e0 {
    public final ViewGroup a;
    public final int b;
    public final int c;

    public e0(ViewGroup bannerView, int i, int i2) {
        Intrinsics.checkNotNullParameter(bannerView, "bannerView");
        this.a = bannerView;
        this.b = i;
        this.c = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return Intrinsics.areEqual(this.a, e0Var.a) && this.b == e0Var.b && this.c == e0Var.c;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + Integer.hashCode(this.b)) * 31) + Integer.hashCode(this.c);
    }

    public String toString() {
        return "AdUnitBannerData(bannerView=" + this.a + ", bannerWidth=" + this.b + ", bannerHeight=" + this.c + ")";
    }

    public final ViewGroup b() {
        return this.a;
    }

    public final int c() {
        return this.b;
    }

    public final int a() {
        return this.c;
    }
}
