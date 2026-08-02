package com.squareup.protos.cash.notificationsettings.common.v1;

import com.google.android.gms.internal.mlkit_vision_common.zzkb;
import com.squareup.protos.cash.notificationsettings.common.v1.NotificationCategoryExtraConfig;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class NotificationCategoryExtraConfig$Configuration$BitcoinPriceMovement extends zzkb {
    public final NotificationCategoryExtraConfig.PriceMovementConfiguration value;

    public NotificationCategoryExtraConfig$Configuration$BitcoinPriceMovement(NotificationCategoryExtraConfig.PriceMovementConfiguration priceMovementConfiguration) {
        priceMovementConfiguration.getClass();
        this.value = priceMovementConfiguration;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NotificationCategoryExtraConfig$Configuration$BitcoinPriceMovement) && Intrinsics.areEqual(this.value, ((NotificationCategoryExtraConfig$Configuration$BitcoinPriceMovement) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "BitcoinPriceMovement(value=" + this.value + ")";
    }
}
