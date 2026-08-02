package com.squareup.cash.transfers.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.tax.screens.TaxMenuSheet;
import com.squareup.cash.transfers.backend.api.TransfersWithdrawManager;
import com.squareup.protos.common.Money;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class TransferFee implements Parcelable {
    public static final Parcelable.Creator<TransferFee> CREATOR = new TaxMenuSheet.Creator(11);
    public final Money fee;
    public final TransfersWithdrawManager.FeeData.FeeStepTier feeTier;

    public TransferFee(Money money, TransfersWithdrawManager.FeeData.FeeStepTier feeStepTier) {
        money.getClass();
        this.fee = money;
        this.feeTier = feeStepTier;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransferFee)) {
            return false;
        }
        TransferFee transferFee = (TransferFee) obj;
        return Intrinsics.areEqual(this.fee, transferFee.fee) && Intrinsics.areEqual(this.feeTier, transferFee.feeTier);
    }

    public final int hashCode() {
        int hashCode = this.fee.hashCode() * 31;
        TransfersWithdrawManager.FeeData.FeeStepTier feeStepTier = this.feeTier;
        return hashCode + (feeStepTier == null ? 0 : feeStepTier.hashCode());
    }

    public final String toString() {
        return "TransferFee(fee=" + this.fee + ", feeTier=" + this.feeTier + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.fee, i);
        parcel.writeParcelable(this.feeTier, i);
    }
}
