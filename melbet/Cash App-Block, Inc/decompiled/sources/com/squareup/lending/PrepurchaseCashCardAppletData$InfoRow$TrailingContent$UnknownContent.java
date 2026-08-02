package com.squareup.lending;

import app.cash.local.presenters.internal.CashBannerKt;
import com.squareup.lending.PrepurchaseCashCardAppletData;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class PrepurchaseCashCardAppletData$InfoRow$TrailingContent$UnknownContent extends CashBannerKt {
    public final PrepurchaseCashCardAppletData.UnknownContent value;

    public PrepurchaseCashCardAppletData$InfoRow$TrailingContent$UnknownContent(PrepurchaseCashCardAppletData.UnknownContent unknownContent) {
        unknownContent.getClass();
        this.value = unknownContent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PrepurchaseCashCardAppletData$InfoRow$TrailingContent$UnknownContent) && Intrinsics.areEqual(this.value, ((PrepurchaseCashCardAppletData$InfoRow$TrailingContent$UnknownContent) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "UnknownContent(value=" + this.value + ")";
    }
}
