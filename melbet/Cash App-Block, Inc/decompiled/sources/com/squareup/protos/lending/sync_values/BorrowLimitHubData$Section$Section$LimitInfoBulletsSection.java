package com.squareup.protos.lending.sync_values;

import com.google.android.gms.internal.mlkit_vision_face.zzjl;
import com.squareup.protos.lending.sync_values.BorrowLimitHubData;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class BorrowLimitHubData$Section$Section$LimitInfoBulletsSection extends zzjl {
    public final BorrowLimitHubData.LimitInfoBulletsSection value;

    public BorrowLimitHubData$Section$Section$LimitInfoBulletsSection(BorrowLimitHubData.LimitInfoBulletsSection limitInfoBulletsSection) {
        limitInfoBulletsSection.getClass();
        this.value = limitInfoBulletsSection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BorrowLimitHubData$Section$Section$LimitInfoBulletsSection) && Intrinsics.areEqual(this.value, ((BorrowLimitHubData$Section$Section$LimitInfoBulletsSection) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "LimitInfoBulletsSection(value=" + this.value + ")";
    }
}
