package com.squareup.cash.transfers.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.instruments.viewmodels.InstrumentCellViewModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class RecurringReloadOptionViewModel {
    public final String description;
    public final Settings settings;
    public final String title;
    public final String toggleButtonLabel;
    public final String toggleLabel;

    public final class SettingRow {
        public final String label;
        public final String value;

        public SettingRow(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.label = str;
            this.value = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SettingRow)) {
                return false;
            }
            SettingRow settingRow = (SettingRow) obj;
            return Intrinsics.areEqual(this.label, settingRow.label) && Intrinsics.areEqual(this.value, settingRow.value);
        }

        public final int hashCode() {
            return this.value.hashCode() + (this.label.hashCode() * 31);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("SettingRow(label=", this.label, ", value=", this.value, ")");
        }
    }

    public interface Settings {

        public final class BalanceBased implements Settings {
            public final InstrumentCellViewModel from;
            public final SettingRow incrementAmount;
            public final SettingRow minimumBalance;

            public BalanceBased(SettingRow settingRow, SettingRow settingRow2, InstrumentCellViewModel instrumentCellViewModel) {
                this.minimumBalance = settingRow;
                this.incrementAmount = settingRow2;
                this.from = instrumentCellViewModel;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof BalanceBased)) {
                    return false;
                }
                BalanceBased balanceBased = (BalanceBased) obj;
                return this.minimumBalance.equals(balanceBased.minimumBalance) && this.incrementAmount.equals(balanceBased.incrementAmount) && Intrinsics.areEqual(this.from, balanceBased.from);
            }

            @Override // com.squareup.cash.transfers.viewmodels.RecurringReloadOptionViewModel.Settings
            public final InstrumentCellViewModel getFrom() {
                return this.from;
            }

            public final int hashCode() {
                int hashCode = (this.incrementAmount.hashCode() + (this.minimumBalance.hashCode() * 31)) * 31;
                InstrumentCellViewModel instrumentCellViewModel = this.from;
                return hashCode + (instrumentCellViewModel == null ? 0 : instrumentCellViewModel.hashCode());
            }

            public final String toString() {
                return "BalanceBased(minimumBalance=" + this.minimumBalance + ", incrementAmount=" + this.incrementAmount + ", from=" + this.from + ")";
            }
        }

        public final class Scheduled implements Settings {
            public final SettingRow amount;
            public final SettingRow frequency;
            public final SettingRow frequencyDay;
            public final InstrumentCellViewModel from;

            public Scheduled(SettingRow settingRow, SettingRow settingRow2, SettingRow settingRow3, InstrumentCellViewModel instrumentCellViewModel) {
                this.frequency = settingRow;
                this.frequencyDay = settingRow2;
                this.amount = settingRow3;
                this.from = instrumentCellViewModel;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Scheduled)) {
                    return false;
                }
                Scheduled scheduled = (Scheduled) obj;
                return this.frequency.equals(scheduled.frequency) && Intrinsics.areEqual(this.frequencyDay, scheduled.frequencyDay) && this.amount.equals(scheduled.amount) && Intrinsics.areEqual(this.from, scheduled.from);
            }

            @Override // com.squareup.cash.transfers.viewmodels.RecurringReloadOptionViewModel.Settings
            public final InstrumentCellViewModel getFrom() {
                return this.from;
            }

            public final int hashCode() {
                int hashCode = this.frequency.hashCode() * 31;
                SettingRow settingRow = this.frequencyDay;
                int hashCode2 = (this.amount.hashCode() + ((hashCode + (settingRow == null ? 0 : settingRow.hashCode())) * 31)) * 31;
                InstrumentCellViewModel instrumentCellViewModel = this.from;
                return hashCode2 + (instrumentCellViewModel != null ? instrumentCellViewModel.hashCode() : 0);
            }

            public final String toString() {
                return "Scheduled(frequency=" + this.frequency + ", frequencyDay=" + this.frequencyDay + ", amount=" + this.amount + ", from=" + this.from + ")";
            }
        }

        InstrumentCellViewModel getFrom();
    }

    public RecurringReloadOptionViewModel(String str, String str2, String str3, String str4, Settings settings) {
        Request$Priority$EnumUnboxingLocalUtility.m(str, str2, str3, str4);
        this.title = str;
        this.description = str2;
        this.toggleLabel = str3;
        this.toggleButtonLabel = str4;
        this.settings = settings;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecurringReloadOptionViewModel)) {
            return false;
        }
        RecurringReloadOptionViewModel recurringReloadOptionViewModel = (RecurringReloadOptionViewModel) obj;
        return Intrinsics.areEqual(this.title, recurringReloadOptionViewModel.title) && Intrinsics.areEqual(this.description, recurringReloadOptionViewModel.description) && Intrinsics.areEqual(this.toggleLabel, recurringReloadOptionViewModel.toggleLabel) && Intrinsics.areEqual(this.toggleButtonLabel, recurringReloadOptionViewModel.toggleButtonLabel) && this.settings.equals(recurringReloadOptionViewModel.settings);
    }

    public final int hashCode() {
        return this.settings.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.description), 31, this.toggleLabel), 31, this.toggleButtonLabel);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("RecurringReloadOptionViewModel(title=", this.title, ", description=", this.description, ", toggleLabel=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.toggleLabel, ", toggleButtonLabel=", this.toggleButtonLabel, ", settings=");
        m.append(this.settings);
        m.append(")");
        return m.toString();
    }
}
