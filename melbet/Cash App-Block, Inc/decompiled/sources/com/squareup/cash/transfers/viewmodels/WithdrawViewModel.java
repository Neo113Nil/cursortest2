package com.squareup.cash.transfers.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.instruments.viewmodels.InstrumentCellViewModel;
import com.squareup.cash.transfers.data.TransferFee;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.DepositPreference;
import com.squareup.protos.franklin.common.ConfirmationSheetData;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface WithdrawViewModel {

    public final class ChangeAmount implements WithdrawViewModel {
        public final WithdrawViewModel$AmountConfig$KeypadConfig amountConfig;
        public final List depositPreferenceOptions;
        public final boolean hasValidInstrument;
        public final String saveAmountButtonLabel;
        public final String subtitle;
        public final String title;

        public ChangeAmount(String str, String str2, WithdrawViewModel$AmountConfig$KeypadConfig withdrawViewModel$AmountConfig$KeypadConfig, List list, String str3, boolean z) {
            str.getClass();
            str2.getClass();
            list.getClass();
            str3.getClass();
            this.title = str;
            this.subtitle = str2;
            this.amountConfig = withdrawViewModel$AmountConfig$KeypadConfig;
            this.depositPreferenceOptions = list;
            this.saveAmountButtonLabel = str3;
            this.hasValidInstrument = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ChangeAmount)) {
                return false;
            }
            ChangeAmount changeAmount = (ChangeAmount) obj;
            return Intrinsics.areEqual(this.title, changeAmount.title) && Intrinsics.areEqual(this.subtitle, changeAmount.subtitle) && this.amountConfig.equals(changeAmount.amountConfig) && Intrinsics.areEqual(this.depositPreferenceOptions, changeAmount.depositPreferenceOptions) && Intrinsics.areEqual(this.saveAmountButtonLabel, changeAmount.saveAmountButtonLabel) && this.hasValidInstrument == changeAmount.hasValidInstrument;
        }

        public final int hashCode() {
            return Boolean.hashCode(true) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m((this.amountConfig.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.subtitle)) * 31, 31, this.depositPreferenceOptions), 31, this.saveAmountButtonLabel), 31, this.hasValidInstrument);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ChangeAmount(title=", this.title, ", subtitle=", this.subtitle, ", amountConfig=");
            m.append(this.amountConfig);
            m.append(", depositPreferenceOptions=");
            m.append(this.depositPreferenceOptions);
            m.append(", saveAmountButtonLabel=");
            return re$$ExternalSyntheticOutline0.m(m, this.saveAmountButtonLabel, ", hasValidInstrument=", this.hasValidInstrument, ", clearKeypadOnInitialInput=true)");
        }
    }

    public final class DepositPreferenceOption {
        public final ConfirmationSheetData confirmSheetData;
        public final DepositPreference depositPreference;
        public final Icon depositPreferenceIcon;
        public final boolean enabled;
        public final TransferFee fee;
        public final String feeLabel;
        public final String title;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class Icon {
            public static final /* synthetic */ Icon[] $VALUES;
            public static final Icon INSTANT;

            static {
                Icon icon = new Icon("INSTANT", 0);
                INSTANT = icon;
                $VALUES = new Icon[]{icon, new Icon("INSTANT_HIGHLIGHTED", 1), new Icon("BANK", 2)};
            }

            public static Icon valueOf(String str) {
                return (Icon) Enum.valueOf(Icon.class, str);
            }

            public static Icon[] values() {
                return (Icon[]) $VALUES.clone();
            }
        }

        public DepositPreferenceOption(String str, String str2, TransferFee transferFee, Icon icon, DepositPreference depositPreference, ConfirmationSheetData confirmationSheetData, boolean z) {
            str.getClass();
            depositPreference.getClass();
            this.title = str;
            this.feeLabel = str2;
            this.fee = transferFee;
            this.depositPreferenceIcon = icon;
            this.depositPreference = depositPreference;
            this.confirmSheetData = confirmationSheetData;
            this.enabled = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DepositPreferenceOption)) {
                return false;
            }
            DepositPreferenceOption depositPreferenceOption = (DepositPreferenceOption) obj;
            return Intrinsics.areEqual(this.title, depositPreferenceOption.title) && Intrinsics.areEqual(this.feeLabel, depositPreferenceOption.feeLabel) && this.fee.equals(depositPreferenceOption.fee) && this.depositPreferenceIcon == depositPreferenceOption.depositPreferenceIcon && this.depositPreference == depositPreferenceOption.depositPreference && Intrinsics.areEqual(this.confirmSheetData, depositPreferenceOption.confirmSheetData) && this.enabled == depositPreferenceOption.enabled;
        }

        public final int hashCode() {
            int hashCode = this.title.hashCode() * 961;
            String str = this.feeLabel;
            int hashCode2 = (this.fee.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
            Icon icon = this.depositPreferenceIcon;
            int hashCode3 = (this.depositPreference.hashCode() + ((hashCode2 + (icon == null ? 0 : icon.hashCode())) * 31)) * 31;
            ConfirmationSheetData confirmationSheetData = this.confirmSheetData;
            return Boolean.hashCode(this.enabled) + ((hashCode3 + (confirmationSheetData != null ? confirmationSheetData.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DepositPreferenceOption(title=", this.title, ", subtitle=null, feeLabel=", this.feeLabel, ", fee=");
            m.append(this.fee);
            m.append(", depositPreferenceIcon=");
            m.append(this.depositPreferenceIcon);
            m.append(", depositPreference=");
            m.append(this.depositPreference);
            m.append(", confirmSheetData=");
            m.append(this.confirmSheetData);
            m.append(", enabled=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.enabled, ")");
        }
    }

    public final class ManagedAccountAmountEntry implements WithdrawViewModel {
        public final WithdrawViewModel$AmountConfig$KeypadConfig amountConfig;
        public final String continueButtonLabel;
        public final String subtitle;
        public final String title;

        public ManagedAccountAmountEntry(String str, WithdrawViewModel$AmountConfig$KeypadConfig withdrawViewModel$AmountConfig$KeypadConfig, String str2, String str3) {
            str.getClass();
            str3.getClass();
            this.title = str;
            this.amountConfig = withdrawViewModel$AmountConfig$KeypadConfig;
            this.subtitle = str2;
            this.continueButtonLabel = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ManagedAccountAmountEntry)) {
                return false;
            }
            ManagedAccountAmountEntry managedAccountAmountEntry = (ManagedAccountAmountEntry) obj;
            return Intrinsics.areEqual(this.title, managedAccountAmountEntry.title) && this.amountConfig.equals(managedAccountAmountEntry.amountConfig) && this.subtitle.equals(managedAccountAmountEntry.subtitle) && Intrinsics.areEqual(this.continueButtonLabel, managedAccountAmountEntry.continueButtonLabel);
        }

        public final int hashCode() {
            return Boolean.hashCode(true) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.amountConfig.hashCode() + (this.title.hashCode() * 31)) * 31, 31, this.subtitle), 31, this.continueButtonLabel);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ManagedAccountAmountEntry(title=");
            sb.append(this.title);
            sb.append(", amountConfig=");
            sb.append(this.amountConfig);
            sb.append(", subtitle=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.subtitle, ", continueButtonLabel=", this.continueButtonLabel, ", clearKeypadOnInitialInput=true)");
        }
    }

    public final class ManagedAccountConfirmation implements WithdrawViewModel {
        public final String confirmButtonLabel;
        public final InstrumentCellViewModel instrumentCellViewModel;
        public final String title;

        public ManagedAccountConfirmation(String str, String str2, InstrumentCellViewModel instrumentCellViewModel) {
            str2.getClass();
            this.title = str;
            this.confirmButtonLabel = str2;
            this.instrumentCellViewModel = instrumentCellViewModel;
            CurrencyCode currencyCode = CurrencyCode.USD;
            new Money((Long) 0L, currencyCode, 4);
            currencyCode.getClass();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ManagedAccountConfirmation)) {
                return false;
            }
            ManagedAccountConfirmation managedAccountConfirmation = (ManagedAccountConfirmation) obj;
            return this.title.equals(managedAccountConfirmation.title) && Intrinsics.areEqual(this.confirmButtonLabel, managedAccountConfirmation.confirmButtonLabel) && Intrinsics.areEqual(this.instrumentCellViewModel, managedAccountConfirmation.instrumentCellViewModel);
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.confirmButtonLabel);
            InstrumentCellViewModel instrumentCellViewModel = this.instrumentCellViewModel;
            return m + (instrumentCellViewModel == null ? 0 : instrumentCellViewModel.hashCode());
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ManagedAccountConfirmation(title=", this.title, ", confirmButtonLabel=", this.confirmButtonLabel, ", instrumentCellViewModel=");
            m.append(this.instrumentCellViewModel);
            m.append(")");
            return m.toString();
        }
    }

    public final class ViewAmount implements WithdrawViewModel {
        public final WithdrawViewModel$AmountConfig$KeypadConfig amountConfig;
        public final String changeAmountButtonLabel;
        public final String confirmationButtonLabel;
        public final List depositPreferenceOptions;
        public final DepositPreferenceStyle depositPreferenceStyle;
        public final String formattedAmount;
        public final InstrumentCellViewModel instrumentCellViewModel;
        public final DepositPreference selectedDepositPreference;
        public final String subtitle;
        public final String title;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class DepositPreferenceStyle {
            public static final /* synthetic */ DepositPreferenceStyle[] $VALUES;
            public static final DepositPreferenceStyle DEFAULT;
            public static final DepositPreferenceStyle WITH_BUTTONS;

            static {
                DepositPreferenceStyle depositPreferenceStyle = new DepositPreferenceStyle("DEFAULT", 0);
                DEFAULT = depositPreferenceStyle;
                DepositPreferenceStyle depositPreferenceStyle2 = new DepositPreferenceStyle("WITH_BUTTONS", 1);
                WITH_BUTTONS = depositPreferenceStyle2;
                $VALUES = new DepositPreferenceStyle[]{depositPreferenceStyle, depositPreferenceStyle2};
            }

            public static DepositPreferenceStyle valueOf(String str) {
                return (DepositPreferenceStyle) Enum.valueOf(DepositPreferenceStyle.class, str);
            }

            public static DepositPreferenceStyle[] values() {
                return (DepositPreferenceStyle[]) $VALUES.clone();
            }
        }

        public ViewAmount(String str, String str2, WithdrawViewModel$AmountConfig$KeypadConfig withdrawViewModel$AmountConfig$KeypadConfig, List list, String str3, String str4, String str5, DepositPreference depositPreference, InstrumentCellViewModel instrumentCellViewModel, DepositPreferenceStyle depositPreferenceStyle) {
            str.getClass();
            str2.getClass();
            list.getClass();
            str3.getClass();
            str4.getClass();
            str5.getClass();
            depositPreferenceStyle.getClass();
            this.title = str;
            this.subtitle = str2;
            this.amountConfig = withdrawViewModel$AmountConfig$KeypadConfig;
            this.depositPreferenceOptions = list;
            this.formattedAmount = str3;
            this.confirmationButtonLabel = str4;
            this.changeAmountButtonLabel = str5;
            this.selectedDepositPreference = depositPreference;
            this.instrumentCellViewModel = instrumentCellViewModel;
            this.depositPreferenceStyle = depositPreferenceStyle;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewAmount)) {
                return false;
            }
            ViewAmount viewAmount = (ViewAmount) obj;
            return Intrinsics.areEqual(this.title, viewAmount.title) && Intrinsics.areEqual(this.subtitle, viewAmount.subtitle) && this.amountConfig.equals(viewAmount.amountConfig) && Intrinsics.areEqual(this.depositPreferenceOptions, viewAmount.depositPreferenceOptions) && Intrinsics.areEqual(this.formattedAmount, viewAmount.formattedAmount) && Intrinsics.areEqual(this.confirmationButtonLabel, viewAmount.confirmationButtonLabel) && Intrinsics.areEqual(this.changeAmountButtonLabel, viewAmount.changeAmountButtonLabel) && this.selectedDepositPreference == viewAmount.selectedDepositPreference && Intrinsics.areEqual(this.instrumentCellViewModel, viewAmount.instrumentCellViewModel) && this.depositPreferenceStyle == viewAmount.depositPreferenceStyle;
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m((this.amountConfig.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.subtitle)) * 31, 31, this.depositPreferenceOptions), 31, this.formattedAmount), 31, this.confirmationButtonLabel), 31, this.changeAmountButtonLabel);
            DepositPreference depositPreference = this.selectedDepositPreference;
            int hashCode = (m + (depositPreference == null ? 0 : depositPreference.hashCode())) * 31;
            InstrumentCellViewModel instrumentCellViewModel = this.instrumentCellViewModel;
            return this.depositPreferenceStyle.hashCode() + ((hashCode + (instrumentCellViewModel != null ? instrumentCellViewModel.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ViewAmount(title=", this.title, ", subtitle=", this.subtitle, ", amountConfig=");
            m.append(this.amountConfig);
            m.append(", depositPreferenceOptions=");
            m.append(this.depositPreferenceOptions);
            m.append(", formattedAmount=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.formattedAmount, ", confirmationButtonLabel=", this.confirmationButtonLabel, ", changeAmountButtonLabel=");
            m.append(this.changeAmountButtonLabel);
            m.append(", selectedDepositPreference=");
            m.append(this.selectedDepositPreference);
            m.append(", instrumentCellViewModel=");
            m.append(this.instrumentCellViewModel);
            m.append(", depositPreferenceStyle=");
            m.append(this.depositPreferenceStyle);
            m.append(")");
            return m.toString();
        }
    }
}
