package com.squareup.protos.lending.sync_values;

import com.google.android.gms.internal.mlkit_vision_face.zzjl;
import com.squareup.protos.lending.sync_values.BorrowLimitHubData;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class BorrowLimitHubData$Section$Section$ProgressSection extends zzjl {
    public final BorrowLimitHubData.LimitProgressSection value;

    public BorrowLimitHubData$Section$Section$ProgressSection(BorrowLimitHubData.LimitProgressSection limitProgressSection) {
        limitProgressSection.getClass();
        this.value = limitProgressSection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BorrowLimitHubData$Section$Section$ProgressSection) && Intrinsics.areEqual(this.value, ((BorrowLimitHubData$Section$Section$ProgressSection) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "ProgressSection(value=" + this.value + ")";
    }
}
