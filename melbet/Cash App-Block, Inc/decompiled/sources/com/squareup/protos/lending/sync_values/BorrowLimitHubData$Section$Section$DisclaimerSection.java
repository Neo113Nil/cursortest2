package com.squareup.protos.lending.sync_values;

import com.google.android.gms.internal.mlkit_vision_face.zzjl;
import com.squareup.protos.lending.sync_values.BorrowLimitHubData;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class BorrowLimitHubData$Section$Section$DisclaimerSection extends zzjl {
    public final BorrowLimitHubData.LimitDisclaimerSection value;

    public BorrowLimitHubData$Section$Section$DisclaimerSection(BorrowLimitHubData.LimitDisclaimerSection limitDisclaimerSection) {
        limitDisclaimerSection.getClass();
        this.value = limitDisclaimerSection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BorrowLimitHubData$Section$Section$DisclaimerSection) && Intrinsics.areEqual(this.value, ((BorrowLimitHubData$Section$Section$DisclaimerSection) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "DisclaimerSection(value=" + this.value + ")";
    }
}
