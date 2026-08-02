package com.squareup.cash.transfers.viewmodels;

import com.knotapi.knot.utilities.Constants;

/* loaded from: classes7.dex */
public interface BalanceBasedAutoReloadConfirmationViewEvent {

    public final class Close implements BalanceBasedAutoReloadConfirmationViewEvent {
        public static final Close INSTANCE = new Close();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return 2055105444;
        }

        public final String toString() {
            return Constants.META_CLOSE;
        }
    }

    public final class ConfirmClicked implements BalanceBasedAutoReloadConfirmationViewEvent {
        public static final ConfirmClicked INSTANCE = new ConfirmClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ConfirmClicked);
        }

        public final int hashCode() {
            return -2116862693;
        }

        public final String toString() {
            return "ConfirmClicked";
        }
    }

    public final class EnterTransitionComplete implements BalanceBasedAutoReloadConfirmationViewEvent {
        public static final EnterTransitionComplete INSTANCE = new EnterTransitionComplete();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof EnterTransitionComplete);
        }

        public final int hashCode() {
            return -1873570478;
        }

        public final String toString() {
            return "EnterTransitionComplete";
        }
    }

    public final class IncrementAmountClicked implements BalanceBasedAutoReloadConfirmationViewEvent {
        public static final IncrementAmountClicked INSTANCE = new IncrementAmountClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof IncrementAmountClicked);
        }

        public final int hashCode() {
            return 1133131092;
        }

        public final String toString() {
            return "IncrementAmountClicked";
        }
    }

    public final class InstrumentCellTapped implements BalanceBasedAutoReloadConfirmationViewEvent {
        public static final InstrumentCellTapped INSTANCE = new InstrumentCellTapped();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof InstrumentCellTapped);
        }

        public final int hashCode() {
            return 386055849;
        }

        public final String toString() {
            return "InstrumentCellTapped";
        }
    }

    public final class MinimumBalanceClicked implements BalanceBasedAutoReloadConfirmationViewEvent {
        public static final MinimumBalanceClicked INSTANCE = new MinimumBalanceClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof MinimumBalanceClicked);
        }

        public final int hashCode() {
            return -1157403899;
        }

        public final String toString() {
            return "MinimumBalanceClicked";
        }
    }
}
