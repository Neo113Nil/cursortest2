package com.squareup.protos.cash.balancemover.api.v1;

import app.cash.local.primitives.DiscountCodeKt;
import com.squareup.protos.cash.balancemover.api.v1.SavingsTransferContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class SavingsTransferContext$Context$GeneralFolder extends DiscountCodeKt {
    public final SavingsTransferContext.GeneralFolder value;

    public SavingsTransferContext$Context$GeneralFolder(SavingsTransferContext.GeneralFolder generalFolder) {
        generalFolder.getClass();
        this.value = generalFolder;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SavingsTransferContext$Context$GeneralFolder) && Intrinsics.areEqual(this.value, ((SavingsTransferContext$Context$GeneralFolder) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "GeneralFolder(value=" + this.value + ")";
    }
}
