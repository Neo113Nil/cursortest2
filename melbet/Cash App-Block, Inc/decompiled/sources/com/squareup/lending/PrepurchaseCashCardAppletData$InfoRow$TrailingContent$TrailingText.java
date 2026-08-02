package com.squareup.lending;

import app.cash.local.presenters.internal.CashBannerKt;
import com.squareup.protos.cash.localization.LocalizedString;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class PrepurchaseCashCardAppletData$InfoRow$TrailingContent$TrailingText extends CashBannerKt {
    public final LocalizedString value;

    public PrepurchaseCashCardAppletData$InfoRow$TrailingContent$TrailingText(LocalizedString localizedString) {
        localizedString.getClass();
        this.value = localizedString;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PrepurchaseCashCardAppletData$InfoRow$TrailingContent$TrailingText) && Intrinsics.areEqual(this.value, ((PrepurchaseCashCardAppletData$InfoRow$TrailingContent$TrailingText) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "TrailingText(value=" + this.value + ")";
    }
}
