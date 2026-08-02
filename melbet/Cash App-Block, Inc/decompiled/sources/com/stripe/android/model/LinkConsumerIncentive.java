package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.model.PaymentIntent;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class LinkConsumerIncentive implements StripeModel {
    public static final Parcelable.Creator<LinkConsumerIncentive> CREATOR = new PaymentIntent.Creator(6);
    public final String incentiveDisplayText;
    public final IncentiveParams incentiveParams;

    public final class IncentiveParams implements StripeModel {
        public static final Parcelable.Creator<IncentiveParams> CREATOR = new PaymentIntent.Creator(7);
        public final String paymentMethod;

        public IncentiveParams(String str) {
            str.getClass();
            this.paymentMethod = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof IncentiveParams) && Intrinsics.areEqual(this.paymentMethod, ((IncentiveParams) obj).paymentMethod);
        }

        public final int hashCode() {
            return this.paymentMethod.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("IncentiveParams(paymentMethod=", this.paymentMethod, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.paymentMethod);
        }
    }

    public LinkConsumerIncentive(IncentiveParams incentiveParams, String str) {
        incentiveParams.getClass();
        this.incentiveParams = incentiveParams;
        this.incentiveDisplayText = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LinkConsumerIncentive)) {
            return false;
        }
        LinkConsumerIncentive linkConsumerIncentive = (LinkConsumerIncentive) obj;
        return Intrinsics.areEqual(this.incentiveParams, linkConsumerIncentive.incentiveParams) && Intrinsics.areEqual(this.incentiveDisplayText, linkConsumerIncentive.incentiveDisplayText);
    }

    public final int hashCode() {
        int hashCode = this.incentiveParams.paymentMethod.hashCode() * 31;
        String str = this.incentiveDisplayText;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "LinkConsumerIncentive(incentiveParams=" + this.incentiveParams + ", incentiveDisplayText=" + this.incentiveDisplayText + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        this.incentiveParams.writeToParcel(parcel, i);
        parcel.writeString(this.incentiveDisplayText);
    }
}
