package com.squareup.cash.taptopay.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface TapToPayPaymentViewModel {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class AlertTone {
        public static final /* synthetic */ AlertTone[] $VALUES;
        public static final AlertTone FAILURE;
        public static final AlertTone SUCCESS;

        static {
            AlertTone alertTone = new AlertTone("SUCCESS", 0);
            SUCCESS = alertTone;
            AlertTone alertTone2 = new AlertTone("FAILURE", 1);
            FAILURE = alertTone2;
            $VALUES = new AlertTone[]{alertTone, alertTone2};
        }

        public static AlertTone valueOf(String str) {
            return (AlertTone) Enum.valueOf(AlertTone.class, str);
        }

        public static AlertTone[] values() {
            return (AlertTone[]) $VALUES.clone();
        }
    }

    public final class PaymentInitiated implements TapToPayPaymentViewModel {
        public final String amount;
        public final TapToPayAvatarViewModel avatarModel;
        public final String cashtag;
        public final PaymentScreenOrientation orientation;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class PaymentScreenOrientation {
            public static final /* synthetic */ PaymentScreenOrientation[] $VALUES;
            public static final PaymentScreenOrientation PORTRAIT;
            public static final PaymentScreenOrientation PORTRAIT_UPSIDE_DOWN;

            static {
                PaymentScreenOrientation paymentScreenOrientation = new PaymentScreenOrientation("PORTRAIT", 0);
                PORTRAIT = paymentScreenOrientation;
                PaymentScreenOrientation paymentScreenOrientation2 = new PaymentScreenOrientation("PORTRAIT_UPSIDE_DOWN", 1);
                PORTRAIT_UPSIDE_DOWN = paymentScreenOrientation2;
                $VALUES = new PaymentScreenOrientation[]{paymentScreenOrientation, paymentScreenOrientation2};
            }

            public static PaymentScreenOrientation valueOf(String str) {
                return (PaymentScreenOrientation) Enum.valueOf(PaymentScreenOrientation.class, str);
            }

            public static PaymentScreenOrientation[] values() {
                return (PaymentScreenOrientation[]) $VALUES.clone();
            }
        }

        public PaymentInitiated(String str, TapToPayAvatarViewModel tapToPayAvatarViewModel, String str2, PaymentScreenOrientation paymentScreenOrientation) {
            str.getClass();
            paymentScreenOrientation.getClass();
            this.amount = str;
            this.avatarModel = tapToPayAvatarViewModel;
            this.cashtag = str2;
            this.orientation = paymentScreenOrientation;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PaymentInitiated)) {
                return false;
            }
            PaymentInitiated paymentInitiated = (PaymentInitiated) obj;
            return Intrinsics.areEqual(this.amount, paymentInitiated.amount) && Intrinsics.areEqual(this.avatarModel, paymentInitiated.avatarModel) && this.cashtag.equals(paymentInitiated.cashtag) && this.orientation == paymentInitiated.orientation;
        }

        public final int hashCode() {
            int hashCode = this.amount.hashCode() * 31;
            TapToPayAvatarViewModel tapToPayAvatarViewModel = this.avatarModel;
            return this.orientation.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (tapToPayAvatarViewModel == null ? 0 : tapToPayAvatarViewModel.hashCode())) * 31, 31, this.cashtag);
        }

        public final String toString() {
            return "PaymentInitiated(amount=" + this.amount + ", avatarModel=" + this.avatarModel + ", cashtag=" + this.cashtag + ", orientation=" + this.orientation + ")";
        }
    }

    public final class PaymentProcessing implements TapToPayPaymentViewModel {
        public final AlertTone playAlertTone;

        public PaymentProcessing(AlertTone alertTone) {
            this.playAlertTone = alertTone;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PaymentProcessing) && this.playAlertTone == ((PaymentProcessing) obj).playAlertTone;
        }

        public final int hashCode() {
            AlertTone alertTone = this.playAlertTone;
            if (alertTone == null) {
                return 0;
            }
            return alertTone.hashCode();
        }

        public final String toString() {
            return "PaymentProcessing(playAlertTone=" + this.playAlertTone + ")";
        }
    }
}
