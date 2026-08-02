package com.squareup.cash.support.viewmodels;

import com.squareup.cash.support.backend.api.disputesTracker.DisputeRow;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface SupportDisputeTrackerViewEvent {

    public final class GoBack implements SupportDisputeTrackerViewEvent {
        public static final GoBack INSTANCE = new GoBack();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof GoBack);
        }

        public final int hashCode() {
            return -1515798531;
        }

        public final String toString() {
            return "GoBack";
        }
    }

    public final class ScrollToBottom implements SupportDisputeTrackerViewEvent {
        public static final ScrollToBottom INSTANCE = new ScrollToBottom();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ScrollToBottom);
        }

        public final int hashCode() {
            return -609371519;
        }

        public final String toString() {
            return "ScrollToBottom";
        }
    }

    public final class TransactionClicked implements SupportDisputeTrackerViewEvent {
        public final DisputeRow transaction;

        public TransactionClicked(DisputeRow disputeRow) {
            disputeRow.getClass();
            this.transaction = disputeRow;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TransactionClicked) && Intrinsics.areEqual(this.transaction, ((TransactionClicked) obj).transaction);
        }

        public final int hashCode() {
            return this.transaction.hashCode();
        }

        public final String toString() {
            return "TransactionClicked(transaction=" + this.transaction + ")";
        }
    }
}
