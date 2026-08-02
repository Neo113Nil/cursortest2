package com.squareup.cash.transfers.viewmodels;

import com.knotapi.knot.utilities.Constants;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.transfers.viewmodels.RecurringReloadConfigurationViewModel;
import com.squareup.protos.common.Money;
import com.squareup.protos.repeatedly.common.RecurringSchedule;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public abstract class RecurringReloadConfigurationViewEvent {

    public final class AmountPickerItemSelected extends RecurringReloadConfigurationViewEvent {
        public final RecurringReloadConfigurationViewModel.AmountPickerItem item;

        public AmountPickerItemSelected(RecurringReloadConfigurationViewModel.AmountPickerItem amountPickerItem) {
            amountPickerItem.getClass();
            this.item = amountPickerItem;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AmountPickerItemSelected) && Intrinsics.areEqual(this.item, ((AmountPickerItemSelected) obj).item);
        }

        public final int hashCode() {
            return this.item.hashCode();
        }

        public final String toString() {
            return "AmountPickerItemSelected(item=" + this.item + ")";
        }
    }

    public final class Back extends RecurringReloadConfigurationViewEvent {
        public static final Back INSTANCE = new Back();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Back);
        }

        public final int hashCode() {
            return -1021565913;
        }

        public final String toString() {
            return Constants.META_BACK_BUTTON;
        }
    }

    public final class Close extends RecurringReloadConfigurationViewEvent {
        public static final Close INSTANCE = new Close();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return -1602509128;
        }

        public final String toString() {
            return Constants.META_CLOSE;
        }
    }

    public final class DayContinue extends RecurringReloadConfigurationViewEvent {
        public static final DayContinue INSTANCE = new DayContinue();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DayContinue);
        }

        public final int hashCode() {
            return -1583746781;
        }

        public final String toString() {
            return "DayContinue";
        }
    }

    /* loaded from: classes8.dex */
    public final class DaySelected extends RecurringReloadConfigurationViewEvent {
        public final int index;

        public DaySelected(int i) {
            this.index = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DaySelected) && this.index == ((DaySelected) obj).index;
        }

        public final int hashCode() {
            return Integer.hashCode(this.index);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.index, "DaySelected(index=", ")");
        }
    }

    public final class Expanded extends RecurringReloadConfigurationViewEvent {
        public static final Expanded INSTANCE = new Expanded();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Expanded);
        }

        public final int hashCode() {
            return -524801031;
        }

        public final String toString() {
            return "Expanded";
        }
    }

    public final class FrequencyContinue extends RecurringReloadConfigurationViewEvent {
        public static final FrequencyContinue INSTANCE = new FrequencyContinue();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof FrequencyContinue);
        }

        public final int hashCode() {
            return 1943053027;
        }

        public final String toString() {
            return "FrequencyContinue";
        }
    }

    public final class FrequencySelected extends RecurringReloadConfigurationViewEvent {
        public final RecurringSchedule.Frequency frequency;

        public FrequencySelected(RecurringSchedule.Frequency frequency) {
            frequency.getClass();
            this.frequency = frequency;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FrequencySelected) && this.frequency == ((FrequencySelected) obj).frequency;
        }

        public final int hashCode() {
            return this.frequency.hashCode();
        }

        public final String toString() {
            return "FrequencySelected(frequency=" + this.frequency + ")";
        }
    }

    /* loaded from: classes8.dex */
    public final class MinBalanceChanged extends RecurringReloadConfigurationViewEvent {
        public final Money amount;

        public MinBalanceChanged(Money money) {
            money.getClass();
            this.amount = money;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MinBalanceChanged) && Intrinsics.areEqual(this.amount, ((MinBalanceChanged) obj).amount);
        }

        public final int hashCode() {
            return this.amount.hashCode();
        }

        public final String toString() {
            return SVG$Unit$EnumUnboxingLocalUtility.m(this.amount, "MinBalanceChanged(amount=", ")");
        }
    }

    public final class MinBalanceContinue extends RecurringReloadConfigurationViewEvent {
        public static final MinBalanceContinue INSTANCE = new MinBalanceContinue();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof MinBalanceContinue);
        }

        public final int hashCode() {
            return -461031887;
        }

        public final String toString() {
            return "MinBalanceContinue";
        }
    }

    public final class Peeking extends RecurringReloadConfigurationViewEvent {
        public static final Peeking INSTANCE = new Peeking();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Peeking);
        }

        public final int hashCode() {
            return 324762983;
        }

        public final String toString() {
            return "Peeking";
        }
    }

    /* loaded from: classes8.dex */
    public final class ReloadAmountChanged extends RecurringReloadConfigurationViewEvent {
        public final Money amount;

        public ReloadAmountChanged(Money money) {
            money.getClass();
            this.amount = money;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ReloadAmountChanged) && Intrinsics.areEqual(this.amount, ((ReloadAmountChanged) obj).amount);
        }

        public final int hashCode() {
            return this.amount.hashCode();
        }

        public final String toString() {
            return SVG$Unit$EnumUnboxingLocalUtility.m(this.amount, "ReloadAmountChanged(amount=", ")");
        }
    }

    public final class ReloadAmountSubmit extends RecurringReloadConfigurationViewEvent {
        public static final ReloadAmountSubmit INSTANCE = new ReloadAmountSubmit();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ReloadAmountSubmit);
        }

        public final int hashCode() {
            return -2030730743;
        }

        public final String toString() {
            return "ReloadAmountSubmit";
        }
    }

    /* loaded from: classes8.dex */
    public final class ScheduledAmountChanged extends RecurringReloadConfigurationViewEvent {
        public final Money amount;

        public ScheduledAmountChanged(Money money) {
            money.getClass();
            this.amount = money;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ScheduledAmountChanged) && Intrinsics.areEqual(this.amount, ((ScheduledAmountChanged) obj).amount);
        }

        public final int hashCode() {
            return this.amount.hashCode();
        }

        public final String toString() {
            return SVG$Unit$EnumUnboxingLocalUtility.m(this.amount, "ScheduledAmountChanged(amount=", ")");
        }
    }

    public final class ScheduledAmountSubmit extends RecurringReloadConfigurationViewEvent {
        public static final ScheduledAmountSubmit INSTANCE = new ScheduledAmountSubmit();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ScheduledAmountSubmit);
        }

        public final int hashCode() {
            return -554525539;
        }

        public final String toString() {
            return "ScheduledAmountSubmit";
        }
    }
}
