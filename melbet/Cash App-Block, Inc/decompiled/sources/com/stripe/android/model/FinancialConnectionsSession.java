package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.model.PaymentIntent;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class FinancialConnectionsSession implements StripeModel {
    public static final Parcelable.Creator<FinancialConnectionsSession> CREATOR = new PaymentIntent.Creator(4);
    public final String clientSecret;
    public final String id;

    public FinancialConnectionsSession(String str, String str2) {
        this.clientSecret = str;
        this.id = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FinancialConnectionsSession)) {
            return false;
        }
        FinancialConnectionsSession financialConnectionsSession = (FinancialConnectionsSession) obj;
        return Intrinsics.areEqual(this.clientSecret, financialConnectionsSession.clientSecret) && Intrinsics.areEqual(this.id, financialConnectionsSession.id);
    }

    public final int hashCode() {
        String str = this.clientSecret;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.id;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("FinancialConnectionsSession(clientSecret=", this.clientSecret, ", id=", this.id, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.clientSecret);
        parcel.writeString(this.id);
    }
}
