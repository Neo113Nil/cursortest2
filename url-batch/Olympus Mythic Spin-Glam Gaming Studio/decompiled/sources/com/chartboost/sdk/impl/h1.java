package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class h1 {
    public final xi a;
    public final String b;

    public h1(xi advertisingIDState, String str) {
        Intrinsics.checkNotNullParameter(advertisingIDState, "advertisingIDState");
        this.a = advertisingIDState;
        this.b = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj;
        return this.a == h1Var.a && Intrinsics.areEqual(this.b, h1Var.b);
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "AdvertisingIDHolder(advertisingIDState=" + this.a + ", advertisingID=" + this.b + ")";
    }

    public final xi b() {
        return this.a;
    }

    public final String a() {
        return this.b;
    }
}
