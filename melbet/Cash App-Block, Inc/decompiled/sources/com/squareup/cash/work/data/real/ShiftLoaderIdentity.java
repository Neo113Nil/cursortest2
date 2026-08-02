package com.squareup.cash.work.data.real;

import com.squareup.cash.work.identifiers.MerchantIdentifier;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ShiftLoaderIdentity {
    public final MerchantIdentifier merchantIdentifier;
    public final String teamMemberId;

    public ShiftLoaderIdentity(MerchantIdentifier merchantIdentifier, String str) {
        merchantIdentifier.getClass();
        str.getClass();
        this.merchantIdentifier = merchantIdentifier;
        this.teamMemberId = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShiftLoaderIdentity)) {
            return false;
        }
        ShiftLoaderIdentity shiftLoaderIdentity = (ShiftLoaderIdentity) obj;
        return Intrinsics.areEqual(this.merchantIdentifier, shiftLoaderIdentity.merchantIdentifier) && Intrinsics.areEqual(this.teamMemberId, shiftLoaderIdentity.teamMemberId);
    }

    public final int hashCode() {
        return this.teamMemberId.hashCode() + (this.merchantIdentifier.token.hashCode() * 31);
    }

    public final String toString() {
        return "ShiftLoaderIdentity(merchantIdentifier=" + this.merchantIdentifier + ", teamMemberId=" + this.teamMemberId + ")";
    }
}
