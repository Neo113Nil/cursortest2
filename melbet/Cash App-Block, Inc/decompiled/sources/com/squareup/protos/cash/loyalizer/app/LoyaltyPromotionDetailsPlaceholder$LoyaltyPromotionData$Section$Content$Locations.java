package com.squareup.protos.cash.loyalizer.app;

import com.google.android.gms.internal.mlkit_vision_common.zzjj;
import com.squareup.protos.cash.loyalizer.app.LoyaltyPromotionDetailsPlaceholder;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class LoyaltyPromotionDetailsPlaceholder$LoyaltyPromotionData$Section$Content$Locations extends zzjj {
    public final LoyaltyPromotionDetailsPlaceholder.LoyaltyPromotionData.LocationData value;

    public LoyaltyPromotionDetailsPlaceholder$LoyaltyPromotionData$Section$Content$Locations(LoyaltyPromotionDetailsPlaceholder.LoyaltyPromotionData.LocationData locationData) {
        locationData.getClass();
        this.value = locationData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LoyaltyPromotionDetailsPlaceholder$LoyaltyPromotionData$Section$Content$Locations) && Intrinsics.areEqual(this.value, ((LoyaltyPromotionDetailsPlaceholder$LoyaltyPromotionData$Section$Content$Locations) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Locations(value=" + this.value + ")";
    }
}
