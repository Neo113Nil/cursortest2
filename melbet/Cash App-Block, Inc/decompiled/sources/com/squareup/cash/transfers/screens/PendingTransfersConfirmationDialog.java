package com.squareup.cash.transfers.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.broadway.screen.DialogScreen;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.wallet.screens.WalletHomeScreen;
import com.squareup.protos.common.Money;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class PendingTransfersConfirmationDialog implements DialogScreen {
    public static final Parcelable.Creator<PendingTransfersConfirmationDialog> CREATOR = new WalletHomeScreen.Creator(5);
    public final Destination destination;
    public final DestinationParams destinationParams;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes7.dex */
    public final class Destination {
        public static final /* synthetic */ Destination[] $VALUES;
        public static final Destination ADD_MONEY;
        public static final Destination WITHDRAW;

        static {
            Destination destination = new Destination("ADD_MONEY", 0);
            ADD_MONEY = destination;
            Destination destination2 = new Destination("WITHDRAW", 1);
            WITHDRAW = destination2;
            $VALUES = new Destination[]{destination, destination2};
        }

        public static Destination valueOf(String str) {
            return (Destination) Enum.valueOf(Destination.class, str);
        }

        public static Destination[] values() {
            return (Destination[]) $VALUES.clone();
        }
    }

    /* loaded from: classes6.dex */
    public final class DestinationParams implements Parcelable {
        public static final Parcelable.Creator<DestinationParams> CREATOR = new WalletHomeScreen.Creator(6);
        public final BlockersData blockersData;
        public final Money customSuggestedAmount;
        public final String customTitle;
        public final Money initialAmount;
        public final String instrumentToken;
        public final boolean startInKeypad;

        public DestinationParams(BlockersData blockersData, Money money, String str, String str2, Money money2, boolean z) {
            blockersData.getClass();
            this.blockersData = blockersData;
            this.initialAmount = money;
            this.instrumentToken = str;
            this.customTitle = str2;
            this.customSuggestedAmount = money2;
            this.startInKeypad = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DestinationParams)) {
                return false;
            }
            DestinationParams destinationParams = (DestinationParams) obj;
            return Intrinsics.areEqual(this.blockersData, destinationParams.blockersData) && Intrinsics.areEqual(this.initialAmount, destinationParams.initialAmount) && Intrinsics.areEqual(this.instrumentToken, destinationParams.instrumentToken) && Intrinsics.areEqual(this.customTitle, destinationParams.customTitle) && Intrinsics.areEqual(this.customSuggestedAmount, destinationParams.customSuggestedAmount) && this.startInKeypad == destinationParams.startInKeypad;
        }

        public final int hashCode() {
            int hashCode = this.blockersData.hashCode() * 31;
            Money money = this.initialAmount;
            int hashCode2 = (hashCode + (money == null ? 0 : money.hashCode())) * 31;
            String str = this.instrumentToken;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.customTitle;
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Money money2 = this.customSuggestedAmount;
            return Boolean.hashCode(this.startInKeypad) + ((hashCode4 + (money2 != null ? money2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("DestinationParams(blockersData=");
            sb.append(this.blockersData);
            sb.append(", initialAmount=");
            sb.append(this.initialAmount);
            sb.append(", instrumentToken=");
            Boxes$$ExternalSyntheticOutline1.m(sb, this.instrumentToken, ", customTitle=", this.customTitle, ", customSuggestedAmount=");
            sb.append(this.customSuggestedAmount);
            sb.append(", startInKeypad=");
            sb.append(this.startInKeypad);
            sb.append(")");
            return sb.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.blockersData, i);
            parcel.writeParcelable(this.initialAmount, i);
            parcel.writeString(this.instrumentToken);
            parcel.writeString(this.customTitle);
            parcel.writeParcelable(this.customSuggestedAmount, i);
            parcel.writeInt(this.startInKeypad ? 1 : 0);
        }
    }

    public PendingTransfersConfirmationDialog(Destination destination, DestinationParams destinationParams) {
        destination.getClass();
        destinationParams.getClass();
        this.destination = destination;
        this.destinationParams = destinationParams;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PendingTransfersConfirmationDialog)) {
            return false;
        }
        PendingTransfersConfirmationDialog pendingTransfersConfirmationDialog = (PendingTransfersConfirmationDialog) obj;
        return this.destination == pendingTransfersConfirmationDialog.destination && Intrinsics.areEqual(this.destinationParams, pendingTransfersConfirmationDialog.destinationParams);
    }

    public final int hashCode() {
        return this.destinationParams.hashCode() + (this.destination.hashCode() * 31);
    }

    public final String toString() {
        return "PendingTransfersConfirmationDialog(destination=" + this.destination + ", destinationParams=" + this.destinationParams + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.destination.name());
        this.destinationParams.writeToParcel(parcel, i);
    }
}
