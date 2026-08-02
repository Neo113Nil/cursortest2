package com.squareup.cash.work.tinygraph.models;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.appsflyer.AppsFlyerProperties;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@JsonClass(generateAdapter = true)
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J(\u0010\u0007\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\t\u0012\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\t\u0012\u0004\b\u000f\u0010\r\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/squareup/cash/work/tinygraph/models/MembershipWageMoney;", "", "", "amount", AppsFlyerProperties.CURRENCY_CODE, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/squareup/cash/work/tinygraph/models/MembershipWageMoney;", "Ljava/lang/String;", "getAmount", "()Ljava/lang/String;", "getAmount$annotations", "()V", "getCurrencyCode", "getCurrencyCode$annotations", "models"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class MembershipWageMoney {
    public final String amount;
    public final String currencyCode;

    public /* synthetic */ MembershipWageMoney(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }

    @Json(name = "amount")
    public static /* synthetic */ void getAmount$annotations() {
    }

    @Json(name = AppsFlyerProperties.CURRENCY_CODE)
    public static /* synthetic */ void getCurrencyCode$annotations() {
    }

    public final MembershipWageMoney copy(@Json(name = "amount") String amount, @Json(name = "currencyCode") String currencyCode) {
        return new MembershipWageMoney(amount, currencyCode);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MembershipWageMoney)) {
            return false;
        }
        MembershipWageMoney membershipWageMoney = (MembershipWageMoney) obj;
        return Intrinsics.areEqual(this.amount, membershipWageMoney.amount) && Intrinsics.areEqual(this.currencyCode, membershipWageMoney.currencyCode);
    }

    public final int hashCode() {
        String str = this.amount;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.currencyCode;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("MembershipWageMoney(amount=", this.amount, ", currencyCode=", this.currencyCode, ")");
    }

    public MembershipWageMoney(@Json(name = "amount") String str, @Json(name = "currencyCode") String str2) {
        this.amount = str;
        this.currencyCode = str2;
    }
}
