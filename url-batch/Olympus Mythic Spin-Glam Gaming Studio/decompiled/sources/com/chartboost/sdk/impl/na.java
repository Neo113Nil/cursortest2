package com.chartboost.sdk.impl;

import com.chartboost.sdk.internal.Model.CBError;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class na {
    public final a3 a;
    public final CBError.Impression b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof na)) {
            return false;
        }
        na naVar = (na) obj;
        return Intrinsics.areEqual(this.a, naVar.a) && this.b == naVar.b;
    }

    public int hashCode() {
        a3 a3Var = this.a;
        int hashCode = (a3Var == null ? 0 : a3Var.hashCode()) * 31;
        CBError.Impression impression = this.b;
        return hashCode + (impression != null ? impression.hashCode() : 0);
    }

    public String toString() {
        return "ImpressionHolder(impression=" + this.a + ", error=" + this.b + ")";
    }

    public na(a3 a3Var, CBError.Impression impression) {
        this.a = a3Var;
        this.b = impression;
    }

    public final a3 b() {
        return this.a;
    }

    public final CBError.Impression a() {
        return this.b;
    }
}
