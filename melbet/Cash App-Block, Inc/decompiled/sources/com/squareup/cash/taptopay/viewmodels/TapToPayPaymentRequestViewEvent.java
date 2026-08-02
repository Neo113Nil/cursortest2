package com.squareup.cash.taptopay.viewmodels;

import com.knotapi.knot.utilities.Constants;

/* loaded from: classes7.dex */
public interface TapToPayPaymentRequestViewEvent {

    public final class Close implements TapToPayPaymentRequestViewEvent {
        public static final Close INSTANCE = new Close();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return 120341951;
        }

        public final String toString() {
            return Constants.META_CLOSE;
        }
    }

    public final class SendReceipt implements TapToPayPaymentRequestViewEvent {
        public static final SendReceipt INSTANCE = new SendReceipt();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SendReceipt);
        }

        public final int hashCode() {
            return 916678679;
        }

        public final String toString() {
            return "SendReceipt";
        }
    }
}
