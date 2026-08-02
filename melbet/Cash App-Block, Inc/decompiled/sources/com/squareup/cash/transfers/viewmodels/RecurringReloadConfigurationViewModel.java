package com.squareup.cash.transfers.viewmodels;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.wallet.screens.WalletHomeScreen;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.repeatedly.common.RecurringSchedule;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface RecurringReloadConfigurationViewModel extends Parcelable {

    public interface AmountPickerItem extends Parcelable {

        public final class Amount implements AmountPickerItem {
            public static final Parcelable.Creator<Amount> CREATOR = new WalletHomeScreen.Creator(19);
            public final Money amount;
            public final String label;
            public final boolean selected;

            public Amount(Money money, String str, boolean z) {
                str.getClass();
                money.getClass();
                this.label = str;
                this.selected = z;
                this.amount = money;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Amount)) {
                    return false;
                }
                Amount amount = (Amount) obj;
                return Intrinsics.areEqual(this.label, amount.label) && this.selected == amount.selected && Intrinsics.areEqual(this.amount, amount.amount);
            }

            @Override // com.squareup.cash.transfers.viewmodels.RecurringReloadConfigurationViewModel.AmountPickerItem
            public final String getLabel() {
                return this.label;
            }

            @Override // com.squareup.cash.transfers.viewmodels.RecurringReloadConfigurationViewModel.AmountPickerItem
            public final boolean getSelected() {
                return this.selected;
            }

            public final int hashCode() {
                return this.amount.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.label.hashCode() * 31, 31, this.selected);
            }

            public final String toString() {
                StringBuilder m1540m = Request$Priority$EnumUnboxingLocalUtility.m1540m("Amount(label=", this.label, ", selected=", ", amount=", this.selected);
                m1540m.append(this.amount);
                m1540m.append(")");
                return m1540m.toString();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeString(this.label);
                parcel.writeInt(this.selected ? 1 : 0);
                parcel.writeParcelable(this.amount, i);
            }
        }

        public final class Custom implements AmountPickerItem {
            public static final Parcelable.Creator<Custom> CREATOR = new WalletHomeScreen.Creator(20);
            public final String label;
            public final boolean selected;

            public Custom(String str, boolean z) {
                str.getClass();
                this.label = str;
                this.selected = z;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Custom)) {
                    return false;
                }
                Custom custom = (Custom) obj;
                return Intrinsics.areEqual(this.label, custom.label) && this.selected == custom.selected;
            }

            @Override // com.squareup.cash.transfers.viewmodels.RecurringReloadConfigurationViewModel.AmountPickerItem
            public final String getLabel() {
                return this.label;
            }

            @Override // com.squareup.cash.transfers.viewmodels.RecurringReloadConfigurationViewModel.AmountPickerItem
            public final boolean getSelected() {
                return this.selected;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.selected) + (this.label.hashCode() * 31);
            }

            public final String toString() {
                return Request$Priority$EnumUnboxingLocalUtility.m("Custom(label=", this.label, ", selected=", ")", this.selected);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeString(this.label);
                parcel.writeInt(this.selected ? 1 : 0);
            }
        }

        String getLabel();

        boolean getSelected();
    }

    public interface AtmPicker {
        List getAmountPickerItems();

        String getButtonLabel();

        boolean getEnableContinue();

        String getTitle();
    }

    public interface Keypad {
        String getButtonLabel();

        CurrencyCode getCurrency();

        Money getCurrentAmount();

        boolean getEnableContinue();

        long getMaxAmountCents();

        String getSubtitle();

        String getTitle();
    }

    /* loaded from: classes8.dex */
    public interface SelectMinBalance {
        Money getExistingReloadAmount();

        Money getMinBalance();
    }

    /* loaded from: classes8.dex */
    public interface SelectReloadAmount {
        Money getMinBalance();

        Money getReloadAmount();
    }

    public final class SelectReloadAmountAtmPicker implements RecurringReloadConfigurationViewModel, AtmPicker, SelectReloadAmount {
        public static final Parcelable.Creator<SelectReloadAmountAtmPicker> CREATOR = new WalletHomeScreen.Creator(23);
        public final List amountPickerItems;
        public final String buttonLabel;
        public final boolean enableContinue;
        public final Money minBalance;
        public final Money reloadAmount;
        public final String title;

        public SelectReloadAmountAtmPicker(Money money, Money money2, boolean z, String str, String str2, List list) {
            money.getClass();
            str.getClass();
            str2.getClass();
            list.getClass();
            this.minBalance = money;
            this.reloadAmount = money2;
            this.enableContinue = z;
            this.title = str;
            this.buttonLabel = str2;
            this.amountPickerItems = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v2, types: [java.util.List] */
        public static SelectReloadAmountAtmPicker copy$default(SelectReloadAmountAtmPicker selectReloadAmountAtmPicker, Money money, String str, String str2, ArrayList arrayList, int i) {
            Money money2 = selectReloadAmountAtmPicker.minBalance;
            if ((i & 2) != 0) {
                money = selectReloadAmountAtmPicker.reloadAmount;
            }
            Money money3 = money;
            boolean z = (i & 4) != 0 ? selectReloadAmountAtmPicker.enableContinue : true;
            if ((i & 8) != 0) {
                str = selectReloadAmountAtmPicker.title;
            }
            String str3 = str;
            if ((i & 16) != 0) {
                str2 = selectReloadAmountAtmPicker.buttonLabel;
            }
            String str4 = str2;
            ArrayList arrayList2 = arrayList;
            if ((i & 32) != 0) {
                arrayList2 = selectReloadAmountAtmPicker.amountPickerItems;
            }
            ArrayList arrayList3 = arrayList2;
            money2.getClass();
            str3.getClass();
            str4.getClass();
            arrayList3.getClass();
            return new SelectReloadAmountAtmPicker(money2, money3, z, str3, str4, arrayList3);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SelectReloadAmountAtmPicker)) {
                return false;
            }
            SelectReloadAmountAtmPicker selectReloadAmountAtmPicker = (SelectReloadAmountAtmPicker) obj;
            return Intrinsics.areEqual(this.minBalance, selectReloadAmountAtmPicker.minBalance) && Intrinsics.areEqual(this.reloadAmount, selectReloadAmountAtmPicker.reloadAmount) && this.enableContinue == selectReloadAmountAtmPicker.enableContinue && Intrinsics.areEqual(this.title, selectReloadAmountAtmPicker.title) && Intrinsics.areEqual(this.buttonLabel, selectReloadAmountAtmPicker.buttonLabel) && Intrinsics.areEqual(this.amountPickerItems, selectReloadAmountAtmPicker.amountPickerItems);
        }

        @Override // com.squareup.cash.transfers.viewmodels.RecurringReloadConfigurationViewModel.AtmPicker
        public final List getAmountPickerItems() {
            return this.amountPickerItems;
        }

        @Override // com.squareup.cash.transfers.viewmodels.RecurringReloadConfigurationViewModel.AtmPicker
        public final String getButtonLabel() {
            return this.buttonLabel;
        }

        @Override // com.squareup.cash.transfers.viewmodels.RecurringReloadConfigurationViewModel.AtmPicker
        public final boolean getEnableContinue() {
            return this.enableContinue;
        }

        @Override // com.squareup.cash.transfers.viewmodels.RecurringReloadConfigurationViewModel.SelectReloadAmount
        public final Money getMinBalance() {
            return this.minBalance;
        }

        @Override // com.squareup.cash.transfers.viewmodels.RecurringReloadConfigurationViewModel.SelectReloadAmount
        public final Money getReloadAmount() {
            return this.reloadAmount;
        }

        @Override // com.squareup.cash.transfers.viewmodels.RecurringReloadConfigurationViewModel.AtmPicker
        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            int hashCode = this.minBalance.hashCode() * 31;
            Money money = this.reloadAmount;
            return this.amountPickerItems.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (money == null ? 0 : money.hashCode())) * 31, 31, this.enableContinue), 31, this.title), 31, this.buttonLabel);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SelectReloadAmountAtmPicker(minBalance=");
            sb.append(this.minBalance);
            sb.append(", reloadAmount=");
            sb.append(this.reloadAmount);
            sb.append(", enableContinue=");
            NavAction$$ExternalSyntheticOutline0.m(sb, this.enableContinue, ", title=", this.title, ", buttonLabel=");
            sb.append(this.buttonLabel);
            sb.append(", amountPickerItems=");
            sb.append(this.amountPickerItems);
            sb.append(")");
            return sb.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.minBalance, i);
            parcel.writeParcelable(this.reloadAmount, i);
            parcel.writeInt(this.enableContinue ? 1 : 0);
            parcel.writeString(this.title);
            parcel.writeString(this.buttonLabel);
            Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.amountPickerItems, parcel);
            while (m.hasNext()) {
                parcel.writeParcelable((Parcelable) m.next(), i);
            }
        }
    }

    public final class SelectReloadAmountKeypad implements RecurringReloadConfigurationViewModel, Keypad, SelectReloadAmount {
        public static final Parcelable.Creator<SelectReloadAmountKeypad> CREATOR = new WalletHomeScreen.Creator(24);
        public final String buttonLabel;
        public final boolean enableContinue;
        public final long maxAmountCents;
        public final Money minBalance;
        public final Money reloadAmount;
        public final String subtitle;
        public final String title;

        public SelectReloadAmountKeypad(Money money, Money money2, boolean z, String str, String str2, String str3, long j) {
            money.getClass();
            str.getClass();
            str2.getClass();
            str3.getClass();
            this.minBalance = money;
            this.reloadAmount = money2;
            this.enableContinue = z;
            this.title = str;
            this.subtitle = str2;
            this.buttonLabel = str3;
            this.maxAmountCents = j;
        }

        public static SelectReloadAmountKeypad copy$default(SelectReloadAmountKeypad selectReloadAmountKeypad, Money money, boolean z, String str, String str2, String str3, int i) {
            Money money2 = selectReloadAmountKeypad.minBalance;
            if ((i & 2) != 0) {
                money = selectReloadAmountKeypad.reloadAmount;
            }
            Money money3 = money;
            if ((i & 4) != 0) {
                z = selectReloadAmountKeypad.enableContinue;
            }
            boolean z2 = z;
            if ((i & 8) != 0) {
                str = selectReloadAmountKeypad.title;
            }
            String str4 = str;
            if ((i & 16) != 0) {
                str2 = selectReloadAmountKeypad.subtitle;
            }
            String str5 = str2;
            if ((i & 32) != 0) {
                str3 = selectReloadAmountKeypad.buttonLabel;
            }
            String str6 = str3;
            long j = selectReloadAmountKeypad.maxAmountCents;
            money2.getClass();
            str4.getClass();
            str5.getClass();
            str6.getClass();
            return new SelectReloadAmountKeypad(money2, money3, z2, str4, str5, str6, j);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SelectReloadAmountKeypad)) {
                return false;
            }
            SelectReloadAmountKeypad selectReloadAmountKeypad = (SelectReloadAmountKeypad) obj;
            return Intrinsics.areEqual(this.minBalance, selectReloadAmountKeypad.minBalance) && Intrinsics.areEqual(this.reloadAmount, selectReloadAmountKeypad.reloadAmount) && this.enableContinue == selectReloadAmountKeypad.enableContinue && Intrinsics.areEqual(this.title, selectReloadAmountKeypad.title) && Intrinsics.areEqual(this.subtitle, selectReloadAmountKeypad.subtitle) && Intrinsics.areEqual(this.buttonLabel, selectReloadAmountKeypad.buttonLabel) && this.maxAmountCents == selectReloadAmountKeypad.maxAmountCents;
        }

        @Override // com.squareup.cash.transfers.viewmodels.RecurringReloadConfigurationViewModel.Keypad
        public final String getButtonLabel() {
            return this.buttonLabel;
        }

        @Override // com.squareup.cash.transfers.viewmodels.RecurringReloadConfigurationViewModel.Keypad
        public final CurrencyCode getCurrency() {
            CurrencyCode currencyCode = this.minBalance.currency_code;
            return currencyCode == null ? CurrencyCode.USD : currencyCode;
        }

        @Override // com.squareup.cash.transfers.viewmodels.RecurringReloadConfigurationViewModel.Keypad
        public final Money getCurrentAmount() {
            Money money = this.reloadAmount;
            return money == null ? new Money((Long) 0L, getCurrency(), 4) : money;
        }

        @Override // com.squareup.cash.transfers.viewmodels.RecurringReloadConfigurationViewModel.Keypad
        public final boolean getEnableContinue() {
            return this.enableContinue;
        }

        @Override // com.squareup.cash.transfers.viewmodels.RecurringReloadConfigurationViewModel.Keypad
        public final long getMaxAmountCents() {
            return this.maxAmountCents;
        }

        @Override // com.squareup.cash.transfers.viewmodels.RecurringReloadConfigurationViewModel.SelectReloadAmount
        public final Money getMinBalance() {
            return this.minBalance;
        }

        @Override // com.squareup.cash.transfers.viewmodels.RecurringReloadConfigurationViewModel.SelectReloadAmount
        public final Money getReloadAmount() {
            return this.reloadAmount;
        }

        @Override // com.squareup.cash.transfers.viewmodels.RecurringReloadConfigurationViewModel.Keypad
        public final String getSubtitle() {
            return this.subtitle;
        }

        @Override // com.squareup.cash.transfers.viewmodels.RecurringReloadConfigurationViewModel.Keypad
        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            int hashCode = this.minBalance.hashCode() * 31;
            Money money = this.reloadAmount;
            return Long.hashCode(this.maxAmountCents) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (money == null ? 0 : money.hashCode())) * 31, 31, this.enableContinue), 31, this.title), 31, this.subtitle), 31, this.buttonLabel);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SelectReloadAmountKeypad(minBalance=");
            sb.append(this.minBalance);
            sb.append(", reloadAmount=");
            sb.append(this.reloadAmount);
            sb.append(", enableContinue=");
            NavAction$$ExternalSyntheticOutline0.m(sb, this.enableContinue, ", title=", this.title, ", subtitle=");
            Boxes$$ExternalSyntheticOutline1.m(sb, this.subtitle, ", buttonLabel=", this.buttonLabel, ", maxAmountCents=");
            return CameraState$Type$EnumUnboxingLocalUtility.m(this.maxAmountCents, ")", sb);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.minBalance, i);
            parcel.writeParcelable(this.reloadAmount, i);
            parcel.writeInt(this.enableContinue ? 1 : 0);
            parcel.writeString(this.title);
            parcel.writeString(this.subtitle);
            parcel.writeString(this.buttonLabel);
            parcel.writeLong(this.maxAmountCents);
        }
    }

    public final class SelectFrequency implements RecurringReloadConfigurationViewModel {
        public static final Parcelable.Creator<SelectFrequency> CREATOR = new Creator();
        public final String buttonLabel;
        public final boolean enableContinue;
        public final RecurringSchedule.Frequency selectedFrequency;
        public final String title;

        public final class Creator implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new SelectFrequency(parcel.readInt() == 0 ? null : RecurringSchedule.Frequency.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelectFrequency[i];
            }
        }

        public SelectFrequency(RecurringSchedule.Frequency frequency, boolean z, String str, String str2) {
            str.getClass();
            str2.getClass();
            this.selectedFrequency = frequency;
            this.enableContinue = z;
            this.title = str;
            this.buttonLabel = str2;
        }

        public static SelectFrequency copy$default(SelectFrequency selectFrequency, RecurringSchedule.Frequency frequency, String str, String str2, int i) {
            if ((i & 1) != 0) {
                frequency = selectFrequency.selectedFrequency;
            }
            boolean z = (i & 2) != 0 ? selectFrequency.enableContinue : true;
            if ((i & 4) != 0) {
                str = selectFrequency.title;
            }
            if ((i & 8) != 0) {
                str2 = selectFrequency.buttonLabel;
            }
            str.getClass();
            str2.getClass();
            return new SelectFrequency(frequency, z, str, str2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SelectFrequency)) {
                return false;
            }
            SelectFrequency selectFrequency = (SelectFrequency) obj;
            return this.selectedFrequency == selectFrequency.selectedFrequency && this.enableContinue == selectFrequency.enableContinue && Intrinsics.areEqual(this.title, selectFrequency.title) && Intrinsics.areEqual(this.buttonLabel, selectFrequency.buttonLabel);
        }

        public final int hashCode() {
            RecurringSchedule.Frequency frequency = this.selectedFrequency;
            return this.buttonLabel.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((frequency == null ? 0 : frequency.hashCode()) * 31, 31, this.enableContinue), 31, this.title);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SelectFrequency(selectedFrequency=");
            sb.append(this.selectedFrequency);
            sb.append(", enableContinue=");
            sb.append(this.enableContinue);
            sb.append(", title=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.title, ", buttonLabel=", this.buttonLabel, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            RecurringSchedule.Frequency frequency = this.selectedFrequency;
            if (frequency == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(frequency.name());
            }
            parcel.writeInt(this.enableContinue ? 1 : 0);
            parcel.writeString(this.title);
            parcel.writeString(this.buttonLabel);
        }

        public /* synthetic */ SelectFrequency(RecurringSchedule.Frequency frequency, boolean z) {
            this(frequency, z, "", "");
        }
    }

    public final class SelectMinBalanceAtmPicker implements RecurringReloadConfigurationViewModel, AtmPicker, SelectMinBalance {
        public static final Parcelable.Creator<SelectMinBalanceAtmPicker> CREATOR = new WalletHomeScreen.Creator(21);
        public final List amountPickerItems;
        public final String buttonLabel;
        public final boolean enableContinue;
        public final Money existingReloadAmount;
        public final Money minBalance;
        public final String title;

        public SelectMinBalanceAtmPicker(Money money, Money money2, boolean z, String str, String str2, List list) {
            Request$Priority$EnumUnboxingLocalUtility.m(str, str2, list);
            this.minBalance = money;
            this.existingReloadAmount = money2;
            this.enableContinue = z;
            this.title = str;
            this.buttonLabel = str2;
            this.amountPickerItems = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v2, types: [java.util.List] */
        public static SelectMinBalanceAtmPicker copy$default(SelectMinBalanceAtmPicker selectMinBalanceAtmPicker, Money money, String str, String str2, ArrayList arrayList, int i) {
            if ((i & 1) != 0) {
                money = selectMinBalanceAtmPicker.minBalance;
            }
            Money money2 = money;
            Money money3 = selectMinBalanceAtmPicker.existingReloadAmount;
            boolean z = (i & 4) != 0 ? selectMinBalanceAtmPicker.enableContinue : true;
            if ((i & 8) != 0) {
                str = selectMinBalanceAtmPicker.title;
            }
            String str3 = str;
            if ((i & 16) != 0) {
                str2 = selectMinBalanceAtmPicker.buttonLabel;
            }
            String str4 = str2;
            ArrayList arrayList2 = arrayList;
            if ((i & 32) != 0) {
                arrayList2 = selectMinBalanceAtmPicker.amountPickerItems;
            }
            ArrayList arrayList3 = arrayList2;
            str3.getClass();
            str4.getClass();
            arrayList3.getClass();
            return new SelectMinBalanceAtmPicker(money2, money3, z, str3, str4, arrayList3);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SelectMinBalanceAtmPicker)) {
                return false;
            }
            SelectMinBalanceAtmPicker selectMinBalanceAtmPicker = (SelectMinBalanceAtmPicker) obj;
            return Intrinsics.areEqual(this.minBalance, selectMinBalanceAtmPicker.minBalance) && Intrinsics.areEqual(this.existingReloadAmount, selectMinBalanceAtmPicker.existingReloadAmount) && this.enableContinue == selectMinBalanceAtmPicker.enableContinue && Intrinsics.areEqual(this.title, selectMinBalanceAtmPicker.title) && Intrinsics.areEqual(this.buttonLabel, selectMinBalanceAtmPicker.buttonLabel) && Intrinsics.areEqual(this.amountPickerItems, selectMinBalanceAtmPicker.amountPickerItems);
        }

        @Override // com.squareup.cash.transfers.viewmodels.RecurringReloadConfigurationViewModel.AtmPicker
        public final List getAmountPickerItems() {
            return this.amountPickerItems;
        }

        @Override // com.squareup.cash.transfers.viewmodels.RecurringReloadConfigurationViewModel.AtmPicker
        public final String getButtonLabel() {
            return this.buttonLabel;
        }

        @Override // com.squareup.cash.transfers.viewmodels.RecurringReloadConfigurationViewModel.AtmPicker
        public final boolean getEnableContinue() {
            return this.enableContinue;
        }

        @Override // com.squareup.cash.transfers.viewmodels.RecurringReloadConfigurationViewModel.SelectMinBalance
        public final Money getExistingReloadAmount() {
            return this.existingReloadAmount;
        }

        @Override // com.squareup.cash.transfers.viewmodels.RecurringReloadConfigurationViewModel.SelectMinBalance
        public final Money getMinBalance() {
            return this.minBalance;
        }

        @Override // com.squareup.cash.transfers.viewmodels.RecurringReloadConfigurationViewModel.AtmPicker
        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            Money money = this.minBalance;
            int hashCode = (money == null ? 0 : money.hashCode()) * 31;
            Money money2 = this.existingReloadAmount;
            return this.amountPickerItems.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (money2 != null ? money2.hashCode() : 0)) * 31, 31, this.enableContinue), 31, this.title), 31, this.buttonLabel);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SelectMinBalanceAtmPicker(minBalance=");
            sb.append(this.minBalance);
            sb.append(", existingReloadAmount=");
            sb.append(this.existingReloadAmount);
            sb.append(", enableContinue=");
            NavAction$$ExternalSyntheticOutline0.m(sb, this.enableContinue, ", title=", this.title, ", buttonLabel=");
            sb.append(this.buttonLabel);
            sb.append(", amountPickerItems=");
            sb.append(this.amountPickerItems);
            sb.append(")");
            return sb.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.minBalance, i);
            parcel.writeParcelable(this.existingReloadAmount, i);
            parcel.writeInt(this.enableContinue ? 1 : 0);
            parcel.writeString(this.title);
            parcel.writeString(this.buttonLabel);
            Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.amountPickerItems, parcel);
            while (m.hasNext()) {
                parcel.writeParcelable((Parcelable) m.next(), i);
            }
        }

        public SelectMinBalanceAtmPicker(Money money, Money money2, boolean z) {
            this(money, money2, z, "", "", EmptyList.INSTANCE);
        }
    }

    public final class SelectMinBalanceKeypad implements RecurringReloadConfigurationViewModel, Keypad, SelectMinBalance {
        public static final Parcelable.Creator<SelectMinBalanceKeypad> CREATOR = new WalletHomeScreen.Creator(22);
        public final String buttonLabel;
        public final boolean enableContinue;
        public final Money existingReloadAmount;
        public final Money minBalance;
        public final String subtitle;
        public final String title;

        public SelectMinBalanceKeypad(Money money, Money money2, String str, String str2, String str3, boolean z) {
            re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
            this.minBalance = money;
            this.existingReloadAmount = money2;
            this.enableContinue = z;
            this.title = str;
            this.subtitle = str2;
            this.buttonLabel = str3;
        }

        public static SelectMinBalanceKeypad copy$default(SelectMinBalanceKeypad selectMinBalanceKeypad, Money money, boolean z, String str, String str2, String str3, int i) {
            if ((i & 1) != 0) {
                money = selectMinBalanceKeypad.minBalance;
            }
            Money money2 = money;
            Money money3 = selectMinBalanceKeypad.existingReloadAmount;
            if ((i & 4) != 0) {
                z = selectMinBalanceKeypad.enableContinue;
            }
            boolean z2 = z;
            if ((i & 8) != 0) {
                str = selectMinBalanceKeypad.title;
            }
            String str4 = str;
            if ((i & 16) != 0) {
                str2 = selectMinBalanceKeypad.subtitle;
            }
            String str5 = str2;
            if ((i & 32) != 0) {
                str3 = selectMinBalanceKeypad.buttonLabel;
            }
            String str6 = str3;
            str4.getClass();
            str5.getClass();
            str6.getClass();
            return new SelectMinBalanceKeypad(money2, money3, str4, str5, str6, z2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SelectMinBalanceKeypad)) {
                return false;
            }
            SelectMinBalanceKeypad selectMinBalanceKeypad = (SelectMinBalanceKeypad) obj;
            return Intrinsics.areEqual(this.minBalance, selectMinBalanceKeypad.minBalance) && Intrinsics.areEqual(this.existingReloadAmount, selectMinBalanceKeypad.existingReloadAmount) && this.enableContinue == selectMinBalanceKeypad.enableContinue && Intrinsics.areEqual(this.title, selectMinBalanceKeypad.title) && Intrinsics.areEqual(this.subtitle, selectMinBalanceKeypad.subtitle) && Intrinsics.areEqual(this.buttonLabel, selectMinBalanceKeypad.buttonLabel);
        }

        @Override // com.squareup.cash.transfers.viewmodels.RecurringReloadConfigurationViewModel.Keypad
        public final String getButtonLabel() {
            return this.buttonLabel;
        }

        @Override // com.squareup.cash.transfers.viewmodels.RecurringReloadConfigurationViewModel.Keypad
        public final CurrencyCode getCurrency() {
            CurrencyCode currencyCode;
            Money money = this.existingReloadAmount;
            return (money == null || (currencyCode = money.currency_code) == null) ? CurrencyCode.USD : currencyCode;
        }

        @Override // com.squareup.cash.transfers.viewmodels.RecurringReloadConfigurationViewModel.Keypad
        public final Money getCurrentAmount() {
            Money money = this.minBalance;
            return money == null ? new Money((Long) 0L, getCurrency(), 4) : money;
        }

        @Override // com.squareup.cash.transfers.viewmodels.RecurringReloadConfigurationViewModel.Keypad
        public final boolean getEnableContinue() {
            return this.enableContinue;
        }

        @Override // com.squareup.cash.transfers.viewmodels.RecurringReloadConfigurationViewModel.SelectMinBalance
        public final Money getExistingReloadAmount() {
            return this.existingReloadAmount;
        }

        @Override // com.squareup.cash.transfers.viewmodels.RecurringReloadConfigurationViewModel.Keypad
        public final long getMaxAmountCents() {
            return 100000L;
        }

        @Override // com.squareup.cash.transfers.viewmodels.RecurringReloadConfigurationViewModel.SelectMinBalance
        public final Money getMinBalance() {
            return this.minBalance;
        }

        @Override // com.squareup.cash.transfers.viewmodels.RecurringReloadConfigurationViewModel.Keypad
        public final String getSubtitle() {
            return this.subtitle;
        }

        @Override // com.squareup.cash.transfers.viewmodels.RecurringReloadConfigurationViewModel.Keypad
        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            Money money = this.minBalance;
            int hashCode = (money == null ? 0 : money.hashCode()) * 31;
            Money money2 = this.existingReloadAmount;
            return this.buttonLabel.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (money2 != null ? money2.hashCode() : 0)) * 31, 31, this.enableContinue), 31, this.title), 31, this.subtitle);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SelectMinBalanceKeypad(minBalance=");
            sb.append(this.minBalance);
            sb.append(", existingReloadAmount=");
            sb.append(this.existingReloadAmount);
            sb.append(", enableContinue=");
            NavAction$$ExternalSyntheticOutline0.m(sb, this.enableContinue, ", title=", this.title, ", subtitle=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.subtitle, ", buttonLabel=", this.buttonLabel, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.minBalance, i);
            parcel.writeParcelable(this.existingReloadAmount, i);
            parcel.writeInt(this.enableContinue ? 1 : 0);
            parcel.writeString(this.title);
            parcel.writeString(this.subtitle);
            parcel.writeString(this.buttonLabel);
        }

        public /* synthetic */ SelectMinBalanceKeypad(Money money, Money money2, boolean z) {
            this(money, money2, "", "", "", z);
        }
    }

    public final class SelectDay implements RecurringReloadConfigurationViewModel {
        public static final Parcelable.Creator<SelectDay> CREATOR = new Creator();
        public final String buttonLabel;
        public final String disclaimer;
        public final boolean enableContinue;
        public final RecurringSchedule.Frequency frequency;
        public final List items;
        public final Integer selectedIndex;
        public final String title;

        public final class Creator implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new SelectDay(parcel.readInt() == 0 ? null : RecurringSchedule.Frequency.valueOf(parcel.readString()), parcel.createStringArrayList(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelectDay[i];
            }
        }

        public SelectDay(RecurringSchedule.Frequency frequency, List list, Integer num, String str, boolean z, String str2, String str3) {
            list.getClass();
            str2.getClass();
            str3.getClass();
            this.frequency = frequency;
            this.items = list;
            this.selectedIndex = num;
            this.disclaimer = str;
            this.enableContinue = z;
            this.title = str2;
            this.buttonLabel = str3;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r9v10, types: [java.util.List] */
        public static SelectDay copy$default(SelectDay selectDay, ArrayList arrayList, Integer num, String str, String str2, String str3, int i) {
            RecurringSchedule.Frequency frequency = selectDay.frequency;
            ArrayList arrayList2 = arrayList;
            if ((i & 2) != 0) {
                arrayList2 = selectDay.items;
            }
            ArrayList arrayList3 = arrayList2;
            if ((i & 4) != 0) {
                num = selectDay.selectedIndex;
            }
            Integer num2 = num;
            if ((i & 8) != 0) {
                str = selectDay.disclaimer;
            }
            String str4 = str;
            boolean z = (i & 16) != 0 ? selectDay.enableContinue : true;
            if ((i & 32) != 0) {
                str2 = selectDay.title;
            }
            String str5 = str2;
            if ((i & 64) != 0) {
                str3 = selectDay.buttonLabel;
            }
            String str6 = str3;
            arrayList3.getClass();
            str5.getClass();
            str6.getClass();
            return new SelectDay(frequency, arrayList3, num2, str4, z, str5, str6);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SelectDay)) {
                return false;
            }
            SelectDay selectDay = (SelectDay) obj;
            return this.frequency == selectDay.frequency && Intrinsics.areEqual(this.items, selectDay.items) && Intrinsics.areEqual(this.selectedIndex, selectDay.selectedIndex) && Intrinsics.areEqual(this.disclaimer, selectDay.disclaimer) && this.enableContinue == selectDay.enableContinue && Intrinsics.areEqual(this.title, selectDay.title) && Intrinsics.areEqual(this.buttonLabel, selectDay.buttonLabel);
        }

        public final int hashCode() {
            RecurringSchedule.Frequency frequency = this.frequency;
            int m = Recorder$$ExternalSyntheticOutline2.m((frequency == null ? 0 : frequency.hashCode()) * 31, 31, this.items);
            Integer num = this.selectedIndex;
            int hashCode = (m + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.disclaimer;
            return this.buttonLabel.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str != null ? str.hashCode() : 0)) * 31, 31, this.enableContinue), 31, this.title);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SelectDay(frequency=");
            sb.append(this.frequency);
            sb.append(", items=");
            sb.append(this.items);
            sb.append(", selectedIndex=");
            NavAction$$ExternalSyntheticOutline0.m(sb, this.selectedIndex, ", disclaimer=", this.disclaimer, ", enableContinue=");
            NavAction$$ExternalSyntheticOutline0.m(sb, this.enableContinue, ", title=", this.title, ", buttonLabel=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.buttonLabel, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            RecurringSchedule.Frequency frequency = this.frequency;
            if (frequency == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(frequency.name());
            }
            parcel.writeStringList(this.items);
            Integer num = this.selectedIndex;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                NavAction$$ExternalSyntheticOutline0.m(parcel, 1, num);
            }
            parcel.writeString(this.disclaimer);
            parcel.writeInt(this.enableContinue ? 1 : 0);
            parcel.writeString(this.title);
            parcel.writeString(this.buttonLabel);
        }

        public SelectDay(RecurringSchedule.Frequency frequency, Integer num, boolean z) {
            this(frequency, EmptyList.INSTANCE, num, null, z, "", "");
        }
    }

    public final class SelectScheduledAmountAtmPicker implements RecurringReloadConfigurationViewModel, AtmPicker {
        public static final Parcelable.Creator<SelectScheduledAmountAtmPicker> CREATOR = new Creator();
        public final List amountPickerItems;
        public final String buttonLabel;
        public final Integer dayOfPeriod;
        public final boolean enableContinue;
        public final RecurringSchedule.Frequency frequency;
        public final Money selectedAmount;
        public final String subtitle;
        public final String title;

        public final class Creator implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                int i;
                parcel.getClass();
                RecurringSchedule.Frequency valueOf = parcel.readInt() == 0 ? null : RecurringSchedule.Frequency.valueOf(parcel.readString());
                Integer valueOf2 = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
                Money money = (Money) parcel.readParcelable(SelectScheduledAmountAtmPicker.class.getClassLoader());
                String readString = parcel.readString();
                int i2 = 0;
                boolean z = true;
                if (parcel.readInt() != 0) {
                    i = 1;
                } else {
                    i = 1;
                    z = false;
                }
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                while (i2 != readInt) {
                    i2 = CameraState$Type$EnumUnboxingLocalUtility.m(SelectScheduledAmountAtmPicker.class, parcel, arrayList, i2, i);
                }
                return new SelectScheduledAmountAtmPicker(valueOf, valueOf2, money, readString, z, readString2, readString3, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelectScheduledAmountAtmPicker[i];
            }
        }

        public SelectScheduledAmountAtmPicker(RecurringSchedule.Frequency frequency, Integer num, Money money, String str, boolean z, String str2, String str3, List list) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            list.getClass();
            this.frequency = frequency;
            this.dayOfPeriod = num;
            this.selectedAmount = money;
            this.subtitle = str;
            this.enableContinue = z;
            this.title = str2;
            this.buttonLabel = str3;
            this.amountPickerItems = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r14v2, types: [java.util.List] */
        public static SelectScheduledAmountAtmPicker copy$default(SelectScheduledAmountAtmPicker selectScheduledAmountAtmPicker, Money money, String str, String str2, String str3, ArrayList arrayList, int i) {
            RecurringSchedule.Frequency frequency = selectScheduledAmountAtmPicker.frequency;
            Integer num = selectScheduledAmountAtmPicker.dayOfPeriod;
            if ((i & 4) != 0) {
                money = selectScheduledAmountAtmPicker.selectedAmount;
            }
            Money money2 = money;
            if ((i & 8) != 0) {
                str = selectScheduledAmountAtmPicker.subtitle;
            }
            String str4 = str;
            boolean z = (i & 16) != 0 ? selectScheduledAmountAtmPicker.enableContinue : true;
            if ((i & 32) != 0) {
                str2 = selectScheduledAmountAtmPicker.title;
            }
            String str5 = str2;
            if ((i & 64) != 0) {
                str3 = selectScheduledAmountAtmPicker.buttonLabel;
            }
            String str6 = str3;
            ArrayList arrayList2 = arrayList;
            if ((i & 128) != 0) {
                arrayList2 = selectScheduledAmountAtmPicker.amountPickerItems;
            }
            ArrayList arrayList3 = arrayList2;
            str4.getClass();
            str5.getClass();
            str6.getClass();
            arrayList3.getClass();
            return new SelectScheduledAmountAtmPicker(frequency, num, money2, str4, z, str5, str6, arrayList3);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SelectScheduledAmountAtmPicker)) {
                return false;
            }
            SelectScheduledAmountAtmPicker selectScheduledAmountAtmPicker = (SelectScheduledAmountAtmPicker) obj;
            return this.frequency == selectScheduledAmountAtmPicker.frequency && Intrinsics.areEqual(this.dayOfPeriod, selectScheduledAmountAtmPicker.dayOfPeriod) && Intrinsics.areEqual(this.selectedAmount, selectScheduledAmountAtmPicker.selectedAmount) && Intrinsics.areEqual(this.subtitle, selectScheduledAmountAtmPicker.subtitle) && this.enableContinue == selectScheduledAmountAtmPicker.enableContinue && Intrinsics.areEqual(this.title, selectScheduledAmountAtmPicker.title) && Intrinsics.areEqual(this.buttonLabel, selectScheduledAmountAtmPicker.buttonLabel) && Intrinsics.areEqual(this.amountPickerItems, selectScheduledAmountAtmPicker.amountPickerItems);
        }

        @Override // com.squareup.cash.transfers.viewmodels.RecurringReloadConfigurationViewModel.AtmPicker
        public final List getAmountPickerItems() {
            return this.amountPickerItems;
        }

        @Override // com.squareup.cash.transfers.viewmodels.RecurringReloadConfigurationViewModel.AtmPicker
        public final String getButtonLabel() {
            return this.buttonLabel;
        }

        @Override // com.squareup.cash.transfers.viewmodels.RecurringReloadConfigurationViewModel.AtmPicker
        public final boolean getEnableContinue() {
            return this.enableContinue;
        }

        @Override // com.squareup.cash.transfers.viewmodels.RecurringReloadConfigurationViewModel.AtmPicker
        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            RecurringSchedule.Frequency frequency = this.frequency;
            int hashCode = (frequency == null ? 0 : frequency.hashCode()) * 31;
            Integer num = this.dayOfPeriod;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            Money money = this.selectedAmount;
            return this.amountPickerItems.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode2 + (money != null ? money.hashCode() : 0)) * 31, 31, this.subtitle), 31, this.enableContinue), 31, this.title), 31, this.buttonLabel);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SelectScheduledAmountAtmPicker(frequency=");
            sb.append(this.frequency);
            sb.append(", dayOfPeriod=");
            sb.append(this.dayOfPeriod);
            sb.append(", selectedAmount=");
            sb.append(this.selectedAmount);
            sb.append(", subtitle=");
            sb.append(this.subtitle);
            sb.append(", enableContinue=");
            NavAction$$ExternalSyntheticOutline0.m(sb, this.enableContinue, ", title=", this.title, ", buttonLabel=");
            sb.append(this.buttonLabel);
            sb.append(", amountPickerItems=");
            sb.append(this.amountPickerItems);
            sb.append(")");
            return sb.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            RecurringSchedule.Frequency frequency = this.frequency;
            if (frequency == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(frequency.name());
            }
            Integer num = this.dayOfPeriod;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                NavAction$$ExternalSyntheticOutline0.m(parcel, 1, num);
            }
            parcel.writeParcelable(this.selectedAmount, i);
            parcel.writeString(this.subtitle);
            parcel.writeInt(this.enableContinue ? 1 : 0);
            parcel.writeString(this.title);
            parcel.writeString(this.buttonLabel);
            Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.amountPickerItems, parcel);
            while (m.hasNext()) {
                parcel.writeParcelable((Parcelable) m.next(), i);
            }
        }

        public SelectScheduledAmountAtmPicker(RecurringSchedule.Frequency frequency, Integer num, Money money, boolean z, int i) {
            this(frequency, num, (i & 4) != 0 ? null : money, "", (i & 16) != 0 ? false : z, "", "", EmptyList.INSTANCE);
        }
    }

    public final class SelectScheduledAmountKeypad implements RecurringReloadConfigurationViewModel, Keypad {
        public static final Parcelable.Creator<SelectScheduledAmountKeypad> CREATOR = new Creator();
        public final Money amount;
        public final String buttonLabel;
        public final Integer dayOfPeriod;
        public final boolean enableContinue;
        public final RecurringSchedule.Frequency frequency;
        public final long maxAmountCents;
        public final String subtitle;
        public final String title;

        public final class Creator implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new SelectScheduledAmountKeypad(parcel.readInt() == 0 ? null : RecurringSchedule.Frequency.valueOf(parcel.readString()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString(), (Money) parcel.readParcelable(SelectScheduledAmountKeypad.class.getClassLoader()), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readLong());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelectScheduledAmountKeypad[i];
            }
        }

        public SelectScheduledAmountKeypad(RecurringSchedule.Frequency frequency, Integer num, String str, Money money, boolean z, String str2, String str3, long j) {
            str.getClass();
            money.getClass();
            str2.getClass();
            str3.getClass();
            this.frequency = frequency;
            this.dayOfPeriod = num;
            this.subtitle = str;
            this.amount = money;
            this.enableContinue = z;
            this.title = str2;
            this.buttonLabel = str3;
            this.maxAmountCents = j;
        }

        public static SelectScheduledAmountKeypad copy$default(SelectScheduledAmountKeypad selectScheduledAmountKeypad, String str, Money money, boolean z, String str2, String str3, int i) {
            RecurringSchedule.Frequency frequency = selectScheduledAmountKeypad.frequency;
            Integer num = selectScheduledAmountKeypad.dayOfPeriod;
            if ((i & 4) != 0) {
                str = selectScheduledAmountKeypad.subtitle;
            }
            String str4 = str;
            if ((i & 8) != 0) {
                money = selectScheduledAmountKeypad.amount;
            }
            Money money2 = money;
            if ((i & 16) != 0) {
                z = selectScheduledAmountKeypad.enableContinue;
            }
            boolean z2 = z;
            if ((i & 32) != 0) {
                str2 = selectScheduledAmountKeypad.title;
            }
            String str5 = str2;
            if ((i & 64) != 0) {
                str3 = selectScheduledAmountKeypad.buttonLabel;
            }
            String str6 = str3;
            long j = selectScheduledAmountKeypad.maxAmountCents;
            str4.getClass();
            money2.getClass();
            str5.getClass();
            str6.getClass();
            return new SelectScheduledAmountKeypad(frequency, num, str4, money2, z2, str5, str6, j);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SelectScheduledAmountKeypad)) {
                return false;
            }
            SelectScheduledAmountKeypad selectScheduledAmountKeypad = (SelectScheduledAmountKeypad) obj;
            return this.frequency == selectScheduledAmountKeypad.frequency && Intrinsics.areEqual(this.dayOfPeriod, selectScheduledAmountKeypad.dayOfPeriod) && Intrinsics.areEqual(this.subtitle, selectScheduledAmountKeypad.subtitle) && Intrinsics.areEqual(this.amount, selectScheduledAmountKeypad.amount) && this.enableContinue == selectScheduledAmountKeypad.enableContinue && Intrinsics.areEqual(this.title, selectScheduledAmountKeypad.title) && Intrinsics.areEqual(this.buttonLabel, selectScheduledAmountKeypad.buttonLabel) && this.maxAmountCents == selectScheduledAmountKeypad.maxAmountCents;
        }

        @Override // com.squareup.cash.transfers.viewmodels.RecurringReloadConfigurationViewModel.Keypad
        public final String getButtonLabel() {
            return this.buttonLabel;
        }

        @Override // com.squareup.cash.transfers.viewmodels.RecurringReloadConfigurationViewModel.Keypad
        public final CurrencyCode getCurrency() {
            CurrencyCode currencyCode = this.amount.currency_code;
            return currencyCode == null ? CurrencyCode.USD : currencyCode;
        }

        @Override // com.squareup.cash.transfers.viewmodels.RecurringReloadConfigurationViewModel.Keypad
        public final Money getCurrentAmount() {
            return this.amount;
        }

        @Override // com.squareup.cash.transfers.viewmodels.RecurringReloadConfigurationViewModel.Keypad
        public final boolean getEnableContinue() {
            return this.enableContinue;
        }

        @Override // com.squareup.cash.transfers.viewmodels.RecurringReloadConfigurationViewModel.Keypad
        public final long getMaxAmountCents() {
            return this.maxAmountCents;
        }

        @Override // com.squareup.cash.transfers.viewmodels.RecurringReloadConfigurationViewModel.Keypad
        public final String getSubtitle() {
            return this.subtitle;
        }

        @Override // com.squareup.cash.transfers.viewmodels.RecurringReloadConfigurationViewModel.Keypad
        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            RecurringSchedule.Frequency frequency = this.frequency;
            int hashCode = (frequency == null ? 0 : frequency.hashCode()) * 31;
            Integer num = this.dayOfPeriod;
            return Long.hashCode(this.maxAmountCents) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(NavAction$$ExternalSyntheticOutline0.m(this.amount, JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (num != null ? num.hashCode() : 0)) * 31, 31, this.subtitle), 31), 31, this.enableContinue), 31, this.title), 31, this.buttonLabel);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SelectScheduledAmountKeypad(frequency=");
            sb.append(this.frequency);
            sb.append(", dayOfPeriod=");
            sb.append(this.dayOfPeriod);
            sb.append(", subtitle=");
            sb.append(this.subtitle);
            sb.append(", amount=");
            sb.append(this.amount);
            sb.append(", enableContinue=");
            NavAction$$ExternalSyntheticOutline0.m(sb, this.enableContinue, ", title=", this.title, ", buttonLabel=");
            sb.append(this.buttonLabel);
            sb.append(", maxAmountCents=");
            sb.append(this.maxAmountCents);
            sb.append(")");
            return sb.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            RecurringSchedule.Frequency frequency = this.frequency;
            if (frequency == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(frequency.name());
            }
            Integer num = this.dayOfPeriod;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                NavAction$$ExternalSyntheticOutline0.m(parcel, 1, num);
            }
            parcel.writeString(this.subtitle);
            parcel.writeParcelable(this.amount, i);
            parcel.writeInt(this.enableContinue ? 1 : 0);
            parcel.writeString(this.title);
            parcel.writeString(this.buttonLabel);
            parcel.writeLong(this.maxAmountCents);
        }

        public /* synthetic */ SelectScheduledAmountKeypad(RecurringSchedule.Frequency frequency, Integer num, Money money, boolean z) {
            this(frequency, num, "", money, z, "", "", 100000L);
        }
    }
}
