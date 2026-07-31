package com.chartboost.sdk.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class nl {
    public final String a;
    public final List b;
    public final List c;
    public final List d;

    public nl(String str, List viewableUrls, List notViewableUrls, List viewUndeterminedUrls) {
        Intrinsics.checkNotNullParameter(viewableUrls, "viewableUrls");
        Intrinsics.checkNotNullParameter(notViewableUrls, "notViewableUrls");
        Intrinsics.checkNotNullParameter(viewUndeterminedUrls, "viewUndeterminedUrls");
        this.a = str;
        this.b = viewableUrls;
        this.c = notViewableUrls;
        this.d = viewUndeterminedUrls;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nl)) {
            return false;
        }
        nl nlVar = (nl) obj;
        return Intrinsics.areEqual(this.a, nlVar.a) && Intrinsics.areEqual(this.b, nlVar.b) && Intrinsics.areEqual(this.c, nlVar.c) && Intrinsics.areEqual(this.d, nlVar.d);
    }

    public int hashCode() {
        String str = this.a;
        return ((((((str == null ? 0 : str.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "ViewableImpression(id=" + this.a + ", viewableUrls=" + this.b + ", notViewableUrls=" + this.c + ", viewUndeterminedUrls=" + this.d + ")";
    }

    public final List b() {
        return this.b;
    }

    public final List a() {
        return this.c;
    }
}
