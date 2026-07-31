package com.chartboost.sdk.impl;

import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j {
    public final u a;
    public final Map b;

    public j(u adFormat, Map extras) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(extras, "extras");
        this.a = adFormat;
        this.b = extras;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.a == jVar.a && Intrinsics.areEqual(this.b, jVar.b);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "AdConfig(adFormat=" + this.a + ", extras=" + this.b + ")";
    }

    public final u a() {
        return this.a;
    }

    public /* synthetic */ j(u uVar, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uVar, (i & 2) != 0 ? MapsKt.emptyMap() : map);
    }
}
