package com.stripe.android;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.SetupIntentResult;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.StripeIntent;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class PaymentIntentResult extends StripeIntentResult {
    public static final Parcelable.Creator<PaymentIntentResult> CREATOR = new SetupIntentResult.Creator(16);
    public final String failureMessage;
    public final PaymentIntent intent;
    public final int outcomeFromFlow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentIntentResult(PaymentIntent paymentIntent, int i, String str) {
        super(i);
        paymentIntent.getClass();
        this.intent = paymentIntent;
        this.outcomeFromFlow = i;
        this.failureMessage = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentIntentResult)) {
            return false;
        }
        PaymentIntentResult paymentIntentResult = (PaymentIntentResult) obj;
        return Intrinsics.areEqual(this.intent, paymentIntentResult.intent) && this.outcomeFromFlow == paymentIntentResult.outcomeFromFlow && Intrinsics.areEqual(this.failureMessage, paymentIntentResult.failureMessage);
    }

    @Override // com.stripe.android.StripeIntentResult
    public final String getFailureMessage() {
        return this.failureMessage;
    }

    @Override // com.stripe.android.StripeIntentResult
    public final StripeIntent getIntent() {
        return this.intent;
    }

    public final int hashCode() {
        int hashCode = ((this.intent.hashCode() * 31) + this.outcomeFromFlow) * 31;
        String str = this.failureMessage;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PaymentIntentResult(intent=");
        sb.append(this.intent);
        sb.append(", outcomeFromFlow=");
        sb.append(this.outcomeFromFlow);
        sb.append(", failureMessage=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.failureMessage, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        this.intent.writeToParcel(parcel, i);
        parcel.writeInt(this.outcomeFromFlow);
        parcel.writeString(this.failureMessage);
    }
}
