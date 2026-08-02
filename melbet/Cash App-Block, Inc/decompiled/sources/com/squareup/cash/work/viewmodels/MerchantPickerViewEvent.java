package com.squareup.cash.work.viewmodels;

import com.squareup.cash.work.identifiers.MerchantIdentifier;

/* loaded from: classes7.dex */
public interface MerchantPickerViewEvent {

    public final class DismissClicked implements MerchantPickerViewEvent {
        public static final DismissClicked INSTANCE = new DismissClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DismissClicked);
        }

        public final int hashCode() {
            return -2052872704;
        }

        public final String toString() {
            return "DismissClicked";
        }
    }

    /* loaded from: classes8.dex */
    public final class SelectMerchant implements MerchantPickerViewEvent {
        public final MerchantIdentifier merchant;

        public SelectMerchant(MerchantIdentifier merchantIdentifier) {
            this.merchant = merchantIdentifier;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SelectMerchant) && this.merchant.equals(((SelectMerchant) obj).merchant);
        }

        public final int hashCode() {
            return this.merchant.token.hashCode();
        }

        public final String toString() {
            return "SelectMerchant(merchant=" + this.merchant + ")";
        }
    }

    public final class UpdateClicked implements MerchantPickerViewEvent {
        public static final UpdateClicked INSTANCE = new UpdateClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof UpdateClicked);
        }

        public final int hashCode() {
            return -1111922949;
        }

        public final String toString() {
            return "UpdateClicked";
        }
    }
}
