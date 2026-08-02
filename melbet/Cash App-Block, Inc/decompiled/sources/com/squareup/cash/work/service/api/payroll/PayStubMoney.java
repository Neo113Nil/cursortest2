package com.squareup.cash.work.service.api.payroll;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.appsflyer.AppsFlyerProperties;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\t\u0012\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/squareup/cash/work/service/api/payroll/PayStubMoney;", "", "", "amount", AppsFlyerProperties.CURRENCY_CODE, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/squareup/cash/work/service/api/payroll/PayStubMoney;", "Ljava/lang/String;", "getCurrencyCode", "()Ljava/lang/String;", "getCurrencyCode$annotations", "()V", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class PayStubMoney {
    public final String amount;
    public final String currencyCode;

    public PayStubMoney(String str, @Json(name = "currency_code") String str2) {
        str.getClass();
        str2.getClass();
        this.amount = str;
        this.currencyCode = str2;
    }

    @Json(name = "currency_code")
    public static /* synthetic */ void getCurrencyCode$annotations() {
    }

    public final PayStubMoney copy(String amount, @Json(name = "currency_code") String currencyCode) {
        amount.getClass();
        currencyCode.getClass();
        return new PayStubMoney(amount, currencyCode);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PayStubMoney)) {
            return false;
        }
        PayStubMoney payStubMoney = (PayStubMoney) obj;
        return Intrinsics.areEqual(this.amount, payStubMoney.amount) && Intrinsics.areEqual(this.currencyCode, payStubMoney.currencyCode);
    }

    public final int hashCode() {
        return this.currencyCode.hashCode() + (this.amount.hashCode() * 31);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("PayStubMoney(amount=", this.amount, ", currencyCode=", this.currencyCode, ")");
    }
}
