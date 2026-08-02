package com.squareup.cash.taptopay.backend.api;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Arrays;

/* loaded from: classes7.dex */
public interface EmvPaymentResult {

    public final class PaymentAuthRequested implements EmvPaymentResult {
        public final byte[] authorizationData;

        public PaymentAuthRequested(byte[] bArr) {
            bArr.getClass();
            this.authorizationData = bArr;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!PaymentAuthRequested.class.equals(obj != null ? obj.getClass() : null)) {
                return false;
            }
            obj.getClass();
            return Arrays.equals(this.authorizationData, ((PaymentAuthRequested) obj).authorizationData);
        }

        public final int hashCode() {
            return Arrays.hashCode(this.authorizationData);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("PaymentAuthRequested(authorizationData=", Arrays.toString(this.authorizationData), ")");
        }
    }

    public final class PaymentDeclined implements EmvPaymentResult {
        public final String errorLogs;

        public PaymentDeclined(String str) {
            this.errorLogs = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PaymentDeclined) && this.errorLogs.equals(((PaymentDeclined) obj).errorLogs);
        }

        public final int hashCode() {
            return this.errorLogs.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("PaymentDeclined(errorLogs=", this.errorLogs, ")");
        }
    }
}
