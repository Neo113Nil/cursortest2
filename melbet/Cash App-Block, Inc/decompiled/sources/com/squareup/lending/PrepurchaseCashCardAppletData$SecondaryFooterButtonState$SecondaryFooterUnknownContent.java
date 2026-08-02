package com.squareup.lending;

import app.cash.local.presenters.internal.LocalMenuItemsKt;
import com.squareup.lending.PrepurchaseCashCardAppletData;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class PrepurchaseCashCardAppletData$SecondaryFooterButtonState$SecondaryFooterUnknownContent extends LocalMenuItemsKt {
    public final PrepurchaseCashCardAppletData.UnknownContent value;

    public PrepurchaseCashCardAppletData$SecondaryFooterButtonState$SecondaryFooterUnknownContent(PrepurchaseCashCardAppletData.UnknownContent unknownContent) {
        unknownContent.getClass();
        this.value = unknownContent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PrepurchaseCashCardAppletData$SecondaryFooterButtonState$SecondaryFooterUnknownContent) && Intrinsics.areEqual(this.value, ((PrepurchaseCashCardAppletData$SecondaryFooterButtonState$SecondaryFooterUnknownContent) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "SecondaryFooterUnknownContent(value=" + this.value + ")";
    }
}
