package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class lc {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public lc(String mediationName, String libraryVersion, String adapterVersion, String mediationType) {
        Intrinsics.checkNotNullParameter(mediationName, "mediationName");
        Intrinsics.checkNotNullParameter(libraryVersion, "libraryVersion");
        Intrinsics.checkNotNullParameter(adapterVersion, "adapterVersion");
        Intrinsics.checkNotNullParameter(mediationType, "mediationType");
        this.a = mediationName;
        this.b = libraryVersion;
        this.c = adapterVersion;
        this.d = mediationType;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lc)) {
            return false;
        }
        lc lcVar = (lc) obj;
        return Intrinsics.areEqual(this.a, lcVar.a) && Intrinsics.areEqual(this.b, lcVar.b) && Intrinsics.areEqual(this.c, lcVar.c) && Intrinsics.areEqual(this.d, lcVar.d);
    }

    public int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "MediationBodyFields(mediationName=" + this.a + ", libraryVersion=" + this.b + ", adapterVersion=" + this.c + ", mediationType=" + this.d + ")";
    }

    public final String c() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String a() {
        return this.c;
    }

    public final String d() {
        return this.d;
    }
}
