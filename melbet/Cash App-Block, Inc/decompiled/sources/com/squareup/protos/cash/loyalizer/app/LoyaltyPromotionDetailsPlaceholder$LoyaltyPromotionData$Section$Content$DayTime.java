package com.squareup.protos.cash.loyalizer.app;

import com.google.android.gms.internal.mlkit_vision_common.zzjj;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class LoyaltyPromotionDetailsPlaceholder$LoyaltyPromotionData$Section$Content$DayTime extends zzjj {
    public final LoyaltyPromotionAvailability value;

    public LoyaltyPromotionDetailsPlaceholder$LoyaltyPromotionData$Section$Content$DayTime(LoyaltyPromotionAvailability loyaltyPromotionAvailability) {
        loyaltyPromotionAvailability.getClass();
        this.value = loyaltyPromotionAvailability;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LoyaltyPromotionDetailsPlaceholder$LoyaltyPromotionData$Section$Content$DayTime) && Intrinsics.areEqual(this.value, ((LoyaltyPromotionDetailsPlaceholder$LoyaltyPromotionData$Section$Content$DayTime) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "DayTime(value=" + this.value + ")";
    }
}
