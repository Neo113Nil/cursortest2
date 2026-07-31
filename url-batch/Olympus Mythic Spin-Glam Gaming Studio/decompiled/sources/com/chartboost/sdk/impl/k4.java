package com.chartboost.sdk.impl;

import com.chartboost.sdk.Mediation;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class k4 extends j2 implements mc, r {
    public final String b;
    public final List c;
    public final s4 d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final Long j;
    public final Mediation k;

    public k4(String auctionId, List impressionIds, s4 clickType, String str, String str2, String str3, String str4, String str5, Long l, Mediation mediation) {
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(impressionIds, "impressionIds");
        Intrinsics.checkNotNullParameter(clickType, "clickType");
        this.b = auctionId;
        this.c = impressionIds;
        this.d = clickType;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = str5;
        this.j = l;
        this.k = mediation;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k4)) {
            return false;
        }
        k4 k4Var = (k4) obj;
        return Intrinsics.areEqual(this.b, k4Var.b) && Intrinsics.areEqual(this.c, k4Var.c) && this.d == k4Var.d && Intrinsics.areEqual(this.e, k4Var.e) && Intrinsics.areEqual(this.f, k4Var.f) && Intrinsics.areEqual(this.g, k4Var.g) && Intrinsics.areEqual(this.h, k4Var.h) && Intrinsics.areEqual(this.i, k4Var.i) && Intrinsics.areEqual(this.j, k4Var.j) && Intrinsics.areEqual(this.k, k4Var.k);
    }

    public int hashCode() {
        int hashCode = ((((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31;
        String str = this.e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.h;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.i;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Long l = this.j;
        int hashCode7 = (hashCode6 + (l == null ? 0 : l.hashCode())) * 31;
        Mediation mediation = this.k;
        return hashCode7 + (mediation != null ? mediation.hashCode() : 0);
    }

    public String toString() {
        return "ClickEventPayload(auctionId=" + this.b + ", impressionIds=" + this.c + ", clickType=" + this.d + ", clickUrl=" + this.e + ", errorString=" + this.f + ", errorCode=" + this.g + ", errorConstant=" + this.h + ", errorCauseDescription=" + this.i + ", latency=" + this.j + ", mediation=" + this.k + ")";
    }

    @Override // com.chartboost.sdk.impl.qh
    public String c() {
        return this.b;
    }

    @Override // com.chartboost.sdk.impl.r
    public List e() {
        return this.c;
    }

    @Override // com.chartboost.sdk.impl.mc
    public Mediation getMediation() {
        return this.k;
    }

    @Override // com.chartboost.sdk.impl.qh
    public Map d() {
        String l;
        Pair pair = TuplesKt.to("CB_CLICK_TYPE", this.d.b());
        Pair pair2 = TuplesKt.to("CB_CLICK_URL", this.e);
        Pair pair3 = TuplesKt.to("CB_ERROR", nc.a(this.f, this.i));
        String str = this.g;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        Pair pair4 = TuplesKt.to("CB_ERROR_CODE", str);
        String str3 = this.h;
        if (str3 == null) {
            str3 = "";
        }
        Pair pair5 = TuplesKt.to("CB_ERROR_CONSTANT", str3);
        Long l2 = this.j;
        if (l2 != null && (l = l2.toString()) != null) {
            str2 = l;
        }
        return MapsKt.plus(MapsKt.plus(MapsKt.mapOf(pair, pair2, pair3, pair4, pair5, TuplesKt.to("CB_LATENCY", str2)), nc.a(this)), s.a(this));
    }

    public /* synthetic */ k4(String str, List list, s4 s4Var, String str2, String str3, String str4, String str5, String str6, Long l, Mediation mediation, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, s4Var, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : l, mediation);
    }
}
