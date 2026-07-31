package com.chartboost.sdk.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b5 {
    public final String a;
    public final List b;

    public b5(String str, List companionAds) {
        Intrinsics.checkNotNullParameter(companionAds, "companionAds");
        this.a = str;
        this.b = companionAds;
    }

    public final b5 a(String str, List companionAds) {
        Intrinsics.checkNotNullParameter(companionAds, "companionAds");
        return new b5(str, companionAds);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b5)) {
            return false;
        }
        b5 b5Var = (b5) obj;
        return Intrinsics.areEqual(this.a, b5Var.a) && Intrinsics.areEqual(this.b, b5Var.b);
    }

    public int hashCode() {
        String str = this.a;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.b.hashCode();
    }

    public String toString() {
        return "CompanionAds(required=" + this.a + ", companionAds=" + this.b + ")";
    }

    public static /* synthetic */ b5 a(b5 b5Var, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = b5Var.a;
        }
        if ((i & 2) != 0) {
            list = b5Var.b;
        }
        return b5Var.a(str, list);
    }

    public final List a() {
        return this.b;
    }
}
