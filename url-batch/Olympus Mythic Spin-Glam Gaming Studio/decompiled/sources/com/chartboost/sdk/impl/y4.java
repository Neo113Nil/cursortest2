package com.chartboost.sdk.impl;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class y4 {
    public final String a;
    public final Integer b;
    public final Integer c;
    public final Integer d;
    public final Integer e;
    public final Integer f;
    public final Integer g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final List m;
    public final List n;
    public final List o;
    public final List p;
    public final String q;
    public final List r;
    public final ak s;

    public y4(String str, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, String str2, String str3, String str4, String str5, String str6, List staticResources, List iFrameResources, List htmlResources, List trackingEvents, String str7, List companionClickTracking, ak akVar) {
        Intrinsics.checkNotNullParameter(staticResources, "staticResources");
        Intrinsics.checkNotNullParameter(iFrameResources, "iFrameResources");
        Intrinsics.checkNotNullParameter(htmlResources, "htmlResources");
        Intrinsics.checkNotNullParameter(trackingEvents, "trackingEvents");
        Intrinsics.checkNotNullParameter(companionClickTracking, "companionClickTracking");
        this.a = str;
        this.b = num;
        this.c = num2;
        this.d = num3;
        this.e = num4;
        this.f = num5;
        this.g = num6;
        this.h = str2;
        this.i = str3;
        this.j = str4;
        this.k = str5;
        this.l = str6;
        this.m = staticResources;
        this.n = iFrameResources;
        this.o = htmlResources;
        this.p = trackingEvents;
        this.q = str7;
        this.r = companionClickTracking;
        this.s = akVar;
    }

    public final y4 a(String str, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, String str2, String str3, String str4, String str5, String str6, List staticResources, List iFrameResources, List htmlResources, List trackingEvents, String str7, List companionClickTracking, ak akVar) {
        Intrinsics.checkNotNullParameter(staticResources, "staticResources");
        Intrinsics.checkNotNullParameter(iFrameResources, "iFrameResources");
        Intrinsics.checkNotNullParameter(htmlResources, "htmlResources");
        Intrinsics.checkNotNullParameter(trackingEvents, "trackingEvents");
        Intrinsics.checkNotNullParameter(companionClickTracking, "companionClickTracking");
        return new y4(str, num, num2, num3, num4, num5, num6, str2, str3, str4, str5, str6, staticResources, iFrameResources, htmlResources, trackingEvents, str7, companionClickTracking, akVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y4)) {
            return false;
        }
        y4 y4Var = (y4) obj;
        return Intrinsics.areEqual(this.a, y4Var.a) && Intrinsics.areEqual(this.b, y4Var.b) && Intrinsics.areEqual(this.c, y4Var.c) && Intrinsics.areEqual(this.d, y4Var.d) && Intrinsics.areEqual(this.e, y4Var.e) && Intrinsics.areEqual(this.f, y4Var.f) && Intrinsics.areEqual(this.g, y4Var.g) && Intrinsics.areEqual(this.h, y4Var.h) && Intrinsics.areEqual(this.i, y4Var.i) && Intrinsics.areEqual(this.j, y4Var.j) && Intrinsics.areEqual(this.k, y4Var.k) && Intrinsics.areEqual(this.l, y4Var.l) && Intrinsics.areEqual(this.m, y4Var.m) && Intrinsics.areEqual(this.n, y4Var.n) && Intrinsics.areEqual(this.o, y4Var.o) && Intrinsics.areEqual(this.p, y4Var.p) && Intrinsics.areEqual(this.q, y4Var.q) && Intrinsics.areEqual(this.r, y4Var.r) && Intrinsics.areEqual(this.s, y4Var.s);
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.d;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.e;
        int hashCode5 = (hashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.f;
        int hashCode6 = (hashCode5 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.g;
        int hashCode7 = (hashCode6 + (num6 == null ? 0 : num6.hashCode())) * 31;
        String str2 = this.h;
        int hashCode8 = (hashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.i;
        int hashCode9 = (hashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.j;
        int hashCode10 = (hashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.k;
        int hashCode11 = (hashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.l;
        int hashCode12 = (((((((((hashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31) + this.m.hashCode()) * 31) + this.n.hashCode()) * 31) + this.o.hashCode()) * 31) + this.p.hashCode()) * 31;
        String str7 = this.q;
        int hashCode13 = (((hashCode12 + (str7 == null ? 0 : str7.hashCode())) * 31) + this.r.hashCode()) * 31;
        ak akVar = this.s;
        return hashCode13 + (akVar != null ? akVar.hashCode() : 0);
    }

    public String toString() {
        return "CompanionAd(id=" + this.a + ", width=" + this.b + ", height=" + this.c + ", assetWidth=" + this.d + ", assetHeight=" + this.e + ", expandedWidth=" + this.f + ", expandedHeight=" + this.g + ", apiFramework=" + this.h + ", adSlotID=" + this.i + ", pxratio=" + this.j + ", altText=" + this.k + ", adParameters=" + this.l + ", staticResources=" + this.m + ", iFrameResources=" + this.n + ", htmlResources=" + this.o + ", trackingEvents=" + this.p + ", companionClickThrough=" + this.q + ", companionClickTracking=" + this.r + ", bestResource=" + this.s + ")";
    }

    public final String g() {
        return this.a;
    }

    public final Integer j() {
        return this.b;
    }

    public final Integer d() {
        return this.c;
    }

    public final List h() {
        return this.m;
    }

    public final List f() {
        return this.n;
    }

    public final List e() {
        return this.o;
    }

    public final List i() {
        return this.p;
    }

    public final String b() {
        return this.q;
    }

    public final List c() {
        return this.r;
    }

    public final ak a() {
        return this.s;
    }

    public /* synthetic */ y4(String str, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, String str2, String str3, String str4, String str5, String str6, List list, List list2, List list3, List list4, String str7, List list5, ak akVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, num, num2, (i & 8) != 0 ? null : num3, (i & 16) != 0 ? null : num4, (i & 32) != 0 ? null : num5, (i & 64) != 0 ? null : num6, (i & 128) != 0 ? null : str2, (i & 256) != 0 ? null : str3, (i & 512) != 0 ? null : str4, (i & 1024) != 0 ? null : str5, (i & 2048) != 0 ? null : str6, list, list2, list3, list4, str7, (131072 & i) != 0 ? CollectionsKt.emptyList() : list5, (i & 262144) != 0 ? null : akVar);
    }
}
