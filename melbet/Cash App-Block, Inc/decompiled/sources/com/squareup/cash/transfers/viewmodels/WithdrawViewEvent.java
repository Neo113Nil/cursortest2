package com.squareup.cash.transfers.viewmodels;

import com.squareup.cash.securitysignals.models.SignalsContext;
import com.squareup.cash.transfers.viewmodels.WithdrawViewModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface WithdrawViewEvent {

    public final class ChangeInstrumentClick implements WithdrawViewEvent {
        public static final ChangeInstrumentClick INSTANCE = new ChangeInstrumentClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ChangeInstrumentClick);
        }

        public final int hashCode() {
            return -436563769;
        }

        public final String toString() {
            return "ChangeInstrumentClick";
        }
    }

    public final class CloseClick implements WithdrawViewEvent {
        public static final CloseClick INSTANCE = new CloseClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CloseClick);
        }

        public final int hashCode() {
            return 1627475834;
        }

        public final String toString() {
            return "CloseClick";
        }
    }

    public final class CtaClick implements WithdrawViewEvent {
        public static final CtaClick INSTANCE = new CtaClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CtaClick);
        }

        public final int hashCode() {
            return 283653346;
        }

        public final String toString() {
            return "CtaClick";
        }
    }

    public final class DepositPreferenceClick implements WithdrawViewEvent {
        public final WithdrawViewModel.DepositPreferenceOption depositPreferenceOption;
        public final SignalsContext signalsContext;

        public DepositPreferenceClick(WithdrawViewModel.DepositPreferenceOption depositPreferenceOption, SignalsContext signalsContext) {
            depositPreferenceOption.getClass();
            this.depositPreferenceOption = depositPreferenceOption;
            this.signalsContext = signalsContext;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DepositPreferenceClick)) {
                return false;
            }
            DepositPreferenceClick depositPreferenceClick = (DepositPreferenceClick) obj;
            return Intrinsics.areEqual(this.depositPreferenceOption, depositPreferenceClick.depositPreferenceOption) && this.signalsContext.equals(depositPreferenceClick.signalsContext);
        }

        public final int hashCode() {
            return this.signalsContext.touchEvents.hashCode() + (this.depositPreferenceOption.hashCode() * 31);
        }

        public final String toString() {
            return "DepositPreferenceClick(depositPreferenceOption=" + this.depositPreferenceOption + ", signalsContext=" + this.signalsContext + ")";
        }
    }

    public final class DismissChangeAmountClick implements WithdrawViewEvent {
        public static final DismissChangeAmountClick INSTANCE = new DismissChangeAmountClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DismissChangeAmountClick);
        }

        public final int hashCode() {
            return 551147616;
        }

        public final String toString() {
            return "DismissChangeAmountClick";
        }
    }

    public final class Expanded implements WithdrawViewEvent {
        public static final Expanded INSTANCE = new Expanded();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Expanded);
        }

        public final int hashCode() {
            return -813448125;
        }

        public final String toString() {
            return "Expanded";
        }
    }

    public final class OnAmountChanged implements WithdrawViewEvent {
        public final String amount;

        public OnAmountChanged(String str) {
            this.amount = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnAmountChanged) && this.amount.equals(((OnAmountChanged) obj).amount);
        }

        public final int hashCode() {
            return this.amount.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("OnAmountChanged(amount=", this.amount, ")");
        }
    }

    public final class Peeking implements WithdrawViewEvent {
        public static final Peeking INSTANCE = new Peeking();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Peeking);
        }

        public final int hashCode() {
            return -1208568867;
        }

        public final String toString() {
            return "Peeking";
        }
    }

    public final class SaveAmountClick implements WithdrawViewEvent {
        public static final SaveAmountClick INSTANCE = new SaveAmountClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SaveAmountClick);
        }

        public final int hashCode() {
            return -770294903;
        }

        public final String toString() {
            return "SaveAmountClick";
        }
    }
}
