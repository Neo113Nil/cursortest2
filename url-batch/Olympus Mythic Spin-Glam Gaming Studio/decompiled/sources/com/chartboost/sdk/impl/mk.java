package com.chartboost.sdk.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class mk {
    public final String a;
    public final List b;

    public mk(String str, List clickTracking) {
        Intrinsics.checkNotNullParameter(clickTracking, "clickTracking");
        this.a = str;
        this.b = clickTracking;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mk)) {
            return false;
        }
        mk mkVar = (mk) obj;
        return Intrinsics.areEqual(this.a, mkVar.a) && Intrinsics.areEqual(this.b, mkVar.b);
    }

    public int hashCode() {
        String str = this.a;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.b.hashCode();
    }

    public String toString() {
        return "VideoClicks(clickThrough=" + this.a + ", clickTracking=" + this.b + ")";
    }

    public final String a() {
        return this.a;
    }

    public final List b() {
        return this.b;
    }
}
