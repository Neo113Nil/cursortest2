package com.squareup.cash.work.service.api.payroll;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJD\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\b\b\u0003\u0010\u0007\u001a\u00020\u00062\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u000e\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u000e\u0012\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0013\u0010\u0010R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u000e\u0012\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0015\u0010\u0010R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\u0017\u0012\u0004\b\u001a\u0010\u0012\u001a\u0004\b\u0018\u0010\u0019R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010\u001b\u0012\u0004\b\u001e\u0010\u0012\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lcom/squareup/cash/work/service/api/payroll/PayStubAttributes;", "", "", "payDate", "periodStart", "periodEnd", "", "payoutPending", "Lcom/squareup/cash/work/service/api/payroll/PayStubMoney;", "netPay", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/squareup/cash/work/service/api/payroll/PayStubMoney;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/squareup/cash/work/service/api/payroll/PayStubMoney;)Lcom/squareup/cash/work/service/api/payroll/PayStubAttributes;", "Ljava/lang/String;", "getPayDate", "()Ljava/lang/String;", "getPayDate$annotations", "()V", "getPeriodStart", "getPeriodStart$annotations", "getPeriodEnd", "getPeriodEnd$annotations", "Z", "getPayoutPending", "()Z", "getPayoutPending$annotations", "Lcom/squareup/cash/work/service/api/payroll/PayStubMoney;", "getNetPay", "()Lcom/squareup/cash/work/service/api/payroll/PayStubMoney;", "getNetPay$annotations", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class PayStubAttributes {
    public final PayStubMoney netPay;
    public final String payDate;
    public final boolean payoutPending;
    public final String periodEnd;
    public final String periodStart;

    public PayStubAttributes(@Json(name = "pay_date") String str, @Json(name = "period_start") String str2, @Json(name = "period_end") String str3, @Json(name = "payout_pending") boolean z, @Json(name = "net_pay") PayStubMoney payStubMoney) {
        re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
        this.payDate = str;
        this.periodStart = str2;
        this.periodEnd = str3;
        this.payoutPending = z;
        this.netPay = payStubMoney;
    }

    @Json(name = "net_pay")
    public static /* synthetic */ void getNetPay$annotations() {
    }

    @Json(name = "pay_date")
    public static /* synthetic */ void getPayDate$annotations() {
    }

    @Json(name = "payout_pending")
    public static /* synthetic */ void getPayoutPending$annotations() {
    }

    @Json(name = "period_end")
    public static /* synthetic */ void getPeriodEnd$annotations() {
    }

    @Json(name = "period_start")
    public static /* synthetic */ void getPeriodStart$annotations() {
    }

    public final PayStubAttributes copy(@Json(name = "pay_date") String payDate, @Json(name = "period_start") String periodStart, @Json(name = "period_end") String periodEnd, @Json(name = "payout_pending") boolean payoutPending, @Json(name = "net_pay") PayStubMoney netPay) {
        payDate.getClass();
        periodStart.getClass();
        periodEnd.getClass();
        return new PayStubAttributes(payDate, periodStart, periodEnd, payoutPending, netPay);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PayStubAttributes)) {
            return false;
        }
        PayStubAttributes payStubAttributes = (PayStubAttributes) obj;
        return Intrinsics.areEqual(this.payDate, payStubAttributes.payDate) && Intrinsics.areEqual(this.periodStart, payStubAttributes.periodStart) && Intrinsics.areEqual(this.periodEnd, payStubAttributes.periodEnd) && this.payoutPending == payStubAttributes.payoutPending && Intrinsics.areEqual(this.netPay, payStubAttributes.netPay);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.payDate.hashCode() * 31, 31, this.periodStart), 31, this.periodEnd), 31, this.payoutPending);
        PayStubMoney payStubMoney = this.netPay;
        return m + (payStubMoney == null ? 0 : payStubMoney.hashCode());
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("PayStubAttributes(payDate=", this.payDate, ", periodStart=", this.periodStart, ", periodEnd=");
        NavAction$$ExternalSyntheticOutline0.m(m, this.periodEnd, ", payoutPending=", this.payoutPending, ", netPay=");
        m.append(this.netPay);
        m.append(")");
        return m.toString();
    }
}
