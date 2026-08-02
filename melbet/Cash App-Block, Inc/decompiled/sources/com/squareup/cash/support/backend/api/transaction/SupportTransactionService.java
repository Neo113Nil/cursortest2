package com.squareup.cash.support.backend.api.transaction;

import com.squareup.cash.support.backend.api.activities.SupportTransaction;

/* loaded from: classes7.dex */
public interface SupportTransactionService {

    public interface SupportTransactionResult {

        public final class Failure implements SupportTransactionResult {
            public static final Failure INSTANCE = new Failure();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Failure);
            }

            public final int hashCode() {
                return -702040449;
            }

            public final String toString() {
                return "Failure";
            }
        }

        public final class Success implements SupportTransactionResult {
            public final SupportTransaction transaction;

            public Success(SupportTransaction supportTransaction) {
                this.transaction = supportTransaction;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Success) && this.transaction.equals(((Success) obj).transaction);
            }

            public final int hashCode() {
                return this.transaction.hashCode();
            }

            public final String toString() {
                return "Success(transaction=" + this.transaction + ")";
            }
        }
    }
}
