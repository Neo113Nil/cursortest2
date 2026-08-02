package com.squareup.protos.cash.grantly.api;

import coil3.util.FileSystemsKt;
import com.squareup.protos.cash.grantly.api.Action;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class Action$OAuth$Metadata$FinancialDataSharing$AuthorizedAccountTypes$AuthorizedAccount$Account$Savings extends FileSystemsKt {
    public final Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes.AuthorizedAccount.SavingsAccount value;

    public Action$OAuth$Metadata$FinancialDataSharing$AuthorizedAccountTypes$AuthorizedAccount$Account$Savings(Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes.AuthorizedAccount.SavingsAccount savingsAccount) {
        savingsAccount.getClass();
        this.value = savingsAccount;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Action$OAuth$Metadata$FinancialDataSharing$AuthorizedAccountTypes$AuthorizedAccount$Account$Savings) && Intrinsics.areEqual(this.value, ((Action$OAuth$Metadata$FinancialDataSharing$AuthorizedAccountTypes$AuthorizedAccount$Account$Savings) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Savings(value=" + this.value + ")";
    }
}
