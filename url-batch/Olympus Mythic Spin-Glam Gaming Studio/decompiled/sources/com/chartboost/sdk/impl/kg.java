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
public final class kg extends j2 implements mc, r {
    public final String b;
    public final List c;
    public final boolean d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final Mediation i;

    public kg(String auctionId, List impressionIds, boolean z, String str, String str2, String str3, String str4, Mediation mediation) {
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(impressionIds, "impressionIds");
        this.b = auctionId;
        this.c = impressionIds;
        this.d = z;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = mediation;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kg)) {
            return false;
        }
        kg kgVar = (kg) obj;
        return Intrinsics.areEqual(this.b, kgVar.b) && Intrinsics.areEqual(this.c, kgVar.c) && this.d == kgVar.d && Intrinsics.areEqual(this.e, kgVar.e) && Intrinsics.areEqual(this.f, kgVar.f) && Intrinsics.areEqual(this.g, kgVar.g) && Intrinsics.areEqual(this.h, kgVar.h) && Intrinsics.areEqual(this.i, kgVar.i);
    }

    public int hashCode() {
        int hashCode = ((((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + Boolean.hashCode(this.d)) * 31;
        String str = this.e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.h;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Mediation mediation = this.i;
        return hashCode5 + (mediation != null ? mediation.hashCode() : 0);
    }

    public String toString() {
        return "RewardEventPayload(auctionId=" + this.b + ", impressionIds=" + this.c + ", rewardSkipped=" + this.d + ", errorString=" + this.e + ", errorCode=" + this.f + ", errorConstant=" + this.g + ", errorCauseDescription=" + this.h + ", mediation=" + this.i + ")";
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
        return this.i;
    }

    @Override // com.chartboost.sdk.impl.qh
    public Map d() {
        Pair pair = TuplesKt.to("CB_REWARD_SKIPPED", String.valueOf(this.d));
        Pair pair2 = TuplesKt.to("CB_ERROR", nc.a(this.e, this.h));
        String str = this.f;
        if (str == null) {
            str = "";
        }
        Pair pair3 = TuplesKt.to("CB_ERROR_CODE", str);
        String str2 = this.g;
        return MapsKt.plus(MapsKt.plus(MapsKt.mapOf(pair, pair2, pair3, TuplesKt.to("CB_ERROR_CONSTANT", str2 != null ? str2 : "")), nc.a(this)), s.a(this));
    }

    public /* synthetic */ kg(String str, List list, boolean z, String str2, String str3, String str4, String str5, Mediation mediation, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, z, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, mediation);
    }
}
