package com.squareup.lending;

import app.cash.local.presenters.internal.CashBalanceKt;
import com.squareup.lending.PrepurchaseCashCardAppletData;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class PrepurchaseCashCardAppletData$FooterButtonContent$Action$Dismiss extends CashBalanceKt {
    public final PrepurchaseCashCardAppletData.FooterButtonContent.Dismiss value;

    public PrepurchaseCashCardAppletData$FooterButtonContent$Action$Dismiss(PrepurchaseCashCardAppletData.FooterButtonContent.Dismiss dismiss) {
        dismiss.getClass();
        this.value = dismiss;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PrepurchaseCashCardAppletData$FooterButtonContent$Action$Dismiss) && Intrinsics.areEqual(this.value, ((PrepurchaseCashCardAppletData$FooterButtonContent$Action$Dismiss) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Dismiss(value=" + this.value + ")";
    }
}
