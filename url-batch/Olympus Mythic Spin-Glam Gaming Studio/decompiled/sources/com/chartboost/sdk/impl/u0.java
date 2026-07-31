package com.chartboost.sdk.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class u0 {
    public final String a;
    public final List b;
    public final List c;
    public final String d;

    public u0(String str, List javaScriptResources, List trackingEvents, String str2) {
        Intrinsics.checkNotNullParameter(javaScriptResources, "javaScriptResources");
        Intrinsics.checkNotNullParameter(trackingEvents, "trackingEvents");
        this.a = str;
        this.b = javaScriptResources;
        this.c = trackingEvents;
        this.d = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return Intrinsics.areEqual(this.a, u0Var.a) && Intrinsics.areEqual(this.b, u0Var.b) && Intrinsics.areEqual(this.c, u0Var.c) && Intrinsics.areEqual(this.d, u0Var.d);
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = (((((str == null ? 0 : str.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31;
        String str2 = this.d;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "AdVerification(vendor=" + this.a + ", javaScriptResources=" + this.b + ", trackingEvents=" + this.c + ", verificationParameters=" + this.d + ")";
    }

    public final String c() {
        return this.a;
    }

    public final List a() {
        return this.b;
    }

    public final List b() {
        return this.c;
    }

    public final String d() {
        return this.d;
    }
}
