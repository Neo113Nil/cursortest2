package com.stripe.android;

import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.internal.EnumC0170g;
import com.stripe.android.SetupIntentResult;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.payments.PaymentFlowResult$Unvalidated;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public abstract class PaymentRelayStarter$Args implements Parcelable {

    public final class ErrorArgs extends PaymentRelayStarter$Args {
        public static final Parcelable.Creator<ErrorArgs> CREATOR = new SetupIntentResult.Creator(17);
        public final StripeException exception;
        public final int requestCode;

        public ErrorArgs(StripeException stripeException, int i) {
            this.exception = stripeException;
            this.requestCode = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ErrorArgs)) {
                return false;
            }
            ErrorArgs errorArgs = (ErrorArgs) obj;
            return this.exception.equals(errorArgs.exception) && this.requestCode == errorArgs.requestCode;
        }

        @Override // com.stripe.android.PaymentRelayStarter$Args
        public final int getRequestCode() {
            return this.requestCode;
        }

        public final int hashCode() {
            return Integer.hashCode(this.requestCode) + (this.exception.hashCode() * 31);
        }

        @Override // com.stripe.android.PaymentRelayStarter$Args
        public final PaymentFlowResult$Unvalidated toResult() {
            int i = EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
            return new PaymentFlowResult$Unvalidated((String) null, 0, this.exception, false, (String) null, (String) null, i);
        }

        public final String toString() {
            return "ErrorArgs(exception=" + this.exception + ", requestCode=" + this.requestCode + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeSerializable(this.exception);
            parcel.writeInt(this.requestCode);
        }
    }

    public final class PaymentIntentArgs extends PaymentRelayStarter$Args {
        public static final Parcelable.Creator<PaymentIntentArgs> CREATOR = new SetupIntentResult.Creator(18);
        public final PaymentIntent paymentIntent;
        public final String stripeAccountId;

        public PaymentIntentArgs(PaymentIntent paymentIntent, String str) {
            paymentIntent.getClass();
            this.paymentIntent = paymentIntent;
            this.stripeAccountId = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PaymentIntentArgs)) {
                return false;
            }
            PaymentIntentArgs paymentIntentArgs = (PaymentIntentArgs) obj;
            return Intrinsics.areEqual(this.paymentIntent, paymentIntentArgs.paymentIntent) && Intrinsics.areEqual(this.stripeAccountId, paymentIntentArgs.stripeAccountId);
        }

        @Override // com.stripe.android.PaymentRelayStarter$Args
        public final int getRequestCode() {
            return 50000;
        }

        public final int hashCode() {
            int hashCode = this.paymentIntent.hashCode() * 31;
            String str = this.stripeAccountId;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // com.stripe.android.PaymentRelayStarter$Args
        public final PaymentFlowResult$Unvalidated toResult() {
            return new PaymentFlowResult$Unvalidated(this.paymentIntent.clientSecret, 0, (StripeException) null, false, (String) null, this.stripeAccountId, 62);
        }

        public final String toString() {
            return "PaymentIntentArgs(paymentIntent=" + this.paymentIntent + ", stripeAccountId=" + this.stripeAccountId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            this.paymentIntent.writeToParcel(parcel, i);
            parcel.writeString(this.stripeAccountId);
        }
    }

    public final class SetupIntentArgs extends PaymentRelayStarter$Args {
        public static final Parcelable.Creator<SetupIntentArgs> CREATOR = new SetupIntentResult.Creator(19);
        public final SetupIntent setupIntent;
        public final String stripeAccountId;

        public SetupIntentArgs(SetupIntent setupIntent, String str) {
            setupIntent.getClass();
            this.setupIntent = setupIntent;
            this.stripeAccountId = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SetupIntentArgs)) {
                return false;
            }
            SetupIntentArgs setupIntentArgs = (SetupIntentArgs) obj;
            return Intrinsics.areEqual(this.setupIntent, setupIntentArgs.setupIntent) && Intrinsics.areEqual(this.stripeAccountId, setupIntentArgs.stripeAccountId);
        }

        @Override // com.stripe.android.PaymentRelayStarter$Args
        public final int getRequestCode() {
            return 50001;
        }

        public final int hashCode() {
            int hashCode = this.setupIntent.hashCode() * 31;
            String str = this.stripeAccountId;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // com.stripe.android.PaymentRelayStarter$Args
        public final PaymentFlowResult$Unvalidated toResult() {
            return new PaymentFlowResult$Unvalidated(this.setupIntent.clientSecret, 0, (StripeException) null, false, (String) null, this.stripeAccountId, 62);
        }

        public final String toString() {
            return "SetupIntentArgs(setupIntent=" + this.setupIntent + ", stripeAccountId=" + this.stripeAccountId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            this.setupIntent.writeToParcel(parcel, i);
            parcel.writeString(this.stripeAccountId);
        }
    }

    public abstract int getRequestCode();

    public abstract PaymentFlowResult$Unvalidated toResult();
}
