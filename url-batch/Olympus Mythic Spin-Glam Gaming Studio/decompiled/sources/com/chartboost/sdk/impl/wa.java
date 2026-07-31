package com.chartboost.sdk.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class wa {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final List e;
    public final List f;
    public final List g;
    public final List h;
    public final List i;

    public wa(String str, String str2, String str3, List errors, List impressions, List creatives, List extensions, List adVerifications, List viewableImpressions) {
        Intrinsics.checkNotNullParameter(errors, "errors");
        Intrinsics.checkNotNullParameter(impressions, "impressions");
        Intrinsics.checkNotNullParameter(creatives, "creatives");
        Intrinsics.checkNotNullParameter(extensions, "extensions");
        Intrinsics.checkNotNullParameter(adVerifications, "adVerifications");
        Intrinsics.checkNotNullParameter(viewableImpressions, "viewableImpressions");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = errors;
        this.e = impressions;
        this.f = creatives;
        this.g = extensions;
        this.h = adVerifications;
        this.i = viewableImpressions;
    }

    public final wa a(String str, String str2, String str3, List errors, List impressions, List creatives, List extensions, List adVerifications, List viewableImpressions) {
        Intrinsics.checkNotNullParameter(errors, "errors");
        Intrinsics.checkNotNullParameter(impressions, "impressions");
        Intrinsics.checkNotNullParameter(creatives, "creatives");
        Intrinsics.checkNotNullParameter(extensions, "extensions");
        Intrinsics.checkNotNullParameter(adVerifications, "adVerifications");
        Intrinsics.checkNotNullParameter(viewableImpressions, "viewableImpressions");
        return new wa(str, str2, str3, errors, impressions, creatives, extensions, adVerifications, viewableImpressions);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wa)) {
            return false;
        }
        wa waVar = (wa) obj;
        return Intrinsics.areEqual(this.a, waVar.a) && Intrinsics.areEqual(this.b, waVar.b) && Intrinsics.areEqual(this.c, waVar.c) && Intrinsics.areEqual(this.d, waVar.d) && Intrinsics.areEqual(this.e, waVar.e) && Intrinsics.areEqual(this.f, waVar.f) && Intrinsics.areEqual(this.g, waVar.g) && Intrinsics.areEqual(this.h, waVar.h) && Intrinsics.areEqual(this.i, waVar.i);
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        return ((((((((((((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode();
    }

    public String toString() {
        return "InLine(adSystem=" + this.a + ", adTitle=" + this.b + ", description=" + this.c + ", errors=" + this.d + ", impressions=" + this.e + ", creatives=" + this.f + ", extensions=" + this.g + ", adVerifications=" + this.h + ", viewableImpressions=" + this.i + ")";
    }

    public final List d() {
        return this.e;
    }

    public final List b() {
        return this.f;
    }

    public final List c() {
        return this.g;
    }

    public final List e() {
        return this.i;
    }

    public final List a() {
        return this.h;
    }
}
