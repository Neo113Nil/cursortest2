package com.squareup.protos.lending.sync_values;

import com.google.android.gms.internal.mlkit_vision_face.zzjl;
import com.squareup.protos.lending.sync_values.BorrowLimitHubData;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class BorrowLimitHubData$Section$Section$IncreaseLimitActionsSection extends zzjl {
    public final BorrowLimitHubData.IncreaseLimitActionsSection value;

    public BorrowLimitHubData$Section$Section$IncreaseLimitActionsSection(BorrowLimitHubData.IncreaseLimitActionsSection increaseLimitActionsSection) {
        increaseLimitActionsSection.getClass();
        this.value = increaseLimitActionsSection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BorrowLimitHubData$Section$Section$IncreaseLimitActionsSection) && Intrinsics.areEqual(this.value, ((BorrowLimitHubData$Section$Section$IncreaseLimitActionsSection) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "IncreaseLimitActionsSection(value=" + this.value + ")";
    }
}
