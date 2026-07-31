package com.chartboost.sdk.impl;

import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class eb extends j2 {
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eb)) {
            return false;
        }
        eb ebVar = (eb) obj;
        return Intrinsics.areEqual(this.b, ebVar.b) && Intrinsics.areEqual(this.c, ebVar.c) && Intrinsics.areEqual(this.d, ebVar.d) && Intrinsics.areEqual(this.e, ebVar.e) && Intrinsics.areEqual(this.f, ebVar.f) && Intrinsics.areEqual(this.g, ebVar.g);
    }

    public int hashCode() {
        String str = this.b;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.c;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.g;
        return hashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        return "InitializationEventPayload(auctionId=" + this.b + ", errorString=" + this.c + ", errorCode=" + this.d + ", errorConstant=" + this.e + ", errorCauseDescription=" + this.f + ", logContext=" + this.g + ")";
    }

    @Override // com.chartboost.sdk.impl.qh
    public String c() {
        return this.b;
    }

    @Override // com.chartboost.sdk.impl.j2, com.chartboost.sdk.impl.qh
    public String a() {
        return this.g;
    }

    public eb(String str, String str2, String str3, String str4, String str5, String str6) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
    }

    @Override // com.chartboost.sdk.impl.qh
    public Map d() {
        String c = c();
        if (c == null) {
            c = "";
        }
        Pair pair = TuplesKt.to("CB_AUCTION_ID", c);
        Pair pair2 = TuplesKt.to("CB_ERROR", nc.a(this.c, this.f));
        String str = this.d;
        if (str == null) {
            str = "";
        }
        Pair pair3 = TuplesKt.to("CB_ERROR_CODE", str);
        String str2 = this.e;
        return MapsKt.mapOf(pair, pair2, pair3, TuplesKt.to("CB_ERROR_CONSTANT", str2 != null ? str2 : ""));
    }

    public /* synthetic */ eb(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6);
    }
}
