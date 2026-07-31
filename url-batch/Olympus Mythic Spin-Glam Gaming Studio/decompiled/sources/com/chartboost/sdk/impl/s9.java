package com.chartboost.sdk.impl;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class s9 {
    public final xi a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Integer f;
    public final String g;

    public s9(xi trackingState, String str, String str2, String str3, String str4, Integer num, String str5) {
        Intrinsics.checkNotNullParameter(trackingState, "trackingState");
        this.a = trackingState;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = num;
        this.g = str5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s9)) {
            return false;
        }
        s9 s9Var = (s9) obj;
        return this.a == s9Var.a && Intrinsics.areEqual(this.b, s9Var.b) && Intrinsics.areEqual(this.c, s9Var.c) && Intrinsics.areEqual(this.d, s9Var.d) && Intrinsics.areEqual(this.e, s9Var.e) && Intrinsics.areEqual(this.f, s9Var.f) && Intrinsics.areEqual(this.g, s9Var.g);
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.f;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        String str5 = this.g;
        return hashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        return "IdentityBodyFields(trackingState=" + this.a + ", identifiers=" + this.b + ", uuid=" + this.c + ", gaid=" + this.d + ", setId=" + this.e + ", setIdScope=" + this.f + ", instanceId=" + this.g + ")";
    }

    public final xi f() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String g() {
        return this.c;
    }

    public final String a() {
        return this.d;
    }

    public final String d() {
        return this.e;
    }

    public final Integer e() {
        return this.f;
    }

    public final String c() {
        return this.g;
    }

    public /* synthetic */ s9(xi xiVar, String str, String str2, String str3, String str4, Integer num, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? xi.c : xiVar, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : num, (i & 64) == 0 ? str5 : null);
    }
}
