package com.squareup.lending;

import app.cash.local.presenters.internal.CashBannerKt;
import com.squareup.lending.PrepurchaseCashCardAppletData;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class PrepurchaseCashCardAppletData$InfoRow$TrailingContent$PaymentPlanAction extends CashBannerKt {
    public final PrepurchaseCashCardAppletData.InfoRow.PaymentPlanAction value;

    public PrepurchaseCashCardAppletData$InfoRow$TrailingContent$PaymentPlanAction(PrepurchaseCashCardAppletData.InfoRow.PaymentPlanAction paymentPlanAction) {
        paymentPlanAction.getClass();
        this.value = paymentPlanAction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PrepurchaseCashCardAppletData$InfoRow$TrailingContent$PaymentPlanAction) && Intrinsics.areEqual(this.value, ((PrepurchaseCashCardAppletData$InfoRow$TrailingContent$PaymentPlanAction) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "PaymentPlanAction(value=" + this.value + ")";
    }
}
