package com.squareup.cash.transfers.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.tax.screens.TaxMenuSheet;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.Instrument;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class BalanceBasedAutoReloadConfirmationScreen implements BlockersScreens {
    public static final Parcelable.Creator<BalanceBasedAutoReloadConfirmationScreen> CREATOR = new TaxMenuSheet.Creator(17);
    public final BlockersData blockersData;
    public final ConfirmationData confirmationData;

    /* loaded from: classes7.dex */
    public final class ConfirmationData implements Parcelable {
        public static final Parcelable.Creator<ConfirmationData> CREATOR = new TaxMenuSheet.Creator(15);
        public final String ctaButtonLabel;
        public final FundingSource fundingSource;
        public final AmountSelectionConfig incrementAmountConfig;
        public final AmountSelectionConfig minimumBalanceConfig;
        public final String subtitle;
        public final String title;

        public final class AmountSelectionConfig implements Parcelable {
            public static final Parcelable.Creator<AmountSelectionConfig> CREATOR = new TaxMenuSheet.Creator(14);
            public final Money amountCustomMax;
            public final Money amountCustomMin;
            public final boolean autoOpen;
            public final Money incrementAmount;
            public final Money initialAmount;
            public final Money minimumInitialIncrementAmount;
            public final String title;

            public AmountSelectionConfig(String str, Money money, Money money2, Money money3, Money money4, Money money5, boolean z) {
                str.getClass();
                money.getClass();
                money2.getClass();
                money3.getClass();
                money4.getClass();
                money5.getClass();
                this.title = str;
                this.initialAmount = money;
                this.amountCustomMin = money2;
                this.amountCustomMax = money3;
                this.incrementAmount = money4;
                this.minimumInitialIncrementAmount = money5;
                this.autoOpen = z;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AmountSelectionConfig)) {
                    return false;
                }
                AmountSelectionConfig amountSelectionConfig = (AmountSelectionConfig) obj;
                return Intrinsics.areEqual(this.title, amountSelectionConfig.title) && Intrinsics.areEqual(this.initialAmount, amountSelectionConfig.initialAmount) && Intrinsics.areEqual(this.amountCustomMin, amountSelectionConfig.amountCustomMin) && Intrinsics.areEqual(this.amountCustomMax, amountSelectionConfig.amountCustomMax) && Intrinsics.areEqual(this.incrementAmount, amountSelectionConfig.incrementAmount) && Intrinsics.areEqual(this.minimumInitialIncrementAmount, amountSelectionConfig.minimumInitialIncrementAmount) && this.autoOpen == amountSelectionConfig.autoOpen;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.autoOpen) + NavAction$$ExternalSyntheticOutline0.m(this.minimumInitialIncrementAmount, NavAction$$ExternalSyntheticOutline0.m(this.incrementAmount, NavAction$$ExternalSyntheticOutline0.m(this.amountCustomMax, NavAction$$ExternalSyntheticOutline0.m(this.amountCustomMin, NavAction$$ExternalSyntheticOutline0.m(this.initialAmount, this.title.hashCode() * 31, 31), 31), 31), 31), 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("AmountSelectionConfig(title=");
                sb.append(this.title);
                sb.append(", initialAmount=");
                sb.append(this.initialAmount);
                sb.append(", amountCustomMin=");
                sb.append(this.amountCustomMin);
                sb.append(", amountCustomMax=");
                sb.append(this.amountCustomMax);
                sb.append(", incrementAmount=");
                sb.append(this.incrementAmount);
                sb.append(", minimumInitialIncrementAmount=");
                sb.append(this.minimumInitialIncrementAmount);
                sb.append(", autoOpen=");
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.autoOpen, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeString(this.title);
                parcel.writeParcelable(this.initialAmount, i);
                parcel.writeParcelable(this.amountCustomMin, i);
                parcel.writeParcelable(this.amountCustomMax, i);
                parcel.writeParcelable(this.incrementAmount, i);
                parcel.writeParcelable(this.minimumInitialIncrementAmount, i);
                parcel.writeInt(this.autoOpen ? 1 : 0);
            }
        }

        public final class FundingSource implements Parcelable {
            public static final Parcelable.Creator<FundingSource> CREATOR = new TaxMenuSheet.Creator(16);
            public final String bankName;
            public final String debitCardName;
            public final Instrument instrument;

            public FundingSource(String str, String str2, Instrument instrument) {
                str.getClass();
                this.debitCardName = str;
                this.bankName = str2;
                this.instrument = instrument;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof FundingSource)) {
                    return false;
                }
                FundingSource fundingSource = (FundingSource) obj;
                return Intrinsics.areEqual(this.debitCardName, fundingSource.debitCardName) && Intrinsics.areEqual(this.bankName, fundingSource.bankName) && Intrinsics.areEqual(this.instrument, fundingSource.instrument);
            }

            public final int hashCode() {
                int hashCode = this.debitCardName.hashCode() * 31;
                String str = this.bankName;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                Instrument instrument = this.instrument;
                return hashCode2 + (instrument != null ? instrument.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("FundingSource(debitCardName=", this.debitCardName, ", bankName=", this.bankName, ", instrument=");
                m.append(this.instrument);
                m.append(")");
                return m.toString();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeString(this.debitCardName);
                parcel.writeString(this.bankName);
                parcel.writeParcelable(this.instrument, i);
            }
        }

        public ConfirmationData(String str, String str2, AmountSelectionConfig amountSelectionConfig, AmountSelectionConfig amountSelectionConfig2, String str3, FundingSource fundingSource) {
            str.getClass();
            str2.getClass();
            amountSelectionConfig.getClass();
            amountSelectionConfig2.getClass();
            str3.getClass();
            fundingSource.getClass();
            this.title = str;
            this.subtitle = str2;
            this.minimumBalanceConfig = amountSelectionConfig;
            this.incrementAmountConfig = amountSelectionConfig2;
            this.ctaButtonLabel = str3;
            this.fundingSource = fundingSource;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ConfirmationData)) {
                return false;
            }
            ConfirmationData confirmationData = (ConfirmationData) obj;
            return Intrinsics.areEqual(this.title, confirmationData.title) && Intrinsics.areEqual(this.subtitle, confirmationData.subtitle) && Intrinsics.areEqual(this.minimumBalanceConfig, confirmationData.minimumBalanceConfig) && Intrinsics.areEqual(this.incrementAmountConfig, confirmationData.incrementAmountConfig) && Intrinsics.areEqual(this.ctaButtonLabel, confirmationData.ctaButtonLabel) && Intrinsics.areEqual(this.fundingSource, confirmationData.fundingSource);
        }

        public final int hashCode() {
            return this.fundingSource.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.incrementAmountConfig.hashCode() + ((this.minimumBalanceConfig.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.subtitle)) * 31)) * 31, 31, this.ctaButtonLabel);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ConfirmationData(title=", this.title, ", subtitle=", this.subtitle, ", minimumBalanceConfig=");
            m.append(this.minimumBalanceConfig);
            m.append(", incrementAmountConfig=");
            m.append(this.incrementAmountConfig);
            m.append(", ctaButtonLabel=");
            m.append(this.ctaButtonLabel);
            m.append(", fundingSource=");
            m.append(this.fundingSource);
            m.append(")");
            return m.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.title);
            parcel.writeString(this.subtitle);
            this.minimumBalanceConfig.writeToParcel(parcel, i);
            this.incrementAmountConfig.writeToParcel(parcel, i);
            parcel.writeString(this.ctaButtonLabel);
            this.fundingSource.writeToParcel(parcel, i);
        }
    }

    public BalanceBasedAutoReloadConfirmationScreen(BlockersData blockersData, ConfirmationData confirmationData) {
        blockersData.getClass();
        confirmationData.getClass();
        this.blockersData = blockersData;
        this.confirmationData = confirmationData;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BalanceBasedAutoReloadConfirmationScreen)) {
            return false;
        }
        BalanceBasedAutoReloadConfirmationScreen balanceBasedAutoReloadConfirmationScreen = (BalanceBasedAutoReloadConfirmationScreen) obj;
        return Intrinsics.areEqual(this.blockersData, balanceBasedAutoReloadConfirmationScreen.blockersData) && Intrinsics.areEqual(this.confirmationData, balanceBasedAutoReloadConfirmationScreen.confirmationData);
    }

    @Override // com.squareup.cash.blockers.screens.BlockersScreens
    public final BlockersData getBlockersData() {
        return this.blockersData;
    }

    public final int hashCode() {
        return this.confirmationData.hashCode() + (this.blockersData.hashCode() * 31);
    }

    public final String toString() {
        return "BalanceBasedAutoReloadConfirmationScreen(blockersData=" + this.blockersData + ", confirmationData=" + this.confirmationData + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.blockersData, i);
        this.confirmationData.writeToParcel(parcel, i);
    }
}
