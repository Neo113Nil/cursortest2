package com.squareup.protos.cash.local.client.v1;

import com.datadog.android.core.internal.utils.MiscUtilsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class CreateLoyaltyAccountResponse$Response$LoyaltyAccount extends MiscUtilsKt {
    public final LocalLoyaltyAccount value;

    public CreateLoyaltyAccountResponse$Response$LoyaltyAccount(LocalLoyaltyAccount localLoyaltyAccount) {
        localLoyaltyAccount.getClass();
        this.value = localLoyaltyAccount;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CreateLoyaltyAccountResponse$Response$LoyaltyAccount) && Intrinsics.areEqual(this.value, ((CreateLoyaltyAccountResponse$Response$LoyaltyAccount) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "LoyaltyAccount(value=" + this.value + ")";
    }
}
