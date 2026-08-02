package com.squareup.cash.taptopay.presenters;

import android.nfc.Tag;
import com.squareup.cash.taptopay.backend.api.EmvPaymentResult;
import com.squareup.cash.taptopay.backend.real.RealTagCommunication;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface TapToPayPaymentPresenter$State {

    public final class CardDetected implements TapToPayPaymentPresenter$State {
        public final RealTagCommunication tag;

        public CardDetected(RealTagCommunication realTagCommunication) {
            this.tag = realTagCommunication;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CardDetected) && this.tag == ((CardDetected) obj).tag;
        }

        public final int hashCode() {
            return this.tag.hashCode();
        }

        public final String toString() {
            return "CardDetected(tag=" + this.tag + ")";
        }
    }

    public final class CardTapped implements TapToPayPaymentPresenter$State {
        public final Tag tag;

        public CardTapped(Tag tag) {
            this.tag = tag;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CardTapped) && Intrinsics.areEqual(this.tag, ((CardTapped) obj).tag);
        }

        public final int hashCode() {
            Tag tag = this.tag;
            if (tag == null) {
                return 0;
            }
            return tag.hashCode();
        }

        public final String toString() {
            return "CardTapped(tag=" + this.tag + ")";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class FailureReason {
        public static final /* synthetic */ FailureReason[] $VALUES;
        public static final FailureReason APDU_TRANSCEIVE_ERROR;
        public static final FailureReason NFC_TAG_CONNECTION_ERROR;
        public static final FailureReason PAYMENT_DECLINED;
        public static final FailureReason UNEXPECTED_PAYMENT_RESULT;

        static {
            FailureReason failureReason = new FailureReason("NFC_TAG_CONNECTION_ERROR", 0);
            NFC_TAG_CONNECTION_ERROR = failureReason;
            FailureReason failureReason2 = new FailureReason("APDU_TRANSCEIVE_ERROR", 1);
            APDU_TRANSCEIVE_ERROR = failureReason2;
            FailureReason failureReason3 = new FailureReason("PAYMENT_DECLINED", 2);
            PAYMENT_DECLINED = failureReason3;
            FailureReason failureReason4 = new FailureReason("UNEXPECTED_PAYMENT_RESULT", 3);
            UNEXPECTED_PAYMENT_RESULT = failureReason4;
            $VALUES = new FailureReason[]{failureReason, failureReason2, failureReason3, failureReason4};
        }

        public static FailureReason valueOf(String str) {
            return (FailureReason) Enum.valueOf(FailureReason.class, str);
        }

        public static FailureReason[] values() {
            return (FailureReason[]) $VALUES.clone();
        }
    }

    public final class Initialized implements TapToPayPaymentPresenter$State {
        public static final Initialized INSTANCE = new Initialized();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Initialized);
        }

        public final int hashCode() {
            return -1270601050;
        }

        public final String toString() {
            return "Initialized";
        }
    }

    public final class PaymentRequested implements TapToPayPaymentPresenter$State {
        public final EmvPaymentResult requestData;

        public PaymentRequested(EmvPaymentResult emvPaymentResult) {
            this.requestData = emvPaymentResult;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PaymentRequested) && this.requestData.equals(((PaymentRequested) obj).requestData);
        }

        public final int hashCode() {
            return this.requestData.hashCode();
        }

        public final String toString() {
            return "PaymentRequested(requestData=" + this.requestData + ")";
        }
    }

    /* loaded from: classes8.dex */
    public final class ProcessingCardData implements TapToPayPaymentPresenter$State {
        public final RealTagCommunication tag;

        public ProcessingCardData(RealTagCommunication realTagCommunication) {
            this.tag = realTagCommunication;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ProcessingCardData) && this.tag == ((ProcessingCardData) obj).tag;
        }

        public final int hashCode() {
            return this.tag.hashCode();
        }

        public final String toString() {
            return "ProcessingCardData(tag=" + this.tag + ")";
        }
    }

    public final class RetryableFailure implements TapToPayPaymentPresenter$State {
        public final String message;
        public final String packagedLogs;
        public final FailureReason reason;

        public /* synthetic */ RetryableFailure(FailureReason failureReason, String str, String str2, int i) {
            this(failureReason, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RetryableFailure)) {
                return false;
            }
            RetryableFailure retryableFailure = (RetryableFailure) obj;
            return this.reason == retryableFailure.reason && Intrinsics.areEqual(this.message, retryableFailure.message) && Intrinsics.areEqual(this.packagedLogs, retryableFailure.packagedLogs);
        }

        public final int hashCode() {
            int hashCode = this.reason.hashCode() * 31;
            String str = this.message;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.packagedLogs;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RetryableFailure(reason=");
            sb.append(this.reason);
            sb.append(", message=");
            sb.append(this.message);
            sb.append(", packagedLogs=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.packagedLogs, ")");
        }

        public RetryableFailure(FailureReason failureReason, String str, String str2) {
            this.reason = failureReason;
            this.message = str;
            this.packagedLogs = str2;
        }
    }
}
