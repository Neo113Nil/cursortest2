package com.chartboost.sdk.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class yl {
    public final String a;
    public final List b;
    public final List c;
    public final List d;
    public final List e;
    public final String f;
    public final List g;
    public final List h;

    public yl(String str, List errors, List impressions, List creatives, List extensions, String vastAdTagURI, List adVerifications, List viewableImpressions) {
        Intrinsics.checkNotNullParameter(errors, "errors");
        Intrinsics.checkNotNullParameter(impressions, "impressions");
        Intrinsics.checkNotNullParameter(creatives, "creatives");
        Intrinsics.checkNotNullParameter(extensions, "extensions");
        Intrinsics.checkNotNullParameter(vastAdTagURI, "vastAdTagURI");
        Intrinsics.checkNotNullParameter(adVerifications, "adVerifications");
        Intrinsics.checkNotNullParameter(viewableImpressions, "viewableImpressions");
        this.a = str;
        this.b = errors;
        this.c = impressions;
        this.d = creatives;
        this.e = extensions;
        this.f = vastAdTagURI;
        this.g = adVerifications;
        this.h = viewableImpressions;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yl)) {
            return false;
        }
        yl ylVar = (yl) obj;
        return Intrinsics.areEqual(this.a, ylVar.a) && Intrinsics.areEqual(this.b, ylVar.b) && Intrinsics.areEqual(this.c, ylVar.c) && Intrinsics.areEqual(this.d, ylVar.d) && Intrinsics.areEqual(this.e, ylVar.e) && Intrinsics.areEqual(this.f, ylVar.f) && Intrinsics.areEqual(this.g, ylVar.g) && Intrinsics.areEqual(this.h, ylVar.h);
    }

    public int hashCode() {
        String str = this.a;
        return ((((((((((((((str == null ? 0 : str.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode();
    }

    public String toString() {
        return "Wrapper(adSystem=" + this.a + ", errors=" + this.b + ", impressions=" + this.c + ", creatives=" + this.d + ", extensions=" + this.e + ", vastAdTagURI=" + this.f + ", adVerifications=" + this.g + ", viewableImpressions=" + this.h + ")";
    }

    public final List c() {
        return this.b;
    }

    public final List e() {
        return this.c;
    }

    public final List b() {
        return this.d;
    }

    public final List d() {
        return this.e;
    }

    public final String f() {
        return this.f;
    }

    public final List a() {
        return this.g;
    }

    public final List g() {
        return this.h;
    }
}
