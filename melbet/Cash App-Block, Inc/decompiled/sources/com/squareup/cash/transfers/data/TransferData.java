package com.squareup.cash.transfers.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.squareup.cash.tax.screens.TaxMenuSheet;
import com.squareup.cash.transfers.backend.api.TransfersWithdrawManager;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.DepositPreference;
import com.squareup.protos.franklin.api.Instrument;
import com.squareup.protos.franklin.common.ConfirmationSheetData;
import com.squareup.protos.franklin.common.DepositPreferenceData;
import com.squareup.protos.franklin.common.SignalsContext;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class TransferData implements Parcelable {
    public static final Parcelable.Creator<TransferData> CREATOR = new TaxMenuSheet.Creator(10);
    public final TransferFee acceptedFee;
    public final Money amount;
    public final Instrument balance;
    public final boolean confirmPendingTransfers;
    public final ConfirmationSheetData confirmationSheetData;
    public final DepositPreference depositPreference;
    public final DepositPreferenceData depositPreferenceData;
    public final TransfersWithdrawManager.FeeData feeData;
    public final boolean grandfathered;
    public final Money maxAmountAllowed;
    public final Boolean showConfirmationDialog;
    public final SignalsContext signalsContext;
    public final TransferSource source;
    public final Instrument transferInstrument;

    /* renamed from: type, reason: collision with root package name */
    public final TransferType f1215type;

    public /* synthetic */ TransferData(Money money, Money money2, Instrument instrument, TransferType transferType, DepositPreferenceData depositPreferenceData, TransfersWithdrawManager.FeeData feeData, boolean z, boolean z2, int i) {
        this((i & 1) != 0 ? null : money, (i & 2) != 0 ? null : money2, instrument, transferType, null, (i & 32) != 0 ? null : depositPreferenceData, (i & 64) != 0 ? null : feeData, null, z, null, null, null, (i & 4096) != 0 ? false : z2, null, null);
    }

    public static TransferData copy$default(TransferData transferData, Money money, DepositPreference depositPreference, TransferFee transferFee, SignalsContext signalsContext, ConfirmationSheetData confirmationSheetData, Boolean bool, TransferSource transferSource, Instrument instrument, int i) {
        Money money2 = (i & 1) != 0 ? transferData.amount : money;
        Money money3 = transferData.maxAmountAllowed;
        Instrument instrument2 = transferData.balance;
        TransferType transferType = transferData.f1215type;
        DepositPreference depositPreference2 = (i & 16) != 0 ? transferData.depositPreference : depositPreference;
        DepositPreferenceData depositPreferenceData = transferData.depositPreferenceData;
        TransfersWithdrawManager.FeeData feeData = transferData.feeData;
        TransferFee transferFee2 = (i & 128) != 0 ? transferData.acceptedFee : transferFee;
        boolean z = transferData.grandfathered;
        SignalsContext signalsContext2 = (i & 512) != 0 ? transferData.signalsContext : signalsContext;
        ConfirmationSheetData confirmationSheetData2 = (i & 1024) != 0 ? transferData.confirmationSheetData : confirmationSheetData;
        Boolean bool2 = (i & 2048) != 0 ? transferData.showConfirmationDialog : bool;
        boolean z2 = (i & 4096) != 0 ? transferData.confirmPendingTransfers : false;
        TransferSource transferSource2 = (i & PKIFailureInfo.certRevoked) != 0 ? transferData.source : transferSource;
        Instrument instrument3 = (i & 16384) != 0 ? transferData.transferInstrument : instrument;
        transferData.getClass();
        instrument2.getClass();
        transferType.getClass();
        return new TransferData(money2, money3, instrument2, transferType, depositPreference2, depositPreferenceData, feeData, transferFee2, z, signalsContext2, confirmationSheetData2, bool2, z2, transferSource2, instrument3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransferData)) {
            return false;
        }
        TransferData transferData = (TransferData) obj;
        return Intrinsics.areEqual(this.amount, transferData.amount) && Intrinsics.areEqual(this.maxAmountAllowed, transferData.maxAmountAllowed) && Intrinsics.areEqual(this.balance, transferData.balance) && this.f1215type == transferData.f1215type && this.depositPreference == transferData.depositPreference && Intrinsics.areEqual(this.depositPreferenceData, transferData.depositPreferenceData) && Intrinsics.areEqual(this.feeData, transferData.feeData) && Intrinsics.areEqual(this.acceptedFee, transferData.acceptedFee) && this.grandfathered == transferData.grandfathered && Intrinsics.areEqual(this.signalsContext, transferData.signalsContext) && Intrinsics.areEqual(this.confirmationSheetData, transferData.confirmationSheetData) && Intrinsics.areEqual(this.showConfirmationDialog, transferData.showConfirmationDialog) && this.confirmPendingTransfers == transferData.confirmPendingTransfers && this.source == transferData.source && Intrinsics.areEqual(this.transferInstrument, transferData.transferInstrument);
    }

    public final int hashCode() {
        Money money = this.amount;
        int hashCode = (money == null ? 0 : money.hashCode()) * 31;
        Money money2 = this.maxAmountAllowed;
        int hashCode2 = (this.f1215type.hashCode() + ((this.balance.hashCode() + ((hashCode + (money2 == null ? 0 : money2.hashCode())) * 31)) * 31)) * 31;
        DepositPreference depositPreference = this.depositPreference;
        int hashCode3 = (hashCode2 + (depositPreference == null ? 0 : depositPreference.hashCode())) * 31;
        DepositPreferenceData depositPreferenceData = this.depositPreferenceData;
        int hashCode4 = (hashCode3 + (depositPreferenceData == null ? 0 : depositPreferenceData.hashCode())) * 31;
        TransfersWithdrawManager.FeeData feeData = this.feeData;
        int hashCode5 = (hashCode4 + (feeData == null ? 0 : feeData.hashCode())) * 31;
        TransferFee transferFee = this.acceptedFee;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode5 + (transferFee == null ? 0 : transferFee.hashCode())) * 31, 31, this.grandfathered);
        SignalsContext signalsContext = this.signalsContext;
        int hashCode6 = (m + (signalsContext == null ? 0 : signalsContext.hashCode())) * 31;
        ConfirmationSheetData confirmationSheetData = this.confirmationSheetData;
        int hashCode7 = (hashCode6 + (confirmationSheetData == null ? 0 : confirmationSheetData.hashCode())) * 31;
        Boolean bool = this.showConfirmationDialog;
        int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode7 + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.confirmPendingTransfers);
        TransferSource transferSource = this.source;
        int hashCode8 = (m2 + (transferSource == null ? 0 : transferSource.hashCode())) * 31;
        Instrument instrument = this.transferInstrument;
        return hashCode8 + (instrument != null ? instrument.hashCode() : 0);
    }

    public final String toString() {
        return "TransferData(amount=" + this.amount + ", maxAmountAllowed=" + this.maxAmountAllowed + ", balance=" + this.balance + ", type=" + this.f1215type + ", depositPreference=" + this.depositPreference + ", depositPreferenceData=" + this.depositPreferenceData + ", feeData=" + this.feeData + ", acceptedFee=" + this.acceptedFee + ", grandfathered=" + this.grandfathered + ", signalsContext=" + this.signalsContext + ", confirmationSheetData=" + this.confirmationSheetData + ", showConfirmationDialog=" + this.showConfirmationDialog + ", confirmPendingTransfers=" + this.confirmPendingTransfers + ", source=" + this.source + ", transferInstrument=" + this.transferInstrument + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.amount, i);
        parcel.writeParcelable(this.maxAmountAllowed, i);
        parcel.writeParcelable(this.balance, i);
        parcel.writeString(this.f1215type.name());
        DepositPreference depositPreference = this.depositPreference;
        if (depositPreference == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(depositPreference.name());
        }
        parcel.writeParcelable(this.depositPreferenceData, i);
        parcel.writeParcelable(this.feeData, i);
        TransferFee transferFee = this.acceptedFee;
        if (transferFee == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            transferFee.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.grandfathered ? 1 : 0);
        parcel.writeParcelable(this.signalsContext, i);
        parcel.writeParcelable(this.confirmationSheetData, i);
        Boolean bool = this.showConfirmationDialog;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            CameraState$Type$EnumUnboxingLocalUtility.m(parcel, 1, bool);
        }
        parcel.writeInt(this.confirmPendingTransfers ? 1 : 0);
        TransferSource transferSource = this.source;
        if (transferSource == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(transferSource.name());
        }
        parcel.writeParcelable(this.transferInstrument, i);
    }

    public TransferData(Money money, Money money2, Instrument instrument, TransferType transferType, DepositPreference depositPreference, DepositPreferenceData depositPreferenceData, TransfersWithdrawManager.FeeData feeData, TransferFee transferFee, boolean z, SignalsContext signalsContext, ConfirmationSheetData confirmationSheetData, Boolean bool, boolean z2, TransferSource transferSource, Instrument instrument2) {
        instrument.getClass();
        transferType.getClass();
        this.amount = money;
        this.maxAmountAllowed = money2;
        this.balance = instrument;
        this.f1215type = transferType;
        this.depositPreference = depositPreference;
        this.depositPreferenceData = depositPreferenceData;
        this.feeData = feeData;
        this.acceptedFee = transferFee;
        this.grandfathered = z;
        this.signalsContext = signalsContext;
        this.confirmationSheetData = confirmationSheetData;
        this.showConfirmationDialog = bool;
        this.confirmPendingTransfers = z2;
        this.source = transferSource;
        this.transferInstrument = instrument2;
    }
}
