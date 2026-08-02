package com.squareup.protos.cash.grantly.api;

import coil3.util.IntPair;
import com.squareup.protos.cash.grantly.api.Action;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class Action$OAuth$Metadata$FinancialDataSharing$AuthorizedAccountTypes$AuthorizedAccountTypes$LimitedAccountTypes extends IntPair {
    public final Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes.LimitedAccountTypes value;

    public Action$OAuth$Metadata$FinancialDataSharing$AuthorizedAccountTypes$AuthorizedAccountTypes$LimitedAccountTypes(Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes.LimitedAccountTypes limitedAccountTypes) {
        limitedAccountTypes.getClass();
        this.value = limitedAccountTypes;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Action$OAuth$Metadata$FinancialDataSharing$AuthorizedAccountTypes$AuthorizedAccountTypes$LimitedAccountTypes) && Intrinsics.areEqual(this.value, ((Action$OAuth$Metadata$FinancialDataSharing$AuthorizedAccountTypes$AuthorizedAccountTypes$LimitedAccountTypes) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "LimitedAccountTypes(value=" + this.value + ")";
    }
}
