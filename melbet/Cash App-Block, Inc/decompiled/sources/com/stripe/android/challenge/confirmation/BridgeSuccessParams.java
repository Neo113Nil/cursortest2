package com.stripe.android.challenge.confirmation;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.SetupIntentResult;
import com.stripe.android.core.model.StripeModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class BridgeSuccessParams implements StripeModel {
    public static final Parcelable.Creator<BridgeSuccessParams> CREATOR = new SetupIntentResult.Creator(21);
    public final String clientSecret;

    public BridgeSuccessParams(String str) {
        str.getClass();
        this.clientSecret = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BridgeSuccessParams) && Intrinsics.areEqual(this.clientSecret, ((BridgeSuccessParams) obj).clientSecret);
    }

    public final int hashCode() {
        return this.clientSecret.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("BridgeSuccessParams(clientSecret=", this.clientSecret, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.clientSecret);
    }
}
