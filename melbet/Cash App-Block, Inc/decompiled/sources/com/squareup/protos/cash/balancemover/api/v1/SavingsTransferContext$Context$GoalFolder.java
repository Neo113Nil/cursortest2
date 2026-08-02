package com.squareup.protos.cash.balancemover.api.v1;

import app.cash.local.primitives.DiscountCodeKt;
import com.squareup.protos.cash.balancemover.api.v1.SavingsTransferContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class SavingsTransferContext$Context$GoalFolder extends DiscountCodeKt {
    public final SavingsTransferContext.GoalFolder value;

    public SavingsTransferContext$Context$GoalFolder(SavingsTransferContext.GoalFolder goalFolder) {
        goalFolder.getClass();
        this.value = goalFolder;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SavingsTransferContext$Context$GoalFolder) && Intrinsics.areEqual(this.value, ((SavingsTransferContext$Context$GoalFolder) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "GoalFolder(value=" + this.value + ")";
    }
}
