package com.chartboost.sdk.impl;

import com.chartboost.sdk.Mediation;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class f7 extends j2 implements mc, r {
    public final String b;
    public final List c;
    public final g7 d;
    public final v5 e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final Mediation j;

    public f7(String auctionId, List impressionIds, g7 engagementType, v5 v5Var, String str, String str2, String str3, String str4, Mediation mediation) {
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(impressionIds, "impressionIds");
        Intrinsics.checkNotNullParameter(engagementType, "engagementType");
        this.b = auctionId;
        this.c = impressionIds;
        this.d = engagementType;
        this.e = v5Var;
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.i = str4;
        this.j = mediation;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f7)) {
            return false;
        }
        f7 f7Var = (f7) obj;
        return Intrinsics.areEqual(this.b, f7Var.b) && Intrinsics.areEqual(this.c, f7Var.c) && this.d == f7Var.d && this.e == f7Var.e && Intrinsics.areEqual(this.f, f7Var.f) && Intrinsics.areEqual(this.g, f7Var.g) && Intrinsics.areEqual(this.h, f7Var.h) && Intrinsics.areEqual(this.i, f7Var.i) && Intrinsics.areEqual(this.j, f7Var.j);
    }

    public int hashCode() {
        int hashCode = ((((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31;
        v5 v5Var = this.e;
        int hashCode2 = (hashCode + (v5Var == null ? 0 : v5Var.hashCode())) * 31;
        String str = this.f;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.h;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.i;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Mediation mediation = this.j;
        return hashCode6 + (mediation != null ? mediation.hashCode() : 0);
    }

    public String toString() {
        return "EngagementEventPayload(auctionId=" + this.b + ", impressionIds=" + this.c + ", engagementType=" + this.d + ", ctaType=" + this.e + ", errorString=" + this.f + ", errorCode=" + this.g + ", errorConstant=" + this.h + ", errorCauseDescription=" + this.i + ", mediation=" + this.j + ")";
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
        return this.j;
    }

    @Override // com.chartboost.sdk.impl.qh
    public Map d() {
        Pair pair = TuplesKt.to("CB_ENGAGEMENT_TYPE", this.d.b());
        v5 v5Var = this.e;
        Pair pair2 = TuplesKt.to("CB_CTA_TYPE", v5Var != null ? v5Var.b() : null);
        Pair pair3 = TuplesKt.to("CB_ERROR", nc.a(this.f, this.i));
        String str = this.g;
        if (str == null) {
            str = "";
        }
        Pair pair4 = TuplesKt.to("CB_ERROR_CODE", str);
        String str2 = this.h;
        return MapsKt.plus(MapsKt.plus(MapsKt.mapOf(pair, pair2, pair3, pair4, TuplesKt.to("CB_ERROR_CONSTANT", str2 != null ? str2 : "")), nc.a(this)), s.a(this));
    }

    public /* synthetic */ f7(String str, List list, g7 g7Var, v5 v5Var, String str2, String str3, String str4, String str5, Mediation mediation, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, g7Var, (i & 8) != 0 ? null : v5Var, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : str5, mediation);
    }
}
