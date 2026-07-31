package com.chartboost.sdk.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class n8 {
    public final String a;
    public final String b;
    public final List c;

    public n8(String str, String str2, List children) {
        Intrinsics.checkNotNullParameter(children, "children");
        this.a = str;
        this.b = str2;
        this.c = children;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n8)) {
            return false;
        }
        n8 n8Var = (n8) obj;
        return Intrinsics.areEqual(this.a, n8Var.a) && Intrinsics.areEqual(this.b, n8Var.b) && Intrinsics.areEqual(this.c, n8Var.c);
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "Extension(type=" + this.a + ", content=" + this.b + ", children=" + this.c + ")";
    }
}
