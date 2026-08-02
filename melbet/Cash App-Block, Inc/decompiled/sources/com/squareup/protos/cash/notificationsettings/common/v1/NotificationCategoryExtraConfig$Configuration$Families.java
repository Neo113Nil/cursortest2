package com.squareup.protos.cash.notificationsettings.common.v1;

import com.google.android.gms.internal.mlkit_vision_common.zzkb;
import com.squareup.protos.cash.notificationsettings.common.v1.NotificationCategoryExtraConfig;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class NotificationCategoryExtraConfig$Configuration$Families extends zzkb {
    public final NotificationCategoryExtraConfig.FamiliesConfiguration value;

    public NotificationCategoryExtraConfig$Configuration$Families(NotificationCategoryExtraConfig.FamiliesConfiguration familiesConfiguration) {
        familiesConfiguration.getClass();
        this.value = familiesConfiguration;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NotificationCategoryExtraConfig$Configuration$Families) && Intrinsics.areEqual(this.value, ((NotificationCategoryExtraConfig$Configuration$Families) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Families(value=" + this.value + ")";
    }
}
