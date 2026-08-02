package com.stripe.android.financialconnections.launcher;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.stripe.android.core.model.Country;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public abstract class FinancialConnectionsSheetInstantDebitsResult implements Parcelable {

    public final class Canceled extends FinancialConnectionsSheetInstantDebitsResult {
        public static final Canceled INSTANCE = new Canceled();
        public static final Parcelable.Creator<Canceled> CREATOR = new Country.Creator(21);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Canceled);
        }

        public final int hashCode() {
            return -1615979050;
        }

        public final String toString() {
            return "Canceled";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public final class Completed extends FinancialConnectionsSheetInstantDebitsResult {
        public static final Parcelable.Creator<Completed> CREATOR = new Country.Creator(22);
        public final String bankName;
        public final boolean eligibleForIncentive;
        public final String encodedPaymentMethod;
        public final String last4;

        public Completed(String str, String str2, String str3, boolean z) {
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
            if (!(obj instanceof Completed)) {
                return false;
            }
            Completed completed = (Completed) obj;
            return Intrinsics.areEqual(this.encodedPaymentMethod, completed.encodedPaymentMethod) && Intrinsics.areEqual(this.last4, completed.last4) && Intrinsics.areEqual(this.bankName, completed.bankName) && this.eligibleForIncentive == completed.eligibleForIncentive;
        }

        public final int hashCode() {
            int hashCode = this.encodedPaymentMethod.hashCode() * 31;
            String str = this.last4;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.bankName;
            return Boolean.hashCode(this.eligibleForIncentive) + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return re$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Completed(encodedPaymentMethod=", this.encodedPaymentMethod, ", last4=", this.last4, ", bankName="), this.bankName, ", eligibleForIncentive=", this.eligibleForIncentive, ")");
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

    public final class Failed extends FinancialConnectionsSheetInstantDebitsResult {
        public static final Parcelable.Creator<Failed> CREATOR = new Country.Creator(23);
        public final Throwable error;

        public Failed(Throwable th) {
            th.getClass();
            this.error = th;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Failed) && Intrinsics.areEqual(this.error, ((Failed) obj).error);
        }

        public final int hashCode() {
            return this.error.hashCode();
        }

        public final String toString() {
            return NavAction$$ExternalSyntheticOutline0.m("Failed(error=", ")", this.error);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeSerializable(this.error);
        }
    }
}
