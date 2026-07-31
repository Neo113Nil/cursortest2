package com.chartboost.sdk.impl;

import com.chartboost.sdk.Mediation;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class u4 extends j2 implements mc, r {
    public final String b;
    public final List c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final Mediation h;

    public u4(String auctionId, List impressionIds, String str, String str2, String str3, String str4, Mediation mediation) {
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(impressionIds, "impressionIds");
        this.b = auctionId;
        this.c = impressionIds;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = mediation;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u4)) {
            return false;
        }
        u4 u4Var = (u4) obj;
        return Intrinsics.areEqual(this.b, u4Var.b) && Intrinsics.areEqual(this.c, u4Var.c) && Intrinsics.areEqual(this.d, u4Var.d) && Intrinsics.areEqual(this.e, u4Var.e) && Intrinsics.areEqual(this.f, u4Var.f) && Intrinsics.areEqual(this.g, u4Var.g) && Intrinsics.areEqual(this.h, u4Var.h);
    }

    public int hashCode() {
        int hashCode = ((this.b.hashCode() * 31) + this.c.hashCode()) * 31;
        String str = this.d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Mediation mediation = this.h;
        return hashCode5 + (mediation != null ? mediation.hashCode() : 0);
    }

    public String toString() {
        return "CloseEventPayload(auctionId=" + this.b + ", impressionIds=" + this.c + ", errorString=" + this.d + ", errorCode=" + this.e + ", errorConstant=" + this.f + ", errorCauseDescription=" + this.g + ", mediation=" + this.h + ")";
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
        return this.h;
    }

    @Override // com.chartboost.sdk.impl.qh
    public Map d() {
        Pair pair = TuplesKt.to("CB_ERROR", nc.a(this.d, this.g));
        String str = this.e;
        if (str == null) {
            str = "";
        }
        Pair pair2 = TuplesKt.to("CB_ERROR_CODE", str);
        String str2 = this.f;
        return MapsKt.plus(MapsKt.plus(MapsKt.mapOf(pair, pair2, TuplesKt.to("CB_ERROR_CONSTANT", str2 != null ? str2 : "")), nc.a(this)), s.a(this));
    }

    public /* synthetic */ u4(String str, List list, String str2, String str3, String str4, String str5, Mediation mediation, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, mediation);
    }
}
