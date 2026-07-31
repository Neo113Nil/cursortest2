package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.ml;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class qj {
    public final String a;
    public final List b;
    public final List c;
    public final List d;
    public final Set e;

    public qj(String str, List ads, List aggregatedTrackingEvents, List aggregatedAdVerifications, Set viewabilityVendors) {
        Intrinsics.checkNotNullParameter(ads, "ads");
        Intrinsics.checkNotNullParameter(aggregatedTrackingEvents, "aggregatedTrackingEvents");
        Intrinsics.checkNotNullParameter(aggregatedAdVerifications, "aggregatedAdVerifications");
        Intrinsics.checkNotNullParameter(viewabilityVendors, "viewabilityVendors");
        this.a = str;
        this.b = ads;
        this.c = aggregatedTrackingEvents;
        this.d = aggregatedAdVerifications;
        this.e = viewabilityVendors;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qj)) {
            return false;
        }
        qj qjVar = (qj) obj;
        return Intrinsics.areEqual(this.a, qjVar.a) && Intrinsics.areEqual(this.b, qjVar.b) && Intrinsics.areEqual(this.c, qjVar.c) && Intrinsics.areEqual(this.d, qjVar.d) && Intrinsics.areEqual(this.e, qjVar.e);
    }

    public int hashCode() {
        String str = this.a;
        return ((((((((str == null ? 0 : str.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public String toString() {
        return "Vast(version=" + this.a + ", ads=" + this.b + ", aggregatedTrackingEvents=" + this.c + ", aggregatedAdVerifications=" + this.d + ", viewabilityVendors=" + this.e + ")";
    }

    public final List a() {
        return this.b;
    }

    public final List c() {
        return this.c;
    }

    public final List b() {
        return this.d;
    }

    public /* synthetic */ qj(String str, List list, List list2, List list3, Set set, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, list2, list3, (i & 16) != 0 ? ml.b.a(ml.e, list3, null, 2, null) : set);
    }
}
