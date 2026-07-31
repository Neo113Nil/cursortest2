package com.chartboost.sdk.impl;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class o8 {
    public final String a;
    public final Map b;
    public final String c;

    public o8(String name, Map attributes, String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        this.a = name;
        this.b = attributes;
        this.c = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o8)) {
            return false;
        }
        o8 o8Var = (o8) obj;
        return Intrinsics.areEqual(this.a, o8Var.a) && Intrinsics.areEqual(this.b, o8Var.b) && Intrinsics.areEqual(this.c, o8Var.c);
    }

    public int hashCode() {
        int hashCode = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
        String str = this.c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "ExtensionChild(name=" + this.a + ", attributes=" + this.b + ", content=" + this.c + ")";
    }
}
