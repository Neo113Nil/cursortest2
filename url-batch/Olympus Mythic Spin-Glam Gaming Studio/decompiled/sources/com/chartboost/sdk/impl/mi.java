package com.chartboost.sdk.impl;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class mi {
    public final boolean a;
    public final List b;
    public final String c;
    public final int d;
    public final int e;
    public final boolean f;
    public final int g;
    public final boolean h;

    public mi(boolean z, List blackList, String endpoint, int i, int i2, boolean z2, int i3, boolean z3) {
        Intrinsics.checkNotNullParameter(blackList, "blackList");
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        this.a = z;
        this.b = blackList;
        this.c = endpoint;
        this.d = i;
        this.e = i2;
        this.f = z2;
        this.g = i3;
        this.h = z3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mi)) {
            return false;
        }
        mi miVar = (mi) obj;
        return this.a == miVar.a && Intrinsics.areEqual(this.b, miVar.b) && Intrinsics.areEqual(this.c, miVar.c) && this.d == miVar.d && this.e == miVar.e && this.f == miVar.f && this.g == miVar.g && this.h == miVar.h;
    }

    public int hashCode() {
        return (((((((((((((Boolean.hashCode(this.a) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + Integer.hashCode(this.d)) * 31) + Integer.hashCode(this.e)) * 31) + Boolean.hashCode(this.f)) * 31) + Integer.hashCode(this.g)) * 31) + Boolean.hashCode(this.h);
    }

    public String toString() {
        return "TrackingConfig(isEnabled=" + this.a + ", blackList=" + this.b + ", endpoint=" + this.c + ", eventLimit=" + this.d + ", windowDuration=" + this.e + ", persistenceEnabled=" + this.f + ", persistenceMaxEvents=" + this.g + ", logContextEnabled=" + this.h + ")";
    }

    public final boolean h() {
        return this.a;
    }

    public final List a() {
        return this.b;
    }

    public final String b() {
        return this.c;
    }

    public final int c() {
        return this.d;
    }

    public final int g() {
        return this.e;
    }

    public final boolean e() {
        return this.f;
    }

    public final int f() {
        return this.g;
    }

    public final boolean d() {
        return this.h;
    }

    public /* synthetic */ mi(boolean z, List list, String str, int i, int i2, boolean z2, int i3, boolean z3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? false : z, (i4 & 2) != 0 ? ni.a() : list, (i4 & 4) != 0 ? "https://ssp-events.chartboost.com/track/sdk" : str, (i4 & 8) != 0 ? 10 : i, (i4 & 16) != 0 ? 60 : i2, (i4 & 32) != 0 ? true : z2, (i4 & 64) != 0 ? 100 : i3, (i4 & 128) == 0 ? z3 : true);
    }
}
