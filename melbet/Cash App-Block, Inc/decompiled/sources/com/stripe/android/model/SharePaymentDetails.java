package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.model.Source;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class SharePaymentDetails implements StripeModel {
    public static final Parcelable.Creator<SharePaymentDetails> CREATOR = new Source.Creator(27);
    public final String encodedPaymentMethod;
    public final String paymentMethodId;

    public SharePaymentDetails(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.paymentMethodId = str;
        this.encodedPaymentMethod = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SharePaymentDetails)) {
            return false;
        }
        SharePaymentDetails sharePaymentDetails = (SharePaymentDetails) obj;
        return Intrinsics.areEqual(this.paymentMethodId, sharePaymentDetails.paymentMethodId) && Intrinsics.areEqual(this.encodedPaymentMethod, sharePaymentDetails.encodedPaymentMethod);
    }

    public final int hashCode() {
        return this.encodedPaymentMethod.hashCode() + (this.paymentMethodId.hashCode() * 31);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("SharePaymentDetails(paymentMethodId=", this.paymentMethodId, ", encodedPaymentMethod=", this.encodedPaymentMethod, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.paymentMethodId);
        parcel.writeString(this.encodedPaymentMethod);
    }
}
