package com.squareup.lending;

import com.squareup.lending.PrepurchaseCashCardAppletData;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class PrepurchaseCashCardAppletData$InfoRow$LeadingTextAction$ShowInfoViewData {
    public final PrepurchaseCashCardAppletData.InfoViewData value;

    public PrepurchaseCashCardAppletData$InfoRow$LeadingTextAction$ShowInfoViewData(PrepurchaseCashCardAppletData.InfoViewData infoViewData) {
        infoViewData.getClass();
        this.value = infoViewData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PrepurchaseCashCardAppletData$InfoRow$LeadingTextAction$ShowInfoViewData) && Intrinsics.areEqual(this.value, ((PrepurchaseCashCardAppletData$InfoRow$LeadingTextAction$ShowInfoViewData) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "ShowInfoViewData(value=" + this.value + ")";
    }
}
