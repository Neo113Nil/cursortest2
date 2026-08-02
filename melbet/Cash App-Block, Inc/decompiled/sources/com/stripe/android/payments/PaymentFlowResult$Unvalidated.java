package com.stripe.android.payments;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.core.os.BundleKt;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.model.Source;
import com.stripe.android.model.Token;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class PaymentFlowResult$Unvalidated implements Parcelable {
    public static final Parcelable.Creator<PaymentFlowResult$Unvalidated> CREATOR = new Token.Creator(12);
    public final boolean canCancelSource;
    public final String clientSecret;
    public final StripeException exception;
    public final int flowOutcome;
    public final Source source;
    public final String sourceId;
    public final String stripeAccountId;

    public /* synthetic */ PaymentFlowResult$Unvalidated(String str, int i, StripeException stripeException, boolean z, String str2, String str3, int i2) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : stripeException, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? null : str2, (Source) null, (i2 & 64) != 0 ? null : str3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentFlowResult$Unvalidated)) {
            return false;
        }
        PaymentFlowResult$Unvalidated paymentFlowResult$Unvalidated = (PaymentFlowResult$Unvalidated) obj;
        return Intrinsics.areEqual(this.clientSecret, paymentFlowResult$Unvalidated.clientSecret) && this.flowOutcome == paymentFlowResult$Unvalidated.flowOutcome && Intrinsics.areEqual(this.exception, paymentFlowResult$Unvalidated.exception) && this.canCancelSource == paymentFlowResult$Unvalidated.canCancelSource && Intrinsics.areEqual(this.sourceId, paymentFlowResult$Unvalidated.sourceId) && Intrinsics.areEqual(this.source, paymentFlowResult$Unvalidated.source) && Intrinsics.areEqual(this.stripeAccountId, paymentFlowResult$Unvalidated.stripeAccountId);
    }

    public final int hashCode() {
        String str = this.clientSecret;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.flowOutcome) * 31;
        StripeException stripeException = this.exception;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (stripeException == null ? 0 : stripeException.hashCode())) * 31, 31, this.canCancelSource);
        String str2 = this.sourceId;
        int hashCode2 = (m + (str2 == null ? 0 : str2.hashCode())) * 31;
        Source source = this.source;
        int hashCode3 = (hashCode2 + (source == null ? 0 : source.hashCode())) * 31;
        String str3 = this.stripeAccountId;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final Bundle toBundle() {
        return BundleKt.bundleOf(new Pair("extra_args", this));
    }

    public final String toString() {
        StringBuilder m = Recorder$$ExternalSyntheticOutline2.m("Unvalidated(clientSecret=", this.flowOutcome, this.clientSecret, ", flowOutcome=", ", exception=");
        m.append(this.exception);
        m.append(", canCancelSource=");
        m.append(this.canCancelSource);
        m.append(", sourceId=");
        m.append(this.sourceId);
        m.append(", source=");
        m.append(this.source);
        m.append(", stripeAccountId=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.stripeAccountId, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.getClass();
        parcel.writeString(this.clientSecret);
        parcel.writeInt(this.flowOutcome);
        parcel.writeSerializable(this.exception);
        Integer num = this.canCancelSource ? 1 : null;
        parcel.writeInt(num != null ? num.intValue() : 0);
        parcel.writeString(this.sourceId);
        parcel.writeParcelable(this.source, i);
        parcel.writeString(this.stripeAccountId);
    }

    public PaymentFlowResult$Unvalidated(String str, int i, StripeException stripeException, boolean z, String str2, Source source, String str3) {
        this.clientSecret = str;
        this.flowOutcome = i;
        this.exception = stripeException;
        this.canCancelSource = z;
        this.sourceId = str2;
        this.source = source;
        this.stripeAccountId = str3;
    }
}
