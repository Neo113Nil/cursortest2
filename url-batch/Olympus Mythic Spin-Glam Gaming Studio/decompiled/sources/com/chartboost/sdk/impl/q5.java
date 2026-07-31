package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class q5 {
    public final String a;
    public final aj b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q5)) {
            return false;
        }
        q5 q5Var = (q5) obj;
        return Intrinsics.areEqual(this.a, q5Var.a) && Intrinsics.areEqual(this.b, q5Var.b);
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        aj ajVar = this.b;
        return hashCode + (ajVar != null ? ajVar.hashCode() : 0);
    }

    public String toString() {
        return "CreativeExtension(type=" + this.a + ", universalAdId=" + this.b + ")";
    }

    public q5(String str, aj ajVar) {
        this.a = str;
        this.b = ajVar;
    }
}
