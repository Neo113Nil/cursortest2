package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class b0 {
    public final c0 a;
    public final Integer b;
    public final Integer c;
    public final String d;
    public final int e;

    public b0(c0 adType, Integer num, Integer num2, String str, int i) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        this.a = adType;
        this.b = num;
        this.c = num2;
        this.d = str;
        this.e = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return Intrinsics.areEqual(this.a, b0Var.a) && Intrinsics.areEqual(this.b, b0Var.b) && Intrinsics.areEqual(this.c, b0Var.c) && Intrinsics.areEqual(this.d, b0Var.d) && this.e == b0Var.e;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.d;
        return ((hashCode3 + (str != null ? str.hashCode() : 0)) * 31) + Integer.hashCode(this.e);
    }

    public String toString() {
        return "AdParameters(adType=" + this.a + ", height=" + this.b + ", width=" + this.c + ", location=" + this.d + ", impDepth=" + this.e + ")";
    }

    public final c0 a() {
        return this.a;
    }

    public final Integer b() {
        return this.b;
    }

    public final Integer e() {
        return this.c;
    }

    public final String d() {
        return this.d;
    }

    public final int c() {
        return this.e;
    }
}
