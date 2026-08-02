package com.squareup.protos.cash.grantly.api;

import coil3.util.FileSystemsKt;
import com.squareup.protos.cash.grantly.api.Action;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class Action$OAuth$Metadata$FinancialDataSharing$AuthorizedAccountTypes$AuthorizedAccount$Account$Svb extends FileSystemsKt {
    public final Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes.AuthorizedAccount.SvbAccount value;

    public Action$OAuth$Metadata$FinancialDataSharing$AuthorizedAccountTypes$AuthorizedAccount$Account$Svb(Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes.AuthorizedAccount.SvbAccount svbAccount) {
        svbAccount.getClass();
        this.value = svbAccount;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Action$OAuth$Metadata$FinancialDataSharing$AuthorizedAccountTypes$AuthorizedAccount$Account$Svb) && Intrinsics.areEqual(this.value, ((Action$OAuth$Metadata$FinancialDataSharing$AuthorizedAccountTypes$AuthorizedAccount$Account$Svb) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Svb(value=" + this.value + ")";
    }
}
