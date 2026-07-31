package com.chartboost.sdk.impl;

import com.chartboost.sdk.internal.Model.CBError;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ub {
    public final q1 a;
    public final d0 b;
    public final CBError c;
    public final long d;
    public final long e;

    public ub(q1 appRequest, d0 d0Var, CBError cBError, long j, long j2) {
        Intrinsics.checkNotNullParameter(appRequest, "appRequest");
        this.a = appRequest;
        this.b = d0Var;
        this.c = cBError;
        this.d = j;
        this.e = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ub)) {
            return false;
        }
        ub ubVar = (ub) obj;
        return Intrinsics.areEqual(this.a, ubVar.a) && Intrinsics.areEqual(this.b, ubVar.b) && Intrinsics.areEqual(this.c, ubVar.c) && this.d == ubVar.d && this.e == ubVar.e;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        d0 d0Var = this.b;
        int hashCode2 = (hashCode + (d0Var == null ? 0 : d0Var.hashCode())) * 31;
        CBError cBError = this.c;
        return ((((hashCode2 + (cBError != null ? cBError.hashCode() : 0)) * 31) + Long.hashCode(this.d)) * 31) + Long.hashCode(this.e);
    }

    public String toString() {
        return "LoadResult(appRequest=" + this.a + ", adUnit=" + this.b + ", error=" + this.c + ", requestResponseCodeNs=" + this.d + ", readDataNs=" + this.e + ")";
    }

    public final d0 a() {
        return this.b;
    }

    public final CBError b() {
        return this.c;
    }

    public /* synthetic */ ub(q1 q1Var, d0 d0Var, CBError cBError, long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(q1Var, (i & 2) != 0 ? null : d0Var, (i & 4) == 0 ? cBError : null, (i & 8) != 0 ? 0L : j, (i & 16) == 0 ? j2 : 0L);
    }
}
