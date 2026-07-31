package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class l4 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Float f;
    public final Float g;
    public final qa h;
    public final Boolean i;

    public l4(String location, String adId, String to, String cgn, String creative, Float f, Float f2, qa impressionMediaType, Boolean bool) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(to, "to");
        Intrinsics.checkNotNullParameter(cgn, "cgn");
        Intrinsics.checkNotNullParameter(creative, "creative");
        Intrinsics.checkNotNullParameter(impressionMediaType, "impressionMediaType");
        this.a = location;
        this.b = adId;
        this.c = to;
        this.d = cgn;
        this.e = creative;
        this.f = f;
        this.g = f2;
        this.h = impressionMediaType;
        this.i = bool;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l4)) {
            return false;
        }
        l4 l4Var = (l4) obj;
        return Intrinsics.areEqual(this.a, l4Var.a) && Intrinsics.areEqual(this.b, l4Var.b) && Intrinsics.areEqual(this.c, l4Var.c) && Intrinsics.areEqual(this.d, l4Var.d) && Intrinsics.areEqual(this.e, l4Var.e) && Intrinsics.areEqual((Object) this.f, (Object) l4Var.f) && Intrinsics.areEqual((Object) this.g, (Object) l4Var.g) && this.h == l4Var.h && Intrinsics.areEqual(this.i, l4Var.i);
    }

    public int hashCode() {
        int hashCode = ((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31;
        Float f = this.f;
        int hashCode2 = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.g;
        int hashCode3 = (((hashCode2 + (f2 == null ? 0 : f2.hashCode())) * 31) + this.h.hashCode()) * 31;
        Boolean bool = this.i;
        return hashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "ClickParams(location=" + this.a + ", adId=" + this.b + ", to=" + this.c + ", cgn=" + this.d + ", creative=" + this.e + ", videoPosition=" + this.f + ", videoDuration=" + this.g + ", impressionMediaType=" + this.h + ", retargetReinstall=" + this.i + ")";
    }

    public final String e() {
        return this.a;
    }

    public final String a() {
        return this.b;
    }

    public final String g() {
        return this.c;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.e;
    }

    public final Float i() {
        return this.f;
    }

    public final Float h() {
        return this.g;
    }

    public final qa d() {
        return this.h;
    }

    public final Boolean f() {
        return this.i;
    }
}
