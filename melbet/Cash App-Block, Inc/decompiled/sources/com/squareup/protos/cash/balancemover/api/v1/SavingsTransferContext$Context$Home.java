package com.squareup.protos.cash.balancemover.api.v1;

import app.cash.local.primitives.DiscountCodeKt;
import com.squareup.protos.cash.balancemover.api.v1.SavingsTransferContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class SavingsTransferContext$Context$Home extends DiscountCodeKt {
    public final SavingsTransferContext.Home value;

    public SavingsTransferContext$Context$Home(SavingsTransferContext.Home home) {
        home.getClass();
        this.value = home;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SavingsTransferContext$Context$Home) && Intrinsics.areEqual(this.value, ((SavingsTransferContext$Context$Home) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Home(value=" + this.value + ")";
    }
}
