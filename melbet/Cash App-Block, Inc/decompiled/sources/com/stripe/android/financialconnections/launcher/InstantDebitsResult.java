package com.stripe.android.financialconnections.launcher;

import android.os.Parcel;
import android.os.Parcelable;
import bo.app.re$$ExternalSyntheticOutline0;
import com.stripe.android.core.model.Country;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class InstantDebitsResult implements Parcelable {
    public static final Parcelable.Creator<InstantDebitsResult> CREATOR = new Country.Creator(25);
    public final String bankName;
    public final boolean eligibleForIncentive;
    public final String encodedPaymentMethod;
    public final String last4;

    public InstantDebitsResult(String str, String str2, String str3, boolean z) {
        str.getClass();
        this.encodedPaymentMethod = str;
        this.last4 = str2;
        this.bankName = str3;
        this.eligibleForIncentive = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstantDebitsResult)) {
            return false;
        }
        InstantDebitsResult instantDebitsResult = (InstantDebitsResult) obj;
        return Intrinsics.areEqual(this.encodedPaymentMethod, instantDebitsResult.encodedPaymentMethod) && Intrinsics.areEqual(this.last4, instantDebitsResult.last4) && Intrinsics.areEqual(this.bankName, instantDebitsResult.bankName) && this.eligibleForIncentive == instantDebitsResult.eligibleForIncentive;
    }

    public final int hashCode() {
        int hashCode = this.encodedPaymentMethod.hashCode() * 31;
        String str = this.last4;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.bankName;
        return Boolean.hashCode(this.eligibleForIncentive) + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return re$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("InstantDebitsResult(encodedPaymentMethod=", this.encodedPaymentMethod, ", last4=", this.last4, ", bankName="), this.bankName, ", eligibleForIncentive=", this.eligibleForIncentive, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.encodedPaymentMethod);
        parcel.writeString(this.last4);
        parcel.writeString(this.bankName);
        parcel.writeInt(this.eligibleForIncentive ? 1 : 0);
    }
}
