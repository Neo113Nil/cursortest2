package com.chartboost.sdk.impl;

import com.chartboost.sdk.Mediation;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class oi extends j2 implements mc {
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final Mediation i;

    public oi(String str, String trackerUrl, String str2, String str3, String str4, String str5, String str6, Mediation mediation) {
        Intrinsics.checkNotNullParameter(trackerUrl, "trackerUrl");
        this.b = str;
        this.c = trackerUrl;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = mediation;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oi)) {
            return false;
        }
        oi oiVar = (oi) obj;
        return Intrinsics.areEqual(this.b, oiVar.b) && Intrinsics.areEqual(this.c, oiVar.c) && Intrinsics.areEqual(this.d, oiVar.d) && Intrinsics.areEqual(this.e, oiVar.e) && Intrinsics.areEqual(this.f, oiVar.f) && Intrinsics.areEqual(this.g, oiVar.g) && Intrinsics.areEqual(this.h, oiVar.h) && Intrinsics.areEqual(this.i, oiVar.i);
    }

    public int hashCode() {
        String str = this.b;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.c.hashCode()) * 31;
        String str2 = this.d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.g;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.h;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Mediation mediation = this.i;
        return hashCode6 + (mediation != null ? mediation.hashCode() : 0);
    }

    public String toString() {
        return "TrackingErrorPayload(auctionId=" + this.b + ", trackerUrl=" + this.c + ", errorString=" + this.d + ", errorCode=" + this.e + ", errorConstant=" + this.f + ", errorCauseDescription=" + this.g + ", originalEventTypeName=" + this.h + ", mediation=" + this.i + ")";
    }

    @Override // com.chartboost.sdk.impl.qh
    public String c() {
        return this.b;
    }

    @Override // com.chartboost.sdk.impl.mc
    public Mediation getMediation() {
        return this.i;
    }

    @Override // com.chartboost.sdk.impl.qh
    public Map d() {
        String c = c();
        if (c == null) {
            c = "";
        }
        Pair pair = TuplesKt.to("CB_AUCTION_ID", c);
        Pair pair2 = TuplesKt.to("CB_ERROR", nc.a(this.d, this.g));
        String str = this.e;
        if (str == null) {
            str = "";
        }
        Pair pair3 = TuplesKt.to("CB_ERROR_CODE", str);
        String str2 = this.f;
        if (str2 == null) {
            str2 = "";
        }
        Pair pair4 = TuplesKt.to("CB_ERROR_CONSTANT", str2);
        String str3 = this.h;
        return MapsKt.plus(MapsKt.mapOf(pair, pair2, pair3, pair4, TuplesKt.to("CB_EVENT_TYPE", str3 != null ? str3 : "")), nc.a(this));
    }

    public /* synthetic */ oi(String str, String str2, String str3, String str4, String str5, String str6, String str7, Mediation mediation, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : mediation);
    }
}
