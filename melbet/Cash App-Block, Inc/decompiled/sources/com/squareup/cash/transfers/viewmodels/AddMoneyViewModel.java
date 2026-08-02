package com.squareup.cash.transfers.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.instruments.viewmodels.InstrumentCellViewModel;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface AddMoneyViewModel {

    public final class AtmPicker implements AddMoneyViewModel {
        public final ArrayList amountPickerItems;
        public final boolean confirmationButtonEnabled;
        public final String confirmationButtonLabel;
        public final Money currentAmount;
        public final InstrumentCellViewModel instrumentCellViewModel;
        public final boolean payWithGooglePayButtonEnabled;
        public final String payWithGooglePayLabel;
        public final RecurringCashInToggle recurringCashInToggle;
        public final String subtitle;
        public final String title;

        public interface AmountPickerItem {

            public final class Amount implements AmountPickerItem {
                public final Money amount;
                public final boolean enabled;
                public final String label;
                public final boolean selected;

                public Amount(String str, boolean z, Money money, boolean z2, int i) {
                    z2 = (i & 16) != 0 ? true : z2;
                    str.getClass();
                    money.getClass();
                    this.label = str;
                    this.selected = z;
                    this.amount = money;
                    this.enabled = z2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Amount)) {
                        return false;
                    }
                    Amount amount = (Amount) obj;
                    return Intrinsics.areEqual(this.label, amount.label) && this.selected == amount.selected && Intrinsics.areEqual(this.amount, amount.amount) && this.enabled == amount.enabled;
                }

                @Override // com.squareup.cash.transfers.viewmodels.AddMoneyViewModel.AtmPicker.AmountPickerItem
                public final String getAccessibilityLabel() {
                    return null;
                }

                @Override // com.squareup.cash.transfers.viewmodels.AddMoneyViewModel.AtmPicker.AmountPickerItem
                public final String getLabel() {
                    return this.label;
                }

                @Override // com.squareup.cash.transfers.viewmodels.AddMoneyViewModel.AtmPicker.AmountPickerItem
                public final boolean getSelected() {
                    return this.selected;
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.enabled) + NavAction$$ExternalSyntheticOutline0.m(this.amount, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.label.hashCode() * 31, 961, this.selected), 31);
                }

                public final String toString() {
                    StringBuilder m1540m = Request$Priority$EnumUnboxingLocalUtility.m1540m("Amount(label=", this.label, ", selected=", ", accessibilityLabel=null, amount=", this.selected);
                    m1540m.append(this.amount);
                    m1540m.append(", enabled=");
                    m1540m.append(this.enabled);
                    m1540m.append(")");
                    return m1540m.toString();
                }
            }

            public final class Custom implements AmountPickerItem {
                public final String accessibilityLabel;
                public final boolean enabled;

                public Custom(String str, boolean z) {
                    this.accessibilityLabel = str;
                    this.enabled = z;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Custom)) {
                        return false;
                    }
                    Custom custom = (Custom) obj;
                    return Intrinsics.areEqual(this.accessibilityLabel, custom.accessibilityLabel) && this.enabled == custom.enabled;
                }

                @Override // com.squareup.cash.transfers.viewmodels.AddMoneyViewModel.AtmPicker.AmountPickerItem
                public final String getAccessibilityLabel() {
                    return this.accessibilityLabel;
                }

                @Override // com.squareup.cash.transfers.viewmodels.AddMoneyViewModel.AtmPicker.AmountPickerItem
                public final String getLabel() {
                    return "･･･";
                }

                @Override // com.squareup.cash.transfers.viewmodels.AddMoneyViewModel.AtmPicker.AmountPickerItem
                public final boolean getSelected() {
                    return false;
                }

                public final int hashCode() {
                    int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(2012623323, 31, false);
                    String str = this.accessibilityLabel;
                    return Boolean.hashCode(this.enabled) + ((m + (str != null ? str.hashCode() : 0)) * 31);
                }

                public final String toString() {
                    return Request$Priority$EnumUnboxingLocalUtility.m("Custom(label=･･･, selected=false, accessibilityLabel=", this.accessibilityLabel, ", enabled=", ")", this.enabled);
                }
            }

            String getAccessibilityLabel();

            String getLabel();

            boolean getSelected();
        }

        public AtmPicker(String str, String str2, Money money, String str3, boolean z, String str4, boolean z2, InstrumentCellViewModel instrumentCellViewModel, ArrayList arrayList, RecurringCashInToggle recurringCashInToggle) {
            str.getClass();
            money.getClass();
            str3.getClass();
            this.title = str;
            this.subtitle = str2;
            this.currentAmount = money;
            this.confirmationButtonLabel = str3;
            this.confirmationButtonEnabled = z;
            this.payWithGooglePayLabel = str4;
            this.payWithGooglePayButtonEnabled = z2;
            this.instrumentCellViewModel = instrumentCellViewModel;
            this.amountPickerItems = arrayList;
            this.recurringCashInToggle = recurringCashInToggle;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AtmPicker)) {
                return false;
            }
            AtmPicker atmPicker = (AtmPicker) obj;
            return Intrinsics.areEqual(this.title, atmPicker.title) && Intrinsics.areEqual(this.subtitle, atmPicker.subtitle) && Intrinsics.areEqual(this.currentAmount, atmPicker.currentAmount) && Intrinsics.areEqual(this.confirmationButtonLabel, atmPicker.confirmationButtonLabel) && this.confirmationButtonEnabled == atmPicker.confirmationButtonEnabled && Intrinsics.areEqual(this.payWithGooglePayLabel, atmPicker.payWithGooglePayLabel) && this.payWithGooglePayButtonEnabled == atmPicker.payWithGooglePayButtonEnabled && Intrinsics.areEqual(this.instrumentCellViewModel, atmPicker.instrumentCellViewModel) && this.amountPickerItems.equals(atmPicker.amountPickerItems) && Intrinsics.areEqual(this.recurringCashInToggle, atmPicker.recurringCashInToggle);
        }

        @Override // com.squareup.cash.transfers.viewmodels.AddMoneyViewModel
        public final boolean getAllowSheetExpansion() {
            return true;
        }

        @Override // com.squareup.cash.transfers.viewmodels.AddMoneyViewModel
        public final boolean getConfirmationButtonEnabled() {
            return this.confirmationButtonEnabled;
        }

        @Override // com.squareup.cash.transfers.viewmodels.AddMoneyViewModel
        public final String getConfirmationButtonLabel() {
            return this.confirmationButtonLabel;
        }

        @Override // com.squareup.cash.transfers.viewmodels.AddMoneyViewModel
        public final InstrumentCellViewModel getInstrumentCellViewModel() {
            return this.instrumentCellViewModel;
        }

        @Override // com.squareup.cash.transfers.viewmodels.AddMoneyViewModel
        public final boolean getPayWithGooglePayButtonEnabled() {
            return this.payWithGooglePayButtonEnabled;
        }

        @Override // com.squareup.cash.transfers.viewmodels.AddMoneyViewModel
        public final String getPayWithGooglePayLabel() {
            return this.payWithGooglePayLabel;
        }

        @Override // com.squareup.cash.transfers.viewmodels.AddMoneyViewModel
        public final RecurringCashInToggle getRecurringCashInToggle() {
            return this.recurringCashInToggle;
        }

        public final int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            String str = this.subtitle;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(NavAction$$ExternalSyntheticOutline0.m(this.currentAmount, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.confirmationButtonLabel), 31, this.confirmationButtonEnabled);
            String str2 = this.payWithGooglePayLabel;
            int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.payWithGooglePayButtonEnabled);
            InstrumentCellViewModel instrumentCellViewModel = this.instrumentCellViewModel;
            int m3 = CameraState$Type$EnumUnboxingLocalUtility.m(this.amountPickerItems, JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m2 + (instrumentCellViewModel == null ? 0 : instrumentCellViewModel.hashCode())) * 31, 31, true), 31);
            RecurringCashInToggle recurringCashInToggle = this.recurringCashInToggle;
            return m3 + (recurringCashInToggle != null ? recurringCashInToggle.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AtmPicker(title=", this.title, ", subtitle=", this.subtitle, ", currentAmount=");
            m.append(this.currentAmount);
            m.append(", confirmationButtonLabel=");
            m.append(this.confirmationButtonLabel);
            m.append(", confirmationButtonEnabled=");
            NavAction$$ExternalSyntheticOutline0.m(m, this.confirmationButtonEnabled, ", payWithGooglePayLabel=", this.payWithGooglePayLabel, ", payWithGooglePayButtonEnabled=");
            m.append(this.payWithGooglePayButtonEnabled);
            m.append(", instrumentCellViewModel=");
            m.append(this.instrumentCellViewModel);
            m.append(", allowSheetExpansion=true, amountPickerItems=");
            m.append(this.amountPickerItems);
            m.append(", recurringCashInToggle=");
            m.append(this.recurringCashInToggle);
            m.append(")");
            return m.toString();
        }
    }

    public final class Keypad implements AddMoneyViewModel {
        public final boolean allowSheetExpansion;
        public final boolean confirmationButtonEnabled;
        public final String confirmationButtonLabel;
        public final Money currentAmount;
        public final InstrumentCellViewModel instrumentCellViewModel;
        public final Money maxAmount;
        public final boolean payWithGooglePayButtonEnabled;
        public final String payWithGooglePayLabel;
        public final RecurringCashInToggle recurringCashInToggle;
        public final boolean skipSheetPeekPosition;
        public final String subtitle;
        public final String title;

        public Keypad(String str, String str2, Money money, String str3, boolean z, String str4, boolean z2, InstrumentCellViewModel instrumentCellViewModel, Money money2, boolean z3, RecurringCashInToggle recurringCashInToggle) {
            str.getClass();
            money.getClass();
            str3.getClass();
            this.title = str;
            this.subtitle = str2;
            this.currentAmount = money;
            this.confirmationButtonLabel = str3;
            this.confirmationButtonEnabled = z;
            this.payWithGooglePayLabel = str4;
            this.payWithGooglePayButtonEnabled = z2;
            this.instrumentCellViewModel = instrumentCellViewModel;
            this.allowSheetExpansion = true;
            this.maxAmount = money2;
            this.skipSheetPeekPosition = z3;
            this.recurringCashInToggle = recurringCashInToggle;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Keypad)) {
                return false;
            }
            Keypad keypad = (Keypad) obj;
            return Intrinsics.areEqual(this.title, keypad.title) && Intrinsics.areEqual(this.subtitle, keypad.subtitle) && Intrinsics.areEqual(this.currentAmount, keypad.currentAmount) && Intrinsics.areEqual(this.confirmationButtonLabel, keypad.confirmationButtonLabel) && this.confirmationButtonEnabled == keypad.confirmationButtonEnabled && Intrinsics.areEqual(this.payWithGooglePayLabel, keypad.payWithGooglePayLabel) && this.payWithGooglePayButtonEnabled == keypad.payWithGooglePayButtonEnabled && Intrinsics.areEqual(this.instrumentCellViewModel, keypad.instrumentCellViewModel) && this.allowSheetExpansion == keypad.allowSheetExpansion && Intrinsics.areEqual(this.maxAmount, keypad.maxAmount) && this.skipSheetPeekPosition == keypad.skipSheetPeekPosition && Intrinsics.areEqual(this.recurringCashInToggle, keypad.recurringCashInToggle);
        }

        @Override // com.squareup.cash.transfers.viewmodels.AddMoneyViewModel
        public final boolean getAllowSheetExpansion() {
            return this.allowSheetExpansion;
        }

        @Override // com.squareup.cash.transfers.viewmodels.AddMoneyViewModel
        public final boolean getConfirmationButtonEnabled() {
            return this.confirmationButtonEnabled;
        }

        @Override // com.squareup.cash.transfers.viewmodels.AddMoneyViewModel
        public final String getConfirmationButtonLabel() {
            return this.confirmationButtonLabel;
        }

        @Override // com.squareup.cash.transfers.viewmodels.AddMoneyViewModel
        public final InstrumentCellViewModel getInstrumentCellViewModel() {
            return this.instrumentCellViewModel;
        }

        @Override // com.squareup.cash.transfers.viewmodels.AddMoneyViewModel
        public final boolean getPayWithGooglePayButtonEnabled() {
            return this.payWithGooglePayButtonEnabled;
        }

        @Override // com.squareup.cash.transfers.viewmodels.AddMoneyViewModel
        public final String getPayWithGooglePayLabel() {
            return this.payWithGooglePayLabel;
        }

        @Override // com.squareup.cash.transfers.viewmodels.AddMoneyViewModel
        public final RecurringCashInToggle getRecurringCashInToggle() {
            return this.recurringCashInToggle;
        }

        public final int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            String str = this.subtitle;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(NavAction$$ExternalSyntheticOutline0.m(this.currentAmount, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.confirmationButtonLabel), 31, this.confirmationButtonEnabled);
            String str2 = this.payWithGooglePayLabel;
            int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.payWithGooglePayButtonEnabled);
            InstrumentCellViewModel instrumentCellViewModel = this.instrumentCellViewModel;
            int m3 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(NavAction$$ExternalSyntheticOutline0.m(this.maxAmount, JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m2 + (instrumentCellViewModel == null ? 0 : instrumentCellViewModel.hashCode())) * 31, 31, this.allowSheetExpansion), 31), 31, this.skipSheetPeekPosition);
            RecurringCashInToggle recurringCashInToggle = this.recurringCashInToggle;
            return m3 + (recurringCashInToggle != null ? recurringCashInToggle.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Keypad(title=", this.title, ", subtitle=", this.subtitle, ", currentAmount=");
            m.append(this.currentAmount);
            m.append(", confirmationButtonLabel=");
            m.append(this.confirmationButtonLabel);
            m.append(", confirmationButtonEnabled=");
            NavAction$$ExternalSyntheticOutline0.m(m, this.confirmationButtonEnabled, ", payWithGooglePayLabel=", this.payWithGooglePayLabel, ", payWithGooglePayButtonEnabled=");
            m.append(this.payWithGooglePayButtonEnabled);
            m.append(", instrumentCellViewModel=");
            m.append(this.instrumentCellViewModel);
            m.append(", allowSheetExpansion=");
            m.append(this.allowSheetExpansion);
            m.append(", maxAmount=");
            m.append(this.maxAmount);
            m.append(", skipSheetPeekPosition=");
            m.append(this.skipSheetPeekPosition);
            m.append(", recurringCashInToggle=");
            m.append(this.recurringCashInToggle);
            m.append(")");
            return m.toString();
        }
    }

    public final class ManagedAccountInstrumentPicker implements AddMoneyViewModel {
        public final boolean allowSheetExpansion;
        public final String confirmationButtonLabel;
        public final String currentInstrumentToken;
        public final String doneButtonLabel;
        public final ArrayList instruments;
        public final String pickerSubtitle;
        public final String pickerTitle;

        public final class InstrumentItem {
            public final InstrumentCellViewModel cellViewModel;
            public final String token;

            public InstrumentItem(InstrumentCellViewModel instrumentCellViewModel, String str) {
                this.token = str;
                this.cellViewModel = instrumentCellViewModel;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof InstrumentItem)) {
                    return false;
                }
                InstrumentItem instrumentItem = (InstrumentItem) obj;
                return this.token.equals(instrumentItem.token) && this.cellViewModel.equals(instrumentItem.cellViewModel);
            }

            public final int hashCode() {
                return this.cellViewModel.hashCode() + (this.token.hashCode() * 31);
            }

            public final String toString() {
                return "InstrumentItem(token=" + this.token + ", cellViewModel=" + this.cellViewModel + ")";
            }
        }

        public ManagedAccountInstrumentPicker(ArrayList arrayList, String str, String str2, String str3, String str4) {
            re$$ExternalSyntheticOutline0.m1432m(str, str2, str4);
            this.pickerTitle = str;
            this.pickerSubtitle = str2;
            this.instruments = arrayList;
            this.currentInstrumentToken = str3;
            this.doneButtonLabel = str4;
            new Money((Long) 0L, CurrencyCode.USD, 4);
            this.confirmationButtonLabel = "";
            this.allowSheetExpansion = true;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ManagedAccountInstrumentPicker)) {
                return false;
            }
            ManagedAccountInstrumentPicker managedAccountInstrumentPicker = (ManagedAccountInstrumentPicker) obj;
            return Intrinsics.areEqual(this.pickerTitle, managedAccountInstrumentPicker.pickerTitle) && Intrinsics.areEqual(this.pickerSubtitle, managedAccountInstrumentPicker.pickerSubtitle) && this.instruments.equals(managedAccountInstrumentPicker.instruments) && Intrinsics.areEqual(this.currentInstrumentToken, managedAccountInstrumentPicker.currentInstrumentToken) && Intrinsics.areEqual(this.doneButtonLabel, managedAccountInstrumentPicker.doneButtonLabel);
        }

        @Override // com.squareup.cash.transfers.viewmodels.AddMoneyViewModel
        public final boolean getAllowSheetExpansion() {
            return this.allowSheetExpansion;
        }

        @Override // com.squareup.cash.transfers.viewmodels.AddMoneyViewModel
        public final boolean getConfirmationButtonEnabled() {
            return false;
        }

        @Override // com.squareup.cash.transfers.viewmodels.AddMoneyViewModel
        public final String getConfirmationButtonLabel() {
            return this.confirmationButtonLabel;
        }

        @Override // com.squareup.cash.transfers.viewmodels.AddMoneyViewModel
        public final InstrumentCellViewModel getInstrumentCellViewModel() {
            return null;
        }

        @Override // com.squareup.cash.transfers.viewmodels.AddMoneyViewModel
        public final boolean getPayWithGooglePayButtonEnabled() {
            return false;
        }

        @Override // com.squareup.cash.transfers.viewmodels.AddMoneyViewModel
        public final String getPayWithGooglePayLabel() {
            return null;
        }

        @Override // com.squareup.cash.transfers.viewmodels.AddMoneyViewModel
        public final RecurringCashInToggle getRecurringCashInToggle() {
            return null;
        }

        public final int hashCode() {
            int m = CameraState$Type$EnumUnboxingLocalUtility.m(this.instruments, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.pickerTitle.hashCode() * 31, 31, this.pickerSubtitle), 31);
            String str = this.currentInstrumentToken;
            return this.doneButtonLabel.hashCode() + ((m + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ManagedAccountInstrumentPicker(pickerTitle=", this.pickerTitle, ", pickerSubtitle=", this.pickerSubtitle, ", instruments=");
            m.append(this.instruments);
            m.append(", currentInstrumentToken=");
            m.append(this.currentInstrumentToken);
            m.append(", doneButtonLabel=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.doneButtonLabel, ")");
        }
    }

    public final class RecurringCashInToggle {
        public final boolean checked;
        public final boolean enabled;
        public final String label;

        public RecurringCashInToggle(String str, boolean z, boolean z2) {
            str.getClass();
            this.label = str;
            this.checked = z;
            this.enabled = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RecurringCashInToggle)) {
                return false;
            }
            RecurringCashInToggle recurringCashInToggle = (RecurringCashInToggle) obj;
            return Intrinsics.areEqual(this.label, recurringCashInToggle.label) && this.checked == recurringCashInToggle.checked && this.enabled == recurringCashInToggle.enabled;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.enabled) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.label.hashCode() * 31, 31, this.checked);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Request$Priority$EnumUnboxingLocalUtility.m1540m("RecurringCashInToggle(label=", this.label, ", checked=", ", enabled=", this.checked), this.enabled, ")");
        }
    }

    boolean getAllowSheetExpansion();

    boolean getConfirmationButtonEnabled();

    String getConfirmationButtonLabel();

    InstrumentCellViewModel getInstrumentCellViewModel();

    boolean getPayWithGooglePayButtonEnabled();

    String getPayWithGooglePayLabel();

    RecurringCashInToggle getRecurringCashInToggle();
}
