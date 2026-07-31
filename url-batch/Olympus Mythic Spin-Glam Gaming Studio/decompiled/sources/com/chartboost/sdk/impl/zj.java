package com.chartboost.sdk.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class zj {
    public final tj a;
    public final int b;
    public final int c;
    public final Set d;
    public final List e;
    public final List f;

    public zj(tj vastFetcher, int i, int i2, Set visitedWrapperUris, List aggregatedTrackingEvents, List aggregatedAdVerifications) {
        Intrinsics.checkNotNullParameter(vastFetcher, "vastFetcher");
        Intrinsics.checkNotNullParameter(visitedWrapperUris, "visitedWrapperUris");
        Intrinsics.checkNotNullParameter(aggregatedTrackingEvents, "aggregatedTrackingEvents");
        Intrinsics.checkNotNullParameter(aggregatedAdVerifications, "aggregatedAdVerifications");
        this.a = vastFetcher;
        this.b = i;
        this.c = i2;
        this.d = visitedWrapperUris;
        this.e = aggregatedTrackingEvents;
        this.f = aggregatedAdVerifications;
    }

    public final zj a(tj vastFetcher, int i, int i2, Set visitedWrapperUris, List aggregatedTrackingEvents, List aggregatedAdVerifications) {
        Intrinsics.checkNotNullParameter(vastFetcher, "vastFetcher");
        Intrinsics.checkNotNullParameter(visitedWrapperUris, "visitedWrapperUris");
        Intrinsics.checkNotNullParameter(aggregatedTrackingEvents, "aggregatedTrackingEvents");
        Intrinsics.checkNotNullParameter(aggregatedAdVerifications, "aggregatedAdVerifications");
        return new zj(vastFetcher, i, i2, visitedWrapperUris, aggregatedTrackingEvents, aggregatedAdVerifications);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zj)) {
            return false;
        }
        zj zjVar = (zj) obj;
        return Intrinsics.areEqual(this.a, zjVar.a) && this.b == zjVar.b && this.c == zjVar.c && Intrinsics.areEqual(this.d, zjVar.d) && Intrinsics.areEqual(this.e, zjVar.e) && Intrinsics.areEqual(this.f, zjVar.f);
    }

    public int hashCode() {
        return (((((((((this.a.hashCode() * 31) + Integer.hashCode(this.b)) * 31) + Integer.hashCode(this.c)) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public String toString() {
        return "VastParsingContext(vastFetcher=" + this.a + ", maxWrapperDepth=" + this.b + ", currentDepth=" + this.c + ", visitedWrapperUris=" + this.d + ", aggregatedTrackingEvents=" + this.e + ", aggregatedAdVerifications=" + this.f + ")";
    }

    public static /* synthetic */ zj a(zj zjVar, tj tjVar, int i, int i2, Set set, List list, List list2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            tjVar = zjVar.a;
        }
        if ((i3 & 2) != 0) {
            i = zjVar.b;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            i2 = zjVar.c;
        }
        int i5 = i2;
        if ((i3 & 8) != 0) {
            set = zjVar.d;
        }
        Set set2 = set;
        if ((i3 & 16) != 0) {
            list = zjVar.e;
        }
        List list3 = list;
        if ((i3 & 32) != 0) {
            list2 = zjVar.f;
        }
        return zjVar.a(tjVar, i4, i5, set2, list3, list2);
    }

    public final int d() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    public final Set e() {
        return this.d;
    }

    public final List b() {
        return this.e;
    }

    public final List a() {
        return this.f;
    }

    public /* synthetic */ zj(tj tjVar, int i, int i2, Set set, List list, List list2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(tjVar, i, (i3 & 4) != 0 ? 0 : i2, (i3 & 8) != 0 ? SetsKt.emptySet() : set, (i3 & 16) != 0 ? new ArrayList() : list, (i3 & 32) != 0 ? new ArrayList() : list2);
    }
}
