package com.chartboost.sdk.impl;

import com.chartboost.sdk.Mediation;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class rb extends j2 implements mc, r {
    public final String b;
    public final List c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final Long h;
    public final String i;
    public final Mediation j;
    public final String k;

    public rb(String auctionId, List impressionIds, String str, String str2, String str3, String str4, Long l, String str5, Mediation mediation, String str6) {
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(impressionIds, "impressionIds");
        this.b = auctionId;
        this.c = impressionIds;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = l;
        this.i = str5;
        this.j = mediation;
        this.k = str6;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rb)) {
            return false;
        }
        rb rbVar = (rb) obj;
        return Intrinsics.areEqual(this.b, rbVar.b) && Intrinsics.areEqual(this.c, rbVar.c) && Intrinsics.areEqual(this.d, rbVar.d) && Intrinsics.areEqual(this.e, rbVar.e) && Intrinsics.areEqual(this.f, rbVar.f) && Intrinsics.areEqual(this.g, rbVar.g) && Intrinsics.areEqual(this.h, rbVar.h) && Intrinsics.areEqual(this.i, rbVar.i) && Intrinsics.areEqual(this.j, rbVar.j) && Intrinsics.areEqual(this.k, rbVar.k);
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
        Long l = this.h;
        int hashCode6 = (hashCode5 + (l == null ? 0 : l.hashCode())) * 31;
        String str5 = this.i;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Mediation mediation = this.j;
        int hashCode8 = (hashCode7 + (mediation == null ? 0 : mediation.hashCode())) * 31;
        String str6 = this.k;
        return hashCode8 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        return "LoadEventPayload(auctionId=" + this.b + ", impressionIds=" + this.c + ", errorString=" + this.d + ", errorCode=" + this.e + ", errorConstant=" + this.f + ", errorCauseDescription=" + this.g + ", duration=" + this.h + ", adm=" + this.i + ", mediation=" + this.j + ", logContext=" + this.k + ")";
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

    @Override // com.chartboost.sdk.impl.j2, com.chartboost.sdk.impl.qh
    public String a() {
        return this.k;
    }

    @Override // com.chartboost.sdk.impl.qh
    public Map d() {
        String str;
        Pair pair = TuplesKt.to("CB_ERROR", nc.a(this.d, this.g));
        String str2 = this.e;
        if (str2 == null) {
            str2 = "";
        }
        Pair pair2 = TuplesKt.to("CB_ERROR_CODE", str2);
        String str3 = this.f;
        if (str3 == null) {
            str3 = "";
        }
        Pair pair3 = TuplesKt.to("CB_ERROR_CONSTANT", str3);
        Long l = this.h;
        if (l == null || (str = l.toString()) == null) {
            str = "";
        }
        Pair pair4 = TuplesKt.to("CB_LATENCY", str);
        String str4 = this.i;
        return MapsKt.plus(MapsKt.plus(MapsKt.mapOf(pair, pair2, pair3, pair4, TuplesKt.to("CB_BASE64_ADM", str4 != null ? str4 : "")), nc.a(this)), s.a(this));
    }
}
