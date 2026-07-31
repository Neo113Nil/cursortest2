package com.chartboost.sdk.impl;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class q1 {
    public final int a;
    public final String b;
    public String c;
    public e0 d;
    public d0 e;
    public boolean f;
    public boolean g;

    public q1(int i, String location, String str, e0 e0Var, d0 d0Var, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(location, "location");
        this.a = i;
        this.b = location;
        this.c = str;
        this.d = e0Var;
        this.e = d0Var;
        this.f = z;
        this.g = z2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1)) {
            return false;
        }
        q1 q1Var = (q1) obj;
        return this.a == q1Var.a && Intrinsics.areEqual(this.b, q1Var.b) && Intrinsics.areEqual(this.c, q1Var.c) && Intrinsics.areEqual(this.d, q1Var.d) && Intrinsics.areEqual(this.e, q1Var.e) && this.f == q1Var.f && this.g == q1Var.g;
    }

    public int hashCode() {
        int hashCode = ((Integer.hashCode(this.a) * 31) + this.b.hashCode()) * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        e0 e0Var = this.d;
        int hashCode3 = (hashCode2 + (e0Var == null ? 0 : e0Var.hashCode())) * 31;
        d0 d0Var = this.e;
        return ((((hashCode3 + (d0Var != null ? d0Var.hashCode() : 0)) * 31) + Boolean.hashCode(this.f)) * 31) + Boolean.hashCode(this.g);
    }

    public String toString() {
        return "AppRequest(id=" + this.a + ", location=" + this.b + ", bidResponse=" + this.c + ", bannerData=" + this.d + ", adUnit=" + this.e + ", isTrackedCache=" + this.f + ", isTrackedShow=" + this.g + ")";
    }

    public final String d() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final e0 b() {
        return this.d;
    }

    public final d0 a() {
        return this.e;
    }

    public final boolean e() {
        return this.g;
    }

    public /* synthetic */ q1(int i, String str, String str2, e0 e0Var, d0 d0Var, boolean z, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, str2, (i2 & 8) != 0 ? null : e0Var, (i2 & 16) != 0 ? null : d0Var, (i2 & 32) != 0 ? false : z, (i2 & 64) != 0 ? false : z2);
    }

    public final void a(d0 d0Var) {
        this.e = d0Var;
    }

    public final void b(boolean z) {
        this.g = z;
    }

    public final void a(e0 e0Var) {
        this.d = e0Var;
    }

    public final void a(String str) {
        this.c = str;
    }

    public final void a(boolean z) {
        this.f = z;
    }
}
