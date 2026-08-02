package com.squareup.protos.cash.grantly.api;

import coil3.util.IntPair;
import com.squareup.protos.cash.grantly.api.Action;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class Action$OAuth$Metadata$FinancialDataSharing$AuthorizedAccountTypes$AuthorizedAccountTypes$AllAccountTypes extends IntPair {
    public final Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes.AllAccountTypes value;

    public Action$OAuth$Metadata$FinancialDataSharing$AuthorizedAccountTypes$AuthorizedAccountTypes$AllAccountTypes(Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes.AllAccountTypes allAccountTypes) {
        allAccountTypes.getClass();
        this.value = allAccountTypes;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Action$OAuth$Metadata$FinancialDataSharing$AuthorizedAccountTypes$AuthorizedAccountTypes$AllAccountTypes) && Intrinsics.areEqual(this.value, ((Action$OAuth$Metadata$FinancialDataSharing$AuthorizedAccountTypes$AuthorizedAccountTypes$AllAccountTypes) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "AllAccountTypes(value=" + this.value + ")";
    }
}
