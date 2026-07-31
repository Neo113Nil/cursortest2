package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class o9 {
    public final Integer a;
    public final Integer b;
    public final String c;
    public final lh d;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o9)) {
            return false;
        }
        o9 o9Var = (o9) obj;
        return Intrinsics.areEqual(this.a, o9Var.a) && Intrinsics.areEqual(this.b, o9Var.b) && Intrinsics.areEqual(this.c, o9Var.c) && Intrinsics.areEqual(this.d, o9Var.d);
    }

    public int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        lh lhVar = this.d;
        return hashCode3 + (lhVar != null ? lhVar.hashCode() : 0);
    }

    public String toString() {
        return "IconClickFallbackImage(width=" + this.a + ", height=" + this.b + ", altText=" + this.c + ", staticResource=" + this.d + ")";
    }

    public o9(Integer num, Integer num2, String str, lh lhVar) {
        this.a = num;
        this.b = num2;
        this.c = str;
        this.d = lhVar;
    }
}
