package com.squareup.lending;

import app.cash.local.presenters.internal.LocalMenuItemsKt;
import com.squareup.lending.PrepurchaseCashCardAppletData;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class PrepurchaseCashCardAppletData$SecondaryFooterButtonState$SecondaryFooterButtonContent extends LocalMenuItemsKt {
    public final PrepurchaseCashCardAppletData.FooterButtonContent value;

    public PrepurchaseCashCardAppletData$SecondaryFooterButtonState$SecondaryFooterButtonContent(PrepurchaseCashCardAppletData.FooterButtonContent footerButtonContent) {
        footerButtonContent.getClass();
        this.value = footerButtonContent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PrepurchaseCashCardAppletData$SecondaryFooterButtonState$SecondaryFooterButtonContent) && Intrinsics.areEqual(this.value, ((PrepurchaseCashCardAppletData$SecondaryFooterButtonState$SecondaryFooterButtonContent) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "SecondaryFooterButtonContent(value=" + this.value + ")";
    }
}
