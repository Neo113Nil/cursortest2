package com.squareup.lending;

import app.cash.local.presenters.internal.LocalBrandBannersKt;
import com.squareup.lending.PrepurchaseCashCardAppletData;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class PrepurchaseCashCardAppletData$PrimaryFooterButtonState$PrimaryFooterButtonContent extends LocalBrandBannersKt {
    public final PrepurchaseCashCardAppletData.FooterButtonContent value;

    public PrepurchaseCashCardAppletData$PrimaryFooterButtonState$PrimaryFooterButtonContent(PrepurchaseCashCardAppletData.FooterButtonContent footerButtonContent) {
        footerButtonContent.getClass();
        this.value = footerButtonContent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PrepurchaseCashCardAppletData$PrimaryFooterButtonState$PrimaryFooterButtonContent) && Intrinsics.areEqual(this.value, ((PrepurchaseCashCardAppletData$PrimaryFooterButtonState$PrimaryFooterButtonContent) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "PrimaryFooterButtonContent(value=" + this.value + ")";
    }
}
