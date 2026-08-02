package com.squareup.cash.transfers.viewmodels;

import com.squareup.cash.transfers.viewmodels.AddMoneyViewModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface AddMoneyViewEvent {

    public final class AmountKeypadEntered implements AddMoneyViewEvent {
        public final String amount;

        public AmountKeypadEntered(String str) {
            this.amount = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AmountKeypadEntered) && this.amount.equals(((AmountKeypadEntered) obj).amount);
        }

        public final int hashCode() {
            return this.amount.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AmountKeypadEntered(amount=", this.amount, ")");
        }
    }

    public final class AmountPickerItemSelected implements AddMoneyViewEvent {
        public final AddMoneyViewModel.AtmPicker.AmountPickerItem item;

        public AmountPickerItemSelected(AddMoneyViewModel.AtmPicker.AmountPickerItem amountPickerItem) {
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

    /* loaded from: classes6.dex */
    public final class ChangeInstrumentClick implements AddMoneyViewEvent {
        public static final ChangeInstrumentClick INSTANCE = new ChangeInstrumentClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ChangeInstrumentClick);
        }

        public final int hashCode() {
            return -1162824558;
        }

        public final String toString() {
            return "ChangeInstrumentClick";
        }
    }

    public final class CloseClick implements AddMoneyViewEvent {
        public static final CloseClick INSTANCE = new CloseClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CloseClick);
        }

        public final int hashCode() {
            return 1616616591;
        }

        public final String toString() {
            return "CloseClick";
        }
    }

    /* loaded from: classes6.dex */
    public final class CtaClick implements AddMoneyViewEvent {
        public static final CtaClick INSTANCE = new CtaClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CtaClick);
        }

        public final int hashCode() {
            return -1892891849;
        }

        public final String toString() {
            return "CtaClick";
        }
    }

    public final class Expanded implements AddMoneyViewEvent {
        public static final Expanded INSTANCE = new Expanded();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Expanded);
        }

        public final int hashCode() {
            return 1304973976;
        }

        public final String toString() {
            return "Expanded";
        }
    }

    public final class InstrumentPickerDoneClick implements AddMoneyViewEvent {
        public static final InstrumentPickerDoneClick INSTANCE = new InstrumentPickerDoneClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof InstrumentPickerDoneClick);
        }

        public final int hashCode() {
            return -1343060142;
        }

        public final String toString() {
            return "InstrumentPickerDoneClick";
        }
    }

    public final class InstrumentSelected implements AddMoneyViewEvent {
        public final String token;

        public InstrumentSelected(String str) {
            this.token = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InstrumentSelected) && this.token.equals(((InstrumentSelected) obj).token);
        }

        public final int hashCode() {
            return this.token.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("InstrumentSelected(token=", this.token, ")");
        }
    }

    public final class PayWithGooglePayClick implements AddMoneyViewEvent {
        public static final PayWithGooglePayClick INSTANCE = new PayWithGooglePayClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PayWithGooglePayClick);
        }

        public final int hashCode() {
            return 1306271944;
        }

        public final String toString() {
            return "PayWithGooglePayClick";
        }
    }

    public final class Peeking implements AddMoneyViewEvent {
        public static final Peeking INSTANCE = new Peeking();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Peeking);
        }

        public final int hashCode() {
            return 1215071976;
        }

        public final String toString() {
            return "Peeking";
        }
    }

    public final class RecurringCashInToggleClick implements AddMoneyViewEvent {
        public static final RecurringCashInToggleClick INSTANCE = new RecurringCashInToggleClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RecurringCashInToggleClick);
        }

        public final int hashCode() {
            return 776929918;
        }

        public final String toString() {
            return "RecurringCashInToggleClick";
        }
    }
}
