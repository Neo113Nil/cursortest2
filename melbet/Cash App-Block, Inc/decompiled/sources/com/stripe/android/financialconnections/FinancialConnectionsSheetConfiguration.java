package com.stripe.android.financialconnections;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.financialconnections.ElementsSessionContext;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class FinancialConnectionsSheetConfiguration implements Parcelable {
    public static final Parcelable.Creator<FinancialConnectionsSheetConfiguration> CREATOR = new ElementsSessionContext.Creator(5);
    public final String financialConnectionsSessionClientSecret;
    public final String publishableKey;
    public final String stripeAccountId;

    public FinancialConnectionsSheetConfiguration(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        this.financialConnectionsSessionClientSecret = str;
        this.publishableKey = str2;
        this.stripeAccountId = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FinancialConnectionsSheetConfiguration)) {
            return false;
        }
        FinancialConnectionsSheetConfiguration financialConnectionsSheetConfiguration = (FinancialConnectionsSheetConfiguration) obj;
        return Intrinsics.areEqual(this.financialConnectionsSessionClientSecret, financialConnectionsSheetConfiguration.financialConnectionsSessionClientSecret) && Intrinsics.areEqual(this.publishableKey, financialConnectionsSheetConfiguration.publishableKey) && Intrinsics.areEqual(this.stripeAccountId, financialConnectionsSheetConfiguration.stripeAccountId);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.financialConnectionsSessionClientSecret.hashCode() * 31, 31, this.publishableKey);
        String str = this.stripeAccountId;
        return m + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("FinancialConnectionsSheetConfiguration(financialConnectionsSessionClientSecret=", this.financialConnectionsSessionClientSecret, ", publishableKey=", this.publishableKey, ", stripeAccountId="), this.stripeAccountId, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.financialConnectionsSessionClientSecret);
        parcel.writeString(this.publishableKey);
        parcel.writeString(this.stripeAccountId);
    }
}
