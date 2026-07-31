package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class o3 {
    public final String a;
    public final Boolean b;

    public o3(String url, Boolean bool) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.a = url;
        this.b = bool;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o3)) {
            return false;
        }
        o3 o3Var = (o3) obj;
        return Intrinsics.areEqual(this.a, o3Var.a) && Intrinsics.areEqual(this.b, o3Var.b);
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Boolean bool = this.b;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    public String toString() {
        return "CBUrl(url=" + this.a + ", shouldDismiss=" + this.b + ")";
    }

    public final Boolean a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }
}
