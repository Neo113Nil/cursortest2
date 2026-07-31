package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class aj {
    public final String a;
    public final String b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aj)) {
            return false;
        }
        aj ajVar = (aj) obj;
        return Intrinsics.areEqual(this.a, ajVar.a) && Intrinsics.areEqual(this.b, ajVar.b);
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "UniversalAdId(idRegistry=" + this.a + ", value=" + this.b + ")";
    }

    public aj(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
