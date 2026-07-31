package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class pf {
    public final Integer a;
    public final Integer b;
    public final String c;
    public final yd d;

    public pf(Integer num, Integer num2, String str, yd openRTBConnectionType) {
        Intrinsics.checkNotNullParameter(openRTBConnectionType, "openRTBConnectionType");
        this.a = num;
        this.b = num2;
        this.c = str;
        this.d = openRTBConnectionType;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pf)) {
            return false;
        }
        pf pfVar = (pf) obj;
        return Intrinsics.areEqual(this.a, pfVar.a) && Intrinsics.areEqual(this.b, pfVar.b) && Intrinsics.areEqual(this.c, pfVar.c) && this.d == pfVar.d;
    }

    public int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.c;
        return ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "ReachabilityBodyFields(cellularConnectionType=" + this.a + ", connectionTypeFromActiveNetwork=" + this.b + ", detailedConnectionType=" + this.c + ", openRTBConnectionType=" + this.d + ")";
    }

    public final Integer a() {
        return this.a;
    }

    public final Integer b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final yd d() {
        return this.d;
    }
}
