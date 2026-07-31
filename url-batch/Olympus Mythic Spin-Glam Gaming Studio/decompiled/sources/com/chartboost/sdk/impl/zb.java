package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class zb {
    public final long a;
    public final int b;
    public final Integer c;
    public final Integer d;
    public final Integer e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final Long m;

    public zb(long j, int i, Integer num, Integer num2, Integer num3, String appBundle, String omidPartner, String str, String str2, String str3, String str4, String str5, Long l) {
        Intrinsics.checkNotNullParameter(appBundle, "appBundle");
        Intrinsics.checkNotNullParameter(omidPartner, "omidPartner");
        this.a = j;
        this.b = i;
        this.c = num;
        this.d = num2;
        this.e = num3;
        this.f = appBundle;
        this.g = omidPartner;
        this.h = str;
        this.i = str2;
        this.j = str3;
        this.k = str4;
        this.l = str5;
        this.m = l;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zb)) {
            return false;
        }
        zb zbVar = (zb) obj;
        return this.a == zbVar.a && this.b == zbVar.b && Intrinsics.areEqual(this.c, zbVar.c) && Intrinsics.areEqual(this.d, zbVar.d) && Intrinsics.areEqual(this.e, zbVar.e) && Intrinsics.areEqual(this.f, zbVar.f) && Intrinsics.areEqual(this.g, zbVar.g) && Intrinsics.areEqual(this.h, zbVar.h) && Intrinsics.areEqual(this.i, zbVar.i) && Intrinsics.areEqual(this.j, zbVar.j) && Intrinsics.areEqual(this.k, zbVar.k) && Intrinsics.areEqual(this.l, zbVar.l) && Intrinsics.areEqual(this.m, zbVar.m);
    }

    public int hashCode() {
        int hashCode = ((Long.hashCode(this.a) * 31) + Integer.hashCode(this.b)) * 31;
        Integer num = this.c;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.e;
        int hashCode4 = (((((hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31;
        String str = this.h;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.i;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.j;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.k;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.l;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Long l = this.m;
        return hashCode9 + (l != null ? l.hashCode() : 0);
    }

    public String toString() {
        return "MacroContext(currentTimeMs=" + this.a + ", cacheBusting=" + this.b + ", errorCode=" + this.c + ", reasonCode=" + this.d + ", limitAdTracking=" + this.e + ", appBundle=" + this.f + ", omidPartner=" + this.g + ", inventoryState=" + this.h + ", clickPos=" + this.i + ", clickType=" + this.j + ", playerSize=" + this.k + ", assetUri=" + this.l + ", playheadMs=" + this.m + ")";
    }

    public final long f() {
        return this.a;
    }

    public final int c() {
        return this.b;
    }

    public final Integer g() {
        return this.c;
    }

    public final Integer m() {
        return this.d;
    }

    public final Integer i() {
        return this.e;
    }

    public final String a() {
        return this.f;
    }

    public final String j() {
        return this.g;
    }

    public final String h() {
        return this.h;
    }

    public final String d() {
        return this.i;
    }

    public final String e() {
        return this.j;
    }

    public final String k() {
        return this.k;
    }

    public final String b() {
        return this.l;
    }

    public final Long l() {
        return this.m;
    }
}
