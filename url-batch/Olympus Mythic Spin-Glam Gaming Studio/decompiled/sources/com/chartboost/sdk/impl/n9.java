package com.chartboost.sdk.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class n9 {
    public final String a;
    public final Integer b;
    public final Integer c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final List l;
    public final List m;
    public final List n;
    public final p9 o;
    public final List p;

    public n9(String str, Integer num, Integer num2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List staticResources, List iFrameResources, List htmlResources, p9 p9Var, List iconViewTracking) {
        Intrinsics.checkNotNullParameter(staticResources, "staticResources");
        Intrinsics.checkNotNullParameter(iFrameResources, "iFrameResources");
        Intrinsics.checkNotNullParameter(htmlResources, "htmlResources");
        Intrinsics.checkNotNullParameter(iconViewTracking, "iconViewTracking");
        this.a = str;
        this.b = num;
        this.c = num2;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        this.k = str9;
        this.l = staticResources;
        this.m = iFrameResources;
        this.n = htmlResources;
        this.o = p9Var;
        this.p = iconViewTracking;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n9)) {
            return false;
        }
        n9 n9Var = (n9) obj;
        return Intrinsics.areEqual(this.a, n9Var.a) && Intrinsics.areEqual(this.b, n9Var.b) && Intrinsics.areEqual(this.c, n9Var.c) && Intrinsics.areEqual(this.d, n9Var.d) && Intrinsics.areEqual(this.e, n9Var.e) && Intrinsics.areEqual(this.f, n9Var.f) && Intrinsics.areEqual(this.g, n9Var.g) && Intrinsics.areEqual(this.h, n9Var.h) && Intrinsics.areEqual(this.i, n9Var.i) && Intrinsics.areEqual(this.j, n9Var.j) && Intrinsics.areEqual(this.k, n9Var.k) && Intrinsics.areEqual(this.l, n9Var.l) && Intrinsics.areEqual(this.m, n9Var.m) && Intrinsics.areEqual(this.n, n9Var.n) && Intrinsics.areEqual(this.o, n9Var.o) && Intrinsics.areEqual(this.p, n9Var.p);
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.g;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.h;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.i;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.j;
        int hashCode10 = (hashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.k;
        int hashCode11 = (((((((hashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31) + this.l.hashCode()) * 31) + this.m.hashCode()) * 31) + this.n.hashCode()) * 31;
        p9 p9Var = this.o;
        return ((hashCode11 + (p9Var != null ? p9Var.hashCode() : 0)) * 31) + this.p.hashCode();
    }

    public String toString() {
        return "Icon(program=" + this.a + ", width=" + this.b + ", height=" + this.c + ", xPosition=" + this.d + ", yPosition=" + this.e + ", duration=" + this.f + ", offset=" + this.g + ", apiFramework=" + this.h + ", pxratio=" + this.i + ", altText=" + this.j + ", hoverText=" + this.k + ", staticResources=" + this.l + ", iFrameResources=" + this.m + ", htmlResources=" + this.n + ", iconClicks=" + this.o + ", iconViewTracking=" + this.p + ")";
    }
}
