package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class tb {
    public final q1 a;
    public final boolean b;
    public final Integer c;
    public final Integer d;
    public final j0 e;

    public tb(q1 appRequest, boolean z, Integer num, Integer num2) {
        Intrinsics.checkNotNullParameter(appRequest, "appRequest");
        this.a = appRequest;
        this.b = z;
        this.c = num;
        this.d = num2;
        this.e = new j0();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tb)) {
            return false;
        }
        tb tbVar = (tb) obj;
        return Intrinsics.areEqual(this.a, tbVar.a) && this.b == tbVar.b && Intrinsics.areEqual(this.c, tbVar.c) && Intrinsics.areEqual(this.d, tbVar.d);
    }

    public int hashCode() {
        int hashCode = ((this.a.hashCode() * 31) + Boolean.hashCode(this.b)) * 31;
        Integer num = this.c;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        return "LoadParams(appRequest=" + this.a + ", isCacheRequest=" + this.b + ", bannerHeight=" + this.c + ", bannerWidth=" + this.d + ")";
    }

    public final q1 a() {
        return this.a;
    }

    public final boolean e() {
        return this.b;
    }

    public final Integer b() {
        return this.c;
    }

    public final Integer c() {
        return this.d;
    }

    public final j0 d() {
        return this.e;
    }
}
