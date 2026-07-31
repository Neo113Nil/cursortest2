package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class lh implements ak {
    public final String a;
    public final String b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lh)) {
            return false;
        }
        lh lhVar = (lh) obj;
        return Intrinsics.areEqual(this.a, lhVar.a) && Intrinsics.areEqual(this.b, lhVar.b);
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "StaticResource(creativeType=" + this.a + ", url=" + this.b + ")";
    }

    public lh(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }
}
