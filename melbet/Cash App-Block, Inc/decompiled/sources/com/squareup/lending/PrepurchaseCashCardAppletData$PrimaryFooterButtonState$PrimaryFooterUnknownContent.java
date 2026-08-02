package com.squareup.lending;

import app.cash.local.presenters.internal.LocalBrandBannersKt;
import com.squareup.lending.PrepurchaseCashCardAppletData;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class PrepurchaseCashCardAppletData$PrimaryFooterButtonState$PrimaryFooterUnknownContent extends LocalBrandBannersKt {
    public final PrepurchaseCashCardAppletData.UnknownContent value;

    public PrepurchaseCashCardAppletData$PrimaryFooterButtonState$PrimaryFooterUnknownContent(PrepurchaseCashCardAppletData.UnknownContent unknownContent) {
        unknownContent.getClass();
        this.value = unknownContent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PrepurchaseCashCardAppletData$PrimaryFooterButtonState$PrimaryFooterUnknownContent) && Intrinsics.areEqual(this.value, ((PrepurchaseCashCardAppletData$PrimaryFooterButtonState$PrimaryFooterUnknownContent) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "PrimaryFooterUnknownContent(value=" + this.value + ")";
    }
}
