package com.chartboost.sdk.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class p9 {
    public final String a;
    public final List b;
    public final List c;

    public p9(String str, List iconClickTracking, List iconClickFallbackImages) {
        Intrinsics.checkNotNullParameter(iconClickTracking, "iconClickTracking");
        Intrinsics.checkNotNullParameter(iconClickFallbackImages, "iconClickFallbackImages");
        this.a = str;
        this.b = iconClickTracking;
        this.c = iconClickFallbackImages;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p9)) {
            return false;
        }
        p9 p9Var = (p9) obj;
        return Intrinsics.areEqual(this.a, p9Var.a) && Intrinsics.areEqual(this.b, p9Var.b) && Intrinsics.areEqual(this.c, p9Var.c);
    }

    public int hashCode() {
        String str = this.a;
        return ((((str == null ? 0 : str.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "IconClicks(iconClickThrough=" + this.a + ", iconClickTracking=" + this.b + ", iconClickFallbackImages=" + this.c + ")";
    }
}
