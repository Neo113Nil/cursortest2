package com.squareup.cash.taptopay.backend.api;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface TapToPayPaymentAcceptance {

    public final class PaymentAccepted implements TapToPayPaymentAcceptance {
        public final String receiptClientRouteUrl;

        public PaymentAccepted(String str) {
            str.getClass();
            this.receiptClientRouteUrl = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PaymentAccepted) && Intrinsics.areEqual(this.receiptClientRouteUrl, ((PaymentAccepted) obj).receiptClientRouteUrl);
        }

        public final int hashCode() {
            return this.receiptClientRouteUrl.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("PaymentAccepted(receiptClientRouteUrl=", this.receiptClientRouteUrl, ")");
        }
    }

    public final class PaymentFailed implements TapToPayPaymentAcceptance {
        public final String errorMessage;

        public PaymentFailed(String str) {
            this.errorMessage = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PaymentFailed) && Intrinsics.areEqual(this.errorMessage, ((PaymentFailed) obj).errorMessage);
        }

        public final int hashCode() {
            String str = this.errorMessage;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("PaymentFailed(errorMessage=", this.errorMessage, ")");
        }
    }
}
